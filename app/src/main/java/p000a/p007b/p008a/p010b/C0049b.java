package p000a.p007b.p008a.p010b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.b.a.b.b */
/* loaded from: classes.dex */
public class C0049b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    C0052c<K, V> f165b;

    /* renamed from: c */
    private C0052c<K, V> f166c;

    /* renamed from: d */
    private WeakHashMap<AbstractC0055f<K, V>, Boolean> f167d = new WeakHashMap<>();

    /* renamed from: e */
    private int f168e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.a.b.b$a */
    /* loaded from: classes.dex */
    public static class C0050a<K, V> extends AbstractC0054e<K, V> {
        C0050a(C0052c<K, V> cVar, C0052c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0054e
        /* renamed from: b */
        C0052c<K, V> mo4135b(C0052c<K, V> cVar) {
            return cVar.f172e;
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0054e
        /* renamed from: c */
        C0052c<K, V> mo4134c(C0052c<K, V> cVar) {
            return cVar.f171d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.a.b.b$b */
    /* loaded from: classes.dex */
    public static class C0051b<K, V> extends AbstractC0054e<K, V> {
        C0051b(C0052c<K, V> cVar, C0052c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0054e
        /* renamed from: b */
        C0052c<K, V> mo4135b(C0052c<K, V> cVar) {
            return cVar.f171d;
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0054e
        /* renamed from: c */
        C0052c<K, V> mo4134c(C0052c<K, V> cVar) {
            return cVar.f172e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.a.b.b$c */
    /* loaded from: classes.dex */
    public static class C0052c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        final K f169b;

        /* renamed from: c */
        final V f170c;

        /* renamed from: d */
        C0052c<K, V> f171d;

        /* renamed from: e */
        C0052c<K, V> f172e;

        C0052c(K k, V v) {
            this.f169b = k;
            this.f170c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0052c)) {
                return false;
            }
            C0052c cVar = (C0052c) obj;
            return this.f169b.equals(cVar.f169b) && this.f170c.equals(cVar.f170c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f169b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f170c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f169b.hashCode() ^ this.f170c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f169b + "=" + this.f170c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.a.b.b$d */
    /* loaded from: classes.dex */
    public class C0053d implements Iterator<Map.Entry<K, V>>, AbstractC0055f<K, V> {

        /* renamed from: b */
        private C0052c<K, V> f173b;

        /* renamed from: c */
        private boolean f174c = true;

        C0053d() {
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0055f
        /* renamed from: a */
        public void mo4133a(C0052c<K, V> cVar) {
            C0052c<K, V> cVar2 = this.f173b;
            if (cVar == cVar2) {
                this.f173b = cVar2.f172e;
                this.f174c = this.f173b == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f174c) {
                return C0049b.this.f165b != null;
            }
            C0052c<K, V> cVar = this.f173b;
            return (cVar == null || cVar.f171d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            C0052c<K, V> cVar;
            if (this.f174c) {
                this.f174c = false;
                cVar = C0049b.this.f165b;
            } else {
                C0052c<K, V> cVar2 = this.f173b;
                cVar = cVar2 != null ? cVar2.f171d : null;
            }
            this.f173b = cVar;
            return this.f173b;
        }
    }

    /* renamed from: a.b.a.b.b$e */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0054e<K, V> implements Iterator<Map.Entry<K, V>>, AbstractC0055f<K, V> {

        /* renamed from: b */
        C0052c<K, V> f176b;

        /* renamed from: c */
        C0052c<K, V> f177c;

        AbstractC0054e(C0052c<K, V> cVar, C0052c<K, V> cVar2) {
            this.f176b = cVar2;
            this.f177c = cVar;
        }

        /* renamed from: a */
        private C0052c<K, V> m4136a() {
            C0052c<K, V> cVar = this.f177c;
            C0052c<K, V> cVar2 = this.f176b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo4134c(cVar);
        }

        @Override // p000a.p007b.p008a.p010b.C0049b.AbstractC0055f
        /* renamed from: a */
        public void mo4133a(C0052c<K, V> cVar) {
            if (this.f176b == cVar && cVar == this.f177c) {
                this.f177c = null;
                this.f176b = null;
            }
            C0052c<K, V> cVar2 = this.f176b;
            if (cVar2 == cVar) {
                this.f176b = mo4135b(cVar2);
            }
            if (this.f177c == cVar) {
                this.f177c = m4136a();
            }
        }

        /* renamed from: b */
        abstract C0052c<K, V> mo4135b(C0052c<K, V> cVar);

        /* renamed from: c */
        abstract C0052c<K, V> mo4134c(C0052c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f177c != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            C0052c<K, V> cVar = this.f177c;
            this.f177c = m4136a();
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.a.b.b$f */
    /* loaded from: classes.dex */
    public interface AbstractC0055f<K, V> {
        /* renamed from: a */
        void mo4133a(C0052c<K, V> cVar);
    }

    /* renamed from: a */
    protected C0052c<K, V> mo4142a(K k) {
        C0052c<K, V> cVar = this.f165b;
        while (cVar != null && !cVar.f169b.equals(k)) {
            cVar = cVar.f171d;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0052c<K, V> m4141a(K k, V v) {
        C0052c<K, V> cVar = new C0052c<>(k, v);
        this.f168e++;
        C0052c<K, V> cVar2 = this.f166c;
        if (cVar2 == null) {
            this.f165b = cVar;
            this.f166c = this.f165b;
            return cVar;
        }
        cVar2.f171d = cVar;
        cVar.f172e = cVar2;
        this.f166c = cVar;
        return cVar;
    }

    /* renamed from: a */
    public Iterator<Map.Entry<K, V>> m4143a() {
        C0051b bVar = new C0051b(this.f166c, this.f165b);
        this.f167d.put(bVar, false);
        return bVar;
    }

    /* renamed from: b */
    public V mo4139b(K k, V v) {
        C0052c<K, V> a = mo4142a(k);
        if (a != null) {
            return a.f170c;
        }
        m4141a(k, v);
        return null;
    }

    /* renamed from: b */
    public Map.Entry<K, V> m4140b() {
        return this.f165b;
    }

    /* renamed from: c */
    public C0049b<K, V>.C0053d m4138c() {
        C0049b<K, V>.C0053d dVar = new C0053d();
        this.f167d.put(dVar, false);
        return dVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> m4137d() {
        return this.f166c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0049b)) {
            return false;
        }
        C0049b bVar = (C0049b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0050a aVar = new C0050a(this.f165b, this.f166c);
        this.f167d.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        C0052c<K, V> a = mo4142a(k);
        if (a == null) {
            return null;
        }
        this.f168e--;
        if (!this.f167d.isEmpty()) {
            for (AbstractC0055f<K, V> fVar : this.f167d.keySet()) {
                fVar.mo4133a(a);
            }
        }
        C0052c<K, V> cVar = a.f172e;
        if (cVar != null) {
            cVar.f171d = a.f171d;
        } else {
            this.f165b = a.f171d;
        }
        C0052c<K, V> cVar2 = a.f171d;
        if (cVar2 != null) {
            cVar2.f172e = a.f172e;
        } else {
            this.f166c = a.f172e;
        }
        a.f171d = null;
        a.f172e = null;
        return a.f170c;
    }

    public int size() {
        return this.f168e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
