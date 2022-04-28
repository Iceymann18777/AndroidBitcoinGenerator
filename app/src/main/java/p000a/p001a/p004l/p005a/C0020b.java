package p000a.p001a.p004l.p005a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0698a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.l.a.b */
/* loaded from: classes.dex */
public class C0020b extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    private AbstractC0023c f20b;

    /* renamed from: c */
    private Rect f21c;

    /* renamed from: d */
    private Drawable f22d;

    /* renamed from: e */
    private Drawable f23e;

    /* renamed from: g */
    private boolean f25g;

    /* renamed from: i */
    private boolean f27i;

    /* renamed from: j */
    private Runnable f28j;

    /* renamed from: k */
    private long f29k;

    /* renamed from: l */
    private long f30l;

    /* renamed from: m */
    private C0022b f31m;

    /* renamed from: f */
    private int f24f = 255;

    /* renamed from: h */
    private int f26h = -1;

    /* renamed from: a.a.l.a.b$a */
    /* loaded from: classes.dex */
    class RunnableC0021a implements Runnable {
        RunnableC0021a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0020b.this.m4230a(true);
            C0020b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.b$b */
    /* loaded from: classes.dex */
    public static class C0022b implements Drawable.Callback {

        /* renamed from: b */
        private Drawable.Callback f33b;

        C0022b() {
        }

        /* renamed from: a */
        public C0022b m4226a(Drawable.Callback callback) {
            this.f33b = callback;
            return this;
        }

        /* renamed from: a */
        public Drawable.Callback m4227a() {
            Drawable.Callback callback = this.f33b;
            this.f33b = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f33b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f33b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.b$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0023c extends Drawable.ConstantState {

        /* renamed from: A */
        int f34A;

        /* renamed from: B */
        int f35B;

        /* renamed from: C */
        boolean f36C;

        /* renamed from: D */
        ColorFilter f37D;

        /* renamed from: E */
        boolean f38E;

        /* renamed from: F */
        ColorStateList f39F;

        /* renamed from: G */
        PorterDuff.Mode f40G;

        /* renamed from: H */
        boolean f41H;

        /* renamed from: I */
        boolean f42I;

        /* renamed from: a */
        final C0020b f43a;

        /* renamed from: b */
        Resources f44b;

        /* renamed from: c */
        int f45c;

        /* renamed from: d */
        int f46d;

        /* renamed from: e */
        int f47e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f48f;

        /* renamed from: g */
        Drawable[] f49g;

        /* renamed from: h */
        int f50h;

        /* renamed from: i */
        boolean f51i;

        /* renamed from: j */
        boolean f52j;

        /* renamed from: k */
        Rect f53k;

        /* renamed from: l */
        boolean f54l;

        /* renamed from: m */
        boolean f55m;

        /* renamed from: n */
        int f56n;

        /* renamed from: o */
        int f57o;

        /* renamed from: p */
        int f58p;

        /* renamed from: q */
        int f59q;

        /* renamed from: r */
        boolean f60r;

        /* renamed from: s */
        int f61s;

        /* renamed from: t */
        boolean f62t;

        /* renamed from: u */
        boolean f63u;

        /* renamed from: v */
        boolean f64v;

        /* renamed from: w */
        boolean f65w;

        /* renamed from: x */
        boolean f66x;

        /* renamed from: y */
        boolean f67y;

        /* renamed from: z */
        int f68z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0023c(AbstractC0023c cVar, C0020b bVar, Resources resources) {
            this.f45c = 160;
            this.f51i = false;
            this.f54l = false;
            this.f66x = true;
            this.f34A = 0;
            this.f35B = 0;
            this.f43a = bVar;
            this.f44b = resources != null ? resources : cVar != null ? cVar.f44b : null;
            this.f45c = C0020b.m4232a(resources, cVar != null ? cVar.f45c : 0);
            if (cVar != null) {
                this.f46d = cVar.f46d;
                this.f47e = cVar.f47e;
                this.f64v = true;
                this.f65w = true;
                this.f51i = cVar.f51i;
                this.f54l = cVar.f54l;
                this.f66x = cVar.f66x;
                this.f67y = cVar.f67y;
                this.f68z = cVar.f68z;
                this.f34A = cVar.f34A;
                this.f35B = cVar.f35B;
                this.f36C = cVar.f36C;
                this.f37D = cVar.f37D;
                this.f38E = cVar.f38E;
                this.f39F = cVar.f39F;
                this.f40G = cVar.f40G;
                this.f41H = cVar.f41H;
                this.f42I = cVar.f42I;
                if (cVar.f45c == this.f45c) {
                    if (cVar.f52j) {
                        this.f53k = new Rect(cVar.f53k);
                        this.f52j = true;
                    }
                    if (cVar.f55m) {
                        this.f56n = cVar.f56n;
                        this.f57o = cVar.f57o;
                        this.f58p = cVar.f58p;
                        this.f59q = cVar.f59q;
                        this.f55m = true;
                    }
                }
                if (cVar.f60r) {
                    this.f61s = cVar.f61s;
                    this.f60r = true;
                }
                if (cVar.f62t) {
                    this.f63u = cVar.f63u;
                    this.f62t = true;
                }
                Drawable[] drawableArr = cVar.f49g;
                this.f49g = new Drawable[drawableArr.length];
                this.f50h = cVar.f50h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f48f;
                this.f48f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f50h);
                int i = this.f50h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f48f.put(i2, constantState);
                        } else {
                            this.f49g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f49g = new Drawable[10];
            this.f50h = 0;
        }

        /* renamed from: b */
        private Drawable m4216b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f68z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f43a);
            return mutate;
        }

        /* renamed from: n */
        private void m4203n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f48f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f49g[this.f48f.keyAt(i)] = m4216b(this.f48f.valueAt(i).newDrawable(this.f44b));
                }
                this.f48f = null;
            }
        }

        /* renamed from: a */
        public final int m4221a(Drawable drawable) {
            int i = this.f50h;
            if (i >= this.f49g.length) {
                mo4190a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f43a);
            this.f49g[i] = drawable;
            this.f50h++;
            this.f47e = drawable.getChangingConfigurations() | this.f47e;
            m4205k();
            this.f53k = null;
            this.f52j = false;
            this.f55m = false;
            this.f64v = false;
            return i;
        }

        /* renamed from: a */
        public final Drawable m4224a(int i) {
            int indexOfKey;
            Drawable drawable = this.f49g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f48f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = m4216b(this.f48f.valueAt(indexOfKey).newDrawable(this.f44b));
            this.f49g[i] = b;
            this.f48f.removeAt(indexOfKey);
            if (this.f48f.size() == 0) {
                this.f48f = null;
            }
            return b;
        }

        /* renamed from: a */
        public void mo4190a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f49g, 0, drawableArr, 0, i);
            this.f49g = drawableArr;
        }

        /* renamed from: a */
        final void m4223a(Resources.Theme theme) {
            if (theme != null) {
                m4203n();
                int i = this.f50h;
                Drawable[] drawableArr = this.f49g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f47e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m4222a(theme.getResources());
            }
        }

        /* renamed from: a */
        final void m4222a(Resources resources) {
            if (resources != null) {
                this.f44b = resources;
                int a = C0020b.m4232a(resources, this.f45c);
                int i = this.f45c;
                this.f45c = a;
                if (i != a) {
                    this.f55m = false;
                    this.f52j = false;
                }
            }
        }

        /* renamed from: a */
        public final void m4220a(boolean z) {
            this.f54l = z;
        }

        /* renamed from: a */
        public synchronized boolean m4225a() {
            if (this.f64v) {
                return this.f65w;
            }
            m4203n();
            this.f64v = true;
            int i = this.f50h;
            Drawable[] drawableArr = this.f49g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f65w = false;
                    return false;
                }
            }
            this.f65w = true;
            return true;
        }

        /* renamed from: b */
        protected void m4219b() {
            this.f55m = true;
            m4203n();
            int i = this.f50h;
            Drawable[] drawableArr = this.f49g;
            this.f57o = -1;
            this.f56n = -1;
            this.f59q = 0;
            this.f58p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f56n) {
                    this.f56n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f57o) {
                    this.f57o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f58p) {
                    this.f58p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f59q) {
                    this.f59q = minimumHeight;
                }
            }
        }

        /* renamed from: b */
        public final void m4218b(int i) {
            this.f34A = i;
        }

        /* renamed from: b */
        public final void m4215b(boolean z) {
            this.f51i = z;
        }

        /* renamed from: b */
        final boolean m4217b(int i, int i2) {
            int i3 = this.f50h;
            Drawable[] drawableArr = this.f49g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    z = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                    }
                }
            }
            this.f68z = i;
            return z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public final int m4214c() {
            return this.f49g.length;
        }

        /* renamed from: c */
        public final void m4213c(int i) {
            this.f35B = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f50h;
            Drawable[] drawableArr = this.f49g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f48f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int m4212d() {
            return this.f50h;
        }

        /* renamed from: e */
        public final int m4211e() {
            if (!this.f55m) {
                m4219b();
            }
            return this.f57o;
        }

        /* renamed from: f */
        public final int m4210f() {
            if (!this.f55m) {
                m4219b();
            }
            return this.f59q;
        }

        /* renamed from: g */
        public final int m4209g() {
            if (!this.f55m) {
                m4219b();
            }
            return this.f58p;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f46d | this.f47e;
        }

        /* renamed from: h */
        public final Rect m4208h() {
            if (this.f51i) {
                return null;
            }
            if (this.f53k != null || this.f52j) {
                return this.f53k;
            }
            m4203n();
            Rect rect = new Rect();
            int i = this.f50h;
            Drawable[] drawableArr = this.f49g;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect.left;
                    if (i3 > rect2.left) {
                        rect2.left = i3;
                    }
                    int i4 = rect.top;
                    if (i4 > rect2.top) {
                        rect2.top = i4;
                    }
                    int i5 = rect.right;
                    if (i5 > rect2.right) {
                        rect2.right = i5;
                    }
                    int i6 = rect.bottom;
                    if (i6 > rect2.bottom) {
                        rect2.bottom = i6;
                    }
                }
            }
            this.f52j = true;
            this.f53k = rect2;
            return rect2;
        }

        /* renamed from: i */
        public final int m4207i() {
            if (!this.f55m) {
                m4219b();
            }
            return this.f56n;
        }

        /* renamed from: j */
        public final int m4206j() {
            if (this.f60r) {
                return this.f61s;
            }
            m4203n();
            int i = this.f50h;
            Drawable[] drawableArr = this.f49g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f61s = opacity;
            this.f60r = true;
            return opacity;
        }

        /* renamed from: k */
        void m4205k() {
            this.f60r = false;
            this.f62t = false;
        }

        /* renamed from: l */
        public final boolean m4204l() {
            return this.f54l;
        }

        /* renamed from: m */
        abstract void mo4187m();
    }

    /* renamed from: a */
    static int m4232a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    private void m4231a(Drawable drawable) {
        if (this.f31m == null) {
            this.f31m = new C0022b();
        }
        C0022b bVar = this.f31m;
        bVar.m4226a(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f20b.f34A <= 0 && this.f25g) {
                drawable.setAlpha(this.f24f);
            }
            if (this.f20b.f38E) {
                drawable.setColorFilter(this.f20b.f37D);
            } else {
                if (this.f20b.f41H) {
                    C0698a.m1603a(drawable, this.f20b.f39F);
                }
                if (this.f20b.f42I) {
                    C0698a.m1600a(drawable, this.f20b.f40G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f20b.f66x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f20b.f36C);
            }
            Rect rect = this.f21c;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f31m.m4227a());
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: c */
    private boolean m4228c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    /* renamed from: a */
    AbstractC0023c mo4193a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4192a(AbstractC0023c cVar) {
        this.f20b = cVar;
        int i = this.f26h;
        if (i >= 0) {
            this.f22d = cVar.m4224a(i);
            Drawable drawable = this.f22d;
            if (drawable != null) {
                m4231a(drawable);
            }
        }
        this.f23e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4233a(Resources resources) {
        this.f20b.m4222a(resources);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m4230a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f25g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f22d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f29k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f24f
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            a.a.l.a.b$c r9 = r13.f20b
            int r9 = r9.f34A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f24f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f29k = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f23e
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f30l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f23e = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.a.l.a.b$c r4 = r13.f20b
            int r4 = r4.f35B
            int r3 = r3 / r4
            int r4 = r13.f24f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f30l = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f28j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p004l.p005a.C0020b.m4230a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m4234a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f26h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.a.l.a.b$c r0 = r9.f20b
            int r0 = r0.f35B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f23e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f22d
            if (r0 == 0) goto L_0x0029
            r9.f23e = r0
            a.a.l.a.b$c r0 = r9.f20b
            int r0 = r0.f35B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f30l = r0
            goto L_0x0035
        L_0x0029:
            r9.f23e = r4
            r9.f30l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f22d
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            a.a.l.a.b$c r0 = r9.f20b
            int r1 = r0.f50h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.m4224a(r10)
            r9.f22d = r0
            r9.f26h = r10
            if (r0 == 0) goto L_0x005a
            a.a.l.a.b$c r10 = r9.f20b
            int r10 = r10.f34A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f29k = r2
        L_0x0051:
            r9.m4231a(r0)
            goto L_0x005a
        L_0x0055:
            r9.f22d = r4
            r10 = -1
            r9.f26h = r10
        L_0x005a:
            long r0 = r9.f29k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f30l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f28j
            if (r0 != 0) goto L_0x0073
            a.a.l.a.b$a r0 = new a.a.l.a.b$a
            r0.<init>()
            r9.f28j = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.m4230a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p004l.p005a.C0020b.m4234a(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f20b.m4223a(theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m4229b() {
        return this.f26h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f20b.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f22d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f23e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f20b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f20b.m4225a()) {
            return null;
        }
        this.f20b.f46d = getChangingConfigurations();
        return this.f20b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f22d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f21c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f20b.m4204l()) {
            return this.f20b.m4211e();
        }
        Drawable drawable = this.f22d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f20b.m4204l()) {
            return this.f20b.m4207i();
        }
        Drawable drawable = this.f22d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f20b.m4204l()) {
            return this.f20b.m4210f();
        }
        Drawable drawable = this.f22d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f20b.m4204l()) {
            return this.f20b.m4209g();
        }
        Drawable drawable = this.f22d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f22d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f20b.m4206j();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f22d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h = this.f20b.m4208h();
        if (h != null) {
            rect.set(h);
            z = (h.right | ((h.left | h.top) | h.bottom)) != 0;
        } else {
            Drawable drawable = this.f22d;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m4228c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC0023c cVar = this.f20b;
        if (cVar != null) {
            cVar.m4205k();
        }
        if (drawable == this.f22d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f20b.f36C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f23e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f23e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f22d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f25g) {
                this.f22d.setAlpha(this.f24f);
            }
        }
        if (this.f30l != 0) {
            this.f30l = 0L;
            z = true;
        }
        if (this.f29k != 0) {
            this.f29k = 0L;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f27i && super.mutate() == this) {
            AbstractC0023c a = mo4193a();
            a.mo4187m();
            mo4192a(a);
            this.f27i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f22d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f20b.m4217b(i, m4229b());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f23e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f22d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f23e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f22d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f22d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.f25g || this.f24f != i) {
            this.f25g = true;
            this.f24f = i;
            Drawable drawable = this.f22d;
            if (drawable == null) {
                return;
            }
            if (this.f29k == 0) {
                drawable.setAlpha(i);
            } else {
                m4230a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC0023c cVar = this.f20b;
        if (cVar.f36C != z) {
            cVar.f36C = z;
            Drawable drawable = this.f22d;
            if (drawable != null) {
                C0698a.m1599a(drawable, cVar.f36C);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC0023c cVar = this.f20b;
        cVar.f38E = true;
        if (cVar.f37D != colorFilter) {
            cVar.f37D = colorFilter;
            Drawable drawable = this.f22d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC0023c cVar = this.f20b;
        if (cVar.f66x != z) {
            cVar.f66x = z;
            Drawable drawable = this.f22d;
            if (drawable != null) {
                drawable.setDither(cVar.f66x);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f22d;
        if (drawable != null) {
            C0698a.m1606a(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f21c;
        if (rect == null) {
            this.f21c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f22d;
        if (drawable != null) {
            C0698a.m1604a(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC0023c cVar = this.f20b;
        cVar.f41H = true;
        if (cVar.f39F != colorStateList) {
            cVar.f39F = colorStateList;
            C0698a.m1603a(this.f22d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC0023c cVar = this.f20b;
        cVar.f42I = true;
        if (cVar.f40G != mode) {
            cVar.f40G = mode;
            C0698a.m1600a(this.f22d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f23e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f22d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f22d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
