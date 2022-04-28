package p000a.p045n;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p013d.C0067a;
import p000a.p018g.p029l.C0216r;

/* renamed from: a.n.o */
/* loaded from: classes.dex */
public class C0375o {

    /* renamed from: a */
    private static AbstractC0367m f1149a = new C0323b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0067a<ViewGroup, ArrayList<AbstractC0367m>>>> f1150b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f1151c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.n.o$a */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC0376a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        AbstractC0367m f1152b;

        /* renamed from: c */
        ViewGroup f1153c;

        /* renamed from: a.n.o$a$a */
        /* loaded from: classes.dex */
        class C0377a extends C0374n {

            /* renamed from: a */
            final /* synthetic */ C0067a f1154a;

            C0377a(C0067a aVar) {
                this.f1154a = aVar;
            }

            @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
            /* renamed from: b */
            public void mo2775b(AbstractC0367m mVar) {
                ((ArrayList) this.f1154a.get(ViewTreeObserver$OnPreDrawListenerC0376a.this.f1153c)).remove(mVar);
            }
        }

        ViewTreeObserver$OnPreDrawListenerC0376a(AbstractC0367m mVar, ViewGroup viewGroup) {
            this.f1152b = mVar;
            this.f1153c = viewGroup;
        }

        /* renamed from: a */
        private void m2803a() {
            this.f1153c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1153c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m2803a();
            if (!C0375o.f1151c.remove(this.f1153c)) {
                return true;
            }
            C0067a<ViewGroup, ArrayList<AbstractC0367m>> a = C0375o.m2807a();
            ArrayList<AbstractC0367m> arrayList = a.get(this.f1153c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a.put(this.f1153c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f1152b);
            this.f1152b.mo2795a(new C0377a(a));
            this.f1152b.m2830a(this.f1153c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0367m) it.next()).mo2780e(this.f1153c);
                }
            }
            this.f1152b.m2832a(this.f1153c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m2803a();
            C0375o.f1151c.remove(this.f1153c);
            ArrayList<AbstractC0367m> arrayList = C0375o.m2807a().get(this.f1153c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC0367m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo2780e(this.f1153c);
                }
            }
            this.f1152b.m2829a(true);
        }
    }

    /* renamed from: a */
    static C0067a<ViewGroup, ArrayList<AbstractC0367m>> m2807a() {
        C0067a<ViewGroup, ArrayList<AbstractC0367m>> aVar;
        WeakReference<C0067a<ViewGroup, ArrayList<AbstractC0367m>>> weakReference = f1150b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        C0067a<ViewGroup, ArrayList<AbstractC0367m>> aVar2 = new C0067a<>();
        f1150b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    /* renamed from: a */
    public static void m2806a(ViewGroup viewGroup, AbstractC0367m mVar) {
        if (!f1151c.contains(viewGroup) && C0216r.m3397x(viewGroup)) {
            f1151c.add(viewGroup);
            if (mVar == null) {
                mVar = f1149a;
            }
            AbstractC0367m clone = mVar.clone();
            m2804c(viewGroup, clone);
            C0365l.m2845a(viewGroup, null);
            m2805b(viewGroup, clone);
        }
    }

    /* renamed from: b */
    private static void m2805b(ViewGroup viewGroup, AbstractC0367m mVar) {
        if (mVar != null && viewGroup != null) {
            ViewTreeObserver$OnPreDrawListenerC0376a aVar = new ViewTreeObserver$OnPreDrawListenerC0376a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m2804c(ViewGroup viewGroup, AbstractC0367m mVar) {
        ArrayList<AbstractC0367m> arrayList = m2807a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC0367m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2782c(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.m2830a(viewGroup, true);
        }
        C0365l a = C0365l.m2846a(viewGroup);
        if (a != null) {
            a.m2847a();
        }
    }
}
