package p000a.p036j.p037a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0221t;

/* renamed from: a.j.a.p */
/* loaded from: classes.dex */
public abstract class AbstractC0299p {

    /* renamed from: a.j.a.p$a */
    /* loaded from: classes.dex */
    class RunnableC0300a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f986b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f987c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f988d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f989e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f990f;

        RunnableC0300a(AbstractC0299p pVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f986b = i;
            this.f987c = arrayList;
            this.f988d = arrayList2;
            this.f989e = arrayList3;
            this.f990f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f986b; i++) {
                C0216r.m3430a((View) this.f987c.get(i), (String) this.f988d.get(i));
                C0216r.m3430a((View) this.f989e.get(i), (String) this.f990f.get(i));
            }
        }
    }

    /* renamed from: a.j.a.p$b */
    /* loaded from: classes.dex */
    class RunnableC0301b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f991b;

        /* renamed from: c */
        final /* synthetic */ Map f992c;

        RunnableC0301b(AbstractC0299p pVar, ArrayList arrayList, Map map) {
            this.f991b = arrayList;
            this.f992c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f991b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f991b.get(i);
                String p = C0216r.m3405p(view);
                if (p != null) {
                    C0216r.m3430a(view, AbstractC0299p.m2952a(this.f992c, p));
                }
            }
        }
    }

    /* renamed from: a.j.a.p$c */
    /* loaded from: classes.dex */
    class RunnableC0302c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f993b;

        /* renamed from: c */
        final /* synthetic */ Map f994c;

        RunnableC0302c(AbstractC0299p pVar, ArrayList arrayList, Map map) {
            this.f993b = arrayList;
            this.f994c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f993b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f993b.get(i);
                C0216r.m3430a(view, (String) this.f994c.get(C0216r.m3405p(view)));
            }
        }
    }

    /* renamed from: a */
    static String m2952a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m2955a(List<View> list, View view) {
        int size = list.size();
        if (!m2954a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m2954a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static boolean m2956a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m2954a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo2883a(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> m2958a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0216r.m3405p(view));
            C0216r.m3430a(view, (String) null);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2962a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2961a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String p = C0216r.m3405p(view2);
            arrayList4.add(p);
            if (p != null) {
                C0216r.m3430a(view2, (String) null);
                String str = map.get(p);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0216r.m3430a(arrayList2.get(i2), p);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(view, new RunnableC0300a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2960a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(view, new RunnableC0301b(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo2888a(ViewGroup viewGroup, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2959a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(viewGroup, new RunnableC0302c(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo2886a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo2885a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo2884a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2882a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo2881a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2880a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2957a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a = C0221t.m3381a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m2957a(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2953a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String p = C0216r.m3405p(view);
            if (p != null) {
                map.put(p, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m2953a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo2887a(Object obj);

    /* renamed from: b */
    public abstract Object mo2879b(Object obj);

    /* renamed from: b */
    public abstract Object mo2876b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo2878b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2877b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo2875b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo2874c(Object obj);

    /* renamed from: c */
    public abstract void mo2873c(Object obj, View view);
}
