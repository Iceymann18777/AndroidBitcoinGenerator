package p000a.p014e.p015a;

/* renamed from: a.e.a.b */
/* loaded from: classes.dex */
public class C0083b implements C0086e.AbstractC0087a {

    /* renamed from: c */
    boolean f283c;

    /* renamed from: d */
    public final C0082a f284d;

    /* renamed from: a */
    C0091i f281a = null;

    /* renamed from: b */
    float f282b = 0.0f;

    /* renamed from: e */
    boolean f285e = false;

    public C0083b(C0084c cVar) {
        this.f284d = new C0082a(this, cVar);
    }

    /* renamed from: a */
    public C0083b m3983a(float f, float f2, float f3, C0091i iVar, C0091i iVar2, C0091i iVar3, C0091i iVar4) {
        this.f282b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f284d.m3992a(iVar, 1.0f);
            this.f284d.m3992a(iVar2, -1.0f);
            this.f284d.m3992a(iVar4, 1.0f);
            this.f284d.m3992a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f284d.m3992a(iVar, 1.0f);
            this.f284d.m3992a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f284d.m3992a(iVar3, 1.0f);
            this.f284d.m3992a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f284d.m3992a(iVar, 1.0f);
            this.f284d.m3992a(iVar2, -1.0f);
            this.f284d.m3992a(iVar4, f4);
            this.f284d.m3992a(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: a */
    public C0083b m3981a(C0086e eVar, int i) {
        this.f284d.m3992a(eVar.m3962a(i, "ep"), 1.0f);
        this.f284d.m3992a(eVar.m3962a(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0083b m3980a(C0091i iVar, int i) {
        this.f284d.m3992a(iVar, i);
        return this;
    }

    /* renamed from: a */
    public C0083b m3979a(C0091i iVar, C0091i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f282b = i;
        }
        if (!z) {
            this.f284d.m3992a(iVar, -1.0f);
            this.f284d.m3992a(iVar2, 1.0f);
        } else {
            this.f284d.m3992a(iVar, 1.0f);
            this.f284d.m3992a(iVar2, -1.0f);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0083b m3978a(C0091i iVar, C0091i iVar2, int i, float f, C0091i iVar3, C0091i iVar4, int i2) {
        float f2;
        if (iVar2 == iVar3) {
            this.f284d.m3992a(iVar, 1.0f);
            this.f284d.m3992a(iVar4, 1.0f);
            this.f284d.m3992a(iVar2, -2.0f);
            return this;
        } else if (f == 0.5f) {
            this.f284d.m3992a(iVar, 1.0f);
            this.f284d.m3992a(iVar2, -1.0f);
            this.f284d.m3992a(iVar3, -1.0f);
            this.f284d.m3992a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (-i) + i2;
                this.f282b = f2;
            }
            return this;
        } else {
            if (f <= 0.0f) {
                this.f284d.m3992a(iVar, -1.0f);
                this.f284d.m3992a(iVar2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                this.f284d.m3992a(iVar3, -1.0f);
                this.f284d.m3992a(iVar4, 1.0f);
                f2 = i2;
            } else {
                float f3 = 1.0f - f;
                this.f284d.m3992a(iVar, f3 * 1.0f);
                this.f284d.m3992a(iVar2, f3 * (-1.0f));
                this.f284d.m3992a(iVar3, (-1.0f) * f);
                this.f284d.m3992a(iVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = ((-i) * f3) + (i2 * f);
                }
                return this;
            }
            this.f282b = f2;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0083b m3977a(C0091i iVar, C0091i iVar2, C0091i iVar3, float f) {
        this.f284d.m3992a(iVar, -1.0f);
        this.f284d.m3992a(iVar2, 1.0f - f);
        this.f284d.m3992a(iVar3, f);
        return this;
    }

    /* renamed from: a */
    public C0083b m3976a(C0091i iVar, C0091i iVar2, C0091i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f282b = i;
        }
        if (!z) {
            this.f284d.m3992a(iVar, -1.0f);
            this.f284d.m3992a(iVar2, 1.0f);
            this.f284d.m3992a(iVar3, 1.0f);
        } else {
            this.f284d.m3992a(iVar, 1.0f);
            this.f284d.m3992a(iVar2, -1.0f);
            this.f284d.m3992a(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0083b m3975a(C0091i iVar, C0091i iVar2, C0091i iVar3, C0091i iVar4, float f) {
        this.f284d.m3992a(iVar, -1.0f);
        this.f284d.m3992a(iVar2, 1.0f);
        this.f284d.m3992a(iVar3, f);
        this.f284d.m3992a(iVar4, -f);
        return this;
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    /* renamed from: a */
    public C0091i mo3930a(C0086e eVar, boolean[] zArr) {
        return this.f284d.m3988a(zArr, (C0091i) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3984a() {
        float f = this.f282b;
        if (f < 0.0f) {
            this.f282b = f * (-1.0f);
            this.f284d.m3987b();
        }
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    /* renamed from: a */
    public void mo3931a(C0086e.AbstractC0087a aVar) {
        if (aVar instanceof C0083b) {
            C0083b bVar = (C0083b) aVar;
            this.f281a = null;
            this.f284d.m3999a();
            int i = 0;
            while (true) {
                C0082a aVar2 = bVar.f284d;
                if (i < aVar2.f270a) {
                    this.f284d.m3991a(aVar2.m3997a(i), bVar.f284d.m3986b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    /* renamed from: a */
    public void mo3929a(C0091i iVar) {
        int i = iVar.f339d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f284d.m3992a(iVar, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m3982a(C0086e eVar) {
        boolean z;
        C0091i a = this.f284d.m3994a(eVar);
        if (a == null) {
            z = true;
        } else {
            m3965d(a);
            z = false;
        }
        if (this.f284d.f270a == 0) {
            this.f285e = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C0083b m3972b(C0091i iVar, int i) {
        this.f281a = iVar;
        float f = i;
        iVar.f340e = f;
        this.f282b = f;
        this.f285e = true;
        return this;
    }

    /* renamed from: b */
    public C0083b m3971b(C0091i iVar, C0091i iVar2, C0091i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f282b = i;
        }
        if (!z) {
            this.f284d.m3992a(iVar, -1.0f);
            this.f284d.m3992a(iVar2, 1.0f);
            this.f284d.m3992a(iVar3, -1.0f);
        } else {
            this.f284d.m3992a(iVar, 1.0f);
            this.f284d.m3992a(iVar2, -1.0f);
            this.f284d.m3992a(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0083b m3970b(C0091i iVar, C0091i iVar2, C0091i iVar3, C0091i iVar4, float f) {
        this.f284d.m3992a(iVar3, 0.5f);
        this.f284d.m3992a(iVar4, 0.5f);
        this.f284d.m3992a(iVar, -0.5f);
        this.f284d.m3992a(iVar2, -0.5f);
        this.f282b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m3974b() {
        C0091i iVar = this.f281a;
        return iVar != null && (iVar.f342g == C0091i.EnumC0092a.UNRESTRICTED || this.f282b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m3973b(C0091i iVar) {
        return this.f284d.m3993a(iVar);
    }

    /* renamed from: c */
    public C0083b m3967c(C0091i iVar, int i) {
        C0082a aVar;
        float f;
        if (i < 0) {
            this.f282b = i * (-1);
            aVar = this.f284d;
            f = 1.0f;
        } else {
            this.f282b = i;
            aVar = this.f284d;
            f = -1.0f;
        }
        aVar.m3992a(iVar, f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C0091i m3968c(C0091i iVar) {
        return this.f284d.m3988a((boolean[]) null, iVar);
    }

    /* renamed from: c */
    public boolean m3969c() {
        return this.f281a == null && this.f282b == 0.0f && this.f284d.f270a == 0;
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    public void clear() {
        this.f284d.m3999a();
        this.f281a = null;
        this.f282b = 0.0f;
    }

    /* renamed from: d */
    public void m3966d() {
        this.f281a = null;
        this.f284d.m3999a();
        this.f282b = 0.0f;
        this.f285e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3965d(C0091i iVar) {
        C0091i iVar2 = this.f281a;
        if (iVar2 != null) {
            this.f284d.m3992a(iVar2, -1.0f);
            this.f281a = null;
        }
        float a = this.f284d.m3989a(iVar, true) * (-1.0f);
        this.f281a = iVar;
        if (a != 1.0f) {
            this.f282b /= a;
            this.f284d.m3998a(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m3964e() {
        /*
            r9 = this;
            a.e.a.i r0 = r9.f281a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            a.e.a.i r1 = r9.f281a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f282b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f282b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            a.e.a.a r5 = r9.f284d
            int r5 = r5.f270a
        L_0x0057:
            if (r2 >= r5) goto L_0x00d4
            a.e.a.a r6 = r9.f284d
            a.e.a.i r6 = r6.m3997a(r2)
            if (r6 != 0) goto L_0x0062
            goto L_0x00d1
        L_0x0062:
            a.e.a.a r7 = r9.f284d
            float r7 = r7.m3986b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006d
            goto L_0x00d1
        L_0x006d:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0084
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a4
        L_0x0084:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x009a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ad
        L_0x009a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        L_0x00ad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c6
        L_0x00b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c6:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00d1:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x00d4:
            if (r1 != 0) goto L_0x00e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.C0083b.m3964e():java.lang.String");
    }

    @Override // p000a.p014e.p015a.C0086e.AbstractC0087a
    public C0091i getKey() {
        return this.f281a;
    }

    public String toString() {
        return m3964e();
    }
}
