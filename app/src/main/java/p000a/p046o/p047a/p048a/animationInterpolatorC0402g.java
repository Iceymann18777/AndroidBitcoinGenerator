package p000a.p046o.p047a.p048a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p000a.p018g.p019d.p020c.C0140g;
import p000a.p018g.p021e.C0142b;

/* renamed from: a.o.a.a.g  reason: invalid class name */
/* loaded from: classes.dex */
public class animationInterpolatorC0402g implements Interpolator {

    /* renamed from: a */
    private float[] f1206a;

    /* renamed from: b */
    private float[] f1207b;

    public animationInterpolatorC0402g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public animationInterpolatorC0402g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1192l);
        m2731a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m2733a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m2730a(path);
    }

    /* renamed from: a */
    private void m2732a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m2730a(path);
    }

    /* renamed from: a */
    private void m2731a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0140g.m3675a(xmlPullParser, "pathData")) {
            String a = C0140g.m3679a(typedArray, xmlPullParser, "pathData", 4);
            Path b = C0142b.m3660b(a);
            if (b != null) {
                m2730a(b);
                return;
            }
            throw new InflateException("The path is null, which is created from " + a);
        } else if (!C0140g.m3675a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0140g.m3675a(xmlPullParser, "controlY1")) {
            float a2 = C0140g.m3678a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a3 = C0140g.m3678a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a4 = C0140g.m3675a(xmlPullParser, "controlX2");
            if (a4 != C0140g.m3675a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a4) {
                m2733a(a2, a3);
            } else {
                m2732a(a2, a3, C0140g.m3678a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0140g.m3678a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    /* renamed from: a */
    private void m2730a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f1206a = new float[min];
            this.f1207b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                this.f1206a[i2] = fArr[0];
                this.f1207b[i2] = fArr[1];
            }
            if (Math.abs(this.f1206a[0]) <= 1.0E-5d && Math.abs(this.f1207b[0]) <= 1.0E-5d) {
                int i3 = min - 1;
                if (Math.abs(this.f1206a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f1207b[i3] - 1.0f) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        float[] fArr2 = this.f1206a;
                        i4++;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f1206a[0]);
            sb.append(",");
            sb.append(this.f1207b[0]);
            sb.append(" end:");
            int i5 = min - 1;
            sb.append(this.f1206a[i5]);
            sb.append(",");
            sb.append(this.f1207b[i5]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f1206a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f1206a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f1206a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f1207b[i];
        }
        float[] fArr2 = this.f1207b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
