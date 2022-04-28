package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.graphics.drawable.C0698a;
import p000a.p018g.p019d.C0124a;
import p000a.p018g.p022f.p023a.AbstractMenuItemC0156b;
import p000a.p018g.p029l.AbstractC0197b;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public class C0483a implements AbstractMenuItemC0156b {

    /* renamed from: a */
    private final int f1615a;

    /* renamed from: b */
    private final int f1616b;

    /* renamed from: c */
    private final int f1617c;

    /* renamed from: d */
    private CharSequence f1618d;

    /* renamed from: e */
    private CharSequence f1619e;

    /* renamed from: f */
    private Intent f1620f;

    /* renamed from: g */
    private char f1621g;

    /* renamed from: i */
    private char f1623i;

    /* renamed from: k */
    private Drawable f1625k;

    /* renamed from: l */
    private Context f1626l;

    /* renamed from: m */
    private CharSequence f1627m;

    /* renamed from: n */
    private CharSequence f1628n;

    /* renamed from: h */
    private int f1622h = 4096;

    /* renamed from: j */
    private int f1624j = 4096;

    /* renamed from: o */
    private ColorStateList f1629o = null;

    /* renamed from: p */
    private PorterDuff.Mode f1630p = null;

    /* renamed from: q */
    private boolean f1631q = false;

    /* renamed from: r */
    private boolean f1632r = false;

    /* renamed from: s */
    private int f1633s = 16;

    public C0483a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1626l = context;
        this.f1615a = i2;
        this.f1616b = i;
        this.f1617c = i4;
        this.f1618d = charSequence;
    }

    /* renamed from: b */
    private void m2448b() {
        if (this.f1625k == null) {
            return;
        }
        if (this.f1631q || this.f1632r) {
            this.f1625k = C0698a.m1591h(this.f1625k);
            this.f1625k = this.f1625k.mutate();
            if (this.f1631q) {
                C0698a.m1603a(this.f1625k, this.f1629o);
            }
            if (this.f1632r) {
                C0698a.m1600a(this.f1625k, this.f1630p);
            }
        }
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
    /* renamed from: a */
    public AbstractMenuItemC0156b mo2369a(AbstractC0197b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
    /* renamed from: a */
    public AbstractC0197b mo2370a() {
        return null;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1624j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1623i;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1627m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1616b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1625k;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1629o;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1630p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1620f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1615a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1622h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1621g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1617c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1618d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1619e;
        return charSequence != null ? charSequence : this.f1618d;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1628n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1633s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1633s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1633s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1633s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f1623i = Character.toLowerCase(c);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1623i = Character.toLowerCase(c);
        this.f1624j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1633s = (z ? 1 : 0) | (this.f1633s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1633s = (z ? 2 : 0) | (this.f1633s & (-3));
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setContentDescription(CharSequence charSequence) {
        this.f1627m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1633s = (z ? 16 : 0) | (this.f1633s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1625k = C0124a.m3732b(this.f1626l, i);
        m2448b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1625k = drawable;
        m2448b();
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1629o = colorStateList;
        this.f1631q = true;
        m2448b();
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1630p = mode;
        this.f1632r = true;
        m2448b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1620f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f1621g = c;
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f1621g = c;
        this.f1622h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1621g = c;
        this.f1623i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1621g = c;
        this.f1622h = KeyEvent.normalizeMetaState(i);
        this.f1623i = Character.toLowerCase(c2);
        this.f1624j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1618d = this.f1626l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1618d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1619e = charSequence;
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setTooltipText(CharSequence charSequence) {
        this.f1628n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1633s & 8;
        if (z) {
            i = 0;
        }
        this.f1633s = i2 | i;
        return this;
    }
}
