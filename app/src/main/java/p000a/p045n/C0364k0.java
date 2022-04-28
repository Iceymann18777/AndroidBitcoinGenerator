package p000a.p045n;

import android.view.View;
import android.view.WindowId;

/* renamed from: a.n.k0 */
/* loaded from: classes.dex */
class C0364k0 implements AbstractC0366l0 {

    /* renamed from: a */
    private final WindowId f1103a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0364k0(View view) {
        this.f1103a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0364k0) && ((C0364k0) obj).f1103a.equals(this.f1103a);
    }

    public int hashCode() {
        return this.f1103a.hashCode();
    }
}
