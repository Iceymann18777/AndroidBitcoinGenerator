package androidx.recyclerview.widget;

import p000a.p013d.C0067a;
import p000a.p013d.C0072d;
import p000a.p018g.p028k.AbstractC0181d;
import p000a.p018g.p028k.C0182e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public class C0861o {

    /* renamed from: a */
    final C0067a<C0813j.AbstractC0821d0, C0862a> f3266a = new C0067a<>();

    /* renamed from: b */
    final C0072d<C0813j.AbstractC0821d0> f3267b = new C0072d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.o$a */
    /* loaded from: classes.dex */
    public static class C0862a {

        /* renamed from: d */
        static AbstractC0181d<C0862a> f3268d = new C0182e(20);

        /* renamed from: a */
        int f3269a;

        /* renamed from: b */
        C0813j.AbstractC0829l.C0832c f3270b;

        /* renamed from: c */
        C0813j.AbstractC0829l.C0832c f3271c;

        private C0862a() {
        }

        /* renamed from: a */
        static void m521a() {
            do {
            } while (f3268d.mo3559a() != null);
        }

        /* renamed from: a */
        static void m520a(C0862a aVar) {
            aVar.f3269a = 0;
            aVar.f3270b = null;
            aVar.f3271c = null;
            f3268d.mo3558a(aVar);
        }

        /* renamed from: b */
        static C0862a m519b() {
            C0862a a = f3268d.mo3559a();
            return a == null ? new C0862a() : a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.o$b */
    /* loaded from: classes.dex */
    public interface AbstractC0863b {
        /* renamed from: a */
        void mo518a(C0813j.AbstractC0821d0 d0Var);

        /* renamed from: a */
        void mo517a(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar, C0813j.AbstractC0829l.C0832c cVar2);

        /* renamed from: b */
        void mo516b(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar, C0813j.AbstractC0829l.C0832c cVar2);

        /* renamed from: c */
        void mo515c(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar, C0813j.AbstractC0829l.C0832c cVar2);
    }

    /* renamed from: a */
    private C0813j.AbstractC0829l.C0832c m534a(C0813j.AbstractC0821d0 d0Var, int i) {
        C0862a d;
        C0813j.AbstractC0829l.C0832c cVar;
        int a = this.f3266a.m4020a(d0Var);
        if (a >= 0 && (d = this.f3266a.m4013d(a)) != null) {
            int i2 = d.f3269a;
            if ((i2 & i) != 0) {
                d.f3269a = (i ^ (-1)) & i2;
                if (i == 4) {
                    cVar = d.f3270b;
                } else if (i == 8) {
                    cVar = d.f3271c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((d.f3269a & 12) == 0) {
                    this.f3266a.m4014c(a);
                    C0862a.m520a(d);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0813j.AbstractC0821d0 m537a(long j) {
        return this.f3267b.m4056b(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m538a() {
        this.f3266a.clear();
        this.f3267b.m4062a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m536a(long j, C0813j.AbstractC0821d0 d0Var) {
        this.f3267b.m4051c(j, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m535a(C0813j.AbstractC0821d0 d0Var) {
        C0862a aVar = this.f3266a.get(d0Var);
        if (aVar == null) {
            aVar = C0862a.m519b();
            this.f3266a.put(d0Var, aVar);
        }
        aVar.f3269a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m533a(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar) {
        C0862a aVar = this.f3266a.get(d0Var);
        if (aVar == null) {
            aVar = C0862a.m519b();
            this.f3266a.put(d0Var, aVar);
        }
        aVar.f3269a |= 2;
        aVar.f3270b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m532a(AbstractC0863b bVar) {
        C0813j.AbstractC0829l.C0832c cVar;
        C0813j.AbstractC0829l.C0832c cVar2;
        for (int size = this.f3266a.size() - 1; size >= 0; size--) {
            C0813j.AbstractC0821d0 b = this.f3266a.m4016b(size);
            C0862a c = this.f3266a.m4014c(size);
            int i = c.f3269a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = c.f3270b;
                    if (cVar != null) {
                        cVar2 = c.f3271c;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.mo516b(b, c.f3270b, c.f3271c);
                        } else if ((i & 4) != 0) {
                            cVar = c.f3270b;
                            cVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        C0862a.m520a(c);
                    }
                    bVar.mo515c(b, c.f3270b, c.f3271c);
                    C0862a.m520a(c);
                }
                bVar.mo517a(b, cVar, cVar2);
                C0862a.m520a(c);
            }
            bVar.mo518a(b);
            C0862a.m520a(c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m531b() {
        C0862a.m521a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m529b(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar) {
        C0862a aVar = this.f3266a.get(d0Var);
        if (aVar == null) {
            aVar = C0862a.m519b();
            this.f3266a.put(d0Var, aVar);
        }
        aVar.f3271c = cVar;
        aVar.f3269a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m530b(C0813j.AbstractC0821d0 d0Var) {
        C0862a aVar = this.f3266a.get(d0Var);
        return (aVar == null || (aVar.f3269a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m527c(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar) {
        C0862a aVar = this.f3266a.get(d0Var);
        if (aVar == null) {
            aVar = C0862a.m519b();
            this.f3266a.put(d0Var, aVar);
        }
        aVar.f3270b = cVar;
        aVar.f3269a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m528c(C0813j.AbstractC0821d0 d0Var) {
        C0862a aVar = this.f3266a.get(d0Var);
        return (aVar == null || (aVar.f3269a & 4) == 0) ? false : true;
    }

    /* renamed from: d */
    public void m526d(C0813j.AbstractC0821d0 d0Var) {
        m523g(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C0813j.AbstractC0829l.C0832c m525e(C0813j.AbstractC0821d0 d0Var) {
        return m534a(d0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C0813j.AbstractC0829l.C0832c m524f(C0813j.AbstractC0821d0 d0Var) {
        return m534a(d0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m523g(C0813j.AbstractC0821d0 d0Var) {
        C0862a aVar = this.f3266a.get(d0Var);
        if (aVar != null) {
            aVar.f3269a &= -2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m522h(C0813j.AbstractC0821d0 d0Var) {
        int b = this.f3267b.m4058b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (d0Var == this.f3267b.m4053c(b)) {
                this.f3267b.m4057b(b);
                break;
            } else {
                b--;
            }
        }
        C0862a remove = this.f3266a.remove(d0Var);
        if (remove != null) {
            C0862a.m520a(remove);
        }
    }
}
