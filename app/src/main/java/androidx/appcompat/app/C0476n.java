package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.widget.AbstractC0569b0;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0619m0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p001a.p006m.AbstractC0029b;
import p000a.p001a.p006m.C0028a;
import p000a.p001a.p006m.C0036g;
import p000a.p001a.p006m.C0039h;
import p000a.p018g.p029l.AbstractC0227w;
import p000a.p018g.p029l.AbstractC0229y;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0223v;
import p000a.p018g.p029l.C0228x;

/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes.dex */
public class C0476n extends AbstractC0428a implements ActionBarOverlayLayout.AbstractC0529d {

    /* renamed from: B */
    private static final Interpolator f1546B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f1547C = new DecelerateInterpolator();

    /* renamed from: a */
    Context f1549a;

    /* renamed from: b */
    private Context f1550b;

    /* renamed from: c */
    ActionBarOverlayLayout f1551c;

    /* renamed from: d */
    ActionBarContainer f1552d;

    /* renamed from: e */
    AbstractC0569b0 f1553e;

    /* renamed from: f */
    ActionBarContextView f1554f;

    /* renamed from: g */
    View f1555g;

    /* renamed from: h */
    C0619m0 f1556h;

    /* renamed from: i */
    private boolean f1557i;

    /* renamed from: j */
    C0480d f1558j;

    /* renamed from: k */
    AbstractC0029b f1559k;

    /* renamed from: l */
    AbstractC0029b.AbstractC0030a f1560l;

    /* renamed from: m */
    private boolean f1561m;

    /* renamed from: o */
    private boolean f1563o;

    /* renamed from: r */
    boolean f1566r;

    /* renamed from: s */
    boolean f1567s;

    /* renamed from: t */
    private boolean f1568t;

    /* renamed from: v */
    C0039h f1570v;

    /* renamed from: w */
    private boolean f1571w;

    /* renamed from: x */
    boolean f1572x;

    /* renamed from: n */
    private ArrayList<AbstractC0428a.AbstractC0430b> f1562n = new ArrayList<>();

    /* renamed from: p */
    private int f1564p = 0;

    /* renamed from: q */
    boolean f1565q = true;

    /* renamed from: u */
    private boolean f1569u = true;

    /* renamed from: y */
    final AbstractC0227w f1573y = new C0477a();

    /* renamed from: z */
    final AbstractC0227w f1574z = new C0478b();

    /* renamed from: A */
    final AbstractC0229y f1548A = new C0479c();

