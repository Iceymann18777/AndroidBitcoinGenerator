package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.AbstractC0513p;
import androidx.appcompat.view.menu.AbstractC0515q;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.view.menu.C0501k;

/* loaded from: classes.dex */
public class ActionMenuView extends C0593g0 implements C0496h.AbstractC0498b, AbstractC0515q {

    /* renamed from: A */
    private int f1864A;

    /* renamed from: B */
    AbstractC0535e f1865B;

    /* renamed from: q */
    private C0496h f1866q;

    /* renamed from: r */
    private Context f1867r;

    /* renamed from: s */
    private int f1868s;

    /* renamed from: t */
    private boolean f1869t;

    /* renamed from: u */
    private C0570c f1870u;

    /* renamed from: v */
    private AbstractC0513p.AbstractC0514a f1871v;

    /* renamed from: w */
    C0496h.AbstractC0497a f1872w;

    /* renamed from: x */
    private boolean f1873x;

    /* renamed from: y */
    private int f1874y;

    /* renamed from: z */
    private int f1875z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface AbstractC0531a {
        /* renamed from: b */
        boolean mo2112b();

        /* renamed from: c */
        boolean mo2111c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0532b implements AbstractC0513p.AbstractC0514a {
        C0532b() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(C0496h hVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(C0496h hVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0533c extends C0593g0.C0594a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f1876c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f1877d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f1878e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f1879f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f1880g;

        /* renamed from: h */
        boolean f1881h;

        public C0533c(int i, int i2) {
            super(i, i2);
            this.f1876c = false;
        }

        public C0533c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0533c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0533c(C0533c cVar) {
            super(cVar);
            this.f1876c = cVar.f1876c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0534d implements C0496h.AbstractC0497a {
        C0534d() {
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public void mo65a(C0496h hVar) {
            C0496h.AbstractC0497a aVar = ActionMenuView.this.f1872w;
            if (aVar != null) {
                aVar.mo65a(hVar);
            }
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public boolean mo64a(C0496h hVar, MenuItem menuItem) {
            AbstractC0535e eVar = ActionMenuView.this.f1865B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface AbstractC0535e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1875z = (int) (56.0f * f);
        this.f1864A = (int) (f * 4.0f);
        this.f1867r = context;
        this.f1868s = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m2266a(View view, int i, int i2, int i3, int i4) {
        C0533c cVar = (C0533c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m2457d();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f1876c || !z2) {
            z = false;
        }
        cVar.f1879f = z;
        cVar.f1877d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r13v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2263c(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m2263c(int, int):void");
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q
    /* renamed from: a */
    public void mo142a(C0496h hVar) {
        this.f1866q = hVar;
    }

    /* renamed from: a */
    public void m2264a(AbstractC0513p.AbstractC0514a aVar, C0496h.AbstractC0497a aVar2) {
        this.f1871v = aVar;
        this.f1872w = aVar2;
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0498b
    /* renamed from: a */
    public boolean mo2265a(C0501k kVar) {
        return this.f1866q.m2411a(kVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0533c);
    }

    /* renamed from: d */
    public void m2262d() {
        C0570c cVar = this.f1870u;
        if (cVar != null) {
            cVar.m2122e();
        }
    }

    /* renamed from: d */
    protected boolean m2261d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof AbstractC0531a)) {
            z = false | ((AbstractC0531a) childAt).mo2111c();
        }
        return (i <= 0 || !(childAt2 instanceof AbstractC0531a)) ? z : z | ((AbstractC0531a) childAt2).mo2112b();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public C0533c m2260e() {
        C0533c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1876c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: f */
    public boolean m2259f() {
        C0570c cVar = this.f1870u;
        return cVar != null && cVar.m2118g();
    }

    /* renamed from: g */
    public boolean m2258g() {
        C0570c cVar = this.f1870u;
        return cVar != null && cVar.m2116i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    public C0533c generateDefaultLayoutParams() {
        C0533c cVar = new C0533c(-2, -2);
        cVar.f2125b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    public C0533c generateLayoutParams(AttributeSet attributeSet) {
        return new C0533c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup
    public C0533c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0533c cVar = layoutParams instanceof C0533c ? new C0533c((C0533c) layoutParams) : new C0533c(layoutParams);
        if (cVar.f2125b <= 0) {
            cVar.f2125b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.f1866q == null) {
            Context context = getContext();
            this.f1866q = new C0496h(context);
            this.f1866q.mo2302a(new C0534d());
            this.f1870u = new C0570c(context);
            this.f1870u.m2124c(true);
            C0570c cVar = this.f1870u;
            AbstractC0513p.AbstractC0514a aVar = this.f1871v;
            if (aVar == null) {
                aVar = new C0532b();
            }
            cVar.mo2308a(aVar);
            this.f1866q.m2407a(this.f1870u, this.f1867r);
            this.f1870u.m2130a(this);
        }
        return this.f1866q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1870u.m2120f();
    }

    public int getPopupTheme() {
        return this.f1868s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean m2257h() {
        C0570c cVar = this.f1870u;
        return cVar != null && cVar.m2115j();
    }

    /* renamed from: i */
    public boolean m2256i() {
        return this.f1869t;
    }

    /* renamed from: j */
    public C0496h m2255j() {
        return this.f1866q;
    }

    /* renamed from: k */
    public boolean m2254k() {
        C0570c cVar = this.f1870u;
        return cVar != null && cVar.m2114k();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0570c cVar = this.f1870u;
        if (cVar != null) {
            cVar.mo123a(false);
            if (this.f1870u.m2115j()) {
                this.f1870u.m2118g();
                this.f1870u.m2114k();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2262d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f1873x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0661z0.m1764a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0533c cVar = (C0533c) childAt.getLayoutParams();
                if (cVar.f1876c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m2261d(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i14, i8, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    m2261d(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i5 = paddingRight / i17;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0533c cVar2 = (C0533c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1876c) {
                    int i18 = width - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            C0533c cVar3 = (C0533c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1876c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max;
            }
            i6++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0593g0, android.view.View
    public void onMeasure(int i, int i2) {
        C0496h hVar;
        boolean z = this.f1873x;
        this.f1873x = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f1873x) {
            this.f1874y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1873x || (hVar = this.f1866q) == null || size == this.f1874y)) {
            this.f1874y = size;
            hVar.mo87b(true);
        }
        int childCount = getChildCount();
        if (!this.f1873x || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0533c cVar = (C0533c) getChildAt(i3).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m2263c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1870u.m2126b(z);
    }

    public void setOnMenuItemClickListener(AbstractC0535e eVar) {
        this.f1865B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1870u.m2135a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1869t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1868s != i) {
            this.f1868s = i;
            if (i == 0) {
                this.f1867r = getContext();
            } else {
                this.f1867r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0570c cVar) {
        this.f1870u = cVar;
        this.f1870u.m2130a(this);
    }
}
