package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.AbstractC0513p;
import androidx.appcompat.view.menu.C0483a;
import androidx.appcompat.view.menu.C0496h;

import p000a.p001a.C0000a;
import p000a.p001a.C0004e;
import p000a.p001a.C0005f;
import p000a.p001a.C0007h;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0223v;
import p000a.p018g.p029l.C0228x;

/* renamed from: androidx.appcompat.widget.u0 */
/* loaded from: classes.dex */
public class C0640u0 implements AbstractC0569b0 {

    /* renamed from: a */
    Toolbar f2284a;

    /* renamed from: b */
    private int f2285b;

    /* renamed from: c */
    private View f2286c;

    /* renamed from: d */
    private View f2287d;

    /* renamed from: e */
    private Drawable f2288e;

    /* renamed from: f */
    private Drawable f2289f;

    /* renamed from: g */
    private Drawable f2290g;

    /* renamed from: h */
    private boolean f2291h;

    /* renamed from: i */
    CharSequence f2292i;

    /* renamed from: j */
    private CharSequence f2293j;

    /* renamed from: k */
    private CharSequence f2294k;

    /* renamed from: l */
    Window.Callback f2295l;

    /* renamed from: m */
    boolean f2296m;

    /* renamed from: n */
    private C0570c f2297n;

    /* renamed from: o */
    private int f2298o;

    /* renamed from: p */
    private int f2299p;

    /* renamed from: q */
    private Drawable f2300q;

    /* renamed from: androidx.appcompat.widget.u0$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0641a implements View.OnClickListener {

        /* renamed from: b */
        final C0483a f2301b;

