package p000a.p018g.p029l.p030a0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: a.g.l.a0.a */
/* loaded from: classes.dex */
public final class C0187a {
    /* renamed from: a */
    public static int m3549a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m3548a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
