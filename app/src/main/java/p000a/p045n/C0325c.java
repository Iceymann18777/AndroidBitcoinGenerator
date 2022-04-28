package p000a.p045n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p000a.p018g.p029l.C0216r;

/* renamed from: a.n.c */
/* loaded from: classes.dex */
public class C0325c extends AbstractC0367m {

    /* renamed from: N */
    private static final String[] f1020N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O */
    private static final Property<Drawable, PointF> f1021O = new C0327b(PointF.class, "boundsOrigin");

    /* renamed from: P */
    private static final Property<C0336k, PointF> f1022P = new C0328c(PointF.class, "topLeft");

    /* renamed from: Q */
    private static final Property<C0336k, PointF> f1023Q = new C0329d(PointF.class, "bottomRight");

    /* renamed from: R */
    private static final Property<View, PointF> f1024R = new C0330e(PointF.class, "bottomRight");

    /* renamed from: S */
    private static final Property<View, PointF> f1025S = new C0331f(PointF.class, "topLeft");

    /* renamed from: T */
    private static final Property<View, PointF> f1026T = new C0332g(PointF.class, "position");

    /* renamed from: U */
    private static C0363k f1027U = new C0363k();

    /* renamed from: K */
    private int[] f1028K = new int[2];

    /* renamed from: L */
    private boolean f1029L = false;

    /* renamed from: M */
    private boolean f1030M = false;

    /* renamed from: a.n.c$a */
    /* loaded from: classes.dex */
    class C0326a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1031a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f1032b;

        /* renamed from: c */
        final /* synthetic */ View f1033c;

        /* renamed from: d */
        final /* synthetic */ float f1034d;

