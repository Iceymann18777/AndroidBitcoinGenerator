package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p000a.p001a.C0003d;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0008i;

/* renamed from: androidx.appcompat.widget.x0 */
/* loaded from: classes.dex */
class C0657x0 {

    /* renamed from: a */
    private final Context f2359a;

    /* renamed from: b */
    private final View f2360b;

    /* renamed from: c */
    private final TextView f2361c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f2362d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f2363e = new Rect();

    /* renamed from: f */
    private final int[] f2364f = new int[2];

    /* renamed from: g */
    private final int[] f2365g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0657x0(Context context) {
        this.f2359a = context;
        this.f2360b = LayoutInflater.from(this.f2359a).inflate(C0006g.abc_tooltip, (ViewGroup) null);
        this.f2361c = (TextView) this.f2360b.findViewById(C0005f.message);
        this.f2362d.setTitle(C0657x0.class.getSimpleName());
        this.f2362d.packageName = this.f2359a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f2362d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0008i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private static View m1798a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m1797a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2359a.getResources().getDimensionPixelOffset(C0003d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2359a.getResources().getDimensionPixelOffset(C0003d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2359a.getResources().getDimensionPixelOffset(z ? C0003d.tooltip_y_offset_touch : C0003d.tooltip_y_offset_non_touch);
        View a = m1798a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f2363e);
        Rect rect = this.f2363e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f2359a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2363e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f2365g);
        view.getLocationOnScreen(this.f2364f);
        int[] iArr = this.f2364f;
        int i5 = iArr[0];
        int[] iArr2 = this.f2365g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2360b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2360b.getMeasuredHeight();
        int[] iArr3 = this.f2364f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f2363e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1799a() {
        if (m1795b()) {
            ((WindowManager) this.f2359a.getSystemService("window")).removeView(this.f2360b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1796a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m1795b()) {
            m1799a();
        }
        this.f2361c.setText(charSequence);
        m1797a(view, i, i2, z, this.f2362d);
        ((WindowManager) this.f2359a.getSystemService("window")).addView(this.f2360b, this.f2362d);
    }

    /* renamed from: b */
    boolean m1795b() {
        return this.f2360b.getParent() != null;
    }
}
