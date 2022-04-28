package p000a.p045n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p000a.p018g.p029l.C0216r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.n.a0 */
/* loaded from: classes.dex */
public class C0321a0 implements AbstractC0337c0 {

    /* renamed from: a */
    protected C0322a f1014a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.n.a0$a */
    /* loaded from: classes.dex */
    public static class C0322a extends ViewGroup {

        /* renamed from: b */
        ViewGroup f1015b;

        /* renamed from: c */
        View f1016c;

        /* renamed from: d */
        ArrayList<Drawable> f1017d = null;

        /* renamed from: e */
        C0321a0 f1018e;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        C0322a(Context context, ViewGroup viewGroup, View view, C0321a0 a0Var) {
            super(context);
            this.f1015b = viewGroup;
            this.f1016c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f1018e = a0Var;
        }

        /* renamed from: a */
        private void m2927a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f1015b.getLocationOnScreen(iArr2);
            this.f1016c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void m2929a(Drawable drawable) {
            if (this.f1017d == null) {
                this.f1017d = new ArrayList<>();
            }
            if (!this.f1017d.contains(drawable)) {
                this.f1017d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: a */
        public void m2928a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f1015b || viewGroup.getParent() == null || !C0216r.m3398w(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f1015b.getLocationOnScreen(iArr2);
                    C0216r.m3422c(view, iArr[0] - iArr2[0]);
                    C0216r.m3420d(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* renamed from: a */
        boolean m2930a() {
            ArrayList<Drawable> arrayList;
            return getChildCount() == 0 && ((arrayList = this.f1017d) == null || arrayList.size() == 0);
        }

        /* renamed from: b */
        public void m2926b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f1017d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        /* renamed from: b */
        public void m2925b(View view) {
            super.removeView(view);
            if (m2930a()) {
                this.f1015b.removeView(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f1015b.getLocationOnScreen(iArr);
            this.f1016c.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f1016c.getWidth(), this.f1016c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f1017d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1017d.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f1015b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f1015b instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m2927a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f1017d) != null && arrayList.contains(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0321a0(Context context, ViewGroup viewGroup, View view) {
        this.f1014a = new C0322a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C0321a0 m2932c(View view) {
        ViewGroup d = m2931d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C0322a) {
                return ((C0322a) childAt).f1018e;
            }
        }
        return new C0385u(d.getContext(), d, view);
    }

    /* renamed from: d */
    static ViewGroup m2931d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: a */
    public void mo2770a(Drawable drawable) {
        this.f1014a.m2926b(drawable);
    }

    @Override // p000a.p045n.AbstractC0337c0
    /* renamed from: b */
    public void mo2769b(Drawable drawable) {
        this.f1014a.m2929a(drawable);
    }
}