        C0326a(C0325c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f1031a = viewGroup;
            this.f1032b = bitmapDrawable;
            this.f1033c = view;
            this.f1034d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0341d0.m2898b(this.f1031a).mo2770a(this.f1032b);
            C0341d0.m2902a(this.f1033c, this.f1034d);
        }
    }

    /* renamed from: a.n.c$b */
    /* loaded from: classes.dex */
    static class C0327b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f1035a = new Rect();

        C0327b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f1035a);
            Rect rect = this.f1035a;
            return new PointF(rect.left, rect.top);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f1035a);
            this.f1035a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1035a);
        }
    }

    /* renamed from: a.n.c$c */
    /* loaded from: classes.dex */
    static class C0328c extends Property<C0336k, PointF> {
        C0328c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0336k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C0336k kVar, PointF pointF) {
            kVar.m2907b(pointF);
        }
    }

    /* renamed from: a.n.c$d */
    /* loaded from: classes.dex */
    static class C0329d extends Property<C0336k, PointF> {
        C0329d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0336k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C0336k kVar, PointF pointF) {
            kVar.m2908a(pointF);
        }
    }

    /* renamed from: a.n.c$e */
    /* loaded from: classes.dex */
    static class C0330e extends Property<View, PointF> {
        C0330e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C0341d0.m2900a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: a.n.c$f */
    /* loaded from: classes.dex */
    static class C0331f extends Property<View, PointF> {
        C0331f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C0341d0.m2900a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a.n.c$g */
    /* loaded from: classes.dex */
    static class C0332g extends Property<View, PointF> {
        C0332g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0341d0.m2900a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: a.n.c$h */
    /* loaded from: classes.dex */
    class C0333h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0336k f1036a;
        private C0336k mViewBounds;

        C0333h(C0325c cVar, C0336k kVar) {
            this.f1036a = kVar;
            this.mViewBounds = this.f1036a;
        }
    }

    /* renamed from: a.n.c$i */
    /* loaded from: classes.dex */
    class C0334i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f1037a;

        /* renamed from: b */
        final /* synthetic */ View f1038b;

        /* renamed from: c */
        final /* synthetic */ Rect f1039c;

        /* renamed from: d */
        final /* synthetic */ int f1040d;

        /* renamed from: e */
        final /* synthetic */ int f1041e;

        /* renamed from: f */
        final /* synthetic */ int f1042f;

        /* renamed from: g */
        final /* synthetic */ int f1043g;

        C0334i(C0325c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f1038b = view;
            this.f1039c = rect;
            this.f1040d = i;
            this.f1041e = i2;
            this.f1042f = i3;
            this.f1043g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1037a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f1037a) {
                C0216r.m3435a(this.f1038b, this.f1039c);
                C0341d0.m2900a(this.f1038b, this.f1040d, this.f1041e, this.f1042f, this.f1043g);
            }
        }
    }

    /* renamed from: a.n.c$j */
    /* loaded from: classes.dex */
    class C0335j extends C0374n {

        /* renamed from: a */
        boolean f1044a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f1045b;

        C0335j(C0325c cVar, ViewGroup viewGroup) {
            this.f1045b = viewGroup;
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(AbstractC0367m mVar) {
            if (!this.f1044a) {
                C0388x.m2765a(this.f1045b, false);
            }
            mVar.mo2785b(this);
        }

        @Override // p000a.p045n.C0374n, p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: c */
        public void mo2809c(AbstractC0367m mVar) {
            C0388x.m2765a(this.f1045b, false);
        }

        @Override // p000a.p045n.C0374n, p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: d */
        public void mo2808d(AbstractC0367m mVar) {
            C0388x.m2765a(this.f1045b, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.n.c$k */
    /* loaded from: classes.dex */
    public static class C0336k {

        /* renamed from: a */
        private int f1046a;

        /* renamed from: b */
        private int f1047b;

        /* renamed from: c */
        private int f1048c;

        /* renamed from: d */
        private int f1049d;

        /* renamed from: e */
        private View f1050e;

        /* renamed from: f */
        private int f1051f;

        /* renamed from: g */
        private int f1052g;

        C0336k(View view) {
            this.f1050e = view;
        }

        /* renamed from: a */
        private void m2909a() {
            C0341d0.m2900a(this.f1050e, this.f1046a, this.f1047b, this.f1048c, this.f1049d);
            this.f1051f = 0;
            this.f1052g = 0;
        }

        /* renamed from: a */
        void m2908a(PointF pointF) {
            this.f1048c = Math.round(pointF.x);
            this.f1049d = Math.round(pointF.y);
            this.f1052g++;
            if (this.f1051f == this.f1052g) {
                m2909a();
            }
        }

        /* renamed from: b */
        void m2907b(PointF pointF) {
            this.f1046a = Math.round(pointF.x);
            this.f1047b = Math.round(pointF.y);
            this.f1051f++;
            if (this.f1051f == this.f1052g) {
                m2909a();
            }
        }
    }

    /* renamed from: a */
    private boolean m2923a(View view, View view2) {
        if (!this.f1030M) {
            return true;
        }
        C0383s a = m2833a(view, true);
        if (a == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a.f1167b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m2922d(C0383s sVar) {
        View view = sVar.f1167b;
        if (C0216r.m3397x(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f1166a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f1166a.put("android:changeBounds:parent", sVar.f1167b.getParent());
            if (this.f1030M) {
                sVar.f1167b.getLocationInWindow(this.f1028K);
                sVar.f1166a.put("android:changeBounds:windowX", Integer.valueOf(this.f1028K[0]));
                sVar.f1166a.put("android:changeBounds:windowY", Integer.valueOf(this.f1028K[1]));
            }
            if (this.f1029L) {
                sVar.f1166a.put("android:changeBounds:clip", C0216r.m3421d(view));
            }
        }
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public Animator mo2831a(ViewGroup viewGroup, C0383s sVar, C0383s sVar2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f1166a;
        Map<String, Object> map2 = sVar2.f1166a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f1167b;
        if (m2923a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f1166a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f1166a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect4 = (Rect) sVar.f1166a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f1166a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            if (!this.f1029L) {
                view = view2;
                C0341d0.m2900a(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = m2820f().mo2810a(i3, i5, i4, i6);
                        property = f1026T;
                    } else {
                        C0336k kVar = new C0336k(view);
                        ObjectAnimator a = C0350f.m2870a(kVar, f1022P, m2820f().mo2810a(i3, i5, i4, i6));
                        ObjectAnimator a2 = C0350f.m2870a(kVar, f1023Q, m2820f().mo2810a(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a, a2);
                        animatorSet.addListener(new C0333h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = m2820f().mo2810a(i7, i9, i8, i10);
                    property = f1024R;
                } else {
                    path = m2820f().mo2810a(i3, i5, i4, i6);
                    property = f1025S;
                }
                animator = C0350f.m2870a(view, property, path);
            } else {
                view = view2;
                C0341d0.m2900a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C0350f.m2870a(view, f1026T, m2820f().mo2810a(i3, i5, i4, i6));
                if (rect4 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
                if (!rect.equals(rect6)) {
                    C0216r.m3435a(view, rect);
                    C0363k kVar2 = f1027U;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect6;
                    objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    objectAnimator.addListener(new C0334i(this, view, rect5, i4, i6, i8, i10));
                } else {
                    objectAnimator = null;
                }
                animator = C0382r.m2774a(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C0388x.m2765a(viewGroup4, true);
                mo2795a(new C0335j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar.f1166a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar.f1166a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar2.f1166a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar2.f1166a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f1028K);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C0341d0.m2896c(view2);
        C0341d0.m2902a(view2, 0.0f);
        C0341d0.m2898b(viewGroup).mo2769b(bitmapDrawable);
        AbstractC0352g f = m2820f();
        int[] iArr = this.f1028K;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C0356i.m2858a(f1021O, f.mo2810a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new C0326a(this, viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2792a(C0383s sVar) {
        m2922d(sVar);
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2783c(C0383s sVar) {
        m2922d(sVar);
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: m */
    public String[] mo2813m() {
        return f1020N;
    }
}
