package p000a.p018g.p029l;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: a.g.l.f */
/* loaded from: classes.dex */
public final class C0204f {
    /* renamed from: a */
    public static int m3480a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m3479b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }
}
