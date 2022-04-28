package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p018g.p022f.p023a.AbstractMenuC0155a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes.dex */
public class MenuC0518s extends AbstractC0485c<AbstractMenuC0155a> implements Menu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuC0518s(Context context, AbstractMenuC0155a aVar) {
        super(context, aVar);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m2442a(((AbstractMenuC0155a) this.f1646a).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2442a(((AbstractMenuC0155a) this.f1646a).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2442a(((AbstractMenuC0155a) this.f1646a).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m2442a(((AbstractMenuC0155a) this.f1646a).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((AbstractMenuC0155a) this.f1646a).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m2442a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m2441a(((AbstractMenuC0155a) this.f1646a).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m2441a(((AbstractMenuC0155a) this.f1646a).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m2441a(((AbstractMenuC0155a) this.f1646a).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m2441a(((AbstractMenuC0155a) this.f1646a).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m2440b();
        ((AbstractMenuC0155a) this.f1646a).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((AbstractMenuC0155a) this.f1646a).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m2442a(((AbstractMenuC0155a) this.f1646a).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m2442a(((AbstractMenuC0155a) this.f1646a).getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((AbstractMenuC0155a) this.f1646a).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((AbstractMenuC0155a) this.f1646a).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((AbstractMenuC0155a) this.f1646a).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((AbstractMenuC0155a) this.f1646a).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m2443a(i);
        ((AbstractMenuC0155a) this.f1646a).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m2439b(i);
        ((AbstractMenuC0155a) this.f1646a).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((AbstractMenuC0155a) this.f1646a).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((AbstractMenuC0155a) this.f1646a).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((AbstractMenuC0155a) this.f1646a).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((AbstractMenuC0155a) this.f1646a).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((AbstractMenuC0155a) this.f1646a).size();
    }
}
