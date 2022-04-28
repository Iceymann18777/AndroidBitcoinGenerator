package androidx.lifecycle;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public class C0759q {

    /* renamed from: a */
    private final AbstractC0760a f2827a;

    /* renamed from: b */
    private final C0761r f2828b;

    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: classes.dex */
    public interface AbstractC0760a {
        /* renamed from: a */
        <T extends AbstractC0758p> T mo1347a(Class<T> cls);
    }

    public C0759q(C0761r rVar, AbstractC0760a aVar) {
        this.f2827a = aVar;
        this.f2828b = rVar;
    }

    /* renamed from: a */
    public <T extends AbstractC0758p> T m1349a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m1348a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends AbstractC0758p> T m1348a(String str, Class<T> cls) {
        T t = (T) this.f2828b.m1345a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f2827a.mo1347a(cls);
        this.f2828b.m1344a(str, t2);
        return t2;
    }
}
