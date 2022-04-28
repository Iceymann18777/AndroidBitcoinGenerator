package p000a.p014e.p015a;

import java.util.Arrays;

/* renamed from: a.e.a.a */
/* loaded from: classes.dex */
public class C0082a {

    /* renamed from: b */
    private final C0083b f271b;

    /* renamed from: c */
    private final C0084c f272c;

    /* renamed from: f */
    private int[] f275f;

    /* renamed from: g */
    private int[] f276g;

    /* renamed from: h */
    private float[] f277h;

    /* renamed from: a */
    int f270a = 0;

    /* renamed from: d */
    private int f273d = 8;

    /* renamed from: e */
    private C0091i f274e = null;

    /* renamed from: i */
    private int f278i = -1;

    /* renamed from: j */
    private int f279j = -1;

    /* renamed from: k */
    private boolean f280k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0082a(C0083b bVar, C0084c cVar) {
        int i = this.f273d;
        this.f275f = new int[i];
        this.f276g = new int[i];
        this.f277h = new float[i];
        this.f271b = bVar;
        this.f272c = cVar;
    }

    /* renamed from: a */
    private boolean m3990a(C0091i iVar, C0086e eVar) {
        return iVar.f345j <= 1;
    }

    /* renamed from: a */
    public final float m3989a(C0091i iVar, boolean z) {
        if (this.f274e == iVar) {
            this.f274e = null;
        }
        int i = this.f278i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f270a) {
            if (this.f275f[i] == iVar.f337b) {
                if (i == this.f278i) {
                    this.f278i = this.f276g[i];
                } else {
                    int[] iArr = this.f276g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.m3921b(this.f271b);
                }
                iVar.f345j--;
                this.f270a--;
                this.f275f[i] = -1;
                if (this.f280k) {
                    this.f279j = i;
                }
                return this.f277h[i];
            }
            i = this.f276g[i];
            i2++;
            i3 = i;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0091i m3997a(int i) {
        int i2 = this.f278i;
        for (int i3 = 0; i2 != -1 && i3 < this.f270a; i3++) {
            if (i3 == i) {
                return this.f272c.f288c[this.f275f[i2]];
            }
            i2 = this.f276g[i2];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000a.p014e.p015a.C0091i m3994a(p000a.p014e.p015a.C0086e r15) {
        /*
            r14 = this;
            int r0 = r14.f278i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x0089
            int r9 = r14.f270a
            if (r2 >= r9) goto L_0x0089
            float[] r9 = r14.f277h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            a.e.a.c r12 = r14.f272c
            a.e.a.i[] r12 = r12.f288c
            int[] r13 = r14.f275f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0030
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x003c
            r9[r0] = r3
            goto L_0x0036
        L_0x0030:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x003c
            r9[r0] = r3
        L_0x0036:
            a.e.a.b r9 = r14.f271b
            r12.m3921b(r9)
            r10 = 0
        L_0x003c:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0082
            a.e.a.i$a r11 = r12.f342g
            a.e.a.i$a r13 = p000a.p014e.p015a.C0091i.EnumC0092a.UNRESTRICTED
            if (r11 != r13) goto L_0x0062
            if (r4 != 0) goto L_0x0051
        L_0x0049:
            boolean r4 = r14.m3990a(r12, r15)
            r6 = r4
            r5 = r10
            r4 = r12
            goto L_0x0082
        L_0x0051:
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0056
            goto L_0x0049
        L_0x0056:
            if (r6 != 0) goto L_0x0082
            boolean r11 = r14.m3990a(r12, r15)
            if (r11 == 0) goto L_0x0082
            r5 = r10
            r4 = r12
            r6 = 1
            goto L_0x0082
        L_0x0062:
            if (r4 != 0) goto L_0x0082
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0082
            if (r1 != 0) goto L_0x0072
        L_0x006a:
            boolean r1 = r14.m3990a(r12, r15)
            r8 = r1
            r7 = r10
            r1 = r12
            goto L_0x0082
        L_0x0072:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0077
            goto L_0x006a
        L_0x0077:
            if (r8 != 0) goto L_0x0082
            boolean r11 = r14.m3990a(r12, r15)
            if (r11 == 0) goto L_0x0082
            r7 = r10
            r1 = r12
            r8 = 1
        L_0x0082:
            int[] r9 = r14.f276g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0089:
            if (r4 == 0) goto L_0x008c
            return r4
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.C0082a.m3994a(a.e.a.e):a.e.a.i");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0091i m3988a(boolean[] zArr, C0091i iVar) {
        C0091i.EnumC0092a aVar;
        int i = this.f278i;
        C0091i iVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
            if (this.f277h[i] < 0.0f) {
                C0091i iVar3 = this.f272c.f288c[this.f275f[i]];
                if ((zArr == null || !zArr[iVar3.f337b]) && iVar3 != iVar && ((aVar = iVar3.f342g) == C0091i.EnumC0092a.SLACK || aVar == C0091i.EnumC0092a.ERROR)) {
                    float f2 = this.f277h[i];
                    if (f2 < f) {
                        iVar2 = iVar3;
                        f = f2;
                    }
                }
            }
            i = this.f276g[i];
        }
        return iVar2;
    }

    /* renamed from: a */
    public final void m3999a() {
        int i = this.f278i;
        for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
            C0091i iVar = this.f272c.f288c[this.f275f[i]];
            if (iVar != null) {
                iVar.m3921b(this.f271b);
            }
            i = this.f276g[i];
        }
        this.f278i = -1;
        this.f279j = -1;
        this.f280k = false;
        this.f270a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3998a(float f) {
        int i = this.f278i;
        for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
            float[] fArr = this.f277h;
            fArr[i] = fArr[i] / f;
            i = this.f276g[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3996a(C0083b bVar, C0083b bVar2, boolean z) {
        int i = this.f278i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
                int i3 = this.f275f[i];
                C0091i iVar = bVar2.f281a;
                if (i3 == iVar.f337b) {
                    float f = this.f277h[i];
                    m3989a(iVar, z);
                    C0082a aVar = bVar2.f284d;
                    int i4 = aVar.f278i;
                    for (int i5 = 0; i4 != -1 && i5 < aVar.f270a; i5++) {
                        m3991a(this.f272c.f288c[aVar.f275f[i4]], aVar.f277h[i4] * f, z);
                        i4 = aVar.f276g[i4];
                    }
                    bVar.f282b += bVar2.f282b * f;
                    if (z) {
                        bVar2.f281a.m3921b(bVar);
                    }
                    i = this.f278i;
                } else {
                    i = this.f276g[i];
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3995a(C0083b bVar, C0083b[] bVarArr) {
        int i = this.f278i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
                C0091i iVar = this.f272c.f288c[this.f275f[i]];
                if (iVar.f338c != -1) {
                    float f = this.f277h[i];
                    m3989a(iVar, true);
                    C0083b bVar2 = bVarArr[iVar.f338c];
                    if (!bVar2.f285e) {
                        C0082a aVar = bVar2.f284d;
                        int i3 = aVar.f278i;
                        for (int i4 = 0; i3 != -1 && i4 < aVar.f270a; i4++) {
                            m3991a(this.f272c.f288c[aVar.f275f[i3]], aVar.f277h[i3] * f, true);
                            i3 = aVar.f276g[i3];
                        }
                    }
                    bVar.f282b += bVar2.f282b * f;
                    bVar2.f281a.m3921b(bVar);
                    i = this.f278i;
                } else {
                    i = this.f276g[i];
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void m3992a(C0091i iVar, float f) {
        if (f == 0.0f) {
            m3989a(iVar, true);
            return;
        }
        int i = this.f278i;
        if (i == -1) {
            this.f278i = 0;
            float[] fArr = this.f277h;
            int i2 = this.f278i;
            fArr[i2] = f;
            this.f275f[i2] = iVar.f337b;
            this.f276g[i2] = -1;
            iVar.f345j++;
            iVar.m3924a(this.f271b);
            this.f270a++;
            if (!this.f280k) {
                this.f279j++;
                int i3 = this.f279j;
                int[] iArr = this.f275f;
                if (i3 >= iArr.length) {
                    this.f280k = true;
                    this.f279j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i != -1 && i5 < this.f270a; i5++) {
            int[] iArr2 = this.f275f;
            int i6 = iArr2[i];
            int i7 = iVar.f337b;
            if (i6 == i7) {
                this.f277h[i] = f;
                return;
            }
            if (iArr2[i] < i7) {
                i4 = i;
            }
            i = this.f276g[i];
        }
        int i8 = this.f279j;
        i8++;
        if (this.f280k) {
            int[] iArr3 = this.f275f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        }
        int[] iArr4 = this.f275f;
        if (i8 >= iArr4.length && this.f270a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f275f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i8 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f275f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            this.f273d *= 2;
            this.f280k = false;
            this.f279j = i8 - 1;
            this.f277h = Arrays.copyOf(this.f277h, this.f273d);
            this.f275f = Arrays.copyOf(this.f275f, this.f273d);
            this.f276g = Arrays.copyOf(this.f276g, this.f273d);
        }
        this.f275f[i8] = iVar.f337b;
        this.f277h[i8] = f;
        int[] iArr7 = this.f276g;
        if (i4 != -1) {
            iArr7[i8] = iArr7[i4];
            iArr7[i4] = i8;
        } else {
            iArr7[i8] = this.f278i;
            this.f278i = i8;
        }
        iVar.f345j++;
        iVar.m3924a(this.f271b);
        this.f270a++;
        if (!this.f280k) {
            this.f279j++;
        }
        if (this.f270a >= this.f275f.length) {
            this.f280k = true;
        }
        int i10 = this.f279j;
        int[] iArr8 = this.f275f;
        if (i10 >= iArr8.length) {
            this.f280k = true;
            this.f279j = iArr8.length - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3991a(C0091i iVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f278i;
            if (i == -1) {
                this.f278i = 0;
                float[] fArr = this.f277h;
                int i2 = this.f278i;
                fArr[i2] = f;
                this.f275f[i2] = iVar.f337b;
                this.f276g[i2] = -1;
                iVar.f345j++;
                iVar.m3924a(this.f271b);
                this.f270a++;
                if (!this.f280k) {
                    this.f279j++;
                    int i3 = this.f279j;
                    int[] iArr = this.f275f;
                    if (i3 >= iArr.length) {
                        this.f280k = true;
                        this.f279j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i != -1 && i5 < this.f270a; i5++) {
                int[] iArr2 = this.f275f;
                int i6 = iArr2[i];
                int i7 = iVar.f337b;
                if (i6 == i7) {
                    float[] fArr2 = this.f277h;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f278i) {
                            this.f278i = this.f276g[i];
                        } else {
                            int[] iArr3 = this.f276g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.m3921b(this.f271b);
                        }
                        if (this.f280k) {
                            this.f279j = i;
                        }
                        iVar.f345j--;
                        this.f270a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i7) {
                    i4 = i;
                }
                i = this.f276g[i];
            }
            int i8 = this.f279j;
            i8++;
            if (this.f280k) {
                int[] iArr4 = this.f275f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            }
            int[] iArr5 = this.f275f;
            if (i8 >= iArr5.length && this.f270a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f275f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i8 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f275f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                this.f273d *= 2;
                this.f280k = false;
                this.f279j = i8 - 1;
                this.f277h = Arrays.copyOf(this.f277h, this.f273d);
                this.f275f = Arrays.copyOf(this.f275f, this.f273d);
                this.f276g = Arrays.copyOf(this.f276g, this.f273d);
            }
            this.f275f[i8] = iVar.f337b;
            this.f277h[i8] = f;
            int[] iArr8 = this.f276g;
            if (i4 != -1) {
                iArr8[i8] = iArr8[i4];
                iArr8[i4] = i8;
            } else {
                iArr8[i8] = this.f278i;
                this.f278i = i8;
            }
            iVar.f345j++;
            iVar.m3924a(this.f271b);
            this.f270a++;
            if (!this.f280k) {
                this.f279j++;
            }
            int i10 = this.f279j;
            int[] iArr9 = this.f275f;
            if (i10 >= iArr9.length) {
                this.f280k = true;
                this.f279j = iArr9.length - 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3993a(C0091i iVar) {
        int i = this.f278i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
            if (this.f275f[i] == iVar.f337b) {
                return true;
            }
            i = this.f276g[i];
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final float m3986b(int i) {
        int i2 = this.f278i;
        for (int i3 = 0; i2 != -1 && i3 < this.f270a; i3++) {
            if (i3 == i) {
                return this.f277h[i2];
            }
            i2 = this.f276g[i2];
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float m3985b(C0091i iVar) {
        int i = this.f278i;
        for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
            if (this.f275f[i] == iVar.f337b) {
                return this.f277h[i];
            }
            i = this.f276g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3987b() {
        int i = this.f278i;
        for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
            float[] fArr = this.f277h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f276g[i];
        }
    }

    public String toString() {
        int i = this.f278i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f270a; i2++) {
            str = ((str + " -> ") + this.f277h[i] + " : ") + this.f272c.f288c[this.f275f[i]];
            i = this.f276g[i];
        }
        return str;
    }
}
