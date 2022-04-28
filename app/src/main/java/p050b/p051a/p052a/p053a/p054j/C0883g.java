package p050b.p051a.p052a.p053a.p054j;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: b.a.a.a.j.g */
/* loaded from: classes.dex */
public class C0883g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f3290a = new float[9];

    /* renamed from: b */
    private final float[] f3291b = new float[9];

    /* renamed from: c */
    private final Matrix f3292c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f3290a);
        matrix2.getValues(this.f3291b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f3291b;
            float f2 = fArr[i];
            float[] fArr2 = this.f3290a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f3292c.setValues(this.f3291b);
        return this.f3292c;
    }
}
