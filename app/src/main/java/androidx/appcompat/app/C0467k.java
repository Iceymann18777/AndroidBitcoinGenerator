package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import androidx.appcompat.view.menu.AbstractC0513p;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.widget.AbstractC0569b0;
import androidx.appcompat.widget.C0640u0;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p000a.p001a.p006m.Window$CallbackC0041i;
import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
public class C0467k extends AbstractC0428a {

    /* renamed from: a */
    AbstractC0569b0 f1518a;

    /* renamed from: b */
    boolean f1519b;

    /* renamed from: c */
    Window.Callback f1520c;

    /* renamed from: d */
    private boolean f1521d;

    /* renamed from: e */
    private boolean f1522e;

    /* renamed from: f */
    private ArrayList<AbstractC0428a.AbstractC0430b> f1523f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f1524g = new RunnableC0468a();

    /* renamed from: h */
    private final Toolbar.AbstractC0560f f1525h = new C0469b();

    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes.dex */
    class RunnableC0468a implements Runnable {
        RunnableC0468a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0467k.this.m2513m();
        }
    }

    /* renamed from: androidx.appcompat.app.k$b */
    /* loaded from: classes.dex */
    class C0469b implements Toolbar.AbstractC0560f {
        C0469b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.AbstractC0560f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0467k.this.f1520c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.k$c */
    /* loaded from: classes.dex */
    public final class C0470c implements AbstractC0513p.AbstractC0514a {

        /* renamed from: b */
        private boolean f1528b;

        C0470c() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(C0496h hVar, boolean z) {
            if (!this.f1528b) {
                this.f1528b = true;
                C0467k.this.f1518a.mo1863g();
                Window.Callback callback = C0467k.this.f1520c;
                if (callback != null) {
                    callback.onPanelClosed(108, hVar);
                }
                this.f1528b = false;
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(C0496h hVar) {
            Window.Callback callback = C0467k.this.f1520c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.k$d */
    /* loaded from: classes.dex */
    public final class C0471d implements C0496h.AbstractC0497a {
        C0471d() {
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public void mo65a(C0496h hVar) {
            C0467k kVar = C0467k.this;
            if (kVar.f1520c == null) {
                return;
            }
            if (kVar.f1518a.mo1869d()) {
                C0467k.this.f1520c.onPanelClosed(108, hVar);
            } else if (C0467k.this.f1520c.onPreparePanel(0, null, hVar)) {
                C0467k.this.f1520c.onMenuOpened(108, hVar);
            }
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public boolean mo64a(C0496h hVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.app.k$e */
    /* loaded from: classes.dex */
    private class C0472e extends Window$CallbackC0041i {
        public C0472e(Window.Callback callback) {
            super(callback);
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0467k.this.f1518a.mo1856n()) : super.onCreatePanelView(i);
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0467k kVar = C0467k.this;
                if (!kVar.f1519b) {
                    kVar.f1518a.mo1872c();
                    C0467k.this.f1519b = true;
                }
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0467k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f1518a = new C0640u0(toolbar, false);
        this.f1520c = new C0472e(callback);
        this.f1518a.setWindowCallback(this.f1520c);
        toolbar.setOnMenuItemClickListener(this.f1525h);
        this.f1518a.setWindowTitle(charSequence);
    }

    /* renamed from: n */
    private Menu m2512n() {
        if (!this.f1521d) {
            this.f1518a.mo1881a(new C0470c(), new C0471d());
            this.f1521d = true;
        }
        return this.f1518a.mo1860j();
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2499a(Configuration configuration) {
        super.mo2499a(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2498a(Drawable drawable) {
        this.f1518a.mo1884a(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public void mo2496a(CharSequence charSequence) {
        this.f1518a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public boolean mo2501a(int i, KeyEvent keyEvent) {
        Menu n = m2512n();
        if (n == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        n.setQwertyMode(z);
        return n.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: a */
    public boolean mo2519a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2515k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: b */
    public void mo2494b(int i) {
        this.f1518a.mo1871c(i);
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: b */
    public void mo2492b(boolean z) {
        if (z != this.f1522e) {
            this.f1522e = z;
            int size = this.f1523f.size();
            for (int i = 0; i < size; i++) {
                this.f1523f.get(i).m2660a(z);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: c */
    public void mo2491c(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: d */
    public void mo2490d(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: e */
    public boolean mo2518e() {
        return this.f1518a.mo1864f();
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: f */
    public boolean mo2488f() {
        if (!this.f1518a.mo1859k()) {
            return false;
        }
        this.f1518a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: g */
    public int mo2486g() {
        return this.f1518a.mo1862h();
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: h */
    public Context mo2484h() {
        return this.f1518a.mo1856n();
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: i */
    public boolean mo2517i() {
        this.f1518a.mo1858l().removeCallbacks(this.f1524g);
        C0216r.m3432a(this.f1518a.mo1858l(), this.f1524g);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: j */
    public void mo2516j() {
        this.f1518a.mo1858l().removeCallbacks(this.f1524g);
    }

    @Override // androidx.appcompat.app.AbstractC0428a
    /* renamed from: k */
    public boolean mo2515k() {
        return this.f1518a.mo1887a();
    }

    /* renamed from: l */
    public Window.Callback m2514l() {
        return this.f1520c;
    }

    /* renamed from: m */
    void m2513m() {
        Menu n = m2512n();
        C0496h hVar = n instanceof C0496h ? (C0496h) n : null;
        if (hVar != null) {
            hVar.m2373s();
        }
        try {
            n.clear();
            if (!this.f1520c.onCreatePanelMenu(0, n) || !this.f1520c.onPreparePanel(0, null, n)) {
                n.clear();
            }
        } finally {
            if (hVar != null) {
                hVar.m2374r();
            }
        }
    }
}
