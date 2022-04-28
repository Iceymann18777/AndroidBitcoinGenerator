package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000a.p018g.p029l.C0216r;
import p000a.p033i.p035b.C0240a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0677c<V> {

    /* renamed from: a */
    C0240a f3410a;

    /* renamed from: b */
    AbstractC0928b f3411b;

    /* renamed from: c */
    private boolean f3412c;

    /* renamed from: e */
    private boolean f3414e;

    /* renamed from: d */
    private float f3413d = 0.0f;

    /* renamed from: f */
    int f3415f = 2;

    /* renamed from: g */
    float f3416g = 0.5f;

    /* renamed from: h */
    float f3417h = 0.0f;

    /* renamed from: i */
    float f3418i = 0.5f;

    /* renamed from: j */
    private final C0240a.AbstractC0243c f3419j = new C0927a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes.dex */
    class C0927a extends C0240a.AbstractC0243c {

        /* renamed from: a */
        private int f3420a;

        /* renamed from: b */
        private int f3421b = -1;

        C0927a() {
        }

        /* renamed from: a */
        private boolean m302a(View view, float f) {
            if (f != 0.0f) {
                boolean z = C0216r.m3411j(view) == 1;
                int i = SwipeDismissBehavior.this.f3415f;
                if (i == 2) {
                    return true;
                }
                if (i == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (f <= 0.0f) {
                        return false;
                    }
                    return true;
                } else if (i != 1) {
                    return false;
                } else {
                    if (z) {
                        if (f <= 0.0f) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                return Math.abs(view.getLeft() - this.f3420a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f3416g);
            }
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public int mo303a(View view) {
            return view.getWidth();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.f3420a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.f3420a - r3.getWidth();
            r3 = r2.f3420a;
         */
        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo237a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p000a.p018g.p029l.C0216r.m3411j(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f3415f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f3420a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f3420a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f3420a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f3420a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f3420a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m307a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0927a.mo237a(android.view.View, int, int):int");
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo238a(View view, float f, float f2) {
            boolean z;
            int i;
            AbstractC0928b bVar;
            this.f3421b = -1;
            int width = view.getWidth();
            if (m302a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f3420a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f3420a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f3410a.m3312d(i, view.getTop())) {
                C0216r.m3432a(view, new RunnableC0929c(view, z));
            } else if (z && (bVar = SwipeDismissBehavior.this.f3411b) != null) {
                bVar.m299a(view);
            }
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo301a(View view, int i) {
            this.f3421b = i;
            this.f3420a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: a */
        public void mo236a(View view, int i, int i2, int i3, int i4) {
            float width = this.f3420a + (view.getWidth() * SwipeDismissBehavior.this.f3417h);
            float width2 = this.f3420a + (view.getWidth() * SwipeDismissBehavior.this.f3418i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m309a(0.0f, 1.0f - SwipeDismissBehavior.m304b(width, width2, f), 1.0f));
            }
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public int mo233b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: b */
        public boolean mo234b(View view, int i) {
            return this.f3421b == -1 && SwipeDismissBehavior.this.mo63a(view);
        }

        @Override // p000a.p033i.p035b.C0240a.AbstractC0243c
        /* renamed from: c */
        public void mo232c(int i) {
            AbstractC0928b bVar = SwipeDismissBehavior.this.f3411b;
            if (bVar != null) {
                bVar.m300a(i);
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes.dex */
    public interface AbstractC0928b {
        /* renamed from: a */
        void m300a(int i);

        /* renamed from: a */
        void m299a(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes.dex */
    private class RunnableC0929c implements Runnable {

        /* renamed from: b */
        private final View f3423b;

        /* renamed from: c */
        private final boolean f3424c;

        RunnableC0929c(View view, boolean z) {
            this.f3423b = view;
            this.f3424c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0928b bVar;
            C0240a aVar = SwipeDismissBehavior.this.f3410a;
            if (aVar != null && aVar.m3329a(true)) {
                C0216r.m3432a(this.f3423b, this);
            } else if (this.f3424c && (bVar = SwipeDismissBehavior.this.f3411b) != null) {
                bVar.m299a(this.f3423b);
            }
        }
    }

    /* renamed from: a */
    static float m309a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m307a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private void m306a(ViewGroup viewGroup) {
        if (this.f3410a == null) {
            this.f3410a = this.f3414e ? C0240a.m3331a(viewGroup, this.f3413d, this.f3419j) : C0240a.m3330a(viewGroup, this.f3419j);
        }
    }

    /* renamed from: b */
    static float m304b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void m310a(float f) {
        this.f3418i = m309a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public void m308a(int i) {
        this.f3415f = i;
    }

    /* renamed from: a */
    public boolean mo63a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: a */
    public boolean mo62a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f3412c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3412c = coordinatorLayout.m1718a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f3412c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3412c = false;
        }
        if (!z) {
            return false;
        }
        m306a((ViewGroup) coordinatorLayout);
        return this.f3410a.m3321b(motionEvent);
    }

    /* renamed from: b */
    public void m305b(float f) {
        this.f3417h = m309a(0.0f, f, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
    /* renamed from: b */
    public boolean mo18b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0240a aVar = this.f3410a;
        if (aVar == null) {
            return false;
        }
        aVar.m3336a(motionEvent);
        return true;
    }
}
