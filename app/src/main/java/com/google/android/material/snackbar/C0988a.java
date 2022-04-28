package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes.dex */
public class C0988a {

    /* renamed from: a */
    private C0994f.AbstractC0996b f3626a;

    public C0988a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.m305b(0.1f);
        swipeDismissBehavior.m310a(0.6f);
        swipeDismissBehavior.m308a(0);
    }

    /* renamed from: a */
    public void m58a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C0994f.m55a().m51b(this.f3626a);
            }
        } else if (coordinatorLayout.m1718a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C0994f.m55a().m54a(this.f3626a);
        }
    }

    /* renamed from: a */
    public boolean m59a(View view) {
        return view instanceof C0991d;
    }
}
