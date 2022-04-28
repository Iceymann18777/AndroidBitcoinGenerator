package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0698a;
import com.google.android.material.internal.C0957a;
import com.google.android.material.internal.C0978i;
import com.google.android.material.internal.C0983l;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p018g.p029l.C0216r;
import p050b.p051a.p052a.p053a.C0868a;
import p050b.p051a.p052a.p053a.p054j.C0877a;
import p050b.p051a.p052a.p053a.p054j.C0878b;
import p050b.p051a.p052a.p053a.p054j.C0882f;
import p050b.p051a.p052a.p053a.p054j.C0883g;
import p050b.p051a.p052a.p053a.p054j.C0884h;
import p050b.p051a.p052a.p053a.p061p.C0907a;
import p050b.p051a.p052a.p053a.p062q.AbstractC0909b;
import p050b.p051a.p052a.p053a.p062q.C0908a;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes.dex */
class C0944a {

    /* renamed from: B */
    static final TimeInterpolator f3498B = C0877a.f3282b;

    /* renamed from: C */
    static final int[] f3499C = {16842919, 16842910};

    /* renamed from: D */
    static final int[] f3500D = {16843623, 16842908, 16842910};

    /* renamed from: E */
    static final int[] f3501E = {16842908, 16842910};

    /* renamed from: F */
    static final int[] f3502F = {16843623, 16842910};

    /* renamed from: G */
    static final int[] f3503G = {16842910};

    /* renamed from: H */
    static final int[] f3504H = new int[0];

    /* renamed from: A */
    private ViewTreeObserver.OnPreDrawListener f3505A;

    /* renamed from: b */
    Animator f3507b;

    /* renamed from: c */
    C0884h f3508c;

    /* renamed from: d */
    C0884h f3509d;

    /* renamed from: e */
    private C0884h f3510e;

    /* renamed from: f */
    private C0884h f3511f;

    /* renamed from: h */
    C0908a f3513h;

    /* renamed from: i */
    private float f3514i;

    /* renamed from: j */
    Drawable f3515j;

    /* renamed from: k */
    Drawable f3516k;

    /* renamed from: l */
    C0957a f3517l;

    /* renamed from: m */
    Drawable f3518m;

    /* renamed from: n */
    float f3519n;

    /* renamed from: o */
    float f3520o;

    /* renamed from: p */
    float f3521p;

    /* renamed from: q */
    int f3522q;

    /* renamed from: s */
    private ArrayList<Animator.AnimatorListener> f3524s;

    /* renamed from: t */
    private ArrayList<Animator.AnimatorListener> f3525t;

    /* renamed from: u */
    final C0983l f3526u;

    /* renamed from: v */
    final AbstractC0909b f3527v;

    /* renamed from: a */
    int f3506a = 0;

    /* renamed from: r */
    float f3523r = 1.0f;

    /* renamed from: w */
    private final Rect f3528w = new Rect();

    /* renamed from: x */
    private final RectF f3529x = new RectF();

    /* renamed from: y */
    private final RectF f3530y = new RectF();

    /* renamed from: z */
    private final Matrix f3531z = new Matrix();

    /* renamed from: g */
    private final C0978i f3512g = new C0978i();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes.dex */
    class C0945a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3532a;

        /* renamed from: b */
        final /* synthetic */ boolean f3533b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0951g f3534c;

