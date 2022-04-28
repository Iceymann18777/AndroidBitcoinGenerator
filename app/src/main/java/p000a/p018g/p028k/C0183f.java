package p000a.p018g.p028k;

/* renamed from: a.g.k.f */
/* loaded from: classes.dex */
public class C0183f<T> extends C0182e<T> {

    /* renamed from: c */
    private final Object f635c = new Object();

    public C0183f(int i) {
        super(i);
    }

    @Override // p000a.p018g.p028k.C0182e, p000a.p018g.p028k.AbstractC0181d
    /* renamed from: a */
    public T mo3559a() {
        T t;
        synchronized (this.f635c) {
            t = (T) super.mo3559a();
        }
        return t;
    }

    @Override // p000a.p018g.p028k.C0182e, p000a.p018g.p028k.AbstractC0181d
    /* renamed from: a */
    public boolean mo3558a(T t) {
        boolean a;
        synchronized (this.f635c) {
            a = super.mo3558a(t);
        }
        return a;
    }
}
