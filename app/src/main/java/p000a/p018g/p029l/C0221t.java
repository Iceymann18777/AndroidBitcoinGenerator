package p000a.p018g.p029l;

import android.os.Build;
import android.view.ViewGroup;
import p000a.p018g.C0122b;

/* renamed from: a.g.l.t */
/* loaded from: classes.dex */
public final class C0221t {
    /* renamed from: a */
    public static boolean m3381a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0122b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0216r.m3405p(viewGroup) == null) ? false : true;
    }
}
