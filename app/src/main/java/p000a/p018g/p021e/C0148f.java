package p000a.p018g.p021e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000a.p018g.p019d.p020c.C0128c;
import p000a.p018g.p026i.C0161b;

/* renamed from: a.g.e.f */
/* loaded from: classes.dex */
public class C0148f extends C0146d {

    /* renamed from: a */
    protected final Class f566a;

    /* renamed from: b */
    protected final Constructor f567b;

    /* renamed from: c */
    protected final Method f568c;

    /* renamed from: d */
    protected final Method f569d;

    /* renamed from: e */
    protected final Method f570e;

    /* renamed from: f */
    protected final Method f571f;

    /* renamed from: g */
    protected final Method f572g;

    public C0148f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class a = m3642a();
            constructor = m3632e(a);
            method4 = m3637b(a);
            method3 = m3634c(a);
            method2 = m3631f(a);
            method = m3640a(a);
            method5 = mo3629d(a);
            cls = a;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f566a = cls;
        this.f567b = constructor;
        this.f568c = method4;
        this.f569d = method3;
        this.f570e = method2;
        this.f571f = method;
        this.f572g = method5;
    }

    /* renamed from: a */
    private boolean m3641a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f568c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m3639a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f569d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private void m3636b(Object obj) {
        try {
            this.f571f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private boolean m3638b() {
        if (this.f568c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f568c != null;
    }

    /* renamed from: c */
    private Object m3635c() {
        try {
            return this.f567b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private boolean m3633c(Object obj) {
        try {
            return ((Boolean) this.f570e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public Typeface mo3627a(Context context, C0128c.C0130b bVar, Resources resources, int i) {
        C0128c.C0131c[] a;
        if (!m3638b()) {
            return super.mo3627a(context, bVar, resources, i);
        }
        Object c = m3635c();
        for (C0128c.C0131c cVar : bVar.m3704a()) {
            if (!m3641a(context, c, cVar.m3703a(), cVar.m3701c(), cVar.m3699e(), cVar.m3698f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m3700d()))) {
                m3636b(c);
                return null;
            }
        }
        if (!m3633c(c)) {
            return null;
        }
        return mo3630a(c);
    }

    @Override // p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public Typeface mo3626a(Context context, Resources resources, int i, String str, int i2) {
        if (!m3638b()) {
            return super.mo3626a(context, resources, i, str, i2);
        }
        Object c = m3635c();
        if (!m3641a(context, c, str, 0, -1, -1, null)) {
            m3636b(c);
            return null;
        } else if (!m3633c(c)) {
            return null;
        } else {
            return mo3630a(c);
        }
    }

    @Override // p000a.p018g.p021e.C0146d, p000a.p018g.p021e.C0150h
    /* renamed from: a */
    public Typeface mo3625a(Context context, CancellationSignal cancellationSignal, C0161b.C0167f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        if (!m3638b()) {
            C0161b.C0167f a = m3623a(fVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a.m3583c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(a.m3582d()).setItalic(a.m3581e()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> a2 = C0161b.m3594a(context, fVarArr, cancellationSignal);
            Object c = m3635c();
            boolean z = false;
            for (C0161b.C0167f fVar : fVarArr) {
                ByteBuffer byteBuffer = a2.get(fVar.m3583c());
                if (byteBuffer != null) {
                    if (!m3639a(c, byteBuffer, fVar.m3584b(), fVar.m3582d(), fVar.m3581e() ? 1 : 0)) {
                        m3636b(c);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m3636b(c);
                return null;
            } else if (!m3633c(c)) {
                return null;
            } else {
                return Typeface.create(mo3630a(c), i);
            }
        }
    }

    /* renamed from: a */
    protected Typeface mo3630a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f566a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f572g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    protected Class m3642a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: a */
    protected Method m3640a(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: b */
    protected Method m3637b(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: c */
    protected Method m3634c(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: d */
    protected Method mo3629d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: e */
    protected Constructor m3632e(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: f */
    protected Method m3631f(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
