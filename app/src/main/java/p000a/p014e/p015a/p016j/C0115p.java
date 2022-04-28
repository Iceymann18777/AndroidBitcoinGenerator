package p000a.p014e.p015a.p016j;

import java.util.ArrayList;

/* renamed from: a.e.a.j.p */
/* loaded from: classes.dex */
public class C0115p {

    /* renamed from: a */
    private int f524a;

    /* renamed from: b */
    private int f525b;

    /* renamed from: c */
    private int f526c;

    /* renamed from: d */
    private int f527d;

    /* renamed from: e */
    private ArrayList<C0116a> f528e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a.j.p$a */
    /* loaded from: classes.dex */
    public static class C0116a {

        /* renamed from: a */
        private C0097e f529a;

        /* renamed from: b */
        private C0097e f530b;

        /* renamed from: c */
        private int f531c;

        /* renamed from: d */
        private C0097e.EnumC0100c f532d;

        /* renamed from: e */
        private int f533e;

        public C0116a(C0097e eVar) {
            this.f529a = eVar;
            this.f530b = eVar.m3890g();
            this.f531c = eVar.m3895b();
            this.f532d = eVar.m3891f();
            this.f533e = eVar.m3900a();
        }

        /* renamed from: a */
        public void m3745a(C0102f fVar) {
            fVar.mo3780a(this.f529a.m3889h()).m3896a(this.f530b, this.f531c, this.f532d, this.f533e);
        }

        /* renamed from: b */
        public void m3744b(C0102f fVar) {
            int i;
            this.f529a = fVar.mo3780a(this.f529a.m3889h());
            C0097e eVar = this.f529a;
            if (eVar != null) {
                this.f530b = eVar.m3890g();
                this.f531c = this.f529a.m3895b();
                this.f532d = this.f529a.m3891f();
                i = this.f529a.m3900a();
            } else {
                this.f530b = null;
                i = 0;
                this.f531c = 0;
                this.f532d = C0097e.EnumC0100c.STRONG;
            }
            this.f533e = i;
        }
    }

    public C0115p(C0102f fVar) {
        this.f524a = fVar.m3815v();
        this.f525b = fVar.m3814w();
        this.f526c = fVar.m3820s();
        this.f527d = fVar.m3840i();
        ArrayList<C0097e> b = fVar.mo3779b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.f528e.add(new C0116a(b.get(i)));
        }
    }

    /* renamed from: a */
    public void m3747a(C0102f fVar) {
        fVar.m3821r(this.f524a);
        fVar.m3819s(this.f525b);
        fVar.m3827o(this.f526c);
        fVar.m3843g(this.f527d);
        int size = this.f528e.size();
        for (int i = 0; i < size; i++) {
            this.f528e.get(i).m3745a(fVar);
        }
    }

    /* renamed from: b */
    public void m3746b(C0102f fVar) {
        this.f524a = fVar.m3815v();
        this.f525b = fVar.m3814w();
        this.f526c = fVar.m3820s();
        this.f527d = fVar.m3840i();
        int size = this.f528e.size();
        for (int i = 0; i < size; i++) {
            this.f528e.get(i).m3744b(fVar);
        }
    }
}
