package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public class C0751j {

    /* renamed from: a */
    private static Map<Class, Integer> f2824a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends AbstractC0740c>>> f2825b = new HashMap();

    /* renamed from: a */
    private static AbstractC0740c m1364a(Constructor<? extends AbstractC0740c> constructor, Object obj) {
        try {
            return (AbstractC0740c) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC0741d m1366a(Object obj) {
        if (obj instanceof AbstractC0739b) {
            return new FullLifecycleObserverAdapter((AbstractC0739b) obj);
        }
        if (obj instanceof AbstractC0741d) {
            return (AbstractC0741d) obj;
        }
        Class<?> cls = obj.getClass();
        if (m1363b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends AbstractC0740c>> list = f2825b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m1364a(list.get(0), obj));
        }
        AbstractC0740c[] cVarArr = new AbstractC0740c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m1364a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: a */
    public static String m1365a(String str) {
        return str.replace("", "_") + "_LifecycleAdapter";
    }

    /* renamed from: a */
    private static Constructor<? extends AbstractC0740c> m1367a(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m1365a(canonicalName);
            if (!name.isEmpty()) {
                a = name + "" + a;
            }
            Constructor declaredConstructor = Class.forName(a).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m1363b(Class<?> cls) {
        if (f2824a.containsKey(cls)) {
            return f2824a.get(cls).intValue();
        }
        int d = m1361d(cls);
        f2824a.put(cls, Integer.valueOf(d));
        return d;
    }

    /* renamed from: c */
    private static boolean m1362c(Class<?> cls) {
        return cls != null && AbstractC0745f.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m1361d(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends AbstractC0740c> a = m1367a(cls);
        if (a != null) {
            f2825b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0736a.f2800c.m1400b(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m1362c(superclass)) {
                if (m1363b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f2825b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (m1362c(cls2)) {
                    if (m1363b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f2825b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2825b.put(cls, arrayList);
            return 2;
        }
    }
}
