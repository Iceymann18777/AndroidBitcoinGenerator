package p000a.p045n;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: a.n.h */
/* loaded from: classes.dex */
class C0354h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f1079a;

    /* renamed from: b */
    private final PathMeasure f1080b;

    /* renamed from: c */
    private final float f1081c;

    /* renamed from: d */
    private final float[] f1082d = new float[2];

    /* renamed from: e */
    private final PointF f1083e = new PointF();

    /* renamed from: f */
    private float f1084f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0354h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f1079a = property;
        this.f1080b = new PathMeasure(path, false);
        this.f1081c = this.f1080b.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f1084f = f.floatValue();
        this.f1080b.getPosTan(this.f1081c * f.floatValue(), this.f1082d, null);
        PointF pointF = this.f1083e;
        float[] fArr = this.f1082d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f1079a.set(t, pointF);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f1084f);
    }
}
