package p000a.p014e.p015a.p016j;

import java.util.Arrays;

/* renamed from: a.e.a.j.j */
/* loaded from: classes.dex */
public class C0109j extends C0102f {

    /* renamed from: k0 */
    protected C0102f[] f507k0 = new C0102f[4];

    /* renamed from: l0 */
    protected int f508l0 = 0;

    /* renamed from: J */
    public void m3773J() {
        this.f508l0 = 0;
    }

    /* renamed from: b */
    public void m3772b(C0102f fVar) {
        int i = this.f508l0 + 1;
        C0102f[] fVarArr = this.f507k0;
        if (i > fVarArr.length) {
            this.f507k0 = (C0102f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        C0102f[] fVarArr2 = this.f507k0;
        int i2 = this.f508l0;
        fVarArr2[i2] = fVar;
        this.f508l0 = i2 + 1;
    }
}
