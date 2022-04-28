package p000a.p036j.p037a;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: a.j.a.q */
/* loaded from: classes.dex */
class ViewTreeObserver$OnPreDrawListenerC0303q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final View f995b;

    /* renamed from: c */
    private ViewTreeObserver f996c;

    /* renamed from: d */
    private final Runnable f997d;

    private ViewTreeObserver$OnPreDrawListenerC0303q(View view, Runnable runnable) {
        this.f995b = view;
        this.f996c = view.getViewTreeObserver();
        this.f997d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC0303q m2950a(View view, Runnable runnable) {
        ViewTreeObserver$OnPreDrawListenerC0303q qVar = new ViewTreeObserver$OnPreDrawListenerC0303q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(qVar);
        view.addOnAttachStateChangeListener(qVar);
        return qVar;
    }

    /* renamed from: a */
    public void m2951a() {
        (this.f996c.isAlive() ? this.f996c : this.f995b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f995b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2951a();
        this.f997d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f996c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2951a();
    }
}
