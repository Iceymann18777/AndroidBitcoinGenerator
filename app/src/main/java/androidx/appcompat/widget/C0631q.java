package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0719h;
import p000a.p001a.C0009j;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
class C0631q extends PopupWindow {

    /* renamed from: b */
    private static final boolean f2263b;

    /* renamed from: a */
    private boolean f2264a;

    static {
        f2263b = Build.VERSION.SDK_INT < 21;
    }

    public C0631q(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1917a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1917a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0638t0 a = C0638t0.m1900a(context, attributeSet, C0009j.PopupWindow, i, i2);
        if (a.m1889g(C0009j.PopupWindow_overlapAnchor)) {
            m1916a(a.m1903a(C0009j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.m1899b(C0009j.PopupWindow_android_popupBackground));
        a.m1908a();
    }

    /* renamed from: a */
    private void m1916a(boolean z) {
        if (f2263b) {
            this.f2264a = z;
        } else {
            C0719h.m1498a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f2263b && this.f2264a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2263b && this.f2264a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2263b && this.f2264a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
