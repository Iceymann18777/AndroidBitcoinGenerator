package p000a.p014e.p015a.p016j;

import java.util.ArrayList;
import p000a.p014e.p015a.C0084c;
import p000a.p014e.p015a.C0086e;

/* renamed from: a.e.a.j.f */
/* loaded from: classes.dex */
public class C0102f {

    /* renamed from: j0 */
    public static float f399j0 = 0.5f;

    /* renamed from: C */
    protected EnumC0104b[] f402C;

    /* renamed from: R */
    protected int f417R;

    /* renamed from: S */
    protected int f418S;

    /* renamed from: T */
    private int f419T;

    /* renamed from: U */
    private int f420U;

    /* renamed from: V */
    float f421V;

    /* renamed from: W */
    float f422W;

    /* renamed from: X */
    private Object f423X;

    /* renamed from: c */
    C0113n f430c;

    /* renamed from: d */
    C0113n f432d;

    /* renamed from: a */
    public int f426a = -1;

    /* renamed from: b */
    public int f428b = -1;

    /* renamed from: e */
    int f434e = 0;

    /* renamed from: f */
    int f436f = 0;

    /* renamed from: g */
    int[] f438g = new int[2];

    /* renamed from: h */
    int f440h = 0;

    /* renamed from: i */
    int f442i = 0;

    /* renamed from: j */
    float f444j = 1.0f;

    /* renamed from: k */
    int f445k = 0;

    /* renamed from: l */
    int f446l = 0;

    /* renamed from: m */
    float f447m = 1.0f;

    /* renamed from: n */
    int f448n = -1;

    /* renamed from: o */
    float f449o = 1.0f;

    /* renamed from: p */
    C0106h f450p = null;

    /* renamed from: q */
    private int[] f451q = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: r */
    private float f452r = 0.0f;

    /* renamed from: s */
    C0097e f453s = new C0097e(this, C0097e.EnumC0101d.LEFT);

    /* renamed from: t */
    C0097e f454t = new C0097e(this, C0097e.EnumC0101d.TOP);

    /* renamed from: u */
    C0097e f455u = new C0097e(this, C0097e.EnumC0101d.RIGHT);

    /* renamed from: v */
    C0097e f456v = new C0097e(this, C0097e.EnumC0101d.BOTTOM);

    /* renamed from: w */
    C0097e f457w = new C0097e(this, C0097e.EnumC0101d.BASELINE);

    /* renamed from: x */
    C0097e f458x = new C0097e(this, C0097e.EnumC0101d.CENTER_X);

    /* renamed from: y */
    C0097e f459y = new C0097e(this, C0097e.EnumC0101d.CENTER_Y);

    /* renamed from: z */
    C0097e f460z = new C0097e(this, C0097e.EnumC0101d.CENTER);

    /* renamed from: A */
    protected C0097e[] f400A = {this.f453s, this.f455u, this.f454t, this.f456v, this.f457w, this.f460z};

    /* renamed from: B */
    protected ArrayList<C0097e> f401B = new ArrayList<>();

    /* renamed from: D */
    C0102f f403D = null;

    /* renamed from: E */
    int f404E = 0;

    /* renamed from: F */
    int f405F = 0;

    /* renamed from: G */
    protected float f406G = 0.0f;

    /* renamed from: H */
    protected int f407H = -1;

    /* renamed from: I */
    protected int f408I = 0;

    /* renamed from: J */
    protected int f409J = 0;

    /* renamed from: K */
    int f410K = 0;

    /* renamed from: L */
    int f411L = 0;

    /* renamed from: M */
    private int f412M = 0;

    /* renamed from: N */
    private int f413N = 0;

    /* renamed from: O */
    protected int f414O = 0;

    /* renamed from: P */
    protected int f415P = 0;

    /* renamed from: Q */
    int f416Q = 0;

    /* renamed from: Y */
    private int f424Y = 0;

    /* renamed from: Z */
    private String f425Z = null;

    /* renamed from: a0 */
    private String f427a0 = null;

    /* renamed from: b0 */
    boolean f429b0 = false;

    /* renamed from: c0 */
    boolean f431c0 = false;

    /* renamed from: d0 */
    boolean f433d0 = false;

