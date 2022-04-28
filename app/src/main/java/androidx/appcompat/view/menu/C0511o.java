package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

import p000a.p001a.C0003d;
import p000a.p018g.p029l.C0200c;
import p000a.p018g.p029l.C0216r;

/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes.dex */
public class C0511o implements AbstractC0500j {

    /* renamed from: a */
    private final Context f1773a;

    /* renamed from: b */
    private final C0496h f1774b;

    /* renamed from: c */
    private final boolean f1775c;

    /* renamed from: d */
    private final int f1776d;

    /* renamed from: e */
    private final int f1777e;

    /* renamed from: f */
    private View f1778f;

    /* renamed from: g */
    private int f1779g;

    /* renamed from: h */
    private boolean f1780h;

    /* renamed from: i */
    private AbstractC0513p.AbstractC0514a f1781i;

    /* renamed from: j */
    private AbstractC0510n f1782j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1783k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1784l;

    /* renamed from: androidx.appcompat.view.menu.o$a */
    /* loaded from: classes.dex */
    class C0512a implements PopupWindow.OnDismissListener {
        C0512a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0511o.this.mo2110d();
        }
    }

    public C0511o(Context context, C0496h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, i, 0);
    }

    public C0511o(Context context, C0496h hVar, View view, boolean z, int i, int i2) {
        this.f1779g = 8388611;
        this.f1784l = new C0512a();
        this.f1773a = context;
        this.f1774b = hVar;
        this.f1778f = view;
        this.f1775c = z;
        this.f1776d = i;
        this.f1777e = i2;
    }

    /* renamed from: a */
    private void m2325a(int i, int i2, boolean z, boolean z2) {
        AbstractC0510n b = m2320b();
        b.mo2304c(z2);
        if (z) {
            if ((C0200c.m3490a(this.f1779g, C0216r.m3411j(this.f1778f)) & 7) == 5) {
                i -= this.f1778f.getWidth();
            }
            b.mo2307b(i);
            b.mo2305c(i2);
            int i3 = (int) ((this.f1773a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.m2334a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo1833f();
    }

    /* renamed from: g */
    private AbstractC0510n m2316g() {
        Display defaultDisplay = ((WindowManager) this.f1773a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        AbstractC0510n eVar = Math.min(point.x, point.y) >= this.f1773a.getResources().getDimensionPixelSize(C0003d.abc_cascading_menus_min_smallest_width) ? new View$OnKeyListenerC0487e(this.f1773a, this.f1778f, this.f1776d, this.f1777e, this.f1775c) : new View$OnKeyListenerC0520u(this.f1773a, this.f1774b, this.f1778f, this.f1776d, this.f1777e, this.f1775c);
        eVar.mo2309a(this.f1774b);
        eVar.mo2310a(this.f1784l);
        eVar.mo2311a(this.f1778f);
        eVar.mo2308a(this.f1781i);
        eVar.mo2306b(this.f1780h);
        eVar.mo2312a(this.f1779g);
        return eVar;
    }

    /* renamed from: a */
    public void m2328a() {
        if (m2319c()) {
            this.f1782j.dismiss();
        }
    }

    /* renamed from: a */
    public void m2327a(int i) {
        this.f1779g = i;
    }

    /* renamed from: a */
    public void m2324a(View view) {
        this.f1778f = view;
    }

    /* renamed from: a */
    public void m2323a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1783k = onDismissListener;
    }

    /* renamed from: a */
    public void m2322a(AbstractC0513p.AbstractC0514a aVar) {
        this.f1781i = aVar;
        AbstractC0510n nVar = this.f1782j;
        if (nVar != null) {
            nVar.mo2308a(aVar);
        }
    }

    /* renamed from: a */
    public void m2321a(boolean z) {
        this.f1780h = z;
        AbstractC0510n nVar = this.f1782j;
        if (nVar != null) {
            nVar.mo2306b(z);
        }
    }

    /* renamed from: a */
    public boolean m2326a(int i, int i2) {
        if (m2319c()) {
            return true;
        }
        if (this.f1778f == null) {
            return false;
        }
        m2325a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public AbstractC0510n m2320b() {
        if (this.f1782j == null) {
            this.f1782j = m2316g();
        }
        return this.f1782j;
    }

    /* renamed from: c */
    public boolean m2319c() {
        AbstractC0510n nVar = this.f1782j;
        return nVar != null && nVar.mo2036d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2110d() {
        this.f1782j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1783k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void m2318e() {
        if (!m2317f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean m2317f() {
        if (m2319c()) {
            return true;
        }
        if (this.f1778f == null) {
            return false;
        }
        m2325a(0, 0, false, false);
        return true;
    }
}
