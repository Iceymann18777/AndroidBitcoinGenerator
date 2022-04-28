package p000a.p036j.p037a;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0695e;
import androidx.lifecycle.AbstractC0742e;
import androidx.lifecycle.AbstractC0746g;
import androidx.lifecycle.AbstractC0762s;
import androidx.lifecycle.C0747h;
import androidx.lifecycle.C0753l;
import androidx.lifecycle.C0761r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import p000a.p013d.C0080g;
import p000a.p018g.p028k.C0178a;
import p000a.p018g.p029l.C0203e;
import p000a.p041l.p042a.AbstractC0309a;

/* renamed from: a.j.a.c */
/* loaded from: classes.dex */
public class ComponentCallbacksC0248c implements ComponentCallbacks, View.OnCreateContextMenuListener, AbstractC0746g, AbstractC0762s {

    /* renamed from: X */
    private static final C0080g<String, Class<?>> f764X = new C0080g<>();

    /* renamed from: Y */
    static final Object f765Y = new Object();

    /* renamed from: A */
    String f766A;

    /* renamed from: B */
    boolean f767B;

    /* renamed from: C */
    boolean f768C;

    /* renamed from: D */
    boolean f769D;

    /* renamed from: E */
    boolean f770E;

    /* renamed from: F */
    boolean f771F;

    /* renamed from: H */
    boolean f773H;

    /* renamed from: I */
    ViewGroup f774I;

    /* renamed from: J */
    View f775J;

    /* renamed from: K */
    View f776K;

    /* renamed from: L */
    boolean f777L;

    /* renamed from: N */
    C0252d f779N;

    /* renamed from: O */
    boolean f780O;

    /* renamed from: P */
    boolean f781P;

    /* renamed from: Q */
    float f782Q;

    /* renamed from: R */
    LayoutInflater f783R;

    /* renamed from: S */
    boolean f784S;

    /* renamed from: U */
    C0747h f786U;

    /* renamed from: V */
    AbstractC0746g f787V;

    /* renamed from: c */
    Bundle f790c;

    /* renamed from: d */
    SparseArray<Parcelable> f791d;

    /* renamed from: e */
    Boolean f792e;

    /* renamed from: g */
    String f794g;

    /* renamed from: h */
    Bundle f795h;

    /* renamed from: i */
    ComponentCallbacksC0248c f796i;

    /* renamed from: k */
    int f798k;

    /* renamed from: l */
    boolean f799l;

    /* renamed from: m */
    boolean f800m;

    /* renamed from: n */
    boolean f801n;

    /* renamed from: o */
    boolean f802o;

    /* renamed from: p */
    boolean f803p;

    /* renamed from: q */
    boolean f804q;

    /* renamed from: r */
    int f805r;

    /* renamed from: s */
    LayoutInflater$Factory2C0266i f806s;

    /* renamed from: t */
    AbstractC0261g f807t;

    /* renamed from: u */
    LayoutInflater$Factory2C0266i f808u;

    /* renamed from: v */
    C0282j f809v;

    /* renamed from: w */
    C0761r f810w;

    /* renamed from: x */
    ComponentCallbacksC0248c f811x;

    /* renamed from: y */
    int f812y;

    /* renamed from: z */
    int f813z;

    /* renamed from: b */
    int f789b = 0;

    /* renamed from: f */
    int f793f = -1;

    /* renamed from: j */
    int f797j = -1;

    /* renamed from: G */
    boolean f772G = true;

    /* renamed from: M */
    boolean f778M = true;

    /* renamed from: T */
    C0747h f785T = new C0747h(this);

    /* renamed from: W */
    C0753l<AbstractC0746g> f788W = new C0753l<>();