    /* renamed from: e0 */
    int f435e0 = 0;

    /* renamed from: f0 */
    int f437f0 = 0;

    /* renamed from: g0 */
    float[] f439g0 = {-1.0f, -1.0f};

    /* renamed from: h0 */
    protected C0102f[] f441h0 = {null, null};

    /* renamed from: i0 */
    protected C0102f[] f443i0 = {null, null};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a.j.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0103a {

        /* renamed from: a */
        static final /* synthetic */ int[] f461a;

        /* renamed from: b */
        static final /* synthetic */ int[] f462b = new int[EnumC0104b.values().length];

        static {
            try {
                f462b[EnumC0104b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f462b[EnumC0104b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f462b[EnumC0104b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f462b[EnumC0104b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f461a = new int[C0097e.EnumC0101d.values().length];
            try {
                f461a[C0097e.EnumC0101d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f461a[C0097e.EnumC0101d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f461a[C0097e.EnumC0101d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f461a[C0097e.EnumC0101d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f461a[C0097e.EnumC0101d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f461a[C0097e.EnumC0101d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f461a[C0097e.EnumC0101d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f461a[C0097e.EnumC0101d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f461a[C0097e.EnumC0101d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: a.e.a.j.f$b */
    /* loaded from: classes.dex */
    public enum EnumC0104b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0102f() {
        EnumC0104b bVar = EnumC0104b.FIXED;
        this.f402C = new EnumC0104b[]{bVar, bVar};
        float f = f399j0;
        this.f421V = f;
        this.f422W = f;
        m3879J();
    }

    /* renamed from: J */
    private void m3879J() {
        this.f401B.add(this.f453s);
        this.f401B.add(this.f454t);
        this.f401B.add(this.f455u);
        this.f401B.add(this.f456v);
        this.f401B.add(this.f458x);
        this.f401B.add(this.f459y);
        this.f401B.add(this.f460z);
        this.f401B.add(this.f457w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f1, code lost:
        if (r27 != false) goto L_0x01fa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f8, code lost:
        if (r27 != false) goto L_0x01fa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fa, code lost:
        r26.m3945b(r29, r9, r1, 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cd A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3873a(p000a.p014e.p015a.C0086e r26, boolean r27, p000a.p014e.p015a.C0091i r28, p000a.p014e.p015a.C0091i r29, p000a.p014e.p015a.p016j.C0102f.EnumC0104b r30, boolean r31, p000a.p014e.p015a.p016j.C0097e r32, p000a.p014e.p015a.p016j.C0097e r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, float r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.p016j.C0102f.m3873a(a.e.a.e, boolean, a.e.a.i, a.e.a.i, a.e.a.j.f$b, boolean, a.e.a.j.e, a.e.a.j.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* renamed from: t */
    private boolean m3817t(int i) {
        int i2 = i * 2;
        C0097e[] eVarArr = this.f400A;
        if (!(eVarArr[i2].f375d == null || eVarArr[i2].f375d.f375d == eVarArr[i2])) {
            int i3 = i2 + 1;
            if (eVarArr[i3].f375d != null && eVarArr[i3].f375d.f375d == eVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public boolean m3886A() {
        C0097e eVar = this.f454t;
        C0097e eVar2 = eVar.f375d;
        if (eVar2 != null && eVar2.f375d == eVar) {
            return true;
        }
        C0097e eVar3 = this.f456v;
        C0097e eVar4 = eVar3.f375d;
        return eVar4 != null && eVar4.f375d == eVar3;
    }

    /* renamed from: B */
    public boolean m3885B() {
        return this.f436f == 0 && this.f406G == 0.0f && this.f445k == 0 && this.f446l == 0 && this.f402C[1] == EnumC0104b.MATCH_CONSTRAINT;
    }

    /* renamed from: C */
    public boolean m3884C() {
        return this.f434e == 0 && this.f406G == 0.0f && this.f440h == 0 && this.f442i == 0 && this.f402C[0] == EnumC0104b.MATCH_CONSTRAINT;
    }

    /* renamed from: D */
    public void mo3743D() {
        this.f453s.m3887j();
        this.f454t.m3887j();
        this.f455u.m3887j();
        this.f456v.m3887j();
        this.f457w.m3887j();
        this.f458x.m3887j();
        this.f459y.m3887j();
        this.f460z.m3887j();
        this.f403D = null;
        this.f452r = 0.0f;
        this.f404E = 0;
        this.f405F = 0;
        this.f406G = 0.0f;
        this.f407H = -1;
        this.f408I = 0;
        this.f409J = 0;
        this.f412M = 0;
        this.f413N = 0;
        this.f414O = 0;
        this.f415P = 0;
        this.f416Q = 0;
        this.f417R = 0;
        this.f418S = 0;
        this.f419T = 0;
        this.f420U = 0;
        float f = f399j0;
        this.f421V = f;
        this.f422W = f;
        EnumC0104b[] bVarArr = this.f402C;
        EnumC0104b bVar = EnumC0104b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f423X = null;
        this.f424Y = 0;
        this.f427a0 = null;
        this.f435e0 = 0;
        this.f437f0 = 0;
        float[] fArr = this.f439g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f426a = -1;
        this.f428b = -1;
        int[] iArr = this.f451q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f434e = 0;
        this.f436f = 0;
        this.f444j = 1.0f;
        this.f447m = 1.0f;
        this.f442i = Integer.MAX_VALUE;
        this.f446l = Integer.MAX_VALUE;
        this.f440h = 0;
        this.f445k = 0;
        this.f448n = -1;
        this.f449o = 1.0f;
        C0113n nVar = this.f430c;
        if (nVar != null) {
            nVar.mo3749d();
        }
        C0113n nVar2 = this.f432d;
        if (nVar2 != null) {
            nVar2.mo3749d();
        }
        this.f450p = null;
        this.f429b0 = false;
        this.f431c0 = false;
        this.f433d0 = false;
    }

    /* renamed from: E */
    public void m3883E() {
        C0102f k = m3836k();
        if (k == null || !(k instanceof C0105g) || !((C0105g) m3836k()).m3809N()) {
            int size = this.f401B.size();
            for (int i = 0; i < size; i++) {
                this.f401B.get(i).m3887j();
            }
        }
    }

    /* renamed from: F */
    public void mo3882F() {
        for (int i = 0; i < 6; i++) {
            this.f400A[i].m3893d().mo3749d();
        }
    }

    /* renamed from: G */
    public void mo3881G() {
    }

    /* renamed from: H */
    public void mo3742H() {
        int i = this.f408I;
        int i2 = this.f409J;
        this.f412M = i;
        this.f413N = i2;
    }

    /* renamed from: I */
    public void m3880I() {
        for (int i = 0; i < 6; i++) {
            this.f400A[i].m3893d().m3756g();
        }
    }

    /* renamed from: a */
    public C0097e mo3780a(C0097e.EnumC0101d dVar) {
        switch (C0103a.f461a[dVar.ordinal()]) {
            case 1:
                return this.f453s;
            case 2:
                return this.f454t;
            case 3:
                return this.f455u;
            case 4:
                return this.f456v;
            case 5:
                return this.f457w;
            case 6:
                return this.f460z;
            case 7:
                return this.f458x;
            case 8:
                return this.f459y;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    /* renamed from: a */
    public void m3878a(float f) {
        this.f421V = f;
    }

    /* renamed from: a */
    public void mo3782a(int i) {
        C0110k.m3771a(i, this);
    }

    /* renamed from: a */
    public void m3877a(int i, int i2) {
        this.f408I = i;
        this.f404E = i2 - i;
        int i3 = this.f404E;
        int i4 = this.f417R;
        if (i3 < i4) {
            this.f404E = i4;
        }
    }

    /* renamed from: a */
    public void m3876a(int i, int i2, int i3) {
        if (i3 == 0) {
            m3877a(i, i2);
        } else if (i3 == 1) {
            m3847e(i, i2);
        }
        this.f431c0 = true;
    }

    /* renamed from: a */
    public void m3875a(int i, int i2, int i3, float f) {
        this.f434e = i;
        this.f440h = i2;
        this.f442i = i3;
        this.f444j = f;
        if (f < 1.0f && this.f434e == 0) {
            this.f434e = 2;
        }
    }

    /* renamed from: a */
    public void m3874a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f408I = i;
        this.f409J = i2;
        if (this.f424Y == 8) {
            this.f404E = 0;
            this.f405F = 0;
            return;
        }
        if (this.f402C[0] != EnumC0104b.FIXED || i7 >= (i5 = this.f404E)) {
            i5 = i7;
        }
        if (this.f402C[1] != EnumC0104b.FIXED || i8 >= (i6 = this.f405F)) {
            i6 = i8;
        }
        this.f404E = i5;
        this.f405F = i6;
        int i9 = this.f405F;
        int i10 = this.f418S;
        if (i9 < i10) {
            this.f405F = i10;
        }
        int i11 = this.f404E;
        int i12 = this.f417R;
        if (i11 < i12) {
            this.f404E = i12;
        }
        this.f431c0 = true;
    }

    /* renamed from: a */
    public void mo3738a(C0084c cVar) {
        this.f453s.m3899a(cVar);
        this.f454t.m3899a(cVar);
        this.f455u.m3899a(cVar);
        this.f456v.m3899a(cVar);
        this.f457w.m3899a(cVar);
        this.f460z.m3899a(cVar);
        this.f458x.m3899a(cVar);
        this.f459y.m3899a(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo3781a(p000a.p014e.p015a.C0086e r39) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.p016j.C0102f.mo3781a(a.e.a.e):void");
    }

    /* renamed from: a */
    public void m3872a(C0097e.EnumC0101d dVar, C0102f fVar, C0097e.EnumC0101d dVar2, int i, int i2) {
        mo3780a(dVar).m3897a(fVar.mo3780a(dVar2), i, i2, C0097e.EnumC0100c.STRONG, 0, true);
    }

    /* renamed from: a */
    public void m3871a(EnumC0104b bVar) {
        this.f402C[0] = bVar;
        if (bVar == EnumC0104b.WRAP_CONTENT) {
            m3827o(this.f419T);
        }
    }

    /* renamed from: a */
    public void m3870a(C0102f fVar) {
        this.f403D = fVar;
    }

    /* renamed from: a */
    public void m3869a(C0102f fVar, float f, int i) {
        C0097e.EnumC0101d dVar = C0097e.EnumC0101d.CENTER;
        m3872a(dVar, fVar, dVar, i, 0);
        this.f452r = f;
    }

    /* renamed from: a */
    public void m3868a(Object obj) {
        this.f423X = obj;
    }

    /* renamed from: a */
    public void m3867a(String str) {
        this.f425Z = str;
    }

    /* renamed from: a */
    public void m3866a(boolean z) {
    }

    /* renamed from: a */
    public void m3865a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f448n == -1) {
            if (z3 && !z4) {
                this.f448n = 0;
            } else if (!z3 && z4) {
                this.f448n = 1;
                if (this.f407H == -1) {
                    this.f449o = 1.0f / this.f449o;
                }
            }
        }
        if (this.f448n == 0 && (!this.f454t.m3888i() || !this.f456v.m3888i())) {
            this.f448n = 1;
        } else if (this.f448n == 1 && (!this.f453s.m3888i() || !this.f455u.m3888i())) {
            this.f448n = 0;
        }
        if (this.f448n == -1 && (!this.f454t.m3888i() || !this.f456v.m3888i() || !this.f453s.m3888i() || !this.f455u.m3888i())) {
            if (this.f454t.m3888i() && this.f456v.m3888i()) {
                this.f448n = 0;
            } else if (this.f453s.m3888i() && this.f455u.m3888i()) {
                this.f449o = 1.0f / this.f449o;
                this.f448n = 1;
            }
        }
        if (this.f448n == -1) {
            if (z && !z2) {
                this.f448n = 0;
            } else if (!z && z2) {
                this.f449o = 1.0f / this.f449o;
                this.f448n = 1;
            }
        }
        if (this.f448n == -1) {
            if (this.f440h > 0 && this.f445k == 0) {
                this.f448n = 0;
            } else if (this.f440h == 0 && this.f445k > 0) {
                this.f449o = 1.0f / this.f449o;
                this.f448n = 1;
            }
        }
        if (this.f448n == -1 && z && z2) {
            this.f449o = 1.0f / this.f449o;
            this.f448n = 1;
        }
    }

    /* renamed from: a */
    public boolean mo3783a() {
        return this.f424Y != 8;
    }

    /* renamed from: b */
    public float m3863b(int i) {
        if (i == 0) {
            return this.f421V;
        }
        if (i == 1) {
            return this.f422W;
        }
        return -1.0f;
    }

    /* renamed from: b */
    public ArrayList<C0097e> mo3779b() {
        return this.f401B;
    }

    /* renamed from: b */
    public void m3864b(float f) {
        this.f439g0[0] = f;
    }

    /* renamed from: b */
    public void mo3737b(int i, int i2) {
        this.f414O = i;
        this.f415P = i2;
    }

    /* renamed from: b */
    public void m3862b(int i, int i2, int i3, float f) {
        this.f436f = i;
        this.f445k = i2;
        this.f446l = i3;
        this.f447m = f;
        if (f < 1.0f && this.f436f == 0) {
            this.f436f = 2;
        }
    }

    /* renamed from: b */
    public void m3861b(C0086e eVar) {
        eVar.m3949a(this.f453s);
        eVar.m3949a(this.f454t);
        eVar.m3949a(this.f455u);
        eVar.m3949a(this.f456v);
        if (this.f416Q > 0) {
            eVar.m3949a(this.f457w);
        }
    }

    /* renamed from: b */
    public void m3860b(EnumC0104b bVar) {
        this.f402C[1] = bVar;
        if (bVar == EnumC0104b.WRAP_CONTENT) {
            m3843g(this.f420U);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0084 -> B:36:0x0085). Please submit an issue!!! */
    /* renamed from: b */
    public void m3859b(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f406G = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = 0.0f;
        } else {
            String substring3 = str.substring(i3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.f406G = f;
            this.f407H = i2;
        }
    }

    /* renamed from: b */
    public void m3858b(boolean z) {
    }

    /* renamed from: c */
    public int m3857c() {
        return this.f416Q;
    }

    /* renamed from: c */
    public EnumC0104b m3855c(int i) {
        if (i == 0) {
            return m3838j();
        }
        if (i == 1) {
            return m3824q();
        }
        return null;
    }

    /* renamed from: c */
    public void m3856c(float f) {
        this.f422W = f;
    }

    /* renamed from: c */
    public void m3854c(int i, int i2) {
        this.f408I = i;
        this.f409J = i2;
    }

    /* renamed from: c */
    public void mo3778c(C0086e eVar) {
        int b = eVar.m3943b(this.f453s);
        int b2 = eVar.m3943b(this.f454t);
        int b3 = eVar.m3943b(this.f455u);
        int b4 = eVar.m3943b(this.f456v);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b4 = 0;
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        m3874a(b, b2, b3, b4);
    }

    /* renamed from: d */
    public int m3853d() {
        return m3814w() + this.f405F;
    }

    /* renamed from: d */
    public int m3851d(int i) {
        if (i == 0) {
            return m3820s();
        }
        if (i == 1) {
            return m3840i();
        }
        return 0;
    }

    /* renamed from: d */
    public void m3852d(float f) {
        this.f439g0[1] = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3850d(int i, int i2) {
        if (i2 == 0) {
            this.f410K = i;
        } else if (i2 == 1) {
            this.f411L = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m3848e(int i) {
        if (i == 0) {
            return this.f410K;
        }
        if (i == 1) {
            return this.f411L;
        }
        return 0;
    }

    /* renamed from: e */
    public Object m3849e() {
        return this.f423X;
    }

    /* renamed from: e */
    public void m3847e(int i, int i2) {
        this.f409J = i;
        this.f405F = i2 - i;
        int i3 = this.f405F;
        int i4 = this.f418S;
        if (i3 < i4) {
            this.f405F = i4;
        }
    }

    /* renamed from: f */
    public String m3846f() {
        return this.f425Z;
    }

    /* renamed from: f */
    public void m3845f(int i) {
        this.f416Q = i;
    }

    /* renamed from: g */
    public int m3844g() {
        return this.f412M + this.f414O;
    }

    /* renamed from: g */
    public void m3843g(int i) {
        this.f405F = i;
        int i2 = this.f405F;
        int i3 = this.f418S;
        if (i2 < i3) {
            this.f405F = i3;
        }
    }

    /* renamed from: h */
    public int m3842h() {
        return this.f413N + this.f415P;
    }

    /* renamed from: h */
    public void m3841h(int i) {
        this.f435e0 = i;
    }

    /* renamed from: i */
    public int m3840i() {
        if (this.f424Y == 8) {
            return 0;
        }
        return this.f405F;
    }

    /* renamed from: i */
    public void m3839i(int i) {
        this.f451q[1] = i;
    }

    /* renamed from: j */
    public EnumC0104b m3838j() {
        return this.f402C[0];
    }

    /* renamed from: j */
    public void m3837j(int i) {
        this.f451q[0] = i;
    }

    /* renamed from: k */
    public C0102f m3836k() {
        return this.f403D;
    }

    /* renamed from: k */
    public void m3835k(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f418S = i;
    }

    /* renamed from: l */
    public C0113n m3834l() {
        if (this.f432d == null) {
            this.f432d = new C0113n();
        }
        return this.f432d;
    }

    /* renamed from: l */
    public void m3833l(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f417R = i;
    }

    /* renamed from: m */
    public C0113n m3832m() {
        if (this.f430c == null) {
            this.f430c = new C0113n();
        }
        return this.f430c;
    }

    /* renamed from: m */
    public void m3831m(int i) {
        this.f437f0 = i;
    }

    /* renamed from: n */
    public int m3830n() {
        return m3815v() + this.f404E;
    }

    /* renamed from: n */
    public void m3829n(int i) {
        this.f424Y = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public int m3828o() {
        return this.f408I + this.f414O;
    }

    /* renamed from: o */
    public void m3827o(int i) {
        this.f404E = i;
        int i2 = this.f404E;
        int i3 = this.f417R;
        if (i2 < i3) {
            this.f404E = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public int m3826p() {
        return this.f409J + this.f415P;
    }

    /* renamed from: p */
    public void m3825p(int i) {
        this.f420U = i;
    }

    /* renamed from: q */
    public EnumC0104b m3824q() {
        return this.f402C[1];
    }

    /* renamed from: q */
    public void m3823q(int i) {
        this.f419T = i;
    }

    /* renamed from: r */
    public int m3822r() {
        return this.f424Y;
    }

    /* renamed from: r */
    public void m3821r(int i) {
        this.f408I = i;
    }

    /* renamed from: s */
    public int m3820s() {
        if (this.f424Y == 8) {
            return 0;
        }
        return this.f404E;
    }

    /* renamed from: s */
    public void m3819s(int i) {
        this.f409J = i;
    }

    /* renamed from: t */
    public int m3818t() {
        return this.f420U;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f427a0 != null) {
            str = "type: " + this.f427a0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f425Z != null) {
            str2 = "id: " + this.f425Z + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f408I);
        sb.append(", ");
        sb.append(this.f409J);
        sb.append(") - (");
        sb.append(this.f404E);
        sb.append(" x ");
        sb.append(this.f405F);
        sb.append(") wrap: (");
        sb.append(this.f419T);
        sb.append(" x ");
        sb.append(this.f420U);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int m3816u() {
        return this.f419T;
    }

    /* renamed from: v */
    public int m3815v() {
        return this.f408I;
    }

    /* renamed from: w */
    public int m3814w() {
        return this.f409J;
    }

    /* renamed from: x */
    public boolean m3813x() {
        return this.f416Q > 0;
    }

    /* renamed from: y */
    public boolean m3812y() {
        return this.f453s.m3893d().f523b == 1 && this.f455u.m3893d().f523b == 1 && this.f454t.m3893d().f523b == 1 && this.f456v.m3893d().f523b == 1;
    }

    /* renamed from: z */
    public boolean m3811z() {
        C0097e eVar = this.f453s;
        C0097e eVar2 = eVar.f375d;
        if (eVar2 != null && eVar2.f375d == eVar) {
            return true;
        }
        C0097e eVar3 = this.f455u;
        C0097e eVar4 = eVar3.f375d;
        return eVar4 != null && eVar4.f375d == eVar3;
    }
}
