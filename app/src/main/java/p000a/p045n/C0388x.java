package p000a.p045n;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: a.n.x */
/* loaded from: classes.dex */
class C0388x {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC0387w m2766a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C0386v(viewGroup) : C0385u.m2771a(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2765a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0391z.m2761a(viewGroup, z);
        } else {
            C0389y.m2763a(viewGroup, z);
        }
    }
}
