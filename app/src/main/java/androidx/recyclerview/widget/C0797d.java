package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;

import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C0797d extends C0813j.AbstractC0834n implements C0813j.AbstractC0843s {

    /* renamed from: D */
    private static final int[] f3005D = {16842919};

    /* renamed from: E */
    private static final int[] f3006E = new int[0];

    /* renamed from: a */
    private final int f3010a;

    /* renamed from: b */
    private final int f3011b;

    /* renamed from: c */
    final StateListDrawable f3012c;

    /* renamed from: d */
    final Drawable f3013d;

    /* renamed from: e */
    private final int f3014e;

    /* renamed from: f */
    private final int f3015f;

    /* renamed from: g */
    private final StateListDrawable f3016g;

    /* renamed from: h */
    private final Drawable f3017h;

    /* renamed from: i */
    private final int f3018i;

    /* renamed from: j */
    private final int f3019j;

    /* renamed from: k */
    int f3020k;

    /* renamed from: l */
    int f3021l;

    /* renamed from: m */
    float f3022m;

    /* renamed from: n */
    int f3023n;

    /* renamed from: o */
    int f3024o;

    /* renamed from: p */
    float f3025p;

    /* renamed from: s */
    private C0813j f3028s;

    /* renamed from: q */
    private int f3026q = 0;

    /* renamed from: r */
    private int f3027r = 0;

    /* renamed from: t */
    private boolean f3029t = false;

    /* renamed from: u */
    private boolean f3030u = false;

    /* renamed from: v */
    private int f3031v = 0;

    /* renamed from: w */
    private int f3032w = 0;

    /* renamed from: x */
    private final int[] f3033x = new int[2];

    /* renamed from: y */
    private final int[] f3034y = new int[2];

    /* renamed from: z */
    final ValueAnimator f3035z = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: A */
    int f3007A = 0;

    /* renamed from: B */
    private final Runnable f3008B = new RunnableC0798a();

    /* renamed from: C */
    private final C0813j.AbstractC0844t f3009C = new C0799b();

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    class RunnableC0798a implements Runnable {
        RunnableC0798a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0797d.this.m1088a(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    class C0799b extends C0813j.AbstractC0844t {
        C0799b() {
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0844t
        /* renamed from: a */
        public void mo643a(C0813j jVar, int i, int i2) {
            C0797d.this.m1087a(jVar.computeHorizontalScrollOffset(), jVar.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private class C0800c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3038a = false;

        C0800c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3038a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3038a) {
                this.f3038a = false;
            } else if (((Float) C0797d.this.f3035z.getAnimatedValue()).floatValue() == 0.0f) {
                C0797d dVar = C0797d.this;
                dVar.f3007A = 0;
                dVar.m1081b(0);
            } else {
                C0797d dVar2 = C0797d.this;
                dVar2.f3007A = 2;
                dVar2.m1092a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    private class C0801d implements ValueAnimator.AnimatorUpdateListener {
        C0801d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0797d.this.f3012c.setAlpha(floatValue);
            C0797d.this.f3013d.setAlpha(floatValue);
            C0797d.this.m1092a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0797d(C0813j jVar, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3012c = stateListDrawable;
        this.f3013d = drawable;
        this.f3016g = stateListDrawable2;
        this.f3017h = drawable2;
        this.f3014e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3015f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3018i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3019j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3010a = i2;
        this.f3011b = i3;
        this.f3012c.setAlpha(255);
        this.f3013d.setAlpha(255);
        this.f3035z.addListener(new C0800c());
        this.f3035z.addUpdateListener(new C0801d());
        m1085a(jVar);
    }

    /* renamed from: a */
    private int m1089a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    private void m1091a(float f) {
        int[] e = m1076e();
        float max = Math.max(e[0], Math.min(e[1], f));
        if (Math.abs(this.f3024o - max) >= 2.0f) {
            int a = m1089a(this.f3025p, max, e, this.f3028s.computeHorizontalScrollRange(), this.f3028s.computeHorizontalScrollOffset(), this.f3026q);
            if (a != 0) {
                this.f3028s.scrollBy(a, 0);
            }
            this.f3025p = max;
        }
    }

    /* renamed from: a */
    private void m1086a(Canvas canvas) {
        int i = this.f3027r;
        int i2 = this.f3018i;
        int i3 = i - i2;
        int i4 = this.f3024o;
        int i5 = this.f3023n;
        int i6 = i4 - (i5 / 2);
        this.f3016g.setBounds(0, 0, i5, i2);
        this.f3017h.setBounds(0, 0, this.f3026q, this.f3019j);
        canvas.translate(0.0f, i3);
        this.f3017h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f3016g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: b */
    private void m1083b(float f) {
        int[] f2 = m1075f();
        float max = Math.max(f2[0], Math.min(f2[1], f));
        if (Math.abs(this.f3021l - max) >= 2.0f) {
            int a = m1089a(this.f3022m, max, f2, this.f3028s.computeVerticalScrollRange(), this.f3028s.computeVerticalScrollOffset(), this.f3027r);
            if (a != 0) {
                this.f3028s.scrollBy(0, a);
            }
            this.f3022m = max;
        }
    }

    /* renamed from: b */
    private void m1080b(Canvas canvas) {
        int i = this.f3026q;
        int i2 = this.f3014e;
        int i3 = i - i2;
        int i4 = this.f3021l;
        int i5 = this.f3020k;
        int i6 = i4 - (i5 / 2);
        this.f3012c.setBounds(0, 0, i2, i5);
        this.f3013d.setBounds(0, 0, this.f3015f, this.f3027r);
        if (m1074g()) {
            this.f3013d.draw(canvas);
            canvas.translate(this.f3014e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3012c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f3014e;
        } else {
            canvas.translate(i3, 0.0f);
            this.f3013d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f3012c.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    /* renamed from: c */
    private void m1079c() {
        this.f3028s.removeCallbacks(this.f3008B);
    }

    /* renamed from: c */
    private void m1078c(int i) {
        m1079c();
        this.f3028s.postDelayed(this.f3008B, i);
    }

    /* renamed from: d */
    private void m1077d() {
        this.f3028s.m964b((C0813j.AbstractC0834n) this);
        this.f3028s.m963b((C0813j.AbstractC0843s) this);
        this.f3028s.m962b(this.f3009C);
        m1079c();
    }

    /* renamed from: e */
    private int[] m1076e() {
        int[] iArr = this.f3034y;
        int i = this.f3011b;
        iArr[0] = i;
        iArr[1] = this.f3026q - i;
        return iArr;
    }

    /* renamed from: f */
    private int[] m1075f() {
        int[] iArr = this.f3033x;
        int i = this.f3011b;
        iArr[0] = i;
        iArr[1] = this.f3027r - i;
        return iArr;
    }

    /* renamed from: g */
    private boolean m1074g() {
        return C0216r.m3411j(this.f3028s) == 1;
    }

    /* renamed from: h */
    private void m1073h() {
        this.f3028s.m982a((C0813j.AbstractC0834n) this);
        this.f3028s.m980a((C0813j.AbstractC0843s) this);
        this.f3028s.m979a(this.f3009C);
    }

    /* renamed from: a */
    void m1092a() {
        this.f3028s.invalidate();
    }

    /* renamed from: a */
    void m1088a(int i) {
        int i2 = this.f3007A;
        if (i2 == 1) {
            this.f3035z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3007A = 3;
        ValueAnimator valueAnimator = this.f3035z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3035z.setDuration(i);
        this.f3035z.start();
    }

    /* renamed from: a */
    void m1087a(int i, int i2) {
        int computeVerticalScrollRange = this.f3028s.computeVerticalScrollRange();
        int i3 = this.f3027r;
        this.f3029t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3010a;
        int computeHorizontalScrollRange = this.f3028s.computeHorizontalScrollRange();
        int i4 = this.f3026q;
        this.f3030u = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3010a;
        if (this.f3029t || this.f3030u) {
            if (this.f3029t) {
                float f = i3;
                this.f3021l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
                this.f3020k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3030u) {
                float f2 = i4;
                this.f3024o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
                this.f3023n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3031v;
            if (i5 == 0 || i5 == 1) {
                m1081b(1);
            }
        } else if (this.f3031v != 0) {
            m1081b(0);
        }
    }

    /* renamed from: a */
    public void m1085a(C0813j jVar) {
        C0813j jVar2 = this.f3028s;
        if (jVar2 != jVar) {
            if (jVar2 != null) {
                m1077d();
            }
            this.f3028s = jVar;
            if (this.f3028s != null) {
                m1073h();
            }
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0843s
    /* renamed from: a */
    public void mo646a(boolean z) {
    }

    /* renamed from: a */
    boolean m1090a(float f, float f2) {
        if (f2 >= this.f3027r - this.f3018i) {
            int i = this.f3024o;
            int i2 = this.f3023n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0843s
    /* renamed from: a */
    public boolean mo647a(C0813j jVar, MotionEvent motionEvent) {
        int i = this.f3031v;
        if (i == 1) {
            boolean b = m1082b(motionEvent.getX(), motionEvent.getY());
            boolean a = m1090a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b && !a) {
                return false;
            }
            if (a) {
                this.f3032w = 1;
                this.f3025p = (int) motionEvent.getX();
            } else if (b) {
                this.f3032w = 2;
                this.f3022m = (int) motionEvent.getY();
            }
            m1081b(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m1084b() {
        int i = this.f3007A;
        if (i != 0) {
            if (i == 3) {
                this.f3035z.cancel();
            } else {
                return;
            }
        }
        this.f3007A = 1;
        ValueAnimator valueAnimator = this.f3035z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3035z.setDuration(500L);
        this.f3035z.setStartDelay(0L);
        this.f3035z.start();
    }

    /* renamed from: b */
    void m1081b(int i) {
        int i2;
        if (i == 2 && this.f3031v != 2) {
            this.f3012c.setState(f3005D);
            m1079c();
        }
        if (i == 0) {
            m1092a();
        } else {
            m1084b();
        }
        if (this.f3031v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f3031v = i;
        }
        this.f3012c.setState(f3006E);
        i2 = 1200;
        m1078c(i2);
        this.f3031v = i;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0834n
    /* renamed from: b */
    public void mo792b(Canvas canvas, C0813j jVar, C0813j.C0815a0 a0Var) {
        if (this.f3026q != this.f3028s.getWidth() || this.f3027r != this.f3028s.getHeight()) {
            this.f3026q = this.f3028s.getWidth();
            this.f3027r = this.f3028s.getHeight();
            m1081b(0);
        } else if (this.f3007A != 0) {
            if (this.f3029t) {
                m1080b(canvas);
            }
            if (this.f3030u) {
                m1086a(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0843s
    /* renamed from: b */
    public void mo645b(C0813j jVar, MotionEvent motionEvent) {
        if (this.f3031v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = m1082b(motionEvent.getX(), motionEvent.getY());
                boolean a = m1090a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f3032w = 1;
                        this.f3025p = (int) motionEvent.getX();
                    } else if (b) {
                        this.f3032w = 2;
                        this.f3022m = (int) motionEvent.getY();
                    }
                    m1081b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3031v == 2) {
                this.f3022m = 0.0f;
                this.f3025p = 0.0f;
                m1081b(1);
                this.f3032w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3031v == 2) {
                m1084b();
                if (this.f3032w == 1) {
                    m1091a(motionEvent.getX());
                }
                if (this.f3032w == 2) {
                    m1083b(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    boolean m1082b(float f, float f2) {
        if (!m1074g() ? f >= this.f3026q - this.f3014e : f <= this.f3014e / 2) {
            int i = this.f3021l;
            int i2 = this.f3020k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }
}
