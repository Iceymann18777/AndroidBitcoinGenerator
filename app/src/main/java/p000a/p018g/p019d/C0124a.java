package p000a.p018g.p019d;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

/* renamed from: a.g.d.a */
/* loaded from: classes.dex */
public class C0124a {

    /* renamed from: a */
    private static final Object f535a = new Object();

    /* renamed from: b */
    private static TypedValue f536b;

    /* renamed from: a */
    public static ColorStateList m3734a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: a */
    public static boolean m3733a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: b */
    public static Drawable m3732b(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f535a) {
                if (f536b == null) {
                    f536b = new TypedValue();
                }
                context.getResources().getValue(i, f536b, true);
                i = f536b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }
}
