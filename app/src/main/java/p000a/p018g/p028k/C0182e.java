package p000a.p018g.p028k;

/* renamed from: a.g.k.e */
/* loaded from: classes.dex */
public class C0182e<T> implements AbstractC0181d<T> {

    /* renamed from: a */
    private final Object[] f633a;

    /* renamed from: b */
    private int f634b;

    public C0182e(int i) {
        if (i > 0) {
            this.f633a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    private boolean m3560b(T t) {
        for (int i = 0; i < this.f634b; i++) {
            if (this.f633a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // p000a.p018g.p028k.AbstractC0181d
    /* renamed from: a */
    public T mo3559a() {
        int i = this.f634b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f633a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f634b = i - 1;
        return t;
    }

    @Override // p000a.p018g.p028k.AbstractC0181d
    /* renamed from: a */
    public boolean mo3558a(T t) {
        if (!m3560b(t)) {
            int i = this.f634b;
            Object[] objArr = this.f633a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f634b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
