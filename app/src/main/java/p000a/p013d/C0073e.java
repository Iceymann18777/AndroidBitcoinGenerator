package p000a.p013d;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: a.d.e */
/* loaded from: classes.dex */
public class C0073e<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f235a;

    /* renamed from: b */
    private int f236b;

    /* renamed from: c */
    private int f237c;

    /* renamed from: d */
    private int f238d;

    /* renamed from: e */
    private int f239e;

    /* renamed from: f */
    private int f240f;

    /* renamed from: g */
    private int f241g;

    /* renamed from: h */
    private int f242h;

    public C0073e(int i) {
        if (i > 0) {
            this.f237c = i;
            this.f235a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: c */
    private int m4044c(K k, V v) {
        int b = m4045b(k, v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V m4049a(K k) {
        return null;
    }

    /* renamed from: a */
    public final V m4048a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f238d++;
            this.f236b += m4044c(k, v);
            put = this.f235a.put(k, v);
            if (put != null) {
                this.f236b -= m4044c(k, put);
            }
        }
        if (put != null) {
            m4047a(false, k, put, v);
        }
        m4050a(this.f237c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4050a(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f236b     // Catch: all -> 0x0071
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f235a     // Catch: all -> 0x0071
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0071
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f236b     // Catch: all -> 0x0071
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f236b     // Catch: all -> 0x0071
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f235a     // Catch: all -> 0x0071
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0071
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f235a     // Catch: all -> 0x0071
            java.util.Set r0 = r0.entrySet()     // Catch: all -> 0x0071
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0071
            java.lang.Object r0 = r0.next()     // Catch: all -> 0x0071
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: all -> 0x0071
            java.lang.Object r1 = r0.getKey()     // Catch: all -> 0x0071
            java.lang.Object r0 = r0.getValue()     // Catch: all -> 0x0071
            java.util.LinkedHashMap<K, V> r2 = r4.f235a     // Catch: all -> 0x0071
            r2.remove(r1)     // Catch: all -> 0x0071
            int r2 = r4.f236b     // Catch: all -> 0x0071
            int r3 = r4.m4044c(r1, r0)     // Catch: all -> 0x0071
            int r2 = r2 - r3
            r4.f236b = r2     // Catch: all -> 0x0071
            int r2 = r4.f240f     // Catch: all -> 0x0071
            r3 = 1
            int r2 = r2 + r3
            r4.f240f = r2     // Catch: all -> 0x0071
            monitor-exit(r4)     // Catch: all -> 0x0071
            r2 = 0
            r4.m4047a(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch: all -> 0x0071
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: all -> 0x0071
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0071
            r0.<init>()     // Catch: all -> 0x0071
            java.lang.Class r1 = r4.getClass()     // Catch: all -> 0x0071
            java.lang.String r1 = r1.getName()     // Catch: all -> 0x0071
            r0.append(r1)     // Catch: all -> 0x0071
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: all -> 0x0071
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x0071
            r5.<init>(r0)     // Catch: all -> 0x0071
            throw r5     // Catch: all -> 0x0071
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch: all -> 0x0071
            goto L_0x0075
        L_0x0074:
            throw r5
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p013d.C0073e.m4050a(int):void");
    }

    /* renamed from: a */
    protected void m4047a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: b */
    protected int m4045b(K k, V v) {
        return 1;
    }

    /* renamed from: b */
    public final V m4046b(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.f235a.get(k);
                if (v != null) {
                    this.f241g++;
                    return v;
                }
                this.f242h++;
                V a = m4049a((C0073e<K, V>) k);
                if (a == null) {
                    return null;
                }
                synchronized (this) {
                    this.f239e++;
                    put = this.f235a.put(k, a);
                    if (put != null) {
                        this.f235a.put(k, put);
                    } else {
                        this.f236b += m4044c(k, a);
                    }
                }
                if (put != null) {
                    m4047a(false, k, a, put);
                    return put;
                }
                m4050a(this.f237c);
                return a;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i;
        i = this.f241g + this.f242h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f237c), Integer.valueOf(this.f241g), Integer.valueOf(this.f242h), Integer.valueOf(i != 0 ? (this.f241g * 100) / i : 0));
    }
}
