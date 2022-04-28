package p050b.p051a.p052a.p053a.p055k;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0698a;
import com.google.android.material.internal.C0982k;
import p000a.p018g.p029l.C0216r;
import p050b.p051a.p052a.p053a.C0876i;
import p050b.p051a.p052a.p053a.p060o.C0906a;
import p050b.p051a.p052a.p053a.p061p.C0907a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.a.a.a.k.c */
/* loaded from: classes.dex */
public class C0889c {

    /* renamed from: w */
    private static final boolean f3310w;

    /* renamed from: a */
    private final C0887a f3311a;

    /* renamed from: b */
    private int f3312b;

    /* renamed from: c */
    private int f3313c;

    /* renamed from: d */
    private int f3314d;

    /* renamed from: e */
    private int f3315e;

    /* renamed from: f */
    private int f3316f;

    /* renamed from: g */
    private int f3317g;

    /* renamed from: h */
    private PorterDuff.Mode f3318h;

    /* renamed from: i */
    private ColorStateList f3319i;

    /* renamed from: j */
    private ColorStateList f3320j;

    /* renamed from: k */
    private ColorStateList f3321k;

    /* renamed from: o */
    private GradientDrawable f3325o;

    /* renamed from: p */
    private Drawable f3326p;

    /* renamed from: q */
    private GradientDrawable f3327q;

    /* renamed from: r */
    private Drawable f3328r;

    /* renamed from: s */
    private GradientDrawable f3329s;

    /* renamed from: t */
    private GradientDrawable f3330t;

    /* renamed from: u */
    private GradientDrawable f3331u;

    /* renamed from: l */
    private final Paint f3322l = new Paint(1);

    /* renamed from: m */
    private final Rect f3323m = new Rect();

    /* renamed from: n */
    private final RectF f3324n = new RectF();

    /* renamed from: v */
    private boolean f3332v = false;

    static {
        f3310w = Build.VERSION.SDK_INT >= 21;
    }

    public C0889c(C0887a aVar) {
        this.f3311a = aVar;
    }

