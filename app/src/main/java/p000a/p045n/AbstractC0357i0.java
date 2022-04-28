package p000a.p045n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.n.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC0357i0 extends AbstractC0367m {

    /* renamed from: L */
    private static final String[] f1085L = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: K */
    private int f1086K = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.n.i0$a */
    /* loaded from: classes.dex */
    public class C0358a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC0387w f1087a;

        /* renamed from: b */
        final /* synthetic */ View f1088b;

        C0358a(AbstractC0357i0 i0Var, AbstractC0387w wVar, View view) {
            this.f1087a = wVar;
            this.f1088b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1087a.mo2768a(this.f1088b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.n.i0$b */
    /* loaded from: classes.dex */
    public static class C0359b extends AnimatorListenerAdapter implements AbstractC0367m.AbstractC0373f, C0319a.AbstractC0320a {

        /* renamed from: a */
        private final View f1089a;

        /* renamed from: b */
        private final int f1090b;

        /* renamed from: c */
        private final ViewGroup f1091c;

        /* renamed from: d */
        private final boolean f1092d;

        /* renamed from: e */
        private boolean f1093e;

        /* renamed from: f */
        boolean f1094f = false;

        C0359b(View view, int i, boolean z) {
            this.f1089a = view;
            this.f1090b = i;
            this.f1091c = (ViewGroup) view.getParent();
            this.f1092d = z;
            m2849a(true);
        }

        /* renamed from: a */
        private void m2850a() {
            if (!this.f1094f) {
                C0341d0.m2901a(this.f1089a, this.f1090b);
                ViewGroup viewGroup = this.f1091c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m2849a(false);
        }

        /* renamed from: a */
        private void m2849a(boolean z) {
            ViewGroup viewGroup;
            if (this.f1092d && this.f1093e != z && (viewGroup = this.f1091c) != null) {
                this.f1093e = z;
                C0388x.m2765a(viewGroup, z);
            }
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: a */
        public void mo2776a(AbstractC0367m mVar) {
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(AbstractC0367m mVar) {
            m2850a();
            mVar.mo2785b(this);
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: c */
        public void mo2809c(AbstractC0367m mVar) {
            m2849a(false);
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: d */
        public void mo2808d(AbstractC0367m mVar) {
            m2849a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1094f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m2850a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p000a.p045n.C0319a.AbstractC0320a
        public void onAnimationPause(Animator animator) {
            if (!this.f1094f) {
                C0341d0.m2901a(this.f1089a, this.f1090b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p000a.p045n.C0319a.AbstractC0320a
        public void onAnimationResume(Animator animator) {
            if (!this.f1094f) {
                C0341d0.m2901a(this.f1089a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.n.i0$c */
    /* loaded from: classes.dex */
    public static class C0360c {

        /* renamed from: a */
        boolean f1095a;

        /* renamed from: b */
        boolean f1096b;

        /* renamed from: c */
        int f1097c;

        /* renamed from: d */
        int f1098d;

        /* renamed from: e */
        ViewGroup f1099e;

        /* renamed from: f */
        ViewGroup f1100f;

        C0360c() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r0.f1099e == null) goto L_0x008c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (r0.f1097c == 0) goto L_0x0097;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.p045n.AbstractC0357i0.C0360c m2854b(p000a.p045n.C0383s r8, p000a.p045n.C0383s r9) {
        /*
            r7 = this;
            a.n.i0$c r0 = new a.n.i0$c
            r0.<init>()
            r1 = 0
            r0.f1095a = r1
            r0.f1096b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1166a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1166a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f1097c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1166a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1099e = r6
            goto L_0x0037
        L_0x0033:
            r0.f1097c = r4
            r0.f1099e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f1166a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1166a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f1098d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1166a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1100f = r2
            goto L_0x005e
        L_0x005a:
            r0.f1098d = r4
            r0.f1100f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0086
            int r8 = r0.f1097c
            int r9 = r0.f1098d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r8 = r0.f1099e
            android.view.ViewGroup r9 = r0.f1100f
            if (r8 != r9) goto L_0x0070
            return r0
        L_0x0070:
            int r8 = r0.f1097c
            int r9 = r0.f1098d
            if (r8 == r9) goto L_0x007c
            if (r8 != 0) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            if (r9 != 0) goto L_0x009a
            goto L_0x008c
        L_0x007c:
            android.view.ViewGroup r8 = r0.f1100f
            if (r8 != 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            android.view.ViewGroup r8 = r0.f1099e
            if (r8 != 0) goto L_0x009a
            goto L_0x008c
        L_0x0086:
            if (r8 != 0) goto L_0x0091
            int r8 = r0.f1098d
            if (r8 != 0) goto L_0x0091
        L_0x008c:
            r0.f1096b = r2
        L_0x008e:
            r0.f1095a = r2
            goto L_0x009a
        L_0x0091:
            if (r9 != 0) goto L_0x009a
            int r8 = r0.f1097c
            if (r8 != 0) goto L_0x009a
        L_0x0097:
            r0.f1096b = r1
            goto L_0x008e
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p045n.AbstractC0357i0.m2854b(a.n.s, a.n.s):a.n.i0$c");
    }

    /* renamed from: d */
    private void m2851d(C0383s sVar) {
        sVar.f1166a.put("android:visibility:visibility", Integer.valueOf(sVar.f1167b.getVisibility()));
        sVar.f1166a.put("android:visibility:parent", sVar.f1167b.getParent());
        int[] iArr = new int[2];
        sVar.f1167b.getLocationOnScreen(iArr);
        sVar.f1166a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public Animator m2856a(ViewGroup viewGroup, C0383s sVar, int i, C0383s sVar2, int i2) {
        if ((this.f1086K & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f1167b.getParent();
            if (m2854b(m2833a(view, false), m2825b(view, false)).f1095a) {
                return null;
            }
        }
        return mo2855a(viewGroup, sVar2.f1167b, sVar, sVar2);
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public Animator mo2831a(ViewGroup viewGroup, C0383s sVar, C0383s sVar2) {
        C0360c b = m2854b(sVar, sVar2);
        if (!b.f1095a) {
            return null;
        }
        if (b.f1099e == null && b.f1100f == null) {
            return null;
        }
        return b.f1096b ? m2856a(viewGroup, sVar, b.f1097c, sVar2, b.f1098d) : m2853b(viewGroup, sVar, b.f1097c, sVar2, b.f1098d);
    }

    /* renamed from: a */
    public abstract Animator mo2855a(ViewGroup viewGroup, View view, C0383s sVar, C0383s sVar2);

    /* renamed from: a */
    public void m2857a(int i) {
        if ((i & (-4)) == 0) {
            this.f1086K = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2792a(C0383s sVar) {
        m2851d(sVar);
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public boolean mo2839a(C0383s sVar, C0383s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f1166a.containsKey("android:visibility:visibility") != sVar.f1166a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0360c b = m2854b(sVar, sVar2);
        if (b.f1095a) {
            return b.f1097c == 0 || b.f1098d == 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9 A[RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator m2853b(android.view.ViewGroup r7, p000a.p045n.C0383s r8, int r9, p000a.p045n.C0383s r10, int r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p045n.AbstractC0357i0.m2853b(android.view.ViewGroup, a.n.s, int, a.n.s, int):android.animation.Animator");
    }

    /* renamed from: b */
    public abstract Animator mo2852b(ViewGroup viewGroup, View view, C0383s sVar, C0383s sVar2);

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2783c(C0383s sVar) {
        m2851d(sVar);
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: m */
    public String[] mo2813m() {
        return f1085L;
    }
}