    /* renamed from: androidx.appcompat.app.n$a */
    /* loaded from: classes.dex */
    class C0477a extends C0228x {
        C0477a() {
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(View view) {
            View view2;
            C0476n nVar = C0476n.this;
            if (nVar.f1565q && (view2 = nVar.f1555g) != null) {
                view2.setTranslationY(0.0f);
                C0476n.this.f1552d.setTranslationY(0.0f);
            }
            C0476n.this.f1552d.setVisibility(8);
            C0476n.this.f1552d.setTransitioning(false);
            C0476n nVar2 = C0476n.this;
            nVar2.f1570v = null;
            nVar2.m2479l();
            ActionBarOverlayLayout actionBarOverlayLayout = C0476n.this.f1551c;
            if (actionBarOverlayLayout != null) {
                C0216r.m3449B(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.n$b */
    /* loaded from: classes.dex */
    class C0478b extends C0228x {
        C0478b() {
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(View view) {
            C0476n nVar = C0476n.this;
            nVar.f1570v = null;
            nVar.f1552d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.n$c */
    /* loaded from: classes.dex */
    class C0479c implements AbstractC0229y {
        C0479c() {
        }

        @Override // p000a.p018g.p029l.AbstractC0229y
        /* renamed from: a */
        public void mo2473a(View view) {
            ((View) C0476n.this.f1552d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.n$d */
    /* loaded from: classes.dex */
    public class C0480d extends AbstractC0029b implements C0496h.AbstractC0497a {

        /* renamed from: d */
        private final Context f1578d;

        /* renamed from: e */
        private final C0496h f1579e;

        /* renamed from: f */
        private AbstractC0029b.AbstractC0030a f1580f;

        /* renamed from: g */
        private WeakReference<View> f1581g;

        public C0480d(Context context, AbstractC0029b.AbstractC0030a aVar) {
            this.f1578d = context;
            this.f1580f = aVar;
            C0496h hVar = new C0496h(context);
            hVar.m2396c(1);
            this.f1579e = hVar;
            this.f1579e.mo2302a(this);
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2472a() {
            C0476n nVar = C0476n.this;
            if (nVar.f1558j == this) {
                if (!C0476n.m2495a(nVar.f1566r, nVar.f1567s, false)) {
                    C0476n nVar2 = C0476n.this;
                    nVar2.f1559k = this;
                    nVar2.f1560l = this.f1580f;
                } else {
                    this.f1580f.mo2545a(this);
                }
                this.f1580f = null;
                C0476n.this.m2489e(false);
                C0476n.this.f1554f.m2289a();
                C0476n.this.f1553e.mo1858l().sendAccessibilityEvent(32);
                C0476n nVar3 = C0476n.this;
                nVar3.f1551c.setHideOnContentScrollEnabled(nVar3.f1572x);
                C0476n.this.f1558j = null;
            }
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2471a(int i) {
            mo2469a((CharSequence) C0476n.this.f1549a.getResources().getString(i));
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2470a(View view) {
            C0476n.this.f1554f.setCustomView(view);
            this.f1581g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public void mo65a(C0496h hVar) {
            if (this.f1580f != null) {
                mo2460i();
                C0476n.this.f1554f.m2285d();
            }
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2469a(CharSequence charSequence) {
            C0476n.this.f1554f.setSubtitle(charSequence);
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: a */
        public void mo2468a(boolean z) {
            super.mo2468a(z);
            C0476n.this.f1554f.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public boolean mo64a(C0496h hVar, MenuItem menuItem) {
            AbstractC0029b.AbstractC0030a aVar = this.f1580f;
            if (aVar != null) {
                return aVar.mo2543a(this, menuItem);
            }
            return false;
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: b */
        public View mo2467b() {
            WeakReference<View> weakReference = this.f1581g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: b */
        public void mo2466b(int i) {
            mo2465b(C0476n.this.f1549a.getResources().getString(i));
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: b */
        public void mo2465b(CharSequence charSequence) {
            C0476n.this.f1554f.setTitle(charSequence);
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: c */
        public Menu mo2464c() {
            return this.f1579e;
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: d */
        public MenuInflater mo2463d() {
            return new C0036g(this.f1578d);
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: e */
        public CharSequence mo2462e() {
            return C0476n.this.f1554f.getSubtitle();
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: g */
        public CharSequence mo2461g() {
            return C0476n.this.f1554f.getTitle();
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: i */
        public void mo2460i() {
            if (C0476n.this.f1558j == this) {
                this.f1579e.m2373s();
                try {
                    this.f1580f.mo2544a(this, this.f1579e);
                } finally {
                    this.f1579e.m2374r();
                }
            }
        }

        @Override // p000a.p001a.p006m.AbstractC0029b
        /* renamed from: j */
        public boolean mo2459j() {
            return C0476n.this.f1554f.m2287b();
        }

        /* renamed from: k */
        public boolean m2458k() {
            this.f1579e.m2373s();
            try {
                return this.f1580f.mo2542b(this, this.f1579e);
            } finally {
                this.f1579e.m2374r();
            }
        }
    }

    public C0476n(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m2493b(decorView);
        if (!z) {
            this.f1555g = decorView.findViewById(16908290);
        }
    }

    public C0476n(Dialog dialog) {
        new ArrayList();
        m2493b(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private AbstractC0569b0 m2497a(View view) {
        if (view instanceof AbstractC0569b0) {
            return (AbstractC0569b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m2495a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m2493b(View view) {
        this.f1551c = (ActionBarOverlayLayout) view.findViewById(C0005f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1551c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1553e = m2497a(view.findViewById(C0005f.action_bar));
        this.f1554f = (ActionBarContextView) view.findViewById(C0005f.action_context_bar);
        this.f1552d = (ActionBarContainer) view.findViewById(C0005f.action_bar_container);
        AbstractC0569b0 b0Var = this.f1553e;
        if (b0Var == null || this.f1554f == null || this.f1552d == null) {
            throw new IllegalStateException(C0476n.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1549a = b0Var.mo1856n();
        boolean z = (this.f1553e.mo1862h() & 4) != 0;
        if (z) {
            this.f1557i = true;
        }
        C0028a a = C0028a.m4185a(this.f1549a);
        m2481j(a.m4186a() || z);
        m2480k(a.m4180f());
        TypedArray obtainStyledAttributes = this.f1549a.obtainStyledAttributes(null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0009j.ActionBar_hideOnContentScroll, false)) {
            m2482i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0009j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            m2503a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m2480k(boolean z) {
        this.f1563o = z;
        if (!this.f1563o) {
            this.f1553e.mo1880a((C0619m0) null);
            this.f1552d.setTabContainer(this.f1556h);
        } else {
            this.f1552d.setTabContainer(null);
            this.f1553e.mo1880a(this.f1556h);
        }
        boolean z2 = true;
        boolean z3 = m2477m() == 2;
        C0619m0 m0Var = this.f1556h;
        if (m0Var != null) {
            if (z3) {
                m0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1551c;
                if (actionBarOverlayLayout != null) {
                    C0216r.m3449B(actionBarOverlayLayout);
                }
            } else {
                m0Var.setVisibility(8);
            }
        }
        this.f1553e.mo1873b(!this.f1563o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1551c;
        if (this.f1563o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: l */
    private void m2478l(boolean z) {
        if (m2495a(this.f1566r, this.f1567s, this.f1568t)) {
            if (!this.f1569u) {
                this.f1569u = true;
                m2485g(z);
            }
        } else if (this.f1569u) {
            this.f1569u = false;
            m2487f(z);
        }
    }

    /* renamed from: n */
    private void m2476n() {
        if (this.f1568t) {
            this.f1568t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1551c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m2478l(false);
        }
    }

    /* renamed from: o */
    private boolean m2475o() {
        return C0216r.m3397x(this.f1552d);
    }

    /* renamed from: p */
    private void m2474p() {
        if (!this.f1568t) {
            this.f1568t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1551c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m2478l(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public AbstractC0029b mo2500a(AbstractC0029b.AbstractC0030a aVar) {
        C0480d dVar = this.f1558j;
        if (dVar != null) {
            dVar.mo2472a();
        }
        this.f1551c.setHideOnContentScrollEnabled(false);
        this.f1554f.m2286c();
        C0480d dVar2 = new C0480d(this.f1554f.getContext(), aVar);
        if (!dVar2.m2458k()) {
            return null;
        }
        this.f1558j = dVar2;
        dVar2.mo2460i();
        this.f1554f.m2288a(dVar2);
        m2489e(true);
        this.f1554f.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: a */
    public void mo2272a() {
        C0039h hVar = this.f1570v;
        if (hVar != null) {
            hVar.m4157a();
            this.f1570v = null;
        }
    }

    /* renamed from: a */
    public void m2503a(float f) {
        C0216r.m3444a(this.f1552d, f);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: a */
    public void mo2271a(int i) {
        this.f1564p = i;
    }

    /* renamed from: a */
    public void m2502a(int i, int i2) {
        int h = this.f1553e.mo1862h();
        if ((i2 & 4) != 0) {
            this.f1557i = true;
        }
        this.f1553e.mo1868d((i & i2) | ((i2 ^ (-1)) & h));
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2499a(Configuration configuration) {
        m2480k(C0028a.m4185a(this.f1549a).m4180f());
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2498a(Drawable drawable) {
        this.f1553e.mo1884a(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2496a(CharSequence charSequence) {
        this.f1553e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: a */
    public void mo2270a(boolean z) {
        this.f1565q = z;
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public boolean mo2501a(int i, KeyEvent keyEvent) {
        Menu c;
        C0480d dVar = this.f1558j;
        if (dVar == null || (c = dVar.mo2464c()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: b */
    public void mo2269b() {
        if (!this.f1567s) {
            this.f1567s = true;
            m2478l(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: b */
    public void mo2494b(int i) {
        this.f1553e.mo1871c(i);
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: b */
    public void mo2492b(boolean z) {
        if (z != this.f1561m) {
            this.f1561m = z;
            int size = this.f1562n.size();
            for (int i = 0; i < size; i++) {
                this.f1562n.get(i).m2660a(z);
            }
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: c */
    public void mo2268c() {
        if (this.f1567s) {
            this.f1567s = false;
            m2478l(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: c */
    public void mo2491c(boolean z) {
        if (!this.f1557i) {
            m2483h(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0529d
    /* renamed from: d */
    public void mo2267d() {
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: d */
    public void mo2490d(boolean z) {
        C0039h hVar;
        this.f1571w = z;
        if (!z && (hVar = this.f1570v) != null) {
            hVar.m4157a();
        }
    }

    /* renamed from: e */
    public void m2489e(boolean z) {
        C0223v vVar;
        C0223v vVar2;
        if (z) {
            m2474p();
        } else {
            m2476n();
        }
        if (m2475o()) {
            if (z) {
                vVar = this.f1553e.mo1885a(4, 100L);
                vVar2 = this.f1554f.m2153a(0, 200L);
            } else {
                vVar2 = this.f1553e.mo1885a(0, 200L);
                vVar = this.f1554f.m2153a(8, 100L);
            }
            C0039h hVar = new C0039h();
            hVar.m4154a(vVar, vVar2);
            hVar.m4150c();
        } else if (z) {
            this.f1553e.mo1886a(4);
            this.f1554f.setVisibility(0);
        } else {
            this.f1553e.mo1886a(0);
            this.f1554f.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void m2487f(boolean z) {
        View view;
        int[] iArr;
        C0039h hVar = this.f1570v;
        if (hVar != null) {
            hVar.m4157a();
        }
        if (this.f1564p != 0 || (!this.f1571w && !z)) {
            this.f1573y.mo1850a(null);
            return;
        }
        this.f1552d.setAlpha(1.0f);
        this.f1552d.setTransitioning(true);
        C0039h hVar2 = new C0039h();
        float f = -this.f1552d.getHeight();
        if (z) {
            this.f1552d.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        C0223v a = C0216r.m3445a(this.f1552d);
        a.m3365b(f);
        a.m3369a(this.f1548A);
        hVar2.m4155a(a);
        if (this.f1565q && (view = this.f1555g) != null) {
            C0223v a2 = C0216r.m3445a(view);
            a2.m3365b(f);
            hVar2.m4155a(a2);
        }
        hVar2.m4152a(f1546B);
        hVar2.m4156a(250L);
        hVar2.m4153a(this.f1573y);
        this.f1570v = hVar2;
        hVar2.m4150c();
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: f */
    public boolean mo2488f() {
        AbstractC0569b0 b0Var = this.f1553e;
        if (b0Var == null || !b0Var.mo1859k()) {
            return false;
        }
        this.f1553e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: g */
    public int mo2486g() {
        return this.f1553e.mo1862h();
    }

    /* renamed from: g */
    public void m2485g(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C0039h hVar = this.f1570v;
        if (hVar != null) {
            hVar.m4157a();
        }
        this.f1552d.setVisibility(0);
        if (this.f1564p != 0 || (!this.f1571w && !z)) {
            this.f1552d.setAlpha(1.0f);
            this.f1552d.setTranslationY(0.0f);
            if (this.f1565q && (view = this.f1555g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1574z.mo1850a(null);
        } else {
            this.f1552d.setTranslationY(0.0f);
            float f = -this.f1552d.getHeight();
            if (z) {
                this.f1552d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f1552d.setTranslationY(f);
            C0039h hVar2 = new C0039h();
            C0223v a = C0216r.m3445a(this.f1552d);
            a.m3365b(0.0f);
            a.m3369a(this.f1548A);
            hVar2.m4155a(a);
            if (this.f1565q && (view2 = this.f1555g) != null) {
                view2.setTranslationY(f);
                C0223v a2 = C0216r.m3445a(this.f1555g);
                a2.m3365b(0.0f);
                hVar2.m4155a(a2);
            }
            hVar2.m4152a(f1547C);
            hVar2.m4156a(250L);
            hVar2.m4153a(this.f1574z);
            this.f1570v = hVar2;
            hVar2.m4150c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1551c;
        if (actionBarOverlayLayout != null) {
            C0216r.m3449B(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: h */
    public Context mo2484h() {
        if (this.f1550b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1549a.getTheme().resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1550b = new ContextThemeWrapper(this.f1549a, i);
            } else {
                this.f1550b = this.f1549a;
            }
        }
        return this.f1550b;
    }

    /* renamed from: h */
    public void m2483h(boolean z) {
        m2502a(z ? 4 : 0, 4);
    }

    /* renamed from: i */
    public void m2482i(boolean z) {
        if (!z || this.f1551c.m2278i()) {
            this.f1572x = z;
            this.f1551c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: j */
    public void m2481j(boolean z) {
        this.f1553e.mo1878a(z);
    }

    /* renamed from: l */
    void m2479l() {
        AbstractC0029b.AbstractC0030a aVar = this.f1560l;
        if (aVar != null) {
            aVar.mo2545a(this.f1559k);
            this.f1559k = null;
            this.f1560l = null;
        }
    }

    /* renamed from: m */
    public int m2477m() {
        return this.f1553e.mo1855o();
    }
}