        View$OnClickListenerC0641a() {
            this.f2301b = new C0483a(C0640u0.this.f2284a.getContext(), 0, 16908332, 0, 0, C0640u0.this.f2292i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0640u0 u0Var = C0640u0.this;
            Window.Callback callback = u0Var.f2295l;
            if (callback != null && u0Var.f2296m) {
                callback.onMenuItemSelected(0, this.f2301b);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$b */
    /* loaded from: classes.dex */
    class C0642b extends C0228x {

        /* renamed from: a */
        private boolean f2303a = false;

        /* renamed from: b */
        final /* synthetic */ int f2304b;

        C0642b(int i) {
            this.f2304b = i;
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(View view) {
            if (!this.f2303a) {
                C0640u0.this.f2284a.setVisibility(this.f2304b);
            }
        }

        @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(View view) {
            C0640u0.this.f2284a.setVisibility(0);
        }

        @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
        /* renamed from: c */
        public void mo1848c(View view) {
            this.f2303a = true;
        }
    }

    public C0640u0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0007h.abc_action_bar_up_description, C0004e.abc_ic_ab_back_material);
    }

    public C0640u0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f2298o = 0;
        this.f2299p = 0;
        this.f2284a = toolbar;
        this.f2292i = toolbar.getTitle();
        this.f2293j = toolbar.getSubtitle();
        this.f2291h = this.f2292i != null;
        this.f2290g = toolbar.getNavigationIcon();
        C0638t0 a = C0638t0.m1900a(toolbar.getContext(), null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        this.f2300q = a.m1899b(C0009j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.m1893e(C0009j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                m1870c(e);
            }
            CharSequence e2 = a.m1893e(C0009j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                m1874b(e2);
            }
            Drawable b = a.m1899b(C0009j.ActionBar_logo);
            if (b != null) {
                m1875b(b);
            }
            Drawable b2 = a.m1899b(C0009j.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f2290g == null && (drawable = this.f2300q) != null) {
                mo1884a(drawable);
            }
            mo1868d(a.m1894d(C0009j.ActionBar_displayOptions, 0));
            int g = a.m1888g(C0009j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                m1882a(LayoutInflater.from(this.f2284a.getContext()).inflate(g, (ViewGroup) this.f2284a, false));
                mo1868d(this.f2285b | 16);
            }
            int f = a.m1890f(C0009j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2284a.getLayoutParams();
                layoutParams.height = f;
                this.f2284a.setLayoutParams(layoutParams);
            }
            int b3 = a.m1898b(C0009j.ActionBar_contentInsetStart, -1);
            int b4 = a.m1898b(C0009j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f2284a.m2192a(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g2 = a.m1888g(C0009j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f2284a;
                toolbar2.m2178b(toolbar2.getContext(), g2);
            }
            int g3 = a.m1888g(C0009j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f2284a;
                toolbar3.m2191a(toolbar3.getContext(), g3);
            }
            int g4 = a.m1888g(C0009j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f2284a.setPopupTheme(g4);
            }
        } else {
            this.f2285b = m1854p();
        }
        a.m1908a();
        m1865e(i);
        this.f2294k = this.f2284a.getNavigationContentDescription();
        this.f2284a.setNavigationOnClickListener(new View$OnClickListenerC0641a());
    }

    /* renamed from: d */
    private void m1867d(CharSequence charSequence) {
        this.f2292i = charSequence;
        if ((this.f2285b & 8) != 0) {
            this.f2284a.setTitle(charSequence);
        }
    }

    /* renamed from: p */
    private int m1854p() {
        if (this.f2284a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2300q = this.f2284a.getNavigationIcon();
        return 15;
    }

    /* renamed from: q */
    private void m1853q() {
        if ((this.f2285b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2294k)) {
            this.f2284a.setNavigationContentDescription(this.f2299p);
        } else {
            this.f2284a.setNavigationContentDescription(this.f2294k);
        }
    }

    /* renamed from: r */
    private void m1852r() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f2285b & 4) != 0) {
            toolbar = this.f2284a;
            drawable = this.f2290g;
            if (drawable == null) {
                drawable = this.f2300q;
            }
        } else {
            toolbar = this.f2284a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: s */
    private void m1851s() {
        Drawable drawable;
        int i = this.f2285b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2289f) == null) {
            drawable = this.f2288e;
        }
        this.f2284a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public C0223v mo1885a(int i, long j) {
        C0223v a = C0216r.m3445a(this.f2284a);
        a.m3372a(i == 0 ? 1.0f : 0.0f);
        a.m3371a(j);
        a.m3370a(new C0642b(i));
        return a;
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1886a(int i) {
        this.f2284a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1884a(Drawable drawable) {
        this.f2290g = drawable;
        m1852r();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1883a(Menu menu, AbstractC0513p.AbstractC0514a aVar) {
        if (this.f2297n == null) {
            this.f2297n = new C0570c(this.f2284a.getContext());
            this.f2297n.m2447a(C0005f.action_menu_presenter);
        }
        this.f2297n.mo2308a(aVar);
        this.f2284a.m2184a((C0496h) menu, this.f2297n);
    }

    /* renamed from: a */
    public void m1882a(View view) {
        View view2 = this.f2287d;
        if (!(view2 == null || (this.f2285b & 16) == 0)) {
            this.f2284a.removeView(view2);
        }
        this.f2287d = view;
        if (view != null && (this.f2285b & 16) != 0) {
            this.f2284a.addView(this.f2287d);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1881a(AbstractC0513p.AbstractC0514a aVar, C0496h.AbstractC0497a aVar2) {
        this.f2284a.m2183a(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1880a(C0619m0 m0Var) {
        View view = this.f2286c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f2284a;
            if (parent == toolbar) {
                toolbar.removeView(this.f2286c);
            }
        }
        this.f2286c = m0Var;
        if (m0Var != null && this.f2298o == 2) {
            this.f2284a.addView(this.f2286c, 0);
            Toolbar.C0559e eVar = (Toolbar.C0559e) this.f2286c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.f1393a = 8388691;
            m0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void m1879a(CharSequence charSequence) {
        this.f2294k = charSequence;
        m1853q();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public void mo1878a(boolean z) {
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: a */
    public boolean mo1887a() {
        return this.f2284a.m2165k();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: b */
    public void mo1876b(int i) {
        m1875b(i != 0 ? C0010a.m4259c(mo1856n(), i) : null);
    }

    /* renamed from: b */
    public void m1875b(Drawable drawable) {
        this.f2289f = drawable;
        m1851s();
    }

    /* renamed from: b */
    public void m1874b(CharSequence charSequence) {
        this.f2293j = charSequence;
        if ((this.f2285b & 8) != 0) {
            this.f2284a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: b */
    public void mo1873b(boolean z) {
        this.f2284a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: b */
    public boolean mo1877b() {
        return this.f2284a.m2168h();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: c */
    public void mo1872c() {
        this.f2296m = true;
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: c */
    public void mo1871c(int i) {
        m1879a(i == 0 ? null : mo1856n().getString(i));
    }

    /* renamed from: c */
    public void m1870c(CharSequence charSequence) {
        this.f2291h = true;
        m1867d(charSequence);
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void collapseActionView() {
        this.f2284a.m2175c();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: d */
    public void mo1868d(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f2285b ^ i;
        this.f2285b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1853q();
                }
                m1852r();
            }
            if ((i2 & 3) != 0) {
                m1851s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2284a.setTitle(this.f2292i);
                    toolbar = this.f2284a;
                    charSequence = this.f2293j;
                } else {
                    charSequence = null;
                    this.f2284a.setTitle((CharSequence) null);
                    toolbar = this.f2284a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f2287d) != null) {
                if ((i & 16) != 0) {
                    this.f2284a.addView(view);
                } else {
                    this.f2284a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: d */
    public boolean mo1869d() {
        return this.f2284a.m2167i();
    }

    /* renamed from: e */
    public void m1865e(int i) {
        if (i != this.f2299p) {
            this.f2299p = i;
            if (TextUtils.isEmpty(this.f2284a.getNavigationContentDescription())) {
                mo1871c(this.f2299p);
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: e */
    public boolean mo1866e() {
        return this.f2284a.m2180b();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: f */
    public boolean mo1864f() {
        return this.f2284a.m2169g();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: g */
    public void mo1863g() {
        this.f2284a.m2173d();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public CharSequence getTitle() {
        return this.f2284a.getTitle();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: h */
    public int mo1862h() {
        return this.f2285b;
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: i */
    public void mo1861i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: j */
    public Menu mo1860j() {
        return this.f2284a.getMenu();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: k */
    public boolean mo1859k() {
        return this.f2284a.m2170f();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: l */
    public ViewGroup mo1858l() {
        return this.f2284a;
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: m */
    public void mo1857m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: n */
    public Context mo1856n() {
        return this.f2284a.getContext();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    /* renamed from: o */
    public int mo1855o() {
        return this.f2298o;
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void setIcon(int i) {
        setIcon(i != 0 ? C0010a.m4259c(mo1856n(), i) : null);
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void setIcon(Drawable drawable) {
        this.f2288e = drawable;
        m1851s();
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void setWindowCallback(Window.Callback callback) {
        this.f2295l = callback;
    }

    @Override // androidx.appcompat.widget.AbstractC0569b0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f2291h) {
            m1867d(charSequence);
        }
    }
}
