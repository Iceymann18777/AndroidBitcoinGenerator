package p000a.p001a.p006m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0517r;
import java.util.ArrayList;

import p000a.p013d.C0080g;
import p000a.p018g.p022f.p023a.AbstractMenuC0155a;
import p000a.p018g.p022f.p023a.AbstractMenuItemC0156b;

/* renamed from: a.a.m.f */
/* loaded from: classes.dex */
public class C0034f extends ActionMode {

    /* renamed from: a */
    final Context f100a;

    /* renamed from: b */
    final AbstractC0029b f101b;

    /* renamed from: a.a.m.f$a */
    /* loaded from: classes.dex */
    public static class C0035a implements AbstractC0029b.AbstractC0030a {

        /* renamed from: a */
        final ActionMode.Callback f102a;

        /* renamed from: b */
        final Context f103b;

        /* renamed from: c */
        final ArrayList<C0034f> f104c = new ArrayList<>();

        /* renamed from: d */
        final C0080g<Menu, Menu> f105d = new C0080g<>();

        public C0035a(Context context, ActionMode.Callback callback) {
            this.f103b = context;
            this.f102a = callback;
        }

        /* renamed from: a */
        private Menu m4171a(Menu menu) {
            Menu menu2 = this.f105d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0517r.m2315a(this.f103b, (AbstractMenuC0155a) menu);
            this.f105d.put(menu, a);
            return a;
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public void mo2545a(AbstractC0029b bVar) {
            this.f102a.onDestroyActionMode(m4170b(bVar));
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public boolean mo2544a(AbstractC0029b bVar, Menu menu) {
            return this.f102a.onPrepareActionMode(m4170b(bVar), m4171a(menu));
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public boolean mo2543a(AbstractC0029b bVar, MenuItem menuItem) {
            return this.f102a.onActionItemClicked(m4170b(bVar), C0517r.m2314a(this.f103b, (AbstractMenuItemC0156b) menuItem));
        }

        /* renamed from: b */
        public ActionMode m4170b(AbstractC0029b bVar) {
            int size = this.f104c.size();
            for (int i = 0; i < size; i++) {
                C0034f fVar = this.f104c.get(i);
                if (fVar != null && fVar.f101b == bVar) {
                    return fVar;
                }
            }
            C0034f fVar2 = new C0034f(this.f103b, bVar);
            this.f104c.add(fVar2);
            return fVar2;
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: b */
        public boolean mo2542b(AbstractC0029b bVar, Menu menu) {
            return this.f102a.onCreateActionMode(m4170b(bVar), m4171a(menu));
        }
    }

    public C0034f(Context context, AbstractC0029b bVar) {
        this.f100a = context;
        this.f101b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f101b.mo2472a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f101b.mo2467b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return C0517r.m2315a(this.f100a, (AbstractMenuC0155a) this.f101b.mo2464c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f101b.mo2463d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f101b.mo2462e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f101b.m4177f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f101b.mo2461g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f101b.m4176h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f101b.mo2460i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f101b.mo2459j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f101b.mo2470a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f101b.mo2471a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f101b.mo2469a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f101b.m4178a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f101b.mo2466b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f101b.mo2465b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f101b.mo2468a(z);
    }
}
