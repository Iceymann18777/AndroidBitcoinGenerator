package p000a.p045n;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: a.n.b0 */
/* loaded from: classes.dex */
class C0324b0 implements AbstractC0337c0 {

    /* renamed from: a */
    private final ViewOverlay f1019a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0324b0(View view) {
        this.f1019a = view.getOverlay();
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: a */
    public void mo2770a(Drawable drawable) {
        this.f1019a.remove(drawable);
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: b */
    public void mo2769b(Drawable drawable) {
        this.f1019a.add(drawable);
    }
}
