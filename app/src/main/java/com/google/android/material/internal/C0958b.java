package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes.dex */
public class C0958b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f3564a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f3565b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m139a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m137b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m138a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m138a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    public static void m137b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f3564a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f3564a.set(matrix);
        } else {
            matrix.reset();
        }
        m138a(viewGroup, view, matrix);
        RectF rectF = f3565b.get();
        if (rectF == null) {
            rectF = new RectF();
            f3565b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
