package p050b.p051a.p052a.p053a.p059n;

/* renamed from: b.a.a.a.n.a */
/* loaded from: classes.dex */
public final class C0905a {
    /* renamed from: a */
    public static float m405a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: a */
    public static float m404a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: a */
    public static float m403a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m402b(m404a(f, f2, f3, f4), m404a(f, f2, f5, f4), m404a(f, f2, f5, f6), m404a(f, f2, f3, f6));
    }

    /* renamed from: b */
    private static float m402b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
