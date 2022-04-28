package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public class C0761r {

    /* renamed from: a */
    private final HashMap<String, AbstractC0758p> f2829a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC0758p m1345a(String str) {
        return this.f2829a.get(str);
    }

    /* renamed from: a */
    public final void m1346a() {
        for (AbstractC0758p pVar : this.f2829a.values()) {
            pVar.mo1350a();
        }
        this.f2829a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1344a(String str, AbstractC0758p pVar) {
        AbstractC0758p put = this.f2829a.put(str, pVar);
        if (put != null) {
            put.mo1350a();
        }
    }
}
