package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.graphics.drawable.C0698a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.C0000a;
import p000a.p001a.C0004e;
import p000a.p001a.p004l.p005a.C0012a;
import p000a.p013d.C0067a;
import p000a.p013d.C0072d;
import p000a.p013d.C0073e;
import p000a.p013d.C0081h;
import p000a.p018g.p019d.C0124a;
import p000a.p018g.p021e.C0141a;
import p000a.p046o.p047a.p048a.C0394c;
import p000a.p046o.p047a.p048a.C0404i;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C0606j {

    /* renamed from: h */
    private static C0606j f2176h;

    /* renamed from: a */
    private WeakHashMap<Context, C0081h<ColorStateList>> f2184a;

    /* renamed from: b */
    private C0067a<String, AbstractC0610d> f2185b;

    /* renamed from: c */
    private C0081h<String> f2186c;

    /* renamed from: d */
    private final WeakHashMap<Context, C0072d<WeakReference<Drawable.ConstantState>>> f2187d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f2188e;

    /* renamed from: f */
    private boolean f2189f;

    /* renamed from: g */
    private static final PorterDuff.Mode f2175g = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static final C0609c f2177i = new C0609c(6);

    /* renamed from: j */
    private static final int[] f2178j = {C0004e.abc_textfield_search_default_mtrl_alpha, C0004e.abc_textfield_default_mtrl_alpha, C0004e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: k */
    private static final int[] f2179k = {C0004e.abc_ic_commit_search_api_mtrl_alpha, C0004e.abc_seekbar_tick_mark_material, C0004e.abc_ic_menu_share_mtrl_alpha, C0004e.abc_ic_menu_copy_mtrl_am_alpha, C0004e.abc_ic_menu_cut_mtrl_alpha, C0004e.abc_ic_menu_selectall_mtrl_alpha, C0004e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: l */
    private static final int[] f2180l = {C0004e.abc_textfield_activated_mtrl_alpha, C0004e.abc_textfield_search_activated_mtrl_alpha, C0004e.abc_cab_background_top_mtrl_alpha, C0004e.abc_text_cursor_material, C0004e.abc_text_select_handle_left_mtrl_dark, C0004e.abc_text_select_handle_middle_mtrl_dark, C0004e.abc_text_select_handle_right_mtrl_dark, C0004e.abc_text_select_handle_left_mtrl_light, C0004e.abc_text_select_handle_middle_mtrl_light, C0004e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: m */
    private static final int[] f2181m = {C0004e.abc_popup_background_mtrl_mult, C0004e.abc_cab_background_internal_bg, C0004e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: n */
    private static final int[] f2182n = {C0004e.abc_tab_indicator_material, C0004e.abc_textfield_search_material};

    /* renamed from: o */
    private static final int[] f2183o = {C0004e.abc_btn_check_material, C0004e.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.j$a */
    /* loaded from: classes.dex */
    public static class C0607a implements AbstractC0610d {
        C0607a() {
        }

        @Override // androidx.appcompat.widget.C0606j.AbstractC0610d
        /* renamed from: a */
        public Drawable mo1980a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0012a.m4253b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j$b */
    /* loaded from: classes.dex */
    public static class C0608b implements AbstractC0610d {
        C0608b() {
        }

        @Override // androidx.appcompat.widget.C0606j.AbstractC0610d
        /* renamed from: a */
        public Drawable mo1980a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0394c.m2759a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j$c */
    /* loaded from: classes.dex */
    public static class C0609c extends C0073e<Integer, PorterDuffColorFilter> {
        public C0609c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m1981b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: a */
        PorterDuffColorFilter m1983a(int i, PorterDuff.Mode mode) {
            return m4046b(Integer.valueOf(m1981b(i, mode)));
        }

        /* renamed from: a */
        PorterDuffColorFilter m1982a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m4048a((C0609c) Integer.valueOf(m1981b(i, mode)), (Integer) porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j$d */
    /* loaded from: classes.dex */
    public interface AbstractC0610d {
        /* renamed from: a */
        Drawable mo1980a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.j$e */
    /* loaded from: classes.dex */
    public static class C0611e implements AbstractC0610d {
        C0611e() {
        }

        @Override // androidx.appcompat.widget.C0606j.AbstractC0610d
        /* renamed from: a */
        public Drawable mo1980a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0404i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m1997a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: a */
    static PorterDuff.Mode m2012a(int i) {
        if (i == C0004e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m2011a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0606j.class) {
            a = f2177i.m1983a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f2177i.m1982a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m2001a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2011a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m2005a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList b = m1992b(context, i);
        if (b != null) {
            if (C0580c0.m2106a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable h = C0698a.m1591h(drawable);
            C0698a.m1603a(h, b);
            PorterDuff.Mode a = m2012a(i);
            if (a == null) {
                return h;
            }
            C0698a.m1600a(h, a);
            return h;
        }
        if (i == C0004e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            m1999a(layerDrawable.findDrawableByLayerId(16908288), C0628o0.m1919b(context, C0000a.colorControlNormal), f2175g);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0000a.colorControlNormal;
        } else if (i == C0004e.abc_ratingbar_material || i == C0004e.abc_ratingbar_indicator_material || i == C0004e.abc_ratingbar_small_material) {
            layerDrawable = (LayerDrawable) drawable;
            m1999a(layerDrawable.findDrawableByLayerId(16908288), C0628o0.m1921a(context, C0000a.colorControlNormal), f2175g);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0000a.colorControlActivated;
        } else if (m2007a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
        m1999a(findDrawableByLayerId, C0628o0.m1919b(context, i2), f2175g);
        m1999a(layerDrawable.findDrawableByLayerId(16908301), C0628o0.m1919b(context, C0000a.colorControlActivated), f2175g);
        return drawable;
    }

    /* renamed from: a */
    private synchronized Drawable m2004a(Context context, long j) {
        C0072d<WeakReference<Drawable.ConstantState>> dVar = this.f2187d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> b = dVar.m4056b(j);
        if (b != null) {
            Drawable.ConstantState constantState = b.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.m4060a(j);
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C0606j m2013a() {
        C0606j jVar;
        synchronized (C0606j.class) {
            if (f2176h == null) {
                f2176h = new C0606j();
                m1996a(f2176h);
            }
            jVar = f2176h;
        }
        return jVar;
    }

    /* renamed from: a */
    private void m2008a(Context context, int i, ColorStateList colorStateList) {
        if (this.f2184a == null) {
            this.f2184a = new WeakHashMap<>();
        }
        C0081h<ColorStateList> hVar = this.f2184a.get(context);
        if (hVar == null) {
            hVar = new C0081h<>();
            this.f2184a.put(context, hVar);
        }
        hVar.m4009a(i, colorStateList);
    }

    /* renamed from: a */
    private static void m1999a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0580c0.m2106a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f2175g;
        }
        drawable.setColorFilter(m2011a(i, mode));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1998a(Drawable drawable, C0634r0 r0Var, int[] iArr) {
        if (!C0580c0.m2106a(drawable) || drawable.mutate() == drawable) {
            if (r0Var.f2275d || r0Var.f2274c) {
                drawable.setColorFilter(m2001a(r0Var.f2275d ? r0Var.f2272a : null, r0Var.f2274c ? r0Var.f2273b : f2175g, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m1996a(C0606j jVar) {
        if (Build.VERSION.SDK_INT < 24) {
            jVar.m1995a("vector", new C0611e());
            jVar.m1995a("animated-vector", new C0608b());
            jVar.m1995a("animated-selector", new C0607a());
        }
    }

    /* renamed from: a */
    private void m1995a(String str, AbstractC0610d dVar) {
        if (this.f2185b == null) {
            this.f2185b = new C0067a<>();
        }
        this.f2185b.put(str, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2007a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0606j.f2175g
            int[] r1 = androidx.appcompat.widget.C0606j.f2178j
            boolean r1 = m1994a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = p000a.p001a.C0000a.colorControlNormal
        L_0x0012:
            r7 = 1
            r1 = -1
            goto L_0x0044
        L_0x0015:
            int[] r1 = androidx.appcompat.widget.C0606j.f2180l
            boolean r1 = m1994a(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = p000a.p001a.C0000a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = androidx.appcompat.widget.C0606j.f2181m
            boolean r1 = m1994a(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = p000a.p001a.C0004e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L_0x0044
        L_0x003c:
            int r1 = p000a.p001a.C0004e.abc_dialog_material_background
            if (r7 != r1) goto L_0x0041
            goto L_0x0012
        L_0x0041:
            r7 = 0
            r1 = -1
            r2 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x0061
            boolean r7 = androidx.appcompat.widget.C0580c0.m2106a(r8)
            if (r7 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0050:
            int r6 = androidx.appcompat.widget.C0628o0.m1919b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m2011a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x0060
            r8.setAlpha(r1)
        L_0x0060:
            return r5
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0606j.m2007a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private synchronized boolean m2003a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0072d<WeakReference<Drawable.ConstantState>> dVar = this.f2187d.get(context);
            if (dVar == null) {
                dVar = new C0072d<>();
                this.f2187d.put(context, dVar);
            }
            dVar.m4051c(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2000a(Drawable drawable) {
        return (drawable instanceof C0404i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    private static boolean m1994a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1993b(Context context) {
        if (!this.f2189f) {
            this.f2189f = true;
            Drawable a = m2009a(context, C0004e.abc_vector_test);
            if (a == null || !m2000a(a)) {
                this.f2189f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: c */
    private ColorStateList m1991c(Context context) {
        return m1990c(context, 0);
    }

    /* renamed from: c */
    private ColorStateList m1990c(Context context, int i) {
        int b = C0628o0.m1919b(context, C0000a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0628o0.f2254b, C0628o0.f2256d, C0628o0.f2255c, C0628o0.f2258f}, new int[]{C0628o0.m1921a(context, C0000a.colorButtonNormal), C0141a.m3669b(b, i), C0141a.m3669b(b, i), i});
    }

    /* renamed from: d */
    private ColorStateList m1989d(Context context) {
        return m1990c(context, C0628o0.m1919b(context, C0000a.colorAccent));
    }

    /* renamed from: d */
    private Drawable m1988d(Context context, int i) {
        if (this.f2188e == null) {
            this.f2188e = new TypedValue();
        }
        TypedValue typedValue = this.f2188e;
        context.getResources().getValue(i, typedValue, true);
        long a = m1997a(typedValue);
        Drawable a2 = m2004a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C0004e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{m2009a(context, C0004e.abc_cab_background_internal_bg), m2009a(context, C0004e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m2003a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: e */
    private ColorStateList m1987e(Context context) {
        return m1990c(context, C0628o0.m1919b(context, C0000a.colorButtonNormal));
    }

    /* renamed from: e */
    private ColorStateList m1986e(Context context, int i) {
        C0081h<ColorStateList> hVar;
        WeakHashMap<Context, C0081h<ColorStateList>> weakHashMap = this.f2184a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.m4007b(i);
    }

    /* renamed from: f */
    private ColorStateList m1985f(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList c = C0628o0.m1918c(context, C0000a.colorSwitchThumbNormal);
        if (c == null || !c.isStateful()) {
            iArr[0] = C0628o0.f2254b;
            iArr2[0] = C0628o0.m1921a(context, C0000a.colorSwitchThumbNormal);
            iArr[1] = C0628o0.f2257e;
            iArr2[1] = C0628o0.m1919b(context, C0000a.colorControlActivated);
            iArr[2] = C0628o0.f2258f;
            iArr2[2] = C0628o0.m1919b(context, C0000a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0628o0.f2254b;
            iArr2[0] = c.getColorForState(iArr[0], 0);
            iArr[1] = C0628o0.f2257e;
            iArr2[1] = C0628o0.m1919b(context, C0000a.colorControlActivated);
            iArr[2] = C0628o0.f2258f;
            iArr2[2] = c.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: f */
    private Drawable m1984f(Context context, int i) {
        int next;
        C0067a<String, AbstractC0610d> aVar = this.f2185b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        C0081h<String> hVar = this.f2186c;
        if (hVar != null) {
            String b = hVar.m4007b(i);
            if ("appcompat_skip_skip".equals(b) || (b != null && this.f2185b.get(b) == null)) {
                return null;
            }
        } else {
            this.f2186c = new C0081h<>();
        }
        if (this.f2188e == null) {
            this.f2188e = new TypedValue();
        }
        TypedValue typedValue = this.f2188e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = m1997a(typedValue);
        Drawable a2 = m2004a(context, a);
        if (a2 != null) {
            return a2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f2186c.m4009a(i, name);
                    AbstractC0610d dVar = this.f2185b.get(name);
                    if (dVar != null) {
                        a2 = dVar.mo1980a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (a2 != null) {
                        a2.setChangingConfigurations(typedValue.changingConfigurations);
                        m2003a(context, a, a2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e);
            }
        }
        if (a2 == null) {
            this.f2186c.m4009a(i, "appcompat_skip_skip");
        }
        return a2;
    }

    /* renamed from: a */
    public synchronized Drawable m2009a(Context context, int i) {
        return m2006a(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable m2006a(Context context, int i, boolean z) {
        Drawable f;
        m1993b(context);
        f = m1984f(context, i);
        if (f == null) {
            f = m1988d(context, i);
        }
        if (f == null) {
            f = C0124a.m3732b(context, i);
        }
        if (f != null) {
            f = m2005a(context, i, z, f);
        }
        if (f != null) {
            C0580c0.m2105b(f);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable m2002a(Context context, C0659y0 y0Var, int i) {
        Drawable f = m1984f(context, i);
        if (f == null) {
            f = y0Var.m1792a(i);
        }
        if (f == null) {
            return null;
        }
        return m2005a(context, i, false, f);
    }

    /* renamed from: a */
    public synchronized void m2010a(Context context) {
        C0072d<WeakReference<Drawable.ConstantState>> dVar = this.f2187d.get(context);
        if (dVar != null) {
            dVar.m4062a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:8:0x000d, B:9:0x0013, B:11:0x0017, B:12:0x001a, B:14:0x001e, B:15:0x0023, B:17:0x0027, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:23:0x0039, B:24:0x003e, B:26:0x0042, B:29:0x0047, B:31:0x004f, B:32:0x0056, B:34:0x005e, B:35:0x0061, B:37:0x0069, B:38:0x006c, B:40:0x0070, B:41:0x0073, B:43:0x0078), top: B:48:0x0001 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.content.res.ColorStateList m1992b(android.content.Context r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.res.ColorStateList r0 = r2.m1986e(r3, r4)     // Catch: all -> 0x007d
            if (r0 != 0) goto L_0x007b
            int r1 = p000a.p001a.C0004e.abc_edit_text_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0013
            int r0 = p000a.p001a.C0002c.abc_tint_edittext     // Catch: all -> 0x007d
        L_0x000d:
            android.content.res.ColorStateList r0 = p000a.p001a.p002k.p003a.C0010a.m4260b(r3, r0)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x0013:
            int r1 = p000a.p001a.C0004e.abc_switch_track_mtrl_alpha     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x001a
            int r0 = p000a.p001a.C0002c.abc_tint_switch_track     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x001a:
            int r1 = p000a.p001a.C0004e.abc_switch_thumb_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0023
            android.content.res.ColorStateList r0 = r2.m1985f(r3)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x0023:
            int r1 = p000a.p001a.C0004e.abc_btn_default_mtrl_shape     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x002c
            android.content.res.ColorStateList r0 = r2.m1987e(r3)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x002c:
            int r1 = p000a.p001a.C0004e.abc_btn_borderless_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0035
            android.content.res.ColorStateList r0 = r2.m1991c(r3)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x0035:
            int r1 = p000a.p001a.C0004e.abc_btn_colored_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x003e
            android.content.res.ColorStateList r0 = r2.m1989d(r3)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x003e:
            int r1 = p000a.p001a.C0004e.abc_spinner_mtrl_am_alpha     // Catch: all -> 0x007d
            if (r4 == r1) goto L_0x0073
            int r1 = p000a.p001a.C0004e.abc_spinner_textfield_background_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0047
            goto L_0x0073
        L_0x0047:
            int[] r1 = androidx.appcompat.widget.C0606j.f2179k     // Catch: all -> 0x007d
            boolean r1 = m1994a(r1, r4)     // Catch: all -> 0x007d
            if (r1 == 0) goto L_0x0056
            int r0 = p000a.p001a.C0000a.colorControlNormal     // Catch: all -> 0x007d
            android.content.res.ColorStateList r0 = androidx.appcompat.widget.C0628o0.m1918c(r3, r0)     // Catch: all -> 0x007d
            goto L_0x0076
        L_0x0056:
            int[] r1 = androidx.appcompat.widget.C0606j.f2182n     // Catch: all -> 0x007d
            boolean r1 = m1994a(r1, r4)     // Catch: all -> 0x007d
            if (r1 == 0) goto L_0x0061
            int r0 = p000a.p001a.C0002c.abc_tint_default     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x0061:
            int[] r1 = androidx.appcompat.widget.C0606j.f2183o     // Catch: all -> 0x007d
            boolean r1 = m1994a(r1, r4)     // Catch: all -> 0x007d
            if (r1 == 0) goto L_0x006c
            int r0 = p000a.p001a.C0002c.abc_tint_btn_checkable     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x006c:
            int r1 = p000a.p001a.C0004e.abc_seekbar_thumb_material     // Catch: all -> 0x007d
            if (r4 != r1) goto L_0x0076
            int r0 = p000a.p001a.C0002c.abc_tint_seek_thumb     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x0073:
            int r0 = p000a.p001a.C0002c.abc_tint_spinner     // Catch: all -> 0x007d
            goto L_0x000d
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r2.m2008a(r3, r4, r0)     // Catch: all -> 0x007d
        L_0x007b:
            monitor-exit(r2)
            return r0
        L_0x007d:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x0081
        L_0x0080:
            throw r3
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0606j.m1992b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
