package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0593g0;
import p050b.p051a.p052a.p053a.C0876i;

/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes.dex */
public class C0959c extends C0593g0 {

    /* renamed from: q */
    private Drawable f3566q;

    /* renamed from: r */
    private final Rect f3567r;

    /* renamed from: s */
    private final Rect f3568s;

    /* renamed from: t */
    private int f3569t;

    /* renamed from: u */
    protected boolean f3570u;

    /* renamed from: v */
    boolean f3571v;

    public C0959c(Context context) {
        this(context, null);
    }

    public C0959c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0959c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3567r = new Rect();
        this.f3568s = new Rect();
        this.f3569t = 119;
        this.f3570u = true;
        this.f3571v = false;
        TypedArray c = C0981j.m73c(context, attributeSet, C0876i.ForegroundLinearLayout, i, 0, new int[0]);
        this.f3569t = c.getInt(C0876i.ForegroundLinearLayout_android_foregroundGravity, this.f3569t);
        Drawable drawable = c.getDrawable(C0876i.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3570u = c.getBoolean(C0876i.ForegroundLinearLayout_foregroundInsidePadding, true);
        c.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3566q;
        if (drawable != null) {
            if (this.f3571v) {
                this.f3571v = false;
                Rect rect = this.f3567r;
                Rect rect2 = this.f3568s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f3570u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f3569t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3566q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3566q;
        if (drawable != null && drawable.isStateful()) {
            this.f3566q.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f3566q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f3569t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3566q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3571v = z | this.f3571v;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3571v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3566q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f3566q);
            }
            this.f3566q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3569t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f3569t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3569t = i;
            if (this.f3569t == 119 && this.f3566q != null) {
                this.f3566q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3566q;
    }
}