    /* renamed from: a */
    private InsetDrawable m448a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f3312b, this.f3314d, this.f3313c, this.f3315e);
    }

    /* renamed from: i */
    private Drawable m436i() {
        this.f3325o = new GradientDrawable();
        this.f3325o.setCornerRadius(this.f3316f + 1.0E-5f);
        this.f3325o.setColor(-1);
        this.f3326p = C0698a.m1591h(this.f3325o);
        C0698a.m1603a(this.f3326p, this.f3319i);
        PorterDuff.Mode mode = this.f3318h;
        if (mode != null) {
            C0698a.m1600a(this.f3326p, mode);
        }
        this.f3327q = new GradientDrawable();
        this.f3327q.setCornerRadius(this.f3316f + 1.0E-5f);
        this.f3327q.setColor(-1);
        this.f3328r = C0698a.m1591h(this.f3327q);
        C0698a.m1603a(this.f3328r, this.f3321k);
        return m448a(new LayerDrawable(new Drawable[]{this.f3326p, this.f3328r}));
    }

    @TargetApi(21)
    /* renamed from: j */
    private Drawable m435j() {
        this.f3329s = new GradientDrawable();
        this.f3329s.setCornerRadius(this.f3316f + 1.0E-5f);
        this.f3329s.setColor(-1);
        m431n();
        this.f3330t = new GradientDrawable();
        this.f3330t.setCornerRadius(this.f3316f + 1.0E-5f);
        this.f3330t.setColor(0);
        this.f3330t.setStroke(this.f3317g, this.f3320j);
        InsetDrawable a = m448a(new LayerDrawable(new Drawable[]{this.f3329s, this.f3330t}));
        this.f3331u = new GradientDrawable();
        this.f3331u.setCornerRadius(this.f3316f + 1.0E-5f);
        this.f3331u.setColor(-1);
        return new C0888b(C0907a.m398a(this.f3321k), a, this.f3331u);
    }

    /* renamed from: k */
    private GradientDrawable m434k() {
        if (!f3310w || this.f3311a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f3311a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    /* renamed from: l */
    private GradientDrawable m433l() {
        if (!f3310w || this.f3311a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f3311a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    /* renamed from: m */
    private void m432m() {
        if (f3310w && this.f3330t != null) {
            this.f3311a.setInternalBackground(m435j());
        } else if (!f3310w) {
            this.f3311a.invalidate();
        }
    }

    /* renamed from: n */
    private void m431n() {
        GradientDrawable gradientDrawable = this.f3329s;
        if (gradientDrawable != null) {
            C0698a.m1603a(gradientDrawable, this.f3319i);
            PorterDuff.Mode mode = this.f3318h;
            if (mode != null) {
                C0698a.m1600a(this.f3329s, mode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m455a() {
        return this.f3316f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m454a(int i) {
        GradientDrawable gradientDrawable;
        if ((f3310w && (gradientDrawable = this.f3329s) != null) || (!f3310w && (gradientDrawable = this.f3325o) != null)) {
            gradientDrawable.setColor(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m453a(int i, int i2) {
        GradientDrawable gradientDrawable = this.f3331u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f3312b, this.f3314d, i2 - this.f3313c, i - this.f3315e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m452a(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f3321k != colorStateList) {
            this.f3321k = colorStateList;
            if (f3310w && (this.f3311a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f3311a.getBackground()).setColor(colorStateList);
            } else if (!f3310w && (drawable = this.f3328r) != null) {
                C0698a.m1603a(drawable, colorStateList);
            }
        }
    }

    /* renamed from: a */
    public void m451a(TypedArray typedArray) {
        int i = 0;
        this.f3312b = typedArray.getDimensionPixelOffset(C0876i.MaterialButton_android_insetLeft, 0);
        this.f3313c = typedArray.getDimensionPixelOffset(C0876i.MaterialButton_android_insetRight, 0);
        this.f3314d = typedArray.getDimensionPixelOffset(C0876i.MaterialButton_android_insetTop, 0);
        this.f3315e = typedArray.getDimensionPixelOffset(C0876i.MaterialButton_android_insetBottom, 0);
        this.f3316f = typedArray.getDimensionPixelSize(C0876i.MaterialButton_cornerRadius, 0);
        this.f3317g = typedArray.getDimensionPixelSize(C0876i.MaterialButton_strokeWidth, 0);
        this.f3318h = C0982k.m71a(typedArray.getInt(C0876i.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f3319i = C0906a.m401a(this.f3311a.getContext(), typedArray, C0876i.MaterialButton_backgroundTint);
        this.f3320j = C0906a.m401a(this.f3311a.getContext(), typedArray, C0876i.MaterialButton_strokeColor);
        this.f3321k = C0906a.m401a(this.f3311a.getContext(), typedArray, C0876i.MaterialButton_rippleColor);
        this.f3322l.setStyle(Paint.Style.STROKE);
        this.f3322l.setStrokeWidth(this.f3317g);
        Paint paint = this.f3322l;
        ColorStateList colorStateList = this.f3320j;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(this.f3311a.getDrawableState(), 0);
        }
        paint.setColor(i);
        int n = C0216r.m3407n(this.f3311a);
        int paddingTop = this.f3311a.getPaddingTop();
        int m = C0216r.m3408m(this.f3311a);
        int paddingBottom = this.f3311a.getPaddingBottom();
        this.f3311a.setInternalBackground(f3310w ? m435j() : m436i());
        C0216r.m3441a(this.f3311a, n + this.f3312b, paddingTop + this.f3314d, m + this.f3313c, paddingBottom + this.f3315e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m450a(Canvas canvas) {
        if (canvas != null && this.f3320j != null && this.f3317g > 0) {
            this.f3323m.set(this.f3311a.getBackground().getBounds());
            RectF rectF = this.f3324n;
            Rect rect = this.f3323m;
            int i = this.f3317g;
            rectF.set(rect.left + (i / 2.0f) + this.f3312b, rect.top + (i / 2.0f) + this.f3314d, (rect.right - (i / 2.0f)) - this.f3313c, (rect.bottom - (i / 2.0f)) - this.f3315e);
            float f = this.f3316f - (this.f3317g / 2.0f);
            canvas.drawRoundRect(this.f3324n, f, f, this.f3322l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m449a(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2;
        if (this.f3318h != mode) {
            this.f3318h = mode;
            if (f3310w) {
                m431n();
                return;
            }
            Drawable drawable = this.f3326p;
            if (drawable != null && (mode2 = this.f3318h) != null) {
                C0698a.m1600a(drawable, mode2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m447b() {
        return this.f3321k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m446b(int i) {
        GradientDrawable gradientDrawable;
        if (this.f3316f != i) {
            this.f3316f = i;
            if (f3310w && this.f3329s != null && this.f3330t != null && this.f3331u != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    float f = i + 1.0E-5f;
                    m434k().setCornerRadius(f);
                    m433l().setCornerRadius(f);
                }
                float f2 = i + 1.0E-5f;
                this.f3329s.setCornerRadius(f2);
                this.f3330t.setCornerRadius(f2);
                this.f3331u.setCornerRadius(f2);
            } else if (!f3310w && (gradientDrawable = this.f3325o) != null && this.f3327q != null) {
                float f3 = i + 1.0E-5f;
                gradientDrawable.setCornerRadius(f3);
                this.f3327q.setCornerRadius(f3);
                this.f3311a.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m445b(ColorStateList colorStateList) {
        if (this.f3320j != colorStateList) {
            this.f3320j = colorStateList;
            Paint paint = this.f3322l;
            int i = 0;
            if (colorStateList != null) {
                i = colorStateList.getColorForState(this.f3311a.getDrawableState(), 0);
            }
            paint.setColor(i);
            m432m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m444c() {
        return this.f3320j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m443c(int i) {
        if (this.f3317g != i) {
            this.f3317g = i;
            this.f3322l.setStrokeWidth(i);
            m432m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m442c(ColorStateList colorStateList) {
        if (this.f3319i != colorStateList) {
            this.f3319i = colorStateList;
            if (f3310w) {
                m431n();
                return;
            }
            Drawable drawable = this.f3326p;
            if (drawable != null) {
                C0698a.m1603a(drawable, this.f3319i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m441d() {
        return this.f3317g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public ColorStateList m440e() {
        return this.f3319i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public PorterDuff.Mode m439f() {
        return this.f3318h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m438g() {
        return this.f3332v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m437h() {
        this.f3332v = true;
        this.f3311a.setSupportBackgroundTintList(this.f3319i);
        this.f3311a.setSupportBackgroundTintMode(this.f3318h);
    }
}
