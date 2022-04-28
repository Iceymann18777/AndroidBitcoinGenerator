package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
class C0858n {

    /* renamed from: a */
    final AbstractC0860b f3259a;

    /* renamed from: b */
    C0859a f3260b = new C0859a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* loaded from: classes.dex */
    static class C0859a {

        /* renamed from: a */
        int f3261a = 0;

        /* renamed from: b */
        int f3262b;

        /* renamed from: c */
        int f3263c;

        /* renamed from: d */
        int f3264d;

        /* renamed from: e */
        int f3265e;

        C0859a() {
        }

        /* renamed from: a */
        int m546a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: a */
        void m547a(int i) {
            this.f3261a = i | this.f3261a;
        }

        /* renamed from: a */
        void m545a(int i, int i2, int i3, int i4) {
            this.f3262b = i;
            this.f3263c = i2;
            this.f3264d = i3;
            this.f3265e = i4;
        }

        /* renamed from: a */
        boolean m548a() {
            int i = this.f3261a;
            if ((i & 7) != 0 && (i & (m546a(this.f3264d, this.f3262b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3261a;
            if ((i2 & 112) != 0 && (i2 & (m546a(this.f3264d, this.f3263c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3261a;
            if ((i3 & 1792) != 0 && (i3 & (m546a(this.f3265e, this.f3262b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3261a;
            return (i4 & 28672) == 0 || (i4 & (m546a(this.f3265e, this.f3263c) << 12)) != 0;
        }

        /* renamed from: b */
        void m544b() {
            this.f3261a = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    /* loaded from: classes.dex */
    interface AbstractC0860b {
        /* renamed from: a */
        int mo543a();

        /* renamed from: a */
        int mo541a(View view);

        /* renamed from: a */
        View mo542a(int i);

        /* renamed from: b */
        int mo540b();

        /* renamed from: b */
        int mo539b(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0858n(AbstractC0860b bVar) {
        this.f3259a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m550a(int i, int i2, int i3, int i4) {
        int b = this.f3259a.mo540b();
        int a = this.f3259a.mo543a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f3259a.mo542a(i);
            this.f3260b.m545a(b, a, this.f3259a.mo539b(a2), this.f3259a.mo541a(a2));
            if (i3 != 0) {
                this.f3260b.m544b();
                this.f3260b.m547a(i3);
                if (this.f3260b.m548a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f3260b.m544b();
                this.f3260b.m547a(i4);
                if (this.f3260b.m548a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m549a(View view, int i) {
        this.f3260b.m545a(this.f3259a.mo540b(), this.f3259a.mo543a(), this.f3259a.mo539b(view), this.f3259a.mo541a(view));
        if (i == 0) {
            return false;
        }
        this.f3260b.m544b();
        this.f3260b.m547a(i);
        return this.f3260b.m548a();
    }
}
