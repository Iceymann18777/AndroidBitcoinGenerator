package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p001a.C0000a;
import p000a.p001a.p006m.AbstractC0029b;
import p000a.p018g.p029l.C0201d;

/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes.dex */
public class DialogC0464i extends Dialog implements AbstractC0443f {

    /* renamed from: b */
    private AbstractC0444g f1507b;

    /* renamed from: c */
    private final C0201d.AbstractC0202a f1508c = new C0465a();

    /* renamed from: androidx.appcompat.app.i$a */
    /* loaded from: classes.dex */
    class C0465a implements C0201d.AbstractC0202a {
        C0465a() {
        }

        @Override // p000a.p018g.p029l.C0201d.AbstractC0202a
        /* renamed from: a */
        public boolean mo1631a(KeyEvent keyEvent) {
            return DialogC0464i.this.m2526a(keyEvent);
        }
    }

    public DialogC0464i(Context context, int i) {
        super(context, m2527a(context, i));
        m2531a().mo2613a((Bundle) null);
        m2531a().mo2620a();
    }

    /* renamed from: a */
    private static int m2527a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0000a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: a */
    public AbstractC0029b mo2529a(AbstractC0029b.AbstractC0030a aVar) {
        return null;
    }

    /* renamed from: a */
    public AbstractC0444g m2531a() {
        if (this.f1507b == null) {
            this.f1507b = AbstractC0444g.m2624a(this, this);
        }
        return this.f1507b;
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: a */
    public void mo2528a(AbstractC0029b bVar) {
    }

    /* renamed from: a */
    public boolean m2530a(int i) {
        return m2531a().mo2597b(i);
    }

    /* renamed from: a */
    boolean m2526a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2531a().mo2609a(view, layoutParams);
    }

    @Override // androidx.appcompat.app.AbstractC0443f
    /* renamed from: b */
    public void mo2525b(AbstractC0029b bVar) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0201d.m3488a(this.f1508c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m2531a().mo2619a(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m2531a().mo2578f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m2531a().mo2581e();
        super.onCreate(bundle);
        m2531a().mo2613a(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m2531a().mo2570j();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m2531a().mo2588c(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m2531a().mo2610a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2531a().mo2593b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m2531a().mo2599a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2531a().mo2599a(charSequence);
    }
}
