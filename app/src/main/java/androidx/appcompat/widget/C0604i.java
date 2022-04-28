package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0698a;
import androidx.core.widget.C0714c;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
class C0604i {

    /* renamed from: a */
    private final CompoundButton f2169a;

    /* renamed from: b */
    private ColorStateList f2170b = null;

    /* renamed from: c */
    private PorterDuff.Mode f2171c = null;

    /* renamed from: d */
    private boolean f2172d = false;

    /* renamed from: e */
    private boolean f2173e = false;

    /* renamed from: f */
    private boolean f2174f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0604i(CompoundButton compoundButton) {
        this.f2169a = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m2020a(int i) {
        Drawable a;
        return (Build.VERSION.SDK_INT >= 17 || (a = C0714c.m1512a(this.f2169a)) == null) ? i : i + a.getIntrinsicWidth();
    }

    /* renamed from: a */
    void m2021a() {
        Drawable a = C0714c.m1512a(this.f2169a);
        if (a == null) {
            return;
        }
        if (this.f2172d || this.f2173e) {
            Drawable mutate = C0698a.m1591h(a).mutate();
            if (this.f2172d) {
                C0698a.m1603a(mutate, this.f2170b);
            }
            if (this.f2173e) {
                C0698a.m1600a(mutate, this.f2171c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2169a.getDrawableState());
            }
            this.f2169a.setButtonDrawable(mutate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2019a(ColorStateList colorStateList) {
        this.f2170b = colorStateList;
        this.f2172d = true;
        m2021a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2018a(PorterDuff.Mode mode) {
        this.f2171c = mode;
        this.f2173e = true;
        m2021a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2017a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2169a.getContext().obtainStyledAttributes(attributeSet, C0009j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0009j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0009j.CompoundButton_android_button, 0)) != 0) {
                this.f2169a.setButtonDrawable(C0010a.m4259c(this.f2169a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0009j.CompoundButton_buttonTint)) {
                C0714c.m1511a(this.f2169a, obtainStyledAttributes.getColorStateList(C0009j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0009j.CompoundButton_buttonTintMode)) {
                C0714c.m1510a(this.f2169a, C0580c0.m2107a(obtainStyledAttributes.getInt(C0009j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m2016b() {
        return this.f2170b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m2015c() {
        return this.f2171c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2014d() {
        if (this.f2174f) {
            this.f2174f = false;
            return;
        }
        this.f2174f = true;
        m2021a();
    }
}
