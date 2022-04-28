package p000a.p018g.p029l.p030a0;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: a.g.l.a0.e */
/* loaded from: classes.dex */
public class C0196e {
    /* renamed from: a */
    public static void m3494a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m3493b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }
}
