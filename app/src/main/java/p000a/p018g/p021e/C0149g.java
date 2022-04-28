package p000a.p018g.p021e;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.g.e.g */
/* loaded from: classes.dex */
public class C0149g extends C0148f {
    @Override // p000a.p018g.p021e.C0148f
    /* renamed from: a */
    protected Typeface mo3630a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f566a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f572g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.p018g.p021e.C0148f
    /* renamed from: d */
    protected Method mo3629d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
