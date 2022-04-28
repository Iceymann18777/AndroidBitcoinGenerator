package p000a.p036j.p037a;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p000a.p018g.p028k.C0179b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.j.a.a */
/* loaded from: classes.dex */
public final class C0244a extends AbstractC0287m implements AbstractC0262h.AbstractC0263a, LayoutInflater$Factory2C0266i.AbstractC0280l {

    /* renamed from: a */
    final LayoutInflater$Factory2C0266i f726a;

    /* renamed from: c */
    int f728c;

    /* renamed from: d */
    int f729d;

    /* renamed from: e */
    int f730e;

    /* renamed from: f */
    int f731f;

    /* renamed from: g */
    int f732g;

    /* renamed from: h */
    int f733h;

    /* renamed from: i */
    boolean f734i;

    /* renamed from: j */
    String f735j;

    /* renamed from: k */
    boolean f736k;

    /* renamed from: m */
    int f738m;

    /* renamed from: n */
    CharSequence f739n;

    /* renamed from: o */
    int f740o;

    /* renamed from: p */
    CharSequence f741p;

    /* renamed from: q */
    ArrayList<String> f742q;

    /* renamed from: r */
    ArrayList<String> f743r;

    /* renamed from: t */
    ArrayList<Runnable> f745t;

    /* renamed from: b */
    ArrayList<C0245a> f727b = new ArrayList<>();

    /* renamed from: l */
    int f737l = -1;

    /* renamed from: s */
    boolean f744s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.j.a.a$a */
    /* loaded from: classes.dex */
    public static final class C0245a {

        /* renamed from: a */
        int f746a;

        /* renamed from: b */
        ComponentCallbacksC0248c f747b;

        /* renamed from: c */
        int f748c;

        /* renamed from: d */
        int f749d;

        /* renamed from: e */
        int f750e;

        /* renamed from: f */
        int f751f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0245a() {
        }

        C0245a(int i, ComponentCallbacksC0248c cVar) {
            this.f746a = i;
            this.f747b = cVar;
        }
    }

    public C0244a(LayoutInflater$Factory2C0266i iVar) {
        this.f726a = iVar;
    }

    /* renamed from: a */
    private void m3301a(int i, ComponentCallbacksC0248c cVar, String str, int i2) {
        Class<?> cls = cVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        cVar.f806s = this.f726a;
        if (str != null) {
            String str2 = cVar.f766A;
            if (str2 == null || str.equals(str2)) {
                cVar.f766A = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + cVar + ": was " + cVar.f766A + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = cVar.f812y;
                if (i3 == 0 || i3 == i) {
                    cVar.f812y = i;
                    cVar.f813z = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + cVar + ": was " + cVar.f812y + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + cVar + " with tag " + str + " to container view with no id");
            }
        }
        m3300a(new C0245a(i2, cVar));
    }

    /* renamed from: b */
    private static boolean m3291b(C0245a aVar) {
        ComponentCallbacksC0248c cVar = aVar.f747b;
        return cVar != null && cVar.f799l && cVar.f775J != null && !cVar.f768C && !cVar.f767B && cVar.m3281D();
    }

    @Override // p000a.p036j.p037a.AbstractC0287m
    /* renamed from: a */
    public int mo2994a() {
        return m3294a(false);
    }

