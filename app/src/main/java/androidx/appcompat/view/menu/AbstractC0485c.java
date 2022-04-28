package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p000a.p013d.C0067a;
import p000a.p018g.p022f.p023a.AbstractMenuItemC0156b;
import p000a.p018g.p022f.p023a.AbstractSubMenuC0157c;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
abstract class AbstractC0485c<T> extends C0486d<T> {

    /* renamed from: b */
    final Context f1643b;

    /* renamed from: c */
    private Map<AbstractMenuItemC0156b, MenuItem> f1644c;

    /* renamed from: d */
    private Map<AbstractSubMenuC0157c, SubMenu> f1645d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0485c(Context context, T t) {
        super(t);
        this.f1643b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem m2442a(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC0156b)) {
            return menuItem;
        }
        AbstractMenuItemC0156b bVar = (AbstractMenuItemC0156b) menuItem;
        if (this.f1644c == null) {
            this.f1644c = new C0067a();
        }
        MenuItem menuItem2 = this.f1644c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0517r.m2314a(this.f1643b, bVar);
        this.f1644c.put(bVar, a);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu m2441a(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuC0157c)) {
            return subMenu;
        }
        AbstractSubMenuC0157c cVar = (AbstractSubMenuC0157c) subMenu;
        if (this.f1645d == null) {
            this.f1645d = new C0067a();
        }
        SubMenu subMenu2 = this.f1645d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu a = C0517r.m2313a(this.f1643b, cVar);
        this.f1645d.put(cVar, a);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2443a(int i) {
        Map<AbstractMenuItemC0156b, MenuItem> map = this.f1644c;
        if (map != null) {
            Iterator<AbstractMenuItemC0156b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m2440b() {
        Map<AbstractMenuItemC0156b, MenuItem> map = this.f1644c;
        if (map != null) {
            map.clear();
        }
        Map<AbstractSubMenuC0157c, SubMenu> map2 = this.f1645d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m2439b(int i) {
        Map<AbstractMenuItemC0156b, MenuItem> map = this.f1644c;
        if (map != null) {
            Iterator<AbstractMenuItemC0156b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
