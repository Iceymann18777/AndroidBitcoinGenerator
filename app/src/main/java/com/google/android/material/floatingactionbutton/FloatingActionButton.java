package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0606j;
import androidx.appcompat.widget.C0624n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0698a;
import androidx.core.widget.AbstractC0723k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C0958b;
import com.google.android.material.internal.C0983l;
import java.util.List;
import p000a.p013d.C0080g;
import p000a.p018g.p029l.AbstractC0215q;
import p000a.p018g.p029l.C0216r;
import p050b.p051a.p052a.p053a.C0870c;
import p050b.p051a.p052a.p053a.C0876i;
import p050b.p051a.p052a.p053a.p054j.C0884h;
import p050b.p051a.p052a.p053a.p058m.AbstractC0902a;
import p050b.p051a.p052a.p053a.p058m.C0904c;
import p050b.p051a.p052a.p053a.p062q.AbstractC0909b;
import p050b.p051a.p052a.p053a.p064s.C0912a;

@CoordinatorLayout.AbstractC0678d(Behavior.class)
/* loaded from: classes.dex */
public class FloatingActionButton extends C0983l implements AbstractC0215q, AbstractC0723k, AbstractC0902a {

    /* renamed from: c */
    private ColorStateList f3477c;

    /* renamed from: d */
    private PorterDuff.Mode f3478d;

    /* renamed from: e */
    private ColorStateList f3479e;

    /* renamed from: f */
    private PorterDuff.Mode f3480f;

    /* renamed from: g */
    private ColorStateList f3481g;

    /* renamed from: h */
    private int f3482h;

    /* renamed from: i */
    private int f3483i;

    /* renamed from: j */
    private int f3484j;

    /* renamed from: k */
    private int f3485k;

    /* renamed from: l */
    boolean f3486l;

    /* renamed from: m */
    final Rect f3487m;

    /* renamed from: n */
    private final Rect f3488n;

    /* renamed from: o */
    private final C0624n f3489o;

    /* renamed from: p */
    private final C0904c f3490p;

