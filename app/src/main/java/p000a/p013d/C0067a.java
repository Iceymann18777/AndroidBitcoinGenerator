package p000a.p013d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: a.d.a */
/* loaded from: classes.dex */
public class C0067a<K, V> extends C0080g<K, V> implements Map<K, V> {

    /* renamed from: i */
    AbstractC0074f<K, V> f214i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.d.a$a */
    /* loaded from: classes.dex */
    public class C0068a extends AbstractC0074f<K, V> {
        C0068a() {
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected int mo4039a(Object obj) {
            return C0067a.this.m4020a(obj);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected Object mo4041a(int i, int i2) {
            return C0067a.this.f263c[(i << 1) + i2];
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected V mo4040a(int i, V v) {
            return C0067a.this.m4022a(i, (int) v);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4043a() {
            C0067a.this.clear();
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4042a(int i) {
            C0067a.this.m4014c(i);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: a */
        protected void mo4038a(K k, V v) {
            C0067a.this.put(k, v);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: b */
        protected int mo4032b(Object obj) {
            return C0067a.this.m4015b(obj);
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: b */
        protected Map<K, V> mo4034b() {
            return C0067a.this;
        }

        @Override // p000a.p013d.AbstractC0074f
        /* renamed from: c */
        protected int mo4030c() {
            return C0067a.this.f264d;
        }
    }

    public C0067a() {
    }

    public C0067a(int i) {
        super(i);
    }

    public C0067a(C0080g gVar) {
        super(gVar);
    }

    /* renamed from: b */
    private AbstractC0074f<K, V> m4078b() {
        if (this.f214i == null) {
            this.f214i = new C0068a();
        }
        return this.f214i;
    }

    /* renamed from: a */
    public boolean m4079a(Collection<?> collection) {
        return AbstractC0074f.m4029c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m4078b().m4028d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m4078b().m4027e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m4023a(this.f264d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m4078b().m4026f();
    }
}
