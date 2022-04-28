package p000a.p013d;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: a.d.g */
/* loaded from: classes.dex */
public class C0080g<K, V> {

    /* renamed from: e */
    static Object[] f258e;

    /* renamed from: f */
    static int f259f;

    /* renamed from: g */
    static Object[] f260g;

    /* renamed from: h */
    static int f261h;

    /* renamed from: b */
    int[] f262b;

    /* renamed from: c */
    Object[] f263c;

    /* renamed from: d */
    int f264d;

    public C0080g() {
        this.f262b = C0071c.f227a;
        this.f263c = C0071c.f229c;
        this.f264d = 0;
    }

    public C0080g(int i) {
        if (i == 0) {
            this.f262b = C0071c.f227a;
            this.f263c = C0071c.f229c;
        } else {
            m4012e(i);
        }
        this.f264d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0080g(C0080g<K, V> gVar) {
        this();
        if (gVar != 0) {
            m4021a((C0080g) gVar);
        }
    }

    /* renamed from: a */
    private static int m4018a(int[] iArr, int i, int i2) {
        try {
            return C0071c.m4066a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m4017a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0067a.class) {
                if (f261h < 10) {
                    objArr[0] = f260g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f260g = objArr;
                    f261h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0067a.class) {
                if (f259f < 10) {
                    objArr[0] = f258e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f258e = objArr;
                    f259f++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m4012e(int i) {
        if (i == 8) {
            synchronized (C0067a.class) {
                if (f260g != null) {
                    Object[] objArr = f260g;
                    this.f263c = objArr;
                    f260g = (Object[]) objArr[0];
                    this.f262b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f261h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0067a.class) {
                if (f258e != null) {
                    Object[] objArr2 = f258e;
                    this.f263c = objArr2;
                    f258e = (Object[]) objArr2[0];
                    this.f262b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f259f--;
                    return;
                }
            }
        }
        this.f262b = new int[i];
        this.f263c = new Object[i << 1];
    }

    /* renamed from: a */
    int m4024a() {
        int i = this.f264d;
        if (i == 0) {
            return -1;
        }
        int a = m4018a(this.f262b, i, 0);
        if (a < 0 || this.f263c[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f262b[i2] == 0) {
            if (this.f263c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.f262b[i3] == 0; i3--) {
            if (this.f263c[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* renamed from: a */
    public int m4020a(Object obj) {
        return obj == null ? m4024a() : m4019a(obj, obj.hashCode());
    }

    /* renamed from: a */
    int m4019a(Object obj, int i) {
        int i2 = this.f264d;
        if (i2 == 0) {
            return -1;
        }
        int a = m4018a(this.f262b, i2, i);
        if (a < 0 || obj.equals(this.f263c[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f262b[i3] == i) {
            if (obj.equals(this.f263c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.f262b[i4] == i; i4--) {
            if (obj.equals(this.f263c[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    public V m4022a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f263c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void m4023a(int i) {
        int i2 = this.f264d;
        int[] iArr = this.f262b;
        if (iArr.length < i) {
            Object[] objArr = this.f263c;
            m4012e(i);
            if (this.f264d > 0) {
                System.arraycopy(iArr, 0, this.f262b, 0, i2);
                System.arraycopy(objArr, 0, this.f263c, 0, i2 << 1);
            }
            m4017a(iArr, objArr, i2);
        }
        if (this.f264d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m4021a(C0080g<? extends K, ? extends V> gVar) {
        int i = gVar.f264d;
        m4023a(this.f264d + i);
        if (this.f264d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.m4016b(i2), gVar.m4013d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f262b, 0, this.f262b, 0, i);
            System.arraycopy(gVar.f263c, 0, this.f263c, 0, i << 1);
            this.f264d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m4015b(Object obj) {
        int i = this.f264d * 2;
        Object[] objArr = this.f263c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K m4016b(int i) {
        return (K) this.f263c[i << 1];
    }

    /* renamed from: c */
    public V m4014c(int i) {
        int i2;
        Object[] objArr = this.f263c;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f264d;
        if (i4 <= 1) {
            m4017a(this.f262b, objArr, i4);
            this.f262b = C0071c.f227a;
            this.f263c = C0071c.f229c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f262b;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f262b;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.f263c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i3, i7 << 1);
                }
                Object[] objArr3 = this.f263c;
                int i8 = i2 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f262b;
                Object[] objArr4 = this.f263c;
                m4012e(i5);
                if (i4 == this.f264d) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f262b, 0, i);
                        System.arraycopy(objArr4, 0, this.f263c, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f262b, i, i10);
                        System.arraycopy(objArr4, i9 << 1, this.f263c, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f264d) {
            this.f264d = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f264d;
        if (i > 0) {
            int[] iArr = this.f262b;
            Object[] objArr = this.f263c;
            this.f262b = C0071c.f227a;
            this.f263c = C0071c.f229c;
            this.f264d = 0;
            m4017a(iArr, objArr, i);
        }
        if (this.f264d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m4020a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m4015b(obj) >= 0;
    }

    /* renamed from: d */
    public V m4013d(int i) {
        return (V) this.f263c[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0080g) {
            C0080g gVar = (C0080g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f264d; i++) {
                try {
                    K b = m4016b(i);
                    V d = m4013d(i);
                    Object obj2 = gVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !gVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f264d; i2++) {
                try {
                    K b2 = m4016b(i2);
                    V d2 = m4013d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int a = m4020a(obj);
        if (a >= 0) {
            return (V) this.f263c[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f262b;
        Object[] objArr = this.f263c;
        int i = this.f264d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f264d <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f264d;
        if (k == null) {
            i2 = m4024a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i2 = m4019a(k, hashCode);
            i = hashCode;
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f263c;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ (-1);
        if (i3 >= this.f262b.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f262b;
            Object[] objArr2 = this.f263c;
            m4012e(i6);
            if (i3 == this.f264d) {
                int[] iArr2 = this.f262b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f263c, 0, objArr2.length);
                }
                m4017a(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f262b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f263c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f264d - i5) << 1);
        }
        int i8 = this.f264d;
        if (i3 == i8) {
            int[] iArr4 = this.f262b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f263c;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.f264d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int a = m4020a(obj);
        if (a >= 0) {
            return m4014c(a);
        }
        return null;
    }

    public int size() {
        return this.f264d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f264d * 28);
        sb.append('{');
        for (int i = 0; i < this.f264d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K b = m4016b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V d = m4013d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
