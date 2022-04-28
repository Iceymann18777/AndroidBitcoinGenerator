package p050b.p051a.p052a.p053a.p061p;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import p000a.p018g.p021e.C0141a;

/* renamed from: b.a.a.a.p.a */
/* loaded from: classes.dex */
public class C0907a {

    /* renamed from: a */
    public static final boolean f3344a;

    /* renamed from: b */
    private static final int[] f3345b;

    /* renamed from: c */
    private static final int[] f3346c;

    /* renamed from: d */
    private static final int[] f3347d;

    /* renamed from: e */
    private static final int[] f3348e;

    /* renamed from: f */
    private static final int[] f3349f;

    /* renamed from: g */
    private static final int[] f3350g;

    /* renamed from: h */
    private static final int[] f3351h;

    /* renamed from: i */
    private static final int[] f3352i;

    /* renamed from: j */
    private static final int[] f3353j;

    static {
        f3344a = Build.VERSION.SDK_INT >= 21;
        f3345b = new int[]{16842919};
        f3346c = new int[]{16843623, 16842908};
        f3347d = new int[]{16842908};
        f3348e = new int[]{16843623};
        f3349f = new int[]{16842913, 16842919};
        f3350g = new int[]{16842913, 16843623, 16842908};
        f3351h = new int[]{16842913, 16842908};
        f3352i = new int[]{16842913, 16843623};
        f3353j = new int[]{16842913};
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m399a(int i) {
        return C0141a.m3668c(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: a */
    private static int m397a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f3344a ? m399a(colorForState) : colorForState;
    }

    /* renamed from: a */
    public static ColorStateList m398a(ColorStateList colorStateList) {
        if (f3344a) {
            return new ColorStateList(new int[][]{f3353j, StateSet.NOTHING}, new int[]{m397a(colorStateList, f3349f), m397a(colorStateList, f3345b)});
        }
        int[] iArr = f3349f;
        int[] iArr2 = f3350g;
        int[] iArr3 = f3351h;
        int[] iArr4 = f3352i;
        int[] iArr5 = f3345b;
        int[] iArr6 = f3346c;
        int[] iArr7 = f3347d;
        int[] iArr8 = f3348e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f3353j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m397a(colorStateList, iArr), m397a(colorStateList, iArr2), m397a(colorStateList, iArr3), m397a(colorStateList, iArr4), 0, m397a(colorStateList, iArr5), m397a(colorStateList, iArr6), m397a(colorStateList, iArr7), m397a(colorStateList, iArr8), 0});
    }
}
