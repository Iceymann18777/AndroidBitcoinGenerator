package p000a.p014e.p015a.p016j;

import java.util.ArrayList;
import p000a.p014e.p015a.C0086e;
import p000a.p014e.p015a.C0091i;

/* renamed from: a.e.a.j.i */
/* loaded from: classes.dex */
public class C0107i extends C0102f {

    /* renamed from: k0 */
    protected float f500k0 = -1.0f;

    /* renamed from: l0 */
    protected int f501l0 = -1;

    /* renamed from: m0 */
    protected int f502m0 = -1;

    /* renamed from: n0 */
    private C0097e f503n0 = this.f454t;

    /* renamed from: o0 */
    private int f504o0 = 0;

    /* renamed from: p0 */
    private boolean f505p0 = false;

    /* renamed from: a.e.a.j.i$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0108a {

        /* renamed from: a */
        static final /* synthetic */ int[] f506a = new int[C0097e.EnumC0101d.values().length];

        static {
            try {
                f506a[C0097e.EnumC0101d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f506a[C0097e.EnumC0101d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f506a[C0097e.EnumC0101d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f506a[C0097e.EnumC0101d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f506a[C0097e.EnumC0101d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f506a[C0097e.EnumC0101d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f506a[C0097e.EnumC0101d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f506a[C0097e.EnumC0101d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f506a[C0097e.EnumC0101d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0107i() {
        new C0111l();
        this.f401B.clear();
        this.f401B.add(this.f503n0);
        int length = this.f400A.length;
        for (int i = 0; i < length; i++) {
            this.f400A[i] = this.f503n0;
        }
    }

    /* renamed from: J */
    public int m3784J() {
        return this.f504o0;
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public C0097e mo3780a(C0097e.EnumC0101d dVar) {
        switch (C0108a.f506a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f504o0 == 1) {
                    return this.f503n0;
                }
                break;
            case 3:
            case 4:
                if (this.f504o0 == 0) {
                    return this.f503n0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public void mo3782a(int i) {
        C0097e eVar;
        C0112m mVar;
        int i2;
        C0097e eVar2;
        C0112m mVar2;
        C0112m d;
        int i3;
        C0097e eVar3;
        C0102f k = m3836k();
        if (k != null) {
            if (m3784J() == 1) {
                this.f454t.m3893d().m3765a(1, k.f454t.m3893d(), 0);
                this.f456v.m3893d().m3765a(1, k.f454t.m3893d(), 0);
                if (this.f501l0 != -1) {
                    this.f453s.m3893d().m3765a(1, k.f453s.m3893d(), this.f501l0);
                    mVar2 = this.f455u.m3893d();
                    eVar3 = k.f453s;
                    d = eVar3.m3893d();
                    i3 = this.f501l0;
                } else if (this.f502m0 != -1) {
                    this.f453s.m3893d().m3765a(1, k.f455u.m3893d(), -this.f502m0);
                    mVar2 = this.f455u.m3893d();
                    eVar2 = k.f455u;
                    d = eVar2.m3893d();
                    i3 = -this.f502m0;
                } else if (this.f500k0 != -1.0f && k.m3838j() == C0102f.EnumC0104b.FIXED) {
                    i2 = (int) (k.f404E * this.f500k0);
                    this.f453s.m3893d().m3765a(1, k.f453s.m3893d(), i2);
                    mVar = this.f455u.m3893d();
                    eVar = k.f453s;
                    mVar.m3765a(1, eVar.m3893d(), i2);
                    return;
                } else {
                    return;
                }
            } else {
                this.f453s.m3893d().m3765a(1, k.f453s.m3893d(), 0);
                this.f455u.m3893d().m3765a(1, k.f453s.m3893d(), 0);
                if (this.f501l0 != -1) {
                    this.f454t.m3893d().m3765a(1, k.f454t.m3893d(), this.f501l0);
                    mVar2 = this.f456v.m3893d();
                    eVar3 = k.f454t;
                    d = eVar3.m3893d();
                    i3 = this.f501l0;
                } else if (this.f502m0 != -1) {
                    this.f454t.m3893d().m3765a(1, k.f456v.m3893d(), -this.f502m0);
                    mVar2 = this.f456v.m3893d();
                    eVar2 = k.f456v;
                    d = eVar2.m3893d();
                    i3 = -this.f502m0;
                } else if (this.f500k0 != -1.0f && k.m3824q() == C0102f.EnumC0104b.FIXED) {
                    i2 = (int) (k.f405F * this.f500k0);
                    this.f454t.m3893d().m3765a(1, k.f454t.m3893d(), i2);
                    mVar = this.f456v.m3893d();
                    eVar = k.f454t;
                    mVar.m3765a(1, eVar.m3893d(), i2);
                    return;
                } else {
                    return;
                }
            }
            mVar2.m3765a(1, d, i3);
        }
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public void mo3781a(C0086e eVar) {
        C0105g gVar = (C0105g) m3836k();
        if (gVar != null) {
            C0097e a = gVar.mo3780a(C0097e.EnumC0101d.LEFT);
            C0097e a2 = gVar.mo3780a(C0097e.EnumC0101d.RIGHT);
            C0102f fVar = this.f403D;
            boolean z = fVar != null && fVar.f402C[0] == C0102f.EnumC0104b.WRAP_CONTENT;
            if (this.f504o0 == 0) {
                a = gVar.mo3780a(C0097e.EnumC0101d.TOP);
                a2 = gVar.mo3780a(C0097e.EnumC0101d.BOTTOM);
                C0102f fVar2 = this.f403D;
                z = fVar2 != null && fVar2.f402C[1] == C0102f.EnumC0104b.WRAP_CONTENT;
            }
            if (this.f501l0 != -1) {
                C0091i a3 = eVar.m3949a(this.f503n0);
                eVar.m3953a(a3, eVar.m3949a(a), this.f501l0, 6);
                if (z) {
                    eVar.m3945b(eVar.m3949a(a2), a3, 0, 5);
                }
            } else if (this.f502m0 != -1) {
                C0091i a4 = eVar.m3949a(this.f503n0);
                C0091i a5 = eVar.m3949a(a2);
                eVar.m3953a(a4, a5, -this.f502m0, 6);
                if (z) {
                    eVar.m3945b(a4, eVar.m3949a(a), 0, 5);
                    eVar.m3945b(a5, a4, 0, 5);
                }
            } else if (this.f500k0 != -1.0f) {
                eVar.m3961a(C0086e.m3957a(eVar, eVar.m3949a(this.f503n0), eVar.m3949a(a), eVar.m3949a(a2), this.f500k0, this.f505p0));
            }
        }
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: a */
    public boolean mo3783a() {
        return true;
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: b */
    public ArrayList<C0097e> mo3779b() {
        return this.f401B;
    }

    @Override // p000a.p014e.p015a.p016j.C0102f
    /* renamed from: c */
    public void mo3778c(C0086e eVar) {
        if (m3836k() != null) {
            int b = eVar.m3943b(this.f503n0);
            if (this.f504o0 == 1) {
                m3821r(b);
                m3819s(0);
                m3843g(m3836k().m3840i());
                m3827o(0);
                return;
            }
            m3821r(0);
            m3819s(b);
            m3827o(m3836k().m3820s());
            m3843g(0);
        }
    }

    /* renamed from: e */
    public void m3777e(float f) {
        if (f > -1.0f) {
            this.f500k0 = f;
            this.f501l0 = -1;
            this.f502m0 = -1;
        }
    }

    /* renamed from: t */
    public void m3776t(int i) {
        if (i > -1) {
            this.f500k0 = -1.0f;
            this.f501l0 = i;
            this.f502m0 = -1;
        }
    }

    /* renamed from: u */
    public void m3775u(int i) {
        if (i > -1) {
            this.f500k0 = -1.0f;
            this.f501l0 = -1;
            this.f502m0 = i;
        }
    }

    /* renamed from: v */
    public void m3774v(int i) {
        if (this.f504o0 != i) {
            this.f504o0 = i;
            this.f401B.clear();
            this.f503n0 = this.f504o0 == 1 ? this.f453s : this.f454t;
            this.f401B.add(this.f503n0);
            int length = this.f400A.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f400A[i2] = this.f503n0;
            }
        }
    }
}
