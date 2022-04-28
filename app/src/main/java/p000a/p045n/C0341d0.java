package p000a.p045n;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;
import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.n.d0 */
/* loaded from: classes.dex */
public class C0341d0 {

    /* renamed from: a */
    private static final C0355h0 f1056a;

    /* renamed from: b */
    private static Field f1057b;

    /* renamed from: c */
    private static boolean f1058c;

    /* renamed from: d */
    static final Property<View, Float> f1059d;

    /* renamed from: a.n.d0$a */
    /* loaded from: classes.dex */
    static class C0342a extends Property<View, Float> {
        C0342a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0341d0.m2896c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C0341d0.m2902a(view, f.floatValue());
        }
    }

    /* renamed from: a.n.d0$b */
    /* loaded from: classes.dex */
    static class C0343b extends Property<View, Rect> {
        C0343b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C0216r.m3421d(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            C0216r.m3435a(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1056a = i >= 22 ? new C0353g0() : i >= 21 ? new C0351f0() : i >= 19 ? new C0349e0() : new C0355h0();
        f1059d = new C0342a(Float.class, "translationAlpha");
        new C0343b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    private static void m2904a() {
        if (!f1058c) {
            try {
                f1057b = View.class.getDeclaredField("mViewFlags");
                f1057b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f1058c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2903a(View view) {
        f1056a.mo2865a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2902a(View view, float f) {
        f1056a.mo2864a(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2901a(View view, int i) {
        m2904a();
        Field field = f1057b;
        if (field != null) {
            try {
                f1057b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2900a(View view, int i, int i2, int i3, int i4) {
        f1056a.mo2863a(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2899a(View view, Matrix matrix) {
        f1056a.mo2862a(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC0337c0 m2898b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0324b0(view) : C0321a0.m2932c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m2897b(View view, Matrix matrix) {
        f1056a.mo2860b(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m2896c(View view) {
        return f1056a.mo2861b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static AbstractC0366l0 m2895d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0364k0(view) : new C0362j0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m2894e(View view) {
        f1056a.mo2859c(view);
    }
}
