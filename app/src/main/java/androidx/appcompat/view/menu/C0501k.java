package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.core.graphics.drawable.C0698a;
import p000a.p001a.C0007h;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p018g.p022f.p023a.AbstractMenuItemC0156b;
import p000a.p018g.p029l.AbstractC0197b;

/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public final class C0501k implements AbstractMenuItemC0156b {

    /* renamed from: A */
    private View f1733A;

    /* renamed from: B */
    private AbstractC0197b f1734B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1735C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1737E;

    /* renamed from: a */
    private final int f1738a;

    /* renamed from: b */
    private final int f1739b;

    /* renamed from: c */
    private final int f1740c;

    /* renamed from: d */
    private final int f1741d;

    /* renamed from: e */
    private CharSequence f1742e;

    /* renamed from: f */
    private CharSequence f1743f;

    /* renamed from: g */
    private Intent f1744g;

    /* renamed from: h */
    private char f1745h;

    /* renamed from: j */
    private char f1747j;

    /* renamed from: l */
    private Drawable f1749l;

    /* renamed from: n */
    C0496h f1751n;

    /* renamed from: o */
    private SubMenuC0523v f1752o;

    /* renamed from: p */
    private Runnable f1753p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1754q;

    /* renamed from: r */
    private CharSequence f1755r;

    /* renamed from: s */
    private CharSequence f1756s;

    /* renamed from: z */
    private int f1763z;

    /* renamed from: i */
    private int f1746i = 4096;

    /* renamed from: k */
    private int f1748k = 4096;

    /* renamed from: m */
    private int f1750m = 0;

    /* renamed from: t */
    private ColorStateList f1757t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1758u = null;

    /* renamed from: v */
    private boolean f1759v = false;

    /* renamed from: w */
    private boolean f1760w = false;

    /* renamed from: x */
    private boolean f1761x = false;

    /* renamed from: y */
    private int f1762y = 16;

    /* renamed from: D */
    private boolean f1736D = false;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* loaded from: classes.dex */
    class C0502a implements AbstractC0197b.AbstractC0199b {
        C0502a() {
        }

        @Override // p000a.p018g.p029l.AbstractC0197b.AbstractC0199b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0501k kVar = C0501k.this;
            kVar.f1751n.m2390d(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0501k(C0496h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1763z = 0;
        this.f1751n = hVar;
        this.f1738a = i2;
        this.f1739b = i;
        this.f1740c = i3;
        this.f1741d = i4;
        this.f1742e = charSequence;
        this.f1763z = i5;
    }

    /* renamed from: a */
    private Drawable m2368a(Drawable drawable) {
        if (drawable != null && this.f1761x && (this.f1759v || this.f1760w)) {
            drawable = C0698a.m1591h(drawable).mutate();
            if (this.f1759v) {
                C0698a.m1603a(drawable, this.f1757t);
            }
            if (this.f1760w) {
                C0698a.m1600a(drawable, this.f1758u);
            }
            this.f1761x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    private static void m2364a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
    /* renamed from: a */
    public AbstractMenuItemC0156b mo2369a(AbstractC0197b bVar) {
        AbstractC0197b bVar2 = this.f1734B;
        if (bVar2 != null) {
            bVar2.m3491f();
        }
        this.f1733A = null;
        this.f1734B = bVar;
        this.f1751n.mo87b(true);
        AbstractC0197b bVar3 = this.f1734B;
        if (bVar3 != null) {
            bVar3.mo2338a(new C0502a());
        }
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b
    /* renamed from: a */
    public AbstractC0197b mo2370a() {
        return this.f1734B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence m2366a(AbstractC0515q.AbstractC0516a aVar) {
        return (aVar == null || !aVar.mo149a()) ? getTitle() : getTitleCondensed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2367a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1737E = contextMenuInfo;
    }

    /* renamed from: a */
    public void m2365a(SubMenuC0523v vVar) {
        this.f1752o = vVar;
        vVar.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public void m2363a(boolean z) {
        this.f1736D = z;
        this.f1751n.mo87b(false);
    }

    /* renamed from: b */
    public void m2362b() {
        this.f1751n.m2394c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2361b(boolean z) {
        int i = this.f1762y;
        this.f1762y = (z ? 2 : 0) | (i & (-3));
        if (i != this.f1762y) {
            this.f1751n.mo87b(false);
        }
    }

    /* renamed from: c */
    public int m2360c() {
        return this.f1741d;
    }

    /* renamed from: c */
    public void m2359c(boolean z) {
        this.f1762y = (z ? 4 : 0) | (this.f1762y & (-5));
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1763z & 8) == 0) {
            return false;
        }
        if (this.f1733A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1735C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1751n.mo2300a(this);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public char m2358d() {
        return this.f1751n.mo2295p() ? this.f1747j : this.f1745h;
    }

    /* renamed from: d */
    public void m2357d(boolean z) {
        this.f1762y = z ? this.f1762y | 32 : this.f1762y & (-33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m2356e() {
        int i;
        char d = m2358d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f1751n.m2388e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1751n.m2388e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0007h.abc_prepend_shortcut_label));
        }
        int i2 = this.f1751n.mo2295p() ? this.f1748k : this.f1746i;
        m2364a(sb, i2, 65536, resources.getString(C0007h.abc_menu_meta_shortcut_label));
        m2364a(sb, i2, 4096, resources.getString(C0007h.abc_menu_ctrl_shortcut_label));
        m2364a(sb, i2, 2, resources.getString(C0007h.abc_menu_alt_shortcut_label));
        m2364a(sb, i2, 1, resources.getString(C0007h.abc_menu_shift_shortcut_label));
        m2364a(sb, i2, 4, resources.getString(C0007h.abc_menu_sym_shortcut_label));
        m2364a(sb, i2, 8, resources.getString(C0007h.abc_menu_function_shortcut_label));
        if (d == '\b') {
            i = C0007h.abc_menu_delete_shortcut_label;
        } else if (d == '\n') {
            i = C0007h.abc_menu_enter_shortcut_label;
        } else if (d != ' ') {
            sb.append(d);
            return sb.toString();
        } else {
            i = C0007h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m2355e(boolean z) {
        int i = this.f1762y;
        this.f1762y = (z ? 0 : 8) | (i & (-9));
        return i != this.f1762y;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m2354f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1735C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1751n.mo2299b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m2354f() {
        AbstractC0197b bVar;
        if ((this.f1763z & 8) == 0) {
            return false;
        }
        if (this.f1733A == null && (bVar = this.f1734B) != null) {
            this.f1733A = bVar.mo2337a(this);
        }
        return this.f1733A != null;
    }

    /* renamed from: g */
    public boolean m2353g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1754q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0496h hVar = this.f1751n;
        if (hVar.mo2301a(hVar, this)) {
            return true;
        }
        Runnable runnable = this.f1753p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1744g != null) {
            try {
                this.f1751n.m2388e().startActivity(this.f1744g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractC0197b bVar = this.f1734B;
        return bVar != null && bVar.mo2341d();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1733A;
        if (view != null) {
            return view;
        }
        AbstractC0197b bVar = this.f1734B;
        if (bVar == null) {
            return null;
        }
        this.f1733A = bVar.mo2337a(this);
        return this.f1733A;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1748k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1747j;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1755r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1739b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1749l;
        if (drawable != null) {
            return m2368a(drawable);
        }
        if (this.f1750m == 0) {
            return null;
        }
        Drawable c = C0010a.m4259c(this.f1751n.m2388e(), this.f1750m);
        this.f1750m = 0;
        this.f1749l = c;
        return m2368a(c);
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1757t;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1758u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1744g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1738a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1737E;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1746i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1745h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1740c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1752o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1742e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1743f;
        if (charSequence == null) {
            charSequence = this.f1742e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1756s;
    }

    /* renamed from: h */
    public boolean m2352h() {
        return (this.f1762y & 32) == 32;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1752o != null;
    }

    /* renamed from: i */
    public boolean m2351i() {
        return (this.f1762y & 4) != 0;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1736D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1762y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1762y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1762y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0197b bVar = this.f1734B;
        return (bVar == null || !bVar.mo2335e()) ? (this.f1762y & 8) == 0 : (this.f1762y & 8) == 0 && this.f1734B.mo2336b();
    }

    /* renamed from: j */
    public boolean m2350j() {
        return (this.f1763z & 1) == 1;
    }

    /* renamed from: k */
    public boolean m2349k() {
        return (this.f1763z & 2) == 2;
    }

    /* renamed from: l */
    public boolean m2348l() {
        return this.f1751n.m2377k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m2347m() {
        return this.f1751n.mo2294q() && m2358d() != 0;
    }

    /* renamed from: n */
    public boolean m2346n() {
        return (this.f1763z & 4) == 4;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setActionView(int i) {
        Context e = this.f1751n.m2388e();
        setActionView(LayoutInflater.from(e).inflate(i, (ViewGroup) new LinearLayout(e), false));
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setActionView(View view) {
        int i;
        this.f1733A = view;
        this.f1734B = null;
        if (view != null && view.getId() == -1 && (i = this.f1738a) > 0) {
            view.setId(i);
        }
        this.f1751n.m2394c(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1747j == c) {
            return this;
        }
        this.f1747j = Character.toLowerCase(c);
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1747j == c && this.f1748k == i) {
            return this;
        }
        this.f1747j = Character.toLowerCase(c);
        this.f1748k = KeyEvent.normalizeMetaState(i);
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1762y;
        this.f1762y = (z ? 1 : 0) | (i & (-2));
        if (i != this.f1762y) {
            this.f1751n.mo87b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1762y & 4) != 0) {
            this.f1751n.m2412a((MenuItem) this);
        } else {
            m2361b(z);
        }
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setContentDescription(CharSequence charSequence) {
        this.f1755r = charSequence;
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1762y = z ? this.f1762y | 16 : this.f1762y & (-17);
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1749l = null;
        this.f1750m = i;
        this.f1761x = true;
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1750m = 0;
        this.f1749l = drawable;
        this.f1761x = true;
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1757t = colorStateList;
        this.f1759v = true;
        this.f1761x = true;
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1758u = mode;
        this.f1760w = true;
        this.f1761x = true;
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1744g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f1745h == c) {
            return this;
        }
        this.f1745h = c;
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1745h == c && this.f1746i == i) {
            return this;
        }
        this.f1745h = c;
        this.f1746i = KeyEvent.normalizeMetaState(i);
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1735C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1754q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1745h = c;
        this.f1747j = Character.toLowerCase(c2);
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1745h = c;
        this.f1746i = KeyEvent.normalizeMetaState(i);
        this.f1747j = Character.toLowerCase(c2);
        this.f1748k = KeyEvent.normalizeMetaState(i2);
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1763z = i;
            this.f1751n.m2394c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f1751n.m2388e().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1742e = charSequence;
        this.f1751n.mo87b(false);
        SubMenuC0523v vVar = this.f1752o;
        if (vVar != null) {
            vVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1743f = charSequence;
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // p000a.p018g.p022f.p023a.AbstractMenuItemC0156b, android.view.MenuItem
    public AbstractMenuItemC0156b setTooltipText(CharSequence charSequence) {
        this.f1756s = charSequence;
        this.f1751n.mo87b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m2355e(z)) {
            this.f1751n.m2390d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1742e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
