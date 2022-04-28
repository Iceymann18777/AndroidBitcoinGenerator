package p000a.p001a.p006m;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: a.a.m.e */
/* loaded from: classes.dex */
public class C0033e extends AbstractC0029b implements C0496h.AbstractC0497a {

    /* renamed from: d */
    private Context f94d;

    /* renamed from: e */
    private ActionBarContextView f95e;

    /* renamed from: f */
    private AbstractC0029b.AbstractC0030a f96f;

    /* renamed from: g */
    private WeakReference<View> f97g;

    /* renamed from: h */
    private boolean f98h;

    /* renamed from: i */
    private C0496h f99i;

    public C0033e(Context context, ActionBarContextView actionBarContextView, AbstractC0029b.AbstractC0030a aVar, boolean z) {
        this.f94d = context;
        this.f95e = actionBarContextView;
        this.f96f = aVar;
        C0496h hVar = new C0496h(actionBarContextView.getContext());
        hVar.m2396c(1);
        this.f99i = hVar;
        this.f99i.mo2302a(this);
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2472a() {
        if (!this.f98h) {
            this.f98h = true;
            this.f95e.sendAccessibilityEvent(32);
            this.f96f.mo2545a(this);
        }
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2471a(int i) {
        mo2469a((CharSequence) this.f94d.getString(i));
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2470a(View view) {
        this.f95e.setCustomView(view);
        this.f97g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
    /* renamed from: a */
    public void mo65a(C0496h hVar) {
        mo2460i();
        this.f95e.m2285d();
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2469a(CharSequence charSequence) {
        this.f95e.setSubtitle(charSequence);
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: a */
    public void mo2468a(boolean z) {
        super.mo2468a(z);
        this.f95e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
    /* renamed from: a */
    public boolean mo64a(C0496h hVar, MenuItem menuItem) {
        return this.f96f.mo2543a(this, menuItem);
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: b */
    public View mo2467b() {
        WeakReference<View> weakReference = this.f97g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: b */
    public void mo2466b(int i) {
        mo2465b(this.f94d.getString(i));
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: b */
    public void mo2465b(CharSequence charSequence) {
        this.f95e.setTitle(charSequence);
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: c */
    public Menu mo2464c() {
        return this.f99i;
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: d */
    public MenuInflater mo2463d() {
        return new C0036g(this.f95e.getContext());
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: e */
    public CharSequence mo2462e() {
        return this.f95e.getSubtitle();
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: g */
    public CharSequence mo2461g() {
        return this.f95e.getTitle();
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: i */
    public void mo2460i() {
        this.f96f.mo2544a(this, this.f99i);
    }

    @Override // p000a.p001a.p006m.AbstractC0029b
    /* renamed from: j */
    public boolean mo2459j() {
        return this.f95e.m2287b();
    }
}
