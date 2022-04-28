package p000a.p045n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p013d.C0067a;
import p000a.p013d.C0072d;
import p000a.p018g.p029l.C0216r;

/* renamed from: a.n.m */
/* loaded from: classes.dex */
public abstract class AbstractC0367m implements Cloneable {

    /* renamed from: H */
    private static final int[] f1106H = {2, 1, 3, 4};

    /* renamed from: I */
    private static final AbstractC0352g f1107I = new C0368a();

    /* renamed from: J */
    private static ThreadLocal<C0067a<Animator, C0371d>> f1108J = new ThreadLocal<>();

    /* renamed from: D */
    AbstractC0378p f1112D;

    /* renamed from: E */
    private AbstractC0372e f1113E;

    /* renamed from: F */
    private C0067a<String, String> f1114F;

    /* renamed from: u */
    private ArrayList<C0383s> f1135u;

    /* renamed from: v */
    private ArrayList<C0383s> f1136v;

    /* renamed from: b */
    private String f1116b = getClass().getName();

    /* renamed from: c */
    private long f1117c = -1;

    /* renamed from: d */
    long f1118d = -1;

    /* renamed from: e */
    private TimeInterpolator f1119e = null;

    /* renamed from: f */
    ArrayList<Integer> f1120f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<View> f1121g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<String> f1122h = null;

    /* renamed from: i */
    private ArrayList<Class> f1123i = null;

    /* renamed from: j */
    private ArrayList<Integer> f1124j = null;

    /* renamed from: k */
    private ArrayList<View> f1125k = null;

    /* renamed from: l */
    private ArrayList<Class> f1126l = null;

    /* renamed from: m */
    private ArrayList<String> f1127m = null;

    /* renamed from: n */
    private ArrayList<Integer> f1128n = null;

    /* renamed from: o */
    private ArrayList<View> f1129o = null;

    /* renamed from: p */
    private ArrayList<Class> f1130p = null;

    /* renamed from: q */
    private C0384t f1131q = new C0384t();

    /* renamed from: r */
    private C0384t f1132r = new C0384t();

    /* renamed from: s */
    C0379q f1133s = null;

    /* renamed from: t */
    private int[] f1134t = f1106H;

    /* renamed from: w */
    boolean f1137w = false;

    /* renamed from: x */
    ArrayList<Animator> f1138x = new ArrayList<>();

    /* renamed from: y */
    private int f1139y = 0;

    /* renamed from: z */
    private boolean f1140z = false;

    /* renamed from: A */
    private boolean f1109A = false;

    /* renamed from: B */
    private ArrayList<AbstractC0373f> f1110B = null;

    /* renamed from: C */
    private ArrayList<Animator> f1111C = new ArrayList<>();

    /* renamed from: G */
    private AbstractC0352g f1115G = f1107I;

    /* renamed from: a.n.m$a */
    /* loaded from: classes.dex */
    static class C0368a extends AbstractC0352g {
        C0368a() {
        }

        @Override // p000a.p045n.AbstractC0352g
        /* renamed from: a */
        public Path mo2810a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.n.m$b */
    /* loaded from: classes.dex */
    public class C0369b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0067a f1141a;

