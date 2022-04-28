package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.internal.C0983l;
import java.util.ArrayList;
import p050b.p051a.p052a.p053a.p061p.C0907a;
import p050b.p051a.p052a.p053a.p062q.AbstractC0909b;
import p050b.p051a.p052a.p053a.p062q.C0908a;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
class C0954b extends C0944a {

    /* renamed from: I */
    private InsetDrawable f3547I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0954b(C0983l lVar, AbstractC0909b bVar) {
        super(lVar, bVar);
    }

    /* renamed from: a */
    private Animator m160a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f3526u, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f3526u, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C0944a.f3498B);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: a */
    void mo159a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f3526u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C0944a.f3499C, m160a(f, f3));
            stateListAnimator.addState(C0944a.f3500D, m160a(f, f2));
            stateListAnimator.addState(C0944a.f3501E, m160a(f, f2));
            stateListAnimator.addState(C0944a.f3502F, m160a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f3526u, "elevation", f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                C0983l lVar = this.f3526u;
                arrayList.add(ObjectAnimator.ofFloat(lVar, View.TRANSLATION_Z, lVar.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f3526u, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C0944a.f3498B);
            stateListAnimator.addState(C0944a.f3503G, animatorSet);
            stateListAnimator.addState(C0944a.f3504H, m160a(0.0f, 0.0f));
            this.f3526u.setStateListAnimator(stateListAnimator);
        }
        if (this.f3527v.mo200a()) {
            m168p();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: a */
    void mo158a(Rect rect) {
        if (this.f3527v.mo200a()) {
            float b = this.f3527v.mo197b();
            float b2 = mo156b() + this.f3521p;
            int ceil = (int) Math.ceil(C0908a.m394a(b2, b, false));
            int ceil2 = (int) Math.ceil(C0908a.m391b(b2, b, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: a */
    public void mo157a(int[] iArr) {
        C0983l lVar;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f3526u.isEnabled()) {
                this.f3526u.setElevation(this.f3519n);
                if (this.f3526u.isPressed()) {
                    lVar = this.f3526u;
                    f = this.f3521p;
                } else if (this.f3526u.isFocused() || this.f3526u.isHovered()) {
                    lVar = this.f3526u;
                    f = this.f3520o;
                }
                lVar.setTranslationZ(f);
            }
            this.f3526u.setElevation(0.0f);
            lVar = this.f3526u;
            lVar.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: b */
    public float mo156b() {
        return this.f3526u.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: b */
    public void mo155b(ColorStateList colorStateList) {
        Drawable drawable = this.f3516k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C0907a.m398a(colorStateList));
        } else {
            super.mo155b(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: b */
    void mo154b(Rect rect) {
        AbstractC0909b bVar;
        Drawable drawable;
        if (this.f3527v.mo200a()) {
            this.f3547I = new InsetDrawable(this.f3516k, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.f3527v;
            drawable = this.f3547I;
        } else {
            bVar = this.f3527v;
            drawable = this.f3516k;
        }
        bVar.mo198a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: i */
    public void mo153i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: k */
    public void mo152k() {
        m168p();
    }

    @Override // com.google.android.material.floatingactionbutton.C0944a
    /* renamed from: n */
    boolean mo151n() {
        return false;
    }
}
