package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC0519t;
import androidx.core.widget.C0719h;
import java.lang.reflect.Method;
import p000a.p001a.C0009j;
import p000a.p018g.p029l.C0216r;

/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: classes.dex */
public class C0596h0 implements AbstractC0519t {

    /* renamed from: G */
    private static Method f2128G;

    /* renamed from: H */
    private static Method f2129H;

    /* renamed from: I */
    private static Method f2130I;

    /* renamed from: A */
    private final RunnableC0599c f2131A;

    /* renamed from: B */
    final Handler f2132B;

    /* renamed from: C */
    private final Rect f2133C;

    /* renamed from: D */
    private Rect f2134D;

    /* renamed from: E */
    private boolean f2135E;

    /* renamed from: F */
    PopupWindow f2136F;

    /* renamed from: b */
    private Context f2137b;

    /* renamed from: c */
    private ListAdapter f2138c;

    /* renamed from: d */
    C0582d0 f2139d;

    /* renamed from: e */
    private int f2140e;

    /* renamed from: f */
    private int f2141f;

    /* renamed from: g */
    private int f2142g;

    /* renamed from: h */
    private int f2143h;

    /* renamed from: i */
    private int f2144i;

    /* renamed from: j */
    private boolean f2145j;

    /* renamed from: k */
    private boolean f2146k;

    /* renamed from: l */
    private boolean f2147l;

    /* renamed from: m */
    private int f2148m;

    /* renamed from: n */
    private boolean f2149n;

    /* renamed from: o */
    private boolean f2150o;

    /* renamed from: p */
    int f2151p;

    /* renamed from: q */
    private View f2152q;

    /* renamed from: r */
    private int f2153r;

    /* renamed from: s */
    private DataSetObserver f2154s;

    /* renamed from: t */
    private View f2155t;

    /* renamed from: u */
    private Drawable f2156u;

    /* renamed from: v */
    private AdapterView.OnItemClickListener f2157v;

    /* renamed from: w */
    private AdapterView.OnItemSelectedListener f2158w;

    /* renamed from: x */
    final RunnableC0603g f2159x;

    /* renamed from: y */
    private final View$OnTouchListenerC0602f f2160y;

