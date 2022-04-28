package p000a.p014e.p015a;

import java.util.Arrays;

/* renamed from: a.e.a.i */
/* loaded from: classes.dex */
public class C0091i {

    /* renamed from: k */
    private static int f335k = 1;

    /* renamed from: a */
    private String f336a;

    /* renamed from: e */
    public float f340e;

    /* renamed from: g */
    EnumC0092a f342g;

    /* renamed from: b */
    public int f337b = -1;

    /* renamed from: c */
    int f338c = -1;

    /* renamed from: d */
    public int f339d = 0;

    /* renamed from: f */
    float[] f341f = new float[7];

    /* renamed from: h */
    C0083b[] f343h = new C0083b[8];

    /* renamed from: i */
    int f344i = 0;

    /* renamed from: j */
    public int f345j = 0;

    /* renamed from: a.e.a.i$a */
    /* loaded from: classes.dex */
    public enum EnumC0092a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0091i(EnumC0092a aVar, String str) {
        this.f342g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m3922b() {
        f335k++;
    }

    /* renamed from: a */
    public void m3925a() {
        this.f336a = null;
        this.f342g = EnumC0092a.UNKNOWN;
        this.f339d = 0;
        this.f337b = -1;
        this.f338c = -1;
        this.f340e = 0.0f;
        this.f344i = 0;
        this.f345j = 0;
    }

    /* renamed from: a */
    public final void m3924a(C0083b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f344i;
            if (i >= i2) {
                C0083b[] bVarArr = this.f343h;
                if (i2 >= bVarArr.length) {
                    this.f343h = (C0083b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0083b[] bVarArr2 = this.f343h;
                int i3 = this.f344i;
                bVarArr2[i3] = bVar;
                this.f344i = i3 + 1;
                return;
            } else if (this.f343h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m3923a(EnumC0092a aVar, String str) {
        this.f342g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r1 >= ((r0 - r2) - 1)) goto L_0x001f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        r6 = r5.f343h;
        r3 = r2 + r1;
        r6[r3] = r6[r3 + 1];
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        r5.f344i--;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3921b(p000a.p014e.p015a.C0083b r6) {
        /*
            r5 = this;
            int r0 = r5.f344i
            r1 = 0
            r2 = 0
        L_0x0004:
            if (r2 >= r0) goto L_0x0029
            a.e.a.b[] r3 = r5.f343h
            r3 = r3[r2]
            if (r3 != r6) goto L_0x0026
        L_0x000c:
            int r6 = r0 - r2
            int r6 = r6 + (-1)
            if (r1 >= r6) goto L_0x001f
            a.e.a.b[] r6 = r5.f343h
            int r3 = r2 + r1
            int r4 = r3 + 1
            r4 = r6[r4]
            r6[r3] = r4
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001f:
            int r6 = r5.f344i
            int r6 = r6 + (-1)
            r5.f344i = r6
            return
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.C0091i.m3921b(a.e.a.b):void");
    }

    /* renamed from: c */
    public final void m3920c(C0083b bVar) {
        int i = this.f344i;
        for (int i2 = 0; i2 < i; i2++) {
            C0083b[] bVarArr = this.f343h;
            bVarArr[i2].f284d.m3996a(bVarArr[i2], bVar, false);
        }
        this.f344i = 0;
    }

    public String toString() {
        return "" + this.f336a;
    }
}
