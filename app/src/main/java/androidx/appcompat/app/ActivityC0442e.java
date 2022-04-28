package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.appcompat.widget.C0659y0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0688a;
import androidx.core.app.C0694d;
import androidx.core.app.C0696f;
import p000a.p001a.p006m.AbstractC0029b;
import p000a.p036j.p037a.ActivityC0255d;

/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public class ActivityC0442e extends ActivityC0255d implements AbstractC0443f, C0696f.AbstractC0697a, C0432b.AbstractC0435c {

    /* renamed from: m */
    private AbstractC0444g f1416m;

    /* renamed from: n */
    private int f1417n = 0;

    /* renamed from: o */
    private Resources f1418o;

    /* renamed from: a */
    private boolean m2637a(int i, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: a */
    public AbstractC0029b mo2529a(AbstractC0029b.AbstractC0030a aVar) {
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: a */
    public void mo2528a(AbstractC0029b bVar) {
    }

    /* renamed from: a */
    public void m2636a(Intent intent) {
        C0694d.m1629a(this, intent);
    }

    /* renamed from: a */
    public void m2635a(Toolbar toolbar) {
        m2629i().mo2600a(toolbar);
    }

    /* renamed from: a */
    public void m2634a(C0696f fVar) {
        fVar.m1620a((Activity) this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2629i().mo2609a(view, layoutParams);
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: b */
    public void mo2525b(AbstractC0029b bVar) {
    }

    /* renamed from: b */
    public void m2632b(C0696f fVar) {
    }

    /* renamed from: b */
    public boolean m2633b(Intent intent) {
        return C0694d.m1626b(this, intent);
    }

    @Override // androidx.appcompat.app.C0432b.AbstractC0435c
    /* renamed from: c */
    public C0432b.AbstractC0434b mo2631c() {
        return m2629i().mo2598b();
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0428a j = m2628j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (j == null || !j.mo2518e()) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.C0696f.AbstractC0697a
    /* renamed from: d */
    public Intent mo1615d() {
        return C0694d.m1630a(this);
    }

    @Override // androidx.core.app.ActivityC0693c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0428a j = m2628j();
        if (keyCode != 82 || j == null || !j.mo2519a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m2629i().mo2619a(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m2629i().mo2589c();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1418o == null && C0659y0.m1791b()) {
            this.f1418o = new C0659y0(this, super.getResources());
        }
        Resources resources = this.f1418o;
        return resources == null ? super.getResources() : resources;
    }

    @Override // p000a.p036j.p037a.ActivityC0255d
    /* renamed from: h */
    public void mo2630h() {
        m2629i().mo2578f();
    }

    /* renamed from: i */
    public AbstractC0444g m2629i() {
        if (this.f1416m == null) {
            this.f1416m = AbstractC0444g.m2625a(this, this);
        }
        return this.f1416m;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m2629i().mo2578f();
    }

    /* renamed from: j */
    public AbstractC0428a m2628j() {
        return m2629i().mo2584d();
    }

    @Deprecated
    /* renamed from: k */
    public void m2627k() {
    }

    /* renamed from: l */
    public boolean m2626l() {
        Intent d = mo1615d();
        if (d == null) {
            return false;
        }
        if (m2633b(d)) {
            C0696f a = C0696f.m1618a((Context) this);
            m2634a(a);
            m2632b(a);
            a.m1621a();
            try {
                C0688a.m1636a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            m2636a(d);
            return true;
        }
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2629i().mo2614a(configuration);
        if (this.f1418o != null) {
            this.f1418o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m2627k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p036j.p037a.ActivityC0255d, androidx.core.app.ActivityC0693c, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        AbstractC0444g i2 = m2629i();
        i2.mo2581e();
        i2.mo2613a(bundle);
        if (i2.mo2620a() && (i = this.f1417n) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1417n, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m2629i().mo2576g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m2637a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0428a j = m2628j();
        if (menuItem.getItemId() != 16908332 || j == null || (j.mo2486g() & 4) == 0) {
            return false;
        }
        return m2626l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m2629i().mo2594b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m2629i().mo2574h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p036j.p037a.ActivityC0255d, androidx.core.app.ActivityC0693c, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m2629i().mo2586c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    public void onStart() {
        super.onStart();
        m2629i().mo2572i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    public void onStop() {
        super.onStop();
        m2629i().mo2570j();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m2629i().mo2599a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0428a j = m2628j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (j == null || !j.mo2515k()) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m2629i().mo2588c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m2629i().mo2610a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2629i().mo2593b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.f1417n = i;
    }
}
