package p000a.p045n;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.n.l */
/* loaded from: classes.dex */
public class C0365l {

    /* renamed from: a */
    private ViewGroup f1104a;

    /* renamed from: b */
    private Runnable f1105b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0365l m2846a(View view) {
        return (C0365l) view.getTag(C0361j.transition_current_scene);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2845a(View view, C0365l lVar) {
        view.setTag(C0361j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public void m2847a() {
        Runnable runnable;
        if (m2846a(this.f1104a) == this && (runnable = this.f1105b) != null) {
            runnable.run();
        }
    }
}
