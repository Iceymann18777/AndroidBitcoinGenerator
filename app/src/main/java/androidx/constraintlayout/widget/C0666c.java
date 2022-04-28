package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C0666c {

    /* renamed from: b */
    private static final int[] f2474b = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f2475c = new SparseIntArray();

    /* renamed from: a */
    private HashMap<Integer, C0668b> f2476a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: classes.dex */
    public static class C0668b {

        /* renamed from: A */
        public int f2477A;

        /* renamed from: B */
        public int f2478B;

        /* renamed from: C */
        public int f2479C;

        /* renamed from: D */
        public int f2480D;

        /* renamed from: E */
        public int f2481E;

        /* renamed from: F */
        public int f2482F;

        /* renamed from: G */
        public int f2483G;

        /* renamed from: H */
        public int f2484H;

        /* renamed from: I */
        public int f2485I;

        /* renamed from: J */
        public int f2486J;

        /* renamed from: K */
        public int f2487K;

        /* renamed from: L */
        public int f2488L;

        /* renamed from: M */
        public int f2489M;

        /* renamed from: N */
        public int f2490N;

        /* renamed from: O */
        public int f2491O;

        /* renamed from: P */
        public int f2492P;

        /* renamed from: Q */
        public float f2493Q;

        /* renamed from: R */
        public float f2494R;

        /* renamed from: S */
        public int f2495S;

        /* renamed from: T */
        public int f2496T;

        /* renamed from: U */
        public float f2497U;

        /* renamed from: V */
        public boolean f2498V;

        /* renamed from: W */
        public float f2499W;

        /* renamed from: X */
        public float f2500X;

        /* renamed from: Y */
        public float f2501Y;

        /* renamed from: Z */
        public float f2502Z;

        /* renamed from: a */
        boolean f2503a;

        /* renamed from: a0 */
        public float f2504a0;

        /* renamed from: b */
        public int f2505b;

        /* renamed from: b0 */
        public float f2506b0;

        /* renamed from: c */
        public int f2507c;

        /* renamed from: c0 */
        public float f2508c0;

        /* renamed from: d */
        int f2509d;

        /* renamed from: d0 */
        public float f2510d0;

        /* renamed from: e */
        public int f2511e;

        /* renamed from: e0 */
        public float f2512e0;

        /* renamed from: f */
        public int f2513f;

        /* renamed from: f0 */
        public float f2514f0;

        /* renamed from: g */
        public float f2515g;

        /* renamed from: g0 */
        public float f2516g0;

        /* renamed from: h */
        public int f2517h;

        /* renamed from: h0 */
        public boolean f2518h0;

        /* renamed from: i */
        public int f2519i;

        /* renamed from: i0 */
        public boolean f2520i0;

        /* renamed from: j */
        public int f2521j;

        /* renamed from: j0 */
        public int f2522j0;

        /* renamed from: k */
        public int f2523k;

        /* renamed from: k0 */
        public int f2524k0;

        /* renamed from: l */
        public int f2525l;

        /* renamed from: l0 */
        public int f2526l0;

        /* renamed from: m */
        public int f2527m;

        /* renamed from: m0 */
        public int f2528m0;

        /* renamed from: n */
        public int f2529n;

        /* renamed from: n0 */
        public int f2530n0;

        /* renamed from: o */
        public int f2531o;

        /* renamed from: o0 */
        public int f2532o0;

        /* renamed from: p */
        public int f2533p;

        /* renamed from: p0 */
        public float f2534p0;

        /* renamed from: q */
        public int f2535q;

        /* renamed from: q0 */
        public float f2536q0;

        /* renamed from: r */
        public int f2537r;

        /* renamed from: r0 */
        public boolean f2538r0;

        /* renamed from: s */
        public int f2539s;

        /* renamed from: s0 */
        public int f2540s0;

        /* renamed from: t */
        public int f2541t;

        /* renamed from: t0 */
        public int f2542t0;

        /* renamed from: u */
        public float f2543u;

        /* renamed from: u0 */
        public int[] f2544u0;

        /* renamed from: v */
        public float f2545v;

        /* renamed from: v0 */
        public String f2546v0;

        /* renamed from: w */
        public String f2547w;

        /* renamed from: x */
        public int f2548x;

        /* renamed from: y */
        public int f2549y;

        /* renamed from: z */
        public float f2550z;

        private C0668b() {
            this.f2503a = false;
            this.f2511e = -1;
            this.f2513f = -1;
            this.f2515g = -1.0f;
            this.f2517h = -1;
            this.f2519i = -1;
            this.f2521j = -1;
            this.f2523k = -1;
            this.f2525l = -1;
            this.f2527m = -1;
            this.f2529n = -1;
            this.f2531o = -1;
            this.f2533p = -1;
            this.f2535q = -1;
            this.f2537r = -1;
            this.f2539s = -1;
            this.f2541t = -1;
            this.f2543u = 0.5f;
            this.f2545v = 0.5f;
            this.f2547w = null;
            this.f2548x = -1;
            this.f2549y = 0;
            this.f2550z = 0.0f;
            this.f2477A = -1;
            this.f2478B = -1;
            this.f2479C = -1;
            this.f2480D = -1;
            this.f2481E = -1;
            this.f2482F = -1;
            this.f2483G = -1;
            this.f2484H = -1;
            this.f2485I = -1;
            this.f2486J = 0;
            this.f2487K = -1;
            this.f2488L = -1;
            this.f2489M = -1;
            this.f2490N = -1;
            this.f2491O = -1;
            this.f2492P = -1;
            this.f2493Q = 0.0f;
            this.f2494R = 0.0f;
            this.f2495S = 0;
            this.f2496T = 0;
            this.f2497U = 1.0f;
            this.f2498V = false;
            this.f2499W = 0.0f;
            this.f2500X = 0.0f;
            this.f2501Y = 0.0f;
            this.f2502Z = 0.0f;
            this.f2504a0 = 1.0f;
            this.f2506b0 = 1.0f;
            this.f2508c0 = Float.NaN;
            this.f2510d0 = Float.NaN;
            this.f2512e0 = 0.0f;
            this.f2514f0 = 0.0f;
            this.f2516g0 = 0.0f;
            this.f2518h0 = false;
            this.f2520i0 = false;
            this.f2522j0 = 0;
            this.f2524k0 = 0;
            this.f2526l0 = -1;
            this.f2528m0 = -1;
            this.f2530n0 = -1;
            this.f2532o0 = -1;
            this.f2534p0 = 1.0f;
            this.f2536q0 = 1.0f;
            this.f2538r0 = false;
            this.f2540s0 = -1;
            this.f2542t0 = -1;
        }

        /* renamed from: a */
        private void m1734a(int i, ConstraintLayout.C0662a aVar) {
            this.f2509d = i;
            this.f2517h = aVar.f2432d;
            this.f2519i = aVar.f2434e;
            this.f2521j = aVar.f2436f;
            this.f2523k = aVar.f2438g;
            this.f2525l = aVar.f2440h;
            this.f2527m = aVar.f2442i;
            this.f2529n = aVar.f2444j;
            this.f2531o = aVar.f2446k;
            this.f2533p = aVar.f2448l;
            this.f2535q = aVar.f2453p;
            this.f2537r = aVar.f2454q;
            this.f2539s = aVar.f2455r;
            this.f2541t = aVar.f2456s;
            this.f2543u = aVar.f2463z;
            this.f2545v = aVar.f2400A;
            this.f2547w = aVar.f2401B;
            this.f2548x = aVar.f2450m;
            this.f2549y = aVar.f2451n;
            this.f2550z = aVar.f2452o;
            this.f2477A = aVar.f2415P;
            this.f2478B = aVar.f2416Q;
            this.f2479C = aVar.f2417R;
            this.f2515g = aVar.f2430c;
            this.f2511e = aVar.f2426a;
            this.f2513f = aVar.f2428b;
            this.f2505b = ((ViewGroup.MarginLayoutParams) aVar).width;
            this.f2507c = ((ViewGroup.MarginLayoutParams) aVar).height;
            this.f2480D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            this.f2481E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            this.f2482F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            this.f2483G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            this.f2493Q = aVar.f2404E;
            this.f2494R = aVar.f2403D;
            this.f2496T = aVar.f2406G;
            this.f2495S = aVar.f2405F;
            boolean z = aVar.f2418S;
            this.f2518h0 = z;
            this.f2520i0 = aVar.f2419T;
            this.f2522j0 = aVar.f2407H;
            this.f2524k0 = aVar.f2408I;
            this.f2518h0 = z;
            this.f2526l0 = aVar.f2411L;
            this.f2528m0 = aVar.f2412M;
            this.f2530n0 = aVar.f2409J;
            this.f2532o0 = aVar.f2410K;
            this.f2534p0 = aVar.f2413N;
            this.f2536q0 = aVar.f2414O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f2484H = aVar.getMarginEnd();
                this.f2485I = aVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m1733a(int i, C0669d.C0670a aVar) {
            m1734a(i, (ConstraintLayout.C0662a) aVar);
            this.f2497U = aVar.f2552m0;
            this.f2500X = aVar.f2555p0;
            this.f2501Y = aVar.f2556q0;
            this.f2502Z = aVar.f2557r0;
            this.f2504a0 = aVar.f2558s0;
            this.f2506b0 = aVar.f2559t0;
            this.f2508c0 = aVar.f2560u0;
            this.f2510d0 = aVar.f2561v0;
            this.f2512e0 = aVar.f2562w0;
            this.f2514f0 = aVar.f2563x0;
            this.f2516g0 = aVar.f2564y0;
            this.f2499W = aVar.f2554o0;
            this.f2498V = aVar.f2553n0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m1731a(AbstractC0665b bVar, int i, C0669d.C0670a aVar) {
            m1733a(i, aVar);
            if (bVar instanceof C0664a) {
                this.f2542t0 = 1;
                C0664a aVar2 = (C0664a) bVar;
                this.f2540s0 = aVar2.getType();
                this.f2544u0 = aVar2.getReferencedIds();
            }
        }

        /* renamed from: a */
        public void m1732a(ConstraintLayout.C0662a aVar) {
            aVar.f2432d = this.f2517h;
            aVar.f2434e = this.f2519i;
            aVar.f2436f = this.f2521j;
            aVar.f2438g = this.f2523k;
            aVar.f2440h = this.f2525l;
            aVar.f2442i = this.f2527m;
            aVar.f2444j = this.f2529n;
            aVar.f2446k = this.f2531o;
            aVar.f2448l = this.f2533p;
            aVar.f2453p = this.f2535q;
            aVar.f2454q = this.f2537r;
            aVar.f2455r = this.f2539s;
            aVar.f2456s = this.f2541t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = this.f2480D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = this.f2481E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = this.f2482F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = this.f2483G;
            aVar.f2461x = this.f2492P;
            aVar.f2462y = this.f2491O;
            aVar.f2463z = this.f2543u;
            aVar.f2400A = this.f2545v;
            aVar.f2450m = this.f2548x;
            aVar.f2451n = this.f2549y;
            aVar.f2452o = this.f2550z;
            aVar.f2401B = this.f2547w;
            aVar.f2415P = this.f2477A;
            aVar.f2416Q = this.f2478B;
            aVar.f2404E = this.f2493Q;
            aVar.f2403D = this.f2494R;
            aVar.f2406G = this.f2496T;
            aVar.f2405F = this.f2495S;
            aVar.f2418S = this.f2518h0;
            aVar.f2419T = this.f2520i0;
            aVar.f2407H = this.f2522j0;
            aVar.f2408I = this.f2524k0;
            aVar.f2411L = this.f2526l0;
            aVar.f2412M = this.f2528m0;
            aVar.f2409J = this.f2530n0;
            aVar.f2410K = this.f2532o0;
            aVar.f2413N = this.f2534p0;
            aVar.f2414O = this.f2536q0;
            aVar.f2417R = this.f2479C;
            aVar.f2430c = this.f2515g;
            aVar.f2426a = this.f2511e;
            aVar.f2428b = this.f2513f;
            ((ViewGroup.MarginLayoutParams) aVar).width = this.f2505b;
            ((ViewGroup.MarginLayoutParams) aVar).height = this.f2507c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.f2485I);
                aVar.setMarginEnd(this.f2484H);
            }
            aVar.m1748a();
        }

        public C0668b clone() {
            C0668b bVar = new C0668b();
            bVar.f2503a = this.f2503a;
            bVar.f2505b = this.f2505b;
            bVar.f2507c = this.f2507c;
            bVar.f2511e = this.f2511e;
            bVar.f2513f = this.f2513f;
            bVar.f2515g = this.f2515g;
            bVar.f2517h = this.f2517h;
            bVar.f2519i = this.f2519i;
            bVar.f2521j = this.f2521j;
            bVar.f2523k = this.f2523k;
            bVar.f2525l = this.f2525l;
            bVar.f2527m = this.f2527m;
            bVar.f2529n = this.f2529n;
            bVar.f2531o = this.f2531o;
            bVar.f2533p = this.f2533p;
            bVar.f2535q = this.f2535q;
            bVar.f2537r = this.f2537r;
            bVar.f2539s = this.f2539s;
            bVar.f2541t = this.f2541t;
            bVar.f2543u = this.f2543u;
            bVar.f2545v = this.f2545v;
            bVar.f2547w = this.f2547w;
            bVar.f2477A = this.f2477A;
            bVar.f2478B = this.f2478B;
            bVar.f2543u = this.f2543u;
            bVar.f2543u = this.f2543u;
            bVar.f2543u = this.f2543u;
            bVar.f2543u = this.f2543u;
            bVar.f2543u = this.f2543u;
            bVar.f2479C = this.f2479C;
            bVar.f2480D = this.f2480D;
            bVar.f2481E = this.f2481E;
            bVar.f2482F = this.f2482F;
            bVar.f2483G = this.f2483G;
            bVar.f2484H = this.f2484H;
            bVar.f2485I = this.f2485I;
            bVar.f2486J = this.f2486J;
            bVar.f2487K = this.f2487K;
            bVar.f2488L = this.f2488L;
            bVar.f2489M = this.f2489M;
            bVar.f2490N = this.f2490N;
            bVar.f2491O = this.f2491O;
            bVar.f2492P = this.f2492P;
            bVar.f2493Q = this.f2493Q;
            bVar.f2494R = this.f2494R;
            bVar.f2495S = this.f2495S;
            bVar.f2496T = this.f2496T;
            bVar.f2497U = this.f2497U;
            bVar.f2498V = this.f2498V;
            bVar.f2499W = this.f2499W;
            bVar.f2500X = this.f2500X;
            bVar.f2501Y = this.f2501Y;
            bVar.f2502Z = this.f2502Z;
            bVar.f2504a0 = this.f2504a0;
            bVar.f2506b0 = this.f2506b0;
            bVar.f2508c0 = this.f2508c0;
            bVar.f2510d0 = this.f2510d0;
            bVar.f2512e0 = this.f2512e0;
            bVar.f2514f0 = this.f2514f0;
            bVar.f2516g0 = this.f2516g0;
            bVar.f2518h0 = this.f2518h0;
            bVar.f2520i0 = this.f2520i0;
            bVar.f2522j0 = this.f2522j0;
            bVar.f2524k0 = this.f2524k0;
            bVar.f2526l0 = this.f2526l0;
            bVar.f2528m0 = this.f2528m0;
            bVar.f2530n0 = this.f2530n0;
            bVar.f2532o0 = this.f2532o0;
            bVar.f2534p0 = this.f2534p0;
            bVar.f2536q0 = this.f2536q0;
            bVar.f2540s0 = this.f2540s0;
            bVar.f2542t0 = this.f2542t0;
            int[] iArr = this.f2544u0;
            if (iArr != null) {
                bVar.f2544u0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f2548x = this.f2548x;
            bVar.f2549y = this.f2549y;
            bVar.f2550z = this.f2550z;
            bVar.f2538r0 = this.f2538r0;
            return bVar;
        }
    }

    static {
        f2475c.append(C0674h.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f2475c.append(C0674h.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f2475c.append(C0674h.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f2475c.append(C0674h.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f2475c.append(C0674h.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f2475c.append(C0674h.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f2475c.append(C0674h.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f2475c.append(C0674h.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f2475c.append(C0674h.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f2475c.append(C0674h.ConstraintSet_layout_editor_absoluteX, 6);
        f2475c.append(C0674h.ConstraintSet_layout_editor_absoluteY, 7);
        f2475c.append(C0674h.ConstraintSet_layout_constraintGuide_begin, 17);
        f2475c.append(C0674h.ConstraintSet_layout_constraintGuide_end, 18);
        f2475c.append(C0674h.ConstraintSet_layout_constraintGuide_percent, 19);
        f2475c.append(C0674h.ConstraintSet_android_orientation, 27);
        f2475c.append(C0674h.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f2475c.append(C0674h.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f2475c.append(C0674h.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f2475c.append(C0674h.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f2475c.append(C0674h.ConstraintSet_layout_goneMarginLeft, 13);
        f2475c.append(C0674h.ConstraintSet_layout_goneMarginTop, 16);
        f2475c.append(C0674h.ConstraintSet_layout_goneMarginRight, 14);
        f2475c.append(C0674h.ConstraintSet_layout_goneMarginBottom, 11);
        f2475c.append(C0674h.ConstraintSet_layout_goneMarginStart, 15);
        f2475c.append(C0674h.ConstraintSet_layout_goneMarginEnd, 12);
        f2475c.append(C0674h.ConstraintSet_layout_constraintVertical_weight, 40);
        f2475c.append(C0674h.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f2475c.append(C0674h.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f2475c.append(C0674h.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f2475c.append(C0674h.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f2475c.append(C0674h.ConstraintSet_layout_constraintVertical_bias, 37);
        f2475c.append(C0674h.ConstraintSet_layout_constraintDimensionRatio, 5);
        f2475c.append(C0674h.ConstraintSet_layout_constraintLeft_creator, 75);
        f2475c.append(C0674h.ConstraintSet_layout_constraintTop_creator, 75);
        f2475c.append(C0674h.ConstraintSet_layout_constraintRight_creator, 75);
        f2475c.append(C0674h.ConstraintSet_layout_constraintBottom_creator, 75);
        f2475c.append(C0674h.ConstraintSet_layout_constraintBaseline_creator, 75);
        f2475c.append(C0674h.ConstraintSet_android_layout_marginLeft, 24);
        f2475c.append(C0674h.ConstraintSet_android_layout_marginRight, 28);
        f2475c.append(C0674h.ConstraintSet_android_layout_marginStart, 31);
        f2475c.append(C0674h.ConstraintSet_android_layout_marginEnd, 8);
        f2475c.append(C0674h.ConstraintSet_android_layout_marginTop, 34);
        f2475c.append(C0674h.ConstraintSet_android_layout_marginBottom, 2);
        f2475c.append(C0674h.ConstraintSet_android_layout_width, 23);
        f2475c.append(C0674h.ConstraintSet_android_layout_height, 21);
        f2475c.append(C0674h.ConstraintSet_android_visibility, 22);
        f2475c.append(C0674h.ConstraintSet_android_alpha, 43);
        f2475c.append(C0674h.ConstraintSet_android_elevation, 44);
        f2475c.append(C0674h.ConstraintSet_android_rotationX, 45);
        f2475c.append(C0674h.ConstraintSet_android_rotationY, 46);
        f2475c.append(C0674h.ConstraintSet_android_rotation, 60);
        f2475c.append(C0674h.ConstraintSet_android_scaleX, 47);
        f2475c.append(C0674h.ConstraintSet_android_scaleY, 48);
        f2475c.append(C0674h.ConstraintSet_android_transformPivotX, 49);
        f2475c.append(C0674h.ConstraintSet_android_transformPivotY, 50);
        f2475c.append(C0674h.ConstraintSet_android_translationX, 51);
        f2475c.append(C0674h.ConstraintSet_android_translationY, 52);
        f2475c.append(C0674h.ConstraintSet_android_translationZ, 53);
        f2475c.append(C0674h.ConstraintSet_layout_constraintWidth_default, 54);
        f2475c.append(C0674h.ConstraintSet_layout_constraintHeight_default, 55);
        f2475c.append(C0674h.ConstraintSet_layout_constraintWidth_max, 56);
        f2475c.append(C0674h.ConstraintSet_layout_constraintHeight_max, 57);
        f2475c.append(C0674h.ConstraintSet_layout_constraintWidth_min, 58);
        f2475c.append(C0674h.ConstraintSet_layout_constraintHeight_min, 59);
        f2475c.append(C0674h.ConstraintSet_layout_constraintCircle, 61);
        f2475c.append(C0674h.ConstraintSet_layout_constraintCircleRadius, 62);
        f2475c.append(C0674h.ConstraintSet_layout_constraintCircleAngle, 63);
        f2475c.append(C0674h.ConstraintSet_android_id, 38);
        f2475c.append(C0674h.ConstraintSet_layout_constraintWidth_percent, 69);
        f2475c.append(C0674h.ConstraintSet_layout_constraintHeight_percent, 70);
        f2475c.append(C0674h.ConstraintSet_chainUseRtl, 71);
        f2475c.append(C0674h.ConstraintSet_barrierDirection, 72);
        f2475c.append(C0674h.ConstraintSet_constraint_referenced_ids, 73);
        f2475c.append(C0674h.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: a */
    private static int m1739a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    private C0668b m1740a(Context context, AttributeSet attributeSet) {
        C0668b bVar = new C0668b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0674h.ConstraintSet);
        m1736a(bVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    /* renamed from: a */
    private void m1736a(C0668b bVar, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f2475c.get(index);
            switch (i2) {
                case 1:
                    bVar.f2533p = m1739a(typedArray, index, bVar.f2533p);
                    break;
                case 2:
                    bVar.f2483G = typedArray.getDimensionPixelSize(index, bVar.f2483G);
                    break;
                case 3:
                    bVar.f2531o = m1739a(typedArray, index, bVar.f2531o);
                    break;
                case 4:
                    bVar.f2529n = m1739a(typedArray, index, bVar.f2529n);
                    break;
                case 5:
                    bVar.f2547w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.f2477A = typedArray.getDimensionPixelOffset(index, bVar.f2477A);
                    break;
                case 7:
                    bVar.f2478B = typedArray.getDimensionPixelOffset(index, bVar.f2478B);
                    break;
                case 8:
                    bVar.f2484H = typedArray.getDimensionPixelSize(index, bVar.f2484H);
                    break;
                case 9:
                    bVar.f2541t = m1739a(typedArray, index, bVar.f2541t);
                    break;
                case 10:
                    bVar.f2539s = m1739a(typedArray, index, bVar.f2539s);
                    break;
                case 11:
                    bVar.f2490N = typedArray.getDimensionPixelSize(index, bVar.f2490N);
                    break;
                case 12:
                    bVar.f2491O = typedArray.getDimensionPixelSize(index, bVar.f2491O);
                    break;
                case 13:
                    bVar.f2487K = typedArray.getDimensionPixelSize(index, bVar.f2487K);
                    break;
                case 14:
                    bVar.f2489M = typedArray.getDimensionPixelSize(index, bVar.f2489M);
                    break;
                case 15:
                    bVar.f2492P = typedArray.getDimensionPixelSize(index, bVar.f2492P);
                    break;
                case 16:
                    bVar.f2488L = typedArray.getDimensionPixelSize(index, bVar.f2488L);
                    break;
                case 17:
                    bVar.f2511e = typedArray.getDimensionPixelOffset(index, bVar.f2511e);
                    break;
                case 18:
                    bVar.f2513f = typedArray.getDimensionPixelOffset(index, bVar.f2513f);
                    break;
                case 19:
                    bVar.f2515g = typedArray.getFloat(index, bVar.f2515g);
                    break;
                case 20:
                    bVar.f2543u = typedArray.getFloat(index, bVar.f2543u);
                    break;
                case 21:
                    bVar.f2507c = typedArray.getLayoutDimension(index, bVar.f2507c);
                    break;
                case 22:
                    bVar.f2486J = typedArray.getInt(index, bVar.f2486J);
                    bVar.f2486J = f2474b[bVar.f2486J];
                    break;
                case 23:
                    bVar.f2505b = typedArray.getLayoutDimension(index, bVar.f2505b);
                    break;
                case 24:
                    bVar.f2480D = typedArray.getDimensionPixelSize(index, bVar.f2480D);
                    break;
                case 25:
                    bVar.f2517h = m1739a(typedArray, index, bVar.f2517h);
                    break;
                case 26:
                    bVar.f2519i = m1739a(typedArray, index, bVar.f2519i);
                    break;
                case 27:
                    bVar.f2479C = typedArray.getInt(index, bVar.f2479C);
                    break;
                case 28:
                    bVar.f2481E = typedArray.getDimensionPixelSize(index, bVar.f2481E);
                    break;
                case 29:
                    bVar.f2521j = m1739a(typedArray, index, bVar.f2521j);
                    break;
                case 30:
                    bVar.f2523k = m1739a(typedArray, index, bVar.f2523k);
                    break;
                case 31:
                    bVar.f2485I = typedArray.getDimensionPixelSize(index, bVar.f2485I);
                    break;
                case 32:
                    bVar.f2535q = m1739a(typedArray, index, bVar.f2535q);
                    break;
                case 33:
                    bVar.f2537r = m1739a(typedArray, index, bVar.f2537r);
                    break;
                case 34:
                    bVar.f2482F = typedArray.getDimensionPixelSize(index, bVar.f2482F);
                    break;
                case 35:
                    bVar.f2527m = m1739a(typedArray, index, bVar.f2527m);
                    break;
                case 36:
                    bVar.f2525l = m1739a(typedArray, index, bVar.f2525l);
                    break;
                case 37:
                    bVar.f2545v = typedArray.getFloat(index, bVar.f2545v);
                    break;
                case 38:
                    bVar.f2509d = typedArray.getResourceId(index, bVar.f2509d);
                    break;
                case 39:
                    bVar.f2494R = typedArray.getFloat(index, bVar.f2494R);
                    break;
                case 40:
                    bVar.f2493Q = typedArray.getFloat(index, bVar.f2493Q);
                    break;
                case 41:
                    bVar.f2495S = typedArray.getInt(index, bVar.f2495S);
                    break;
                case 42:
                    bVar.f2496T = typedArray.getInt(index, bVar.f2496T);
                    break;
                case 43:
                    bVar.f2497U = typedArray.getFloat(index, bVar.f2497U);
                    break;
                case 44:
                    bVar.f2498V = true;
                    bVar.f2499W = typedArray.getDimension(index, bVar.f2499W);
                    break;
                case 45:
                    bVar.f2501Y = typedArray.getFloat(index, bVar.f2501Y);
                    break;
                case 46:
                    bVar.f2502Z = typedArray.getFloat(index, bVar.f2502Z);
                    break;
                case 47:
                    bVar.f2504a0 = typedArray.getFloat(index, bVar.f2504a0);
                    break;
                case 48:
                    bVar.f2506b0 = typedArray.getFloat(index, bVar.f2506b0);
                    break;
                case 49:
                    bVar.f2508c0 = typedArray.getFloat(index, bVar.f2508c0);
                    break;
                case 50:
                    bVar.f2510d0 = typedArray.getFloat(index, bVar.f2510d0);
                    break;
                case 51:
                    bVar.f2512e0 = typedArray.getDimension(index, bVar.f2512e0);
                    break;
                case 52:
                    bVar.f2514f0 = typedArray.getDimension(index, bVar.f2514f0);
                    break;
                case 53:
                    bVar.f2516g0 = typedArray.getDimension(index, bVar.f2516g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            bVar.f2500X = typedArray.getFloat(index, bVar.f2500X);
                            continue;
                        case 61:
                            bVar.f2548x = m1739a(typedArray, index, bVar.f2548x);
                            continue;
                        case 62:
                            bVar.f2549y = typedArray.getDimensionPixelSize(index, bVar.f2549y);
                            continue;
                        case 63:
                            bVar.f2550z = typedArray.getFloat(index, bVar.f2550z);
                            continue;
                        default:
                            switch (i2) {
                                case 69:
                                    bVar.f2534p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    bVar.f2536q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    bVar.f2540s0 = typedArray.getInt(index, bVar.f2540s0);
                                    break;
                                case 73:
                                    bVar.f2546v0 = typedArray.getString(index);
                                    break;
                                case 74:
                                    bVar.f2538r0 = typedArray.getBoolean(index, bVar.f2538r0);
                                    break;
                                case 75:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    sb.append(str);
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(f2475c.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    sb.append(str);
                                    sb.append(Integer.toHexString(index));
                                    sb.append("   ");
                                    sb.append(f2475c.get(index));
                                    Log.w("ConstraintSet", sb.toString());
                                    continue;
                            }
                    }
            }
        }
    }

    /* renamed from: a */
    private int[] m1738a(View view, String str) {
        int i;
        Object a;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        for (String str2 : split) {
            String trim = str2.trim();
            try {
                i = C0673g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) view.getParent()).m1758a(0, trim)) != null && (a instanceof Integer)) {
                i = ((Integer) a).intValue();
            }
            i2++;
            iArr[i2] = i;
        }
        return i2 != split.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* renamed from: a */
    public void m1741a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0668b a = m1740a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f2503a = true;
                    }
                    this.f2476a.put(Integer.valueOf(a.f2509d), a);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1737a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2476a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f2476a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0668b bVar = this.f2476a.get(Integer.valueOf(id));
                    if (childAt instanceof C0664a) {
                        bVar.f2542t0 = 1;
                    }
                    int i2 = bVar.f2542t0;
                    if (i2 != -1 && i2 == 1) {
                        C0664a aVar = (C0664a) childAt;
                        aVar.setId(id);
                        aVar.setType(bVar.f2540s0);
                        aVar.setAllowsGoneWidget(bVar.f2538r0);
                        int[] iArr = bVar.f2544u0;
                        if (iArr != null) {
                            aVar.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f2546v0;
                            if (str != null) {
                                bVar.f2544u0 = m1738a(aVar, str);
                                aVar.setReferencedIds(bVar.f2544u0);
                            }
                        }
                    }
                    ConstraintLayout.C0662a aVar2 = (ConstraintLayout.C0662a) childAt.getLayoutParams();
                    bVar.m1732a(aVar2);
                    childAt.setLayoutParams(aVar2);
                    childAt.setVisibility(bVar.f2486J);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(bVar.f2497U);
                        childAt.setRotation(bVar.f2500X);
                        childAt.setRotationX(bVar.f2501Y);
                        childAt.setRotationY(bVar.f2502Z);
                        childAt.setScaleX(bVar.f2504a0);
                        childAt.setScaleY(bVar.f2506b0);
                        if (!Float.isNaN(bVar.f2508c0)) {
                            childAt.setPivotX(bVar.f2508c0);
                        }
                        if (!Float.isNaN(bVar.f2510d0)) {
                            childAt.setPivotY(bVar.f2510d0);
                        }
                        childAt.setTranslationX(bVar.f2512e0);
                        childAt.setTranslationY(bVar.f2514f0);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(bVar.f2516g0);
                            if (bVar.f2498V) {
                                childAt.setElevation(bVar.f2499W);
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0668b bVar2 = this.f2476a.get(num);
            int i3 = bVar2.f2542t0;
            if (i3 != -1 && i3 == 1) {
                C0664a aVar3 = new C0664a(constraintLayout.getContext());
                aVar3.setId(num.intValue());
                int[] iArr2 = bVar2.f2544u0;
                if (iArr2 != null) {
                    aVar3.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f2546v0;
                    if (str2 != null) {
                        bVar2.f2544u0 = m1738a(aVar3, str2);
                        aVar3.setReferencedIds(bVar2.f2544u0);
                    }
                }
                aVar3.setType(bVar2.f2540s0);
                ConstraintLayout.C0662a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar3.m1747a();
                bVar2.m1732a(generateDefaultLayoutParams);
                constraintLayout.addView(aVar3, generateDefaultLayoutParams);
            }
            if (bVar2.f2503a) {
                View eVar = new C0671e(constraintLayout.getContext());
                eVar.setId(num.intValue());
                ConstraintLayout.C0662a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                bVar2.m1732a(generateDefaultLayoutParams2);
                constraintLayout.addView(eVar, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: a */
    public void m1735a(C0669d dVar) {
        int childCount = dVar.getChildCount();
        this.f2476a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = dVar.getChildAt(i);
            C0669d.C0670a aVar = (C0669d.C0670a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f2476a.containsKey(Integer.valueOf(id))) {
                    this.f2476a.put(Integer.valueOf(id), new C0668b());
                }
                C0668b bVar = this.f2476a.get(Integer.valueOf(id));
                if (childAt instanceof AbstractC0665b) {
                    bVar.m1731a((AbstractC0665b) childAt, id, aVar);
                }
                bVar.m1733a(id, aVar);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
