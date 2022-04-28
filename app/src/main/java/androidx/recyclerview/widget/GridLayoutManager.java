package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

import p000a.p018g.p029l.p030a0.C0191c;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: J */
    int[] f2832J;

    /* renamed from: K */
    View[] f2833K;

    /* renamed from: H */
    boolean f2830H = false;

    /* renamed from: I */
    int f2831I = -1;

    /* renamed from: L */
    final SparseIntArray f2834L = new SparseIntArray();

    /* renamed from: M */
    final SparseIntArray f2835M = new SparseIntArray();

    /* renamed from: N */
    AbstractC0765c f2836N = new C0763a();

    /* renamed from: O */
    final Rect f2837O = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C0763a extends AbstractC0765c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0765c
        /* renamed from: a */
        public int mo1323a(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0765c
        /* renamed from: c */
        public int mo1320c(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0764b extends C0813j.C0840p {

        /* renamed from: e */
        int f2838e = -1;

        /* renamed from: f */
        int f2839f = 0;

        public C0764b(int i, int i2) {
            super(i, i2);
        }

        public C0764b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0764b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0764b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public int m1326e() {
            return this.f2838e;
        }

        /* renamed from: f */
        public int m1325f() {
            return this.f2839f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0765c {

        /* renamed from: a */
        final SparseIntArray f2840a = new SparseIntArray();

        /* renamed from: b */
        private boolean f2841b = false;

        /* renamed from: a */
        public abstract int mo1323a(int i);

        /* renamed from: a */
        int m1322a(int i, int i2) {
            if (!this.f2841b) {
                return mo1320c(i, i2);
            }
            int i3 = this.f2840a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo1320c(i, i2);
            this.f2840a.put(i, c);
            return c;
        }

        /* renamed from: a */
        public void m1324a() {
            this.f2840a.clear();
        }

        /* renamed from: b */
        public int m1321b(int i, int i2) {
            int a = mo1323a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = mo1323a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            return i3 + a > i2 ? i4 + 1 : i4;
        }

        /* renamed from: c */
        public abstract int mo1320c(int i, int i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1328j(C0813j.AbstractC0835o.m775a(context, attributeSet, i, i2).f3231b);
    }

    /* renamed from: K */
    private void m1342K() {
        int e = m697e();
        for (int i = 0; i < e; i++) {
            C0764b bVar = (C0764b) m715c(i).getLayoutParams();
            int a = bVar.m654a();
            this.f2834L.put(a, bVar.m1325f());
            this.f2835M.put(a, bVar.m1326e());
        }
    }

    /* renamed from: L */
    private void m1341L() {
        this.f2834L.clear();
        this.f2835M.clear();
    }

    /* renamed from: M */
    private void m1340M() {
        View[] viewArr = this.f2833K;
        if (viewArr == null || viewArr.length != this.f2831I) {
            this.f2833K = new View[this.f2831I];
        }
    }

    /* renamed from: N */
    private void m1339N() {
        int i;
        int i2;
        if (m1315H() == 1) {
            i2 = m665q() - m668o();
            i = m670n();
        } else {
            i2 = m682h() - m672m();
            i = m666p();
        }
        m1327k(i2 - i);
    }

    /* renamed from: a */
    private int m1335a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, int i) {
        if (!a0Var.m902d()) {
            return this.f2836N.m1321b(i, this.f2831I);
        }
        int a = vVar.m629a(i);
        if (a != -1) {
            return this.f2836N.m1321b(a, this.f2831I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: a */
    private void m1338a(float f, int i) {
        m1327k(Math.max(Math.round(f * this.f2831I), i));
    }

    /* renamed from: a */
    private void m1337a(View view, int i, int i2, boolean z) {
        C0813j.C0840p pVar = (C0813j.C0840p) view.getLayoutParams();
        if (z ? m725b(view, i, i2, pVar) : m768a(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m1336a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0764b bVar = (C0764b) view.getLayoutParams();
        Rect rect = bVar.f3235b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int f = m1329f(bVar.f2838e, bVar.f2839f);
        if (this.f2849s == 1) {
            i2 = C0813j.AbstractC0835o.m784a(f, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = C0813j.AbstractC0835o.m784a(this.f2851u.mo1028g(), m680i(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            i3 = C0813j.AbstractC0835o.m784a(f, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            i2 = C0813j.AbstractC0835o.m784a(this.f2851u.mo1028g(), m664r(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
        }
        m1337a(view, i2, i3, z);
    }

    /* renamed from: a */
    private void m1334a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.f2833K[i4];
            C0764b bVar = (C0764b) view.getLayoutParams();
            bVar.f2839f = m1330c(vVar, a0Var, m673l(view));
            bVar.f2838e = i5;
            i5 += bVar.f2839f;
            i4 += i3;
        }
    }

    /* renamed from: a */
    static int[] m1333a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: b */
    private int m1332b(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, int i) {
        if (!a0Var.m902d()) {
            return this.f2836N.m1322a(i, this.f2831I);
        }
        int i2 = this.f2835M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.m629a(i);
        if (a != -1) {
            return this.f2836N.m1322a(a, this.f2831I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: b */
    private void m1331b(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, LinearLayoutManager.C0766a aVar, int i) {
        boolean z = i == 1;
        int b = m1332b(vVar, a0Var, aVar.f2858b);
        if (z) {
            while (b > 0) {
                int i2 = aVar.f2858b;
                if (i2 > 0) {
                    aVar.f2858b = i2 - 1;
                    b = m1332b(vVar, a0Var, aVar.f2858b);
                } else {
                    return;
                }
            }
            return;
        }
        int a = a0Var.m907a() - 1;
        int i3 = aVar.f2858b;
        while (i3 < a) {
            int i4 = i3 + 1;
            int b2 = m1332b(vVar, a0Var, i4);
            if (b2 <= b) {
                break;
            }
            i3 = i4;
            b = b2;
        }
        aVar.f2858b = i3;
    }

    /* renamed from: c */
    private int m1330c(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, int i) {
        if (!a0Var.m902d()) {
            return this.f2836N.mo1323a(i);
        }
        int i2 = this.f2834L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.m629a(i);
        if (a != -1) {
            return this.f2836N.mo1323a(a);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: k */
    private void m1327k(int i) {
        this.f2832J = m1333a(this.f2832J, this.f2831I, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: C */
    public boolean mo789C() {
        return this.f2845D == null && !this.f2830H;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo778a(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        m1339N();
        m1340M();
        return super.mo778a(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo751a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        if (this.f2849s == 1) {
            return this.f2831I;
        }
        if (a0Var.m907a() < 1) {
            return 0;
        }
        return m1335a(vVar, a0Var, a0Var.m907a() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00cd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f7, code lost:
        if (r13 == r11) goto L_0x00b7;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo765a(android.view.View r24, int r25, androidx.recyclerview.widget.C0813j.C0847v r26, androidx.recyclerview.widget.C0813j.C0815a0 r27) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo765a(android.view.View, int, androidx.recyclerview.widget.j$v, androidx.recyclerview.widget.j$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    View mo1299a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, int i, int i2, int i3) {
        m1318E();
        int f = this.f2851u.mo1030f();
        int b = this.f2851u.mo1038b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View c = m715c(i);
            int l = m673l(c);
            if (l >= 0 && l < i3 && m1332b(vVar, a0Var, l) == 0) {
                if (((C0813j.C0840p) c.getLayoutParams()).m652c()) {
                    if (view2 == null) {
                        view2 = c;
                    }
                } else if (this.f2851u.mo1033d(c) < b && this.f2851u.mo1039a(c) >= f) {
                    return c;
                } else {
                    if (view == null) {
                        view = c;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public C0813j.C0840p mo776a(Context context, AttributeSet attributeSet) {
        return new C0764b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public C0813j.C0840p mo758a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0764b((ViewGroup.MarginLayoutParams) layoutParams) : new C0764b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo774a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2832J == null) {
            super.mo774a(rect, i, i2);
        }
        int n = m670n() + m668o();
        int p = m666p() + m672m();
        if (this.f2849s == 1) {
            i4 = C0813j.AbstractC0835o.m785a(i2, rect.height() + p, m676k());
            int[] iArr = this.f2832J;
            i3 = C0813j.AbstractC0835o.m785a(i, iArr[iArr.length - 1] + n, m674l());
        } else {
            i3 = C0813j.AbstractC0835o.m785a(i, rect.width() + n, m674l());
            int[] iArr2 = this.f2832J;
            i4 = C0813j.AbstractC0835o.m785a(i2, iArr2[iArr2.length - 1] + p, m676k());
        }
        m714c(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    void mo1304a(C0813j.C0815a0 a0Var, LinearLayoutManager.C0768c cVar, C0813j.AbstractC0835o.AbstractC0838c cVar2) {
        int i = this.f2831I;
        for (int i2 = 0; i2 < this.f2831I && cVar.m1260a(a0Var) && i > 0; i2++) {
            int i3 = cVar.f2869d;
            cVar2.mo655a(i3, Math.max(0, cVar.f2872g));
            i -= this.f2836N.mo1323a(i3);
            cVar.f2869d += cVar.f2870e;
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo746a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, View view, C0191c cVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0764b)) {
            super.m763a(view, cVar);
            return;
        }
        C0764b bVar = (C0764b) layoutParams;
        int a = m1335a(vVar, a0Var, bVar.m654a());
        if (this.f2849s == 0) {
            i4 = bVar.m1326e();
            i3 = bVar.m1325f();
            i = 1;
            z2 = this.f2831I > 1 && bVar.m1325f() == this.f2831I;
            z = false;
            i2 = a;
        } else {
            i3 = 1;
            i2 = bVar.m1326e();
            i = bVar.m1325f();
            z2 = this.f2831I > 1 && bVar.m1325f() == this.f2831I;
            z = false;
            i4 = a;
        }
        cVar.m3530b(C0191c.C0194c.m3496a(i4, i3, i2, i, z2, z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public void mo1297a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, LinearLayoutManager.C0766a aVar, int i) {
        super.mo1297a(vVar, a0Var, aVar, i);
        m1339N();
        if (a0Var.m907a() > 0 && !a0Var.m902d()) {
            m1331b(vVar, a0Var, aVar, i);
        }
        m1340M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        r22.f2863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo1296a(androidx.recyclerview.widget.C0813j.C0847v r19, androidx.recyclerview.widget.C0813j.C0815a0 r20, androidx.recyclerview.widget.LinearLayoutManager.C0768c r21, androidx.recyclerview.widget.LinearLayoutManager.C0767b r22) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1296a(androidx.recyclerview.widget.j$v, androidx.recyclerview.widget.j$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo743a(C0813j jVar, int i, int i2) {
        this.f2836N.m1324a();
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo742a(C0813j jVar, int i, int i2, int i3) {
        this.f2836N.m1324a();
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo741a(C0813j jVar, int i, int i2, Object obj) {
        this.f2836N.m1324a();
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public boolean mo754a(C0813j.C0840p pVar) {
        return pVar instanceof C0764b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo728b(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        m1339N();
        m1340M();
        return super.mo728b(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo721b(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        if (this.f2849s == 0) {
            return this.f2831I;
        }
        if (a0Var.m907a() < 1) {
            return 0;
        }
        return m1335a(vVar, a0Var, a0Var.m907a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public void mo719b(C0813j jVar, int i, int i2) {
        this.f2836N.m1324a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: b */
    public void mo1288b(boolean z) {
        if (!z) {
            super.mo1288b(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public C0813j.C0840p mo716c() {
        return this.f2849s == 0 ? new C0764b(-2, -1) : new C0764b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public void mo699d(C0813j jVar) {
        this.f2836N.m1324a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public void mo693e(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        if (a0Var.m902d()) {
            m1342K();
        }
        super.mo693e(vVar, a0Var);
        m1341L();
    }

    /* renamed from: f */
    int m1329f(int i, int i2) {
        if (this.f2849s != 1 || !m1314I()) {
            int[] iArr = this.f2832J;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2832J;
        int i3 = this.f2831I;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: g */
    public void mo683g(C0813j.C0815a0 a0Var) {
        super.mo683g(a0Var);
        this.f2830H = false;
    }

    /* renamed from: j */
    public void m1328j(int i) {
        if (i != this.f2831I) {
            this.f2830H = true;
            if (i >= 1) {
                this.f2831I = i;
                this.f2836N.m1324a();
                m657y();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }
}
