package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0698a;
import androidx.core.widget.C0717f;
import java.lang.reflect.Field;
import p000a.p001a.C0000a;
import p000a.p001a.p004l.p005a.C0024c;
import p000a.p018g.p029l.C0223v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.d0 */
/* loaded from: classes.dex */
public class C0582d0 extends ListView {

    /* renamed from: b */
    private final Rect f2073b = new Rect();

    /* renamed from: c */
    private int f2074c = 0;

    /* renamed from: d */
    private int f2075d = 0;

    /* renamed from: e */
    private int f2076e = 0;

    /* renamed from: f */
    private int f2077f = 0;

    /* renamed from: g */
    private int f2078g;

    /* renamed from: h */
    private Field f2079h;

    /* renamed from: i */
    private C0583a f2080i;

    /* renamed from: j */
    private boolean f2081j;

    /* renamed from: k */
    private boolean f2082k;

    /* renamed from: l */
    private boolean f2083l;

    /* renamed from: m */
    private C0223v f2084m;

    /* renamed from: n */
    private C0717f f2085n;

    /* renamed from: o */
    RunnableC0584b f2086o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d0$a */
    /* loaded from: classes.dex */
    public static class C0583a extends C0024c {

        /* renamed from: c */
        private boolean f2087c = true;

        C0583a(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: a */
        void m2092a(boolean z) {
            this.f2087c = z;
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f2087c) {
                super.draw(canvas);
            }
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f2087c) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f2087c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f2087c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f2087c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d0$b */
    /* loaded from: classes.dex */
    public class RunnableC0584b implements Runnable {
        RunnableC0584b() {
        }

        /* renamed from: a */
        public void m2091a() {
            C0582d0 d0Var = C0582d0.this;
            d0Var.f2086o = null;
            d0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m2090b() {
            C0582d0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0582d0 d0Var = C0582d0.this;
            d0Var.f2086o = null;
            d0Var.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0582d0(Context context, boolean z) {
        super(context, null, C0000a.dropDownListViewStyle);
        this.f2082k = z;
        setCacheColorHint(0);
        try {
            this.f2079h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2079h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2103a() {
        this.f2083l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2078g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0223v vVar = this.f2084m;
        if (vVar != null) {
            vVar.m3373a();
            this.f2084m = null;
        }
    }

    /* renamed from: a */
    private void m2101a(int i, View view) {
        Rect rect = this.f2073b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2074c;
        rect.top -= this.f2075d;
        rect.right += this.f2076e;
        rect.bottom += this.f2077f;
        try {
            boolean z = this.f2079h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f2079h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2100a(int i, View view, float f, float f2) {
        m2094b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0698a.m1606a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m2099a(Canvas canvas) {
        Drawable selector;
        if (!this.f2073b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f2073b);
            selector.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m2097a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m2096a(View view, int i, float f, float f2) {
        View childAt;
        this.f2083l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f2078g;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f2078g = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2100a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m2094b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m2101a(i, view);
        if (z2) {
            Rect rect = this.f2073b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0698a.m1606a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private boolean m2095b() {
        return this.f2083l;
    }

    /* renamed from: c */
    private void m2093c() {
        Drawable selector = getSelector();
        if (selector != null && m2095b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0583a aVar = this.f2080i;
        if (aVar != null) {
            aVar.m2092a(z);
        }
    }

    /* renamed from: a */
    public int m2102a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m2098a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m2096a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m2097a(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m2103a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f2085n
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f2085n = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f2085n
            r9.m1538a(r2)
            androidx.core.widget.f r9 = r7.f2085n
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f2085n
            if (r8 == 0) goto L_0x006c
            r8.m1538a(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0582d0.m2098a(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m2099a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f2086o == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m2093c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f2082k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f2082k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f2082k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f2082k && this.f2081j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f2086o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2086o == null) {
            this.f2086o = new RunnableC0584b();
            this.f2086o.m2090b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m2093c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2078g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0584b bVar = this.f2086o;
        if (bVar != null) {
            bVar.m2091a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f2081j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f2080i = drawable != null ? new C0583a(drawable) : null;
        super.setSelector(this.f2080i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2074c = rect.left;
        this.f2075d = rect.top;
        this.f2076e = rect.right;
        this.f2077f = rect.bottom;
    }
}
