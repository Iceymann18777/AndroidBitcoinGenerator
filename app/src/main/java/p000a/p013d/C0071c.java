package p000a.p013d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.d.c */
/* loaded from: classes.dex */
public class C0071c {

    /* renamed from: a */
    static final int[] f227a = new int[0];

    /* renamed from: b */
    static final long[] f228b = new long[0];

    /* renamed from: c */
    static final Object[] f229c = new Object[0];

    /* renamed from: a */
    public static int m4068a(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m4066a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ (-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m4065a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    public static boolean m4067a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m4064b(int i) {
        return m4068a(i * 4) / 4;
    }

    /* renamed from: c */
    public static int m4063c(int i) {
        return m4068a(i * 8) / 8;
    }
}
