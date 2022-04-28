package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p000a.p001a.C0009j;

/* renamed from: androidx.appcompat.widget.g0 */
/* loaded from: classes.dex */
public class C0593g0 extends ViewGroup {

    /* renamed from: b */
    private boolean f2109b;

    /* renamed from: c */
    private int f2110c;

    /* renamed from: d */
    private int f2111d;

    /* renamed from: e */
    private int f2112e;

    /* renamed from: f */
    private int f2113f;

    /* renamed from: g */
    private int f2114g;

    /* renamed from: h */
    private float f2115h;

    /* renamed from: i */
    private boolean f2116i;

    /* renamed from: j */
    private int[] f2117j;

    /* renamed from: k */
    private int[] f2118k;

    /* renamed from: l */
    private Drawable f2119l;

    /* renamed from: m */
    private int f2120m;

    /* renamed from: n */
    private int f2121n;

    /* renamed from: o */
    private int f2122o;

    /* renamed from: p */
    private int f2123p;

    /* renamed from: androidx.appcompat.widget.g0$a */
    /* loaded from: classes.dex */
    public static class C0594a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f2124a;

        /* renamed from: b */
        public int f2125b;

        public C0594a(int i, int i2) {
            super(i, i2);
            this.f2125b = -1;
            this.f2124a = 0.0f;
        }

