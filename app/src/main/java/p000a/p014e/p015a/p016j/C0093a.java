package p000a.p014e.p015a.p016j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.e.a.j.a */
/* loaded from: classes.dex */
public class C0093a {
    /* renamed from: a */
    private static int m3918a(C0102f fVar) {
        if (fVar.m3838j() == C0102f.EnumC0104b.MATCH_CONSTRAINT) {
            int i = (int) (fVar.f407H == 0 ? fVar.m3840i() * fVar.f406G : fVar.m3840i() / fVar.f406G);
            fVar.m3827o(i);
            return i;
        } else if (fVar.m3824q() != C0102f.EnumC0104b.MATCH_CONSTRAINT) {
            return -1;
        } else {
            int s = (int) (fVar.f407H == 1 ? fVar.m3820s() * fVar.f406G : fVar.m3820s() / fVar.f406G);
            fVar.m3843g(s);
            return s;
        }
    }

    /* renamed from: a */
    private static int m3917a(C0102f fVar, int i) {
        C0097e eVar;
        int i2 = i * 2;
        C0097e[] eVarArr = fVar.f400A;
        C0097e eVar2 = eVarArr[i2];
        C0097e eVar3 = eVarArr[i2 + 1];
        C0097e eVar4 = eVar2.f375d;
        if (eVar4 == null) {
            return 0;
        }
        C0102f fVar2 = eVar4.f373b;
        C0102f fVar3 = fVar.f403D;
        if (fVar2 != fVar3 || (eVar = eVar3.f375d) == null || eVar.f373b != fVar3) {
            return 0;
        }
        return (int) ((((fVar3.m3851d(i) - eVar2.m3895b()) - eVar3.m3895b()) - fVar.m3851d(i)) * (i == 0 ? fVar.f421V : fVar.f422W));
    }

