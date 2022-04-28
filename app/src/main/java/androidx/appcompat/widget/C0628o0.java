package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p018g.p021e.C0141a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.o0 */
/* loaded from: classes.dex */
public class C0628o0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2253a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f2254b = {-16842910};

    /* renamed from: c */
    static final int[] f2255c = {16842908};

    /* renamed from: d */
    static final int[] f2256d = {16842919};

    /* renamed from: e */
    static final int[] f2257e = {16842912};

    /* renamed from: f */
    static final int[] f2258f = new int[0];

    /* renamed from: g */
    private static final int[] f2259g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
    }

    /* renamed from: a */
    public static int m1921a(Context context, int i) {
        ColorStateList c = m1918c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f2254b, c.getDefaultColor());
        }
        TypedValue a = m1922a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1920a(context, i, a.getFloat());
    }

    /* renamed from: a */
    static int m1920a(Context context, int i, float f) {
        int b = m1919b(context, i);
        return C0141a.m3668c(b, Math.round(Color.alpha(b) * f));
    }

    /* renamed from: a */
    private static TypedValue m1922a() {
        TypedValue typedValue = f2253a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2253a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static int m1919b(Context context, int i) {
        int[] iArr = f2259g;
        iArr[0] = i;
        C0638t0 a = C0638t0.m1901a(context, (AttributeSet) null, iArr);
        try {
            return a.m1905a(0, 0);
        } finally {
            a.m1908a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m1918c(Context context, int i) {
        int[] iArr = f2259g;
        iArr[0] = i;
        C0638t0 a = C0638t0.m1901a(context, (AttributeSet) null, iArr);
        try {
            return a.m1907a(0);
        } finally {
            a.m1908a();
        }
    }
}
