package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p000a.p018g.p029l.C0216r;
import p050b.p051a.p052a.p053a.C0872e;
import p050b.p051a.p052a.p053a.p054j.C0877a;
import p050b.p051a.p052a.p053a.p054j.C0878b;
import p050b.p051a.p052a.p053a.p054j.C0879c;
import p050b.p051a.p052a.p053a.p054j.C0880d;
import p050b.p051a.p052a.p053a.p054j.C0881e;
import p050b.p051a.p052a.p053a.p054j.C0884h;
import p050b.p051a.p052a.p053a.p054j.C0885i;
import p050b.p051a.p052a.p053a.p054j.C0886j;
import p050b.p051a.p052a.p053a.p056l.AbstractC0895d;
import p050b.p051a.p052a.p053a.p056l.C0890a;
import p050b.p051a.p052a.p053a.p056l.C0893c;
import p050b.p051a.p052a.p053a.p059n.C0905a;

/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f3648c;

    /* renamed from: d */
    private final RectF f3649d;

    /* renamed from: e */
    private final RectF f3650e;

    /* renamed from: f */
    private final int[] f3651f;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C1000a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f3652a;

        /* renamed from: b */
        final /* synthetic */ View f3653b;

        /* renamed from: c */
        final /* synthetic */ View f3654c;

        C1000a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f3652a = z;
            this.f3653b = view;
            this.f3654c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3652a) {
                this.f3653b.setVisibility(4);
                this.f3654c.setAlpha(1.0f);
                this.f3654c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f3652a) {
                this.f3653b.setVisibility(0);
                this.f3654c.setAlpha(0.0f);
                this.f3654c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes.dex */
    public class C1001b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f3655a;

        C1001b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f3655a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f3655a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes.dex */
    public class C1002c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC0895d f3656a;

        /* renamed from: b */
        final /* synthetic */ Drawable f3657b;

        C1002c(FabTransformationBehavior fabTransformationBehavior, AbstractC0895d dVar, Drawable drawable) {
            this.f3656a = dVar;
            this.f3657b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3656a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3656a.setCircularRevealOverlayDrawable(this.f3657b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes.dex */
    public class C1003d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC0895d f3658a;

        C1003d(FabTransformationBehavior fabTransformationBehavior, AbstractC0895d dVar) {
            this.f3658a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0895d.C0900e revealInfo = this.f3658a.getRevealInfo();
            revealInfo.f3342c = Float.MAX_VALUE;
            this.f3658a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes.dex */
    public static class C1004e {

        /* renamed from: a */
        public C0884h f3659a;

        /* renamed from: b */
        public C0886j f3660b;
    }

    public FabTransformationBehavior() {
        this.f3648c = new Rect();
        this.f3649d = new RectF();
        this.f3650e = new RectF();
        this.f3651f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3648c = new Rect();
        this.f3649d = new RectF();
        this.f3650e = new RectF();
        this.f3651f = new int[2];
    }

    /* renamed from: a */
    private float m36a(View view, View view2, C0886j jVar) {
        RectF rectF = this.f3649d;
        RectF rectF2 = this.f3650e;
        m37a(view, rectF);
        m37a(view2, rectF2);
        rectF2.offset(-m25c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private float m30a(C1004e eVar, C0885i iVar, float f, float f2) {
        long a = iVar.m466a();
        long b = iVar.m463b();
        C0885i a2 = eVar.f3659a.m470a("expansion");
        return C0877a.m484a(f, f2, iVar.m461c().getInterpolation(((float) (((a2.m466a() + a2.m463b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private ViewGroup m40a(View view) {
        View findViewById = view.findViewById(C0872e.mtrl_child_content_container);
        return findViewById != null ? m26c(findViewById) : ((view instanceof C1007b) || (view instanceof C1006a)) ? m26c(((ViewGroup) view).getChildAt(0)) : m26c(view);
    }

    /* renamed from: a */
    private void m39a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m38a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: a */
    private void m37a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f3651f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: a */
    private void m35a(View view, View view2, boolean z, boolean z2, C1004e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof AbstractC0895d) {
            AbstractC0895d dVar = (AbstractC0895d) view2;
            float a = m36a(view, view2, eVar.f3660b);
            float b = m28b(view, view2, eVar.f3660b);
            ((FloatingActionButton) view).m225a(this.f3648c);
            float width = this.f3648c.width() / 2.0f;
            C0885i a2 = eVar.f3659a.m470a("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new AbstractC0895d.C0900e(a, b, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f3342c;
                }
                animator = C0890a.m429a(dVar, a, b, C0905a.m403a(a, b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C1003d(this, dVar));
                m39a(view2, a2.m466a(), (int) a, (int) b, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f3342c;
                animator = C0890a.m429a(dVar, a, b, width);
                int i = (int) a;
                int i2 = (int) b;
                m39a(view2, a2.m466a(), i, i2, f3, list);
                m38a(view2, a2.m466a(), a2.m463b(), eVar.f3659a.m473a(), i, i2, width, list);
            }
            a2.m465a(animator);
            list.add(animator);
            list2.add(C0890a.m430a(dVar));
        }
    }

    /* renamed from: a */
    private void m34a(View view, View view2, boolean z, boolean z2, C1004e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof AbstractC0895d) || C0893c.f3335a != 0) && (a = m40a(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C0880d.f3286a.set(a, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(a, C0880d.f3286a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(a, C0880d.f3286a, 0.0f);
                }
                eVar.f3659a.m470a("contentFade").m465a((Animator) objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: a */
    private void m33a(View view, View view2, boolean z, boolean z2, C1004e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        String str;
        C0884h hVar;
        C0885i iVar;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float c = m25c(view, view2, eVar.f3660b);
        float d = m23d(view, view2, eVar.f3660b);
        if (c == 0.0f || d == 0.0f) {
            iVar = eVar.f3659a.m470a("translationXLinear");
            hVar = eVar.f3659a;
            str = "translationYLinear";
        } else if ((!z || d >= 0.0f) && (z || d <= 0.0f)) {
            iVar = eVar.f3659a.m470a("translationXCurveDownwards");
            hVar = eVar.f3659a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f3659a.m470a("translationXCurveUpwards");
            hVar = eVar.f3659a;
            str = "translationYCurveUpwards";
        }
        C0885i a = hVar.m470a(str);
        if (z) {
            if (!z2) {
                view2.setTranslationX(-c);
                view2.setTranslationY(-d);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m32a(view2, eVar, iVar, a, -c, -d, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -c);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -d);
        }
        iVar.m465a((Animator) objectAnimator2);
        a.m465a((Animator) objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    /* renamed from: a */
    private void m32a(View view, C1004e eVar, C0885i iVar, C0885i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m30a(eVar, iVar, f, f3);
        float a2 = m30a(eVar, iVar2, f2, f4);
        Rect rect = this.f3648c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f3649d;
        rectF2.set(rect);
        RectF rectF3 = this.f3650e;
        m37a(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: b */
    private float m28b(View view, View view2, C0886j jVar) {
        RectF rectF = this.f3649d;
        RectF rectF2 = this.f3650e;
        m37a(view, rectF);
        m37a(view2, rectF2);
        rectF2.offset(0.0f, -m23d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private int m29b(View view) {
        ColorStateList b = C0216r.m3428b(view);
        if (b != null) {
            return b.getColorForState(view.getDrawableState(), b.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: b */
    private void m27b(View view, View view2, boolean z, boolean z2, C1004e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof AbstractC0895d) {
            AbstractC0895d dVar = (AbstractC0895d) view2;
            int b = m29b(view);
            int i = 16777215 & b;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(b);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, AbstractC0895d.C0899d.f3339a, i);
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, AbstractC0895d.C0899d.f3339a, b);
            }
            objectAnimator.setEvaluator(C0879c.m482a());
            eVar.f3659a.m470a("color").m465a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: c */
    private float m25c(View view, View view2, C0886j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f3649d;
        RectF rectF2 = this.f3650e;
        m37a(view, rectF);
        m37a(view2, rectF2);
        int i = jVar.f3299a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f3300b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f3300b;
    }

    /* renamed from: c */
    private ViewGroup m26c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m24c(View view, View view2, boolean z, boolean z2, C1004e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float f = C0216r.m3417f(view2) - C0216r.m3417f(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -f);
        }
        eVar.f3659a.m470a("elevation").m465a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    private float m23d(View view, View view2, C0886j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f3649d;
        RectF rectF2 = this.f3650e;
        m37a(view, rectF);
        m37a(view2, rectF2);
        int i = jVar.f3299a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f3301c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f3301c;
    }

    /* renamed from: d */
    private void m22d(View view, View view2, boolean z, boolean z2, C1004e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof AbstractC0895d) && (view instanceof ImageView)) {
            AbstractC0895d dVar = (AbstractC0895d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0881e.f3287b, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0881e.f3287b, 255);
                }
                objectAnimator.addUpdateListener(new C1001b(this, view2));
                eVar.f3659a.m470a("iconFade").m465a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new C1002c(this, dVar, drawable));
            }
        }
    }

    /* renamed from: a */
    protected abstract C1004e mo17a(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo31a(CoordinatorLayout.C0680f fVar) {
        if (fVar.f2601h == 0) {
            fVar.f2601h = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo20a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    protected AnimatorSet mo19b(View view, View view2, boolean z, boolean z2) {
        C1004e a = mo17a(view2.getContext(), z);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m24c(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f3649d;
        m33a(view, view2, z, z2, a, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m22d(view, view2, z, z2, a, arrayList, arrayList2);
        m35a(view, view2, z, z2, a, width, height, arrayList, arrayList2);
        m27b(view, view2, z, z2, a, arrayList, arrayList2);
        m34a(view, view2, z, z2, a, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C0878b.m483a(animatorSet, arrayList);
        animatorSet.addListener(new C1000a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }
}
