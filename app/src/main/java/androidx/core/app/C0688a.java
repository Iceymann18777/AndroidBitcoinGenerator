package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import p000a.p018g.p019d.C0124a;

/* renamed from: androidx.core.app.a */
/* loaded from: classes.dex */
public class C0688a extends C0124a {

    /* renamed from: c */
    private static AbstractC0690b f2619c;

    /* renamed from: androidx.core.app.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0689a {
    }

    /* renamed from: androidx.core.app.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC0690b {
        /* renamed from: a */
        boolean m1634a(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: androidx.core.app.a$c */
    /* loaded from: classes.dex */
    public interface AbstractC0691c {
    }

    /* renamed from: a */
    public static AbstractC0690b m1637a() {
        return f2619c;
    }

    /* renamed from: a */
    public static void m1636a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m1635a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
