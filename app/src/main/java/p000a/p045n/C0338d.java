package p000a.p045n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p000a.p018g.p029l.C0216r;

/* renamed from: a.n.d */
/* loaded from: classes.dex */
public class C0338d extends AbstractC0357i0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.n.d$a */
    /* loaded from: classes.dex */
    public class C0339a extends C0374n {

        /* renamed from: a */
        final /* synthetic */ View f1053a;

        C0339a(C0338d dVar, View view) {
            this.f1053a = view;
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(AbstractC0367m mVar) {
            C0341d0.m2902a(this.f1053a, 1.0f);
            C0341d0.m2903a(this.f1053a);
            mVar.mo2785b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.n.d$b */
    /* loaded from: classes.dex */
    public static class C0340b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f1054a;

        /* renamed from: b */
        private boolean f1055b = false;

        C0340b(View view) {
            this.f1054a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0341d0.m2902a(this.f1054a, 1.0f);
            if (this.f1055b) {
                this.f1054a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C0216r.m3400u(this.f1054a) && this.f1054a.getLayerType() == 0) {
                this.f1055b = true;
                this.f1054a.setLayerType(2, null);
            }
        }
    }

    public C0338d(int i) {
        m2857a(i);
    }

    /* renamed from: a */
    private static float m2906a(C0383s sVar, float f) {
        Float f2;
        return (sVar == null || (f2 = (Float) sVar.f1166a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* renamed from: a */
    private Animator m2905a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0341d0.m2902a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0341d0.f1059d, f2);
        ofFloat.addListener(new C0340b(view));
        mo2795a(new C0339a(this, view));
        return ofFloat;
    }

    @Override // p000a.p045n.AbstractC0357i0
    /* renamed from: a */
    public Animator mo2855a(ViewGroup viewGroup, View view, C0383s sVar, C0383s sVar2) {
        float f = 0.0f;
        float a = m2906a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m2905a(view, f, 1.0f);
    }

    @Override // p000a.p045n.AbstractC0357i0
    /* renamed from: b */
    public Animator mo2852b(ViewGroup viewGroup, View view, C0383s sVar, C0383s sVar2) {
        C0341d0.m2894e(view);
        return m2905a(view, m2906a(sVar, 1.0f), 0.0f);
    }

    @Override // p000a.p045n.AbstractC0357i0, p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2783c(C0383s sVar) {
        super.mo2783c(sVar);
        sVar.f1166a.put("android:fade:transitionAlpha", Float.valueOf(C0341d0.m2896c(sVar.f1167b)));
    }
}
