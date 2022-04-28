package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;

/* renamed from: androidx.appcompat.app.g */
/* loaded from: classes.dex */
public abstract class AbstractC0444g {

    /* renamed from: b */
    private static int f1419b = -1;

    /* renamed from: a */
    public static AbstractC0444g m2625a(Activity activity, AbstractC0443f fVar) {
        return new LayoutInflater$Factory2C0445h(activity, activity.getWindow(), fVar);
    }

    /* renamed from: a */
    public static AbstractC0444g m2624a(Dialog dialog, AbstractC0443f fVar) {
        return new LayoutInflater$Factory2C0445h(dialog.getContext(), dialog.getWindow(), fVar);
    }

    /* renamed from: k */
    public static int m2623k() {
        return f1419b;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo2619a(int i);

    /* renamed from: a */
    public abstract void mo2614a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo2613a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo2610a(View view);

    /* renamed from: a */
    public abstract void mo2609a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo2600a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo2599a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo2620a();

    /* renamed from: b */
    public abstract C0432b.AbstractC0434b mo2598b();

    /* renamed from: b */
    public abstract void mo2594b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo2593b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo2597b(int i);

    /* renamed from: c */
    public abstract MenuInflater mo2589c();

    /* renamed from: c */
    public abstract void mo2588c(int i);

    /* renamed from: c */
    public abstract void mo2586c(Bundle bundle);

    /* renamed from: d */
    public abstract AbstractC0428a mo2584d();

    /* renamed from: e */
    public abstract void mo2581e();

    /* renamed from: f */
    public abstract void mo2578f();

    /* renamed from: g */
    public abstract void mo2576g();

    /* renamed from: h */
    public abstract void mo2574h();

    /* renamed from: i */
    public abstract void mo2572i();

    /* renamed from: j */
    public abstract void mo2570j();
}
