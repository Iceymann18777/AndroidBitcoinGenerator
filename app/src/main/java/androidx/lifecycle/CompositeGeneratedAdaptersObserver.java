package androidx.lifecycle;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements AbstractC0741d {

    /* renamed from: a */
    private final AbstractC0740c[] f2778a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(AbstractC0740c[] cVarArr) {
        this.f2778a = cVarArr;
    }

    @Override // androidx.lifecycle.AbstractC0741d
    /* renamed from: a */
    public void mo1388a(AbstractC0746g gVar, AbstractC0742e.EnumC0743a aVar) {
        C0752k kVar = new C0752k();
        for (AbstractC0740c cVar : this.f2778a) {
            cVar.m1389a(gVar, aVar, false, kVar);
        }
        for (AbstractC0740c cVar2 : this.f2778a) {
            cVar2.m1389a(gVar, aVar, true, kVar);
        }
    }
}
