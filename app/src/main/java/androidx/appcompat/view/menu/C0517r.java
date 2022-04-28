package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p018g.p022f.p023a.AbstractMenuC0155a;
import p000a.p018g.p022f.p023a.AbstractMenuItemC0156b;
import p000a.p018g.p022f.p023a.AbstractSubMenuC0157c;

/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes.dex */
public final class C0517r {
    /* renamed from: a */
    public static Menu m2315a(Context context, AbstractMenuC0155a aVar) {
        return new MenuC0518s(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m2314a(Context context, AbstractMenuItemC0156b bVar) {
        return Build.VERSION.SDK_INT >= 16 ? new C0508m(context, bVar) : new MenuItemC0503l(context, bVar);
    }

    /* renamed from: a */
    public static SubMenu m2313a(Context context, AbstractSubMenuC0157c cVar) {
        return new SubMenuC0524w(context, cVar);
    }
}
