package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0513p;
import androidx.appcompat.view.menu.AbstractC0515q;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.view.menu.C0501k;
import androidx.appcompat.view.menu.SubMenuC0523v;
import androidx.recyclerview.widget.C0813j;
import java.util.ArrayList;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0230z;
import p050b.p051a.p052a.p053a.C0870c;
import p050b.p051a.p052a.p053a.C0874g;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes.dex */
public class C0961e implements AbstractC0513p {

    /* renamed from: b */
    private NavigationMenuView f3572b;

    /* renamed from: c */
    LinearLayout f3573c;

    /* renamed from: d */
    private AbstractC0513p.AbstractC0514a f3574d;

    /* renamed from: e */
    C0496h f3575e;

    /* renamed from: f */
    private int f3576f;

    /* renamed from: g */
    C0964c f3577g;

    /* renamed from: h */
    LayoutInflater f3578h;

    /* renamed from: i */
    int f3579i;

    /* renamed from: j */
    boolean f3580j;

    /* renamed from: k */
    ColorStateList f3581k;

    /* renamed from: l */
    ColorStateList f3582l;

    /* renamed from: m */
    Drawable f3583m;

    /* renamed from: n */
    int f3584n;

    /* renamed from: o */
    int f3585o;

    /* renamed from: p */
    private int f3586p;

    /* renamed from: q */
    int f3587q;

    /* renamed from: r */
    final View.OnClickListener f3588r = new View$OnClickListenerC0962a();

