package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p000a.p018g.p024g.C0158a;
import p000a.p018g.p029l.C0200c;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0230z;

/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
abstract class AbstractC0922b extends C0923c<View> {

    /* renamed from: d */
    final Rect f3394d = new Rect();

    /* renamed from: e */
    final Rect f3395e = new Rect();

    /* renamed from: f */
    private int f3396f = 0;

    /* renamed from: g */
    private int f3397g;

    public AbstractC0922b() {
    }

    public AbstractC0922b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private static int m326c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m332a(View view) {
        if (this.f3397g == 0) {
            return 0;
        }
        float b = mo328b(view);
        int i = this.f3397g;
        return C0158a.m3608a((int) (b * i), 0, i);
    }

    /* renamed from: a */
    abstract View mo330a(List<View> list);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo331a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (a = mo330a(coordinatorLayout.m1704b(view))) == null) {
            return false;
        }
        if (C0216r.m3415g(a) && !C0216r.m3415g(view)) {
            C0216r.m3429a(view, true);
            if (C0216r.m3415g(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m1717a(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - a.getMeasuredHeight()) + mo325c(a), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* renamed from: b */
    abstract float mo328b(View view);

    /* renamed from: b */
    public final void m329b(int i) {
        this.f3397g = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C0923c
    /* renamed from: b */
    public void mo321b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View a = mo330a(coordinatorLayout.m1704b(view));
        if (a != null) {
            CoordinatorLayout.C0680f fVar = (CoordinatorLayout.C0680f) view.getLayoutParams();
            Rect rect = this.f3394d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, a.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            C0230z lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0216r.m3415g(coordinatorLayout) && !C0216r.m3415g(view)) {
                rect.left += lastWindowInsets.m3357c();
                rect.right -= lastWindowInsets.m3356d();
            }
            Rect rect2 = this.f3395e;
            C0200c.m3489a(m326c(fVar.f2596c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = m332a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            i2 = rect2.top - a.getBottom();
        } else {
            super.mo321b(coordinatorLayout, (CoordinatorLayout) view, i);
            i2 = 0;
        }
        this.f3396f = i2;
    }

    /* renamed from: c */
    public final int m327c() {
        return this.f3397g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo325c(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m324d() {
        return this.f3396f;
    }
}
