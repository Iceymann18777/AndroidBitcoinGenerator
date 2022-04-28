package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.widget.C0638t0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0496h.AbstractC0498b, AbstractC0515q, AdapterView.OnItemClickListener {

    /* renamed from: d */
    private static final int[] f1595d = {16842964, 16843049};

    /* renamed from: b */
    private C0496h f1596b;

    /* renamed from: c */
    private int f1597c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0638t0 a = C0638t0.m1900a(context, attributeSet, f1595d, i, 0);
        if (a.m1889g(0)) {
            setBackgroundDrawable(a.m1899b(0));
        }
        if (a.m1889g(1)) {
            setDivider(a.m1899b(1));
        }
        a.m1908a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q
    /* renamed from: a */
    public void mo142a(C0496h hVar) {
        this.f1596b = hVar;
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0498b
    /* renamed from: a */
    public boolean mo2265a(C0501k kVar) {
        return this.f1596b.m2411a(kVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1597c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo2265a((C0501k) getAdapter().getItem(i));
    }
}
