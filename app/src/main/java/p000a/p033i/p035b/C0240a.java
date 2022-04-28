package p000a.p033i.p035b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p000a.p018g.p029l.C0216r;

/* renamed from: a.i.b.a */
/* loaded from: classes.dex */
public class C0240a {

    /* renamed from: w */
    private static final Interpolator f702w = new animationInterpolatorC0241a();

    /* renamed from: a */
    private int f703a;

    /* renamed from: b */
    private int f704b;

    /* renamed from: d */
    private float[] f706d;

    /* renamed from: e */
    private float[] f707e;

    /* renamed from: f */
    private float[] f708f;

    /* renamed from: g */
    private float[] f709g;

    /* renamed from: h */
    private int[] f710h;

    /* renamed from: i */
    private int[] f711i;

    /* renamed from: j */
    private int[] f712j;

    /* renamed from: k */
    private int f713k;

    /* renamed from: l */
    private VelocityTracker f714l;

    /* renamed from: m */
    private float f715m;

    /* renamed from: n */
    private float f716n;

    /* renamed from: o */
    private int f717o;

    /* renamed from: p */
    private int f718p;

    /* renamed from: q */
    private OverScroller f719q;

    /* renamed from: r */
    private final AbstractC0243c f720r;

    /* renamed from: s */
    private View f721s;

    /* renamed from: t */
    private boolean f722t;

    /* renamed from: u */
    private final ViewGroup f723u;

    /* renamed from: c */
    private int f705c = -1;

    /* renamed from: v */
    private final Runnable f724v = new RunnableC0242b();

    /* renamed from: a.i.b.a$a  reason: invalid class name */
    /* loaded from: classes.dex */
    static class animationInterpolatorC0241a implements Interpolator {
        animationInterpolatorC0241a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: a.i.b.a$b */
    /* loaded from: classes.dex */
    class RunnableC0242b implements Runnable {
        RunnableC0242b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0240a.this.m3317c(0);
        }
    }

    /* renamed from: a.i.b.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0243c {
        /* renamed from: a */
        public int m3304a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo303a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo237a(View view, int i, int i2);

        /* renamed from: a */
        public void mo1420a(int i, int i2) {
        }

        /* renamed from: a */
        public abstract void mo238a(View view, float f, float f2);

        /* renamed from: a */
        public void mo301a(View view, int i) {
        }

        /* renamed from: a */
        public abstract void mo236a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo235b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo233b(View view, int i, int i2);

        /* renamed from: b */
        public void mo1416b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo1417b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo234b(View view, int i);

