package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.graphics.drawable.C0698a;
import java.util.ArrayList;
import java.util.List;
import p000a.p018g.p019d.C0124a;
import p000a.p018g.p029l.C0185a;
import p000a.p018g.p029l.C0200c;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.p030a0.C0191c;
import p000a.p033i.p034a.AbstractC0237a;
import p000a.p033i.p035b.C0240a;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: L */
    private static final int[] f2722L = {16843828};

    /* renamed from: M */
    static final int[] f2723M = {16842931};

    /* renamed from: N */
    static final boolean f2724N;

    /* renamed from: O */
    private static final boolean f2725O;

    /* renamed from: A */
    private CharSequence f2726A;

    /* renamed from: B */
    private CharSequence f2727B;

    /* renamed from: C */
    private Object f2728C;

    /* renamed from: D */
    private boolean f2729D;

    /* renamed from: E */
    private Drawable f2730E;

    /* renamed from: F */
    private Drawable f2731F;

    /* renamed from: G */
    private Drawable f2732G;

    /* renamed from: H */
    private Drawable f2733H;

    /* renamed from: I */
    private final ArrayList<View> f2734I;

    /* renamed from: J */
    private Rect f2735J;

    /* renamed from: K */
    private Matrix f2736K;

    /* renamed from: b */
    private final C0726c f2737b;

    /* renamed from: c */
    private float f2738c;

    /* renamed from: d */
    private int f2739d;

    /* renamed from: e */
    private int f2740e;

    /* renamed from: f */
    private float f2741f;

    /* renamed from: g */
    private Paint f2742g;

    /* renamed from: h */
    private final C0240a f2743h;

    /* renamed from: i */
    private final C0240a f2744i;

    /* renamed from: j */
    private final C0731g f2745j;

    /* renamed from: k */
    private final C0731g f2746k;

    /* renamed from: l */
    private int f2747l;

    /* renamed from: m */
    private boolean f2748m;

    /* renamed from: n */
    private boolean f2749n;

    /* renamed from: o */
    private int f2750o;

    /* renamed from: p */
    private int f2751p;

    /* renamed from: q */
    private int f2752q;

    /* renamed from: r */
    private int f2753r;

    /* renamed from: s */
    private boolean f2754s;

    /* renamed from: t */
    private AbstractC0727d f2755t;

    /* renamed from: u */
    private List<AbstractC0727d> f2756u;

    /* renamed from: v */
    private float f2757v;

    /* renamed from: w */
    private float f2758w;

    /* renamed from: x */
    private Drawable f2759x;

    /* renamed from: y */
    private Drawable f2760y;

    /* renamed from: z */
    private Drawable f2761z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    /* loaded from: classes.dex */
    class View$OnApplyWindowInsetsListenerC0724a implements View.OnApplyWindowInsetsListener {
        View$OnApplyWindowInsetsListenerC0724a(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).m1465a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    /* loaded from: classes.dex */
    class C0725b extends C0185a {

        /* renamed from: c */
        private final Rect f2762c = new Rect();

        C0725b() {
        }

        /* renamed from: a */
        private void m1429a(C0191c cVar, C0191c cVar2) {
            Rect rect = this.f2762c;
            cVar2.m3541a(rect);
            cVar.m3527c(rect);
            cVar2.m3533b(rect);
            cVar.m3522d(rect);
            cVar.m3507k(cVar2.m3500r());
            cVar.m3525c(cVar2.m3523d());
            cVar.m3538a(cVar2.m3535b());
            cVar.m3531b(cVar2.m3528c());
            cVar.m3519e(cVar2.m3508k());
            cVar.m3521d(cVar2.m3510j());
            cVar.m3517f(cVar2.m3506l());
            cVar.m3515g(cVar2.m3505m());
            cVar.m3536a(cVar2.m3516g());
            cVar.m3509j(cVar2.m3501q());
            cVar.m3513h(cVar2.m3504n());
            cVar.m3544a(cVar2.m3545a());
        }

        /* renamed from: a */
        private void m1428a(C0191c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m1430m(childAt)) {
                    cVar.m3540a(childAt);
                }
            }
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(View view, C0191c cVar) {
            if (DrawerLayout.f2724N) {
                super.mo143a(view, cVar);
            } else {
                C0191c a = C0191c.m3542a(cVar);
                super.mo143a(view, a);
                cVar.m3526c(view);
                ViewParent o = C0216r.m3406o(view);
                if (o instanceof View) {
                    cVar.m3532b((View) o);
                }
                m1429a(cVar, a);
                a.m3499s();
                m1428a(cVar, (ViewGroup) view);
            }
            cVar.m3538a((CharSequence) DrawerLayout.class.getName());
            cVar.m3517f(false);
            cVar.m3515g(false);
            cVar.m3543a(C0191c.C0192a.f641b);
            cVar.m3543a(C0191c.C0192a.f642c);
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public boolean mo1427a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo1427a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View d = DrawerLayout.this.m1450d();
            if (d == null) {
                return true;
            }
            CharSequence d2 = DrawerLayout.this.m1449d(DrawerLayout.this.m1445e(d));
            if (d2 == null) {
                return true;
            }
            text.add(d2);
            return true;
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public boolean mo1426a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f2724N || DrawerLayout.m1430m(view)) {
                return super.mo1426a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: b */
        public void mo150b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo150b(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    /* loaded from: classes.dex */
    static final class C0726c extends C0185a {
        C0726c() {
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(View view, C0191c cVar) {
            super.mo143a(view, cVar);
            if (!DrawerLayout.m1430m(view)) {
                cVar.m3532b((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    /* loaded from: classes.dex */
    public interface AbstractC0727d {
        /* renamed from: a */
        void mo1425a(int i);

        /* renamed from: a */
        void mo1424a(View view);

        /* renamed from: a */
        void mo1423a(View view, float f);

        /* renamed from: b */
        void mo1422b(View view);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    /* loaded from: classes.dex */
    public static class C0728e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2764a;

        /* renamed from: b */
        float f2765b;

        /* renamed from: c */
        boolean f2766c;

        /* renamed from: d */
        int f2767d;

        public C0728e(int i, int i2) {
            super(i, i2);
            this.f2764a = 0;
        }

        public C0728e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2764a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2723M);
            this.f2764a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0728e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2764a = 0;
        }

        public C0728e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2764a = 0;
        }

        public C0728e(C0728e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f2764a = 0;
            this.f2764a = eVar.f2764a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    /* loaded from: classes.dex */
    public static class C0729f extends AbstractC0237a {
        public static final Parcelable.Creator<C0729f> CREATOR = new C0730a();

        /* renamed from: d */
        int f2768d;

        /* renamed from: e */
        int f2769e;

        /* renamed from: f */
        int f2770f;

        /* renamed from: g */
        int f2771g;

        /* renamed from: h */
        int f2772h;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        /* loaded from: classes.dex */
        static class C0730a implements Parcelable.ClassLoaderCreator<C0729f> {
            C0730a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0729f createFromParcel(Parcel parcel) {
                return new C0729f(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0729f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0729f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public C0729f[] newArray(int i) {
                return new C0729f[i];
            }
        }

        public C0729f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2768d = 0;
            this.f2768d = parcel.readInt();
            this.f2769e = parcel.readInt();
            this.f2770f = parcel.readInt();
            this.f2771g = parcel.readInt();
            this.f2772h = parcel.readInt();
        }

        public C0729f(Parcelable parcelable) {
            super(parcelable);
            this.f2768d = 0;
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2768d);
            parcel.writeInt(this.f2769e);
            parcel.writeInt(this.f2770f);
            parcel.writeInt(this.f2771g);
            parcel.writeInt(this.f2772h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    /* loaded from: classes.dex */
    public class C0731g extends C0240a.AbstractC0243c {

        /* renamed from: a */
        private final int f2773a;

        /* renamed from: b */
        private C0240a f2774b;

        /* renamed from: c */
        private final Runnable f2775c = new RunnableC0732a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g$a */
        /* loaded from: classes.dex */
        class RunnableC0732a implements Runnable {
            RunnableC0732a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0731g.this.m1421a();
            }
        }

        C0731g(int i) {
            this.f2773a = i;
        }

        /* renamed from: c */
        private void m1415c() {
            int i = 3;
            if (this.f2773a == 3) {
                i = 5;
            }
            View b = DrawerLayout.this.m1462b(i);
            if (b != null) {
                DrawerLayout.this.m1470a(b);
            }
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo303a(View view) {
            if (DrawerLayout.this.m1434i(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo237a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.m1468a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* renamed from: a */
        void m1421a() {
            View view;
            int i;
            int c = this.f2774b.m3318c();
            int i2 = 0;
            boolean z = this.f2773a == 3;
            if (z) {
                view = DrawerLayout.this.m1462b(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + c;
            } else {
                view = DrawerLayout.this.m1462b(5);
                i = DrawerLayout.this.getWidth() - c;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.m1448d(view) == 0) {
                this.f2774b.m3319b(view, i, view.getTop());
                ((C0728e) view.getLayoutParams()).f2766c = true;
                DrawerLayout.this.invalidate();
                m1415c();
                DrawerLayout.this.m1478a();
            }
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo1420a(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View b = drawerLayout.m1462b(i3);
            if (b != null && DrawerLayout.this.m1448d(b) == 0) {
                this.f2774b.m3334a(b, i2);
            }
        }

        /* renamed from: a */
        public void m1419a(C0240a aVar) {
            this.f2774b = aVar;
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo238a(View view, float f, float f2) {
            int i;
            float f3 = DrawerLayout.this.m1442f(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m1468a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                i = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    i -= width;
                }
            }
            this.f2774b.m3312d(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo301a(View view, int i) {
            ((C0728e) view.getLayoutParams()).f2766c = false;
            m1415c();
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo236a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.m1468a(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.m1452c(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public int mo233b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public void m1418b() {
            DrawerLayout.this.removeCallbacks(this.f2775c);
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public void mo1416b(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f2775c, 160L);
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public boolean mo1417b(int i) {
            return false;
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public boolean mo234b(View view, int i) {
            return DrawerLayout.this.m1434i(view) && DrawerLayout.this.m1468a(view, this.f2773a) && DrawerLayout.this.m1448d(view) == 0;
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: c */
        public void mo232c(int i) {
            DrawerLayout.this.m1474a(this.f2773a, i, this.f2774b.m3328b());
        }
    }

    static {
        boolean z = true;
        f2724N = Build.VERSION.SDK_INT >= 19;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        f2725O = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2737b = new C0726c();
        this.f2740e = -1728053248;
        this.f2742g = new Paint();
        this.f2749n = true;
        this.f2750o = 3;
        this.f2751p = 3;
        this.f2752q = 3;
        this.f2753r = 3;
        this.f2730E = null;
        this.f2731F = null;
        this.f2732G = null;
        this.f2733H = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2739d = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f2745j = new C0731g(3);
        this.f2746k = new C0731g(5);
        this.f2743h = C0240a.m3331a(this, 1.0f, this.f2745j);
        this.f2743h.m3313d(1);
        this.f2743h.m3345a(f2);
        this.f2745j.m1419a(this.f2743h);
        this.f2744i = C0240a.m3331a(this, 1.0f, this.f2746k);
        this.f2744i.m3313d(2);
        this.f2744i.m3345a(f2);
        this.f2746k.m1419a(this.f2744i);
        setFocusableInTouchMode(true);
        C0216r.m3418e(this, 1);
        C0216r.m3440a(this, new C0725b());
        setMotionEventSplittingEnabled(false);
        if (C0216r.m3415g(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0724a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2722L);
                try {
                    this.f2759x = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f2759x = null;
            }
        }
        this.f2738c = f * 10.0f;
        this.f2734I = new ArrayList<>();
    }

    /* renamed from: a */
    private boolean m1477a(float f, float f2, View view) {
        if (this.f2735J == null) {
            this.f2735J = new Rect();
        }
        view.getHitRect(this.f2735J);
        return this.f2735J.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    private boolean m1472a(Drawable drawable, int i) {
        if (drawable == null || !C0698a.m1593f(drawable)) {
            return false;
        }
        C0698a.m1605a(drawable, i);
        return true;
    }

    /* renamed from: a */
    private boolean m1471a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b = m1460b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b);
            b.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: b */
    private MotionEvent m1460b(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f2736K == null) {
                this.f2736K = new Matrix();
            }
            matrix.invert(this.f2736K);
            obtain.transform(this.f2736K);
        }
        return obtain;
    }

    /* renamed from: c */
    private void m1451c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0216r.m3418e(childAt, ((z || m1434i(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: e */
    private boolean m1447e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0728e) getChildAt(i).getLayoutParams()).f2766c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m1444f() {
        return m1450d() != null;
    }

    /* renamed from: g */
    private Drawable m1441g() {
        int j = C0216r.m3411j(this);
        if (j == 0) {
            Drawable drawable = this.f2730E;
            if (drawable != null) {
                m1472a(drawable, j);
                return this.f2730E;
            }
        } else {
            Drawable drawable2 = this.f2731F;
            if (drawable2 != null) {
                m1472a(drawable2, j);
                return this.f2731F;
            }
        }
        return this.f2732G;
    }

    /* renamed from: h */
    private Drawable m1438h() {
        int j = C0216r.m3411j(this);
        if (j == 0) {
            Drawable drawable = this.f2731F;
            if (drawable != null) {
                m1472a(drawable, j);
                return this.f2731F;
            }
        } else {
            Drawable drawable2 = this.f2730E;
            if (drawable2 != null) {
                m1472a(drawable2, j);
                return this.f2730E;
            }
        }
        return this.f2733H;
    }

    /* renamed from: h */
    static String m1437h(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: i */
    private void m1435i() {
        if (!f2725O) {
            this.f2760y = m1441g();
            this.f2761z = m1438h();
        }
    }

    /* renamed from: l */
    private static boolean m1431l(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: m */
    static boolean m1430m(View view) {
        return (C0216r.m3413h(view) == 4 || C0216r.m3413h(view) == 2) ? false : true;
    }

    /* renamed from: a */
    void m1478a() {
        if (!this.f2754s) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f2754s = true;
        }
    }

    /* renamed from: a */
    public void m1476a(int i) {
        m1473a(i, true);
    }

    /* renamed from: a */
    public void m1475a(int i, int i2) {
        View b;
        int a = C0200c.m3490a(i2, C0216r.m3411j(this));
        if (i2 == 3) {
            this.f2750o = i;
        } else if (i2 == 5) {
            this.f2751p = i;
        } else if (i2 == 8388611) {
            this.f2752q = i;
        } else if (i2 == 8388613) {
            this.f2753r = i;
        }
        if (i != 0) {
            (a == 3 ? this.f2743h : this.f2744i).m3346a();
        }
        if (i == 1) {
            View b2 = m1462b(a);
            if (b2 != null) {
                m1470a(b2);
            }
        } else if (i == 2 && (b = m1462b(a)) != null) {
            m1432k(b);
        }
    }

    /* renamed from: a */
    void m1474a(int i, int i2, View view) {
        int e = this.f2743h.m3311e();
        int e2 = this.f2744i.m3311e();
        int i3 = 2;
        if (e == 1 || e2 == 1) {
            i3 = 1;
        } else if (!(e == 2 || e2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C0728e) view.getLayoutParams()).f2765b;
            if (f == 0.0f) {
                m1459b(view);
            } else if (f == 1.0f) {
                m1453c(view);
            }
        }
        if (i3 != this.f2747l) {
            this.f2747l = i3;
            List<AbstractC0727d> list = this.f2756u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2756u.get(size).mo1425a(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void m1473a(int i, boolean z) {
        View b = m1462b(i);
        if (b != null) {
            m1467a(b, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m1437h(i));
    }

    /* renamed from: a */
    public void m1470a(View view) {
        m1467a(view, true);
    }

    /* renamed from: a */
    void m1469a(View view, float f) {
        List<AbstractC0727d> list = this.f2756u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2756u.get(size).mo1423a(view, f);
            }
        }
    }

    /* renamed from: a */
    public void m1467a(View view, boolean z) {
        C0240a aVar;
        int i;
        if (m1434i(view)) {
            C0728e eVar = (C0728e) view.getLayoutParams();
            if (this.f2749n) {
                eVar.f2765b = 0.0f;
                eVar.f2767d = 0;
            } else if (z) {
                eVar.f2767d |= 4;
                if (m1468a(view, 3)) {
                    aVar = this.f2743h;
                    i = -view.getWidth();
                } else {
                    aVar = this.f2744i;
                    i = getWidth();
                }
                aVar.m3319b(view, i, view.getTop());
            } else {
                m1458b(view, 0.0f);
                m1474a(eVar.f2764a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: a */
    public void m1466a(AbstractC0727d dVar) {
        if (dVar != null) {
            if (this.f2756u == null) {
                this.f2756u = new ArrayList();
            }
            this.f2756u.add(dVar);
        }
    }

    /* renamed from: a */
    public void m1465a(Object obj, boolean z) {
        this.f2728C = obj;
        this.f2729D = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: a */
    void m1464a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0728e eVar = (C0728e) childAt.getLayoutParams();
            if (m1434i(childAt) && (!z || eVar.f2766c)) {
                z2 |= m1468a(childAt, 3) ? this.f2743h.m3319b(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2744i.m3319b(childAt, getWidth(), childAt.getTop());
                eVar.f2766c = false;
            }
        }
        this.f2745j.m1418b();
        this.f2746k.m1418b();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: a */
    boolean m1468a(View view, int i) {
        return (m1445e(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!m1434i(childAt)) {
                    this.f2734I.add(childAt);
                } else if (m1436h(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f2734I.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f2734I.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f2734I.clear();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C0216r.m3418e(view, (m1455c() != null || m1434i(view)) ? 4 : 1);
        if (!f2724N) {
            C0216r.m3440a(view, this.f2737b);
        }
    }

    /* renamed from: b */
    View m1462b(int i) {
        int a = C0200c.m3490a(i, C0216r.m3411j(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m1445e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m1463b() {
        m1464a(false);
    }

    /* renamed from: b */
    public void m1461b(int i, boolean z) {
        View b = m1462b(i);
        if (b != null) {
            m1457b(b, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m1437h(i));
    }

    /* renamed from: b */
    void m1459b(View view) {
        View rootView;
        C0728e eVar = (C0728e) view.getLayoutParams();
        if ((eVar.f2767d & 1) == 1) {
            eVar.f2767d = 0;
            List<AbstractC0727d> list = this.f2756u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2756u.get(size).mo1422b(view);
                }
            }
            m1451c(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: b */
    void m1458b(View view, float f) {
        float f2 = m1442f(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!m1468a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m1452c(view, f);
    }

    /* renamed from: b */
    public void m1457b(View view, boolean z) {
        if (m1434i(view)) {
            C0728e eVar = (C0728e) view.getLayoutParams();
            if (this.f2749n) {
                eVar.f2765b = 1.0f;
                eVar.f2767d = 1;
                m1451c(view, true);
            } else if (z) {
                eVar.f2767d |= 2;
                if (m1468a(view, 3)) {
                    this.f2743h.m3319b(view, 0, view.getTop());
                } else {
                    this.f2744i.m3319b(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m1458b(view, 1.0f);
                m1474a(eVar.f2764a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: b */
    public void m1456b(AbstractC0727d dVar) {
        List<AbstractC0727d> list;
        if (dVar != null && (list = this.f2756u) != null) {
            list.remove(dVar);
        }
    }

    /* renamed from: c */
    public int m1454c(int i) {
        int j = C0216r.m3411j(this);
        if (i == 3) {
            int i2 = this.f2750o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = j == 0 ? this.f2752q : this.f2753r;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f2751p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = j == 0 ? this.f2753r : this.f2752q;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f2752q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = j == 0 ? this.f2750o : this.f2751p;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f2753r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = j == 0 ? this.f2751p : this.f2750o;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    /* renamed from: c */
    View m1455c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0728e) childAt.getLayoutParams()).f2767d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    void m1453c(View view) {
        C0728e eVar = (C0728e) view.getLayoutParams();
        if ((eVar.f2767d & 1) == 0) {
            eVar.f2767d = 1;
            List<AbstractC0727d> list = this.f2756u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2756u.get(size).mo1424a(view);
                }
            }
            m1451c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: c */
    void m1452c(View view, float f) {
        C0728e eVar = (C0728e) view.getLayoutParams();
        if (f != eVar.f2765b) {
            eVar.f2765b = f;
            m1469a(view, f);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0728e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0728e) getChildAt(i).getLayoutParams()).f2765b);
        }
        this.f2741f = f;
        boolean a = this.f2743h.m3329a(true);
        boolean a2 = this.f2744i.m3329a(true);
        if (a || a2) {
            C0216r.m3450A(this);
        }
    }

    /* renamed from: d */
    public int m1448d(View view) {
        if (m1434i(view)) {
            return m1454c(((C0728e) view.getLayoutParams()).f2764a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: d */
    View m1450d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1434i(childAt) && m1433j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public CharSequence m1449d(int i) {
        int a = C0200c.m3490a(i, C0216r.m3411j(this));
        if (a == 3) {
            return this.f2726A;
        }
        if (a == 5) {
            return this.f2727B;
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2741f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m1477a(x, y, childAt) && !m1439g(childAt) && m1471a(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Drawable drawable;
        int height = getHeight();
        boolean g = m1439g(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (g) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && m1431l(childAt) && m1434i(childAt) && childAt.getHeight() >= height) {
                    if (m1468a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f2741f;
        if (f <= 0.0f || !g) {
            if (this.f2760y != null && m1468a(view, 3)) {
                int intrinsicWidth = this.f2760y.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.f2743h.m3318c(), 1.0f));
                this.f2760y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f2760y.setAlpha((int) (max * 255.0f));
                drawable = this.f2760y;
            } else if (this.f2761z != null && m1468a(view, 5)) {
                int intrinsicWidth2 = this.f2761z.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f2744i.m3318c(), 1.0f));
                this.f2761z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f2761z.setAlpha((int) (max2 * 255.0f));
                drawable = this.f2761z;
            }
            drawable.draw(canvas);
        } else {
            int i5 = this.f2740e;
            this.f2742g.setColor((i5 & 16777215) | (((int) ((((-16777216) & i5) >>> 24) * f)) << 24));
            canvas.drawRect(i2, 0.0f, i, getHeight(), this.f2742g);
        }
        return drawChild;
    }

    /* renamed from: e */
    int m1445e(View view) {
        return C0200c.m3490a(((C0728e) view.getLayoutParams()).f2764a, C0216r.m3411j(this));
    }

    /* renamed from: e */
    public boolean m1446e(int i) {
        View b = m1462b(i);
        if (b != null) {
            return m1436h(b);
        }
        return false;
    }

    /* renamed from: f */
    float m1442f(View view) {
        return ((C0728e) view.getLayoutParams()).f2765b;
    }

    /* renamed from: f */
    public boolean m1443f(int i) {
        View b = m1462b(i);
        if (b != null) {
            return m1433j(b);
        }
        return false;
    }

    /* renamed from: g */
    public void m1440g(int i) {
        m1461b(i, true);
    }

    /* renamed from: g */
    boolean m1439g(View view) {
        return ((C0728e) view.getLayoutParams()).f2764a == 0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0728e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0728e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0728e ? new C0728e((C0728e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0728e((ViewGroup.MarginLayoutParams) layoutParams) : new C0728e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f2725O) {
            return this.f2738c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2759x;
    }

    /* renamed from: h */
    public boolean m1436h(View view) {
        if (m1434i(view)) {
            return (((C0728e) view.getLayoutParams()).f2767d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: i */
    boolean m1434i(View view) {
        int a = C0200c.m3490a(((C0728e) view.getLayoutParams()).f2764a, C0216r.m3411j(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    /* renamed from: j */
    public boolean m1433j(View view) {
        if (m1434i(view)) {
            return ((C0728e) view.getLayoutParams()).f2765b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: k */
    public void m1432k(View view) {
        m1457b(view, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2749n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2749n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (this.f2729D && this.f2759x != null) {
            int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.f2728C) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.f2759x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f2759x.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            a.i.b.a r1 = r6.f2743h
            boolean r1 = r1.m3321b(r7)
            a.i.b.a r2 = r6.f2744i
            boolean r2 = r2.m3321b(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            a.i.b.a r7 = r6.f2743h
            boolean r7 = r7.m3340a(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f2745j
            r7.m1418b()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f2746k
            r7.m1418b()
            goto L_0x0036
        L_0x0031:
            r6.m1464a(r2)
            r6.f2754s = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2757v = r0
            r6.f2758w = r7
            float r4 = r6.f2741f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            a.i.b.a r4 = r6.f2743h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.m3324b(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.m1439g(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.f2754s = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.m1447e()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f2754s
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m1444f()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View d = m1450d();
        if (d != null && m1448d(d) == 0) {
            m1463b();
        }
        return d != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        int i8;
        this.f2748m = true;
        int i9 = i3 - i;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0728e eVar = (C0728e) childAt.getLayoutParams();
                if (m1439g(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (m1468a(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (eVar.f2765b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i9 - i8) / f3;
                        i5 = i9 - ((int) (eVar.f2765b * f3));
                    }
                    boolean z2 = f != eVar.f2765b;
                    int i12 = eVar.f2764a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        m1452c(childAt, f);
                    }
                    int i19 = eVar.f2765b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.f2748m = false;
        this.f2749n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f2728C != null && C0216r.m3415g(this);
        int j = C0216r.m3411j(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0728e eVar = (C0728e) childAt.getLayoutParams();
                if (z) {
                    int a = C0200c.m3490a(eVar.f2764a, j);
                    boolean g = C0216r.m3415g(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (g) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f2728C;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f2728C;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m1439g(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else if (m1434i(childAt)) {
                    if (f2725O) {
                        float f = C0216r.m3417f(childAt);
                        float f2 = this.f2738c;
                        if (f != f2) {
                            C0216r.m3444a(childAt, f2);
                        }
                    }
                    int e = m1445e(childAt) & 7;
                    boolean z4 = e == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f2739d + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m1437h(e) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View b;
        if (!(parcelable instanceof C0729f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0729f fVar = (C0729f) parcelable;
        super.onRestoreInstanceState(fVar.m3347a());
        int i = fVar.f2768d;
        if (!(i == 0 || (b = m1462b(i)) == null)) {
            m1432k(b);
        }
        int i2 = fVar.f2769e;
        if (i2 != 3) {
            m1475a(i2, 3);
        }
        int i3 = fVar.f2770f;
        if (i3 != 3) {
            m1475a(i3, 5);
        }
        int i4 = fVar.f2771g;
        if (i4 != 3) {
            m1475a(i4, 8388611);
        }
        int i5 = fVar.f2772h;
        if (i5 != 3) {
            m1475a(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m1435i();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0729f fVar = new C0729f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0728e eVar = (C0728e) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = eVar.f2767d == 1;
            if (eVar.f2767d != 2) {
                z = false;
            }
            if (z2 || z) {
                fVar.f2768d = eVar.f2764a;
                break;
            }
        }
        fVar.f2769e = this.f2750o;
        fVar.f2770f = this.f2751p;
        fVar.f2771g = this.f2752q;
        fVar.f2772h = this.f2753r;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (m1448d(r7) != 2) goto L_0x005c;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            a.i.b.a r0 = r6.f2743h
            r0.m3336a(r7)
            a.i.b.a r0 = r6.f2744i
            r0.m3336a(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r2) goto L_0x001e
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.m1464a(r2)
            goto L_0x006c
        L_0x001e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            a.i.b.a r3 = r6.f2743h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.m3324b(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = r6.m1439g(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.f2757v
            float r0 = r0 - r3
            float r3 = r6.f2758w
            float r7 = r7 - r3
            a.i.b.a r3 = r6.f2743h
            int r3 = r3.m3314d()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.m1455c()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.m1448d(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r6.m1464a(r1)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2757v = r0
            r6.f2758w = r7
        L_0x006c:
            r6.f2754s = r1
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m1464a(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f2748m) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f2738c = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m1434i(childAt)) {
                C0216r.m3444a(childAt, this.f2738c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(AbstractC0727d dVar) {
        AbstractC0727d dVar2 = this.f2755t;
        if (dVar2 != null) {
            m1456b(dVar2);
        }
        if (dVar != null) {
            m1466a(dVar);
        }
        this.f2755t = dVar;
    }

    public void setDrawerLockMode(int i) {
        m1475a(i, 3);
        m1475a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f2740e = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f2759x = i != 0 ? C0124a.m3732b(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2759x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f2759x = new ColorDrawable(i);
        invalidate();
    }
}
