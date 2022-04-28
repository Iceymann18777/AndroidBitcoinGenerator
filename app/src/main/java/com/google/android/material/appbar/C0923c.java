package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
class C0923c<V extends View> extends CoordinatorLayout.AbstractC0677c<V> {

    /* renamed from: a */
    private C0924d f3398a;

    /* renamed from: b */
    private int f3399b = 0;

    /* renamed from: c */
    private int f3400c = 0;

    public C0923c() {
    }

    public C0923c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean m323a(int i) {
        C0924d dVar = this.f3398a;
        if (dVar != null) {
            return dVar.m317b(i);
        }
        this.f3399b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo46a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo321b(coordinatorLayout, (CoordinatorLayout) v, i);
        if (this.f3398a == null) {
            this.f3398a = new C0924d(v);
        }
        this.f3398a.m318b();
        int i2 = this.f3399b;
        if (i2 != 0) {
            this.f3398a.m317b(i2);
            this.f3399b = 0;
        }
        int i3 = this.f3400c;
        if (i3 == 0) {
            return true;
        }
        this.f3398a.m319a(i3);
        this.f3400c = 0;
        return true;
    }

    /* renamed from: b */
    public int m322b() {
        C0924d dVar = this.f3398a;
        if (dVar != null) {
            return dVar.m320a();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo321b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m1697c(v, i);
    }
}
