package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import p000a.p001a.p004l.p005a.C0025d;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class C0432b implements DrawerLayout.AbstractC0727d {

    /* renamed from: a */
    private final AbstractC0434b f1394a;

    /* renamed from: b */
    private final DrawerLayout f1395b;

    /* renamed from: c */
    private C0025d f1396c;

    /* renamed from: d */
    private boolean f1397d;

    /* renamed from: e */
    boolean f1398e;

    /* renamed from: f */
    private final int f1399f;

    /* renamed from: g */
    private final int f1400g;

    /* renamed from: h */
    View.OnClickListener f1401h;

    /* renamed from: i */
    private boolean f1402i;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0433a implements View.OnClickListener {
        View$OnClickListenerC0433a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0432b bVar = C0432b.this;
            if (bVar.f1398e) {
                bVar.m2649c();
                return;
            }
            View.OnClickListener onClickListener = bVar.f1401h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0434b {
        /* renamed from: a */
        void mo2549a(int i);

        /* renamed from: a */
        void mo2548a(Drawable drawable, int i);

        /* renamed from: a */
        boolean mo2550a();

        /* renamed from: b */
        Context mo2547b();

        /* renamed from: c */
        Drawable mo2546c();
    }

    /* renamed from: androidx.appcompat.app.b$c */
    /* loaded from: classes.dex */
    public interface AbstractC0435c {
        /* renamed from: c */
        AbstractC0434b mo2631c();
    }

    /* renamed from: androidx.appcompat.app.b$d */
    /* loaded from: classes.dex */
    private static class C0436d implements AbstractC0434b {

        /* renamed from: a */
        private final Activity f1404a;

        /* renamed from: b */
        private C0438c.C0439a f1405b;

        C0436d(Activity activity) {
            this.f1404a = activity;
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2549a(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f1404a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f1405b = C0438c.m2647a(this.f1405b, this.f1404a, i);
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2548a(Drawable drawable, int i) {
            ActionBar actionBar = this.f1404a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f1405b = C0438c.m2646a(this.f1405b, this.f1404a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public boolean mo2550a() {
            ActionBar actionBar = this.f1404a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: b */
        public Context mo2547b() {
            ActionBar actionBar = this.f1404a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f1404a;
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: c */
        public Drawable mo2546c() {
            if (Build.VERSION.SDK_INT < 18) {
                return C0438c.m2648a(this.f1404a);
            }
            TypedArray obtainStyledAttributes = mo2547b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }
    }

    /* renamed from: androidx.appcompat.app.b$e */
    /* loaded from: classes.dex */
    static class C0437e implements AbstractC0434b {

        /* renamed from: a */
        final Toolbar f1406a;

        /* renamed from: b */
        final Drawable f1407b;

        /* renamed from: c */
        final CharSequence f1408c;

        C0437e(Toolbar toolbar) {
            this.f1406a = toolbar;
            this.f1407b = toolbar.getNavigationIcon();
            this.f1408c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2549a(int i) {
            if (i == 0) {
                this.f1406a.setNavigationContentDescription(this.f1408c);
            } else {
                this.f1406a.setNavigationContentDescription(i);
            }
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2548a(Drawable drawable, int i) {
            this.f1406a.setNavigationIcon(drawable);
            mo2549a(i);
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public boolean mo2550a() {
            return true;
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: b */
        public Context mo2547b() {
            return this.f1406a.getContext();
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: c */
        public Drawable mo2546c() {
            return this.f1407b;
        }
    }

    C0432b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C0025d dVar, int i, int i2) {
        this.f1397d = true;
        this.f1398e = true;
        this.f1402i = false;
        if (toolbar != null) {
            this.f1394a = new C0437e(toolbar);
            toolbar.setNavigationOnClickListener(new View$OnClickListenerC0433a());
        } else if (activity instanceof AbstractC0435c) {
            this.f1394a = ((AbstractC0435c) activity).mo2631c();
        } else {
            this.f1394a = new C0436d(activity);
        }
        this.f1395b = drawerLayout;
        this.f1399f = i;
        this.f1400g = i2;
        if (dVar == null) {
            this.f1396c = new C0025d(this.f1394a.mo2547b());
        } else {
            this.f1396c = dVar;
        }
        m2654a();
    }

    public C0432b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    /* renamed from: a */
    private void m2653a(float f) {
        C0025d dVar;
        boolean z;
        if (f == 1.0f) {
            dVar = this.f1396c;
            z = true;
        } else {
            if (f == 0.0f) {
                dVar = this.f1396c;
                z = false;
            }
            this.f1396c.m4194c(f);
        }
        dVar.m4195b(z);
        this.f1396c.m4194c(f);
    }

    /* renamed from: a */
    Drawable m2654a() {
        return this.f1394a.mo2546c();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d
    /* renamed from: a */
    public void mo1425a(int i) {
    }

    /* renamed from: a */
    void m2652a(Drawable drawable, int i) {
        if (!this.f1402i && !this.f1394a.mo2550a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f1402i = true;
        }
        this.f1394a.mo2548a(drawable, i);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d
    /* renamed from: a */
    public void mo1424a(View view) {
        m2653a(1.0f);
        if (this.f1398e) {
            m2650b(this.f1400g);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d
    /* renamed from: a */
    public void mo1423a(View view, float f) {
        if (this.f1397d) {
            m2653a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m2653a(0.0f);
        }
    }

    /* renamed from: b */
    public void m2651b() {
        m2653a(this.f1395b.m1446e(8388611) ? 1.0f : 0.0f);
        if (this.f1398e) {
            m2652a(this.f1396c, this.f1395b.m1446e(8388611) ? this.f1400g : this.f1399f);
        }
    }

    /* renamed from: b */
    void m2650b(int i) {
        this.f1394a.mo2549a(i);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0727d
    /* renamed from: b */
    public void mo1422b(View view) {
        m2653a(0.0f);
        if (this.f1398e) {
            m2650b(this.f1399f);
        }
    }

    /* renamed from: c */
    void m2649c() {
        int c = this.f1395b.m1454c(8388611);
        if (this.f1395b.m1443f(8388611) && c != 2) {
            this.f1395b.m1476a(8388611);
        } else if (c != 1) {
            this.f1395b.m1440g(8388611);
        }
    }
}
