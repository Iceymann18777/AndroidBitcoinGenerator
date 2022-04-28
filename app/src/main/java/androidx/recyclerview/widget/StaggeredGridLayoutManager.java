package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p000a.p018g.p029l.p030a0.C0191c;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends C0813j.AbstractC0835o implements C0813j.AbstractC0852z.AbstractC0853a {

    /* renamed from: B */
    private BitSet f2882B;

    /* renamed from: G */
    private boolean f2887G;

    /* renamed from: H */
    private boolean f2888H;

    /* renamed from: I */
    private C0777e f2889I;

    /* renamed from: J */
    private int f2890J;

    /* renamed from: O */
    private int[] f2895O;

    /* renamed from: t */
    C0779f[] f2898t;

    /* renamed from: u */
    AbstractC0810i f2899u;

    /* renamed from: v */
    AbstractC0810i f2900v;

    /* renamed from: w */
    private int f2901w;

    /* renamed from: x */
    private int f2902x;

    /* renamed from: s */
    private int f2897s = -1;

    /* renamed from: z */
    boolean f2904z = false;

    /* renamed from: A */
    boolean f2881A = false;

    /* renamed from: C */
    int f2883C = -1;

    /* renamed from: D */
    int f2884D = Integer.MIN_VALUE;

    /* renamed from: E */
    C0774d f2885E = new C0774d();

    /* renamed from: F */
    private int f2886F = 2;

    /* renamed from: K */
    private final Rect f2891K = new Rect();

    /* renamed from: L */
    private final C0772b f2892L = new C0772b();

    /* renamed from: M */
    private boolean f2893M = false;

    /* renamed from: N */
    private boolean f2894N = true;

    /* renamed from: P */
    private final Runnable f2896P = new RunnableC0771a();

    /* renamed from: y */
    private final C0807g f2903y = new C0807g();

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    class RunnableC0771a implements Runnable {
        RunnableC0771a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m1252F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C0772b {

        /* renamed from: a */
        int f2906a;

        /* renamed from: b */
        int f2907b;

        /* renamed from: c */
        boolean f2908c;

        /* renamed from: d */
        boolean f2909d;

        /* renamed from: e */
        boolean f2910e;

        /* renamed from: f */
        int[] f2911f;

        C0772b() {
            m1193b();
        }

        /* renamed from: a */
        void m1196a() {
            this.f2907b = this.f2908c ? StaggeredGridLayoutManager.this.f2899u.mo1038b() : StaggeredGridLayoutManager.this.f2899u.mo1030f();
        }

        /* renamed from: a */
        void m1195a(int i) {
            this.f2907b = this.f2908c ? StaggeredGridLayoutManager.this.f2899u.mo1038b() - i : StaggeredGridLayoutManager.this.f2899u.mo1030f() + i;
        }

        /* renamed from: a */
        void m1194a(C0779f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f2911f;
            if (iArr == null || iArr.length < length) {
                this.f2911f = new int[StaggeredGridLayoutManager.this.f2898t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2911f[i] = fVarArr[i].m1165b(Integer.MIN_VALUE);
            }
        }

        /* renamed from: b */
        void m1193b() {
            this.f2906a = -1;
            this.f2907b = Integer.MIN_VALUE;
            this.f2908c = false;
            this.f2909d = false;
            this.f2910e = false;
            int[] iArr = this.f2911f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C0773c extends C0813j.C0840p {

        /* renamed from: e */
        C0779f f2913e;

        /* renamed from: f */
        boolean f2914f;

        public C0773c(int i, int i2) {
            super(i, i2);
        }

        public C0773c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0773c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0773c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public final int m1192e() {
            C0779f fVar = this.f2913e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2935e;
        }

        /* renamed from: f */
        public boolean m1191f() {
            return this.f2914f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: classes.dex */
    public static class C0774d {

        /* renamed from: a */
        int[] f2915a;

        /* renamed from: b */
        List<C0775a> f2916b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: classes.dex */
        public static class C0775a implements Parcelable {
            public static final Parcelable.Creator<C0775a> CREATOR = new C0776a();

            /* renamed from: b */
            int f2917b;

            /* renamed from: c */
            int f2918c;

            /* renamed from: d */
            int[] f2919d;

            /* renamed from: e */
            boolean f2920e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            static class C0776a implements Parcelable.Creator<C0775a> {
                C0776a() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public C0775a createFromParcel(Parcel parcel) {
                    return new C0775a(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public C0775a[] newArray(int i) {
                    return new C0775a[i];
                }
            }

            C0775a() {
            }

            C0775a(Parcel parcel) {
                this.f2917b = parcel.readInt();
                this.f2918c = parcel.readInt();
                this.f2920e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f2919d = new int[readInt];
                    parcel.readIntArray(this.f2919d);
                }
            }

            /* renamed from: a */
            int m1175a(int i) {
                int[] iArr = this.f2919d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2917b + ", mGapDir=" + this.f2918c + ", mHasUnwantedGapAfter=" + this.f2920e + ", mGapPerSpan=" + Arrays.toString(this.f2919d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2917b);
                parcel.writeInt(this.f2918c);
                parcel.writeInt(this.f2920e ? 1 : 0);
                int[] iArr = this.f2919d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2919d);
            }
        }

        C0774d() {
        }

        /* renamed from: c */
        private void m1181c(int i, int i2) {
            List<C0775a> list = this.f2916b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0775a aVar = this.f2916b.get(size);
                    int i3 = aVar.f2917b;
                    if (i3 >= i) {
                        aVar.f2917b = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: d */
        private void m1179d(int i, int i2) {
            List<C0775a> list = this.f2916b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0775a aVar = this.f2916b.get(size);
                    int i4 = aVar.f2917b;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f2916b.remove(size);
                        } else {
                            aVar.f2917b = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: g */
        private int m1176g(int i) {
            if (this.f2916b == null) {
                return -1;
            }
            C0775a c = m1182c(i);
            if (c != null) {
                this.f2916b.remove(c);
            }
            int size = this.f2916b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f2916b.get(i2).f2917b >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f2916b.remove(i2);
            return this.f2916b.get(i2).f2917b;
        }

        /* renamed from: a */
        public C0775a m1187a(int i, int i2, int i3, boolean z) {
            List<C0775a> list = this.f2916b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0775a aVar = this.f2916b.get(i4);
                int i5 = aVar.f2917b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f2918c == i3 || (z && aVar.f2920e))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        void m1190a() {
            int[] iArr = this.f2915a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2916b = null;
        }

        /* renamed from: a */
        void m1189a(int i) {
            int[] iArr = this.f2915a;
            if (iArr == null) {
                this.f2915a = new int[Math.max(i, 10) + 1];
                Arrays.fill(this.f2915a, -1);
            } else if (i >= iArr.length) {
                this.f2915a = new int[m1177f(i)];
                System.arraycopy(iArr, 0, this.f2915a, 0, iArr.length);
                int[] iArr2 = this.f2915a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* renamed from: a */
        void m1188a(int i, int i2) {
            int[] iArr = this.f2915a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m1189a(i3);
                int[] iArr2 = this.f2915a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2915a, i, i3, -1);
                m1181c(i, i2);
            }
        }

        /* renamed from: a */
        void m1186a(int i, C0779f fVar) {
            m1189a(i);
            this.f2915a[i] = fVar.f2935e;
        }

        /* renamed from: a */
        public void m1185a(C0775a aVar) {
            if (this.f2916b == null) {
                this.f2916b = new ArrayList();
            }
            int size = this.f2916b.size();
            for (int i = 0; i < size; i++) {
                C0775a aVar2 = this.f2916b.get(i);
                if (aVar2.f2917b == aVar.f2917b) {
                    this.f2916b.remove(i);
                }
                if (aVar2.f2917b >= aVar.f2917b) {
                    this.f2916b.add(i, aVar);
                    return;
                }
            }
            this.f2916b.add(aVar);
        }

        /* renamed from: b */
        int m1184b(int i) {
            List<C0775a> list = this.f2916b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2916b.get(size).f2917b >= i) {
                        this.f2916b.remove(size);
                    }
                }
            }
            return m1178e(i);
        }

        /* renamed from: b */
        void m1183b(int i, int i2) {
            int[] iArr = this.f2915a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m1189a(i3);
                int[] iArr2 = this.f2915a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2915a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m1179d(i, i2);
            }
        }

        /* renamed from: c */
        public C0775a m1182c(int i) {
            List<C0775a> list = this.f2916b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0775a aVar = this.f2916b.get(size);
                if (aVar.f2917b == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: d */
        int m1180d(int i) {
            int[] iArr = this.f2915a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* renamed from: e */
        int m1178e(int i) {
            int[] iArr = this.f2915a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m1176g(i);
            if (g == -1) {
                int[] iArr2 = this.f2915a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2915a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f2915a, i, i2, -1);
            return i2;
        }

        /* renamed from: f */
        int m1177f(int i) {
            int length = this.f2915a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: classes.dex */
    public static class C0777e implements Parcelable {
        public static final Parcelable.Creator<C0777e> CREATOR = new C0778a();

        /* renamed from: b */
        int f2921b;

        /* renamed from: c */
        int f2922c;

        /* renamed from: d */
        int f2923d;

        /* renamed from: e */
        int[] f2924e;

        /* renamed from: f */
        int f2925f;

        /* renamed from: g */
        int[] f2926g;

        /* renamed from: h */
        List<C0774d.C0775a> f2927h;

        /* renamed from: i */
        boolean f2928i;

        /* renamed from: j */
        boolean f2929j;

        /* renamed from: k */
        boolean f2930k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: classes.dex */
        static class C0778a implements Parcelable.Creator<C0777e> {
            C0778a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public C0777e createFromParcel(Parcel parcel) {
                return new C0777e(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public C0777e[] newArray(int i) {
                return new C0777e[i];
            }
        }

        public C0777e() {
        }

        C0777e(Parcel parcel) {
            this.f2921b = parcel.readInt();
            this.f2922c = parcel.readInt();
            this.f2923d = parcel.readInt();
            int i = this.f2923d;
            if (i > 0) {
                this.f2924e = new int[i];
                parcel.readIntArray(this.f2924e);
            }
            this.f2925f = parcel.readInt();
            int i2 = this.f2925f;
            if (i2 > 0) {
                this.f2926g = new int[i2];
                parcel.readIntArray(this.f2926g);
            }
            boolean z = false;
            this.f2928i = parcel.readInt() == 1;
            this.f2929j = parcel.readInt() == 1;
            this.f2930k = parcel.readInt() == 1 ? true : z;
            this.f2927h = parcel.readArrayList(C0774d.C0775a.class.getClassLoader());
        }

        public C0777e(C0777e eVar) {
            this.f2923d = eVar.f2923d;
            this.f2921b = eVar.f2921b;
            this.f2922c = eVar.f2922c;
            this.f2924e = eVar.f2924e;
            this.f2925f = eVar.f2925f;
            this.f2926g = eVar.f2926g;
            this.f2928i = eVar.f2928i;
            this.f2929j = eVar.f2929j;
            this.f2930k = eVar.f2930k;
            this.f2927h = eVar.f2927h;
        }

        /* renamed from: a */
        void m1174a() {
            this.f2924e = null;
            this.f2923d = 0;
            this.f2925f = 0;
            this.f2926g = null;
            this.f2927h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2921b);
            parcel.writeInt(this.f2922c);
            parcel.writeInt(this.f2923d);
            if (this.f2923d > 0) {
                parcel.writeIntArray(this.f2924e);
            }
            parcel.writeInt(this.f2925f);
            if (this.f2925f > 0) {
                parcel.writeIntArray(this.f2926g);
            }
            parcel.writeInt(this.f2928i ? 1 : 0);
            parcel.writeInt(this.f2929j ? 1 : 0);
            parcel.writeInt(this.f2930k ? 1 : 0);
            parcel.writeList(this.f2927h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: classes.dex */
    public class C0779f {

        /* renamed from: a */
        ArrayList<View> f2931a = new ArrayList<>();

        /* renamed from: b */
        int f2932b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f2933c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f2934d = 0;

        /* renamed from: e */
        final int f2935e;

        C0779f(int i) {
            this.f2935e = i;
        }

        /* renamed from: a */
        int m1172a(int i) {
            int i2 = this.f2933c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2931a.size() == 0) {
                return i;
            }
            m1173a();
            return this.f2933c;
        }

        /* renamed from: a */
        int m1170a(int i, int i2, boolean z) {
            return m1169a(i, i2, false, false, z);
        }

        /* renamed from: a */
        int m1169a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f = StaggeredGridLayoutManager.this.f2899u.mo1030f();
            int b = StaggeredGridLayoutManager.this.f2899u.mo1038b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2931a.get(i);
                int d = StaggeredGridLayoutManager.this.f2899u.mo1033d(view);
                int a = StaggeredGridLayoutManager.this.f2899u.mo1039a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? a > f : a >= f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && d >= f && a <= b) {
                        }
                        return StaggeredGridLayoutManager.this.m673l(view);
                    } else if (d >= f && a <= b) {
                        return StaggeredGridLayoutManager.this.m673l(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: a */
        public View m1171a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2931a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2931a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2904z && staggeredGridLayoutManager.m673l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2904z && staggeredGridLayoutManager2.m673l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2931a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2931a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2904z && staggeredGridLayoutManager3.m673l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2904z && staggeredGridLayoutManager4.m673l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: a */
        void m1173a() {
            C0774d.C0775a c;
            ArrayList<View> arrayList = this.f2931a;
            View view = arrayList.get(arrayList.size() - 1);
            C0773c b = m1164b(view);
            this.f2933c = StaggeredGridLayoutManager.this.f2899u.mo1039a(view);
            if (b.f2914f && (c = StaggeredGridLayoutManager.this.f2885E.m1182c(b.m654a())) != null && c.f2918c == 1) {
                this.f2933c += c.m1175a(this.f2935e);
            }
        }

        /* renamed from: a */
        void m1168a(View view) {
            C0773c b = m1164b(view);
            b.f2913e = this;
            this.f2931a.add(view);
            this.f2933c = Integer.MIN_VALUE;
            if (this.f2931a.size() == 1) {
                this.f2932b = Integer.MIN_VALUE;
            }
            if (b.m652c() || b.m653b()) {
                this.f2934d += StaggeredGridLayoutManager.this.f2899u.mo1037b(view);
            }
        }

        /* renamed from: a */
        void m1167a(boolean z, int i) {
            int a = z ? m1172a(Integer.MIN_VALUE) : m1165b(Integer.MIN_VALUE);
            m1163c();
            if (a != Integer.MIN_VALUE) {
                if (z && a < StaggeredGridLayoutManager.this.f2899u.mo1038b()) {
                    return;
                }
                if (z || a <= StaggeredGridLayoutManager.this.f2899u.mo1030f()) {
                    if (i != Integer.MIN_VALUE) {
                        a += i;
                    }
                    this.f2933c = a;
                    this.f2932b = a;
                }
            }
        }

        /* renamed from: b */
        int m1165b(int i) {
            int i2 = this.f2932b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2931a.size() == 0) {
                return i;
            }
            m1166b();
            return this.f2932b;
        }

        /* renamed from: b */
        C0773c m1164b(View view) {
            return (C0773c) view.getLayoutParams();
        }

        /* renamed from: b */
        void m1166b() {
            C0774d.C0775a c;
            View view = this.f2931a.get(0);
            C0773c b = m1164b(view);
            this.f2932b = StaggeredGridLayoutManager.this.f2899u.mo1033d(view);
            if (b.f2914f && (c = StaggeredGridLayoutManager.this.f2885E.m1182c(b.m654a())) != null && c.f2918c == -1) {
                this.f2932b -= c.m1175a(this.f2935e);
            }
        }

        /* renamed from: c */
        void m1163c() {
            this.f2931a.clear();
            m1154i();
            this.f2934d = 0;
        }

        /* renamed from: c */
        void m1162c(int i) {
            int i2 = this.f2932b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2932b = i2 + i;
            }
            int i3 = this.f2933c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2933c = i3 + i;
            }
        }

        /* renamed from: c */
        void m1161c(View view) {
            C0773c b = m1164b(view);
            b.f2913e = this;
            this.f2931a.add(0, view);
            this.f2932b = Integer.MIN_VALUE;
            if (this.f2931a.size() == 1) {
                this.f2933c = Integer.MIN_VALUE;
            }
            if (b.m652c() || b.m653b()) {
                this.f2934d += StaggeredGridLayoutManager.this.f2899u.mo1037b(view);
            }
        }

        /* renamed from: d */
        public int m1160d() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2904z) {
                i2 = this.f2931a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f2931a.size();
            }
            return m1170a(i2, i, true);
        }

        /* renamed from: d */
        void m1159d(int i) {
            this.f2932b = i;
            this.f2933c = i;
        }

        /* renamed from: e */
        public int m1158e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2904z) {
                i2 = 0;
                i = this.f2931a.size();
            } else {
                i2 = this.f2931a.size() - 1;
                i = -1;
            }
            return m1170a(i2, i, true);
        }

        /* renamed from: f */
        public int m1157f() {
            return this.f2934d;
        }

        /* renamed from: g */
        int m1156g() {
            int i = this.f2933c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m1173a();
            return this.f2933c;
        }

        /* renamed from: h */
        int m1155h() {
            int i = this.f2932b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m1166b();
            return this.f2932b;
        }

        /* renamed from: i */
        void m1154i() {
            this.f2932b = Integer.MIN_VALUE;
            this.f2933c = Integer.MIN_VALUE;
        }

        /* renamed from: j */
        void m1153j() {
            int size = this.f2931a.size();
            View remove = this.f2931a.remove(size - 1);
            C0773c b = m1164b(remove);
            b.f2913e = null;
            if (b.m652c() || b.m653b()) {
                this.f2934d -= StaggeredGridLayoutManager.this.f2899u.mo1037b(remove);
            }
            if (size == 1) {
                this.f2932b = Integer.MIN_VALUE;
            }
            this.f2933c = Integer.MIN_VALUE;
        }

        /* renamed from: k */
        void m1152k() {
            View remove = this.f2931a.remove(0);
            C0773c b = m1164b(remove);
            b.f2913e = null;
            if (this.f2931a.size() == 0) {
                this.f2933c = Integer.MIN_VALUE;
            }
            if (b.m652c() || b.m653b()) {
                this.f2934d -= StaggeredGridLayoutManager.this.f2899u.mo1037b(remove);
            }
            this.f2932b = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0813j.AbstractC0835o.C0839d a = C0813j.AbstractC0835o.m775a(context, attributeSet, i, i2);
        m1216h(a.f3230a);
        m1214i(a.f3231b);
        m1218c(a.f3232c);
        m1245M();
    }

    /* renamed from: M */
    private void m1245M() {
        this.f2899u = AbstractC0810i.m1045a(this, this.f2901w);
        this.f2900v = AbstractC0810i.m1045a(this, 1 - this.f2901w);
    }

    /* renamed from: N */
    private void m1244N() {
        if (this.f2900v.mo1034d() != 1073741824) {
            int e = m697e();
            float f = 0.0f;
            for (int i = 0; i < e; i++) {
                View c = m715c(i);
                float b = this.f2900v.mo1037b(c);
                if (b >= f) {
                    if (((C0773c) c.getLayoutParams()).m1191f()) {
                        b = (b * 1.0f) / this.f2897s;
                    }
                    f = Math.max(f, b);
                }
            }
            int i2 = this.f2902x;
            int round = Math.round(f * this.f2897s);
            if (this.f2900v.mo1034d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2900v.mo1028g());
            }
            m1212j(round);
            if (this.f2902x != i2) {
                for (int i3 = 0; i3 < e; i3++) {
                    View c2 = m715c(i3);
                    C0773c cVar = (C0773c) c2.getLayoutParams();
                    if (!cVar.f2914f) {
                        if (!m1246L() || this.f2901w != 1) {
                            int i4 = cVar.f2913e.f2935e;
                            int i5 = this.f2901w;
                            int i6 = (this.f2902x * i4) - (i4 * i2);
                            if (i5 == 1) {
                                c2.offsetLeftAndRight(i6);
                            } else {
                                c2.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.f2897s;
                            int i8 = cVar.f2913e.f2935e;
                            c2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f2902x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: O */
    private void m1243O() {
        this.f2881A = (this.f2901w == 1 || !m1246L()) ? this.f2904z : !this.f2904z;
    }

    /* renamed from: a */
    private int m1231a(C0813j.C0847v vVar, C0807g gVar, C0813j.C0815a0 a0Var) {
        C0779f fVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z = false;
        this.f2882B.set(0, this.f2897s, true);
        int i7 = this.f2903y.f3064i ? gVar.f3060e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : gVar.f3060e == 1 ? gVar.f3062g + gVar.f3057b : gVar.f3061f - gVar.f3057b;
        m1217e(gVar.f3060e, i7);
        int b = this.f2881A ? this.f2899u.mo1038b() : this.f2899u.mo1030f();
        boolean z2 = false;
        while (gVar.m1056a(a0Var) && (this.f2903y.f3064i || !this.f2882B.isEmpty())) {
            View a = gVar.m1055a(vVar);
            C0773c cVar = (C0773c) a.getLayoutParams();
            int a2 = cVar.m654a();
            int d = this.f2885E.m1180d(a2);
            boolean z3 = d == -1;
            if (z3) {
                if (cVar.f2914f) {
                    C0779f[] fVarArr = this.f2898t;
                    char c = z ? 1 : 0;
                    char c2 = z ? 1 : 0;
                    fVar = fVarArr[c];
                } else {
                    fVar = m1235a(gVar);
                }
                this.f2885E.m1186a(a2, fVar);
            } else {
                fVar = this.f2898t[d];
            }
            cVar.f2913e = fVar;
            if (gVar.f3060e == 1) {
                m727b(a);
            } else {
                int i8 = z ? 1 : 0;
                int i9 = z ? 1 : 0;
                m726b(a, i8);
            }
            m1239a(a, cVar, z);
            if (gVar.f3060e == 1) {
                int q = cVar.f2914f ? m1203q(b) : fVar.m1172a(b);
                i = this.f2899u.mo1037b(a) + q;
                if (z3 && cVar.f2914f) {
                    C0774d.C0775a m = m1208m(q);
                    m.f2918c = -1;
                    m.f2917b = a2;
                    this.f2885E.m1185a(m);
                }
                i2 = q;
            } else {
                int t = cVar.f2914f ? m1199t(b) : fVar.m1165b(b);
                i2 = t - this.f2899u.mo1037b(a);
                if (z3 && cVar.f2914f) {
                    C0774d.C0775a n = m1207n(t);
                    n.f2918c = 1;
                    n.f2917b = a2;
                    this.f2885E.m1185a(n);
                }
                i = t;
            }
            if (cVar.f2914f && gVar.f3059d == -1) {
                if (!z3) {
                    if (!(gVar.f3060e == 1 ? m1254D() : m1253E())) {
                        C0774d.C0775a c3 = this.f2885E.m1182c(a2);
                        if (c3 != null) {
                            c3.f2920e = true;
                        }
                    }
                }
                this.f2893M = true;
            }
            m1240a(a, cVar, gVar);
            if (!m1246L() || this.f2901w != 1) {
                int f = cVar.f2914f ? this.f2900v.mo1030f() : (fVar.f2935e * this.f2902x) + this.f2900v.mo1030f();
                i3 = this.f2900v.mo1037b(a) + f;
                i4 = f;
            } else {
                int b2 = cVar.f2914f ? this.f2900v.mo1038b() : this.f2900v.mo1038b() - (((this.f2897s - 1) - fVar.f2935e) * this.f2902x);
                i4 = b2 - this.f2900v.mo1037b(a);
                i3 = b2;
            }
            if (this.f2901w == 1) {
                staggeredGridLayoutManager = this;
                view = a;
                i6 = i4;
                i4 = i2;
                i5 = i3;
            } else {
                staggeredGridLayoutManager = this;
                view = a;
                i6 = i2;
                i5 = i;
                i = i3;
            }
            staggeredGridLayoutManager.m769a(view, i6, i4, i5, i);
            if (cVar.f2914f) {
                m1217e(this.f2903y.f3060e, i7);
            } else {
                m1236a(fVar, this.f2903y.f3060e, i7);
            }
            m1232a(vVar, this.f2903y);
            if (this.f2903y.f3063h && a.hasFocusable()) {
                if (cVar.f2914f) {
                    this.f2882B.clear();
                } else {
                    this.f2882B.set(fVar.f2935e, false);
                    z2 = true;
                    z = false;
                }
            }
            z2 = true;
            z = false;
        }
        if (!z2) {
            m1232a(vVar, this.f2903y);
        }
        int f2 = this.f2903y.f3060e == -1 ? this.f2899u.mo1030f() - m1199t(this.f2899u.mo1030f()) : m1203q(this.f2899u.mo1038b()) - this.f2899u.mo1038b();
        if (f2 > 0) {
            return Math.min(gVar.f3057b, f2);
        }
        return 0;
    }

    /* renamed from: a */
    private C0779f m1235a(C0807g gVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m1198u(gVar.f3060e)) {
            i2 = this.f2897s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f2897s;
            i = 1;
        }
        C0779f fVar = null;
        if (gVar.f3060e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f = this.f2899u.mo1030f();
            while (i2 != i3) {
                C0779f fVar2 = this.f2898t[i2];
                int a = fVar2.m1172a(f);
                if (a < i4) {
                    fVar = fVar2;
                    i4 = a;
                }
                i2 += i;
            }
            return fVar;
        }
        int i5 = Integer.MIN_VALUE;
        int b = this.f2899u.mo1038b();
        while (i2 != i3) {
            C0779f fVar3 = this.f2898t[i2];
            int b2 = fVar3.m1165b(b);
            if (b2 > i5) {
                fVar = fVar3;
                i5 = b2;
            }
            i2 += i;
        }
        return fVar;
    }

    /* renamed from: a */
    private void m1241a(View view, int i, int i2, boolean z) {
        m762a(view, this.f2891K);
        C0773c cVar = (C0773c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f2891K;
        int c = m1222c(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f2891K;
        int c2 = m1222c(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? m725b(view, c, c2, cVar) : m768a(view, c, c2, cVar)) {
            view.measure(c, c2);
        }
    }

    /* renamed from: a */
    private void m1240a(View view, C0773c cVar, C0807g gVar) {
        if (gVar.f3060e == 1) {
            if (cVar.f2914f) {
                m1204p(view);
            } else {
                cVar.f2913e.m1168a(view);
            }
        } else if (cVar.f2914f) {
            m1202q(view);
        } else {
            cVar.f2913e.m1161c(view);
        }
    }

    /* renamed from: a */
    private void m1239a(View view, C0773c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f2914f) {
            if (this.f2901w == 1) {
                i2 = this.f2890J;
            } else {
                m1241a(view, C0813j.AbstractC0835o.m784a(m665q(), m664r(), m670n() + m668o(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f2890J, z);
                return;
            }
        } else if (this.f2901w == 1) {
            i2 = C0813j.AbstractC0835o.m784a(this.f2902x, m664r(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        } else {
            i2 = C0813j.AbstractC0835o.m784a(m665q(), m664r(), m670n() + m668o(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
            i = C0813j.AbstractC0835o.m784a(this.f2902x, m680i(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            m1241a(view, i2, i, z);
        }
        i = C0813j.AbstractC0835o.m784a(m682h(), m680i(), m666p() + m672m(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        m1241a(view, i2, i, z);
    }

    /* renamed from: a */
    private void m1238a(C0772b bVar) {
        boolean z;
        C0777e eVar = this.f2889I;
        int i = eVar.f2923d;
        if (i > 0) {
            if (i == this.f2897s) {
                for (int i2 = 0; i2 < this.f2897s; i2++) {
                    this.f2898t[i2].m1163c();
                    C0777e eVar2 = this.f2889I;
                    int i3 = eVar2.f2924e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.f2929j ? this.f2899u.mo1038b() : this.f2899u.mo1030f();
                    }
                    this.f2898t[i2].m1159d(i3);
                }
            } else {
                eVar.m1174a();
                C0777e eVar3 = this.f2889I;
                eVar3.f2921b = eVar3.f2922c;
            }
        }
        C0777e eVar4 = this.f2889I;
        this.f2888H = eVar4.f2930k;
        m1218c(eVar4.f2928i);
        m1243O();
        C0777e eVar5 = this.f2889I;
        int i4 = eVar5.f2921b;
        if (i4 != -1) {
            this.f2883C = i4;
            z = eVar5.f2929j;
        } else {
            z = this.f2881A;
        }
        bVar.f2908c = z;
        C0777e eVar6 = this.f2889I;
        if (eVar6.f2925f > 1) {
            C0774d dVar = this.f2885E;
            dVar.f2915a = eVar6.f2926g;
            dVar.f2916b = eVar6.f2927h;
        }
    }

    /* renamed from: a */
    private void m1236a(C0779f fVar, int i, int i2) {
        int f = fVar.m1157f();
        if (i == -1) {
            if (fVar.m1155h() + f > i2) {
                return;
            }
        } else if (fVar.m1156g() - f < i2) {
            return;
        }
        this.f2882B.set(fVar.f2935e, false);
    }

    /* renamed from: a */
    private void m1233a(C0813j.C0847v vVar, int i) {
        for (int e = m697e() - 1; e >= 0; e--) {
            View c = m715c(e);
            if (this.f2899u.mo1033d(c) >= i && this.f2899u.mo1029f(c) >= i) {
                C0773c cVar = (C0773c) c.getLayoutParams();
                if (cVar.f2914f) {
                    for (int i2 = 0; i2 < this.f2897s; i2++) {
                        if (this.f2898t[i2].f2931a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2897s; i3++) {
                        this.f2898t[i3].m1153j();
                    }
                } else if (cVar.f2913e.f2931a.size() != 1) {
                    cVar.f2913e.m1153j();
                } else {
                    return;
                }
                m761a(c, vVar);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r4.f3060e == (-1)) goto L_0x0012;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1232a(androidx.recyclerview.widget.C0813j.C0847v r3, androidx.recyclerview.widget.C0807g r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3056a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f3064i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f3057b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f3060e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f3062g
        L_0x0014:
            r2.m1233a(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f3061f
        L_0x001a:
            r2.m1225b(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f3060e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f3061f
            int r1 = r2.m1201r(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f3062g
            int r4 = r4.f3057b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f3062g
            int r0 = r2.m1200s(r0)
            int r1 = r4.f3062g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f3061f
            int r4 = r4.f3057b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1232a(androidx.recyclerview.widget.j$v, androidx.recyclerview.widget.g):void");
    }

    /* renamed from: a */
    private void m1230a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, boolean z) {
        int b;
        int q = m1203q(Integer.MIN_VALUE);
        if (q != Integer.MIN_VALUE && (b = this.f2899u.mo1038b() - q) > 0) {
            int i = b - (-m1221c(-b, vVar, a0Var));
            if (z && i > 0) {
                this.f2899u.mo1040a(i);
            }
        }
    }

    /* renamed from: a */
    private boolean m1237a(C0779f fVar) {
        if (this.f2881A) {
            if (fVar.m1156g() < this.f2899u.mo1038b()) {
                ArrayList<View> arrayList = fVar.f2931a;
                return !fVar.m1164b(arrayList.get(arrayList.size() - 1)).f2914f;
            }
        } else if (fVar.m1155h() > this.f2899u.mo1030f()) {
            return !fVar.m1164b(fVar.f2931a.get(0)).f2914f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1228b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2881A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.m1249I()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.m1250H()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2885E
            r4.m1178e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2885E
            r9.m1183b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f2885E
            r7.m1188a(r8, r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2885E
            r9.m1183b(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2885E
            r9.m1188a(r7, r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.f2881A
            if (r7 == 0) goto L_0x004f
            int r7 = r6.m1250H()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.m1249I()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.m657y()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1228b(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1227b(int r5, androidx.recyclerview.widget.C0813j.C0815a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.g r0 = r4.f2903y
            r1 = 0
            r0.f3057b = r1
            r0.f3058c = r5
            boolean r0 = r4.m659w()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.m904b()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f2881A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.i r5 = r4.f2899u
            int r5 = r5.mo1028g()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.i r5 = r4.f2899u
            int r5 = r5.mo1028g()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.m691f()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.g r0 = r4.f2903y
            androidx.recyclerview.widget.i r3 = r4.f2899u
            int r3 = r3.mo1030f()
            int r3 = r3 - r6
            r0.f3061f = r3
            androidx.recyclerview.widget.g r6 = r4.f2903y
            androidx.recyclerview.widget.i r0 = r4.f2899u
            int r0 = r0.mo1038b()
            int r0 = r0 + r5
            r6.f3062g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.g r0 = r4.f2903y
            androidx.recyclerview.widget.i r3 = r4.f2899u
            int r3 = r3.mo1041a()
            int r3 = r3 + r5
            r0.f3062g = r3
            androidx.recyclerview.widget.g r5 = r4.f2903y
            int r6 = -r6
            r5.f3061f = r6
        L_0x005d:
            androidx.recyclerview.widget.g r5 = r4.f2903y
            r5.f3063h = r1
            r5.f3056a = r2
            androidx.recyclerview.widget.i r6 = r4.f2899u
            int r6 = r6.mo1034d()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.i r6 = r4.f2899u
            int r6 = r6.mo1041a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f3064i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1227b(int, androidx.recyclerview.widget.j$a0):void");
    }

    /* renamed from: b */
    private void m1225b(C0813j.C0847v vVar, int i) {
        while (m697e() > 0) {
            View c = m715c(0);
            if (this.f2899u.mo1039a(c) <= i && this.f2899u.mo1031e(c) <= i) {
                C0773c cVar = (C0773c) c.getLayoutParams();
                if (cVar.f2914f) {
                    for (int i2 = 0; i2 < this.f2897s; i2++) {
                        if (this.f2898t[i2].f2931a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2897s; i3++) {
                        this.f2898t[i3].m1152k();
                    }
                } else if (cVar.f2913e.f2931a.size() != 1) {
                    cVar.f2913e.m1152k();
                } else {
                    return;
                }
                m761a(c, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m1224b(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, boolean z) {
        int f;
        int t = m1199t(Integer.MAX_VALUE);
        if (t != Integer.MAX_VALUE && (f = t - this.f2899u.mo1030f()) > 0) {
            int c = f - m1221c(f, vVar, a0Var);
            if (z && c > 0) {
                this.f2899u.mo1040a(-c);
            }
        }
    }

    /* renamed from: c */
    private int m1222c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x014b, code lost:
        if (m1252F() != false) goto L_0x014f;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1219c(androidx.recyclerview.widget.C0813j.C0847v r9, androidx.recyclerview.widget.C0813j.C0815a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1219c(androidx.recyclerview.widget.j$v, androidx.recyclerview.widget.j$a0, boolean):void");
    }

    /* renamed from: c */
    private boolean m1220c(C0813j.C0815a0 a0Var, C0772b bVar) {
        boolean z = this.f2887G;
        int a = a0Var.m907a();
        bVar.f2906a = z ? m1205p(a) : m1206o(a);
        bVar.f2907b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: e */
    private void m1217e(int i, int i2) {
        for (int i3 = 0; i3 < this.f2897s; i3++) {
            if (!this.f2898t[i3].f2931a.isEmpty()) {
                m1236a(this.f2898t[i3], i, i2);
            }
        }
    }

    /* renamed from: h */
    private int m1215h(C0813j.C0815a0 a0Var) {
        if (m697e() == 0) {
            return 0;
        }
        return C0856l.m578a(a0Var, this.f2899u, m1223b(!this.f2894N), m1229a(!this.f2894N), this, this.f2894N);
    }

    /* renamed from: i */
    private int m1213i(C0813j.C0815a0 a0Var) {
        if (m697e() == 0) {
            return 0;
        }
        return C0856l.m577a(a0Var, this.f2899u, m1223b(!this.f2894N), m1229a(!this.f2894N), this, this.f2894N, this.f2881A);
    }

    /* renamed from: j */
    private int m1211j(C0813j.C0815a0 a0Var) {
        if (m697e() == 0) {
            return 0;
        }
        return C0856l.m576b(a0Var, this.f2899u, m1223b(!this.f2894N), m1229a(!this.f2894N), this, this.f2894N);
    }

    /* renamed from: k */
    private int m1210k(int i) {
        if (m697e() == 0) {
            return this.f2881A ? 1 : -1;
        }
        return (i < m1250H()) != this.f2881A ? -1 : 1;
    }

    /* renamed from: l */
    private int m1209l(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f2901w == 1) ? 1 : Integer.MIN_VALUE : this.f2901w == 0 ? 1 : Integer.MIN_VALUE : this.f2901w == 1 ? -1 : Integer.MIN_VALUE : this.f2901w == 0 ? -1 : Integer.MIN_VALUE : (this.f2901w != 1 && m1246L()) ? -1 : 1 : (this.f2901w != 1 && m1246L()) ? 1 : -1;
    }

    /* renamed from: m */
    private C0774d.C0775a m1208m(int i) {
        C0774d.C0775a aVar = new C0774d.C0775a();
        aVar.f2919d = new int[this.f2897s];
        for (int i2 = 0; i2 < this.f2897s; i2++) {
            aVar.f2919d[i2] = i - this.f2898t[i2].m1172a(i);
        }
        return aVar;
    }

    /* renamed from: n */
    private C0774d.C0775a m1207n(int i) {
        C0774d.C0775a aVar = new C0774d.C0775a();
        aVar.f2919d = new int[this.f2897s];
        for (int i2 = 0; i2 < this.f2897s; i2++) {
            aVar.f2919d[i2] = this.f2898t[i2].m1165b(i) - i;
        }
        return aVar;
    }

    /* renamed from: o */
    private int m1206o(int i) {
        int e = m697e();
        for (int i2 = 0; i2 < e; i2++) {
            int l = m673l(m715c(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: p */
    private int m1205p(int i) {
        for (int e = m697e() - 1; e >= 0; e--) {
            int l = m673l(m715c(e));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: p */
    private void m1204p(View view) {
        for (int i = this.f2897s - 1; i >= 0; i--) {
            this.f2898t[i].m1168a(view);
        }
    }

    /* renamed from: q */
    private int m1203q(int i) {
        int a = this.f2898t[0].m1172a(i);
        for (int i2 = 1; i2 < this.f2897s; i2++) {
            int a2 = this.f2898t[i2].m1172a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: q */
    private void m1202q(View view) {
        for (int i = this.f2897s - 1; i >= 0; i--) {
            this.f2898t[i].m1161c(view);
        }
    }

    /* renamed from: r */
    private int m1201r(int i) {
        int b = this.f2898t[0].m1165b(i);
        for (int i2 = 1; i2 < this.f2897s; i2++) {
            int b2 = this.f2898t[i2].m1165b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: s */
    private int m1200s(int i) {
        int a = this.f2898t[0].m1172a(i);
        for (int i2 = 1; i2 < this.f2897s; i2++) {
            int a2 = this.f2898t[i2].m1172a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: t */
    private int m1199t(int i) {
        int b = this.f2898t[0].m1165b(i);
        for (int i2 = 1; i2 < this.f2897s; i2++) {
            int b2 = this.f2898t[i2].m1165b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: u */
    private boolean m1198u(int i) {
        if (this.f2901w == 0) {
            return (i == -1) != this.f2881A;
        }
        return ((i == -1) == this.f2881A) == m1246L();
    }

    /* renamed from: v */
    private void m1197v(int i) {
        C0807g gVar = this.f2903y;
        gVar.f3060e = i;
        int i2 = 1;
        if (this.f2881A != (i == -1)) {
            i2 = -1;
        }
        gVar.f3059d = i2;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: C */
    public boolean mo789C() {
        return this.f2889I == null;
    }

    /* renamed from: D */
    boolean m1254D() {
        int a = this.f2898t[0].m1172a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2897s; i++) {
            if (this.f2898t[i].m1172a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    boolean m1253E() {
        int b = this.f2898t[0].m1165b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2897s; i++) {
            if (this.f2898t[i].m1165b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    boolean m1252F() {
        int i;
        int i2;
        if (m697e() == 0 || this.f2886F == 0 || !m662t()) {
            return false;
        }
        if (this.f2881A) {
            i2 = m1249I();
            i = m1250H();
        } else {
            i2 = m1250H();
            i = m1249I();
        }
        if (i2 == 0 && m1248J() != null) {
            this.f2885E.m1190a();
        } else if (!this.f2893M) {
            return false;
        } else {
            int i3 = this.f2881A ? -1 : 1;
            int i4 = i + 1;
            C0774d.C0775a a = this.f2885E.m1187a(i2, i4, i3, true);
            if (a == null) {
                this.f2893M = false;
                this.f2885E.m1184b(i4);
                return false;
            }
            C0774d.C0775a a2 = this.f2885E.m1187a(i2, a.f2917b, i3 * (-1), true);
            if (a2 == null) {
                this.f2885E.m1184b(a.f2917b);
            } else {
                this.f2885E.m1184b(a2.f2917b + 1);
            }
        }
        m656z();
        m657y();
        return true;
    }

    /* renamed from: G */
    int m1251G() {
        View a = this.f2881A ? m1229a(true) : m1223b(true);
        if (a == null) {
            return -1;
        }
        return m673l(a);
    }

    /* renamed from: H */
    int m1250H() {
        if (m697e() == 0) {
            return 0;
        }
        return m673l(m715c(0));
    }

    /* renamed from: I */
    int m1249I() {
        int e = m697e();
        if (e == 0) {
            return 0;
        }
        return m673l(m715c(e - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View m1248J() {
        /*
            r12 = this;
            int r0 = r12.m697e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2897s
            r2.<init>(r3)
            int r3 = r12.f2897s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2901w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.m1246L()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2881A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.m715c(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2913e
            int r9 = r9.f2935e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2913e
            boolean r9 = r12.m1237a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2913e
            int r9 = r9.f2935e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2914f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.m715c(r9)
            boolean r10 = r12.f2881A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.i r10 = r12.f2899u
            int r10 = r10.mo1039a(r7)
            androidx.recyclerview.widget.i r11 = r12.f2899u
            int r11 = r11.mo1039a(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.i r10 = r12.f2899u
            int r10 = r10.mo1033d(r7)
            androidx.recyclerview.widget.i r11 = r12.f2899u
            int r11 = r11.mo1033d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0773c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2913e
            int r8 = r8.f2935e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2913e
            int r9 = r9.f2935e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1248J():android.view.View");
    }

    /* renamed from: K */
    public void m1247K() {
        this.f2885E.m1190a();
        m657y();
    }

    /* renamed from: L */
    boolean m1246L() {
        return m678j() == 1;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo778a(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return m1221c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo756a(C0813j.C0815a0 a0Var) {
        return m1215h(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public int mo751a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return this.f2901w == 1 ? this.f2897s : super.mo751a(vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public View mo765a(View view, int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        View c;
        View a;
        if (m697e() == 0 || (c = m713c(view)) == null) {
            return null;
        }
        m1243O();
        int l = m1209l(i);
        if (l == Integer.MIN_VALUE) {
            return null;
        }
        C0773c cVar = (C0773c) c.getLayoutParams();
        boolean z = cVar.f2914f;
        C0779f fVar = cVar.f2913e;
        int I = l == 1 ? m1249I() : m1250H();
        m1227b(I, a0Var);
        m1197v(l);
        C0807g gVar = this.f2903y;
        gVar.f3058c = gVar.f3059d + I;
        gVar.f3057b = (int) (this.f2899u.mo1028g() * 0.33333334f);
        C0807g gVar2 = this.f2903y;
        gVar2.f3063h = true;
        gVar2.f3056a = false;
        m1231a(vVar, gVar2, a0Var);
        this.f2887G = this.f2881A;
        if (!(z || (a = fVar.m1171a(I, l)) == null || a == c)) {
            return a;
        }
        if (m1198u(l)) {
            for (int i2 = this.f2897s - 1; i2 >= 0; i2--) {
                View a2 = this.f2898t[i2].m1171a(I, l);
                if (!(a2 == null || a2 == c)) {
                    return a2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f2897s; i3++) {
                View a3 = this.f2898t[i3].m1171a(I, l);
                if (!(a3 == null || a3 == c)) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f2904z ^ true) == (l == -1);
        if (!z) {
            View b = mo731b(z2 ? fVar.m1160d() : fVar.m1158e());
            if (!(b == null || b == c)) {
                return b;
            }
        }
        if (m1198u(l)) {
            for (int i4 = this.f2897s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f2935e) {
                    C0779f[] fVarArr = this.f2898t;
                    View b2 = mo731b(z2 ? fVarArr[i4].m1160d() : fVarArr[i4].m1158e());
                    if (!(b2 == null || b2 == c)) {
                        return b2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f2897s; i5++) {
                C0779f[] fVarArr2 = this.f2898t;
                View b3 = mo731b(z2 ? fVarArr2[i5].m1160d() : fVarArr2[i5].m1158e());
                if (!(b3 == null || b3 == c)) {
                    return b3;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    View m1229a(boolean z) {
        int f = this.f2899u.mo1030f();
        int b = this.f2899u.mo1038b();
        View view = null;
        for (int e = m697e() - 1; e >= 0; e--) {
            View c = m715c(e);
            int d = this.f2899u.mo1033d(c);
            int a = this.f2899u.mo1039a(c);
            if (a > f && d < b) {
                if (a <= b || !z) {
                    return c;
                }
                if (view == null) {
                    view = c;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public C0813j.C0840p mo776a(Context context, AttributeSet attributeSet) {
        return new C0773c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public C0813j.C0840p mo758a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0773c((ViewGroup.MarginLayoutParams) layoutParams) : new C0773c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo783a(int i, int i2, C0813j.C0815a0 a0Var, C0813j.AbstractC0835o.AbstractC0838c cVar) {
        int i3;
        int i4;
        if (this.f2901w != 0) {
            i = i2;
        }
        if (!(m697e() == 0 || i == 0)) {
            m1242a(i, a0Var);
            int[] iArr = this.f2895O;
            if (iArr == null || iArr.length < this.f2897s) {
                this.f2895O = new int[this.f2897s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2897s; i6++) {
                C0807g gVar = this.f2903y;
                if (gVar.f3059d == -1) {
                    i4 = gVar.f3061f;
                    i3 = this.f2898t[i6].m1165b(i4);
                } else {
                    i4 = this.f2898t[i6].m1172a(gVar.f3062g);
                    i3 = this.f2903y.f3062g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f2895O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f2895O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f2903y.m1056a(a0Var); i8++) {
                cVar.mo655a(this.f2903y.f3058c, this.f2895O[i8]);
                C0807g gVar2 = this.f2903y;
                gVar2.f3058c += gVar2.f3059d;
            }
        }
    }

    /* renamed from: a */
    void m1242a(int i, C0813j.C0815a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = m1249I();
            i2 = 1;
        } else {
            i3 = m1250H();
            i2 = -1;
        }
        this.f2903y.f3056a = true;
        m1227b(i3, a0Var);
        m1197v(i2);
        C0807g gVar = this.f2903y;
        gVar.f3058c = i3 + gVar.f3059d;
        gVar.f3057b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo774a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int n = m670n() + m668o();
        int p = m666p() + m672m();
        if (this.f2901w == 1) {
            i4 = C0813j.AbstractC0835o.m785a(i2, rect.height() + p, m676k());
            i3 = C0813j.AbstractC0835o.m785a(i, (this.f2902x * this.f2897s) + n, m674l());
        } else {
            i3 = C0813j.AbstractC0835o.m785a(i, rect.width() + n, m674l());
            i4 = C0813j.AbstractC0835o.m785a(i2, (this.f2902x * this.f2897s) + p, m676k());
        }
        m714c(i3, i4);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo773a(Parcelable parcelable) {
        if (parcelable instanceof C0777e) {
            this.f2889I = (C0777e) parcelable;
            m657y();
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo757a(AccessibilityEvent accessibilityEvent) {
        super.mo757a(accessibilityEvent);
        if (m697e() > 0) {
            View b = m1223b(false);
            View a = m1229a(false);
            if (b != null && a != null) {
                int l = m673l(b);
                int l2 = m673l(a);
                if (l < l2) {
                    accessibilityEvent.setFromIndex(l);
                    accessibilityEvent.setToIndex(l2);
                    return;
                }
                accessibilityEvent.setFromIndex(l2);
                accessibilityEvent.setToIndex(l);
            }
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo746a(C0813j.C0847v vVar, C0813j.C0815a0 a0Var, View view, C0191c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0773c)) {
            super.m763a(view, cVar);
            return;
        }
        C0773c cVar2 = (C0773c) layoutParams;
        if (this.f2901w == 0) {
            i4 = cVar2.m1192e();
            i3 = cVar2.f2914f ? this.f2897s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar2.m1192e();
            i = cVar2.f2914f ? this.f2897s : 1;
        }
        cVar.m3530b(C0191c.C0194c.m3496a(i4, i3, i2, i, cVar2.f2914f, false));
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo743a(C0813j jVar, int i, int i2) {
        m1228b(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo742a(C0813j jVar, int i, int i2, int i3) {
        m1228b(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo741a(C0813j jVar, int i, int i2, Object obj) {
        m1228b(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public void mo733a(String str) {
        if (this.f2889I == null) {
            super.mo733a(str);
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public boolean mo788a() {
        return this.f2901w == 0;
    }

    /* renamed from: a */
    boolean m1234a(C0813j.C0815a0 a0Var, C0772b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.m902d() && (i = this.f2883C) != -1) {
            if (i < 0 || i >= a0Var.m907a()) {
                this.f2883C = -1;
                this.f2884D = Integer.MIN_VALUE;
            } else {
                C0777e eVar = this.f2889I;
                if (eVar == null || eVar.f2921b == -1 || eVar.f2923d < 1) {
                    View b = mo731b(this.f2883C);
                    if (b != null) {
                        bVar.f2906a = this.f2881A ? m1249I() : m1250H();
                        if (this.f2884D != Integer.MIN_VALUE) {
                            if (bVar.f2908c) {
                                i3 = this.f2899u.mo1038b() - this.f2884D;
                                i2 = this.f2899u.mo1039a(b);
                            } else {
                                i3 = this.f2899u.mo1030f() + this.f2884D;
                                i2 = this.f2899u.mo1033d(b);
                            }
                            bVar.f2907b = i3 - i2;
                            return true;
                        } else if (this.f2899u.mo1037b(b) > this.f2899u.mo1028g()) {
                            bVar.f2907b = bVar.f2908c ? this.f2899u.mo1038b() : this.f2899u.mo1030f();
                            return true;
                        } else {
                            int d = this.f2899u.mo1033d(b) - this.f2899u.mo1030f();
                            if (d < 0) {
                                bVar.f2907b = -d;
                                return true;
                            }
                            int b2 = this.f2899u.mo1038b() - this.f2899u.mo1039a(b);
                            if (b2 < 0) {
                                bVar.f2907b = b2;
                                return true;
                            }
                            bVar.f2907b = Integer.MIN_VALUE;
                        }
                    } else {
                        bVar.f2906a = this.f2883C;
                        int i4 = this.f2884D;
                        if (i4 == Integer.MIN_VALUE) {
                            if (m1210k(bVar.f2906a) == 1) {
                                z = true;
                            }
                            bVar.f2908c = z;
                            bVar.m1196a();
                        } else {
                            bVar.m1195a(i4);
                        }
                        bVar.f2909d = true;
                    }
                } else {
                    bVar.f2907b = Integer.MIN_VALUE;
                    bVar.f2906a = this.f2883C;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: a */
    public boolean mo754a(C0813j.C0840p pVar) {
        return pVar instanceof C0773c;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo728b(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return m1221c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo723b(C0813j.C0815a0 a0Var) {
        return m1213i(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public int mo721b(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        return this.f2901w == 0 ? this.f2897s : super.mo721b(vVar, a0Var);
    }

    /* renamed from: b */
    View m1223b(boolean z) {
        int f = this.f2899u.mo1030f();
        int b = this.f2899u.mo1038b();
        int e = m697e();
        View view = null;
        for (int i = 0; i < e; i++) {
            View c = m715c(i);
            int d = this.f2899u.mo1033d(c);
            if (this.f2899u.mo1039a(c) > f && d < b) {
                if (d >= f || !z) {
                    return c;
                }
                if (view == null) {
                    view = c;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    void m1226b(C0813j.C0815a0 a0Var, C0772b bVar) {
        if (!m1234a(a0Var, bVar) && !m1220c(a0Var, bVar)) {
            bVar.m1196a();
            bVar.f2906a = 0;
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public void mo719b(C0813j jVar, int i, int i2) {
        m1228b(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public void mo717b(C0813j jVar, C0813j.C0847v vVar) {
        super.mo717b(jVar, vVar);
        m734a(this.f2896P);
        for (int i = 0; i < this.f2897s; i++) {
            this.f2898t[i].m1163c();
        }
        jVar.requestLayout();
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: b */
    public boolean mo732b() {
        return this.f2901w == 1;
    }

    /* renamed from: c */
    int m1221c(int i, C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        if (m697e() == 0 || i == 0) {
            return 0;
        }
        m1242a(i, a0Var);
        int a = m1231a(vVar, this.f2903y, a0Var);
        if (this.f2903y.f3057b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f2899u.mo1040a(-i);
        this.f2887G = this.f2881A;
        C0807g gVar = this.f2903y;
        gVar.f3057b = 0;
        m1232a(vVar, gVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public int mo711c(C0813j.C0815a0 a0Var) {
        return m1211j(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: c */
    public C0813j.C0840p mo716c() {
        return this.f2901w == 0 ? new C0773c(-2, -1) : new C0773c(-1, -2);
    }

    /* renamed from: c */
    public void m1218c(boolean z) {
        mo733a((String) null);
        C0777e eVar = this.f2889I;
        if (!(eVar == null || eVar.f2928i == z)) {
            eVar.f2928i = z;
        }
        this.f2904z = z;
        m657y();
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public int mo701d(C0813j.C0815a0 a0Var) {
        return m1215h(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public void mo705d(int i) {
        super.mo705d(i);
        for (int i2 = 0; i2 < this.f2897s; i2++) {
            this.f2898t[i2].m1162c(i);
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: d */
    public void mo699d(C0813j jVar) {
        this.f2885E.m1190a();
        m657y();
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public int mo694e(C0813j.C0815a0 a0Var) {
        return m1213i(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public void mo696e(int i) {
        super.mo696e(i);
        for (int i2 = 0; i2 < this.f2897s; i2++) {
            this.f2898t[i2].m1162c(i);
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: e */
    public void mo693e(C0813j.C0847v vVar, C0813j.C0815a0 a0Var) {
        m1219c(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: f */
    public int mo688f(C0813j.C0815a0 a0Var) {
        return m1211j(a0Var);
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: f */
    public void mo690f(int i) {
        if (i == 0) {
            m1252F();
        }
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: g */
    public void mo683g(C0813j.C0815a0 a0Var) {
        super.mo683g(a0Var);
        this.f2883C = -1;
        this.f2884D = Integer.MIN_VALUE;
        this.f2889I = null;
        this.f2892L.m1193b();
    }

    /* renamed from: h */
    public void m1216h(int i) {
        if (i == 0 || i == 1) {
            mo733a((String) null);
            if (i != this.f2901w) {
                this.f2901w = i;
                AbstractC0810i iVar = this.f2899u;
                this.f2899u = this.f2900v;
                this.f2900v = iVar;
                m657y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: i */
    public void m1214i(int i) {
        mo733a((String) null);
        if (i != this.f2897s) {
            m1247K();
            this.f2897s = i;
            this.f2882B = new BitSet(this.f2897s);
            this.f2898t = new C0779f[this.f2897s];
            for (int i2 = 0; i2 < this.f2897s; i2++) {
                this.f2898t[i2] = new C0779f(i2);
            }
            m657y();
        }
    }

    /* renamed from: j */
    void m1212j(int i) {
        this.f2902x = i / this.f2897s;
        this.f2890J = View.MeasureSpec.makeMeasureSpec(i, this.f2900v.mo1034d());
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: u */
    public boolean mo661u() {
        return this.f2886F != 0;
    }

    @Override // androidx.recyclerview.widget.C0813j.AbstractC0835o
    /* renamed from: x */
    public Parcelable mo658x() {
        int i;
        int i2;
        int[] iArr;
        C0777e eVar = this.f2889I;
        if (eVar != null) {
            return new C0777e(eVar);
        }
        C0777e eVar2 = new C0777e();
        eVar2.f2928i = this.f2904z;
        eVar2.f2929j = this.f2887G;
        eVar2.f2930k = this.f2888H;
        C0774d dVar = this.f2885E;
        if (dVar == null || (iArr = dVar.f2915a) == null) {
            eVar2.f2925f = 0;
        } else {
            eVar2.f2926g = iArr;
            eVar2.f2925f = eVar2.f2926g.length;
            eVar2.f2927h = dVar.f2916b;
        }
        if (m697e() > 0) {
            eVar2.f2921b = this.f2887G ? m1249I() : m1250H();
            eVar2.f2922c = m1251G();
            int i3 = this.f2897s;
            eVar2.f2923d = i3;
            eVar2.f2924e = new int[i3];
            for (int i4 = 0; i4 < this.f2897s; i4++) {
                if (this.f2887G) {
                    i = this.f2898t[i4].m1172a(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f2899u.mo1038b();
                        i -= i2;
                        eVar2.f2924e[i4] = i;
                    } else {
                        eVar2.f2924e[i4] = i;
                    }
                } else {
                    i = this.f2898t[i4].m1165b(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f2899u.mo1030f();
                        i -= i2;
                        eVar2.f2924e[i4] = i;
                    } else {
                        eVar2.f2924e[i4] = i;
                    }
                }
            }
        } else {
            eVar2.f2921b = -1;
            eVar2.f2922c = -1;
            eVar2.f2923d = 0;
        }
        return eVar2;
    }
}
