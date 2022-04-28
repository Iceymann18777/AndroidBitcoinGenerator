package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.widget.AbstractC0713b;
import androidx.core.widget.C0720i;
import java.lang.ref.WeakReference;
import p000a.p001a.C0009j;
import p000a.p018g.p019d.p020c.C0136f;

/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
class C0655x {

    /* renamed from: a */
    private final TextView f2346a;

    /* renamed from: b */
    private C0634r0 f2347b;

    /* renamed from: c */
    private C0634r0 f2348c;

    /* renamed from: d */
    private C0634r0 f2349d;

    /* renamed from: e */
    private C0634r0 f2350e;

    /* renamed from: f */
    private C0634r0 f2351f;

    /* renamed from: g */
    private C0634r0 f2352g;

    /* renamed from: h */
    private final C0660z f2353h;

    /* renamed from: i */
    private int f2354i = 0;

    /* renamed from: j */
    private Typeface f2355j;

    /* renamed from: k */
    private boolean f2356k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.x$a */
    /* loaded from: classes.dex */
    public class C0656a extends C0136f.AbstractC0137a {

        /* renamed from: a */
        final /* synthetic */ WeakReference f2357a;

        C0656a(WeakReference weakReference) {
            this.f2357a = weakReference;
        }

        @Override // p000a.p018g.p019d.p020c.C0136f.AbstractC0137a
        /* renamed from: a */
        public void mo1801a(int i) {
        }

