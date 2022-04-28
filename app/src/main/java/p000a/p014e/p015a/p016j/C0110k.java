package p000a.p014e.p015a.p016j;

import p000a.p014e.p015a.C0086e;

/* renamed from: a.e.a.j.k */
/* loaded from: classes.dex */
public class C0110k {

    /* renamed from: a */
    static boolean[] f509a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c6, code lost:
        r4.m3761a(r2, 1, r17.m3834l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cf, code lost:
        r4.m3762a(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r6 != false) goto L_0x012e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e9, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
        r3.m3761a(r1, 1, r17.m3832m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
        r7 = r17.m3820s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
        r3.m3762a(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c4, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3771a(int r16, p000a.p014e.p015a.p016j.C0102f r17) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.p016j.C0110k.m3771a(int, a.e.a.j.f):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3769a(C0102f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.f400A[i3].m3893d().f513f = fVar.m3836k().f453s.m3893d();
        fVar.f400A[i3].m3893d().f514g = i2;
        fVar.f400A[i3].m3893d().f523b = 1;
        fVar.f400A[i4].m3893d().f513f = fVar.f400A[i3].m3893d();
        fVar.f400A[i4].m3893d().f514g = fVar.m3851d(i);
        fVar.f400A[i4].m3893d().f523b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3767a(C0105g gVar, C0086e eVar, C0102f fVar) {
        if (gVar.f402C[0] != C0102f.EnumC0104b.WRAP_CONTENT && fVar.f402C[0] == C0102f.EnumC0104b.MATCH_PARENT) {
            int i = fVar.f453s.f376e;
            int s = gVar.m3820s() - fVar.f455u.f376e;
            C0097e eVar2 = fVar.f453s;
            eVar2.f380i = eVar.m3949a(eVar2);
            C0097e eVar3 = fVar.f455u;
            eVar3.f380i = eVar.m3949a(eVar3);
            eVar.m3955a(fVar.f453s.f380i, i);
            eVar.m3955a(fVar.f455u.f380i, s);
            fVar.f426a = 2;
            fVar.m3877a(i, s);
        }
        if (gVar.f402C[1] != C0102f.EnumC0104b.WRAP_CONTENT && fVar.f402C[1] == C0102f.EnumC0104b.MATCH_PARENT) {
            int i2 = fVar.f454t.f376e;
            int i3 = gVar.m3840i() - fVar.f456v.f376e;
            C0097e eVar4 = fVar.f454t;
            eVar4.f380i = eVar.m3949a(eVar4);
            C0097e eVar5 = fVar.f456v;
            eVar5.f380i = eVar.m3949a(eVar5);
            eVar.m3955a(fVar.f454t.f380i, i2);
            eVar.m3955a(fVar.f456v.f380i, i3);
            if (fVar.f416Q > 0 || fVar.m3822r() == 8) {
                C0097e eVar6 = fVar.f457w;
                eVar6.f380i = eVar.m3949a(eVar6);
                eVar.m3955a(fVar.f457w.f380i, fVar.f416Q + i2);
            }
            fVar.f428b = 2;
            fVar.m3847e(i2, i3);
        }
    }

    /* renamed from: a */
    private static boolean m3770a(C0102f fVar, int i) {
        C0102f.EnumC0104b[] bVarArr = fVar.f402C;
        if (bVarArr[i] != C0102f.EnumC0104b.MATCH_CONSTRAINT) {
            return false;
        }
        char c = 1;
        if (fVar.f406G != 0.0f) {
            if (i != 0) {
                c = 0;
            }
            C0102f.EnumC0104b bVar = bVarArr[c];
            C0102f.EnumC0104b bVar2 = C0102f.EnumC0104b.MATCH_CONSTRAINT;
            return false;
        }
        if (i == 0) {
            if (fVar.f434e != 0 || fVar.f440h != 0 || fVar.f442i != 0) {
                return false;
            }
        } else if (fVar.f436f != 0 || fVar.f445k != 0 || fVar.f446l != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r7.f435e0 == 2) goto L_0x0034;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r7.f437f0 == 2) goto L_0x0034;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0105 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m3768a(p000a.p014e.p015a.p016j.C0105g r24, p000a.p014e.p015a.C0086e r25, int r26, int r27, p000a.p014e.p015a.p016j.C0096d r28) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.p016j.C0110k.m3768a(a.e.a.j.g, a.e.a.e, int, int, a.e.a.j.d):boolean");
    }
}
