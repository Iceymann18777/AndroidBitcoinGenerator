package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.n */
/* loaded from: classes.dex */
public abstract class AbstractC0510n implements AbstractC0519t, AbstractC0513p, AdapterView.OnItemClickListener {

    /* renamed from: b */
    private Rect f1772b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m2332a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static C0495g m2333a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0495g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0495g) listAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static boolean m2331b(C0496h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public int mo136a() {
        return 0;
    }

    /* renamed from: a */
    public abstract void mo2312a(int i);

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(Context context, C0496h hVar) {
    }

    /* renamed from: a */
    public void m2334a(Rect rect) {
        this.f1772b = rect;
    }

    /* renamed from: a */
    public abstract void mo2311a(View view);

    /* renamed from: a */
    public abstract void mo2310a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo2309a(C0496h hVar);

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo127a(C0496h hVar, C0501k kVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo2307b(int i);

    /* renamed from: b */
    public abstract void mo2306b(boolean z);

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo119b(C0496h hVar, C0501k kVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo2305c(int i);

    /* renamed from: c */
    public abstract void mo2304c(boolean z);

    /* renamed from: g */
    protected boolean mo2330g() {
        return true;
    }

    /* renamed from: h */
    public Rect m2329h() {
        return this.f1772b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m2333a(listAdapter).f1696b.m2410a((MenuItem) listAdapter.getItem(i), this, mo2330g() ? 0 : 4);
    }
}
