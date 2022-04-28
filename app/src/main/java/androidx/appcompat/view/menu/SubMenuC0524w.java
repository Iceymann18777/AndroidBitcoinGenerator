package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p018g.p022f.p023a.AbstractSubMenuC0157c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.w */
/* loaded from: classes.dex */
public class SubMenuC0524w extends MenuC0518s implements SubMenu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0524w(Context context, AbstractSubMenuC0157c cVar) {
        super(context, cVar);
    }

    /* renamed from: c */
    public AbstractSubMenuC0157c m2292c() {
        return (AbstractSubMenuC0157c) this.f1646a;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        m2292c().clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m2442a(m2292c().getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m2292c().setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m2292c().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m2292c().setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m2292c().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m2292c().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        m2292c().setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        m2292c().setIcon(drawable);
        return this;
    }
}
