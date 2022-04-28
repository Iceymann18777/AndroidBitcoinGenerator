package p000a.p001a.p002k.p003a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0606j;
import java.util.WeakHashMap;
import p000a.p018g.p019d.C0124a;
import p000a.p018g.p019d.p020c.C0126a;

/* renamed from: a.a.k.a.a */
/* loaded from: classes.dex */
public final class C0010a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0011a>> f2b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.k.a.a$a */
    /* loaded from: classes.dex */
    public static class C0011a {

        /* renamed from: a */
        final ColorStateList f4a;

        /* renamed from: b */
        final Configuration f5b;

        C0011a(ColorStateList colorStateList, Configuration configuration) {
            this.f4a = colorStateList;
            this.f5b = configuration;
        }
    }

    /* renamed from: a */
    private static ColorStateList m4262a(Context context, int i) {
        C0011a aVar;
        synchronized (f3c) {
            SparseArray<C0011a> sparseArray = f2b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null)) {
                if (aVar.f5b.equals(context.getResources().getConfiguration())) {
                    return aVar.f4a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static TypedValue m4263a() {
        TypedValue typedValue = f1a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m4261a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f3c) {
            SparseArray<C0011a> sparseArray = f2b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f2b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0011a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static ColorStateList m4260b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a = m4262a(context, i);
        if (a != null) {
            return a;
        }
        ColorStateList d = m4258d(context, i);
        if (d == null) {
            return C0124a.m3734a(context, i);
        }
        m4261a(context, i, d);
        return d;
    }

    /* renamed from: c */
    public static Drawable m4259c(Context context, int i) {
        return C0606j.m2013a().m2009a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m4258d(Context context, int i) {
        if (m4257e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0126a.m3727a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m4257e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m4263a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        return i2 >= 28 && i2 <= 31;
    }
}
