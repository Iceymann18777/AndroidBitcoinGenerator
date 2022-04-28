package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000a.p018g.p029l.C0200c;
import p000a.p018g.p029l.C0216r;

/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public final class C0719h {

    /* renamed from: a */
    private static Method f2712a;

    /* renamed from: b */
    private static boolean f2713b;

    /* renamed from: c */
    private static Field f2714c;

    /* renamed from: d */
    private static boolean f2715d;

    /* renamed from: a */
    public static void m1500a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f2713b) {
            try {
                f2712a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2712a.setAccessible(true);
            } catch (Exception unused) {
            }
            f2713b = true;
        }
        Method method = f2712a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m1499a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0200c.m3490a(i3, C0216r.m3411j(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: a */
    public static void m1498a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            if (!f2715d) {
                try {
                    f2714c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2714c.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f2715d = true;
            }
            Field field = f2714c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }
}
