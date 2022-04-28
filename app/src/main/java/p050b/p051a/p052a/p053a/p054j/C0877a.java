package p050b.p051a.p052a.p053a.p054j;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p000a.p038k.p039a.p040a.C0305a;
import p000a.p038k.p039a.p040a.C0306b;
import p000a.p038k.p039a.p040a.C0307c;

/* renamed from: b.a.a.a.j.a */
/* loaded from: classes.dex */
public class C0877a {

    /* renamed from: a */
    public static final TimeInterpolator f3281a = new C0306b();

    /* renamed from: b */
    public static final TimeInterpolator f3282b = new C0305a();

    /* renamed from: c */
    public static final TimeInterpolator f3283c = new C0307c();

    /* renamed from: d */
    public static final TimeInterpolator f3284d = new DecelerateInterpolator();

    static {
        new LinearInterpolator();
    }

    /* renamed from: a */
    public static float m484a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
