package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0428a;
import androidx.appcompat.view.menu.AbstractC0513p;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.view.menu.C0501k;
import androidx.appcompat.view.menu.SubMenuC0523v;

import java.util.ArrayList;
import java.util.List;
import p000a.p001a.C0000a;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p001a.p006m.AbstractC0031c;
import p000a.p001a.p006m.C0036g;
import p000a.p018g.p029l.C0200c;
import p000a.p018g.p029l.C0204f;
import p000a.p018g.p029l.C0216r;
import p000a.p033i.p034a.AbstractC0237a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1973A;

    /* renamed from: B */
    private int f1974B;

    /* renamed from: C */
    private boolean f1975C;

    /* renamed from: D */
    private boolean f1976D;

    /* renamed from: E */
    private final ArrayList<View> f1977E;

    /* renamed from: F */
    private final ArrayList<View> f1978F;

    /* renamed from: G */
    private final int[] f1979G;

    /* renamed from: H */
    AbstractC0560f f1980H;

    /* renamed from: I */
    private final ActionMenuView.AbstractC0535e f1981I;

    /* renamed from: J */
    private C0640u0 f1982J;

    /* renamed from: K */
    private C0570c f1983K;

    /* renamed from: L */
    private C0558d f1984L;

    /* renamed from: M */
    private AbstractC0513p.AbstractC0514a f1985M;

    /* renamed from: N */
    private C0496h.AbstractC0497a f1986N;

    /* renamed from: O */
    private boolean f1987O;

    /* renamed from: P */
    private final Runnable f1988P;

    /* renamed from: b */
    private ActionMenuView f1989b;

    /* renamed from: c */
    private TextView f1990c;

    /* renamed from: d */
    private TextView f1991d;

    /* renamed from: e */
    private ImageButton f1992e;

    /* renamed from: f */
    private ImageView f1993f;

    /* renamed from: g */
    private Drawable f1994g;

    /* renamed from: h */
    private CharSequence f1995h;

    /* renamed from: i */
    ImageButton f1996i;

    /* renamed from: j */
    View f1997j;

    /* renamed from: k */
    private Context f1998k;

    /* renamed from: l */
    private int f1999l;

    /* renamed from: m */
    private int f2000m;

    /* renamed from: n */
    private int f2001n;

    /* renamed from: o */
    int f2002o;

    /* renamed from: p */
    private int f2003p;

    /* renamed from: q */
    private int f2004q;

    /* renamed from: r */
    private int f2005r;

    /* renamed from: s */
    private int f2006s;

    /* renamed from: t */
    private int f2007t;

    /* renamed from: u */
    private C0617l0 f2008u;

    /* renamed from: v */
    private int f2009v;

    /* renamed from: w */
    private int f2010w;

    /* renamed from: x */
    private int f2011x;

    /* renamed from: y */
    private CharSequence f2012y;

    /* renamed from: z */
    private CharSequence f2013z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    class C0555a implements ActionMenuView.AbstractC0535e {
        C0555a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0535e
        public boolean onMenuItemClick(MenuItem menuItem) {
            AbstractC0560f fVar = Toolbar.this.f1980H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    class RunnableC0556b implements Runnable {
        RunnableC0556b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m2165k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0557c implements View.OnClickListener {
        View$OnClickListenerC0557c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m2175c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C0558d implements AbstractC0513p {

        /* renamed from: b */
        C0496h f2017b;

        /* renamed from: c */
        C0501k f2018c;

        C0558d() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public int mo136a() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public void mo133a(Context context, C0496h hVar) {
            C0501k kVar;
            C0496h hVar2 = this.f2017b;
            if (!(hVar2 == null || (kVar = this.f2018c) == null)) {
                hVar2.mo2300a(kVar);
            }
            this.f2017b = hVar;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public void mo130a(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public void mo126a(C0496h hVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public void mo123a(boolean z) {
            if (this.f2018c != null) {
                C0496h hVar = this.f2017b;
                boolean z2 = false;
                if (hVar != null) {
                    int size = hVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f2017b.getItem(i) == this.f2018c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo119b(this.f2017b, this.f2018c);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public boolean mo127a(C0496h hVar, C0501k kVar) {
            Toolbar.this.m2171e();
            ViewParent parent = Toolbar.this.f1996i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1996i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1996i);
            }
            Toolbar.this.f1997j = kVar.getActionView();
            this.f2018c = kVar;
            ViewParent parent2 = Toolbar.this.f1997j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1997j);
                }
                C0559e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f1393a = 8388611 | (toolbar4.f2002o & 112);
                generateDefaultLayoutParams.f2020b = 2;
                toolbar4.f1997j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1997j);
            }
            Toolbar.this.m2166j();
            Toolbar.this.requestLayout();
            kVar.m2363a(true);
            View view = Toolbar.this.f1997j;
            if (view instanceof AbstractC0031c) {
                ((AbstractC0031c) view).mo2232b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: a */
        public boolean mo124a(SubMenuC0523v vVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: b */
        public boolean mo122b() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: b */
        public boolean mo119b(C0496h hVar, C0501k kVar) {
            View view = Toolbar.this.f1997j;
            if (view instanceof AbstractC0031c) {
                ((AbstractC0031c) view).mo2227c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1997j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1996i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1997j = null;
            toolbar3.m2194a();
            this.f2018c = null;
            Toolbar.this.requestLayout();
            kVar.m2363a(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p
        /* renamed from: c */
        public Parcelable mo117c() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0559e extends AbstractC0428a.C0429a {

        /* renamed from: b */
        int f2020b;

        public C0559e(int i, int i2) {
            super(i, i2);
            this.f2020b = 0;
            this.f1393a = 8388627;
        }

        public C0559e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2020b = 0;
        }

        public C0559e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2020b = 0;
        }

        public C0559e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2020b = 0;
            m2157a(marginLayoutParams);
        }

        public C0559e(AbstractC0428a.C0429a aVar) {
            super(aVar);
            this.f2020b = 0;
        }

        public C0559e(C0559e eVar) {
            super((AbstractC0428a.C0429a) eVar);
            this.f2020b = 0;
            this.f2020b = eVar.f2020b;
        }

        /* renamed from: a */
        void m2157a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface AbstractC0560f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public static class C0561g extends AbstractC0237a {
        public static final Parcelable.Creator<C0561g> CREATOR = new C0562a();

        /* renamed from: d */
        int f2021d;

        /* renamed from: e */
        boolean f2022e;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        /* loaded from: classes.dex */
        static class C0562a implements Parcelable.ClassLoaderCreator<C0561g> {
            C0562a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0561g createFromParcel(Parcel parcel) {
                return new C0561g(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0561g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0561g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public C0561g[] newArray(int i) {
                return new C0561g[i];
            }
        }

        public C0561g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2021d = parcel.readInt();
            this.f2022e = parcel.readInt() != 0;
        }

        public C0561g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2021d);
            parcel.writeInt(this.f2022e ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2011x = 8388627;
        this.f1977E = new ArrayList<>();
        this.f1978F = new ArrayList<>();
        this.f1979G = new int[2];
        this.f1981I = new C0555a();
        this.f1988P = new RunnableC0556b();
        C0638t0 a = C0638t0.m1900a(getContext(), attributeSet, C0009j.Toolbar, i, 0);
        this.f2000m = a.m1888g(C0009j.Toolbar_titleTextAppearance, 0);
        this.f2001n = a.m1888g(C0009j.Toolbar_subtitleTextAppearance, 0);
        this.f2011x = a.m1892e(C0009j.Toolbar_android_gravity, this.f2011x);
        this.f2002o = a.m1892e(C0009j.Toolbar_buttonGravity, 48);
        int b = a.m1898b(C0009j.Toolbar_titleMargin, 0);
        b = a.m1889g(C0009j.Toolbar_titleMargins) ? a.m1898b(C0009j.Toolbar_titleMargins, b) : b;
        this.f2007t = b;
        this.f2006s = b;
        this.f2005r = b;
        this.f2004q = b;
        int b2 = a.m1898b(C0009j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f2004q = b2;
        }
        int b3 = a.m1898b(C0009j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f2005r = b3;
        }
        int b4 = a.m1898b(C0009j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f2006s = b4;
        }
        int b5 = a.m1898b(C0009j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f2007t = b5;
        }
        this.f2003p = a.m1896c(C0009j.Toolbar_maxButtonHeight, -1);
        int b6 = a.m1898b(C0009j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b7 = a.m1898b(C0009j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c = a.m1896c(C0009j.Toolbar_contentInsetLeft, 0);
        int c2 = a.m1896c(C0009j.Toolbar_contentInsetRight, 0);
        m2164l();
        this.f2008u.m1970a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f2008u.m1967b(b6, b7);
        }
        this.f2009v = a.m1898b(C0009j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2010w = a.m1898b(C0009j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1994g = a.m1899b(C0009j.Toolbar_collapseIcon);
        this.f1995h = a.m1893e(C0009j.Toolbar_collapseContentDescription);
        CharSequence e = a.m1893e(C0009j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.m1893e(C0009j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f1998k = getContext();
        setPopupTheme(a.m1888g(C0009j.Toolbar_popupTheme, 0));
        Drawable b8 = a.m1899b(C0009j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.m1893e(C0009j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.m1899b(C0009j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.m1893e(C0009j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.m1889g(C0009j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.m1905a(C0009j.Toolbar_titleTextColor, -1));
        }
        if (a.m1889g(C0009j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.m1905a(C0009j.Toolbar_subtitleTextColor, -1));
        }
        a.m1908a();
    }

    /* renamed from: a */
    private int m2193a(int i) {
        int j = C0216r.m3411j(this);
        int a = C0200c.m3490a(i, j) & 7;
        return (a == 1 || a == 3 || a == 5) ? a : j == 1 ? 5 : 3;
    }

    /* renamed from: a */
    private int m2190a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0204f.m3479b(marginLayoutParams) + C0204f.m3480a(marginLayoutParams);
    }

    /* renamed from: a */
    private int m2189a(View view, int i) {
        C0559e eVar = (C0559e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int b = m2179b(eVar.f1393a);
        if (b == 48) {
            return getPaddingTop() - i2;
        }
        if (b == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m2187a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m2186a(View view, int i, int[] iArr, int i2) {
        C0559e eVar = (C0559e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m2189a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    /* renamed from: a */
    private int m2181a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            C0559e eVar = (C0559e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            i = Math.max(0, -i5);
            i2 = Math.max(0, -i6);
            i3 += max + view.getMeasuredWidth() + max2;
        }
        return i3;
    }

    /* renamed from: a */
    private void m2188a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m2185a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0559e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0559e) layoutParams;
        generateDefaultLayoutParams.f2020b = 1;
        if (!z || this.f1997j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.f1978F.add(view);
    }

    /* renamed from: a */
    private void m2182a(List<View> list, int i) {
        boolean z = C0216r.m3411j(this) == 1;
        int childCount = getChildCount();
        int a = C0200c.m3490a(i, C0216r.m3411j(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0559e eVar = (C0559e) childAt.getLayoutParams();
                if (eVar.f2020b == 0 && m2172d(childAt) && m2193a(eVar.f1393a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0559e eVar2 = (C0559e) childAt2.getLayoutParams();
            if (eVar2.f2020b == 0 && m2172d(childAt2) && m2193a(eVar2.f1393a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m2179b(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f2011x & 112;
    }

    /* renamed from: b */
    private int m2177b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    private int m2176b(View view, int i, int[] iArr, int i2) {
        C0559e eVar = (C0559e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m2189a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    /* renamed from: c */
    private boolean m2174c(View view) {
        return view.getParent() == this || this.f1978F.contains(view);
    }

    /* renamed from: d */
    private boolean m2172d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new C0036g(getContext());
    }

    /* renamed from: l */
    private void m2164l() {
        if (this.f2008u == null) {
            this.f2008u = new C0617l0();
        }
    }

    /* renamed from: m */
    private void m2163m() {
        if (this.f1993f == null) {
            this.f1993f = new C0627o(getContext());
        }
    }

    /* renamed from: n */
    private void m2162n() {
        m2161o();
        if (this.f1989b.m2255j() == null) {
            C0496h hVar = (C0496h) this.f1989b.getMenu();
            if (this.f1984L == null) {
                this.f1984L = new C0558d();
            }
            this.f1989b.setExpandedActionViewsExclusive(true);
            hVar.m2407a(this.f1984L, this.f1998k);
        }
    }

    /* renamed from: o */
    private void m2161o() {
        if (this.f1989b == null) {
            this.f1989b = new ActionMenuView(getContext());
            this.f1989b.setPopupTheme(this.f1999l);
            this.f1989b.setOnMenuItemClickListener(this.f1981I);
            this.f1989b.m2264a(this.f1985M, this.f1986N);
            C0559e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1393a = 8388613 | (this.f2002o & 112);
            this.f1989b.setLayoutParams(generateDefaultLayoutParams);
            m2185a((View) this.f1989b, false);
        }
    }

    /* renamed from: p */
    private void m2160p() {
        if (this.f1992e == null) {
            this.f1992e = new C0618m(getContext(), null, C0000a.toolbarNavigationButtonStyle);
            C0559e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1393a = 8388611 | (this.f2002o & 112);
            this.f1992e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m2159q() {
        removeCallbacks(this.f1988P);
        post(this.f1988P);
    }

    /* renamed from: r */
    private boolean m2158r() {
        if (!this.f1987O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2172d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    void m2194a() {
        for (int size = this.f1978F.size() - 1; size >= 0; size--) {
            addView(this.f1978F.get(size));
        }
        this.f1978F.clear();
    }

    /* renamed from: a */
    public void m2192a(int i, int i2) {
        m2164l();
        this.f2008u.m1967b(i, i2);
    }

    /* renamed from: a */
    public void m2191a(Context context, int i) {
        this.f2001n = i;
        TextView textView = this.f1991d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void m2184a(C0496h hVar, C0570c cVar) {
        if (hVar != null || this.f1989b != null) {
            m2161o();
            C0496h j = this.f1989b.m2255j();
            if (j != hVar) {
                if (j != null) {
                    j.m2398b(this.f1983K);
                    j.m2398b(this.f1984L);
                }
                if (this.f1984L == null) {
                    this.f1984L = new C0558d();
                }
                cVar.m2126b(true);
                if (hVar != null) {
                    hVar.m2407a(cVar, this.f1998k);
                    hVar.m2407a(this.f1984L, this.f1998k);
                } else {
                    cVar.mo133a(this.f1998k, (C0496h) null);
                    this.f1984L.mo133a(this.f1998k, (C0496h) null);
                    cVar.mo123a(true);
                    this.f1984L.mo123a(true);
                }
                this.f1989b.setPopupTheme(this.f1999l);
                this.f1989b.setPresenter(cVar);
                this.f1983K = cVar;
            }
        }
    }

    /* renamed from: a */
    public void m2183a(AbstractC0513p.AbstractC0514a aVar, C0496h.AbstractC0497a aVar2) {
        this.f1985M = aVar;
        this.f1986N = aVar2;
        ActionMenuView actionMenuView = this.f1989b;
        if (actionMenuView != null) {
            actionMenuView.m2264a(aVar, aVar2);
        }
    }

    /* renamed from: b */
    public void m2178b(Context context, int i) {
        this.f2000m = i;
        TextView textView = this.f1990c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean m2180b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1989b) != null && actionMenuView.m2256i();
    }

    /* renamed from: c */
    public void m2175c() {
        C0558d dVar = this.f1984L;
        C0501k kVar = dVar == null ? null : dVar.f2018c;
        if (kVar != null) {
            kVar.collapseActionView();
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0559e);
    }

    /* renamed from: d */
    public void m2173d() {
        ActionMenuView actionMenuView = this.f1989b;
        if (actionMenuView != null) {
            actionMenuView.m2262d();
        }
    }

    /* renamed from: e */
    void m2171e() {
        if (this.f1996i == null) {
            this.f1996i = new C0618m(getContext(), null, C0000a.toolbarNavigationButtonStyle);
            this.f1996i.setImageDrawable(this.f1994g);
            this.f1996i.setContentDescription(this.f1995h);
            C0559e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1393a = 8388611 | (this.f2002o & 112);
            generateDefaultLayoutParams.f2020b = 2;
            this.f1996i.setLayoutParams(generateDefaultLayoutParams);
            this.f1996i.setOnClickListener(new View$OnClickListenerC0557c());
        }
    }

    /* renamed from: f */
    public boolean m2170f() {
        C0558d dVar = this.f1984L;
        return (dVar == null || dVar.f2018c == null) ? false : true;
    }

    /* renamed from: g */
    public boolean m2169g() {
        ActionMenuView actionMenuView = this.f1989b;
        return actionMenuView != null && actionMenuView.m2259f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0559e generateDefaultLayoutParams() {
        return new C0559e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0559e generateLayoutParams(AttributeSet attributeSet) {
        return new C0559e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0559e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0559e ? new C0559e((C0559e) layoutParams) : layoutParams instanceof AbstractC0428a.C0429a ? new C0559e((AbstractC0428a.C0429a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0559e((ViewGroup.MarginLayoutParams) layoutParams) : new C0559e(layoutParams);
    }

    public int getContentInsetEnd() {
        C0617l0 l0Var = this.f2008u;
        if (l0Var != null) {
            return l0Var.m1971a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2010w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0617l0 l0Var = this.f2008u;
        if (l0Var != null) {
            return l0Var.m1968b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0617l0 l0Var = this.f2008u;
        if (l0Var != null) {
            return l0Var.m1966c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0617l0 l0Var = this.f2008u;
        if (l0Var != null) {
            return l0Var.m1965d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2009v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0496h j;
        ActionMenuView actionMenuView = this.f1989b;
        return actionMenuView != null && (j = actionMenuView.m2255j()) != null && j.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f2010w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0216r.m3411j(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0216r.m3411j(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2009v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1993f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1993f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2162n();
        return this.f1989b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1992e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1992e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0570c getOuterActionMenuPresenter() {
        return this.f1983K;
    }

    public Drawable getOverflowIcon() {
        m2162n();
        return this.f1989b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1998k;
    }

    public int getPopupTheme() {
        return this.f1999l;
    }

    public CharSequence getSubtitle() {
        return this.f2013z;
    }

    public CharSequence getTitle() {
        return this.f2012y;
    }

    public int getTitleMarginBottom() {
        return this.f2007t;
    }

    public int getTitleMarginEnd() {
        return this.f2005r;
    }

    public int getTitleMarginStart() {
        return this.f2004q;
    }

    public int getTitleMarginTop() {
        return this.f2006s;
    }

    public AbstractC0569b0 getWrapper() {
        if (this.f1982J == null) {
            this.f1982J = new C0640u0(this, true);
        }
        return this.f1982J;
    }

    /* renamed from: h */
    public boolean m2168h() {
        ActionMenuView actionMenuView = this.f1989b;
        return actionMenuView != null && actionMenuView.m2258g();
    }

    /* renamed from: i */
    public boolean m2167i() {
        ActionMenuView actionMenuView = this.f1989b;
        return actionMenuView != null && actionMenuView.m2257h();
    }

    /* renamed from: j */
    void m2166j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0559e) childAt.getLayoutParams()).f2020b == 2 || childAt == this.f1989b)) {
                removeViewAt(childCount);
                this.f1978F.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean m2165k() {
        ActionMenuView actionMenuView = this.f1989b;
        return actionMenuView != null && actionMenuView.m2254k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1988P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1976D = false;
        }
        if (!this.f1976D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1976D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1976D = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029c A[LOOP:0: B:108:0x029a->B:109:0x029c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02be A[LOOP:1: B:111:0x02bc->B:112:0x02be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f8 A[LOOP:2: B:119:0x02f6->B:120:0x02f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1979G;
        if (C0661z0.m1764a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m2172d(this.f1992e)) {
            m2188a(this.f1992e, i, 0, i2, 0, this.f2003p);
            i5 = this.f1992e.getMeasuredWidth() + m2190a(this.f1992e);
            i4 = Math.max(0, this.f1992e.getMeasuredHeight() + m2177b(this.f1992e));
            i3 = View.combineMeasuredStates(0, this.f1992e.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m2172d(this.f1996i)) {
            m2188a(this.f1996i, i, 0, i2, 0, this.f2003p);
            i5 = this.f1996i.getMeasuredWidth() + m2190a(this.f1996i);
            i4 = Math.max(i4, this.f1996i.getMeasuredHeight() + m2177b(this.f1996i));
            i3 = View.combineMeasuredStates(i3, this.f1996i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m2172d(this.f1989b)) {
            m2188a(this.f1989b, i, max, i2, 0, this.f2003p);
            i6 = this.f1989b.getMeasuredWidth() + m2190a(this.f1989b);
            i4 = Math.max(i4, this.f1989b.getMeasuredHeight() + m2177b(this.f1989b));
            i3 = View.combineMeasuredStates(i3, this.f1989b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m2172d(this.f1997j)) {
            max2 += m2187a(this.f1997j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1997j.getMeasuredHeight() + m2177b(this.f1997j));
            i3 = View.combineMeasuredStates(i3, this.f1997j.getMeasuredState());
        }
        if (m2172d(this.f1993f)) {
            max2 += m2187a(this.f1993f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1993f.getMeasuredHeight() + m2177b(this.f1993f));
            i3 = View.combineMeasuredStates(i3, this.f1993f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C0559e) childAt.getLayoutParams()).f2020b == 0 && m2172d(childAt)) {
                max2 += m2187a(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m2177b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i11 = this.f2006s + this.f2007t;
        int i12 = this.f2004q + this.f2005r;
        if (m2172d(this.f1990c)) {
            m2187a(this.f1990c, i, max2 + i12, i2, i11, iArr);
            i8 = this.f1990c.getMeasuredWidth() + m2190a(this.f1990c);
            i7 = this.f1990c.getMeasuredHeight() + m2177b(this.f1990c);
            i9 = View.combineMeasuredStates(i3, this.f1990c.getMeasuredState());
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m2172d(this.f1991d)) {
            i8 = Math.max(i8, m2187a(this.f1991d, i, max2 + i12, i2, i7 + i11, iArr));
            i7 += this.f1991d.getMeasuredHeight() + m2177b(this.f1991d);
            i9 = View.combineMeasuredStates(i9, this.f1991d.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m2158r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0561g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0561g gVar = (C0561g) parcelable;
        super.onRestoreInstanceState(gVar.m3347a());
        ActionMenuView actionMenuView = this.f1989b;
        C0496h j = actionMenuView != null ? actionMenuView.m2255j() : null;
        int i = gVar.f2021d;
        if (!(i == 0 || this.f1984L == null || j == null || (findItem = j.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f2022e) {
            m2159q();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m2164l();
        C0617l0 l0Var = this.f2008u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        l0Var.m1969a(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0501k kVar;
        C0561g gVar = new C0561g(super.onSaveInstanceState());
        C0558d dVar = this.f1984L;
        if (!(dVar == null || (kVar = dVar.f2018c) == null)) {
            gVar.f2021d = kVar.getItemId();
        }
        gVar.f2022e = m2167i();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1975C = false;
        }
        if (!this.f1975C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1975C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1975C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f1987O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2010w) {
            this.f2010w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2009v) {
            this.f2009v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0010a.m4259c(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m2163m();
            if (!m2174c(this.f1993f)) {
                m2185a((View) this.f1993f, true);
            }
        } else {
            ImageView imageView = this.f1993f;
            if (imageView != null && m2174c(imageView)) {
                removeView(this.f1993f);
                this.f1978F.remove(this.f1993f);
            }
        }
        ImageView imageView2 = this.f1993f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2163m();
        }
        ImageView imageView = this.f1993f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2160p();
        }
        ImageButton imageButton = this.f1992e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0010a.m4259c(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2160p();
            if (!m2174c(this.f1992e)) {
                m2185a((View) this.f1992e, true);
            }
        } else {
            ImageButton imageButton = this.f1992e;
            if (imageButton != null && m2174c(imageButton)) {
                removeView(this.f1992e);
                this.f1978F.remove(this.f1992e);
            }
        }
        ImageButton imageButton2 = this.f1992e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m2160p();
        this.f1992e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(AbstractC0560f fVar) {
        this.f1980H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m2162n();
        this.f1989b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1999l != i) {
            this.f1999l = i;
            if (i == 0) {
                this.f1998k = getContext();
            } else {
                this.f1998k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1991d == null) {
                Context context = getContext();
                this.f1991d = new C0658y(context);
                this.f1991d.setSingleLine();
                this.f1991d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2001n;
                if (i != 0) {
                    this.f1991d.setTextAppearance(context, i);
                }
                int i2 = this.f1974B;
                if (i2 != 0) {
                    this.f1991d.setTextColor(i2);
                }
            }
            if (!m2174c(this.f1991d)) {
                m2185a((View) this.f1991d, true);
            }
        } else {
            TextView textView = this.f1991d;
            if (textView != null && m2174c(textView)) {
                removeView(this.f1991d);
                this.f1978F.remove(this.f1991d);
            }
        }
        TextView textView2 = this.f1991d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2013z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f1974B = i;
        TextView textView = this.f1991d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1990c == null) {
                Context context = getContext();
                this.f1990c = new C0658y(context);
                this.f1990c.setSingleLine();
                this.f1990c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2000m;
                if (i != 0) {
                    this.f1990c.setTextAppearance(context, i);
                }
                int i2 = this.f1973A;
                if (i2 != 0) {
                    this.f1990c.setTextColor(i2);
                }
            }
            if (!m2174c(this.f1990c)) {
                m2185a((View) this.f1990c, true);
            }
        } else {
            TextView textView = this.f1990c;
            if (textView != null && m2174c(textView)) {
                removeView(this.f1990c);
                this.f1978F.remove(this.f1990c);
            }
        }
        TextView textView2 = this.f1990c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2012y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f2007t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2005r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f2004q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2006s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f1973A = i;
        TextView textView = this.f1990c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }
}
