package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p000a.p018g.p029l.C0216r;
import p050b.p051a.p052a.p053a.p058m.AbstractC0903b;

/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0677c<View> {

    /* renamed from: a */
    private int f3641a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnPreDrawListenerC0998a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ View f3642b;

        /* renamed from: c */
        final /* synthetic */ int f3643c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0903b f3644d;

        ViewTreeObserver$OnPreDrawListenerC0998a(View view, int i, AbstractC0903b bVar) {
            this.f3642b = view;
            this.f3643c = i;
            this.f3644d = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f3642b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f3641a == this.f3643c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                AbstractC0903b bVar = this.f3644d;
                expandableBehavior.mo16a((View) bVar, this.f3642b, bVar.mo229a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m44a(boolean z) {
        if (!z) {
            return this.f3641a == 1;
        }
        int i = this.f3641a;
        return i == 0 || i == 2;
    }

    /* renamed from: a */
    protected abstract boolean mo16a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo46a(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC0903b e;
        if (C0216r.m3397x(view) || (e = m42e(coordinatorLayout, view)) == null || !m44a(e.mo229a())) {
            return false;
        }
        this.f3641a = e.mo229a() ? 1 : 2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC0998a(view, this.f3641a, e));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo43b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0903b bVar = (AbstractC0903b) view2;
        if (!m44a(bVar.mo229a())) {
            return false;
        }
        this.f3641a = bVar.mo229a() ? 1 : 2;
        return mo16a((View) bVar, view, bVar.mo229a(), true);
    }

    /* renamed from: e */
    protected AbstractC0903b m42e(CoordinatorLayout coordinatorLayout, View view) {
        List<View> b = coordinatorLayout.m1704b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = b.get(i);
            if (mo20a(coordinatorLayout, (CoordinatorLayout) view, view2)) {
                return (AbstractC0903b) view2;
            }
        }
        return null;
    }
}
