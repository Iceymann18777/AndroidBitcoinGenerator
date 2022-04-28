package p000a.p045n;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.n.g0 */
/* loaded from: classes.dex */
class C0353g0 extends C0351f0 {

    /* renamed from: i */
    private static Method f1077i;

    /* renamed from: j */
    private static boolean f1078j;

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m2867a() {
        if (!f1078j) {
            try {
                f1077i = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f1077i.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f1078j = true;
        }
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: a */
    public void mo2863a(View view, int i, int i2, int i3, int i4) {
        m2867a();
        Method method = f1077i;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
