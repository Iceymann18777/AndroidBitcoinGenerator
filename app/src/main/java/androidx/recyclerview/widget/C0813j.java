package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p018g.p025h.C0159a;
import p000a.p018g.p028k.C0184g;
import p000a.p018g.p029l.AbstractC0207i;
import p000a.p018g.p029l.AbstractC0214p;
import p000a.p018g.p029l.C0185a;
import p000a.p018g.p029l.C0206h;
import p000a.p018g.p029l.C0209k;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0220s;
import p000a.p018g.p029l.p030a0.C0187a;
import p000a.p018g.p029l.p030a0.C0191c;
import p000a.p033i.p034a.AbstractC0237a;
import p000a.p044m.C0317a;
import p000a.p044m.C0318b;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public class C0813j extends ViewGroup implements AbstractC0214p, AbstractC0207i {

    /* renamed from: B0 */
    static final boolean f3070B0;

    /* renamed from: C0 */
    static final boolean f3071C0;

    /* renamed from: D0 */
    static final boolean f3072D0;

    /* renamed from: E0 */
    private static final boolean f3073E0;

    /* renamed from: F0 */
    private static final boolean f3074F0;

    /* renamed from: G0 */
    private static final Class<?>[] f3075G0;

    /* renamed from: H0 */
    static final Interpolator f3076H0;

    /* renamed from: A */
    boolean f3078A;

    /* renamed from: B */
    private final AccessibilityManager f3079B;

    /* renamed from: C */
    private List<AbstractC0841q> f3080C;

    /* renamed from: D */
    boolean f3081D;

    /* renamed from: E */
    boolean f3082E;

    /* renamed from: F */
    private int f3083F;

    /* renamed from: G */
    private int f3084G;

    /* renamed from: H */
    private C0828k f3085H;

    /* renamed from: I */
    private EdgeEffect f3086I;

    /* renamed from: J */
    private EdgeEffect f3087J;

    /* renamed from: K */
    private EdgeEffect f3088K;

    /* renamed from: L */
    private EdgeEffect f3089L;

    /* renamed from: M */
    AbstractC0829l f3090M;

    /* renamed from: N */
    private int f3091N;

    /* renamed from: O */
    private int f3092O;

    /* renamed from: P */
    private VelocityTracker f3093P;

    /* renamed from: Q */
    private int f3094Q;

    /* renamed from: R */
    private int f3095R;

    /* renamed from: S */
    private int f3096S;

    /* renamed from: T */
    private int f3097T;

    /* renamed from: U */
    private int f3098U;

    /* renamed from: V */
    private AbstractC0842r f3099V;

    /* renamed from: W */
    private final int f3100W;

    /* renamed from: a0 */
    private final int f3101a0;

    /* renamed from: b */
    private final C0849x f3102b;

    /* renamed from: b0 */
    private float f3103b0;

    /* renamed from: c */
    final C0847v f3104c;

    /* renamed from: c0 */
    private float f3105c0;

    /* renamed from: d */
    private C0850y f3106d;

    /* renamed from: d0 */
    private boolean f3107d0;

    /* renamed from: e */
    C0780a f3108e;

    /* renamed from: e0 */
    final RunnableC0819c0 f3109e0;

    /* renamed from: f */
    C0783b f3110f;

    /* renamed from: f0 */
    RunnableC0802e f3111f0;

    /* renamed from: g */
    final C0861o f3112g;

    /* renamed from: g0 */
    RunnableC0802e.C0804b f3113g0;

    /* renamed from: h */
    boolean f3114h;

    /* renamed from: h0 */
    final C0815a0 f3115h0;

    /* renamed from: i */
    final Rect f3116i;

    /* renamed from: i0 */
    private AbstractC0844t f3117i0;

    /* renamed from: j */
    private final Rect f3118j;

    /* renamed from: j0 */
    private List<AbstractC0844t> f3119j0;

    /* renamed from: k */
    final RectF f3120k;

    /* renamed from: k0 */
    boolean f3121k0;

    /* renamed from: l */
    AbstractC0824g f3122l;

    /* renamed from: l0 */
    boolean f3123l0;

    /* renamed from: m */
    AbstractC0835o f3124m;

    /* renamed from: m0 */
    private AbstractC0829l.AbstractC0831b f3125m0;

    /* renamed from: n */
    AbstractC0848w f3126n;

    /* renamed from: n0 */
    boolean f3127n0;

    /* renamed from: o */
    final ArrayList<AbstractC0834n> f3128o;

    /* renamed from: o0 */
    C0854k f3129o0;

    /* renamed from: p */
    private final ArrayList<AbstractC0843s> f3130p;

    /* renamed from: p0 */
    private AbstractC0827j f3131p0;

    /* renamed from: q */
    private AbstractC0843s f3132q;

    /* renamed from: q0 */
    private final int[] f3133q0;

    /* renamed from: r */
    boolean f3134r;

    /* renamed from: r0 */
    private C0209k f3135r0;

    /* renamed from: s */
    boolean f3136s;

    /* renamed from: s0 */
    private final int[] f3137s0;

    /* renamed from: t */
    boolean f3138t;

    /* renamed from: t0 */
    final int[] f3139t0;

    /* renamed from: u */
    boolean f3140u;

    /* renamed from: u0 */
    private final int[] f3141u0;

    /* renamed from: v */
    private int f3142v;

    /* renamed from: v0 */
    final int[] f3143v0;

    /* renamed from: w */
    boolean f3144w;

    /* renamed from: w0 */
    final List<AbstractC0821d0> f3145w0;

    /* renamed from: x */
    boolean f3146x;

    /* renamed from: x0 */
    private Runnable f3147x0;

    /* renamed from: y */
    private boolean f3148y;

    /* renamed from: y0 */
    private final C0861o.AbstractC0863b f3149y0;

    /* renamed from: z */
    private int f3150z;

    /* renamed from: z0 */
    private static final int[] f3077z0 = {16843830};

    /* renamed from: A0 */
    private static final int[] f3069A0 = {16842987};

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    class RunnableC0814a implements Runnable {
        RunnableC0814a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0813j jVar = C0813j.this;
            if (jVar.f3140u && !jVar.isLayoutRequested()) {
                C0813j jVar2 = C0813j.this;
                if (!jVar2.f3134r) {
                    jVar2.requestLayout();
                } else if (jVar2.f3146x) {
                    jVar2.f3144w = true;
                } else {
                    jVar2.m971b();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$a0 */
    /* loaded from: classes.dex */
    public static class C0815a0 {

        /* renamed from: b */
        private SparseArray<Object> f3153b;

        /* renamed from: m */
        int f3164m;

        /* renamed from: n */
        long f3165n;

        /* renamed from: o */
        int f3166o;

        /* renamed from: p */
        int f3167p;

        /* renamed from: q */
        int f3168q;

        /* renamed from: a */
        int f3152a = -1;

        /* renamed from: c */
        int f3154c = 0;

        /* renamed from: d */
        int f3155d = 0;

        /* renamed from: e */
        int f3156e = 1;

        /* renamed from: f */
        int f3157f = 0;

        /* renamed from: g */
        boolean f3158g = false;

        /* renamed from: h */
        boolean f3159h = false;

        /* renamed from: i */
        boolean f3160i = false;

        /* renamed from: j */
        boolean f3161j = false;

        /* renamed from: k */
        boolean f3162k = false;

        /* renamed from: l */
        boolean f3163l = false;

        /* renamed from: a */
        public int m907a() {
            return this.f3159h ? this.f3154c - this.f3155d : this.f3157f;
        }

        /* renamed from: a */
        void m906a(int i) {
            if ((this.f3156e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3156e));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m905a(AbstractC0824g gVar) {
            this.f3156e = 1;
            this.f3157f = gVar.mo106a();
            this.f3159h = false;
            this.f3160i = false;
            this.f3161j = false;
        }

        /* renamed from: b */
        public int m904b() {
            return this.f3152a;
        }

        /* renamed from: c */
        public boolean m903c() {
            return this.f3152a != -1;
        }

        /* renamed from: d */
        public boolean m902d() {
            return this.f3159h;
        }

        /* renamed from: e */
        public boolean m901e() {
            return this.f3163l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3152a + ", mData=" + this.f3153b + ", mItemCount=" + this.f3157f + ", mIsMeasuring=" + this.f3161j + ", mPreviousLayoutItemCount=" + this.f3154c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3155d + ", mStructureChanged=" + this.f3158g + ", mInPreLayout=" + this.f3159h + ", mRunSimpleAnimations=" + this.f3162k + ", mRunPredictiveAnimations=" + this.f3163l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes.dex */
    class RunnableC0816b implements Runnable {
        RunnableC0816b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0829l lVar = C0813j.this.f3090M;
            if (lVar != null) {
                lVar.mo802i();
            }
            C0813j.this.f3127n0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0817b0 {
        /* renamed from: a */
        public abstract View m900a(C0847v vVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.j$c  reason: invalid class name */
    /* loaded from: classes.dex */
    static class animationInterpolatorC0818c implements Interpolator {
        animationInterpolatorC0818c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$c0 */
    /* loaded from: classes.dex */
    public class RunnableC0819c0 implements Runnable {

        /* renamed from: b */
        private int f3170b;

        /* renamed from: c */
        private int f3171c;

        /* renamed from: d */
        OverScroller f3172d;

        /* renamed from: e */
        Interpolator f3173e = C0813j.f3076H0;

        /* renamed from: f */
        private boolean f3174f = false;

        /* renamed from: g */
        private boolean f3175g = false;

        RunnableC0819c0() {
            this.f3172d = new OverScroller(C0813j.this.getContext(), C0813j.f3076H0);
        }

        /* renamed from: a */
        private float m898a(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        /* renamed from: a */
        private int m896a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            C0813j jVar = C0813j.this;
            int width = z ? jVar.getWidth() : jVar.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float a = f2 + (m898a(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: c */
        private void m892c() {
            this.f3175g = false;
            this.f3174f = true;
        }

        /* renamed from: d */
        private void m891d() {
            this.f3174f = false;
            if (this.f3175g) {
                m899a();
            }
        }

        /* renamed from: a */
        void m899a() {
            if (this.f3174f) {
                this.f3175g = true;
                return;
            }
            C0813j.this.removeCallbacks(this);
            C0216r.m3432a(C0813j.this, this);
        }

        /* renamed from: a */
        public void m897a(int i, int i2) {
            C0813j.this.setScrollState(2);
            this.f3171c = 0;
            this.f3170b = 0;
            this.f3172d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m899a();
        }

        /* renamed from: a */
        public void m895a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f3173e != interpolator) {
                this.f3173e = interpolator;
                this.f3172d = new OverScroller(C0813j.this.getContext(), interpolator);
            }
            C0813j.this.setScrollState(2);
            this.f3171c = 0;
            this.f3170b = 0;
            this.f3172d.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3172d.computeScrollOffset();
            }
            m899a();
        }

        /* renamed from: a */
        public void m894a(int i, int i2, Interpolator interpolator) {
            int a = m896a(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = C0813j.f3076H0;
            }
            m895a(i, i2, a, interpolator);
        }

        /* renamed from: b */
        public void m893b() {
            C0813j.this.removeCallbacks(this);
            this.f3172d.abortAnimation();
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
            if (r8 > 0) goto L_0x00e7;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f6 A[ADDED_TO_REGION] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 410
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.RunnableC0819c0.run():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    /* loaded from: classes.dex */
    class C0820d implements C0861o.AbstractC0863b {
        C0820d() {
        }

        @Override // androidx.recyclerview.widget.C0861o.AbstractC0863b
        /* renamed from: a */
        public void mo518a(AbstractC0821d0 d0Var) {
            C0813j jVar = C0813j.this;
            jVar.f3124m.m761a(d0Var.f3179a, jVar.f3104c);
        }

        @Override // androidx.recyclerview.widget.C0861o.AbstractC0863b
        /* renamed from: a */
        public void mo517a(AbstractC0821d0 d0Var, AbstractC0829l.C0832c cVar, AbstractC0829l.C0832c cVar2) {
            C0813j.this.f3104c.m605c(d0Var);
            C0813j.this.m965b(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0861o.AbstractC0863b
        /* renamed from: b */
        public void mo516b(AbstractC0821d0 d0Var, AbstractC0829l.C0832c cVar, AbstractC0829l.C0832c cVar2) {
            d0Var.m881a(false);
            C0813j jVar = C0813j.this;
            boolean z = jVar.f3081D;
            AbstractC0829l lVar = jVar.f3090M;
            if (z) {
                if (!lVar.mo572a(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.mo567c(d0Var, cVar, cVar2)) {
                return;
            }
            C0813j.this.m915s();
        }

        @Override // androidx.recyclerview.widget.C0861o.AbstractC0863b
        /* renamed from: c */
        public void mo515c(AbstractC0821d0 d0Var, AbstractC0829l.C0832c cVar, AbstractC0829l.C0832c cVar2) {
            C0813j.this.m984a(d0Var, cVar, cVar2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0821d0 {

        /* renamed from: s */
        private static final List<Object> f3178s = Collections.emptyList();

        /* renamed from: a */
        public final View f3179a;

        /* renamed from: b */
        WeakReference<C0813j> f3180b;

        /* renamed from: j */
        int f3188j;

        /* renamed from: r */
        C0813j f3196r;

        /* renamed from: c */
        int f3181c = -1;

        /* renamed from: d */
        int f3182d = -1;

        /* renamed from: e */
        long f3183e = -1;

        /* renamed from: f */
        int f3184f = -1;

        /* renamed from: g */
        int f3185g = -1;

        /* renamed from: h */
        AbstractC0821d0 f3186h = null;

        /* renamed from: i */
        AbstractC0821d0 f3187i = null;

        /* renamed from: k */
        List<Object> f3189k = null;

        /* renamed from: l */
        List<Object> f3190l = null;

        /* renamed from: m */
        private int f3191m = 0;

        /* renamed from: n */
        C0847v f3192n = null;

        /* renamed from: o */
        boolean f3193o = false;

        /* renamed from: p */
        private int f3194p = 0;

        /* renamed from: q */
        int f3195q = -1;

        public AbstractC0821d0(View view) {
            if (view != null) {
                this.f3179a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: A */
        private void m890A() {
            if (this.f3189k == null) {
                this.f3189k = new ArrayList();
                this.f3190l = Collections.unmodifiableList(this.f3189k);
            }
        }

        /* renamed from: a */
        void m889a() {
            this.f3182d = -1;
            this.f3185g = -1;
        }

        /* renamed from: a */
        void m888a(int i) {
            this.f3188j = i | this.f3188j;
        }

        /* renamed from: a */
        void m887a(int i, int i2) {
            this.f3188j = (i & i2) | (this.f3188j & (i2 ^ (-1)));
        }

        /* renamed from: a */
        void m886a(int i, int i2, boolean z) {
            m888a(8);
            m885a(i2, z);
            this.f3181c = i;
        }

        /* renamed from: a */
        void m885a(int i, boolean z) {
            if (this.f3182d == -1) {
                this.f3182d = this.f3181c;
            }
            if (this.f3185g == -1) {
                this.f3185g = this.f3181c;
            }
            if (z) {
                this.f3185g += i;
            }
            this.f3181c += i;
            if (this.f3179a.getLayoutParams() != null) {
                ((C0840p) this.f3179a.getLayoutParams()).f3236c = true;
            }
        }

        /* renamed from: a */
        void m884a(C0847v vVar, boolean z) {
            this.f3192n = vVar;
            this.f3193o = z;
        }

        /* renamed from: a */
        void m883a(C0813j jVar) {
            int i = this.f3195q;
            if (i == -1) {
                i = C0216r.m3413h(this.f3179a);
            }
            this.f3194p = i;
            jVar.m987a(this, 4);
        }

        /* renamed from: a */
        void m882a(Object obj) {
            if (obj == null) {
                m888a(1024);
            } else if ((1024 & this.f3188j) == 0) {
                m890A();
                this.f3189k.add(obj);
            }
        }

        /* renamed from: a */
        public final void m881a(boolean z) {
            int i;
            int i2 = this.f3191m;
            this.f3191m = z ? i2 - 1 : i2 + 1;
            int i3 = this.f3191m;
            if (i3 < 0) {
                this.f3191m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f3188j | 16;
            } else if (z && this.f3191m == 0) {
                i = this.f3188j & (-17);
            } else {
                return;
            }
            this.f3188j = i;
        }

        /* renamed from: b */
        void m880b() {
            List<Object> list = this.f3189k;
            if (list != null) {
                list.clear();
            }
            this.f3188j &= -1025;
        }

        /* renamed from: b */
        void m878b(C0813j jVar) {
            jVar.m987a(this, this.f3194p);
            this.f3194p = 0;
        }

        /* renamed from: b */
        boolean m879b(int i) {
            return (i & this.f3188j) != 0;
        }

        /* renamed from: c */
        void m877c() {
            this.f3188j &= -33;
        }

        /* renamed from: d */
        void m876d() {
            this.f3188j &= -257;
        }

        /* renamed from: e */
        boolean m875e() {
            return (this.f3188j & 16) == 0 && C0216r.m3399v(this.f3179a);
        }

        /* renamed from: f */
        public final int m874f() {
            C0813j jVar = this.f3196r;
            if (jVar == null) {
                return -1;
            }
            return jVar.m966b(this);
        }

        /* renamed from: g */
        public final long m873g() {
            return this.f3183e;
        }

        /* renamed from: h */
        public final int m872h() {
            return this.f3184f;
        }

        /* renamed from: i */
        public final int m871i() {
            int i = this.f3185g;
            return i == -1 ? this.f3181c : i;
        }

        /* renamed from: j */
        public final int m870j() {
            return this.f3182d;
        }

        /* renamed from: k */
        List<Object> m869k() {
            if ((this.f3188j & 1024) != 0) {
                return f3178s;
            }
            List<Object> list = this.f3189k;
            return (list == null || list.size() == 0) ? f3178s : this.f3190l;
        }

        /* renamed from: l */
        boolean m868l() {
            return (this.f3188j & 512) != 0 || m866n();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m */
        public boolean m867m() {
            return (this.f3188j & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean m866n() {
            return (this.f3188j & 4) != 0;
        }

        /* renamed from: o */
        public final boolean m865o() {
            return (this.f3188j & 16) == 0 && !C0216r.m3399v(this.f3179a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean m864p() {
            return (this.f3188j & 8) != 0;
        }

        /* renamed from: q */
        boolean m863q() {
            return this.f3192n != null;
        }

        /* renamed from: r */
        boolean m862r() {
            return (this.f3188j & 256) != 0;
        }

        /* renamed from: s */
        boolean m861s() {
            return (this.f3188j & 2) != 0;
        }

        /* renamed from: t */
        boolean m860t() {
            return (this.f3188j & 2) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f3181c + " id=" + this.f3183e + ", oldPos=" + this.f3182d + ", pLpos:" + this.f3185g);
            if (m863q()) {
                sb.append(" scrap ");
                sb.append(this.f3193o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m866n()) {
                sb.append(" invalid");
            }
            if (!m867m()) {
                sb.append(" unbound");
            }
            if (m860t()) {
                sb.append(" update");
            }
            if (m864p()) {
                sb.append(" removed");
            }
            if (m856x()) {
                sb.append(" ignored");
            }
            if (m862r()) {
                sb.append(" tmpDetached");
            }
            if (!m865o()) {
                sb.append(" not recyclable(" + this.f3191m + ")");
            }
            if (m868l()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3179a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        void m859u() {
            this.f3188j = 0;
            this.f3181c = -1;
            this.f3182d = -1;
            this.f3183e = -1L;
            this.f3185g = -1;
            this.f3191m = 0;
            this.f3186h = null;
            this.f3187i = null;
            m880b();
            this.f3194p = 0;
            this.f3195q = -1;
            C0813j.m944e(this);
        }

        /* renamed from: v */
        void m858v() {
            if (this.f3182d == -1) {
                this.f3182d = this.f3181c;
            }
        }

        /* renamed from: w */
        boolean m857w() {
            return (this.f3188j & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean m856x() {
            return (this.f3188j & 128) != 0;
        }

        /* renamed from: y */
        void m855y() {
            this.f3192n.m605c(this);
        }

        /* renamed from: z */
        boolean m854z() {
            return (this.f3188j & 32) != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$e */
    /* loaded from: classes.dex */
    public class C0822e implements C0783b.AbstractC0785b {
        C0822e() {
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public int mo853a() {
            return C0813j.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public View mo852a(int i) {
            return C0813j.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public void mo851a(View view) {
            AbstractC0821d0 k = C0813j.m924k(view);
            if (k != null) {
                k.m878b(C0813j.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public void mo850a(View view, int i) {
            C0813j.this.addView(view, i);
            C0813j.this.m994a(view);
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: a */
        public void mo849a(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC0821d0 k = C0813j.m924k(view);
            if (k != null) {
                if (k.m862r() || k.m856x()) {
                    k.m876d();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + k + C0813j.this.m932i());
                }
            }
            C0813j.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: b */
        public void mo848b() {
            int a = mo853a();
            for (int i = 0; i < a; i++) {
                View a2 = mo852a(i);
                C0813j.this.m967b(a2);
                a2.clearAnimation();
            }
            C0813j.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: b */
        public void mo847b(int i) {
            AbstractC0821d0 k;
            View a = mo852a(i);
            if (!(a == null || (k = C0813j.m924k(a)) == null)) {
                if (!k.m862r() || k.m856x()) {
                    k.m888a(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + k + C0813j.this.m932i());
                }
            }
            C0813j.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: b */
        public void mo846b(View view) {
            AbstractC0821d0 k = C0813j.m924k(view);
            if (k != null) {
                k.m883a(C0813j.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: c */
        public int mo844c(View view) {
            return C0813j.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: c */
        public void mo845c(int i) {
            View childAt = C0813j.this.getChildAt(i);
            if (childAt != null) {
                C0813j.this.m967b(childAt);
                childAt.clearAnimation();
            }
            C0813j.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C0783b.AbstractC0785b
        /* renamed from: d */
        public AbstractC0821d0 mo843d(View view) {
            return C0813j.m924k(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$f */
    /* loaded from: classes.dex */
    public class C0823f implements C0780a.AbstractC0781a {
        C0823f() {
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: a */
        public AbstractC0821d0 mo842a(int i) {
            AbstractC0821d0 a = C0813j.this.m1001a(i, true);
            if (a != null && !C0813j.this.f3110f.m1119c(a.f3179a)) {
                return a;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: a */
        public void mo841a(int i, int i2) {
            C0813j.this.m937g(i, i2);
            C0813j.this.f3121k0 = true;
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: a */
        public void mo840a(int i, int i2, Object obj) {
            C0813j.this.m1005a(i, i2, obj);
            C0813j.this.f3123l0 = true;
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: a */
        public void mo839a(C0780a.C0782b bVar) {
            m835c(bVar);
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: b */
        public void mo838b(int i, int i2) {
            C0813j.this.m941f(i, i2);
            C0813j.this.f3121k0 = true;
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: b */
        public void mo837b(C0780a.C0782b bVar) {
            m835c(bVar);
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: c */
        public void mo836c(int i, int i2) {
            C0813j.this.m1004a(i, i2, true);
            C0813j jVar = C0813j.this;
            jVar.f3121k0 = true;
            jVar.f3115h0.f3155d += i2;
        }

        /* renamed from: c */
        void m835c(C0780a.C0782b bVar) {
            int i = bVar.f2945a;
            if (i == 1) {
                C0813j jVar = C0813j.this;
                jVar.f3124m.mo743a(jVar, bVar.f2946b, bVar.f2948d);
            } else if (i == 2) {
                C0813j jVar2 = C0813j.this;
                jVar2.f3124m.mo719b(jVar2, bVar.f2946b, bVar.f2948d);
            } else if (i == 4) {
                C0813j jVar3 = C0813j.this;
                jVar3.f3124m.mo741a(jVar3, bVar.f2946b, bVar.f2948d, bVar.f2947c);
            } else if (i == 8) {
                C0813j jVar4 = C0813j.this;
                jVar4.f3124m.mo742a(jVar4, bVar.f2946b, bVar.f2948d, 1);
            }
        }

        @Override // androidx.recyclerview.widget.C0780a.AbstractC0781a
        /* renamed from: d */
        public void mo834d(int i, int i2) {
            C0813j.this.m1004a(i, i2, false);
            C0813j.this.f3121k0 = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0824g<VH extends AbstractC0821d0> {

        /* renamed from: a */
        private final C0825h f3199a = new C0825h();

        /* renamed from: b */
        private boolean f3200b = false;

        /* renamed from: a */
        public abstract int mo106a();

        /* renamed from: a */
        public abstract long mo105a(int i);

        /* renamed from: a */
        public final VH m833a(ViewGroup viewGroup, int i) {
            try {
                C0159a.m3606a("RV CreateView");
                VH b = mo97b(viewGroup, i);
                if (b.f3179a.getParent() == null) {
                    b.f3184f = i;
                    return b;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0159a.m3607a();
            }
        }

        /* renamed from: a */
        public final void m831a(VH vh, int i) {
            vh.f3181c = i;
            if (m827b()) {
                vh.f3183e = mo105a(i);
            }
            vh.m887a(1, 519);
            C0159a.m3606a("RV OnBindView");
            m830a(vh, i, vh.m869k());
            vh.m880b();
            ViewGroup.LayoutParams layoutParams = vh.f3179a.getLayoutParams();
            if (layoutParams instanceof C0840p) {
                ((C0840p) layoutParams).f3236c = true;
            }
            C0159a.m3607a();
        }

        /* renamed from: a */
        public void m830a(VH vh, int i, List<Object> list) {
            mo96b((AbstractC0824g<VH>) vh, i);
        }

        /* renamed from: a */
        public void m829a(AbstractC0826i iVar) {
            this.f3199a.registerObserver(iVar);
        }

        /* renamed from: a */
        public void m828a(C0813j jVar) {
        }

        /* renamed from: a */
        public boolean m832a(VH vh) {
            return false;
        }

        /* renamed from: b */
        public abstract int mo98b(int i);

        /* renamed from: b */
        public abstract VH mo97b(ViewGroup viewGroup, int i);

        /* renamed from: b */
        public void m826b(VH vh) {
        }

        /* renamed from: b */
        public abstract void mo96b(VH vh, int i);

        /* renamed from: b */
        public void m825b(AbstractC0826i iVar) {
            this.f3199a.unregisterObserver(iVar);
        }

        /* renamed from: b */
        public void m824b(C0813j jVar) {
        }

        /* renamed from: b */
        public final boolean m827b() {
            return this.f3200b;
        }

        /* renamed from: c */
        public final void m823c() {
            this.f3199a.m821a();
        }

        /* renamed from: c */
        public void m822c(VH vh) {
        }

        /* renamed from: d */
        public abstract void mo94d(VH vh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$h */
    /* loaded from: classes.dex */
    public static class C0825h extends Observable<AbstractC0826i> {
        C0825h() {
        }

        /* renamed from: a */
        public void m821a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0826i) ((Observable) this).mObservers.get(size)).mo590a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0826i {
        /* renamed from: a */
        public void mo590a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$j */
    /* loaded from: classes.dex */
    public interface AbstractC0827j {
        /* renamed from: a */
        int m820a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.j$k */
    /* loaded from: classes.dex */
    public static class C0828k {
        /* renamed from: a */
        protected EdgeEffect m819a(C0813j jVar, int i) {
            return new EdgeEffect(jVar.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0829l {

        /* renamed from: a */
        private AbstractC0831b f3201a = null;

        /* renamed from: b */
        private ArrayList<AbstractC0830a> f3202b = new ArrayList<>();

        /* renamed from: c */
        private long f3203c = 120;

        /* renamed from: d */
        private long f3204d = 120;

        /* renamed from: e */
        private long f3205e = 250;

        /* renamed from: f */
        private long f3206f = 250;

        /* renamed from: androidx.recyclerview.widget.j$l$a */
        /* loaded from: classes.dex */
        public interface AbstractC0830a {
            /* renamed from: a */
            void m801a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.j$l$b */
        /* loaded from: classes.dex */
        public interface AbstractC0831b {
            /* renamed from: a */
            void mo798a(AbstractC0821d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.j$l$c */
        /* loaded from: classes.dex */
        public static class C0832c {

            /* renamed from: a */
            public int f3207a;

            /* renamed from: b */
            public int f3208b;

            /* renamed from: a */
            public C0832c m800a(AbstractC0821d0 d0Var) {
                m799a(d0Var, 0);
                return this;
            }

            /* renamed from: a */
            public C0832c m799a(AbstractC0821d0 d0Var, int i) {
                View view = d0Var.f3179a;
                this.f3207a = view.getLeft();
                this.f3208b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m806e(AbstractC0821d0 d0Var) {
            int i = d0Var.f3188j & 14;
            if (d0Var.m866n()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int j = d0Var.m870j();
            int f = d0Var.m874f();
            return (j == -1 || f == -1 || j == f) ? i : i | 2048;
        }

        /* renamed from: a */
        public C0832c m817a(C0815a0 a0Var, AbstractC0821d0 d0Var) {
            C0832c h = m803h();
            h.m800a(d0Var);
            return h;
        }

        /* renamed from: a */
        public C0832c m816a(C0815a0 a0Var, AbstractC0821d0 d0Var, int i, List<Object> list) {
            C0832c h = m803h();
            h.m800a(d0Var);
            return h;
        }

        /* renamed from: a */
        public final void m818a() {
            int size = this.f3202b.size();
            for (int i = 0; i < size; i++) {
                this.f3202b.get(i).m801a();
            }
            this.f3202b.clear();
        }

        /* renamed from: a */
        void m814a(AbstractC0831b bVar) {
            this.f3201a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo575a(AbstractC0821d0 d0Var);

        /* renamed from: a */
        public abstract boolean mo572a(AbstractC0821d0 d0Var, AbstractC0821d0 d0Var2, C0832c cVar, C0832c cVar2);

        /* renamed from: a */
        public abstract boolean mo571a(AbstractC0821d0 d0Var, C0832c cVar, C0832c cVar2);

        /* renamed from: a */
        public boolean mo815a(AbstractC0821d0 d0Var, List<Object> list) {
            return mo575a(d0Var);
        }

        /* renamed from: b */
        public abstract void mo813b();

        /* renamed from: b */
        public final void m812b(AbstractC0821d0 d0Var) {
            m808d(d0Var);
            AbstractC0831b bVar = this.f3201a;
            if (bVar != null) {
                bVar.mo798a(d0Var);
            }
        }

        /* renamed from: b */
        public abstract boolean mo569b(AbstractC0821d0 d0Var, C0832c cVar, C0832c cVar2);

        /* renamed from: c */
        public long m811c() {
            return this.f3203c;
        }

        /* renamed from: c */
        public abstract void mo810c(AbstractC0821d0 d0Var);

        /* renamed from: c */
        public abstract boolean mo567c(AbstractC0821d0 d0Var, C0832c cVar, C0832c cVar2);

        /* renamed from: d */
        public long m809d() {
            return this.f3206f;
        }

        /* renamed from: d */
        public void m808d(AbstractC0821d0 d0Var) {
        }

        /* renamed from: e */
        public long m807e() {
            return this.f3205e;
        }

        /* renamed from: f */
        public long m805f() {
            return this.f3204d;
        }

        /* renamed from: g */
        public abstract boolean mo804g();

        /* renamed from: h */
        public C0832c m803h() {
            return new C0832c();
        }

        /* renamed from: i */
        public abstract void mo802i();
    }

    /* renamed from: androidx.recyclerview.widget.j$m */
    /* loaded from: classes.dex */
    private class C0833m implements AbstractC0829l.AbstractC0831b {
        C0833m() {
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l.AbstractC0831b
        /* renamed from: a */
        public void mo798a(AbstractC0821d0 d0Var) {
            d0Var.m881a(true);
            if (d0Var.f3186h != null && d0Var.f3187i == null) {
                d0Var.f3186h = null;
            }
            d0Var.f3187i = null;
            if (!d0Var.m857w() && !C0813j.this.m930i(d0Var.f3179a) && d0Var.m862r()) {
                C0813j.this.removeDetachedView(d0Var.f3179a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$n */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0834n {
        @Deprecated
        /* renamed from: a */
        public void m797a(Canvas canvas, C0813j jVar) {
        }

        /* renamed from: a */
        public void m796a(Canvas canvas, C0813j jVar, C0815a0 a0Var) {
            m797a(canvas, jVar);
        }

        @Deprecated
        /* renamed from: a */
        public void m795a(Rect rect, int i, C0813j jVar) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void m794a(Rect rect, View view, C0813j jVar, C0815a0 a0Var) {
            m795a(rect, ((C0840p) view.getLayoutParams()).m654a(), jVar);
        }

        @Deprecated
        /* renamed from: b */
        public void m793b(Canvas canvas, C0813j jVar) {
        }

        /* renamed from: b */
        public void mo792b(Canvas canvas, C0813j jVar, C0815a0 a0Var) {
            m793b(canvas, jVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0835o {

        /* renamed from: a */
        C0783b f3210a;

        /* renamed from: b */
        C0813j f3211b;

        /* renamed from: g */
        AbstractC0852z f3216g;

        /* renamed from: m */
        int f3222m;

        /* renamed from: n */
        boolean f3223n;

        /* renamed from: o */
        private int f3224o;

        /* renamed from: p */
        private int f3225p;

        /* renamed from: q */
        private int f3226q;

        /* renamed from: r */
        private int f3227r;

        /* renamed from: c */
        private final C0858n.AbstractC0860b f3212c = new C0836a();

        /* renamed from: d */
        private final C0858n.AbstractC0860b f3213d = new C0837b();

        /* renamed from: e */
        C0858n f3214e = new C0858n(this.f3212c);

        /* renamed from: f */
        C0858n f3215f = new C0858n(this.f3213d);

        /* renamed from: h */
        boolean f3217h = false;

        /* renamed from: i */
        boolean f3218i = false;

        /* renamed from: j */
        boolean f3219j = false;

        /* renamed from: k */
        private boolean f3220k = true;

        /* renamed from: l */
        private boolean f3221l = true;

        /* renamed from: androidx.recyclerview.widget.j$o$a */
        /* loaded from: classes.dex */
        class C0836a implements C0858n.AbstractC0860b {
            C0836a() {
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public int mo543a() {
                return AbstractC0835o.this.m665q() - AbstractC0835o.this.m668o();
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public int mo541a(View view) {
                return AbstractC0835o.this.m679i(view) + ((ViewGroup.MarginLayoutParams) ((C0840p) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public View mo542a(int i) {
                return AbstractC0835o.this.m715c(i);
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: b */
            public int mo540b() {
                return AbstractC0835o.this.m670n();
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: b */
            public int mo539b(View view) {
                return AbstractC0835o.this.m689f(view) - ((ViewGroup.MarginLayoutParams) ((C0840p) view.getLayoutParams())).leftMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.j$o$b */
        /* loaded from: classes.dex */
        class C0837b implements C0858n.AbstractC0860b {
            C0837b() {
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public int mo543a() {
                return AbstractC0835o.this.m682h() - AbstractC0835o.this.m672m();
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public int mo541a(View view) {
                return AbstractC0835o.this.m695e(view) + ((ViewGroup.MarginLayoutParams) ((C0840p) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: a */
            public View mo542a(int i) {
                return AbstractC0835o.this.m715c(i);
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: b */
            public int mo540b() {
                return AbstractC0835o.this.m666p();
            }

            @Override // androidx.recyclerview.widget.C0858n.AbstractC0860b
            /* renamed from: b */
            public int mo539b(View view) {
                return AbstractC0835o.this.m677j(view) - ((ViewGroup.MarginLayoutParams) ((C0840p) view.getLayoutParams())).topMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.j$o$c */
        /* loaded from: classes.dex */
        public interface AbstractC0838c {
            /* renamed from: a */
            void mo655a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.j$o$d */
        /* loaded from: classes.dex */
        public static class C0839d {

            /* renamed from: a */
            public int f3230a;

            /* renamed from: b */
            public int f3231b;

            /* renamed from: c */
            public boolean f3232c;

            /* renamed from: d */
            public boolean f3233d;
        }

        /* renamed from: a */
        public static int m785a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: a */
        public static int m784a(int i, int i2, int i3, int i4, boolean z) {
            int i5 = i - i3;
            i2 = 0;
            int max = Math.max(0, i5);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            max = max;
                        } else {
                            i2 = 0;
                            max = 0;
                        }
                    }
                    max = 0;
                }
                max = i4;
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 == -1) {
                        i2 = i2;
                    } else {
                        if (i4 == -2) {
                            if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                                i2 = Integer.MIN_VALUE;
                            }
                        }
                        max = 0;
                    }
                }
                max = i4;
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(max, i2);
        }

        /* renamed from: a */
        public static C0839d m775a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0839d dVar = new C0839d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0318b.RecyclerView, i, i2);
            dVar.f3230a = obtainStyledAttributes.getInt(C0318b.RecyclerView_android_orientation, 1);
            dVar.f3231b = obtainStyledAttributes.getInt(C0318b.RecyclerView_spanCount, 1);
            dVar.f3232c = obtainStyledAttributes.getBoolean(C0318b.RecyclerView_reverseLayout, false);
            dVar.f3233d = obtainStyledAttributes.getBoolean(C0318b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: a */
        private void m781a(int i, View view) {
            this.f3210a.m1129a(i);
        }

        /* renamed from: a */
        private void m764a(View view, int i, boolean z) {
            AbstractC0821d0 k = C0813j.m924k(view);
            if (z || k.m864p()) {
                this.f3211b.f3112g.m535a(k);
            } else {
                this.f3211b.f3112g.m523g(k);
            }
            C0840p pVar = (C0840p) view.getLayoutParams();
            if (k.m854z() || k.m863q()) {
                if (k.m863q()) {
                    k.m855y();
                } else {
                    k.m877c();
                }
                this.f3210a.m1127a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3211b) {
                int b = this.f3210a.m1122b(view);
                if (i == -1) {
                    i = this.f3210a.m1130a();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3211b.indexOfChild(view) + this.f3211b.m932i());
                } else if (b != i) {
                    this.f3211b.f3124m.m786a(b, i);
                }
            } else {
                this.f3210a.m1126a(view, i, false);
                pVar.f3236c = true;
                AbstractC0852z zVar = this.f3216g;
                if (zVar != null && zVar.m583c()) {
                    this.f3216g.m585a(view);
                }
            }
            if (pVar.f3237d) {
                k.f3179a.invalidate();
                pVar.f3237d = false;
            }
        }

        /* renamed from: a */
        private void m752a(C0847v vVar, int i, View view) {
            AbstractC0821d0 k = C0813j.m924k(view);
            if (!k.m856x()) {
                if (!k.m866n() || k.m864p() || this.f3211b.f3122l.m827b()) {
                    m787a(i);
                    vVar.m606c(view);
                    this.f3211b.f3112g.m526d(k);
                    return;
                }
                m685g(i);
                vVar.m610b(k);
            }
        }

        /* renamed from: b */
        private static boolean m729b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: b */
        private int[] m718b(C0813j jVar, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int n = m670n();
            int p = m666p();
            int q = m665q() - m668o();
            int h = m682h() - m672m();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - n;
            int min = Math.min(0, i);
            int i2 = top - p;
            int min2 = Math.min(0, i2);
            int i3 = width - q;
            min = Math.max(0, i3);
            int max = Math.max(0, height - h);
            if (m678j() == 1) {
                if (min == 0) {
                    min = Math.max(min, i3);
                }
            } else if (min == 0) {
                min = Math.min(i, min);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max);
            }
            iArr[0] = min;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: d */
        private boolean m698d(C0813j jVar, int i, int i2) {
            View focusedChild = jVar.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int n = m670n();
            int p = m666p();
            int q = m665q() - m668o();
            int h = m682h() - m672m();
            Rect rect = this.f3211b.f3116i;
            m724b(focusedChild, rect);
            return rect.left - i < q && rect.right - i > n && rect.top - i2 < h && rect.bottom - i2 > p;
        }

        /* renamed from: A */
        boolean mo791A() {
            return false;
        }

        /* renamed from: B */
        void m790B() {
            AbstractC0852z zVar = this.f3216g;
            if (zVar != null) {
                zVar.m582d();
            }
        }

        /* renamed from: C */
        public boolean mo789C() {
            return false;
        }

        /* renamed from: a */
        public int mo778a(int i, C0847v vVar, C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo756a(C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo751a(C0847v vVar, C0815a0 a0Var) {
            C0813j jVar = this.f3211b;
            if (jVar == null || jVar.f3122l == null || !mo788a()) {
                return 1;
            }
            return this.f3211b.f3122l.mo106a();
        }

        /* renamed from: a */
        public View mo765a(View view, int i, C0847v vVar, C0815a0 a0Var) {
            return null;
        }

        /* renamed from: a */
        public C0840p mo776a(Context context, AttributeSet attributeSet) {
            return new C0840p(context, attributeSet);
        }

        /* renamed from: a */
        public C0840p mo758a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0840p ? new C0840p((C0840p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0840p((ViewGroup.MarginLayoutParams) layoutParams) : new C0840p(layoutParams);
        }

        /* renamed from: a */
        public void m787a(int i) {
            m781a(i, m715c(i));
        }

        /* renamed from: a */
        public void m786a(int i, int i2) {
            View c = m715c(i);
            if (c != null) {
                m787a(i);
                m712c(c, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3211b.toString());
        }

        /* renamed from: a */
        public void mo783a(int i, int i2, C0815a0 a0Var, AbstractC0838c cVar) {
        }

        /* renamed from: a */
        public void mo780a(int i, AbstractC0838c cVar) {
        }

        /* renamed from: a */
        public void m779a(int i, C0847v vVar) {
            View c = m715c(i);
            m685g(i);
            vVar.m611b(c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m777a(C0191c cVar) {
            C0813j jVar = this.f3211b;
            m748a(jVar.f3104c, jVar.f3115h0, cVar);
        }

        /* renamed from: a */
        public void mo774a(Rect rect, int i, int i2) {
            m714c(m785a(i, rect.width() + m670n() + m668o(), m674l()), m785a(i2, rect.height() + m666p() + m672m(), m676k()));
        }

        /* renamed from: a */
        public void mo773a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void m772a(View view) {
            m771a(view, -1);
        }

        /* renamed from: a */
        public void m771a(View view, int i) {
            m764a(view, i, true);
        }

        /* renamed from: a */
        public void m770a(View view, int i, int i2) {
            C0840p pVar = (C0840p) view.getLayoutParams();
            Rect f = this.f3211b.m940f(view);
            int i3 = i + f.left + f.right;
            int i4 = i2 + f.top + f.bottom;
            int a = m784a(m665q(), m664r(), m670n() + m668o() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, mo788a());
            int a2 = m784a(m682h(), m680i(), m666p() + m672m() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, mo732b());
            if (m768a(view, a, a2, pVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public void m769a(View view, int i, int i2, int i3, int i4) {
            C0840p pVar = (C0840p) view.getLayoutParams();
            Rect rect = pVar.f3235b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        /* renamed from: a */
        public void m766a(View view, int i, C0840p pVar) {
            AbstractC0821d0 k = C0813j.m924k(view);
            if (k.m864p()) {
                this.f3211b.f3112g.m535a(k);
            } else {
                this.f3211b.f3112g.m523g(k);
            }
            this.f3210a.m1127a(view, i, pVar, k.m864p());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m763a(View view, C0191c cVar) {
            AbstractC0821d0 k = C0813j.m924k(view);
            if (k != null && !k.m864p() && !this.f3210a.m1119c(k.f3179a)) {
                C0813j jVar = this.f3211b;
                mo746a(jVar.f3104c, jVar.f3115h0, view, cVar);
            }
        }

        /* renamed from: a */
        public void m762a(View view, Rect rect) {
            C0813j jVar = this.f3211b;
            if (jVar == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(jVar.m940f(view));
            }
        }

        /* renamed from: a */
        public void m761a(View view, C0847v vVar) {
            m667o(view);
            vVar.m611b(view);
        }

        /* renamed from: a */
        public void m760a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0840p) view.getLayoutParams()).f3235b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3211b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3211b.f3120k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo757a(AccessibilityEvent accessibilityEvent) {
            C0813j jVar = this.f3211b;
            m745a(jVar.f3104c, jVar.f3115h0, accessibilityEvent);
        }

        /* renamed from: a */
        public void m755a(AbstractC0824g gVar, AbstractC0824g gVar2) {
        }

        /* renamed from: a */
        public void m753a(C0847v vVar) {
            for (int e = m697e() - 1; e >= 0; e--) {
                m752a(vVar, e, m715c(e));
            }
        }

        /* renamed from: a */
        public void m750a(C0847v vVar, C0815a0 a0Var, int i, int i2) {
            this.f3211b.m958c(i, i2);
        }

        /* renamed from: a */
        public void m748a(C0847v vVar, C0815a0 a0Var, C0191c cVar) {
            if (this.f3211b.canScrollVertically(-1) || this.f3211b.canScrollHorizontally(-1)) {
                cVar.m3544a(8192);
                cVar.m3511i(true);
            }
            if (this.f3211b.canScrollVertically(1) || this.f3211b.canScrollHorizontally(1)) {
                cVar.m3544a(4096);
                cVar.m3511i(true);
            }
            cVar.m3537a(C0191c.C0193b.m3497a(mo721b(vVar, a0Var), mo751a(vVar, a0Var), m700d(vVar, a0Var), m709c(vVar, a0Var)));
        }

        /* renamed from: a */
        public void mo746a(C0847v vVar, C0815a0 a0Var, View view, C0191c cVar) {
            cVar.m3530b(C0191c.C0194c.m3496a(mo732b() ? m673l(view) : 0, 1, mo788a() ? m673l(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public void m745a(C0847v vVar, C0815a0 a0Var, AccessibilityEvent accessibilityEvent) {
            C0813j jVar = this.f3211b;
            if (jVar != null && accessibilityEvent != null) {
                boolean z = true;
                if (!jVar.canScrollVertically(1) && !this.f3211b.canScrollVertically(-1) && !this.f3211b.canScrollHorizontally(-1) && !this.f3211b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                AbstractC0824g gVar = this.f3211b.f3122l;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo106a());
                }
            }
        }

        /* renamed from: a */
        void m744a(C0813j jVar) {
            this.f3218i = true;
            m720b(jVar);
        }

        /* renamed from: a */
        public void mo743a(C0813j jVar, int i, int i2) {
        }

        /* renamed from: a */
        public void mo742a(C0813j jVar, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo741a(C0813j jVar, int i, int i2, Object obj) {
            m707c(jVar, i, i2);
        }

        /* renamed from: a */
        void m736a(C0813j jVar, C0847v vVar) {
            this.f3218i = false;
            mo717b(jVar, vVar);
        }

        /* renamed from: a */
        public void mo733a(String str) {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                jVar.m974a(str);
            }
        }

        /* renamed from: a */
        public boolean mo788a() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m782a(int i, Bundle bundle) {
            C0813j jVar = this.f3211b;
            return m749a(jVar.f3104c, jVar.f3115h0, i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m768a(View view, int i, int i2, C0840p pVar) {
            return view.isLayoutRequested() || !this.f3220k || !m729b(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) || !m729b(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m767a(View view, int i, Bundle bundle) {
            C0813j jVar = this.f3211b;
            return m747a(jVar.f3104c, jVar.f3115h0, view, i, bundle);
        }

        /* renamed from: a */
        public boolean m759a(View view, boolean z, boolean z2) {
            boolean z3 = this.f3214e.m549a(view, 24579) && this.f3215f.m549a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: a */
        public boolean mo754a(C0840p pVar) {
            return pVar != null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m749a(androidx.recyclerview.widget.C0813j.C0847v r2, androidx.recyclerview.widget.C0813j.C0815a0 r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.j r2 = r1.f3211b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.m682h()
                int r5 = r1.m666p()
                int r2 = r2 - r5
                int r5 = r1.m672m()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.j r5 = r1.f3211b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.m665q()
                int r5 = r1.m670n()
                int r4 = r4 - r5
                int r5 = r1.m668o()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.m682h()
                int r4 = r1.m666p()
                int r2 = r2 - r4
                int r4 = r1.m672m()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.j r4 = r1.f3211b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.m665q()
                int r5 = r1.m670n()
                int r4 = r4 - r5
                int r5 = r1.m668o()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.j r3 = r1.f3211b
                r3.m931i(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.AbstractC0835o.m749a(androidx.recyclerview.widget.j$v, androidx.recyclerview.widget.j$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public boolean m747a(C0847v vVar, C0815a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean m740a(C0813j jVar, View view, Rect rect, boolean z) {
            return m739a(jVar, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean m739a(C0813j jVar, View view, Rect rect, boolean z, boolean z2) {
            int[] b = m718b(jVar, view, rect, z);
            int i = b[0];
            int i2 = b[1];
            if ((z2 && !m698d(jVar, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                jVar.scrollBy(i, i2);
            } else {
                jVar.m931i(i, i2);
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean m738a(C0813j jVar, View view, View view2) {
            return m659w() || jVar.m920n();
        }

        /* renamed from: a */
        public boolean m737a(C0813j jVar, C0815a0 a0Var, View view, View view2) {
            return m738a(jVar, view, view2);
        }

        /* renamed from: a */
        public boolean m735a(C0813j jVar, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: a */
        public boolean m734a(Runnable runnable) {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                return jVar.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        public int mo728b(int i, C0847v vVar, C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo723b(C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo721b(C0847v vVar, C0815a0 a0Var) {
            C0813j jVar = this.f3211b;
            if (jVar == null || jVar.f3122l == null || !mo732b()) {
                return 1;
            }
            return this.f3211b.f3122l.mo106a();
        }

        /* renamed from: b */
        public View mo731b(int i) {
            int e = m697e();
            for (int i2 = 0; i2 < e; i2++) {
                View c = m715c(i2);
                AbstractC0821d0 k = C0813j.m924k(c);
                if (k != null && k.m871i() == i && !k.m856x() && (this.f3211b.f3115h0.m902d() || !k.m864p())) {
                    return c;
                }
            }
            return null;
        }

        /* renamed from: b */
        void m730b(int i, int i2) {
            this.f3226q = View.MeasureSpec.getSize(i);
            this.f3224o = View.MeasureSpec.getMode(i);
            if (this.f3224o == 0 && !C0813j.f3071C0) {
                this.f3226q = 0;
            }
            this.f3227r = View.MeasureSpec.getSize(i2);
            this.f3225p = View.MeasureSpec.getMode(i2);
            if (this.f3225p == 0 && !C0813j.f3071C0) {
                this.f3227r = 0;
            }
        }

        /* renamed from: b */
        public void m727b(View view) {
            m726b(view, -1);
        }

        /* renamed from: b */
        public void m726b(View view, int i) {
            m764a(view, i, false);
        }

        /* renamed from: b */
        public void m724b(View view, Rect rect) {
            C0813j.m993a(view, rect);
        }

        /* renamed from: b */
        public void m722b(C0847v vVar) {
            for (int e = m697e() - 1; e >= 0; e--) {
                if (!C0813j.m924k(m715c(e)).m856x()) {
                    m779a(e, vVar);
                }
            }
        }

        /* renamed from: b */
        public void m720b(C0813j jVar) {
        }

        /* renamed from: b */
        public void mo719b(C0813j jVar, int i, int i2) {
        }

        /* renamed from: b */
        public void mo717b(C0813j jVar, C0847v vVar) {
            m708c(jVar);
        }

        /* renamed from: b */
        public boolean mo732b() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m725b(View view, int i, int i2, C0840p pVar) {
            return !this.f3220k || !m729b(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) || !m729b(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        /* renamed from: c */
        public int mo711c(C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public int m709c(C0847v vVar, C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public View m715c(int i) {
            C0783b bVar = this.f3210a;
            if (bVar != null) {
                return bVar.m1120c(i);
            }
            return null;
        }

        /* renamed from: c */
        public View m713c(View view) {
            View c;
            C0813j jVar = this.f3211b;
            if (jVar == null || (c = jVar.m956c(view)) == null || this.f3210a.m1119c(c)) {
                return null;
            }
            return c;
        }

        /* renamed from: c */
        public abstract C0840p mo716c();

        /* renamed from: c */
        public void m714c(int i, int i2) {
            this.f3211b.setMeasuredDimension(i, i2);
        }

        /* renamed from: c */
        public void m712c(View view, int i) {
            m766a(view, i, (C0840p) view.getLayoutParams());
        }

        /* renamed from: c */
        void m710c(C0847v vVar) {
            int e = vVar.m601e();
            for (int i = e - 1; i >= 0; i--) {
                View c = vVar.m608c(i);
                AbstractC0821d0 k = C0813j.m924k(c);
                if (!k.m856x()) {
                    k.m881a(false);
                    if (k.m862r()) {
                        this.f3211b.removeDetachedView(c, false);
                    }
                    AbstractC0829l lVar = this.f3211b.f3090M;
                    if (lVar != null) {
                        lVar.mo810c(k);
                    }
                    k.m881a(true);
                    vVar.m623a(c);
                }
            }
            vVar.m609c();
            if (e > 0) {
                this.f3211b.invalidate();
            }
        }

        @Deprecated
        /* renamed from: c */
        public void m708c(C0813j jVar) {
        }

        /* renamed from: c */
        public void m707c(C0813j jVar, int i, int i2) {
        }

        /* renamed from: d */
        public int m706d() {
            return -1;
        }

        /* renamed from: d */
        public int m703d(View view) {
            return ((C0840p) view.getLayoutParams()).f3235b.bottom;
        }

        /* renamed from: d */
        public int mo701d(C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: d */
        public View m702d(View view, int i) {
            return null;
        }

        /* renamed from: d */
        public void mo705d(int i) {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                jVar.m947e(i);
            }
        }

        /* renamed from: d */
        void m704d(int i, int i2) {
            int e = m697e();
            if (e == 0) {
                this.f3211b.m958c(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < e; i7++) {
                View c = m715c(i7);
                Rect rect = this.f3211b.f3116i;
                m724b(c, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f3211b.f3116i.set(i3, i4, i5, i6);
            mo774a(this.f3211b.f3116i, i, i2);
        }

        /* renamed from: d */
        public void mo699d(C0813j jVar) {
        }

        /* renamed from: d */
        public boolean m700d(C0847v vVar, C0815a0 a0Var) {
            return false;
        }

        /* renamed from: e */
        public int m697e() {
            C0783b bVar = this.f3210a;
            if (bVar != null) {
                return bVar.m1130a();
            }
            return 0;
        }

        /* renamed from: e */
        public int m695e(View view) {
            return view.getBottom() + m703d(view);
        }

        /* renamed from: e */
        public int mo694e(C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: e */
        public void mo696e(int i) {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                jVar.m942f(i);
            }
        }

        /* renamed from: e */
        public void mo693e(C0847v vVar, C0815a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: e */
        void m692e(C0813j jVar) {
            m730b(View.MeasureSpec.makeMeasureSpec(jVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(jVar.getHeight(), 1073741824));
        }

        /* renamed from: f */
        public int m689f(View view) {
            return view.getLeft() - m675k(view);
        }

        /* renamed from: f */
        public int mo688f(C0815a0 a0Var) {
            return 0;
        }

        /* renamed from: f */
        public void mo690f(int i) {
        }

        /* renamed from: f */
        void m687f(C0813j jVar) {
            int i;
            if (jVar == null) {
                this.f3211b = null;
                this.f3210a = null;
                i = 0;
                this.f3226q = 0;
            } else {
                this.f3211b = jVar;
                this.f3210a = jVar.f3110f;
                this.f3226q = jVar.getWidth();
                i = jVar.getHeight();
            }
            this.f3227r = i;
            this.f3224o = 1073741824;
            this.f3225p = 1073741824;
        }

        /* renamed from: f */
        public boolean m691f() {
            C0813j jVar = this.f3211b;
            return jVar != null && jVar.f3114h;
        }

        /* renamed from: g */
        public int m684g(View view) {
            Rect rect = ((C0840p) view.getLayoutParams()).f3235b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: g */
        public View m686g() {
            View focusedChild;
            C0813j jVar = this.f3211b;
            if (jVar == null || (focusedChild = jVar.getFocusedChild()) == null || this.f3210a.m1119c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g */
        public void m685g(int i) {
            if (m715c(i) != null) {
                this.f3210a.m1116e(i);
            }
        }

        /* renamed from: g */
        public void mo683g(C0815a0 a0Var) {
        }

        /* renamed from: h */
        public int m682h() {
            return this.f3227r;
        }

        /* renamed from: h */
        public int m681h(View view) {
            Rect rect = ((C0840p) view.getLayoutParams()).f3235b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: i */
        public int m680i() {
            return this.f3225p;
        }

        /* renamed from: i */
        public int m679i(View view) {
            return view.getRight() + m671m(view);
        }

        /* renamed from: j */
        public int m678j() {
            return C0216r.m3411j(this.f3211b);
        }

        /* renamed from: j */
        public int m677j(View view) {
            return view.getTop() - m669n(view);
        }

        /* renamed from: k */
        public int m676k() {
            return C0216r.m3410k(this.f3211b);
        }

        /* renamed from: k */
        public int m675k(View view) {
            return ((C0840p) view.getLayoutParams()).f3235b.left;
        }

        /* renamed from: l */
        public int m674l() {
            return C0216r.m3409l(this.f3211b);
        }

        /* renamed from: l */
        public int m673l(View view) {
            return ((C0840p) view.getLayoutParams()).m654a();
        }

        /* renamed from: m */
        public int m672m() {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                return jVar.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: m */
        public int m671m(View view) {
            return ((C0840p) view.getLayoutParams()).f3235b.right;
        }

        /* renamed from: n */
        public int m670n() {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                return jVar.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: n */
        public int m669n(View view) {
            return ((C0840p) view.getLayoutParams()).f3235b.top;
        }

        /* renamed from: o */
        public int m668o() {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                return jVar.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: o */
        public void m667o(View view) {
            this.f3210a.m1117d(view);
        }

        /* renamed from: p */
        public int m666p() {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                return jVar.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: q */
        public int m665q() {
            return this.f3226q;
        }

        /* renamed from: r */
        public int m664r() {
            return this.f3224o;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean m663s() {
            int e = m697e();
            for (int i = 0; i < e; i++) {
                ViewGroup.LayoutParams layoutParams = m715c(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: t */
        public boolean m662t() {
            return this.f3218i;
        }

        /* renamed from: u */
        public boolean mo661u() {
            return this.f3219j;
        }

        /* renamed from: v */
        public final boolean m660v() {
            return this.f3221l;
        }

        /* renamed from: w */
        public boolean m659w() {
            AbstractC0852z zVar = this.f3216g;
            return zVar != null && zVar.m583c();
        }

        /* renamed from: x */
        public Parcelable mo658x() {
            return null;
        }

        /* renamed from: y */
        public void m657y() {
            C0813j jVar = this.f3211b;
            if (jVar != null) {
                jVar.requestLayout();
            }
        }

        /* renamed from: z */
        public void m656z() {
            this.f3217h = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$p */
    /* loaded from: classes.dex */
    public static class C0840p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0821d0 f3234a;

        /* renamed from: b */
        final Rect f3235b = new Rect();

        /* renamed from: c */
        boolean f3236c = true;

        /* renamed from: d */
        boolean f3237d = false;

        public C0840p(int i, int i2) {
            super(i, i2);
        }

        public C0840p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0840p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0840p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0840p(C0840p pVar) {
            super((ViewGroup.LayoutParams) pVar);
        }

        /* renamed from: a */
        public int m654a() {
            return this.f3234a.m871i();
        }

        /* renamed from: b */
        public boolean m653b() {
            return this.f3234a.m861s();
        }

        /* renamed from: c */
        public boolean m652c() {
            return this.f3234a.m864p();
        }

        /* renamed from: d */
        public boolean m651d() {
            return this.f3234a.m866n();
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$q */
    /* loaded from: classes.dex */
    public interface AbstractC0841q {
        /* renamed from: a */
        void m650a(View view);

        /* renamed from: b */
        void m649b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.j$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0842r {
        /* renamed from: a */
        public abstract boolean m648a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.j$s */
    /* loaded from: classes.dex */
    public interface AbstractC0843s {
        /* renamed from: a */
        void mo646a(boolean z);

        /* renamed from: a */
        boolean mo647a(C0813j jVar, MotionEvent motionEvent);

        /* renamed from: b */
        void mo645b(C0813j jVar, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.j$t */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0844t {
        /* renamed from: a */
        public void m644a(C0813j jVar, int i) {
        }

        /* renamed from: a */
        public void mo643a(C0813j jVar, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$u */
    /* loaded from: classes.dex */
    public static class C0845u {

        /* renamed from: a */
        SparseArray<C0846a> f3238a = new SparseArray<>();

        /* renamed from: b */
        private int f3239b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.j$u$a */
        /* loaded from: classes.dex */
        public static class C0846a {

            /* renamed from: a */
            final ArrayList<AbstractC0821d0> f3240a = new ArrayList<>();

            /* renamed from: b */
            int f3241b = 5;

            /* renamed from: c */
            long f3242c = 0;

            /* renamed from: d */
            long f3243d = 0;

            C0846a() {
            }
        }

        /* renamed from: b */
        private C0846a m634b(int i) {
            C0846a aVar = this.f3238a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0846a aVar2 = new C0846a();
            this.f3238a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        long m638a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public AbstractC0821d0 m641a(int i) {
            C0846a aVar = this.f3238a.get(i);
            if (aVar == null || aVar.f3240a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0821d0> arrayList = aVar.f3240a;
            return arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: a */
        void m642a() {
            this.f3239b++;
        }

        /* renamed from: a */
        void m640a(int i, long j) {
            C0846a b = m634b(i);
            b.f3243d = m638a(b.f3243d, j);
        }

        /* renamed from: a */
        public void m637a(AbstractC0821d0 d0Var) {
            int h = d0Var.m872h();
            ArrayList<AbstractC0821d0> arrayList = m634b(h).f3240a;
            if (this.f3238a.get(h).f3241b > arrayList.size()) {
                d0Var.m859u();
                arrayList.add(d0Var);
            }
        }

        /* renamed from: a */
        void m636a(AbstractC0824g gVar, AbstractC0824g gVar2, boolean z) {
            if (gVar != null) {
                m631c();
            }
            if (!z && this.f3239b == 0) {
                m635b();
            }
            if (gVar2 != null) {
                m642a();
            }
        }

        /* renamed from: a */
        boolean m639a(int i, long j, long j2) {
            long j3 = m634b(i).f3243d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: b */
        public void m635b() {
            for (int i = 0; i < this.f3238a.size(); i++) {
                this.f3238a.valueAt(i).f3240a.clear();
            }
        }

        /* renamed from: b */
        void m633b(int i, long j) {
            C0846a b = m634b(i);
            b.f3242c = m638a(b.f3242c, j);
        }

        /* renamed from: b */
        boolean m632b(int i, long j, long j2) {
            long j3 = m634b(i).f3242c;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: c */
        void m631c() {
            this.f3239b--;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$v */
    /* loaded from: classes.dex */
    public final class C0847v {

        /* renamed from: a */
        final ArrayList<AbstractC0821d0> f3244a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<AbstractC0821d0> f3245b = null;

        /* renamed from: c */
        final ArrayList<AbstractC0821d0> f3246c = new ArrayList<>();

        /* renamed from: d */
        private final List<AbstractC0821d0> f3247d = Collections.unmodifiableList(this.f3244a);

        /* renamed from: e */
        private int f3248e = 2;

        /* renamed from: f */
        int f3249f = 2;

        /* renamed from: g */
        C0845u f3250g;

        /* renamed from: h */
        private AbstractC0817b0 f3251h;

        public C0847v() {
        }

        /* renamed from: a */
        private void m622a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m622a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: a */
        private boolean m619a(AbstractC0821d0 d0Var, int i, int i2, long j) {
            d0Var.f3196r = C0813j.this;
            int h = d0Var.m872h();
            long nanoTime = C0813j.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3250g.m639a(h, nanoTime, j)) {
                return false;
            }
            C0813j.this.f3122l.m831a((AbstractC0824g) d0Var, i);
            this.f3250g.m640a(d0Var.m872h(), C0813j.this.getNanoTime() - nanoTime);
            m599e(d0Var);
            if (!C0813j.this.f3115h0.m902d()) {
                return true;
            }
            d0Var.f3185g = i2;
            return true;
        }

        /* renamed from: e */
        private void m599e(AbstractC0821d0 d0Var) {
            if (C0813j.this.m921m()) {
                View view = d0Var.f3179a;
                if (C0216r.m3413h(view) == 0) {
                    C0216r.m3418e(view, 1);
                }
                if (!C0216r.m3402s(view)) {
                    d0Var.m888a(16384);
                    C0216r.m3440a(view, C0813j.this.f3129o0.m581b());
                }
            }
        }

        /* renamed from: f */
        private void m596f(AbstractC0821d0 d0Var) {
            View view = d0Var.f3179a;
            if (view instanceof ViewGroup) {
                m622a((ViewGroup) view, false);
            }
        }

        /* renamed from: a */
        public int m629a(int i) {
            if (i >= 0 && i < C0813j.this.f3115h0.m907a()) {
                return !C0813j.this.f3115h0.m902d() ? i : C0813j.this.f3108e.m1145b(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + C0813j.this.f3115h0.m907a() + C0813j.this.m932i());
        }

        /* renamed from: a */
        AbstractC0821d0 m626a(int i, boolean z) {
            View b;
            int size = this.f3244a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0821d0 d0Var = this.f3244a.get(i2);
                if (!d0Var.m854z() && d0Var.m871i() == i && !d0Var.m866n() && (C0813j.this.f3115h0.f3159h || !d0Var.m864p())) {
                    d0Var.m888a(32);
                    return d0Var;
                }
            }
            if (z || (b = C0813j.this.f3110f.m1123b(i)) == null) {
                int size2 = this.f3246c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC0821d0 d0Var2 = this.f3246c.get(i3);
                    if (!d0Var2.m866n() && d0Var2.m871i() == i) {
                        if (!z) {
                            this.f3246c.remove(i3);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            AbstractC0821d0 k = C0813j.m924k(b);
            C0813j.this.f3110f.m1113f(b);
            int b2 = C0813j.this.f3110f.m1122b(b);
            if (b2 != -1) {
                C0813j.this.f3110f.m1129a(b2);
                m606c(b);
                k.m888a(8224);
                return k;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + k + C0813j.this.m932i());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0225 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0210  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.C0813j.AbstractC0821d0 m625a(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 614
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.C0847v.m625a(int, boolean, long):androidx.recyclerview.widget.j$d0");
        }

        /* renamed from: a */
        AbstractC0821d0 m624a(long j, int i, boolean z) {
            for (int size = this.f3244a.size() - 1; size >= 0; size--) {
                AbstractC0821d0 d0Var = this.f3244a.get(size);
                if (d0Var.m873g() == j && !d0Var.m854z()) {
                    if (i == d0Var.m872h()) {
                        d0Var.m888a(32);
                        if (d0Var.m864p() && !C0813j.this.f3115h0.m902d()) {
                            d0Var.m887a(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f3244a.remove(size);
                        C0813j.this.removeDetachedView(d0Var.f3179a, false);
                        m623a(d0Var.f3179a);
                    }
                }
            }
            int size2 = this.f3246c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0821d0 d0Var2 = this.f3246c.get(size2);
                if (d0Var2.m873g() == j) {
                    if (i == d0Var2.m872h()) {
                        if (!z) {
                            this.f3246c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        m600e(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m630a() {
            this.f3244a.clear();
            m593i();
        }

        /* renamed from: a */
        void m628a(int i, int i2) {
            int size = this.f3246c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0821d0 d0Var = this.f3246c.get(i3);
                if (d0Var != null && d0Var.f3181c >= i) {
                    d0Var.m885a(i2, true);
                }
            }
        }

        /* renamed from: a */
        void m627a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3246c.size() - 1; size >= 0; size--) {
                AbstractC0821d0 d0Var = this.f3246c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f3181c;
                    if (i4 >= i3) {
                        d0Var.m885a(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.m888a(8);
                        m600e(size);
                    }
                }
            }
        }

        /* renamed from: a */
        void m623a(View view) {
            AbstractC0821d0 k = C0813j.m924k(view);
            k.f3192n = null;
            k.f3193o = false;
            k.m877c();
            m610b(k);
        }

        /* renamed from: a */
        void m621a(AbstractC0817b0 b0Var) {
            this.f3251h = b0Var;
        }

        /* renamed from: a */
        void m620a(AbstractC0821d0 d0Var) {
            AbstractC0848w wVar = C0813j.this.f3126n;
            if (wVar != null) {
                wVar.m591a(d0Var);
            }
            AbstractC0824g gVar = C0813j.this.f3122l;
            if (gVar != null) {
                gVar.mo94d(d0Var);
            }
            C0813j jVar = C0813j.this;
            if (jVar.f3115h0 != null) {
                jVar.f3112g.m522h(d0Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m618a(AbstractC0821d0 d0Var, boolean z) {
            C0813j.m944e(d0Var);
            if (d0Var.m879b(16384)) {
                d0Var.m887a(0, 16384);
                C0216r.m3440a(d0Var.f3179a, (C0185a) null);
            }
            if (z) {
                m620a(d0Var);
            }
            d0Var.f3196r = null;
            m604d().m637a(d0Var);
        }

        /* renamed from: a */
        void m617a(AbstractC0824g gVar, AbstractC0824g gVar2, boolean z) {
            m630a();
            m604d().m636a(gVar, gVar2, z);
        }

        /* renamed from: a */
        void m616a(C0845u uVar) {
            C0845u uVar2 = this.f3250g;
            if (uVar2 != null) {
                uVar2.m631c();
            }
            this.f3250g = uVar;
            if (this.f3250g != null && C0813j.this.getAdapter() != null) {
                this.f3250g.m642a();
            }
        }

        /* renamed from: b */
        View m612b(int i, boolean z) {
            return m625a(i, z, Long.MAX_VALUE).f3179a;
        }

        /* renamed from: b */
        AbstractC0821d0 m614b(int i) {
            int size;
            int b;
            ArrayList<AbstractC0821d0> arrayList = this.f3245b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0821d0 d0Var = this.f3245b.get(i2);
                    if (!d0Var.m854z() && d0Var.m871i() == i) {
                        d0Var.m888a(32);
                        return d0Var;
                    }
                }
                if (C0813j.this.f3122l.m827b() && (b = C0813j.this.f3108e.m1145b(i)) > 0 && b < C0813j.this.f3122l.mo106a()) {
                    long a = C0813j.this.f3122l.mo105a(b);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC0821d0 d0Var2 = this.f3245b.get(i3);
                        if (!d0Var2.m854z() && d0Var2.m873g() == a) {
                            d0Var2.m888a(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        void m615b() {
            int size = this.f3246c.size();
            for (int i = 0; i < size; i++) {
                this.f3246c.get(i).m889a();
            }
            int size2 = this.f3244a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3244a.get(i2).m889a();
            }
            ArrayList<AbstractC0821d0> arrayList = this.f3245b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3245b.get(i3).m889a();
                }
            }
        }

        /* renamed from: b */
        void m613b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f3246c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC0821d0 d0Var = this.f3246c.get(i7);
                if (d0Var != null && (i6 = d0Var.f3181c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        d0Var.m885a(i2 - i, false);
                    } else {
                        d0Var.m885a(i3, false);
                    }
                }
            }
        }

        /* renamed from: b */
        public void m611b(View view) {
            AbstractC0821d0 k = C0813j.m924k(view);
            if (k.m862r()) {
                C0813j.this.removeDetachedView(view, false);
            }
            if (k.m863q()) {
                k.m855y();
            } else if (k.m854z()) {
                k.m877c();
            }
            m610b(k);
        }

        /* renamed from: b */
        void m610b(AbstractC0821d0 d0Var) {
            boolean z;
            boolean z2 = false;
            if (d0Var.m863q() || d0Var.f3179a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.m863q());
                sb.append(" isAttached:");
                if (d0Var.f3179a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(C0813j.this.m932i());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.m862r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + C0813j.this.m932i());
            } else if (!d0Var.m856x()) {
                boolean e = d0Var.m875e();
                AbstractC0824g gVar = C0813j.this.f3122l;
                if ((gVar != null && e && gVar.m832a((AbstractC0824g) d0Var)) || d0Var.m865o()) {
                    if (this.f3249f <= 0 || d0Var.m879b(526)) {
                        z = false;
                    } else {
                        int size = this.f3246c.size();
                        if (size >= this.f3249f && size > 0) {
                            m600e(0);
                            size--;
                        }
                        if (C0813j.f3072D0 && size > 0 && !C0813j.this.f3113g0.m1060a(d0Var.f3181c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!C0813j.this.f3113g0.m1060a(this.f3246c.get(i).f3181c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3246c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        m618a(d0Var, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                C0813j.this.f3112g.m522h(d0Var);
                if (!z && !z2 && e) {
                    d0Var.f3196r = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + C0813j.this.m932i());
            }
        }

        /* renamed from: c */
        View m608c(int i) {
            return this.f3244a.get(i).f3179a;
        }

        /* renamed from: c */
        void m609c() {
            this.f3244a.clear();
            ArrayList<AbstractC0821d0> arrayList = this.f3245b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: c */
        void m607c(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3246c.size() - 1; size >= 0; size--) {
                AbstractC0821d0 d0Var = this.f3246c.get(size);
                if (d0Var != null && (i3 = d0Var.f3181c) >= i && i3 < i4) {
                    d0Var.m888a(2);
                    m600e(size);
                }
            }
        }

        /* renamed from: c */
        void m606c(View view) {
            ArrayList<AbstractC0821d0> arrayList;
            AbstractC0821d0 k = C0813j.m924k(view);
            if (!k.m879b(12) && k.m861s() && !C0813j.this.m988a(k)) {
                if (this.f3245b == null) {
                    this.f3245b = new ArrayList<>();
                }
                k.m884a(this, true);
                arrayList = this.f3245b;
            } else if (!k.m866n() || k.m864p() || C0813j.this.f3122l.m827b()) {
                k.m884a(this, false);
                arrayList = this.f3244a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + C0813j.this.m932i());
            }
            arrayList.add(k);
        }

        /* renamed from: c */
        void m605c(AbstractC0821d0 d0Var) {
            (d0Var.f3193o ? this.f3245b : this.f3244a).remove(d0Var);
            d0Var.f3192n = null;
            d0Var.f3193o = false;
            d0Var.m877c();
        }

        /* renamed from: d */
        public View m603d(int i) {
            return m612b(i, false);
        }

        /* renamed from: d */
        C0845u m604d() {
            if (this.f3250g == null) {
                this.f3250g = new C0845u();
            }
            return this.f3250g;
        }

        /* renamed from: d */
        boolean m602d(AbstractC0821d0 d0Var) {
            if (d0Var.m864p()) {
                return C0813j.this.f3115h0.m902d();
            }
            int i = d0Var.f3181c;
            if (i < 0 || i >= C0813j.this.f3122l.mo106a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + C0813j.this.m932i());
            } else if (C0813j.this.f3115h0.m902d() || C0813j.this.f3122l.mo98b(d0Var.f3181c) == d0Var.m872h()) {
                return !C0813j.this.f3122l.m827b() || d0Var.m873g() == C0813j.this.f3122l.mo105a(d0Var.f3181c);
            } else {
                return false;
            }
        }

        /* renamed from: e */
        int m601e() {
            return this.f3244a.size();
        }

        /* renamed from: e */
        void m600e(int i) {
            m618a(this.f3246c.get(i), true);
            this.f3246c.remove(i);
        }

        /* renamed from: f */
        public List<AbstractC0821d0> m598f() {
            return this.f3247d;
        }

        /* renamed from: f */
        public void m597f(int i) {
            this.f3248e = i;
            m592j();
        }

        /* renamed from: g */
        void m595g() {
            int size = this.f3246c.size();
            for (int i = 0; i < size; i++) {
                C0840p pVar = (C0840p) this.f3246c.get(i).f3179a.getLayoutParams();
                if (pVar != null) {
                    pVar.f3236c = true;
                }
            }
        }

        /* renamed from: h */
        void m594h() {
            int size = this.f3246c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0821d0 d0Var = this.f3246c.get(i);
                if (d0Var != null) {
                    d0Var.m888a(6);
                    d0Var.m882a((Object) null);
                }
            }
            AbstractC0824g gVar = C0813j.this.f3122l;
            if (gVar == null || !gVar.m827b()) {
                m593i();
            }
        }

        /* renamed from: i */
        void m593i() {
            for (int size = this.f3246c.size() - 1; size >= 0; size--) {
                m600e(size);
            }
            this.f3246c.clear();
            if (C0813j.f3072D0) {
                C0813j.this.f3113g0.m1061a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public void m592j() {
            AbstractC0835o oVar = C0813j.this.f3124m;
            this.f3249f = this.f3248e + (oVar != null ? oVar.f3222m : 0);
            for (int size = this.f3246c.size() - 1; size >= 0 && this.f3246c.size() > this.f3249f; size--) {
                m600e(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$w */
    /* loaded from: classes.dex */
    public interface AbstractC0848w {
        /* renamed from: a */
        void m591a(AbstractC0821d0 d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.j$x */
    /* loaded from: classes.dex */
    public class C0849x extends AbstractC0826i {
        C0849x() {
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0826i
        /* renamed from: a */
        public void mo590a() {
            C0813j.this.m974a((String) null);
            C0813j jVar = C0813j.this;
            jVar.f3115h0.f3158g = true;
            jVar.m961b(true);
            if (!C0813j.this.f3108e.m1142c()) {
                C0813j.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$y */
    /* loaded from: classes.dex */
    public static class C0850y extends AbstractC0237a {
        public static final Parcelable.Creator<C0850y> CREATOR = new C0851a();

        /* renamed from: d */
        Parcelable f3254d;

        /* renamed from: androidx.recyclerview.widget.j$y$a */
        /* loaded from: classes.dex */
        static class C0851a implements Parcelable.ClassLoaderCreator<C0850y> {
            C0851a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0850y createFromParcel(Parcel parcel) {
                return new C0850y(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0850y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0850y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public C0850y[] newArray(int i) {
                return new C0850y[i];
            }
        }

        C0850y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3254d = parcel.readParcelable(classLoader == null ? AbstractC0835o.class.getClassLoader() : classLoader);
        }

        C0850y(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        void m589a(C0850y yVar) {
            this.f3254d = yVar.f3254d;
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3254d, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$z */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0852z {

        /* renamed from: androidx.recyclerview.widget.j$z$a */
        /* loaded from: classes.dex */
        public interface AbstractC0853a {
        }

        /* renamed from: a */
        public abstract int m588a();

        /* renamed from: a */
        public abstract void m587a(int i);

        /* renamed from: a */
        abstract void m586a(int i, int i2);

        /* renamed from: a */
        protected abstract void m585a(View view);

        /* renamed from: b */
        public abstract boolean m584b();

        /* renamed from: c */
        public abstract boolean m583c();

        /* renamed from: d */
        protected final void m582d() {
            throw null;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f3070B0 = i == 18 || i == 19 || i == 20;
        f3071C0 = Build.VERSION.SDK_INT >= 23;
        int i2 = Build.VERSION.SDK_INT;
        f3072D0 = Build.VERSION.SDK_INT >= 21;
        f3073E0 = Build.VERSION.SDK_INT <= 15;
        f3074F0 = Build.VERSION.SDK_INT <= 15;
        Class<?> cls = Integer.TYPE;
        f3075G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3076H0 = new animationInterpolatorC0818c();
    }

    public C0813j(Context context) {
        this(context, null);
    }

    public C0813j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0813j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3102b = new C0849x();
        this.f3104c = new C0847v();
        this.f3112g = new C0861o();
        new RunnableC0814a();
        this.f3116i = new Rect();
        this.f3118j = new Rect();
        this.f3120k = new RectF();
        this.f3128o = new ArrayList<>();
        this.f3130p = new ArrayList<>();
        this.f3142v = 0;
        this.f3081D = false;
        this.f3082E = false;
        this.f3083F = 0;
        this.f3084G = 0;
        this.f3085H = new C0828k();
        this.f3090M = new C0786c();
        this.f3091N = 0;
        this.f3092O = -1;
        this.f3103b0 = Float.MIN_VALUE;
        this.f3105c0 = Float.MIN_VALUE;
        boolean z = true;
        this.f3107d0 = true;
        this.f3109e0 = new RunnableC0819c0();
        this.f3113g0 = f3072D0 ? new RunnableC0802e.C0804b() : null;
        this.f3115h0 = new C0815a0();
        this.f3121k0 = false;
        this.f3123l0 = false;
        this.f3125m0 = new C0833m();
        this.f3127n0 = false;
        this.f3133q0 = new int[2];
        this.f3137s0 = new int[2];
        this.f3139t0 = new int[2];
        this.f3141u0 = new int[2];
        this.f3143v0 = new int[2];
        this.f3145w0 = new ArrayList();
        this.f3147x0 = new RunnableC0816b();
        this.f3149y0 = new C0820d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3069A0, i, 0);
            this.f3114h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f3114h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3098U = viewConfiguration.getScaledTouchSlop();
        this.f3103b0 = C0220s.m3384b(viewConfiguration, context);
        this.f3105c0 = C0220s.m3383c(viewConfiguration, context);
        this.f3100W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3101a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3090M.m814a(this.f3125m0);
        m926k();
        m1021G();
        m1022F();
        if (C0216r.m3413h(this) == 0) {
            C0216r.m3418e(this, 1);
        }
        this.f3079B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0854k(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0318b.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C0318b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C0318b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f3138t = obtainStyledAttributes2.getBoolean(C0318b.RecyclerView_fastScrollEnabled, false);
            if (this.f3138t) {
                m996a((StateListDrawable) obtainStyledAttributes2.getDrawable(C0318b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C0318b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C0318b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C0318b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            m997a(context, string, attributeSet, i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3077z0, i, 0);
                z = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    private void m1027A() {
        boolean z = true;
        this.f3115h0.m906a(1);
        m989a(this.f3115h0);
        this.f3115h0.f3161j = false;
        m911w();
        this.f3112g.m538a();
        m917q();
        m1019I();
        m1014N();
        C0815a0 a0Var = this.f3115h0;
        if (!a0Var.f3162k || !this.f3123l0) {
            z = false;
        }
        a0Var.f3160i = z;
        this.f3123l0 = false;
        this.f3121k0 = false;
        C0815a0 a0Var2 = this.f3115h0;
        a0Var2.f3159h = a0Var2.f3163l;
        a0Var2.f3157f = this.f3122l.mo106a();
        m972a(this.f3133q0);
        if (this.f3115h0.f3162k) {
            int a = this.f3110f.m1130a();
            for (int i = 0; i < a; i++) {
                AbstractC0821d0 k = m924k(this.f3110f.m1120c(i));
                if (!k.m856x() && (!k.m866n() || this.f3122l.m827b())) {
                    this.f3112g.m527c(k, this.f3090M.m816a(this.f3115h0, k, AbstractC0829l.m806e(k), k.m869k()));
                    if (this.f3115h0.f3160i && k.m861s() && !k.m864p() && !k.m856x() && !k.m866n()) {
                        this.f3112g.m536a(m955c(k), k);
                    }
                }
            }
        }
        if (this.f3115h0.f3163l) {
            m912v();
            C0815a0 a0Var3 = this.f3115h0;
            boolean z2 = a0Var3.f3158g;
            a0Var3.f3158g = false;
            this.f3124m.mo693e(this.f3104c, a0Var3);
            this.f3115h0.f3158g = z2;
            for (int i2 = 0; i2 < this.f3110f.m1130a(); i2++) {
                AbstractC0821d0 k2 = m924k(this.f3110f.m1120c(i2));
                if (!k2.m856x() && !this.f3112g.m528c(k2)) {
                    int e = AbstractC0829l.m806e(k2);
                    boolean b = k2.m879b(8192);
                    if (!b) {
                        e |= 4096;
                    }
                    AbstractC0829l.C0832c a2 = this.f3090M.m816a(this.f3115h0, k2, e, k2.m869k());
                    if (b) {
                        m985a(k2, a2);
                    } else {
                        this.f3112g.m533a(k2, a2);
                    }
                }
            }
        }
        m1012a();
        m916r();
        m954c(false);
        this.f3115h0.f3156e = 2;
    }

    /* renamed from: B */
    private void m1026B() {
        m911w();
        m917q();
        this.f3115h0.m906a(6);
        this.f3108e.m1146b();
        this.f3115h0.f3157f = this.f3122l.mo106a();
        C0815a0 a0Var = this.f3115h0;
        a0Var.f3155d = 0;
        a0Var.f3159h = false;
        this.f3124m.mo693e(this.f3104c, a0Var);
        C0815a0 a0Var2 = this.f3115h0;
        a0Var2.f3158g = false;
        this.f3106d = null;
        a0Var2.f3162k = a0Var2.f3162k && this.f3090M != null;
        this.f3115h0.f3156e = 4;
        m916r();
        m954c(false);
    }

    /* renamed from: C */
    private void m1025C() {
        this.f3115h0.m906a(4);
        m911w();
        m917q();
        C0815a0 a0Var = this.f3115h0;
        a0Var.f3156e = 1;
        if (a0Var.f3162k) {
            for (int a = this.f3110f.m1130a() - 1; a >= 0; a--) {
                AbstractC0821d0 k = m924k(this.f3110f.m1120c(a));
                if (!k.m856x()) {
                    long c = m955c(k);
                    AbstractC0829l.C0832c a2 = this.f3090M.m817a(this.f3115h0, k);
                    AbstractC0821d0 a3 = this.f3112g.m537a(c);
                    if (a3 != null && !a3.m856x()) {
                        boolean b = this.f3112g.m530b(a3);
                        boolean b2 = this.f3112g.m530b(k);
                        if (!b || a3 != k) {
                            AbstractC0829l.C0832c f = this.f3112g.m524f(a3);
                            this.f3112g.m529b(k, a2);
                            AbstractC0829l.C0832c e = this.f3112g.m525e(k);
                            if (f == null) {
                                m999a(c, k, a3);
                            } else {
                                m986a(a3, k, f, e, b, b2);
                            }
                        }
                    }
                    this.f3112g.m529b(k, a2);
                }
            }
            this.f3112g.m532a(this.f3149y0);
        }
        this.f3124m.m710c(this.f3104c);
        C0815a0 a0Var2 = this.f3115h0;
        a0Var2.f3154c = a0Var2.f3157f;
        this.f3081D = false;
        this.f3082E = false;
        a0Var2.f3162k = false;
        a0Var2.f3163l = false;
        this.f3124m.f3217h = false;
        ArrayList<AbstractC0821d0> arrayList = this.f3104c.f3245b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0835o oVar = this.f3124m;
        if (oVar.f3223n) {
            oVar.f3222m = 0;
            oVar.f3223n = false;
            this.f3104c.m592j();
        }
        this.f3124m.mo683g(this.f3115h0);
        m916r();
        m954c(false);
        this.f3112g.m538a();
        int[] iArr = this.f3133q0;
        if (m925k(iArr[0], iArr[1])) {
            m951d(0, 0);
        }
        m1018J();
        m1016L();
    }

    /* renamed from: D */
    private View m1024D() {
        AbstractC0821d0 c;
        int i = this.f3115h0.f3164m;
        if (i == -1) {
            i = 0;
        }
        int a = this.f3115h0.m907a();
        for (int i2 = i; i2 < a; i2++) {
            AbstractC0821d0 c2 = m959c(i2);
            if (c2 == null) {
                break;
            } else if (c2.f3179a.hasFocusable()) {
                return c2.f3179a;
            }
        }
        int min = Math.min(a, i);
        while (true) {
            min--;
            if (min < 0 || (c = m959c(min)) == null) {
                return null;
            }
            if (c.f3179a.hasFocusable()) {
                return c.f3179a;
            }
        }
    }

    /* renamed from: E */
    private boolean m1023E() {
        int a = this.f3110f.m1130a();
        for (int i = 0; i < a; i++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1120c(i));
            if (!(k == null || k.m856x() || !k.m861s())) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: F */
    private void m1022F() {
        if (C0216r.m3412i(this) == 0) {
            C0216r.m3416f(this, 8);
        }
    }

    /* renamed from: G */
    private void m1021G() {
        this.f3110f = new C0783b(new C0822e());
    }

    /* renamed from: H */
    private boolean m1020H() {
        return this.f3090M != null && this.f3124m.mo789C();
    }

    /* renamed from: I */
    private void m1019I() {
        if (this.f3081D) {
            this.f3108e.m1134f();
            if (this.f3082E) {
                this.f3124m.mo699d(this);
            }
        }
        if (m1020H()) {
            this.f3108e.m1136e();
        } else {
            this.f3108e.m1146b();
        }
        boolean z = false;
        boolean z2 = this.f3121k0 || this.f3123l0;
        this.f3115h0.f3162k = this.f3140u && this.f3090M != null && (this.f3081D || z2 || this.f3124m.f3217h) && (!this.f3081D || this.f3122l.m827b());
        C0815a0 a0Var = this.f3115h0;
        if (a0Var.f3162k && z2 && !this.f3081D && m1020H()) {
            z = true;
        }
        a0Var.f3163l = z;
    }

    /* renamed from: J */
    private void m1018J() {
        View view;
        if (this.f3107d0 && this.f3122l != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f3074F0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f3110f.m1119c(focusedChild)) {
                            return;
                        }
                    } else if (this.f3110f.m1130a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view2 = null;
                AbstractC0821d0 a = (this.f3115h0.f3165n == -1 || !this.f3122l.m827b()) ? null : m1000a(this.f3115h0.f3165n);
                if (a != null && !this.f3110f.m1119c(a.f3179a) && a.f3179a.hasFocusable()) {
                    view2 = a.f3179a;
                } else if (this.f3110f.m1130a() > 0) {
                    view2 = m1024D();
                }
                if (view2 != null) {
                    int i = this.f3115h0.f3166o;
                    if (i == -1 || (view = view2.findViewById(i)) == null || !view.isFocusable()) {
                        view = view2;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: K */
    private void m1017K() {
        boolean z;
        EdgeEffect edgeEffect = this.f3086I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3086I.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3087J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3087J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3088K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3088K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3089L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3089L.isFinished();
        }
        if (z) {
            C0216r.m3450A(this);
        }
    }

    /* renamed from: L */
    private void m1016L() {
        C0815a0 a0Var = this.f3115h0;
        a0Var.f3165n = -1L;
        a0Var.f3164m = -1;
        a0Var.f3166o = -1;
    }

    /* renamed from: M */
    private void m1015M() {
        VelocityTracker velocityTracker = this.f3093P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo1010a(0);
        m1017K();
    }

    /* renamed from: N */
    private void m1014N() {
        AbstractC0821d0 d0Var = null;
        View focusedChild = (!this.f3107d0 || !hasFocus() || this.f3122l == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = m950d(focusedChild);
        }
        if (d0Var == null) {
            m1016L();
            return;
        }
        this.f3115h0.f3165n = this.f3122l.m827b() ? d0Var.m873g() : -1L;
        this.f3115h0.f3164m = this.f3081D ? -1 : d0Var.m864p() ? d0Var.f3182d : d0Var.m874f();
        this.f3115h0.f3166o = m922l(d0Var.f3179a);
    }

    /* renamed from: O */
    private void m1013O() {
        this.f3109e0.m893b();
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            oVar.m790B();
        }
    }

    /* renamed from: a */
    private String m998a(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains("")) {
            return str;
        } else {
            return C0813j.class.getPackage().getName() + '.' + str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1011a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.m943f()
            android.widget.EdgeEffect r3 = r6.f3086I
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.C0715d.m1509a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.m939g()
            android.widget.EdgeEffect r3 = r6.f3088K
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.m935h()
            android.widget.EdgeEffect r9 = r6.f3087J
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0715d.m1509a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.m948e()
            android.widget.EdgeEffect r9 = r6.f3089L
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0715d.m1509a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            p000a.p018g.p029l.C0216r.m3450A(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.m1011a(float, float, float, float):void");
    }

    /* renamed from: a */
    private void m999a(long j, AbstractC0821d0 d0Var, AbstractC0821d0 d0Var2) {
        int a = this.f3110f.m1130a();
        for (int i = 0; i < a; i++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1120c(i));
            if (k != d0Var && m955c(k) == j) {
                AbstractC0824g gVar = this.f3122l;
                if (gVar == null || !gVar.m827b()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + k + " \n View Holder 2:" + d0Var + m932i());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + k + " \n View Holder 2:" + d0Var + m932i());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + m932i());
    }

    /* renamed from: a */
    private void m997a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a = m998a(context, trim);
                try {
                    Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(a).asSubclass(AbstractC0835o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3075G0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + a, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0835o) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + a, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + a, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + a, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e7);
                }
            }
        }
    }

    /* renamed from: a */
    static void m993a(View view, Rect rect) {
        C0840p pVar = (C0840p) view.getLayoutParams();
        Rect rect2 = pVar.f3235b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    /* renamed from: a */
    private void m992a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3116i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0840p) {
            C0840p pVar = (C0840p) layoutParams;
            if (!pVar.f3236c) {
                Rect rect = pVar.f3235b;
                Rect rect2 = this.f3116i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3116i);
            offsetRectIntoDescendantCoords(view, this.f3116i);
        }
        this.f3124m.m739a(this, view, this.f3116i, !this.f3140u, view2 == null);
    }

    /* renamed from: a */
    private void m986a(AbstractC0821d0 d0Var, AbstractC0821d0 d0Var2, AbstractC0829l.C0832c cVar, AbstractC0829l.C0832c cVar2, boolean z, boolean z2) {
        d0Var.m881a(false);
        if (z) {
            m949d(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                m949d(d0Var2);
            }
            d0Var.f3186h = d0Var2;
            m949d(d0Var);
            this.f3104c.m605c(d0Var);
            d0Var2.m881a(false);
            d0Var2.f3187i = d0Var;
        }
        if (this.f3090M.mo572a(d0Var, d0Var2, cVar, cVar2)) {
            m915s();
        }
    }

    /* renamed from: a */
    private void m983a(AbstractC0824g gVar, boolean z, boolean z2) {
        AbstractC0824g gVar2 = this.f3122l;
        if (gVar2 != null) {
            gVar2.m825b(this.f3102b);
            this.f3122l.m824b(this);
        }
        if (!z || z2) {
            m914t();
        }
        this.f3108e.m1134f();
        AbstractC0824g gVar3 = this.f3122l;
        this.f3122l = gVar;
        if (gVar != null) {
            gVar.m829a(this.f3102b);
            gVar.m828a(this);
        }
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            oVar.m755a(gVar3, this.f3122l);
        }
        this.f3104c.m617a(gVar3, this.f3122l, z);
        this.f3115h0.f3158g = true;
    }

    /* renamed from: a */
    private void m972a(int[] iArr) {
        int a = this.f3110f.m1130a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < a; i3++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1120c(i3));
            if (!k.m856x()) {
                int i4 = k.m871i();
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: a */
    private boolean m995a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        AbstractC0843s sVar = this.f3132q;
        if (sVar != null) {
            if (action == 0) {
                this.f3132q = null;
            } else {
                sVar.mo645b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f3132q = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f3130p.size();
            for (int i = 0; i < size; i++) {
                AbstractC0843s sVar2 = this.f3130p.get(i);
                if (sVar2.mo647a(this, motionEvent)) {
                    this.f3132q = sVar2;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m991a(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || m956c(view2) == null) {
            return false;
        }
        if (view == null || m956c(view) == null) {
            return true;
        }
        this.f3116i.set(0, 0, view.getWidth(), view.getHeight());
        this.f3118j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3116i);
        offsetDescendantRectToMyCoords(view2, this.f3118j);
        char c = 65535;
        int i3 = this.f3124m.m678j() == 1 ? -1 : 1;
        Rect rect = this.f3116i;
        int i4 = rect.left;
        int i5 = this.f3118j.left;
        if ((i4 < i5 || rect.right <= i5) && this.f3116i.right < this.f3118j.right) {
            i2 = 1;
        } else {
            Rect rect2 = this.f3116i;
            int i6 = rect2.right;
            int i7 = this.f3118j.right;
            i2 = ((i6 > i7 || rect2.left >= i7) && this.f3116i.left > this.f3118j.left) ? -1 : 0;
        }
        Rect rect3 = this.f3116i;
        int i8 = rect3.top;
        int i9 = this.f3118j.top;
        if ((i8 < i9 || rect3.bottom <= i9) && this.f3116i.bottom < this.f3118j.bottom) {
            c = 1;
        } else {
            Rect rect4 = this.f3116i;
            int i10 = rect4.bottom;
            int i11 = this.f3118j.bottom;
            if ((i10 <= i11 && rect4.top < i11) || this.f3116i.top <= this.f3118j.top) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + m932i());
    }

    /* renamed from: b */
    private boolean m968b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f3132q = null;
        }
        int size = this.f3130p.size();
        for (int i = 0; i < size; i++) {
            AbstractC0843s sVar = this.f3130p.get(i);
            if (sVar.mo647a(this, motionEvent) && action != 3) {
                this.f3132q = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m957c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3092O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3092O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3096S = x;
            this.f3094Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3097T = y;
            this.f3095R = y;
        }
    }

    /* renamed from: d */
    private void m949d(AbstractC0821d0 d0Var) {
        View view = d0Var.f3179a;
        boolean z = view.getParent() == this;
        this.f3104c.m605c(m945e(view));
        if (d0Var.m862r()) {
            this.f3110f.m1127a(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0783b bVar = this.f3110f;
        if (!z) {
            bVar.m1125a(view, true);
        } else {
            bVar.m1128a(view);
        }
    }

    /* renamed from: e */
    static void m944e(AbstractC0821d0 d0Var) {
        WeakReference<C0813j> weakReference = d0Var.f3180b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view != d0Var.f3179a) {
                        viewParent = view.getParent();
                        if (viewParent instanceof View) {
                            break;
                        }
                    } else {
                        return;
                    }
                }
                d0Var.f3180b = null;
                return;
            }
        }
    }

    private C0209k getScrollingChildHelper() {
        if (this.f3135r0 == null) {
            this.f3135r0 = new C0209k(this);
        }
        return this.f3135r0;
    }

    /* renamed from: j */
    static C0813j m927j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C0813j) {
            return (C0813j) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0813j j = m927j(viewGroup.getChildAt(i));
            if (j != null) {
                return j;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static AbstractC0821d0 m924k(View view) {
        if (view == null) {
            return null;
        }
        return ((C0840p) view.getLayoutParams()).f3234a;
    }

    /* renamed from: k */
    private boolean m925k(int i, int i2) {
        m972a(this.f3133q0);
        int[] iArr = this.f3133q0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: l */
    private int m922l(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    /* renamed from: y */
    private void m909y() {
        m1015M();
        setScrollState(0);
    }

    /* renamed from: z */
    private void m908z() {
        int i = this.f3150z;
        this.f3150z = 0;
        if (i != 0 && m921m()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0187a.m3548a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.C0813j.AbstractC0821d0 m1001a(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f3110f
            int r0 = r0.m1124b()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x003a
            androidx.recyclerview.widget.b r3 = r5.f3110f
            android.view.View r3 = r3.m1118d(r2)
            androidx.recyclerview.widget.j$d0 r3 = m924k(r3)
            if (r3 == 0) goto L_0x0037
            boolean r4 = r3.m864p()
            if (r4 != 0) goto L_0x0037
            if (r7 == 0) goto L_0x0023
            int r4 = r3.f3181c
            if (r4 == r6) goto L_0x002a
            goto L_0x0037
        L_0x0023:
            int r4 = r3.m871i()
            if (r4 == r6) goto L_0x002a
            goto L_0x0037
        L_0x002a:
            androidx.recyclerview.widget.b r1 = r5.f3110f
            android.view.View r4 = r3.f3179a
            boolean r1 = r1.m1119c(r4)
            if (r1 == 0) goto L_0x0036
            r1 = r3
            goto L_0x0037
        L_0x0036:
            return r3
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.m1001a(int, boolean):androidx.recyclerview.widget.j$d0");
    }

    /* renamed from: a */
    public AbstractC0821d0 m1000a(long j) {
        AbstractC0824g gVar = this.f3122l;
        AbstractC0821d0 d0Var = null;
        if (gVar != null && gVar.m827b()) {
            int b = this.f3110f.m1124b();
            for (int i = 0; i < b; i++) {
                AbstractC0821d0 k = m924k(this.f3110f.m1118d(i));
                if (k != null && !k.m864p() && k.m873g() == j) {
                    if (!this.f3110f.m1119c(k.f3179a)) {
                        return k;
                    }
                    d0Var = k;
                }
            }
        }
        return d0Var;
    }

    /* renamed from: a */
    void m1012a() {
        int b = this.f3110f.m1124b();
        for (int i = 0; i < b; i++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1118d(i));
            if (!k.m856x()) {
                k.m889a();
            }
        }
        this.f3104c.m615b();
    }

    @Override // p000a.p018g.p029l.AbstractC0207i
    /* renamed from: a */
    public void mo1010a(int i) {
        getScrollingChildHelper().m3456c(i);
    }

    /* renamed from: a */
    void m1009a(int i, int i2) {
        if (i < 0) {
            m943f();
            this.f3086I.onAbsorb(-i);
        } else if (i > 0) {
            m939g();
            this.f3088K.onAbsorb(i);
        }
        if (i2 < 0) {
            m935h();
            this.f3087J.onAbsorb(-i2);
        } else if (i2 > 0) {
            m948e();
            this.f3089L.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C0216r.m3450A(this);
        }
    }

    /* renamed from: a */
    public void m1006a(int i, int i2, Interpolator interpolator) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3146x) {
            if (!oVar.mo788a()) {
                i = 0;
            }
            if (!this.f3124m.mo732b()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.f3109e0.m894a(i, i2, interpolator);
            }
        }
    }

    /* renamed from: a */
    void m1005a(int i, int i2, Object obj) {
        int i3;
        int b = this.f3110f.m1124b();
        int i4 = i + i2;
        for (int i5 = 0; i5 < b; i5++) {
            View d = this.f3110f.m1118d(i5);
            AbstractC0821d0 k = m924k(d);
            if (k != null && !k.m856x() && (i3 = k.f3181c) >= i && i3 < i4) {
                k.m888a(2);
                k.m882a(obj);
                ((C0840p) d.getLayoutParams()).f3236c = true;
            }
        }
        this.f3104c.m607c(i, i2);
    }

    /* renamed from: a */
    void m1004a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.f3110f.m1124b();
        for (int i4 = 0; i4 < b; i4++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1118d(i4));
            if (k != null && !k.m856x()) {
                int i5 = k.f3181c;
                if (i5 >= i3) {
                    k.m885a(-i2, z);
                } else if (i5 >= i) {
                    k.m886a(i - 1, -i2, z);
                }
                this.f3115h0.f3158g = true;
            }
        }
        this.f3104c.m627a(i, i2, z);
        requestLayout();
    }

    /* renamed from: a */
    void m1003a(int i, int i2, int[] iArr) {
        m911w();
        m917q();
        C0159a.m3606a("RV Scroll");
        m989a(this.f3115h0);
        int a = i != 0 ? this.f3124m.mo778a(i, this.f3104c, this.f3115h0) : 0;
        int b = i2 != 0 ? this.f3124m.mo728b(i2, this.f3104c, this.f3115h0) : 0;
        C0159a.m3607a();
        m913u();
        m916r();
        m954c(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    /* renamed from: a */
    void m996a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m932i());
        }
        Resources resources = getContext().getResources();
        new C0797d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0317a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0317a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0317a.fastscroll_margin));
    }

    /* renamed from: a */
    void m994a(View view) {
        AbstractC0821d0 k = m924k(view);
        m936g(view);
        AbstractC0824g gVar = this.f3122l;
        if (!(gVar == null || k == null)) {
            gVar.m826b((AbstractC0824g) k);
        }
        List<AbstractC0841q> list = this.f3080C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3080C.get(size).m649b(view);
            }
        }
    }

    /* renamed from: a */
    final void m989a(C0815a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3109e0.f3172d;
            a0Var.f3167p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3168q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f3167p = 0;
        a0Var.f3168q = 0;
    }

    /* renamed from: a */
    void m985a(AbstractC0821d0 d0Var, AbstractC0829l.C0832c cVar) {
        d0Var.m887a(0, 8192);
        if (this.f3115h0.f3160i && d0Var.m861s() && !d0Var.m864p() && !d0Var.m856x()) {
            this.f3112g.m536a(m955c(d0Var), d0Var);
        }
        this.f3112g.m527c(d0Var, cVar);
    }

    /* renamed from: a */
    void m984a(AbstractC0821d0 d0Var, AbstractC0829l.C0832c cVar, AbstractC0829l.C0832c cVar2) {
        d0Var.m881a(false);
        if (this.f3090M.mo571a(d0Var, cVar, cVar2)) {
            m915s();
        }
    }

    /* renamed from: a */
    public void m982a(AbstractC0834n nVar) {
        m981a(nVar, -1);
    }

    /* renamed from: a */
    public void m981a(AbstractC0834n nVar, int i) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            oVar.mo733a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3128o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3128o.add(nVar);
        } else {
            this.f3128o.add(i, nVar);
        }
        m919o();
        requestLayout();
    }

    /* renamed from: a */
    public void m980a(AbstractC0843s sVar) {
        this.f3130p.add(sVar);
    }

    /* renamed from: a */
    public void m979a(AbstractC0844t tVar) {
        if (this.f3119j0 == null) {
            this.f3119j0 = new ArrayList();
        }
        this.f3119j0.add(tVar);
    }

    /* renamed from: a */
    void m974a(String str) {
        if (m920n()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m932i());
            }
            throw new IllegalStateException(str);
        } else if (this.f3084G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m932i()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m973a(boolean z) {
        this.f3083F--;
        if (this.f3083F < 1) {
            this.f3083F = 0;
            if (z) {
                m908z();
                m953d();
            }
        }
    }

    /* renamed from: a */
    public boolean m1008a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m3464a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    boolean m1007a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        m971b();
        if (this.f3122l != null) {
            m1003a(i, i2, this.f3143v0);
            int[] iArr = this.f3143v0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            i5 = i - i7;
            i4 = i2 - i8;
            i6 = i8;
            i3 = i7;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f3128o.isEmpty()) {
            invalidate();
        }
        if (m1008a(i3, i6, i5, i4, this.f3137s0, 0)) {
            int i9 = this.f3096S;
            int[] iArr2 = this.f3137s0;
            this.f3096S = i9 - iArr2[0];
            this.f3097T -= iArr2[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(iArr2[0], iArr2[1]);
            }
            int[] iArr3 = this.f3141u0;
            int i10 = iArr3[0];
            int[] iArr4 = this.f3137s0;
            iArr3[0] = i10 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0206h.m3471a(motionEvent, 8194)) {
                m1011a(motionEvent.getX(), i5, motionEvent.getY(), i4);
            }
            m969b(i, i2);
        }
        if (!(i3 == 0 && i6 == 0)) {
            m951d(i3, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i3 == 0 && i6 == 0) ? false : true;
    }

    /* renamed from: a */
    public boolean m1002a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m3462a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    boolean m990a(AccessibilityEvent accessibilityEvent) {
        if (!m920n()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0187a.m3549a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.f3150z = a | this.f3150z;
        return true;
    }

    /* renamed from: a */
    boolean m988a(AbstractC0821d0 d0Var) {
        AbstractC0829l lVar = this.f3090M;
        return lVar == null || lVar.mo815a(d0Var, d0Var.m869k());
    }

    /* renamed from: a */
    boolean m987a(AbstractC0821d0 d0Var, int i) {
        if (m920n()) {
            d0Var.f3195q = i;
            this.f3145w0.add(d0Var);
            return false;
        }
        C0216r.m3418e(d0Var.f3179a, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar == null || !oVar.m735a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    int m966b(AbstractC0821d0 d0Var) {
        if (d0Var.m879b(524) || !d0Var.m867m()) {
            return -1;
        }
        return this.f3108e.m1150a(d0Var.f3181c);
    }

    /* renamed from: b */
    void m971b() {
        if (!this.f3140u || this.f3081D) {
            C0159a.m3606a("RV FullInvalidate");
            m960c();
            C0159a.m3607a();
        } else if (this.f3108e.m1142c()) {
            if (this.f3108e.m1141c(4) && !this.f3108e.m1141c(11)) {
                C0159a.m3606a("RV PartialInvalidate");
                m911w();
                m917q();
                this.f3108e.m1136e();
                if (!this.f3144w) {
                    if (m1023E()) {
                        m960c();
                    } else {
                        this.f3108e.m1151a();
                    }
                }
                m954c(true);
                m916r();
            } else if (this.f3108e.m1142c()) {
                C0159a.m3606a("RV FullInvalidate");
                m960c();
            } else {
                return;
            }
            C0159a.m3607a();
        }
    }

    /* renamed from: b */
    void m970b(int i) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            oVar.mo690f(i);
        }
        m938g(i);
        AbstractC0844t tVar = this.f3117i0;
        if (tVar != null) {
            tVar.m644a(this, i);
        }
        List<AbstractC0844t> list = this.f3119j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3119j0.get(size).m644a(this, i);
            }
        }
    }

    /* renamed from: b */
    void m969b(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3086I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3086I.onRelease();
            z = this.f3086I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3088K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3088K.onRelease();
            z |= this.f3088K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3087J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3087J.onRelease();
            z |= this.f3087J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3089L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3089L.onRelease();
            z |= this.f3089L.isFinished();
        }
        if (z) {
            C0216r.m3450A(this);
        }
    }

    /* renamed from: b */
    void m967b(View view) {
        AbstractC0821d0 k = m924k(view);
        m933h(view);
        AbstractC0824g gVar = this.f3122l;
        if (!(gVar == null || k == null)) {
            gVar.m822c(k);
        }
        List<AbstractC0841q> list = this.f3080C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3080C.get(size).m650a(view);
            }
        }
    }

    /* renamed from: b */
    void m965b(AbstractC0821d0 d0Var, AbstractC0829l.C0832c cVar, AbstractC0829l.C0832c cVar2) {
        m949d(d0Var);
        d0Var.m881a(false);
        if (this.f3090M.mo569b(d0Var, cVar, cVar2)) {
            m915s();
        }
    }

    /* renamed from: b */
    public void m964b(AbstractC0834n nVar) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            oVar.mo733a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3128o.remove(nVar);
        if (this.f3128o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m919o();
        requestLayout();
    }

    /* renamed from: b */
    public void m963b(AbstractC0843s sVar) {
        this.f3130p.remove(sVar);
        if (this.f3132q == sVar) {
            this.f3132q = null;
        }
    }

    /* renamed from: b */
    public void m962b(AbstractC0844t tVar) {
        List<AbstractC0844t> list = this.f3119j0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* renamed from: b */
    void m961b(boolean z) {
        this.f3082E = z | this.f3082E;
        this.f3081D = true;
        m918p();
    }

    /* renamed from: c */
    long m955c(AbstractC0821d0 d0Var) {
        return this.f3122l.m827b() ? d0Var.m873g() : d0Var.f3181c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        return r3;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m956c(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.m956c(android.view.View):android.view.View");
    }

    /* renamed from: c */
    public AbstractC0821d0 m959c(int i) {
        AbstractC0821d0 d0Var = null;
        if (this.f3081D) {
            return null;
        }
        int b = this.f3110f.m1124b();
        for (int i2 = 0; i2 < b; i2++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1118d(i2));
            if (k != null && !k.m864p() && m966b(k) == i) {
                if (!this.f3110f.m1119c(k.f3179a)) {
                    return k;
                }
                d0Var = k;
            }
        }
        return d0Var;
    }

    /* renamed from: c */
    void m960c() {
        String str;
        if (this.f3122l == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.f3124m == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C0815a0 a0Var = this.f3115h0;
            a0Var.f3161j = false;
            if (a0Var.f3156e == 1) {
                m1027A();
            } else if (!this.f3108e.m1139d() && this.f3124m.m665q() == getWidth() && this.f3124m.m682h() == getHeight()) {
                this.f3124m.m692e(this);
                m1025C();
                return;
            }
            this.f3124m.m692e(this);
            m1026B();
            m1025C();
            return;
        }
        Log.e("RecyclerView", str);
    }

    /* renamed from: c */
    void m958c(int i, int i2) {
        setMeasuredDimension(AbstractC0835o.m785a(i, getPaddingLeft() + getPaddingRight(), C0216r.m3409l(this)), AbstractC0835o.m785a(i2, getPaddingTop() + getPaddingBottom(), C0216r.m3410k(this)));
    }

    /* renamed from: c */
    void m954c(boolean z) {
        if (this.f3142v < 1) {
            this.f3142v = 1;
        }
        if (!z && !this.f3146x) {
            this.f3144w = false;
        }
        if (this.f3142v == 1) {
            if (z && this.f3144w && !this.f3146x && this.f3124m != null && this.f3122l != null) {
                m960c();
            }
            if (!this.f3146x) {
                this.f3144w = false;
            }
        }
        this.f3142v--;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0840p) && this.f3124m.mo754a((C0840p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null && oVar.mo788a()) {
            return this.f3124m.mo756a(this.f3115h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null && oVar.mo788a()) {
            return this.f3124m.mo723b(this.f3115h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null && oVar.mo788a()) {
            return this.f3124m.mo711c(this.f3115h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null && oVar.mo732b()) {
            return this.f3124m.mo701d(this.f3115h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null && oVar.mo732b()) {
            return this.f3124m.mo694e(this.f3115h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null && oVar.mo732b()) {
            return this.f3124m.mo688f(this.f3115h0);
        }
        return 0;
    }

    /* renamed from: d */
    public AbstractC0821d0 m950d(View view) {
        View c = m956c(view);
        if (c == null) {
            return null;
        }
        return m945e(c);
    }

    /* renamed from: d */
    void m953d() {
        int i;
        for (int size = this.f3145w0.size() - 1; size >= 0; size--) {
            AbstractC0821d0 d0Var = this.f3145w0.get(size);
            if (d0Var.f3179a.getParent() == this && !d0Var.m856x() && (i = d0Var.f3195q) != -1) {
                C0216r.m3418e(d0Var.f3179a, i);
                d0Var.f3195q = -1;
            }
        }
        this.f3145w0.clear();
    }

    /* renamed from: d */
    void m951d(int i, int i2) {
        this.f3084G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        m934h(i, i2);
        AbstractC0844t tVar = this.f3117i0;
        if (tVar != null) {
            tVar.mo643a(this, i, i2);
        }
        List<AbstractC0844t> list = this.f3119j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3119j0.get(size).mo643a(this, i, i2);
            }
        }
        this.f3084G--;
    }

    /* renamed from: d */
    public boolean m952d(int i) {
        return getScrollingChildHelper().m3467a(i);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m3468a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m3469a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3463a(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m3465a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f;
        super.draw(canvas);
        int size = this.f3128o.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f3128o.get(i2).mo792b(canvas, this, this.f3115h0);
        }
        EdgeEffect edgeEffect = this.f3086I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3114h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f3086I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3087J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3114h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3087J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3088K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3114h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f3088K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3089L;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3114h) {
                f = (-getWidth()) + getPaddingRight();
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = -getWidth();
                i = -getHeight();
            }
            canvas.translate(f, i);
            EdgeEffect edgeEffect8 = this.f3089L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f3090M != null && this.f3128o.size() > 0 && this.f3090M.mo804g()) {
            z2 = true;
        }
        if (z2) {
            C0216r.m3450A(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e */
    public AbstractC0821d0 m945e(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m924k(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: e */
    void m948e() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f3089L == null) {
            this.f3089L = this.f3085H.m819a(this, 3);
            if (this.f3114h) {
                edgeEffect = this.f3089L;
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.f3089L;
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: e */
    public void m947e(int i) {
        int a = this.f3110f.m1130a();
        for (int i2 = 0; i2 < a; i2++) {
            this.f3110f.m1120c(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: e */
    public boolean m946e(int i, int i2) {
        AbstractC0835o oVar = this.f3124m;
        int i3 = 0;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3146x) {
            return false;
        } else {
            boolean a = oVar.mo788a();
            boolean b = this.f3124m.mo732b();
            if (!a || Math.abs(i) < this.f3100W) {
                i = 0;
            }
            if (!b || Math.abs(i2) < this.f3100W) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = i;
            float f2 = i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = a || b;
                dispatchNestedFling(f, f2, z);
                AbstractC0842r rVar = this.f3099V;
                if (rVar != null && rVar.m648a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (a) {
                        i3 = 1;
                    }
                    if (b) {
                        i3 |= 2;
                    }
                    m928j(i3, 1);
                    int i4 = this.f3101a0;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f3101a0;
                    this.f3109e0.m897a(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    Rect m940f(View view) {
        C0840p pVar = (C0840p) view.getLayoutParams();
        if (!pVar.f3236c) {
            return pVar.f3235b;
        }
        if (this.f3115h0.m902d() && (pVar.m653b() || pVar.m651d())) {
            return pVar.f3235b;
        }
        Rect rect = pVar.f3235b;
        rect.set(0, 0, 0, 0);
        int size = this.f3128o.size();
        for (int i = 0; i < size; i++) {
            this.f3116i.set(0, 0, 0, 0);
            this.f3128o.get(i).m794a(this.f3116i, view, this, this.f3115h0);
            int i2 = rect.left;
            Rect rect2 = this.f3116i;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3236c = false;
        return rect;
    }

    /* renamed from: f */
    void m943f() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f3086I == null) {
            this.f3086I = this.f3085H.m819a(this, 0);
            if (this.f3114h) {
                edgeEffect = this.f3086I;
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.f3086I;
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: f */
    public void m942f(int i) {
        int a = this.f3110f.m1130a();
        for (int i2 = 0; i2 < a; i2++) {
            this.f3110f.m1120c(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: f */
    void m941f(int i, int i2) {
        int b = this.f3110f.m1124b();
        for (int i3 = 0; i3 < b; i3++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1118d(i3));
            if (k != null && !k.m856x() && k.f3181c >= i) {
                k.m885a(i2, false);
                this.f3115h0.f3158g = true;
            }
        }
        this.f3104c.m628a(i, i2);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.f3124m.m702d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.f3122l != null && this.f3124m != null && !m920n() && !this.f3146x;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                m971b();
                if (m956c(view) == null) {
                    return null;
                }
                m911w();
                view2 = this.f3124m.mo765a(view, i, this.f3104c, this.f3115h0);
                m954c(false);
            }
        } else {
            if (this.f3124m.mo732b()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3073E0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3124m.mo788a()) {
                int i3 = (this.f3124m.m678j() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (f3073E0) {
                    i = i3;
                }
            }
            if (z) {
                m971b();
                if (m956c(view) == null) {
                    return null;
                }
                m911w();
                this.f3124m.mo765a(view, i, this.f3104c, this.f3115h0);
                m954c(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m991a(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m992a(view2, (View) null);
        return view;
    }

    /* renamed from: g */
    void m939g() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f3088K == null) {
            this.f3088K = this.f3085H.m819a(this, 2);
            if (this.f3114h) {
                edgeEffect = this.f3088K;
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.f3088K;
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: g */
    public void m938g(int i) {
    }

    /* renamed from: g */
    void m937g(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int b = this.f3110f.m1124b();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i7 = 0; i7 < b; i7++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1118d(i7));
            if (k != null && (i6 = k.f3181c) >= i5 && i6 <= i4) {
                if (i6 == i) {
                    k.m885a(i2 - i, false);
                } else {
                    k.m885a(i3, false);
                }
                this.f3115h0.f3158g = true;
            }
        }
        this.f3104c.m613b(i, i2);
        requestLayout();
    }

    /* renamed from: g */
    public void m936g(View view) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            return oVar.mo716c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m932i());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            return oVar.mo776a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m932i());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            return oVar.mo758a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m932i());
    }

    public AbstractC0824g getAdapter() {
        return this.f3122l;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0835o oVar = this.f3124m;
        return oVar != null ? oVar.m706d() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        AbstractC0827j jVar = this.f3131p0;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.m820a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3114h;
    }

    public C0854k getCompatAccessibilityDelegate() {
        return this.f3129o0;
    }

    public C0828k getEdgeEffectFactory() {
        return this.f3085H;
    }

    public AbstractC0829l getItemAnimator() {
        return this.f3090M;
    }

    public int getItemDecorationCount() {
        return this.f3128o.size();
    }

    public AbstractC0835o getLayoutManager() {
        return this.f3124m;
    }

    public int getMaxFlingVelocity() {
        return this.f3101a0;
    }

    public int getMinFlingVelocity() {
        return this.f3100W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3072D0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0842r getOnFlingListener() {
        return this.f3099V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3107d0;
    }

    public C0845u getRecycledViewPool() {
        return this.f3104c.m604d();
    }

    public int getScrollState() {
        return this.f3091N;
    }

    /* renamed from: h */
    void m935h() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f3087J == null) {
            this.f3087J = this.f3085H.m819a(this, 1);
            if (this.f3114h) {
                edgeEffect = this.f3087J;
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.f3087J;
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: h */
    public void m934h(int i, int i2) {
    }

    /* renamed from: h */
    public void m933h(View view) {
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m3470a();
    }

    /* renamed from: i */
    String m932i() {
        return " " + super.toString() + ", adapter:" + this.f3122l + ", layout:" + this.f3124m + ", context:" + getContext();
    }

    /* renamed from: i */
    public void m931i(int i, int i2) {
        m1006a(i, i2, (Interpolator) null);
    }

    /* renamed from: i */
    boolean m930i(View view) {
        m911w();
        boolean e = this.f3110f.m1115e(view);
        if (e) {
            AbstractC0821d0 k = m924k(view);
            this.f3104c.m605c(k);
            this.f3104c.m610b(k);
        }
        m954c(!e);
        return e;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f3134r;
    }

    @Override // android.view.View, p000a.p018g.p029l.AbstractC0208j
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m3459b();
    }

    /* renamed from: j */
    public boolean m929j() {
        return !this.f3140u || this.f3081D || this.f3108e.m1142c();
    }

    /* renamed from: j */
    public boolean m928j(int i, int i2) {
        return getScrollingChildHelper().m3466a(i, i2);
    }

    /* renamed from: k */
    void m926k() {
        this.f3108e = new C0780a(new C0823f());
    }

    /* renamed from: l */
    void m923l() {
        this.f3089L = null;
        this.f3087J = null;
        this.f3088K = null;
        this.f3086I = null;
    }

    /* renamed from: m */
    boolean m921m() {
        AccessibilityManager accessibilityManager = this.f3079B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: n */
    public boolean m920n() {
        return this.f3083F > 0;
    }

    /* renamed from: o */
    void m919o() {
        int b = this.f3110f.m1124b();
        for (int i = 0; i < b; i++) {
            ((C0840p) this.f3110f.m1118d(i).getLayoutParams()).f3236c = true;
        }
        this.f3104c.m595g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f3083F = r0
            r1 = 1
            r4.f3134r = r1
            boolean r2 = r4.f3140u
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f3140u = r1
            androidx.recyclerview.widget.j$o r1 = r4.f3124m
            if (r1 == 0) goto L_0x001e
            r1.m744a(r4)
        L_0x001e:
            r4.f3127n0 = r0
            boolean r0 = androidx.recyclerview.widget.C0813j.f3072D0
            if (r0 == 0) goto L_0x0067
            java.lang.ThreadLocal<androidx.recyclerview.widget.e> r0 = androidx.recyclerview.widget.RunnableC0802e.f3041f
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.e r0 = (androidx.recyclerview.widget.RunnableC0802e) r0
            r4.f3111f0 = r0
            androidx.recyclerview.widget.e r0 = r4.f3111f0
            if (r0 != 0) goto L_0x0062
            androidx.recyclerview.widget.e r0 = new androidx.recyclerview.widget.e
            r0.<init>()
            r4.f3111f0 = r0
            android.view.Display r0 = p000a.p018g.p029l.C0216r.m3419e(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            androidx.recyclerview.widget.e r1 = r4.f3111f0
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f3045d = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.e> r0 = androidx.recyclerview.widget.RunnableC0802e.f3041f
            r0.set(r1)
        L_0x0062:
            androidx.recyclerview.widget.e r0 = r4.f3111f0
            r0.m1069a(r4)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC0802e eVar;
        super.onDetachedFromWindow();
        AbstractC0829l lVar = this.f3090M;
        if (lVar != null) {
            lVar.mo813b();
        }
        m910x();
        this.f3134r = false;
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            oVar.m736a(this, this.f3104c);
        }
        this.f3145w0.clear();
        removeCallbacks(this.f3147x0);
        this.f3112g.m531b();
        if (f3072D0 && (eVar = this.f3111f0) != null) {
            eVar.m1063b(this);
            this.f3111f0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3128o.size();
        for (int i = 0; i < size; i++) {
            this.f3128o.get(i).m796a(canvas, this, this.f3115h0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.j$o r0 = r5.f3124m
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r5.f3146x
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L_0x0077
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003c
            androidx.recyclerview.widget.j$o r0 = r5.f3124m
            boolean r0 = r0.mo732b()
            if (r0 == 0) goto L_0x002c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            androidx.recyclerview.widget.j$o r3 = r5.f3124m
            boolean r3 = r3.mo788a()
            if (r3 == 0) goto L_0x0061
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L_0x0062
        L_0x003c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0060
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.j$o r3 = r5.f3124m
            boolean r3 = r3.mo732b()
            if (r3 == 0) goto L_0x0055
            float r0 = -r0
            goto L_0x0061
        L_0x0055:
            androidx.recyclerview.widget.j$o r3 = r5.f3124m
            boolean r3 = r3.mo788a()
            if (r3 == 0) goto L_0x0060
            r3 = r0
            r0 = 0
            goto L_0x0062
        L_0x0060:
            r0 = 0
        L_0x0061:
            r3 = 0
        L_0x0062:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x006a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0077
        L_0x006a:
            float r2 = r5.f3103b0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f3105c0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m1007a(r2, r0, r6)
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3146x) {
            return false;
        }
        if (m968b(motionEvent)) {
            m909y();
            return true;
        }
        AbstractC0835o oVar = this.f3124m;
        if (oVar == null) {
            return false;
        }
        boolean a = oVar.mo788a();
        boolean b = this.f3124m.mo732b();
        if (this.f3093P == null) {
            this.f3093P = VelocityTracker.obtain();
        }
        this.f3093P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3148y) {
                this.f3148y = false;
            }
            this.f3092O = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f3096S = x;
            this.f3094Q = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f3097T = y;
            this.f3095R = y;
            if (this.f3091N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f3141u0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = a ? 1 : 0;
            if (b) {
                i |= 2;
            }
            m928j(i, 0);
        } else if (actionMasked == 1) {
            this.f3093P.clear();
            mo1010a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3092O);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3092O + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3091N != 1) {
                int i2 = x2 - this.f3094Q;
                int i3 = y2 - this.f3095R;
                if (!a || Math.abs(i2) <= this.f3098U) {
                    z = false;
                } else {
                    this.f3096S = x2;
                    z = true;
                }
                if (b && Math.abs(i3) > this.f3098U) {
                    this.f3097T = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m909y();
        } else if (actionMasked == 5) {
            this.f3092O = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3096S = x3;
            this.f3094Q = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3097T = y3;
            this.f3095R = y3;
        } else if (actionMasked == 6) {
            m957c(motionEvent);
        }
        return this.f3091N == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0159a.m3606a("RV OnLayout");
        m960c();
        C0159a.m3607a();
        this.f3140u = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar == null) {
            m958c(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo661u()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3124m.m750a(this.f3104c, this.f3115h0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f3122l != null) {
                if (this.f3115h0.f3156e == 1) {
                    m1027A();
                }
                this.f3124m.m730b(i, i2);
                this.f3115h0.f3161j = true;
                m1026B();
                this.f3124m.m704d(i, i2);
                if (this.f3124m.mo791A()) {
                    this.f3124m.m730b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3115h0.f3161j = true;
                    m1026B();
                    this.f3124m.m704d(i, i2);
                }
            }
        } else if (this.f3136s) {
            this.f3124m.m750a(this.f3104c, this.f3115h0, i, i2);
        } else {
            if (this.f3078A) {
                m911w();
                m917q();
                m1019I();
                m916r();
                C0815a0 a0Var = this.f3115h0;
                if (a0Var.f3163l) {
                    a0Var.f3159h = true;
                } else {
                    this.f3108e.m1146b();
                    this.f3115h0.f3159h = false;
                }
                this.f3078A = false;
                m954c(false);
            } else if (this.f3115h0.f3163l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0824g gVar = this.f3122l;
            if (gVar != null) {
                this.f3115h0.f3157f = gVar.mo106a();
            } else {
                this.f3115h0.f3157f = 0;
            }
            m911w();
            this.f3124m.m750a(this.f3104c, this.f3115h0, i, i2);
            m954c(false);
            this.f3115h0.f3159h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m920n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0850y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f3106d = (C0850y) parcelable;
        super.onRestoreInstanceState(this.f3106d.m3347a());
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null && (parcelable2 = this.f3106d.f3254d) != null) {
            oVar.mo773a(parcelable2);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0850y yVar = new C0850y(super.onSaveInstanceState());
        C0850y yVar2 = this.f3106d;
        if (yVar2 != null) {
            yVar.m589a(yVar2);
        } else {
            AbstractC0835o oVar = this.f3124m;
            yVar.f3254d = oVar != null ? oVar.mo658x() : null;
        }
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m923l();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0813j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    void m918p() {
        int b = this.f3110f.m1124b();
        for (int i = 0; i < b; i++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1118d(i));
            if (k != null && !k.m856x()) {
                k.m888a(6);
            }
        }
        m919o();
        this.f3104c.m594h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m917q() {
        this.f3083F++;
    }

    /* renamed from: r */
    void m916r() {
        m973a(true);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        AbstractC0821d0 k = m924k(view);
        if (k != null) {
            if (k.m862r()) {
                k.m876d();
            } else if (!k.m856x()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + k + m932i());
            }
        }
        view.clearAnimation();
        m967b(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3124m.m737a(this, this.f3115h0, view, view2) && view2 != null) {
            m992a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3124m.m740a(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3130p.size();
        for (int i = 0; i < size; i++) {
            this.f3130p.get(i).mo646a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3142v != 0 || this.f3146x) {
            this.f3144w = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    void m915s() {
        if (!this.f3127n0 && this.f3134r) {
            C0216r.m3432a(this, this.f3147x0);
            this.f3127n0 = true;
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0835o oVar = this.f3124m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3146x) {
            boolean a = oVar.mo788a();
            boolean b = this.f3124m.mo732b();
            if (a || b) {
                if (!a) {
                    i = 0;
                }
                if (!b) {
                    i2 = 0;
                }
                m1007a(i, i2, (MotionEvent) null);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m990a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0854k kVar) {
        this.f3129o0 = kVar;
        C0216r.m3440a(this, this.f3129o0);
    }

    public void setAdapter(AbstractC0824g gVar) {
        setLayoutFrozen(false);
        m983a(gVar, false, true);
        m961b(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AbstractC0827j jVar) {
        if (jVar != this.f3131p0) {
            this.f3131p0 = jVar;
            setChildrenDrawingOrderEnabled(this.f3131p0 != null);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f3114h) {
            m923l();
        }
        this.f3114h = z;
        super.setClipToPadding(z);
        if (this.f3140u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0828k kVar) {
        C0184g.m3556a(kVar);
        this.f3085H = kVar;
        m923l();
    }

    public void setHasFixedSize(boolean z) {
        this.f3136s = z;
    }

    public void setItemAnimator(AbstractC0829l lVar) {
        AbstractC0829l lVar2 = this.f3090M;
        if (lVar2 != null) {
            lVar2.mo813b();
            this.f3090M.m814a((AbstractC0829l.AbstractC0831b) null);
        }
        this.f3090M = lVar;
        AbstractC0829l lVar3 = this.f3090M;
        if (lVar3 != null) {
            lVar3.m814a(this.f3125m0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f3104c.m597f(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f3146x) {
            m974a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f3146x = false;
                if (!(!this.f3144w || this.f3124m == null || this.f3122l == null)) {
                    requestLayout();
                }
                this.f3144w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3146x = true;
            this.f3148y = true;
            m910x();
        }
    }

    public void setLayoutManager(AbstractC0835o oVar) {
        if (oVar != this.f3124m) {
            m910x();
            if (this.f3124m != null) {
                AbstractC0829l lVar = this.f3090M;
                if (lVar != null) {
                    lVar.mo813b();
                }
                this.f3124m.m722b(this.f3104c);
                this.f3124m.m710c(this.f3104c);
                this.f3104c.m630a();
                if (this.f3134r) {
                    this.f3124m.m736a(this, this.f3104c);
                }
                this.f3124m.m687f((C0813j) null);
                this.f3124m = null;
            } else {
                this.f3104c.m630a();
            }
            this.f3110f.m1121c();
            this.f3124m = oVar;
            if (oVar != null) {
                if (oVar.f3211b == null) {
                    this.f3124m.m687f(this);
                    if (this.f3134r) {
                        this.f3124m.m744a(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3211b.m932i());
                }
            }
            this.f3104c.m592j();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m3460a(z);
    }

    public void setOnFlingListener(AbstractC0842r rVar) {
        this.f3099V = rVar;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0844t tVar) {
        this.f3117i0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3107d0 = z;
    }

    public void setRecycledViewPool(C0845u uVar) {
        this.f3104c.m616a(uVar);
    }

    public void setRecyclerListener(AbstractC0848w wVar) {
        this.f3126n = wVar;
    }

    void setScrollState(int i) {
        if (i != this.f3091N) {
            this.f3091N = i;
            if (i != 2) {
                m1013O();
            }
            m970b(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.f3098U = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f3098U = i2;
    }

    public void setViewCacheExtension(AbstractC0817b0 b0Var) {
        this.f3104c.m621a(b0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m3458b(i);
    }

    @Override // android.view.View, p000a.p018g.p029l.AbstractC0208j
    public void stopNestedScroll() {
        getScrollingChildHelper().m3457c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m914t() {
        AbstractC0829l lVar = this.f3090M;
        if (lVar != null) {
            lVar.mo813b();
        }
        AbstractC0835o oVar = this.f3124m;
        if (oVar != null) {
            oVar.m722b(this.f3104c);
            this.f3124m.m710c(this.f3104c);
        }
        this.f3104c.m630a();
    }

    /* renamed from: u */
    void m913u() {
        AbstractC0821d0 d0Var;
        int a = this.f3110f.m1130a();
        for (int i = 0; i < a; i++) {
            View c = this.f3110f.m1120c(i);
            AbstractC0821d0 e = m945e(c);
            if (!(e == null || (d0Var = e.f3187i) == null)) {
                View view = d0Var.f3179a;
                int left = c.getLeft();
                int top = c.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: v */
    void m912v() {
        int b = this.f3110f.m1124b();
        for (int i = 0; i < b; i++) {
            AbstractC0821d0 k = m924k(this.f3110f.m1118d(i));
            if (!k.m856x()) {
                k.m858v();
            }
        }
    }

    /* renamed from: w */
    void m911w() {
        this.f3142v++;
        if (this.f3142v == 1 && !this.f3146x) {
            this.f3144w = false;
        }
    }

    /* renamed from: x */
    public void m910x() {
        setScrollState(0);
        m1013O();
    }
}
