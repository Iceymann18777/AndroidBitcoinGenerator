package p000a.p014e.p015a.p016j;

import java.util.ArrayList;
import p000a.p014e.p015a.C0084c;

/* renamed from: a.e.a.j.q */
/* loaded from: classes.dex */
public class C0117q extends C0102f {

    /* renamed from: k0 */
    protected ArrayList<C0102f> f534k0 = new ArrayList<>();

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: D */
    public void mo3743D() {
        this.f534k0.clear();
        super.mo3743D();
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: H */
    public void mo3742H() {
        super.mo3742H();
        ArrayList<C0102f> arrayList = this.f534k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0102f fVar = this.f534k0.get(i);
                fVar.mo3737b(m3844g(), m3842h());
                if (!(fVar instanceof C0105g)) {
                    fVar.mo3742H();
                }
            }
        }
    }

    /* renamed from: J */
    public C0105g m3741J() {
        C0102f k = m3836k();
        C0105g gVar = this instanceof C0105g ? (C0105g) this : null;
        while (k != null) {
            k = k.m3836k();
            if (k instanceof C0105g) {
                gVar = (C0105g) k;
            }
        }
        return gVar;
    }

    /* renamed from: K */
    public void mo3740K() {
        mo3742H();
        ArrayList<C0102f> arrayList = this.f534k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0102f fVar = this.f534k0.get(i);
                if (fVar instanceof C0117q) {
                    ((C0117q) fVar).mo3740K();
                }
            }
        }
    }

    /* renamed from: L */
    public void m3739L() {
        this.f534k0.clear();
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public void mo3738a(C0084c cVar) {
        super.mo3738a(cVar);
        int size = this.f534k0.size();
        for (int i = 0; i < size; i++) {
            this.f534k0.get(i).mo3738a(cVar);
        }
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: b */
    public void mo3737b(int i, int i2) {
        super.mo3737b(i, i2);
        int size = this.f534k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f534k0.get(i3).mo3737b(m3828o(), m3826p());
        }
    }

    /* renamed from: b */
    public void m3736b(C0102f fVar) {
        this.f534k0.add(fVar);
        if (fVar.m3836k() != null) {
            ((C0117q) fVar.m3836k()).m3735c(fVar);
        }
        fVar.m3870a((C0102f) this);
    }

    /* renamed from: c */
    public void m3735c(C0102f fVar) {
        this.f534k0.remove(fVar);
        fVar.m3870a((C0102f) null);
    }
}
