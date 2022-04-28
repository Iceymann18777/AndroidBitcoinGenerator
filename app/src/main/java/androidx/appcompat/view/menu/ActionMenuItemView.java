package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0644v0;
import androidx.appcompat.widget.C0658y;
import p000a.p001a.C0009j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0658y implements AbstractC0515q.AbstractC0516a, View.OnClickListener, ActionMenuView.AbstractC0531a {

    /* renamed from: e */
    C0501k f1583e;

    /* renamed from: f */
    private CharSequence f1584f;

    /* renamed from: g */
    private Drawable f1585g;

    /* renamed from: h */
    C0496h.AbstractC0498b f1586h;

    /* renamed from: i */
    private AbstractView$OnTouchListenerC0589f0 f1587i;

    /* renamed from: j */
    AbstractC0482b f1588j;

    /* renamed from: k */
    private boolean f1589k;

    /* renamed from: l */
    private boolean f1590l;

    /* renamed from: m */
    private int f1591m;

    /* renamed from: n */
    private int f1592n;

    /* renamed from: o */
    private int f1593o;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0481a extends AbstractView$OnTouchListenerC0589f0 {
        public C0481a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
        /* renamed from: a */
        public AbstractC0519t mo1839a() {
            AbstractC0482b bVar = ActionMenuItemView.this.f1588j;
            if (bVar != null) {
                return bVar.mo2113a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
        /* renamed from: b */
        protected boolean mo1838b() {
            AbstractC0519t a;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0496h.AbstractC0498b bVar = actionMenuItemView.f1586h;
            return bVar != null && bVar.mo2265a(actionMenuItemView.f1583e) && (a = mo1839a()) != null && a.mo2036d();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0482b {
        /* renamed from: a */
        public abstract AbstractC0519t mo2113a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1589k = m2456e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ActionMenuItemView, i, 0);
        this.f1591m = obtainStyledAttributes.getDimensionPixelSize(C0009j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1593o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1592n = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m2456e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m2455f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1584f);
        if (this.f1585g != null && (!this.f1583e.m2346n() || (!this.f1589k && !this.f1590l))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f1584f : null);
        CharSequence contentDescription = this.f1583e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1583e.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1583e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f1583e.getTitle();
            }
            C0644v0.m1841a(this, charSequence);
            return;
        }
        C0644v0.m1841a(this, tooltipText);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public void mo148a(C0501k kVar, int i) {
        this.f1583e = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.m2366a(this));
        setId(kVar.getItemId());
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1587i == null) {
            this.f1587i = new C0481a();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    /* renamed from: a */
    public boolean mo149a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0531a
    /* renamed from: b */
    public boolean mo2112b() {
        return m2457d() && this.f1583e.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0531a
    /* renamed from: c */
    public boolean mo2111c() {
        return m2457d();
    }

    /* renamed from: d */
    public boolean m2457d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q.AbstractC0516a
    public C0501k getItemData() {
        return this.f1583e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0496h.AbstractC0498b bVar = this.f1586h;
        if (bVar != null) {
            bVar.mo2265a(this.f1583e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1589k = m2456e();
        m2455f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0658y, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean d = m2457d();
        if (d && (i3 = this.f1592n) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1591m) : this.f1591m;
        if (mode != 1073741824 && this.f1591m > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!d && this.f1585g != null) {
            super.setPadding((getMeasuredWidth() - this.f1585g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0589f0 f0Var;
        if (!this.f1583e.hasSubMenu() || (f0Var = this.f1587i) == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1590l != z) {
            this.f1590l = z;
            C0501k kVar = this.f1583e;
            if (kVar != null) {
                kVar.m2362b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1585g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1593o;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.f1593o;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2455f();
    }

    public void setItemInvoker(C0496h.AbstractC0498b bVar) {
        this.f1586h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1592n = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0482b bVar) {
        this.f1588j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1584f = charSequence;
        m2455f();
    }
}
