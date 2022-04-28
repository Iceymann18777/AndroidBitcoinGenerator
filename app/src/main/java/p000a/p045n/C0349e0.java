package p000a.p045n;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.n.e0 */
/* loaded from: classes.dex */
class C0349e0 extends C0355h0 {

    /* renamed from: a */
    private static Method f1069a;

    /* renamed from: b */
    private static boolean f1070b;

    /* renamed from: c */
    private static Method f1071c;

    /* renamed from: d */
    private static boolean f1072d;

    /* renamed from: a */
    private void m2872a() {
        if (!f1072d) {
            try {
                f1071c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f1071c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f1072d = true;
        }
    }

    /* renamed from: b */
    private void m2871b() {
        if (!f1070b) {
            try {
                f1069a = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f1069a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f1070b = true;
        }
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: a */
    public void mo2865a(View view) {
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: a */
    public void mo2864a(View view, float f) {
        m2871b();
        Method method = f1069a;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(f));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: b */
    public float mo2861b(View view) {
        m2872a();
        Method method = f1071c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo2861b(view);
    }

    @Override // p000a.p045n.C0355h0
    /* renamed from: c */
    public void mo2859c(View view) {
    }
}
