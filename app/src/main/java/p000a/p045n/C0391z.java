package p000a.p045n;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.n.z */
/* loaded from: classes.dex */
class C0391z {

    /* renamed from: a */
    private static Method f1179a;

    /* renamed from: b */
    private static boolean f1180b;

    /* renamed from: a */
    private static void m2762a() {
        if (!f1180b) {
            try {
                f1179a = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f1179a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f1180b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2761a(ViewGroup viewGroup, boolean z) {
        String str;
        Throwable e;
        m2762a();
        Method method = f1179a;
        if (method != null) {
            try {
                method.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "Failed to invoke suppressLayout method";
                Log.i("ViewUtilsApi18", str, e);
            } catch (InvocationTargetException e3) {
                e = e3;
                str = "Error invoking suppressLayout method";
                Log.i("ViewUtilsApi18", str, e);
            }
        }
    }
}
