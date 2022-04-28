package p000a.p001a.p004l.p005a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0698a;
import p000a.p001a.C0000a;
import p000a.p001a.C0008i;
import p000a.p001a.C0009j;

/* renamed from: a.a.l.a.d */
/* loaded from: classes.dex */
public class C0025d extends Drawable {

    /* renamed from: m */
    private static final float f70m = (float) Math.toRadians(45.0d);

    /* renamed from: b */
    private float f72b;

    /* renamed from: c */
    private float f73c;

    /* renamed from: d */
    private float f74d;

    /* renamed from: e */
    private float f75e;

    /* renamed from: f */
    private boolean f76f;

    /* renamed from: h */
    private final int f78h;

    /* renamed from: j */
    private float f80j;

    /* renamed from: k */
    private float f81k;

    /* renamed from: a */
    private final Paint f71a = new Paint();

    /* renamed from: g */
    private final Path f77g = new Path();

    /* renamed from: i */
    private boolean f79i = false;

    /* renamed from: l */
    private int f82l = 2;

    public C0025d(Context context) {
        this.f71a.setStyle(Paint.Style.STROKE);
        this.f71a.setStrokeJoin(Paint.Join.MITER);
        this.f71a.setStrokeCap(Paint.Cap.BUTT);
        this.f71a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0009j.DrawerArrowToggle, C0000a.drawerArrowStyle, C0008i.Base_Widget_AppCompat_DrawerArrowToggle);
        m4198a(obtainStyledAttributes.getColor(C0009j.DrawerArrowToggle_color, 0));
        m4200a(obtainStyledAttributes.getDimension(C0009j.DrawerArrowToggle_thickness, 0.0f));
        m4197a(obtainStyledAttributes.getBoolean(C0009j.DrawerArrowToggle_spinBars, true));
        m4196b(Math.round(obtainStyledAttributes.getDimension(C0009j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f78h = obtainStyledAttributes.getDimensionPixelSize(C0009j.DrawerArrowToggle_drawableSize, 0);
        this.f73c = Math.round(obtainStyledAttributes.getDimension(C0009j.DrawerArrowToggle_barLength, 0.0f));
        this.f72b = Math.round(obtainStyledAttributes.getDimension(C0009j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f74d = obtainStyledAttributes.getDimension(C0009j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static float m4199a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public void m4200a(float f) {
        if (this.f71a.getStrokeWidth() != f) {
            this.f71a.setStrokeWidth(f);
            double d = f / 2.0f;
            double cos = Math.cos(f70m);
            Double.isNaN(d);
            this.f81k = (float) (d * cos);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void m4198a(int i) {
        if (i != this.f71a.getColor()) {
            this.f71a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void m4197a(boolean z) {
        if (this.f76f != z) {
            this.f76f = z;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void m4196b(float f) {
        if (f != this.f75e) {
            this.f75e = f;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void m4195b(boolean z) {
        if (this.f79i != z) {
            this.f79i = z;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public void m4194c(float f) {
        if (this.f80j != f) {
            this.f80j = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        int i = this.f82l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C0698a.m1594e(this) == 0 : C0698a.m1594e(this) == 1))) {
            z = true;
        }
        float f2 = this.f72b;
        float a = m4199a(this.f73c, (float) Math.sqrt(f2 * f2 * 2.0f), this.f80j);
        float a2 = m4199a(this.f73c, this.f74d, this.f80j);
        float round = Math.round(m4199a(0.0f, this.f81k, this.f80j));
        float a3 = m4199a(0.0f, f70m, this.f80j);
        float a4 = m4199a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f80j);
        double d = a;
        double d2 = a3;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f77g.rewind();
        float a5 = m4199a(this.f75e + this.f71a.getStrokeWidth(), -this.f81k, this.f80j);
        float f3 = (-a2) / 2.0f;
        this.f77g.moveTo(f3 + round, 0.0f);
        this.f77g.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.f77g.moveTo(f3, a5);
        this.f77g.rLineTo(round2, round3);
        this.f77g.moveTo(f3, -a5);
        this.f77g.rLineTo(round2, -round3);
        this.f77g.close();
        canvas.save();
        float strokeWidth = this.f71a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f75e);
        if (this.f76f) {
            canvas.rotate(a4 * (this.f79i ^ z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f77g, this.f71a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f78h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f78h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f71a.getAlpha()) {
            this.f71a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f71a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
