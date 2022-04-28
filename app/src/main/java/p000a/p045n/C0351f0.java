package p000a.p045n;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.n.f0 */
/* loaded from: classes.dex */
class C0351f0 extends C0349e0 {

    /* renamed from: e */
    private static Method f1073e;

    /* renamed from: f */
    private static boolean f1074f;

    /* renamed from: g */
    private static Method f1075g;

    /* renamed from: h */
    private static boolean f1076h;

    /* renamed from: a */
    private void m2869a() {
        if (!f1074f) {
            try {
                f1073e = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f1073e.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f1074f = true;
        }
    }

    /* renamed from: b */
    private void m2868b() {
        if (!f1076h) {
            try {
                f1075g = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f1075g.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f1076h = true;
        }
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: a */
    public void mo2862a(View view, Matrix matrix) {
        m2869a();
        Method method = f1073e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: b */
    public void mo2860b(View view, Matrix matrix) {
        m2868b();
        Method method = f1075g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
