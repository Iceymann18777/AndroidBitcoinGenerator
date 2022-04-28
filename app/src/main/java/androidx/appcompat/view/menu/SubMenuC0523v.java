package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.appcompat.view.menu.v */
/* loaded from: classes.dex */
public class SubMenuC0523v extends C0496h implements SubMenu {

    /* renamed from: B */
    private C0496h f1809B;

    /* renamed from: C */
    private C0501k f1810C;

    public SubMenuC0523v(Context context, C0496h hVar, C0501k kVar) {
        super(context);
        this.f1809B = hVar;
        this.f1810C = kVar;
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: a */
    public void mo2302a(C0496h.AbstractC0497a aVar) {
        this.f1809B.mo2302a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: a */
    public boolean mo2301a(C0496h hVar, MenuItem menuItem) {
        return super.mo2301a(hVar, menuItem) || this.f1809B.mo2301a(hVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: a */
    public boolean mo2300a(C0501k kVar) {
        return this.f1809B.mo2300a(kVar);
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: b */
    public boolean mo2299b(C0501k kVar) {
        return this.f1809B.mo2299b(kVar);
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: d */
    public String mo2298d() {
        C0501k kVar = this.f1810C;
        int itemId = kVar != null ? kVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo2298d() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1810C;
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: m */
    public C0496h mo2297m() {
        return this.f1809B.mo2297m();
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: o */
    public boolean mo2296o() {
        return this.f1809B.mo2296o();
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: p */
    public boolean mo2295p() {
        return this.f1809B.mo2295p();
    }

    @Override // androidx.appcompat.view.menu.C0496h
    /* renamed from: q */
    public boolean mo2294q() {
        return this.f1809B.mo2294q();
    }

    @Override // androidx.appcompat.view.menu.C0496h, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1809B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.m2392d(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m2414a(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.m2387e(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m2405a(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.m2409a(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1810C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1810C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0496h, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1809B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu m2293t() {
        return this.f1809B;
    }
}
