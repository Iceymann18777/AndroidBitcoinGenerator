package androidx.lifecycle;

import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p000a.p007b.p008a.p010b.C0048a;
import p000a.p007b.p008a.p010b.C0049b;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public class C0747h extends AbstractC0742e {

    /* renamed from: c */
    private final WeakReference<AbstractC0746g> f2815c;

    /* renamed from: a */
    private C0048a<AbstractC0745f, C0749b> f2813a = new C0048a<>();

    /* renamed from: d */
    private int f2816d = 0;

    /* renamed from: e */
    private boolean f2817e = false;

    /* renamed from: f */
    private boolean f2818f = false;

    /* renamed from: g */
    private ArrayList<AbstractC0742e.EnumC0744b> f2819g = new ArrayList<>();

    /* renamed from: b */
    private AbstractC0742e.EnumC0744b f2814b = AbstractC0742e.EnumC0744b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.h$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0748a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2820a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2821b = new int[AbstractC0742e.EnumC0744b.values().length];

        static {
            try {
                f2821b[AbstractC0742e.EnumC0744b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2821b[AbstractC0742e.EnumC0744b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2821b[AbstractC0742e.EnumC0744b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2821b[AbstractC0742e.EnumC0744b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2821b[AbstractC0742e.EnumC0744b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2820a = new int[AbstractC0742e.EnumC0743a.values().length];
            try {
                f2820a[AbstractC0742e.EnumC0743a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2820a[AbstractC0742e.EnumC0743a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2820a[AbstractC0742e.EnumC0743a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2820a[AbstractC0742e.EnumC0743a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2820a[AbstractC0742e.EnumC0743a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2820a[AbstractC0742e.EnumC0743a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2820a[AbstractC0742e.EnumC0743a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.h$b */
    /* loaded from: classes.dex */
    public static class C0749b {

        /* renamed from: a */
        AbstractC0742e.EnumC0744b f2822a;

        /* renamed from: b */
        AbstractC0741d f2823b;

        C0749b(AbstractC0745f fVar, AbstractC0742e.EnumC0744b bVar) {
            this.f2823b = C0751j.m1366a(fVar);
            this.f2822a = bVar;
        }

        /* renamed from: a */
        void m1369a(AbstractC0746g gVar, AbstractC0742e.EnumC0743a aVar) {
            AbstractC0742e.EnumC0744b b = C0747h.m1379b(aVar);
            this.f2822a = C0747h.m1383a(this.f2822a, b);
            this.f2823b.mo1388a(gVar, aVar);
            this.f2822a = b;
        }
    }

    public C0747h(AbstractC0746g gVar) {
        this.f2815c = new WeakReference<>(gVar);
    }

    /* renamed from: a */
    static AbstractC0742e.EnumC0744b m1383a(AbstractC0742e.EnumC0744b bVar, AbstractC0742e.EnumC0744b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m1381a(AbstractC0746g gVar) {
        Iterator<Map.Entry<AbstractC0745f, C0749b>> a = this.f2813a.m4143a();
        while (a.hasNext() && !this.f2818f) {
            Map.Entry<AbstractC0745f, C0749b> next = a.next();
            C0749b value = next.getValue();
            while (value.f2822a.compareTo(this.f2814b) > 0 && !this.f2818f && this.f2813a.contains(next.getKey())) {
                AbstractC0742e.EnumC0743a b = m1378b(value.f2822a);
                m1371d(m1379b(b));
                value.m1369a(gVar, b);
                m1375c();
            }
        }
    }

    /* renamed from: b */
    private static AbstractC0742e.EnumC0743a m1378b(AbstractC0742e.EnumC0744b bVar) {
        int i = C0748a.f2821b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return AbstractC0742e.EnumC0743a.ON_DESTROY;
        } else {
            if (i == 3) {
                return AbstractC0742e.EnumC0743a.ON_STOP;
            }
            if (i == 4) {
                return AbstractC0742e.EnumC0743a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    static AbstractC0742e.EnumC0744b m1379b(AbstractC0742e.EnumC0743a aVar) {
        switch (C0748a.f2820a[aVar.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0742e.EnumC0744b.CREATED;
            case 3:
            case 4:
                return AbstractC0742e.EnumC0744b.STARTED;
            case 5:
                return AbstractC0742e.EnumC0744b.RESUMED;
            case 6:
                return AbstractC0742e.EnumC0744b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m1376b(AbstractC0746g gVar) {
        C0049b<AbstractC0745f, C0749b>.C0053d c = this.f2813a.m4138c();
        while (c.hasNext() && !this.f2818f) {
            Map.Entry next = c.next();
            C0749b bVar = (C0749b) next.getValue();
            while (bVar.f2822a.compareTo(this.f2814b) < 0 && !this.f2818f && this.f2813a.contains(next.getKey())) {
                m1371d(bVar.f2822a);
                bVar.m1369a(gVar, m1370e(bVar.f2822a));
                m1375c();
            }
        }
    }

    /* renamed from: b */
    private boolean m1380b() {
        if (this.f2813a.size() == 0) {
            return true;
        }
        AbstractC0742e.EnumC0744b bVar = this.f2813a.m4140b().getValue().f2822a;
        AbstractC0742e.EnumC0744b bVar2 = this.f2813a.m4137d().getValue().f2822a;
        return bVar == bVar2 && this.f2814b == bVar2;
    }

    /* renamed from: c */
    private AbstractC0742e.EnumC0744b m1373c(AbstractC0745f fVar) {
        Map.Entry<AbstractC0745f, C0749b> b = this.f2813a.m4144b(fVar);
        AbstractC0742e.EnumC0744b bVar = null;
        AbstractC0742e.EnumC0744b bVar2 = b != null ? b.getValue().f2822a : null;
        if (!this.f2819g.isEmpty()) {
            ArrayList<AbstractC0742e.EnumC0744b> arrayList = this.f2819g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m1383a(m1383a(this.f2814b, bVar2), bVar);
    }

    /* renamed from: c */
    private void m1375c() {
        ArrayList<AbstractC0742e.EnumC0744b> arrayList = this.f2819g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: c */
    private void m1374c(AbstractC0742e.EnumC0744b bVar) {
        if (this.f2814b != bVar) {
            this.f2814b = bVar;
            if (this.f2817e || this.f2816d != 0) {
                this.f2818f = true;
                return;
            }
            this.f2817e = true;
            m1372d();
            this.f2817e = false;
        }
    }

    /* renamed from: d */
    private void m1372d() {
        AbstractC0746g gVar = this.f2815c.get();
        if (gVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            boolean b = m1380b();
            this.f2818f = false;
            if (!b) {
                if (this.f2814b.compareTo(this.f2813a.m4140b().getValue().f2822a) < 0) {
                    m1381a(gVar);
                }
                Map.Entry<AbstractC0745f, C0749b> d = this.f2813a.m4137d();
                if (!this.f2818f && d != null && this.f2814b.compareTo(d.getValue().f2822a) > 0) {
                    m1376b(gVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private void m1371d(AbstractC0742e.EnumC0744b bVar) {
        this.f2819g.add(bVar);
    }

    /* renamed from: e */
    private static AbstractC0742e.EnumC0743a m1370e(AbstractC0742e.EnumC0744b bVar) {
        int i = C0748a.f2821b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC0742e.EnumC0743a.ON_START;
            }
            if (i == 3) {
                return AbstractC0742e.EnumC0743a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return AbstractC0742e.EnumC0743a.ON_CREATE;
    }

    @Override // androidx.lifecycle.AbstractC0742e
    /* renamed from: a */
    public AbstractC0742e.EnumC0744b mo1386a() {
        return this.f2814b;
    }

    /* renamed from: a */
    public void m1385a(AbstractC0742e.EnumC0743a aVar) {
        m1374c(m1379b(aVar));
    }

    /* renamed from: a */
    public void m1384a(AbstractC0742e.EnumC0744b bVar) {
        m1374c(bVar);
    }

    @Override // androidx.lifecycle.AbstractC0742e
    /* renamed from: a */
    public void mo1382a(AbstractC0745f fVar) {
        AbstractC0746g gVar;
        AbstractC0742e.EnumC0744b bVar = this.f2814b;
        AbstractC0742e.EnumC0744b bVar2 = AbstractC0742e.EnumC0744b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0742e.EnumC0744b.INITIALIZED;
        }
        C0749b bVar3 = new C0749b(fVar, bVar2);
        if (this.f2813a.mo4139b(fVar, bVar3) == null && (gVar = this.f2815c.get()) != null) {
            boolean z = this.f2816d != 0 || this.f2817e;
            AbstractC0742e.EnumC0744b c = m1373c(fVar);
            this.f2816d++;
            while (bVar3.f2822a.compareTo(c) < 0 && this.f2813a.contains(fVar)) {
                m1371d(bVar3.f2822a);
                bVar3.m1369a(gVar, m1370e(bVar3.f2822a));
                m1375c();
                c = m1373c(fVar);
            }
            if (!z) {
                m1372d();
            }
            this.f2816d--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0742e
    /* renamed from: b */
    public void mo1377b(AbstractC0745f fVar) {
        this.f2813a.remove(fVar);
    }
}