    /* renamed from: z */
    private final C0601e f2161z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.h0$a */
    /* loaded from: classes.dex */
    public class RunnableC0597a implements Runnable {
        RunnableC0597a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View b = C0596h0.this.m2042b();
            if (b != null && b.getWindowToken() != null) {
                C0596h0.this.mo1833f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.h0$b */
    /* loaded from: classes.dex */
    public class C0598b implements AdapterView.OnItemSelectedListener {
        C0598b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0582d0 d0Var;
            if (i != -1 && (d0Var = C0596h0.this.f2139d) != null) {
                d0Var.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h0$c */
    /* loaded from: classes.dex */
    public class RunnableC0599c implements Runnable {
        RunnableC0599c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0596h0.this.m2051a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h0$d */
    /* loaded from: classes.dex */
    public class C0600d extends DataSetObserver {
        C0600d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0596h0.this.mo2036d()) {
                C0596h0.this.mo1833f();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0596h0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h0$e */
    /* loaded from: classes.dex */
    public class C0601e implements AbsListView.OnScrollListener {
        C0601e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0596h0.this.m2025j() && C0596h0.this.f2136F.getContentView() != null) {
                C0596h0 h0Var = C0596h0.this;
                h0Var.f2132B.removeCallbacks(h0Var.f2159x);
                C0596h0.this.f2159x.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h0$f */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC0602f implements View.OnTouchListener {
        View$OnTouchListenerC0602f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0596h0.this.f2136F) != null && popupWindow.isShowing() && x >= 0 && x < C0596h0.this.f2136F.getWidth() && y >= 0 && y < C0596h0.this.f2136F.getHeight()) {
                C0596h0 h0Var = C0596h0.this;
                h0Var.f2132B.postDelayed(h0Var.f2159x, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0596h0 h0Var2 = C0596h0.this;
                h0Var2.f2132B.removeCallbacks(h0Var2.f2159x);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h0$g */
    /* loaded from: classes.dex */
    public class RunnableC0603g implements Runnable {
        RunnableC0603g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0582d0 d0Var = C0596h0.this.f2139d;
            if (d0Var != null && C0216r.m3398w(d0Var) && C0596h0.this.f2139d.getCount() > C0596h0.this.f2139d.getChildCount()) {
                int childCount = C0596h0.this.f2139d.getChildCount();
                C0596h0 h0Var = C0596h0.this;
                if (childCount <= h0Var.f2151p) {
                    h0Var.f2136F.setInputMethodMode(2);
                    C0596h0.this.mo1833f();
                }
            }
        }
    }

    static {
        try {
            f2128G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f2129H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f2130I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0596h0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0596h0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2140e = -2;
        this.f2141f = -2;
        this.f2144i = 1002;
        this.f2148m = 0;
        this.f2149n = false;
        this.f2150o = false;
        this.f2151p = Integer.MAX_VALUE;
        this.f2153r = 0;
        this.f2159x = new RunnableC0603g();
        this.f2160y = new View$OnTouchListenerC0602f();
        this.f2161z = new C0601e();
        this.f2131A = new RunnableC0599c();
        this.f2133C = new Rect();
        this.f2137b = context;
        this.f2132B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ListPopupWindow, i, i2);
        this.f2142g = obtainStyledAttributes.getDimensionPixelOffset(C0009j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f2143h = obtainStyledAttributes.getDimensionPixelOffset(C0009j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f2143h != 0) {
            this.f2145j = true;
        }
        obtainStyledAttributes.recycle();
        this.f2136F = new C0631q(context, attributeSet, i, i2);
        this.f2136F.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m2046a(View view, int i, boolean z) {
        Method method = f2129H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f2136F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f2136F.getMaxAvailableHeight(view, i);
    }

    /* renamed from: c */
    private void m2037c(boolean z) {
        Method method = f2128G;
        if (method != null) {
            try {
                method.invoke(this.f2136F, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m2023l() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0596h0.m2023l():int");
    }

    /* renamed from: m */
    private void m2022m() {
        View view = this.f2152q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2152q);
            }
        }
    }

    /* renamed from: a */
    C0582d0 mo1979a(Context context, boolean z) {
        return new C0582d0(context, z);
    }

    /* renamed from: a */
    public void m2051a() {
        C0582d0 d0Var = this.f2139d;
        if (d0Var != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
    }

    /* renamed from: a */
    public void m2050a(int i) {
        this.f2136F.setAnimationStyle(i);
    }

    /* renamed from: a */
    public void m2049a(Rect rect) {
        this.f2134D = rect;
    }

    /* renamed from: a */
    public void m2048a(Drawable drawable) {
        this.f2136F.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void m2047a(View view) {
        this.f2155t = view;
    }

    /* renamed from: a */
    public void m2045a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2157v = onItemClickListener;
    }

    /* renamed from: a */
    public void mo1837a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2154s;
        if (dataSetObserver == null) {
            this.f2154s = new C0600d();
        } else {
            ListAdapter listAdapter2 = this.f2138c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2138c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2154s);
        }
        C0582d0 d0Var = this.f2139d;
        if (d0Var != null) {
            d0Var.setAdapter(this.f2138c);
        }
    }

    /* renamed from: a */
    public void m2044a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2136F.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void m2043a(boolean z) {
        this.f2135E = z;
        this.f2136F.setFocusable(z);
    }

    /* renamed from: b */
    public View m2042b() {
        return this.f2155t;
    }

    /* renamed from: b */
    public void m2041b(int i) {
        Drawable background = this.f2136F.getBackground();
        if (background != null) {
            background.getPadding(this.f2133C);
            Rect rect = this.f2133C;
            this.f2141f = rect.left + rect.right + i;
            return;
        }
        m2026i(i);
    }

    /* renamed from: b */
    public void m2040b(boolean z) {
        this.f2147l = true;
        this.f2146k = z;
    }

    /* renamed from: c */
    public Drawable m2039c() {
        return this.f2136F.getBackground();
    }

    /* renamed from: c */
    public void m2038c(int i) {
        this.f2148m = i;
    }

    /* renamed from: d */
    public void m2035d(int i) {
        this.f2142g = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: d */
    public boolean mo2036d() {
        return this.f2136F.isShowing();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    public void dismiss() {
        this.f2136F.dismiss();
        m2022m();
        this.f2136F.setContentView(null);
        this.f2139d = null;
        this.f2132B.removeCallbacks(this.f2159x);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: e */
    public ListView mo2034e() {
        return this.f2139d;
    }

    /* renamed from: e */
    public void m2033e(int i) {
        this.f2136F.setInputMethodMode(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: f */
    public void mo1833f() {
        int l = m2023l();
        boolean j = m2025j();
        C0719h.m1500a(this.f2136F, this.f2144i);
        boolean z = true;
        if (!this.f2136F.isShowing()) {
            int i = this.f2141f;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = m2042b().getWidth();
            }
            int i2 = this.f2140e;
            if (i2 == -1) {
                l = -1;
            } else if (i2 != -2) {
                l = i2;
            }
            this.f2136F.setWidth(i);
            this.f2136F.setHeight(l);
            m2037c(true);
            this.f2136F.setOutsideTouchable(!this.f2150o && !this.f2149n);
            this.f2136F.setTouchInterceptor(this.f2160y);
            if (this.f2147l) {
                C0719h.m1498a(this.f2136F, this.f2146k);
            }
            Method method = f2130I;
            if (method != null) {
                try {
                    method.invoke(this.f2136F, this.f2134D);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0719h.m1499a(this.f2136F, m2042b(), this.f2142g, this.f2143h, this.f2148m);
            this.f2139d.setSelection(-1);
            if (!this.f2135E || this.f2139d.isInTouchMode()) {
                m2051a();
            }
            if (!this.f2135E) {
                this.f2132B.post(this.f2131A);
            }
        } else if (C0216r.m3398w(m2042b())) {
            int i3 = this.f2141f;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = m2042b().getWidth();
            }
            int i4 = this.f2140e;
            if (i4 == -1) {
                if (!j) {
                    l = -1;
                }
                if (j) {
                    this.f2136F.setWidth(this.f2141f == -1 ? -1 : 0);
                    this.f2136F.setHeight(0);
                } else {
                    this.f2136F.setWidth(this.f2141f == -1 ? -1 : 0);
                    this.f2136F.setHeight(-1);
                }
            } else if (i4 != -2) {
                l = i4;
            }
            PopupWindow popupWindow = this.f2136F;
            if (this.f2150o || this.f2149n) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f2136F.update(m2042b(), this.f2142g, this.f2143h, i3 < 0 ? -1 : i3, l < 0 ? -1 : l);
        }
    }

    /* renamed from: f */
    public void m2032f(int i) {
        this.f2153r = i;
    }

    /* renamed from: g */
    public int m2031g() {
        return this.f2142g;
    }

    /* renamed from: g */
    public void m2030g(int i) {
        C0582d0 d0Var = this.f2139d;
        if (mo2036d() && d0Var != null) {
            d0Var.setListSelectionHidden(false);
            d0Var.setSelection(i);
            if (d0Var.getChoiceMode() != 0) {
                d0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: h */
    public int m2029h() {
        if (!this.f2145j) {
            return 0;
        }
        return this.f2143h;
    }

    /* renamed from: h */
    public void m2028h(int i) {
        this.f2143h = i;
        this.f2145j = true;
    }

    /* renamed from: i */
    public int m2027i() {
        return this.f2141f;
    }

    /* renamed from: i */
    public void m2026i(int i) {
        this.f2141f = i;
    }

    /* renamed from: j */
    public boolean m2025j() {
        return this.f2136F.getInputMethodMode() == 2;
    }

    /* renamed from: k */
    public boolean m2024k() {
        return this.f2135E;
    }
}
