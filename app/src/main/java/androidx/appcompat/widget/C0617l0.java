package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
class C0617l0 {

    /* renamed from: a */
    private int f2199a = 0;

    /* renamed from: b */
    private int f2200b = 0;

    /* renamed from: c */
    private int f2201c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2202d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2203e = 0;

    /* renamed from: f */
    private int f2204f = 0;

    /* renamed from: g */
    private boolean f2205g = false;

    /* renamed from: h */
    private boolean f2206h = false;

    /* renamed from: a */
    public int m1971a() {
        return this.f2205g ? this.f2199a : this.f2200b;
    }

    /* renamed from: a */
    public void m1970a(int i, int i2) {
        this.f2206h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2203e = i;
            this.f2199a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2204f = i2;
            this.f2200b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1969a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f2205g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f2205g = r2
            boolean r0 = r1.f2206h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f2202d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f2203e
        L_0x0016:
            r1.f2199a = r2
            int r2 = r1.f2201c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f2201c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f2203e
        L_0x0024:
            r1.f2199a = r2
            int r2 = r1.f2202d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f2203e
            r1.f2199a = r2
        L_0x002f:
            int r2 = r1.f2204f
        L_0x0031:
            r1.f2200b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0617l0.m1969a(boolean):void");
    }

    /* renamed from: b */
    public int m1968b() {
        return this.f2199a;
    }

    /* renamed from: b */
    public void m1967b(int i, int i2) {
        this.f2201c = i;
        this.f2202d = i2;
        this.f2206h = true;
        if (this.f2205g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2199a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2200b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2199a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2200b = i2;
        }
    }

    /* renamed from: c */
    public int m1966c() {
        return this.f2200b;
    }

    /* renamed from: d */
    public int m1965d() {
        return this.f2205g ? this.f2200b : this.f2199a;
    }
}
