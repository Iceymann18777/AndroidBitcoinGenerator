package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p000a.p018g.p025h.C0159a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC0802e implements Runnable {

    /* renamed from: f */
    static final ThreadLocal<RunnableC0802e> f3041f = new ThreadLocal<>();

    /* renamed from: g */
    static Comparator<C0805c> f3042g = new C0803a();

    /* renamed from: c */
    long f3044c;

    /* renamed from: d */
    long f3045d;

    /* renamed from: b */
    ArrayList<C0813j> f3043b = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<C0805c> f3046e = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    static class C0803a implements Comparator<C0805c> {
        C0803a() {
        }

        /* renamed from: a */
        public int compare(C0805c cVar, C0805c cVar2) {
            if ((cVar.f3054d == null) != (cVar2.f3054d == null)) {
                return cVar.f3054d == null ? 1 : -1;
            }
            boolean z = cVar.f3051a;
            if (z != cVar2.f3051a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f3052b - cVar.f3052b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f3053c - cVar2.f3053c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    public static class C0804b implements C0813j.AbstractC0835o.AbstractC0838c {

        /* renamed from: a */
        int f3047a;

        /* renamed from: b */
        int f3048b;

        /* renamed from: c */
        int[] f3049c;

        /* renamed from: d */
        int f3050d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m1061a() {
            int[] iArr = this.f3049c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3050d = 0;
        }

        @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o.AbstractC0838c
        /* renamed from: a */
        public void mo655a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3050d * 2;
                int[] iArr = this.f3049c;
                if (iArr == null) {
                    this.f3049c = new int[4];
                    Arrays.fill(this.f3049c, -1);
                } else if (i3 >= iArr.length) {
                    this.f3049c = new int[i3 * 2];
                    System.arraycopy(iArr, 0, this.f3049c, 0, iArr.length);
                }
                int[] iArr2 = this.f3049c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f3050d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: a */
        void m1059a(C0813j jVar, boolean z) {
            this.f3050d = 0;
            int[] iArr = this.f3049c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            C0813j.AbstractC0835o oVar = jVar.f3124m;
            if (jVar.f3122l != null && oVar != null && oVar.m660v()) {
                if (z) {
                    if (!jVar.f3108e.m1142c()) {
                        oVar.mo780a(jVar.f3122l.mo106a(), this);
                    }
                } else if (!jVar.m929j()) {
                    oVar.mo783a(this.f3047a, this.f3048b, jVar.f3115h0, this);
                }
                int i = this.f3050d;
                if (i > oVar.f3222m) {
                    oVar.f3222m = i;
                    oVar.f3223n = z;
                    jVar.f3104c.m592j();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m1060a(int i) {
            if (this.f3049c != null) {
                int i2 = this.f3050d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3049c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        void m1058b(int i, int i2) {
            this.f3047a = i;
            this.f3048b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    public static class C0805c {

        /* renamed from: a */
        public boolean f3051a;

        /* renamed from: b */
        public int f3052b;

        /* renamed from: c */
        public int f3053c;

        /* renamed from: d */
        public C0813j f3054d;

        /* renamed from: e */
        public int f3055e;

        C0805c() {
        }

        /* renamed from: a */
        public void m1057a() {
            this.f3051a = false;
            this.f3052b = 0;
            this.f3053c = 0;
            this.f3054d = null;
            this.f3055e = 0;
        }
    }

    /* renamed from: a */
    private C0813j.AbstractC0821d0 m1066a(C0813j jVar, int i, long j) {
        if (m1068a(jVar, i)) {
            return null;
        }
        C0813j.C0847v vVar = jVar.f3104c;
        try {
            jVar.m917q();
            C0813j.AbstractC0821d0 a = vVar.m625a(i, false, j);
            if (a != null) {
                if (!a.m867m() || a.m866n()) {
                    vVar.m618a(a, false);
                } else {
                    vVar.m611b(a.f3179a);
                }
            }
            return a;
        } finally {
            jVar.m973a(false);
        }
    }

    /* renamed from: a */
    private void m1072a() {
        C0805c cVar;
        int size = this.f3043b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0813j jVar = this.f3043b.get(i2);
            if (jVar.getWindowVisibility() == 0) {
                jVar.f3113g0.m1059a(jVar, false);
                i += jVar.f3113g0.f3050d;
            }
        }
        this.f3046e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0813j jVar2 = this.f3043b.get(i4);
            if (jVar2.getWindowVisibility() == 0) {
                C0804b bVar = jVar2.f3113g0;
                int abs = Math.abs(bVar.f3047a) + Math.abs(bVar.f3048b);
                int i5 = i3;
                for (int i6 = 0; i6 < bVar.f3050d * 2; i6 += 2) {
                    if (i5 >= this.f3046e.size()) {
                        cVar = new C0805c();
                        this.f3046e.add(cVar);
                    } else {
                        cVar = this.f3046e.get(i5);
                    }
                    int i7 = bVar.f3049c[i6 + 1];
                    cVar.f3051a = i7 <= abs;
                    cVar.f3052b = abs;
                    cVar.f3053c = i7;
                    cVar.f3054d = jVar2;
                    cVar.f3055e = bVar.f3049c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f3046e, f3042g);
    }

    /* renamed from: a */
    private void m1070a(C0805c cVar, long j) {
        C0813j.AbstractC0821d0 a = m1066a(cVar.f3054d, cVar.f3055e, cVar.f3051a ? Long.MAX_VALUE : j);
        if (a != null && a.f3180b != null && a.m867m() && !a.m866n()) {
            m1065a(a.f3180b.get(), j);
        }
    }

    /* renamed from: a */
    private void m1065a(C0813j jVar, long j) {
        if (jVar != null) {
            if (jVar.f3081D && jVar.f3110f.m1124b() != 0) {
                jVar.m914t();
            }
            C0804b bVar = jVar.f3113g0;
            bVar.m1059a(jVar, true);
            if (bVar.f3050d != 0) {
                try {
                    C0159a.m3606a("RV Nested Prefetch");
                    jVar.f3115h0.m905a(jVar.f3122l);
                    for (int i = 0; i < bVar.f3050d * 2; i += 2) {
                        m1066a(jVar, bVar.f3049c[i], j);
                    }
                } finally {
                    C0159a.m3607a();
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m1068a(C0813j jVar, int i) {
        int b = jVar.f3110f.m1124b();
        for (int i2 = 0; i2 < b; i2++) {
            C0813j.AbstractC0821d0 k = C0813j.m924k(jVar.f3110f.m1118d(i2));
            if (k.f3181c == i && !k.m866n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1064b(long j) {
        for (int i = 0; i < this.f3046e.size(); i++) {
            C0805c cVar = this.f3046e.get(i);
            if (cVar.f3054d != null) {
                m1070a(cVar, j);
                cVar.m1057a();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    void m1071a(long j) {
        m1072a();
        m1064b(j);
    }

    /* renamed from: a */
    public void m1069a(C0813j jVar) {
        this.f3043b.add(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1067a(C0813j jVar, int i, int i2) {
        if (jVar.isAttachedToWindow() && this.f3044c == 0) {
            this.f3044c = jVar.getNanoTime();
            jVar.post(this);
        }
        jVar.f3113g0.m1058b(i, i2);
    }

    /* renamed from: b */
    public void m1063b(C0813j jVar) {
        this.f3043b.remove(jVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0159a.m3606a("RV Prefetch");
            if (!this.f3043b.isEmpty()) {
                int size = this.f3043b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    C0813j jVar = this.f3043b.get(i);
                    if (jVar.getWindowVisibility() == 0) {
                        j = Math.max(jVar.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m1071a(TimeUnit.MILLISECONDS.toNanos(j) + this.f3045d);
                }
            }
        } finally {
            this.f3044c = 0L;
            C0159a.m3607a();
        }
    }
}
