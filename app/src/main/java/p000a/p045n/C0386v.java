package p000a.p045n;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: a.n.v */
/* loaded from: classes.dex */
class C0386v implements AbstractC0387w {

    /* renamed from: a */
    private final ViewGroupOverlay f1173a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0386v(ViewGroup viewGroup) {
        this.f1173a = viewGroup.getOverlay();
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: a */
    public void mo2770a(Drawable drawable) {
        this.f1173a.remove(drawable);
    }

    @Override // p000a.p045n.AbstractC0387w
    /* renamed from: a */
    public void mo2768a(View view) {
        this.f1173a.remove(view);
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: b */
    public void mo2769b(Drawable drawable) {
        this.f1173a.add(drawable);
    }

    @Override // p000a.p045n.AbstractC0387w
    /* renamed from: b */
    public void mo2767b(View view) {
        this.f1173a.add(view);
    }
}
