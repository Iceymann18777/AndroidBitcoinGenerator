package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0698a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p000a.p018g.p029l.C0216r;
import p000a.p033i.p034a.AbstractC0237a;
import p050b.p051a.p052a.p053a.p054j.C0877a;
import p050b.p051a.p052a.p053a.p063r.C0911b;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AbstractC0676b {

    /* renamed from: Q */
    private final int f3426Q;

    /* renamed from: R */
    private final C0911b f3427R;

    /* renamed from: S */
    private final C0935a f3428S;

    /* renamed from: T */
    private Animator f3429T;

    /* renamed from: U */
    private Animator f3430U;

    /* renamed from: V */
    private Animator f3431V;

    /* renamed from: W */
    private int f3432W;

    /* renamed from: a0 */
    private boolean f3433a0;

    /* renamed from: b0 */
    private boolean f3434b0;

    /* renamed from: c0 */
    AnimatorListenerAdapter f3435c0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d */
        private final Rect f3436d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private boolean m271a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((CoordinatorLayout.C0680f) floatingActionButton.getLayoutParams()).f2597d = 17;
            bottomAppBar.m289a(floatingActionButton);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo275a(BottomAppBar bottomAppBar) {
            super.mo275a((Behavior) bottomAppBar);
            FloatingActionButton m = bottomAppBar.m279m();
            if (m != null) {
                m.m225a(this.f3436d);
                m.clearAnimation();
                m.animate().translationY((-m.getPaddingBottom()) + (m.getMeasuredHeight() - this.f3436d.height())).setInterpolator(C0877a.f3282b).setDuration(175L);
            }
        }

        /* renamed from: a */
        public boolean mo46a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton m = bottomAppBar.m279m();
            if (m != null) {
                m271a(m, bottomAppBar);
                m.m218b(this.f3436d);
                bottomAppBar.setFabDiameter(this.f3436d.height());
            }
            if (bottomAppBar.m278n()) {
                coordinatorLayout.m1697c(bottomAppBar, i);
                return super.mo46a(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i);
            }
            BottomAppBar.m282c(bottomAppBar);
            throw null;
        }

        /* renamed from: a */
        public boolean mo248b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo248b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public void mo270b(BottomAppBar bottomAppBar) {
            super.mo270b((Behavior) bottomAppBar);
            FloatingActionButton m = bottomAppBar.m279m();
            if (m != null) {
                m.clearAnimation();
                m.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C0877a.f3283c).setDuration(225L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes.dex */
    public class C0930a extends AnimatorListenerAdapter {
        C0930a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f3430U = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes.dex */
    public class C0931b extends AnimatorListenerAdapter {
        C0931b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f3431V = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes.dex */
    public class C0932c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f3439a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f3440b;

        /* renamed from: c */
        final /* synthetic */ int f3441c;

        /* renamed from: d */
        final /* synthetic */ boolean f3442d;

        C0932c(ActionMenuView actionMenuView, int i, boolean z) {
            this.f3440b = actionMenuView;
            this.f3441c = i;
            this.f3442d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3439a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3439a) {
                BottomAppBar.this.m294a(this.f3440b, this.f3441c, this.f3442d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes.dex */
    public static class C0933d extends AbstractC0237a {
        public static final Parcelable.Creator<C0933d> CREATOR = new C0934a();

        /* renamed from: d */
        int f3444d;

        /* renamed from: e */
        boolean f3445e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d$a */
        /* loaded from: classes.dex */
        static class C0934a implements Parcelable.ClassLoaderCreator<C0933d> {
            C0934a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0933d createFromParcel(Parcel parcel) {
                return new C0933d(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0933d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0933d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public C0933d[] newArray(int i) {
                return new C0933d[i];
            }
        }

        public C0933d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3444d = parcel.readInt();
            this.f3445e = parcel.readInt() != 0;
        }

        public C0933d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3444d);
            parcel.writeInt(this.f3445e ? 1 : 0);
        }
    }

    /* renamed from: a */
    private float m288a(boolean z) {
        FloatingActionButton m = m279m();
        if (m == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        m.m225a(rect);
        float height = rect.height();
        if (height == 0.0f) {
            height = m.getMeasuredHeight();
        }
        float height2 = m.getHeight() - rect.height();
        r0 = (-getCradleVerticalOffset()) + (height / 2.0f) + (m.getHeight() - rect.bottom);
        float paddingBottom = height2 - m.getPaddingBottom();
        float f = -getMeasuredHeight();
        if (z) {
        }
        return f + paddingBottom;
    }

    /* renamed from: a */
    private int m298a(int i) {
        int i2 = 1;
        boolean z = C0216r.m3411j(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f3426Q;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    /* renamed from: a */
    private void m297a(int i, List<Animator> list) {
        if (this.f3434b0) {
            this.f3428S.m260e();
            throw null;
        }
    }

    /* renamed from: a */
    private void m296a(int i, boolean z) {
        if (C0216r.m3397x(this)) {
            Animator animator = this.f3431V;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m277o()) {
                i = 0;
                z = false;
            }
            m295a(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f3431V = animatorSet;
            this.f3431V.addListener(new C0931b());
            this.f3431V.start();
        }
    }

    /* renamed from: a */
    private void m295a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if ((this.f3434b0 || (z && m277o())) && (this.f3432W == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.addListener(new C0932c(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m294a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C0216r.m3411j(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0559e) && (((Toolbar.C0559e) childAt.getLayoutParams()).f1393a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m289a(FloatingActionButton floatingActionButton) {
        m283b(floatingActionButton);
        floatingActionButton.m226a(this.f3435c0);
        floatingActionButton.m219b(this.f3435c0);
    }

    /* renamed from: b */
    private void m287b(int i) {
        if (this.f3432W != i && C0216r.m3397x(this)) {
            Animator animator = this.f3430U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            m297a(i, arrayList);
            m286b(i, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f3430U = animatorSet;
            this.f3430U.addListener(new C0930a());
            this.f3430U.start();
        }
    }

    /* renamed from: b */
    private void m286b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m279m(), "translationX", m298a(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: b */
    private void m283b(FloatingActionButton floatingActionButton) {
        floatingActionButton.m215c(this.f3435c0);
        floatingActionButton.m212d(this.f3435c0);
    }

    /* renamed from: c */
    static /* synthetic */ void m282c(BottomAppBar bottomAppBar) {
        bottomAppBar.m276p();
        throw null;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return m298a(this.f3432W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationY() {
        return m288a(this.f3434b0);
    }

    /* renamed from: l */
    private void m280l() {
        Animator animator = this.f3429T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f3431V;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f3430U;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public FloatingActionButton m279m() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m1698c(this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m278n() {
        Animator animator;
        Animator animator2;
        Animator animator3 = this.f3429T;
        return (animator3 != null && animator3.isRunning()) || ((animator = this.f3431V) != null && animator.isRunning()) || ((animator2 = this.f3430U) != null && animator2.isRunning());
    }

    /* renamed from: o */
    private boolean m277o() {
        FloatingActionButton m = m279m();
        return m != null && m.m220b();
    }

    /* renamed from: p */
    private void m276p() {
        this.f3428S.m261d(getFabTranslationX());
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        this.f3427R.m390a();
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0676b
    public CoordinatorLayout.AbstractC0677c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        this.f3428S.m268a();
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.f3432W;
    }

    public float getFabCradleMargin() {
        this.f3428S.m266b();
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        this.f3428S.m264c();
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.f3433a0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m280l();
        m276p();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0933d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0933d dVar = (C0933d) parcelable;
        super.onRestoreInstanceState(dVar.m3347a());
        this.f3432W = dVar.f3444d;
        this.f3434b0 = dVar.f3445e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        C0933d dVar = new C0933d(super.onSaveInstanceState());
        dVar.f3444d = this.f3432W;
        dVar.f3445e = this.f3434b0;
        return dVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0698a.m1603a(this.f3427R, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f3428S.m267a(f);
            throw null;
        }
    }

    public void setFabAlignmentMode(int i) {
        m287b(i);
        m296a(i, this.f3434b0);
        this.f3432W = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f3428S.m265b(f);
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f3428S.m263c(f);
            throw null;
        }
    }

    void setFabDiameter(int i) {
        this.f3428S.m262d();
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f3433a0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
