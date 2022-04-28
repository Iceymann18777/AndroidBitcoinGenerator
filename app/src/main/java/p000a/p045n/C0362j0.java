package p000a.p045n;

import android.os.IBinder;

/* renamed from: a.n.j0 */
/* loaded from: classes.dex */
class C0362j0 implements AbstractC0366l0 {

    /* renamed from: a */
    private final IBinder f1101a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0362j0(IBinder iBinder) {
        this.f1101a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0362j0) && ((C0362j0) obj).f1101a.equals(this.f1101a);
    }

    public int hashCode() {
        return this.f1101a.hashCode();
    }
}
