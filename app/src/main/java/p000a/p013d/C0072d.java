package p000a.p013d;

/* renamed from: a.d.d */
/* loaded from: classes.dex */
public class C0072d<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f230f = new Object();

    /* renamed from: b */
    private boolean f231b;

    /* renamed from: c */
    private long[] f232c;

    /* renamed from: d */
    private Object[] f233d;

    /* renamed from: e */
    private int f234e;

    public C0072d() {
        this(10);
    }

    public C0072d(int i) {
        this.f231b = false;
        if (i == 0) {
            this.f232c = C0071c.f228b;
            this.f233d = C0071c.f229c;
        } else {
            int c = C0071c.m4063c(i);
            this.f232c = new long[c];
            this.f233d = new Object[c];
        }
        this.f234e = 0;
    }

    /* renamed from: c */
    private void m4054c() {
        int i = this.f234e;
        long[] jArr = this.f232c;
        Object[] objArr = this.f233d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f230f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f231b = false;
        this.f234e = i2;
    }

    /* renamed from: a */
    public long m4061a(int i) {
        if (this.f231b) {
            m4054c();
        }
        return this.f232c[i];
    }

    /* renamed from: a */
    public void m4062a() {
        int i = this.f234e;
        Object[] objArr = this.f233d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f234e = 0;
        this.f231b = false;
    }

    /* renamed from: a */
    public void m4060a(long j) {
        int a = C0071c.m4065a(this.f232c, this.f234e, j);
        if (a >= 0) {
            Object[] objArr = this.f233d;
            Object obj = objArr[a];
            Object obj2 = f230f;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f231b = true;
            }
        }
    }

    /* renamed from: a */
    public void m4059a(long j, E e) {
        int i = this.f234e;
        if (i == 0 || j > this.f232c[i - 1]) {
            if (this.f231b && this.f234e >= this.f232c.length) {
                m4054c();
            }
            int i2 = this.f234e;
            if (i2 >= this.f232c.length) {
                int c = C0071c.m4063c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f232c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f233d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f232c = jArr;
                this.f233d = objArr;
            }
            this.f232c[i2] = j;
            this.f233d[i2] = e;
            this.f234e = i2 + 1;
            return;
        }
        m4051c(j, e);
    }

    /* renamed from: b */
    public int m4058b() {
        if (this.f231b) {
            m4054c();
        }
        return this.f234e;
    }

    /* renamed from: b */
    public E m4056b(long j) {
        return m4055b(j, null);
    }

    /* renamed from: b */
    public E m4055b(long j, E e) {
        int a = C0071c.m4065a(this.f232c, this.f234e, j);
        if (a >= 0) {
            Object[] objArr = this.f233d;
            if (objArr[a] != f230f) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void m4057b(int i) {
        Object[] objArr = this.f233d;
        Object obj = objArr[i];
        Object obj2 = f230f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f231b = true;
        }
    }

    /* renamed from: c */
    public int m4052c(long j) {
        if (this.f231b) {
            m4054c();
        }
        return C0071c.m4065a(this.f232c, this.f234e, j);
    }

    /* renamed from: c */
    public E m4053c(int i) {
        if (this.f231b) {
            m4054c();
        }
        return (E) this.f233d[i];
    }

    /* renamed from: c */
    public void m4051c(long j, E e) {
        int a = C0071c.m4065a(this.f232c, this.f234e, j);
        if (a >= 0) {
            this.f233d[a] = e;
            return;
        }
        int i = a ^ (-1);
        if (i < this.f234e) {
            Object[] objArr = this.f233d;
            if (objArr[i] == f230f) {
                this.f232c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f231b && this.f234e >= this.f232c.length) {
            m4054c();
            i = C0071c.m4065a(this.f232c, this.f234e, j) ^ (-1);
        }
        int i2 = this.f234e;
        if (i2 >= this.f232c.length) {
            int c = C0071c.m4063c(i2 + 1);
            long[] jArr = new long[c];
            Object[] objArr2 = new Object[c];
            long[] jArr2 = this.f232c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f233d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f232c = jArr;
            this.f233d = objArr2;
        }
        int i3 = this.f234e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f232c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f233d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f234e - i);
        }
        this.f232c[i] = j;
        this.f233d[i] = e;
        this.f234e++;
    }

    public C0072d<E> clone() {
        try {
            C0072d<E> dVar = (C0072d) super.clone();
            dVar.f232c = (long[]) this.f232c.clone();
            dVar.f233d = (Object[]) this.f233d.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (m4058b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f234e * 28);
        sb.append('{');
        for (int i = 0; i < this.f234e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m4061a(i));
            sb.append('=');
            E c = m4053c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
