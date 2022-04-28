package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C0669d extends ViewGroup {

    /* renamed from: b */
    C0666c f2551b;

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes.dex */
    public static class C0670a extends ConstraintLayout.C0662a {

        /* renamed from: m0 */
        public float f2552m0;

        /* renamed from: n0 */
        public boolean f2553n0;

        /* renamed from: o0 */
        public float f2554o0;

        /* renamed from: p0 */
        public float f2555p0;

        /* renamed from: q0 */
        public float f2556q0;

        /* renamed from: r0 */
        public float f2557r0;

        /* renamed from: s0 */
        public float f2558s0;

        /* renamed from: t0 */
        public float f2559t0;

        /* renamed from: u0 */
        public float f2560u0;

        /* renamed from: v0 */
        public float f2561v0;

        /* renamed from: w0 */
        public float f2562w0;

        /* renamed from: x0 */
        public float f2563x0;

        /* renamed from: y0 */
        public float f2564y0;

        public C0670a(int i, int i2) {
            super(i, i2);
            this.f2552m0 = 1.0f;
            this.f2553n0 = false;
            this.f2554o0 = 0.0f;
            this.f2555p0 = 0.0f;
            this.f2556q0 = 0.0f;
            this.f2557r0 = 0.0f;
            this.f2558s0 = 1.0f;
            this.f2559t0 = 1.0f;
            this.f2560u0 = 0.0f;
            this.f2561v0 = 0.0f;
            this.f2562w0 = 0.0f;
            this.f2563x0 = 0.0f;
            this.f2564y0 = 0.0f;
        }

        public C0670a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            float f;
            this.f2552m0 = 1.0f;
            this.f2553n0 = false;
            this.f2554o0 = 0.0f;
            this.f2555p0 = 0.0f;
            this.f2556q0 = 0.0f;
            this.f2557r0 = 0.0f;
            this.f2558s0 = 1.0f;
            this.f2559t0 = 1.0f;
            this.f2560u0 = 0.0f;
            this.f2561v0 = 0.0f;
            this.f2562w0 = 0.0f;
            this.f2563x0 = 0.0f;
            this.f2564y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0674h.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0674h.ConstraintSet_android_alpha) {
                    this.f2552m0 = obtainStyledAttributes.getFloat(index, this.f2552m0);
                } else if (index == C0674h.ConstraintSet_android_elevation) {
                    this.f2554o0 = obtainStyledAttributes.getFloat(index, this.f2554o0);
                    this.f2553n0 = true;
                } else if (index == C0674h.ConstraintSet_android_rotationX) {
                    this.f2556q0 = obtainStyledAttributes.getFloat(index, this.f2556q0);
                } else if (index == C0674h.ConstraintSet_android_rotationY) {
                    this.f2557r0 = obtainStyledAttributes.getFloat(index, this.f2557r0);
                } else if (index == C0674h.ConstraintSet_android_rotation) {
                    this.f2555p0 = obtainStyledAttributes.getFloat(index, this.f2555p0);
                } else if (index == C0674h.ConstraintSet_android_scaleX) {
                    this.f2558s0 = obtainStyledAttributes.getFloat(index, this.f2558s0);
                } else if (index == C0674h.ConstraintSet_android_scaleY) {
                    this.f2559t0 = obtainStyledAttributes.getFloat(index, this.f2559t0);
                } else if (index == C0674h.ConstraintSet_android_transformPivotX) {
                    this.f2560u0 = obtainStyledAttributes.getFloat(index, this.f2560u0);
                } else if (index == C0674h.ConstraintSet_android_transformPivotY) {
                    this.f2561v0 = obtainStyledAttributes.getFloat(index, this.f2561v0);
                } else {
                    if (index == C0674h.ConstraintSet_android_translationX) {
                        f = this.f2562w0;
                    } else if (index == C0674h.ConstraintSet_android_translationY) {
                        this.f2563x0 = obtainStyledAttributes.getFloat(index, this.f2563x0);
                    } else if (index == C0674h.ConstraintSet_android_translationZ) {
                        f = this.f2564y0;
                    }
                    this.f2562w0 = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0670a generateDefaultLayoutParams() {
        return new C0670a(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0662a(layoutParams);
    }

    @Override // android.view.ViewGroup
    public C0670a generateLayoutParams(AttributeSet attributeSet) {
        return new C0670a(getContext(), attributeSet);
    }

    public C0666c getConstraintSet() {
        if (this.f2551b == null) {
            this.f2551b = new C0666c();
        }
        this.f2551b.m1735a(this);
        return this.f2551b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
