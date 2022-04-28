package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
class C0736a {

    /* renamed from: c */
    static C0736a f2800c = new C0736a();

    /* renamed from: a */
    private final Map<Class, C0737a> f2801a = new HashMap();

    /* renamed from: b */
    private final Map<Class, Boolean> f2802b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class C0737a {

        /* renamed from: a */
        final Map<AbstractC0742e.EnumC0743a, List<C0738b>> f2803a = new HashMap();

        /* renamed from: b */
        final Map<C0738b, AbstractC0742e.EnumC0743a> f2804b;

        C0737a(Map<C0738b, AbstractC0742e.EnumC0743a> map) {
            this.f2804b = map;
            for (Map.Entry<C0738b, AbstractC0742e.EnumC0743a> entry : map.entrySet()) {
                AbstractC0742e.EnumC0743a value = entry.getValue();
                List<C0738b> list = this.f2803a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f2803a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        private static void m1397a(List<C0738b> list, AbstractC0746g gVar, AbstractC0742e.EnumC0743a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m1396a(gVar, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m1398a(AbstractC0746g gVar, AbstractC0742e.EnumC0743a aVar, Object obj) {
            m1397a(this.f2803a.get(aVar), gVar, aVar, obj);
            m1397a(this.f2803a.get(AbstractC0742e.EnumC0743a.ON_ANY), gVar, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$b */
    /* loaded from: classes.dex */
    public static class C0738b {

        /* renamed from: a */
        final int f2805a;

        /* renamed from: b */
        final Method f2806b;

        C0738b(int i, Method method) {
            this.f2805a = i;
            this.f2806b = method;
            this.f2806b.setAccessible(true);
        }

        /* renamed from: a */
        void m1396a(AbstractC0746g gVar, AbstractC0742e.EnumC0743a aVar, Object obj) {
            try {
                int i = this.f2805a;
                if (i == 0) {
                    this.f2806b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2806b.invoke(obj, gVar);
                } else if (i == 2) {
                    this.f2806b.invoke(obj, gVar, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0738b.class != obj.getClass()) {
                return false;
            }
            C0738b bVar = (C0738b) obj;
            return this.f2805a == bVar.f2805a && this.f2806b.getName().equals(bVar.f2806b.getName());
        }

        public int hashCode() {
            return (this.f2805a * 31) + this.f2806b.getName().hashCode();
        }
    }

    C0736a() {
    }

    /* renamed from: a */
    private C0737a m1402a(Class cls, Method[] methodArr) {
        int i;
        C0737a a;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a = m1403a(superclass)) == null)) {
            hashMap.putAll(a.f2804b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0738b, AbstractC0742e.EnumC0743a> entry : m1403a(cls2).f2804b.entrySet()) {
                m1401a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m1399c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            AbstractC0755n nVar = (AbstractC0755n) method.getAnnotation(AbstractC0755n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(AbstractC0746g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                AbstractC0742e.EnumC0743a value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0742e.EnumC0743a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == AbstractC0742e.EnumC0743a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m1401a(hashMap, new C0738b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0737a aVar = new C0737a(hashMap);
        this.f2801a.put(cls, aVar);
        this.f2802b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private void m1401a(Map<C0738b, AbstractC0742e.EnumC0743a> map, C0738b bVar, AbstractC0742e.EnumC0743a aVar, Class cls) {
        AbstractC0742e.EnumC0743a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2806b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: c */
    private Method[] m1399c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0737a m1403a(Class cls) {
        C0737a aVar = this.f2801a.get(cls);
        return aVar != null ? aVar : m1402a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m1400b(Class cls) {
        if (this.f2802b.containsKey(cls)) {
            return this.f2802b.get(cls).booleanValue();
        }
        Method[] c = m1399c(cls);
        for (Method method : c) {
            if (((AbstractC0755n) method.getAnnotation(AbstractC0755n.class)) != null) {
                m1402a(cls, c);
                return true;
            }
        }
        this.f2802b.put(cls, false);
        return false;
    }
}
