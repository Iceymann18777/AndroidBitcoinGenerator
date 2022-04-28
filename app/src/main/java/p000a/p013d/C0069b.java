package p000a.p013d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: a.d.b */
/* loaded from: classes.dex */
public final class C0069b<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    private static final int[] f216f = new int[0];

    /* renamed from: g */
    private static final Object[] f217g = new Object[0];

    /* renamed from: h */
    private static Object[] f218h;

    /* renamed from: i */
    private static int f219i;

    /* renamed from: j */
    private static Object[] f220j;

    /* renamed from: k */
    private static int f221k;

    /* renamed from: b */
    private int[] f222b;

    /* renamed from: c */
    Object[] f223c;

    /* renamed from: d */
    int f224d;

    /* renamed from: e */
    private AbstractC0074f<E, E> f225e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.d.b$a */
    /* loaded from: classes.dex */
    public class C0070a extends AbstractC0074f<E, E> {
        C0070a() {
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected int mo4039a(Object obj) {
            return C0069b.this.m4075a(obj);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected Object mo4041a(int i, int i2) {
            return C0069b.this.f223c[i];
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected E mo4040a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4043a() {
            C0069b.this.clear();
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4042a(int i) {
            C0069b.this.m4071b(i);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4038a(E e, E e2) {
            C0069b.this.add(e);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: b */
        protected int mo4032b(Object obj) {
            return C0069b.this.m4075a(obj);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: b */
        protected Map<E, E> mo4034b() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: c */
        protected int mo4030c() {
            return C0069b.this.f224d;
        }
    }

    public C0069b() {
        this(0);
    }

    public C0069b(int i) {
        if (i == 0) {
            this.f222b = f216f;
            this.f223c = f217g;
        } else {
            m4069d(i);
        }
        this.f224d = 0;
    }

    /* renamed from: a */
    private int m4074a(Object obj, int i) {
        int i2 = this.f224d;
        if (i2 == 0) {
            return -1;
        }
        int a = C0071c.m4066a(this.f222b, i2, i);
        if (a < 0 || obj.equals(this.f223c[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f222b[i3] == i) {
            if (obj.equals(this.f223c[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.f222b[i4] == i; i4--) {
            if (obj.equals(this.f223c[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    private AbstractC0074f<E, E> m4077a() {
        if (this.f225e == null) {
            this.f225e = new C0070a();
        }
        return this.f225e;
    }

    /* renamed from: a */
    private static void m4073a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0069b.class) {
                if (f221k < 10) {
                    objArr[0] = f220j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f220j = objArr;
                    f221k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0069b.class) {
                if (f219i < 10) {
                    objArr[0] = f218h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f218h = objArr;
                    f219i++;
                }
            }
        }
    }

    /* renamed from: b */
    private int m4072b() {
        int i = this.f224d;
        if (i == 0) {
            return -1;
        }
        int a = C0071c.m4066a(this.f222b, i, 0);
        if (a < 0 || this.f223c[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f222b[i2] == 0) {
            if (this.f223c[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.f222b[i3] == 0; i3--) {
            if (this.f223c[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* renamed from: d */
    private void m4069d(int i) {
        if (i == 8) {
            synchronized (C0069b.class) {
                if (f220j != null) {
                    Object[] objArr = f220j;
                    this.f223c = objArr;
                    f220j = (Object[]) objArr[0];
                    this.f222b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f221k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0069b.class) {
                if (f218h != null) {
                    Object[] objArr2 = f218h;
                    this.f223c = objArr2;
                    f218h = (Object[]) objArr2[0];
                    this.f222b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f219i--;
                    return;
                }
            }
        }
        this.f222b = new int[i];
        this.f223c = new Object[i];
    }

    /* renamed from: a */
    public int m4075a(Object obj) {
        return obj == null ? m4072b() : m4074a(obj, obj.hashCode());
    }

    /* renamed from: a */
    public void m4076a(int i) {
        int[] iArr = this.f222b;
        if (iArr.length < i) {
            Object[] objArr = this.f223c;
            m4069d(i);
            int i2 = this.f224d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f222b, 0, i2);
                System.arraycopy(objArr, 0, this.f223c, 0, this.f224d);
            }
            m4073a(iArr, objArr, this.f224d);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m4072b();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i2 = m4074a(e, hashCode);
            i = hashCode;
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ (-1);
        int i4 = this.f224d;
        if (i4 >= this.f222b.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f222b;
            Object[] objArr = this.f223c;
            m4069d(i5);
            int[] iArr2 = this.f222b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f223c, 0, objArr.length);
            }
            m4073a(iArr, objArr, this.f224d);
        }
        int i6 = this.f224d;
        if (i3 < i6) {
            int[] iArr3 = this.f222b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f223c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f224d - i3);
        }
        this.f222b[i3] = i;
        this.f223c[i3] = e;
        this.f224d++;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m4076a(this.f224d + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public E m4071b(int i) {
        Object[] objArr = this.f223c;
        E e = (E) objArr[i];
        int i2 = this.f224d;
        if (i2 <= 1) {
            m4073a(this.f222b, objArr, i2);
            this.f222b = f216f;
            this.f223c = f217g;
            this.f224d = 0;
        } else {
            int[] iArr = this.f222b;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f224d--;
                int i4 = this.f224d;
                if (i < i4) {
                    int[] iArr2 = this.f222b;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr2 = this.f223c;
                    System.arraycopy(objArr2, i5, objArr2, i, this.f224d - i);
                }
                this.f223c[this.f224d] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f222b;
                Object[] objArr3 = this.f223c;
                m4069d(i3);
                this.f224d--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f222b, 0, i);
                    System.arraycopy(objArr3, 0, this.f223c, 0, i);
                }
                int i6 = this.f224d;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f222b, i, i6 - i);
                    System.arraycopy(objArr3, i7, this.f223c, i, this.f224d - i);
                }
            }
        }
        return e;
    }

    /* renamed from: c */
    public E m4070c(int i) {
        return (E) this.f223c[i];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f224d;
        if (i != 0) {
            m4073a(this.f222b, this.f223c, i);
            this.f222b = f216f;
            this.f223c = f217g;
            this.f224d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m4075a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f224d; i++) {
                try {
                    if (!set.contains(m4070c(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f222b;
        int i = this.f224d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f224d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m4077a().m4027e().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int a = m4075a(obj);
        if (a < 0) {
            return false;
        }
        m4071b(a);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f224d - 1; i >= 0; i--) {
            if (!collection.contains(this.f223c[i])) {
                m4071b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f224d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f224d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f223c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f224d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f224d));
        }
        System.arraycopy(this.f223c, 0, tArr, 0, this.f224d);
        int length = tArr.length;
        int i = this.f224d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f224d * 14);
        sb.append('{');
        for (int i = 0; i < this.f224d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E c = m4070c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
