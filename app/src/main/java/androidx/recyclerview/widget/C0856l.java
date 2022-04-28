package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
class C0856l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m578a(C0813j.C0815a0 a0Var, AbstractC0810i iVar, View view, View view2, C0813j.AbstractC0835o oVar, boolean z) {
        if (oVar.m697e() == 0 || a0Var.m907a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.m673l(view) - oVar.m673l(view2)) + 1;
        }
        return Math.min(iVar.mo1028g(), iVar.mo1039a(view2) - iVar.mo1033d(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m577a(C0813j.C0815a0 a0Var, AbstractC0810i iVar, View view, View view2, C0813j.AbstractC0835o oVar, boolean z, boolean z2) {
        if (oVar.m697e() == 0 || a0Var.m907a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.m907a() - Math.max(oVar.m673l(view), oVar.m673l(view2))) - 1) : Math.max(0, Math.min(oVar.m673l(view), oVar.m673l(view2)));
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(iVar.mo1039a(view2) - iVar.mo1033d(view)) / (Math.abs(oVar.m673l(view) - oVar.m673l(view2)) + 1))) + (iVar.mo1030f() - iVar.mo1033d(view)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m576b(C0813j.C0815a0 a0Var, AbstractC0810i iVar, View view, View view2, C0813j.AbstractC0835o oVar, boolean z) {
        if (oVar.m697e() == 0 || a0Var.m907a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.m907a();
        }
        return (int) (((iVar.mo1039a(view2) - iVar.mo1033d(view)) / (Math.abs(oVar.m673l(view) - oVar.m673l(view2)) + 1)) * a0Var.m907a());
    }
}
