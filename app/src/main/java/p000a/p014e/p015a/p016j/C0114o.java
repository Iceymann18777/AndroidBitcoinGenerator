package p000a.p014e.p015a.p016j;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a.e.a.j.o */
/* loaded from: classes.dex */
public class C0114o {

    /* renamed from: a */
    HashSet<C0114o> f522a = new HashSet<>(2);

    /* renamed from: b */
    int f523b = 0;

    /* renamed from: a */
    public void m3753a() {
        this.f523b = 1;
        Iterator<C0114o> it = this.f522a.iterator();
        while (it.hasNext()) {
            it.next().mo3748e();
        }
    }

    /* renamed from: a */
    public void m3752a(C0114o oVar) {
        this.f522a.add(oVar);
    }

    /* renamed from: b */
    public void m3751b() {
        this.f523b = 0;
        Iterator<C0114o> it = this.f522a.iterator();
        while (it.hasNext()) {
            it.next().m3751b();
        }
    }

    /* renamed from: c */
    public boolean m3750c() {
        return this.f523b == 1;
    }

    /* renamed from: d */
    public void mo3749d() {
        this.f523b = 0;
        this.f522a.clear();
    }

    /* renamed from: e */
    public void mo3748e() {
    }
}
