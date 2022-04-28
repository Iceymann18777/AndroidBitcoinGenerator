package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
public class C0632q0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f2265c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0632q0>> f2266d;

    /* renamed from: a */
    private final Resources f2267a;

    /* renamed from: b */
    private final Resources.Theme f2268b;

    private C0632q0(Context context) {
        super(context);
        if (C0659y0.m1791b()) {
            this.f2267a = new C0659y0(this, context.getResources());
            this.f2268b = this.f2267a.newTheme();
            this.f2268b.setTo(context.getTheme());
            return;
        }
        this.f2267a = new C0636s0(this, context.getResources());
        this.f2268b = null;
    }

    /* renamed from: a */
    private static boolean m1915a(Context context) {
        if ((context instanceof C0632q0) || (context.getResources() instanceof C0636s0) || (context.getResources() instanceof C0659y0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0659y0.m1791b();
    }

    /* renamed from: b */
    public static Context m1914b(Context context) {
        if (!m1915a(context)) {
            return context;
        }
        synchronized (f2265c) {
            if (f2266d == null) {
                f2266d = new ArrayList<>();
            } else {
                for (int size = f2266d.size() - 1; size >= 0; size--) {
                    WeakReference<C0632q0> weakReference = f2266d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2266d.remove(size);
                    }
                }
                for (int size2 = f2266d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0632q0> weakReference2 = f2266d.get(size2);
                    C0632q0 q0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (q0Var != null && q0Var.getBaseContext() == context) {
                        return q0Var;
                    }
                }
            }
            C0632q0 q0Var2 = new C0632q0(context);
            f2266d.add(new WeakReference<>(q0Var2));
            return q0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2267a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2267a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2268b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f2268b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