        @Override // p000a.p018g.p019d.p020c.C0136f.AbstractC0137a
        /* renamed from: a */
        public void mo1800a(Typeface typeface) {
            C0655x.this.m1813a(this.f2357a, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0655x(TextView textView) {
        this.f2346a = textView;
        this.f2353h = new C0660z(this.f2346a);
    }

    /* renamed from: a */
    private static C0634r0 m1817a(Context context, C0606j jVar, int i) {
        ColorStateList b = jVar.m1992b(context, i);
        if (b == null) {
            return null;
        }
        C0634r0 r0Var = new C0634r0();
        r0Var.f2275d = true;
        r0Var.f2272a = b;
        return r0Var;
    }

    /* renamed from: a */
    private void m1816a(Context context, C0638t0 t0Var) {
        String d;
        Typeface typeface;
        this.f2354i = t0Var.m1894d(C0009j.TextAppearance_android_textStyle, this.f2354i);
        boolean z = false;
        if (t0Var.m1889g(C0009j.TextAppearance_android_fontFamily) || t0Var.m1889g(C0009j.TextAppearance_fontFamily)) {
            this.f2355j = null;
            int i = t0Var.m1889g(C0009j.TextAppearance_fontFamily) ? C0009j.TextAppearance_fontFamily : C0009j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.f2355j = t0Var.m1904a(i, this.f2354i, new C0656a(new WeakReference(this.f2346a)));
                    if (this.f2355j == null) {
                        z = true;
                    }
                    this.f2356k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2355j == null && (d = t0Var.m1895d(i)) != null) {
                this.f2355j = Typeface.create(d, this.f2354i);
            }
        } else if (t0Var.m1889g(C0009j.TextAppearance_android_typeface)) {
            this.f2356k = false;
            int d2 = t0Var.m1894d(C0009j.TextAppearance_android_typeface, 1);
            if (d2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (d2 == 2) {
                typeface = Typeface.SERIF;
            } else if (d2 == 3) {
                typeface = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f2355j = typeface;
        }
    }

    /* renamed from: a */
    private void m1815a(Drawable drawable, C0634r0 r0Var) {
        if (drawable != null && r0Var != null) {
            C0606j.m1998a(drawable, r0Var, this.f2346a.getDrawableState());
        }
    }

    /* renamed from: b */
    private void m1808b(int i, float f) {
        this.f2353h.m1786a(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1822a() {
        if (!(this.f2347b == null && this.f2348c == null && this.f2349d == null && this.f2350e == null)) {
            Drawable[] compoundDrawables = this.f2346a.getCompoundDrawables();
            m1815a(compoundDrawables[0], this.f2347b);
            m1815a(compoundDrawables[1], this.f2348c);
            m1815a(compoundDrawables[2], this.f2349d);
            m1815a(compoundDrawables[3], this.f2350e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f2351f != null || this.f2352g != null) {
            Drawable[] compoundDrawablesRelative = this.f2346a.getCompoundDrawablesRelative();
            m1815a(compoundDrawablesRelative[0], this.f2351f);
            m1815a(compoundDrawablesRelative[2], this.f2352g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1821a(int i) {
        this.f2353h.m1787a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1820a(int i, float f) {
        if (!AbstractC0713b.f2708a && !m1802h()) {
            m1808b(i, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1819a(int i, int i2, int i3, int i4) {
        this.f2353h.m1785a(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1818a(Context context, int i) {
        ColorStateList a;
        C0638t0 a2 = C0638t0.m1902a(context, i, C0009j.TextAppearance);
        if (a2.m1889g(C0009j.TextAppearance_textAllCaps)) {
            m1812a(a2.m1903a(C0009j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.m1889g(C0009j.TextAppearance_android_textColor) && (a = a2.m1907a(C0009j.TextAppearance_android_textColor)) != null) {
            this.f2346a.setTextColor(a);
        }
        if (a2.m1889g(C0009j.TextAppearance_android_textSize) && a2.m1896c(C0009j.TextAppearance_android_textSize, -1) == 0) {
            this.f2346a.setTextSize(0, 0.0f);
        }
        m1816a(context, a2);
        a2.m1908a();
        Typeface typeface = this.f2355j;
        if (typeface != null) {
            this.f2346a.setTypeface(typeface, this.f2354i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m1814a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        boolean z;
        Context context = this.f2346a.getContext();
        C0606j a = C0606j.m2013a();
        C0638t0 a2 = C0638t0.m1900a(context, attributeSet, C0009j.AppCompatTextHelper, i, 0);
        int g = a2.m1888g(C0009j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.m1889g(C0009j.AppCompatTextHelper_android_drawableLeft)) {
            this.f2347b = m1817a(context, a, a2.m1888g(C0009j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.m1889g(C0009j.AppCompatTextHelper_android_drawableTop)) {
            this.f2348c = m1817a(context, a, a2.m1888g(C0009j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.m1889g(C0009j.AppCompatTextHelper_android_drawableRight)) {
            this.f2349d = m1817a(context, a, a2.m1888g(C0009j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.m1889g(C0009j.AppCompatTextHelper_android_drawableBottom)) {
            this.f2350e = m1817a(context, a, a2.m1888g(C0009j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a2.m1889g(C0009j.AppCompatTextHelper_android_drawableStart)) {
                this.f2351f = m1817a(context, a, a2.m1888g(C0009j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.m1889g(C0009j.AppCompatTextHelper_android_drawableEnd)) {
                this.f2352g = m1817a(context, a, a2.m1888g(C0009j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.m1908a();
        boolean z2 = this.f2346a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z3 = true;
        ColorStateList colorStateList2 = null;
        if (g != -1) {
            C0638t0 a3 = C0638t0.m1902a(context, g, C0009j.TextAppearance);
            if (z2 || !a3.m1889g(C0009j.TextAppearance_textAllCaps)) {
                z3 = false;
                z = false;
            } else {
                z = a3.m1903a(C0009j.TextAppearance_textAllCaps, false);
                z3 = true;
            }
            m1816a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList2 = a3.m1889g(C0009j.TextAppearance_android_textColor) ? a3.m1907a(C0009j.TextAppearance_android_textColor) : null;
                colorStateList = a3.m1889g(C0009j.TextAppearance_android_textColorHint) ? a3.m1907a(C0009j.TextAppearance_android_textColorHint) : null;
                if (a3.m1889g(C0009j.TextAppearance_android_textColorLink)) {
                    colorStateList2 = a3.m1907a(C0009j.TextAppearance_android_textColorLink);
                }
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.m1908a();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z3 = false;
            z = false;
        }
        C0638t0 a4 = C0638t0.m1900a(context, attributeSet, C0009j.TextAppearance, i, 0);
        if (!z2 && a4.m1889g(C0009j.TextAppearance_textAllCaps)) {
            z = a4.m1903a(C0009j.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.m1889g(C0009j.TextAppearance_android_textColor)) {
                colorStateList2 = a4.m1907a(C0009j.TextAppearance_android_textColor);
            }
            if (a4.m1889g(C0009j.TextAppearance_android_textColorHint)) {
                colorStateList = a4.m1907a(C0009j.TextAppearance_android_textColorHint);
            }
            if (a4.m1889g(C0009j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a4.m1907a(C0009j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.m1889g(C0009j.TextAppearance_android_textSize) && a4.m1896c(C0009j.TextAppearance_android_textSize, -1) == 0) {
            this.f2346a.setTextSize(0, 0.0f);
        }
        m1816a(context, a4);
        a4.m1908a();
        if (colorStateList2 != null) {
            this.f2346a.setTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.f2346a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f2346a.setLinkTextColor(colorStateList2);
        }
        if (!z2 && z3) {
            m1812a(z);
        }
        Typeface typeface = this.f2355j;
        if (typeface != null) {
            this.f2346a.setTypeface(typeface, this.f2354i);
        }
        this.f2353h.m1781a(attributeSet, i);
        if (AbstractC0713b.f2708a && this.f2353h.m1770f() != 0) {
            int[] e = this.f2353h.m1771e();
            if (e.length > 0) {
                if (this.f2346a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f2346a.setAutoSizeTextTypeUniformWithConfiguration(this.f2353h.m1773c(), this.f2353h.m1774b(), this.f2353h.m1772d(), 0);
                } else {
                    this.f2346a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
                }
            }
        }
        C0638t0 a5 = C0638t0.m1901a(context, attributeSet, C0009j.AppCompatTextView);
        int c = a5.m1896c(C0009j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int c2 = a5.m1896c(C0009j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int c3 = a5.m1896c(C0009j.AppCompatTextView_lineHeight, -1);
        a5.m1908a();
        if (c != -1) {
            C0720i.m1495a(this.f2346a, c);
        }
        if (c2 != -1) {
            C0720i.m1489b(this.f2346a, c2);
        }
        if (c3 != -1) {
            C0720i.m1487c(this.f2346a, c3);
        }
    }

    /* renamed from: a */
    void m1813a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2356k) {
            this.f2355j = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f2354i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1812a(boolean z) {
        this.f2346a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1811a(boolean z, int i, int i2, int i3, int i4) {
        if (!AbstractC0713b.f2708a) {
            m1809b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1810a(int[] iArr, int i) {
        this.f2353h.m1775a(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1809b() {
        this.f2353h.m1790a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1807c() {
        return this.f2353h.m1774b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m1806d() {
        return this.f2353h.m1773c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m1805e() {
        return this.f2353h.m1772d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int[] m1804f() {
        return this.f2353h.m1771e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m1803g() {
        return this.f2353h.m1770f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m1802h() {
        return this.f2353h.m1769g();
    }
}
