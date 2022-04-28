package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public abstract class AbstractC0857m extends C0813j.AbstractC0829l {

    /* renamed from: g */
    boolean f3258g = true;

    /* renamed from: a */
    public final void m570a(C0813j.AbstractC0821d0 d0Var, boolean z) {
        m566c(d0Var, z);
        m812b(d0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: a */
    public boolean mo575a(C0813j.AbstractC0821d0 d0Var) {
        return !this.f3258g || d0Var.m866n();
    }

    /* renamed from: a */
    public abstract boolean mo574a(C0813j.AbstractC0821d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo573a(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0821d0 d0Var2, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: a */
    public boolean mo572a(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0821d0 d0Var2, C0813j.AbstractC0829l.C0832c cVar, C0813j.AbstractC0829l.C0832c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3207a;
        int i4 = cVar.f3208b;
        if (d0Var2.m856x()) {
            i2 = cVar.f3207a;
            i = cVar.f3208b;
        } else {
            i2 = cVar2.f3207a;
            i = cVar2.f3208b;
        }
        return mo573a(d0Var, d0Var2, i3, i4, i2, i);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: a */
    public boolean mo571a(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar, C0813j.AbstractC0829l.C0832c cVar2) {
        return (cVar == null || (cVar.f3207a == cVar2.f3207a && cVar.f3208b == cVar2.f3208b)) ? mo564f(d0Var) : mo574a(d0Var, cVar.f3207a, cVar.f3208b, cVar2.f3207a, cVar2.f3208b);
    }

    /* renamed from: b */
    public final void m568b(C0813j.AbstractC0821d0 d0Var, boolean z) {
        m565d(d0Var, z);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: b */
    public boolean mo569b(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar, C0813j.AbstractC0829l.C0832c cVar2) {
        int i = cVar.f3207a;
        int i2 = cVar.f3208b;
        View view = d0Var.f3179a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3207a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3208b;
        if (d0Var.m864p() || (i == left && i2 == top)) {
            return mo563g(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo574a(d0Var, i, i2, left, top);
    }

    /* renamed from: c */
    public void m566c(C0813j.AbstractC0821d0 d0Var, boolean z) {
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: c */
    public boolean mo567c(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0829l.C0832c cVar, C0813j.AbstractC0829l.C0832c cVar2) {
        if (cVar.f3207a != cVar2.f3207a || cVar.f3208b != cVar2.f3208b) {
            return mo574a(d0Var, cVar.f3207a, cVar.f3208b, cVar2.f3207a, cVar2.f3208b);
        }
        m560j(d0Var);
        return false;
    }

    /* renamed from: d */
    public void m565d(C0813j.AbstractC0821d0 d0Var, boolean z) {
    }

    /* renamed from: f */
    public abstract boolean mo564f(C0813j.AbstractC0821d0 d0Var);

    /* renamed from: g */
    public abstract boolean mo563g(C0813j.AbstractC0821d0 d0Var);

    /* renamed from: h */
    public final void m562h(C0813j.AbstractC0821d0 d0Var) {
        m556n(d0Var);
        m812b(d0Var);
    }

    /* renamed from: i */
    public final void m561i(C0813j.AbstractC0821d0 d0Var) {
        m555o(d0Var);
    }

    /* renamed from: j */
    public final void m560j(C0813j.AbstractC0821d0 d0Var) {
        m554p(d0Var);
        m812b(d0Var);
    }

    /* renamed from: k */
    public final void m559k(C0813j.AbstractC0821d0 d0Var) {
        m553q(d0Var);
    }

    /* renamed from: l */
    public final void m558l(C0813j.AbstractC0821d0 d0Var) {
        m552r(d0Var);
        m812b(d0Var);
    }

    /* renamed from: m */
    public final void m557m(C0813j.AbstractC0821d0 d0Var) {
        m551s(d0Var);
    }

    /* renamed from: n */
    public void m556n(C0813j.AbstractC0821d0 d0Var) {
    }

    /* renamed from: o */
    public void m555o(C0813j.AbstractC0821d0 d0Var) {
    }

    /* renamed from: p */
    public void m554p(C0813j.AbstractC0821d0 d0Var) {
    }

    /* renamed from: q */
    public void m553q(C0813j.AbstractC0821d0 d0Var) {
    }

    /* renamed from: r */
    public void m552r(C0813j.AbstractC0821d0 d0Var) {
    }

    /* renamed from: s */
    public void m551s(C0813j.AbstractC0821d0 d0Var) {
    }
}
