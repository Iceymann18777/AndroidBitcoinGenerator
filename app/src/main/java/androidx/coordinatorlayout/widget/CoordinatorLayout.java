package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0698a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.p017f.C0118a;
import p000a.p017f.C0119b;
import p000a.p017f.C0120c;
import p000a.p018g.p019d.C0124a;
import p000a.p018g.p028k.AbstractC0181d;
import p000a.p018g.p028k.C0180c;
import p000a.p018g.p028k.C0183f;
import p000a.p018g.p029l.AbstractC0210l;
import p000a.p018g.p029l.AbstractC0213o;
import p000a.p018g.p029l.C0200c;
import p000a.p018g.p029l.C0212n;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0230z;
import p000a.p033i.p034a.AbstractC0237a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements AbstractC0210l {

    /* renamed from: u */
    static final String f2568u;

    /* renamed from: v */
    static final Class<?>[] f2569v;

    /* renamed from: w */
    static final ThreadLocal<Map<String, Constructor<AbstractC0677c>>> f2570w;

    /* renamed from: x */
    static final Comparator<View> f2571x;

    /* renamed from: y */
    private static final AbstractC0181d<Rect> f2572y;

    /* renamed from: b */
    private final List<View> f2573b;

    /* renamed from: c */
    private final C0685a<View> f2574c;

    /* renamed from: d */
    private final List<View> f2575d;

    /* renamed from: e */
    private final List<View> f2576e;

    /* renamed from: f */
    private final int[] f2577f;

    /* renamed from: g */
    private Paint f2578g;

    /* renamed from: h */
    private boolean f2579h;

    /* renamed from: i */
    private boolean f2580i;

    /* renamed from: j */
    private int[] f2581j;

    /* renamed from: k */
    private View f2582k;

    /* renamed from: l */
    private View f2583l;

    /* renamed from: m */
    private ViewTreeObserver$OnPreDrawListenerC0681g f2584m;

    /* renamed from: n */
    private boolean f2585n;

    /* renamed from: o */
    private C0230z f2586o;

    /* renamed from: p */
    private boolean f2587p;

    /* renamed from: q */
    private Drawable f2588q;

    /* renamed from: r */
    ViewGroup.OnHierarchyChangeListener f2589r;

    /* renamed from: s */
    private AbstractC0213o f2590s;

    /* renamed from: t */
    private final C0212n f2591t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C0675a implements AbstractC0213o {
        C0675a() {
        }

        @Override // p000a.p018g.p029l.AbstractC0213o
        /* renamed from: a */
        public C0230z mo86a(View view, C0230z zVar) {
            return CoordinatorLayout.this.m1723a(zVar);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface AbstractC0676b {
        AbstractC0677c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0677c<V extends View> {
        public AbstractC0677c() {
        }

        public AbstractC0677c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public C0230z m1683a(CoordinatorLayout coordinatorLayout, V v, C0230z zVar) {
            return zVar;
        }

        /* renamed from: a */
        public void m1685a() {
        }

        /* renamed from: a */
        public void mo31a(C0680f fVar) {
        }

        /* renamed from: a */
        public void mo256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo254a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m1675d(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo313a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo375a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo313a(coordinatorLayout, (CoordinatorLayout) v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void m1681a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public void mo253a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m1681a(coordinatorLayout, (CoordinatorLayout) v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void m1680a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: a */
        public void m1679a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m1680a(coordinatorLayout, (CoordinatorLayout) v, view, view2, i);
            }
        }

        /* renamed from: a */
        public boolean m1684a(CoordinatorLayout coordinatorLayout, V v) {
            return m1677c(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo46a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo331a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo209a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo349a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo62a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo20a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo255a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean m1682a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: b */
        public int m1678b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: b */
        public boolean mo18b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo43b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public boolean mo311b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo248b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo311b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: c */
        public float m1677c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: c */
        public void m1676c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public Parcelable mo241d(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: d */
        public void m1675d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface AbstractC0678d {
        Class<? extends AbstractC0677c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    private class ViewGroup$OnHierarchyChangeListenerC0679e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC0679e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2589r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m1725a(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2589r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public static class C0680f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0677c f2594a;

        /* renamed from: b */
        boolean f2595b;

        /* renamed from: c */
        public int f2596c;

        /* renamed from: d */
        public int f2597d;

        /* renamed from: e */
        public int f2598e;

        /* renamed from: f */
        int f2599f;

        /* renamed from: g */
        public int f2600g;

        /* renamed from: h */
        public int f2601h;

        /* renamed from: i */
        int f2602i;

        /* renamed from: j */
        int f2603j;

        /* renamed from: k */
        View f2604k;

        /* renamed from: l */
        View f2605l;

        /* renamed from: m */
        private boolean f2606m;

        /* renamed from: n */
        private boolean f2607n;

        /* renamed from: o */
        private boolean f2608o;

        /* renamed from: p */
        private boolean f2609p;

        /* renamed from: q */
        final Rect f2610q;

        public C0680f(int i, int i2) {
            super(i, i2);
            this.f2595b = false;
            this.f2596c = 0;
            this.f2597d = 0;
            this.f2598e = -1;
            this.f2599f = -1;
            this.f2600g = 0;
            this.f2601h = 0;
            this.f2610q = new Rect();
        }

        C0680f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2595b = false;
            this.f2596c = 0;
            this.f2597d = 0;
            this.f2598e = -1;
            this.f2599f = -1;
            this.f2600g = 0;
            this.f2601h = 0;
            this.f2610q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0120c.CoordinatorLayout_Layout);
            this.f2596c = obtainStyledAttributes.getInteger(C0120c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2599f = obtainStyledAttributes.getResourceId(C0120c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2597d = obtainStyledAttributes.getInteger(C0120c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2598e = obtainStyledAttributes.getInteger(C0120c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2600g = obtainStyledAttributes.getInt(C0120c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2601h = obtainStyledAttributes.getInt(C0120c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f2595b = obtainStyledAttributes.hasValue(C0120c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f2595b) {
                this.f2594a = CoordinatorLayout.m1722a(context, attributeSet, obtainStyledAttributes.getString(C0120c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            AbstractC0677c cVar = this.f2594a;
            if (cVar != null) {
                cVar.mo31a(this);
            }
        }

        public C0680f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2595b = false;
            this.f2596c = 0;
            this.f2597d = 0;
            this.f2598e = -1;
            this.f2599f = -1;
            this.f2600g = 0;
            this.f2601h = 0;
            this.f2610q = new Rect();
        }

        public C0680f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2595b = false;
            this.f2596c = 0;
            this.f2597d = 0;
            this.f2598e = -1;
            this.f2599f = -1;
            this.f2600g = 0;
            this.f2601h = 0;
            this.f2610q = new Rect();
        }

        public C0680f(C0680f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f2595b = false;
            this.f2596c = 0;
            this.f2597d = 0;
            this.f2598e = -1;
            this.f2599f = -1;
            this.f2600g = 0;
            this.f2601h = 0;
            this.f2610q = new Rect();
        }

        /* renamed from: a */
        private void m1669a(View view, CoordinatorLayout coordinatorLayout) {
            this.f2604k = coordinatorLayout.findViewById(this.f2599f);
            View view2 = this.f2604k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    for (ViewParent parent = view2.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2605l = view2;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2599f) + " to anchor view " + view);
            }
            this.f2605l = null;
            this.f2604k = null;
        }

        /* renamed from: a */
        private boolean m1670a(View view, int i) {
            int a = C0200c.m3490a(((C0680f) view.getLayoutParams()).f2600g, i);
            return a != 0 && (C0200c.m3490a(this.f2601h, i) & a) == a;
        }

        /* renamed from: b */
        private boolean m1662b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2604k.getId() != this.f2599f) {
                return false;
            }
            View view2 = this.f2604k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2605l = null;
                    this.f2604k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2605l = view2;
            return true;
        }

        /* renamed from: a */
        View m1667a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2599f == -1) {
                this.f2605l = null;
                this.f2604k = null;
                return null;
            }
            if (this.f2604k == null || !m1662b(view, coordinatorLayout)) {
                m1669a(view, coordinatorLayout);
            }
            return this.f2604k;
        }

        /* renamed from: a */
        void m1672a(int i, boolean z) {
            if (i == 0) {
                this.f2607n = z;
            } else if (i == 1) {
                this.f2608o = z;
            }
        }

        /* renamed from: a */
        void m1671a(Rect rect) {
            this.f2610q.set(rect);
        }

        /* renamed from: a */
        public void m1668a(AbstractC0677c cVar) {
            AbstractC0677c cVar2 = this.f2594a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.m1685a();
                }
                this.f2594a = cVar;
                this.f2595b = true;
                if (cVar != null) {
                    cVar.mo31a(this);
                }
            }
        }

        /* renamed from: a */
        void m1665a(boolean z) {
            this.f2609p = z;
        }

        /* renamed from: a */
        boolean m1674a() {
            return this.f2604k == null && this.f2599f != -1;
        }

        /* renamed from: a */
        boolean m1673a(int i) {
            if (i == 0) {
                return this.f2607n;
            }
            if (i != 1) {
                return false;
            }
            return this.f2608o;
        }

        /* renamed from: a */
        boolean m1666a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0677c cVar;
            return view2 == this.f2605l || m1670a(view2, C0216r.m3411j(coordinatorLayout)) || ((cVar = this.f2594a) != null && cVar.mo20a(coordinatorLayout, (CoordinatorLayout) view, view2));
        }

        /* renamed from: b */
        void m1663b(int i) {
            m1672a(i, false);
        }

        /* renamed from: b */
        boolean m1664b() {
            if (this.f2594a == null) {
                this.f2606m = false;
            }
            return this.f2606m;
        }

        /* renamed from: b */
        boolean m1661b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2606m;
            if (z) {
                return true;
            }
            AbstractC0677c cVar = this.f2594a;
            boolean a = (cVar != null ? cVar.m1684a(coordinatorLayout, view) : false) | z;
            this.f2606m = a;
            return a;
        }

        /* renamed from: c */
        public int m1660c() {
            return this.f2599f;
        }

        /* renamed from: d */
        public AbstractC0677c m1659d() {
            return this.f2594a;
        }

        /* renamed from: e */
        boolean m1658e() {
            return this.f2609p;
        }

        /* renamed from: f */
        Rect m1657f() {
            return this.f2610q;
        }

        /* renamed from: g */
        void m1656g() {
            this.f2609p = false;
        }

        /* renamed from: h */
        void m1655h() {
            this.f2606m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC0681g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC0681g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m1725a(0);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    public static class C0682h extends AbstractC0237a {
        public static final Parcelable.Creator<C0682h> CREATOR = new C0683a();

        /* renamed from: d */
        SparseArray<Parcelable> f2612d;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        /* loaded from: classes.dex */
        static class C0683a implements Parcelable.ClassLoaderCreator<C0682h> {
            C0683a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0682h createFromParcel(Parcel parcel) {
                return new C0682h(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0682h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0682h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public C0682h[] newArray(int i) {
                return new C0682h[i];
            }
        }

        public C0682h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2612d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2612d.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0682h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2612d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2612d.keyAt(i2);
                parcelableArr[i2] = this.f2612d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    /* loaded from: classes.dex */
    static class C0684i implements Comparator<View> {
        C0684i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float r = C0216r.m3403r(view);
            float r2 = C0216r.m3403r(view2);
            if (r > r2) {
                return -1;
            }
            return r < r2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f2568u = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f2571x = new C0684i();
        } else {
            f2571x = null;
        }
        f2569v = new Class[]{Context.class, AttributeSet.class};
        f2570w = new ThreadLocal<>();
        f2572y = new C0183f(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0118a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2573b = new ArrayList();
        this.f2574c = new C0685a<>();
        this.f2575d = new ArrayList();
        this.f2576e = new ArrayList();
        this.f2577f = new int[2];
        this.f2591t = new C0212n(this);
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, C0120c.CoordinatorLayout, 0, C0119b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, C0120c.CoordinatorLayout, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0120c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2581j = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2581j.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f2581j;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f2588q = obtainStyledAttributes.getDrawable(C0120c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m1687f();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0679e());
    }

    /* renamed from: a */
    private static int m1724a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    static AbstractC0677c m1722a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f2568u)) {
            str = f2568u + '.' + str;
        }
        try {
            Map<String, Constructor<AbstractC0677c>> map = f2570w.get();
            if (map == null) {
                map = new HashMap<>();
                f2570w.set(map);
            }
            Constructor<AbstractC0677c> constructor = map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f2569v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC0677c) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: a */
    private static void m1721a(Rect rect) {
        rect.setEmpty();
        f2572y.mo3558a(rect);
    }

    /* renamed from: a */
    private void m1715a(View view, int i, Rect rect, Rect rect2, C0680f fVar, int i2, int i3) {
        int a = C0200c.m3490a(m1699c(fVar.f2596c), i);
        int a2 = C0200c.m3490a(m1694d(fVar.f2597d), i);
        int i4 = a & 7;
        int i5 = a & 112;
        int i6 = a2 & 7;
        int i7 = a2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: a */
    private void m1713a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C0216r.m3397x(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0680f fVar = (C0680f) view.getLayoutParams();
            AbstractC0677c d = fVar.m1659d();
            Rect d2 = m1695d();
            Rect d3 = m1695d();
            d3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (d == null || !d.mo209a(this, (CoordinatorLayout) view, d2)) {
                d2.set(d3);
            } else if (!d3.contains(d2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + d2.toShortString() + " | Bounds:" + d3.toShortString());
            }
            m1721a(d3);
            if (d2.isEmpty()) {
                m1721a(d2);
                return;
            }
            int a = C0200c.m3490a(fVar.f2601h, i);
            if ((a & 48) != 48 || (i6 = (d2.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f2603j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m1686f(view, i7 - i6);
                z = true;
            }
            if ((a & 80) == 80 && (height = ((getHeight() - d2.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f2603j) < (i5 = rect.bottom)) {
                m1686f(view, height - i5);
                z = true;
            }
            if (!z) {
                m1686f(view, 0);
            }
            if ((a & 3) != 3 || (i3 = (d2.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f2602i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m1688e(view, i4 - i3);
                z2 = true;
            }
            if ((a & 5) == 5 && (width = ((getWidth() - d2.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f2602i) < (i2 = rect.right)) {
                m1688e(view, width - i2);
                z2 = true;
            }
            if (!z2) {
                m1688e(view, 0);
            }
            m1721a(d2);
        }
    }

    /* renamed from: a */
    private void m1712a(View view, View view2, int i) {
        Rect d = m1695d();
        Rect d2 = m1695d();
        try {
            m1714a(view2, d);
            m1716a(view, i, d, d2);
            view.layout(d2.left, d2.top, d2.right, d2.bottom);
        } finally {
            m1721a(d);
            m1721a(d2);
        }
    }

    /* renamed from: a */
    private void m1710a(C0680f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private void m1709a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f2571x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private void m1708a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0677c d = ((C0680f) childAt.getLayoutParams()).m1659d();
            if (d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d.mo62a(this, (CoordinatorLayout) childAt, obtain);
                } else {
                    d.mo18b(this, (CoordinatorLayout) childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0680f) getChildAt(i2).getLayoutParams()).m1655h();
        }
        this.f2582k = null;
        this.f2579h = false;
    }

    /* renamed from: a */
    private boolean m1720a(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2575d;
        m1709a(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0680f fVar = (C0680f) view.getLayoutParams();
            AbstractC0677c d = fVar.m1659d();
            boolean z3 = true;
            if (!(z || z2) || actionMasked == 0) {
                if (!z && d != null) {
                    if (i == 0) {
                        z = d.mo62a(this, (CoordinatorLayout) view, motionEvent);
                    } else if (i == 1) {
                        z = d.mo18b(this, (CoordinatorLayout) view, motionEvent);
                    }
                    if (z) {
                        this.f2582k = view;
                    }
                }
                boolean b = fVar.m1664b();
                boolean b2 = fVar.m1661b(this, view);
                if (!b2 || b) {
                    z3 = false;
                }
                if (b2 && !z3) {
                    break;
                }
                z2 = z3;
            } else if (d != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    d.mo62a(this, (CoordinatorLayout) view, motionEvent2);
                } else if (i == 1) {
                    d.mo18b(this, (CoordinatorLayout) view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    private int m1706b(int i) {
        StringBuilder sb;
        int[] iArr = this.f2581j;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: b */
    private C0230z m1705b(C0230z zVar) {
        AbstractC0677c d;
        if (zVar.m3353g()) {
            return zVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0216r.m3415g(childAt) && (d = ((C0680f) childAt.getLayoutParams()).m1659d()) != null) {
                zVar = d.m1683a(this, (CoordinatorLayout) childAt, zVar);
                if (zVar.m3353g()) {
                    break;
                }
            }
        }
        return zVar;
    }

    /* renamed from: b */
    private void m1702b(View view, int i, int i2) {
        C0680f fVar = (C0680f) view.getLayoutParams();
        int a = C0200c.m3490a(m1690e(fVar.f2596c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m1706b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: c */
    private static int m1699c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m1694d(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static Rect m1695d() {
        Rect a = f2572y.mo3559a();
        return a == null ? new Rect() : a;
    }

    /* renamed from: d */
    private void m1692d(View view, int i) {
        C0680f fVar = (C0680f) view.getLayoutParams();
        Rect d = m1695d();
        d.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f2586o != null && C0216r.m3415g(this) && !C0216r.m3415g(view)) {
            d.left += this.f2586o.m3357c();
            d.top += this.f2586o.m3355e();
            d.right -= this.f2586o.m3356d();
            d.bottom -= this.f2586o.m3358b();
        }
        Rect d2 = m1695d();
        C0200c.m3489a(m1694d(fVar.f2596c), view.getMeasuredWidth(), view.getMeasuredHeight(), d, d2, i);
        view.layout(d2.left, d2.top, d2.right, d2.bottom);
        m1721a(d);
        m1721a(d2);
    }

    /* renamed from: e */
    private static int m1690e(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private void m1691e() {
        this.f2573b.clear();
        this.f2574c.m1653a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0680f d = m1693d(childAt);
            d.m1667a(this, childAt);
            this.f2574c.m1652a((C0685a<View>) childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.m1666a(this, childAt, childAt2)) {
                        if (!this.f2574c.m1647b(childAt2)) {
                            this.f2574c.m1652a((C0685a<View>) childAt2);
                        }
                        this.f2574c.m1651a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2573b.addAll(this.f2574c.m1648b());
        Collections.reverse(this.f2573b);
    }

    /* renamed from: e */
    private void m1688e(View view, int i) {
        C0680f fVar = (C0680f) view.getLayoutParams();
        int i2 = fVar.f2602i;
        if (i2 != i) {
            C0216r.m3422c(view, i - i2);
            fVar.f2602i = i;
        }
    }

    /* renamed from: e */
    private boolean m1689e(View view) {
        return this.f2574c.m1643e(view);
    }

    /* renamed from: f */
    private void m1687f() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0216r.m3415g(this)) {
                if (this.f2590s == null) {
                    this.f2590s = new C0675a();
                }
                C0216r.m3439a(this, this.f2590s);
                setSystemUiVisibility(1280);
                return;
            }
            C0216r.m3439a(this, (AbstractC0213o) null);
        }
    }

    /* renamed from: f */
    private void m1686f(View view, int i) {
        C0680f fVar = (C0680f) view.getLayoutParams();
        int i2 = fVar.f2603j;
        if (i2 != i) {
            C0216r.m3420d(view, i - i2);
            fVar.f2603j = i;
        }
    }

    /* renamed from: a */
    final C0230z m1723a(C0230z zVar) {
        if (C0180c.m3562a(this.f2586o, zVar)) {
            return zVar;
        }
        this.f2586o = zVar;
        boolean z = true;
        this.f2587p = zVar != null && zVar.m3355e() > 0;
        if (this.f2587p || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0230z b = m1705b(zVar);
        requestLayout();
        return b;
    }

    /* renamed from: a */
    void m1726a() {
        if (this.f2580i) {
            if (this.f2584m == null) {
                this.f2584m = new ViewTreeObserver$OnPreDrawListenerC0681g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2584m);
        }
        this.f2585n = true;
    }

    /* renamed from: a */
    final void m1725a(int i) {
        boolean z;
        int j = C0216r.m3411j(this);
        int size = this.f2573b.size();
        Rect d = m1695d();
        Rect d2 = m1695d();
        Rect d3 = m1695d();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2573b.get(i2);
            C0680f fVar = (C0680f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (fVar.f2605l == this.f2573b.get(i3)) {
                        m1703b(view, j);
                    }
                }
                m1711a(view, true, d2);
                if (fVar.f2600g != 0 && !d2.isEmpty()) {
                    int a = C0200c.m3490a(fVar.f2600g, j);
                    int i4 = a & 112;
                    if (i4 == 48) {
                        d.top = Math.max(d.top, d2.bottom);
                    } else if (i4 == 80) {
                        d.bottom = Math.max(d.bottom, getHeight() - d2.top);
                    }
                    int i5 = a & 7;
                    if (i5 == 3) {
                        d.left = Math.max(d.left, d2.right);
                    } else if (i5 == 5) {
                        d.right = Math.max(d.right, getWidth() - d2.left);
                    }
                }
                if (fVar.f2601h != 0 && view.getVisibility() == 0) {
                    m1713a(view, d, j);
                }
                if (i != 2) {
                    m1701b(view, d3);
                    if (!d3.equals(d2)) {
                        m1696c(view, d2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f2573b.get(i6);
                    C0680f fVar2 = (C0680f) view2.getLayoutParams();
                    AbstractC0677c d4 = fVar2.m1659d();
                    if (d4 != null && d4.mo20a(this, (CoordinatorLayout) view2, view)) {
                        if (i != 0 || !fVar2.m1658e()) {
                            if (i != 2) {
                                z = d4.mo43b(this, (CoordinatorLayout) view2, view);
                            } else {
                                d4.m1676c(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                fVar2.m1665a(z);
                            }
                        } else {
                            fVar2.m1656g();
                        }
                    }
                }
            }
        }
        m1721a(d);
        m1721a(d2);
        m1721a(d3);
    }

    /* renamed from: a */
    public void m1719a(View view) {
        List c = this.f2574c.m1645c(view);
        if (!(c == null || c.isEmpty())) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                AbstractC0677c d = ((C0680f) view2.getLayoutParams()).m1659d();
                if (d != null) {
                    d.mo43b(this, (CoordinatorLayout) view2, view);
                }
            }
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1571a(View view, int i) {
        this.f2591t.m3453a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0680f fVar = (C0680f) childAt.getLayoutParams();
            if (fVar.m1673a(i)) {
                AbstractC0677c d = fVar.m1659d();
                if (d != null) {
                    d.mo254a(this, (CoordinatorLayout) childAt, view, i);
                }
                fVar.m1663b(i);
                fVar.m1656g();
            }
        }
        this.f2583l = null;
    }

    /* renamed from: a */
    public void m1717a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1569a(View view, int i, int i2, int i3, int i4, int i5) {
        AbstractC0677c d;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0680f fVar = (C0680f) childAt.getLayoutParams();
                if (fVar.m1673a(i5) && (d = fVar.m1659d()) != null) {
                    d.mo375a(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            m1725a(1);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1568a(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0677c d;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0680f fVar = (C0680f) childAt.getLayoutParams();
                if (fVar.m1673a(i3) && (d = fVar.m1659d()) != null) {
                    int[] iArr2 = this.f2577f;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    d.mo253a(this, (CoordinatorLayout) childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2577f;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f2577f;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m1725a(1);
        }
    }

    /* renamed from: a */
    void m1716a(View view, int i, Rect rect, Rect rect2) {
        C0680f fVar = (C0680f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1715a(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m1710a(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    void m1714a(View view, Rect rect) {
        C0686b.m1642a(this, view, rect);
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: a */
    public void mo1566a(View view, View view2, int i, int i2) {
        AbstractC0677c d;
        this.f2591t.m3451a(view, view2, i, i2);
        this.f2583l = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0680f fVar = (C0680f) childAt.getLayoutParams();
            if (fVar.m1673a(i2) && (d = fVar.m1659d()) != null) {
                d.m1679a(this, (CoordinatorLayout) childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: a */
    void m1711a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m1714a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public boolean m1718a(View view, int i, int i2) {
        Rect d = m1695d();
        m1714a(view, d);
        try {
            return d.contains(i, i2);
        } finally {
            m1721a(d);
        }
    }

    /* renamed from: b */
    public List<View> m1704b(View view) {
        List<View> d = this.f2574c.m1644d(view);
        this.f2576e.clear();
        if (d != null) {
            this.f2576e.addAll(d);
        }
        return this.f2576e;
    }

    /* renamed from: b */
    void m1707b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1689e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f2585n) {
            return;
        }
        if (z) {
            m1726a();
        } else {
            m1700c();
        }
    }

    /* renamed from: b */
    void m1703b(View view, int i) {
        AbstractC0677c d;
        C0680f fVar = (C0680f) view.getLayoutParams();
        if (fVar.f2604k != null) {
            Rect d2 = m1695d();
            Rect d3 = m1695d();
            Rect d4 = m1695d();
            m1714a(fVar.f2604k, d2);
            boolean z = false;
            m1711a(view, false, d3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m1715a(view, i, d2, d4, fVar, measuredWidth, measuredHeight);
            if (!(d4.left == d3.left && d4.top == d3.top)) {
                z = true;
            }
            m1710a(fVar, d4, measuredWidth, measuredHeight);
            int i2 = d4.left - d3.left;
            int i3 = d4.top - d3.top;
            if (i2 != 0) {
                C0216r.m3422c(view, i2);
            }
            if (i3 != 0) {
                C0216r.m3420d(view, i3);
            }
            if (z && (d = fVar.m1659d()) != null) {
                d.mo43b(this, (CoordinatorLayout) view, fVar.f2604k);
            }
            m1721a(d2);
            m1721a(d3);
            m1721a(d4);
        }
    }

    /* renamed from: b */
    void m1701b(View view, Rect rect) {
        rect.set(((C0680f) view.getLayoutParams()).m1657f());
    }

    @Override // p000a.p018g.p029l.AbstractC0210l
    /* renamed from: b */
    public boolean mo1559b(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0680f fVar = (C0680f) childAt.getLayoutParams();
                AbstractC0677c d = fVar.m1659d();
                if (d != null) {
                    boolean b = d.mo248b(this, childAt, view, view2, i, i2);
                    z |= b;
                    fVar.m1672a(i2, b);
                } else {
                    fVar.m1672a(i2, false);
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public List<View> m1698c(View view) {
        List c = this.f2574c.m1645c(view);
        this.f2576e.clear();
        if (c != null) {
            this.f2576e.addAll(c);
        }
        return this.f2576e;
    }

    /* renamed from: c */
    void m1700c() {
        if (this.f2580i && this.f2584m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2584m);
        }
        this.f2585n = false;
    }

    /* renamed from: c */
    public void m1697c(View view, int i) {
        C0680f fVar = (C0680f) view.getLayoutParams();
        if (!fVar.m1674a()) {
            View view2 = fVar.f2604k;
            if (view2 != null) {
                m1712a(view, view2, i);
                return;
            }
            int i2 = fVar.f2598e;
            if (i2 >= 0) {
                m1702b(view, i2, i);
            } else {
                m1692d(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: c */
    void m1696c(View view, Rect rect) {
        ((C0680f) view.getLayoutParams()).m1671a(rect);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0680f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    C0680f m1693d(View view) {
        C0680f fVar = (C0680f) view.getLayoutParams();
        if (!fVar.f2595b) {
            if (view instanceof AbstractC0676b) {
                AbstractC0677c behavior = ((AbstractC0676b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.m1668a(behavior);
            } else {
                AbstractC0678d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (AbstractC0678d) cls.getAnnotation(AbstractC0678d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.m1668a((AbstractC0677c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            fVar.f2595b = true;
        }
        return fVar;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0680f fVar = (C0680f) view.getLayoutParams();
        AbstractC0677c cVar = fVar.f2594a;
        if (cVar != null) {
            float c = cVar.m1677c(this, view);
            if (c > 0.0f) {
                if (this.f2578g == null) {
                    this.f2578g = new Paint();
                }
                this.f2578g.setColor(fVar.f2594a.m1678b(this, view));
                this.f2578g.setAlpha(m1724a(Math.round(c * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2578g);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2588q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0680f generateDefaultLayoutParams() {
        return new C0680f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0680f generateLayoutParams(AttributeSet attributeSet) {
        return new C0680f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0680f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0680f ? new C0680f((C0680f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0680f((ViewGroup.MarginLayoutParams) layoutParams) : new C0680f(layoutParams);
    }

    final List<View> getDependencySortedChildren() {
        m1691e();
        return Collections.unmodifiableList(this.f2573b);
    }

    public final C0230z getLastWindowInsets() {
        return this.f2586o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2591t.m3454a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2588q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1708a(false);
        if (this.f2585n) {
            if (this.f2584m == null) {
                this.f2584m = new ViewTreeObserver$OnPreDrawListenerC0681g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2584m);
        }
        if (this.f2586o == null && C0216r.m3415g(this)) {
            C0216r.m3449B(this);
        }
        this.f2580i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1708a(false);
        if (this.f2585n && this.f2584m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2584m);
        }
        View view = this.f2583l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2580i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2587p && this.f2588q != null) {
            C0230z zVar = this.f2586o;
            int e = zVar != null ? zVar.m3355e() : 0;
            if (e > 0) {
                this.f2588q.setBounds(0, 0, getWidth(), e);
                this.f2588q.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1708a(true);
        }
        boolean a = m1720a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1708a(true);
        }
        return a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0677c d;
        int j = C0216r.m3411j(this);
        int size = this.f2573b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2573b.get(i5);
            if (view.getVisibility() != 8 && ((d = ((C0680f) view.getLayoutParams()).m1659d()) == null || !d.mo46a(this, (CoordinatorLayout) view, j))) {
                m1697c(view, j);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0117, code lost:
        if (r0.mo331a(r30, (androidx.coordinatorlayout.widget.CoordinatorLayout) r20, r11, r21, r23, 0) == false) goto L_0x0126;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0677c d;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0680f fVar = (C0680f) childAt.getLayoutParams();
                if (fVar.m1673a(0) && (d = fVar.m1659d()) != null) {
                    z2 |= d.m1682a(this, (CoordinatorLayout) childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m1725a(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0677c d;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0680f fVar = (C0680f) childAt.getLayoutParams();
                if (fVar.m1673a(0) && (d = fVar.m1659d()) != null) {
                    z |= d.mo255a(this, (CoordinatorLayout) childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1568a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1569a(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1566a(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0682h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0682h hVar = (C0682h) parcelable;
        super.onRestoreInstanceState(hVar.m3347a());
        SparseArray<Parcelable> sparseArray = hVar.f2612d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0677c d = m1693d(childAt).m1659d();
            if (!(id == -1 || d == null || (parcelable2 = sparseArray.get(id)) == null)) {
                d.mo256a(this, (CoordinatorLayout) childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable d;
        C0682h hVar = new C0682h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0677c d2 = ((C0680f) childAt.getLayoutParams()).m1659d();
            if (!(id == -1 || d2 == null || (d = d2.mo241d(this, childAt)) == null)) {
                sparseArray.append(id, d);
            }
        }
        hVar.f2612d = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1559b(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p018g.p029l.AbstractC0211m
    public void onStopNestedScroll(View view) {
        mo1571a(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2582k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m1720a(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2582k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0680f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m1659d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2582k
            boolean r6 = r6.mo18b(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2582k
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m1708a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0677c d = ((C0680f) view.getLayoutParams()).m1659d();
        if (d == null || !d.mo349a(this, (CoordinatorLayout) view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2579h) {
            m1708a(false);
            this.f2579h = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1687f();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2589r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2588q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2588q = drawable3;
            Drawable drawable4 = this.f2588q;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f2588q.setState(getDrawableState());
                }
                C0698a.m1605a(this.f2588q, C0216r.m3411j(this));
                this.f2588q.setVisible(getVisibility() == 0, false);
                this.f2588q.setCallback(this);
            }
            C0216r.m3450A(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0124a.m3732b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2588q;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2588q.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2588q;
    }
}
