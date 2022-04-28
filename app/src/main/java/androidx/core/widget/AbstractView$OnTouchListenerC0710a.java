package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p000a.p018g.p029l.C0216r;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0710a implements View.OnTouchListener {

    /* renamed from: s */
    private static final int f2678s = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    final View f2681d;

    /* renamed from: e */
    private Runnable f2682e;

    /* renamed from: h */
    private int f2685h;

    /* renamed from: i */
    private int f2686i;

    /* renamed from: m */
    private boolean f2690m;

    /* renamed from: n */
    boolean f2691n;

    /* renamed from: o */
    boolean f2692o;

    /* renamed from: p */
    boolean f2693p;

    /* renamed from: q */
    private boolean f2694q;

    /* renamed from: r */
    private boolean f2695r;

    /* renamed from: b */
    final C0711a f2679b = new C0711a();

    /* renamed from: c */
    private final Interpolator f2680c = new AccelerateInterpolator();

    /* renamed from: f */
    private float[] f2683f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f2684g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private float[] f2687j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f2688k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f2689l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class C0711a {

        /* renamed from: a */
        private int f2696a;

        /* renamed from: b */
        private int f2697b;

        /* renamed from: c */
        private float f2698c;

        /* renamed from: d */
        private float f2699d;

        /* renamed from: j */
        private float f2705j;

        /* renamed from: k */
        private int f2706k;

        /* renamed from: e */
        private long f2700e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f2704i = -1;

        /* renamed from: f */
        private long f2701f = 0;

        /* renamed from: g */
        private int f2702g = 0;

        /* renamed from: h */
        private int f2703h = 0;

        C0711a() {
        }

        /* renamed from: a */
        private float m1524a(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m1521a(long j) {
            if (j < this.f2700e) {
                return 0.0f;
            }
            long j2 = this.f2704i;
            if (j2 < 0 || j < j2) {
                return AbstractView$OnTouchListenerC0710a.m1542a(((float) (j - this.f2700e)) / this.f2696a, 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f2705j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC0710a.m1542a(((float) j3) / this.f2706k, 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void m1525a() {
            if (this.f2701f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m1524a(m1521a(currentAnimationTimeMillis));
                this.f2701f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f2701f)) * a;
                this.f2702g = (int) (this.f2698c * f);
                this.f2703h = (int) (f * this.f2699d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void m1523a(float f, float f2) {
            this.f2698c = f;
            this.f2699d = f2;
        }

        /* renamed from: a */
        public void m1522a(int i) {
            this.f2697b = i;
        }

        /* renamed from: b */
        public int m1520b() {
            return this.f2702g;
        }

        /* renamed from: b */
        public void m1519b(int i) {
            this.f2696a = i;
        }

        /* renamed from: c */
        public int m1518c() {
            return this.f2703h;
        }

        /* renamed from: d */
        public int m1517d() {
            float f = this.f2698c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int m1516e() {
            float f = this.f2699d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean m1515f() {
            return this.f2704i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2704i + ((long) this.f2706k);
        }

        /* renamed from: g */
        public void m1514g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2706k = AbstractView$OnTouchListenerC0710a.m1539a((int) (currentAnimationTimeMillis - this.f2700e), 0, this.f2697b);
            this.f2705j = m1521a(currentAnimationTimeMillis);
            this.f2704i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void m1513h() {
            this.f2700e = AnimationUtils.currentAnimationTimeMillis();
            this.f2704i = -1L;
            this.f2701f = this.f2700e;
            this.f2705j = 0.5f;
            this.f2702g = 0;
            this.f2703h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class RunnableC0712b implements Runnable {
        RunnableC0712b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC0710a aVar = AbstractView$OnTouchListenerC0710a.this;
            if (aVar.f2693p) {
                if (aVar.f2691n) {
                    aVar.f2691n = false;
                    aVar.f2679b.m1513h();
                }
                C0711a aVar2 = AbstractView$OnTouchListenerC0710a.this.f2679b;
                if (aVar2.m1515f() || !AbstractView$OnTouchListenerC0710a.this.m1537b()) {
                    AbstractView$OnTouchListenerC0710a.this.f2693p = false;
                    return;
                }
                AbstractView$OnTouchListenerC0710a aVar3 = AbstractView$OnTouchListenerC0710a.this;
                if (aVar3.f2692o) {
                    aVar3.f2692o = false;
                    aVar3.m1544a();
                }
                aVar2.m1525a();
                AbstractView$OnTouchListenerC0710a.this.mo1503a(aVar2.m1520b(), aVar2.m1518c());
                C0216r.m3432a(AbstractView$OnTouchListenerC0710a.this.f2681d, this);
            }
        }
    }

    public AbstractView$OnTouchListenerC0710a(View view) {
        this.f2681d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m1536b(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m1534c(f3, f3);
        m1530d(1);
        m1543a(Float.MAX_VALUE, Float.MAX_VALUE);
        m1531d(0.2f, 0.2f);
        m1529e(1.0f, 1.0f);
        m1533c(f2678s);
        m1526f(500);
        m1528e(500);
    }

    /* renamed from: a */
    static float m1542a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m1541a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m1542a(f * f2, 0.0f, f3);
        float f6 = m1527f(f2 - f4, a) - m1527f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f2680c.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2680c.getInterpolation(f6);
        }
        return m1542a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m1540a(int i, float f, float f2, float f3) {
        float a = m1541a(this.f2683f[i], f2, this.f2684g[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f2687j[i];
        float f5 = this.f2688k[i];
        float f6 = this.f2689l[i];
        float f7 = f4 * f3;
        return a > 0.0f ? m1542a(a * f7, f5, f6) : -m1542a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m1539a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m1535c() {
        if (this.f2691n) {
            this.f2693p = false;
        } else {
            this.f2679b.m1514g();
        }
    }

    /* renamed from: d */
    private void m1532d() {
        int i;
        if (this.f2682e == null) {
            this.f2682e = new RunnableC0712b();
        }
        this.f2693p = true;
        this.f2691n = true;
        if (this.f2690m || (i = this.f2686i) <= 0) {
            this.f2682e.run();
        } else {
            C0216r.m3431a(this.f2681d, this.f2682e, i);
        }
        this.f2690m = true;
    }

    /* renamed from: f */
    private float m1527f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2685h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f2693p && this.f2685h == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: a */
    public AbstractView$OnTouchListenerC0710a m1543a(float f, float f2) {
        float[] fArr = this.f2684g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    public AbstractView$OnTouchListenerC0710a m1538a(boolean z) {
        if (this.f2694q && !z) {
            m1535c();
        }
        this.f2694q = z;
        return this;
    }

    /* renamed from: a */
    void m1544a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2681d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public abstract void mo1503a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo1504a(int i);

    /* renamed from: b */
    public AbstractView$OnTouchListenerC0710a m1536b(float f, float f2) {
        float[] fArr = this.f2689l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    boolean m1537b() {
        C0711a aVar = this.f2679b;
        int e = aVar.m1516e();
        int d = aVar.m1517d();
        return (e != 0 && mo1502b(e)) || (d != 0 && mo1504a(d));
    }

    /* renamed from: b */
    public abstract boolean mo1502b(int i);

    /* renamed from: c */
    public AbstractView$OnTouchListenerC0710a m1534c(float f, float f2) {
        float[] fArr = this.f2688k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public AbstractView$OnTouchListenerC0710a m1533c(int i) {
        this.f2686i = i;
        return this;
    }

    /* renamed from: d */
    public AbstractView$OnTouchListenerC0710a m1531d(float f, float f2) {
        float[] fArr = this.f2683f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: d */
    public AbstractView$OnTouchListenerC0710a m1530d(int i) {
        this.f2685h = i;
        return this;
    }

    /* renamed from: e */
    public AbstractView$OnTouchListenerC0710a m1529e(float f, float f2) {
        float[] fArr = this.f2687j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: e */
    public AbstractView$OnTouchListenerC0710a m1528e(int i) {
        this.f2679b.m1522a(i);
        return this;
    }

    /* renamed from: f */
    public AbstractView$OnTouchListenerC0710a m1526f(int i) {
        this.f2679b.m1519b(i);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2694q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m1535c()
            goto L_0x0058
        L_0x001a:
            r5.f2692o = r2
            r5.f2690m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2681d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1540a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2681d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1540a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2679b
            r7.m1523a(r0, r6)
            boolean r6 = r5.f2693p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.m1537b()
            if (r6 == 0) goto L_0x0058
            r5.m1532d()
        L_0x0058:
            boolean r6 = r5.f2695r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2693p
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC0710a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
