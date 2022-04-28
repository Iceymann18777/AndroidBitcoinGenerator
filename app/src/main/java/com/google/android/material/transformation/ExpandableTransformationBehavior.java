package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f3646b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C0999a extends AnimatorListenerAdapter {
        C0999a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f3646b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    public boolean mo16a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f3646b != null;
        if (z3) {
            this.f3646b.cancel();
        }
        this.f3646b = mo19b(view, view2, z, z3);
        this.f3646b.addListener(new C0999a());
        this.f3646b.start();
        if (!z2) {
            this.f3646b.end();
        }
        return true;
    }

    /* renamed from: b */
    protected abstract AnimatorSet mo19b(View view, View view2, boolean z, boolean z2);
}
