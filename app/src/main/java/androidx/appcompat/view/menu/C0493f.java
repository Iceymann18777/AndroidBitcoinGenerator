package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import p000a.p001a.C0006g;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C0493f implements AbstractC0513p, AdapterView.OnItemClickListener {

    /* renamed from: b */
    Context f1684b;

    /* renamed from: c */
    LayoutInflater f1685c;

    /* renamed from: d */
    C0496h f1686d;

    /* renamed from: e */
    ExpandedMenuView f1687e;

    /* renamed from: f */
    int f1688f;

    /* renamed from: g */
    int f1689g;

    /* renamed from: h */
    int f1690h;

    /* renamed from: i */
    private AbstractC0513p.AbstractC0514a f1691i;

    /* renamed from: j */
    C0494a f1692j;

    /* renamed from: k */
    private int f1693k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.f$a */
    /* loaded from: classes.dex */
    public class C0494a extends BaseAdapter {

        /* renamed from: b */
        private int f1694b = -1;

        public C0494a() {
            m2426a();
        }

        /* renamed from: a */
        void m2426a() {
            C0501k f = C0493f.this.f1686d.m2384f();
            if (f != null) {
                ArrayList<C0501k> j = C0493f.this.f1686d.m2378j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (j.get(i) == f) {
                        this.f1694b = i;
                        return;
                    }
                }
            }
            this.f1694b = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0493f.this.f1686d.m2378j().size() - C0493f.this.f1688f;
            return this.f1694b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public C0501k getItem(int i) {
            ArrayList<C0501k> j = C0493f.this.f1686d.m2378j();
            int i2 = i + C0493f.this.f1688f;
            int i3 = this.f1694b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return j.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0493f fVar = C0493f.this;
                view = fVar.f1685c.inflate(fVar.f1690h, viewGroup, false);
            }
            ((AbstractC0515q.AbstractC0516a) view).mo148a(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m2426a();
            super.notifyDataSetChanged();
        }
    }

    public C0493f(int i, int i2) {
        this.f1690h = i;
        this.f1689g = i2;
    }

    public C0493f(Context context, int i) {
        this(i, 0);
        this.f1684b = context;
        this.f1685c = LayoutInflater.from(this.f1684b);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public int mo136a() {
        return this.f1693k;
    }

    /* renamed from: a */
    public AbstractC0515q m2429a(ViewGroup viewGroup) {
        if (this.f1687e == null) {
            this.f1687e = (ExpandedMenuView) this.f1685c.inflate(C0006g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1692j == null) {
                this.f1692j = new C0494a();
            }
            this.f1687e.setAdapter((ListAdapter) this.f1692j);
            this.f1687e.setOnItemClickListener(this);
        }
        return this.f1687e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r2.f1685c == null) goto L_0x000b;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo133a(android.content.Context r3, androidx.appcompat.view.menu.C0496h r4) {
        /*
            r2 = this;
            int r0 = r2.f1689g
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f1684b = r1
        L_0x000b:
            android.content.Context r3 = r2.f1684b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f1685c = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f1684b
            if (r0 == 0) goto L_0x001f
            r2.f1684b = r3
            android.view.LayoutInflater r3 = r2.f1685c
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f1686d = r4
            androidx.appcompat.view.menu.f$a r3 = r2.f1692j
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0493f.mo133a(android.content.Context, androidx.appcompat.view.menu.h):void");
    }

    /* renamed from: a */
    public void m2430a(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1687e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(Parcelable parcelable) {
        m2430a((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(C0496h hVar, boolean z) {
        AbstractC0513p.AbstractC0514a aVar = this.f1691i;
        if (aVar != null) {
            aVar.mo2108a(hVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo2308a(AbstractC0513p.AbstractC0514a aVar) {
        this.f1691i = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean z) {
        C0494a aVar = this.f1692j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
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
        if (!vVar.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerC0499i(vVar).m2371a((IBinder) null);
        AbstractC0513p.AbstractC0514a aVar = this.f1691i;
        if (aVar == null) {
            return true;
        }
        aVar.mo2109a(vVar);
        return true;
    }

    /* renamed from: b */
    public void m2428b(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1687e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
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
        if (this.f1687e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m2428b(bundle);
        return bundle;
    }

    /* renamed from: d */
    public ListAdapter m2427d() {
        if (this.f1692j == null) {
            this.f1692j = new C0494a();
        }
        return this.f1692j;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1686d.m2410a(this.f1692j.getItem(i), this, 0);
    }
}
