package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0716e;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public class C0624n {

    /* renamed from: a */
    private final ImageView f2228a;

    /* renamed from: b */
    private C0634r0 f2229b;

    /* renamed from: c */
    private C0634r0 f2230c;

    /* renamed from: d */
    private C0634r0 f2231d;

    public C0624n(ImageView imageView) {
        this.f2228a = imageView;
    }

    /* renamed from: a */
    private boolean m1951a(Drawable drawable) {
        if (this.f2231d == null) {
            this.f2231d = new C0634r0();
        }
        C0634r0 r0Var = this.f2231d;
        r0Var.m1909a();
        ColorStateList a = C0716e.m1508a(this.f2228a);
        if (a != null) {
            r0Var.f2275d = true;
            r0Var.f2272a = a;
        }
        PorterDuff.Mode b = C0716e.m1505b(this.f2228a);
        if (b != null) {
            r0Var.f2274c = true;
            r0Var.f2273b = b;
        }
        if (!r0Var.f2275d && !r0Var.f2274c) {
            return false;
        }
        C0606j.m1998a(drawable, r0Var, this.f2228a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m1946e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f2229b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1955a() {
        Drawable drawable = this.f2228a.getDrawable();
        if (drawable != null) {
            C0580c0.m2105b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1946e() || !m1951a(drawable)) {
            C0634r0 r0Var = this.f2230c;
            if (r0Var != null) {
                C0606j.m1998a(drawable, r0Var, this.f2228a.getDrawableState());
                return;
            }
            C0634r0 r0Var2 = this.f2229b;
            if (r0Var2 != null) {
                C0606j.m1998a(drawable, r0Var2, this.f2228a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public void m1954a(int i) {
        if (i != 0) {
            Drawable c = C0010a.m4259c(this.f2228a.getContext(), i);
            if (c != null) {
                C0580c0.m2105b(c);
            }
            this.f2228a.setImageDrawable(c);
        } else {
            this.f2228a.setImageDrawable(null);
        }
        m1955a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1953a(ColorStateList colorStateList) {
        if (this.f2230c == null) {
            this.f2230c = new C0634r0();
        }
        C0634r0 r0Var = this.f2230c;
        r0Var.f2272a = colorStateList;
        r0Var.f2275d = true;
        m1955a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1952a(PorterDuff.Mode mode) {
        if (this.f2230c == null) {
            this.f2230c = new C0634r0();
        }
        C0634r0 r0Var = this.f2230c;
        r0Var.f2273b = mode;
        r0Var.f2274c = true;
        m1955a();
    }

    /* renamed from: a */
    public void m1950a(AttributeSet attributeSet, int i) {
        int g;
        C0638t0 a = C0638t0.m1900a(this.f2228a.getContext(), attributeSet, C0009j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f2228a.getDrawable();
            if (!(drawable != null || (g = a.m1888g(C0009j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C0010a.m4259c(this.f2228a.getContext(), g)) == null)) {
                this.f2228a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0580c0.m2105b(drawable);
            }
            if (a.m1889g(C0009j.AppCompatImageView_tint)) {
                C0716e.m1507a(this.f2228a, a.m1907a(C0009j.AppCompatImageView_tint));
            }
            if (a.m1889g(C0009j.AppCompatImageView_tintMode)) {
                C0716e.m1506a(this.f2228a, C0580c0.m2107a(a.m1894d(C0009j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.m1908a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m1949b() {
        C0634r0 r0Var = this.f2230c;
        if (r0Var != null) {
            return r0Var.f2272a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m1948c() {
        C0634r0 r0Var = this.f2230c;
        if (r0Var != null) {
            return r0Var.f2273b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1947d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f2228a.getBackground() instanceof RippleDrawable);
    }
}
