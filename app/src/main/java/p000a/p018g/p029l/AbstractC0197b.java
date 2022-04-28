package p000a.p018g.p029l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a.g.l.b */
/* loaded from: classes.dex */
public abstract class AbstractC0197b {

    /* renamed from: a */
    private AbstractC0199b f647a;

    /* renamed from: a.g.l.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC0198a {
    }

    /* renamed from: a.g.l.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0199b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC0197b(Context context) {
    }

    /* renamed from: a */
    public View mo2337a(MenuItem menuItem) {
        return mo2342c();
    }

    /* renamed from: a */
    public void m3492a(AbstractC0198a aVar) {
    }

    /* renamed from: a */
    public void mo2338a(AbstractC0199b bVar) {
        if (!(this.f647a == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f647a = bVar;
    }

    /* renamed from: a */
    public void mo2343a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public boolean mo2344a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo2336b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo2342c();

    /* renamed from: d */
    public boolean mo2341d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo2335e() {
        return false;
    }

    /* renamed from: f */
    public void m3491f() {
        this.f647a = null;
    }
}
