package p000a.p014e.p015a.p016j;

import p000a.p014e.p015a.C0086e;
import p000a.p014e.p015a.C0091i;

/* renamed from: a.e.a.j.m */
/* loaded from: classes.dex */
public class C0112m extends C0114o {

    /* renamed from: c */
    C0097e f510c;

    /* renamed from: d */
    C0112m f511d;

    /* renamed from: e */
    float f512e;

    /* renamed from: f */
    C0112m f513f;

    /* renamed from: g */
    float f514g;

    /* renamed from: i */
    private C0112m f516i;

    /* renamed from: h */
    int f515h = 0;

    /* renamed from: j */
    private C0113n f517j = null;

    /* renamed from: k */
    private int f518k = 1;

    /* renamed from: l */
    private C0113n f519l = null;

    /* renamed from: m */
    private int f520m = 1;

    public C0112m(C0097e eVar) {
        this.f510c = eVar;
    }

    /* renamed from: a */
    String m3766a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void m3765a(int i, C0112m mVar, int i2) {
        this.f515h = i;
        this.f511d = mVar;
        this.f512e = i2;
        this.f511d.m3752a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3764a(C0086e eVar) {
        C0091i e = this.f510c.m3892e();
        C0112m mVar = this.f513f;
        if (mVar == null) {
            eVar.m3955a(e, (int) (this.f514g + 0.5f));
        } else {
            eVar.m3953a(e, eVar.m3949a(mVar.f510c), (int) (this.f514g + 0.5f), 6);
        }
    }

    /* renamed from: a */
    public void m3763a(C0112m mVar, float f) {
        if (this.f523b == 0 || !(this.f513f == mVar || this.f514g == f)) {
            this.f513f = mVar;
            this.f514g = f;
            if (this.f523b == 1) {
                m3751b();
            }
            m3753a();
        }
    }

    /* renamed from: a */
    public void m3762a(C0112m mVar, int i) {
        this.f511d = mVar;
        this.f512e = i;
        this.f511d.m3752a(this);
    }

    /* renamed from: a */
    public void m3761a(C0112m mVar, int i, C0113n nVar) {
        this.f511d = mVar;
        this.f511d.m3752a(this);
        this.f517j = nVar;
        this.f518k = i;
        this.f517j.m3752a(this);
    }

    /* renamed from: b */
    public void m3760b(int i) {
        this.f515h = i;
    }

    /* renamed from: b */
    public void m3759b(C0112m mVar, float f) {
        this.f516i = mVar;
    }

    /* renamed from: b */
    public void m3758b(C0112m mVar, int i, C0113n nVar) {
        this.f516i = mVar;
        this.f519l = nVar;
        this.f520m = i;
    }

    @Override // p000a.p014e.p015a.p016j.C0114o
    /* renamed from: d */
    public void mo3749d() {
        super.mo3749d();
        this.f511d = null;
        this.f512e = 0.0f;
        this.f517j = null;
        this.f518k = 1;
        this.f519l = null;
        this.f520m = 1;
        this.f513f = null;
        this.f514g = 0.0f;
        this.f516i = null;
        this.f515h = 0;
    }

    @Override // p000a.p014e.p015a.p016j.C0114o
    /* renamed from: e */
    public void mo3748e() {
        C0112m mVar;
        C0112m mVar2;
        C0112m mVar3;
        C0112m mVar4;
        C0112m mVar5;
        C0112m mVar6;
        C0112m mVar7;
        float f;
        C0097e eVar;
        float f2;
        float f3;
        C0112m mVar8;
        float f4;
        boolean z = true;
        if (this.f523b != 1 && this.f515h != 4) {
            C0113n nVar = this.f517j;
            if (nVar != null) {
                if (nVar.f523b == 1) {
                    this.f512e = this.f518k * nVar.f521c;
                } else {
                    return;
                }
            }
            C0113n nVar2 = this.f519l;
            if (nVar2 != null) {
                if (nVar2.f523b == 1) {
                    float f5 = nVar2.f521c;
                } else {
                    return;
                }
            }
            if (this.f515h == 1 && ((mVar8 = this.f511d) == null || mVar8.f523b == 1)) {
                C0112m mVar9 = this.f511d;
                if (mVar9 == null) {
                    this.f513f = this;
                    f4 = this.f512e;
                } else {
                    this.f513f = mVar9.f513f;
                    f4 = mVar9.f514g + this.f512e;
                }
                this.f514g = f4;
                m3753a();
                return;
            }
            if (this.f515h == 2 && (mVar4 = this.f511d) != null && mVar4.f523b == 1 && (mVar5 = this.f516i) != null && (mVar6 = mVar5.f511d) != null && mVar6.f523b == 1) {
                if (C0086e.m3934h() != null) {
                    C0086e.m3934h().f328v++;
                }
                this.f513f = this.f511d.f513f;
                C0112m mVar10 = this.f516i;
                mVar10.f513f = mVar10.f511d.f513f;
                C0097e.EnumC0101d dVar = this.f510c.f374c;
                int i = 0;
                if (!(dVar == C0097e.EnumC0101d.RIGHT || dVar == C0097e.EnumC0101d.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f = this.f511d.f514g;
                    mVar7 = this.f516i.f511d;
                } else {
                    f = this.f516i.f511d.f514g;
                    mVar7 = this.f511d;
                }
                float f6 = f - mVar7.f514g;
                C0097e.EnumC0101d dVar2 = this.f510c.f374c;
                if (dVar2 == C0097e.EnumC0101d.LEFT || dVar2 == C0097e.EnumC0101d.RIGHT) {
                    f3 = f6 - this.f510c.f373b.m3820s();
                    f2 = this.f510c.f373b.f421V;
                } else {
                    f3 = f6 - eVar.f373b.m3840i();
                    f2 = this.f510c.f373b.f422W;
                }
                i = this.f510c.m3895b();
                int b = this.f516i.f510c.m3895b();
                if (this.f510c.m3890g() == this.f516i.f510c.m3890g()) {
                    f2 = 0.5f;
                    b = 0;
                }
                float f7 = i;
                float f8 = b;
                float f9 = (f3 - f7) - f8;
                if (z) {
                    C0112m mVar11 = this.f516i;
                    mVar11.f514g = mVar11.f511d.f514g + f8 + (f9 * f2);
                    this.f514g = (this.f511d.f514g - f7) - (f9 * (1.0f - f2));
                } else {
                    this.f514g = this.f511d.f514g + f7 + (f9 * f2);
                    C0112m mVar12 = this.f516i;
                    mVar12.f514g = (mVar12.f511d.f514g - f8) - (f9 * (1.0f - f2));
                }
            } else if (this.f515h == 3 && (mVar = this.f511d) != null && mVar.f523b == 1 && (mVar2 = this.f516i) != null && (mVar3 = mVar2.f511d) != null && mVar3.f523b == 1) {
                if (C0086e.m3934h() != null) {
                    C0086e.m3934h().f329w++;
                }
                C0112m mVar13 = this.f511d;
                this.f513f = mVar13.f513f;
                C0112m mVar14 = this.f516i;
                C0112m mVar15 = mVar14.f511d;
                mVar14.f513f = mVar15.f513f;
                this.f514g = mVar13.f514g + this.f512e;
                mVar14.f514g = mVar15.f514g + mVar14.f512e;
            } else if (this.f515h == 5) {
                this.f510c.f373b.mo3881G();
                return;
            } else {
                return;
            }
            m3753a();
            this.f516i.m3753a();
        }
    }

    /* renamed from: f */
    public float m3757f() {
        return this.f514g;
    }

    /* renamed from: g */
    public void m3756g() {
        C0097e g = this.f510c.m3890g();
        if (g != null) {
            if (g.m3890g() == this.f510c) {
                this.f515h = 4;
                g.m3893d().f515h = 4;
            }
            int b = this.f510c.m3895b();
            C0097e.EnumC0101d dVar = this.f510c.f374c;
            if (dVar == C0097e.EnumC0101d.RIGHT || dVar == C0097e.EnumC0101d.BOTTOM) {
                b = -b;
            }
            m3762a(g.m3893d(), b);
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f523b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f510c);
            str = " UNRESOLVED} type: ";
        } else if (this.f513f == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f510c);
            sb.append(", RESOLVED: ");
            sb.append(this.f514g);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f510c);
            sb.append(", RESOLVED: ");
            sb.append(this.f513f);
            sb.append(":");
            sb.append(this.f514g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(m3766a(this.f515h));
        return sb.toString();
    }
}
