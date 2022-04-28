package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0698a;
import p000a.p001a.C0009j;
import p000a.p018g.p029l.C0216r;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
class C0643v extends C0633r {

    /* renamed from: d */
    private final SeekBar f2306d;

    /* renamed from: e */
    private Drawable f2307e;

    /* renamed from: f */
    private ColorStateList f2308f = null;

    /* renamed from: g */
    private PorterDuff.Mode f2309g = null;

    /* renamed from: h */
    private boolean f2310h = false;

    /* renamed from: i */
    private boolean f2311i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0643v(SeekBar seekBar) {
        super(seekBar);
        this.f2306d = seekBar;
    }

    /* renamed from: d */
    private void m1842d() {
        if (this.f2307e == null) {
            return;
        }
        if (this.f2310h || this.f2311i) {
            this.f2307e = C0698a.m1591h(this.f2307e.mutate());
            if (this.f2310h) {
                C0698a.m1603a(this.f2307e, this.f2308f);
            }
            if (this.f2311i) {
                C0698a.m1600a(this.f2307e, this.f2309g);
            }
            if (this.f2307e.isStateful()) {
                this.f2307e.setState(this.f2306d.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1847a(Canvas canvas) {
        if (this.f2307e != null) {
            int max = this.f2306d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2307e.getIntrinsicWidth();
                int intrinsicHeight = this.f2307e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f2307e.setBounds(-i2, -i, i2, i);
                float width = ((this.f2306d.getWidth() - this.f2306d.getPaddingLeft()) - this.f2306d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f2306d.getPaddingLeft(), this.f2306d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2307e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: a */
    void m1846a(Drawable drawable) {
        Drawable drawable2 = this.f2307e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2307e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2306d);
            C0698a.m1605a(drawable, C0216r.m3411j(this.f2306d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2306d.getDrawableState());
            }
            m1842d();
        }
        this.f2306d.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0633r
    /* renamed from: a */
    public void mo1845a(AttributeSet attributeSet, int i) {
        super.mo1845a(attributeSet, i);
        C0638t0 a = C0638t0.m1900a(this.f2306d.getContext(), attributeSet, C0009j.AppCompatSeekBar, i, 0);
        Drawable c = a.m1897c(C0009j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f2306d.setThumb(c);
        }
        m1846a(a.m1899b(C0009j.AppCompatSeekBar_tickMark));
        if (a.m1889g(C0009j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f2309g = C0580c0.m2107a(a.m1894d(C0009j.AppCompatSeekBar_tickMarkTintMode, -1), this.f2309g);
            this.f2311i = true;
        }
        if (a.m1889g(C0009j.AppCompatSeekBar_tickMarkTint)) {
            this.f2308f = a.m1907a(C0009j.AppCompatSeekBar_tickMarkTint);
            this.f2310h = true;
        }
        a.m1908a();
        m1842d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1844b() {
        Drawable drawable = this.f2307e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2306d.getDrawableState())) {
            this.f2306d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1843c() {
        Drawable drawable = this.f2307e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
