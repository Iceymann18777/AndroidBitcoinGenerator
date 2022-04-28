package p000a.p014e.p015a;

/* renamed from: a.e.a.h */
/* loaded from: classes.dex */
class C0090h<T> implements AbstractC0089g<T> {

    /* renamed from: a */
    private final Object[] f333a;

    /* renamed from: b */
    private int f334b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0090h(int i) {
        if (i > 0) {
            this.f333a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p000a.p014e.p015a.AbstractC0089g
    /* renamed from: a */
    public T mo3928a() {
        int i = this.f334b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f333a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f334b = i - 1;
        return t;
    }

    @Override // p000a.p014e.p015a.AbstractC0089g
    /* renamed from: a */
    public void mo3926a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f334b;
            Object[] objArr = this.f333a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f334b = i3 + 1;
            }
        }
    }

    @Override // p000a.p014e.p015a.AbstractC0089g
    /* renamed from: a */
    public boolean mo3927a(T t) {
        int i = this.f334b;
        Object[] objArr = this.f333a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f334b = i + 1;
        return true;
    }
}
