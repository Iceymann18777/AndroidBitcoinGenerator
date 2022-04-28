package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0440d;

import p000a.p001a.C0006g;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
class DialogInterface$OnKeyListenerC0499i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, AbstractC0513p.AbstractC0514a {

    /* renamed from: b */
    private C0496h f1729b;

    /* renamed from: c */
    private DialogInterfaceC0440d f1730c;

    /* renamed from: d */
    C0493f f1731d;

    /* renamed from: e */
    private AbstractC0513p.AbstractC0514a f1732e;

    public DialogInterface$OnKeyListenerC0499i(C0496h hVar) {
        this.f1729b = hVar;
    }

    /* renamed from: a */
    public void m2372a() {
        DialogInterfaceC0440d dVar = this.f1730c;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* renamed from: a */
    public void m2371a(IBinder iBinder) {
        C0496h hVar = this.f1729b;
        DialogInterfaceC0440d.C0441a aVar = new DialogInterfaceC0440d.C0441a(hVar.m2388e());
        this.f1731d = new C0493f(aVar.m2638b(), C0006g.abc_list_menu_item_layout);
        this.f1731d.mo2308a(this);
        this.f1729b.m2408a(this.f1731d);
        aVar.m2640a(this.f1731d.m2427d(), this);
        View i = hVar.m2379i();
        if (i != null) {
            aVar.m2641a(i);
        } else {
            aVar.m2642a(hVar.m2381g());
            aVar.m2639a(hVar.m2380h());
        }
        aVar.m2643a(this);
        this.f1730c = aVar.m2644a();
        this.f1730c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1730c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1730c.show();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
    /* renamed from: a */
    public void mo2108a(C0496h hVar, boolean z) {
        if (z || hVar == this.f1729b) {
            m2372a();
        }
        AbstractC0513p.AbstractC0514a aVar = this.f1732e;
        if (aVar != null) {
            aVar.mo2108a(hVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p.AbstractC0514a
    /* renamed from: a */
    public boolean mo2109a(C0496h hVar) {
        AbstractC0513p.AbstractC0514a aVar = this.f1732e;
        if (aVar != null) {
            return aVar.mo2109a(hVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1729b.m2411a((C0501k) this.f1731d.m2427d().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1731d.mo126a(this.f1729b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1730c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1730c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1729b.m2402a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1729b.performShortcut(i, keyEvent, 0);
    }
}