    /* renamed from: com.google.android.material.internal.e$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0962a implements View.OnClickListener {
        View$OnClickListenerC0962a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0961e.this.m118b(true);
            C0501k itemData = ((NavigationMenuItemView) view).getItemData();
            C0961e eVar = C0961e.this;
            boolean a = eVar.f3575e.m2410a(itemData, eVar, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                C0961e.this.f3577g.m102a(itemData);
            }
            C0961e.this.m118b(false);
            C0961e.this.mo123a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$b */
    /* loaded from: classes.dex */
    public static class C0963b extends AbstractC0972k {
        public C0963b(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$c */
    /* loaded from: classes.dex */
    public class C0964c extends C0813j.AbstractC0824g<AbstractC0972k> {

        /* renamed from: c */
        private final ArrayList<AbstractC0966e> f3590c = new ArrayList<>();

        /* renamed from: d */
        private C0501k f3591d;

        /* renamed from: e */
        private boolean f3592e;

        C0964c() {
            m91g();
        }

        /* renamed from: a */
        private void m104a(int i, int i2) {
            while (i < i2) {
                ((C0968g) this.f3590c.get(i)).f3597b = true;
                i++;
            }
        }

        /* renamed from: g */
        private void m91g() {
            if (!this.f3592e) {
                this.f3592e = true;
                this.f3590c.clear();
                this.f3590c.add(new C0965d());
                int size = C0961e.this.f3575e.m2375n().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0501k kVar = C0961e.this.f3575e.m2375n().get(i3);
                    if (kVar.isChecked()) {
                        m102a(kVar);
                    }
                    if (kVar.isCheckable()) {
                        kVar.m2359c(false);
                    }
                    if (kVar.hasSubMenu()) {
                        SubMenu subMenu = kVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f3590c.add(new C0967f(C0961e.this.f3587q, 0));
                            }
                            this.f3590c.add(new C0968g(kVar));
                            int size2 = this.f3590c.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0501k kVar2 = (C0501k) subMenu.getItem(i4);
                                if (kVar2.isVisible()) {
                                    if (!z2 && kVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (kVar2.isCheckable()) {
                                        kVar2.m2359c(false);
                                    }
                                    if (kVar.isChecked()) {
                                        m102a(kVar);
                                    }
                                    this.f3590c.add(new C0968g(kVar2));
                                }
                            }
                            if (z2) {
                                m104a(size2, this.f3590c.size());
                            }
                        }
                    } else {
                        int groupId = kVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f3590c.size();
                            z = kVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<AbstractC0966e> arrayList = this.f3590c;
                                int i5 = C0961e.this.f3587q;
                                arrayList.add(new C0967f(i5, i5));
                            }
                        } else if (!z && kVar.getIcon() != null) {
                            m104a(i2, this.f3590c.size());
                            z = true;
                        }
                        C0968g gVar = new C0968g(kVar);
                        gVar.f3597b = z;
                        this.f3590c.add(gVar);
                        i = groupId;
                    }
                }
                this.f3592e = false;
            }
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: a */
        public int mo106a() {
            return this.f3590c.size();
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: a */
        public long mo105a(int i) {
            return i;
        }

        /* renamed from: a */
        public void m103a(Bundle bundle) {
            C0501k a;
            View actionView;
            C0974g gVar;
            C0501k a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f3592e = true;
                int size = this.f3590c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    AbstractC0966e eVar = this.f3590c.get(i2);
                    if ((eVar instanceof C0968g) && (a2 = ((C0968g) eVar).m88a()) != null && a2.getItemId() == i) {
                        m102a(a2);
                        break;
                    }
                    i2++;
                }
                this.f3592e = false;
                m91g();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f3590c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC0966e eVar2 = this.f3590c.get(i3);
                    if (!(!(eVar2 instanceof C0968g) || (a = ((C0968g) eVar2).m88a()) == null || (actionView = a.getActionView()) == null || (gVar = (C0974g) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(gVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void m102a(C0501k kVar) {
            if (this.f3591d != kVar && kVar.isCheckable()) {
                C0501k kVar2 = this.f3591d;
                if (kVar2 != null) {
                    kVar2.setChecked(false);
                }
                this.f3591d = kVar;
                kVar.setChecked(true);
            }
        }

        /* renamed from: a */
        public void mo94d(AbstractC0972k kVar) {
            if (kVar instanceof C0969h) {
                ((NavigationMenuItemView) kVar.f3179a).m147d();
            }
        }

        /* renamed from: a */
        public void mo96b(AbstractC0972k kVar, int i) {
            int b = mo98b(i);
            if (b == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) kVar.f3179a;
                navigationMenuItemView.setIconTintList(C0961e.this.f3582l);
                C0961e eVar = C0961e.this;
                if (eVar.f3580j) {
                    navigationMenuItemView.setTextAppearance(eVar.f3579i);
                }
                ColorStateList colorStateList = C0961e.this.f3581k;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C0961e.this.f3583m;
                C0216r.m3434a(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C0968g gVar = (C0968g) this.f3590c.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f3597b);
                navigationMenuItemView.setHorizontalPadding(C0961e.this.f3584n);
                navigationMenuItemView.setIconPadding(C0961e.this.f3585o);
                navigationMenuItemView.mo148a(gVar.m88a(), 0);
            } else if (b == 1) {
                ((TextView) kVar.f3179a).setText(((C0968g) this.f3590c.get(i)).m88a().getTitle());
            } else if (b == 2) {
                C0967f fVar = (C0967f) this.f3590c.get(i);
                kVar.f3179a.setPadding(0, fVar.m89b(), 0, fVar.m90a());
            }
        }

        /* renamed from: a */
        public void m99a(boolean z) {
            this.f3592e = z;
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: b */
        public int mo98b(int i) {
            AbstractC0966e eVar = this.f3590c.get(i);
            if (eVar instanceof C0967f) {
                return 2;
            }
            if (eVar instanceof C0965d) {
                return 3;
            }
            if (eVar instanceof C0968g) {
                return ((C0968g) eVar).m88a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0824g
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public AbstractC0972k mo97b(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C0961e eVar = C0961e.this;
                return new C0969h(eVar.f3578h, viewGroup, eVar.f3588r);
            } else if (i == 1) {
                return new C0971j(C0961e.this.f3578h, viewGroup);
            } else {
                if (i == 2) {
                    return new C0970i(C0961e.this.f3578h, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C0963b(C0961e.this.f3573c);
            }
        }

        /* renamed from: d */
        public Bundle m95d() {
            Bundle bundle = new Bundle();
            C0501k kVar = this.f3591d;
            if (kVar != null) {
                bundle.putInt("android:menu:checked", kVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f3590c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0966e eVar = this.f3590c.get(i);
                if (eVar instanceof C0968g) {
                    C0501k a = ((C0968g) eVar).m88a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        C0974g gVar = new C0974g();
                        actionView.saveHierarchyState(gVar);
                        sparseArray.put(a.getItemId(), gVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: e */
        public C0501k m93e() {
            return this.f3591d;
        }

        /* renamed from: f */
        public void m92f() {
            m91g();
            m823c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$d */
    /* loaded from: classes.dex */
    public static class C0965d implements AbstractC0966e {
        C0965d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$e */
    /* loaded from: classes.dex */
    public interface AbstractC0966e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$f */
    /* loaded from: classes.dex */
    public static class C0967f implements AbstractC0966e {

        /* renamed from: a */
        private final int f3594a;

        /* renamed from: b */
        private final int f3595b;

        public C0967f(int i, int i2) {
            this.f3594a = i;
            this.f3595b = i2;
        }

        /* renamed from: a */
        public int m90a() {
            return this.f3595b;
        }

        /* renamed from: b */
        public int m89b() {
            return this.f3594a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$g */
    /* loaded from: classes.dex */
    public static class C0968g implements AbstractC0966e {

        /* renamed from: a */
        private final C0501k f3596a;

        /* renamed from: b */
        boolean f3597b;

        C0968g(C0501k kVar) {
            this.f3596a = kVar;
        }

        /* renamed from: a */
        public C0501k m88a() {
            return this.f3596a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$h */
    /* loaded from: classes.dex */
    public static class C0969h extends AbstractC0972k {
        public C0969h(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0874g.design_navigation_item, viewGroup, false));
            this.f3179a.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$i */
    /* loaded from: classes.dex */
    public static class C0970i extends AbstractC0972k {
        public C0970i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0874g.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.e$j */
    /* loaded from: classes.dex */
    public static class C0971j extends AbstractC0972k {
        public C0971j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0874g.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.e$k */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0972k extends C0813j.AbstractC0821d0 {
        public AbstractC0972k(View view) {
            super(view);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public int mo136a() {
        return this.f3576f;
    }

    /* renamed from: a */
    public View m135a(int i) {
        View inflate = this.f3578h.inflate(i, (ViewGroup) this.f3573c, false);
        m129a(inflate);
        return inflate;
    }

    /* renamed from: a */
    public AbstractC0515q m128a(ViewGroup viewGroup) {
        if (this.f3572b == null) {
            this.f3572b = (NavigationMenuView) this.f3578h.inflate(C0874g.design_navigation_menu, viewGroup, false);
            if (this.f3577g == null) {
                this.f3577g = new C0964c();
            }
            this.f3573c = (LinearLayout) this.f3578h.inflate(C0874g.design_navigation_item_header, (ViewGroup) this.f3572b, false);
            this.f3572b.setAdapter(this.f3577g);
        }
        return this.f3572b;
    }

    /* renamed from: a */
    public void m134a(C0230z zVar) {
        int e = zVar.m3355e();
        if (this.f3586p != e) {
            this.f3586p = e;
            if (this.f3573c.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.f3572b;
                navigationMenuView.setPadding(0, this.f3586p, 0, navigationMenuView.getPaddingBottom());
            }
        }
        C0216r.m3438a(this.f3573c, zVar);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(Context context, C0496h hVar) {
        this.f3578h = LayoutInflater.from(context);
        this.f3575e = hVar;
        this.f3587q = context.getResources().getDimensionPixelOffset(C0870c.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a */
    public void m132a(ColorStateList colorStateList) {
        this.f3582l = colorStateList;
        mo123a(false);
    }

    /* renamed from: a */
    public void m131a(Drawable drawable) {
        this.f3583m = drawable;
        mo123a(false);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f3572b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f3577g.m103a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f3573c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: a */
    public void m129a(View view) {
        this.f3573c.addView(view);
        NavigationMenuView navigationMenuView = this.f3572b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(C0496h hVar, boolean z) {
        AbstractC0513p.AbstractC0514a aVar = this.f3574d;
        if (aVar != null) {
            aVar.mo2108a(hVar, z);
        }
    }

    /* renamed from: a */
    public void m125a(C0501k kVar) {
        this.f3577g.m102a(kVar);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean z) {
        C0964c cVar = this.f3577g;
        if (cVar != null) {
            cVar.m92f();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo127a(C0496h hVar, C0501k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(SubMenuC0523v vVar) {
        return false;
    }

    /* renamed from: b */
    public void m121b(int i) {
        this.f3576f = i;
    }

    /* renamed from: b */
    public void m120b(ColorStateList colorStateList) {
        this.f3581k = colorStateList;
        mo123a(false);
    }

    /* renamed from: b */
    public void m118b(boolean z) {
        C0964c cVar = this.f3577g;
        if (cVar != null) {
            cVar.m99a(z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo122b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo119b(C0496h hVar, C0501k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: c */
    public Parcelable mo117c() {
        Bundle bundle = new Bundle();
        if (this.f3572b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3572b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C0964c cVar = this.f3577g;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.m95d());
        }
        if (this.f3573c != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f3573c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: c */
    public void m116c(int i) {
        this.f3584n = i;
        mo123a(false);
    }

    /* renamed from: d */
    public C0501k m115d() {
        return this.f3577g.m93e();
    }

    /* renamed from: d */
    public void m114d(int i) {
        this.f3585o = i;
        mo123a(false);
    }

    /* renamed from: e */
    public int m113e() {
        return this.f3573c.getChildCount();
    }

    /* renamed from: e */
    public void m112e(int i) {
        this.f3579i = i;
        this.f3580j = true;
        mo123a(false);
    }

    /* renamed from: f */
    public Drawable m111f() {
        return this.f3583m;
    }

    /* renamed from: g */
    public int m110g() {
        return this.f3584n;
    }

    /* renamed from: h */
    public int m109h() {
        return this.f3585o;
    }

    /* renamed from: i */
    public ColorStateList m108i() {
        return this.f3581k;
    }

    /* renamed from: j */
    public ColorStateList m107j() {
        return this.f3582l;
    }
}
