package p000a.p045n;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p000a.p036j.p037a.AbstractC0299p;

/* renamed from: a.n.e */
/* loaded from: classes.dex */
public class C0344e extends AbstractC0299p {

    /* renamed from: a.n.e$a */
    /* loaded from: classes.dex */
    class C0345a extends AbstractC0367m.AbstractC0372e {
        C0345a(C0344e eVar, Rect rect) {
        }
    }

    /* renamed from: a.n.e$b */
    /* loaded from: classes.dex */
    class C0346b implements AbstractC0367m.AbstractC0373f {

        /* renamed from: a */
        final /* synthetic */ View f1060a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f1061b;

        C0346b(C0344e eVar, View view, ArrayList arrayList) {
            this.f1060a = view;
            this.f1061b = arrayList;
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: a */
        public void mo2776a(AbstractC0367m mVar) {
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(AbstractC0367m mVar) {
            mVar.mo2785b(this);
            this.f1060a.setVisibility(8);
            int size = this.f1061b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1061b.get(i)).setVisibility(0);
            }
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: c */
        public void mo2809c(AbstractC0367m mVar) {
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: d */
        public void mo2808d(AbstractC0367m mVar) {
        }
    }

    /* renamed from: a.n.e$c */
    /* loaded from: classes.dex */
    class C0347c implements AbstractC0367m.AbstractC0373f {

        /* renamed from: a */
        final /* synthetic */ Object f1062a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f1063b;

        /* renamed from: c */
        final /* synthetic */ Object f1064c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f1065d;

        /* renamed from: e */
        final /* synthetic */ Object f1066e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f1067f;

        C0347c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1062a = obj;
            this.f1063b = arrayList;
            this.f1064c = obj2;
            this.f1065d = arrayList2;
            this.f1066e = obj3;
            this.f1067f = arrayList3;
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: a */
        public void mo2776a(AbstractC0367m mVar) {
            Object obj = this.f1062a;
            if (obj != null) {
                C0344e.this.mo2880a(obj, this.f1063b, (ArrayList<View>) null);
            }
            Object obj2 = this.f1064c;
            if (obj2 != null) {
                C0344e.this.mo2880a(obj2, this.f1065d, (ArrayList<View>) null);
            }
            Object obj3 = this.f1066e;
            if (obj3 != null) {
                C0344e.this.mo2880a(obj3, this.f1067f, (ArrayList<View>) null);
            }
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(AbstractC0367m mVar) {
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: c */
        public void mo2809c(AbstractC0367m mVar) {
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: d */
        public void mo2808d(AbstractC0367m mVar) {
        }
    }

    /* renamed from: a.n.e$d */
    /* loaded from: classes.dex */
    class C0348d extends AbstractC0367m.AbstractC0372e {
        C0348d(C0344e eVar, Rect rect) {
        }
    }

    /* renamed from: a */
    private static boolean m2889a(AbstractC0367m mVar) {
        return !AbstractC0299p.m2956a((List) mVar.m2817i()) || !AbstractC0299p.m2956a((List) mVar.m2816j()) || !AbstractC0299p.m2956a((List) mVar.m2815k());
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public Object mo2883a(Object obj, Object obj2, Object obj3) {
        AbstractC0367m mVar = (AbstractC0367m) obj;
        AbstractC0367m mVar2 = (AbstractC0367m) obj2;
        AbstractC0367m mVar3 = (AbstractC0367m) obj3;
        if (mVar != null && mVar2 != null) {
            C0379q qVar = new C0379q();
            qVar.m2794a(mVar);
            qVar.m2794a(mVar2);
            qVar.m2787b(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C0379q qVar2 = new C0379q();
        if (mVar != null) {
            qVar2.m2794a(mVar);
        }
        qVar2.m2794a(mVar3);
        return qVar2;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2888a(ViewGroup viewGroup, Object obj) {
        C0375o.m2806a(viewGroup, (AbstractC0367m) obj);
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2886a(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0367m) obj).mo2796a(new C0348d(this, rect));
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2885a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0367m) obj).mo2790a(view);
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2884a(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC0367m) obj).mo2795a(new C0346b(this, view, arrayList));
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2882a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC0367m) obj).mo2795a(new C0347c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2881a(Object obj, ArrayList<View> arrayList) {
        AbstractC0367m mVar = (AbstractC0367m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C0379q) {
                C0379q qVar = (C0379q) mVar;
                int p = qVar.m2778p();
                while (i < p) {
                    mo2881a(qVar.m2799a(i), arrayList);
                    i++;
                }
            } else if (!m2889a(mVar) && AbstractC0299p.m2956a((List) mVar.m2814l())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo2790a(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public void mo2880a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC0367m mVar = (AbstractC0367m) obj;
        int i = 0;
        if (mVar instanceof C0379q) {
            C0379q qVar = (C0379q) mVar;
            int p = qVar.m2778p();
            while (i < p) {
                mo2880a((Object) qVar.m2799a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m2889a(mVar)) {
            List<View> l = mVar.m2814l();
            if (l.size() == arrayList.size() && l.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    mVar.mo2790a(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.mo2781d(arrayList.get(size2));
                }
            }
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: a */
    public boolean mo2887a(Object obj) {
        return obj instanceof AbstractC0367m;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public Object mo2879b(Object obj) {
        if (obj != null) {
            return ((AbstractC0367m) obj).clone();
        }
        return null;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public Object mo2876b(Object obj, Object obj2, Object obj3) {
        C0379q qVar = new C0379q();
        if (obj != null) {
            qVar.m2794a((AbstractC0367m) obj);
        }
        if (obj2 != null) {
            qVar.m2794a((AbstractC0367m) obj2);
        }
        if (obj3 != null) {
            qVar.m2794a((AbstractC0367m) obj3);
        }
        return qVar;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2878b(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0367m) obj).mo2781d(view);
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2877b(Object obj, View view, ArrayList<View> arrayList) {
        C0379q qVar = (C0379q) obj;
        List<View> l = qVar.m2814l();
        l.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0299p.m2955a(l, arrayList.get(i));
        }
        l.add(view);
        arrayList.add(view);
        mo2881a(qVar, arrayList);
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: b */
    public void mo2875b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0379q qVar = (C0379q) obj;
        if (qVar != null) {
            qVar.m2814l().clear();
            qVar.m2814l().addAll(arrayList2);
            mo2880a((Object) qVar, arrayList, arrayList2);
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: c */
    public Object mo2874c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0379q qVar = new C0379q();
        qVar.m2794a((AbstractC0367m) obj);
        return qVar;
    }

    @Override // p000a.p036j.p037a.AbstractC0299p
    /* renamed from: c */
    public void mo2873c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m2962a(view, rect);
            ((AbstractC0367m) obj).mo2796a(new C0345a(this, rect));
        }
    }
}
