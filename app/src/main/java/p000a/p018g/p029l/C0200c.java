package p000a.p018g.p029l;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: a.g.l.c */
/* loaded from: classes.dex */
public final class C0200c {
    /* renamed from: a */
    public static int m3490a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }

    /* renamed from: a */
    public static void m3489a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }
}
