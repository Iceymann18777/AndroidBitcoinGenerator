package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0742e;
import androidx.lifecycle.AbstractC0746g;
import androidx.lifecycle.C0747h;
import androidx.lifecycle.FragmentC0756o;
import p000a.p013d.C0080g;
import p000a.p018g.p029l.C0201d;

/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
public class ActivityC0693c extends Activity implements AbstractC0746g, C0201d.AbstractC0202a {

    /* renamed from: b */
    private C0747h f2620b = new C0747h(this);

    public ActivityC0693c() {
        new C0080g();
    }

    /* renamed from: a */
    public AbstractC0742e mo1368a() {
        return this.f2620b;
    }

    @Override // p000a.p018g.p029l.C0201d.AbstractC0202a
    /* renamed from: a */
    public boolean mo1631a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0201d.m3483a(decorView, keyEvent)) {
            return C0201d.m3488a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0201d.m3483a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0756o.m1358a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f2620b.m1384a(AbstractC0742e.EnumC0744b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
