package p000a.p018g.p029l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: a.g.l.v */
/* loaded from: classes.dex */
public final class C0223v {

    /* renamed from: a */
    private WeakReference<View> f675a;

    /* renamed from: b */
    Runnable f676b = null;

    /* renamed from: c */
    Runnable f677c = null;

    /* renamed from: d */
    int f678d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.l.v$a */
    /* loaded from: classes.dex */
    public class C0224a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC0227w f679a;

        /* renamed from: b */
        final /* synthetic */ View f680b;

        C0224a(C0223v vVar, AbstractC0227w wVar, View view) {
            this.f679a = wVar;
            this.f680b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f679a.mo1848c(this.f680b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f679a.mo1850a(this.f680b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f679a.mo1849b(this.f680b);
        }
    }

    /* renamed from: a.g.l.v$b */
    /* loaded from: classes.dex */
    class C0225b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC0229y f681a;

        /* renamed from: b */
        final /* synthetic */ View f682b;

        C0225b(C0223v vVar, AbstractC0229y yVar, View view) {
            this.f681a = yVar;
            this.f682b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f681a.mo2473a(this.f682b);
        }
    }

    /* renamed from: a.g.l.v$c */
    /* loaded from: classes.dex */
    static class C0226c implements AbstractC0227w {

        /* renamed from: a */
        C0223v f683a;

        /* renamed from: b */
        boolean f684b;

        C0226c(C0223v vVar) {
            this.f683a = vVar;
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(View view) {
            int i = this.f683a.f678d;
            AbstractC0227w wVar = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f683a.f678d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f684b) {
                C0223v vVar = this.f683a;
                Runnable runnable = vVar.f677c;
                if (runnable != null) {
                    vVar.f677c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof AbstractC0227w) {
                    wVar = (AbstractC0227w) tag;
                }
                if (wVar != null) {
                    wVar.mo1850a(view);
                }
                this.f684b = true;
            }
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(View view) {
            this.f684b = false;
            AbstractC0227w wVar = null;
            if (this.f683a.f678d > -1) {
                view.setLayerType(2, null);
            }
            C0223v vVar = this.f683a;
            Runnable runnable = vVar.f676b;
            if (runnable != null) {
                vVar.f676b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof AbstractC0227w) {
                wVar = (AbstractC0227w) tag;
            }
            if (wVar != null) {
                wVar.mo1849b(view);
            }
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: c */
        public void mo1848c(View view) {
            Object tag = view.getTag(2113929216);
            AbstractC0227w wVar = tag instanceof AbstractC0227w ? (AbstractC0227w) tag : null;
            if (wVar != null) {
                wVar.mo1848c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0223v(View view) {
        this.f675a = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m3368a(View view, AbstractC0227w wVar) {
        if (wVar != null) {
            view.animate().setListener(new C0224a(this, wVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0223v m3372a(float f) {
        View view = this.f675a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0223v m3371a(long j) {
        View view = this.f675a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0223v m3370a(AbstractC0227w wVar) {
        View view = this.f675a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, wVar);
                wVar = new C0226c(this);
            }
            m3368a(view, wVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0223v m3369a(AbstractC0229y yVar) {
        View view = this.f675a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C0225b bVar = null;
            if (yVar != null) {
                bVar = new C0225b(this, yVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0223v m3367a(Interpolator interpolator) {
        View view = this.f675a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public void m3373a() {
        View view = this.f675a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public long m3366b() {
        View view = this.f675a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: b */
    public C0223v m3365b(float f) {
        View view = this.f675a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0223v m3364b(long j) {
        View view = this.f675a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: c */
    public void m3363c() {
        View view = this.f675a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
