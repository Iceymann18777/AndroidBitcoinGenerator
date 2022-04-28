package p000a.p018g.p021e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000a.p013d.C0080g;
import p000a.p018g.p019d.p020c.C0128c;
import p000a.p018g.p026i.C0161b;

/* renamed from: a.g.e.e */
/* loaded from: classes.dex */
class C0147e extends C0150h {

    /* renamed from: a */
    private static final Class f562a;

    /* renamed from: b */
    private static final Constructor f563b;

    /* renamed from: c */
    private static final Method f564c;

    /* renamed from: d */
    private static final Method f565d;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f563b = constructor;
        f562a = cls;
        f564c = method;
        f565d = method2;
    }

    /* renamed from: a */
    private static Typeface m3645a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f562a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f565d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m3646a() {
        if (f564c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f564c != null;
    }

    /* renamed from: a */
    private static boolean m3644a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f564c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m3643b() {
        try {
            return f563b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public Typeface mo3627a(Context context, C0128c.C0130b bVar, Resources resources, int i) {
        C0128c.C0131c[] a;
        Object b = m3643b();
        for (C0128c.C0131c cVar : bVar.m3704a()) {
            ByteBuffer a2 = C0154i.m3614a(context, resources, cVar.m3702b());
            if (a2 == null || !m3644a(b, a2, cVar.m3701c(), cVar.m3699e(), cVar.m3698f())) {
                return null;
            }
        }
        return m3645a(b);
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public Typeface mo3625a(Context context, CancellationSignal cancellationSignal, C0161b.C0167f[] fVarArr, int i) {
        Object b = m3643b();
        C0080g gVar = new C0080g();
        for (C0161b.C0167f fVar : fVarArr) {
            Uri c = fVar.m3583c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C0154i.m3613a(context, cancellationSignal, c);
                gVar.put(c, byteBuffer);
            }
            if (!m3644a(b, byteBuffer, fVar.m3584b(), fVar.m3582d(), fVar.m3581e())) {
                return null;
            }
        }
        return Typeface.create(m3645a(b), i);
    }
}
