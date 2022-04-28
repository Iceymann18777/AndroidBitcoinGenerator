package p000a.p014e.p015a;

import java.util.Arrays;
import java.util.HashMap;

import p000a.p014e.p015a.p016j.C0097e;
import p000a.p014e.p015a.p016j.C0102f;

/* renamed from: a.e.a.e */
/* loaded from: classes.dex */
public class C0086e {

    /* renamed from: p */
    private static int f289p = 1000;

    /* renamed from: q */
    public static C0088f f290q;

    /* renamed from: e */
    private int f295e;

    /* renamed from: f */
    C0083b[] f296f;

    /* renamed from: h */
    private boolean[] f298h;

    /* renamed from: k */
    private int f301k;

    /* renamed from: a */
    int f291a = 0;

    /* renamed from: b */
    private HashMap<String, C0091i> f292b = null;

    /* renamed from: d */
    private int f294d = 32;

    /* renamed from: g */
    public boolean f297g = false;

    /* renamed from: i */
    int f299i = 1;

    /* renamed from: j */
    int f300j = 0;

    /* renamed from: m */
    private C0091i[] f303m = new C0091i[f289p];

    /* renamed from: n */
    private int f304n = 0;

    /* renamed from: l */
    final C0084c f302l = new C0084c();

    /* renamed from: c */
    private AbstractC0087a f293c = new C0085d(this.f302l);

    /* renamed from: o */
    private final AbstractC0087a f305o = new C0083b(this.f302l);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a.e$a */
    /* loaded from: classes.dex */
    public interface AbstractC0087a {
        /* renamed from: a */
        C0091i mo3930a(C0086e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo3931a(AbstractC0087a aVar);

        /* renamed from: a */
        void mo3929a(C0091i iVar);

        void clear();

        C0091i getKey();
    }

    public C0086e() {
        int i = this.f294d;
        this.f295e = i;
        this.f296f = null;
        this.f298h = new boolean[i];
        this.f301k = i;
        C0083b[] bVarArr = new C0083b[i];
        this.f296f = new C0083b[i];
        m3932j();
    }

