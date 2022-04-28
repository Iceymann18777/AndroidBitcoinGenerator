package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p000a.p014e.p015a.C0088f;
import p000a.p014e.p015a.p016j.C0102f;
import p000a.p014e.p015a.p016j.C0105g;
import p000a.p014e.p015a.p016j.C0107i;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    SparseArray<View> f2384b = new SparseArray<>();

    /* renamed from: c */
    private ArrayList<AbstractC0665b> f2385c = new ArrayList<>(4);

    /* renamed from: d */
    private final ArrayList<C0102f> f2386d = new ArrayList<>(100);

    /* renamed from: e */
    C0105g f2387e = new C0105g();

    /* renamed from: f */
    private int f2388f = 0;

    /* renamed from: g */
    private int f2389g = 0;

    /* renamed from: h */
    private int f2390h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f2391i = Integer.MAX_VALUE;

    /* renamed from: j */
    private boolean f2392j = true;

    /* renamed from: k */
    private int f2393k = 7;

    /* renamed from: l */
    private C0666c f2394l = null;

    /* renamed from: m */
    private int f2395m = -1;

    /* renamed from: n */
    private HashMap<String, Integer> f2396n = new HashMap<>();

    /* renamed from: o */
    private int f2397o = -1;

    /* renamed from: p */
    private int f2398p = -1;

    /* renamed from: q */
    private C0088f f2399q;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes.dex */
    public static class C0662a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2400A;

        /* renamed from: B */
        public String f2401B;

        /* renamed from: C */
        int f2402C;

        /* renamed from: D */
        public float f2403D;

        /* renamed from: E */
        public float f2404E;

        /* renamed from: F */
        public int f2405F;

        /* renamed from: G */
        public int f2406G;

        /* renamed from: H */
        public int f2407H;

        /* renamed from: I */
        public int f2408I;

        /* renamed from: J */
        public int f2409J;

        /* renamed from: K */
        public int f2410K;

        /* renamed from: L */
        public int f2411L;

        /* renamed from: M */
        public int f2412M;

        /* renamed from: N */
        public float f2413N;

        /* renamed from: O */
        public float f2414O;

        /* renamed from: P */
        public int f2415P;

        /* renamed from: Q */
        public int f2416Q;

        /* renamed from: R */
        public int f2417R;

        /* renamed from: S */
        public boolean f2418S;

        /* renamed from: T */
        public boolean f2419T;

        /* renamed from: U */
        boolean f2420U;

        /* renamed from: V */
        boolean f2421V;

        /* renamed from: W */
        boolean f2422W;

        /* renamed from: X */
        boolean f2423X;

        /* renamed from: Y */
        boolean f2424Y;

        /* renamed from: Z */
        boolean f2425Z;

        /* renamed from: a */
        public int f2426a;

        /* renamed from: a0 */
        int f2427a0;

        /* renamed from: b */
        public int f2428b;

        /* renamed from: b0 */
        int f2429b0;

        /* renamed from: c */
        public float f2430c;

        /* renamed from: c0 */
        int f2431c0;

        /* renamed from: d */
        public int f2432d;

        /* renamed from: d0 */
        int f2433d0;

        /* renamed from: e */
        public int f2434e;

        /* renamed from: e0 */
        int f2435e0;

        /* renamed from: f */
        public int f2436f;

        /* renamed from: f0 */
        int f2437f0;

        /* renamed from: g */
        public int f2438g;

        /* renamed from: g0 */
        float f2439g0;

        /* renamed from: h */
        public int f2440h;

        /* renamed from: h0 */
        int f2441h0;

        /* renamed from: i */
        public int f2442i;

        /* renamed from: i0 */
        int f2443i0;

        /* renamed from: j */
        public int f2444j;

        /* renamed from: j0 */
        float f2445j0;

        /* renamed from: k */
        public int f2446k;

        /* renamed from: k0 */
        C0102f f2447k0;

        /* renamed from: l */
        public int f2448l;

        /* renamed from: l0 */
        public boolean f2449l0;

        /* renamed from: m */
        public int f2450m;

        /* renamed from: n */
        public int f2451n;

        /* renamed from: o */
        public float f2452o;

        /* renamed from: p */
        public int f2453p;

        /* renamed from: q */
        public int f2454q;

        /* renamed from: r */
        public int f2455r;

        /* renamed from: s */
        public int f2456s;

        /* renamed from: t */
        public int f2457t;

        /* renamed from: u */
        public int f2458u;

        /* renamed from: v */
        public int f2459v;

        /* renamed from: w */
        public int f2460w;

        /* renamed from: x */
        public int f2461x;

        /* renamed from: y */
        public int f2462y;

        /* renamed from: z */
        public float f2463z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        /* loaded from: classes.dex */
        private static class C0663a {

            /* renamed from: a */
            public static final SparseIntArray f2464a = new SparseIntArray();

            static {
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f2464a.append(C0674h.ConstraintLayout_Layout_android_orientation, 1);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f2464a.append(C0674h.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0662a(int i, int i2) {
            super(i, i2);
            this.f2426a = -1;
            this.f2428b = -1;
            this.f2430c = -1.0f;
            this.f2432d = -1;
            this.f2434e = -1;
            this.f2436f = -1;
            this.f2438g = -1;
            this.f2440h = -1;
            this.f2442i = -1;
            this.f2444j = -1;
            this.f2446k = -1;
            this.f2448l = -1;
            this.f2450m = -1;
            this.f2451n = 0;
            this.f2452o = 0.0f;
            this.f2453p = -1;
            this.f2454q = -1;
            this.f2455r = -1;
            this.f2456s = -1;
            this.f2457t = -1;
            this.f2458u = -1;
            this.f2459v = -1;
            this.f2460w = -1;
            this.f2461x = -1;
            this.f2462y = -1;
            this.f2463z = 0.5f;
            this.f2400A = 0.5f;
            this.f2401B = null;
            this.f2402C = 1;
            this.f2403D = -1.0f;
            this.f2404E = -1.0f;
            this.f2405F = 0;
            this.f2406G = 0;
            this.f2407H = 0;
            this.f2408I = 0;
            this.f2409J = 0;
            this.f2410K = 0;
            this.f2411L = 0;
            this.f2412M = 0;
            this.f2413N = 1.0f;
            this.f2414O = 1.0f;
            this.f2415P = -1;
            this.f2416Q = -1;
            this.f2417R = -1;
            this.f2418S = false;
            this.f2419T = false;
            this.f2420U = true;
            this.f2421V = true;
            this.f2422W = false;
            this.f2423X = false;
            this.f2424Y = false;
            this.f2425Z = false;
            this.f2427a0 = -1;
            this.f2429b0 = -1;
            this.f2431c0 = -1;
            this.f2433d0 = -1;
            this.f2435e0 = -1;
            this.f2437f0 = -1;
            this.f2439g0 = 0.5f;
            this.f2447k0 = new C0102f();
            this.f2449l0 = false;
        }

        public C0662a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i;
            this.f2426a = -1;
            this.f2428b = -1;
            this.f2430c = -1.0f;
            this.f2432d = -1;
            this.f2434e = -1;
            this.f2436f = -1;
            this.f2438g = -1;
            this.f2440h = -1;
            this.f2442i = -1;
            this.f2444j = -1;
            this.f2446k = -1;
            this.f2448l = -1;
            this.f2450m = -1;
            this.f2451n = 0;
            this.f2452o = 0.0f;
            this.f2453p = -1;
            this.f2454q = -1;
            this.f2455r = -1;
            this.f2456s = -1;
            this.f2457t = -1;
            this.f2458u = -1;
            this.f2459v = -1;
            this.f2460w = -1;
            this.f2461x = -1;
            this.f2462y = -1;
            this.f2463z = 0.5f;
            this.f2400A = 0.5f;
            this.f2401B = null;
            this.f2402C = 1;
            this.f2403D = -1.0f;
            this.f2404E = -1.0f;
            this.f2405F = 0;
            this.f2406G = 0;
            this.f2407H = 0;
            this.f2408I = 0;
            this.f2409J = 0;
            this.f2410K = 0;
            this.f2411L = 0;
            this.f2412M = 0;
            this.f2413N = 1.0f;
            this.f2414O = 1.0f;
            this.f2415P = -1;
            this.f2416Q = -1;
            this.f2417R = -1;
            this.f2418S = false;
            this.f2419T = false;
            this.f2420U = true;
            this.f2421V = true;
            this.f2422W = false;
            this.f2423X = false;
            this.f2424Y = false;
            this.f2425Z = false;
            this.f2427a0 = -1;
            this.f2429b0 = -1;
            this.f2431c0 = -1;
            this.f2433d0 = -1;
            this.f2435e0 = -1;
            this.f2437f0 = -1;
            this.f2439g0 = 0.5f;
            this.f2447k0 = new C0102f();
            this.f2449l0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0674h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (C0663a.f2464a.get(index)) {
                    case 0:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    default:
                    case 1:
                        this.f2417R = obtainStyledAttributes.getInt(index, this.f2417R);
                        continue;
                    case 2:
                        this.f2450m = obtainStyledAttributes.getResourceId(index, this.f2450m);
                        if (this.f2450m == -1) {
                            this.f2450m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f2451n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2451n);
                        continue;
                    case 4:
                        this.f2452o = obtainStyledAttributes.getFloat(index, this.f2452o) % 360.0f;
                        float f = this.f2452o;
                        if (f < 0.0f) {
                            this.f2452o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f2426a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2426a);
                        continue;
                    case 6:
                        this.f2428b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2428b);
                        continue;
                    case 7:
                        this.f2430c = obtainStyledAttributes.getFloat(index, this.f2430c);
                        continue;
                    case 8:
                        this.f2432d = obtainStyledAttributes.getResourceId(index, this.f2432d);
                        if (this.f2432d == -1) {
                            this.f2432d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        this.f2434e = obtainStyledAttributes.getResourceId(index, this.f2434e);
                        if (this.f2434e == -1) {
                            this.f2434e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        this.f2436f = obtainStyledAttributes.getResourceId(index, this.f2436f);
                        if (this.f2436f == -1) {
                            this.f2436f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        this.f2438g = obtainStyledAttributes.getResourceId(index, this.f2438g);
                        if (this.f2438g == -1) {
                            this.f2438g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        this.f2440h = obtainStyledAttributes.getResourceId(index, this.f2440h);
                        if (this.f2440h == -1) {
                            this.f2440h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        this.f2442i = obtainStyledAttributes.getResourceId(index, this.f2442i);
                        if (this.f2442i == -1) {
                            this.f2442i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        this.f2444j = obtainStyledAttributes.getResourceId(index, this.f2444j);
                        if (this.f2444j == -1) {
                            this.f2444j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        this.f2446k = obtainStyledAttributes.getResourceId(index, this.f2446k);
                        if (this.f2446k == -1) {
                            this.f2446k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        this.f2448l = obtainStyledAttributes.getResourceId(index, this.f2448l);
                        if (this.f2448l == -1) {
                            this.f2448l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        this.f2453p = obtainStyledAttributes.getResourceId(index, this.f2453p);
                        if (this.f2453p == -1) {
                            this.f2453p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        this.f2454q = obtainStyledAttributes.getResourceId(index, this.f2454q);
                        if (this.f2454q == -1) {
                            this.f2454q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        this.f2455r = obtainStyledAttributes.getResourceId(index, this.f2455r);
                        if (this.f2455r == -1) {
                            this.f2455r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        this.f2456s = obtainStyledAttributes.getResourceId(index, this.f2456s);
                        if (this.f2456s == -1) {
                            this.f2456s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f2457t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2457t);
                        continue;
                    case 22:
                        this.f2458u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2458u);
                        continue;
                    case 23:
                        this.f2459v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2459v);
                        continue;
                    case 24:
                        this.f2460w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2460w);
                        continue;
                    case 25:
                        this.f2461x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2461x);
                        continue;
                    case 26:
                        this.f2462y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2462y);
                        continue;
                    case 27:
                        this.f2418S = obtainStyledAttributes.getBoolean(index, this.f2418S);
                        continue;
                    case 28:
                        this.f2419T = obtainStyledAttributes.getBoolean(index, this.f2419T);
                        continue;
                    case 29:
                        this.f2463z = obtainStyledAttributes.getFloat(index, this.f2463z);
                        continue;
                    case 30:
                        this.f2400A = obtainStyledAttributes.getFloat(index, this.f2400A);
                        continue;
                    case 31:
                        this.f2407H = obtainStyledAttributes.getInt(index, 0);
                        if (this.f2407H == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        this.f2408I = obtainStyledAttributes.getInt(index, 0);
                        if (this.f2408I == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.f2409J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2409J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2409J) == -2) {
                                this.f2409J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.f2411L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2411L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2411L) == -2) {
                                this.f2411L = -2;
                            }
                        }
                    case 35:
                        this.f2413N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2413N));
                        continue;
                    case 36:
                        try {
                            this.f2410K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2410K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2410K) == -2) {
                                this.f2410K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.f2412M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2412M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2412M) == -2) {
                                this.f2412M = -2;
                            }
                        }
                    case 38:
                        this.f2414O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2414O));
                        continue;
                    case 44:
                        this.f2401B = obtainStyledAttributes.getString(index);
                        this.f2402C = -1;
                        String str2 = this.f2401B;
                        if (str2 != null) {
                            int length = str2.length();
                            int indexOf = this.f2401B.indexOf(44);
                            if (indexOf <= 0 || indexOf >= length - 1) {
                                i = 0;
                            } else {
                                String substring = this.f2401B.substring(0, indexOf);
                                if (substring.equalsIgnoreCase("W")) {
                                    this.f2402C = 0;
                                } else if (substring.equalsIgnoreCase("H")) {
                                    this.f2402C = 1;
                                }
                                i = indexOf + 1;
                            }
                            int indexOf2 = this.f2401B.indexOf(58);
                            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                String substring2 = this.f2401B.substring(i);
                                if (substring2.length() > 0) {
                                    Float.parseFloat(substring2);
                                }
                            } else {
                                String substring3 = this.f2401B.substring(i, indexOf2);
                                String substring4 = this.f2401B.substring(indexOf2 + 1);
                                if (substring3.length() > 0 && substring4.length() > 0) {
                                    try {
                                        float parseFloat = Float.parseFloat(substring3);
                                        float parseFloat2 = Float.parseFloat(substring4);
                                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                            if (this.f2402C == 1) {
                                                Math.abs(parseFloat2 / parseFloat);
                                            } else {
                                                Math.abs(parseFloat / parseFloat2);
                                            }
                                        }
                                    } catch (NumberFormatException unused5) {
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 45:
                        this.f2403D = obtainStyledAttributes.getFloat(index, this.f2403D);
                        continue;
                    case 46:
                        this.f2404E = obtainStyledAttributes.getFloat(index, this.f2404E);
                        continue;
                    case 47:
                        this.f2405F = obtainStyledAttributes.getInt(index, 0);
                        continue;
                    case 48:
                        this.f2406G = obtainStyledAttributes.getInt(index, 0);
                        continue;
                    case 49:
                        this.f2415P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2415P);
                        continue;
                    case 50:
                        this.f2416Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2416Q);
                        continue;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            m1748a();
        }

        public C0662a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2426a = -1;
            this.f2428b = -1;
            this.f2430c = -1.0f;
            this.f2432d = -1;
            this.f2434e = -1;
            this.f2436f = -1;
            this.f2438g = -1;
            this.f2440h = -1;
            this.f2442i = -1;
            this.f2444j = -1;
            this.f2446k = -1;
            this.f2448l = -1;
            this.f2450m = -1;
            this.f2451n = 0;
            this.f2452o = 0.0f;
            this.f2453p = -1;
            this.f2454q = -1;
            this.f2455r = -1;
            this.f2456s = -1;
            this.f2457t = -1;
            this.f2458u = -1;
            this.f2459v = -1;
            this.f2460w = -1;
            this.f2461x = -1;
            this.f2462y = -1;
            this.f2463z = 0.5f;
            this.f2400A = 0.5f;
            this.f2401B = null;
            this.f2402C = 1;
            this.f2403D = -1.0f;
            this.f2404E = -1.0f;
            this.f2405F = 0;
            this.f2406G = 0;
            this.f2407H = 0;
            this.f2408I = 0;
            this.f2409J = 0;
            this.f2410K = 0;
            this.f2411L = 0;
            this.f2412M = 0;
            this.f2413N = 1.0f;
            this.f2414O = 1.0f;
            this.f2415P = -1;
            this.f2416Q = -1;
            this.f2417R = -1;
            this.f2418S = false;
            this.f2419T = false;
            this.f2420U = true;
            this.f2421V = true;
            this.f2422W = false;
            this.f2423X = false;
            this.f2424Y = false;
            this.f2425Z = false;
            this.f2427a0 = -1;
            this.f2429b0 = -1;
            this.f2431c0 = -1;
            this.f2433d0 = -1;
            this.f2435e0 = -1;
            this.f2437f0 = -1;
            this.f2439g0 = 0.5f;
            this.f2447k0 = new C0102f();
            this.f2449l0 = false;
        }

        /* renamed from: a */
        public void m1748a() {
            this.f2423X = false;
            this.f2420U = true;
            this.f2421V = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.f2418S) {
                this.f2420U = false;
                this.f2407H = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.f2419T) {
                this.f2421V = false;
                this.f2408I = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).width == 0 || ((ViewGroup.MarginLayoutParams) this).width == -1) {
                this.f2420U = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.f2407H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2418S = true;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).height == 0 || ((ViewGroup.MarginLayoutParams) this).height == -1) {
                this.f2421V = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.f2408I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2419T = true;
                }
            }
            if (this.f2430c != -1.0f || this.f2426a != -1 || this.f2428b != -1) {
                this.f2423X = true;
                this.f2420U = true;
                this.f2421V = true;
                if (!(this.f2447k0 instanceof C0107i)) {
                    this.f2447k0 = new C0107i();
                }
                ((C0107i) this.f2447k0).m3774v(this.f2417R);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d6, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d8, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r6).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00e5, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0662a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m1756a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1756a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1756a(attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d6, code lost:
        if (r11 != (-1)) goto L_0x01da;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1761a() {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1761a():void");
    }

    /* renamed from: a */
    private void m1759a(int i, int i2) {
        boolean z;
        boolean z2;
        int baseline;
        int i3;
        int i4;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0662a aVar = (C0662a) childAt.getLayoutParams();
                C0102f fVar = aVar.f2447k0;
                if (!aVar.f2423X && !aVar.f2424Y) {
                    fVar.m3829n(childAt.getVisibility());
                    int i6 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    int i7 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    boolean z3 = aVar.f2420U;
                    if (z3 || aVar.f2421V || (!z3 && aVar.f2407H == 1) || ((ViewGroup.MarginLayoutParams) aVar).width == -1 || (!aVar.f2421V && (aVar.f2408I == 1 || ((ViewGroup.MarginLayoutParams) aVar).height == -1))) {
                        if (i6 == 0) {
                            i3 = ViewGroup.getChildMeasureSpec(i, paddingLeft, -2);
                            z2 = true;
                        } else if (i6 == -1) {
                            i3 = ViewGroup.getChildMeasureSpec(i, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i6 == -2;
                            i3 = ViewGroup.getChildMeasureSpec(i, paddingLeft, i6);
                        }
                        if (i7 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
                            z = true;
                        } else if (i7 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -1);
                            z = false;
                        } else {
                            z = i7 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingTop, i7);
                        }
                        childAt.measure(i3, i4);
                        C0088f fVar2 = this.f2399q;
                        if (fVar2 != null) {
                            fVar2.f307a++;
                        }
                        fVar.m3858b(i6 == -2);
                        fVar.m3866a(i7 == -2);
                        i6 = childAt.getMeasuredWidth();
                        i7 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    fVar.m3827o(i6);
                    fVar.m3843g(i7);
                    if (z2) {
                        fVar.m3823q(i6);
                    }
                    if (z) {
                        fVar.m3825p(i7);
                    }
                    if (aVar.f2422W && (baseline = childAt.getBaseline()) != -1) {
                        fVar.m3845f(baseline);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1756a(AttributeSet attributeSet) {
        this.f2387e.m3868a(this);
        this.f2384b.put(getId(), this);
        this.f2394l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0674h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0674h.ConstraintLayout_Layout_android_minWidth) {
                    this.f2388f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2388f);
                } else if (index == C0674h.ConstraintLayout_Layout_android_minHeight) {
                    this.f2389g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2389g);
                } else if (index == C0674h.ConstraintLayout_Layout_android_maxWidth) {
                    this.f2390h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2390h);
                } else if (index == C0674h.ConstraintLayout_Layout_android_maxHeight) {
                    this.f2391i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2391i);
                } else if (index == C0674h.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f2393k = obtainStyledAttributes.getInt(index, this.f2393k);
                } else if (index == C0674h.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f2394l = new C0666c();
                        this.f2394l.m1741a(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f2394l = null;
                    }
                    this.f2395m = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2387e.m3792u(this.f2393k);
    }

    /* renamed from: b */
    private final C0102f m1752b(int i) {
        if (i == 0) {
            return this.f2387e;
        }
        View view = this.f2384b.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2387e;
        }
        if (view == null) {
            return null;
        }
        return ((C0662a) view.getLayoutParams()).f2447k0;
    }

    /* renamed from: b */
    private void m1753b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f2386d.clear();
            m1761a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c2 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1751b(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1751b(int, int):void");
    }

    /* renamed from: c */
    private void m1750c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0672f) {
                ((C0672f) childAt).m1728a(this);
            }
        }
        int size = this.f2385c.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f2385c.get(i2).m1743b(this);
            }
        }
    }

    /* renamed from: c */
    private void m1749c(int i, int i2) {
        C0102f.EnumC0104b bVar;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0102f.EnumC0104b bVar2 = C0102f.EnumC0104b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                bVar = C0102f.EnumC0104b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                bVar = bVar2;
            } else {
                i3 = Math.min(this.f2390h, size) - paddingLeft;
                bVar = bVar2;
            }
            i3 = 0;
        } else {
            bVar = C0102f.EnumC0104b.WRAP_CONTENT;
            i3 = size;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                bVar2 = C0102f.EnumC0104b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f2391i, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            bVar2 = C0102f.EnumC0104b.WRAP_CONTENT;
        }
        this.f2387e.m3833l(0);
        this.f2387e.m3835k(0);
        this.f2387e.m3871a(bVar);
        this.f2387e.m3827o(i3);
        this.f2387e.m3860b(bVar2);
        this.f2387e.m3843g(size2);
        this.f2387e.m3833l((this.f2388f - getPaddingLeft()) - getPaddingRight());
        this.f2387e.m3835k((this.f2389g - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: a */
    public final C0102f m1755a(View view) {
        if (view == this) {
            return this.f2387e;
        }
        if (view == null) {
            return null;
        }
        return ((C0662a) view.getLayoutParams()).f2447k0;
    }

    /* renamed from: a */
    public View m1760a(int i) {
        return this.f2384b.get(i);
    }

    /* renamed from: a */
    public Object m1758a(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2396n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2396n.get(str);
    }

    /* renamed from: a */
    public void m1757a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2396n == null) {
                this.f2396n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2396n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: a */
    protected void m1754a(String str) {
        this.f2387e.mo3740K();
        C0088f fVar = this.f2399q;
        if (fVar != null) {
            fVar.f309c++;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0662a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((parseInt / 1080.0f) * width);
                        int i3 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i2;
                        float f2 = i3;
                        float f3 = i2 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i3 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0662a generateDefaultLayoutParams() {
        return new C0662a(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0662a(layoutParams);
    }

    @Override // android.view.ViewGroup
    public C0662a generateLayoutParams(AttributeSet attributeSet) {
        return new C0662a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f2391i;
    }

    public int getMaxWidth() {
        return this.f2390h;
    }

    public int getMinHeight() {
        return this.f2389g;
    }

    public int getMinWidth() {
        return this.f2388f;
    }

    public int getOptimizationLevel() {
        return this.f2387e.m3810M();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0662a aVar = (C0662a) childAt.getLayoutParams();
            C0102f fVar = aVar.f2447k0;
            if ((childAt.getVisibility() != 8 || aVar.f2423X || aVar.f2424Y || isInEditMode) && !aVar.f2425Z) {
                int g = fVar.m3844g();
                int h = fVar.m3842h();
                int s = fVar.m3820s() + g;
                int i6 = fVar.m3840i() + h;
                childAt.layout(g, h, s, i6);
                if ((childAt instanceof C0672f) && (content = ((C0672f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(g, h, s, i6);
                }
            }
        }
        int size = this.f2385c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f2385c.get(i7).m1745a(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0102f a = m1755a(view);
        if ((view instanceof C0671e) && !(a instanceof C0107i)) {
            C0662a aVar = (C0662a) view.getLayoutParams();
            aVar.f2447k0 = new C0107i();
            aVar.f2423X = true;
            ((C0107i) aVar.f2447k0).m3774v(aVar.f2417R);
        }
        if (view instanceof AbstractC0665b) {
            AbstractC0665b bVar = (AbstractC0665b) view;
            bVar.m1747a();
            ((C0662a) view.getLayoutParams()).f2424Y = true;
            if (!this.f2385c.contains(bVar)) {
                this.f2385c.add(bVar);
            }
        }
        this.f2384b.put(view.getId(), view);
        this.f2392j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f2384b.remove(view.getId());
        C0102f a = m1755a(view);
        this.f2387e.m3735c(a);
        this.f2385c.remove(view);
        this.f2386d.remove(a);
        this.f2392j = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f2392j = true;
        this.f2397o = -1;
        this.f2398p = -1;
    }

    public void setConstraintSet(C0666c cVar) {
        this.f2394l = cVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f2384b.remove(getId());
        super.setId(i);
        this.f2384b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f2391i) {
            this.f2391i = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f2390h) {
            this.f2390h = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f2389g) {
            this.f2389g = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f2388f) {
            this.f2388f = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2387e.m3792u(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
