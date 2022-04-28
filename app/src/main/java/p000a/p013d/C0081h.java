package p000a.p013d;

/* renamed from: a.d.h */
/* loaded from: classes.dex */
public class C0081h<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f265f = new Object();

    /* renamed from: b */
    private boolean f266b;

    /* renamed from: c */
    private int[] f267c;

    /* renamed from: d */
    private Object[] f268d;

    /* renamed from: e */
    private int f269e;

    public C0081h() {
        this(10);
    }

    public C0081h(int i) {
        this.f266b = false;
        if (i == 0) {
            this.f267c = C0071c.f227a;
            this.f268d = C0071c.f229c;
        } else {
            int b = C0071c.m4064b(i);
            this.f267c = new int[b];
            this.f268d = new Object[b];
        }
        this.f269e = 0;
    }

    /* renamed from: c */
    private void m4005c() {
        int i = this.f269e;
        int[] iArr = this.f267c;
        Object[] objArr = this.f268d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f265f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f266b = false;
        this.f269e = i2;
    }

    /* renamed from: a */
    public void m4011a() {
        int i = this.f269e;
        Object[] objArr = this.f268d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f269e = 0;
        this.f266b = false;
    }

    /* renamed from: a */
    public void m4010a(int i) {
        int a = C0071c.m4066a(this.f267c, this.f269e, i);
        if (a >= 0) {
            Object[] objArr = this.f268d;
            Object obj = objArr[a];
            Object obj2 = f265f;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f266b = true;
            }
        }
    }

    /* renamed from: a */
    public void m4009a(int i, E e) {
        int i2 = this.f269e;
        if (i2 == 0 || i > this.f267c[i2 - 1]) {
            if (this.f266b && this.f269e >= this.f267c.length) {
                m4005c();
            }
            int i3 = this.f269e;
            if (i3 >= this.f267c.length) {
                int b = C0071c.m4064b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f267c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f268d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f267c = iArr;
                this.f268d = objArr;
            }
            this.f267c[i3] = i;
            this.f268d[i3] = e;
            this.f269e = i3 + 1;
            return;
        }
        m4003c(i, e);
    }

    /* renamed from: b */
    public int m4008b() {
        if (this.f266b) {
            m4005c();
        }
        return this.f269e;
    }

    /* renamed from: b */
    public E m4007b(int i) {
        return m4006b(i, null);
    }

    /* renamed from: b */
    public E m4006b(int i, E e) {
        int a = C0071c.m4066a(this.f267c, this.f269e, i);
        if (a >= 0) {
            Object[] objArr = this.f268d;
            if (objArr[a] != f265f) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public int m4004c(int i) {
        if (this.f266b) {
            m4005c();
        }
        return C0071c.m4066a(this.f267c, this.f269e, i);
    }

    /* renamed from: c */
    public void m4003c(int i, E e) {
        int a = C0071c.m4066a(this.f267c, this.f269e, i);
        if (a >= 0) {
            this.f268d[a] = e;
            return;
        }
        int i2 = a ^ (-1);
        if (i2 < this.f269e) {
            Object[] objArr = this.f268d;
            if (objArr[i2] == f265f) {
                this.f267c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f266b && this.f269e >= this.f267c.length) {
            m4005c();
            i2 = C0071c.m4066a(this.f267c, this.f269e, i) ^ (-1);
        }
        int i3 = this.f269e;
        if (i3 >= this.f267c.length) {
            int b = C0071c.m4064b(i3 + 1);
            int[] iArr = new int[b];
            Object[] objArr2 = new Object[b];
            int[] iArr2 = this.f267c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f268d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f267c = iArr;
            this.f268d = objArr2;
        }
        int i4 = this.f269e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f267c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f268d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f269e - i2);
        }
        this.f267c[i2] = i;
        this.f268d[i2] = e;
        this.f269e++;
    }

    public C0081h<E> clone() {
        try {
            C0081h<E> hVar = (C0081h) super.clone();
            hVar.f267c = (int[]) this.f267c.clone();
            hVar.f268d = (Object[]) this.f268d.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public int m4002d(int i) {
        if (this.f266b) {
            m4005c();
        }
        return this.f267c[i];
    }

    /* renamed from: e */
    public void m4001e(int i) {
        m4010a(i);
    }

    /* renamed from: f */
    public E m4000f(int i) {
        if (this.f266b) {
            m4005c();
        }
        return (E) this.f268d[i];
    }

    public String toString() {
        if (m4008b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f269e * 28);
        sb.append('{');
        for (int i = 0; i < this.f269e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m4002d(i));
            sb.append('=');
            E f = m4000f(i);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
