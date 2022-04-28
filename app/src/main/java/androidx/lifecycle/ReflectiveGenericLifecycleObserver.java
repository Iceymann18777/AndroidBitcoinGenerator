package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements AbstractC0741d {

    /* renamed from: a */
    private final Object f2797a;

    /* renamed from: b */
    private final C0736a.C0737a f2798b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2797a = obj;
        this.f2798b = C0736a.f2800c.m1403a(this.f2797a.getClass());
    }

    @Override // androidx.lifecycle.AbstractC0741d
    /* renamed from: a */
    public void mo1388a(AbstractC0746g gVar, AbstractC0742e.EnumC0743a aVar) {
        this.f2798b.m1398a(gVar, aVar, this.f2797a);
    }
}