        /* renamed from: c */
        public abstract void mo232c(int i);
    }

    private C0240a(Context context, ViewGroup viewGroup, AbstractC0243c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f723u = viewGroup;
            this.f720r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f717o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f704b = viewConfiguration.getScaledTouchSlop();
            this.f715m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f716n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f719q = new OverScroller(context, f702w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private float m3343a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: a */
    private int m3338a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: a */
    private int m3332a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m3338a(i3, (int) this.f716n, (int) this.f715m);
        int a2 = m3338a(i4, (int) this.f716n, (int) this.f715m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = abs3;
            f = i5;
        } else {
            f2 = abs;
            f = i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = abs4;
            f3 = i5;
        } else {
            f4 = abs2;
            f3 = i6;
        }
        return (int) ((m3323b(i, a, this.f720r.mo303a(view)) * f5) + (m3323b(i2, a2, this.f720r.mo235b(view)) * (f4 / f3)));
    }

    /* renamed from: a */
    public static C0240a m3331a(ViewGroup viewGroup, float f, AbstractC0243c cVar) {
        C0240a a = m3330a(viewGroup, cVar);
        a.f704b = (int) (a.f704b * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    public static C0240a m3330a(ViewGroup viewGroup, AbstractC0243c cVar) {
        return new C0240a(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: a */
    private void m3344a(float f, float f2) {
        this.f722t = true;
        this.f720r.mo238a(this.f721s, f, f2);
        this.f722t = false;
        if (this.f703a == 1) {
            m3317c(0);
        }
    }

    /* renamed from: a */
    private void m3342a(float f, float f2, int i) {
        int i2 = 1;
        if (!m3341a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m3341a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m3341a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m3341a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f711i;
            iArr[i] = iArr[i] | i2;
            this.f720r.mo1420a(i2, i);
        }
    }

    /* renamed from: a */
    private void m3337a(int i, int i2, int i3, int i4) {
        int left = this.f721s.getLeft();
        int top = this.f721s.getTop();
        if (i3 != 0) {
            i = this.f720r.mo237a(this.f721s, i, i3);
            C0216r.m3422c(this.f721s, i - left);
        }
        if (i4 != 0) {
            i2 = this.f720r.mo233b(this.f721s, i2, i4);
            C0216r.m3420d(this.f721s, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.f720r.mo236a(this.f721s, i, i2, i - left, i2 - top);
        }
    }

    /* renamed from: a */
    private boolean m3341a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f710h[i] & i2) != i2 || (this.f718p & i2) == 0 || (this.f712j[i] & i2) == i2 || (this.f711i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f704b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f720r.mo1417b(i2)) {
            return (this.f711i[i] & i2) == 0 && abs > ((float) this.f704b);
        }
        int[] iArr = this.f712j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: a */
    private boolean m3335a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f720r.mo303a(view) > 0;
        boolean z2 = this.f720r.mo235b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f704b) : z2 && Math.abs(f2) > ((float) this.f704b);
        }
        int i = this.f704b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: b */
    private float m3327b(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: b */
    private int m3323b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f723u.getWidth();
        float f = width / 2;
        float b = f + (m3327b(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(b / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: b */
    private void m3326b(float f, float f2, int i) {
        m3307f(i);
        float[] fArr = this.f706d;
        this.f708f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f707e;
        this.f709g[i] = f2;
        fArr2[i] = f2;
        this.f710h[i] = m3309e((int) f, (int) f2);
        this.f713k |= 1 << i;
    }

    /* renamed from: b */
    private boolean m3322b(int i, int i2, int i3, int i4) {
        int left = this.f721s.getLeft();
        int top = this.f721s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f719q.abortAnimation();
            m3317c(0);
            return false;
        }
        this.f719q.startScroll(left, top, i5, i6, m3332a(this.f721s, i5, i6, i3, i4));
        m3317c(2);
        return true;
    }

    /* renamed from: c */
    private void m3315c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m3305g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f708f[pointerId] = x;
                this.f709g[pointerId] = y;
            }
        }
    }

    /* renamed from: e */
    private int m3309e(int i, int i2) {
        int i3 = i < this.f723u.getLeft() + this.f717o ? 1 : 0;
        if (i2 < this.f723u.getTop() + this.f717o) {
            i3 |= 4;
        }
        if (i > this.f723u.getRight() - this.f717o) {
            i3 |= 2;
        }
        return i2 > this.f723u.getBottom() - this.f717o ? i3 | 8 : i3;
    }

    /* renamed from: e */
    private void m3310e(int i) {
        if (this.f706d != null && m3325b(i)) {
            this.f706d[i] = 0.0f;
            this.f707e[i] = 0.0f;
            this.f708f[i] = 0.0f;
            this.f709g[i] = 0.0f;
            this.f710h[i] = 0;
            this.f711i[i] = 0;
            this.f712j[i] = 0;
            this.f713k = ((1 << i) ^ (-1)) & this.f713k;
        }
    }

    /* renamed from: f */
    private void m3308f() {
        float[] fArr = this.f706d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f707e, 0.0f);
            Arrays.fill(this.f708f, 0.0f);
            Arrays.fill(this.f709g, 0.0f);
            Arrays.fill(this.f710h, 0);
            Arrays.fill(this.f711i, 0);
            Arrays.fill(this.f712j, 0);
            this.f713k = 0;
        }
    }

    /* renamed from: f */
    private void m3307f(int i) {
        float[] fArr = this.f706d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f706d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f707e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f708f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f709g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f710h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f711i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f712j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f706d = fArr2;
            this.f707e = fArr3;
            this.f708f = fArr4;
            this.f709g = fArr5;
            this.f710h = iArr;
            this.f711i = iArr2;
            this.f712j = iArr3;
        }
    }

    /* renamed from: g */
    private void m3306g() {
        this.f714l.computeCurrentVelocity(1000, this.f715m);
        m3344a(m3343a(this.f714l.getXVelocity(this.f705c), this.f716n, this.f715m), m3343a(this.f714l.getYVelocity(this.f705c), this.f716n, this.f715m));
    }

    /* renamed from: g */
    private boolean m3305g(int i) {
        if (m3325b(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: a */
    public void m3346a() {
        this.f705c = -1;
        m3308f();
        VelocityTracker velocityTracker = this.f714l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f714l = null;
        }
    }

    /* renamed from: a */
    public void m3345a(float f) {
        this.f716n = f;
    }

    /* renamed from: a */
    public void m3336a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m3346a();
        }
        if (this.f714l == null) {
            this.f714l = VelocityTracker.obtain();
        }
        this.f714l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f703a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m3305g(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f706d[pointerId];
                                float f2 = y - this.f707e[pointerId];
                                m3342a(f, f2, pointerId);
                                if (this.f703a != 1) {
                                    View b = m3324b((int) x, (int) y);
                                    if (m3335a(b, f, f2) && m3320b(b, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (m3305g(this.f705c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f705c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f708f;
                        int i3 = this.f705c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f709g[i3]);
                        m3337a(this.f721s.getLeft() + i4, this.f721s.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    m3315c(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        m3326b(x3, y3, pointerId2);
                        if (this.f703a == 0) {
                            m3320b(m3324b((int) x3, (int) y3), pointerId2);
                            int i6 = this.f710h[pointerId2];
                            int i7 = this.f718p;
                            if ((i6 & i7) != 0) {
                                this.f720r.mo1416b(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (m3316c((int) x3, (int) y3)) {
                            m3320b(this.f721s, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f703a == 1 && pointerId3 == this.f705c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f705c) {
                                    View b2 = m3324b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f721s;
                                    if (b2 == view && m3320b(view, pointerId4)) {
                                        i = this.f705c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m3306g();
                            }
                        }
                        m3310e(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f703a == 1) {
                    m3344a(0.0f, 0.0f);
                }
            } else if (this.f703a == 1) {
                m3306g();
            }
            m3346a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View b3 = m3324b((int) x4, (int) y4);
        m3326b(x4, y4, pointerId5);
        m3320b(b3, pointerId5);
        int i8 = this.f710h[pointerId5];
        int i9 = this.f718p;
        if ((i8 & i9) != 0) {
            this.f720r.mo1416b(i8 & i9, pointerId5);
        }
    }

    /* renamed from: a */
    public void m3334a(View view, int i) {
        if (view.getParent() == this.f723u) {
            this.f721s = view;
            this.f705c = i;
            this.f720r.mo301a(view, i);
            m3317c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f723u + ")");
    }

    /* renamed from: a */
    public boolean m3340a(int i) {
        int length = this.f706d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m3339a(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3339a(int i, int i2) {
        if (!m3325b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f708f[i2] - this.f706d[i2];
        float f2 = this.f709g[i2] - this.f707e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f704b) : z2 && Math.abs(f2) > ((float) this.f704b);
        }
        int i3 = this.f704b;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    /* renamed from: a */
    public boolean m3333a(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: a */
    public boolean m3329a(boolean z) {
        if (this.f703a == 2) {
            boolean computeScrollOffset = this.f719q.computeScrollOffset();
            int currX = this.f719q.getCurrX();
            int currY = this.f719q.getCurrY();
            int left = currX - this.f721s.getLeft();
            int top = currY - this.f721s.getTop();
            if (left != 0) {
                C0216r.m3422c(this.f721s, left);
            }
            if (top != 0) {
                C0216r.m3420d(this.f721s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f720r.mo236a(this.f721s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f719q.getFinalX() && currY == this.f719q.getFinalY()) {
                this.f719q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f723u.post(this.f724v);
                } else {
                    m3317c(0);
                }
            }
        }
        return this.f703a == 2;
    }

    /* renamed from: b */
    public View m3328b() {
        return this.f721s;
    }

    /* renamed from: b */
    public View m3324b(int i, int i2) {
        for (int childCount = this.f723u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f723u;
            this.f720r.m3304a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m3325b(int i) {
        return ((1 << i) & this.f713k) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m3321b(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p033i.p035b.C0240a.m3321b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    boolean m3320b(View view, int i) {
        if (view == this.f721s && this.f705c == i) {
            return true;
        }
        if (view == null || !this.f720r.mo234b(view, i)) {
            return false;
        }
        this.f705c = i;
        m3334a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean m3319b(View view, int i, int i2) {
        this.f721s = view;
        this.f705c = -1;
        boolean b = m3322b(i, i2, 0, 0);
        if (!b && this.f703a == 0 && this.f721s != null) {
            this.f721s = null;
        }
        return b;
    }

    /* renamed from: c */
    public int m3318c() {
        return this.f717o;
    }

    /* renamed from: c */
    void m3317c(int i) {
        this.f723u.removeCallbacks(this.f724v);
        if (this.f703a != i) {
            this.f703a = i;
            this.f720r.mo232c(i);
            if (this.f703a == 0) {
                this.f721s = null;
            }
        }
    }

    /* renamed from: c */
    public boolean m3316c(int i, int i2) {
        return m3333a(this.f721s, i, i2);
    }

    /* renamed from: d */
    public int m3314d() {
        return this.f704b;
    }

    /* renamed from: d */
    public void m3313d(int i) {
        this.f718p = i;
    }

    /* renamed from: d */
    public boolean m3312d(int i, int i2) {
        if (this.f722t) {
            return m3322b(i, i2, (int) this.f714l.getXVelocity(this.f705c), (int) this.f714l.getYVelocity(this.f705c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: e */
    public int m3311e() {
        return this.f703a;
    }
}
