package p050b.p051a.p052a.p053a.p055k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.C0588f;
import androidx.core.graphics.drawable.C0698a;
import androidx.core.widget.C0720i;
import com.google.android.material.internal.C0981j;
import com.google.android.material.internal.C0982k;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p018g.p029l.C0216r;
import p050b.p051a.p052a.p053a.C0869b;
import p050b.p051a.p052a.p053a.C0875h;
import p050b.p051a.p052a.p053a.C0876i;
import p050b.p051a.p052a.p053a.p060o.C0906a;

/* renamed from: b.a.a.a.k.a */
/* loaded from: classes.dex */
public class C0887a extends C0588f {

    /* renamed from: d */
    private final C0889c f3302d;

    /* renamed from: e */
    private int f3303e;

    /* renamed from: f */
    private PorterDuff.Mode f3304f;

    /* renamed from: g */
    private ColorStateList f3305g;

    /* renamed from: h */
    private Drawable f3306h;

    /* renamed from: i */
    private int f3307i;

    /* renamed from: j */
    private int f3308j;

    /* renamed from: k */
    private int f3309k;

    public C0887a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0869b.materialButtonStyle);
    }

    public C0887a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray c = C0981j.m73c(context, attributeSet, C0876i.MaterialButton, i, C0875h.Widget_MaterialComponents_Button, new int[0]);
        this.f3303e = c.getDimensionPixelSize(C0876i.MaterialButton_iconPadding, 0);
        this.f3304f = C0982k.m71a(c.getInt(C0876i.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f3305g = C0906a.m401a(getContext(), c, C0876i.MaterialButton_iconTint);
        this.f3306h = C0906a.m400b(getContext(), c, C0876i.MaterialButton_icon);
        this.f3309k = c.getInteger(C0876i.MaterialButton_iconGravity, 1);
        this.f3307i = c.getDimensionPixelSize(C0876i.MaterialButton_iconSize, 0);
        this.f3302d = new C0889c(this);
        this.f3302d.m451a(c);
        c.recycle();
        setCompoundDrawablePadding(this.f3303e);
        m456c();
    }

    /* renamed from: a */
    private boolean m458a() {
        return C0216r.m3411j(this) == 1;
    }

    /* renamed from: b */
    private boolean m457b() {
        C0889c cVar = this.f3302d;
        return cVar != null && !cVar.m438g();
    }

    /* renamed from: c */
    private void m456c() {
        Drawable drawable = this.f3306h;
        if (drawable != null) {
            this.f3306h = drawable.mutate();
            C0698a.m1603a(this.f3306h, this.f3305g);
            PorterDuff.Mode mode = this.f3304f;
            if (mode != null) {
                C0698a.m1600a(this.f3306h, mode);
            }
            int i = this.f3307i;
            if (i == 0) {
                i = this.f3306h.getIntrinsicWidth();
            }
            int i2 = this.f3307i;
            if (i2 == 0) {
                i2 = this.f3306h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3306h;
            int i3 = this.f3308j;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        C0720i.m1492a(this, this.f3306h, null, null, null);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m457b()) {
            return this.f3302d.m455a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3306h;
    }

    public int getIconGravity() {
        return this.f3309k;
    }

    public int getIconPadding() {
        return this.f3303e;
    }

    public int getIconSize() {
        return this.f3307i;
    }

    public ColorStateList getIconTint() {
        return this.f3305g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3304f;
    }

    public ColorStateList getRippleColor() {
        if (m457b()) {
            return this.f3302d.m447b();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m457b()) {
            return this.f3302d.m444c();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m457b()) {
            return this.f3302d.m441d();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0588f, p000a.p018g.p029l.AbstractC0215q
    public ColorStateList getSupportBackgroundTintList() {
        return m457b() ? this.f3302d.m440e() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0588f, p000a.p018g.p029l.AbstractC0215q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m457b() ? this.f3302d.m439f() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && m457b()) {
            this.f3302d.m450a(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0588f, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0889c cVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f3302d) != null) {
            cVar.m453a(i4 - i2, i3 - i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3306h != null && this.f3309k == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i3 = this.f3307i;
            if (i3 == 0) {
                i3 = this.f3306h.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - C0216r.m3408m(this)) - i3) - this.f3303e) - C0216r.m3407n(this)) / 2;
            if (m458a()) {
                measuredWidth = -measuredWidth;
            }
            if (this.f3308j != measuredWidth) {
                this.f3308j = measuredWidth;
                m456c();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m457b()) {
            this.f3302d.m454a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.C0588f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m457b()) {
            if (drawable != getBackground()) {
                Log.i("MaterialButton", "Setting a custom background is not supported.");
                this.f3302d.m437h();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0588f, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0010a.m4259c(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i) {
        if (m457b()) {
            this.f3302d.m446b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m457b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3306h != drawable) {
            this.f3306h = drawable;
            m456c();
        }
    }

    public void setIconGravity(int i) {
        this.f3309k = i;
    }

    public void setIconPadding(int i) {
        if (this.f3303e != i) {
            this.f3303e = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0010a.m4259c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f3307i != i) {
            this.f3307i = i;
            m456c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3305g != colorStateList) {
            this.f3305g = colorStateList;
            m456c();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3304f != mode) {
            this.f3304f = mode;
            m456c();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0010a.m4260b(getContext(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m457b()) {
            this.f3302d.m452a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m457b()) {
            setRippleColor(C0010a.m4260b(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m457b()) {
            this.f3302d.m445b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m457b()) {
            setStrokeColor(C0010a.m4260b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m457b()) {
            this.f3302d.m443c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m457b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0588f, p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m457b()) {
            this.f3302d.m442c(colorStateList);
        } else if (this.f3302d != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0588f, p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m457b()) {
            this.f3302d.m449a(mode);
        } else if (this.f3302d != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}
