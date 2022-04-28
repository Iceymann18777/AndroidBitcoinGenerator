package p000a.p045n;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.n.s */
/* loaded from: classes.dex */
public class C0383s {

    /* renamed from: b */
    public View f1167b;

    /* renamed from: a */
    public final Map<String, Object> f1166a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC0367m> f1168c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof C0383s)) {
            return false;
        }
        C0383s sVar = (C0383s) obj;
        return this.f1167b == sVar.f1167b && this.f1166a.equals(sVar.f1166a);
    }

    public int hashCode() {
        return (this.f1167b.hashCode() * 31) + this.f1166a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1167b + "\n") + "    values:";
        for (String str2 : this.f1166a.keySet()) {
            str = str + "    " + str2 + ": " + this.f1166a.get(str2) + "\n";
        }
        return str;
    }
}
