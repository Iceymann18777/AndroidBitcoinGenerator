package p000a.p014e.p015a.p016j;

import p000a.p014e.p015a.C0084c;
import p000a.p014e.p015a.C0091i;

/* renamed from: a.e.a.j.e */
/* loaded from: classes.dex */
public class C0097e {

    /* renamed from: b */
    final C0102f f373b;

    /* renamed from: c */
    final EnumC0101d f374c;

    /* renamed from: d */
    C0097e f375d;

    /* renamed from: i */
    C0091i f380i;

    /* renamed from: a */
    private C0112m f372a = new C0112m(this);

    /* renamed from: e */
    public int f376e = 0;

    /* renamed from: f */
    int f377f = -1;

    /* renamed from: g */
    private EnumC0100c f378g = EnumC0100c.NONE;

    /* renamed from: h */
    private int f379h = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a.j.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0098a {

        /* renamed from: a */
        static final /* synthetic */ int[] f381a = new int[EnumC0101d.values().length];

        static {
            try {
                f381a[EnumC0101d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f381a[EnumC0101d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f381a[EnumC0101d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f381a[EnumC0101d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f381a[EnumC0101d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f381a[EnumC0101d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f381a[EnumC0101d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f381a[EnumC0101d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f381a[EnumC0101d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: a.e.a.j.e$b */
    /* loaded from: classes.dex */
    public enum EnumC0099b {
        RELAXED,
        STRICT
    }

    /* renamed from: a.e.a.j.e$c */
    /* loaded from: classes.dex */
    public enum EnumC0100c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: a.e.a.j.e$d */
    /* loaded from: classes.dex */
    public enum EnumC0101d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0097e(C0102f fVar, EnumC0101d dVar) {
        EnumC0099b bVar = EnumC0099b.RELAXED;
        this.f373b = fVar;
        this.f374c = dVar;
    }

    /* renamed from: a */
    public int m3900a() {
        return this.f379h;
    }

    /* renamed from: a */
    public void m3899a(C0084c cVar) {
        C0091i iVar = this.f380i;
        if (iVar == null) {
            this.f380i = new C0091i(C0091i.EnumC0092a.UNRESTRICTED, null);
        } else {
            iVar.m3925a();
        }
    }

    /* renamed from: a */
    public boolean m3898a(C0097e eVar) {
        if (eVar == null) {
            return false;
        }
        EnumC0101d h = eVar.m3889h();
        EnumC0101d dVar = this.f374c;
        if (h == dVar) {
            return dVar != EnumC0101d.BASELINE || (eVar.m3894c().m3813x() && m3894c().m3813x());
        }
        switch (C0098a.f381a[dVar.ordinal()]) {
            case 1:
                return (h == EnumC0101d.BASELINE || h == EnumC0101d.CENTER_X || h == EnumC0101d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = h == EnumC0101d.LEFT || h == EnumC0101d.RIGHT;
                return eVar.m3894c() instanceof C0107i ? z || h == EnumC0101d.CENTER_X : z;
            case 4:
            case 5:
                boolean z2 = h == EnumC0101d.TOP || h == EnumC0101d.BOTTOM;
                return eVar.m3894c() instanceof C0107i ? z2 || h == EnumC0101d.CENTER_Y : z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f374c.name());
        }
    }

    /* renamed from: a */
    public boolean m3897a(C0097e eVar, int i, int i2, EnumC0100c cVar, int i3, boolean z) {
        if (eVar == null) {
            this.f375d = null;
            this.f376e = 0;
            this.f377f = -1;
            this.f378g = EnumC0100c.NONE;
            this.f379h = 2;
            return true;
        } else if (!z && !m3898a(eVar)) {
            return false;
        } else {
            this.f375d = eVar;
            if (i > 0) {
                this.f376e = i;
            } else {
                this.f376e = 0;
            }
            this.f377f = i2;
            this.f378g = cVar;
            this.f379h = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean m3896a(C0097e eVar, int i, EnumC0100c cVar, int i2) {
        return m3897a(eVar, i, -1, cVar, i2, false);
    }

    /* renamed from: b */
    public int m3895b() {
        C0097e eVar;
        if (this.f373b.m3822r() == 8) {
            return 0;
        }
        return (this.f377f <= -1 || (eVar = this.f375d) == null || eVar.f373b.m3822r() != 8) ? this.f376e : this.f377f;
    }

    /* renamed from: c */
    public C0102f m3894c() {
        return this.f373b;
    }

    /* renamed from: d */
    public C0112m m3893d() {
        return this.f372a;
    }

    /* renamed from: e */
    public C0091i m3892e() {
        return this.f380i;
    }

    /* renamed from: f */
    public EnumC0100c m3891f() {
        return this.f378g;
    }

    /* renamed from: g */
    public C0097e m3890g() {
        return this.f375d;
    }

    /* renamed from: h */
    public EnumC0101d m3889h() {
        return this.f374c;
    }

    /* renamed from: i */
    public boolean m3888i() {
        return this.f375d != null;
    }

    /* renamed from: j */
    public void m3887j() {
        this.f375d = null;
        this.f376e = 0;
        this.f377f = -1;
        this.f378g = EnumC0100c.STRONG;
        this.f379h = 0;
        EnumC0099b bVar = EnumC0099b.RELAXED;
        this.f372a.mo3749d();
    }

    public String toString() {
        return this.f373b.m3846f() + ":" + this.f374c.toString();
    }
}
