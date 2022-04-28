package p000a.p018g.p029l;

import android.view.View;
import android.view.ViewParent;

/* renamed from: a.g.l.k */
/* loaded from: classes.dex */
public class C0209k {

    /* renamed from: a */
    private ViewParent f654a;

    /* renamed from: b */
    private ViewParent f655b;

    /* renamed from: c */
    private final View f656c;

    /* renamed from: d */
    private boolean f657d;

    /* renamed from: e */
    private int[] f658e;

    public C0209k(View view) {
        this.f656c = view;
    }

    /* renamed from: a */
    private void m3461a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f654a = viewParent;
        } else if (i == 1) {
            this.f655b = viewParent;
        }
    }

    /* renamed from: d */
    private ViewParent m3455d(int i) {
        if (i == 0) {
            return this.f654a;
        }
        if (i != 1) {
            return null;
        }
        return this.f655b;
    }

    /* renamed from: a */
    public void m3460a(boolean z) {
        if (this.f657d) {
            C0216r.m3448C(this.f656c);
        }
        this.f657d = z;
    }

    /* renamed from: a */
    public boolean m3470a() {
        return m3467a(0);
    }

    /* renamed from: a */
    public boolean m3469a(float f, float f2) {
        ViewParent d;
        if (!m3459b() || (d = m3455d(0)) == null) {
            return false;
        }
        return C0222u.m3380a(d, this.f656c, f, f2);
    }

    /* renamed from: a */
    public boolean m3468a(float f, float f2, boolean z) {
        ViewParent d;
        if (!m3459b() || (d = m3455d(0)) == null) {
            return false;
        }
        return C0222u.m3379a(d, this.f656c, f, f2, z);
    }

    /* renamed from: a */
    public boolean m3467a(int i) {
        return m3455d(i) != null;
    }

    /* renamed from: a */
    public boolean m3466a(int i, int i2) {
        if (m3467a(i2)) {
            return true;
        }
        if (!m3459b()) {
            return false;
        }
        View view = this.f656c;
        for (ViewParent parent = this.f656c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0222u.m3374b(parent, view, this.f656c, i, i2)) {
                m3461a(i2, parent);
                C0222u.m3375a(parent, view, this.f656c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3465a(int i, int i2, int i3, int i4, int[] iArr) {
        return m3464a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean m3464a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent d;
        int i6;
        int i7;
        if (!m3459b() || (d = m3455d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f656c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        C0222u.m3377a(d, this.f656c, i, i2, i3, i4, i5);
        if (iArr != null) {
            this.f656c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m3463a(int i, int i2, int[] iArr, int[] iArr2) {
        return m3462a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean m3462a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!m3459b() || (d = m3455d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f656c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.f658e == null) {
                this.f658e = new int[2];
            }
            iArr = this.f658e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0222u.m3376a(d, this.f656c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f656c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m3459b() {
        return this.f657d;
    }

    /* renamed from: b */
    public boolean m3458b(int i) {
        return m3466a(i, 0);
    }

    /* renamed from: c */
    public void m3457c() {
        m3456c(0);
    }

    /* renamed from: c */
    public void m3456c(int i) {
        ViewParent d = m3455d(i);
        if (d != null) {
            C0222u.m3378a(d, this.f656c, i);
            m3461a(i, (ViewParent) null);
        }
    }
}
