package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p000a.p018g.p029l.C0185a;
import p000a.p018g.p029l.p030a0.C0191c;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C0854k extends C0185a {

    /* renamed from: c */
    final C0813j f3255c;

    /* renamed from: d */
    final C0185a f3256d = new C0855a(this);

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    public static class C0855a extends C0185a {

        /* renamed from: c */
        final C0854k f3257c;

        public C0855a(C0854k kVar) {
            this.f3257c = kVar;
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(View view, C0191c cVar) {
            super.mo143a(view, cVar);
            if (!this.f3257c.m580c() && this.f3257c.f3255c.getLayoutManager() != null) {
                this.f3257c.f3255c.getLayoutManager().m763a(view, cVar);
            }
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public boolean mo579a(View view, int i, Bundle bundle) {
            if (super.mo579a(view, i, bundle)) {
                return true;
            }
            if (this.f3257c.m580c() || this.f3257c.f3255c.getLayoutManager() == null) {
                return false;
            }
            return this.f3257c.f3255c.getLayoutManager().m767a(view, i, bundle);
        }
    }

    public C0854k(C0813j jVar) {
        this.f3255c = jVar;
    }

    @Override // p000a.p018g.p029l.C0185a
    /* renamed from: a */
    public void mo143a(View view, C0191c cVar) {
        super.mo143a(view, cVar);
        cVar.m3538a((CharSequence) C0813j.class.getName());
        if (!m580c() && this.f3255c.getLayoutManager() != null) {
            this.f3255c.getLayoutManager().m777a(cVar);
        }
    }

    @Override // p000a.p018g.p029l.C0185a
    /* renamed from: a */
    public boolean mo579a(View view, int i, Bundle bundle) {
        if (super.mo579a(view, i, bundle)) {
            return true;
        }
        if (m580c() || this.f3255c.getLayoutManager() == null) {
            return false;
        }
        return this.f3255c.getLayoutManager().m782a(i, bundle);
    }

    /* renamed from: b */
    public C0185a m581b() {
        return this.f3256d;
    }

    @Override // p000a.p018g.p029l.C0185a
    /* renamed from: b */
    public void mo150b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo150b(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0813j.class.getName());
        if ((view instanceof C0813j) && !m580c()) {
            C0813j jVar = (C0813j) view;
            if (jVar.getLayoutManager() != null) {
                jVar.getLayoutManager().mo757a(accessibilityEvent);
            }
        }
    }

    /* renamed from: c */
    boolean m580c() {
        return this.f3255c.m929j();
    }
}
