package p000a.p011c.p012a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a.c.a.g */
/* loaded from: classes.dex */
class C0064g extends Drawable {

    /* renamed from: a */
    private float f185a;

    /* renamed from: b */
    private final Paint f186b;

    /* renamed from: c */
    private final RectF f187c;

    /* renamed from: d */
    private final Rect f188d;

    /* renamed from: e */
    private float f189e;

    /* renamed from: f */
    private boolean f190f;

    /* renamed from: g */
    private boolean f191g;

    /* renamed from: h */
    private ColorStateList f192h;

    /* renamed from: i */
    private PorterDuffColorFilter f193i;

    /* renamed from: j */
    private ColorStateList f194j;

    /* renamed from: k */
    private PorterDuff.Mode f195k;

    /* renamed from: a */
    private PorterDuffColorFilter m4105a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    private void m4104a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f187c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f188d.set(rect);
        if (this.f190f) {
            float b = C0065h.m4090b(this.f189e, this.f185a, this.f191g);
            this.f188d.inset((int) Math.ceil(C0065h.m4097a(this.f189e, this.f185a, this.f191g)), (int) Math.ceil(b));
            this.f187c.set(this.f188d);
        }
    }

    /* renamed from: b */
    private void m4102b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f192h = colorStateList;
        this.f186b.setColor(this.f192h.getColorForState(getState(), this.f192h.getDefaultColor()));
    }

    /* renamed from: a */
    public ColorStateList m4109a() {
        return this.f192h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4108a(float f) {
        if (f != this.f185a) {
            this.f185a = f;
            m4104a((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4107a(float f, boolean z, boolean z2) {
        if (f != this.f189e || this.f190f != z || this.f191g != z2) {
            this.f189e = f;
            this.f190f = z;
            this.f191g = z2;
            m4104a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void m4106a(ColorStateList colorStateList) {
        m4102b(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m4103b() {
        return this.f189e;
    }

    /* renamed from: c */
    public float m4101c() {
        return this.f185a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f186b;
        if (this.f193i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f193i);
            z = true;
        }
        RectF rectF = this.f187c;
        float f = this.f185a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f188d, this.f185a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f194j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f192h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4104a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f192h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f186b.getColor();
        if (z) {
            this.f186b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f194j;
        if (colorStateList2 == null || (mode = this.f195k) == null) {
            return z;
        }
        this.f193i = m4105a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f186b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f186b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f194j = colorStateList;
        this.f193i = m4105a(this.f194j, this.f195k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f195k = mode;
        this.f193i = m4105a(this.f194j, this.f195k);
        invalidateSelf();
    }
}
