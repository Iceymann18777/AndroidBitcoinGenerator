package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends C0813j.AbstractC0835o implements AbstractC0806f, C0813j.AbstractC0852z.AbstractC0853a {

    /* renamed from: C */
    private boolean f2844C;

    /* renamed from: t */
    private C0768c f2850t;

    /* renamed from: u */
    AbstractC0810i f2851u;

    /* renamed from: v */
    private boolean f2852v;

    /* renamed from: s */
    int f2849s = 1;

    /* renamed from: w */
    private boolean f2853w = false;

    /* renamed from: x */
    boolean f2854x = false;

    /* renamed from: y */
    private boolean f2855y = false;

    /* renamed from: z */
    private boolean f2856z = true;

    /* renamed from: A */
    int f2842A = -1;

    /* renamed from: B */
    int f2843B = Integer.MIN_VALUE;

    /* renamed from: D */
    C0769d f2845D = null;

    /* renamed from: E */
    final C0766a f2846E = new C0766a();

    /* renamed from: F */
    private final C0767b f2847F = new C0767b();

    /* renamed from: G */
    private int f2848G = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C0766a {

        /* renamed from: a */
        AbstractC0810i f2857a;

        /* renamed from: b */
        int f2858b;

        /* renamed from: c */
        int f2859c;

        /* renamed from: d */
        boolean f2860d;

        /* renamed from: e */
        boolean f2861e;

        C0766a() {
            m1265b();
        }

        /* renamed from: a */
        void m1268a() {
            this.f2859c = this.f2860d ? this.f2857a.mo1038b() : this.f2857a.mo1030f();
        }

        /* renamed from: a */
        public void m1267a(View view, int i) {
            this.f2859c = this.f2860d ? this.f2857a.mo1039a(view) + this.f2857a.m1043h() : this.f2857a.mo1033d(view);
            this.f2858b = i;
        }

        /* renamed from: a */
        boolean m1266a(View view, C0813j.C0815a0 a0Var) {
            C0813j.C0840p pVar = (C0813j.C0840p) view.getLayoutParams();
            return !pVar.m652c() && pVar.m654a() >= 0 && pVar.m654a() < a0Var.m907a();
        }

        /* renamed from: b */
        void m1265b() {
            this.f2858b = -1;
            this.f2859c = Integer.MIN_VALUE;
            this.f2860d = false;
            this.f2861e = false;
        }

        /* renamed from: b */
        public void m1264b(View view, int i) {
            int h = this.f2857a.m1043h();
            if (h >= 0) {
                m1267a(view, i);
                return;
            }
            this.f2858b = i;
            if (this.f2860d) {
                int b = (this.f2857a.mo1038b() - h) - this.f2857a.mo1039a(view);
                this.f2859c = this.f2857a.mo1038b() - b;
                if (b > 0) {
                    int b2 = this.f2859c - this.f2857a.mo1037b(view);
                    int f = this.f2857a.mo1030f();
                    int min = b2 - (f + Math.min(this.f2857a.mo1033d(view) - f, 0));
                    if (min < 0) {
                        this.f2859c += Math.min(b, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int d = this.f2857a.mo1033d(view);
            int f2 = d - this.f2857a.mo1030f();
            this.f2859c = d;
            if (f2 > 0) {
                int b3 = (this.f2857a.mo1038b() - Math.min(0, (this.f2857a.mo1038b() - h) - this.f2857a.mo1039a(view))) - (d + this.f2857a.mo1037b(view));
                if (b3 < 0) {
                    this.f2859c -= Math.min(f2, -b3);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2858b + ", mCoordinate=" + this.f2859c + ", mLayoutFromEnd=" + this.f2860d + ", mValid=" + this.f2861e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0767b {

        /* renamed from: a */
        public int f2862a;

        /* renamed from: b */
        public boolean f2863b;

        /* renamed from: c */
        public boolean f2864c;

        /* renamed from: d */
        public boolean f2865d;

        protected C0767b() {
        }

        /* renamed from: a */
        void m1263a() {
            this.f2862a = 0;
            this.f2863b = false;
            this.f2864c = false;
            this.f2865d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0768c {

        /* renamed from: b */
        int f2867b;

        /* renamed from: c */
        int f2868c;

        /* renamed from: d */
        int f2869d;

        /* renamed from: e */
        int f2870e;

        /* renamed from: f */
        int f2871f;

        /* renamed from: g */
        int f2872g;

        /* renamed from: i */
        boolean f2874i;

        /* renamed from: j */
        int f2875j;

        /* renamed from: l */
        boolean f2877l;

        /* renamed from: a */
        boolean f2866a = true;

        /* renamed from: h */
        int f2873h = 0;

        /* renamed from: k */
        List<C0813j.AbstractC0821d0> f2876k = null;

        C0768c() {
        }

        /* renamed from: b */
        private View m1258b() {
            int size = this.f2876k.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2876k.get(i).f3179a;
                C0813j.C0840p pVar = (C0813j.C0840p) view.getLayoutParams();
                if (!pVar.m652c() && this.f2869d == pVar.m654a()) {
                    m1261a(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public View m1259a(C0813j.C0847v vVar) {
            if (this.f2876k != null) {
                return m1258b();
            }
            View d = vVar.m603d(this.f2869d);
            this.f2869d += this.f2870e;
            return d;
        }

        /* renamed from: a */
        public void m1262a() {
            m1261a((View) null);
        }

        /* renamed from: a */
        public void m1261a(View view) {
            View b = m1257b(view);
            this.f2869d = b == null ? -1 : ((C0813j.C0840p) b.getLayoutParams()).m654a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m1260a(C0813j.C0815a0 a0Var) {
            int i = this.f2869d;
            return i >= 0 && i < a0Var.m907a();
        }

        /* renamed from: b */
        public View m1257b(View view) {
            int a;
            int size = this.f2876k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f2876k.get(i2).f3179a;
                C0813j.C0840p pVar = (C0813j.C0840p) view3.getLayoutParams();
                if (view3 != view && !pVar.m652c() && (a = (pVar.m654a() - this.f2869d) * this.f2870e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C0769d implements Parcelable {
        public static final Parcelable.Creator<C0769d> CREATOR = new C0770a();

        /* renamed from: b */
        int f2878b;

        /* renamed from: c */
        int f2879c;

        /* renamed from: d */
        boolean f2880d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: classes.dex */
        static class C0770a implements Parcelable.Creator<C0769d> {
            C0770a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public C0769d createFromParcel(Parcel parcel) {
                return new C0769d(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public C0769d[] newArray(int i) {
                return new C0769d[i];
            }
        }

        public C0769d() {
        }

        C0769d(Parcel parcel) {
            this.f2878b = parcel.readInt();
            this.f2879c = parcel.readInt();
            this.f2880d = parcel.readInt() != 1 ? false : true;
        }

        public C0769d(C0769d dVar) {
            this.f2878b = dVar.f2878b;
            this.f2879c = dVar.f2879c;
            this.f2880d = dVar.f2880d;
        }

        /* renamed from: a */
        boolean m1256a() {
            return this.f2878b >= 0;
        }

        /* renamed from: b */
        void m1255b() {
            this.f2878b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2878b);
            parcel.writeInt(this.f2879c);
            parcel.writeInt(this.f2880d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        m1277i(i);
        m1295a(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0813j.AbstractC0835o.C0839d a = C0813j.AbstractC0835o.m775a(context, attributeSet, i, i2);
        m1277i(a.f3230a);
        m1295a(a.f3232c);
        mo1288b(a.f3233d);
    }

    /* renamed from: K */
    private View m1312K() {
        return m715c(this.f2854x ? 0 : m697e() - 1);
    }

    /* renamed from: L */
    private View m1311L() {
        return m715c(this.f2854x ? m697e() - 1 : 0);
    }

    /* renamed from: M */
    private void m1310M() {
        this.f2854x = (this.f2849s == 1 || !m1314I()) ? this.f2853w : !this.f2853w;
    }

    /* renamed from: a */
    private int m1307a(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var, boolean z) {
        int b;
        int b2 = this.f2851u.mo1038b() - i;
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -m1286c(-b2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (b = this.f2851u.mo1038b() - i3) <= 0) {
            return i2;
        }
        this.f2851u.mo1040a(b);
        return b + i2;
    }

    /* renamed from: a */
    private View m1294a(boolean z, boolean z2) {
        int e;
        int i;
        if (this.f2854x) {
            e = 0;
            i = m697e();
        } else {
            e = m697e() - 1;
            i = -1;
        }
        return m1308a(e, i, z, z2);
    }

    /* renamed from: a */
    private void m1309a(int i, int i2, boolean z, C0813j.C0815a0 a0Var) {
        int i3;
        this.f2850t.f2877l = m1313J();
        this.f2850t.f2873h = m1279h(a0Var);
        C0768c cVar = this.f2850t;
        cVar.f2871f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.f2873h += this.f2851u.mo1036c();
            View K = m1312K();
            C0768c cVar2 = this.f2850t;
            if (!this.f2854x) {
                i4 = 1;
            }
            cVar2.f2870e = i4;
            C0768c cVar3 = this.f2850t;
            int l = m673l(K);
            C0768c cVar4 = this.f2850t;
            cVar3.f2869d = l + cVar4.f2870e;
            cVar4.f2867b = this.f2851u.mo1039a(K);
            i3 = this.f2851u.mo1039a(K) - this.f2851u.mo1038b();
        } else {
            View L = m1311L();
            this.f2850t.f2873h += this.f2851u.mo1030f();
            C0768c cVar5 = this.f2850t;
            if (this.f2854x) {
                i4 = 1;
            }
            cVar5.f2870e = i4;
            C0768c cVar6 = this.f2850t;
            int l2 = m673l(L);
            C0768c cVar7 = this.f2850t;
            cVar6.f2869d = l2 + cVar7.f2870e;
            cVar7.f2867b = this.f2851u.mo1033d(L);
            i3 = (-this.f2851u.mo1033d(L)) + this.f2851u.mo1030f();
        }
        C0768c cVar8 = this.f2850t;
        cVar8.f2868c = i2;
        if (z) {
            cVar8.f2868c -= i3;
        }
        this.f2850t.f2872g = i3;
    }

    /* renamed from: a */
    private void m1306a(C0766a aVar) {
        m1284f(aVar.f2858b, aVar.f2859c);
    }

    /* renamed from: a */
    private void m1303a(C0813j.C0847v vVar, int i) {
        int e = m697e();
        if (i >= 0) {
            int a = this.f2851u.mo1041a() - i;
            if (this.f2854x) {
                for (int i2 = 0; i2 < e; i2++) {
                    View c = m715c(i2);
                    if (this.f2851u.mo1033d(c) < a || this.f2851u.mo1029f(c) < a) {
                        m1302a(vVar, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = e - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                View c2 = m715c(i4);
                if (this.f2851u.mo1033d(c2) < a || this.f2851u.mo1029f(c2) < a) {
                    m1302a(vVar, i3, i4);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m1302a(C0813j.C0847v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    m779a(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                m779a(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: a */
    private void m1301a(C0813j.C0847v vVar, C0768c cVar) {
        if (cVar.f2866a && !cVar.f2877l) {
            int i = cVar.f2871f;
            int i2 = cVar.f2872g;
            if (i == -1) {
                m1303a(vVar, i2);
            } else {
                m1291b(vVar, i2);
            }
        }
    }

    /* renamed from: a */
    private boolean m1305a(C0813j.C0815a0 a0Var, C0766a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.m902d() && (i = this.f2842A) != -1) {
            if (i < 0 || i >= a0Var.m907a()) {
                this.f2842A = -1;
                this.f2843B = Integer.MIN_VALUE;
            } else {
                aVar.f2858b = this.f2842A;
                C0769d dVar = this.f2845D;
                if (dVar != null && dVar.m1256a()) {
                    aVar.f2860d = this.f2845D.f2880d;
                    aVar.f2859c = aVar.f2860d ? this.f2851u.mo1038b() - this.f2845D.f2879c : this.f2851u.mo1030f() + this.f2845D.f2879c;
                    return true;
                } else if (this.f2843B == Integer.MIN_VALUE) {
                    View b = mo731b(this.f2842A);
                    if (b == null) {
                        if (m697e() > 0) {
                            if ((this.f2842A < m673l(m715c(0))) == this.f2854x) {
                                z = true;
                            }
                            aVar.f2860d = z;
                        }
                        aVar.m1268a();
                    } else if (this.f2851u.mo1037b(b) > this.f2851u.mo1028g()) {
                        aVar.m1268a();
                        return true;
                    } else if (this.f2851u.mo1033d(b) - this.f2851u.mo1030f() < 0) {
                        aVar.f2859c = this.f2851u.mo1030f();
                        aVar.f2860d = false;
                        return true;
                    } else if (this.f2851u.mo1038b() - this.f2851u.mo1039a(b) < 0) {
                        aVar.f2859c = this.f2851u.mo1038b();
                        aVar.f2860d = true;
                        return true;
                    } else {
                        aVar.f2859c = aVar.f2860d ? this.f2851u.mo1039a(b) + this.f2851u.m1043h() : this.f2851u.mo1033d(b);
                    }
                    return true;
                } else {
                    boolean z2 = this.f2854x;
                    aVar.f2860d = z2;
                    aVar.f2859c = z2 ? this.f2851u.mo1038b() - this.f2843B : this.f2851u.mo1030f() + this.f2843B;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m1298a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, C0766a aVar) {
        boolean z = false;
        if (m697e() == 0) {
            return false;
        }
        View g = m686g();
        if (g != null && aVar.m1266a(g, a0Var)) {
            aVar.m1264b(g, m673l(g));
            return true;
        } else if (this.f2852v != this.f2855y) {
            return false;
        } else {
            View l = aVar.f2860d ? m1270l(vVar, a0Var) : m1269m(vVar, a0Var);
            if (l == null) {
                return false;
            }
            aVar.m1267a(l, m673l(l));
            if (!a0Var.m902d() && mo789C()) {
                if (this.f2851u.mo1033d(l) >= this.f2851u.mo1038b() || this.f2851u.mo1039a(l) < this.f2851u.mo1030f()) {
                    z = true;
                }
                if (z) {
                    aVar.f2859c = aVar.f2860d ? this.f2851u.mo1038b() : this.f2851u.mo1030f();
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private int m1293b(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var, boolean z) {
        int f;
        int f2 = i - this.f2851u.mo1030f();
        if (f2 <= 0) {
            return 0;
        }
        int i2 = -m1286c(f2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (f = i3 - this.f2851u.mo1030f()) <= 0) {
            return i2;
        }
        this.f2851u.mo1040a(-f);
        return i2 - f;
    }

    /* renamed from: b */
    private View m1287b(boolean z, boolean z2) {
        int i;
        int e;
        if (this.f2854x) {
            i = m697e() - 1;
            e = -1;
        } else {
            i = 0;
            e = m697e();
        }
        return m1308a(i, e, z, z2);
    }

    /* renamed from: b */
    private void m1292b(C0766a aVar) {
        m1282g(aVar.f2858b, aVar.f2859c);
    }

    /* renamed from: b */
    private void m1291b(C0813j.C0847v vVar, int i) {
        if (i >= 0) {
            int e = m697e();
            if (this.f2854x) {
                int i2 = e - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    View c = m715c(i3);
                    if (this.f2851u.mo1039a(c) > i || this.f2851u.mo1031e(c) > i) {
                        m1302a(vVar, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i4 = 0; i4 < e; i4++) {
                View c2 = m715c(i4);
                if (this.f2851u.mo1039a(c2) > i || this.f2851u.mo1031e(c2) > i) {
                    m1302a(vVar, 0, i4);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m1290b(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, int i, int i2) {
        if (a0Var.m901e() && m697e() != 0 && !a0Var.m902d() && mo789C()) {
            List<C0813j.AbstractC0821d0> f = vVar.m598f();
            int size = f.size();
            int l = m673l(m715c(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0813j.AbstractC0821d0 d0Var = f.get(i5);
                if (!d0Var.m864p()) {
                    char c = 1;
                    if ((d0Var.m871i() < l) != this.f2854x) {
                        c = 65535;
                    }
                    int b = this.f2851u.mo1037b(d0Var.f3179a);
                    if (c == 65535) {
                        i3 += b;
                    } else {
                        i4 += b;
                    }
                }
            }
            this.f2850t.f2876k = f;
            if (i3 > 0) {
                m1282g(m673l(m1311L()), i);
                C0768c cVar = this.f2850t;
                cVar.f2873h = i3;
                cVar.f2868c = 0;
                cVar.m1262a();
                m1300a(vVar, this.f2850t, a0Var, false);
            }
            if (i4 > 0) {
                m1284f(m673l(m1312K()), i2);
                C0768c cVar2 = this.f2850t;
                cVar2.f2873h = i4;
                cVar2.f2868c = 0;
                cVar2.m1262a();
                m1300a(vVar, this.f2850t, a0Var, false);
            }
            this.f2850t.f2876k = null;
        }
    }

    /* renamed from: b */
    private void m1289b(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, C0766a aVar) {
        if (!m1305a(a0Var, aVar) && !m1298a(vVar, a0Var, aVar)) {
            aVar.m1268a();
            aVar.f2858b = this.f2855y ? a0Var.m907a() - 1 : 0;
        }
    }

    /* renamed from: f */
    private View m1283f(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return m1285e(0, m697e());
    }

    /* renamed from: f */
    private void m1284f(int i, int i2) {
        this.f2850t.f2868c = this.f2851u.mo1038b() - i2;
        this.f2850t.f2870e = this.f2854x ? -1 : 1;
        C0768c cVar = this.f2850t;
        cVar.f2869d = i;
        cVar.f2871f = 1;
        cVar.f2867b = i2;
        cVar.f2872g = Integer.MIN_VALUE;
    }

    /* renamed from: g */
    private View m1281g(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return mo1299a(vVar, a0Var, 0, m697e(), a0Var.m907a());
    }

    /* renamed from: g */
    private void m1282g(int i, int i2) {
        this.f2850t.f2868c = i2 - this.f2851u.mo1030f();
        C0768c cVar = this.f2850t;
        cVar.f2869d = i;
        cVar.f2870e = this.f2854x ? 1 : -1;
        C0768c cVar2 = this.f2850t;
        cVar2.f2871f = -1;
        cVar2.f2867b = i2;
        cVar2.f2872g = Integer.MIN_VALUE;
    }

    /* renamed from: h */
    private View m1278h(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return m1285e(m697e() - 1, -1);
    }

    /* renamed from: i */
    private int m1276i(C0813j.C0815a0 a0Var) {
        if (m697e() == 0) {
            return 0;
        }
        m1318E();
        return C0856l.m578a(a0Var, this.f2851u, m1287b(!this.f2856z, true), m1294a(!this.f2856z, true), this, this.f2856z);
    }

    /* renamed from: i */
    private View m1275i(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return mo1299a(vVar, a0Var, m697e() - 1, -1, a0Var.m907a());
    }

    /* renamed from: j */
    private int m1274j(C0813j.C0815a0 a0Var) {
        if (m697e() == 0) {
            return 0;
        }
        m1318E();
        return C0856l.m577a(a0Var, this.f2851u, m1287b(!this.f2856z, true), m1294a(!this.f2856z, true), this, this.f2856z, this.f2854x);
    }

    /* renamed from: j */
    private View m1273j(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return this.f2854x ? m1283f(vVar, a0Var) : m1278h(vVar, a0Var);
    }

    /* renamed from: k */
    private int m1272k(C0813j.C0815a0 a0Var) {
        if (m697e() == 0) {
            return 0;
        }
        m1318E();
        return C0856l.m576b(a0Var, this.f2851u, m1287b(!this.f2856z, true), m1294a(!this.f2856z, true), this, this.f2856z);
    }

    /* renamed from: k */
    private View m1271k(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return this.f2854x ? m1278h(vVar, a0Var) : m1283f(vVar, a0Var);
    }

    /* renamed from: l */
    private View m1270l(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return this.f2854x ? m1281g(vVar, a0Var) : m1275i(vVar, a0Var);
    }

    /* renamed from: m */
    private View m1269m(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return this.f2854x ? m1275i(vVar, a0Var) : m1281g(vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: A */
    boolean mo791A() {
        return (m680i() == 1073741824 || m664r() == 1073741824 || !m663s()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: C */
    public boolean mo789C() {
        return this.f2845D == null && this.f2852v == this.f2855y;
    }

    /* renamed from: D */
    C0768c m1319D() {
        return new C0768c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m1318E() {
        if (this.f2850t == null) {
            this.f2850t = m1319D();
        }
    }

    /* renamed from: F */
    public int m1317F() {
        View a = m1308a(0, m697e(), false, true);
        if (a == null) {
            return -1;
        }
        return m673l(a);
    }

    /* renamed from: G */
    public int m1316G() {
        View a = m1308a(m697e() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return m673l(a);
    }

    /* renamed from: H */
    public int m1315H() {
        return this.f2849s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public boolean m1314I() {
        return m678j() == 1;
    }

    /* renamed from: J */
    boolean m1313J() {
        return this.f2851u.mo1034d() == 0 && this.f2851u.mo1041a() == 0;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo778a(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        if (this.f2849s == 1) {
            return 0;
        }
        return m1286c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo756a(C0813j.C0815a0 a0Var) {
        return m1276i(a0Var);
    }

    /* renamed from: a */
    int m1300a(C0813j.C0847v vVar, C0768c cVar, C0813j.C0815a0 a0Var, boolean z) {
        int i = cVar.f2868c;
        int i2 = cVar.f2872g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f2872g = i2 + i;
            }
            m1301a(vVar, cVar);
        }
        int i3 = cVar.f2868c + cVar.f2873h;
        C0767b bVar = this.f2847F;
        while (true) {
            if ((!cVar.f2877l && i3 <= 0) || !cVar.m1260a(a0Var)) {
                break;
            }
            bVar.m1263a();
            mo1296a(vVar, a0Var, cVar, bVar);
            if (!bVar.f2863b) {
                cVar.f2867b += bVar.f2862a * cVar.f2871f;
                if (!bVar.f2864c || this.f2850t.f2876k != null || !a0Var.m902d()) {
                    int i4 = cVar.f2868c;
                    int i5 = bVar.f2862a;
                    cVar.f2868c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f2872g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.f2872g = i6 + bVar.f2862a;
                    int i7 = cVar.f2868c;
                    if (i7 < 0) {
                        cVar.f2872g += i7;
                    }
                    m1301a(vVar, cVar);
                }
                if (z && bVar.f2865d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2868c;
    }

    /* renamed from: a */
    View m1308a(int i, int i2, boolean z, boolean z2) {
        m1318E();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f2849s == 0 ? this.f3214e : this.f3215f).m550a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public View mo765a(View view, int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        int h;
        m1310M();
        if (m697e() == 0 || (h = m1280h(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m1318E();
        m1318E();
        m1309a(h, (int) (this.f2851u.mo1028g() * 0.33333334f), false, a0Var);
        C0768c cVar = this.f2850t;
        cVar.f2872g = Integer.MIN_VALUE;
        cVar.f2866a = false;
        m1300a(vVar, cVar, a0Var, true);
        View k = h == -1 ? m1271k(vVar, a0Var) : m1273j(vVar, a0Var);
        View L = h == -1 ? m1311L() : m1312K();
        if (!L.hasFocusable()) {
            return k;
        }
        if (k == null) {
            return null;
        }
        return L;
    }

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
            if (l >= 0 && l < i3) {
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
    public void mo783a(int i, int i2, C0813j.C0815a0 a0Var, C0813j.AbstractC0835o.AbstractC0838c cVar) {
        if (this.f2849s != 0) {
            i = i2;
        }
        if (m697e() != 0 && i != 0) {
            m1318E();
            m1309a(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo1304a(a0Var, this.f2850t, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo780a(int i, C0813j.AbstractC0835o.AbstractC0838c cVar) {
        boolean z;
        int i2;
        C0769d dVar = this.f2845D;
        int i3 = -1;
        if (dVar == null || !dVar.m1256a()) {
            m1310M();
            z = this.f2854x;
            i2 = this.f2842A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0769d dVar2 = this.f2845D;
            z = dVar2.f2880d;
            i2 = dVar2.f2878b;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f2848G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo655a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo773a(Parcelable parcelable) {
        if (parcelable instanceof C0769d) {
            this.f2845D = (C0769d) parcelable;
            m657y();
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo757a(AccessibilityEvent accessibilityEvent) {
        super.mo757a(accessibilityEvent);
        if (m697e() > 0) {
            accessibilityEvent.setFromIndex(m1317F());
            accessibilityEvent.setToIndex(m1316G());
        }
    }

    /* renamed from: a */
    void mo1304a(C0813j.C0815a0 a0Var, C0768c cVar, C0813j.AbstractC0835o.AbstractC0838c cVar2) {
        int i = cVar.f2869d;
        if (i >= 0 && i < a0Var.m907a()) {
            cVar2.mo655a(i, Math.max(0, cVar.f2872g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1297a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, C0766a aVar, int i) {
    }

    /* renamed from: a */
    void mo1296a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, C0768c cVar, C0767b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.m1259a(vVar);
        if (a == null) {
            bVar.f2863b = true;
            return;
        }
        C0813j.C0840p pVar = (C0813j.C0840p) a.getLayoutParams();
        if (cVar.f2876k == null) {
            if (this.f2854x == (cVar.f2871f == -1)) {
                m727b(a);
            } else {
                m726b(a, 0);
            }
        } else {
            if (this.f2854x == (cVar.f2871f == -1)) {
                m772a(a);
            } else {
                m771a(a, 0);
            }
        }
        m770a(a, 0, 0);
        bVar.f2862a = this.f2851u.mo1037b(a);
        if (this.f2849s == 1) {
            if (m1314I()) {
                i5 = m665q() - m668o();
                i4 = i5 - this.f2851u.mo1035c(a);
            } else {
                i4 = m670n();
                i5 = this.f2851u.mo1035c(a) + i4;
            }
            int i6 = cVar.f2871f;
            int i7 = cVar.f2867b;
            if (i6 == -1) {
                i3 = i7 - bVar.f2862a;
                i = i7;
                i2 = i5;
            } else {
                i = bVar.f2862a + i7;
                i3 = i7;
                i2 = i5;
            }
        } else {
            int p = m666p();
            int c = this.f2851u.mo1035c(a) + p;
            int i8 = cVar.f2871f;
            int i9 = cVar.f2867b;
            if (i8 == -1) {
                i4 = i9 - bVar.f2862a;
                i2 = i9;
                i3 = p;
                i = c;
            } else {
                i2 = bVar.f2862a + i9;
                i3 = p;
                i = c;
                i4 = i9;
            }
        }
        m769a(a, i4, i3, i2, i);
        if (pVar.m652c() || pVar.m653b()) {
            bVar.f2864c = true;
        }
        bVar.f2865d = a.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo733a(String str) {
        if (this.f2845D == null) {
            super.mo733a(str);
        }
    }

    /* renamed from: a */
    public void m1295a(boolean z) {
        mo733a((String) null);
        if (z != this.f2853w) {
            this.f2853w = z;
            m657y();
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public boolean mo788a() {
        return this.f2849s == 0;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo728b(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        if (this.f2849s == 0) {
            return 0;
        }
        return m1286c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo723b(C0813j.C0815a0 a0Var) {
        return m1274j(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public View mo731b(int i) {
        int e = m697e();
        if (e == 0) {
            return null;
        }
        int l = i - m673l(m715c(0));
        if (l >= 0 && l < e) {
            View c = m715c(l);
            if (m673l(c) == i) {
                return c;
            }
        }
        return super.mo731b(i);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public void mo717b(C0813j jVar, C0813j.C0847v vVar) {
        super.mo717b(jVar, vVar);
        if (this.f2844C) {
            m722b(vVar);
            vVar.m630a();
        }
    }

    /* renamed from: b */
    public void mo1288b(boolean z) {
        mo733a((String) null);
        if (this.f2855y != z) {
            this.f2855y = z;
            m657y();
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public boolean mo732b() {
        return this.f2849s == 1;
    }

    /* renamed from: c */
    int m1286c(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        if (m697e() == 0 || i == 0) {
            return 0;
        }
        this.f2850t.f2866a = true;
        m1318E();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m1309a(i2, abs, true, a0Var);
        C0768c cVar = this.f2850t;
        int a = cVar.f2872g + m1300a(vVar, cVar, a0Var, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f2851u.mo1040a(-i);
        this.f2850t.f2875j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public int mo711c(C0813j.C0815a0 a0Var) {
        return m1272k(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public C0813j.C0840p mo716c() {
        return new C0813j.C0840p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public int mo701d(C0813j.C0815a0 a0Var) {
        return m1276i(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public int mo694e(C0813j.C0815a0 a0Var) {
        return m1274j(a0Var);
    }

    /* renamed from: e */
    View m1285e(int i, int i2) {
        int i3;
        int i4;
        m1318E();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m715c(i);
        }
        if (this.f2851u.mo1033d(m715c(i)) < this.f2851u.mo1030f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f2849s == 0 ? this.f3214e : this.f3215f).m550a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public void mo693e(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View b;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.f2845D == null && this.f2842A == -1) && a0Var.m907a() == 0) {
            m722b(vVar);
            return;
        }
        C0769d dVar = this.f2845D;
        if (dVar != null && dVar.m1256a()) {
            this.f2842A = this.f2845D.f2878b;
        }
        m1318E();
        this.f2850t.f2866a = false;
        m1310M();
        View g = m686g();
        if (!this.f2846E.f2861e || this.f2842A != -1 || this.f2845D != null) {
            this.f2846E.m1265b();
            C0766a aVar = this.f2846E;
            aVar.f2860d = this.f2854x ^ this.f2855y;
            m1289b(vVar, a0Var, aVar);
            this.f2846E.f2861e = true;
        } else if (g != null && (this.f2851u.mo1033d(g) >= this.f2851u.mo1038b() || this.f2851u.mo1039a(g) <= this.f2851u.mo1030f())) {
            this.f2846E.m1264b(g, m673l(g));
        }
        int h = m1279h(a0Var);
        if (this.f2850t.f2875j >= 0) {
            i = h;
            h = 0;
        } else {
            i = 0;
        }
        int f = h + this.f2851u.mo1030f();
        int c = i + this.f2851u.mo1036c();
        if (!(!a0Var.m902d() || (i7 = this.f2842A) == -1 || this.f2843B == Integer.MIN_VALUE || (b = mo731b(i7)) == null)) {
            if (this.f2854x) {
                i8 = this.f2851u.mo1038b() - this.f2851u.mo1039a(b);
                i9 = this.f2843B;
            } else {
                i9 = this.f2851u.mo1033d(b) - this.f2851u.mo1030f();
                i8 = this.f2843B;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                f += i11;
            } else {
                c -= i11;
            }
        }
        if (!this.f2846E.f2860d ? !this.f2854x : this.f2854x) {
            i10 = 1;
        }
        mo1297a(vVar, a0Var, this.f2846E, i10);
        m753a(vVar);
        this.f2850t.f2877l = m1313J();
        this.f2850t.f2874i = a0Var.m902d();
        C0766a aVar2 = this.f2846E;
        if (aVar2.f2860d) {
            m1292b(aVar2);
            C0768c cVar = this.f2850t;
            cVar.f2873h = f;
            m1300a(vVar, cVar, a0Var, false);
            C0768c cVar2 = this.f2850t;
            i3 = cVar2.f2867b;
            int i12 = cVar2.f2869d;
            int i13 = cVar2.f2868c;
            if (i13 > 0) {
                c += i13;
            }
            m1306a(this.f2846E);
            C0768c cVar3 = this.f2850t;
            cVar3.f2873h = c;
            cVar3.f2869d += cVar3.f2870e;
            m1300a(vVar, cVar3, a0Var, false);
            C0768c cVar4 = this.f2850t;
            i2 = cVar4.f2867b;
            int i14 = cVar4.f2868c;
            if (i14 > 0) {
                m1282g(i12, i3);
                C0768c cVar5 = this.f2850t;
                cVar5.f2873h = i14;
                m1300a(vVar, cVar5, a0Var, false);
                i3 = this.f2850t.f2867b;
            }
        } else {
            m1306a(aVar2);
            C0768c cVar6 = this.f2850t;
            cVar6.f2873h = c;
            m1300a(vVar, cVar6, a0Var, false);
            C0768c cVar7 = this.f2850t;
            i2 = cVar7.f2867b;
            int i15 = cVar7.f2869d;
            int i16 = cVar7.f2868c;
            if (i16 > 0) {
                f += i16;
            }
            m1292b(this.f2846E);
            C0768c cVar8 = this.f2850t;
            cVar8.f2873h = f;
            cVar8.f2869d += cVar8.f2870e;
            m1300a(vVar, cVar8, a0Var, false);
            C0768c cVar9 = this.f2850t;
            i3 = cVar9.f2867b;
            int i17 = cVar9.f2868c;
            if (i17 > 0) {
                m1284f(i15, i2);
                C0768c cVar10 = this.f2850t;
                cVar10.f2873h = i17;
                m1300a(vVar, cVar10, a0Var, false);
                i2 = this.f2850t.f2867b;
            }
        }
        if (m697e() > 0) {
            if (this.f2854x ^ this.f2855y) {
                int a = m1307a(i2, vVar, a0Var, true);
                i5 = i3 + a;
                i4 = i2 + a;
                i6 = m1293b(i5, vVar, a0Var, false);
            } else {
                int b2 = m1293b(i3, vVar, a0Var, true);
                i5 = i3 + b2;
                i4 = i2 + b2;
                i6 = m1307a(i4, vVar, a0Var, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        m1290b(vVar, a0Var, i3, i2);
        if (!a0Var.m902d()) {
            this.f2851u.m1042i();
        } else {
            this.f2846E.m1265b();
        }
        this.f2852v = this.f2855y;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: f */
    public int mo688f(C0813j.C0815a0 a0Var) {
        return m1272k(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: g */
    public void mo683g(C0813j.C0815a0 a0Var) {
        super.mo683g(a0Var);
        this.f2845D = null;
        this.f2842A = -1;
        this.f2843B = Integer.MIN_VALUE;
        this.f2846E.m1265b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m1280h(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f2849s == 1) ? 1 : Integer.MIN_VALUE : this.f2849s == 0 ? 1 : Integer.MIN_VALUE : this.f2849s == 1 ? -1 : Integer.MIN_VALUE : this.f2849s == 0 ? -1 : Integer.MIN_VALUE : (this.f2849s != 1 && m1314I()) ? -1 : 1 : (this.f2849s != 1 && m1314I()) ? 1 : -1;
    }

    /* renamed from: h */
    protected int m1279h(C0813j.C0815a0 a0Var) {
        if (a0Var.m903c()) {
            return this.f2851u.mo1028g();
        }
        return 0;
    }

    /* renamed from: i */
    public void m1277i(int i) {
        if (i == 0 || i == 1) {
            mo733a((String) null);
            if (i != this.f2849s || this.f2851u == null) {
                this.f2851u = AbstractC0810i.m1045a(this, i);
                this.f2846E.f2857a = this.f2851u;
                this.f2849s = i;
                m657y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: u */
    public boolean mo661u() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: x */
    public Parcelable mo658x() {
        C0769d dVar = this.f2845D;
        if (dVar != null) {
            return new C0769d(dVar);
        }
        C0769d dVar2 = new C0769d();
        if (m697e() > 0) {
            m1318E();
            boolean z = this.f2852v ^ this.f2854x;
            dVar2.f2880d = z;
            if (z) {
                View K = m1312K();
                dVar2.f2879c = this.f2851u.mo1038b() - this.f2851u.mo1039a(K);
                dVar2.f2878b = m673l(K);
            } else {
                View L = m1311L();
                dVar2.f2878b = m673l(L);
                dVar2.f2879c = this.f2851u.mo1033d(L) - this.f2851u.mo1030f();
            }
        } else {
            dVar2.m1255b();
        }
        return dVar2;
    }
}
