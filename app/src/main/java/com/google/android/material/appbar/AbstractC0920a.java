package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000a.p018g.p029l.C0216r;

/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
abstract class AbstractC0920a<V extends View> extends C0923c<V> {

    /* renamed from: d */
    private Runnable f3384d;

    /* renamed from: e */
    OverScroller f3385e;

    /* renamed from: f */
    private boolean f3386f;

    /* renamed from: h */
    private int f3388h;

    /* renamed from: j */
    private VelocityTracker f3390j;

    /* renamed from: g */
    private int f3387g = -1;

    /* renamed from: i */
    private int f3389i = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0921a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f3391b;

        /* renamed from: c */
        private final V f3392c;

        RunnableC0921a(CoordinatorLayout coordinatorLayout, V v) {
            this.f3391b = coordinatorLayout;
            this.f3392c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f3392c != null && (overScroller = AbstractC0920a.this.f3385e) != null) {
                if (overScroller.computeScrollOffset()) {
                    AbstractC0920a aVar = AbstractC0920a.this;
                    aVar.m335c(this.f3391b, (CoordinatorLayout) this.f3392c, aVar.f3385e.getCurrY());
                    C0216r.m3432a(this.f3392c, this);
                    return;
                }
                AbstractC0920a.this.mo333e(this.f3391b, this.f3392c);
            }
        }
    }

    public AbstractC0920a() {
    }

    public AbstractC0920a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private void m334d() {
        if (this.f3390j == null) {
            this.f3390j = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m340a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo338b(coordinatorLayout, (CoordinatorLayout) v, mo337c() - i, i2, i3);
    }

    /* renamed from: a */
    abstract boolean mo342a(V v);

    /* renamed from: a */
    final boolean m341a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f3384d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f3384d = null;
        }
        if (this.f3385e == null) {
            this.f3385e = new OverScroller(v.getContext());
        }
        this.f3385e.fling(0, m322b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f3385e.computeScrollOffset()) {
            this.f3384d = new RunnableC0921a(coordinatorLayout, v);
            C0216r.m3432a(v, this.f3384d);
            return true;
        }
        mo333e(coordinatorLayout, v);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo62a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f3389i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f3389i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f3386f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f3387g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f3388h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f3389i
            if (r6 <= r0) goto L_0x0083
            r4.f3386f = r2
            r4.f3388h = r5
            goto L_0x0083
        L_0x0051:
            r4.f3386f = r3
            r4.f3387g = r5
            android.view.VelocityTracker r5 = r4.f3390j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f3390j = r5
            goto L_0x0083
        L_0x0060:
            r4.f3386f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo342a(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.m1718a(r6, r0, r1)
            if (r5 == 0) goto L_0x0083
            r4.f3388h = r1
            int r5 = r7.getPointerId(r3)
            r4.f3387g = r5
            r4.m334d()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f3390j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f3386f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC0920a.mo62a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    abstract int mo339b(V v);

    /* renamed from: b */
    abstract int mo338b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo18b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f3389i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f3389i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f3387g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f3388h
            int r2 = r2 - r0
            boolean r3 = r11.f3386f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f3389i
            if (r3 <= r4) goto L_0x0049
            r11.f3386f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f3386f
            if (r2 == 0) goto L_0x00ae
            r11.f3388h = r0
            int r7 = r11.mo339b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.m340a(r4, r5, r6, r7, r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f3390j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f3390j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f3390j
            int r4 = r11.f3387g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo336c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m341a(r6, r7, r8, r9, r10)
        L_0x007e:
            r11.f3386f = r2
            r11.f3387g = r3
            android.view.VelocityTracker r12 = r11.f3390j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f3390j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.m1718a(r13, r0, r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.mo342a(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f3388h = r3
            int r12 = r14.getPointerId(r2)
            r11.f3387g = r12
            r11.m334d()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f3390j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC0920a.mo18b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    abstract int mo337c();

    /* renamed from: c */
    abstract int mo336c(V v);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m335c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo338b(coordinatorLayout, (CoordinatorLayout) v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: e */
    abstract void mo333e(CoordinatorLayout coordinatorLayout, V v);
}
