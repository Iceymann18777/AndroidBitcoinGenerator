package p000a.p013d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.d.f */
/* loaded from: classes.dex */
public abstract class AbstractC0074f<K, V> {

    /* renamed from: a */
    AbstractC0074f<K, V>.C0076b f243a;

    /* renamed from: b */
    AbstractC0074f<K, V>.C0077c f244b;

    /* renamed from: c */
    AbstractC0074f<K, V>.C0079e f245c;

    /* renamed from: a.d.f$a */
    /* loaded from: classes.dex */
    final class C0075a<T> implements Iterator<T> {

        /* renamed from: b */
        final int f246b;

        /* renamed from: c */
        int f247c;

        /* renamed from: d */
        int f248d;

        /* renamed from: e */
        boolean f249e = false;

        C0075a(int i) {
            this.f246b = i;
            this.f247c = AbstractC0074f.this.mo4030c();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f248d < this.f247c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC0074f.this.mo4041a(this.f248d, this.f246b);
                this.f248d++;
                this.f249e = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f249e) {
                this.f248d--;
                this.f247c--;
                this.f249e = false;
                AbstractC0074f.this.mo4042a(this.f248d);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a.d.f$b */
    /* loaded from: classes.dex */
    final class C0076b implements Set<Map.Entry<K, V>> {
        C0076b() {
        }

        /* renamed from: a */
        public boolean m4025a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            m4025a((Map.Entry) obj);
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int c = AbstractC0074f.this.mo4030c();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC0074f.this.mo4038a((AbstractC0074f) entry.getKey(), entry.getValue());
            }
            return c != AbstractC0074f.this.mo4030c();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0074f.this.mo4043a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = AbstractC0074f.this.mo4039a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0071c.m4067a(AbstractC0074f.this.mo4041a(a, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0074f.m4036a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int c = AbstractC0074f.this.mo4030c() - 1; c >= 0; c--) {
                Object a = AbstractC0074f.this.mo4041a(c, 0);
                Object a2 = AbstractC0074f.this.mo4041a(c, 1);
                i += (a == null ? 0 : a.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0074f.this.mo4030c() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0078d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0074f.this.mo4030c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a.d.f$c */
    /* loaded from: classes.dex */
    final class C0077c implements Set<K> {
        C0077c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0074f.this.mo4043a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0074f.this.mo4039a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0074f.m4037a((Map) AbstractC0074f.this.mo4034b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0074f.m4036a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int c = AbstractC0074f.this.mo4030c() - 1; c >= 0; c--) {
                Object a = AbstractC0074f.this.mo4041a(c, 0);
                i += a == null ? 0 : a.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0074f.this.mo4030c() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C0075a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int a = AbstractC0074f.this.mo4039a(obj);
            if (a < 0) {
                return false;
            }
            AbstractC0074f.this.mo4042a(a);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0074f.m4031b(AbstractC0074f.this.mo4034b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0074f.m4029c(AbstractC0074f.this.mo4034b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0074f.this.mo4030c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0074f.this.m4033b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0074f.this.m4035a(tArr, 0);
        }
    }

    /* renamed from: a.d.f$d */
    /* loaded from: classes.dex */
    final class C0078d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        int f253b;

        /* renamed from: d */
        boolean f255d = false;

        /* renamed from: c */
        int f254c = -1;

        C0078d() {
            this.f253b = AbstractC0074f.this.mo4030c() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f255d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C0071c.m4067a(entry.getKey(), AbstractC0074f.this.mo4041a(this.f254c, 0)) && C0071c.m4067a(entry.getValue(), AbstractC0074f.this.mo4041a(this.f254c, 1));
            }
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f255d) {
                return (K) AbstractC0074f.this.mo4041a(this.f254c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f255d) {
                return (V) AbstractC0074f.this.mo4041a(this.f254c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f254c < this.f253b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f255d) {
                int i = 0;
                Object a = AbstractC0074f.this.mo4041a(this.f254c, 0);
                Object a2 = AbstractC0074f.this.mo4041a(this.f254c, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f254c++;
                this.f255d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f255d) {
                AbstractC0074f.this.mo4042a(this.f254c);
                this.f254c--;
                this.f253b--;
                this.f255d = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f255d) {
                return (V) AbstractC0074f.this.mo4040a(this.f254c, (int) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: a.d.f$e */
    /* loaded from: classes.dex */
    final class C0079e implements Collection<V> {
        C0079e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0074f.this.mo4043a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0074f.this.mo4032b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0074f.this.mo4030c() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0075a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int b = AbstractC0074f.this.mo4032b(obj);
            if (b < 0) {
                return false;
            }
            AbstractC0074f.this.mo4042a(b);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int c = AbstractC0074f.this.mo4030c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(AbstractC0074f.this.mo4041a(i, 1))) {
                    AbstractC0074f.this.mo4042a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int c = AbstractC0074f.this.mo4030c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(AbstractC0074f.this.mo4041a(i, 1))) {
                    AbstractC0074f.this.mo4042a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0074f.this.mo4030c();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0074f.this.m4033b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0074f.this.m4035a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m4037a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m4036a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m4031b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m4029c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract int mo4039a(Object obj);

    /* renamed from: a */
    protected abstract Object mo4041a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo4040a(int i, V v);

    /* renamed from: a */
    protected abstract void mo4043a();

    /* renamed from: a */
    protected abstract void mo4042a(int i);

    /* renamed from: a */
    protected abstract void mo4038a(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> T[] m4035a(T[] tArr, int i) {
        int c = mo4030c();
        if (tArr.length < c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), c));
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo4041a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    protected abstract int mo4032b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo4034b();

    /* renamed from: b */
    public Object[] m4033b(int i) {
        int c = mo4030c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo4041a(i2, i);
        }
        return objArr;
    }

    /* renamed from: c */
    protected abstract int mo4030c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> m4028d() {
        if (this.f243a == null) {
            this.f243a = new C0076b();
        }
        return this.f243a;
    }

    /* renamed from: e */
    public Set<K> m4027e() {
        if (this.f244b == null) {
            this.f244b = new C0077c();
        }
        return this.f244b;
    }

    /* renamed from: f */
    public Collection<V> m4026f() {
        if (this.f245c == null) {
            this.f245c = new C0079e();
        }
        return this.f245c;
    }
}