        C0945a(boolean z, AbstractC0951g gVar) {
            this.f3533b = z;
            this.f3534c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3532a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0944a aVar = C0944a.this;
            aVar.f3506a = 0;
            aVar.f3507b = null;
            if (!this.f3532a) {
                aVar.f3526u.m70a(this.f3533b ? 8 : 4, this.f3533b);
                AbstractC0951g gVar = this.f3534c;
                if (gVar != null) {
                    gVar.mo161b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0944a.this.f3526u.m70a(0, this.f3533b);
            C0944a aVar = C0944a.this;
            aVar.f3506a = 1;
            aVar.f3507b = animator;
            this.f3532a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes.dex */
    class C0946b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f3536a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0951g f3537b;

        C0946b(boolean z, AbstractC0951g gVar) {
            this.f3536a = z;
            this.f3537b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0944a aVar = C0944a.this;
            aVar.f3506a = 0;
            aVar.f3507b = null;
            AbstractC0951g gVar = this.f3537b;
            if (gVar != null) {
                gVar.mo162a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0944a.this.f3526u.m70a(0, this.f3536a);
            C0944a aVar = C0944a.this;
            aVar.f3506a = 2;
            aVar.f3507b = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC0947c implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC0947c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C0944a.this.m170m();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* loaded from: classes.dex */
    private class C0948d extends AbstractC0953i {
        C0948d(C0944a aVar) {
            super(aVar, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* loaded from: classes.dex */
    private class C0949e extends AbstractC0953i {
        C0949e() {
            super(C0944a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* loaded from: classes.dex */
    private class C0950f extends AbstractC0953i {
        C0950f() {
            super(C0944a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* loaded from: classes.dex */
    interface AbstractC0951g {
        /* renamed from: a */
        void mo162a();

        /* renamed from: b */
        void mo161b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* loaded from: classes.dex */
    private class C0952h extends AbstractC0953i {
        C0952h() {
            super(C0944a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* loaded from: classes.dex */
    private abstract class AbstractC0953i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f3543a;

        /* renamed from: b */
        private float f3544b;

        /* renamed from: c */
        private float f3545c;

        private AbstractC0953i() {
        }

        /* synthetic */ AbstractC0953i(C0944a aVar, C0945a aVar2) {
            this();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0944a.this.f3513h.m392b(this.f3545c);
            throw null;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f3543a) {
                C0944a.this.f3513h.m393b();
                throw null;
            }
            C0908a aVar = C0944a.this.f3513h;
            float f = this.f3544b;
            aVar.m392b(f + ((this.f3545c - f) * valueAnimator.getAnimatedFraction()));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0944a(C0983l lVar, AbstractC0909b bVar) {
        this.f3526u = lVar;
        this.f3527v = bVar;
        this.f3512g.m82a(f3499C, m187a((AbstractC0953i) new C0950f()));
        this.f3512g.m82a(f3500D, m187a((AbstractC0953i) new C0949e()));
        this.f3512g.m82a(f3501E, m187a((AbstractC0953i) new C0949e()));
        this.f3512g.m82a(f3502F, m187a((AbstractC0953i) new C0949e()));
        this.f3512g.m82a(f3503G, m187a((AbstractC0953i) new C0952h()));
        this.f3512g.m82a(f3504H, m187a((AbstractC0953i) new C0948d(this)));
        this.f3514i = this.f3526u.getRotation();
    }

    /* renamed from: a */
    private AnimatorSet m189a(C0884h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f3526u, View.ALPHA, f);
        hVar.m470a("opacity").m465a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f3526u, View.SCALE_X, f2);
        hVar.m470a("scale").m465a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f3526u, View.SCALE_Y, f2);
        hVar.m470a("scale").m465a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m194a(f3, this.f3531z);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f3526u, new C0882f(), new C0883g(), new Matrix(this.f3531z));
        hVar.m470a("iconScale").m465a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C0878b.m483a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    private ValueAnimator m187a(AbstractC0953i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f3498B);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: a */
    private void m194a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f3526u.getDrawable();
        if (drawable != null && this.f3522q != 0) {
            RectF rectF = this.f3529x;
            RectF rectF2 = this.f3530y;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i = this.f3522q;
            rectF2.set(0.0f, 0.0f, i, i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f3522q;
            matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
        }
    }

    /* renamed from: q */
    private void m167q() {
        if (this.f3505A == null) {
            this.f3505A = new ViewTreeObserver$OnPreDrawListenerC0947c();
        }
    }

    /* renamed from: r */
    private C0884h m166r() {
        if (this.f3511f == null) {
            this.f3511f = C0884h.m472a(this.f3526u.getContext(), C0868a.design_fab_hide_motion_spec);
        }
        return this.f3511f;
    }

    /* renamed from: s */
    private C0884h m165s() {
        if (this.f3510e == null) {
            this.f3510e = C0884h.m472a(this.f3526u.getContext(), C0868a.design_fab_show_motion_spec);
        }
        return this.f3510e;
    }

    /* renamed from: t */
    private boolean m164t() {
        return C0216r.m3397x(this.f3526u) && !this.f3526u.isInEditMode();
    }

    /* renamed from: u */
    private void m163u() {
        int i;
        C0983l lVar;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f3514i % 90.0f != 0.0f) {
                i = 1;
                if (this.f3526u.getLayerType() != 1) {
                    lVar = this.f3526u;
                    lVar.setLayerType(i, null);
                }
            } else if (this.f3526u.getLayerType() != 0) {
                lVar = this.f3526u;
                i = 0;
                lVar.setLayerType(i, null);
            }
        }
        C0908a aVar = this.f3513h;
        if (aVar == null) {
            C0957a aVar2 = this.f3517l;
            if (aVar2 != null) {
                aVar2.m141a(-this.f3514i);
                throw null;
            }
            return;
        }
        aVar.m396a(-this.f3514i);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable m196a() {
        return this.f3518m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m195a(float f) {
        if (this.f3519n != f) {
            this.f3519n = f;
            mo159a(this.f3519n, this.f3520o, this.f3521p);
        }
    }

    /* renamed from: a */
    void mo159a(float f, float f2, float f3) {
        C0908a aVar = this.f3513h;
        if (aVar != null) {
            aVar.m395a(f, this.f3521p + f);
            throw null;
        }
    }

    /* renamed from: a */
    public void m193a(Animator.AnimatorListener animatorListener) {
        if (this.f3525t == null) {
            this.f3525t = new ArrayList<>();
        }
        this.f3525t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m192a(ColorStateList colorStateList) {
        Drawable drawable = this.f3515j;
        if (drawable != null) {
            C0698a.m1603a(drawable, colorStateList);
        }
        C0957a aVar = this.f3517l;
        if (aVar != null) {
            aVar.m140a(colorStateList);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m191a(PorterDuff.Mode mode) {
        Drawable drawable = this.f3515j;
        if (drawable != null) {
            C0698a.m1600a(drawable, mode);
        }
    }

    /* renamed from: a */
    void mo158a(Rect rect) {
        this.f3513h.getPadding(rect);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m190a(C0884h hVar) {
        this.f3509d = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m188a(AbstractC0951g gVar, boolean z) {
        if (!m174g()) {
            Animator animator = this.f3507b;
            if (animator != null) {
                animator.cancel();
            }
            if (m164t()) {
                C0884h hVar = this.f3509d;
                if (hVar == null) {
                    hVar = m166r();
                }
                AnimatorSet a = m189a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C0945a(z, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f3525t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f3526u.m70a(z ? 8 : 4, z);
            if (gVar != null) {
                gVar.mo161b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo157a(int[] iArr) {
        this.f3512g.m83a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo156b() {
        return this.f3519n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m186b(float f) {
        if (this.f3520o != f) {
            this.f3520o = f;
            mo159a(this.f3519n, this.f3520o, this.f3521p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m185b(Animator.AnimatorListener animatorListener) {
        if (this.f3524s == null) {
            this.f3524s = new ArrayList<>();
        }
        this.f3524s.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155b(ColorStateList colorStateList) {
        Drawable drawable = this.f3516k;
        if (drawable != null) {
            C0698a.m1603a(drawable, C0907a.m398a(colorStateList));
        }
    }

    /* renamed from: b */
    void mo154b(Rect rect) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m184b(C0884h hVar) {
        this.f3508c = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m183b(AbstractC0951g gVar, boolean z) {
        if (!m173h()) {
            Animator animator = this.f3507b;
            if (animator != null) {
                animator.cancel();
            }
            if (m164t()) {
                if (this.f3526u.getVisibility() != 0) {
                    this.f3526u.setAlpha(0.0f);
                    this.f3526u.setScaleY(0.0f);
                    this.f3526u.setScaleX(0.0f);
                    m181c(0.0f);
                }
                C0884h hVar = this.f3508c;
                if (hVar == null) {
                    hVar = m165s();
                }
                AnimatorSet a = m189a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C0946b(z, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f3524s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f3526u.m70a(0, z);
            this.f3526u.setAlpha(1.0f);
            this.f3526u.setScaleY(1.0f);
            this.f3526u.setScaleX(1.0f);
            m181c(1.0f);
            if (gVar != null) {
                gVar.mo162a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0884h m182c() {
        return this.f3509d;
    }

    /* renamed from: c */
    final void m181c(float f) {
        this.f3523r = f;
        Matrix matrix = this.f3531z;
        m194a(f, matrix);
        this.f3526u.setImageMatrix(matrix);
    }

    /* renamed from: c */
    public void m180c(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f3525t;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m179d() {
        return this.f3520o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m178d(float f) {
        if (this.f3521p != f) {
            this.f3521p = f;
            mo159a(this.f3519n, this.f3520o, this.f3521p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m177d(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f3524s;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m176e() {
        return this.f3521p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C0884h m175f() {
        return this.f3508c;
    }

    /* renamed from: g */
    boolean m174g() {
        return this.f3526u.getVisibility() == 0 ? this.f3506a == 1 : this.f3506a != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m173h() {
        return this.f3526u.getVisibility() != 0 ? this.f3506a == 2 : this.f3506a != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo153i() {
        this.f3512g.m85a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m172j() {
        if (mo151n()) {
            m167q();
            this.f3526u.getViewTreeObserver().addOnPreDrawListener(this.f3505A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo152k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m171l() {
        if (this.f3505A != null) {
            this.f3526u.getViewTreeObserver().removeOnPreDrawListener(this.f3505A);
            this.f3505A = null;
        }
    }

    /* renamed from: m */
    void m170m() {
        float rotation = this.f3526u.getRotation();
        if (this.f3514i != rotation) {
            this.f3514i = rotation;
            m163u();
        }
    }

    /* renamed from: n */
    boolean mo151n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m169o() {
        m181c(this.f3523r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m168p() {
        Rect rect = this.f3528w;
        mo158a(rect);
        mo154b(rect);
        this.f3527v.mo199a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