    /* renamed from: a.j.a.c$a */
    /* loaded from: classes.dex */
    class RunnableC0249a implements Runnable {
        RunnableC0249a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC0248c.this.m3224c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.c$b */
    /* loaded from: classes.dex */
    public class C0250b extends AbstractC0259e {
        C0250b() {
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public ComponentCallbacksC0248c mo3168a(Context context, String str, Bundle bundle) {
            return ComponentCallbacksC0248c.this.f807t.mo3168a(context, str, bundle);
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public View mo3169a(int i) {
            View view = ComponentCallbacksC0248c.this.f775J;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public boolean mo3170a() {
            return ComponentCallbacksC0248c.this.f775J != null;
        }
    }

    /* renamed from: a.j.a.c$c */
    /* loaded from: classes.dex */
    class C0251c implements AbstractC0746g {
        C0251c() {
        }

        @Override // androidx.lifecycle.AbstractC0746g
        /* renamed from: a */
        public AbstractC0742e mo1368a() {
            ComponentCallbacksC0248c cVar = ComponentCallbacksC0248c.this;
            if (cVar.f786U == null) {
                cVar.f786U = new C0747h(cVar.f787V);
            }
            return ComponentCallbacksC0248c.this.f786U;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.c$d */
    /* loaded from: classes.dex */
    public static class C0252d {

        /* renamed from: a */
        View f817a;

        /* renamed from: b */
        Animator f818b;

        /* renamed from: c */
        int f819c;

        /* renamed from: d */
        int f820d;

        /* renamed from: e */
        int f821e;

        /* renamed from: f */
        int f822f;

        /* renamed from: h */
        Object f824h;

        /* renamed from: j */
        Object f826j;

        /* renamed from: l */
        Object f828l;

        /* renamed from: m */
        Boolean f829m;

        /* renamed from: n */
        Boolean f830n;

        /* renamed from: q */
        boolean f833q;

        /* renamed from: r */
        AbstractC0254f f834r;

        /* renamed from: s */
        boolean f835s;

        /* renamed from: g */
        Object f823g = null;

        /* renamed from: i */
        Object f825i = null;

        /* renamed from: k */
        Object f827k = null;

        /* renamed from: o */
        AbstractC0695e f831o = null;

        /* renamed from: p */
        AbstractC0695e f832p = null;

        C0252d() {
            Object obj = ComponentCallbacksC0248c.f765Y;
            this.f824h = obj;
            this.f826j = obj;
            this.f828l = obj;
        }
    }

    /* renamed from: a.j.a.c$e */
    /* loaded from: classes.dex */
    public static class C0253e extends RuntimeException {
        public C0253e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.c$f */
    /* loaded from: classes.dex */
    public interface AbstractC0254f {
        /* renamed from: a */
        void mo3003a();

        /* renamed from: b */
        void mo3002b();
    }

    /* renamed from: Z */
    private C0252d m3260Z() {
        if (this.f779N == null) {
            this.f779N = new C0252d();
        }
        return this.f779N;
    }

    /* renamed from: a */
    public static ComponentCallbacksC0248c m3245a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f764X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f764X.put(str, cls);
            }
            ComponentCallbacksC0248c cVar = (ComponentCallbacksC0248c) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(cVar.getClass().getClassLoader());
                cVar.m3195m(bundle);
            }
            return cVar;
        } catch (ClassNotFoundException e) {
            throw new C0253e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0253e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0253e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0253e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0253e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m3246a(Context context, String str) {
        try {
            Class<?> cls = f764X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f764X.put(str, cls);
            }
            return ComponentCallbacksC0248c.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: A */
    void m3284A() {
        if (this.f807t != null) {
            this.f808u = new LayoutInflater$Factory2C0266i();
            this.f808u.m3096a(this.f807t, new C0250b(), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m3283B() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return false;
        }
        return dVar.f835s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final boolean m3282C() {
        return this.f805r > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m3281D() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return false;
        }
        return dVar.f833q;
    }

    /* renamed from: E */
    public final boolean m3280E() {
        LayoutInflater$Factory2C0266i iVar = this.f806s;
        if (iVar == null) {
            return false;
        }
        return iVar.mo3055c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m3279F() {
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3013r();
        }
    }

    /* renamed from: G */
    public void mo13G() {
        boolean z = true;
        this.f773H = true;
        ActivityC0255d d = m3219d();
        if (d == null || !d.isChangingConfigurations()) {
            z = false;
        }
        C0761r rVar = this.f810w;
        if (rVar != null && !z) {
            rVar.m1346a();
        }
    }

    /* renamed from: H */
    public void m3278H() {
    }

    /* renamed from: I */
    public void m3277I() {
        this.f773H = true;
    }

    /* renamed from: J */
    public void m3276J() {
        this.f773H = true;
    }

    /* renamed from: K */
    public void m3275K() {
        this.f773H = true;
    }

    /* renamed from: L */
    public void m3274L() {
        this.f773H = true;
    }

    /* renamed from: M */
    public void m3273M() {
        this.f773H = true;
    }

    /* renamed from: N */
    public void m3272N() {
        this.f773H = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public AbstractC0262h m3271O() {
        return this.f808u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m3270P() {
        this.f785T.m1385a(AbstractC0742e.EnumC0743a.ON_DESTROY);
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3036g();
        }
        this.f789b = 0;
        this.f773H = false;
        this.f784S = false;
        mo13G();
        if (this.f773H) {
            this.f808u = null;
            return;
        }
        throw new C0304r("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m3269Q() {
        if (this.f775J != null) {
            this.f786U.m1385a(AbstractC0742e.EnumC0743a.ON_DESTROY);
        }
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3033h();
        }
        this.f789b = 1;
        this.f773H = false;
        m3277I();
        if (this.f773H) {
            AbstractC0309a.m2949a(this).mo2948a();
            this.f804q = false;
            return;
        }
        throw new C0304r("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m3268R() {
        this.f773H = false;
        m3276J();
        this.f783R = null;
        if (this.f773H) {
            LayoutInflater$Factory2C0266i iVar = this.f808u;
            if (iVar == null) {
                return;
            }
            if (this.f770E) {
                iVar.m3036g();
                this.f808u = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
        throw new C0304r("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m3267S() {
        onLowMemory();
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3030i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m3266T() {
        if (this.f775J != null) {
            this.f786U.m1385a(AbstractC0742e.EnumC0743a.ON_PAUSE);
        }
        this.f785T.m1385a(AbstractC0742e.EnumC0743a.ON_PAUSE);
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3028j();
        }
        this.f789b = 3;
        this.f773H = false;
        m3275K();
        if (!this.f773H) {
            throw new C0304r("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m3265U() {
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3013r();
            this.f808u.m3018o();
        }
        this.f789b = 4;
        this.f773H = false;
        m3274L();
        if (this.f773H) {
            LayoutInflater$Factory2C0266i iVar2 = this.f808u;
            if (iVar2 != null) {
                iVar2.m3026k();
                this.f808u.m3018o();
            }
            this.f785T.m1385a(AbstractC0742e.EnumC0743a.ON_RESUME);
            if (this.f775J != null) {
                this.f786U.m1385a(AbstractC0742e.EnumC0743a.ON_RESUME);
                return;
            }
            return;
        }
        throw new C0304r("Fragment " + this + " did not call through to super.onResume()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m3264V() {
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3013r();
            this.f808u.m3018o();
        }
        this.f789b = 3;
        this.f773H = false;
        m3273M();
        if (this.f773H) {
            LayoutInflater$Factory2C0266i iVar2 = this.f808u;
            if (iVar2 != null) {
                iVar2.m3024l();
            }
            this.f785T.m1385a(AbstractC0742e.EnumC0743a.ON_START);
            if (this.f775J != null) {
                this.f786U.m1385a(AbstractC0742e.EnumC0743a.ON_START);
                return;
            }
            return;
        }
        throw new C0304r("Fragment " + this + " did not call through to super.onStart()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m3263W() {
        if (this.f775J != null) {
            this.f786U.m1385a(AbstractC0742e.EnumC0743a.ON_STOP);
        }
        this.f785T.m1385a(AbstractC0742e.EnumC0743a.ON_STOP);
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3022m();
        }
        this.f789b = 2;
        this.f773H = false;
        m3272N();
        if (!this.f773H) {
            throw new C0304r("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: X */
    public final Context m3262X() {
        Context j = m3202j();
        if (j != null) {
            return j;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: Y */
    public void m3261Y() {
        LayoutInflater$Factory2C0266i iVar = this.f806s;
        if (iVar == null || iVar.f876n == null) {
            m3260Z().f833q = false;
        } else if (Looper.myLooper() != this.f806s.f876n.m3134e().getLooper()) {
            this.f806s.f876n.m3134e().postAtFrontOfQueue(new RunnableC0249a());
        } else {
            m3224c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ComponentCallbacksC0248c m3235a(String str) {
        if (str.equals(this.f794g)) {
            return this;
        }
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            return iVar.m3059b(str);
        }
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public LayoutInflater m3241a(Bundle bundle) {
        AbstractC0261g gVar = this.f807t;
        if (gVar != null) {
            LayoutInflater f = gVar.mo3133f();
            m3204i();
            LayoutInflater$Factory2C0266i iVar = this.f808u;
            iVar.m3016p();
            C0203e.m3481b(f, iVar);
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: a */
    public View mo11a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation m3255a(int i, boolean z, int i2) {
        return null;
    }

    @Override // androidx.lifecycle.AbstractC0746g
    /* renamed from: a */
    public AbstractC0742e mo1368a() {
        return this.f785T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3259a(int i) {
        if (this.f779N != null || i != 0) {
            m3260Z().f820d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3258a(int i, int i2) {
        if (this.f779N != null || i != 0 || i2 != 0) {
            m3260Z();
            C0252d dVar = this.f779N;
            dVar.f821e = i;
            dVar.f822f = i2;
        }
    }

    /* renamed from: a */
    public void m3257a(int i, int i2, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3256a(int i, ComponentCallbacksC0248c cVar) {
        String str;
        StringBuilder sb;
        this.f793f = i;
        if (cVar != null) {
            sb = new StringBuilder();
            sb.append(cVar.f794g);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f793f);
        this.f794g = sb.toString();
    }

    /* renamed from: a */
    public void m3254a(int i, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3253a(AbstractC0254f fVar) {
        m3260Z();
        AbstractC0254f fVar2 = this.f779N.f834r;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                C0252d dVar = this.f779N;
                if (dVar.f833q) {
                    dVar.f834r = fVar;
                }
                if (fVar != null) {
                    fVar.mo3002b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: a */
    public void m3252a(ComponentCallbacksC0248c cVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3251a(Animator animator) {
        m3260Z().f818b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void m3250a(Activity activity) {
        this.f773H = true;
    }

    @Deprecated
    /* renamed from: a */
    public void m3249a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f773H = true;
    }

    /* renamed from: a */
    public void m3248a(Context context) {
        this.f773H = true;
        AbstractC0261g gVar = this.f807t;
        Activity b = gVar == null ? null : gVar.m3138b();
        if (b != null) {
            this.f773H = false;
            m3250a(b);
        }
    }

    /* renamed from: a */
    public void m3247a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f773H = true;
        AbstractC0261g gVar = this.f807t;
        Activity b = gVar == null ? null : gVar.m3138b();
        if (b != null) {
            this.f773H = false;
            m3249a(b, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    public void m3244a(Intent intent) {
        m3243a(intent, (Bundle) null);
    }

    /* renamed from: a */
    public void m3243a(Intent intent, Bundle bundle) {
        AbstractC0261g gVar = this.f807t;
        if (gVar != null) {
            gVar.mo3140a(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3242a(Configuration configuration) {
        onConfigurationChanged(configuration);
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3089a(configuration);
        }
    }

    /* renamed from: a */
    public void m3240a(Menu menu) {
    }

    /* renamed from: a */
    public void m3239a(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3237a(View view) {
        m3260Z().f817a = view;
    }

    /* renamed from: a */
    public void m3236a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void m3234a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f812y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f813z));
        printWriter.print(" mTag=");
        printWriter.println(this.f766A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f789b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f793f);
        printWriter.print(" mWho=");
        printWriter.print(this.f794g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f805r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f799l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f800m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f801n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f802o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f767B);
        printWriter.print(" mDetached=");
        printWriter.print(this.f768C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f772G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f771F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f769D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f770E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f778M);
        if (this.f806s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f806s);
        }
        if (this.f807t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f807t);
        }
        if (this.f811x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f811x);
        }
        if (this.f795h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f795h);
        }
        if (this.f790c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f790c);
        }
        if (this.f791d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f791d);
        }
        if (this.f796i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f796i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f798k);
        }
        if (m3192p() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m3192p());
        }
        if (this.f774I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f774I);
        }
        if (this.f775J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f775J);
        }
        if (this.f776K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f775J);
        }
        if (m3208g() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m3208g());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m3184x());
        }
        if (m3202j() != null) {
            AbstractC0309a.m2949a(this).mo2947a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.f808u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f808u + ":");
            LayoutInflater$Factory2C0266i iVar = this.f808u;
            iVar.mo3077a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public void m3233a(boolean z) {
    }

    /* renamed from: a */
    public boolean m3238a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public Animator m3231b(int i, boolean z, int i2) {
        return null;
    }

    @Override // androidx.lifecycle.AbstractC0762s
    /* renamed from: b */
    public C0761r mo1343b() {
        if (m3202j() != null) {
            if (this.f810w == null) {
                this.f810w = new C0761r();
            }
            return this.f810w;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3232b(int i) {
        m3260Z().f819c = i;
    }

    /* renamed from: b */
    public void m3230b(Bundle bundle) {
        this.f773H = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3229b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3013r();
        }
        this.f804q = true;
        this.f787V = new C0251c();
        this.f786U = null;
        this.f775J = mo11a(layoutInflater, viewGroup, bundle);
        if (this.f775J != null) {
            this.f787V.mo1368a();
            this.f788W.mo1360a((C0753l<AbstractC0746g>) this.f787V);
        } else if (this.f786U == null) {
            this.f787V = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: b */
    public void m3228b(Menu menu) {
    }

    /* renamed from: b */
    public void m3225b(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m3227b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f767B) {
            return false;
        }
        if (this.f771F && this.f772G) {
            m3239a(menu, menuInflater);
            z = true;
        }
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        return iVar != null ? z | iVar.m3084a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean m3226b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: c */
    void m3224c() {
        C0252d dVar = this.f779N;
        AbstractC0254f fVar = null;
        if (dVar != null) {
            dVar.f833q = false;
            fVar = dVar.f834r;
            dVar.f834r = null;
        }
        if (fVar != null) {
            fVar.mo3003a();
        }
    }

    /* renamed from: c */
    public void m3223c(Bundle bundle) {
        this.f773H = true;
        m3199k(bundle);
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null && !iVar.m3054c(1)) {
            this.f808u.m3039f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m3222c(Menu menu) {
        if (!this.f767B) {
            if (this.f771F && this.f772G) {
                m3240a(menu);
            }
            LayoutInflater$Factory2C0266i iVar = this.f808u;
            if (iVar != null) {
                iVar.m3085a(menu);
            }
        }
    }

    /* renamed from: c */
    public void m3220c(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m3221c(MenuItem menuItem) {
        if (this.f767B) {
            return false;
        }
        if (m3238a(menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        return iVar != null && iVar.m3083a(menuItem);
    }

    /* renamed from: d */
    public final ActivityC0255d m3219d() {
        AbstractC0261g gVar = this.f807t;
        if (gVar == null) {
            return null;
        }
        return (ActivityC0255d) gVar.m3138b();
    }

    /* renamed from: d */
    public LayoutInflater m3218d(Bundle bundle) {
        return m3241a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3215d(boolean z) {
        m3225b(z);
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3072a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m3217d(Menu menu) {
        boolean z = false;
        if (this.f767B) {
            return false;
        }
        if (this.f771F && this.f772G) {
            m3228b(menu);
            z = true;
        }
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        return iVar != null ? z | iVar.m3062b(menu) : z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m3216d(MenuItem menuItem) {
        if (this.f767B) {
            return false;
        }
        if (this.f771F && this.f772G && m3226b(menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        return iVar != null && iVar.m3061b(menuItem);
    }

    /* renamed from: e */
    public void m3213e(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3212e(boolean z) {
        m3220c(z);
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3056b(z);
        }
    }

    /* renamed from: e */
    public boolean m3214e() {
        Boolean bool;
        C0252d dVar = this.f779N;
        if (dVar == null || (bool = dVar.f830n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void m3210f(Bundle bundle) {
        this.f773H = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3209f(boolean z) {
        m3260Z().f835s = z;
    }

    /* renamed from: f */
    public boolean m3211f() {
        Boolean bool;
        C0252d dVar = this.f779N;
        if (dVar == null || (bool = dVar.f829m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public View m3208g() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        return dVar.f817a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m3207g(Bundle bundle) {
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3013r();
        }
        this.f789b = 2;
        this.f773H = false;
        m3230b(bundle);
        if (this.f773H) {
            LayoutInflater$Factory2C0266i iVar2 = this.f808u;
            if (iVar2 != null) {
                iVar2.m3043e();
                return;
            }
            return;
        }
        throw new C0304r("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Animator m3206h() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        return dVar.f818b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m3205h(Bundle bundle) {
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null) {
            iVar.m3013r();
        }
        this.f789b = 1;
        this.f773H = false;
        m3223c(bundle);
        this.f784S = true;
        if (this.f773H) {
            this.f785T.m1385a(AbstractC0742e.EnumC0743a.ON_CREATE);
            return;
        }
        throw new C0304r("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final AbstractC0262h m3204i() {
        if (this.f808u == null) {
            m3284A();
            int i = this.f789b;
            if (i >= 4) {
                this.f808u.m3026k();
            } else if (i >= 3) {
                this.f808u.m3024l();
            } else if (i >= 2) {
                this.f808u.m3043e();
            } else if (i >= 1) {
                this.f808u.m3039f();
            }
        }
        return this.f808u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public LayoutInflater m3203i(Bundle bundle) {
        this.f783R = m3218d(bundle);
        return this.f783R;
    }

    /* renamed from: j */
    public Context m3202j() {
        AbstractC0261g gVar = this.f807t;
        if (gVar == null) {
            return null;
        }
        return gVar.m3136c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m3201j(Bundle bundle) {
        Parcelable u;
        m3213e(bundle);
        LayoutInflater$Factory2C0266i iVar = this.f808u;
        if (iVar != null && (u = iVar.m3010u()) != null) {
            bundle.putParcelable("android:support:fragments", u);
        }
    }

    /* renamed from: k */
    public Object m3200k() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        return dVar.f823g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m3199k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.f808u == null) {
                m3284A();
            }
            this.f808u.m3086a(parcelable, this.f809v);
            this.f809v = null;
            this.f808u.m3039f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public AbstractC0695e m3198l() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        return dVar.f831o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m3197l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f791d;
        if (sparseArray != null) {
            this.f776K.restoreHierarchyState(sparseArray);
            this.f791d = null;
        }
        this.f773H = false;
        m3210f(bundle);
        if (!this.f773H) {
            throw new C0304r("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f775J != null) {
            this.f786U.m1385a(AbstractC0742e.EnumC0743a.ON_CREATE);
        }
    }

    /* renamed from: m */
    public Object m3196m() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        return dVar.f825i;
    }

    /* renamed from: m */
    public void m3195m(Bundle bundle) {
        if (this.f793f < 0 || !m3280E()) {
            this.f795h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public AbstractC0695e m3194n() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        return dVar.f832p;
    }

    /* renamed from: o */
    public final AbstractC0262h m3193o() {
        return this.f806s;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f773H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m3219d().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f773H = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m3192p() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f820d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m3191q() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f821e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m3190r() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f822f;
    }

    /* renamed from: s */
    public Object m3189s() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f826j;
        return obj == f765Y ? m3196m() : obj;
    }

    /* renamed from: t */
    public final Resources m3188t() {
        return m3262X().getResources();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0178a.m3564a(this, sb);
        if (this.f793f >= 0) {
            sb.append(" #");
            sb.append(this.f793f);
        }
        if (this.f812y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f812y));
        }
        if (this.f766A != null) {
            sb.append(" ");
            sb.append(this.f766A);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public Object m3187u() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f824h;
        return obj == f765Y ? m3200k() : obj;
    }

    /* renamed from: v */
    public Object m3186v() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        return dVar.f827k;
    }

    /* renamed from: w */
    public Object m3185w() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f828l;
        return obj == f765Y ? m3186v() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m3184x() {
        C0252d dVar = this.f779N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f819c;
    }

    /* renamed from: y */
    public View m3183y() {
        return this.f775J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m3182z() {
        this.f793f = -1;
        this.f794g = null;
        this.f799l = false;
        this.f800m = false;
        this.f801n = false;
        this.f802o = false;
        this.f803p = false;
        this.f805r = 0;
        this.f806s = null;
        this.f808u = null;
        this.f807t = null;
        this.f812y = 0;
        this.f813z = 0;
        this.f766A = null;
        this.f767B = false;
        this.f768C = false;
        this.f770E = false;
    }
}
