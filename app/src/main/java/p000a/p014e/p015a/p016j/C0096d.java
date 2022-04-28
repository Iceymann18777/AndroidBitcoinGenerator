package p000a.p014e.p015a.p016j;

import java.util.ArrayList;

/* renamed from: a.e.a.j.d */
/* loaded from: classes.dex */
public class C0096d {

    /* renamed from: a */
    protected C0102f f355a;

    /* renamed from: b */
    protected C0102f f356b;

    /* renamed from: c */
    protected C0102f f357c;

    /* renamed from: d */
    protected C0102f f358d;

    /* renamed from: e */
    protected C0102f f359e;

    /* renamed from: f */
    protected C0102f f360f;

    /* renamed from: g */
    protected C0102f f361g;

    /* renamed from: h */
    protected ArrayList<C0102f> f362h;

    /* renamed from: i */
    protected int f363i;

    /* renamed from: j */
    protected int f364j;

    /* renamed from: k */
    protected float f365k = 0.0f;

    /* renamed from: l */
    private int f366l;

    /* renamed from: m */
    private boolean f367m;

    /* renamed from: n */
    protected boolean f368n;

    /* renamed from: o */
    protected boolean f369o;

    /* renamed from: p */
    protected boolean f370p;

    /* renamed from: q */
    private boolean f371q;

    public C0096d(C0102f fVar, int i, boolean z) {
        this.f367m = false;
        this.f355a = fVar;
        this.f366l = i;
        this.f367m = z;
    }

    /* renamed from: a */
    private static boolean m3902a(C0102f fVar, int i) {
        if (fVar.m3822r() != 8 && fVar.f402C[i] == C0102f.EnumC0104b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.f438g;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m3901b() {
        int i = this.f366l * 2;
        C0102f fVar = this.f355a;
        boolean z = false;
        C0102f fVar2 = fVar;
        boolean z2 = false;
        while (!z2) {
            this.f363i++;
            C0102f[] fVarArr = fVar.f443i0;
            int i2 = this.f366l;
            fVar = null;
            fVarArr[i2] = null;
            fVar.f441h0[i2] = null;
            if (fVar.m3822r() != 8) {
                if (this.f356b == null) {
                    this.f356b = fVar;
                }
                this.f358d = fVar;
                C0102f.EnumC0104b[] bVarArr = fVar.f402C;
                int i3 = this.f366l;
                if (bVarArr[i3] == C0102f.EnumC0104b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar.f438g;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.f364j++;
                        float[] fArr = fVar.f439g0;
                        int i4 = this.f366l;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f365k += fArr[i4];
                        }
                        if (m3902a(fVar, this.f366l)) {
                            if (f < 0.0f) {
                                this.f368n = true;
                            } else {
                                this.f369o = true;
                            }
                            if (this.f362h == null) {
                                this.f362h = new ArrayList<>();
                            }
                            this.f362h.add(fVar);
                        }
                        if (this.f360f == null) {
                            this.f360f = fVar;
                        }
                        C0102f fVar3 = this.f361g;
                        if (fVar3 != null) {
                            fVar3.f441h0[this.f366l] = fVar;
                        }
                        this.f361g = fVar;
                    }
                }
            }
            if (fVar2 != fVar) {
                fVar2.f443i0[this.f366l] = fVar;
            }
            C0097e eVar = fVar.f400A[i + 1].f375d;
            if (eVar != null) {
                C0102f fVar4 = eVar.f373b;
                C0097e[] eVarArr = fVar4.f400A;
                if (eVarArr[i].f375d != null && eVarArr[i].f375d.f373b == fVar) {
                    fVar = fVar4;
                }
            }
            if (fVar == null) {
                fVar = fVar;
                z2 = true;
            }
            fVar2 = fVar;
        }
        this.f357c = fVar;
        this.f359e = (this.f366l != 0 || !this.f367m) ? this.f355a : this.f357c;
        if (this.f369o && this.f368n) {
            z = true;
        }
        this.f370p = z;
    }

    /* renamed from: a */
    public void m3903a() {
        if (!this.f371q) {
            m3901b();
        }
        this.f371q = true;
    }
}
