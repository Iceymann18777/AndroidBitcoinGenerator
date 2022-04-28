package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements AbstractC0741d {

    /* renamed from: a */
    private final AbstractC0739b f2779a;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0733a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2780a = new int[AbstractC0742e.EnumC0743a.values().length];

        static {
            try {
                f2780a[AbstractC0742e.EnumC0743a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2780a[AbstractC0742e.EnumC0743a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2780a[AbstractC0742e.EnumC0743a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2780a[AbstractC0742e.EnumC0743a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2780a[AbstractC0742e.EnumC0743a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2780a[AbstractC0742e.EnumC0743a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2780a[AbstractC0742e.EnumC0743a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(AbstractC0739b bVar) {
        this.f2779a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC0741d
    /* renamed from: a */
    public void mo1388a(AbstractC0746g gVar, AbstractC0742e.EnumC0743a aVar) {
        switch (C0733a.f2780a[aVar.ordinal()]) {
            case 1:
                this.f2779a.m1391e(gVar);
                return;
            case 2:
                this.f2779a.m1390f(gVar);
                return;
            case 3:
                this.f2779a.m1395a(gVar);
                return;
            case 4:
                this.f2779a.m1394b(gVar);
                return;
            case 5:
                this.f2779a.m1392d(gVar);
                return;
            case 6:
                this.f2779a.m1393c(gVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
