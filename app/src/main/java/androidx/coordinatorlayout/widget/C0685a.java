package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p000a.p013d.C0080g;
import p000a.p018g.p028k.AbstractC0181d;
import p000a.p018g.p028k.C0182e;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0685a<T> {

    /* renamed from: a */
    private final AbstractC0181d<ArrayList<T>> f2613a = new C0182e(10);

    /* renamed from: b */
    private final C0080g<T, ArrayList<T>> f2614b = new C0080g<>();

    /* renamed from: c */
    private final ArrayList<T> f2615c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2616d = new HashSet<>();

    /* renamed from: a */
    private void m1650a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f2614b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m1650a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m1649a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2613a.mo3558a(arrayList);
    }

    /* renamed from: c */
    private ArrayList<T> m1646c() {
        ArrayList<T> a = this.f2613a.mo3559a();
        return a == null ? new ArrayList<>() : a;
    }

    /* renamed from: a */
    public void m1653a() {
        int size = this.f2614b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> d = this.f2614b.m4013d(i);
            if (d != null) {
                m1649a((ArrayList) d);
            }
        }
        this.f2614b.clear();
    }

    /* renamed from: a */
    public void m1652a(T t) {
        if (!this.f2614b.containsKey(t)) {
            this.f2614b.put(t, null);
        }
    }

    /* renamed from: a */
    public void m1651a(T t, T t2) {
        if (!this.f2614b.containsKey(t) || !this.f2614b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f2614b.get(t);
        if (arrayList == null) {
            arrayList = m1646c();
            this.f2614b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public ArrayList<T> m1648b() {
        this.f2615c.clear();
        this.f2616d.clear();
        int size = this.f2614b.size();
        for (int i = 0; i < size; i++) {
            m1650a(this.f2614b.m4016b(i), this.f2615c, this.f2616d);
        }
        return this.f2615c;
    }

    /* renamed from: b */
    public boolean m1647b(T t) {
        return this.f2614b.containsKey(t);
    }

    /* renamed from: c */
    public List m1645c(T t) {
        return this.f2614b.get(t);
    }

    /* renamed from: d */
    public List<T> m1644d(T t) {
        int size = this.f2614b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> d = this.f2614b.m4013d(i);
            if (d != null && d.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2614b.m4016b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean m1643e(T t) {
        int size = this.f2614b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> d = this.f2614b.m4013d(i);
            if (d != null && d.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
