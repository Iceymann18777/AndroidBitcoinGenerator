package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import p000a.p018g.p024g.C0158a;
import p000a.p018g.p029l.AbstractC0208j;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0230z;
import p000a.p033i.p034a.AbstractC0237a;
import p050b.p051a.p052a.p053a.C0869b;
import p050b.p051a.p052a.p053a.C0876i;
import p050b.p051a.p052a.p053a.p054j.C0877a;

@CoordinatorLayout.AbstractC0678d(Behavior.class)
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout {

    /* renamed from: b */
    private int f3356b;

    /* renamed from: c */
    private int f3357c;

    /* renamed from: d */
    private int f3358d;

    /* renamed from: e */
    private boolean f3359e;

    /* renamed from: f */
    private int f3360f;

    /* renamed from: g */
    private C0230z f3361g;

    /* renamed from: h */
    private List<AbstractC0918a> f3362h;

    /* renamed from: i */
    private boolean f3363i;

    /* renamed from: j */
    private boolean f3364j;

    /* renamed from: k */
    private boolean f3365k;

    /* renamed from: l */
    private boolean f3366l;

    /* renamed from: m */
    private int[] f3367m;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC0920a<T> {

        /* renamed from: k */
        private int f3368k;

        /* renamed from: l */
        private int f3369l;

        /* renamed from: m */
        private ValueAnimator f3370m;

        /* renamed from: n */
        private int f3371n = -1;

        /* renamed from: o */
        private boolean f3372o;

        /* renamed from: p */
        private float f3373p;

        /* renamed from: q */
        private WeakReference<View> f3374q;

        /* renamed from: r */
        private AbstractC0915b f3375r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes.dex */
        public class C0914a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f3376a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f3377b;

            C0914a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f3376a = coordinatorLayout;
                this.f3377b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m335c(this.f3376a, (CoordinatorLayout) this.f3377b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0915b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean m351a(T t);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes.dex */
        public static class C0916c extends AbstractC0237a {
            public static final Parcelable.Creator<C0916c> CREATOR = new C0917a();

            /* renamed from: d */
            int f3379d;

            /* renamed from: e */
            float f3380e;

            /* renamed from: f */
            boolean f3381f;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            /* loaded from: classes.dex */
            static class C0917a implements Parcelable.ClassLoaderCreator<C0916c> {
                C0917a() {
                }

                @Override // android.os.Parcelable.Creator
                public C0916c createFromParcel(Parcel parcel) {
                    return new C0916c(parcel, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public C0916c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0916c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public C0916c[] newArray(int i) {
                    return new C0916c[i];
                }
            }

            public C0916c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f3379d = parcel.readInt();
                this.f3380e = parcel.readFloat();
                this.f3381f = parcel.readByte() != 0;
            }

            public C0916c(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f3379d);
                parcel.writeFloat(this.f3380e);
                parcel.writeByte(this.f3381f ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private View m376a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof AbstractC0208j) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static View m359a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private void m377a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int c = mo337c();
                if ((i < 0 && c == 0) || (i > 0 && c == (-t.getDownNestedScrollRange()))) {
                    C0216r.m3414g(view, 1);
                }
            }
        }

        /* renamed from: a */
        private void m372a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo337c() - i);
            float abs2 = Math.abs(f);
            m371a(coordinatorLayout, (CoordinatorLayout) t, i, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f));
        }

        /* renamed from: a */
        private void m371a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c = mo337c();
            if (c == i) {
                ValueAnimator valueAnimator = this.f3370m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3370m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f3370m;
            if (valueAnimator2 == null) {
                this.f3370m = new ValueAnimator();
                this.f3370m.setInterpolator(C0877a.f3284d);
                this.f3370m.addUpdateListener(new C0914a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f3370m.setDuration(Math.min(i2, 600));
            this.f3370m.setIntValues(c, i);
            this.f3370m.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m368a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = m359a(r7, r8)
                if (r0 == 0) goto L_0x006e
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$b r1 = (com.google.android.material.appbar.AppBarLayout.C0919b) r1
                int r1 = r1.m345a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0041
                int r2 = p000a.p018g.p029l.C0216r.m3410k(r0)
                if (r9 <= 0) goto L_0x002f
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
            L_0x002d:
                r8 = 1
                goto L_0x0042
            L_0x002f:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x0041
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
                goto L_0x002d
            L_0x0041:
                r8 = 0
            L_0x0042:
                boolean r9 = r7.m382c()
                if (r9 == 0) goto L_0x0057
                android.view.View r9 = r5.m376a(r6)
                if (r9 == 0) goto L_0x0057
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0056
                r8 = 1
                goto L_0x0057
            L_0x0056:
                r8 = 0
            L_0x0057:
                boolean r8 = r7.m387a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006e
                if (r10 != 0) goto L_0x006b
                if (r8 == 0) goto L_0x006e
                boolean r6 = r5.m355c(r6, r7)
                if (r6 == 0) goto L_0x006e
            L_0x006b:
                r7.jumpDrawablesToCurrentState()
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m368a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: a */
        private static boolean m378a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a */
        private boolean m366a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.m384b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: b */
        private int m356b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0919b bVar = (C0919b) childAt.getLayoutParams();
                if (m378a(bVar.m345a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) bVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) bVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private int m353c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C0919b bVar = (C0919b) childAt.getLayoutParams();
                Interpolator b = bVar.m344b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = bVar.m345a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0216r.m3410k(childAt);
                        }
                    }
                    if (C0216r.m3415g(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: c */
        private boolean m355c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c = coordinatorLayout.m1698c(t);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0677c d = ((CoordinatorLayout.C0680f) c.get(i).getLayoutParams()).m1659d();
                if (d instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) d).m327c() != 0;
                }
            }
            return false;
        }

        /* renamed from: d */
        private void m352d(CoordinatorLayout coordinatorLayout, T t) {
            int c = mo337c();
            int b = m356b((BaseBehavior<T>) t, c);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                C0919b bVar = (C0919b) childAt.getLayoutParams();
                int a = bVar.m345a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m378a(a, 2)) {
                        i2 += C0216r.m3410k(childAt);
                    } else if (m378a(a, 5)) {
                        int k = C0216r.m3410k(childAt) + i2;
                        if (c < k) {
                            i = k;
                        } else {
                            i2 = k;
                        }
                    }
                    if (m378a(a, 32)) {
                        i += ((LinearLayout.LayoutParams) bVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) bVar).bottomMargin;
                    }
                    if (c < (i2 + i) / 2) {
                        i = i2;
                    }
                    m372a(coordinatorLayout, (CoordinatorLayout) t, C0158a.m3608a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a */
        int m370a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c = mo337c();
            int i4 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.f3368k = 0;
            } else {
                int a = C0158a.m3608a(i, i2, i3);
                if (c != a) {
                    int c2 = t.m389a() ? m353c((BaseBehavior<T>) t, a) : a;
                    boolean a2 = m323a(c2);
                    i4 = c - a;
                    this.f3368k = a - c2;
                    if (!a2 && t.m389a()) {
                        coordinatorLayout.m1719a(t);
                    }
                    t.m388a(m322b());
                    m368a(coordinatorLayout, (CoordinatorLayout) t, a, a < c ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo256a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            m367a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), parcelable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo254a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            m365a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo375a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            m364a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i, i2, i3, i4, i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo253a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m363a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i, i2, iArr, i3);
        }

        /* renamed from: a */
        void m374a(CoordinatorLayout coordinatorLayout, T t) {
            m352d(coordinatorLayout, (CoordinatorLayout) t);
        }

        /* renamed from: a */
        public void m367a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C0916c) {
                C0916c cVar = (C0916c) parcelable;
                super.mo256a(coordinatorLayout, (CoordinatorLayout) t, cVar.m3347a());
                this.f3371n = cVar.f3379d;
                this.f3373p = cVar.f3380e;
                this.f3372o = cVar.f3381f;
                return;
            }
            super.mo256a(coordinatorLayout, (CoordinatorLayout) t, parcelable);
            this.f3371n = -1;
        }

        /* renamed from: a */
        public void m365a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f3369l == 0 || i == 1) {
                m352d(coordinatorLayout, (CoordinatorLayout) t);
            }
            this.f3374q = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void m364a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                m340a(coordinatorLayout, (CoordinatorLayout) t, i4, -t.getDownNestedScrollRange(), 0);
                m377a(i4, (int) t, view, i5);
            }
            if (t.m382c()) {
                t.m387a(view.getScrollY() > 0);
            }
        }

        /* renamed from: a */
        public void m363a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = t.getDownNestedPreScrollRange() + i6;
                    i5 = i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = m340a(coordinatorLayout, (CoordinatorLayout) t, i2, i5, i4);
                    m377a(i2, (int) t, view, i3);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: a */
        /* bridge */ /* synthetic */ boolean mo342a(View view) {
            return m360a((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.C0923c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo46a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return m373a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo331a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return m369a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3, i4);
        }

        /* renamed from: a */
        public boolean m373a(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean a = super.mo46a(coordinatorLayout, (CoordinatorLayout) t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f3371n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                m335c(coordinatorLayout, (CoordinatorLayout) t, (-childAt.getBottom()) + (this.f3372o ? C0216r.m3410k(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.f3373p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m372a(coordinatorLayout, (CoordinatorLayout) t, i3, 0.0f);
                    } else {
                        m335c(coordinatorLayout, (CoordinatorLayout) t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m372a(coordinatorLayout, (CoordinatorLayout) t, 0, 0.0f);
                    } else {
                        m335c(coordinatorLayout, (CoordinatorLayout) t, 0);
                    }
                }
            }
            t.m381d();
            this.f3371n = -1;
            m323a(C0158a.m3608a(m322b(), -t.getTotalScrollRange(), 0));
            m368a(coordinatorLayout, (CoordinatorLayout) t, m322b(), 0, true);
            t.m388a(m322b());
            return a;
        }

        /* renamed from: a */
        public boolean m369a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0680f) t.getLayoutParams())).height != -2) {
                return super.mo331a(coordinatorLayout, (CoordinatorLayout) t, i, i2, i3, i4);
            }
            coordinatorLayout.m1717a(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean m362a(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.m382c() || m366a(coordinatorLayout, (CoordinatorLayout) t, view));
            if (z && (valueAnimator = this.f3370m) != null) {
                valueAnimator.cancel();
            }
            this.f3374q = null;
            this.f3369l = i2;
            return z;
        }

        /* renamed from: a */
        boolean m360a(T t) {
            AbstractC0915b bVar = this.f3375r;
            if (bVar != null) {
                return bVar.m351a(t);
            }
            WeakReference<View> weakReference = this.f3374q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: b */
        /* bridge */ /* synthetic */ int mo339b(View view) {
            return m357b((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: b */
        /* bridge */ /* synthetic */ int mo338b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return m370a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3);
        }

        /* renamed from: b */
        int m357b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable m358b(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d = super.mo241d(coordinatorLayout, (CoordinatorLayout) t);
            int b = m322b();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b <= 0 && bottom >= 0) {
                    C0916c cVar = new C0916c(d);
                    cVar.f3379d = i;
                    if (bottom == C0216r.m3410k(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f3381f = z;
                    cVar.f3380e = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo248b(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return m362a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, view3, i, i2);
        }

        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: c */
        int mo337c() {
            return m322b() + this.f3368k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: c */
        /* bridge */ /* synthetic */ int mo336c(View view) {
            return m354c((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* renamed from: c */
        int m354c(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: d */
        public /* bridge */ /* synthetic */ Parcelable mo241d(CoordinatorLayout coordinatorLayout, View view) {
            return m358b(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.AbstractC0920a
        /* renamed from: e */
        /* bridge */ /* synthetic */ void mo333e(CoordinatorLayout coordinatorLayout, View view) {
            m374a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AbstractC0922b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876i.ScrollingViewBehavior_Layout);
            m329b(obtainStyledAttributes.getDimensionPixelSize(C0876i.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static int m348a(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0677c d = ((CoordinatorLayout.C0680f) appBarLayout.getLayoutParams()).m1659d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).mo337c();
            }
            return 0;
        }

        /* renamed from: a */
        private void m350a(View view, View view2) {
            CoordinatorLayout.AbstractC0677c d = ((CoordinatorLayout.C0680f) view2.getLayoutParams()).m1659d();
            if (d instanceof BaseBehavior) {
                C0216r.m3420d(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).f3368k) + m324d()) - m332a(view2));
            }
        }

        /* renamed from: b */
        private void m347b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m382c()) {
                    appBarLayout.m387a(view.getScrollY() > 0);
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC0922b
        /* renamed from: a */
        AppBarLayout mo330a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public boolean mo349a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo330a(coordinatorLayout.m1704b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f3394d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.m386a(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public boolean mo20a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.google.android.material.appbar.AbstractC0922b
        /* renamed from: b */
        float mo328b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m348a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (a / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: b */
        public boolean mo43b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m350a(view, view2);
            m347b(view, view2);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC0922b
        /* renamed from: c */
        public int mo325c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo325c(view);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes.dex */
    public interface AbstractC0918a<T extends AppBarLayout> {
        /* renamed from: a */
        void m346a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes.dex */
    public static class C0919b extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f3382a;

        /* renamed from: b */
        Interpolator f3383b;

        public C0919b(int i, int i2) {
            super(i, i2);
            this.f3382a = 1;
        }

        public C0919b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3382a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876i.AppBarLayout_Layout);
            this.f3382a = obtainStyledAttributes.getInt(C0876i.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C0876i.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f3383b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0876i.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0919b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3382a = 1;
        }

        public C0919b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3382a = 1;
        }

        public C0919b(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3382a = 1;
        }

        /* renamed from: a */
        public int m345a() {
            return this.f3382a;
        }

        /* renamed from: b */
        public Interpolator m344b() {
            return this.f3383b;
        }

        /* renamed from: c */
        boolean m343c() {
            int i = this.f3382a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    /* renamed from: a */
    private void m385a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f3360f = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private boolean m383b(boolean z) {
        if (this.f3364j == z) {
            return false;
        }
        this.f3364j = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: e */
    private boolean m380e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0919b) getChildAt(i).getLayoutParams()).m343c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m379f() {
        this.f3356b = -1;
        this.f3357c = -1;
        this.f3358d = -1;
    }

    /* renamed from: a */
    void m388a(int i) {
        List<AbstractC0918a> list = this.f3362h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0918a aVar = this.f3362h.get(i2);
                if (aVar != null) {
                    aVar.m346a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void m386a(boolean z, boolean z2) {
        m385a(z, z2, true);
    }

    /* renamed from: a */
    boolean m389a() {
        return this.f3359e;
    }

    /* renamed from: a */
    boolean m387a(boolean z) {
        if (this.f3365k == z) {
            return false;
        }
        this.f3365k = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: b */
    boolean m384b() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: c */
    public boolean m382c() {
        return this.f3366l;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0919b;
    }

    /* renamed from: d */
    void m381d() {
        this.f3360f = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public C0919b generateDefaultLayoutParams() {
        return new C0919b(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public C0919b generateLayoutParams(AttributeSet attributeSet) {
        return new C0919b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public C0919b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0919b((ViewGroup.MarginLayoutParams) layoutParams) : new C0919b(layoutParams) : new C0919b((LinearLayout.LayoutParams) layoutParams);
    }

    int getDownNestedPreScrollRange() {
        int i = this.f3357c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0919b bVar = (C0919b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = bVar.f3382a;
            if ((i3 & 5) == 5) {
                int i4 = i2 + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                i2 = (i3 & 8) != 0 ? i4 + C0216r.m3410k(childAt) : i4 + (measuredHeight - ((i3 & 2) != 0 ? C0216r.m3410k(childAt) : getTopInset()));
            } else if (i2 > 0) {
                break;
            }
        }
        int max = Math.max(0, i2);
        this.f3357c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.f3358d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0919b bVar = (C0919b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
            int i4 = bVar.f3382a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0216r.m3410k(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f3358d = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int k = C0216r.m3410k(this);
        if (k == 0) {
            int childCount = getChildCount();
            k = childCount >= 1 ? C0216r.m3410k(getChildAt(childCount - 1)) : 0;
            if (k == 0) {
                return getHeight() / 3;
            }
        }
        return (k * 2) + topInset;
    }

    int getPendingAction() {
        return this.f3360f;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C0230z zVar = this.f3361g;
        if (zVar != null) {
            return zVar.m3355e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f3356b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0919b bVar = (C0919b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bVar.f3382a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= C0216r.m3410k(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f3356b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.f3367m == null) {
            this.f3367m = new int[4];
        }
        int[] iArr = this.f3367m;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f3364j ? C0869b.state_liftable : -C0869b.state_liftable;
        iArr[1] = (!this.f3364j || !this.f3365k) ? -C0869b.state_lifted : C0869b.state_lifted;
        iArr[2] = this.f3364j ? C0869b.state_collapsible : -C0869b.state_collapsible;
        iArr[3] = (!this.f3364j || !this.f3365k) ? -C0869b.state_collapsed : C0869b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m379f();
        boolean z2 = false;
        this.f3359e = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C0919b) getChildAt(i5).getLayoutParams()).m344b() != null) {
                this.f3359e = true;
                break;
            } else {
                i5++;
            }
        }
        if (!this.f3363i) {
            if (this.f3366l || m380e()) {
                z2 = true;
            }
            m383b(z2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m379f();
    }

    public void setExpanded(boolean z) {
        m386a(z, C0216r.m3397x(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f3366l = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0925e.m315a(this, f);
        }
    }
}
