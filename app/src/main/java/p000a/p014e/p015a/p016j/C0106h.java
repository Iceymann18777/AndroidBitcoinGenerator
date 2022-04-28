package p000a.p014e.p015a.p016j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: a.e.a.j.h */
/* loaded from: classes.dex */
public class C0106h {

    /* renamed from: a */
    public List<C0102f> f489a;

    /* renamed from: b */
    int f490b;

    /* renamed from: c */
    int f491c;

    /* renamed from: d */
    public boolean f492d;

    /* renamed from: e */
    public final int[] f493e;

    /* renamed from: f */
    List<C0102f> f494f;

    /* renamed from: g */
    List<C0102f> f495g;

    /* renamed from: h */
    HashSet<C0102f> f496h;

    /* renamed from: i */
    HashSet<C0102f> f497i;

    /* renamed from: j */
    List<C0102f> f498j;

    /* renamed from: k */
    List<C0102f> f499k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0106h(List<C0102f> list) {
        this.f490b = -1;
        this.f491c = -1;
        this.f492d = false;
        this.f493e = new int[]{this.f490b, this.f491c};
        this.f494f = new ArrayList();
        this.f495g = new ArrayList();
        this.f496h = new HashSet<>();
        this.f497i = new HashSet<>();
        this.f498j = new ArrayList();
        this.f499k = new ArrayList();
        this.f489a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0106h(List<C0102f> list, boolean z) {
        this.f490b = -1;
        this.f491c = -1;
        this.f492d = false;
        this.f493e = new int[]{this.f490b, this.f491c};
        this.f494f = new ArrayList();
        this.f495g = new ArrayList();
        this.f496h = new HashSet<>();
        this.f497i = new HashSet<>();
        this.f498j = new ArrayList();
        this.f499k = new ArrayList();
        this.f489a = list;
        this.f492d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3789a(p000a.p014e.p015a.p016j.C0102f r7) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p014e.p015a.p016j.C0106h.m3789a(a.e.a.j.f):void");
    }

    /* renamed from: a */
    private void m3787a(ArrayList<C0102f> arrayList, C0102f fVar) {
        if (!fVar.f433d0) {
            arrayList.add(fVar);
            fVar.f433d0 = true;
            if (!fVar.m3812y()) {
                if (fVar instanceof C0109j) {
                    C0109j jVar = (C0109j) fVar;
                    int i = jVar.f508l0;
                    for (int i2 = 0; i2 < i; i2++) {
                        m3787a(arrayList, jVar.f507k0[i2]);
                    }
                }
                int length = fVar.f400A.length;
                for (int i3 = 0; i3 < length; i3++) {
                    C0097e eVar = fVar.f400A[i3].f375d;
                    if (eVar != null) {
                        C0102f fVar2 = eVar.f373b;
                        if (!(eVar == null || fVar2 == fVar.m3836k())) {
                            m3787a(arrayList, fVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0102f> m3791a() {
        if (!this.f498j.isEmpty()) {
            return this.f498j;
        }
        int size = this.f489a.size();
        for (int i = 0; i < size; i++) {
            C0102f fVar = this.f489a.get(i);
            if (!fVar.f429b0) {
                m3787a((ArrayList) this.f498j, fVar);
            }
        }
        this.f499k.clear();
        this.f499k.addAll(this.f489a);
        this.f499k.removeAll(this.f498j);
        return this.f498j;
    }

    /* renamed from: a */
    public List<C0102f> m3790a(int i) {
        if (i == 0) {
            return this.f494f;
        }
        if (i == 1) {
            return this.f495g;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3788a(C0102f fVar, int i) {
        HashSet<C0102f> hashSet;
        if (i == 0) {
            hashSet = this.f496h;
        } else if (i == 1) {
            hashSet = this.f497i;
        } else {
            return;
        }
        hashSet.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C0102f> m3785b(int i) {
        if (i == 0) {
            return this.f496h;
        }
        if (i == 1) {
            return this.f497i;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3786b() {
        int size = this.f499k.size();
        for (int i = 0; i < size; i++) {
            m3789a(this.f499k.get(i));
        }
    }
}
