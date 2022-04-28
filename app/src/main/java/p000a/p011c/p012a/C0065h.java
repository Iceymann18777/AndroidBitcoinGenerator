package p000a.p011c.p012a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: a.c.a.h */
/* loaded from: classes.dex */
class C0065h extends Drawable {

    /* renamed from: q */
    private static final double f196q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static AbstractC0066a f197r;

    /* renamed from: a */
    private final int f198a;

    /* renamed from: b */
    private Paint f199b;

    /* renamed from: c */
    private Paint f200c;

    /* renamed from: d */
    private Paint f201d;

    /* renamed from: e */
    private final RectF f202e;

    /* renamed from: f */
    private float f203f;

    /* renamed from: g */
    private Path f204g;

    /* renamed from: h */
    private float f205h;

    /* renamed from: i */
    private float f206i;

    /* renamed from: j */
    private float f207j;

    /* renamed from: k */
    private ColorStateList f208k;

    /* renamed from: l */
    private boolean f209l;

    /* renamed from: m */
    private final int f210m;

    /* renamed from: n */
    private final int f211n;

    /* renamed from: o */
    private boolean f212o;

    /* renamed from: p */
    private boolean f213p;

    /* renamed from: a.c.a.h$a */
    /* loaded from: classes.dex */
    interface AbstractC0066a {
        /* renamed from: a */
        void mo4080a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m4097a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = f;
        double d2 = f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f196q) * d2));
    }

    /* renamed from: a */
    private void m4098a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float d = m4084d(f);
            float d2 = m4084d(f2);
            if (d > d2) {
                if (!this.f213p) {
                    this.f213p = true;
                }
                d = d2;
            }
            if (this.f207j != d || this.f205h != d2) {
                this.f207j = d;
                this.f205h = d2;
                this.f206i = (int) ((d * 1.5f) + this.f198a + 0.5f);
                this.f209l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: a */
    private void m4095a(Canvas canvas) {
        float f = this.f203f;
        float f2 = (-f) - this.f206i;
        float f3 = f + this.f198a + (this.f207j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f202e.width() - f4 > 0.0f;
        boolean z2 = this.f202e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f202e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f204g, this.f200c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f202e.width() - f4, -this.f203f, this.f201d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f202e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f204g, this.f200c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f202e.width() - f4, (-this.f203f) + this.f206i, this.f201d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f202e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f204g, this.f200c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f202e.height() - f4, -this.f203f, this.f201d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f202e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f204g, this.f200c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f202e.height() - f4, -this.f203f, this.f201d);
        }
        canvas.restoreToCount(save4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m4090b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = f3;
        double d2 = f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f196q) * d2));
    }

    /* renamed from: b */
    private void m4089b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f208k = colorStateList;
        this.f199b.setColor(this.f208k.getColorForState(getState(), this.f208k.getDefaultColor()));
    }

    /* renamed from: b */
    private void m4088b(Rect rect) {
        float f = this.f205h;
        float f2 = 1.5f * f;
        this.f202e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        m4081g();
    }

    /* renamed from: d */
    private int m4084d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m4081g() {
        float f = this.f203f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f206i;
        rectF2.inset(-f2, -f2);
        Path path = this.f204g;
        if (path == null) {
            this.f204g = new Path();
        } else {
            path.reset();
        }
        this.f204g.setFillType(Path.FillType.EVEN_ODD);
        this.f204g.moveTo(-this.f203f, 0.0f);
        this.f204g.rLineTo(-this.f206i, 0.0f);
        this.f204g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f204g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f204g.close();
        float f3 = this.f203f;
        float f4 = this.f206i;
        Paint paint = this.f200c;
        float f5 = f3 + f4;
        int i = this.f210m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f211n}, new float[]{0.0f, f3 / (f3 + f4), 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f201d;
        float f6 = this.f203f;
        float f7 = this.f206i;
        int i2 = this.f210m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f211n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f201d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList m4100a() {
        return this.f208k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4099a(float f) {
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (this.f203f != f2) {
                this.f203f = f2;
                this.f209l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4096a(ColorStateList colorStateList) {
        m4089b(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4094a(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4093a(boolean z) {
        this.f212o = z;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m4092b() {
        return this.f203f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4091b(float f) {
        m4098a(this.f207j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m4087c() {
        return this.f205h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m4086c(float f) {
        m4098a(f, this.f205h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m4085d() {
        float f = this.f205h;
        return (Math.max(f, this.f203f + this.f198a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f205h * 1.5f) + this.f198a) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f209l) {
            m4088b(getBounds());
            this.f209l = false;
        }
        canvas.translate(0.0f, this.f207j / 2.0f);
        m4095a(canvas);
        canvas.translate(0.0f, (-this.f207j) / 2.0f);
        f197r.mo4080a(canvas, this.f202e, this.f203f, this.f199b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m4083e() {
        float f = this.f205h;
        return (Math.max(f, this.f203f + this.f198a + (f / 2.0f)) * 2.0f) + ((this.f205h + this.f198a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m4082f() {
        return this.f207j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m4090b(this.f205h, this.f203f, this.f212o));
        int ceil2 = (int) Math.ceil(m4097a(this.f205h, this.f203f, this.f212o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f208k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f209l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f208k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f199b.getColor() == colorForState) {
            return false;
        }
        this.f199b.setColor(colorForState);
        this.f209l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f199b.setAlpha(i);
        this.f200c.setAlpha(i);
        this.f201d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f199b.setColorFilter(colorFilter);
    }
}
