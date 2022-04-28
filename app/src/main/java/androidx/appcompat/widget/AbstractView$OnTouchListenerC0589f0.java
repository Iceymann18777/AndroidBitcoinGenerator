package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0519t;

/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0589f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final float f2097b;

    /* renamed from: e */
    final View f2100e;

    /* renamed from: f */
    private Runnable f2101f;

    /* renamed from: g */
    private Runnable f2102g;

    /* renamed from: h */
    private boolean f2103h;

    /* renamed from: i */
    private int f2104i;

    /* renamed from: j */
    private final int[] f2105j = new int[2];

    /* renamed from: c */
    private final int f2098c = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    private final int f2099d = (this.f2098c + ViewConfiguration.getLongPressTimeout()) / 2;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f0$a */
    /* loaded from: classes.dex */
    public class RunnableC0590a implements Runnable {
        RunnableC0590a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC0589f0.this.f2100e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f0$b */
    /* loaded from: classes.dex */
    public class RunnableC0591b implements Runnable {
        RunnableC0591b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC0589f0.this.m2071d();
        }
    }

    public AbstractView$OnTouchListenerC0589f0(View view) {
        this.f2100e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2097b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    private boolean m2077a(MotionEvent motionEvent) {
        C0582d0 d0Var;
        View view = this.f2100e;
        AbstractC0519t a = mo1839a();
        if (a == null || !a.mo2036d() || (d0Var = (C0582d0) a.mo2034e()) == null || !d0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m2075a(view, obtainNoHistory);
        m2073b(d0Var, obtainNoHistory);
        boolean a2 = d0Var.m2098a(obtainNoHistory, this.f2104i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: a */
    private static boolean m2076a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m2075a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2105j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2074b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f2100e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f2104i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f2097b
            boolean r6 = m2076a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m2070e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m2070e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f2104i = r6
            java.lang.Runnable r6 = r5.f2101f
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.f0$a r6 = new androidx.appcompat.widget.f0$a
            r6.<init>()
            r5.f2101f = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f2101f
            int r1 = r5.f2098c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f2102g
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.f0$b r6 = new androidx.appcompat.widget.f0$b
            r6.<init>()
            r5.f2102g = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f2102g
            int r1 = r5.f2099d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0.m2074b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private boolean m2073b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2105j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* renamed from: e */
    private void m2070e() {
        Runnable runnable = this.f2102g;
        if (runnable != null) {
            this.f2100e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2101f;
        if (runnable2 != null) {
            this.f2100e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract AbstractC0519t mo1839a();

    /* renamed from: b */
    protected abstract boolean mo1838b();

    /* renamed from: c */
    protected boolean mo2072c() {
        AbstractC0519t a = mo1839a();
        if (a == null || !a.mo2036d()) {
            return true;
        }
        a.dismiss();
        return true;
    }

    /* renamed from: d */
    void m2071d() {
        m2070e();
        View view = this.f2100e;
        if (view.isEnabled() && !view.isLongClickable() && mo1838b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f2103h = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f2103h;
        if (z2) {
            z = m2077a(motionEvent) || !mo2072c();
        } else {
            z = m2074b(motionEvent) && mo1838b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2100e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f2103h = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f2103h = false;
        this.f2104i = -1;
        Runnable runnable = this.f2101f;
        if (runnable != null) {
            this.f2100e.removeCallbacks(runnable);
        }
    }
}
