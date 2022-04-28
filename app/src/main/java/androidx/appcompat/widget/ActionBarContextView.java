package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0009j;
import p000a.p001a.p006m.AbstractC0029b;
import p000a.p018g.p029l.C0216r;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0564a {

    /* renamed from: j */
    private CharSequence f1821j;

    /* renamed from: k */
    private CharSequence f1822k;

    /* renamed from: l */
    private View f1823l;

    /* renamed from: m */
    private View f1824m;

    /* renamed from: n */
    private LinearLayout f1825n;

    /* renamed from: o */
    private TextView f1826o;

    /* renamed from: p */
    private TextView f1827p;

    /* renamed from: q */
    private int f1828q;

    /* renamed from: r */
    private int f1829r;

    /* renamed from: s */
    private boolean f1830s;

    /* renamed from: t */
    private int f1831t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0525a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC0029b f1832b;

        View$OnClickListenerC0525a(ActionBarContextView actionBarContextView, AbstractC0029b bVar) {
            this.f1832b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1832b.mo2472a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0638t0 a = C0638t0.m1900a(context, attributeSet, C0009j.ActionMode, i, 0);
        C0216r.m3434a(this, a.m1899b(C0009j.ActionMode_background));
        this.f1828q = a.m1888g(C0009j.ActionMode_titleTextStyle, 0);
        this.f1829r = a.m1888g(C0009j.ActionMode_subtitleTextStyle, 0);
        this.f2032f = a.m1890f(C0009j.ActionMode_height, 0);
        this.f1831t = a.m1888g(C0009j.ActionMode_closeItemLayout, C0006g.abc_action_mode_close_item_material);
        a.m1908a();
    }

    /* renamed from: e */
    private void m2284e() {
        if (this.f1825n == null) {
            LayoutInflater.from(getContext()).inflate(C0006g.abc_action_bar_title_item, this);
            this.f1825n = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1826o = (TextView) this.f1825n.findViewById(C0005f.action_bar_title);
            this.f1827p = (TextView) this.f1825n.findViewById(C0005f.action_bar_subtitle);
            if (this.f1828q != 0) {
                this.f1826o.setTextAppearance(getContext(), this.f1828q);
            }
            if (this.f1829r != 0) {
                this.f1827p.setTextAppearance(getContext(), this.f1829r);
            }
        }
        this.f1826o.setText(this.f1821j);
        this.f1827p.setText(this.f1822k);
        boolean z = !TextUtils.isEmpty(this.f1821j);
        boolean z2 = !TextUtils.isEmpty(this.f1822k);
        int i = 0;
        this.f1827p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f1825n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f1825n.getParent() == null) {
            addView(this.f1825n);
        }
    }

    /* renamed from: a */
    public void m2289a() {
        if (this.f1823l == null) {
            m2286c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0.getParent() == null) goto L_0x0015;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2288a(p000a.p001a.p006m.AbstractC0029b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1823l
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1831t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1823l = r0
        L_0x0015:
            android.view.View r0 = r3.f1823l
            r3.addView(r0)
            goto L_0x0022
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f1823l
            int r1 = p000a.p001a.C0005f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo2464c()
            androidx.appcompat.view.menu.h r4 = (androidx.appcompat.view.menu.C0496h) r4
            androidx.appcompat.widget.c r0 = r3.f2031e
            if (r0 == 0) goto L_0x003f
            r0.m2122e()
        L_0x003f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f2031e = r0
            androidx.appcompat.widget.c r0 = r3.f2031e
            r1 = 1
            r0.m2124c(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f2031e
            android.content.Context r2 = r3.f2029c
            r4.m2407a(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f2031e
            androidx.appcompat.view.menu.q r4 = r4.mo2128b(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f2030d = r4
            androidx.appcompat.widget.ActionMenuView r4 = r3.f2030d
            r1 = 0
            p000a.p018g.p029l.C0216r.m3434a(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f2030d
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m2288a(a.a.m.b):void");
    }

    /* renamed from: b */
    public boolean m2287b() {
        return this.f1830s;
    }

    /* renamed from: c */
    public void m2286c() {
        removeAllViews();
        this.f1824m = null;
        this.f2030d = null;
    }

    /* renamed from: d */
    public boolean m2285d() {
        C0570c cVar = this.f2031e;
        if (cVar != null) {
            return cVar.m2114k();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0564a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0564a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1822k;
    }

    public CharSequence getTitle() {
        return this.f1821j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0570c cVar = this.f2031e;
        if (cVar != null) {
            cVar.m2118g();
            this.f2031e.m2117h();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1821j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0661z0.m1764a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1823l;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1823l.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = AbstractC0564a.m2154a(paddingRight, i6, a);
            i5 = AbstractC0564a.m2154a(a2 + m2151a(this.f1823l, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f1825n;
        if (!(linearLayout == null || this.f1824m != null || linearLayout.getVisibility() == 8)) {
            i5 += m2151a(this.f1825n, i5, paddingTop, paddingTop2, a);
        }
        View view2 = this.f1824m;
        if (view2 != null) {
            m2151a(view2, i5, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2030d;
        if (actionMenuView != null) {
            m2151a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f2032f;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f1823l;
            if (view != null) {
                int a = m2152a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1823l.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f2030d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = m2152a(this.f2030d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1825n;
            if (linearLayout != null && this.f1824m == null) {
                if (this.f1830s) {
                    this.f1825n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1825n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1825n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = m2152a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1824m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f1824m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f2032f <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0564a
    public void setContentHeight(int i) {
        this.f2032f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1824m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1824m = view;
        if (!(view == null || (linearLayout = this.f1825n) == null)) {
            removeView(linearLayout);
            this.f1825n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1822k = charSequence;
        m2284e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1821j = charSequence;
        m2284e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1830s) {
            requestLayout();
        }
        this.f1830s = z;
    }

    @Override // androidx.appcompat.widget.AbstractC0564a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
