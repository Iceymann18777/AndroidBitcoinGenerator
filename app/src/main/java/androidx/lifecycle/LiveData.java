package androidx.lifecycle;

import p000a.p007b.p008a.p009a.C0042a;
import p000a.p007b.p008a.p010b.C0049b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: i */
    static final Object f2781i = new Object();

    /* renamed from: d */
    private volatile Object f2785d;

    /* renamed from: e */
    volatile Object f2786e;

    /* renamed from: g */
    private boolean f2788g;

    /* renamed from: h */
    private boolean f2789h;

    /* renamed from: a */
    final Object f2782a = new Object();

    /* renamed from: b */
    private C0049b<AbstractC0754m<? super T>, LiveData<T>.AbstractC0735b> f2783b = new C0049b<>();

    /* renamed from: c */
    int f2784c = 0;

    /* renamed from: f */
    private int f2787f = -1;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.AbstractC0735b implements AbstractC0741d {

        /* renamed from: e */
        final AbstractC0746g f2790e;

        LifecycleBoundObserver(AbstractC0746g gVar, AbstractC0754m<? super T> mVar) {
            super(mVar);
            this.f2790e = gVar;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0735b
        /* renamed from: a */
        void mo1407a() {
            this.f2790e.mo1368a().mo1377b(this);
        }

        @Override // androidx.lifecycle.AbstractC0741d
        /* renamed from: a */
        public void mo1388a(AbstractC0746g gVar, AbstractC0742e.EnumC0743a aVar) {
            if (this.f2790e.mo1368a().mo1386a() == AbstractC0742e.EnumC0744b.DESTROYED) {
                LiveData.this.mo1411a((AbstractC0754m) this.f2793a);
            } else {
                m1405a(mo1404b());
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0735b
        /* renamed from: a */
        boolean mo1406a(AbstractC0746g gVar) {
            return this.f2790e == gVar;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0735b
        /* renamed from: b */
        boolean mo1404b() {
            return this.f2790e.mo1368a().mo1386a().m1387a(AbstractC0742e.EnumC0744b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    class RunnableC0734a implements Runnable {
        RunnableC0734a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2782a) {
                obj = LiveData.this.f2786e;
                LiveData.this.f2786e = LiveData.f2781i;
            }
            LiveData.this.mo1360a((LiveData) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    public abstract class AbstractC0735b {

        /* renamed from: a */
        final AbstractC0754m<? super T> f2793a;

        /* renamed from: b */
        boolean f2794b;

        /* renamed from: c */
        int f2795c = -1;

        AbstractC0735b(AbstractC0754m<? super T> mVar) {
            this.f2793a = mVar;
        }

        /* renamed from: a */
        void mo1407a() {
        }

        /* renamed from: a */
        void m1405a(boolean z) {
            if (z != this.f2794b) {
                this.f2794b = z;
                int i = 1;
                boolean z2 = LiveData.this.f2784c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f2784c;
                if (!this.f2794b) {
                    i = -1;
                }
                liveData.f2784c = i2 + i;
                if (z2 && this.f2794b) {
                    LiveData.this.mo1414a();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f2784c == 0 && !this.f2794b) {
                    liveData2.mo1409b();
                }
                if (this.f2794b) {
                    LiveData.this.m1413a(this);
                }
            }
        }

        /* renamed from: a */
        boolean mo1406a(AbstractC0746g gVar) {
            return false;
        }

        /* renamed from: b */
        abstract boolean mo1404b();
    }

    public LiveData() {
        Object obj = f2781i;
        this.f2785d = obj;
        this.f2786e = obj;
        new RunnableC0734a();
    }

    /* renamed from: a */
    private static void m1410a(String str) {
        if (!C0042a.m4148b().mo4147a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: b */
    private void m1408b(LiveData<T>.AbstractC0735b bVar) {
        if (bVar.f2794b) {
            if (!bVar.mo1404b()) {
                bVar.m1405a(false);
                return;
            }
            int i = bVar.f2795c;
            int i2 = this.f2787f;
            if (i < i2) {
                bVar.f2795c = i2;
                bVar.f2793a.m1359a((Object) this.f2785d);
            }
        }
    }

    /* renamed from: a */
    protected void mo1414a() {
    }

    /* renamed from: a */
    void m1413a(LiveData<T>.AbstractC0735b bVar) {
        if (this.f2788g) {
            this.f2789h = true;
            return;
        }
        this.f2788g = true;
        do {
            this.f2789h = false;
            if (bVar == null) {
                C0049b<AbstractC0754m<? super T>, LiveData<T>.AbstractC0735b>.C0053d c = this.f2783b.m4138c();
                while (c.hasNext()) {
                    m1408b((AbstractC0735b) c.next().getValue());
                    if (this.f2789h) {
                        break;
                    }
                }
            } else {
                m1408b(bVar);
                bVar = null;
            }
        } while (this.f2789h);
        this.f2788g = false;
    }

    /* renamed from: a */
    public void m1412a(AbstractC0746g gVar, AbstractC0754m<? super T> mVar) {
        m1410a("observe");
        if (gVar.mo1368a().mo1386a() != AbstractC0742e.EnumC0744b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
            LiveData<T>.AbstractC0735b b = this.f2783b.mo4139b(mVar, lifecycleBoundObserver);
            if (b != null && !b.mo1406a(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b == null) {
                gVar.mo1368a().mo1382a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo1411a(AbstractC0754m<? super T> mVar) {
        m1410a("removeObserver");
        LiveData<T>.AbstractC0735b remove = this.f2783b.remove(mVar);
        if (remove != null) {
            remove.mo1407a();
            remove.m1405a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1360a(T t) {
        m1410a("setValue");
        this.f2787f++;
        this.f2785d = t;
        m1413a((AbstractC0735b) null);
    }

    /* renamed from: b */
    protected void mo1409b() {
    }
}
