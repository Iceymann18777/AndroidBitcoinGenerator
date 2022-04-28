package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    private final C0988a f3621k = new C0988a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: a */
    public boolean mo63a(View view) {
        return this.f3621k.m59a(view);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo62a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3621k.m58a(coordinatorLayout, view, motionEvent);
        return super.mo62a(coordinatorLayout, (CoordinatorLayout) view, motionEvent);
    }
}
