package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p050b.p051a.p052a.p053a.p054j.C0877a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0677c<V> {

    /* renamed from: a */
    private int f3406a = 0;

    /* renamed from: b */
    private int f3407b = 2;

    /* renamed from: c */
    private ViewPropertyAnimator f3408c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes.dex */
    public class C0926a extends AnimatorListenerAdapter {
        C0926a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f3408c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m314a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f3408c = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C0926a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo275a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f3408c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f3407b = 1;
        m314a((HideBottomViewOnScrollBehavior<V>) v, this.f3406a, 175L, C0877a.f3282b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo313a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f3407b != 1 && i2 > 0) {
            mo275a((HideBottomViewOnScrollBehavior<V>) v);
        } else if (this.f3407b != 2 && i2 < 0) {
            mo270b(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo46a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f3406a = v.getMeasuredHeight();
        return super.mo46a(coordinatorLayout, (CoordinatorLayout) v, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo270b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f3408c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f3407b = 2;
        m314a((HideBottomViewOnScrollBehavior<V>) v, 0, 225L, C0877a.f3283c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo311b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
