package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;
import p000a.p018g.p028k.AbstractC0181d;
import p000a.p018g.p028k.C0182e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public class C0780a implements C0808h.AbstractC0809a {

    /* renamed from: a */
    private AbstractC0181d<C0782b> f2937a;

    /* renamed from: b */
    final ArrayList<C0782b> f2938b;

    /* renamed from: c */
    final ArrayList<C0782b> f2939c;

    /* renamed from: d */
    final AbstractC0781a f2940d;

    /* renamed from: e */
    Runnable f2941e;

    /* renamed from: f */
    final boolean f2942f;

    /* renamed from: g */
    final C0808h f2943g;

    /* renamed from: h */
    private int f2944h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0781a {
        /* renamed from: a */
        C0813j.AbstractC0821d0 mo842a(int i);

        /* renamed from: a */
        void mo841a(int i, int i2);

        /* renamed from: a */
        void mo840a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo839a(C0782b bVar);

        /* renamed from: b */
        void mo838b(int i, int i2);

        /* renamed from: b */
        void mo837b(C0782b bVar);

        /* renamed from: c */
        void mo836c(int i, int i2);

        /* renamed from: d */
        void mo834d(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static class C0782b {

        /* renamed from: a */
        int f2945a;

        /* renamed from: b */
        int f2946b;

        /* renamed from: c */
        Object f2947c;

        /* renamed from: d */
        int f2948d;

        C0782b(int i, int i2, int i3, Object obj) {
            this.f2945a = i;
            this.f2946b = i2;
            this.f2948d = i3;
            this.f2947c = obj;
        }

        /* renamed from: a */
        String m1131a() {
            int i = this.f2945a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0782b.class != obj.getClass()) {
                return false;
            }
            C0782b bVar = (C0782b) obj;
            int i = this.f2945a;
            if (i != bVar.f2945a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2948d - this.f2946b) == 1 && this.f2948d == bVar.f2946b && this.f2946b == bVar.f2948d) {
                return true;
            }
            if (this.f2948d != bVar.f2948d || this.f2946b != bVar.f2946b) {
                return false;
            }
            Object obj2 = this.f2947c;
            Object obj3 = bVar.f2947c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2945a * 31) + this.f2946b) * 31) + this.f2948d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m1131a() + ",s:" + this.f2946b + "c:" + this.f2948d + ",p:" + this.f2947c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0780a(AbstractC0781a aVar) {
        this(aVar, false);
    }

    C0780a(AbstractC0781a aVar, boolean z) {
        this.f2937a = new C0182e(30);
        this.f2938b = new ArrayList<>();
        this.f2939c = new ArrayList<>();
        this.f2944h = 0;
        this.f2940d = aVar;
        this.f2942f = z;
        this.f2943g = new C0808h(this);
    }

    /* renamed from: b */
    private int m1144b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f2939c.size() - 1; size >= 0; size--) {
            C0782b bVar = this.f2939c.get(size);
            int i7 = bVar.f2945a;
            if (i7 == 8) {
                int i8 = bVar.f2946b;
                int i9 = bVar.f2948d;
                if (i8 >= i9) {
                    i9 = i8;
                    i8 = i9;
                }
                if (i < i8 || i > i9) {
                    int i10 = bVar.f2946b;
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f2946b = i10 + 1;
                            i4 = bVar.f2948d + 1;
                        } else if (i2 == 2) {
                            bVar.f2946b = i10 - 1;
                            i4 = bVar.f2948d - 1;
                        }
                        bVar.f2948d = i4;
                    }
                } else {
                    int i11 = bVar.f2946b;
                    if (i8 == i11) {
                        if (i2 == 1) {
                            i6 = bVar.f2948d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f2948d - 1;
                            }
                            i++;
                        }
                        bVar.f2948d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i11 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i11 - 1;
                            }
                            i--;
                        }
                        bVar.f2946b = i5;
                        i--;
                    }
                }
            } else {
                int i12 = bVar.f2946b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f2946b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f2948d;
                } else if (i7 == 2) {
                    i += bVar.f2948d;
                }
            }
        }
        for (int size2 = this.f2939c.size() - 1; size2 >= 0; size2--) {
            C0782b bVar2 = this.f2939c.get(size2);
            if (bVar2.f2945a == 8) {
                int i13 = bVar2.f2948d;
                if (i13 != bVar2.f2946b && i13 >= 0) {
                }
                this.f2939c.remove(size2);
                mo1047a(bVar2);
            } else {
                if (bVar2.f2948d > 0) {
                }
                this.f2939c.remove(size2);
                mo1047a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: b */
    private void m1143b(C0782b bVar) {
        m1132g(bVar);
    }

    /* renamed from: c */
    private void m1140c(C0782b bVar) {
        m1132g(bVar);
    }

    /* renamed from: d */
    private void m1137d(C0782b bVar) {
        boolean z;
        int i = bVar.f2946b;
        int i2 = bVar.f2948d + i;
        int i3 = 0;
        char c = 65535;
        int i4 = i;
        while (i4 < i2) {
            if (this.f2940d.mo842a(i4) != null || m1138d(i4)) {
                if (c == 0) {
                    m1133f(mo1048a(2, i, i3, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m1132g(mo1048a(2, i, i3, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i4 -= i3;
                i2 -= i3;
                i3 = 1;
            } else {
                i3++;
            }
            i4++;
        }
        if (i3 != bVar.f2948d) {
            mo1047a(bVar);
            bVar = mo1048a(2, i, i3, null);
        }
        if (c == 0) {
            m1133f(bVar);
        } else {
            m1132g(bVar);
        }
    }

    /* renamed from: d */
    private boolean m1138d(int i) {
        int size = this.f2939c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0782b bVar = this.f2939c.get(i2);
            int i3 = bVar.f2945a;
            if (i3 == 8) {
                if (m1149a(bVar.f2948d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2946b;
                int i5 = bVar.f2948d + i4;
                while (i4 < i5) {
                    if (m1149a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m1135e(C0782b bVar) {
        int i = bVar.f2946b;
        int i2 = bVar.f2948d + i;
        int i3 = i;
        int i4 = 0;
        char c = 65535;
        while (i < i2) {
            if (this.f2940d.mo842a(i) != null || m1138d(i)) {
                if (c == 0) {
                    m1133f(mo1048a(4, i3, i4, bVar.f2947c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m1132g(mo1048a(4, i3, i4, bVar.f2947c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f2948d) {
            Object obj = bVar.f2947c;
            mo1047a(bVar);
            bVar = mo1048a(4, i3, i4, obj);
        }
        if (c == 0) {
            m1133f(bVar);
        } else {
            m1132g(bVar);
        }
    }

    /* renamed from: f */
    private void m1133f(C0782b bVar) {
        int i;
        int i2 = bVar.f2945a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = m1144b(bVar.f2946b, i2);
        int i3 = bVar.f2946b;
        int i4 = bVar.f2945a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f2948d; i6++) {
            int b2 = m1144b(bVar.f2946b + (i * i6), bVar.f2945a);
            int i7 = bVar.f2945a;
            if (i7 == 2 ? b2 == b : i7 == 4 && b2 == b + 1) {
                i5++;
            } else {
                C0782b a = mo1048a(bVar.f2945a, b, i5, bVar.f2947c);
                m1148a(a, i3);
                mo1047a(a);
                if (bVar.f2945a == 4) {
                    i3 += i5;
                }
                b = b2;
                i5 = 1;
            }
        }
        Object obj = bVar.f2947c;
        mo1047a(bVar);
        if (i5 > 0) {
            C0782b a2 = mo1048a(bVar.f2945a, b, i5, obj);
            m1148a(a2, i3);
            mo1047a(a2);
        }
    }

    /* renamed from: g */
    private void m1132g(C0782b bVar) {
        this.f2939c.add(bVar);
        int i = bVar.f2945a;
        if (i == 1) {
            this.f2940d.mo838b(bVar.f2946b, bVar.f2948d);
        } else if (i == 2) {
            this.f2940d.mo834d(bVar.f2946b, bVar.f2948d);
        } else if (i == 4) {
            this.f2940d.mo840a(bVar.f2946b, bVar.f2948d, bVar.f2947c);
        } else if (i == 8) {
            this.f2940d.mo841a(bVar.f2946b, bVar.f2948d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: a */
    public int m1150a(int i) {
        int size = this.f2938b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0782b bVar = this.f2938b.get(i2);
            int i3 = bVar.f2945a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2946b;
                    if (i4 <= i) {
                        int i5 = bVar.f2948d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2946b;
                    if (i6 == i) {
                        i = bVar.f2948d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2948d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2946b <= i) {
                i += bVar.f2948d;
            }
        }
        return i;
    }

    /* renamed from: a */
    int m1149a(int i, int i2) {
        int size = this.f2939c.size();
        while (i2 < size) {
            C0782b bVar = this.f2939c.get(i2);
            int i3 = bVar.f2945a;
            if (i3 == 8) {
                int i4 = bVar.f2946b;
                if (i4 == i) {
                    i = bVar.f2948d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2948d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2946b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2948d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2948d;
                }
            }
            i2++;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C0808h.AbstractC0809a
    /* renamed from: a */
    public C0782b mo1048a(int i, int i2, int i3, Object obj) {
        C0782b a = this.f2937a.mo3559a();
        if (a == null) {
            return new C0782b(i, i2, i3, obj);
        }
        a.f2945a = i;
        a.f2946b = i2;
        a.f2948d = i3;
        a.f2947c = obj;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1151a() {
        int size = this.f2939c.size();
        for (int i = 0; i < size; i++) {
            this.f2940d.mo839a(this.f2939c.get(i));
        }
        m1147a(this.f2939c);
        this.f2944h = 0;
    }

    @Override // androidx.recyclerview.widget.C0808h.AbstractC0809a
    /* renamed from: a */
    public void mo1047a(C0782b bVar) {
        if (!this.f2942f) {
            bVar.f2947c = null;
            this.f2937a.mo3558a(bVar);
        }
    }

    /* renamed from: a */
    void m1148a(C0782b bVar, int i) {
        this.f2940d.mo837b(bVar);
        int i2 = bVar.f2945a;
        if (i2 == 2) {
            this.f2940d.mo836c(i, bVar.f2948d);
        } else if (i2 == 4) {
            this.f2940d.mo840a(i, bVar.f2948d, bVar.f2947c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: a */
    void m1147a(List<C0782b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo1047a(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1145b(int i) {
        return m1149a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1146b() {
        m1151a();
        int size = this.f2938b.size();
        for (int i = 0; i < size; i++) {
            C0782b bVar = this.f2938b.get(i);
            int i2 = bVar.f2945a;
            if (i2 == 1) {
                this.f2940d.mo839a(bVar);
                this.f2940d.mo838b(bVar.f2946b, bVar.f2948d);
            } else if (i2 == 2) {
                this.f2940d.mo839a(bVar);
                this.f2940d.mo836c(bVar.f2946b, bVar.f2948d);
            } else if (i2 == 4) {
                this.f2940d.mo839a(bVar);
                this.f2940d.mo840a(bVar.f2946b, bVar.f2948d, bVar.f2947c);
            } else if (i2 == 8) {
                this.f2940d.mo839a(bVar);
                this.f2940d.mo841a(bVar.f2946b, bVar.f2948d);
            }
            Runnable runnable = this.f2941e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m1147a(this.f2938b);
        this.f2944h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m1142c() {
        return this.f2938b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m1141c(int i) {
        return (i & this.f2944h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1139d() {
        return !this.f2939c.isEmpty() && !this.f2938b.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1136e() {
        this.f2943g.m1054a(this.f2938b);
        int size = this.f2938b.size();
        for (int i = 0; i < size; i++) {
            C0782b bVar = this.f2938b.get(i);
            int i2 = bVar.f2945a;
            if (i2 == 1) {
                m1143b(bVar);
            } else if (i2 == 2) {
                m1137d(bVar);
            } else if (i2 == 4) {
                m1135e(bVar);
            } else if (i2 == 8) {
                m1140c(bVar);
            }
            Runnable runnable = this.f2941e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2938b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1134f() {
        m1147a(this.f2938b);
        m1147a(this.f2939c);
        this.f2944h = 0;
    }
}
