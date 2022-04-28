package p000a.p001a.p006m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p000a.p001a.C0008i;

/* renamed from: a.a.m.d */
/* loaded from: classes.dex */
public class C0032d extends ContextWrapper {

    /* renamed from: a */
    private int f89a;

    /* renamed from: b */
    private Resources.Theme f90b;

    /* renamed from: c */
    private LayoutInflater f91c;

    /* renamed from: d */
    private Configuration f92d;

    /* renamed from: e */
    private Resources f93e;

    public C0032d() {
        super(null);
    }

    public C0032d(Context context, int i) {
        super(context);
        this.f89a = i;
    }

    public C0032d(Context context, Resources.Theme theme) {
        super(context);
        this.f90b = theme;
    }

    /* renamed from: b */
    private Resources m4173b() {
        Resources resources;
        if (this.f93e == null) {
            Configuration configuration = this.f92d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f93e = resources;
        }
        return this.f93e;
    }

    /* renamed from: c */
    private void m4172c() {
        boolean z = this.f90b == null;
        if (z) {
            this.f90b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f90b.setTo(theme);
            }
        }
        m4174a(this.f90b, this.f89a, z);
    }

    /* renamed from: a */
    public int m4175a() {
        return this.f89a;
    }

    /* renamed from: a */
    protected void m4174a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m4173b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f91c == null) {
            this.f91c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f91c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f90b;
        if (theme != null) {
            return theme;
        }
        if (this.f89a == 0) {
            this.f89a = C0008i.Theme_AppCompat_Light;
        }
        m4172c();
        return this.f90b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f89a != i) {
            this.f89a = i;
            m4172c();
        }
    }
}
