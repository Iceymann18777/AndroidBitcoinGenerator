package p000a.p045n;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.n.h0 */
/* loaded from: classes.dex */
class C0355h0 {
    /* renamed from: a */
    public void mo2865a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0361j.save_non_transition_alpha, null);
        }
    }

    /* renamed from: a */
    public void mo2864a(View view, float f) {
        Float f2 = (Float) view.getTag(C0361j.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public void mo2863a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    /* renamed from: a */
    public void mo2862a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo2862a(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: b */
    public float mo2861b(View view) {
        Float f = (Float) view.getTag(C0361j.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: b */
    public void mo2860b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo2860b(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: c */
    public void mo2859c(View view) {
        if (view.getTag(C0361j.save_non_transition_alpha) == null) {
            view.setTag(C0361j.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }
}
