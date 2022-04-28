package p050b.p051a.p052a.p053a.p056l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: b.a.a.a.l.a */
/* loaded from: classes.dex */
public final class C0890a {

    /* renamed from: b.a.a.a.l.a$a */
    /* loaded from: classes.dex */
    static class C0891a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC0895d f3333a;

        C0891a(AbstractC0895d dVar) {
            this.f3333a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3333a.mo412a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3333a.mo411b();
        }
    }

    /* renamed from: a */
    public static Animator.AnimatorListener m430a(AbstractC0895d dVar) {
        return new C0891a(dVar);
    }

    /* renamed from: a */
    public static Animator m429a(AbstractC0895d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, (Property<AbstractC0895d, V>) AbstractC0895d.C0898c.f3338a, (TypeEvaluator) AbstractC0895d.C0897b.f3336b, (Object[]) new AbstractC0895d.C0900e[]{new AbstractC0895d.C0900e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        AbstractC0895d.C0900e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f3342c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
