package p000a.p036j.p037a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.lifecycle.C0761r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p013d.C0069b;
import p000a.p018g.p028k.C0178a;
import p000a.p018g.p028k.C0179b;
import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.j.a.i */
/* loaded from: classes.dex */
public final class LayoutInflater$Factory2C0266i extends AbstractC0262h implements LayoutInflater.Factory2 {

    /* renamed from: F */
    static boolean f855F;

    /* renamed from: G */
    static Field f856G;

    /* renamed from: H */
    static final Interpolator f857H = new DecelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f858I = new DecelerateInterpolator(1.5f);

    /* renamed from: C */
    ArrayList<C0281m> f861C;

    /* renamed from: D */
    C0282j f862D;

    /* renamed from: b */
    ArrayList<AbstractC0280l> f864b;

    /* renamed from: c */
    boolean f865c;

    /* renamed from: f */
    SparseArray<ComponentCallbacksC0248c> f868f;

    /* renamed from: g */
    ArrayList<C0244a> f869g;

    /* renamed from: h */
    ArrayList<ComponentCallbacksC0248c> f870h;

    /* renamed from: i */
    ArrayList<C0244a> f871i;

    /* renamed from: j */
    ArrayList<Integer> f872j;

    /* renamed from: k */
    ArrayList<AbstractC0262h.AbstractC0265c> f873k;

    /* renamed from: n */
    AbstractC0261g f876n;

    /* renamed from: o */
    AbstractC0259e f877o;

    /* renamed from: p */
    ComponentCallbacksC0248c f878p;

    /* renamed from: q */
    ComponentCallbacksC0248c f879q;

    /* renamed from: r */
    boolean f880r;

    /* renamed from: s */
    boolean f881s;

    /* renamed from: t */
    boolean f882t;

    /* renamed from: u */
    boolean f883u;

    /* renamed from: v */
    String f884v;

    /* renamed from: w */
    boolean f885w;

    /* renamed from: x */
    ArrayList<C0244a> f886x;

    /* renamed from: y */
    ArrayList<Boolean> f887y;

    /* renamed from: z */
    ArrayList<ComponentCallbacksC0248c> f888z;

    /* renamed from: d */
    int f866d = 0;

    /* renamed from: e */
    final ArrayList<ComponentCallbacksC0248c> f867e = new ArrayList<>();

    /* renamed from: l */
    private final CopyOnWriteArrayList<C0278j> f874l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    int f875m = 0;

    /* renamed from: A */
    Bundle f859A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f860B = null;

    /* renamed from: E */
    Runnable f863E = new RunnableC0267a();

    /* renamed from: a.j.a.i$a */
    /* loaded from: classes.dex */
    class RunnableC0267a implements Runnable {
        RunnableC0267a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0266i.this.m3018o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.i$b */
    /* loaded from: classes.dex */
    public class C0268b extends animationAnimation$AnimationListenerC0274f {

        /* renamed from: b */
        final /* synthetic */ ViewGroup f890b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacksC0248c f891c;

