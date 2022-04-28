package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0484b;
import androidx.appcompat.view.menu.AbstractC0513p;
import androidx.appcompat.view.menu.AbstractC0515q;
import androidx.appcompat.view.menu.AbstractC0519t;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.view.menu.C0501k;
import androidx.appcompat.view.menu.C0511o;
import androidx.appcompat.view.menu.SubMenuC0523v;
import androidx.core.graphics.drawable.C0698a;
import java.util.ArrayList;
import p000a.p001a.C0000a;
import p000a.p001a.C0006g;
import p000a.p001a.p006m.C0028a;
import p000a.p018g.p029l.AbstractC0197b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C0570c extends AbstractC0484b implements AbstractC0197b.AbstractC0198a {

    /* renamed from: A */
    C0571a f2040A;

    /* renamed from: B */
    RunnableC0573c f2041B;

    /* renamed from: C */
    private C0572b f2042C;

    /* renamed from: E */
    int f2044E;

    /* renamed from: k */
    C0574d f2045k;

    /* renamed from: l */
    private Drawable f2046l;

    /* renamed from: m */
    private boolean f2047m;

    /* renamed from: n */
    private boolean f2048n;

    /* renamed from: o */
    private boolean f2049o;

    /* renamed from: p */
    private int f2050p;

    /* renamed from: q */
    private int f2051q;

    /* renamed from: r */
    private int f2052r;

    /* renamed from: s */
    private boolean f2053s;

    /* renamed from: t */
    private boolean f2054t;

    /* renamed from: u */
    private boolean f2055u;

    /* renamed from: v */
    private boolean f2056v;

    /* renamed from: w */
    private int f2057w;

    /* renamed from: y */
    private View f2059y;

    /* renamed from: z */
    C0576e f2060z;

    /* renamed from: x */
    private final SparseBooleanArray f2058x = new SparseBooleanArray();

    /* renamed from: D */
    final C0577f f2043D = new C0577f();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    public class C0571a extends C0511o {
        public C0571a(Context context, SubMenuC0523v vVar, View view) {
            super(context, vVar, view, false, C0000a.actionOverflowMenuStyle);
            if (!((C0501k) vVar.getItem()).m2352h()) {
                View view2 = C0570c.this.f2045k;
                m2324a(view2 == null ? (View) ((AbstractC0484b) C0570c.this).f1641i : view2);
            }
            m2322a(C0570c.this.f2043D);
        }

        @Override // androidx.appcompat.view.menu.C0511o
        /* renamed from: d */
        protected void mo2110d() {
            C0570c cVar = C0570c.this;
            cVar.f2040A = null;
            cVar.f2044E = 0;
            super.mo2110d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes.dex */
    private class C0572b extends ActionMenuItemView.AbstractC0482b {
        C0572b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0482b
        /* renamed from: a */
        public AbstractC0519t mo2113a() {
            C0571a aVar = C0570c.this.f2040A;
            if (aVar != null) {
                return aVar.m2320b();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0573c implements Runnable {

        /* renamed from: b */
        private C0576e f2063b;

        public RunnableC0573c(C0576e eVar) {
            this.f2063b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0484b) C0570c.this).f1636d != null) {
                ((AbstractC0484b) C0570c.this).f1636d.m2422a();
            }
            View view = (View) ((AbstractC0484b) C0570c.this).f1641i;
            if (!(view == null || view.getWindowToken() == null || !this.f2063b.m2317f())) {
                C0570c.this.f2060z = this.f2063b;
            }
            C0570c.this.f2041B = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes.dex */
    public class C0574d extends C0627o implements ActionMenuView.AbstractC0531a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: classes.dex */
        class C0575a extends AbstractView$OnTouchListenerC0589f0 {
            C0575a(View view, C0570c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
            /* renamed from: a */
            public AbstractC0519t mo1839a() {
                C0576e eVar = C0570c.this.f2060z;
                if (eVar == null) {
                    return null;
                }
                return eVar.m2320b();
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
            /* renamed from: b */
            public boolean mo1838b() {
                C0570c.this.m2114k();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
            /* renamed from: c */
            public boolean mo2072c() {
                C0570c cVar = C0570c.this;
                if (cVar.f2041B != null) {
                    return false;
                }
                cVar.m2118g();
                return true;
            }
        }

        public C0574d(Context context) {
            super(context, null, C0000a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0644v0.m1841a(this, getContentDescription());
            setOnTouchListener(new C0575a(this, C0570c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0531a
        /* renamed from: b */
        public boolean mo2112b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0531a
        /* renamed from: c */
        public boolean mo2111c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0570c.this.m2114k();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0698a.m1604a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: classes.dex */
    public class C0576e extends C0511o {
        public C0576e(Context context, C0496h hVar, View view, boolean z) {
            super(context, hVar, view, z, C0000a.actionOverflowMenuStyle);
            m2327a(8388613);
            m2322a(C0570c.this.f2043D);
        }

        @Override // androidx.appcompat.view.menu.C0511o
        /* renamed from: d */
        protected void mo2110d() {
            if (((AbstractC0484b) C0570c.this).f1636d != null) {
                ((AbstractC0484b) C0570c.this).f1636d.close();
            }
            C0570c.this.f2060z = null;
            super.mo2110d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: classes.dex */
    private class C0577f implements AbstractC0513p.AbstractC0514a {
        C0577f() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(C0496h hVar, boolean z) {
            if (hVar instanceof SubMenuC0523v) {
                hVar.mo2297m().m2402a(false);
            }
            AbstractC0513p.AbstractC0514a d = C0570c.this.m2444d();
            if (d != null) {
                d.mo2108a(hVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(C0496h hVar) {
            if (hVar == null) {
                return false;
            }
            C0570c.this.f2044E = ((SubMenuC0523v) hVar).getItem().getItemId();
            AbstractC0513p.AbstractC0514a d = C0570c.this.m2444d();
            if (d != null) {
                return d.mo2109a(hVar);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$g */
    /* loaded from: classes.dex */
    public static class C0578g implements Parcelable {
        public static final Parcelable.Creator<C0578g> CREATOR = new C0579a();

        /* renamed from: b */
        public int f2069b;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        /* loaded from: classes.dex */
        static class C0579a implements Parcelable.Creator<C0578g> {
            C0579a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public C0578g createFromParcel(Parcel parcel) {
                return new C0578g(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public C0578g[] newArray(int i) {
                return new C0578g[i];
            }
        }

        C0578g() {
        }

        C0578g(Parcel parcel) {
            this.f2069b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2069b);
        }
    }

    public C0570c(Context context) {
        super(context, C0006g.abc_action_menu_layout, C0006g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m2134a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1641i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof AbstractC0515q.AbstractC0516a) && ((AbstractC0515q.AbstractC0516a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: a */
    public View mo2132a(C0501k kVar, View view, ViewGroup viewGroup) {
        View actionView = kVar.getActionView();
        if (actionView == null || kVar.m2354f()) {
            actionView = super.mo2132a(kVar, view, viewGroup);
        }
        actionView.setVisibility(kVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b, androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(Context context, C0496h hVar) {
        super.mo133a(context, hVar);
        Resources resources = context.getResources();
        C0028a a = C0028a.m4185a(context);
        if (!this.f2049o) {
            this.f2048n = a.m4179g();
        }
        if (!this.f2055u) {
            this.f2050p = a.m4184b();
        }
        if (!this.f2053s) {
            this.f2052r = a.m4183c();
        }
        int i = this.f2050p;
        if (this.f2048n) {
            if (this.f2045k == null) {
                this.f2045k = new C0574d(this.f1634b);
                if (this.f2047m) {
                    this.f2045k.setImageDrawable(this.f2046l);
                    this.f2046l = null;
                    this.f2047m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2045k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2045k.getMeasuredWidth();
        } else {
            this.f2045k = null;
        }
        this.f2051q = i;
        this.f2057w = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f2059y = null;
    }

    /* renamed from: a */
    public void m2136a(Configuration configuration) {
        if (!this.f2053s) {
            this.f2052r = C0028a.m4185a(this.f1635c).m4183c();
        }
        C0496h hVar = this.f1636d;
        if (hVar != null) {
            hVar.mo87b(true);
        }
    }

    /* renamed from: a */
    public void m2135a(Drawable drawable) {
        C0574d dVar = this.f2045k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f2047m = true;
        this.f2046l = drawable;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0578g) && (i = ((C0578g) parcelable).f2069b) > 0 && (findItem = this.f1636d.findItem(i)) != null) {
            mo124a((SubMenuC0523v) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b, androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(C0496h hVar, boolean z) {
        m2122e();
        super.mo126a(hVar, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: a */
    public void mo2131a(C0501k kVar, AbstractC0515q.AbstractC0516a aVar) {
        aVar.mo148a(kVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1641i);
        if (this.f2042C == null) {
            this.f2042C = new C0572b();
        }
        actionMenuItemView.setPopupCallback(this.f2042C);
    }

    /* renamed from: a */
    public void m2130a(ActionMenuView actionMenuView) {
        this.f1641i = actionMenuView;
        actionMenuView.mo142a(this.f1636d);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b, androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean z) {
        super.mo123a(z);
        ((View) this.f1641i).requestLayout();
        C0496h hVar = this.f1636d;
        boolean z2 = false;
        if (hVar != null) {
            ArrayList<C0501k> c = hVar.m2397c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0197b a = c.get(i).mo2370a();
                if (a != null) {
                    a.m3492a(this);
                }
            }
        }
        C0496h hVar2 = this.f1636d;
        ArrayList<C0501k> j = hVar2 != null ? hVar2.m2378j() : null;
        if (this.f2048n && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !j.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0574d dVar = this.f2045k;
        if (z2) {
            if (dVar == null) {
                this.f2045k = new C0574d(this.f1634b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2045k.getParent();
            if (viewGroup != this.f1641i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2045k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1641i;
                actionMenuView.addView(this.f2045k, actionMenuView.m2260e());
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            AbstractC0515q qVar = this.f1641i;
            if (parent == qVar) {
                ((ViewGroup) qVar).removeView(this.f2045k);
            }
        }
        ((ActionMenuView) this.f1641i).setOverflowReserved(this.f2048n);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: a */
    public boolean mo2137a(int i, C0501k kVar) {
        return kVar.m2352h();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: a */
    public boolean mo2133a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f2045k) {
            return false;
        }
        return super.mo2133a(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b, androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(SubMenuC0523v vVar) {
        boolean z = false;
        if (!vVar.hasVisibleItems()) {
            return false;
        }
        SubMenuC0523v vVar2 = vVar;
        while (vVar2.m2293t() != this.f1636d) {
            vVar2 = (SubMenuC0523v) vVar2.m2293t();
        }
        View a = m2134a(vVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f2044E = vVar.getItem().getItemId();
        int size = vVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = vVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f2040A = new C0571a(this.f1635c, vVar, a);
        this.f2040A.m2321a(z);
        this.f2040A.m2318e();
        super.mo124a(vVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0484b
    /* renamed from: b */
    public AbstractC0515q mo2128b(ViewGroup viewGroup) {
        AbstractC0515q qVar = this.f1641i;
        AbstractC0515q b = super.mo2128b(viewGroup);
        if (qVar != b) {
            ((ActionMenuView) b).setPresenter(this);
        }
        return b;
    }

    /* renamed from: b */
    public void m2126b(boolean z) {
        this.f2056v = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo122b() {
        int i;
        ArrayList<C0501k> arrayList;
        int i2;
        int i3;
        C0570c cVar = this;
        C0496h hVar = cVar.f1636d;
        int i4 = 0;
        if (hVar != null) {
            arrayList = hVar.m2375n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = cVar.f2052r;
        int i6 = cVar.f2051q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1641i;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C0501k kVar = arrayList.get(i9);
            if (kVar.m2349k()) {
                i7++;
            } else if (kVar.m2350j()) {
                i8++;
            } else {
                z = true;
            }
            if (cVar.f2056v && kVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (cVar.f2048n && (z || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = cVar.f2058x;
        sparseBooleanArray.clear();
        if (cVar.f2054t) {
            int i11 = cVar.f2057w;
            i2 = i6 / i11;
            i3 = i11 + ((i6 % i11) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i12 = i6;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0501k kVar2 = arrayList.get(i13);
            if (kVar2.m2349k()) {
                View a = cVar.mo2132a(kVar2, cVar.f2059y, viewGroup);
                if (cVar.f2059y == null) {
                    cVar.f2059y = a;
                }
                if (cVar.f2054t) {
                    i2 -= ActionMenuView.m2266a(a, i3, i2, makeMeasureSpec, i4);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i14 = a.getMeasuredWidth();
                i12 -= i14;
                if (i14 != 0) {
                    i14 = i14;
                }
                int groupId = kVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                kVar2.m2357d(true);
                i = i;
            } else if (kVar2.m2350j()) {
                int groupId2 = kVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i10 > 0 || z2) && i12 > 0 && (!cVar.f2054t || i2 > 0);
                boolean z4 = z3;
                if (z3) {
                    View a2 = cVar.mo2132a(kVar2, cVar.f2059y, viewGroup);
                    i = i;
                    if (cVar.f2059y == null) {
                        cVar.f2059y = a2;
                    }
                    if (cVar.f2054t) {
                        int a3 = ActionMenuView.m2266a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        if (a3 == 0) {
                            z4 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth = a2.getMeasuredWidth();
                    i12 -= measuredWidth;
                    if (i14 == 0) {
                        i14 = measuredWidth;
                    }
                    z3 = z4 & (!cVar.f2054t ? i12 + i14 > 0 : i12 >= 0);
                } else {
                    i = i;
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C0501k kVar3 = arrayList.get(i15);
                        if (kVar3.getGroupId() == groupId2) {
                            if (kVar3.m2352h()) {
                                i10++;
                            }
                            kVar3.m2357d(false);
                        }
                    }
                }
                if (z3) {
                    i10--;
                }
                kVar2.m2357d(z3);
            } else {
                i = i;
                kVar2.m2357d(false);
                i13++;
                i4 = 0;
                cVar = this;
            }
            i13++;
            i4 = 0;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: c */
    public Parcelable mo117c() {
        C0578g gVar = new C0578g();
        gVar.f2069b = this.f2044E;
        return gVar;
    }

    /* renamed from: c */
    public void m2124c(boolean z) {
        this.f2048n = z;
        this.f2049o = true;
    }

    /* renamed from: e */
    public boolean m2122e() {
        return m2118g() | m2117h();
    }

    /* renamed from: f */
    public Drawable m2120f() {
        C0574d dVar = this.f2045k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f2047m) {
            return this.f2046l;
        }
        return null;
    }

    /* renamed from: g */
    public boolean m2118g() {
        AbstractC0515q qVar;
        RunnableC0573c cVar = this.f2041B;
        if (cVar == null || (qVar = this.f1641i) == null) {
            C0576e eVar = this.f2060z;
            if (eVar == null) {
                return false;
            }
            eVar.m2328a();
            return true;
        }
        ((View) qVar).removeCallbacks(cVar);
        this.f2041B = null;
        return true;
    }

    /* renamed from: h */
    public boolean m2117h() {
        C0571a aVar = this.f2040A;
        if (aVar == null) {
            return false;
        }
        aVar.m2328a();
        return true;
    }

    /* renamed from: i */
    public boolean m2116i() {
        return this.f2041B != null || m2115j();
    }

    /* renamed from: j */
    public boolean m2115j() {
        C0576e eVar = this.f2060z;
        return eVar != null && eVar.m2319c();
    }

    /* renamed from: k */
    public boolean m2114k() {
        C0496h hVar;
        if (!this.f2048n || m2115j() || (hVar = this.f1636d) == null || this.f1641i == null || this.f2041B != null || hVar.m2378j().isEmpty()) {
            return false;
        }
        this.f2041B = new RunnableC0573c(new C0576e(this.f1635c, this.f1636d, this.f2045k, true));
        ((View) this.f1641i).post(this.f2041B);
        super.mo124a((SubMenuC0523v) null);
        return true;
    }
}
