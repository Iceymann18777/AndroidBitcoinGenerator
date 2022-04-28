package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes.dex */
public class C0704e extends C0701d {

    /* renamed from: i */
    private static Method f2648i;

    /* renamed from: androidx.core.graphics.drawable.e$a */
    /* loaded from: classes.dex */
    private static class C0705a extends C0701d.AbstractC0702a {
        C0705a(C0701d.AbstractC0702a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // androidx.core.graphics.drawable.C0701d.AbstractC0702a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0704e(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0704e(Drawable drawable) {
        super(drawable);
        m1583d();
    }

    C0704e(C0701d.AbstractC0702a aVar, Resources resources) {
        super(aVar, resources);
        m1583d();
    }

    /* renamed from: d */
    private void m1583d() {
        if (f2648i == null) {
            try {
                f2648i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.C0701d
    /* renamed from: b */
    protected boolean mo1585b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2643g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // androidx.core.graphics.drawable.C0701d
    /* renamed from: c */
    C0701d.AbstractC0702a mo1584c() {
        return new C0705a(this.f2641e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2643g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2643g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f2643g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2643g.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.core.graphics.drawable.C0701d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0701d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTint(int i) {
        if (mo1585b()) {
            super.setTint(i);
        } else {
            this.f2643g.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C0701d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintList(ColorStateList colorStateList) {
        if (mo1585b()) {
            super.setTintList(colorStateList);
        } else {
            this.f2643g.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0701d, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1585b()) {
            super.setTintMode(mode);
        } else {
            this.f2643g.setTintMode(mode);
        }
    }
}