        public C0594a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2125b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.LinearLayoutCompat_Layout);
            this.f2124a = obtainStyledAttributes.getFloat(C0009j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f2125b = obtainStyledAttributes.getInt(C0009j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0594a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2125b = -1;
        }
    }

    public C0593g0(Context context) {
        this(context, null);
    }

    public C0593g0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0593g0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2109b = true;
        this.f2110c = -1;
        this.f2111d = 0;
        this.f2113f = 8388659;
        C0638t0 a = C0638t0.m1900a(context, attributeSet, C0009j.LinearLayoutCompat, i, 0);
        int d = a.m1894d(C0009j.LinearLayoutCompat_android_orientation, -1);
        if (d >= 0) {
            setOrientation(d);
        }
        int d2 = a.m1894d(C0009j.LinearLayoutCompat_android_gravity, -1);
        if (d2 >= 0) {
            setGravity(d2);
        }
        boolean a2 = a.m1903a(C0009j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f2115h = a.m1906a(C0009j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2110c = a.m1894d(C0009j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f2116i = a.m1903a(C0009j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.m1899b(C0009j.LinearLayoutCompat_divider));
        this.f2122o = a.m1894d(C0009j.LinearLayoutCompat_showDividers, 0);
        this.f2123p = a.m1896c(C0009j.LinearLayoutCompat_dividerPadding, 0);
        a.m1908a();
    }

    /* renamed from: a */
    private void m2062a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private void m2053c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = m2069a(i3);
            if (a.getVisibility() != 8) {
                C0594a aVar = (C0594a) a.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = a.getMeasuredWidth();
                    measureChildWithMargins(a, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2052d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = m2069a(i3);
            if (a.getVisibility() != 8) {
                C0594a aVar = (C0594a) a.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = a.getMeasuredHeight();
                    measureChildWithMargins(a, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i4;
                }
            }
        }
    }

    /* renamed from: a */
    int m2064a(View view) {
        return 0;
    }

    /* renamed from: a */
    int m2063a(View view, int i) {
        return 0;
    }

    /* renamed from: a */
    View m2069a(int i) {
        return getChildAt(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x03a6, code lost:
        if (r8 > 0) goto L_0x03b4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03b1, code lost:
        if (r8 < 0) goto L_0x03b3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b3, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03b4, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r4), r2);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cf  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2068a(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0593g0.m2068a(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2067a(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0593g0.m2067a(int, int, int, int):void");
    }

    /* renamed from: a */
    void m2066a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0661z0.m1764a(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View a2 = m2069a(i4);
            if (!(a2 == null || a2.getVisibility() == 8 || !m2060b(i4))) {
                C0594a aVar = (C0594a) a2.getLayoutParams();
                m2056b(canvas, a ? a2.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (a2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f2120m);
            }
        }
        if (m2060b(virtualChildCount)) {
            View a3 = m2069a(virtualChildCount - 1);
            if (a3 != null) {
                C0594a aVar2 = (C0594a) a3.getLayoutParams();
                if (a) {
                    i3 = a3.getLeft();
                    i2 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i = (i3 - i2) - this.f2120m;
                    m2056b(canvas, i);
                }
                i = a3.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                m2056b(canvas, i);
            } else if (a) {
                i = getPaddingLeft();
                m2056b(canvas, i);
            } else {
                i3 = getWidth();
                i2 = getPaddingRight();
                i = (i3 - i2) - this.f2120m;
                m2056b(canvas, i);
            }
        }
    }

    /* renamed from: a */
    void m2065a(Canvas canvas, int i) {
        this.f2119l.setBounds(getPaddingLeft() + this.f2123p, i, (getWidth() - getPaddingRight()) - this.f2123p, this.f2121n + i);
        this.f2119l.draw(canvas);
    }

    /* renamed from: a */
    void m2061a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* renamed from: b */
    int m2055b(View view) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02db, code lost:
        if (r15 > 0) goto L_0x02e9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e6, code lost:
        if (r15 < 0) goto L_0x02e8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02e8, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02e9, code lost:
        r13.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0324  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2059b(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0593g0.m2059b(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2058b(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f2113f
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f2114g
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f2114g
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = 0
        L_0x0049:
            if (r12 >= r10) goto L_0x00c7
            android.view.View r13 = r6.m2069a(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.m2054c(r12)
            int r0 = r0 + r1
            goto L_0x00c4
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c4
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.g0$a r5 = (androidx.appcompat.widget.C0593g0.C0594a) r5
            int r1 = r5.f2125b
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = p000a.p018g.p029l.C0216r.m3411j(r17)
            int r1 = p000a.p018g.p029l.C0200c.m3490a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008c
            r2 = 5
            if (r1 == r2) goto L_0x0089
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L_0x0087:
            r2 = r1
            goto L_0x0098
        L_0x0089:
            int r1 = r8 - r4
            goto L_0x0094
        L_0x008c:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L_0x0094:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
            goto L_0x0087
        L_0x0098:
            boolean r1 = r6.m2060b(r12)
            if (r1 == 0) goto L_0x00a1
            int r1 = r6.f2121n
            int r0 = r0 + r1
        L_0x00a1:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m2064a(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m2062a(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m2055b(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m2063a(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        L_0x00c4:
            r1 = 1
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0593g0.m2058b(int, int, int, int):void");
    }

    /* renamed from: b */
    void m2057b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View a = m2069a(i);
            if (!(a == null || a.getVisibility() == 8 || !m2060b(i))) {
                m2065a(canvas, (a.getTop() - ((ViewGroup.MarginLayoutParams) ((C0594a) a.getLayoutParams())).topMargin) - this.f2121n);
            }
        }
        if (m2060b(virtualChildCount)) {
            View a2 = m2069a(virtualChildCount - 1);
            m2065a(canvas, a2 == null ? (getHeight() - getPaddingBottom()) - this.f2121n : a2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0594a) a2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: b */
    void m2056b(Canvas canvas, int i) {
        this.f2119l.setBounds(i, getPaddingTop() + this.f2123p, this.f2120m + i, (getHeight() - getPaddingBottom()) - this.f2123p);
        this.f2119l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public boolean m2060b(int i) {
        if (i == 0) {
            return (this.f2122o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2122o & 4) != 0;
        }
        if ((this.f2122o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    int m2054c(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0594a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0594a generateDefaultLayoutParams() {
        int i = this.f2112e;
        if (i == 0) {
            return new C0594a(-2, -2);
        }
        if (i == 1) {
            return new C0594a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public C0594a generateLayoutParams(AttributeSet attributeSet) {
        return new C0594a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0594a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0594a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2110c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2110c;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f2111d;
                if (this.f2112e == 1 && (i = this.f2113f & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2114g) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2114g;
                    }
                }
                return i3 + ((ViewGroup.MarginLayoutParams) ((C0594a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f2110c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2110c;
    }

    public Drawable getDividerDrawable() {
        return this.f2119l;
    }

    public int getDividerPadding() {
        return this.f2123p;
    }

    public int getDividerWidth() {
        return this.f2120m;
    }

    public int getGravity() {
        return this.f2113f;
    }

    public int getOrientation() {
        return this.f2112e;
    }

    public int getShowDividers() {
        return this.f2122o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2115h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f2119l != null) {
            if (this.f2112e == 1) {
                m2057b(canvas);
            } else {
                m2066a(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0593g0.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0593g0.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2112e == 1) {
            m2058b(i, i2, i3, i4);
        } else {
            m2067a(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f2112e == 1) {
            m2059b(i, i2);
        } else {
            m2068a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f2109b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f2110c = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f2119l) {
            this.f2119l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f2120m = drawable.getIntrinsicWidth();
                this.f2121n = drawable.getIntrinsicHeight();
            } else {
                this.f2120m = 0;
                this.f2121n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f2123p = i;
    }

    public void setGravity(int i) {
        if (this.f2113f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2113f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f2113f;
        if ((8388615 & i3) != i2) {
            this.f2113f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2116i = z;
    }

    public void setOrientation(int i) {
        if (this.f2112e != i) {
            this.f2112e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2122o) {
            requestLayout();
        }
        this.f2122o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f2113f;
        if ((i3 & 112) != i2) {
            this.f2113f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f2115h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
