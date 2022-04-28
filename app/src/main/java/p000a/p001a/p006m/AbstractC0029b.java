package p000a.p001a.p006m;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.a.m.b */
/* loaded from: classes.dex */
public abstract class AbstractC0029b {

    /* renamed from: b */
    private Object f87b;

    /* renamed from: c */
    private boolean f88c;

    /* renamed from: a.a.m.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC0030a {
        /* renamed from: a */
        void mo2545a(AbstractC0029b bVar);

        /* renamed from: a */
        boolean mo2544a(AbstractC0029b bVar, Menu menu);

        /* renamed from: a */
        boolean mo2543a(AbstractC0029b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo2542b(AbstractC0029b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo2472a();

    /* renamed from: a */
    public abstract void mo2471a(int i);

    /* renamed from: a */
    public abstract void mo2470a(View view);

    /* renamed from: a */
    public abstract void mo2469a(CharSequence charSequence);

    /* renamed from: a */
    public void m4178a(Object obj) {
        this.f87b = obj;
    }

    /* renamed from: a */
    public void mo2468a(boolean z) {
        this.f88c = z;
    }

    /* renamed from: b */
    public abstract View mo2467b();

    /* renamed from: b */
    public abstract void mo2466b(int i);

    /* renamed from: b */
    public abstract void mo2465b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo2464c();

    /* renamed from: d */
    public abstract MenuInflater mo2463d();

    /* renamed from: e */
    public abstract CharSequence mo2462e();

    /* renamed from: f */
    public Object m4177f() {
        return this.f87b;
    }

    /* renamed from: g */
    public abstract CharSequence mo2461g();

    /* renamed from: h */
    public boolean m4176h() {
        return this.f88c;
    }

    /* renamed from: i */
    public abstract void mo2460i();

    /* renamed from: j */
    public abstract boolean mo2459j();
}