    /* renamed from: a */
    int m3294a(boolean z) {
        if (!this.f736k) {
            if (LayoutInflater$Factory2C0266i.f855F) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0179b("FragmentManager"));
                m3298a("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.f736k = true;
            this.f737l = this.f734i ? this.f726a.m3067b(this) : -1;
            this.f726a.m3094a(this, z);
            return this.f737l;
        }
        throw new IllegalStateException("commit already called");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ComponentCallbacksC0248c m3295a(ArrayList<ComponentCallbacksC0248c> arrayList, ComponentCallbacksC0248c cVar) {
        ComponentCallbacksC0248c cVar2 = cVar;
        int i = 0;
        while (i < this.f727b.size()) {
            C0245a aVar = this.f727b.get(i);
            int i2 = aVar.f746a;
            if (i2 != 1) {
                if (i2 == 2) {
                    ComponentCallbacksC0248c cVar3 = aVar.f747b;
                    int i3 = cVar3.f813z;
                    ComponentCallbacksC0248c cVar4 = cVar2;
                    i = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ComponentCallbacksC0248c cVar5 = arrayList.get(size);
                        if (cVar5.f813z == i3) {
                            if (cVar5 == cVar3) {
                                z = true;
                            } else {
                                if (cVar5 == cVar4) {
                                    this.f727b.add(i, new C0245a(9, cVar5));
                                    i++;
                                    cVar4 = null;
                                }
                                C0245a aVar2 = new C0245a(3, cVar5);
                                aVar2.f748c = aVar.f748c;
                                aVar2.f750e = aVar.f750e;
                                aVar2.f749d = aVar.f749d;
                                aVar2.f751f = aVar.f751f;
                                this.f727b.add(i, aVar2);
                                arrayList.remove(cVar5);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f727b.remove(i);
                        i--;
                    } else {
                        aVar.f746a = 1;
                        arrayList.add(cVar3);
                    }
                    cVar2 = cVar4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f747b);
                    ComponentCallbacksC0248c cVar6 = aVar.f747b;
                    if (cVar6 == cVar2) {
                        this.f727b.add(i, new C0245a(9, cVar6));
                        i++;
                        cVar2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f727b.add(i, new C0245a(9, cVar2));
                        i++;
                        cVar2 = aVar.f747b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f747b);
            i++;
        }
        return cVar2;
    }

    @Override // p000a.p036j.p037a.AbstractC0287m
    /* renamed from: a */
    public AbstractC0287m mo2993a(int i, ComponentCallbacksC0248c cVar) {
        m3302a(i, cVar, (String) null);
        return this;
    }

    /* renamed from: a */
    public AbstractC0287m m3302a(int i, ComponentCallbacksC0248c cVar, String str) {
        if (i != 0) {
            m3301a(i, cVar, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3303a(int i) {
        C0245a aVar;
        if (this.f734i) {
            if (LayoutInflater$Factory2C0266i.f855F) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f727b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0248c cVar = this.f727b.get(i2).f747b;
                if (cVar != null) {
                    cVar.f805r += i;
                    if (LayoutInflater$Factory2C0266i.f855F) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f747b + " to " + aVar.f747b.f805r);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3300a(C0245a aVar) {
        this.f727b.add(aVar);
        aVar.f748c = this.f728c;
        aVar.f749d = this.f729d;
        aVar.f750e = this.f730e;
        aVar.f751f = this.f731f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3299a(ComponentCallbacksC0248c.AbstractC0254f fVar) {
        for (int i = 0; i < this.f727b.size(); i++) {
            C0245a aVar = this.f727b.get(i);
            if (m3291b(aVar)) {
                aVar.f747b.m3253a(fVar);
            }
        }
    }

    /* renamed from: a */
    public void m3298a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m3297a(str, printWriter, true);
    }

    /* renamed from: a */
    public void m3297a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f735j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f737l);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f736k);
            if (this.f732g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f732g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f733h));
            }
            if (!(this.f728c == 0 && this.f729d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f728c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f729d));
            }
            if (!(this.f730e == 0 && this.f731f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f730e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f731f));
            }
            if (!(this.f738m == 0 && this.f739n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f738m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f739n);
            }
            if (!(this.f740o == 0 && this.f741p == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f740o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f741p);
            }
        }
        if (!this.f727b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int size = this.f727b.size();
            for (int i = 0; i < size; i++) {
                C0245a aVar = this.f727b.get(i);
                switch (aVar.f746a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f746a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f747b);
                if (z) {
                    if (!(aVar.f748c == 0 && aVar.f749d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f748c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f749d));
                    }
                    if (aVar.f750e != 0 || aVar.f751f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f750e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f751f));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m3296a(ArrayList<C0244a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f727b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            ComponentCallbacksC0248c cVar = this.f727b.get(i4).f747b;
            int i5 = cVar != null ? cVar.f813z : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0244a aVar = arrayList.get(i6);
                    int size2 = aVar.f727b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ComponentCallbacksC0248c cVar2 = aVar.f727b.get(i7).f747b;
                        if ((cVar2 != null ? cVar2.f813z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // p000a.p036j.p037a.LayoutInflater$Factory2C0266i.AbstractC0280l
    /* renamed from: a */
    public boolean mo3004a(ArrayList<C0244a> arrayList, ArrayList<Boolean> arrayList2) {
        if (LayoutInflater$Factory2C0266i.f855F) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f734i) {
            return true;
        }
        this.f726a.m3106a(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ComponentCallbacksC0248c m3290b(ArrayList<ComponentCallbacksC0248c> arrayList, ComponentCallbacksC0248c cVar) {
        for (int i = 0; i < this.f727b.size(); i++) {
            C0245a aVar = this.f727b.get(i);
            int i2 = aVar.f746a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            cVar = null;
                            break;
                        case 9:
                            cVar = aVar.f747b;
                            break;
                    }
                }
                arrayList.add(aVar.f747b);
            }
            arrayList.remove(aVar.f747b);
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3293b() {
        int size = this.f727b.size();
        for (int i = 0; i < size; i++) {
            C0245a aVar = this.f727b.get(i);
            ComponentCallbacksC0248c cVar = aVar.f747b;
            if (cVar != null) {
                cVar.m3258a(this.f732g, this.f733h);
            }
            switch (aVar.f746a) {
                case 1:
                    cVar.m3259a(aVar.f748c);
                    this.f726a.m3097a(cVar, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f746a);
                case 3:
                    cVar.m3259a(aVar.f749d);
                    this.f726a.m3025k(cVar);
                    break;
                case 4:
                    cVar.m3259a(aVar.f749d);
                    this.f726a.m3041e(cVar);
                    break;
                case 5:
                    cVar.m3259a(aVar.f748c);
                    this.f726a.m3017o(cVar);
                    break;
                case 6:
                    cVar.m3259a(aVar.f749d);
                    this.f726a.m3053c(cVar);
                    break;
                case 7:
                    cVar.m3259a(aVar.f748c);
                    this.f726a.m3104a(cVar);
                    break;
                case 8:
                    this.f726a.m3019n(cVar);
                    break;
                case 9:
                    this.f726a.m3019n(null);
                    break;
            }
            if (!(this.f744s || aVar.f746a == 1 || cVar == null)) {
                this.f726a.m3032h(cVar);
            }
        }
        if (!this.f744s) {
            LayoutInflater$Factory2C0266i iVar = this.f726a;
            iVar.m3108a(iVar.f875m, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3289b(boolean z) {
        for (int size = this.f727b.size() - 1; size >= 0; size--) {
            C0245a aVar = this.f727b.get(size);
            ComponentCallbacksC0248c cVar = aVar.f747b;
            if (cVar != null) {
                cVar.m3258a(LayoutInflater$Factory2C0266i.m3042e(this.f732g), this.f733h);
            }
            switch (aVar.f746a) {
                case 1:
                    cVar.m3259a(aVar.f751f);
                    this.f726a.m3025k(cVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f746a);
                case 3:
                    cVar.m3259a(aVar.f750e);
                    this.f726a.m3097a(cVar, false);
                    break;
                case 4:
                    cVar.m3259a(aVar.f750e);
                    this.f726a.m3017o(cVar);
                    break;
                case 5:
                    cVar.m3259a(aVar.f751f);
                    this.f726a.m3041e(cVar);
                    break;
                case 6:
                    cVar.m3259a(aVar.f750e);
                    this.f726a.m3104a(cVar);
                    break;
                case 7:
                    cVar.m3259a(aVar.f751f);
                    this.f726a.m3053c(cVar);
                    break;
                case 8:
                    this.f726a.m3019n(null);
                    break;
                case 9:
                    this.f726a.m3019n(cVar);
                    break;
            }
            if (!(this.f744s || aVar.f746a == 3 || cVar == null)) {
                this.f726a.m3032h(cVar);
            }
        }
        if (!this.f744s && z) {
            LayoutInflater$Factory2C0266i iVar = this.f726a;
            iVar.m3108a(iVar.f875m, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m3292b(int i) {
        int size = this.f727b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0248c cVar = this.f727b.get(i2).f747b;
            int i3 = cVar != null ? cVar.f813z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String m3288c() {
        return this.f735j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m3287d() {
        for (int i = 0; i < this.f727b.size(); i++) {
            if (m3291b(this.f727b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m3286e() {
        ArrayList<Runnable> arrayList = this.f745t;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f745t.get(i).run();
            }
            this.f745t = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f737l >= 0) {
            sb.append(" #");
            sb.append(this.f737l);
        }
        if (this.f735j != null) {
            sb.append(" ");
            sb.append(this.f735j);
        }
        sb.append("}");
        return sb.toString();
    }
}