    /* renamed from: q */
    private C0944a f3491q;

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0677c<T> {

        /* renamed from: a */
        private Rect f3492a;

        /* renamed from: b */
        private AbstractC0942b f3493b;

        /* renamed from: c */
        private boolean f3494c;

        public BaseBehavior() {
            this.f3494c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876i.FloatingActionButton_Behavior_Layout);
            this.f3494c = obtainStyledAttributes.getBoolean(C0876i.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m207a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f3487m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0680f fVar = (CoordinatorLayout.C0680f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C0216r.m3420d(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C0216r.m3422c(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: a */
        private static boolean m211a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0680f) {
                return ((CoordinatorLayout.C0680f) layoutParams).m1659d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m210a(View view, FloatingActionButton floatingActionButton) {
            return this.f3494c && ((CoordinatorLayout.C0680f) floatingActionButton.getLayoutParams()).m1660c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: a */
        private boolean m208a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m210a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f3492a == null) {
                this.f3492a = new Rect();
            }
            Rect rect = this.f3492a;
            C0958b.m139a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m223a(this.f3493b, false);
                return true;
            }
            floatingActionButton.m217b(this.f3493b, false);
            return true;
        }

        /* renamed from: b */
        private boolean m203b(View view, FloatingActionButton floatingActionButton) {
            if (!m210a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0680f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m223a(this.f3493b, false);
                return true;
            }
            floatingActionButton.m217b(this.f3493b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0677c
        /* renamed from: a */
        public void mo31a(CoordinatorLayout.C0680f fVar) {
            if (fVar.f2601h == 0) {
                fVar.f2601h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo46a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> b = coordinatorLayout.m1704b(floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m211a(view) && m203b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m208a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m1697c(floatingActionButton, i);
            m207a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo209a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f3487m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo43b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m208a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m211a(view)) {
                return false;
            } else {
                m203b(view, floatingActionButton);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes.dex */
    public class C0941a implements C0944a.AbstractC0951g {

        /* renamed from: a */
        final /* synthetic */ AbstractC0942b f3495a;

        C0941a(AbstractC0942b bVar) {
            this.f3495a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g
        /* renamed from: a */
        public void mo162a() {
            this.f3495a.m201b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C0944a.AbstractC0951g
        /* renamed from: b */
        public void mo161b() {
            this.f3495a.m202a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0942b {
        /* renamed from: a */
        public abstract void m202a(FloatingActionButton floatingActionButton);

        /* renamed from: b */
        public abstract void m201b(FloatingActionButton floatingActionButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes.dex */
    public class C0943c implements AbstractC0909b {
        C0943c() {
        }

        @Override // p050b.p051a.p052a.p053a.p062q.AbstractC0909b
        /* renamed from: a */
        public void mo199a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f3487m.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f3484j, i2 + FloatingActionButton.this.f3484j, i3 + FloatingActionButton.this.f3484j, i4 + FloatingActionButton.this.f3484j);
        }

        @Override // p050b.p051a.p052a.p053a.p062q.AbstractC0909b
        /* renamed from: a */
        public void mo198a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        @Override // p050b.p051a.p052a.p053a.p062q.AbstractC0909b
        /* renamed from: a */
        public boolean mo200a() {
            return FloatingActionButton.this.f3486l;
        }

        @Override // p050b.p051a.p052a.p053a.p062q.AbstractC0909b
        /* renamed from: b */
        public float mo197b() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }
    }

    /* renamed from: a */
    private int m228a(int i) {
        int i2 = this.f3483i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m228a(1) : m228a(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? C0870c.design_fab_size_normal : C0870c.design_fab_size_mini);
    }

    /* renamed from: a */
    private static int m227a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private C0944a.AbstractC0951g m224a(AbstractC0942b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C0941a(bVar);
    }

    /* renamed from: c */
    private C0944a m216c() {
        return Build.VERSION.SDK_INT >= 21 ? new C0954b(this, new C0943c()) : new C0944a(this, new C0943c());
    }

    /* renamed from: c */
    private void m214c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f3487m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: d */
    private void m213d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f3479e;
            if (colorStateList == null) {
                C0698a.m1598b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f3480f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0606j.m2011a(colorForState, mode));
        }
    }

    private C0944a getImpl() {
        if (this.f3491q == null) {
            this.f3491q = m216c();
        }
        return this.f3491q;
    }

    /* renamed from: a */
    public void m226a(Animator.AnimatorListener animatorListener) {
        getImpl().m193a(animatorListener);
    }

    /* renamed from: a */
    void m223a(AbstractC0942b bVar, boolean z) {
        getImpl().m188a(m224a(bVar), z);
    }

    @Override // p050b.p051a.p052a.p053a.p058m.AbstractC0903b
    /* renamed from: a */
    public boolean mo229a() {
        this.f3490p.m407b();
        throw null;
    }

    @Deprecated
    /* renamed from: a */
    public boolean m225a(Rect rect) {
        if (!C0216r.m3397x(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m214c(rect);
        return true;
    }

    /* renamed from: b */
    public void m219b(Animator.AnimatorListener animatorListener) {
        getImpl().m185b(animatorListener);
    }

    /* renamed from: b */
    public void m218b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m214c(rect);
    }

    /* renamed from: b */
    void m217b(AbstractC0942b bVar, boolean z) {
        getImpl().m183b(m224a(bVar), z);
    }

    /* renamed from: b */
    public boolean m220b() {
        return getImpl().m173h();
    }

    /* renamed from: c */
    public void m215c(Animator.AnimatorListener animatorListener) {
        getImpl().m180c(animatorListener);
    }

    /* renamed from: d */
    public void m212d(Animator.AnimatorListener animatorListener) {
        getImpl().m177d(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo157a(getDrawableState());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f3477c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3478d;
    }

    public float getCompatElevation() {
        return getImpl().mo156b();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m179d();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m176e();
    }

    public Drawable getContentBackground() {
        return getImpl().m196a();
    }

    public int getCustomSize() {
        return this.f3483i;
    }

    public int getExpandedComponentIdHint() {
        this.f3490p.m410a();
        throw null;
    }

    public C0884h getHideMotionSpec() {
        return getImpl().m182c();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3481g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3481g;
    }

    public C0884h getShowMotionSpec() {
        return getImpl().m175f();
    }

    public int getSize() {
        return this.f3482h;
    }

    int getSizeDimension() {
        return m228a(this.f3482h);
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.AbstractC0723k
    public ColorStateList getSupportImageTintList() {
        return this.f3479e;
    }

    @Override // androidx.core.widget.AbstractC0723k
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3480f;
    }

    public boolean getUseCompatPadding() {
        return this.f3486l;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo153i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m172j();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m171l();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f3484j = (sizeDimension - this.f3485k) / 2;
        getImpl().m168p();
        int min = Math.min(m227a(sizeDimension, i), m227a(sizeDimension, i2));
        Rect rect = this.f3487m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0912a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0912a aVar = (C0912a) parcelable;
        super.onRestoreInstanceState(aVar.m3347a());
        this.f3490p.m408a(aVar.f3355d.get("expandableWidgetHelper"));
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0080g<String, Bundle> gVar = new C0912a(super.onSaveInstanceState()).f3355d;
        this.f3490p.m406c();
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !m225a(this.f3488n) || this.f3488n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3477c != colorStateList) {
            this.f3477c = colorStateList;
            getImpl().m192a(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3478d != mode) {
            this.f3478d = mode;
            getImpl().m191a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m195a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m186b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m178d(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f3483i = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i) {
        this.f3490p.m409a(i);
        throw null;
    }

    public void setHideMotionSpec(C0884h hVar) {
        getImpl().m190a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0884h.m472a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().m169o();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f3489o.m1954a(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3481g != colorStateList) {
            this.f3481g = colorStateList;
            getImpl().mo155b(this.f3481g);
        }
    }

    public void setShowMotionSpec(C0884h hVar) {
        getImpl().m184b(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0884h.m472a(getContext(), i));
    }

    public void setSize(int i) {
        this.f3483i = 0;
        if (i != this.f3482h) {
            this.f3482h = i;
            requestLayout();
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.AbstractC0723k
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3479e != colorStateList) {
            this.f3479e = colorStateList;
            m213d();
        }
    }

    @Override // androidx.core.widget.AbstractC0723k
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3480f != mode) {
            this.f3480f = mode;
            m213d();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3486l != z) {
            this.f3486l = z;
            getImpl().mo152k();
        }
    }
}
