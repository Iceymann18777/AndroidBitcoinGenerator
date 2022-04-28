package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: androidx.coordinatorlayout.widget.b */
/* loaded from: classes.dex */
public class C0686b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f2617a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f2618b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m1642a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m1640b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m1641a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m1641a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    static void m1640b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f2617a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f2617a.set(matrix);
        } else {
            matrix.reset();
        }
        m1641a(viewGroup, view, matrix);
        RectF rectF = f2618b.get();
        if (rectF == null) {
            rectF = new RectF();
            f2618b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
