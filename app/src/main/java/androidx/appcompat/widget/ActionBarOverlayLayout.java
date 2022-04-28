package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.AbstractC0513p;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p018g.p029l.AbstractC0211m;
import p000a.p018g.p029l.C0212n;
import p000a.p018g.p029l.C0216r;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements AbstractC0566a0, AbstractC0211m {

    /* renamed from: C */
    static final int[] f1833C = {C0000a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f1834A;

    /* renamed from: B */
    private final C0212n f1835B;

    /* renamed from: b */
    private int f1836b;

    /* renamed from: c */
    private int f1837c;

    /* renamed from: d */
    private ContentFrameLayout f1838d;

    /* renamed from: e */
    ActionBarContainer f1839e;

    /* renamed from: f */
    private AbstractC0569b0 f1840f;

    /* renamed from: g */
    private Drawable f1841g;

    /* renamed from: h */
    private boolean f1842h;

    /* renamed from: i */
    private boolean f1843i;

    /* renamed from: j */
    private boolean f1844j;

    /* renamed from: k */
    private boolean f1845k;

    /* renamed from: l */
    boolean f1846l;

    /* renamed from: m */
    private int f1847m;

    /* renamed from: n */
    private int f1848n;

    /* renamed from: o */
    private final Rect f1849o;

    /* renamed from: p */
    private final Rect f1850p;

    /* renamed from: q */
    private final Rect f1851q;

    /* renamed from: r */
    private final Rect f1852r;

    /* renamed from: s */
    private final Rect f1853s;

    /* renamed from: t */
    private final Rect f1854t;

    /* renamed from: u */
    private final Rect f1855u;

    /* renamed from: v */
    private AbstractC0529d f1856v;

    /* renamed from: w */
    private OverScroller f1857w;

    /* renamed from: x */
    ViewPropertyAnimator f1858x;

    /* renamed from: y */
    final AnimatorListenerAdapter f1859y;

    /* renamed from: z */
    private final Runnable f1860z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    class C0526a extends AnimatorListenerAdapter {
        C0526a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1858x = null;
            actionBarOverlayLayout.f1846l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1858x = null;
            actionBarOverlayLayout.f1846l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    class RunnableC0527b implements Runnable {
        RunnableC0527b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m2279h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1858x = actionBarOverlayLayout.f1839e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1859y);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    class RunnableC0528c implements Runnable {
        RunnableC0528c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m2279h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1858x = actionBarOverlayLayout.f1839e.animate().translationY(-ActionBarOverlayLayout.this.f1839e.getHeight()).setListener(ActionBarOverlayLayout.this.f1859y);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface AbstractC0529d {
        /* renamed from: a */
        void mo2272a();

        /* renamed from: a */
        void mo2271a(int i);

        /* renamed from: a */
        void mo2270a(boolean z);

        /* renamed from: b */
        void mo2269b();

        /* renamed from: c */
        void mo2268c();

        /* renamed from: d */
        void mo2267d();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0530e extends ViewGroup.MarginLayoutParams {
        public C0530e(int i, int i2) {
            super(i, i2);
        }

        public C0530e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0530e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1837c = 0;
        this.f1849o = new Rect();
        this.f1850p = new Rect();
        this.f1851q = new Rect();
        this.f1852r = new Rect();
        this.f1853s = new Rect();
        this.f1854t = new Rect();
        this.f1855u = new Rect();
        this.f1859y = new C0526a();
        this.f1860z = new RunnableC0527b();
        this.f1834A = new RunnableC0528c();
        m2282a(context);
        this.f1835B = new C0212n(this);
    }

    /* renamed from: a */
    private AbstractC0569b0 m2281a(View view) {
        if (view instanceof AbstractC0569b0) {
            return (AbstractC0569b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m2282a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1833C);
        boolean z = false;
        this.f1836b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1841g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1841g == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1842h = z;
        this.f1857w = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m2283a(float f, float f2) {
        this.f1857w.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1857w.getFinalY() > this.f1839e.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2280a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0530e) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = 1
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = 1
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = 1
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            r5 = 1
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m2280a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: k */
    private void m2276k() {
        m2279h();
        this.f1834A.run();
    }

    /* renamed from: l */
    private void m2275l() {
        m2279h();
        postDelayed(this.f1834A, 600L);
    }

    /* renamed from: m */
    private void m2274m() {
        m2279h();
        postDelayed(this.f1860z, 600L);
    }

    /* renamed from: n */
    private void m2273n() {
        m2279h();
        this.f1860z.run();
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: a */
    public void mo2146a(int i) {
        m2277j();
        if (i == 2) {
            this.f1840f.mo1861i();
        } else if (i == 5) {
            this.f1840f.mo1857m();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: a */
    public void mo2145a(Menu menu, AbstractC0513p.AbstractC0514a aVar) {
        m2277j();
        this.f1840f.mo1883a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: a */
    public boolean mo2147a() {
        m2277j();
        return this.f1840f.mo1887a();
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: b */
    public boolean mo2144b() {
        m2277j();
        return this.f1840f.mo1877b();
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: c */
    public void mo2143c() {
        m2277j();
        this.f1840f.mo1872c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0530e;
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: d */
    public boolean mo2142d() {
        m2277j();
        return this.f1840f.mo1869d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1841g != null && !this.f1842h) {
            int bottom = this.f1839e.getVisibility() == 0 ? (int) (this.f1839e.getBottom() + this.f1839e.getTranslationY() + 0.5f) : 0;
            this.f1841g.setBounds(0, bottom, getWidth(), this.f1841g.getIntrinsicHeight() + bottom);
            this.f1841g.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: e */
    public boolean mo2141e() {
        m2277j();
        return this.f1840f.mo1866e();
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: f */
    public boolean mo2140f() {
        m2277j();
        return this.f1840f.mo1864f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        m2277j();
        int q = C0216r.m3404q(this) & 256;
        boolean a = m2280a(this.f1839e, rect, true, true, false, true);
        this.f1852r.set(rect);
        C0661z0.m1763a(this, this.f1852r, this.f1849o);
        if (!this.f1853s.equals(this.f1852r)) {
            this.f1853s.set(this.f1852r);
            a = true;
        }
        if (!this.f1850p.equals(this.f1849o)) {
            this.f1850p.set(this.f1849o);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    /* renamed from: g */
    public void mo2139g() {
        m2277j();
        this.f1840f.mo1863g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0530e generateDefaultLayoutParams() {
        return new C0530e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0530e(layoutParams);
    }

    @Override // android.view.ViewGroup
    public C0530e generateLayoutParams(AttributeSet attributeSet) {
        return new C0530e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1839e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1835B.m3454a();
    }

    public CharSequence getTitle() {
        m2277j();
        return this.f1840f.getTitle();
    }

    /* renamed from: h */
    void m2279h() {
        removeCallbacks(this.f1860z);
        removeCallbacks(this.f1834A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1858x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public boolean m2278i() {
        return this.f1843i;
    }

    /* renamed from: j */
    void m2277j() {
        if (this.f1838d == null) {
            this.f1838d = (ContentFrameLayout) findViewById(C0005f.action_bar_activity_content);
            this.f1839e = (ActionBarContainer) findViewById(C0005f.action_bar_container);
            this.f1840f = m2281a(findViewById(C0005f.action_bar));
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2282a(getContext());
        C0216r.m3449B(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2279h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0530e eVar = (C0530e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        m2277j();
        measureChildWithMargins(this.f1839e, i, 0, i2, 0);
        C0530e eVar = (C0530e) this.f1839e.getLayoutParams();
        int max = Math.max(0, this.f1839e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1839e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1839e.getMeasuredState());
        boolean z = (C0216r.m3404q(this) & 256) != 0;
        if (z) {
            i3 = this.f1836b;
            if (this.f1844j && this.f1839e.getTabContainer() != null) {
                i3 += this.f1836b;
            }
        } else {
            i3 = this.f1839e.getVisibility() != 8 ? this.f1839e.getMeasuredHeight() : 0;
        }
        this.f1851q.set(this.f1849o);
        this.f1854t.set(this.f1852r);
        Rect rect = (this.f1843i || z) ? this.f1854t : this.f1851q;
        rect.top += i3;
        rect.bottom += 0;
        m2280a(this.f1838d, this.f1851q, true, true, true, true);
        if (!this.f1855u.equals(this.f1854t)) {
            this.f1855u.set(this.f1854t);
            this.f1838d.m2246a(this.f1854t);
        }
        measureChildWithMargins(this.f1838d, i, 0, i2, 0);
        C0530e eVar2 = (C0530e) this.f1838d.getLayoutParams();
        int max3 = Math.max(max, this.f1838d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1838d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1838d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1845k || !z) {
            return false;
        }
        if (m2283a(f, f2)) {
            m2276k();
        } else {
            m2273n();
        }
        this.f1846l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1847m += i2;
        setActionBarHideOffset(this.f1847m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1835B.m3452a(view, view2, i);
        this.f1847m = getActionBarHideOffset();
        m2279h();
        AbstractC0529d dVar = this.f1856v;
        if (dVar != null) {
            dVar.mo2272a();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1839e.getVisibility() != 0) {
            return false;
        }
        return this.f1845k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onStopNestedScroll(View view) {
        if (this.f1845k && !this.f1846l) {
            if (this.f1847m <= this.f1839e.getHeight()) {
                m2274m();
            } else {
                m2275l();
            }
        }
        AbstractC0529d dVar = this.f1856v;
        if (dVar != null) {
            dVar.mo2267d();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m2277j();
        int i2 = this.f1848n ^ i;
        this.f1848n = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        AbstractC0529d dVar = this.f1856v;
        if (dVar != null) {
            dVar.mo2270a(!z);
            if (z2 || !z) {
                this.f1856v.mo2268c();
            } else {
                this.f1856v.mo2269b();
            }
        }
        if ((i2 & 256) != 0 && this.f1856v != null) {
            C0216r.m3449B(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1837c = i;
        AbstractC0529d dVar = this.f1856v;
        if (dVar != null) {
            dVar.mo2271a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        m2279h();
        this.f1839e.setTranslationY(-Math.max(0, Math.min(i, this.f1839e.getHeight())));
    }

    public void setActionBarVisibilityCallback(AbstractC0529d dVar) {
        this.f1856v = dVar;
        if (getWindowToken() != null) {
            this.f1856v.mo2271a(this.f1837c);
            int i = this.f1848n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0216r.m3449B(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1844j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1845k) {
            this.f1845k = z;
            if (!z) {
                m2279h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m2277j();
        this.f1840f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m2277j();
        this.f1840f.setIcon(drawable);
    }

    public void setLogo(int i) {
        m2277j();
        this.f1840f.mo1876b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1843i = z;
        this.f1842h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    public void setWindowCallback(Window.Callback callback) {
        m2277j();
        this.f1840f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.AbstractC0566a0
    public void setWindowTitle(CharSequence charSequence) {
        m2277j();
        this.f1840f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