        /* renamed from: a.j.a.i$b$a */
        /* loaded from: classes.dex */
        class RunnableC0269a implements Runnable {
            RunnableC0269a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C0268b.this.f891c.m3208g() != null) {
                    C0268b.this.f891c.m3237a((View) null);
                    C0268b bVar = C0268b.this;
                    LayoutInflater$Factory2C0266i iVar = LayoutInflater$Factory2C0266i.this;
                    ComponentCallbacksC0248c cVar = bVar.f891c;
                    iVar.m3103a(cVar, cVar.m3184x(), 0, 0, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0268b(Animation.AnimationListener animationListener, ViewGroup viewGroup, ComponentCallbacksC0248c cVar) {
            super(animationListener);
            this.f890b = viewGroup;
            this.f891c = cVar;
        }

        @Override // p000a.p036j.p037a.LayoutInflater$Factory2C0266i.animationAnimation$AnimationListenerC0274f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f890b.post(new RunnableC0269a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.i$c */
    /* loaded from: classes.dex */
    public class C0270c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f894a;

        /* renamed from: b */
        final /* synthetic */ View f895b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacksC0248c f896c;

        C0270c(ViewGroup viewGroup, View view, ComponentCallbacksC0248c cVar) {
            this.f894a = viewGroup;
            this.f895b = view;
            this.f896c = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f894a.endViewTransition(this.f895b);
            Animator h = this.f896c.m3206h();
            this.f896c.m3251a((Animator) null);
            if (h != null && this.f894a.indexOfChild(this.f895b) < 0) {
                LayoutInflater$Factory2C0266i iVar = LayoutInflater$Factory2C0266i.this;
                ComponentCallbacksC0248c cVar = this.f896c;
                iVar.m3103a(cVar, cVar.m3184x(), 0, 0, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.i$d */
    /* loaded from: classes.dex */
    public class C0271d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f898a;

        /* renamed from: b */
        final /* synthetic */ View f899b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacksC0248c f900c;

        C0271d(LayoutInflater$Factory2C0266i iVar, ViewGroup viewGroup, View view, ComponentCallbacksC0248c cVar) {
            this.f898a = viewGroup;
            this.f899b = view;
            this.f900c = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f898a.endViewTransition(this.f899b);
            animator.removeListener(this);
            View view = this.f900c.f775J;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.j.a.i$e */
    /* loaded from: classes.dex */
    public static class C0272e extends animationAnimation$AnimationListenerC0274f {

        /* renamed from: b */
        View f901b;

        /* renamed from: a.j.a.i$e$a */
        /* loaded from: classes.dex */
        class RunnableC0273a implements Runnable {
            RunnableC0273a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0272e.this.f901b.setLayerType(0, null);
            }
        }

        C0272e(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f901b = view;
        }

        @Override // p000a.p036j.p037a.LayoutInflater$Factory2C0266i.animationAnimation$AnimationListenerC0274f, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C0216r.m3398w(this.f901b) || Build.VERSION.SDK_INT >= 24) {
                this.f901b.post(new RunnableC0273a());
            } else {
                this.f901b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: a.j.a.i$f  reason: invalid class name */
    /* loaded from: classes.dex */
    private static class animationAnimation$AnimationListenerC0274f implements Animation.AnimationListener {

        /* renamed from: a */
        private final Animation.AnimationListener f903a;

        animationAnimation$AnimationListenerC0274f(Animation.AnimationListener animationListener) {
            this.f903a = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f903a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f903a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f903a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.j.a.i$g */
    /* loaded from: classes.dex */
    public static class C0275g {

        /* renamed from: a */
        public final Animation f904a;

        /* renamed from: b */
        public final Animator f905b;

        C0275g(Animator animator) {
            this.f904a = null;
            this.f905b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0275g(Animation animation) {
            this.f904a = animation;
            this.f905b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.j.a.i$h */
    /* loaded from: classes.dex */
    public static class C0276h extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f906a;

        C0276h(View view) {
            this.f906a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f906a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f906a.setLayerType(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.j.a.i$i */
    /* loaded from: classes.dex */
    public static class RunnableC0277i extends AnimationSet implements Runnable {

        /* renamed from: b */
        private final ViewGroup f907b;

        /* renamed from: c */
        private final View f908c;

        /* renamed from: d */
        private boolean f909d;

        /* renamed from: e */
        private boolean f910e;

        /* renamed from: f */
        private boolean f911f = true;

        RunnableC0277i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f907b = viewGroup;
            this.f908c = view;
            addAnimation(animation);
            this.f907b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f911f = true;
            if (this.f909d) {
                return !this.f910e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f909d = true;
                ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(this.f907b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f911f = true;
            if (this.f909d) {
                return !this.f910e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f909d = true;
                ViewTreeObserver$OnPreDrawListenerC0303q.m2950a(this.f907b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f909d || !this.f911f) {
                this.f907b.endViewTransition(this.f908c);
                this.f910e = true;
                return;
            }
            this.f911f = false;
            this.f907b.post(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.j.a.i$j */
    /* loaded from: classes.dex */
    public static final class C0278j {

        /* renamed from: a */
        final AbstractC0262h.AbstractC0264b f912a;

        /* renamed from: b */
        final boolean f913b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.i$k */
    /* loaded from: classes.dex */
    public static class C0279k {

        /* renamed from: a */
        public static final int[] f914a = {16842755, 16842960, 16842961};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.i$l */
    /* loaded from: classes.dex */
    public interface AbstractC0280l {
        /* renamed from: a */
        boolean mo3004a(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.i$m */
    /* loaded from: classes.dex */
    public static class C0281m implements ComponentCallbacksC0248c.AbstractC0254f {

        /* renamed from: a */
        final boolean f915a;

        /* renamed from: b */
        final C0244a f916b;

        /* renamed from: c */
        private int f917c;

        C0281m(C0244a aVar, boolean z) {
            this.f915a = z;
            this.f916b = aVar;
        }

        @Override // p000a.p036j.p037a.ComponentCallbacksC0248c.AbstractC0254f
        /* renamed from: a */
        public void mo3003a() {
            this.f917c--;
            if (this.f917c == 0) {
                this.f916b.f726a.m3008w();
            }
        }

        @Override // p000a.p036j.p037a.ComponentCallbacksC0248c.AbstractC0254f
        /* renamed from: b */
        public void mo3002b() {
            this.f917c++;
        }

        /* renamed from: c */
        public void m3001c() {
            C0244a aVar = this.f916b;
            aVar.f726a.m3105a(aVar, this.f915a, false, false);
        }

        /* renamed from: d */
        public void m3000d() {
            boolean z = this.f917c > 0;
            LayoutInflater$Factory2C0266i iVar = this.f916b.f726a;
            int size = iVar.f867e.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0248c cVar = iVar.f867e.get(i);
                cVar.m3253a((ComponentCallbacksC0248c.AbstractC0254f) null);
                if (z && cVar.m3281D()) {
                    cVar.m3261Y();
                }
            }
            C0244a aVar = this.f916b;
            aVar.f726a.m3105a(aVar, this.f915a, !z, true);
        }

        /* renamed from: e */
        public boolean m2999e() {
            return this.f917c == 0;
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    /* renamed from: A */
    private void m3114A() {
        this.f865c = false;
        this.f887y.clear();
        this.f886x.clear();
    }

    /* renamed from: B */
    private void m3113B() {
        SparseArray<ComponentCallbacksC0248c> sparseArray = this.f868f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0248c valueAt = this.f868f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.m3208g() != null) {
                    int x = valueAt.m3184x();
                    View g = valueAt.m3208g();
                    Animation animation = g.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        g.clearAnimation();
                    }
                    valueAt.m3237a((View) null);
                    m3103a(valueAt, x, 0, 0, false);
                } else if (valueAt.m3206h() != null) {
                    valueAt.m3206h().end();
                }
            }
        }
    }

    /* renamed from: C */
    private void m3112C() {
        if (this.f861C != null) {
            while (!this.f861C.isEmpty()) {
                this.f861C.remove(0).m3000d();
            }
        }
    }

    /* renamed from: a */
    private int m3074a(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0069b<ComponentCallbacksC0248c> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0244a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.m3287d() && !aVar.m3296a(arrayList, i4 + 1, i2)) {
                if (this.f861C == null) {
                    this.f861C = new ArrayList<>();
                }
                C0281m mVar = new C0281m(aVar, booleanValue);
                this.f861C.add(mVar);
                aVar.m3299a(mVar);
                if (booleanValue) {
                    aVar.m3293b();
                } else {
                    aVar.m3289b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m3107a(bVar);
            }
        }
        return i3;
    }

    /* renamed from: a */
    static C0275g m3091a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f858I);
        alphaAnimation.setDuration(220L);
        return new C0275g(alphaAnimation);
    }

    /* renamed from: a */
    static C0275g m3090a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f857H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f858I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new C0275g(animationSet);
    }

    /* renamed from: a */
    private static Animation.AnimationListener m3081a(Animation animation) {
        Throwable e;
        String str;
        try {
            if (f856G == null) {
                f856G = Animation.class.getDeclaredField("mListener");
                f856G.setAccessible(true);
            }
            return (Animation.AnimationListener) f856G.get(animation);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (NoSuchFieldException e3) {
            e = e3;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    /* renamed from: a */
    private void m3107a(C0069b<ComponentCallbacksC0248c> bVar) {
        int i = this.f875m;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f867e.size();
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0248c cVar = this.f867e.get(i2);
                if (cVar.f789b < min) {
                    m3103a(cVar, min, cVar.m3192p(), cVar.m3191q(), false);
                    if (cVar.f775J != null && !cVar.f767B && cVar.f780O) {
                        bVar.add(cVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m3101a(ComponentCallbacksC0248c cVar, C0275g gVar, int i) {
        View view = cVar.f775J;
        ViewGroup viewGroup = cVar.f774I;
        viewGroup.startViewTransition(view);
        cVar.m3232b(i);
        Animation animation = gVar.f904a;
        if (animation != null) {
            RunnableC0277i iVar = new RunnableC0277i(animation, viewGroup, view);
            cVar.m3237a(cVar.f775J);
            iVar.setAnimationListener(new C0268b(m3081a(iVar), viewGroup, cVar));
            m3082a(view, gVar);
            cVar.f775J.startAnimation(iVar);
            return;
        }
        Animator animator = gVar.f905b;
        cVar.m3251a(animator);
        animator.addListener(new C0270c(viewGroup, view, cVar));
        animator.setTarget(cVar.f775J);
        m3082a(cVar.f775J, gVar);
        animator.start();
    }

    /* renamed from: a */
    private static void m3093a(C0282j jVar) {
        if (jVar != null) {
            List<ComponentCallbacksC0248c> b = jVar.m2997b();
            if (b != null) {
                for (ComponentCallbacksC0248c cVar : b) {
                    cVar.f770E = true;
                }
            }
            List<C0282j> a = jVar.m2998a();
            if (a != null) {
                for (C0282j jVar2 : a) {
                    m3093a(jVar2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3082a(View view, C0275g gVar) {
        if (view != null && gVar != null && m3060b(view, gVar)) {
            Animator animator = gVar.f905b;
            if (animator != null) {
                animator.addListener(new C0276h(view));
                return;
            }
            Animation.AnimationListener a = m3081a(gVar.f904a);
            view.setLayerType(2, null);
            gVar.f904a.setAnimationListener(new C0272e(view, a));
        }
    }

    /* renamed from: a */
    private void m3080a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0179b("FragmentManager"));
        AbstractC0261g gVar = this.f876n;
        try {
            if (gVar != null) {
                gVar.mo3139a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } else {
                mo3077a("  ", (FileDescriptor) null, printWriter, new String[0]);
            }
        } catch (Exception e) {
            Log.e("FragmentManager", "Failed dumping state", e);
        }
        throw runtimeException;
    }

    /* renamed from: a */
    private void m3076a(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0281m> arrayList3 = this.f861C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0281m mVar = this.f861C.get(i);
            if (arrayList == null || mVar.f915a || (indexOf2 = arrayList.indexOf(mVar.f916b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (mVar.m2999e() || (arrayList != null && mVar.f916b.m3296a(arrayList, 0, arrayList.size()))) {
                    this.f861C.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || mVar.f915a || (indexOf = arrayList.indexOf(mVar.f916b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.m3000d();
                    }
                }
                i++;
            }
            mVar.m3001c();
            i++;
        }
    }

    /* renamed from: a */
    private static void m3075a(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0244a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.m3303a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.m3289b(z);
            } else {
                aVar.m3303a(1);
                aVar.m3293b();
            }
            i++;
        }
    }

    /* renamed from: a */
    static boolean m3095a(C0275g gVar) {
        Animation animation = gVar.f904a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return m3092a(gVar.f905b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m3092a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m3092a(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3078a(String str, int i, int i2) {
        AbstractC0262h O;
        m3018o();
        m3049c(true);
        ComponentCallbacksC0248c cVar = this.f879q;
        if (cVar != null && i < 0 && str == null && (O = cVar.m3271O()) != null && O.mo3048d()) {
            return true;
        }
        boolean a = m3073a(this.f886x, this.f887y, str, i, i2);
        if (a) {
            this.f865c = true;
            try {
                m3050c(this.f886x, this.f887y);
            } finally {
                m3114A();
            }
        }
        m3020n();
        m3006y();
        return a;
    }

    /* renamed from: b */
    public static int m3069b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: b */
    private void m3068b(C0069b<ComponentCallbacksC0248c> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0248c c = bVar.m4070c(i);
            if (!c.f799l) {
                View y = c.m3183y();
                c.f782Q = y.getAlpha();
                y.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: b */
    private void m3057b(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        boolean z = arrayList.get(i5).f744s;
        ArrayList<ComponentCallbacksC0248c> arrayList3 = this.f888z;
        if (arrayList3 == null) {
            this.f888z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f888z.addAll(this.f867e);
        ComponentCallbacksC0248c q = m3014q();
        boolean z2 = false;
        for (int i6 = i5; i6 < i2; i6++) {
            C0244a aVar = arrayList.get(i6);
            q = !arrayList2.get(i6).booleanValue() ? aVar.m3295a(this.f888z, q) : aVar.m3290b(this.f888z, q);
            z2 = z2 || aVar.f734i;
        }
        this.f888z.clear();
        if (!z) {
            C0288n.m2982a(this, arrayList, arrayList2, i, i2, false);
        }
        m3075a(arrayList, arrayList2, i, i2);
        if (z) {
            C0069b<ComponentCallbacksC0248c> bVar = new C0069b<>();
            m3107a(bVar);
            i3 = m3074a(arrayList, arrayList2, i, i2, bVar);
            m3068b(bVar);
        } else {
            i3 = i2;
        }
        if (i3 != i5 && z) {
            C0288n.m2982a(this, arrayList, arrayList2, i, i3, true);
            m3108a(this.f875m, true);
        }
        while (i5 < i2) {
            C0244a aVar2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && (i4 = aVar2.f737l) >= 0) {
                m3070b(i4);
                aVar2.f737l = -1;
            }
            aVar2.m3286e();
            i5++;
        }
        if (z2) {
            m3012s();
        }
    }

    /* renamed from: b */
    static boolean m3060b(View view, C0275g gVar) {
        return view != null && gVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0216r.m3400u(view) && m3095a(gVar);
    }

    /* renamed from: b */
    private boolean m3058b(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (!(this.f864b == null || this.f864b.size() == 0)) {
                int size = this.f864b.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.f864b.get(i).mo3004a(arrayList, arrayList2);
                }
                this.f864b.clear();
                this.f876n.m3134e().removeCallbacks(this.f863E);
                return z;
            }
            return false;
        }
    }

    /* renamed from: c */
    private void m3050c(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m3076a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f744s) {
                    if (i2 != i) {
                        m3057b(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f744s) {
                            i2++;
                        }
                    }
                    m3057b(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m3057b(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: c */
    private void m3049c(boolean z) {
        if (this.f865c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f876n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f876n.m3134e().getLooper()) {
            if (!z) {
                m3005z();
            }
            if (this.f886x == null) {
                this.f886x = new ArrayList<>();
                this.f887y = new ArrayList<>();
            }
            this.f865c = true;
            try {
                m3076a((ArrayList<C0244a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f865c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: d */
    private void m3047d(int i) {
        try {
            this.f865c = true;
            m3108a(i, false);
            this.f865c = false;
            m3018o();
        } catch (Throwable th) {
            this.f865c = false;
            throw th;
        }
    }

    /* renamed from: e */
    public static int m3042e(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: p */
    private ComponentCallbacksC0248c m3015p(ComponentCallbacksC0248c cVar) {
        ViewGroup viewGroup = cVar.f774I;
        View view = cVar.f775J;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f867e.indexOf(cVar) - 1; indexOf >= 0; indexOf--) {
                ComponentCallbacksC0248c cVar2 = this.f867e.get(indexOf);
                if (cVar2.f774I == viewGroup && cVar2.f775J != null) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: y */
    private void m3006y() {
        SparseArray<ComponentCallbacksC0248c> sparseArray = this.f868f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f868f.valueAt(size) == null) {
                    SparseArray<ComponentCallbacksC0248c> sparseArray2 = this.f868f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: z */
    private void m3005z() {
        if (mo3055c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f884v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f884v);
        }
    }

    /* renamed from: a */
    public ComponentCallbacksC0248c m3110a(int i) {
        for (int size = this.f867e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0248c cVar = this.f867e.get(size);
            if (cVar != null && cVar.f812y == i) {
                return cVar;
            }
        }
        SparseArray<ComponentCallbacksC0248c> sparseArray = this.f868f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            ComponentCallbacksC0248c valueAt = this.f868f.valueAt(size2);
            if (valueAt != null && valueAt.f812y == i) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public ComponentCallbacksC0248c m3088a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        ComponentCallbacksC0248c cVar = this.f868f.get(i);
        if (cVar != null) {
            return cVar;
        }
        m3080a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        throw null;
    }

    /* renamed from: a */
    public ComponentCallbacksC0248c m3079a(String str) {
        if (str != null) {
            for (int size = this.f867e.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0248c cVar = this.f867e.get(size);
                if (cVar != null && str.equals(cVar.f766A)) {
                    return cVar;
                }
            }
        }
        SparseArray<ComponentCallbacksC0248c> sparseArray = this.f868f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            ComponentCallbacksC0248c valueAt = this.f868f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.f766A)) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    C0275g m3102a(ComponentCallbacksC0248c cVar, int i, boolean z, int i2) {
        int b;
        int p = cVar.m3192p();
        Animation a = cVar.m3255a(i, z, p);
        if (a != null) {
            return new C0275g(a);
        }
        Animator b2 = cVar.m3231b(i, z, p);
        if (b2 != null) {
            return new C0275g(b2);
        }
        if (p != 0) {
            boolean equals = "anim".equals(this.f876n.m3136c().getResources().getResourceTypeName(p));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f876n.m3136c(), p);
                    if (loadAnimation != null) {
                        return new C0275g(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f876n.m3136c(), p);
                    if (loadAnimator != null) {
                        return new C0275g(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f876n.m3136c(), p);
                        if (loadAnimation2 != null) {
                            return new C0275g(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0 || (b = m3069b(i, z)) < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m3090a(this.f876n.m3136c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m3090a(this.f876n.m3136c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m3090a(this.f876n.m3136c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m3090a(this.f876n.m3136c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m3091a(this.f876n.m3136c(), 0.0f, 1.0f);
            case 6:
                return m3091a(this.f876n.m3136c(), 1.0f, 0.0f);
            default:
                if (i2 != 0 || !this.f876n.mo3131h()) {
                    return null;
                }
                this.f876n.mo3132g();
                return null;
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: a */
    public AbstractC0287m mo3111a() {
        return new C0244a(this);
    }

    /* renamed from: a */
    public void m3109a(int i, C0244a aVar) {
        synchronized (this) {
            if (this.f871i == null) {
                this.f871i = new ArrayList<>();
            }
            int size = this.f871i.size();
            if (i < size) {
                if (f855F) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + aVar);
                }
                this.f871i.set(i, aVar);
            } else {
                while (size < i) {
                    this.f871i.add(null);
                    if (this.f872j == null) {
                        this.f872j = new ArrayList<>();
                    }
                    if (f855F) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f872j.add(Integer.valueOf(size));
                    size++;
                }
                if (f855F) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + aVar);
                }
                this.f871i.add(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3108a(int i, boolean z) {
        AbstractC0261g gVar;
        if (this.f876n == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f875m) {
            this.f875m = i;
            if (this.f868f != null) {
                int size = this.f867e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m3032h(this.f867e.get(i2));
                }
                int size2 = this.f868f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ComponentCallbacksC0248c valueAt = this.f868f.valueAt(i3);
                    if (valueAt != null && ((valueAt.f800m || valueAt.f768C) && !valueAt.f780O)) {
                        m3032h(valueAt);
                    }
                }
                m3007x();
                if (this.f880r && (gVar = this.f876n) != null && this.f875m == 4) {
                    gVar.mo3130i();
                    this.f880r = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3106a(C0244a aVar) {
        if (this.f869g == null) {
            this.f869g = new ArrayList<>();
        }
        this.f869g.add(aVar);
    }

    /* renamed from: a */
    void m3105a(C0244a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.m3289b(z3);
        } else {
            aVar.m3293b();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0288n.m2982a(this, (ArrayList<C0244a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            m3108a(this.f875m, true);
        }
        SparseArray<ComponentCallbacksC0248c> sparseArray = this.f868f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0248c valueAt = this.f868f.valueAt(i);
                if (valueAt != null && valueAt.f775J != null && valueAt.f780O && aVar.m3292b(valueAt.f813z)) {
                    float f = valueAt.f782Q;
                    if (f > 0.0f) {
                        valueAt.f775J.setAlpha(f);
                    }
                    if (z3) {
                        valueAt.f782Q = 0.0f;
                    } else {
                        valueAt.f782Q = -1.0f;
                        valueAt.f780O = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3104a(ComponentCallbacksC0248c cVar) {
        if (f855F) {
            Log.v("FragmentManager", "attach: " + cVar);
        }
        if (cVar.f768C) {
            cVar.f768C = false;
            if (cVar.f799l) {
                return;
            }
            if (!this.f867e.contains(cVar)) {
                if (f855F) {
                    Log.v("FragmentManager", "add from attach: " + cVar);
                }
                synchronized (this.f867e) {
                    this.f867e.add(cVar);
                }
                cVar.f799l = true;
                if (cVar.f771F && cVar.f772G) {
                    this.f880r = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
        if (r0 != 3) goto L_0x041a;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3103a(p000a.p036j.p037a.ComponentCallbacksC0248c r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p036j.p037a.LayoutInflater$Factory2C0266i.m3103a(a.j.a.c, int, int, int, boolean):void");
    }

    /* renamed from: a */
    void m3100a(ComponentCallbacksC0248c cVar, Context context, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3100a(cVar, context, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3128a(this, cVar, context);
            }
        }
    }

    /* renamed from: a */
    void m3099a(ComponentCallbacksC0248c cVar, Bundle bundle, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3099a(cVar, bundle, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3127a(this, cVar, bundle);
            }
        }
    }

    /* renamed from: a */
    void m3098a(ComponentCallbacksC0248c cVar, View view, Bundle bundle, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3098a(cVar, view, bundle, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3126a(this, cVar, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void m3097a(ComponentCallbacksC0248c cVar, boolean z) {
        if (f855F) {
            Log.v("FragmentManager", "add: " + cVar);
        }
        m3038f(cVar);
        if (cVar.f768C) {
            return;
        }
        if (!this.f867e.contains(cVar)) {
            synchronized (this.f867e) {
                this.f867e.add(cVar);
            }
            cVar.f799l = true;
            cVar.f800m = false;
            if (cVar.f775J == null) {
                cVar.f781P = false;
            }
            if (cVar.f771F && cVar.f772G) {
                this.f880r = true;
            }
            if (z) {
                m3029i(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + cVar);
    }

    /* renamed from: a */
    public void m3096a(AbstractC0261g gVar, AbstractC0259e eVar, ComponentCallbacksC0248c cVar) {
        if (this.f876n == null) {
            this.f876n = gVar;
            this.f877o = eVar;
            this.f878p = cVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        return;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3094a(p000a.p036j.p037a.LayoutInflater$Factory2C0266i.AbstractC0280l r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0005
            r1.m3005z()
        L_0x0005:
            monitor-enter(r1)
            boolean r0 = r1.f883u     // Catch: all -> 0x0030
            if (r0 != 0) goto L_0x0024
            a.j.a.g r0 = r1.f876n     // Catch: all -> 0x0030
            if (r0 != 0) goto L_0x000f
            goto L_0x0024
        L_0x000f:
            java.util.ArrayList<a.j.a.i$l> r3 = r1.f864b     // Catch: all -> 0x0030
            if (r3 != 0) goto L_0x001a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: all -> 0x0030
            r3.<init>()     // Catch: all -> 0x0030
            r1.f864b = r3     // Catch: all -> 0x0030
        L_0x001a:
            java.util.ArrayList<a.j.a.i$l> r3 = r1.f864b     // Catch: all -> 0x0030
            r3.add(r2)     // Catch: all -> 0x0030
            r1.m3008w()     // Catch: all -> 0x0030
            monitor-exit(r1)     // Catch: all -> 0x0030
            return
        L_0x0024:
            if (r3 == 0) goto L_0x0028
            monitor-exit(r1)     // Catch: all -> 0x0030
            return
        L_0x0028:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: all -> 0x0030
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: all -> 0x0030
            throw r2     // Catch: all -> 0x0030
        L_0x0030:
            r2 = move-exception
            monitor-exit(r1)     // Catch: all -> 0x0030
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p036j.p037a.LayoutInflater$Factory2C0266i.m3094a(a.j.a.i$l, boolean):void");
    }

    /* renamed from: a */
    public void m3089a(Configuration configuration) {
        for (int i = 0; i < this.f867e.size(); i++) {
            ComponentCallbacksC0248c cVar = this.f867e.get(i);
            if (cVar != null) {
                cVar.m3242a(configuration);
            }
        }
    }

    /* renamed from: a */
    public void m3087a(Bundle bundle, String str, ComponentCallbacksC0248c cVar) {
        int i = cVar.f793f;
        if (i >= 0) {
            bundle.putInt(str, i);
            return;
        }
        m3080a(new IllegalStateException("Fragment " + cVar + " is not currently in the FragmentManager"));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3086a(Parcelable parcelable, C0282j jVar) {
        List<C0761r> list;
        List<C0282j> list2;
        if (parcelable != null) {
            C0283k kVar = (C0283k) parcelable;
            if (kVar.f921b != null) {
                if (jVar != null) {
                    List<ComponentCallbacksC0248c> b = jVar.m2997b();
                    list2 = jVar.m2998a();
                    list = jVar.m2996c();
                    int size = b != null ? b.size() : 0;
                    for (int i = 0; i < size; i++) {
                        ComponentCallbacksC0248c cVar = b.get(i);
                        if (f855F) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + cVar);
                        }
                        int i2 = 0;
                        while (true) {
                            C0285l[] lVarArr = kVar.f921b;
                            if (i2 >= lVarArr.length || lVarArr[i2].f927c == cVar.f793f) {
                                break;
                            }
                            i2++;
                        }
                        C0285l[] lVarArr2 = kVar.f921b;
                        if (i2 != lVarArr2.length) {
                            C0285l lVar = lVarArr2[i2];
                            lVar.f937m = cVar;
                            cVar.f791d = null;
                            cVar.f805r = 0;
                            cVar.f802o = false;
                            cVar.f799l = false;
                            cVar.f796i = null;
                            Bundle bundle = lVar.f936l;
                            if (bundle != null) {
                                bundle.setClassLoader(this.f876n.m3136c().getClassLoader());
                                cVar.f791d = lVar.f936l.getSparseParcelableArray("android:view_state");
                                cVar.f790c = lVar.f936l;
                            }
                        } else {
                            m3080a(new IllegalStateException("Could not find active fragment with index " + cVar.f793f));
                            throw null;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f868f = new SparseArray<>(kVar.f921b.length);
                int i3 = 0;
                while (true) {
                    C0285l[] lVarArr3 = kVar.f921b;
                    if (i3 >= lVarArr3.length) {
                        break;
                    }
                    C0285l lVar2 = lVarArr3[i3];
                    if (lVar2 != null) {
                        ComponentCallbacksC0248c a = lVar2.m2995a(this.f876n, this.f877o, this.f878p, (list2 == null || i3 >= list2.size()) ? null : list2.get(i3), (list == null || i3 >= list.size()) ? null : list.get(i3));
                        if (f855F) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + a);
                        }
                        this.f868f.put(a.f793f, a);
                        lVar2.f937m = null;
                    }
                    i3++;
                }
                if (jVar != null) {
                    List<ComponentCallbacksC0248c> b2 = jVar.m2997b();
                    int size2 = b2 != null ? b2.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        ComponentCallbacksC0248c cVar2 = b2.get(i4);
                        int i5 = cVar2.f797j;
                        if (i5 >= 0) {
                            cVar2.f796i = this.f868f.get(i5);
                            if (cVar2.f796i == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + cVar2 + " target no longer exists: " + cVar2.f797j);
                            }
                        }
                    }
                }
                this.f867e.clear();
                if (kVar.f922c != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr = kVar.f922c;
                        if (i6 >= iArr.length) {
                            break;
                        }
                        ComponentCallbacksC0248c cVar3 = this.f868f.get(iArr[i6]);
                        if (cVar3 != null) {
                            cVar3.f799l = true;
                            if (f855F) {
                                Log.v("FragmentManager", "restoreAllState: added #" + i6 + ": " + cVar3);
                            }
                            if (!this.f867e.contains(cVar3)) {
                                synchronized (this.f867e) {
                                    this.f867e.add(cVar3);
                                }
                                i6++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            m3080a(new IllegalStateException("No instantiated fragment for index #" + kVar.f922c[i6]));
                            throw null;
                        }
                    }
                }
                C0246b[] bVarArr = kVar.f923d;
                if (bVarArr != null) {
                    this.f869g = new ArrayList<>(bVarArr.length);
                    int i7 = 0;
                    while (true) {
                        C0246b[] bVarArr2 = kVar.f923d;
                        if (i7 >= bVarArr2.length) {
                            break;
                        }
                        C0244a a2 = bVarArr2[i7].m3285a(this);
                        if (f855F) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + a2.f737l + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new C0179b("FragmentManager"));
                            a2.m3297a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f869g.add(a2);
                        int i8 = a2.f737l;
                        if (i8 >= 0) {
                            m3109a(i8, a2);
                        }
                        i7++;
                    }
                } else {
                    this.f869g = null;
                }
                int i9 = kVar.f924e;
                if (i9 >= 0) {
                    this.f879q = this.f868f.get(i9);
                }
                this.f866d = kVar.f925f;
            }
        }
    }

    /* renamed from: a */
    public void m3085a(Menu menu) {
        if (this.f875m >= 1) {
            for (int i = 0; i < this.f867e.size(); i++) {
                ComponentCallbacksC0248c cVar = this.f867e.get(i);
                if (cVar != null) {
                    cVar.m3222c(menu);
                }
            }
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: a */
    public void mo3077a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<ComponentCallbacksC0248c> sparseArray = this.f868f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                ComponentCallbacksC0248c valueAt = this.f868f.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.m3234a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f867e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f867e.get(i2).toString());
            }
        }
        ArrayList<ComponentCallbacksC0248c> arrayList = this.f870h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f870h.get(i3).toString());
            }
        }
        ArrayList<C0244a> arrayList2 = this.f869g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0244a aVar = this.f869g.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.m3298a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f871i != null && (size2 = this.f871i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((C0244a) this.f871i.get(i5));
                }
            }
            if (this.f872j != null && this.f872j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f872j.toArray()));
            }
        }
        ArrayList<AbstractC0280l> arrayList3 = this.f864b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println((AbstractC0280l) this.f864b.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f876n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f877o);
        if (this.f878p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f878p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f875m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f881s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f882t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f883u);
        if (this.f880r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f880r);
        }
        if (this.f884v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f884v);
        }
    }

    /* renamed from: a */
    public void m3072a(boolean z) {
        for (int size = this.f867e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0248c cVar = this.f867e.get(size);
            if (cVar != null) {
                cVar.m3215d(z);
            }
        }
    }

    /* renamed from: a */
    public boolean m3084a(Menu menu, MenuInflater menuInflater) {
        if (this.f875m < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0248c> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f867e.size(); i++) {
            ComponentCallbacksC0248c cVar = this.f867e.get(i);
            if (cVar != null && cVar.m3227b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(cVar);
                z = true;
            }
        }
        if (this.f870h != null) {
            for (int i2 = 0; i2 < this.f870h.size(); i2++) {
                ComponentCallbacksC0248c cVar2 = this.f870h.get(i2);
                if (arrayList == null || !arrayList.contains(cVar2)) {
                    cVar2.m3278H();
                }
            }
        }
        this.f870h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean m3083a(MenuItem menuItem) {
        if (this.f875m < 1) {
            return false;
        }
        for (int i = 0; i < this.f867e.size(); i++) {
            ComponentCallbacksC0248c cVar = this.f867e.get(i);
            if (cVar != null && cVar.m3221c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m3073a(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0244a> arrayList3 = this.f869g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f869g.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                i3 = this.f869g.size() - 1;
                while (i3 >= 0) {
                    C0244a aVar = this.f869g.get(i3);
                    if ((str != null && str.equals(aVar.m3288c())) || (i >= 0 && i == aVar.f737l)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0244a aVar2 = this.f869g.get(i3);
                        if (str == null || !str.equals(aVar2.m3288c())) {
                            if (i < 0 || i != aVar2.f737l) {
                                break;
                            }
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f869g.size() - 1) {
                return false;
            }
            for (int size2 = this.f869g.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f869g.remove(size2));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* renamed from: b */
    public int m3067b(C0244a aVar) {
        synchronized (this) {
            if (this.f872j != null && this.f872j.size() > 0) {
                int intValue = this.f872j.remove(this.f872j.size() - 1).intValue();
                if (f855F) {
                    Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                }
                this.f871i.set(intValue, aVar);
                return intValue;
            }
            if (this.f871i == null) {
                this.f871i = new ArrayList<>();
            }
            int size = this.f871i.size();
            if (f855F) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.f871i.add(aVar);
            return size;
        }
    }

    /* renamed from: b */
    public ComponentCallbacksC0248c m3059b(String str) {
        ComponentCallbacksC0248c a;
        SparseArray<ComponentCallbacksC0248c> sparseArray = this.f868f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0248c valueAt = this.f868f.valueAt(size);
            if (!(valueAt == null || (a = valueAt.m3235a(str)) == null)) {
                return a;
            }
        }
        return null;
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: b */
    public List<ComponentCallbacksC0248c> mo3071b() {
        List<ComponentCallbacksC0248c> list;
        if (this.f867e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f867e) {
            list = (List) this.f867e.clone();
        }
        return list;
    }

    /* renamed from: b */
    public void m3070b(int i) {
        synchronized (this) {
            this.f871i.set(i, null);
            if (this.f872j == null) {
                this.f872j = new ArrayList<>();
            }
            if (f855F) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f872j.add(Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    void m3066b(ComponentCallbacksC0248c cVar) {
        Animator animator;
        if (cVar.f775J != null) {
            C0275g a = m3102a(cVar, cVar.m3191q(), !cVar.f767B, cVar.m3190r());
            if (a == null || (animator = a.f905b) == null) {
                if (a != null) {
                    m3082a(cVar.f775J, a);
                    cVar.f775J.startAnimation(a.f904a);
                    a.f904a.start();
                }
                cVar.f775J.setVisibility((!cVar.f767B || cVar.m3283B()) ? 0 : 8);
                if (cVar.m3283B()) {
                    cVar.m3209f(false);
                }
            } else {
                animator.setTarget(cVar.f775J);
                if (!cVar.f767B) {
                    cVar.f775J.setVisibility(0);
                } else if (cVar.m3283B()) {
                    cVar.m3209f(false);
                } else {
                    ViewGroup viewGroup = cVar.f774I;
                    View view = cVar.f775J;
                    viewGroup.startViewTransition(view);
                    a.f905b.addListener(new C0271d(this, viewGroup, view, cVar));
                }
                m3082a(cVar.f775J, a);
                a.f905b.start();
            }
        }
        if (cVar.f799l && cVar.f771F && cVar.f772G) {
            this.f880r = true;
        }
        cVar.f781P = false;
        cVar.m3233a(cVar.f767B);
    }

    /* renamed from: b */
    void m3065b(ComponentCallbacksC0248c cVar, Context context, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3065b(cVar, context, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3124b(this, cVar, context);
            }
        }
    }

    /* renamed from: b */
    void m3064b(ComponentCallbacksC0248c cVar, Bundle bundle, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3064b(cVar, bundle, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3123b(this, cVar, bundle);
            }
        }
    }

    /* renamed from: b */
    void m3063b(ComponentCallbacksC0248c cVar, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3063b(cVar, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3129a(this, cVar);
            }
        }
    }

    /* renamed from: b */
    public void m3056b(boolean z) {
        for (int size = this.f867e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0248c cVar = this.f867e.get(size);
            if (cVar != null) {
                cVar.m3212e(z);
            }
        }
    }

    /* renamed from: b */
    public boolean m3062b(Menu menu) {
        if (this.f875m < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f867e.size(); i++) {
            ComponentCallbacksC0248c cVar = this.f867e.get(i);
            if (cVar != null && cVar.m3217d(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean m3061b(MenuItem menuItem) {
        if (this.f875m < 1) {
            return false;
        }
        for (int i = 0; i < this.f867e.size(); i++) {
            ComponentCallbacksC0248c cVar = this.f867e.get(i);
            if (cVar != null && cVar.m3216d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m3053c(ComponentCallbacksC0248c cVar) {
        if (f855F) {
            Log.v("FragmentManager", "detach: " + cVar);
        }
        if (!cVar.f768C) {
            cVar.f768C = true;
            if (cVar.f799l) {
                if (f855F) {
                    Log.v("FragmentManager", "remove from detach: " + cVar);
                }
                synchronized (this.f867e) {
                    this.f867e.remove(cVar);
                }
                if (cVar.f771F && cVar.f772G) {
                    this.f880r = true;
                }
                cVar.f799l = false;
            }
        }
    }

    /* renamed from: c */
    void m3052c(ComponentCallbacksC0248c cVar, Bundle bundle, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3052c(cVar, bundle, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3121c(this, cVar, bundle);
            }
        }
    }

    /* renamed from: c */
    void m3051c(ComponentCallbacksC0248c cVar, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3051c(cVar, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3125b(this, cVar);
            }
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: c */
    public boolean mo3055c() {
        return this.f881s || this.f882t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m3054c(int i) {
        return this.f875m >= i;
    }

    /* renamed from: d */
    void m3046d(ComponentCallbacksC0248c cVar) {
        if (cVar.f801n && !cVar.f804q) {
            cVar.m3229b(cVar.m3203i(cVar.f790c), (ViewGroup) null, cVar.f790c);
            View view = cVar.f775J;
            if (view != null) {
                cVar.f776K = view;
                view.setSaveFromParentEnabled(false);
                if (cVar.f767B) {
                    cVar.f775J.setVisibility(8);
                }
                cVar.m3236a(cVar.f775J, cVar.f790c);
                m3098a(cVar, cVar.f775J, cVar.f790c, false);
                return;
            }
            cVar.f776K = null;
        }
    }

    /* renamed from: d */
    void m3045d(ComponentCallbacksC0248c cVar, Bundle bundle, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3045d(cVar, bundle, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3119d(this, cVar, bundle);
            }
        }
    }

    /* renamed from: d */
    void m3044d(ComponentCallbacksC0248c cVar, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3044d(cVar, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3122c(this, cVar);
            }
        }
    }

    @Override // p000a.p036j.p037a.AbstractC0262h
    /* renamed from: d */
    public boolean mo3048d() {
        m3005z();
        return m3078a((String) null, -1, 0);
    }

    /* renamed from: e */
    public void m3043e() {
        this.f881s = false;
        this.f882t = false;
        m3047d(2);
    }

    /* renamed from: e */
    public void m3041e(ComponentCallbacksC0248c cVar) {
        if (f855F) {
            Log.v("FragmentManager", "hide: " + cVar);
        }
        if (!cVar.f767B) {
            cVar.f767B = true;
            cVar.f781P = true ^ cVar.f781P;
        }
    }

    /* renamed from: e */
    void m3040e(ComponentCallbacksC0248c cVar, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3040e(cVar, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3120d(this, cVar);
            }
        }
    }

    /* renamed from: f */
    public void m3039f() {
        this.f881s = false;
        this.f882t = false;
        m3047d(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3038f(ComponentCallbacksC0248c cVar) {
        if (cVar.f793f < 0) {
            int i = this.f866d;
            this.f866d = i + 1;
            cVar.m3256a(i, this.f878p);
            if (this.f868f == null) {
                this.f868f = new SparseArray<>();
            }
            this.f868f.put(cVar.f793f, cVar);
            if (f855F) {
                Log.v("FragmentManager", "Allocated fragment index " + cVar);
            }
        }
    }

    /* renamed from: f */
    void m3037f(ComponentCallbacksC0248c cVar, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3037f(cVar, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3118e(this, cVar);
            }
        }
    }

    /* renamed from: g */
    public void m3036g() {
        this.f883u = true;
        m3018o();
        m3047d(0);
        this.f876n = null;
        this.f877o = null;
        this.f878p = null;
    }

    /* renamed from: g */
    void m3035g(ComponentCallbacksC0248c cVar) {
        if (cVar.f793f >= 0) {
            if (f855F) {
                Log.v("FragmentManager", "Freeing fragment index " + cVar);
            }
            this.f868f.put(cVar.f793f, null);
            cVar.m3182z();
        }
    }

    /* renamed from: g */
    void m3034g(ComponentCallbacksC0248c cVar, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3034g(cVar, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3117f(this, cVar);
            }
        }
    }

    /* renamed from: h */
    public void m3033h() {
        m3047d(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m3032h(ComponentCallbacksC0248c cVar) {
        if (cVar != null) {
            int i = this.f875m;
            if (cVar.f800m) {
                i = cVar.m3282C() ? Math.min(i, 1) : Math.min(i, 0);
            }
            m3103a(cVar, i, cVar.m3191q(), cVar.m3190r(), false);
            if (cVar.f775J != null) {
                ComponentCallbacksC0248c p = m3015p(cVar);
                if (p != null) {
                    View view = p.f775J;
                    ViewGroup viewGroup = cVar.f774I;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(cVar.f775J);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(cVar.f775J, indexOfChild);
                    }
                }
                if (cVar.f780O && cVar.f774I != null) {
                    float f = cVar.f782Q;
                    if (f > 0.0f) {
                        cVar.f775J.setAlpha(f);
                    }
                    cVar.f782Q = 0.0f;
                    cVar.f780O = false;
                    C0275g a = m3102a(cVar, cVar.m3191q(), true, cVar.m3190r());
                    if (a != null) {
                        m3082a(cVar.f775J, a);
                        Animation animation = a.f904a;
                        if (animation != null) {
                            cVar.f775J.startAnimation(animation);
                        } else {
                            a.f905b.setTarget(cVar.f775J);
                            a.f905b.start();
                        }
                    }
                }
            }
            if (cVar.f781P) {
                m3066b(cVar);
            }
        }
    }

    /* renamed from: h */
    void m3031h(ComponentCallbacksC0248c cVar, boolean z) {
        ComponentCallbacksC0248c cVar2 = this.f878p;
        if (cVar2 != null) {
            AbstractC0262h o = cVar2.m3193o();
            if (o instanceof LayoutInflater$Factory2C0266i) {
                ((LayoutInflater$Factory2C0266i) o).m3031h(cVar, true);
            }
        }
        Iterator<C0278j> it = this.f874l.iterator();
        while (it.hasNext()) {
            C0278j next = it.next();
            if (!z || next.f913b) {
                next.f912a.m3116g(this, cVar);
            }
        }
    }

    /* renamed from: i */
    public void m3030i() {
        for (int i = 0; i < this.f867e.size(); i++) {
            ComponentCallbacksC0248c cVar = this.f867e.get(i);
            if (cVar != null) {
                cVar.m3267S();
            }
        }
    }

    /* renamed from: i */
    void m3029i(ComponentCallbacksC0248c cVar) {
        m3103a(cVar, this.f875m, 0, 0, false);
    }

    /* renamed from: j */
    public void m3028j() {
        m3047d(3);
    }

    /* renamed from: j */
    public void m3027j(ComponentCallbacksC0248c cVar) {
        if (!cVar.f777L) {
            return;
        }
        if (this.f865c) {
            this.f885w = true;
            return;
        }
        cVar.f777L = false;
        m3103a(cVar, this.f875m, 0, 0, false);
    }

    /* renamed from: k */
    public void m3026k() {
        this.f881s = false;
        this.f882t = false;
        m3047d(4);
    }

    /* renamed from: k */
    public void m3025k(ComponentCallbacksC0248c cVar) {
        if (f855F) {
            Log.v("FragmentManager", "remove: " + cVar + " nesting=" + cVar.f805r);
        }
        boolean z = !cVar.m3282C();
        if (!cVar.f768C || z) {
            synchronized (this.f867e) {
                this.f867e.remove(cVar);
            }
            if (cVar.f771F && cVar.f772G) {
                this.f880r = true;
            }
            cVar.f799l = false;
            cVar.f800m = true;
        }
    }

    /* renamed from: l */
    Bundle m3023l(ComponentCallbacksC0248c cVar) {
        Bundle bundle;
        if (this.f859A == null) {
            this.f859A = new Bundle();
        }
        cVar.m3201j(this.f859A);
        m3045d(cVar, this.f859A, false);
        if (!this.f859A.isEmpty()) {
            bundle = this.f859A;
            this.f859A = null;
        } else {
            bundle = null;
        }
        if (cVar.f775J != null) {
            m3021m(cVar);
        }
        if (cVar.f791d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", cVar.f791d);
        }
        if (!cVar.f778M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", cVar.f778M);
        }
        return bundle;
    }

    /* renamed from: l */
    public void m3024l() {
        this.f881s = false;
        this.f882t = false;
        m3047d(3);
    }

    /* renamed from: m */
    public void m3022m() {
        this.f882t = true;
        m3047d(2);
    }

    /* renamed from: m */
    void m3021m(ComponentCallbacksC0248c cVar) {
        if (cVar.f776K != null) {
            SparseArray<Parcelable> sparseArray = this.f860B;
            if (sparseArray == null) {
                this.f860B = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            cVar.f776K.saveHierarchyState(this.f860B);
            if (this.f860B.size() > 0) {
                cVar.f791d = this.f860B;
                this.f860B = null;
            }
        }
    }

    /* renamed from: n */
    void m3020n() {
        if (this.f885w) {
            this.f885w = false;
            m3007x();
        }
    }

    /* renamed from: n */
    public void m3019n(ComponentCallbacksC0248c cVar) {
        if (cVar == null || (this.f868f.get(cVar.f793f) == cVar && (cVar.f807t == null || cVar.m3193o() == this))) {
            this.f879q = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: o */
    public void m3017o(ComponentCallbacksC0248c cVar) {
        if (f855F) {
            Log.v("FragmentManager", "show: " + cVar);
        }
        if (cVar.f767B) {
            cVar.f767B = false;
            cVar.f781P = !cVar.f781P;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public boolean m3018o() {
        m3049c(true);
        boolean z = false;
        while (m3058b(this.f886x, this.f887y)) {
            this.f865c = true;
            try {
                m3050c(this.f886x, this.f887y);
                m3114A();
                z = true;
            } catch (Throwable th) {
                m3114A();
                throw th;
            }
        }
        m3020n();
        m3006y();
        return z;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ComponentCallbacksC0248c cVar;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0279k.f914a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!ComponentCallbacksC0248c.m3246a(this.f876n.m3136c(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        ComponentCallbacksC0248c a = resourceId != -1 ? m3110a(resourceId) : null;
        if (a == null && string != null) {
            a = m3079a(string);
        }
        if (a == null && i != -1) {
            a = m3110a(i);
        }
        if (f855F) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + a);
        }
        if (a == null) {
            ComponentCallbacksC0248c a2 = this.f877o.mo3168a(context, attributeValue, null);
            a2.f801n = true;
            a2.f812y = resourceId != 0 ? resourceId : i;
            a2.f813z = i;
            a2.f766A = string;
            a2.f802o = true;
            a2.f806s = this;
            AbstractC0261g gVar = this.f876n;
            a2.f807t = gVar;
            a2.m3247a(gVar.m3136c(), attributeSet, a2.f790c);
            m3097a(a2, true);
            cVar = a2;
        } else if (!a.f802o) {
            a.f802o = true;
            AbstractC0261g gVar2 = this.f876n;
            a.f807t = gVar2;
            if (!a.f770E) {
                a.m3247a(gVar2.m3136c(), attributeSet, a.f790c);
            }
            cVar = a;
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        }
        if (this.f875m >= 1 || !cVar.f801n) {
            m3029i(cVar);
        } else {
            m3103a(cVar, 1, 0, 0, false);
        }
        View view2 = cVar.f775J;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (cVar.f775J.getTag() == null) {
                cVar.f775J.setTag(string);
            }
            return cVar.f775J;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public LayoutInflater.Factory2 m3016p() {
        return this;
    }

    /* renamed from: q */
    public ComponentCallbacksC0248c m3014q() {
        return this.f879q;
    }

    /* renamed from: r */
    public void m3013r() {
        this.f862D = null;
        this.f881s = false;
        this.f882t = false;
        int size = this.f867e.size();
        for (int i = 0; i < size; i++) {
            ComponentCallbacksC0248c cVar = this.f867e.get(i);
            if (cVar != null) {
                cVar.m3279F();
            }
        }
    }

    /* renamed from: s */
    void m3012s() {
        if (this.f873k != null) {
            for (int i = 0; i < this.f873k.size(); i++) {
                this.f873k.get(i).m3115a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public C0282j m3011t() {
        m3093a(this.f862D);
        return this.f862D;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f878p;
        if (obj == null) {
            obj = this.f876n;
        }
        C0178a.m3564a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public Parcelable m3010u() {
        int[] iArr;
        int size;
        m3112C();
        m3113B();
        m3018o();
        this.f881s = true;
        C0246b[] bVarArr = null;
        this.f862D = null;
        SparseArray<ComponentCallbacksC0248c> sparseArray = this.f868f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f868f.size();
        C0285l[] lVarArr = new C0285l[size2];
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            ComponentCallbacksC0248c valueAt = this.f868f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.f793f >= 0) {
                    C0285l lVar = new C0285l(valueAt);
                    lVarArr[i] = lVar;
                    if (valueAt.f789b <= 0 || lVar.f936l != null) {
                        lVar.f936l = valueAt.f790c;
                    } else {
                        lVar.f936l = m3023l(valueAt);
                        ComponentCallbacksC0248c cVar = valueAt.f796i;
                        if (cVar != null) {
                            if (cVar.f793f >= 0) {
                                if (lVar.f936l == null) {
                                    lVar.f936l = new Bundle();
                                }
                                m3087a(lVar.f936l, "android:target_state", valueAt.f796i);
                                int i2 = valueAt.f798k;
                                if (i2 != 0) {
                                    lVar.f936l.putInt("android:target_req_state", i2);
                                }
                            } else {
                                m3080a(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f796i));
                                throw null;
                            }
                        }
                    }
                    if (f855F) {
                        Log.v("FragmentManager", "Saved state of " + valueAt + ": " + lVar.f936l);
                    }
                    z = true;
                } else {
                    m3080a(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f793f));
                    throw null;
                }
            }
        }
        if (!z) {
            if (f855F) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f867e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                iArr[i3] = this.f867e.get(i3).f793f;
                if (iArr[i3] >= 0) {
                    if (f855F) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i3 + ": " + this.f867e.get(i3));
                    }
                } else {
                    m3080a(new IllegalStateException("Failure saving state: active " + this.f867e.get(i3) + " has cleared index: " + iArr[i3]));
                    throw null;
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0244a> arrayList = this.f869g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new C0246b[size];
            for (int i4 = 0; i4 < size; i4++) {
                bVarArr[i4] = new C0246b(this.f869g.get(i4));
                if (f855F) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f869g.get(i4));
                }
            }
        }
        C0283k kVar = new C0283k();
        kVar.f921b = lVarArr;
        kVar.f922c = iArr;
        kVar.f923d = bVarArr;
        ComponentCallbacksC0248c cVar2 = this.f879q;
        if (cVar2 != null) {
            kVar.f924e = cVar2.f793f;
        }
        kVar.f925f = this.f866d;
        m3009v();
        return kVar;
    }

    /* renamed from: v */
    void m3009v() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0282j jVar;
        if (this.f868f != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f868f.size(); i++) {
                ComponentCallbacksC0248c valueAt = this.f868f.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.f769D) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        ComponentCallbacksC0248c cVar = valueAt.f796i;
                        valueAt.f797j = cVar != null ? cVar.f793f : -1;
                        if (f855F) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    LayoutInflater$Factory2C0266i iVar = valueAt.f808u;
                    if (iVar != null) {
                        iVar.m3009v();
                        jVar = valueAt.f808u.f862D;
                    } else {
                        jVar = valueAt.f809v;
                    }
                    if (arrayList2 == null && jVar != null) {
                        arrayList2 = new ArrayList(this.f868f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(jVar);
                    }
                    if (arrayList == null && valueAt.f810w != null) {
                        arrayList = new ArrayList(this.f868f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.f810w);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f862D = null;
        } else {
            this.f862D = new C0282j(arrayList3, arrayList2, arrayList);
        }
    }

    /* renamed from: w */
    void m3008w() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f861C != null && !this.f861C.isEmpty();
            if (this.f864b != null && this.f864b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f876n.m3134e().removeCallbacks(this.f863E);
                this.f876n.m3134e().post(this.f863E);
            }
        }
    }

    /* renamed from: x */
    void m3007x() {
        if (this.f868f != null) {
            for (int i = 0; i < this.f868f.size(); i++) {
                ComponentCallbacksC0248c valueAt = this.f868f.valueAt(i);
                if (valueAt != null) {
                    m3027j(valueAt);
                }
            }
        }
    }
}
