package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import java.util.HashMap;
import java.util.Map;
import p000a.p018g.p029l.C0216r;
import p050b.p051a.p052a.p053a.C0868a;
import p050b.p051a.p052a.p053a.p054j.C0884h;
import p050b.p051a.p052a.p053a.p054j.C0886j;

/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g */
    private Map<View, Integer> f3665g;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m15a(View view, boolean z) {
        int i;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f3665g = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0680f) && (((CoordinatorLayout.C0680f) childAt.getLayoutParams()).m1659d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f3665g;
                        if (map != null && map.containsKey(childAt)) {
                            i = this.f3665g.get(childAt).intValue();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f3665g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        i = 4;
                    }
                    C0216r.m3418e(childAt, i);
                }
            }
            if (!z) {
                this.f3665g = null;
            }
        }
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: a */
    protected FabTransformationBehavior.C1004e mo17a(Context context, boolean z) {
        int i = z ? C0868a.mtrl_fab_transformation_sheet_expand_spec : C0868a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C1004e eVar = new FabTransformationBehavior.C1004e();
        eVar.f3659a = C0884h.m472a(context, i);
        eVar.f3660b = new C0886j(17, 0.0f, 0.0f);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: a */
    public boolean mo16a(View view, View view2, boolean z, boolean z2) {
        m15a(view2, z);
        return super.mo16a(view, view2, z, z2);
    }
}
