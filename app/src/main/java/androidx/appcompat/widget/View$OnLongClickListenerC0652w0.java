package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0220s;

/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: classes.dex */
class View$OnLongClickListenerC0652w0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    private static View$OnLongClickListenerC0652w0 f2333k;

    /* renamed from: l */
    private static View$OnLongClickListenerC0652w0 f2334l;

    /* renamed from: b */
    private final View f2335b;

    /* renamed from: c */
    private final CharSequence f2336c;

    /* renamed from: d */
    private final int f2337d;

    /* renamed from: e */
    private final Runnable f2338e = new RunnableC0653a();

    /* renamed from: f */
    private final Runnable f2339f = new RunnableC0654b();

    /* renamed from: g */
    private int f2340g;

    /* renamed from: h */
    private int f2341h;

    /* renamed from: i */
    private C0657x0 f2342i;

    /* renamed from: j */
    private boolean f2343j;

    /* renamed from: androidx.appcompat.widget.w0$a */
    /* loaded from: classes.dex */
    class RunnableC0653a implements Runnable {
        RunnableC0653a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC0652w0.this.m1826a(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$b */
    /* loaded from: classes.dex */
    class RunnableC0654b implements Runnable {
        RunnableC0654b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC0652w0.this.m1830a();
        }
    }

    private View$OnLongClickListenerC0652w0(View view, CharSequence charSequence) {
        this.f2335b = view;
        this.f2336c = charSequence;
        this.f2337d = C0220s.m3386a(ViewConfiguration.get(this.f2335b.getContext()));
        m1824c();
        this.f2335b.setOnLongClickListener(this);
        this.f2335b.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m1828a(View view, CharSequence charSequence) {
        View$OnLongClickListenerC0652w0 w0Var = f2333k;
        if (w0Var != null && w0Var.f2335b == view) {
            m1827a((View$OnLongClickListenerC0652w0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC0652w0 w0Var2 = f2334l;
            if (w0Var2 != null && w0Var2.f2335b == view) {
                w0Var2.m1830a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC0652w0(view, charSequence);
    }

    /* renamed from: a */
    private static void m1827a(View$OnLongClickListenerC0652w0 w0Var) {
        View$OnLongClickListenerC0652w0 w0Var2 = f2333k;
        if (w0Var2 != null) {
            w0Var2.m1825b();
        }
        f2333k = w0Var;
        View$OnLongClickListenerC0652w0 w0Var3 = f2333k;
        if (w0Var3 != null) {
            w0Var3.m1823d();
        }
    }

    /* renamed from: a */
    private boolean m1829a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f2340g) <= this.f2337d && Math.abs(y - this.f2341h) <= this.f2337d) {
            return false;
        }
        this.f2340g = x;
        this.f2341h = y;
        return true;
    }

    /* renamed from: b */
    private void m1825b() {
        this.f2335b.removeCallbacks(this.f2338e);
    }

    /* renamed from: c */
    private void m1824c() {
        this.f2340g = Integer.MAX_VALUE;
        this.f2341h = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1823d() {
        this.f2335b.postDelayed(this.f2338e, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: a */
    void m1830a() {
        if (f2334l == this) {
            f2334l = null;
            C0657x0 x0Var = this.f2342i;
            if (x0Var != null) {
                x0Var.m1799a();
                this.f2342i = null;
                m1824c();
                this.f2335b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2333k == this) {
            m1827a((View$OnLongClickListenerC0652w0) null);
        }
        this.f2335b.removeCallbacks(this.f2339f);
    }

    /* renamed from: a */
    void m1826a(boolean z) {
        long j;
        if (C0216r.m3398w(this.f2335b)) {
            m1827a((View$OnLongClickListenerC0652w0) null);
            View$OnLongClickListenerC0652w0 w0Var = f2334l;
            if (w0Var != null) {
                w0Var.m1830a();
            }
            f2334l = this;
            this.f2343j = z;
            this.f2342i = new C0657x0(this.f2335b.getContext());
            this.f2342i.m1796a(this.f2335b, this.f2340g, this.f2341h, this.f2343j, this.f2336c);
            this.f2335b.addOnAttachStateChangeListener(this);
            if (this.f2343j) {
                j = 2500;
            } else {
                j = ((C0216r.m3404q(this.f2335b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f2335b.removeCallbacks(this.f2339f);
            this.f2335b.postDelayed(this.f2339f, j);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2342i != null && this.f2343j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2335b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1824c();
                m1830a();
            }
        } else if (this.f2335b.isEnabled() && this.f2342i == null && m1829a(motionEvent)) {
            m1827a(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2340g = view.getWidth() / 2;
        this.f2341h = view.getHeight() / 2;
        m1826a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1830a();
    }
}
