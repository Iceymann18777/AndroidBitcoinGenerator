package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.widget.AbstractC0605i0;
import androidx.appcompat.widget.C0612j0;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.C0003d;
import p000a.p001a.C0006g;
import p000a.p018g.p029l.C0200c;
import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0487e extends AbstractC0510n implements AbstractC0513p, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C */
    private static final int f1647C = C0006g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f1648A;

    /* renamed from: B */
    boolean f1649B;

    /* renamed from: c */
    private final Context f1650c;

    /* renamed from: d */
    private final int f1651d;

    /* renamed from: e */
    private final int f1652e;

    /* renamed from: f */
    private final int f1653f;

    /* renamed from: g */
    private final boolean f1654g;

    /* renamed from: p */
    private View f1663p;

    /* renamed from: q */
    View f1664q;

    /* renamed from: s */
    private boolean f1666s;

    /* renamed from: t */
    private boolean f1667t;

    /* renamed from: u */
    private int f1668u;

    /* renamed from: v */
    private int f1669v;

    /* renamed from: x */
    private boolean f1671x;

    /* renamed from: y */
    private AbstractC0513p.AbstractC0514a f1672y;

    /* renamed from: z */
    ViewTreeObserver f1673z;

    /* renamed from: i */
    private final List<C0496h> f1656i = new ArrayList();

    /* renamed from: j */
    final List<C0492d> f1657j = new ArrayList();

    /* renamed from: k */
    final ViewTreeObserver.OnGlobalLayoutListener f1658k = new ViewTreeObserver$OnGlobalLayoutListenerC0488a();

    /* renamed from: l */
    private final View.OnAttachStateChangeListener f1659l = new View$OnAttachStateChangeListenerC0489b();

    /* renamed from: m */
    private final AbstractC0605i0 f1660m = new C0490c();

    /* renamed from: n */
    private int f1661n = 0;

    /* renamed from: o */
    private int f1662o = 0;

    /* renamed from: w */
    private boolean f1670w = false;

    /* renamed from: r */
    private int f1665r = m2432j();

    /* renamed from: h */
    final Handler f1655h = new Handler();

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0488a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0488a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC0487e.this.mo2036d() && View$OnKeyListenerC0487e.this.f1657j.size() > 0 && !View$OnKeyListenerC0487e.this.f1657j.get(0).f1681a.m2024k()) {
                View view = View$OnKeyListenerC0487e.this.f1664q;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC0487e.this.dismiss();
                    return;
                }
                for (C0492d dVar : View$OnKeyListenerC0487e.this.f1657j) {
                    dVar.f1681a.mo1833f();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0489b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0489b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0487e.this.f1673z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0487e.this.f1673z = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0487e eVar = View$OnKeyListenerC0487e.this;
                eVar.f1673z.removeGlobalOnLayoutListener(eVar.f1658k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.e$c */
    /* loaded from: classes.dex */
    class C0490c implements AbstractC0605i0 {

        /* renamed from: androidx.appcompat.view.menu.e$c$a */
        /* loaded from: classes.dex */
        class RunnableC0491a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0492d f1677b;

            /* renamed from: c */
            final /* synthetic */ MenuItem f1678c;

            /* renamed from: d */
            final /* synthetic */ C0496h f1679d;

            RunnableC0491a(C0492d dVar, MenuItem menuItem, C0496h hVar) {
                this.f1677b = dVar;
                this.f1678c = menuItem;
                this.f1679d = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0492d dVar = this.f1677b;
                if (dVar != null) {
                    View$OnKeyListenerC0487e.this.f1649B = true;
                    dVar.f1682b.m2402a(false);
                    View$OnKeyListenerC0487e.this.f1649B = false;
                }
                if (this.f1678c.isEnabled() && this.f1678c.hasSubMenu()) {
                    this.f1679d.m2411a(this.f1678c, 4);
                }
            }
        }

        C0490c() {
        }

        @Override // androidx.appcompat.widget.AbstractC0605i0
        /* renamed from: a */
        public void mo1978a(C0496h hVar, MenuItem menuItem) {
            C0492d dVar = null;
            View$OnKeyListenerC0487e.this.f1655h.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0487e.this.f1657j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == View$OnKeyListenerC0487e.this.f1657j.get(i).f1682b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < View$OnKeyListenerC0487e.this.f1657j.size()) {
                    dVar = View$OnKeyListenerC0487e.this.f1657j.get(i2);
                }
                View$OnKeyListenerC0487e.this.f1655h.postAtTime(new RunnableC0491a(dVar, menuItem, hVar), hVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // androidx.appcompat.widget.AbstractC0605i0
        /* renamed from: b */
        public void mo1975b(C0496h hVar, MenuItem menuItem) {
            View$OnKeyListenerC0487e.this.f1655h.removeCallbacksAndMessages(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.e$d */
    /* loaded from: classes.dex */
    public static class C0492d {

        /* renamed from: a */
        public final C0612j0 f1681a;

        /* renamed from: b */
        public final C0496h f1682b;

        /* renamed from: c */
        public final int f1683c;

        public C0492d(C0612j0 j0Var, C0496h hVar, int i) {
            this.f1681a = j0Var;
            this.f1682b = hVar;
            this.f1683c = i;
        }

        /* renamed from: a */
        public ListView m2431a() {
            return this.f1681a.mo2034e();
        }
    }

    public View$OnKeyListenerC0487e(Context context, View view, int i, int i2, boolean z) {
        this.f1650c = context;
        this.f1663p = view;
        this.f1652e = i;
        this.f1653f = i2;
        this.f1654g = z;
        Resources resources = context.getResources();
        this.f1651d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0003d.abc_config_prefDialogWidth));
    }

    /* renamed from: a */
    private MenuItem m2437a(C0496h hVar, C0496h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m2438a(C0492d dVar, C0496h hVar) {
        int i;
        C0495g gVar;
        int firstVisiblePosition;
        MenuItem a = m2437a(dVar.f1682b, hVar);
        if (a == null) {
            return null;
        }
        ListView a2 = dVar.m2431a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C0495g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C0495g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == gVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: c */
    private int m2436c(C0496h hVar) {
        int size = this.f1657j.size();
        for (int i = 0; i < size; i++) {
            if (hVar == this.f1657j.get(i).f1682b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m2435d(int i) {
        List<C0492d> list = this.f1657j;
        ListView a = list.get(list.size() - 1).m2431a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1664q.getWindowVisibleDisplayFrame(rect);
        return this.f1665r == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private void m2434d(C0496h hVar) {
        View view;
        C0492d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1650c);
        C0495g gVar = new C0495g(hVar, from, this.f1654g, f1647C);
        if (!mo2036d() && this.f1670w) {
            gVar.m2424a(true);
        } else if (mo2036d()) {
            gVar.m2424a(AbstractC0510n.m2331b(hVar));
        }
        int a = AbstractC0510n.m2332a(gVar, null, this.f1650c, this.f1651d);
        C0612j0 i4 = m2433i();
        i4.mo1837a((ListAdapter) gVar);
        i4.m2041b(a);
        i4.m2038c(this.f1662o);
        if (this.f1657j.size() > 0) {
            List<C0492d> list = this.f1657j;
            dVar = list.get(list.size() - 1);
            view = m2438a(dVar, hVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            i4.m1973c(false);
            i4.m1976a((Object) null);
            int d = m2435d(a);
            boolean z = d == 1;
            this.f1665r = d;
            if (Build.VERSION.SDK_INT >= 26) {
                i4.m2047a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1663p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1662o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1663p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1662o & 5) == 5) {
                if (!z) {
                    a = view.getWidth();
                    i3 = i - a;
                }
                i3 = i + a;
            } else {
                if (z) {
                    a = view.getWidth();
                    i3 = i + a;
                }
                i3 = i - a;
            }
            i4.m2035d(i3);
            i4.m2040b(true);
            i4.m2028h(i2);
        } else {
            if (this.f1666s) {
                i4.m2035d(this.f1668u);
            }
            if (this.f1667t) {
                i4.m2028h(this.f1669v);
            }
            i4.m2049a(m2329h());
        }
        this.f1657j.add(new C0492d(i4, hVar, this.f1665r));
        i4.mo1833f();
        ListView e = i4.mo2034e();
        e.setOnKeyListener(this);
        if (dVar == null && this.f1671x && hVar.m2380h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0006g.abc_popup_menu_header_item_layout, (ViewGroup) e, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(hVar.m2380h());
            e.addHeaderView(frameLayout, null, false);
            i4.mo1833f();
        }
    }

    /* renamed from: i */
    private C0612j0 m2433i() {
        C0612j0 j0Var = new C0612j0(this.f1650c, null, this.f1652e, this.f1653f);
        j0Var.m1977a(this.f1660m);
        j0Var.m2045a((AdapterView.OnItemClickListener) this);
        j0Var.m2044a((PopupWindow.OnDismissListener) this);
        j0Var.m2047a(this.f1663p);
        j0Var.m2038c(this.f1662o);
        j0Var.m2043a(true);
        j0Var.m2033e(2);
        return j0Var;
    }

    /* renamed from: j */
    private int m2432j() {
        return C0216r.m3411j(this.f1663p) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2312a(int i) {
        if (this.f1661n != i) {
            this.f1661n = i;
            this.f1662o = C0200c.m3490a(i, C0216r.m3411j(this.f1663p));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo130a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2311a(View view) {
        if (this.f1663p != view) {
            this.f1663p = view;
            this.f1662o = C0200c.m3490a(this.f1661n, C0216r.m3411j(this.f1663p));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2310a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1648A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: a */
    public void mo2309a(C0496h hVar) {
        hVar.m2407a(this, this.f1650c);
        if (mo2036d()) {
            m2434d(hVar);
        } else {
            this.f1656i.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(C0496h hVar, boolean z) {
        int c = m2436c(hVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f1657j.size()) {
                this.f1657j.get(i).f1682b.m2402a(false);
            }
            C0492d remove = this.f1657j.remove(c);
            remove.f1682b.m2398b(this);
            if (this.f1649B) {
                remove.f1681a.m1974b((Object) null);
                remove.f1681a.m2050a(0);
            }
            remove.f1681a.dismiss();
            int size = this.f1657j.size();
            this.f1665r = size > 0 ? this.f1657j.get(size - 1).f1683c : m2432j();
            if (size == 0) {
                dismiss();
                AbstractC0513p.AbstractC0514a aVar = this.f1672y;
                if (aVar != null) {
                    aVar.mo2108a(hVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1673z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1673z.removeGlobalOnLayoutListener(this.f1658k);
                    }
                    this.f1673z = null;
                }
                this.f1664q.removeOnAttachStateChangeListener(this.f1659l);
                this.f1648A.onDismiss();
            } else if (z) {
                this.f1657j.get(0).f1682b.m2402a(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo2308a(AbstractC0513p.AbstractC0514a aVar) {
        this.f1672y = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean z) {
        for (C0492d dVar : this.f1657j) {
            AbstractC0510n.m2333a(dVar.m2431a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(SubMenuC0523v vVar) {
        for (C0492d dVar : this.f1657j) {
            if (vVar == dVar.f1682b) {
                dVar.m2431a().requestFocus();
                return true;
            }
        }
        if (!vVar.hasVisibleItems()) {
            return false;
        }
        mo2309a((C0496h) vVar);
        AbstractC0513p.AbstractC0514a aVar = this.f1672y;
        if (aVar != null) {
            aVar.mo2109a(vVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: b */
    public void mo2307b(int i) {
        this.f1666s = true;
        this.f1668u = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: b */
    public void mo2306b(boolean z) {
        this.f1670w = z;
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
        this.f1667t = true;
        this.f1669v = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: c */
    public void mo2304c(boolean z) {
        this.f1671x = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: d */
    public boolean mo2036d() {
        return this.f1657j.size() > 0 && this.f1657j.get(0).f1681a.mo2036d();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    public void dismiss() {
        int size = this.f1657j.size();
        if (size > 0) {
            C0492d[] dVarArr = (C0492d[]) this.f1657j.toArray(new C0492d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0492d dVar = dVarArr[i];
                if (dVar.f1681a.mo2036d()) {
                    dVar.f1681a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: e */
    public ListView mo2034e() {
        if (this.f1657j.isEmpty()) {
            return null;
        }
        List<C0492d> list = this.f1657j;
        return list.get(list.size() - 1).m2431a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519t
    /* renamed from: f */
    public void mo1833f() {
        if (!mo2036d()) {
            for (C0496h hVar : this.f1656i) {
                m2434d(hVar);
            }
            this.f1656i.clear();
            this.f1664q = this.f1663p;
            if (this.f1664q != null) {
                boolean z = this.f1673z == null;
                this.f1673z = this.f1664q.getViewTreeObserver();
                if (z) {
                    this.f1673z.addOnGlobalLayoutListener(this.f1658k);
                }
                this.f1664q.addOnAttachStateChangeListener(this.f1659l);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0510n
    /* renamed from: g */
    protected boolean mo2330g() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0492d dVar;
        int size = this.f1657j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1657j.get(i);
            if (!dVar.f1681a.mo2036d()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f1682b.m2402a(false);
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
