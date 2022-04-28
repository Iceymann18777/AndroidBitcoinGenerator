package p000a.p036j.p037a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.j.a.o */
/* loaded from: classes.dex */
class C0294o extends AbstractC0299p {

    /* renamed from: a.j.a.o$a */
    /* loaded from: classes.dex */
    class C0295a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f975a;

        C0295a(C0294o oVar, Rect rect) {
            this.f975a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f975a;
        }
    }

    /* renamed from: a.j.a.o$b */
    /* loaded from: classes.dex */
    class C0296b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f976a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f977b;

        C0296b(C0294o oVar, View view, ArrayList arrayList) {
            this.f976a = view;
            this.f977b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f976a.setVisibility(8);
            int size = this.f977b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f977b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a.j.a.o$c */
    /* loaded from: classes.dex */
    class C0297c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f978a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f979b;

        /* renamed from: c */
        final /* synthetic */ Object f980c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f981d;

        /* renamed from: e */
        final /* synthetic */ Object f982e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f983f;

        C0297c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f978a = obj;
            this.f979b = arrayList;
            this.f980c = obj2;
            this.f981d = arrayList2;
            this.f982e = obj3;
            this.f983f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f978a;
            if (obj != null) {
                C0294o.this.mo2880a(obj, this.f979b, (ArrayList<View>) null);
            }
            Object obj2 = this.f980c;
            if (obj2 != null) {
                C0294o.this.mo2880a(obj2, this.f981d, (ArrayList<View>) null);
            }
            Object obj3 = this.f982e;
            if (obj3 != null) {
                C0294o.this.mo2880a(obj3, this.f983f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: a.j.a.o$d */
    /* loaded from: classes.dex */
    class C0298d extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f985a;

        C0298d(C0294o oVar, Rect rect) {
            this.f985a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f985a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f985a;
        }
    }

    /* renamed from: a */
    private static boolean m2963a(Transition transition) {
        return !AbstractC0299p.m2956a((List) transition.getTargetIds()) || !AbstractC0299p.m2956a((List) transition.getTargetNames()) || !AbstractC0299p.m2956a((List) transition.getTargetTypes());
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public Object mo2883a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2888a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2886a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0298d(this, rect));
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2885a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2884a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0296b(this, view, arrayList));
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2882a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0297c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2881a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo2881a(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m2963a(transition) && AbstractC0299p.m2956a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2880a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2880a((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m2963a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public boolean mo2887a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public Object mo2879b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public Object mo2876b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2878b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2877b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0299p.m2955a(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2881a(transitionSet, arrayList);
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2875b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2880a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: c */
    public Object mo2874c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: c */
    public void mo2873c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m2962a(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0295a(this, rect));
        }
    }
}
