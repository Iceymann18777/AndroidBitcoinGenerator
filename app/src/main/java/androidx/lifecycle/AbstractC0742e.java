package androidx.lifecycle;

/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public abstract class AbstractC0742e {

    /* renamed from: androidx.lifecycle.e$a */
    /* loaded from: classes.dex */
    public enum EnumC0743a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.e$b */
    /* loaded from: classes.dex */
    public enum EnumC0744b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m1387a(EnumC0744b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract EnumC0744b mo1386a();

    /* renamed from: a */
    public abstract void mo1382a(AbstractC0745f fVar);

    /* renamed from: b */
    public abstract void mo1377b(AbstractC0745f fVar);
}
