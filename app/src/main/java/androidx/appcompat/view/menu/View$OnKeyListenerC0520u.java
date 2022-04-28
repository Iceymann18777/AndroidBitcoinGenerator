package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.widget.C0612j0;
import p000a.p001a.C0003d;
import p000a.p001a.C0006g;
import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.u */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0520u extends AbstractC0510n implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, AbstractC0513p, View.OnKeyListener {

    /* renamed from: w */
    private static final int f1786w = C0006g.abc_popup_menu_item_layout;

    /* renamed from: c */
    private final Context f1787c;

    /* renamed from: d */
    private final C0496h f1788d;

    /* renamed from: e */
    private final C0495g f1789e;

    /* renamed from: f */
    private final boolean f1790f;

    /* renamed from: g */
    private final int f1791g;

    /* renamed from: h */
    private final int f1792h;

    /* renamed from: i */
    private final int f1793i;

    /* renamed from: j */
    final C0612j0 f1794j;

    /* renamed from: m */
    private PopupWindow.OnDismissListener f1797m;

    /* renamed from: n */
    private View f1798n;

    /* renamed from: o */
    View f1799o;

    /* renamed from: p */
    private AbstractC0513p.AbstractC0514a f1800p;

    /* renamed from: q */
    ViewTreeObserver f1801q;

    /* renamed from: r */
    private boolean f1802r;

    /* renamed from: s */
    private boolean f1803s;

    /* renamed from: t */
    private int f1804t;

    /* renamed from: v */
    private boolean f1806v;

    /* renamed from: k */
    final ViewTreeObserver.OnGlobalLayoutListener f1795k = new ViewTreeObserver$OnGlobalLayoutListenerC0521a();

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f1796l = new View$OnAttachStateChangeListenerC0522b();

    /* renamed from: u */
    private int f1805u = 0;

    /* renamed from: androidx.appcompat.view.menu.u$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0521a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0521a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC0520u.this.mo2036d() && !View$OnKeyListenerC0520u.this.f1794j.m2024k()) {
                View view = View$OnKeyListenerC0520u.this.f1799o;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC0520u.this.dismiss();
                } else {
                    View$OnKeyListenerC0520u.this.f1794j.mo1833f();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.u$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0522b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0522b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0520u.this.f1801q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0520u.this.f1801q = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0520u uVar = View$OnKeyListenerC0520u.this;
                uVar.f1801q.removeGlobalOnLayoutListener(uVar.f1795k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0520u(Context context, C0496h hVar, View view, int i, int i2, boolean z) {
        this.f1787c = context;
        this.f1788d = hVar;
        this.f1790f = z;
        this.f1789e = new C0495g(hVar, LayoutInflater.from(context), this.f1790f, f1786w);
        this.f1792h = i;
        this.f1793i = i2;
        Resources resources = context.getResources();
        this.f1791g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0003d.abc_config_prefDialogWidth));
        this.f1798n = view;
        this.f1794j = new C0612j0(this.f1787c, null, this.f1792h, this.f1793i);
        hVar.m2407a(this, context);
    }

    /* renamed from: i */
    private boolean m2303i() {
        View view;
        if (mo2036d()) {
            return true;
        }
        if (this.f1802r || (view = this.f1798n) == null) {
            return false;
        }
        this.f1799o = view;
        this.f1794j.m2044a((PopupWindow.OnDismissListener) this);
        this.f1794j.m2045a((AdapterView.OnItemClickListener) this);
        this.f1794j.m2043a(true);
        View view2 = this.f1799o;
        boolean z = this.f1801q == null;
        this.f1801q = view2.getViewTreeObserver();
        if (z) {
            this.f1801q.addOnGlobalLayoutListener(this.f1795k);
        }
        view2.addOnAttachStateChangeListener(this.f1796l);
        this.f1794j.m2047a(view2);
        this.f1794j.m2038c(this.f1805u);
        if (!this.f1803s) {
            this.f1804t = AbstractC0510n.m2332a(this.f1789e, null, this.f1787c, this.f1791g);
            this.f1803s = true;
        }
        this.f1794j.m2041b(this.f1804t);
        this.f1794j.m2033e(2);
        this.f1794j.m2049a(m2329h());
        this.f1794j.mo1833f();
        ListView e = this.f1794j.mo2034e();
        e.setOnKeyListener(this);
        if (this.f1806v && this.f1788d.m2380h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1787c).inflate(C0006g.abc_popup_menu_header_item_layout, (ViewGroup) e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1788d.m2380h());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView(frameLayout, null, false);
        }
        this.f1794j.mo1837a((ListAdapter) this.f1789e);
        this.f1794j.mo1833f();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2312a(int i) {
        this.f1805u = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2311a(View view) {
        this.f1798n = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2310a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1797m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2309a(C0496h hVar) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(C0496h hVar, boolean z) {
        if (hVar == this.f1788d) {
            dismiss();
            AbstractC0513p.AbstractC0514a aVar = this.f1800p;
            if (aVar != null) {
                aVar.mo2108a(hVar, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo2308a(AbstractC0513p.AbstractC0514a aVar) {
        this.f1800p = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean z) {
        this.f1803s = false;
        C0495g gVar = this.f1789e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(SubMenuC0523v vVar) {
        if (vVar.hasVisibleItems()) {
            C0511o oVar = new C0511o(this.f1787c, vVar, this.f1799o, this.f1790f, this.f1792h, this.f1793i);
            oVar.m2322a(this.f1800p);
            oVar.m2321a(AbstractC0510n.m2331b(vVar));
            oVar.m2323a(this.f1797m);
            this.f1797m = null;
            this.f1788d.m2402a(false);
            int g = this.f1794j.m2031g();
            int h = this.f1794j.m2029h();
            if ((Gravity.getAbsoluteGravity(this.f1805u, C0216r.m3411j(this.f1798n)) & 7) == 5) {
                g += this.f1798n.getWidth();
            }
            if (oVar.m2326a(g, h)) {
                AbstractC0513p.AbstractC0514a aVar = this.f1800p;
                if (aVar == null) {
                    return true;
                }
                aVar.mo2109a(vVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: b */
    public void mo2307b(int i) {
        this.f1794j.m2035d(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: b */
    public void mo2306b(boolean z) {
        this.f1789e.m2424a(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo122b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: c */
    public Parcelable mo117c() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: c */
    public void mo2305c(int i) {
        this.f1794j.m2028h(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: c */
    public void mo2304c(boolean z) {
        this.f1806v = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: d */
    public boolean mo2036d() {
        return !this.f1802r && this.f1794j.mo2036d();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    public void dismiss() {
        if (mo2036d()) {
            this.f1794j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: e */
    public ListView mo2034e() {
        return this.f1794j.mo2034e();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: f */
    public void mo1833f() {
        if (!m2303i()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1802r = true;
        this.f1788d.close();
        ViewTreeObserver viewTreeObserver = this.f1801q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1801q = this.f1799o.getViewTreeObserver();
            }
            this.f1801q.removeGlobalOnLayoutListener(this.f1795k);
            this.f1801q = null;
        }
        this.f1799o.removeOnAttachStateChangeListener(this.f1796l);
        PopupWindow.OnDismissListener onDismissListener = this.f1797m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
