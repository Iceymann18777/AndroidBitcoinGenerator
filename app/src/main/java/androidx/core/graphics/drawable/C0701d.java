package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes.dex */
class C0701d extends Drawable implements Drawable.Callback, AbstractC0700c, AbstractC0699b {

    /* renamed from: h */
    static final PorterDuff.Mode f2637h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private int f2638b;

    /* renamed from: c */
    private PorterDuff.Mode f2639c;

    /* renamed from: d */
    private boolean f2640d;

    /* renamed from: e */
    AbstractC0702a f2641e;

    /* renamed from: f */
    private boolean f2642f;

    /* renamed from: g */
    Drawable f2643g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.core.graphics.drawable.d$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0702a extends Drawable.ConstantState {

        /* renamed from: a */
        int f2644a;

        /* renamed from: b */
        Drawable.ConstantState f2645b;

        /* renamed from: c */
        ColorStateList f2646c;

        /* renamed from: d */
        PorterDuff.Mode f2647d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0702a(AbstractC0702a aVar, Resources resources) {
            this.f2646c = null;
            this.f2647d = C0701d.f2637h;
            if (aVar != null) {
                this.f2644a = aVar.f2644a;
                this.f2645b = aVar.f2645b;
                this.f2646c = aVar.f2646c;
                this.f2647d = aVar.f2647d;
            }
        }

        /* renamed from: a */
        boolean m1586a() {
            return this.f2645b != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = this.f2644a;
            Drawable.ConstantState constantState = this.f2645b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.graphics.drawable.d$b */
    /* loaded from: classes.dex */
    public static class C0703b extends AbstractC0702a {
        C0703b(AbstractC0702a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // androidx.core.graphics.drawable.C0701d.AbstractC0702a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0701d(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0701d(Drawable drawable) {
        this.f2641e = mo1584c();
        mo1588a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0701d(AbstractC0702a aVar, Resources resources) {
        this.f2641e = aVar;
        m1589a(resources);
    }

    /* renamed from: a */
    private void m1589a(Resources resources) {
        Drawable.ConstantState constantState;
        AbstractC0702a aVar = this.f2641e;
        if (aVar != null && (constantState = aVar.f2645b) != null) {
            mo1588a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: a */
    private boolean m1587a(int[] iArr) {
        if (!mo1585b()) {
            return false;
        }
        AbstractC0702a aVar = this.f2641e;
        ColorStateList colorStateList = aVar.f2646c;
        PorterDuff.Mode mode = aVar.f2647d;
        if (colorStateList == null || mode == null) {
            this.f2640d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2640d && colorForState == this.f2638b && mode == this.f2639c)) {
                setColorFilter(colorForState, mode);
                this.f2638b = colorForState;
                this.f2639c = mode;
                this.f2640d = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.AbstractC0700c
    /* renamed from: a */
    public final Drawable mo1590a() {
        return this.f2643g;
    }

    @Override // androidx.core.graphics.drawable.AbstractC0700c
    /* renamed from: a */
    public final void mo1588a(Drawable drawable) {
        Drawable drawable2 = this.f2643g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2643g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            AbstractC0702a aVar = this.f2641e;
            if (aVar != null) {
                aVar.f2645b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    protected boolean mo1585b() {
        return true;
    }

    /* renamed from: c */
    AbstractC0702a mo1584c() {
        return new C0703b(this.f2641e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2643g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractC0702a aVar = this.f2641e;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f2643g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        AbstractC0702a aVar = this.f2641e;
        if (aVar == null || !aVar.m1586a()) {
            return null;
        }
        this.f2641e.f2644a = getChangingConfigurations();
        return this.f2641e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2643g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2643g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2643g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2643g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2643g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2643g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2643g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2643g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2643g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2643g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        AbstractC0702a aVar;
        ColorStateList colorStateList = (!mo1585b() || (aVar = this.f2641e) == null) ? null : aVar.f2646c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2643g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2643g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2642f && super.mutate() == this) {
            this.f2641e = mo1584c();
            Drawable drawable = this.f2643g;
            if (drawable != null) {
                drawable.mutate();
            }
            AbstractC0702a aVar = this.f2641e;
            if (aVar != null) {
                Drawable drawable2 = this.f2643g;
                aVar.f2645b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2642f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2643g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f2643g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2643g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f2643g.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f2643g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2643g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2643g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2643g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m1587a(iArr) || this.f2643g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintList(ColorStateList colorStateList) {
        this.f2641e.f2646c = colorStateList;
        m1587a(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2641e.f2647d = mode;
        m1587a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2643g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
