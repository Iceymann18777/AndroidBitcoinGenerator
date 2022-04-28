package p000a.p018g.p029l;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: a.g.l.z */
/* loaded from: classes.dex */
public class C0230z {

    /* renamed from: a */
    private final Object f685a;

    private C0230z(Object obj) {
        this.f685a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0230z m3359a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0230z(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m3360a(C0230z zVar) {
        if (zVar == null) {
            return null;
        }
        return zVar.f685a;
    }

    /* renamed from: a */
    public C0230z m3362a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0230z(((WindowInsets) this.f685a).consumeSystemWindowInsets());
        }
        return null;
    }

    /* renamed from: a */
    public C0230z m3361a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0230z(((WindowInsets) this.f685a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int m3358b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f685a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: c */
    public int m3357c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f685a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: d */
    public int m3356d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f685a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: e */
    public int m3355e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f685a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0230z.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f685a;
        Object obj3 = ((C0230z) obj).f685a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    /* renamed from: f */
    public boolean m3354f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f685a).hasSystemWindowInsets();
        }
        return false;
    }

    /* renamed from: g */
    public boolean m3353g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f685a).isConsumed();
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f685a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
