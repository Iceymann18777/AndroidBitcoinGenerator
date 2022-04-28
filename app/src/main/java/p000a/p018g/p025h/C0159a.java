package p000a.p018g.p025h;

import android.os.Build;
import android.os.Trace;

/* renamed from: a.g.h.a */
/* loaded from: classes.dex */
public final class C0159a {
    /* renamed from: a */
    public static void m3607a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m3606a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
