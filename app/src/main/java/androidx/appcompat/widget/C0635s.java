package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.AbstractC0722j;
import p000a.p001a.C0000a;
import p000a.p001a.p002k.p003a.C0010a;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
public class C0635s extends RadioButton implements AbstractC0722j {

    /* renamed from: b */
    private final C0604i f2276b;

    /* renamed from: c */
    private final C0655x f2277c;

    public C0635s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.radioButtonStyle);
    }

    public C0635s(Context context, AttributeSet attributeSet, int i) {
        super(C0632q0.m1914b(context), attributeSet, i);
        this.f2276b = new C0604i(this);
        this.f2276b.m2017a(attributeSet, i);
        this.f2277c = new C0655x(this);
        this.f2277c.m1814a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0604i iVar = this.f2276b;
        return iVar != null ? iVar.m2020a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0604i iVar = this.f2276b;
        if (iVar != null) {
            return iVar.m2016b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0604i iVar = this.f2276b;
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
        C0604i iVar = this.f2276b;
        if (iVar != null) {
            iVar.m2014d();
        }
    }

    @Override // androidx.core.widget.AbstractC0722j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0604i iVar = this.f2276b;
        if (iVar != null) {
            iVar.m2019a(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0722j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0604i iVar = this.f2276b;
        if (iVar != null) {
            iVar.m2018a(mode);
        }
    }
}
