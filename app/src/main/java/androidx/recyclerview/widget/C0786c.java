package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p018g.p029l.C0216r;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C0786c extends AbstractC0857m {

    /* renamed from: s */
    private static TimeInterpolator f2954s;

    /* renamed from: h */
    private ArrayList<C0813j.AbstractC0821d0> f2955h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C0813j.AbstractC0821d0> f2956i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0796j> f2957j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0795i> f2958k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<C0813j.AbstractC0821d0>> f2959l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C0796j>> f2960m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0795i>> f2961n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<C0813j.AbstractC0821d0> f2962o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<C0813j.AbstractC0821d0> f2963p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<C0813j.AbstractC0821d0> f2964q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<C0813j.AbstractC0821d0> f2965r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    class RunnableC0787a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2966b;

        RunnableC0787a(ArrayList arrayList) {
            this.f2966b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2966b.iterator();
            while (it.hasNext()) {
                C0796j jVar = (C0796j) it.next();
                C0786c.this.m1097b(jVar.f3000a, jVar.f3001b, jVar.f3002c, jVar.f3003d, jVar.f3004e);
            }
            this.f2966b.clear();
            C0786c.this.f2960m.remove(this.f2966b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    class RunnableC0788b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2968b;

        RunnableC0788b(ArrayList arrayList) {
            this.f2968b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2968b.iterator();
            while (it.hasNext()) {
                C0786c.this.m1102a((C0795i) it.next());
            }
            this.f2968b.clear();
            C0786c.this.f2961n.remove(this.f2968b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    class RunnableC0789c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f2970b;

        RunnableC0789c(ArrayList arrayList) {
            this.f2970b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2970b.iterator();
            while (it.hasNext()) {
                C0786c.this.m1095t((C0813j.AbstractC0821d0) it.next());
            }
            this.f2970b.clear();
            C0786c.this.f2959l.remove(this.f2970b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    public class C0790d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0813j.AbstractC0821d0 f2972a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2973b;

        /* renamed from: c */
        final /* synthetic */ View f2974c;

        C0790d(C0813j.AbstractC0821d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2972a = d0Var;
            this.f2973b = viewPropertyAnimator;
            this.f2974c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2973b.setListener(null);
            this.f2974c.setAlpha(1.0f);
            C0786c.this.m558l(this.f2972a);
            C0786c.this.f2964q.remove(this.f2972a);
            C0786c.this.m1096j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0786c.this.m557m(this.f2972a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    public class C0791e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0813j.AbstractC0821d0 f2976a;

        /* renamed from: b */
        final /* synthetic */ View f2977b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f2978c;

        C0791e(C0813j.AbstractC0821d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2976a = d0Var;
            this.f2977b = view;
            this.f2978c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2977b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2978c.setListener(null);
            C0786c.this.m562h(this.f2976a);
            C0786c.this.f2962o.remove(this.f2976a);
            C0786c.this.m1096j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0786c.this.m561i(this.f2976a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    public class C0792f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0813j.AbstractC0821d0 f2980a;

        /* renamed from: b */
        final /* synthetic */ int f2981b;

        /* renamed from: c */
        final /* synthetic */ View f2982c;

        /* renamed from: d */
        final /* synthetic */ int f2983d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f2984e;

        C0792f(C0813j.AbstractC0821d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2980a = d0Var;
            this.f2981b = i;
            this.f2982c = view;
            this.f2983d = i2;
            this.f2984e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f2981b != 0) {
                this.f2982c.setTranslationX(0.0f);
            }
            if (this.f2983d != 0) {
                this.f2982c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2984e.setListener(null);
            C0786c.this.m560j(this.f2980a);
            C0786c.this.f2963p.remove(this.f2980a);
            C0786c.this.m1096j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0786c.this.m559k(this.f2980a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    public class C0793g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0795i f2986a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2987b;

        /* renamed from: c */
        final /* synthetic */ View f2988c;

        C0793g(C0795i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2986a = iVar;
            this.f2987b = viewPropertyAnimator;
            this.f2988c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2987b.setListener(null);
            this.f2988c.setAlpha(1.0f);
            this.f2988c.setTranslationX(0.0f);
            this.f2988c.setTranslationY(0.0f);
            C0786c.this.m570a(this.f2986a.f2994a, true);
            C0786c.this.f2965r.remove(this.f2986a.f2994a);
            C0786c.this.m1096j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0786c.this.m568b(this.f2986a.f2994a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    public class C0794h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0795i f2990a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2991b;

        /* renamed from: c */
        final /* synthetic */ View f2992c;

        C0794h(C0795i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2990a = iVar;
            this.f2991b = viewPropertyAnimator;
            this.f2992c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2991b.setListener(null);
            this.f2992c.setAlpha(1.0f);
            this.f2992c.setTranslationX(0.0f);
            this.f2992c.setTranslationY(0.0f);
            C0786c.this.m570a(this.f2990a.f2995b, false);
            C0786c.this.f2965r.remove(this.f2990a.f2995b);
            C0786c.this.m1096j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0786c.this.m568b(this.f2990a.f2995b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: classes.dex */
    public static class C0795i {

        /* renamed from: a */
        public C0813j.AbstractC0821d0 f2994a;

        /* renamed from: b */
        public C0813j.AbstractC0821d0 f2995b;

        /* renamed from: c */
        public int f2996c;

        /* renamed from: d */
        public int f2997d;

        /* renamed from: e */
        public int f2998e;

        /* renamed from: f */
        public int f2999f;

        private C0795i(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0821d0 d0Var2) {
            this.f2994a = d0Var;
            this.f2995b = d0Var2;
        }

        C0795i(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0821d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f2996c = i;
            this.f2997d = i2;
            this.f2998e = i3;
            this.f2999f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2994a + ", newHolder=" + this.f2995b + ", fromX=" + this.f2996c + ", fromY=" + this.f2997d + ", toX=" + this.f2998e + ", toY=" + this.f2999f + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: classes.dex */
    public static class C0796j {

        /* renamed from: a */
        public C0813j.AbstractC0821d0 f3000a;

        /* renamed from: b */
        public int f3001b;

        /* renamed from: c */
        public int f3002c;

        /* renamed from: d */
        public int f3003d;

        /* renamed from: e */
        public int f3004e;

        C0796j(C0813j.AbstractC0821d0 d0Var, int i, int i2, int i3, int i4) {
            this.f3000a = d0Var;
            this.f3001b = i;
            this.f3002c = i2;
            this.f3003d = i3;
            this.f3004e = i4;
        }
    }

    /* renamed from: a */
    private void m1099a(List<C0795i> list, C0813j.AbstractC0821d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0795i iVar = list.get(size);
            if (m1101a(iVar, d0Var) && iVar.f2994a == null && iVar.f2995b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m1101a(C0795i iVar, C0813j.AbstractC0821d0 d0Var) {
        boolean z = false;
        if (iVar.f2995b == d0Var) {
            iVar.f2995b = null;
        } else if (iVar.f2994a != d0Var) {
            return false;
        } else {
            iVar.f2994a = null;
            z = true;
        }
        d0Var.f3179a.setAlpha(1.0f);
        d0Var.f3179a.setTranslationX(0.0f);
        d0Var.f3179a.setTranslationY(0.0f);
        m570a(d0Var, z);
        return true;
    }

    /* renamed from: b */
    private void m1098b(C0795i iVar) {
        C0813j.AbstractC0821d0 d0Var = iVar.f2994a;
        if (d0Var != null) {
            m1101a(iVar, d0Var);
        }
        C0813j.AbstractC0821d0 d0Var2 = iVar.f2995b;
        if (d0Var2 != null) {
            m1101a(iVar, d0Var2);
        }
    }

    /* renamed from: u */
    private void m1094u(C0813j.AbstractC0821d0 d0Var) {
        View view = d0Var.f3179a;
        ViewPropertyAnimator animate = view.animate();
        this.f2964q.add(d0Var);
        animate.setDuration(m805f()).alpha(0.0f).setListener(new C0790d(d0Var, animate, view)).start();
    }

    /* renamed from: v */
    private void m1093v(C0813j.AbstractC0821d0 d0Var) {
        if (f2954s == null) {
            f2954s = new ValueAnimator().getInterpolator();
        }
        d0Var.f3179a.animate().setInterpolator(f2954s);
        mo810c(d0Var);
    }

    /* renamed from: a */
    void m1102a(C0795i iVar) {
        C0813j.AbstractC0821d0 d0Var = iVar.f2994a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f3179a;
        C0813j.AbstractC0821d0 d0Var2 = iVar.f2995b;
        if (d0Var2 != null) {
            view = d0Var2.f3179a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(m809d());
            this.f2965r.add(iVar.f2994a);
            duration.translationX(iVar.f2998e - iVar.f2996c);
            duration.translationY(iVar.f2999f - iVar.f2997d);
            duration.alpha(0.0f).setListener(new C0793g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f2965r.add(iVar.f2995b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m809d()).alpha(1.0f).setListener(new C0794h(iVar, animate, view)).start();
        }
    }

    /* renamed from: a */
    void m1100a(List<C0813j.AbstractC0821d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3179a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0857m
    /* renamed from: a */
    public boolean mo574a(C0813j.AbstractC0821d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3179a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f3179a.getTranslationY());
        m1093v(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m560j(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f2957j.add(new C0796j(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0857m
    /* renamed from: a */
    public boolean mo573a(C0813j.AbstractC0821d0 d0Var, C0813j.AbstractC0821d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo574a(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f3179a.getTranslationX();
        float translationY = d0Var.f3179a.getTranslationY();
        float alpha = d0Var.f3179a.getAlpha();
        m1093v(d0Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        d0Var.f3179a.setTranslationX(translationX);
        d0Var.f3179a.setTranslationY(translationY);
        d0Var.f3179a.setAlpha(alpha);
        if (d0Var2 != null) {
            m1093v(d0Var2);
            d0Var2.f3179a.setTranslationX(-i5);
            d0Var2.f3179a.setTranslationY(-i6);
            d0Var2.f3179a.setAlpha(0.0f);
        }
        this.f2958k.add(new C0795i(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: a */
    public boolean mo815a(C0813j.AbstractC0821d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo815a(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: b */
    public void mo813b() {
        int size = this.f2957j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0796j jVar = this.f2957j.get(size);
            View view = jVar.f3000a.f3179a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m560j(jVar.f3000a);
            this.f2957j.remove(size);
        }
        for (int size2 = this.f2955h.size() - 1; size2 >= 0; size2--) {
            m558l(this.f2955h.get(size2));
            this.f2955h.remove(size2);
        }
        int size3 = this.f2956i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0813j.AbstractC0821d0 d0Var = this.f2956i.get(size3);
            d0Var.f3179a.setAlpha(1.0f);
            m562h(d0Var);
            this.f2956i.remove(size3);
        }
        for (int size4 = this.f2958k.size() - 1; size4 >= 0; size4--) {
            m1098b(this.f2958k.get(size4));
        }
        this.f2958k.clear();
        if (mo804g()) {
            for (int size5 = this.f2960m.size() - 1; size5 >= 0; size5--) {
                ArrayList<C0796j> arrayList = this.f2960m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0796j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3000a.f3179a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m560j(jVar2.f3000a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2960m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2959l.size() - 1; size7 >= 0; size7--) {
                ArrayList<C0813j.AbstractC0821d0> arrayList2 = this.f2959l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0813j.AbstractC0821d0 d0Var2 = arrayList2.get(size8);
                    d0Var2.f3179a.setAlpha(1.0f);
                    m562h(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2959l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2961n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C0795i> arrayList3 = this.f2961n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m1098b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2961n.remove(arrayList3);
                    }
                }
            }
            m1100a(this.f2964q);
            m1100a(this.f2963p);
            m1100a(this.f2962o);
            m1100a(this.f2965r);
            m818a();
        }
    }

    /* renamed from: b */
    void m1097b(C0813j.AbstractC0821d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3179a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f2963p.add(d0Var);
        animate.setDuration(m807e()).setListener(new C0792f(d0Var, i5, view, i6, animate)).start();
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: c */
    public void mo810c(C0813j.AbstractC0821d0 d0Var) {
        View view = d0Var.f3179a;
        view.animate().cancel();
        int size = this.f2957j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2957j.get(size).f3000a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m560j(d0Var);
                this.f2957j.remove(size);
            }
        }
        m1099a(this.f2958k, d0Var);
        if (this.f2955h.remove(d0Var)) {
            view.setAlpha(1.0f);
            m558l(d0Var);
        }
        if (this.f2956i.remove(d0Var)) {
            view.setAlpha(1.0f);
            m562h(d0Var);
        }
        for (int size2 = this.f2961n.size() - 1; size2 >= 0; size2--) {
            ArrayList<C0795i> arrayList = this.f2961n.get(size2);
            m1099a(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f2961n.remove(size2);
            }
        }
        for (int size3 = this.f2960m.size() - 1; size3 >= 0; size3--) {
            ArrayList<C0796j> arrayList2 = this.f2960m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f3000a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m560j(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2960m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2959l.size() - 1; size5 >= 0; size5--) {
            ArrayList<C0813j.AbstractC0821d0> arrayList3 = this.f2959l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                m562h(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f2959l.remove(size5);
                }
            }
        }
        this.f2964q.remove(d0Var);
        this.f2962o.remove(d0Var);
        this.f2965r.remove(d0Var);
        this.f2963p.remove(d0Var);
        m1096j();
    }

    @Override // androidx.recyclerview.widget.AbstractC0857m
    /* renamed from: f */
    public boolean mo564f(C0813j.AbstractC0821d0 d0Var) {
        m1093v(d0Var);
        d0Var.f3179a.setAlpha(0.0f);
        this.f2956i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: g */
    public boolean mo804g() {
        return !this.f2956i.isEmpty() || !this.f2958k.isEmpty() || !this.f2957j.isEmpty() || !this.f2955h.isEmpty() || !this.f2963p.isEmpty() || !this.f2964q.isEmpty() || !this.f2962o.isEmpty() || !this.f2965r.isEmpty() || !this.f2960m.isEmpty() || !this.f2959l.isEmpty() || !this.f2961n.isEmpty();
    }

    @Override // androidx.recyclerview.widget.AbstractC0857m
    /* renamed from: g */
    public boolean mo563g(C0813j.AbstractC0821d0 d0Var) {
        m1093v(d0Var);
        this.f2955h.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0829l
    /* renamed from: i */
    public void mo802i() {
        boolean z = !this.f2955h.isEmpty();
        boolean z2 = !this.f2957j.isEmpty();
        boolean z3 = !this.f2958k.isEmpty();
        boolean z4 = !this.f2956i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<C0813j.AbstractC0821d0> it = this.f2955h.iterator();
            while (it.hasNext()) {
                m1094u(it.next());
            }
            this.f2955h.clear();
            if (z2) {
                ArrayList<C0796j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f2957j);
                this.f2960m.add(arrayList);
                this.f2957j.clear();
                RunnableC0787a aVar = new RunnableC0787a(arrayList);
                if (z) {
                    C0216r.m3431a(arrayList.get(0).f3000a.f3179a, aVar, m805f());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<C0795i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f2958k);
                this.f2961n.add(arrayList2);
                this.f2958k.clear();
                RunnableC0788b bVar = new RunnableC0788b(arrayList2);
                if (z) {
                    C0216r.m3431a(arrayList2.get(0).f2994a.f3179a, bVar, m805f());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<C0813j.AbstractC0821d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f2956i);
                this.f2959l.add(arrayList3);
                this.f2956i.clear();
                RunnableC0789c cVar = new RunnableC0789c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long f = z ? m805f() : 0L;
                    long e = z2 ? m807e() : 0L;
                    if (z3) {
                        j = m809d();
                    }
                    C0216r.m3431a(arrayList3.get(0).f3179a, cVar, f + Math.max(e, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: j */
    void m1096j() {
        if (!mo804g()) {
            m818a();
        }
    }

    /* renamed from: t */
    void m1095t(C0813j.AbstractC0821d0 d0Var) {
        View view = d0Var.f3179a;
        ViewPropertyAnimator animate = view.animate();
        this.f2962o.add(d0Var);
        animate.alpha(1.0f).setDuration(m811c()).setListener(new C0791e(d0Var, view, animate)).start();
    }
}
