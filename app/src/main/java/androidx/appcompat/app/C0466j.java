package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
class C0466j {

    /* renamed from: a */
    private static Field f1510a;

    /* renamed from: b */
    private static boolean f1511b;

    /* renamed from: c */
    private static Class f1512c;

    /* renamed from: d */
    private static boolean f1513d;

    /* renamed from: e */
    private static Field f1514e;

    /* renamed from: f */
    private static boolean f1515f;

    /* renamed from: g */
    private static Field f1516g;

    /* renamed from: h */
    private static boolean f1517h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2524a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m2520d(resources);
            } else if (i >= 23) {
                m2521c(resources);
            } else if (i >= 21) {
                m2522b(resources);
            }
        }
    }

    /* renamed from: a */
    private static void m2523a(Object obj) {
        if (!f1513d) {
            try {
                f1512c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1513d = true;
        }
        Class cls = f1512c;
        if (cls != null) {
            if (!f1515f) {
                try {
                    f1514e = cls.getDeclaredField("mUnthemedEntries");
                    f1514e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f1515f = true;
            }
            Field field = f1514e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m2522b(Resources resources) {
        if (!f1511b) {
            try {
                f1510a = Resources.class.getDeclaredField("mDrawableCache");
                f1510a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1511b = true;
        }
        Field field = f1510a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m2521c(Resources resources) {
        if (!f1511b) {
            try {
                f1510a = Resources.class.getDeclaredField("mDrawableCache");
                f1510a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1511b = true;
        }
        Object obj = null;
        Field field = f1510a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m2523a(obj);
        }
    }

    /* renamed from: d */
    private static void m2520d(Resources resources) {
        Object obj;
        if (!f1517h) {
            try {
                f1516g = Resources.class.getDeclaredField("mResourcesImpl");
                f1516g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1517h = true;
        }
        Field field = f1516g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f1511b) {
                    try {
                        f1510a = obj.getClass().getDeclaredField("mDrawableCache");
                        f1510a.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f1511b = true;
                }
                Field field2 = f1510a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m2523a(obj2);
                }
            }
        }
    }
}
