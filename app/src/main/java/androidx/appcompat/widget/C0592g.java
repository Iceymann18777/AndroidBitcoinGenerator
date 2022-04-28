package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.AbstractC0722j;
import p000a.p001a.C0000a;
import p000a.p001a.p002k.p003a.C0010a;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public class C0592g extends CheckBox implements AbstractC0722j {

    /* renamed from: b */
    private final C0604i f2108b;

    public C0592g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.checkboxStyle);
    }

    public C0592g(Context context, AttributeSet attributeSet, int i) {
        super(C0632q0.m1914b(context), attributeSet, i);
        this.f2108b = new C0604i(this);
        this.f2108b.m2017a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0604i iVar = this.f2108b;
        return iVar != null ? iVar.m2020a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0604i iVar = this.f2108b;
        if (iVar != null) {
            return iVar.m2016b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0604i iVar = this.f2108b;
        if (iVar != null) {
            return iVar.m2015c();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0010a.m4259c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0604i iVar = this.f2108b;
        if (iVar != null) {
            iVar.m2014d();
        }
    }

    @Override // androidx.core.widget.AbstractC0722j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0604i iVar = this.f2108b;
        if (iVar != null) {
            iVar.m2019a(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0722j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0604i iVar = this.f2108b;
        if (iVar != null) {
            iVar.m2018a(mode);
        }
    }
}
