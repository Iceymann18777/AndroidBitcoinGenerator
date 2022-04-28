package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p000a.p018g.p024g.C0158a;
import p000a.p018g.p029l.C0216r;
import p000a.p033i.p034a.AbstractC0237a;
import p000a.p033i.p035b.C0240a;
import p050b.p051a.p052a.p053a.C0876i;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0677c<V> {

    /* renamed from: b */
    private float f3447b;

    /* renamed from: c */
    private int f3448c;

    /* renamed from: d */
    private boolean f3449d;

    /* renamed from: e */
    private int f3450e;

    /* renamed from: f */
    private int f3451f;

    /* renamed from: g */
    int f3452g;

    /* renamed from: h */
    int f3453h;

    /* renamed from: i */
    int f3454i;

    /* renamed from: j */
    boolean f3455j;

    /* renamed from: k */
    private boolean f3456k;

    /* renamed from: m */
    C0240a f3458m;

    /* renamed from: n */
    private boolean f3459n;

    /* renamed from: o */
    private int f3460o;

    /* renamed from: p */
    private boolean f3461p;

    /* renamed from: q */
    int f3462q;

    /* renamed from: r */
    WeakReference<V> f3463r;

    /* renamed from: s */
    WeakReference<View> f3464s;

    /* renamed from: t */
    private AbstractC0937b f3465t;

    /* renamed from: u */
    private VelocityTracker f3466u;

    /* renamed from: v */
    int f3467v;

    /* renamed from: w */
    private int f3468w;

    /* renamed from: x */
    boolean f3469x;

    /* renamed from: y */
    private Map<View, Integer> f3470y;

    /* renamed from: a */
    private boolean f3446a = true;

    /* renamed from: l */
    int f3457l = 4;

    /* renamed from: z */
    private final C0240a.AbstractC0243c f3471z = new C0936a();

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes.dex */
    class C0936a extends C0240a.AbstractC0243c {
        C0936a() {
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo237a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.f3454i)) goto L_0x0026;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.f3472a.f3454i)) goto L_0x00b6;
         */
        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo238a(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C0936a.mo238a(android.view.View, float, float):void");
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo236a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m259a(i2);
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public int mo235b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f3455j ? bottomSheetBehavior.f3462q : bottomSheetBehavior.f3454i;
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public int mo233b(View view, int i, int i2) {
            int c = BottomSheetBehavior.this.m245c();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0158a.m3608a(i, c, bottomSheetBehavior.f3455j ? bottomSheetBehavior.f3462q : bottomSheetBehavior.f3454i);
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public boolean mo234b(View view, int i) {
            WeakReference<V> weakReference;
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f3457l;
            if (i2 != 1 && !bottomSheetBehavior.f3469x) {
                return (i2 != 3 || bottomSheetBehavior.f3467v != i || (view2 = bottomSheetBehavior.f3464s.get()) == null || !view2.canScrollVertically(-1)) && (weakReference = BottomSheetBehavior.this.f3463r) != null && weakReference.get() == view;
            }
            return false;
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: c */
        public void mo232c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.m244c(1);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0937b {
        /* renamed from: a */
        public abstract void m231a(View view, float f);

        /* renamed from: a */
        public abstract void m230a(View view, int i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes.dex */
    public static class C0938c extends AbstractC0237a {
        public static final Parcelable.Creator<C0938c> CREATOR = new C0939a();

        /* renamed from: d */
        final int f3473d;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c$a */
        /* loaded from: classes.dex */
        static class C0939a implements Parcelable.ClassLoaderCreator<C0938c> {
            C0939a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0938c createFromParcel(Parcel parcel) {
                return new C0938c(parcel, (ClassLoader) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0938c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0938c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public C0938c[] newArray(int i) {
                return new C0938c[i];
            }
        }

        public C0938c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3473d = parcel.readInt();
        }

        public C0938c(Parcelable parcelable, int i) {
            super(parcelable);
            this.f3473d = i;
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3473d);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes.dex */
    private class RunnableC0940d implements Runnable {

        /* renamed from: b */
        private final View f3474b;

        /* renamed from: c */
        private final int f3475c;

        RunnableC0940d(View view, int i) {
            this.f3474b = view;
            this.f3475c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0240a aVar = BottomSheetBehavior.this.f3458m;
            if (aVar == null || !aVar.m3329a(true)) {
                BottomSheetBehavior.this.m244c(this.f3475c);
            } else {
                C0216r.m3432a(this.f3474b, this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876i.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0876i.BottomSheetBehavior_Layout_behavior_peekHeight);
        m249b((peekValue == null || (dimensionPixelSize = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(C0876i.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : dimensionPixelSize);
        m246b(obtainStyledAttributes.getBoolean(C0876i.BottomSheetBehavior_Layout_behavior_hideable, false));
        m251a(obtainStyledAttributes.getBoolean(C0876i.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        m243c(obtainStyledAttributes.getBoolean(C0876i.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f3447b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: b */
    private void m250b() {
        this.f3454i = this.f3446a ? Math.max(this.f3462q - this.f3451f, this.f3452g) : this.f3462q - this.f3451f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public int m245c() {
        if (this.f3446a) {
            return this.f3452g;
        }
        return 0;
    }

    /* renamed from: d */
    private float m242d() {
        VelocityTracker velocityTracker = this.f3466u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f3447b);
        return this.f3466u.getYVelocity(this.f3467v);
    }

    /* renamed from: d */
    private void m240d(boolean z) {
        int i;
        WeakReference<V> weakReference = this.f3463r;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f3470y == null) {
                        this.f3470y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f3463r.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f3470y;
                            if (map != null && map.containsKey(childAt)) {
                                i = this.f3470y.get(childAt).intValue();
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f3470y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            i = 4;
                        }
                        C0216r.m3418e(childAt, i);
                    }
                }
                if (!z) {
                    this.f3470y = null;
                }
            }
        }
    }

    /* renamed from: e */
    private void m239e() {
        this.f3467v = -1;
        VelocityTracker velocityTracker = this.f3466u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3466u = null;
        }
    }

    /* renamed from: a */
    View m258a(View view) {
        if (C0216r.m3396y(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = m258a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m259a(int i) {
        AbstractC0937b bVar;
        float f;
        float f2;
        V v = this.f3463r.get();
        if (v != null && (bVar = this.f3465t) != null) {
            int i2 = this.f3454i;
            if (i > i2) {
                f = i2 - i;
                f2 = this.f3462q - i2;
            } else {
                f = i2 - i;
                f2 = i2 - m245c();
            }
            bVar.m231a(v, f / f2);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo256a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0938c cVar = (C0938c) parcelable;
        super.mo256a(coordinatorLayout, (CoordinatorLayout) v, cVar.m3347a());
        int i = cVar.f3473d;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f3457l = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f3454i)) goto L_0x007a;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo254a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.m245c()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.m244c(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f3464s
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x009f
            boolean r4 = r3.f3461p
            if (r4 != 0) goto L_0x001d
            goto L_0x009f
        L_0x001d:
            int r4 = r3.f3460o
            r6 = 0
            r7 = 4
            if (r4 <= 0) goto L_0x0028
            int r4 = r3.m245c()
            goto L_0x0081
        L_0x0028:
            boolean r4 = r3.f3455j
            if (r4 == 0) goto L_0x003a
            float r4 = r3.m242d()
            boolean r4 = r3.m257a(r5, r4)
            if (r4 == 0) goto L_0x003a
            int r4 = r3.f3462q
            r0 = 5
            goto L_0x0081
        L_0x003a:
            int r4 = r3.f3460o
            if (r4 != 0) goto L_0x007e
            int r4 = r5.getTop()
            boolean r1 = r3.f3446a
            r2 = 6
            if (r1 == 0) goto L_0x005b
            int r1 = r3.f3452g
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f3454i
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r1 >= r4) goto L_0x007e
            int r4 = r3.f3452g
            goto L_0x0081
        L_0x005b:
            int r1 = r3.f3453h
            if (r4 >= r1) goto L_0x006b
            int r7 = r3.f3454i
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r4 >= r7) goto L_0x007a
            r4 = 0
            goto L_0x0081
        L_0x006b:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f3454i
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x007e
        L_0x007a:
            int r4 = r3.f3453h
            r0 = 6
            goto L_0x0081
        L_0x007e:
            int r4 = r3.f3454i
            r0 = 4
        L_0x0081:
            a.i.b.a r7 = r3.f3458m
            int r1 = r5.getLeft()
            boolean r4 = r7.m3319b(r5, r1, r4)
            if (r4 == 0) goto L_0x009a
            r4 = 2
            r3.m244c(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
            r4.<init>(r5, r0)
            p000a.p018g.p029l.C0216r.m3432a(r5, r4)
            goto L_0x009d
        L_0x009a:
            r3.m244c(r0)
        L_0x009d:
            r3.f3461p = r6
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo254a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public void mo253a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1 && view == this.f3464s.get()) {
            int top = v.getTop();
            int i5 = top - i2;
            if (i2 > 0) {
                if (i5 < m245c()) {
                    iArr[1] = top - m245c();
                    C0216r.m3420d(v, -iArr[1]);
                    i4 = 3;
                    m244c(i4);
                } else {
                    iArr[1] = i2;
                    C0216r.m3420d(v, -i2);
                    m244c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f3454i;
                if (i5 <= i6 || this.f3455j) {
                    iArr[1] = i2;
                    C0216r.m3420d(v, -i2);
                    m244c(1);
                } else {
                    iArr[1] = top - i6;
                    C0216r.m3420d(v, -iArr[1]);
                    i4 = 4;
                    m244c(i4);
                }
            }
            m259a(v.getTop());
            this.f3460o = i2;
            this.f3461p = true;
        }
    }

    /* renamed from: a */
    public void m251a(boolean z) {
        if (this.f3446a != z) {
            this.f3446a = z;
            if (this.f3463r != null) {
                m250b();
            }
            m244c((!this.f3446a || this.f3457l != 6) ? this.f3457l : 3);
        }
    }

    /* renamed from: a */
    boolean m257a(View view, float f) {
        if (this.f3456k) {
            return true;
        }
        return view.getTop() >= this.f3454i && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f3454i)) / ((float) this.f3448c) > 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
        /*
            r4 = this;
            boolean r0 = p000a.p018g.p029l.C0216r.m3415g(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = p000a.p018g.p029l.C0216r.m3415g(r6)
            if (r0 != 0) goto L_0x0010
            r6.setFitsSystemWindows(r1)
        L_0x0010:
            int r0 = r6.getTop()
            r5.m1697c(r6, r7)
            int r7 = r5.getHeight()
            r4.f3462q = r7
            boolean r7 = r4.f3449d
            if (r7 == 0) goto L_0x0043
            int r7 = r4.f3450e
            if (r7 != 0) goto L_0x0031
            android.content.res.Resources r7 = r5.getResources()
            int r2 = p050b.p051a.p052a.p053a.C0870c.design_bottom_sheet_peek_height_min
            int r7 = r7.getDimensionPixelSize(r2)
            r4.f3450e = r7
        L_0x0031:
            int r7 = r4.f3450e
            int r2 = r4.f3462q
            int r3 = r5.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            goto L_0x0045
        L_0x0043:
            int r7 = r4.f3448c
        L_0x0045:
            r4.f3451f = r7
            r7 = 0
            int r2 = r4.f3462q
            int r3 = r6.getHeight()
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            r4.f3452g = r7
            int r7 = r4.f3462q
            r2 = 2
            int r7 = r7 / r2
            r4.f3453h = r7
            r4.m250b()
            int r7 = r4.f3457l
            r3 = 3
            if (r7 != r3) goto L_0x006b
            int r7 = r4.m245c()
        L_0x0067:
            p000a.p018g.p029l.C0216r.m3420d(r6, r7)
            goto L_0x008f
        L_0x006b:
            r3 = 6
            if (r7 != r3) goto L_0x0071
            int r7 = r4.f3453h
            goto L_0x0067
        L_0x0071:
            boolean r3 = r4.f3455j
            if (r3 == 0) goto L_0x007b
            r3 = 5
            if (r7 != r3) goto L_0x007b
            int r7 = r4.f3462q
            goto L_0x0067
        L_0x007b:
            int r7 = r4.f3457l
            r3 = 4
            if (r7 != r3) goto L_0x0083
            int r7 = r4.f3454i
            goto L_0x0067
        L_0x0083:
            if (r7 == r1) goto L_0x0087
            if (r7 != r2) goto L_0x008f
        L_0x0087:
            int r7 = r6.getTop()
            int r0 = r0 - r7
            p000a.p018g.p029l.C0216r.m3420d(r6, r0)
        L_0x008f:
            a.i.b.a r7 = r4.f3458m
            if (r7 != 0) goto L_0x009b
            a.i.b.a$c r7 = r4.f3471z
            a.i.b.a r5 = p000a.p033i.p035b.C0240a.m3330a(r5, r7)
            r4.f3458m = r5
        L_0x009b:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            r4.f3463r = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r6 = r4.m258a(r6)
            r5.<init>(r6)
            r4.f3464s = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo46a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo62a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0240a aVar;
        if (!v.isShown()) {
            this.f3459n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m239e();
        }
        if (this.f3466u == null) {
            this.f3466u = VelocityTracker.obtain();
        }
        this.f3466u.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f3468w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f3464s;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && coordinatorLayout.m1718a(view2, x, this.f3468w)) {
                this.f3467v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f3469x = true;
            }
            this.f3459n = this.f3467v == -1 && !coordinatorLayout.m1718a(v, x, this.f3468w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3469x = false;
            this.f3467v = -1;
            if (this.f3459n) {
                this.f3459n = false;
                return false;
            }
        }
        if (!this.f3459n && (aVar = this.f3458m) != null && aVar.m3321b(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f3464s;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.f3459n && this.f3457l != 1 && !coordinatorLayout.m1718a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f3458m != null && Math.abs(((float) this.f3468w) - motionEvent.getY()) > ((float) this.f3458m.m3314d());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo255a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f3464s.get() && (this.f3457l != 3 || super.mo255a(coordinatorLayout, (CoordinatorLayout) v, view, f, f2));
    }

    /* renamed from: b */
    public final void m249b(int i) {
        WeakReference<V> weakReference;
        V v;
        boolean z = true;
        if (i == -1) {
            if (!this.f3449d) {
                this.f3449d = true;
            }
            z = false;
        } else {
            if (this.f3449d || this.f3448c != i) {
                this.f3449d = false;
                this.f3448c = Math.max(0, i);
                this.f3454i = this.f3462q - i;
            }
            z = false;
        }
        if (z && this.f3457l == 4 && (weakReference = this.f3463r) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    /* renamed from: b */
    public void m246b(boolean z) {
        this.f3455j = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo18b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3457l == 1 && actionMasked == 0) {
            return true;
        }
        C0240a aVar = this.f3458m;
        if (aVar != null) {
            aVar.m3336a(motionEvent);
        }
        if (actionMasked == 0) {
            m239e();
        }
        if (this.f3466u == null) {
            this.f3466u = VelocityTracker.obtain();
        }
        this.f3466u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f3459n && Math.abs(this.f3468w - motionEvent.getY()) > this.f3458m.m3314d()) {
            this.f3458m.m3334a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f3459n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo248b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f3460o = 0;
        this.f3461p = false;
        return (i & 2) != 0;
    }

    /* renamed from: c */
    void m244c(int i) {
        V v;
        AbstractC0937b bVar;
        boolean z;
        if (this.f3457l != i) {
            this.f3457l = i;
            if (i == 6 || i == 3) {
                z = true;
            } else {
                if (i == 5 || i == 4) {
                    z = false;
                }
                v = this.f3463r.get();
                if (v != null && (bVar = this.f3465t) != null) {
                    bVar.m230a((View) v, i);
                    return;
                }
            }
            m240d(z);
            v = this.f3463r.get();
            if (v != null) {
            }
        }
    }

    /* renamed from: c */
    public void m243c(boolean z) {
        this.f3456k = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: d */
    public Parcelable mo241d(CoordinatorLayout coordinatorLayout, V v) {
        return new C0938c(super.mo241d(coordinatorLayout, v), this.f3457l);
    }
}
