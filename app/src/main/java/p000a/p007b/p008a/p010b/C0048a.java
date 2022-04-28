package p000a.p007b.p008a.p010b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: a.b.a.b.a */
/* loaded from: classes.dex */
public class C0048a<K, V> extends C0049b<K, V> {

    /* renamed from: f */
    private HashMap<K, C0049b.C0052c<K, V>> f164f = new HashMap<>();

    @Override // p000a.p007b.p008a.p010b.C0049b
    /* renamed from: a */
    protected C0049b.C0052c<K, V> mo4142a(K k) {
        return this.f164f.get(k);
    }

    @Override // p000a.p007b.p008a.p010b.C0049b
    /* renamed from: b */
    public V mo4139b(K k, V v) {
        C0049b.C0052c<K, V> a = mo4142a(k);
        if (a != null) {
            return a.f170c;
        }
        this.f164f.put(k, m4141a(k, v));
        return null;
    }

    /* renamed from: b */
    public Map.Entry<K, V> m4144b(K k) {
        if (contains(k)) {
            return this.f164f.get(k).f172e;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f164f.containsKey(k);
    }

    @Override // p000a.p007b.p008a.p010b.C0049b
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f164f.remove(k);
        return v;
    }
}