    /* renamed from: a */
    private static int m3915a(C0102f fVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int s;
        int i9;
        int i10;
        int i11 = 0;
        if (!fVar.f429b0) {
            return 0;
        }
        boolean z2 = fVar.f457w.f375d != null && i == 1;
        if (z) {
            i6 = fVar.m3857c();
            i5 = fVar.m3840i() - fVar.m3857c();
            i4 = i * 2;
            i3 = i4 + 1;
        } else {
            i6 = fVar.m3840i() - fVar.m3857c();
            i5 = fVar.m3857c();
            i3 = i * 2;
            i4 = i3 + 1;
        }
        C0097e[] eVarArr = fVar.f400A;
        if (eVarArr[i3].f375d == null || eVarArr[i4].f375d != null) {
            i7 = i3;
            i8 = 1;
        } else {
            i7 = i4;
            i4 = i3;
            i8 = -1;
        }
        int i12 = z2 ? i2 - i6 : i2;
        int b = (fVar.f400A[i4].m3895b() * i8) + m3917a(fVar, i);
        int i13 = i12 + b;
        int s2 = (i == 0 ? fVar.m3820s() : fVar.m3840i()) * i8;
        Iterator<C0114o> it = fVar.f400A[i4].m3893d().f522a.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, m3915a(((C0112m) it.next()).f510c.f373b, i, z, i13));
        }
        int i14 = 0;
        for (Iterator<C0114o> it2 = fVar.f400A[i7].m3893d().f522a.iterator(); it2.hasNext(); it2 = it2) {
            i14 = Math.max(i14, m3915a(((C0112m) it2.next()).f510c.f373b, i, z, s2 + i13));
        }
        if (z2) {
            i11 -= i6;
            s = i14 + i5;
        } else {
            s = i14 + ((i == 0 ? fVar.m3820s() : fVar.m3840i()) * i8);
        }
        int i15 = 1;
        if (i == 1) {
            Iterator<C0114o> it3 = fVar.f457w.m3893d().f522a.iterator();
            int i16 = 0;
            while (it3.hasNext()) {
                C0112m mVar = (C0112m) it3.next();
                if (i8 == i15) {
                    i16 = Math.max(i16, m3915a(mVar.f510c.f373b, i, z, i6 + i13));
                    i7 = i7;
                } else {
                    i7 = i7;
                    i16 = Math.max(i16, m3915a(mVar.f510c.f373b, i, z, (i5 * i8) + i13));
                }
                it3 = it3;
                i15 = 1;
            }
            i9 = i7;
            i10 = (fVar.f457w.m3893d().f522a.size() <= 0 || z2) ? i16 : i8 == 1 ? i16 + i6 : i16 - i5;
        } else {
            i9 = i7;
            i10 = 0;
        }
        int max = b + Math.max(i11, Math.max(s, i10));
        int i17 = i13 + s2;
        if (i8 != -1) {
            i13 = i17;
            i17 = i13;
        }
        if (z) {
            C0110k.m3769a(fVar, i, i17);
            fVar.m3876a(i17, i13, i);
        } else {
            fVar.f450p.m3788a(fVar, i);
            fVar.m3850d(i17, i);
        }
        if (fVar.m3855c(i) == C0102f.EnumC0104b.MATCH_CONSTRAINT && fVar.f406G != 0.0f) {
            fVar.f450p.m3788a(fVar, i);
        }
        C0097e[] eVarArr2 = fVar.f400A;
        if (!(eVarArr2[i4].f375d == null || eVarArr2[i9].f375d == null)) {
            C0102f k = fVar.m3836k();
            C0097e[] eVarArr3 = fVar.f400A;
            if (eVarArr3[i4].f375d.f373b == k && eVarArr3[i9].f375d.f373b == k) {
                fVar.f450p.m3788a(fVar, i);
            }
        }
        return max;
    }

    /* renamed from: a */
    private static int m3910a(C0106h hVar, int i) {
        int i2 = i * 2;
        List<C0102f> a = hVar.m3790a(i);
        int size = a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0102f fVar = a.get(i4);
            C0097e[] eVarArr = fVar.f400A;
            int i5 = i2 + 1;
            i3 = Math.max(i3, m3915a(fVar, i, eVarArr[i5].f375d == null || !(eVarArr[i2].f375d == null || eVarArr[i5].f375d == null), 0));
        }
        hVar.f493e[i] = i3;
        return i3;
    }

    /* renamed from: a */
    private static void m3919a(C0097e eVar) {
        C0112m d = eVar.m3893d();
        C0097e eVar2 = eVar.f375d;
        if (eVar2 != null && eVar2.f375d != eVar) {
            eVar2.m3893d().m3752a(d);
        }
    }

    /* renamed from: a */
    private static void m3916a(C0102f fVar, int i, int i2) {
        int i3 = i * 2;
        C0097e[] eVarArr = fVar.f400A;
        C0097e eVar = eVarArr[i3];
        C0097e eVar2 = eVarArr[i3 + 1];
        if ((eVar.f375d == null || eVar2.f375d == null) ? false : true) {
            C0110k.m3769a(fVar, i, m3917a(fVar, i) + eVar.m3895b());
        } else if (fVar.f406G == 0.0f || fVar.m3855c(i) != C0102f.EnumC0104b.MATCH_CONSTRAINT) {
            int e = i2 - fVar.m3848e(i);
            int d = e - fVar.m3851d(i);
            fVar.m3876a(d, e, i);
            C0110k.m3769a(fVar, i, d);
        } else {
            int a = m3918a(fVar);
            int i4 = (int) fVar.f400A[i3].m3893d().f514g;
            eVar2.m3893d().f513f = eVar.m3893d();
            eVar2.m3893d().f514g = a;
            eVar2.m3893d().f523b = 1;
            fVar.m3876a(i4, i4 + a, i);
        }
    }

    /* renamed from: a */
    public static void m3912a(C0105g gVar) {
        if ((gVar.m3810M() & 32) != 32) {
            m3908b(gVar);
            return;
        }
        gVar.f471D0 = true;
        gVar.f486x0 = false;
        gVar.f487y0 = false;
        gVar.f488z0 = false;
        ArrayList<C0102f> arrayList = gVar.f534k0;
        List<C0106h> list = gVar.f485w0;
        boolean z = gVar.m3838j() == C0102f.EnumC0104b.WRAP_CONTENT;
        boolean z2 = gVar.m3824q() == C0102f.EnumC0104b.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C0102f fVar : arrayList) {
            fVar.f450p = null;
            fVar.f433d0 = false;
            fVar.mo3882F();
        }
        for (C0102f fVar2 : arrayList) {
            if (fVar2.f450p == null && !m3913a(fVar2, list, z3)) {
                m3908b(gVar);
                gVar.f471D0 = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (C0106h hVar : list) {
            i = Math.max(i, m3910a(hVar, 0));
            i2 = Math.max(i2, m3910a(hVar, 1));
        }
        if (z) {
            gVar.m3871a(C0102f.EnumC0104b.FIXED);
            gVar.m3827o(i);
            gVar.f486x0 = true;
            gVar.f487y0 = true;
            gVar.f468A0 = i;
        }
        if (z2) {
            gVar.m3860b(C0102f.EnumC0104b.FIXED);
            gVar.m3843g(i2);
            gVar.f486x0 = true;
            gVar.f488z0 = true;
            gVar.f469B0 = i2;
        }
        m3909a(list, 0, gVar.m3820s());
        m3909a(list, 1, gVar.m3840i());
    }

    /* renamed from: a */
    private static void m3911a(C0105g gVar, C0102f fVar, C0106h hVar) {
        hVar.f492d = false;
        gVar.f471D0 = false;
        fVar.f429b0 = false;
    }

    /* renamed from: a */
    public static void m3909a(List<C0106h> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C0102f fVar : list.get(i3).m3785b(i)) {
                if (fVar.f429b0) {
                    m3916a(fVar, i, i2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0181, code lost:
        if (r3.f373b == r4) goto L_0x0183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0128, code lost:
        if (r3.f373b == r4) goto L_0x012a;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m3914a(p000a.p014e.p015a.p016j.C0102f r8, p000a.p014e.p015a.p016j.C0106h r9, java.util.List<p000a.p014e.p015a.p016j.C0106h> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.p016j.C0093a.m3914a(a.e.a.j.f, a.e.a.j.h, java.util.List, boolean):boolean");
    }

    /* renamed from: a */
    private static boolean m3913a(C0102f fVar, List<C0106h> list, boolean z) {
        C0106h hVar = new C0106h(new ArrayList(), true);
        list.add(hVar);
        return m3914a(fVar, hVar, list, z);
    }

    /* renamed from: b */
    private static void m3908b(C0105g gVar) {
        gVar.f485w0.clear();
        gVar.f485w0.add(0, new C0106h(gVar.f534k0));
    }
}
