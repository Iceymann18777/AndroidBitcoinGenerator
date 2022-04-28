package p000a.p014e.p015a.p016j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000a.p014e.p015a.C0086e;

/* renamed from: a.e.a.j.g */
/* loaded from: classes.dex */
public class C0105g extends C0117q {

    /* renamed from: n0 */
    private C0115p f476n0;

    /* renamed from: o0 */
    int f477o0;

    /* renamed from: p0 */
    int f478p0;

    /* renamed from: q0 */
    int f479q0;

    /* renamed from: r0 */
    int f480r0;

    /* renamed from: l0 */
    private boolean f474l0 = false;

    /* renamed from: m0 */
    protected C0086e f475m0 = new C0086e();

    /* renamed from: s0 */
    int f481s0 = 0;

    /* renamed from: t0 */
    int f482t0 = 0;

    /* renamed from: u0 */
    C0096d[] f483u0 = new C0096d[4];

    /* renamed from: v0 */
    C0096d[] f484v0 = new C0096d[4];

    /* renamed from: w0 */
    public List<C0106h> f485w0 = new ArrayList();

    /* renamed from: x0 */
    public boolean f486x0 = false;

    /* renamed from: y0 */
    public boolean f487y0 = false;

    /* renamed from: z0 */
    public boolean f488z0 = false;

    /* renamed from: A0 */
    public int f468A0 = 0;

    /* renamed from: B0 */
    public int f469B0 = 0;

    /* renamed from: C0 */
    private int f470C0 = 7;

    /* renamed from: D0 */
    public boolean f471D0 = false;

    /* renamed from: E0 */
    private boolean f472E0 = false;

    /* renamed from: F0 */
    private boolean f473F0 = false;

    /* renamed from: V */
    private void m3801V() {
        this.f481s0 = 0;
        this.f482t0 = 0;
    }

    /* renamed from: d */
    private void m3796d(C0102f fVar) {
        int i = this.f481s0 + 1;
        C0096d[] dVarArr = this.f484v0;
        if (i >= dVarArr.length) {
            this.f484v0 = (C0096d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f484v0[this.f481s0] = new C0096d(fVar, 0, m3807P());
        this.f481s0++;
    }

    /* renamed from: e */
    private void m3795e(C0102f fVar) {
        int i = this.f482t0 + 1;
        C0096d[] dVarArr = this.f483u0;
        if (i >= dVarArr.length) {
            this.f483u0 = (C0096d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f483u0[this.f482t0] = new C0096d(fVar, 1, m3807P());
        this.f482t0++;
    }

    @Override // p000a.p014e.p015a.p016j.C0117q, p000a.p014e.p015a.p016j.C0102f
    /* renamed from: D */
    public void mo3743D() {
        this.f475m0.m3936f();
        this.f477o0 = 0;
        this.f479q0 = 0;
        this.f478p0 = 0;
        this.f480r0 = 0;
        this.f485w0.clear();
        this.f471D0 = false;
        super.mo3743D();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d4  */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // p000a.p014e.p015a.p016j.C0117q
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo3740K() {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.p016j.C0105g.mo3740K():void");
    }

    /* renamed from: M */
    public int m3810M() {
        return this.f470C0;
    }

    /* renamed from: N */
    public boolean m3809N() {
        return false;
    }

    /* renamed from: O */
    public boolean m3808O() {
        return this.f473F0;
    }

    /* renamed from: P */
    public boolean m3807P() {
        return this.f474l0;
    }

    /* renamed from: Q */
    public boolean m3806Q() {
        return this.f472E0;
    }

    /* renamed from: R */
    public void m3805R() {
        if (!m3793t(8)) {
            mo3782a(this.f470C0);
        }
        m3802U();
    }

    /* renamed from: S */
    public void m3804S() {
        int size = this.f534k0.size();
        mo3882F();
        for (int i = 0; i < size; i++) {
            this.f534k0.get(i).mo3882F();
        }
    }

    /* renamed from: T */
    public void m3803T() {
        m3804S();
        mo3782a(this.f470C0);
    }

    /* renamed from: U */
    public void m3802U() {
        C0112m d = mo3780a(C0097e.EnumC0101d.LEFT).m3893d();
        C0112m d2 = mo3780a(C0097e.EnumC0101d.TOP).m3893d();
        d.m3763a((C0112m) null, 0.0f);
        d2.m3763a((C0112m) null, 0.0f);
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public void mo3782a(int i) {
        super.mo3782a(i);
        int size = this.f534k0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f534k0.get(i2).mo3782a(i);
        }
    }

    /* renamed from: a */
    public void m3800a(C0086e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo3778c(eVar);
        int size = this.f534k0.size();
        for (int i = 0; i < size; i++) {
            C0102f fVar = this.f534k0.get(i);
            fVar.mo3778c(eVar);
            if (fVar.f402C[0] == C0102f.EnumC0104b.MATCH_CONSTRAINT && fVar.m3820s() < fVar.m3816u()) {
                zArr[2] = true;
            }
            if (fVar.f402C[1] == C0102f.EnumC0104b.MATCH_CONSTRAINT && fVar.m3840i() < fVar.m3818t()) {
                zArr[2] = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3799a(C0102f fVar, int i) {
        if (i == 0) {
            m3796d(fVar);
        } else if (i == 1) {
            m3795e(fVar);
        }
    }

    /* renamed from: c */
    public void m3798c(boolean z) {
        this.f474l0 = z;
    }

    /* renamed from: d */
    public boolean m3797d(C0086e eVar) {
        mo3781a(eVar);
        int size = this.f534k0.size();
        for (int i = 0; i < size; i++) {
            C0102f fVar = this.f534k0.get(i);
            if (fVar instanceof C0105g) {
                C0102f.EnumC0104b[] bVarArr = fVar.f402C;
                C0102f.EnumC0104b bVar = bVarArr[0];
                C0102f.EnumC0104b bVar2 = bVarArr[1];
                if (bVar == C0102f.EnumC0104b.WRAP_CONTENT) {
                    fVar.m3871a(C0102f.EnumC0104b.FIXED);
                }
                if (bVar2 == C0102f.EnumC0104b.WRAP_CONTENT) {
                    fVar.m3860b(C0102f.EnumC0104b.FIXED);
                }
                fVar.mo3781a(eVar);
                if (bVar == C0102f.EnumC0104b.WRAP_CONTENT) {
                    fVar.m3871a(bVar);
                }
                if (bVar2 == C0102f.EnumC0104b.WRAP_CONTENT) {
                    fVar.m3860b(bVar2);
                }
            } else {
                C0110k.m3767a(this, eVar, fVar);
                fVar.mo3781a(eVar);
            }
        }
        if (this.f481s0 > 0) {
            C0095c.m3905a(this, eVar, 0);
        }
        if (this.f482t0 > 0) {
            C0095c.m3905a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: f */
    public void m3794f(int i, int i2) {
        C0113n nVar;
        C0113n nVar2;
        if (!(this.f402C[0] == C0102f.EnumC0104b.WRAP_CONTENT || (nVar2 = this.f430c) == null)) {
            nVar2.m3755a(i);
        }
        if (this.f402C[1] != C0102f.EnumC0104b.WRAP_CONTENT && (nVar = this.f432d) != null) {
            nVar.m3755a(i2);
        }
    }

    /* renamed from: t */
    public boolean m3793t(int i) {
        return (this.f470C0 & i) == i;
    }

    /* renamed from: u */
    public void m3792u(int i) {
        this.f470C0 = i;
    }
}
