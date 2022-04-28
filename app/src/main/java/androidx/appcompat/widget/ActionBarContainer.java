package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p018g.p029l.C0216r;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    private boolean f1811b;

    /* renamed from: c */
    private View f1812c;

    /* renamed from: d */
    private View f1813d;

    /* renamed from: e */
    private View f1814e;

    /* renamed from: f */
    Drawable f1815f;

    /* renamed from: g */
    Drawable f1816g;

    /* renamed from: h */
    Drawable f1817h;

    /* renamed from: i */
    boolean f1818i;

    /* renamed from: j */
    boolean f1819j;

    /* renamed from: k */
    private int f1820k;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0216r.m3434a(this, new C0568b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ActionBar);
        this.f1815f = obtainStyledAttributes.getDrawable(C0009j.ActionBar_background);
        this.f1816g = obtainStyledAttributes.getDrawable(C0009j.ActionBar_backgroundStacked);
        this.f1820k = obtainStyledAttributes.getDimensionPixelSize(C0009j.ActionBar_height, -1);
        if (getId() == C0005f.split_action_bar) {
            this.f1818i = true;
            this.f1817h = obtainStyledAttributes.getDrawable(C0009j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f1818i ? this.f1815f == null && this.f1816g == null : this.f1817h == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m2291a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m2290b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1815f;
        if (drawable != null && drawable.isStateful()) {
            this.f1815f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1816g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1816g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1817h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1817h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1812c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1815f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1816g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1817h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1813d = findViewById(C0005f.action_bar);
        this.f1814e = findViewById(C0005f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1811b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f1812c;
        boolean z2 = true;
        z2 = false;
        boolean z3 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f1818i) {
            Drawable drawable3 = this.f1817h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1815f != null) {
                if (this.f1813d.getVisibility() == 0) {
                    drawable2 = this.f1815f;
                    left = this.f1813d.getLeft();
                    top = this.f1813d.getTop();
                    right = this.f1813d.getRight();
                    view = this.f1813d;
                } else {
                    View view3 = this.f1814e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1815f.setBounds(0, 0, 0, 0);
                        z2 = true;
                    } else {
                        drawable2 = this.f1815f;
                        left = this.f1814e.getLeft();
                        top = this.f1814e.getTop();
                        right = this.f1814e.getRight();
                        view = this.f1814e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z2 = true;
            }
            this.f1819j = z3;
            if (z3 && (drawable = this.f1816g) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1813d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f1820k
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1813d
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1812c
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f1813d
            boolean r0 = r3.m2290b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f1813d
        L_0x0042:
            int r0 = r3.m2291a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f1814e
            boolean r0 = r3.m2290b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f1814e
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1812c
            int r1 = r3.m2291a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1815f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1815f);
        }
        this.f1815f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1813d;
            if (view != null) {
                this.f1815f.setBounds(view.getLeft(), this.f1813d.getTop(), this.f1813d.getRight(), this.f1813d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1818i ? !(this.f1815f == null && this.f1816g == null) : this.f1817h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1817h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1817h);
        }
        this.f1817h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1818i && (drawable2 = this.f1817h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1818i ? this.f1815f == null && this.f1816g == null : this.f1817h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1816g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1816g);
        }
        this.f1816g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1819j && (drawable2 = this.f1816g) != null) {
                drawable2.setBounds(this.f1812c.getLeft(), this.f1812c.getTop(), this.f1812c.getRight(), this.f1812c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1818i ? !(this.f1815f == null && this.f1816g == null) : this.f1817h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0619m0 m0Var) {
        View view = this.f1812c;
        if (view != null) {
            removeView(view);
        }
        this.f1812c = m0Var;
        if (m0Var != null) {
            addView(m0Var);
            ViewGroup.LayoutParams layoutParams = m0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            m0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1811b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1815f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1816g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1817h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1815f && !this.f1818i) || (drawable == this.f1816g && this.f1819j) || ((drawable == this.f1817h && this.f1818i) || super.verifyDrawable(drawable));
    }
}
