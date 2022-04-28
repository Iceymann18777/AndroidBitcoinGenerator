package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public class C0495g extends BaseAdapter {

    /* renamed from: b */
    C0496h f1696b;

    /* renamed from: c */
    private int f1697c = -1;

    /* renamed from: d */
    private boolean f1698d;

    /* renamed from: e */
    private final boolean f1699e;

    /* renamed from: f */
    private final LayoutInflater f1700f;

    /* renamed from: g */
    private final int f1701g;

    public C0495g(C0496h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1699e = z;
        this.f1700f = layoutInflater;
        this.f1696b = hVar;
        this.f1701g = i;
        m2425a();
    }

    /* renamed from: a */
    void m2425a() {
        C0501k f = this.f1696b.m2384f();
        if (f != null) {
            ArrayList<C0501k> j = this.f1696b.m2378j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f) {
                    this.f1697c = i;
                    return;
                }
            }
        }
        this.f1697c = -1;
    }

    /* renamed from: a */
    public void m2424a(boolean z) {
        this.f1698d = z;
    }

    /* renamed from: b */
    public C0496h m2423b() {
        return this.f1696b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0501k> j = this.f1699e ? this.f1696b.m2378j() : this.f1696b.m2375n();
        int i = this.f1697c;
        int size = j.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public C0501k getItem(int i) {
        ArrayList<C0501k> j = this.f1699e ? this.f1696b.m2378j() : this.f1696b.m2375n();
        int i2 = this.f1697c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1700f.inflate(this.f1701g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1696b.mo2296o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        AbstractC0515q.AbstractC0516a aVar = (AbstractC0515q.AbstractC0516a) view;
        if (this.f1698d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo148a(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m2425a();
        super.notifyDataSetChanged();
    }
}