        C0369b(C0067a aVar) {
            this.f1141a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1141a.remove(animator);
            AbstractC0367m.this.f1138x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0367m.this.f1138x.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.n.m$c */
    /* loaded from: classes.dex */
    public class C0370c extends AnimatorListenerAdapter {
        C0370c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0367m.this.m2844a();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.n.m$d */
    /* loaded from: classes.dex */
    public static class C0371d {

        /* renamed from: a */
        View f1144a;

        /* renamed from: b */
        String f1145b;

        /* renamed from: c */
        C0383s f1146c;

        /* renamed from: d */
        AbstractC0366l0 f1147d;

        /* renamed from: e */
        AbstractC0367m f1148e;

        C0371d(View view, String str, AbstractC0367m mVar, AbstractC0366l0 l0Var, C0383s sVar) {
            this.f1144a = view;
            this.f1145b = str;
            this.f1146c = sVar;
            this.f1147d = l0Var;
            this.f1148e = mVar;
        }
    }

    /* renamed from: a.n.m$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0372e {
    }

    /* renamed from: a.n.m$f */
    /* loaded from: classes.dex */
    public interface AbstractC0373f {
        /* renamed from: a */
        void mo2776a(AbstractC0367m mVar);

        /* renamed from: b */
        void mo2775b(AbstractC0367m mVar);

        /* renamed from: c */
        void mo2809c(AbstractC0367m mVar);

        /* renamed from: d */
        void mo2808d(AbstractC0367m mVar);
    }

    /* renamed from: a */
    private void m2843a(C0067a<View, C0383s> aVar, C0067a<View, C0383s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C0383s d = aVar.m4013d(i);
            if (m2826b(d.f1167b)) {
                this.f1135u.add(d);
                this.f1136v.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C0383s d2 = aVar2.m4013d(i2);
            if (m2826b(d2.f1167b)) {
                this.f1136v.add(d2);
                this.f1135u.add(null);
            }
        }
    }

    /* renamed from: a */
    private void m2842a(C0067a<View, C0383s> aVar, C0067a<View, C0383s> aVar2, C0067a<String, View> aVar3, C0067a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View d = aVar3.m4013d(i);
            if (d != null && m2826b(d) && (view = aVar4.get(aVar3.m4016b(i))) != null && m2826b(view)) {
                C0383s sVar = aVar.get(d);
                C0383s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f1135u.add(sVar);
                    this.f1136v.add(sVar2);
                    aVar.remove(d);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2841a(C0067a<View, C0383s> aVar, C0067a<View, C0383s> aVar2, C0072d<View> dVar, C0072d<View> dVar2) {
        View b;
        int b2 = dVar.m4058b();
        for (int i = 0; i < b2; i++) {
            View c = dVar.m4053c(i);
            if (c != null && m2826b(c) && (b = dVar2.m4056b(dVar.m4061a(i))) != null && m2826b(b)) {
                C0383s sVar = aVar.get(c);
                C0383s sVar2 = aVar2.get(b);
                if (!(sVar == null || sVar2 == null)) {
                    this.f1135u.add(sVar);
                    this.f1136v.add(sVar2);
                    aVar.remove(c);
                    aVar2.remove(b);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2840a(C0067a<View, C0383s> aVar, C0067a<View, C0383s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && m2826b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m2826b(view)) {
                C0383s sVar = aVar.get(valueAt);
                C0383s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f1135u.add(sVar);
                    this.f1136v.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2837a(C0384t tVar, C0384t tVar2) {
        C0067a<View, C0383s> aVar = new C0067a<>(tVar.f1169a);
        C0067a<View, C0383s> aVar2 = new C0067a<>(tVar2.f1169a);
        int i = 0;
        while (true) {
            int[] iArr = this.f1134t;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m2827b(aVar, aVar2);
                } else if (i2 == 2) {
                    m2842a(aVar, aVar2, tVar.f1172d, tVar2.f1172d);
                } else if (i2 == 3) {
                    m2840a(aVar, aVar2, tVar.f1170b, tVar2.f1170b);
                } else if (i2 == 4) {
                    m2841a(aVar, aVar2, tVar.f1171c, tVar2.f1171c);
                }
                i++;
            } else {
                m2843a(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m2836a(C0384t tVar, View view, C0383s sVar) {
        tVar.f1169a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f1170b.indexOfKey(id) >= 0) {
                tVar.f1170b.put(id, null);
            } else {
                tVar.f1170b.put(id, view);
            }
        }
        String p = C0216r.m3405p(view);
        if (p != null) {
            if (tVar.f1172d.containsKey(p)) {
                tVar.f1172d.put(p, null);
            } else {
                tVar.f1172d.put(p, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f1171c.m4052c(itemIdAtPosition) >= 0) {
                    View b = tVar.f1171c.m4056b(itemIdAtPosition);
                    if (b != null) {
                        C0216r.m3424b(b, false);
                        tVar.f1171c.m4051c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0216r.m3424b(view, true);
                tVar.f1171c.m4051c(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    private void m2834a(Animator animator, C0067a<Animator, C0371d> aVar) {
        if (animator != null) {
            animator.addListener(new C0369b(aVar));
            m2835a(animator);
        }
    }

    /* renamed from: a */
    private static boolean m2838a(C0383s sVar, C0383s sVar2, String str) {
        Object obj = sVar.f1166a.get(str);
        Object obj2 = sVar2.f1166a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: b */
    private void m2827b(C0067a<View, C0383s> aVar, C0067a<View, C0383s> aVar2) {
        C0383s remove;
        View view;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View b = aVar.m4016b(size);
            if (!(b == null || !m2826b(b) || (remove = aVar2.remove(b)) == null || (view = remove.f1167b) == null || !m2826b(view))) {
                this.f1135u.add(aVar.m4014c(size));
                this.f1136v.add(remove);
            }
        }
    }

    /* renamed from: c */
    private void m2823c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f1124j;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f1125k;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f1126l;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            if (this.f1126l.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C0383s sVar = new C0383s();
                        sVar.f1167b = view;
                        if (z) {
                            mo2783c(sVar);
                        } else {
                            mo2792a(sVar);
                        }
                        sVar.f1168c.add(this);
                        mo2784b(sVar);
                        m2836a(z ? this.f1131q : this.f1132r, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f1128n;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f1129o;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.f1130p;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        if (this.f1130p.get(i2).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m2823c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    private static C0067a<Animator, C0371d> m2811p() {
        C0067a<Animator, C0371d> aVar = f1108J.get();
        if (aVar != null) {
            return aVar;
        }
        C0067a<Animator, C0371d> aVar2 = new C0067a<>();
        f1108J.set(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public AbstractC0367m mo2798a(long j) {
        this.f1118d = j;
        return this;
    }

    /* renamed from: a */
    public AbstractC0367m mo2795a(AbstractC0373f fVar) {
        if (this.f1110B == null) {
            this.f1110B = new ArrayList<>();
        }
        this.f1110B.add(fVar);
        return this;
    }

    /* renamed from: a */
    public AbstractC0367m mo2791a(TimeInterpolator timeInterpolator) {
        this.f1119e = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public AbstractC0367m mo2790a(View view) {
        this.f1121g.add(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0383s m2833a(View view, boolean z) {
        C0379q qVar = this.f1133s;
        if (qVar != null) {
            return qVar.m2833a(view, z);
        }
        ArrayList<C0383s> arrayList = z ? this.f1135u : this.f1136v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0383s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f1167b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f1136v : this.f1135u).get(i);
    }

    /* renamed from: a */
    public Animator mo2831a(ViewGroup viewGroup, C0383s sVar, C0383s sVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo2788a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1118d != -1) {
            str2 = str2 + "dur(" + this.f1118d + ") ";
        }
        if (this.f1117c != -1) {
            str2 = str2 + "dly(" + this.f1117c + ") ";
        }
        if (this.f1119e != null) {
            str2 = str2 + "interp(" + this.f1119e + ") ";
        }
        if (this.f1120f.size() <= 0 && this.f1121g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f1120f.size() > 0) {
            String str4 = str3;
            for (int i = 0; i < this.f1120f.size(); i++) {
                if (i > 0) {
                    str4 = str4 + ", ";
                }
                str4 = str4 + this.f1120f.get(i);
            }
            str3 = str4;
        }
        if (this.f1121g.size() > 0) {
            for (int i2 = 0; i2 < this.f1121g.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1121g.get(i2);
            }
        }
        return str3 + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2844a() {
        this.f1139y--;
        if (this.f1139y == 0) {
            ArrayList<AbstractC0373f> arrayList = this.f1110B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1110B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC0373f) arrayList2.get(i)).mo2775b(this);
                }
            }
            for (int i2 = 0; i2 < this.f1131q.f1171c.m4058b(); i2++) {
                View c = this.f1131q.f1171c.m4053c(i2);
                if (c != null) {
                    C0216r.m3424b(c, false);
                }
            }
            for (int i3 = 0; i3 < this.f1132r.f1171c.m4058b(); i3++) {
                View c2 = this.f1132r.f1171c.m4053c(i3);
                if (c2 != null) {
                    C0216r.m3424b(c2, false);
                }
            }
            this.f1109A = true;
        }
    }

    /* renamed from: a */
    public void mo2797a(AbstractC0352g gVar) {
        if (gVar == null) {
            gVar = f1107I;
        }
        this.f1115G = gVar;
    }

    /* renamed from: a */
    public void mo2796a(AbstractC0372e eVar) {
        this.f1113E = eVar;
    }

    /* renamed from: a */
    public void mo2793a(AbstractC0378p pVar) {
        this.f1112D = pVar;
    }

    /* renamed from: a */
    public abstract void mo2792a(C0383s sVar);

    /* renamed from: a */
    protected void m2835a(Animator animator) {
        if (animator == null) {
            m2844a();
            return;
        }
        if (m2828b() >= 0) {
            animator.setDuration(m2828b());
        }
        if (m2818h() >= 0) {
            animator.setStartDelay(m2818h());
        }
        if (m2822d() != null) {
            animator.setInterpolator(m2822d());
        }
        animator.addListener(new C0370c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2832a(ViewGroup viewGroup) {
        C0371d dVar;
        this.f1135u = new ArrayList<>();
        this.f1136v = new ArrayList<>();
        m2837a(this.f1131q, this.f1132r);
        C0067a<Animator, C0371d> p = m2811p();
        int size = p.size();
        AbstractC0366l0 d = C0341d0.m2895d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b = p.m4016b(i);
            if (!(b == null || (dVar = p.get(b)) == null || dVar.f1144a == null || !d.equals(dVar.f1147d))) {
                C0383s sVar = dVar.f1146c;
                View view = dVar.f1144a;
                C0383s b2 = m2825b(view, true);
                C0383s a = m2833a(view, true);
                if (!(b2 == null && a == null) && dVar.f1148e.mo2839a(sVar, a)) {
                    if (b.isRunning() || b.isStarted()) {
                        b.cancel();
                    } else {
                        p.remove(b);
                    }
                }
            }
        }
        mo2789a(viewGroup, this.f1131q, this.f1132r, this.f1135u, this.f1136v);
        mo2779n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2789a(ViewGroup viewGroup, C0384t tVar, C0384t tVar2, ArrayList<C0383s> arrayList, ArrayList<C0383s> arrayList2) {
        Animator a;
        View view;
        Animator animator;
        C0383s sVar;
        C0067a<Animator, C0371d> p = m2811p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i = 0;
        while (i < size) {
            C0383s sVar2 = arrayList.get(i);
            C0383s sVar3 = arrayList2.get(i);
            if (sVar2 != null && !sVar2.f1168c.contains(this)) {
                sVar2 = null;
            }
            if (sVar3 != null && !sVar3.f1168c.contains(this)) {
                sVar3 = null;
            }
            if (!(sVar2 == null && sVar3 == null)) {
                if ((sVar2 == null || sVar3 == null || mo2839a(sVar2, sVar3)) && (a = mo2831a(viewGroup, sVar2, sVar3)) != null) {
                    if (sVar3 != null) {
                        view = sVar3.f1167b;
                        String[] m = mo2813m();
                        if (view == null || m == null || m.length <= 0) {
                            size = size;
                            i = i;
                            animator = a;
                            sVar = null;
                        } else {
                            sVar = new C0383s();
                            sVar.f1167b = view;
                            size = size;
                            C0383s sVar4 = tVar2.f1169a.get(view);
                            if (sVar4 != null) {
                                int i2 = 0;
                                while (i2 < m.length) {
                                    sVar.f1166a.put(m[i2], sVar4.f1166a.get(m[i2]));
                                    i2++;
                                    i = i;
                                    sVar4 = sVar4;
                                }
                            }
                            int size2 = p.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    animator = a;
                                    break;
                                }
                                C0371d dVar = p.get(p.m4016b(i3));
                                if (dVar.f1146c != null && dVar.f1144a == view && dVar.f1145b.equals(m2821e()) && dVar.f1146c.equals(sVar)) {
                                    animator = null;
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        size = size;
                        i = i;
                        view = sVar2.f1167b;
                        animator = a;
                        sVar = null;
                    }
                    if (animator != null) {
                        AbstractC0378p pVar = this.f1112D;
                        if (pVar != null) {
                            long a2 = pVar.m2800a(viewGroup, this, sVar2, sVar3);
                            sparseIntArray.put(this.f1111C.size(), (int) a2);
                            j = Math.min(a2, j);
                        }
                        p.put(animator, new C0371d(view, m2821e(), this, C0341d0.m2895d(viewGroup), sVar));
                        this.f1111C.add(animator);
                    }
                    i++;
                }
            }
            size = size;
            i = i;
            i++;
        }
        if (j != 0) {
            for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                Animator animator2 = this.f1111C.get(sparseIntArray.keyAt(i4));
                animator2.setStartDelay((sparseIntArray.valueAt(i4) - j) + animator2.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2830a(ViewGroup viewGroup, boolean z) {
        C0067a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        m2829a(z);
        if ((this.f1120f.size() > 0 || this.f1121g.size() > 0) && (((arrayList = this.f1122h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f1123i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f1120f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f1120f.get(i).intValue());
                if (findViewById != null) {
                    C0383s sVar = new C0383s();
                    sVar.f1167b = findViewById;
                    if (z) {
                        mo2783c(sVar);
                    } else {
                        mo2792a(sVar);
                    }
                    sVar.f1168c.add(this);
                    mo2784b(sVar);
                    m2836a(z ? this.f1131q : this.f1132r, findViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.f1121g.size(); i2++) {
                View view = this.f1121g.get(i2);
                C0383s sVar2 = new C0383s();
                sVar2.f1167b = view;
                if (z) {
                    mo2783c(sVar2);
                } else {
                    mo2792a(sVar2);
                }
                sVar2.f1168c.add(this);
                mo2784b(sVar2);
                m2836a(z ? this.f1131q : this.f1132r, view, sVar2);
            }
        } else {
            m2823c(viewGroup, z);
        }
        if (!(z || (aVar = this.f1114F) == null)) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f1131q.f1172d.remove(this.f1114F.m4016b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f1131q.f1172d.put(this.f1114F.m4013d(i4), view2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2829a(boolean z) {
        C0384t tVar;
        if (z) {
            this.f1131q.f1169a.clear();
            this.f1131q.f1170b.clear();
            tVar = this.f1131q;
        } else {
            this.f1132r.f1169a.clear();
            this.f1132r.f1170b.clear();
            tVar = this.f1132r;
        }
        tVar.f1171c.m4062a();
    }

    /* renamed from: a */
    public boolean mo2839a(C0383s sVar, C0383s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] m = mo2813m();
        if (m != null) {
            for (String str : m) {
                if (!m2838a(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.f1166a.keySet()) {
            if (m2838a(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: b */
    public long m2828b() {
        return this.f1118d;
    }

    /* renamed from: b */
    public AbstractC0367m mo2786b(long j) {
        this.f1117c = j;
        return this;
    }

    /* renamed from: b */
    public AbstractC0367m mo2785b(AbstractC0373f fVar) {
        ArrayList<AbstractC0373f> arrayList = this.f1110B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f1110B.size() == 0) {
            this.f1110B = null;
        }
        return this;
    }

    /* renamed from: b */
    public C0383s m2825b(View view, boolean z) {
        C0379q qVar = this.f1133s;
        if (qVar != null) {
            return qVar.m2825b(view, z);
        }
        return (z ? this.f1131q : this.f1132r).f1169a.get(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2784b(C0383s sVar) {
        String[] a;
        if (this.f1112D != null && !sVar.f1166a.isEmpty() && (a = this.f1112D.m2802a()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= a.length) {
                    z = true;
                    break;
                } else if (!sVar.f1166a.containsKey(a[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f1112D.m2801a(sVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m2826b(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f1124j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f1125k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f1126l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f1126l.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.f1127m == null || C0216r.m3405p(view) == null || !this.f1127m.contains(C0216r.m3405p(view)))) {
            return false;
        }
        if ((this.f1120f.size() == 0 && this.f1121g.size() == 0 && (((arrayList = this.f1123i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f1122h) == null || arrayList2.isEmpty()))) || this.f1120f.contains(Integer.valueOf(id)) || this.f1121g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f1122h;
        if (arrayList6 != null && arrayList6.contains(C0216r.m3405p(view))) {
            return true;
        }
        if (this.f1123i != null) {
            for (int i2 = 0; i2 < this.f1123i.size(); i2++) {
                if (this.f1123i.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public AbstractC0372e m2824c() {
        return this.f1113E;
    }

    /* renamed from: c */
    public abstract void mo2783c(C0383s sVar);

    /* renamed from: c */
    public void mo2782c(View view) {
        if (!this.f1109A) {
            C0067a<Animator, C0371d> p = m2811p();
            int size = p.size();
            AbstractC0366l0 d = C0341d0.m2895d(view);
            for (int i = size - 1; i >= 0; i--) {
                C0371d d2 = p.m4013d(i);
                if (d2.f1144a != null && d.equals(d2.f1147d)) {
                    C0319a.m2935a(p.m4016b(i));
                }
            }
            ArrayList<AbstractC0373f> arrayList = this.f1110B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1110B.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((AbstractC0373f) arrayList2.get(i2)).mo2809c(this);
                }
            }
            this.f1140z = true;
        }
    }

    public AbstractC0367m clone() {
        try {
            AbstractC0367m mVar = (AbstractC0367m) super.clone();
            mVar.f1111C = new ArrayList<>();
            mVar.f1131q = new C0384t();
            mVar.f1132r = new C0384t();
            mVar.f1135u = null;
            mVar.f1136v = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public AbstractC0367m mo2781d(View view) {
        this.f1121g.remove(view);
        return this;
    }

    /* renamed from: d */
    public TimeInterpolator m2822d() {
        return this.f1119e;
    }

    /* renamed from: e */
    public String m2821e() {
        return this.f1116b;
    }

    /* renamed from: e */
    public void mo2780e(View view) {
        if (this.f1140z) {
            if (!this.f1109A) {
                C0067a<Animator, C0371d> p = m2811p();
                int size = p.size();
                AbstractC0366l0 d = C0341d0.m2895d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0371d d2 = p.m4013d(i);
                    if (d2.f1144a != null && d.equals(d2.f1147d)) {
                        C0319a.m2933b(p.m4016b(i));
                    }
                }
                ArrayList<AbstractC0373f> arrayList = this.f1110B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f1110B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((AbstractC0373f) arrayList2.get(i2)).mo2808d(this);
                    }
                }
            }
            this.f1140z = false;
        }
    }

    /* renamed from: f */
    public AbstractC0352g m2820f() {
        return this.f1115G;
    }

    /* renamed from: g */
    public AbstractC0378p m2819g() {
        return this.f1112D;
    }

    /* renamed from: h */
    public long m2818h() {
        return this.f1117c;
    }

    /* renamed from: i */
    public List<Integer> m2817i() {
        return this.f1120f;
    }

    /* renamed from: j */
    public List<String> m2816j() {
        return this.f1122h;
    }

    /* renamed from: k */
    public List<Class> m2815k() {
        return this.f1123i;
    }

    /* renamed from: l */
    public List<View> m2814l() {
        return this.f1121g;
    }

    /* renamed from: m */
    public String[] mo2813m() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void mo2779n() {
        m2812o();
        C0067a<Animator, C0371d> p = m2811p();
        Iterator<Animator> it = this.f1111C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (p.containsKey(next)) {
                m2812o();
                m2834a(next, p);
            }
        }
        this.f1111C.clear();
        m2844a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m2812o() {
        if (this.f1139y == 0) {
            ArrayList<AbstractC0373f> arrayList = this.f1110B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1110B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC0373f) arrayList2.get(i)).mo2776a(this);
                }
            }
            this.f1109A = false;
        }
        this.f1139y++;
    }

    public String toString() {
        return mo2788a("");
    }
}
