package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C0783b {

    /* renamed from: a */
    final AbstractC0785b f2949a;

    /* renamed from: b */
    final C0784a f2950b = new C0784a();

    /* renamed from: c */
    final List<View> f2951c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    public static class C0784a {

        /* renamed from: a */
        long f2952a = 0;

        /* renamed from: b */
        C0784a f2953b;

        C0784a() {
        }

        /* renamed from: b */
        private void m1107b() {
            if (this.f2953b == null) {
                this.f2953b = new C0784a();
            }
        }

        /* renamed from: a */
        void m1110a() {
            this.f2952a = 0L;
            C0784a aVar = this.f2953b;
            if (aVar != null) {
                aVar.m1110a();
            }
        }

        /* renamed from: a */
        void m1109a(int i) {
            if (i >= 64) {
                C0784a aVar = this.f2953b;
                if (aVar != null) {
                    aVar.m1109a(i - 64);
                    return;
                }
                return;
            }
            this.f2952a &= (1 << i) ^ (-1);
        }

        /* renamed from: a */
        void m1108a(int i, boolean z) {
            if (i >= 64) {
                m1107b();
                this.f2953b.m1108a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2952a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f2952a;
            this.f2952a = ((j2 & (j ^ (-1))) << 1) | (j2 & j);
            if (z) {
                m1103e(i);
            } else {
                m1109a(i);
            }
            if (z2 || this.f2953b != null) {
                m1107b();
                this.f2953b.m1108a(0, z2);
            }
        }

        /* renamed from: b */
        int m1106b(int i) {
            C0784a aVar = this.f2953b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f2952a) : Long.bitCount(this.f2952a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f2952a & ((1 << i) - 1)) : aVar.m1106b(i - 64) + Long.bitCount(this.f2952a);
        }

        /* renamed from: c */
        boolean m1105c(int i) {
            if (i < 64) {
                return (this.f2952a & (1 << i)) != 0;
            }
            m1107b();
            return this.f2953b.m1105c(i - 64);
        }

        /* renamed from: d */
        boolean m1104d(int i) {
            if (i >= 64) {
                m1107b();
                return this.f2953b.m1104d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2952a & j) != 0;
            this.f2952a &= j ^ (-1);
            long j2 = j - 1;
            long j3 = this.f2952a;
            this.f2952a = Long.rotateRight(j3 & (j2 ^ (-1)), 1) | (j3 & j2);
            C0784a aVar = this.f2953b;
            if (aVar != null) {
                if (aVar.m1105c(0)) {
                    m1103e(63);
                }
                this.f2953b.m1104d(0);
            }
            return z;
        }

        /* renamed from: e */
        void m1103e(int i) {
            if (i >= 64) {
                m1107b();
                this.f2953b.m1103e(i - 64);
                return;
            }
            this.f2952a |= 1 << i;
        }

        public String toString() {
            if (this.f2953b == null) {
                return Long.toBinaryString(this.f2952a);
            }
            return this.f2953b.toString() + "xx" + Long.toBinaryString(this.f2952a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0785b {
        /* renamed from: a */
        int mo853a();

        /* renamed from: a */
        View mo852a(int i);

        /* renamed from: a */
        void mo851a(View view);

        /* renamed from: a */
        void mo850a(View view, int i);

        /* renamed from: a */
        void mo849a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        void mo848b();

        /* renamed from: b */
        void mo847b(int i);

        /* renamed from: b */
        void mo846b(View view);

        /* renamed from: c */
        int mo844c(View view);

        /* renamed from: c */
        void mo845c(int i);

        /* renamed from: d */
        C0813j.AbstractC0821d0 mo843d(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0783b(AbstractC0785b bVar) {
        this.f2949a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4.f2950b.m1105c(r2) == false) goto L_0x0024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        return r2;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m1114f(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L_0x0004
            return r0
        L_0x0004:
            androidx.recyclerview.widget.b$b r1 = r4.f2949a
            int r1 = r1.mo853a()
            r2 = r5
        L_0x000b:
            if (r2 >= r1) goto L_0x0027
            androidx.recyclerview.widget.b$a r3 = r4.f2950b
            int r3 = r3.m1106b(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L_0x0025
        L_0x0019:
            androidx.recyclerview.widget.b$a r5 = r4.f2950b
            boolean r5 = r5.m1105c(r2)
            if (r5 == 0) goto L_0x0024
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0024:
            return r2
        L_0x0025:
            int r2 = r2 + r3
            goto L_0x000b
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0783b.m1114f(int):int");
    }

    /* renamed from: g */
    private void m1112g(View view) {
        this.f2951c.add(view);
        this.f2949a.mo846b(view);
    }

    /* renamed from: h */
    private boolean m1111h(View view) {
        if (!this.f2951c.remove(view)) {
            return false;
        }
        this.f2949a.mo851a(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m1130a() {
        return this.f2949a.mo853a() - this.f2951c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1129a(int i) {
        int f = m1114f(i);
        this.f2950b.m1104d(f);
        this.f2949a.mo847b(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1128a(View view) {
        int c = this.f2949a.mo844c(view);
        if (c >= 0) {
            this.f2950b.m1103e(c);
            m1112g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1127a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? this.f2949a.mo853a() : m1114f(i);
        this.f2950b.m1108a(a, z);
        if (z) {
            m1112g(view);
        }
        this.f2949a.mo849a(view, a, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1126a(View view, int i, boolean z) {
        int a = i < 0 ? this.f2949a.mo853a() : m1114f(i);
        this.f2950b.m1108a(a, z);
        if (z) {
            m1112g(view);
        }
        this.f2949a.mo850a(view, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1125a(View view, boolean z) {
        m1126a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1124b() {
        return this.f2949a.mo853a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1122b(View view) {
        int c = this.f2949a.mo844c(view);
        if (c != -1 && !this.f2950b.m1105c(c)) {
            return c - this.f2950b.m1106b(c);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m1123b(int i) {
        int size = this.f2951c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2951c.get(i2);
            C0813j.AbstractC0821d0 d = this.f2949a.mo843d(view);
            if (!(d.m871i() != i || d.m866n() || d.m864p())) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public View m1120c(int i) {
        return this.f2949a.mo852a(m1114f(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1121c() {
        this.f2950b.m1110a();
        for (int size = this.f2951c.size() - 1; size >= 0; size--) {
            this.f2949a.mo851a(this.f2951c.get(size));
            this.f2951c.remove(size);
        }
        this.f2949a.mo848b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m1119c(View view) {
        return this.f2951c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View m1118d(int i) {
        return this.f2949a.mo852a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m1117d(View view) {
        int c = this.f2949a.mo844c(view);
        if (c >= 0) {
            if (this.f2950b.m1104d(c)) {
                m1111h(view);
            }
            this.f2949a.mo845c(c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1116e(int i) {
        int f = m1114f(i);
        View a = this.f2949a.mo852a(f);
        if (a != null) {
            if (this.f2950b.m1104d(f)) {
                m1111h(a);
            }
            this.f2949a.mo845c(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m1115e(View view) {
        int c = this.f2949a.mo844c(view);
        if (c == -1) {
            m1111h(view);
            return true;
        } else if (!this.f2950b.m1105c(c)) {
            return false;
        } else {
            this.f2950b.m1104d(c);
            m1111h(view);
            this.f2949a.mo845c(c);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1113f(View view) {
        int c = this.f2949a.mo844c(view);
        if (c < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f2950b.m1105c(c)) {
            this.f2950b.m1109a(c);
            m1111h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f2950b.toString() + ", hidden list:" + this.f2951c.size();
    }
}