    /* renamed from: a */
    private final int m3958a(AbstractC0087a aVar, boolean z) {
        C0088f fVar = f290q;
        if (fVar != null) {
            fVar.f314h++;
        }
        for (int i = 0; i < this.f299i; i++) {
            this.f298h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0088f fVar2 = f290q;
            if (fVar2 != null) {
                fVar2.f315i++;
            }
            i2++;
            if (i2 >= this.f299i * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f298h[aVar.getKey().f337b] = true;
            }
            C0091i a = aVar.mo3930a(this, this.f298h);
            if (a != null) {
                boolean[] zArr = this.f298h;
                int i3 = a.f337b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.f300j; i5++) {
                    C0083b bVar = this.f296f[i5];
                    if (bVar.f281a.f342g != C0091i.EnumC0092a.UNRESTRICTED && !bVar.f285e && bVar.m3973b(a)) {
                        float b = bVar.f284d.m3985b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f282b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0083b bVar2 = this.f296f[i4];
                    bVar2.f281a.f338c = -1;
                    C0088f fVar3 = f290q;
                    if (fVar3 != null) {
                        fVar3.f316j++;
                    }
                    bVar2.m3965d(a);
                    C0091i iVar = bVar2.f281a;
                    iVar.f338c = i4;
                    iVar.m3920c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public static C0083b m3957a(C0086e eVar, C0091i iVar, C0091i iVar2, C0091i iVar3, float f, boolean z) {
        C0083b b = eVar.m3948b();
        if (z) {
            eVar.m3947b(b);
        }
        b.m3977a(iVar, iVar2, iVar3, f);
        return b;
    }

    /* renamed from: a */
    private C0091i m3956a(C0091i.EnumC0092a aVar, String str) {
        C0091i a = this.f302l.f287b.mo3928a();
        if (a == null) {
            a = new C0091i(aVar, str);
        } else {
            a.m3925a();
        }
        a.m3923a(aVar, str);
        int i = this.f304n;
        int i2 = f289p;
        if (i >= i2) {
            f289p = i2 * 2;
            this.f303m = (C0091i[]) Arrays.copyOf(this.f303m, f289p);
        }
        C0091i[] iVarArr = this.f303m;
        int i3 = this.f304n;
        this.f304n = i3 + 1;
        iVarArr[i3] = a;
        return a;
    }

    /* renamed from: b */
    private int m3946b(AbstractC0087a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f300j) {
                z = false;
                break;
            }
            C0083b[] bVarArr = this.f296f;
            if (bVarArr[i].f281a.f342g != C0091i.EnumC0092a.UNRESTRICTED && bVarArr[i].f282b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0088f fVar = f290q;
            if (fVar != null) {
                fVar.f317k++;
            }
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f300j) {
                C0083b bVar = this.f296f[i3];
                if (bVar.f281a.f342g != C0091i.EnumC0092a.UNRESTRICTED && !bVar.f285e && bVar.f282b < f) {
                    int i7 = 1;
                    while (i7 < this.f299i) {
                        C0091i iVar = this.f302l.f288c[i7];
                        float b = bVar.f284d.m3985b(iVar);
                        if (b > f) {
                            int i8 = i6;
                            float f3 = f2;
                            int i9 = i5;
                            int i10 = i4;
                            for (int i11 = 0; i11 < 7; i11++) {
                                float f4 = iVar.f341f[i11] / b;
                                if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                    i9 = i7;
                                    i10 = i3;
                                    f3 = f4;
                                    i8 = i11;
                                }
                            }
                            i4 = i10;
                            i5 = i9;
                            f2 = f3;
                            i6 = i8;
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C0083b bVar2 = this.f296f[i4];
                bVar2.f281a.f338c = -1;
                C0088f fVar2 = f290q;
                if (fVar2 != null) {
                    fVar2.f316j++;
                }
                bVar2.m3965d(this.f302l.f288c[i5]);
                C0091i iVar2 = bVar2.f281a;
                iVar2.f338c = i4;
                iVar2.m3920c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f299i / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: b */
    private void m3947b(C0083b bVar) {
        bVar.m3981a(this, 0);
    }

    /* renamed from: c */
    private final void m3941c(C0083b bVar) {
        C0083b[] bVarArr = this.f296f;
        int i = this.f300j;
        if (bVarArr[i] != null) {
            this.f302l.f286a.mo3927a(bVarArr[i]);
        }
        C0083b[] bVarArr2 = this.f296f;
        int i2 = this.f300j;
        bVarArr2[i2] = bVar;
        C0091i iVar = bVar.f281a;
        iVar.f338c = i2;
        this.f300j = i2 + 1;
        iVar.m3920c(bVar);
    }

    /* renamed from: d */
    private final void m3938d(C0083b bVar) {
        if (this.f300j > 0) {
            bVar.f284d.m3995a(bVar, this.f296f);
            if (bVar.f284d.f270a == 0) {
                bVar.f285e = true;
            }
        }
    }

    /* renamed from: g */
    private void m3935g() {
        for (int i = 0; i < this.f300j; i++) {
            C0083b bVar = this.f296f[i];
            bVar.f281a.f340e = bVar.f282b;
        }
    }

    /* renamed from: h */
    public static C0088f m3934h() {
        return f290q;
    }

    /* renamed from: i */
    private void m3933i() {
        this.f294d *= 2;
        this.f296f = (C0083b[]) Arrays.copyOf(this.f296f, this.f294d);
        C0084c cVar = this.f302l;
        cVar.f288c = (C0091i[]) Arrays.copyOf(cVar.f288c, this.f294d);
        int i = this.f294d;
        this.f298h = new boolean[i];
        this.f295e = i;
        this.f301k = i;
        C0088f fVar = f290q;
        if (fVar != null) {
            fVar.f310d++;
            fVar.f321o = Math.max(fVar.f321o, i);
            C0088f fVar2 = f290q;
            fVar2.f306A = fVar2.f321o;
        }
    }

    /* renamed from: j */
    private void m3932j() {
        int i = 0;
        while (true) {
            C0083b[] bVarArr = this.f296f;
            if (i < bVarArr.length) {
                C0083b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f302l.f286a.mo3927a(bVar);
                }
                this.f296f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C0083b m3953a(C0091i iVar, C0091i iVar2, int i, int i2) {
        C0083b b = m3948b();
        b.m3979a(iVar, iVar2, i);
        if (i2 != 6) {
            b.m3981a(this, i2);
        }
        m3961a(b);
        return b;
    }

    /* renamed from: a */
    public C0091i m3963a() {
        C0088f fVar = f290q;
        if (fVar != null) {
            fVar.f320n++;
        }
        if (this.f299i + 1 >= this.f295e) {
            m3933i();
        }
        C0091i a = m3956a(C0091i.EnumC0092a.SLACK, (String) null);
        this.f291a++;
        this.f299i++;
        int i = this.f291a;
        a.f337b = i;
        this.f302l.f288c[i] = a;
        return a;
    }

    /* renamed from: a */
    public C0091i m3962a(int i, String str) {
        C0088f fVar = f290q;
        if (fVar != null) {
            fVar.f318l++;
        }
        if (this.f299i + 1 >= this.f295e) {
            m3933i();
        }
        C0091i a = m3956a(C0091i.EnumC0092a.ERROR, str);
        this.f291a++;
        this.f299i++;
        int i2 = this.f291a;
        a.f337b = i2;
        a.f339d = i;
        this.f302l.f288c[i2] = a;
        this.f293c.mo3929a(a);
        return a;
    }

    /* renamed from: a */
    public C0091i m3949a(Object obj) {
        C0091i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f299i + 1 >= this.f295e) {
            m3933i();
        }
        if (obj instanceof C0097e) {
            C0097e eVar = (C0097e) obj;
            iVar = eVar.m3892e();
            if (iVar == null) {
                eVar.m3899a(this.f302l);
                iVar = eVar.m3892e();
            }
            int i = iVar.f337b;
            if (i == -1 || i > this.f291a || this.f302l.f288c[i] == null) {
                if (iVar.f337b != -1) {
                    iVar.m3925a();
                }
                this.f291a++;
                this.f299i++;
                int i2 = this.f291a;
                iVar.f337b = i2;
                iVar.f342g = C0091i.EnumC0092a.UNRESTRICTED;
                this.f302l.f288c[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: a */
    public void m3961a(C0083b bVar) {
        C0091i c;
        if (bVar != null) {
            C0088f fVar = f290q;
            if (fVar != null) {
                fVar.f312f++;
                if (bVar.f285e) {
                    fVar.f313g++;
                }
            }
            if (this.f300j + 1 >= this.f301k || this.f299i + 1 >= this.f295e) {
                m3933i();
            }
            boolean z = false;
            if (!bVar.f285e) {
                m3938d(bVar);
                if (!bVar.m3969c()) {
                    bVar.m3984a();
                    if (bVar.m3982a(this)) {
                        C0091i a = m3963a();
                        bVar.f281a = a;
                        m3941c(bVar);
                        this.f305o.mo3931a(bVar);
                        m3958a(this.f305o, true);
                        if (a.f338c == -1) {
                            if (bVar.f281a == a && (c = bVar.m3968c(a)) != null) {
                                C0088f fVar2 = f290q;
                                if (fVar2 != null) {
                                    fVar2.f316j++;
                                }
                                bVar.m3965d(c);
                            }
                            if (!bVar.f285e) {
                                bVar.f281a.m3920c(bVar);
                            }
                            this.f300j--;
                        }
                        z = true;
                    }
                    if (!bVar.m3974b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                m3941c(bVar);
            }
        }
    }

    /* renamed from: a */
    void m3960a(C0083b bVar, int i, int i2) {
        bVar.m3980a(m3962a(i2, (String) null), i);
    }

    /* renamed from: a */
    void m3959a(AbstractC0087a aVar) {
        C0088f fVar = f290q;
        if (fVar != null) {
            fVar.f325s++;
            fVar.f326t = Math.max(fVar.f326t, this.f299i);
            C0088f fVar2 = f290q;
            fVar2.f327u = Math.max(fVar2.f327u, this.f300j);
        }
        m3938d((C0083b) aVar);
        m3946b(aVar);
        m3958a(aVar, false);
        m3935g();
    }

    /* renamed from: a */
    public void m3955a(C0091i iVar, int i) {
        C0083b bVar;
        int i2 = iVar.f338c;
        if (i2 != -1) {
            C0083b bVar2 = this.f296f[i2];
            if (!bVar2.f285e) {
                if (bVar2.f284d.f270a == 0) {
                    bVar2.f285e = true;
                } else {
                    bVar = m3948b();
                    bVar.m3967c(iVar, i);
                }
            }
            bVar2.f282b = i;
            return;
        }
        bVar = m3948b();
        bVar.m3972b(iVar, i);
        m3961a(bVar);
    }

    /* renamed from: a */
    public void m3954a(C0091i iVar, C0091i iVar2, int i, float f, C0091i iVar3, C0091i iVar4, int i2, int i3) {
        C0083b b = m3948b();
        b.m3978a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i3 != 6) {
            b.m3981a(this, i3);
        }
        m3961a(b);
    }

    /* renamed from: a */
    public void m3952a(C0091i iVar, C0091i iVar2, C0091i iVar3, C0091i iVar4, float f, int i) {
        C0083b b = m3948b();
        b.m3975a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            b.m3981a(this, i);
        }
        m3961a(b);
    }

    /* renamed from: a */
    public void m3951a(C0091i iVar, C0091i iVar2, boolean z) {
        C0083b b = m3948b();
        C0091i c = m3942c();
        c.f339d = 0;
        b.m3976a(iVar, iVar2, c, 0);
        if (z) {
            m3960a(b, (int) (b.f284d.m3985b(c) * (-1.0f)), 1);
        }
        m3961a(b);
    }

    /* renamed from: a */
    public void m3950a(C0102f fVar, C0102f fVar2, float f, int i) {
        C0091i a = m3949a(fVar.mo3780a(C0097e.EnumC0101d.LEFT));
        C0091i a2 = m3949a(fVar.mo3780a(C0097e.EnumC0101d.TOP));
        C0091i a3 = m3949a(fVar.mo3780a(C0097e.EnumC0101d.RIGHT));
        C0091i a4 = m3949a(fVar.mo3780a(C0097e.EnumC0101d.BOTTOM));
        C0091i a5 = m3949a(fVar2.mo3780a(C0097e.EnumC0101d.LEFT));
        C0091i a6 = m3949a(fVar2.mo3780a(C0097e.EnumC0101d.TOP));
        C0091i a7 = m3949a(fVar2.mo3780a(C0097e.EnumC0101d.RIGHT));
        C0091i a8 = m3949a(fVar2.mo3780a(C0097e.EnumC0101d.BOTTOM));
        C0083b b = m3948b();
        double d = f;
        double sin = Math.sin(d);
        double d2 = i;
        Double.isNaN(d2);
        b.m3970b(a2, a4, a6, a8, (float) (sin * d2));
        m3961a(b);
        C0083b b2 = m3948b();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        b2.m3970b(a, a3, a5, a7, (float) (cos * d2));
        m3961a(b2);
    }

    /* renamed from: b */
    public int m3943b(Object obj) {
        C0091i e = ((C0097e) obj).m3892e();
        if (e != null) {
            return (int) (e.f340e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    public C0083b m3948b() {
        C0083b a = this.f302l.f286a.mo3928a();
        if (a == null) {
            a = new C0083b(this.f302l);
        } else {
            a.m3966d();
        }
        C0091i.m3922b();
        return a;
    }

    /* renamed from: b */
    public void m3945b(C0091i iVar, C0091i iVar2, int i, int i2) {
        C0083b b = m3948b();
        C0091i c = m3942c();
        c.f339d = 0;
        b.m3976a(iVar, iVar2, c, i);
        if (i2 != 6) {
            m3960a(b, (int) (b.f284d.m3985b(c) * (-1.0f)), i2);
        }
        m3961a(b);
    }

    /* renamed from: b */
    public void m3944b(C0091i iVar, C0091i iVar2, boolean z) {
        C0083b b = m3948b();
        C0091i c = m3942c();
        c.f339d = 0;
        b.m3971b(iVar, iVar2, c, 0);
        if (z) {
            m3960a(b, (int) (b.f284d.m3985b(c) * (-1.0f)), 1);
        }
        m3961a(b);
    }

    /* renamed from: c */
    public C0091i m3942c() {
        C0088f fVar = f290q;
        if (fVar != null) {
            fVar.f319m++;
        }
        if (this.f299i + 1 >= this.f295e) {
            m3933i();
        }
        C0091i a = m3956a(C0091i.EnumC0092a.SLACK, (String) null);
        this.f291a++;
        this.f299i++;
        int i = this.f291a;
        a.f337b = i;
        this.f302l.f288c[i] = a;
        return a;
    }

    /* renamed from: c */
    public void m3940c(C0091i iVar, C0091i iVar2, int i, int i2) {
        C0083b b = m3948b();
        C0091i c = m3942c();
        c.f339d = 0;
        b.m3971b(iVar, iVar2, c, i);
        if (i2 != 6) {
            m3960a(b, (int) (b.f284d.m3985b(c) * (-1.0f)), i2);
        }
        m3961a(b);
    }

    /* renamed from: d */
    public C0084c m3939d() {
        return this.f302l;
    }

    /* renamed from: e */
    public void m3937e() {
        C0088f fVar = f290q;
        if (fVar != null) {
            fVar.f311e++;
        }
        if (this.f297g) {
            C0088f fVar2 = f290q;
            if (fVar2 != null) {
                fVar2.f323q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f300j) {
                    z = true;
                    break;
                } else if (!this.f296f[i].f285e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                C0088f fVar3 = f290q;
                if (fVar3 != null) {
                    fVar3.f322p++;
                }
                m3935g();
                return;
            }
        }
        m3959a(this.f293c);
    }

    /* renamed from: f */
    public void m3936f() {
        C0084c cVar;
        int i = 0;
        while (true) {
            cVar = this.f302l;
            C0091i[] iVarArr = cVar.f288c;
            if (i >= iVarArr.length) {
                break;
            }
            C0091i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.m3925a();
            }
            i++;
        }
        cVar.f287b.mo3926a(this.f303m, this.f304n);
        this.f304n = 0;
        Arrays.fill(this.f302l.f288c, (Object) null);
        HashMap<String, C0091i> hashMap = this.f292b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f291a = 0;
        this.f293c.clear();
        this.f299i = 1;
        for (int i2 = 0; i2 < this.f300j; i2++) {
            this.f296f[i2].f283c = false;
        }
        m3932j();
        this.f300j = 0;
    }
}
