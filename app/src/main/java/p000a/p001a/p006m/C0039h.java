package p000a.p001a.p006m;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p018g.p029l.AbstractC0227w;
import p000a.p018g.p029l.C0223v;
import p000a.p018g.p029l.C0228x;

/* renamed from: a.a.m.h */
/* loaded from: classes.dex */
public class C0039h {

    /* renamed from: c */
    private Interpolator f149c;

    /* renamed from: d */
    AbstractC0227w f150d;

    /* renamed from: e */
    private boolean f151e;

    /* renamed from: b */
    private long f148b = -1;

    /* renamed from: f */
    private final C0228x f152f = new C0040a();

    /* renamed from: a */
    final ArrayList<C0223v> f147a = new ArrayList<>();

    /* renamed from: a.a.m.h$a */
    /* loaded from: classes.dex */
    class C0040a extends C0228x {

        /* renamed from: a */
        private boolean f153a = false;

        /* renamed from: b */
        private int f154b = 0;

        C0040a() {
        }

        /* renamed from: a */
        void m4149a() {
            this.f154b = 0;
            this.f153a = false;
            C0039h.this.m4151b();
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(View view) {
            int i = this.f154b + 1;
            this.f154b = i;
            if (i == C0039h.this.f147a.size()) {
                AbstractC0227w wVar = C0039h.this.f150d;
                if (wVar != null) {
                    wVar.mo1850a(null);
                }
                m4149a();
            }
        }

        @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(View view) {
            if (!this.f153a) {
                this.f153a = true;
                AbstractC0227w wVar = C0039h.this.f150d;
                if (wVar != null) {
                    wVar.mo1849b(null);
                }
            }
        }
    }

    /* renamed from: a */
    public C0039h m4156a(long j) {
        if (!this.f151e) {
            this.f148b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0039h m4155a(C0223v vVar) {
        if (!this.f151e) {
            this.f147a.add(vVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0039h m4154a(C0223v vVar, C0223v vVar2) {
        this.f147a.add(vVar);
        vVar2.m3364b(vVar.m3366b());
        this.f147a.add(vVar2);
        return this;
    }

    /* renamed from: a */
    public C0039h m4153a(AbstractC0227w wVar) {
        if (!this.f151e) {
            this.f150d = wVar;
        }
        return this;
    }

    /* renamed from: a */
    public C0039h m4152a(Interpolator interpolator) {
        if (!this.f151e) {
            this.f149c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void m4157a() {
        if (this.f151e) {
            Iterator<C0223v> it = this.f147a.iterator();
            while (it.hasNext()) {
                it.next().m3373a();
            }
            this.f151e = false;
        }
    }

    /* renamed from: b */
    void m4151b() {
        this.f151e = false;
    }

    /* renamed from: c */
    public void m4150c() {
        if (!this.f151e) {
            Iterator<C0223v> it = this.f147a.iterator();
            while (it.hasNext()) {
                C0223v next = it.next();
                long j = this.f148b;
                if (j >= 0) {
                    next.m3371a(j);
                }
                Interpolator interpolator = this.f149c;
                if (interpolator != null) {
                    next.m3367a(interpolator);
                }
                if (this.f150d != null) {
                    next.m3370a(this.f152f);
                }
                next.m3363c();
            }
            this.f151e = true;
        }
    }
}
