package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public abstract class AbstractC0810i {

    /* renamed from: a */
    protected final C0813j.AbstractC0835o f3066a;

    /* renamed from: b */
    private int f3067b;

    /* renamed from: c */
    final Rect f3068c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    public static class C0811a extends AbstractC0810i {
        C0811a(C0813j.AbstractC0835o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public int mo1041a() {
            return this.f3066a.m665q();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public int mo1039a(View view) {
            return this.f3066a.m679i(view) + ((ViewGroup.MarginLayoutParams) ((C0813j.C0840p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public void mo1040a(int i) {
            this.f3066a.mo705d(i);
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: b */
        public int mo1038b() {
            return this.f3066a.m665q() - this.f3066a.m668o();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: b */
        public int mo1037b(View view) {
            C0813j.C0840p pVar = (C0813j.C0840p) view.getLayoutParams();
            return this.f3066a.m681h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: c */
        public int mo1036c() {
            return this.f3066a.m668o();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: c */
        public int mo1035c(View view) {
            C0813j.C0840p pVar = (C0813j.C0840p) view.getLayoutParams();
            return this.f3066a.m684g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: d */
        public int mo1034d() {
            return this.f3066a.m664r();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: d */
        public int mo1033d(View view) {
            return this.f3066a.m689f(view) - ((ViewGroup.MarginLayoutParams) ((C0813j.C0840p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: e */
        public int mo1032e() {
            return this.f3066a.m680i();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: e */
        public int mo1031e(View view) {
            this.f3066a.m760a(view, true, this.f3068c);
            return this.f3068c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: f */
        public int mo1030f() {
            return this.f3066a.m670n();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: f */
        public int mo1029f(View view) {
            this.f3066a.m760a(view, true, this.f3068c);
            return this.f3068c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: g */
        public int mo1028g() {
            return (this.f3066a.m665q() - this.f3066a.m670n()) - this.f3066a.m668o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$b */
    /* loaded from: classes.dex */
    public static class C0812b extends AbstractC0810i {
        C0812b(C0813j.AbstractC0835o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public int mo1041a() {
            return this.f3066a.m682h();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public int mo1039a(View view) {
            return this.f3066a.m695e(view) + ((ViewGroup.MarginLayoutParams) ((C0813j.C0840p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: a */
        public void mo1040a(int i) {
            this.f3066a.mo696e(i);
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: b */
        public int mo1038b() {
            return this.f3066a.m682h() - this.f3066a.m672m();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: b */
        public int mo1037b(View view) {
            C0813j.C0840p pVar = (C0813j.C0840p) view.getLayoutParams();
            return this.f3066a.m684g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: c */
        public int mo1036c() {
            return this.f3066a.m672m();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: c */
        public int mo1035c(View view) {
            C0813j.C0840p pVar = (C0813j.C0840p) view.getLayoutParams();
            return this.f3066a.m681h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: d */
        public int mo1034d() {
            return this.f3066a.m680i();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: d */
        public int mo1033d(View view) {
            return this.f3066a.m677j(view) - ((ViewGroup.MarginLayoutParams) ((C0813j.C0840p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: e */
        public int mo1032e() {
            return this.f3066a.m664r();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: e */
        public int mo1031e(View view) {
            this.f3066a.m760a(view, true, this.f3068c);
            return this.f3068c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: f */
        public int mo1030f() {
            return this.f3066a.m666p();
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: f */
        public int mo1029f(View view) {
            this.f3066a.m760a(view, true, this.f3068c);
            return this.f3068c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0810i
        /* renamed from: g */
        public int mo1028g() {
            return (this.f3066a.m682h() - this.f3066a.m666p()) - this.f3066a.m672m();
        }
    }

    private AbstractC0810i(C0813j.AbstractC0835o oVar) {
        this.f3067b = Integer.MIN_VALUE;
        this.f3068c = new Rect();
        this.f3066a = oVar;
    }

    /* synthetic */ AbstractC0810i(C0813j.AbstractC0835o oVar, C0811a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static AbstractC0810i m1046a(C0813j.AbstractC0835o oVar) {
        return new C0811a(oVar);
    }

    /* renamed from: a */
    public static AbstractC0810i m1045a(C0813j.AbstractC0835o oVar, int i) {
        if (i == 0) {
            return m1046a(oVar);
        }
        if (i == 1) {
            return m1044b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static AbstractC0810i m1044b(C0813j.AbstractC0835o oVar) {
        return new C0812b(oVar);
    }

    /* renamed from: a */
    public abstract int mo1041a();

    /* renamed from: a */
    public abstract int mo1039a(View view);

    /* renamed from: a */
    public abstract void mo1040a(int i);

    /* renamed from: b */
    public abstract int mo1038b();

    /* renamed from: b */
    public abstract int mo1037b(View view);

    /* renamed from: c */
    public abstract int mo1036c();

    /* renamed from: c */
    public abstract int mo1035c(View view);

    /* renamed from: d */
    public abstract int mo1034d();

    /* renamed from: d */
    public abstract int mo1033d(View view);

    /* renamed from: e */
    public abstract int mo1032e();

    /* renamed from: e */
    public abstract int mo1031e(View view);

    /* renamed from: f */
    public abstract int mo1030f();

    /* renamed from: f */
    public abstract int mo1029f(View view);

    /* renamed from: g */
    public abstract int mo1028g();

    /* renamed from: h */
    public int m1043h() {
        if (Integer.MIN_VALUE == this.f3067b) {
            return 0;
        }
        return mo1028g() - this.f3067b;
    }

    /* renamed from: i */
    public void m1042i() {
        this.f3067b = mo1028g();
    }
}
