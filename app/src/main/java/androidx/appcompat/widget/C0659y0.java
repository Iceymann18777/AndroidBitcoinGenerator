package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.y0 */
/* loaded from: classes.dex */
public class C0659y0 extends Resources {

    /* renamed from: b */
    private static boolean f2369b;

    /* renamed from: a */
    private final WeakReference<Context> f2370a;

    public C0659y0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2370a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1793a() {
        return f2369b;
    }

    /* renamed from: b */
    public static boolean m1791b() {
        return m1793a() && Build.VERSION.SDK_INT <= 20;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable m1792a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f2370a.get();
        return context != null ? C0606j.m2013a().m2002a(context, this, i) : super.getDrawable(i);
    }
}
