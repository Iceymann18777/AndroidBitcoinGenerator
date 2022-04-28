package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p000a.p018g.p029l.AbstractC0207i;
import p000a.p018g.p029l.AbstractC0210l;
import p000a.p018g.p029l.AbstractC0214p;
import p000a.p018g.p029l.C0185a;
import p000a.p018g.p029l.C0209k;
import p000a.p018g.p029l.C0212n;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.p030a0.C0191c;
import p000a.p018g.p029l.p030a0.C0196e;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements AbstractC0210l, AbstractC0207i, AbstractC0214p {

    /* renamed from: B */
    private static final C0706a f2649B = new C0706a();

    /* renamed from: C */
    private static final int[] f2650C = {16843130};

    /* renamed from: A */
    private AbstractC0707b f2651A;

    /* renamed from: b */
    private long f2652b;

    /* renamed from: c */
    private final Rect f2653c;

    /* renamed from: d */
    private OverScroller f2654d;

    /* renamed from: e */
    private EdgeEffect f2655e;

    /* renamed from: f */
    private EdgeEffect f2656f;

    /* renamed from: g */
    private int f2657g;

    /* renamed from: h */
    private boolean f2658h;

    /* renamed from: i */
    private boolean f2659i;

    /* renamed from: j */
    private View f2660j;

    /* renamed from: k */
    private boolean f2661k;

    /* renamed from: l */
    private VelocityTracker f2662l;

    /* renamed from: m */
    private boolean f2663m;

    /* renamed from: n */
    private boolean f2664n;

    /* renamed from: o */
    private int f2665o;

    /* renamed from: p */
    private int f2666p;

    /* renamed from: q */
    private int f2667q;

    /* renamed from: r */
    private int f2668r;

    /* renamed from: s */
    private final int[] f2669s;

    /* renamed from: t */
    private final int[] f2670t;

    /* renamed from: u */
    private int f2671u;

    /* renamed from: v */
    private int f2672v;

    /* renamed from: w */
    private C0708c f2673w;

    /* renamed from: x */
    private final C0212n f2674x;

    /* renamed from: y */
    private final C0209k f2675y;

    /* renamed from: z */
    private float f2676z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C0706a extends C0185a {
        C0706a() {
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(View view, C0191c cVar) {
            int scrollRange;
            super.mo143a(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.m3538a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.m3511i(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.m3544a(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.m3544a(4096);
                }
            }
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public boolean mo579a(View view, int i, Bundle bundle) {
            if (super.mo579a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m1562b(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m1562b(0, max);
                return true;
            }
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: b */
        public void mo150b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo150b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0196e.m3494a(accessibilityEvent, nestedScrollView.getScrollX());
            C0196e.m3493b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public interface AbstractC0707b {
        /* renamed from: a */
        void mo1545a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public static class C0708c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0708c> CREATOR = new C0709a();

        /* renamed from: b */
        public int f2677b;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        /* loaded from: classes.dex */
        static class C0709a implements Parcelable.Creator<C0708c> {
            C0709a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public C0708c createFromParcel(Parcel parcel) {
                return new C0708c(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public C0708c[] newArray(int i) {
                return new C0708c[i];
            }
        }

        C0708c(Parcel parcel) {
            super(parcel);
            this.f2677b = parcel.readInt();
        }

        C0708c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2677b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2677b);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2653c = new Rect();
        this.f2658h = true;
        this.f2659i = false;
        this.f2660j = null;
        this.f2661k = false;
        this.f2664n = true;
        this.f2668r = -1;
        this.f2669s = new int[2];
        this.f2670t = new int[2];
        m1552e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2650C, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2674x = new C0212n(this);
        this.f2675y = new C0209k(this);
        setNestedScrollingEnabled(true);
        C0216r.m3440a(this, f2649B);
    }

    /* renamed from: a */
    private static int m1580a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    private View m1565a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m1573a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2668r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2657g = (int) motionEvent.getY(i);
            this.f2668r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2662l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m1582a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: a */
    private boolean m1575a(Rect rect, boolean z) {
        int a = m1576a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m1581a(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m1572a(View view) {
        return !m1570a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m1570a(View view, int i, int i2) {
        view.getDrawingRect(this.f2653c);
        offsetDescendantRectToMyCoords(view, this.f2653c);
        return this.f2653c.bottom + i >= getScrollY() && this.f2653c.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m1567a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m1567a((View) parent, view2);
    }

    /* renamed from: b */
    private void m1564b() {
        this.f2661k = false;
        m1548g();
        mo1010a(0);
        EdgeEffect edgeEffect = this.f2655e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2656f.onRelease();
        }
    }

    /* renamed from: b */
    private void m1560b(View view) {
        view.getDrawingRect(this.f2653c);
        offsetDescendantRectToMyCoords(view, this.f2653c);
        int a = m1576a(this.f2653c);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    private boolean m1561b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m1565a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1547g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    private void m1558c() {
        if (getOverScrollMode() == 2) {
            this.f2655e = null;
            this.f2656f = null;
        } else if (this.f2655e == null) {
            Context context = getContext();
            this.f2655e = new EdgeEffect(context);
            this.f2656f = new EdgeEffect(context);
        }
    }

    /* renamed from: d */
    private void m1555d() {
        VelocityTracker velocityTracker = this.f2662l;
        if (velocityTracker == null) {
            this.f2662l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: d */
    private boolean m1553d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m1552e() {
        this.f2654d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2665o = viewConfiguration.getScaledTouchSlop();
        this.f2666p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2667q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: f */
    private void m1550f() {
        if (this.f2662l == null) {
            this.f2662l = VelocityTracker.obtain();
        }
    }

    /* renamed from: g */
    private void m1548g() {
        VelocityTracker velocityTracker = this.f2662l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2662l = null;
        }
    }

    /* renamed from: g */
    private void m1547g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2664n) {
            m1581a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2676z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2676z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2676z;
    }

    /* renamed from: h */
    private void m1546h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            m1557c(i);
        }
    }

    /* renamed from: a */
    protected int m1576a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0207i
    /* renamed from: a */
    public void mo1010a(int i) {
        this.f2675y.m3456c(i);
    }

    /* renamed from: a */
    public final void m1581a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2652b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f2672v = getScrollY();
                OverScroller overScroller = this.f2654d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                C0216r.m3450A(this);
            } else {
                if (!this.f2654d.isFinished()) {
                    this.f2654d.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f2652b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1571a(View view, int i) {
        this.f2674x.m3453a(view, i);
        mo1010a(i);
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1569a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        m1578a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1568a(View view, int i, int i2, int[] iArr, int i3) {
        m1577a(i, i2, iArr, (int[]) null, i3);
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1566a(View view, View view2, int i, int i2) {
        this.f2674x.m3451a(view, view2, i, i2);
        m1556c(2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m1579a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r3 = r12.m1551e(r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f2654d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1579a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean m1578a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f2675y.m3464a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean m1577a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2675y.m3462a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean m1574a(KeyEvent keyEvent) {
        this.f2653c.setEmpty();
        int i = 130;
        if (!m1582a()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? m1563b(33) : m1554d(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? m1563b(130) : m1554d(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            m1549f(i);
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final void m1562b(int i, int i2) {
        m1581a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    public boolean m1563b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1570a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1547g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2653c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2653c);
            m1547g(m1576a(this.f2653c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m1572a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: b */
    public boolean mo1559b(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public void m1557c(int i) {
        if (getChildCount() > 0) {
            m1556c(2, 1);
            this.f2654d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f2672v = getScrollY();
            C0216r.m3450A(this);
        }
    }

    /* renamed from: c */
    public boolean m1556c(int i, int i2) {
        return this.f2675y.m3466a(i, i2);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f2654d.computeScrollOffset()) {
            this.f2654d.getCurrX();
            int currY = this.f2654d.getCurrY();
            int i = currY - this.f2672v;
            if (m1577a(0, i, this.f2670t, (int[]) null, 1)) {
                i -= this.f2670t[1];
            }
            if (i != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                m1579a(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                if (!m1578a(0, scrollY2, 0, i - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        m1558c();
                        if (currY <= 0 && scrollY > 0) {
                            edgeEffect = this.f2655e;
                        } else if (currY >= scrollRange && scrollY < scrollRange) {
                            edgeEffect = this.f2656f;
                        }
                        edgeEffect.onAbsorb((int) this.f2654d.getCurrVelocity());
                    }
                }
            }
            this.f2672v = currY;
            C0216r.m3450A(this);
            return;
        }
        if (m1551e(1)) {
            mo1010a(1);
        }
        this.f2672v = 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public boolean m1554d(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2653c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2653c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2653c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2653c;
        return m1561b(i, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1574a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2675y.m3468a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2675y.m3469a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1577a(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m1578a(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2655e != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f2655e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(i, min);
                this.f2655e.setSize(width, height);
                if (this.f2655e.draw(canvas)) {
                    C0216r.m3450A(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2656f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate(i2 - width2, max);
                canvas.rotate(180.0f, width2, 0.0f);
                this.f2656f.setSize(width2, height2);
                if (this.f2656f.draw(canvas)) {
                    C0216r.m3450A(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean m1551e(int i) {
        return this.f2675y.m3467a(i);
    }

    /* renamed from: f */
    public boolean m1549f(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2653c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2653c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2653c.top = getScrollY() - height;
            Rect rect2 = this.f2653c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2653c;
        int i2 = rect3.top;
        rect3.bottom = height + i2;
        return m1561b(i, i2, rect3.bottom);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2674x.m3454a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m1551e(0);
    }

    @Override // android.view.View, p000a.p018g.p029l.AbstractC0208j
    public boolean isNestedScrollingEnabled() {
        return this.f2675y.m3459b();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2659i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2661k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    verticalScrollFactorCompat = 0;
                } else if (verticalScrollFactorCompat > scrollRange) {
                    verticalScrollFactorCompat = scrollRange;
                }
                if (verticalScrollFactorCompat != scrollY) {
                    super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2661k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2668r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2657g) > this.f2665o && (2 & getNestedScrollAxes()) == 0) {
                                this.f2661k = true;
                                this.f2657g = y;
                                m1550f();
                                this.f2662l.addMovement(motionEvent);
                                this.f2671u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1573a(motionEvent);
                    }
                }
            }
            this.f2661k = false;
            this.f2668r = -1;
            m1548g();
            if (this.f2654d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0216r.m3450A(this);
            }
            mo1010a(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m1553d((int) motionEvent.getX(), y2)) {
                this.f2661k = false;
                m1548g();
            } else {
                this.f2657g = y2;
                this.f2668r = motionEvent.getPointerId(0);
                m1555d();
                this.f2662l.addMovement(motionEvent);
                this.f2654d.computeScrollOffset();
                this.f2661k = !this.f2654d.isFinished();
                m1556c(2, 0);
            }
        }
        return this.f2661k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2658h = false;
        View view = this.f2660j;
        if (view != null && m1567a(view, this)) {
            m1560b(this.f2660j);
        }
        this.f2660j = null;
        if (!this.f2659i) {
            if (this.f2673w != null) {
                scrollTo(getScrollX(), this.f2673w.f2677b);
                this.f2673w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a = m1580a(scrollY, paddingTop, i5);
            if (a != scrollY) {
                scrollTo(getScrollX(), a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2659i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2663m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m1546h((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1568a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1569a(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1566a(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m1572a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0708c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0708c cVar = (C0708c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f2673w = cVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0708c cVar = new C0708c(super.onSaveInstanceState());
        cVar.f2677b = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC0707b bVar = this.f2651A;
        if (bVar != null) {
            bVar.mo1545a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1570a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2653c);
            offsetDescendantRectToMyCoords(findFocus, this.f2653c);
            m1547g(m1576a(this.f2653c));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1559b(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onStopNestedScroll(View view) {
        mo1571a(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r23.f2654d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        p000a.p018g.p029l.C0216r.m3450A(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0216, code lost:
        if (r23.f2654d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0075;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2658h) {
            m1560b(view2);
        } else {
            this.f2660j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1575a(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1548g();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2658h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int a = m1580a(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int a2 = m1580a(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2663m) {
            this.f2663m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f2675y.m3460a(z);
    }

    public void setOnScrollChangeListener(AbstractC0707b bVar) {
        this.f2651A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2664n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m1556c(i, 0);
    }

    @Override // android.view.View, p000a.p018g.p029l.AbstractC0208j
    public void stopNestedScroll() {
        mo1010a(0);
    }
}
