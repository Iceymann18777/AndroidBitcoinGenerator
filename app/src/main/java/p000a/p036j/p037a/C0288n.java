package p000a.p036j.p037a;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.AbstractC0695e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000a.p013d.C0067a;
import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.j.a.n */
/* loaded from: classes.dex */
public class C0288n {

    /* renamed from: a */
    private static final int[] f938a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final AbstractC0299p f939b;

    /* renamed from: c */
    private static final AbstractC0299p f940c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.n$a */
    /* loaded from: classes.dex */
    public static class RunnableC0289a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f941b;

        RunnableC0289a(ArrayList arrayList) {
            this.f941b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0288n.m2970a(this.f941b, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.n$b */
    /* loaded from: classes.dex */
    public static class RunnableC0290b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f942b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0299p f943c;

        /* renamed from: d */
        final /* synthetic */ View f944d;

        /* renamed from: e */
        final /* synthetic */ ComponentCallbacksC0248c f945e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f946f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f947g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f948h;

        /* renamed from: i */
        final /* synthetic */ Object f949i;

        RunnableC0290b(Object obj, AbstractC0299p pVar, View view, ComponentCallbacksC0248c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f942b = obj;
            this.f943c = pVar;
            this.f944d = view;
            this.f945e = cVar;
            this.f946f = arrayList;
            this.f947g = arrayList2;
            this.f948h = arrayList3;
            this.f949i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f942b;
            if (obj != null) {
                this.f943c.mo2878b(obj, this.f944d);
                this.f947g.addAll(C0288n.m2974a(this.f943c, this.f942b, this.f945e, this.f946f, this.f944d));
            }
            if (this.f948h != null) {
                if (this.f949i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f944d);
                    this.f943c.mo2880a(this.f949i, this.f948h, arrayList);
                }
                this.f948h.clear();
                this.f948h.add(this.f944d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.n$c */
    /* loaded from: classes.dex */
    public static class RunnableC0291c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ComponentCallbacksC0248c f950b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacksC0248c f951c;

        /* renamed from: d */
        final /* synthetic */ boolean f952d;

        /* renamed from: e */
        final /* synthetic */ C0067a f953e;

        /* renamed from: f */
        final /* synthetic */ View f954f;

        /* renamed from: g */
        final /* synthetic */ AbstractC0299p f955g;

        /* renamed from: h */
        final /* synthetic */ Rect f956h;

        RunnableC0291c(ComponentCallbacksC0248c cVar, ComponentCallbacksC0248c cVar2, boolean z, C0067a aVar, View view, AbstractC0299p pVar, Rect rect) {
            this.f950b = cVar;
            this.f951c = cVar2;
            this.f952d = z;
            this.f953e = aVar;
            this.f954f = view;
            this.f955g = pVar;
            this.f956h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0288n.m2984a(this.f950b, this.f951c, this.f952d, (C0067a<String, View>) this.f953e, false);
            View view = this.f954f;
            if (view != null) {
                this.f955g.m2962a(view, this.f956h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.n$d */
    /* loaded from: classes.dex */
    public static class RunnableC0292d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AbstractC0299p f957b;

        /* renamed from: c */
        final /* synthetic */ C0067a f958c;

        /* renamed from: d */
        final /* synthetic */ Object f959d;

        /* renamed from: e */
        final /* synthetic */ C0293e f960e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f961f;

        /* renamed from: g */
        final /* synthetic */ View f962g;

        /* renamed from: h */
        final /* synthetic */ ComponentCallbacksC0248c f963h;

        /* renamed from: i */
        final /* synthetic */ ComponentCallbacksC0248c f964i;

        /* renamed from: j */
        final /* synthetic */ boolean f965j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f966k;

        /* renamed from: l */
        final /* synthetic */ Object f967l;

        /* renamed from: m */
        final /* synthetic */ Rect f968m;

        RunnableC0292d(AbstractC0299p pVar, C0067a aVar, Object obj, C0293e eVar, ArrayList arrayList, View view, ComponentCallbacksC0248c cVar, ComponentCallbacksC0248c cVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f957b = pVar;
            this.f958c = aVar;
            this.f959d = obj;
            this.f960e = eVar;
            this.f961f = arrayList;
            this.f962g = view;
            this.f963h = cVar;
            this.f964i = cVar2;
            this.f965j = z;
            this.f966k = arrayList2;
            this.f967l = obj2;
            this.f968m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0067a<String, View> a = C0288n.m2980a(this.f957b, this.f958c, this.f959d, this.f960e);
            if (a != null) {
                this.f961f.addAll(a.values());
                this.f961f.add(this.f962g);
            }
            C0288n.m2984a(this.f963h, this.f964i, this.f965j, a, false);
            Object obj = this.f959d;
            if (obj != null) {
                this.f957b.mo2875b(obj, this.f966k, this.f961f);
                View a2 = C0288n.m2989a(a, this.f960e, this.f967l, this.f965j);
                if (a2 != null) {
                    this.f957b.m2962a(a2, this.f968m);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.n$e */
    /* loaded from: classes.dex */
    public static class C0293e {

        /* renamed from: a */
        public ComponentCallbacksC0248c f969a;

        /* renamed from: b */
        public boolean f970b;

        /* renamed from: c */
        public C0244a f971c;

        /* renamed from: d */
        public ComponentCallbacksC0248c f972d;

        /* renamed from: e */
        public boolean f973e;

        /* renamed from: f */
        public C0244a f974f;

        C0293e() {
        }
    }

    static {
        f939b = Build.VERSION.SDK_INT >= 21 ? new C0294o() : null;
        f940c = m2992a();
    }

    /* renamed from: a */
    private static C0067a<String, String> m2991a(int i, ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0067a<String, String> aVar = new C0067a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0244a aVar2 = arrayList.get(i4);
            if (aVar2.m3292b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f742q;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f742q;
                        arrayList4 = aVar2.f743r;
                    } else {
                        arrayList4 = aVar2.f742q;
                        arrayList3 = aVar2.f743r;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    static C0067a<String, View> m2980a(AbstractC0299p pVar, C0067a<String, String> aVar, Object obj, C0293e eVar) {
        AbstractC0695e eVar2;
        ArrayList<String> arrayList;
        String a;
        ComponentCallbacksC0248c cVar = eVar.f969a;
        View y = cVar.m3183y();
        if (aVar.isEmpty() || obj == null || y == null) {
            aVar.clear();
            return null;
        }
        C0067a<String, View> aVar2 = new C0067a<>();
        pVar.m2953a((Map<String, View>) aVar2, y);
        C0244a aVar3 = eVar.f971c;
        if (eVar.f970b) {
            eVar2 = cVar.m3194n();
            arrayList = aVar3.f742q;
        } else {
            eVar2 = cVar.m3198l();
            arrayList = aVar3.f743r;
        }
        if (arrayList != null) {
            aVar2.m4079a((Collection<?>) arrayList);
            aVar2.m4079a((Collection<?>) aVar.values());
        }
        if (eVar2 != null) {
            eVar2.m1623a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String a2 = m2988a(aVar, str);
                    if (a2 != null) {
                        aVar.remove(a2);
                    }
                } else if (!str.equals(C0216r.m3405p(view)) && (a = m2988a(aVar, str)) != null) {
                    aVar.put(a, C0216r.m3405p(view));
                }
            }
        } else {
            m2990a(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private static C0293e m2981a(C0293e eVar, SparseArray<C0293e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        C0293e eVar2 = new C0293e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    /* renamed from: a */
    private static AbstractC0299p m2992a() {
        try {
            return (AbstractC0299p) Class.forName("a.n.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static AbstractC0299p m2985a(ComponentCallbacksC0248c cVar, ComponentCallbacksC0248c cVar2) {
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            Object m = cVar.m3196m();
            if (m != null) {
                arrayList.add(m);
            }
            Object u = cVar.m3187u();
            if (u != null) {
                arrayList.add(u);
            }
            Object w = cVar.m3185w();
            if (w != null) {
                arrayList.add(w);
            }
        }
        if (cVar2 != null) {
            Object k = cVar2.m3200k();
            if (k != null) {
                arrayList.add(k);
            }
            Object s = cVar2.m3189s();
            if (s != null) {
                arrayList.add(s);
            }
            Object v = cVar2.m3186v();
            if (v != null) {
                arrayList.add(v);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0299p pVar = f939b;
        if (pVar != null && m2971a(pVar, arrayList)) {
            return f939b;
        }
        AbstractC0299p pVar2 = f940c;
        if (pVar2 != null && m2971a(pVar2, arrayList)) {
            return f940c;
        }
        if (f939b == null && f940c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    static View m2989a(C0067a<String, View> aVar, C0293e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0244a aVar2 = eVar.f971c;
        if (obj == null || aVar == null || (arrayList = aVar2.f742q) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f742q : aVar2.f743r).get(0));
    }

    /* renamed from: a */
    private static Object m2979a(AbstractC0299p pVar, ComponentCallbacksC0248c cVar, ComponentCallbacksC0248c cVar2, boolean z) {
        if (cVar == null || cVar2 == null) {
            return null;
        }
        return pVar.mo2874c(pVar.mo2879b(z ? cVar2.m3185w() : cVar.m3186v()));
    }

    /* renamed from: a */
    private static Object m2978a(AbstractC0299p pVar, ComponentCallbacksC0248c cVar, boolean z) {
        if (cVar == null) {
            return null;
        }
        return pVar.mo2879b(z ? cVar.m3189s() : cVar.m3200k());
    }

    /* renamed from: a */
    private static Object m2976a(AbstractC0299p pVar, ViewGroup viewGroup, View view, C0067a<String, String> aVar, C0293e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0067a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        ComponentCallbacksC0248c cVar = eVar.f969a;
        ComponentCallbacksC0248c cVar2 = eVar.f972d;
        if (cVar == null || cVar2 == null) {
            return null;
        }
        boolean z = eVar.f970b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m2979a(pVar, cVar, cVar2, z);
            aVar2 = aVar;
        }
        C0067a<String, View> b = m2966b(pVar, aVar2, obj3, eVar);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(b.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2984a(cVar, cVar2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            pVar.mo2877b(obj4, view, arrayList);
            m2973a(pVar, obj4, obj2, b, eVar.f973e, eVar.f974f);
            if (obj != null) {
                pVar.mo2886a(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(viewGroup, new RunnableC0292d(pVar, aVar, obj4, eVar, arrayList2, view, cVar, cVar2, z, arrayList, obj, rect));
        return obj4;
    }

    /* renamed from: a */
    private static Object m2972a(AbstractC0299p pVar, Object obj, Object obj2, Object obj3, ComponentCallbacksC0248c cVar, boolean z) {
        return (obj == null || obj2 == null || cVar == null) ? true : z ? cVar.m3211f() : cVar.m3214e() ? pVar.mo2876b(obj2, obj, obj3) : pVar.mo2883a(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m2988a(C0067a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.m4013d(i))) {
                return aVar.m4016b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static ArrayList<View> m2974a(AbstractC0299p pVar, Object obj, ComponentCallbacksC0248c cVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View y = cVar.m3183y();
        if (y != null) {
            pVar.m2957a(arrayList2, y);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        pVar.mo2881a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    private static void m2990a(C0067a<String, String> aVar, C0067a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m4013d(size))) {
                aVar.m4014c(size);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        if (r10.f799l != false) goto L_0x0092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0090, code lost:
        if (r10.f767B == false) goto L_0x0092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m2987a(p000a.p036j.p037a.C0244a r16, p000a.p036j.p037a.C0244a.C0245a r17, android.util.SparseArray<p000a.p036j.p037a.C0288n.C0293e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p036j.p037a.C0288n.m2987a(a.j.a.a, a.j.a.a$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m2986a(C0244a aVar, SparseArray<C0293e> sparseArray, boolean z) {
        int size = aVar.f727b.size();
        for (int i = 0; i < size; i++) {
            m2987a(aVar, aVar.f727b.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: a */
    static void m2984a(ComponentCallbacksC0248c cVar, ComponentCallbacksC0248c cVar2, boolean z, C0067a<String, View> aVar, boolean z2) {
        AbstractC0695e l = z ? cVar2.m3198l() : cVar.m3198l();
        if (l != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.m4016b(i));
                arrayList.add(aVar.m4013d(i));
            }
            if (z2) {
                l.m1622b(arrayList2, arrayList, null);
            } else {
                l.m1624a(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: a */
    private static void m2983a(LayoutInflater$Factory2C0266i iVar, int i, C0293e eVar, View view, C0067a<String, String> aVar) {
        ComponentCallbacksC0248c cVar;
        ComponentCallbacksC0248c cVar2;
        AbstractC0299p a;
        Object obj;
        ViewGroup viewGroup = iVar.f877o.mo3170a() ? (ViewGroup) iVar.f877o.mo3169a(i) : null;
        if (viewGroup != null && (a = m2985a((cVar2 = eVar.f972d), (cVar = eVar.f969a))) != null) {
            boolean z = eVar.f970b;
            boolean z2 = eVar.f973e;
            Object a2 = m2978a(a, cVar, z);
            Object b = m2965b(a, cVar2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object a3 = m2976a(a, viewGroup, view, aVar, eVar, arrayList, arrayList2, a2, b);
            if (a2 == null && a3 == null) {
                obj = b;
                if (obj == null) {
                    return;
                }
            } else {
                obj = b;
            }
            ArrayList<View> a4 = m2974a(a, obj, cVar2, arrayList, view);
            Object obj2 = (a4 == null || a4.isEmpty()) ? null : obj;
            a.mo2885a(a2, view);
            Object a5 = m2972a(a, a2, obj2, a3, cVar, eVar.f970b);
            if (a5 != null) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                a.mo2882a(a5, a2, arrayList3, obj2, a4, a3, arrayList2);
                m2977a(a, viewGroup, cVar, view, arrayList2, a2, arrayList3, obj2, a4);
                a.m2960a((View) viewGroup, arrayList2, (Map<String, String>) aVar);
                a.mo2888a(viewGroup, a5);
                a.m2959a(viewGroup, arrayList2, (Map<String, String>) aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2982a(LayoutInflater$Factory2C0266i iVar, ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (iVar.f875m >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0244a aVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m2968b(aVar, sparseArray, z);
                } else {
                    m2986a(aVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(iVar.f876n.m3136c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0067a<String, String> a = m2991a(keyAt, arrayList, arrayList2, i, i2);
                    C0293e eVar = (C0293e) sparseArray.valueAt(i4);
                    if (z) {
                        m2967b(iVar, keyAt, eVar, view, a);
                    } else {
                        m2983a(iVar, keyAt, eVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2977a(AbstractC0299p pVar, ViewGroup viewGroup, ComponentCallbacksC0248c cVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(viewGroup, new RunnableC0290b(obj, pVar, view, cVar, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: a */
    private static void m2975a(AbstractC0299p pVar, Object obj, ComponentCallbacksC0248c cVar, ArrayList<View> arrayList) {
        if (cVar != null && obj != null && cVar.f799l && cVar.f767B && cVar.f781P) {
            cVar.m3209f(true);
            pVar.mo2884a(obj, cVar.m3183y(), arrayList);
            ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(cVar.f774I, new RunnableC0289a(arrayList));
        }
    }

    /* renamed from: a */
    private static void m2973a(AbstractC0299p pVar, Object obj, Object obj2, C0067a<String, View> aVar, boolean z, C0244a aVar2) {
        ArrayList<String> arrayList = aVar2.f742q;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.f743r : aVar2.f742q).get(0));
            pVar.mo2873c(obj, view);
            if (obj2 != null) {
                pVar.mo2873c(obj2, view);
            }
        }
    }

    /* renamed from: a */
    static void m2970a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static void m2969a(ArrayList<View> arrayList, C0067a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View d = aVar.m4013d(size);
            if (collection.contains(C0216r.m3405p(d))) {
                arrayList.add(d);
            }
        }
    }

    /* renamed from: a */
    private static boolean m2971a(AbstractC0299p pVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!pVar.mo2887a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0067a<String, View> m2966b(AbstractC0299p pVar, C0067a<String, String> aVar, Object obj, C0293e eVar) {
        AbstractC0695e eVar2;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        ComponentCallbacksC0248c cVar = eVar.f972d;
        C0067a<String, View> aVar2 = new C0067a<>();
        pVar.m2953a((Map<String, View>) aVar2, cVar.m3183y());
        C0244a aVar3 = eVar.f974f;
        if (eVar.f973e) {
            eVar2 = cVar.m3198l();
            arrayList = aVar3.f743r;
        } else {
            eVar2 = cVar.m3194n();
            arrayList = aVar3.f742q;
        }
        aVar2.m4079a((Collection<?>) arrayList);
        if (eVar2 != null) {
            eVar2.m1623a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0216r.m3405p(view))) {
                    aVar.put(C0216r.m3405p(view), aVar.remove(str));
                }
            }
        } else {
            aVar.m4079a((Collection<?>) aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: b */
    private static Object m2965b(AbstractC0299p pVar, ComponentCallbacksC0248c cVar, boolean z) {
        if (cVar == null) {
            return null;
        }
        return pVar.mo2879b(z ? cVar.m3187u() : cVar.m3196m());
    }

    /* renamed from: b */
    private static Object m2964b(AbstractC0299p pVar, ViewGroup viewGroup, View view, C0067a<String, String> aVar, C0293e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        ComponentCallbacksC0248c cVar = eVar.f969a;
        ComponentCallbacksC0248c cVar2 = eVar.f972d;
        if (cVar != null) {
            cVar.m3183y().setVisibility(0);
        }
        if (cVar == null || cVar2 == null) {
            return null;
        }
        boolean z = eVar.f970b;
        Object a = aVar.isEmpty() ? null : m2979a(pVar, cVar, cVar2, z);
        C0067a<String, View> b = m2966b(pVar, aVar, a, eVar);
        C0067a<String, View> a2 = m2980a(pVar, aVar, a, eVar);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a2 != null) {
                a2.clear();
            }
            obj3 = null;
        } else {
            m2969a(arrayList, b, aVar.keySet());
            m2969a(arrayList2, a2, aVar.values());
            obj3 = a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m2984a(cVar, cVar2, z, b, true);
        if (obj3 != null) {
            arrayList2.add(view);
            pVar.mo2877b(obj3, view, arrayList);
            m2973a(pVar, obj3, obj2, b, eVar.f973e, eVar.f974f);
            Rect rect2 = new Rect();
            View a3 = m2989a(a2, eVar, obj, z);
            if (a3 != null) {
                pVar.mo2886a(obj, rect2);
            }
            rect = rect2;
            view2 = a3;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(viewGroup, new RunnableC0291c(cVar, cVar2, z, a2, view2, pVar, rect));
        return obj3;
    }

    /* renamed from: b */
    public static void m2968b(C0244a aVar, SparseArray<C0293e> sparseArray, boolean z) {
        if (aVar.f726a.f877o.mo3170a()) {
            for (int size = aVar.f727b.size() - 1; size >= 0; size--) {
                m2987a(aVar, aVar.f727b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    private static void m2967b(LayoutInflater$Factory2C0266i iVar, int i, C0293e eVar, View view, C0067a<String, String> aVar) {
        ComponentCallbacksC0248c cVar;
        ComponentCallbacksC0248c cVar2;
        AbstractC0299p a;
        Object obj;
        ViewGroup viewGroup = iVar.f877o.mo3170a() ? (ViewGroup) iVar.f877o.mo3169a(i) : null;
        if (viewGroup != null && (a = m2985a((cVar2 = eVar.f972d), (cVar = eVar.f969a))) != null) {
            boolean z = eVar.f970b;
            boolean z2 = eVar.f973e;
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object a2 = m2978a(a, cVar, z);
            Object b = m2965b(a, cVar2, z2);
            Object b2 = m2964b(a, viewGroup, view, aVar, eVar, arrayList2, arrayList, a2, b);
            if (a2 == null && b2 == null) {
                obj = b;
                if (obj == null) {
                    return;
                }
            } else {
                obj = b;
            }
            ArrayList<View> a3 = m2974a(a, obj, cVar2, arrayList2, view);
            ArrayList<View> a4 = m2974a(a, a2, cVar, arrayList, view);
            m2970a(a4, 4);
            Object a5 = m2972a(a, a2, obj, b2, cVar, z);
            if (a5 != null) {
                m2975a(a, obj, cVar2, a3);
                ArrayList<String> a6 = a.m2958a(arrayList);
                a.mo2882a(a5, a2, a4, obj, a3, b2, arrayList);
                a.mo2888a(viewGroup, a5);
                a.m2961a(viewGroup, arrayList2, arrayList, a6, aVar);
                m2970a(a4, 0);
                a.mo2875b(b2, arrayList2, arrayList);
            }
        }
    }
}
