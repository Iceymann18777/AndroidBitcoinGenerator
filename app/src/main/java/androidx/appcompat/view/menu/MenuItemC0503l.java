package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000a.p001a.p006m.AbstractC0031c;
import p000a.p018g.p022f.p023a.AbstractMenuItemC0156b;
import p000a.p018g.p029l.AbstractC0197b;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class MenuItemC0503l extends AbstractC0485c<AbstractMenuItemC0156b> implements MenuItem {

    /* renamed from: e */
    private Method f1765e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    public class C0504a extends AbstractC0197b {

        /* renamed from: b */
        final ActionProvider f1766b;

        public C0504a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1766b = actionProvider;
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: a */
        public void mo2343a(SubMenu subMenu) {
            this.f1766b.onPrepareSubMenu(MenuItemC0503l.this.m2441a(subMenu));
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: a */
        public boolean mo2344a() {
            return this.f1766b.hasSubMenu();
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: c */
        public View mo2342c() {
            return this.f1766b.onCreateActionView();
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: d */
        public boolean mo2341d() {
            return this.f1766b.onPerformDefaultAction();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes.dex */
    static class C0505b extends FrameLayout implements AbstractC0031c {

        /* renamed from: b */
        final CollapsibleActionView f1768b;

        C0505b(View view) {
            super(view.getContext());
            this.f1768b = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m2340a() {
            return (View) this.f1768b;
        }

        @Override // p000a.p001a.p006m.AbstractC0031c
        /* renamed from: b */
        public void mo2232b() {
            this.f1768b.onActionViewExpanded();
        }

        @Override // p000a.p001a.p006m.AbstractC0031c
        /* renamed from: c */
        public void mo2227c() {
            this.f1768b.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$c */
    /* loaded from: classes.dex */
    private class MenuItem$OnActionExpandListenerC0506c extends C0486d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        MenuItem$OnActionExpandListenerC0506c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1646a).onMenuItemActionCollapse(MenuItemC0503l.this.m2442a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1646a).onMenuItemActionExpand(MenuItemC0503l.this.m2442a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$d */
    /* loaded from: classes.dex */
    private class MenuItem$OnMenuItemClickListenerC0507d extends C0486d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        MenuItem$OnMenuItemClickListenerC0507d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1646a).onMenuItemClick(MenuItemC0503l.this.m2442a(menuItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemC0503l(Context context, AbstractMenuItemC0156b bVar) {
        super(context, bVar);
    }

    /* renamed from: a */
    C0504a mo2339a(ActionProvider actionProvider) {
        return new C0504a(this.f1643b, actionProvider);
    }

    /* renamed from: a */
    public void m2345a(boolean z) {
        try {
            if (this.f1765e == null) {
                this.f1765e = ((AbstractMenuItemC0156b) this.f1646a).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1765e.invoke(this.f1646a, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((AbstractMenuItemC0156b) this.f1646a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((AbstractMenuItemC0156b) this.f1646a).expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0197b a = ((AbstractMenuItemC0156b) this.f1646a).mo2370a();
        if (a instanceof C0504a) {
            return ((C0504a) a).f1766b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((AbstractMenuItemC0156b) this.f1646a).getActionView();
        return actionView instanceof C0505b ? ((C0505b) actionView).m2340a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((AbstractMenuItemC0156b) this.f1646a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((AbstractMenuItemC0156b) this.f1646a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((AbstractMenuItemC0156b) this.f1646a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((AbstractMenuItemC0156b) this.f1646a).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((AbstractMenuItemC0156b) this.f1646a).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((AbstractMenuItemC0156b) this.f1646a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((AbstractMenuItemC0156b) this.f1646a).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((AbstractMenuItemC0156b) this.f1646a).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((AbstractMenuItemC0156b) this.f1646a).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((AbstractMenuItemC0156b) this.f1646a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((AbstractMenuItemC0156b) this.f1646a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((AbstractMenuItemC0156b) this.f1646a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((AbstractMenuItemC0156b) this.f1646a).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m2441a(((AbstractMenuItemC0156b) this.f1646a).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((AbstractMenuItemC0156b) this.f1646a).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((AbstractMenuItemC0156b) this.f1646a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((AbstractMenuItemC0156b) this.f1646a).getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((AbstractMenuItemC0156b) this.f1646a).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((AbstractMenuItemC0156b) this.f1646a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((AbstractMenuItemC0156b) this.f1646a).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((AbstractMenuItemC0156b) this.f1646a).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((AbstractMenuItemC0156b) this.f1646a).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((AbstractMenuItemC0156b) this.f1646a).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((AbstractMenuItemC0156b) this.f1646a).mo2369a(actionProvider != null ? mo2339a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((AbstractMenuItemC0156b) this.f1646a).setActionView(i);
        View actionView = ((AbstractMenuItemC0156b) this.f1646a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((AbstractMenuItemC0156b) this.f1646a).setActionView(new C0505b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0505b(view);
        }
        ((AbstractMenuItemC0156b) this.f1646a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        ((AbstractMenuItemC0156b) this.f1646a).setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((AbstractMenuItemC0156b) this.f1646a).setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((AbstractMenuItemC0156b) this.f1646a).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((AbstractMenuItemC0156b) this.f1646a).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((AbstractMenuItemC0156b) this.f1646a).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((AbstractMenuItemC0156b) this.f1646a).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((AbstractMenuItemC0156b) this.f1646a).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((AbstractMenuItemC0156b) this.f1646a).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((AbstractMenuItemC0156b) this.f1646a).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((AbstractMenuItemC0156b) this.f1646a).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((AbstractMenuItemC0156b) this.f1646a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        ((AbstractMenuItemC0156b) this.f1646a).setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        ((AbstractMenuItemC0156b) this.f1646a).setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((AbstractMenuItemC0156b) this.f1646a).setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC0506c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((AbstractMenuItemC0156b) this.f1646a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC0507d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        ((AbstractMenuItemC0156b) this.f1646a).setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((AbstractMenuItemC0156b) this.f1646a).setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((AbstractMenuItemC0156b) this.f1646a).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((AbstractMenuItemC0156b) this.f1646a).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((AbstractMenuItemC0156b) this.f1646a).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((AbstractMenuItemC0156b) this.f1646a).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((AbstractMenuItemC0156b) this.f1646a).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((AbstractMenuItemC0156b) this.f1646a).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((AbstractMenuItemC0156b) this.f1646a).setVisible(z);
    }
}
