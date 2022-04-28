package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.AbstractC0515q;
import androidx.appcompat.view.menu.C0501k;
import androidx.appcompat.widget.C0593g0;
import androidx.appcompat.widget.C0644v0;
import androidx.core.graphics.drawable.C0698a;
import androidx.core.widget.C0720i;
import p000a.p001a.C0000a;
import p000a.p018g.p019d.p020c.C0136f;
import p000a.p018g.p029l.C0185a;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.p030a0.C0191c;
import p050b.p051a.p052a.p053a.C0870c;
import p050b.p051a.p052a.p053a.C0871d;
import p050b.p051a.p052a.p053a.C0872e;
import p050b.p051a.p052a.p053a.C0874g;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends C0959c implements AbstractC0515q.AbstractC0516a {

    /* renamed from: G */
    private static final int[] f3552G = {16842912};

    /* renamed from: A */
    private FrameLayout f3553A;

    /* renamed from: B */
    private C0501k f3554B;

    /* renamed from: C */
    private ColorStateList f3555C;

    /* renamed from: D */
    private boolean f3556D;

    /* renamed from: E */
    private Drawable f3557E;

    /* renamed from: F */
    private final C0185a f3558F;

    /* renamed from: w */
    private final int f3559w;

    /* renamed from: x */
    private boolean f3560x;

    /* renamed from: y */
    boolean f3561y;

    /* renamed from: z */
    private final CheckedTextView f3562z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes.dex */
    class C0956a extends C0185a {
        C0956a() {
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(View view, C0191c cVar) {
            super.mo143a(view, cVar);
            cVar.m3529b(NavigationMenuItemView.this.f3561y);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3558F = new C0956a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0874g.design_navigation_menu_item, (ViewGroup) this, true);
        this.f3559w = context.getResources().getDimensionPixelSize(C0870c.design_navigation_icon_size);
        this.f3562z = (CheckedTextView) findViewById(C0872e.design_menu_item_text);
        this.f3562z.setDuplicateParentStateEnabled(true);
        C0216r.m3440a(this.f3562z, this.f3558F);
    }

    /* renamed from: e */
    private void m146e() {
        int i;
        C0593g0.C0594a aVar;
        if (m144g()) {
            this.f3562z.setVisibility(8);
            FrameLayout frameLayout = this.f3553A;
            if (frameLayout != null) {
                aVar = (C0593g0.C0594a) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f3562z.setVisibility(0);
            FrameLayout frameLayout2 = this.f3553A;
            if (frameLayout2 != null) {
                aVar = (C0593g0.C0594a) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        ((ViewGroup.MarginLayoutParams) aVar).width = i;
        this.f3553A.setLayoutParams(aVar);
    }

    /* renamed from: f */
    private StateListDrawable m145f() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0000a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f3552G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: g */
    private boolean m144g() {
        return this.f3554B.getTitle() == null && this.f3554B.getIcon() == null && this.f3554B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3553A == null) {
                this.f3553A = (FrameLayout) ((ViewStub) findViewById(C0872e.design_menu_item_action_area_stub)).inflate();
            }
            this.f3553A.removeAllViews();
            this.f3553A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public void mo148a(C0501k kVar, int i) {
        this.f3554B = kVar;
        setVisibility(kVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0216r.m3434a(this, m145f());
        }
        setCheckable(kVar.isCheckable());
        setChecked(kVar.isChecked());
        setEnabled(kVar.isEnabled());
        setTitle(kVar.getTitle());
        setIcon(kVar.getIcon());
        setActionView(kVar.getActionView());
        setContentDescription(kVar.getContentDescription());
        C0644v0.m1841a(this, kVar.getTooltipText());
        m146e();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public boolean mo149a() {
        return false;
    }

    /* renamed from: d */
    public void m147d() {
        FrameLayout frameLayout = this.f3553A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f3562z.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    public C0501k getItemData() {
        return this.f3554B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0501k kVar = this.f3554B;
        if (kVar != null && kVar.isCheckable() && this.f3554B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f3552G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f3561y != z) {
            this.f3561y = z;
            this.f3558F.m3552a(this.f3562z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f3562z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f3556D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0698a.m1591h(drawable).mutate();
                C0698a.m1603a(drawable, this.f3555C);
            }
            int i = this.f3559w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f3560x) {
            if (this.f3557E == null) {
                this.f3557E = C0136f.m3684a(getResources(), C0871d.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f3557E;
                if (drawable2 != null) {
                    int i2 = this.f3559w;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f3557E;
        }
        C0720i.m1492a(this.f3562z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f3562z.setCompoundDrawablePadding(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f3555C = colorStateList;
        this.f3556D = this.f3555C != null;
        C0501k kVar = this.f3554B;
        if (kVar != null) {
            setIcon(kVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f3560x = z;
    }

    public void setTextAppearance(int i) {
        C0720i.m1485d(this.f3562z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3562z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3562z.setText(charSequence);
    }
}
