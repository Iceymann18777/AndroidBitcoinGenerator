package androidx.appcompat.app;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.view.menu.AbstractC0513p;
import androidx.appcompat.view.menu.AbstractC0515q;
import androidx.appcompat.view.menu.C0493f;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.widget.AbstractC0566a0;
import androidx.appcompat.widget.AbstractC0586e0;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0606j;
import androidx.appcompat.widget.C0638t0;
import androidx.appcompat.widget.C0659y0;
import androidx.appcompat.widget.C0661z0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0694d;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p000a.p001a.C0000a;
import p000a.p001a.C0002c;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0008i;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p001a.p006m.AbstractC0029b;
import p000a.p001a.p006m.C0032d;
import p000a.p001a.p006m.C0034f;
import p000a.p001a.p006m.C0036g;
import p000a.p001a.p006m.Window$CallbackC0041i;
import p000a.p018g.p029l.AbstractC0213o;
import p000a.p018g.p029l.AbstractC0227w;
import p000a.p018g.p029l.C0201d;
import p000a.p018g.p029l.C0203e;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0223v;
import p000a.p018g.p029l.C0228x;
import p000a.p018g.p029l.C0230z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0445h extends AbstractC0444g implements C0496h.AbstractC0497a, LayoutInflater.Factory2 {

    /* renamed from: T */
    private static final boolean f1420T;

    /* renamed from: U */
    private static final int[] f1421U;

    /* renamed from: V */
    private static boolean f1422V;

    /* renamed from: A */
    boolean f1423A;

    /* renamed from: B */
    boolean f1424B;

    /* renamed from: C */
    boolean f1425C;

    /* renamed from: D */
    boolean f1426D;

    /* renamed from: E */
    private boolean f1427E;

    /* renamed from: F */
    private C0462n[] f1428F;

    /* renamed from: G */
    private C0462n f1429G;

    /* renamed from: H */
    private boolean f1430H;

    /* renamed from: I */
    boolean f1431I;

    /* renamed from: K */
    private boolean f1433K;

    /* renamed from: L */
    private C0459l f1434L;

    /* renamed from: M */
    boolean f1435M;

    /* renamed from: N */
    int f1436N;

    /* renamed from: P */
    private boolean f1438P;

    /* renamed from: Q */
    private Rect f1439Q;

    /* renamed from: R */
    private Rect f1440R;

    /* renamed from: S */
    private AppCompatViewInflater f1441S;

    /* renamed from: c */
    final Context f1442c;

    /* renamed from: d */
    final Window f1443d;

    /* renamed from: e */
    final Window.Callback f1444e;

    /* renamed from: f */
    final Window.Callback f1445f;

    /* renamed from: g */
    final AbstractC0443f f1446g;

    /* renamed from: h */
    AbstractC0428a f1447h;

    /* renamed from: i */
    MenuInflater f1448i;

    /* renamed from: j */
    private CharSequence f1449j;

    /* renamed from: k */
    private AbstractC0566a0 f1450k;

    /* renamed from: l */
    private C0455i f1451l;

    /* renamed from: m */
    private C0463o f1452m;

    /* renamed from: n */
    AbstractC0029b f1453n;

    /* renamed from: o */
    ActionBarContextView f1454o;

    /* renamed from: p */
    PopupWindow f1455p;

    /* renamed from: q */
    Runnable f1456q;

    /* renamed from: t */
    private boolean f1459t;

    /* renamed from: u */
    private ViewGroup f1460u;

    /* renamed from: v */
    private TextView f1461v;

    /* renamed from: w */
    private View f1462w;

    /* renamed from: x */
    private boolean f1463x;

    /* renamed from: y */
    private boolean f1464y;

    /* renamed from: z */
    boolean f1465z;

    /* renamed from: r */
    C0223v f1457r = null;

    /* renamed from: s */
    private boolean f1458s = true;

    /* renamed from: J */
    private int f1432J = -100;

    /* renamed from: O */
    private final Runnable f1437O = new RunnableC0447b();

    /* renamed from: androidx.appcompat.app.h$a */
    /* loaded from: classes.dex */
    static class C0446a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1466a;

        C0446a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1466a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m2551a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (m2551a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f1466a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f1466a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    /* loaded from: classes.dex */
    class RunnableC0447b implements Runnable {
        RunnableC0447b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0445h hVar = LayoutInflater$Factory2C0445h.this;
            if ((hVar.f1436N & 1) != 0) {
                hVar.m2580e(0);
            }
            LayoutInflater$Factory2C0445h hVar2 = LayoutInflater$Factory2C0445h.this;
            if ((hVar2.f1436N & 4096) != 0) {
                hVar2.m2580e(108);
            }
            LayoutInflater$Factory2C0445h hVar3 = LayoutInflater$Factory2C0445h.this;
            hVar3.f1435M = false;
            hVar3.f1436N = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$c */
    /* loaded from: classes.dex */
    public class C0448c implements AbstractC0213o {
        C0448c() {
        }

        @Override // p000a.p018g.p029l.AbstractC0213o
        /* renamed from: a */
        public C0230z mo86a(View view, C0230z zVar) {
            int e = zVar.m3355e();
            int i = LayoutInflater$Factory2C0445h.this.m2571i(e);
            if (e != i) {
                zVar = zVar.m3361a(zVar.m3357c(), i, zVar.m3356d(), zVar.m3358b());
            }
            return C0216r.m3426b(view, zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$d */
    /* loaded from: classes.dex */
    public class C0449d implements AbstractC0586e0.AbstractC0587a {
        C0449d() {
        }

        @Override // androidx.appcompat.widget.AbstractC0586e0.AbstractC0587a
        /* renamed from: a */
        public void mo2078a(Rect rect) {
            rect.top = LayoutInflater$Factory2C0445h.this.m2571i(rect.top);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$e */
    /* loaded from: classes.dex */
    public class C0450e implements ContentFrameLayout.AbstractC0536a {
        C0450e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC0536a
        /* renamed from: a */
        public void mo2245a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.AbstractC0536a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C0445h.this.m2567l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$f */
    /* loaded from: classes.dex */
    public class RunnableC0451f implements Runnable {

        /* renamed from: androidx.appcompat.app.h$f$a */
        /* loaded from: classes.dex */
        class C0452a extends C0228x {
            C0452a() {
            }

            @Override // p000a.p018g.p029l.AbstractC0227w
            /* renamed from: a */
            public void mo1850a(View view) {
                LayoutInflater$Factory2C0445h.this.f1454o.setAlpha(1.0f);
                LayoutInflater$Factory2C0445h.this.f1457r.m3370a((AbstractC0227w) null);
                LayoutInflater$Factory2C0445h.this.f1457r = null;
            }

            @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
            /* renamed from: b */
            public void mo1849b(View view) {
                LayoutInflater$Factory2C0445h.this.f1454o.setVisibility(0);
            }
        }

        RunnableC0451f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0445h hVar = LayoutInflater$Factory2C0445h.this;
            hVar.f1455p.showAtLocation(hVar.f1454o, 55, 0, 0);
            LayoutInflater$Factory2C0445h.this.m2565m();
            if (LayoutInflater$Factory2C0445h.this.m2558t()) {
                LayoutInflater$Factory2C0445h.this.f1454o.setAlpha(0.0f);
                LayoutInflater$Factory2C0445h hVar2 = LayoutInflater$Factory2C0445h.this;
                C0223v a = C0216r.m3445a(hVar2.f1454o);
                a.m3372a(1.0f);
                hVar2.f1457r = a;
                LayoutInflater$Factory2C0445h.this.f1457r.m3370a(new C0452a());
                return;
            }
            LayoutInflater$Factory2C0445h.this.f1454o.setAlpha(1.0f);
            LayoutInflater$Factory2C0445h.this.f1454o.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$g */
    /* loaded from: classes.dex */
    public class C0453g extends C0228x {
        C0453g() {
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(View view) {
            LayoutInflater$Factory2C0445h.this.f1454o.setAlpha(1.0f);
            LayoutInflater$Factory2C0445h.this.f1457r.m3370a((AbstractC0227w) null);
            LayoutInflater$Factory2C0445h.this.f1457r = null;
        }

        @Override // p000a.p018g.p029l.C0228x, p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(View view) {
            LayoutInflater$Factory2C0445h.this.f1454o.setVisibility(0);
            LayoutInflater$Factory2C0445h.this.f1454o.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2C0445h.this.f1454o.getParent() instanceof View) {
                C0216r.m3449B((View) LayoutInflater$Factory2C0445h.this.f1454o.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$h */
    /* loaded from: classes.dex */
    private class C0454h implements C0432b.AbstractC0434b {
        C0454h() {
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2549a(int i) {
            AbstractC0428a d = LayoutInflater$Factory2C0445h.this.mo2584d();
            if (d != null) {
                d.mo2494b(i);
            }
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public void mo2548a(Drawable drawable, int i) {
            AbstractC0428a d = LayoutInflater$Factory2C0445h.this.mo2584d();
            if (d != null) {
                d.mo2498a(drawable);
                d.mo2494b(i);
            }
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: a */
        public boolean mo2550a() {
            AbstractC0428a d = LayoutInflater$Factory2C0445h.this.mo2584d();
            return (d == null || (d.mo2486g() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: b */
        public Context mo2547b() {
            return LayoutInflater$Factory2C0445h.this.m2564n();
        }

        @Override // androidx.appcompat.app.C0432b.AbstractC0434b
        /* renamed from: c */
        public Drawable mo2546c() {
            C0638t0 a = C0638t0.m1901a(mo2547b(), (AttributeSet) null, new int[]{C0000a.homeAsUpIndicator});
            Drawable b = a.m1899b(0);
            a.m1908a();
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$i */
    /* loaded from: classes.dex */
    public final class C0455i implements AbstractC0513p.AbstractC0514a {
        C0455i() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(C0496h hVar, boolean z) {
            LayoutInflater$Factory2C0445h.this.m2590b(hVar);
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(C0496h hVar) {
            Window.Callback p = LayoutInflater$Factory2C0445h.this.m2562p();
            if (p == null) {
                return true;
            }
            p.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$j */
    /* loaded from: classes.dex */
    public class C0456j implements AbstractC0029b.AbstractC0030a {

        /* renamed from: a */
        private AbstractC0029b.AbstractC0030a f1476a;

        /* renamed from: androidx.appcompat.app.h$j$a */
        /* loaded from: classes.dex */
        class C0457a extends C0228x {
            C0457a() {
            }

            @Override // p000a.p018g.p029l.AbstractC0227w
            /* renamed from: a */
            public void mo1850a(View view) {
                LayoutInflater$Factory2C0445h.this.f1454o.setVisibility(8);
                LayoutInflater$Factory2C0445h hVar = LayoutInflater$Factory2C0445h.this;
                PopupWindow popupWindow = hVar.f1455p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f1454o.getParent() instanceof View) {
                    C0216r.m3449B((View) LayoutInflater$Factory2C0445h.this.f1454o.getParent());
                }
                LayoutInflater$Factory2C0445h.this.f1454o.removeAllViews();
                LayoutInflater$Factory2C0445h.this.f1457r.m3370a((AbstractC0227w) null);
                LayoutInflater$Factory2C0445h.this.f1457r = null;
            }
        }

        public C0456j(AbstractC0029b.AbstractC0030a aVar) {
            this.f1476a = aVar;
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public void mo2545a(AbstractC0029b bVar) {
            this.f1476a.mo2545a(bVar);
            LayoutInflater$Factory2C0445h hVar = LayoutInflater$Factory2C0445h.this;
            if (hVar.f1455p != null) {
                hVar.f1443d.getDecorView().removeCallbacks(LayoutInflater$Factory2C0445h.this.f1456q);
            }
            LayoutInflater$Factory2C0445h hVar2 = LayoutInflater$Factory2C0445h.this;
            if (hVar2.f1454o != null) {
                hVar2.m2565m();
                LayoutInflater$Factory2C0445h hVar3 = LayoutInflater$Factory2C0445h.this;
                C0223v a = C0216r.m3445a(hVar3.f1454o);
                a.m3372a(0.0f);
                hVar3.f1457r = a;
                LayoutInflater$Factory2C0445h.this.f1457r.m3370a(new C0457a());
            }
            LayoutInflater$Factory2C0445h hVar4 = LayoutInflater$Factory2C0445h.this;
            AbstractC0443f fVar = hVar4.f1446g;
            if (fVar != null) {
                fVar.mo2525b(hVar4.f1453n);
            }
            LayoutInflater$Factory2C0445h.this.f1453n = null;
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public boolean mo2544a(AbstractC0029b bVar, Menu menu) {
            return this.f1476a.mo2544a(bVar, menu);
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: a */
        public boolean mo2543a(AbstractC0029b bVar, MenuItem menuItem) {
            return this.f1476a.mo2543a(bVar, menuItem);
        }

        @Override // p000a.p001a.p006m.AbstractC0029b.AbstractC0030a
        /* renamed from: b */
        public boolean mo2542b(AbstractC0029b bVar, Menu menu) {
            return this.f1476a.mo2542b(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.h$k */
    /* loaded from: classes.dex */
    class C0458k extends Window$CallbackC0041i {
        C0458k(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        final ActionMode m2541a(ActionMode.Callback callback) {
            C0034f.C0035a aVar = new C0034f.C0035a(LayoutInflater$Factory2C0445h.this.f1442c, callback);
            AbstractC0029b a = LayoutInflater$Factory2C0445h.this.m2615a(aVar);
            if (a != null) {
                return aVar.m4170b(a);
            }
            return null;
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0445h.this.m2612a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C0445h.this.m2596b(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0496h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0445h.this.m2575g(i);
            return true;
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0445h.this.m2573h(i);
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0496h hVar = menu instanceof C0496h ? (C0496h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.m2393c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.m2393c(false);
            }
            return onPreparePanel;
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0496h hVar;
            C0462n a = LayoutInflater$Factory2C0445h.this.m2616a(0, true);
            if (a == null || (hVar = a.f1496j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, hVar, i);
            }
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflater$Factory2C0445h.this.m2561q() ? m2541a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p000a.p001a.p006m.Window$CallbackC0041i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!LayoutInflater$Factory2C0445h.this.m2561q() || i != 0) ? super.onWindowStartingActionMode(callback, i) : m2541a(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$l */
    /* loaded from: classes.dex */
    public final class C0459l {

        /* renamed from: a */
        private C0474m f1480a;

        /* renamed from: b */
        private boolean f1481b;

        /* renamed from: c */
        private BroadcastReceiver f1482c;

        /* renamed from: d */
        private IntentFilter f1483d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.h$l$a */
        /* loaded from: classes.dex */
        public class C0460a extends BroadcastReceiver {
            C0460a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C0459l.this.m2539b();
            }
        }

        C0459l(C0474m mVar) {
            this.f1480a = mVar;
            this.f1481b = mVar.m2509a();
        }

        /* renamed from: a */
        void m2540a() {
            BroadcastReceiver broadcastReceiver = this.f1482c;
            if (broadcastReceiver != null) {
                LayoutInflater$Factory2C0445h.this.f1442c.unregisterReceiver(broadcastReceiver);
                this.f1482c = null;
            }
        }

        /* renamed from: b */
        void m2539b() {
            boolean a = this.f1480a.m2509a();
            if (a != this.f1481b) {
                this.f1481b = a;
                LayoutInflater$Factory2C0445h.this.mo2620a();
            }
        }

        /* renamed from: c */
        int m2538c() {
            this.f1481b = this.f1480a.m2509a();
            return this.f1481b ? 2 : 1;
        }

        /* renamed from: d */
        void m2537d() {
            m2540a();
            if (this.f1482c == null) {
                this.f1482c = new C0460a();
            }
            if (this.f1483d == null) {
                this.f1483d = new IntentFilter();
                this.f1483d.addAction("android.intent.action.TIME_SET");
                this.f1483d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1483d.addAction("android.intent.action.TIME_TICK");
            }
            LayoutInflater$Factory2C0445h.this.f1442c.registerReceiver(this.f1482c, this.f1483d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$m */
    /* loaded from: classes.dex */
    public class C0461m extends ContentFrameLayout {
        public C0461m(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m2536a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0445h.this.m2612a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2536a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflater$Factory2C0445h.this.m2583d(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0010a.m4259c(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.h$n */
    /* loaded from: classes.dex */
    public static final class C0462n {

        /* renamed from: a */
        int f1487a;

        /* renamed from: b */
        int f1488b;

        /* renamed from: c */
        int f1489c;

        /* renamed from: d */
        int f1490d;

        /* renamed from: e */
        int f1491e;

        /* renamed from: f */
        int f1492f;

        /* renamed from: g */
        ViewGroup f1493g;

        /* renamed from: h */
        View f1494h;

        /* renamed from: i */
        View f1495i;

        /* renamed from: j */
        C0496h f1496j;

        /* renamed from: k */
        C0493f f1497k;

        /* renamed from: l */
        Context f1498l;

        /* renamed from: m */
        boolean f1499m;

        /* renamed from: n */
        boolean f1500n;

        /* renamed from: o */
        boolean f1501o;

        /* renamed from: p */
        public boolean f1502p;

        /* renamed from: q */
        boolean f1503q = false;

        /* renamed from: r */
        boolean f1504r;

        /* renamed from: s */
        Bundle f1505s;

        C0462n(int i) {
            this.f1487a = i;
        }

        /* renamed from: a */
        AbstractC0515q m2532a(AbstractC0513p.AbstractC0514a aVar) {
            if (this.f1496j == null) {
                return null;
            }
            if (this.f1497k == null) {
                this.f1497k = new C0493f(this.f1498l, C0006g.abc_list_menu_item_layout);
                this.f1497k.mo2308a(aVar);
                this.f1496j.m2408a(this.f1497k);
            }
            return this.f1497k.m2429a(this.f1493g);
        }

        /* renamed from: a */
        void m2534a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0000a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0000a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C0008i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0032d dVar = new C0032d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1498l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0009j.AppCompatTheme);
            this.f1488b = obtainStyledAttributes.getResourceId(C0009j.AppCompatTheme_panelBackground, 0);
            this.f1492f = obtainStyledAttributes.getResourceId(C0009j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m2533a(C0496h hVar) {
            C0493f fVar;
            C0496h hVar2 = this.f1496j;
            if (hVar != hVar2) {
                if (hVar2 != null) {
                    hVar2.m2398b(this.f1497k);
                }
                this.f1496j = hVar;
                if (hVar != null && (fVar = this.f1497k) != null) {
                    hVar.m2408a(fVar);
                }
            }
        }

        /* renamed from: a */
        public boolean m2535a() {
            if (this.f1494h == null) {
                return false;
            }
            return this.f1495i != null || this.f1497k.m2427d().getCount() > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$o */
    /* loaded from: classes.dex */
    public final class C0463o implements AbstractC0513p.AbstractC0514a {
        C0463o() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public void mo2108a(C0496h hVar, boolean z) {
            C0496h m = hVar.mo2297m();
            boolean z2 = m != hVar;
            LayoutInflater$Factory2C0445h hVar2 = LayoutInflater$Factory2C0445h.this;
            if (z2) {
                hVar = m;
            }
            C0462n a = hVar2.m2611a((Menu) hVar);
            if (a == null) {
                return;
            }
            if (z2) {
                LayoutInflater$Factory2C0445h.this.m2617a(a.f1487a, a, m);
                LayoutInflater$Factory2C0445h.this.m2602a(a, true);
                return;
            }
            LayoutInflater$Factory2C0445h.this.m2602a(a, z);
        }

        @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
        /* renamed from: a */
        public boolean mo2109a(C0496h hVar) {
            Window.Callback p;
            if (hVar != null) {
                return true;
            }
            LayoutInflater$Factory2C0445h hVar2 = LayoutInflater$Factory2C0445h.this;
            if (!hVar2.f1465z || (p = hVar2.m2562p()) == null || LayoutInflater$Factory2C0445h.this.f1431I) {
                return true;
            }
            p.onMenuOpened(108, hVar);
            return true;
        }
    }

    static {
        f1420T = Build.VERSION.SDK_INT < 21;
        f1421U = new int[]{16842836};
        if (f1420T && !f1422V) {
            Thread.setDefaultUncaughtExceptionHandler(new C0446a(Thread.getDefaultUncaughtExceptionHandler()));
            f1422V = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0445h(Context context, Window window, AbstractC0443f fVar) {
        this.f1442c = context;
        this.f1443d = window;
        this.f1446g = fVar;
        this.f1444e = this.f1443d.getCallback();
        Window.Callback callback = this.f1444e;
        if (!(callback instanceof C0458k)) {
            this.f1445f = new C0458k(callback);
            this.f1443d.setCallback(this.f1445f);
            C0638t0 a = C0638t0.m1901a(context, (AttributeSet) null, f1421U);
            Drawable c = a.m1897c(0);
            if (c != null) {
                this.f1443d.setBackgroundDrawable(c);
            }
            a.m1908a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: A */
    private boolean m2622A() {
        if (this.f1433K) {
            Context context = this.f1442c;
            if (context instanceof Activity) {
                try {
                    return (context.getPackageManager().getActivityInfo(new ComponentName(this.f1442c, this.f1442c.getClass()), 0).configChanges & 512) == 0;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    private void m2621B() {
        if (this.f1459t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    private void m2603a(C0462n nVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!nVar.f1501o && !this.f1431I) {
            if (nVar.f1487a == 0) {
                if ((this.f1442c.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback p = m2562p();
            if (p == null || p.onMenuOpened(nVar.f1487a, nVar.f1496j)) {
                WindowManager windowManager = (WindowManager) this.f1442c.getSystemService("window");
                if (windowManager != null && m2591b(nVar, keyEvent)) {
                    if (nVar.f1493g == null || nVar.f1503q) {
                        ViewGroup viewGroup = nVar.f1493g;
                        if (viewGroup == null) {
                            if (!m2592b(nVar) || nVar.f1493g == null) {
                                return;
                            }
                        } else if (nVar.f1503q && viewGroup.getChildCount() > 0) {
                            nVar.f1493g.removeAllViews();
                        }
                        if (m2605a(nVar) && nVar.m2535a()) {
                            ViewGroup.LayoutParams layoutParams2 = nVar.f1494h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            nVar.f1493g.setBackgroundResource(nVar.f1488b);
                            ViewParent parent = nVar.f1494h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(nVar.f1494h);
                            }
                            nVar.f1493g.addView(nVar.f1494h, layoutParams2);
                            if (!nVar.f1494h.hasFocus()) {
                                nVar.f1494h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = nVar.f1495i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            nVar.f1500n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, nVar.f1490d, nVar.f1491e, 1002, 8519680, -3);
                            layoutParams3.gravity = nVar.f1489c;
                            layoutParams3.windowAnimations = nVar.f1492f;
                            windowManager.addView(nVar.f1493g, layoutParams3);
                            nVar.f1501o = true;
                            return;
                        }
                    }
                    i = -2;
                    nVar.f1500n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, nVar.f1490d, nVar.f1491e, 1002, 8519680, -3);
                    layoutParams32.gravity = nVar.f1489c;
                    layoutParams32.windowAnimations = nVar.f1492f;
                    windowManager.addView(nVar.f1493g, layoutParams32);
                    nVar.f1501o = true;
                    return;
                }
                return;
            }
            m2602a(nVar, true);
        }
    }

    /* renamed from: a */
    private void m2601a(C0496h hVar, boolean z) {
        AbstractC0566a0 a0Var = this.f1450k;
        if (a0Var == null || !a0Var.mo2141e() || (ViewConfiguration.get(this.f1442c).hasPermanentMenuKey() && !this.f1450k.mo2144b())) {
            C0462n a = m2616a(0, true);
            a.f1503q = true;
            m2602a(a, false);
            m2603a(a, (KeyEvent) null);
            return;
        }
        Window.Callback p = m2562p();
        if (this.f1450k.mo2142d() && z) {
            this.f1450k.mo2140f();
            if (!this.f1431I) {
                p.onPanelClosed(108, m2616a(0, true).f1496j);
            }
        } else if (p != null && !this.f1431I) {
            if (this.f1435M && (this.f1436N & 1) != 0) {
                this.f1443d.getDecorView().removeCallbacks(this.f1437O);
                this.f1437O.run();
            }
            C0462n a2 = m2616a(0, true);
            C0496h hVar2 = a2.f1496j;
            if (hVar2 != null && !a2.f1504r && p.onPreparePanel(0, a2.f1495i, hVar2)) {
                p.onMenuOpened(108, a2.f1496j);
                this.f1450k.mo2147a();
            }
        }
    }

    /* renamed from: a */
    private boolean m2606a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1443d.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0216r.m3398w((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m2605a(C0462n nVar) {
        View view = nVar.f1495i;
        if (view != null) {
            nVar.f1494h = view;
            return true;
        } else if (nVar.f1496j == null) {
            return false;
        } else {
            if (this.f1452m == null) {
                this.f1452m = new C0463o();
            }
            nVar.f1494h = (View) nVar.m2532a(this.f1452m);
            return nVar.f1494h != null;
        }
    }

    /* renamed from: a */
    private boolean m2604a(C0462n nVar, int i, KeyEvent keyEvent, int i2) {
        C0496h hVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((nVar.f1499m || m2591b(nVar, keyEvent)) && (hVar = nVar.f1496j) != null) {
            z = hVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1450k == null) {
            m2602a(nVar, true);
        }
        return z;
    }

    /* renamed from: b */
    private boolean m2592b(C0462n nVar) {
        nVar.m2534a(m2564n());
        nVar.f1493g = new C0461m(nVar.f1498l);
        nVar.f1489c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m2591b(C0462n nVar, KeyEvent keyEvent) {
        AbstractC0566a0 a0Var;
        AbstractC0566a0 a0Var2;
        AbstractC0566a0 a0Var3;
        if (this.f1431I) {
            return false;
        }
        if (nVar.f1499m) {
            return true;
        }
        C0462n nVar2 = this.f1429G;
        if (!(nVar2 == null || nVar2 == nVar)) {
            m2602a(nVar2, false);
        }
        Window.Callback p = m2562p();
        if (p != null) {
            nVar.f1495i = p.onCreatePanelView(nVar.f1487a);
        }
        int i = nVar.f1487a;
        boolean z = i == 0 || i == 108;
        if (z && (a0Var3 = this.f1450k) != null) {
            a0Var3.mo2143c();
        }
        if (nVar.f1495i == null && (!z || !(m2559s() instanceof C0467k))) {
            if (nVar.f1496j == null || nVar.f1504r) {
                if (nVar.f1496j == null && (!m2585c(nVar) || nVar.f1496j == null)) {
                    return false;
                }
                if (z && this.f1450k != null) {
                    if (this.f1451l == null) {
                        this.f1451l = new C0455i();
                    }
                    this.f1450k.mo2145a(nVar.f1496j, this.f1451l);
                }
                nVar.f1496j.m2373s();
                if (!p.onCreatePanelMenu(nVar.f1487a, nVar.f1496j)) {
                    nVar.m2533a((C0496h) null);
                    if (z && (a0Var2 = this.f1450k) != null) {
                        a0Var2.mo2145a(null, this.f1451l);
                    }
                    return false;
                }
                nVar.f1504r = false;
            }
            nVar.f1496j.m2373s();
            Bundle bundle = nVar.f1505s;
            if (bundle != null) {
                nVar.f1496j.m2413a(bundle);
                nVar.f1505s = null;
            }
            if (!p.onPreparePanel(0, nVar.f1495i, nVar.f1496j)) {
                if (z && (a0Var = this.f1450k) != null) {
                    a0Var.mo2145a(null, this.f1451l);
                }
                nVar.f1496j.m2374r();
                return false;
            }
            nVar.f1502p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            nVar.f1496j.setQwertyMode(nVar.f1502p);
            nVar.f1496j.m2374r();
        }
        nVar.f1499m = true;
        nVar.f1500n = false;
        this.f1429G = nVar;
        return true;
    }

    /* renamed from: c */
    private boolean m2585c(C0462n nVar) {
        Context context = this.f1442c;
        int i = nVar.f1487a;
        if ((i == 0 || i == 108) && this.f1450k != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0000a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0032d dVar = new C0032d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0496h hVar = new C0496h(context);
        hVar.mo2302a(this);
        nVar.m2533a(hVar);
        return true;
    }

    /* renamed from: d */
    private boolean m2582d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0462n a = m2616a(i, true);
        if (!a.f1501o) {
            return m2591b(a, keyEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2579e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            a.a.m.b r0 = r3.f1453n
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.h$n r2 = r3.m2616a(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.a0 r4 = r3.f1450k
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo2141e()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f1442c
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.a0 r4 = r3.f1450k
            boolean r4 = r4.mo2142d()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f1431I
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m2591b(r2, r5)
            if (r4 == 0) goto L_0x0063
            androidx.appcompat.widget.a0 r4 = r3.f1450k
            boolean r4 = r4.mo2147a()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.a0 r4 = r3.f1450k
            boolean r4 = r4.mo2140f()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f1501o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.f1500n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.f1499m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.f1504r
            if (r4 == 0) goto L_0x005b
            r2.f1499m = r1
            boolean r4 = r3.m2591b(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m2603a(r2, r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.f1501o
            r3.m2602a(r2, r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.f1442c
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0445h.m2579e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: j */
    private void m2569j(int i) {
        this.f1436N = (1 << i) | this.f1436N;
        if (!this.f1435M) {
            C0216r.m3432a(this.f1443d.getDecorView(), this.f1437O);
            this.f1435M = true;
        }
    }

    /* renamed from: k */
    private int m2568k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: l */
    private boolean m2566l(int i) {
        Resources resources = this.f1442c.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m2622A()) {
            ((Activity) this.f1442c).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C0466j.m2524a(resources);
        return true;
    }

    /* renamed from: u */
    private void m2557u() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1460u.findViewById(16908290);
        View decorView = this.f1443d.getDecorView();
        contentFrameLayout.m2247a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1442c.obtainStyledAttributes(C0009j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: v */
    private ViewGroup m2556v() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f1442c.obtainStyledAttributes(C0009j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowNoTitle, false)) {
                mo2597b(1);
            } else if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionBar, false)) {
                mo2597b(108);
            }
            if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo2597b(109);
            }
            if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo2597b(10);
            }
            this.f1425C = obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f1443d.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1442c);
            if (this.f1426D) {
                viewGroup = (ViewGroup) from.inflate(this.f1424B ? C0006g.abc_screen_simple_overlay_action_mode : C0006g.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    C0216r.m3439a(viewGroup, new C0448c());
                } else {
                    ((AbstractC0586e0) viewGroup).setOnFitSystemWindowsListener(new C0449d());
                }
            } else if (this.f1425C) {
                viewGroup = (ViewGroup) from.inflate(C0006g.abc_dialog_title_material, (ViewGroup) null);
                this.f1423A = false;
                this.f1465z = false;
            } else if (this.f1465z) {
                TypedValue typedValue = new TypedValue();
                this.f1442c.getTheme().resolveAttribute(C0000a.actionBarTheme, typedValue, true);
                int i = typedValue.resourceId;
                viewGroup = (ViewGroup) LayoutInflater.from(i != 0 ? new C0032d(this.f1442c, i) : this.f1442c).inflate(C0006g.abc_screen_toolbar, (ViewGroup) null);
                this.f1450k = (AbstractC0566a0) viewGroup.findViewById(C0005f.decor_content_parent);
                this.f1450k.setWindowCallback(m2562p());
                if (this.f1423A) {
                    this.f1450k.mo2146a(109);
                }
                if (this.f1463x) {
                    this.f1450k.mo2146a(2);
                }
                if (this.f1464y) {
                    this.f1450k.mo2146a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f1450k == null) {
                    this.f1461v = (TextView) viewGroup.findViewById(C0005f.title);
                }
                C0661z0.m1762b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0005f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f1443d.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f1443d.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0450e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1465z + ", windowActionBarOverlay: " + this.f1423A + ", android:windowIsFloating: " + this.f1425C + ", windowActionModeOverlay: " + this.f1424B + ", windowNoTitle: " + this.f1426D + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: w */
    private void m2555w() {
        if (this.f1434L == null) {
            this.f1434L = new C0459l(C0474m.m2508a(this.f1442c));
        }
    }

    /* renamed from: x */
    private void m2554x() {
        if (!this.f1459t) {
            this.f1460u = m2556v();
            CharSequence o = m2563o();
            if (!TextUtils.isEmpty(o)) {
                AbstractC0566a0 a0Var = this.f1450k;
                if (a0Var != null) {
                    a0Var.setWindowTitle(o);
                } else if (m2559s() != null) {
                    m2559s().mo2496a(o);
                } else {
                    TextView textView = this.f1461v;
                    if (textView != null) {
                        textView.setText(o);
                    }
                }
            }
            m2557u();
            m2607a(this.f1460u);
            this.f1459t = true;
            C0462n a = m2616a(0, false);
            if (this.f1431I) {
                return;
            }
            if (a == null || a.f1496j == null) {
                m2569j(108);
            }
        }
    }

    /* renamed from: y */
    private int m2553y() {
        int i = this.f1432J;
        return i != -100 ? i : AbstractC0444g.m2623k();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2552z() {
        /*
            r3 = this;
            r3.m2554x()
            boolean r0 = r3.f1465z
            if (r0 == 0) goto L_0x0033
            androidx.appcompat.app.a r0 = r3.f1447h
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            android.view.Window$Callback r0 = r3.f1444e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            androidx.appcompat.app.n r1 = new androidx.appcompat.app.n
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f1423A
            r1.<init>(r0, r2)
        L_0x001b:
            r3.f1447h = r1
            goto L_0x002a
        L_0x001e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x002a
            androidx.appcompat.app.n r1 = new androidx.appcompat.app.n
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L_0x001b
        L_0x002a:
            androidx.appcompat.app.a r0 = r3.f1447h
            if (r0 == 0) goto L_0x0033
            boolean r1 = r3.f1438P
            r0.mo2491c(r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0445h.m2552z():void");
    }

    /* renamed from: a */
    public AbstractC0029b m2615a(AbstractC0029b.AbstractC0030a aVar) {
        AbstractC0443f fVar;
        if (aVar != null) {
            AbstractC0029b bVar = this.f1453n;
            if (bVar != null) {
                bVar.mo2472a();
            }
            C0456j jVar = new C0456j(aVar);
            AbstractC0428a d = mo2584d();
            if (d != null) {
                this.f1453n = d.mo2500a(jVar);
                AbstractC0029b bVar2 = this.f1453n;
                if (!(bVar2 == null || (fVar = this.f1446g) == null)) {
                    fVar.mo2528a(bVar2);
                }
            }
            if (this.f1453n == null) {
                this.f1453n = m2595b(jVar);
            }
            return this.f1453n;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public <T extends View> T mo2619a(int i) {
        m2554x();
        return (T) this.f1443d.findViewById(i);
    }

    /* renamed from: a */
    public View m2608a(View view, String str, Context context, AttributeSet attributeSet) {
        AppCompatViewInflater appCompatViewInflater;
        boolean z = false;
        if (this.f1441S == null) {
            String string = this.f1442c.obtainStyledAttributes(C0009j.AppCompatTheme).getString(C0009j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f1441S = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f1441S = appCompatViewInflater;
        }
        if (!f1420T) {
            z = false;
        } else if (!(attributeSet instanceof XmlPullParser)) {
            z = m2606a((ViewParent) view);
        } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
            z = true;
        }
        return this.f1441S.createView(view, str, context, attributeSet, z, f1420T, true, C0659y0.m1791b());
    }

    /* renamed from: a */
    protected C0462n m2616a(int i, boolean z) {
        C0462n[] nVarArr = this.f1428F;
        if (nVarArr == null || nVarArr.length <= i) {
            C0462n[] nVarArr2 = new C0462n[i + 1];
            if (nVarArr != null) {
                System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
            }
            this.f1428F = nVarArr2;
            nVarArr = nVarArr2;
        }
        C0462n nVar = nVarArr[i];
        if (nVar != null) {
            return nVar;
        }
        C0462n nVar2 = new C0462n(i);
        nVarArr[i] = nVar2;
        return nVar2;
    }

    /* renamed from: a */
    C0462n m2611a(Menu menu) {
        C0462n[] nVarArr = this.f1428F;
        int length = nVarArr != null ? nVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0462n nVar = nVarArr[i];
            if (nVar != null && nVar.f1496j == menu) {
                return nVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m2617a(int i, C0462n nVar, Menu menu) {
        if (menu == null) {
            if (nVar == null && i >= 0) {
                C0462n[] nVarArr = this.f1428F;
                if (i < nVarArr.length) {
                    nVar = nVarArr[i];
                }
            }
            if (nVar != null) {
                menu = nVar.f1496j;
            }
        }
        if ((nVar == null || nVar.f1501o) && !this.f1431I) {
            this.f1444e.onPanelClosed(i, menu);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2614a(Configuration configuration) {
        AbstractC0428a d;
        if (this.f1465z && this.f1459t && (d = mo2584d()) != null) {
            d.mo2499a(configuration);
        }
        C0606j.m2013a().m2010a(this.f1442c);
        mo2620a();
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2613a(Bundle bundle) {
        Window.Callback callback = this.f1444e;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = C0694d.m1627b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0428a s = m2559s();
                if (s == null) {
                    this.f1438P = true;
                } else {
                    s.mo2491c(true);
                }
            }
        }
        if (bundle != null && this.f1432J == -100) {
            this.f1432J = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2610a(View view) {
        m2554x();
        ViewGroup viewGroup = (ViewGroup) this.f1460u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1444e.onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2609a(View view, ViewGroup.LayoutParams layoutParams) {
        m2554x();
        ((ViewGroup) this.f1460u.findViewById(16908290)).addView(view, layoutParams);
        this.f1444e.onContentChanged();
    }

    /* renamed from: a */
    void m2607a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    void m2602a(C0462n nVar, boolean z) {
        ViewGroup viewGroup;
        AbstractC0566a0 a0Var;
        if (!z || nVar.f1487a != 0 || (a0Var = this.f1450k) == null || !a0Var.mo2142d()) {
            WindowManager windowManager = (WindowManager) this.f1442c.getSystemService("window");
            if (!(windowManager == null || !nVar.f1501o || (viewGroup = nVar.f1493g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    m2617a(nVar.f1487a, nVar, null);
                }
            }
            nVar.f1499m = false;
            nVar.f1500n = false;
            nVar.f1501o = false;
            nVar.f1494h = null;
            nVar.f1503q = true;
            if (this.f1429G == nVar) {
                this.f1429G = null;
                return;
            }
            return;
        }
        m2590b(nVar.f1496j);
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
    /* renamed from: a */
    public void mo65a(C0496h hVar) {
        m2601a(hVar, true);
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public void mo2600a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f1444e instanceof Activity) {
            AbstractC0428a d = mo2584d();
            if (!(d instanceof C0476n)) {
                this.f1448i = null;
                if (d != null) {
                    d.mo2516j();
                }
                if (toolbar != null) {
                    C0467k kVar = new C0467k(toolbar, ((Activity) this.f1444e).getTitle(), this.f1445f);
                    this.f1447h = kVar;
                    window = this.f1443d;
                    callback = kVar.m2514l();
                } else {
                    this.f1447h = null;
                    window = this.f1443d;
                    callback = this.f1445f;
                }
                window.setCallback(callback);
                mo2578f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public final void mo2599a(CharSequence charSequence) {
        this.f1449j = charSequence;
        AbstractC0566a0 a0Var = this.f1450k;
        if (a0Var != null) {
            a0Var.setWindowTitle(charSequence);
        } else if (m2559s() != null) {
            m2559s().mo2496a(charSequence);
        } else {
            TextView textView = this.f1461v;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: a */
    public boolean mo2620a() {
        int y = m2553y();
        int f = m2577f(y);
        boolean l = f != -1 ? m2566l(f) : false;
        if (y == 0) {
            m2555w();
            this.f1434L.m2537d();
        }
        this.f1433K = true;
        return l;
    }

    /* renamed from: a */
    boolean m2618a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f1430H = z;
        } else if (i == 82) {
            m2582d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    boolean m2612a(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.f1444e;
        boolean z = true;
        if (((callback instanceof C0201d.AbstractC0202a) || (callback instanceof DialogC0464i)) && (decorView = this.f1443d.getDecorView()) != null && C0201d.m3483a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1444e.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? m2618a(keyCode, keyEvent) : m2587c(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
    /* renamed from: a */
    public boolean mo64a(C0496h hVar, MenuItem menuItem) {
        C0462n a;
        Window.Callback p = m2562p();
        if (p == null || this.f1431I || (a = m2611a((Menu) hVar.mo2297m())) == null) {
            return false;
        }
        return p.onMenuItemSelected(a.f1487a, menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p000a.p001a.p006m.AbstractC0029b m2595b(p000a.p001a.p006m.AbstractC0029b.AbstractC0030a r8) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0445h.m2595b(a.a.m.b$a):a.a.m.b");
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: b */
    public final C0432b.AbstractC0434b mo2598b() {
        return new C0454h();
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: b */
    public void mo2594b(Bundle bundle) {
        m2554x();
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: b */
    public void mo2593b(View view, ViewGroup.LayoutParams layoutParams) {
        m2554x();
        ViewGroup viewGroup = (ViewGroup) this.f1460u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1444e.onContentChanged();
    }

    /* renamed from: b */
    void m2590b(C0496h hVar) {
        if (!this.f1427E) {
            this.f1427E = true;
            this.f1450k.mo2139g();
            Window.Callback p = m2562p();
            if (p != null && !this.f1431I) {
                p.onPanelClosed(108, hVar);
            }
            this.f1427E = false;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: b */
    public boolean mo2597b(int i) {
        int k = m2568k(i);
        if (this.f1426D && k == 108) {
            return false;
        }
        if (this.f1465z && k == 1) {
            this.f1465z = false;
        }
        if (k == 1) {
            m2621B();
            this.f1426D = true;
            return true;
        } else if (k == 2) {
            m2621B();
            this.f1463x = true;
            return true;
        } else if (k == 5) {
            m2621B();
            this.f1464y = true;
            return true;
        } else if (k == 10) {
            m2621B();
            this.f1424B = true;
            return true;
        } else if (k == 108) {
            m2621B();
            this.f1465z = true;
            return true;
        } else if (k != 109) {
            return this.f1443d.requestFeature(k);
        } else {
            m2621B();
            this.f1423A = true;
            return true;
        }
    }

    /* renamed from: b */
    boolean m2596b(int i, KeyEvent keyEvent) {
        AbstractC0428a d = mo2584d();
        if (d != null && d.mo2501a(i, keyEvent)) {
            return true;
        }
        C0462n nVar = this.f1429G;
        if (nVar == null || !m2604a(nVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f1429G == null) {
                C0462n a = m2616a(0, true);
                m2591b(a, keyEvent);
                boolean a2 = m2604a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f1499m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0462n nVar2 = this.f1429G;
        if (nVar2 != null) {
            nVar2.f1500n = true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: c */
    public MenuInflater mo2589c() {
        if (this.f1448i == null) {
            m2552z();
            AbstractC0428a aVar = this.f1447h;
            this.f1448i = new C0036g(aVar != null ? aVar.mo2484h() : this.f1442c);
        }
        return this.f1448i;
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: c */
    public void mo2588c(int i) {
        m2554x();
        ViewGroup viewGroup = (ViewGroup) this.f1460u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1442c).inflate(i, viewGroup);
        this.f1444e.onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: c */
    public void mo2586c(Bundle bundle) {
        int i = this.f1432J;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* renamed from: c */
    boolean m2587c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f1430H;
            this.f1430H = false;
            C0462n a = m2616a(0, false);
            if (a != null && a.f1501o) {
                if (!z) {
                    m2602a(a, true);
                }
                return true;
            } else if (m2560r()) {
                return true;
            }
        } else if (i == 82) {
            m2579e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: d */
    public AbstractC0428a mo2584d() {
        m2552z();
        return this.f1447h;
    }

    /* renamed from: d */
    void m2583d(int i) {
        m2602a(m2616a(i, true), true);
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: e */
    public void mo2581e() {
        LayoutInflater from = LayoutInflater.from(this.f1442c);
        if (from.getFactory() == null) {
            C0203e.m3481b(from, this);
        } else if (!(from.getFactory2() instanceof LayoutInflater$Factory2C0445h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: e */
    void m2580e(int i) {
        C0462n a;
        C0462n a2 = m2616a(i, true);
        if (a2.f1496j != null) {
            Bundle bundle = new Bundle();
            a2.f1496j.m2395c(bundle);
            if (bundle.size() > 0) {
                a2.f1505s = bundle;
            }
            a2.f1496j.m2373s();
            a2.f1496j.clear();
        }
        a2.f1504r = true;
        a2.f1503q = true;
        if ((i == 108 || i == 0) && this.f1450k != null && (a = m2616a(0, false)) != null) {
            a.f1499m = false;
            m2591b(a, (KeyEvent) null);
        }
    }

    /* renamed from: f */
    int m2577f(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f1442c.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m2555w();
        return this.f1434L.m2538c();
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: f */
    public void mo2578f() {
        AbstractC0428a d = mo2584d();
        if (d == null || !d.mo2517i()) {
            m2569j(0);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: g */
    public void mo2576g() {
        if (this.f1435M) {
            this.f1443d.getDecorView().removeCallbacks(this.f1437O);
        }
        this.f1431I = true;
        AbstractC0428a aVar = this.f1447h;
        if (aVar != null) {
            aVar.mo2516j();
        }
        C0459l lVar = this.f1434L;
        if (lVar != null) {
            lVar.m2540a();
        }
    }

    /* renamed from: g */
    void m2575g(int i) {
        AbstractC0428a d;
        if (i == 108 && (d = mo2584d()) != null) {
            d.mo2492b(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: h */
    public void mo2574h() {
        AbstractC0428a d = mo2584d();
        if (d != null) {
            d.mo2490d(true);
        }
    }

    /* renamed from: h */
    void m2573h(int i) {
        if (i == 108) {
            AbstractC0428a d = mo2584d();
            if (d != null) {
                d.mo2492b(false);
            }
        } else if (i == 0) {
            C0462n a = m2616a(i, true);
            if (a.f1501o) {
                m2602a(a, false);
            }
        }
    }

    /* renamed from: i */
    int m2571i(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f1454o;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1454o.getLayoutParams();
            z = true;
            if (this.f1454o.isShown()) {
                if (this.f1439Q == null) {
                    this.f1439Q = new Rect();
                    this.f1440R = new Rect();
                }
                Rect rect = this.f1439Q;
                Rect rect2 = this.f1440R;
                rect.set(0, i, 0, 0);
                C0661z0.m1763a(this.f1460u, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f1462w;
                    if (view == null) {
                        this.f1462w = new View(this.f1442c);
                        this.f1462w.setBackgroundColor(this.f1442c.getResources().getColor(C0002c.abc_input_method_navigation_guard));
                        this.f1460u.addView(this.f1462w, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1462w.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f1462w == null) {
                    z = false;
                }
                if (!this.f1424B && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                this.f1454o.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f1462w;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: i */
    public void mo2572i() {
        mo2620a();
    }

    @Override // androidx.appcompat.app.AbstractC0444g
    /* renamed from: j */
    public void mo2570j() {
        AbstractC0428a d = mo2584d();
        if (d != null) {
            d.mo2490d(false);
        }
        C0459l lVar = this.f1434L;
        if (lVar != null) {
            lVar.m2540a();
        }
    }

    /* renamed from: l */
    void m2567l() {
        C0496h hVar;
        AbstractC0566a0 a0Var = this.f1450k;
        if (a0Var != null) {
            a0Var.mo2139g();
        }
        if (this.f1455p != null) {
            this.f1443d.getDecorView().removeCallbacks(this.f1456q);
            if (this.f1455p.isShowing()) {
                try {
                    this.f1455p.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1455p = null;
        }
        m2565m();
        C0462n a = m2616a(0, false);
        if (a != null && (hVar = a.f1496j) != null) {
            hVar.close();
        }
    }

    /* renamed from: m */
    void m2565m() {
        C0223v vVar = this.f1457r;
        if (vVar != null) {
            vVar.m3373a();
        }
    }

    /* renamed from: n */
    final Context m2564n() {
        AbstractC0428a d = mo2584d();
        Context h = d != null ? d.mo2484h() : null;
        return h == null ? this.f1442c : h;
    }

    /* renamed from: o */
    final CharSequence m2563o() {
        Window.Callback callback = this.f1444e;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f1449j;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m2608a(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    final Window.Callback m2562p() {
        return this.f1443d.getCallback();
    }

    /* renamed from: q */
    public boolean m2561q() {
        return this.f1458s;
    }

    /* renamed from: r */
    boolean m2560r() {
        AbstractC0029b bVar = this.f1453n;
        if (bVar != null) {
            bVar.mo2472a();
            return true;
        }
        AbstractC0428a d = mo2584d();
        return d != null && d.mo2488f();
    }

    /* renamed from: s */
    final AbstractC0428a m2559s() {
        return this.f1447h;
    }

    /* renamed from: t */
    final boolean m2558t() {
        ViewGroup viewGroup;
        return this.f1459t && (viewGroup = this.f1460u) != null && C0216r.m3397x(viewGroup);
    }
}
