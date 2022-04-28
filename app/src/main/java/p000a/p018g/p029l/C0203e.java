package p000a.p018g.p029l;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: a.g.l.e */
/* loaded from: classes.dex */
public final class C0203e {

    /* renamed from: a */
    private static Field f652a;

    /* renamed from: b */
    private static boolean f653b;

    /* renamed from: a */
    private static void m3482a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f653b) {
            try {
                f652a = LayoutInflater.class.getDeclaredField("mFactory2");
                f652a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f653b = true;
        }
        Field field = f652a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m3481b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m3482a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m3482a(layoutInflater, factory2);
            }
        }
    }
}
