package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p000a.p001a.C0009j;
import p000a.p018g.p029l.C0216r;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
class C0585e {

    /* renamed from: a */
    private final View f2089a;

    /* renamed from: d */
    private C0634r0 f2092d;

    /* renamed from: e */
    private C0634r0 f2093e;

    /* renamed from: f */
    private C0634r0 f2094f;

    /* renamed from: c */
    private int f2091c = -1;

    /* renamed from: b */
    private final C0606j f2090b = C0606j.m2013a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0585e(View view) {
        this.f2089a = view;
    }

    /* renamed from: b */
    private boolean m2081b(Drawable drawable) {
        if (this.f2094f == null) {
            this.f2094f = new C0634r0();
        }
        C0634r0 r0Var = this.f2094f;
        r0Var.m1909a();
        ColorStateList b = C0216r.m3428b(this.f2089a);
        if (b != null) {
            r0Var.f2275d = true;
            r0Var.f2272a = b;
        }
        PorterDuff.Mode c = C0216r.m3423c(this.f2089a);
        if (c != null) {
            r0Var.f2274c = true;
            r0Var.f2273b = c;
        }
        if (!r0Var.f2275d && !r0Var.f2274c) {
            return false;
        }
        C0606j.m1998a(drawable, r0Var, this.f2089a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m2079d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f2092d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2089a() {
        Drawable background = this.f2089a.getBackground();
        if (background == null) {
            return;
        }
        if (!m2079d() || !m2081b(background)) {
            C0634r0 r0Var = this.f2093e;
            if (r0Var != null) {
                C0606j.m1998a(background, r0Var, this.f2089a.getDrawableState());
                return;
            }
            C0634r0 r0Var2 = this.f2092d;
            if (r0Var2 != null) {
                C0606j.m1998a(background, r0Var2, this.f2089a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2088a(int i) {
        this.f2091c = i;
        C0606j jVar = this.f2090b;
        m2087a(jVar != null ? jVar.m1992b(this.f2089a.getContext(), i) : null);
        m2089a();
    }

    /* renamed from: a */
    void m2087a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2092d == null) {
                this.f2092d = new C0634r0();
            }
            C0634r0 r0Var = this.f2092d;
            r0Var.f2272a = colorStateList;
            r0Var.f2275d = true;
        } else {
            this.f2092d = null;
        }
        m2089a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2086a(PorterDuff.Mode mode) {
        if (this.f2093e == null) {
            this.f2093e = new C0634r0();
        }
        C0634r0 r0Var = this.f2093e;
        r0Var.f2273b = mode;
        r0Var.f2274c = true;
        m2089a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2085a(Drawable drawable) {
        this.f2091c = -1;
        m2087a((ColorStateList) null);
        m2089a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2084a(AttributeSet attributeSet, int i) {
        C0638t0 a = C0638t0.m1900a(this.f2089a.getContext(), attributeSet, C0009j.ViewBackgroundHelper, i, 0);
        try {
            if (a.m1889g(C0009j.ViewBackgroundHelper_android_background)) {
                this.f2091c = a.m1888g(C0009j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f2090b.m1992b(this.f2089a.getContext(), this.f2091c);
                if (b != null) {
                    m2087a(b);
                }
            }
            if (a.m1889g(C0009j.ViewBackgroundHelper_backgroundTint)) {
                C0216r.m3437a(this.f2089a, a.m1907a(C0009j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.m1889g(C0009j.ViewBackgroundHelper_backgroundTintMode)) {
                C0216r.m3436a(this.f2089a, C0580c0.m2107a(a.m1894d(C0009j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.m1908a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m2083b() {
        C0634r0 r0Var = this.f2093e;
        if (r0Var != null) {
            return r0Var.f2272a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2082b(ColorStateList colorStateList) {
        if (this.f2093e == null) {
            this.f2093e = new C0634r0();
        }
        C0634r0 r0Var = this.f2093e;
        r0Var.f2272a = colorStateList;
        r0Var.f2275d = true;
        m2089a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m2080c() {
        C0634r0 r0Var = this.f2093e;
        if (r0Var != null) {
            return r0Var.f2273b;
        }
        return null;
    }
}
