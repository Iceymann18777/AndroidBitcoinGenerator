package p050b.p051a.p052a.p053a.p054j;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: b.a.a.a.j.f */
/* loaded from: classes.dex */
public class C0882f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f3289a = new Matrix();

    public C0882f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f3289a.set(imageView.getImageMatrix());
        return this.f3289a;
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
