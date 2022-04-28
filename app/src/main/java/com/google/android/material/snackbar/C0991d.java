package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.p030a0.C0188b;
import p050b.p051a.p052a.p053a.C0876i;

/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes.dex */
public class C0991d extends FrameLayout {

    /* renamed from: b */
    private final AccessibilityManager f3627b;

    /* renamed from: c */
    private final C0188b.AbstractC0189a f3628c;

    /* renamed from: d */
    private AbstractC0990c f3629d;

    /* renamed from: e */
    private AbstractC0989b f3630e;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* loaded from: classes.dex */
    class C0992a implements C0188b.AbstractC0189a {
        C0992a() {
        }

        @Override // p000a.p018g.p029l.p030a0.C0188b.AbstractC0189a
        public void onTouchExplorationStateChanged(boolean z) {
            C0991d.this.setClickableOrFocusableBasedOnAccessibility(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C0991d(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C0991d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876i.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(C0876i.SnackbarLayout_elevation)) {
            C0216r.m3444a(this, obtainStyledAttributes.getDimensionPixelSize(C0876i.SnackbarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        this.f3627b = (AccessibilityManager) context.getSystemService("accessibility");
        this.f3628c = new C0992a();
        C0188b.m3547a(this.f3627b, this.f3628c);
        setClickableOrFocusableBasedOnAccessibility(this.f3627b.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
        setClickable(!z);
        setFocusable(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0989b bVar = this.f3630e;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        C0216r.m3449B(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0989b bVar = this.f3630e;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        C0188b.m3546b(this.f3627b, this.f3628c);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AbstractC0990c cVar = this.f3629d;
        if (cVar != null) {
            cVar.m57a(this, i, i2, i3, i4);
        }
    }

    void setOnAttachStateChangeListener(AbstractC0989b bVar) {
        this.f3630e = bVar;
    }

    void setOnLayoutChangeListener(AbstractC0990c cVar) {
        this.f3629d = cVar;
    }
}
