package p000a.p038k.p039a.p040a;

import android.view.animation.Interpolator;

/* renamed from: a.k.a.a.d  reason: invalid class name */
/* loaded from: classes.dex */
abstract class AbstractanimationInterpolatorC0308d implements Interpolator {

    /* renamed from: a */
    private final float[] f1001a;

    /* renamed from: b */
    private final float f1002b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractanimationInterpolatorC0308d(float[] fArr) {
        this.f1001a = fArr;
        this.f1002b = 1.0f / (this.f1001a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1001a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f1002b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f1001a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
