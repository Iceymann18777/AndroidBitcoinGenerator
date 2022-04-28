package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.i */
/* loaded from: classes.dex */
public final class C0978i {

    /* renamed from: a */
    private final ArrayList<C0980b> f3602a = new ArrayList<>();

    /* renamed from: b */
    private C0980b f3603b = null;

    /* renamed from: c */
    ValueAnimator f3604c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f3605d = new C0979a();

    /* renamed from: com.google.android.material.internal.i$a */
    /* loaded from: classes.dex */
    class C0979a extends AnimatorListenerAdapter {
        C0979a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0978i iVar = C0978i.this;
            if (iVar.f3604c == animator) {
                iVar.f3604c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.i$b */
    /* loaded from: classes.dex */
    public static class C0980b {

        /* renamed from: a */
        final int[] f3607a;

        /* renamed from: b */
        final ValueAnimator f3608b;

        C0980b(int[] iArr, ValueAnimator valueAnimator) {
            this.f3607a = iArr;
            this.f3608b = valueAnimator;
        }
    }

    /* renamed from: a */
    private void m84a(C0980b bVar) {
        this.f3604c = bVar.f3608b;
        this.f3604c.start();
    }

    /* renamed from: b */
    private void m81b() {
        ValueAnimator valueAnimator = this.f3604c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3604c = null;
        }
    }

    /* renamed from: a */
    public void m85a() {
        ValueAnimator valueAnimator = this.f3604c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f3604c = null;
        }
    }

    /* renamed from: a */
    public void m83a(int[] iArr) {
        C0980b bVar;
        int size = this.f3602a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f3602a.get(i);
            if (StateSet.stateSetMatches(bVar.f3607a, iArr)) {
                break;
            }
            i++;
        }
        C0980b bVar2 = this.f3603b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m81b();
            }
            this.f3603b = bVar;
            if (bVar != null) {
                m84a(bVar);
            }
        }
    }

    /* renamed from: a */
    public void m82a(int[] iArr, ValueAnimator valueAnimator) {
        C0980b bVar = new C0980b(iArr, valueAnimator);
        valueAnimator.addListener(this.f3605d);
        this.f3602a.add(bVar);
    }
}
