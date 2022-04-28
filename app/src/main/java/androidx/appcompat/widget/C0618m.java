package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.widget.AbstractC0723k;
import p000a.p001a.C0000a;
import p000a.p018g.p029l.AbstractC0215q;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public class C0618m extends ImageButton implements AbstractC0215q, AbstractC0723k {

    /* renamed from: b */
    private final C0585e f2207b;

    /* renamed from: c */
    private final C0624n f2208c;

    public C0618m(Context context) {
        this(context, null);
    }

    public C0618m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.imageButtonStyle);
    }

    public C0618m(Context context, AttributeSet attributeSet, int i) {
        super(C0632q0.m1914b(context), attributeSet, i);
        this.f2207b = new C0585e(this);
        this.f2207b.m2084a(attributeSet, i);
        this.f2208c = new C0624n(this);
        this.f2208c.m1950a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0585e eVar = this.f2207b;
        if (eVar != null) {
            eVar.m2089a();
        }
        C0624n nVar = this.f2208c;
        if (nVar != null) {
            nVar.m1955a();
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public ColorStateList getSupportBackgroundTintList() {
        C0585e eVar = this.f2207b;
        if (eVar != null) {
            return eVar.m2083b();
        }
        return null;
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0585e eVar = this.f2207b;
        if (eVar != null) {
            return eVar.m2080c();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0723k
    public ColorStateList getSupportImageTintList() {
        C0624n nVar = this.f2208c;
        if (nVar != null) {
            return nVar.m1949b();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0723k
    public PorterDuff.Mode getSupportImageTintMode() {
        C0624n nVar = this.f2208c;
        if (nVar != null) {
            return nVar.m1948c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f2208c.m1947d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0585e eVar = this.f2207b;
        if (eVar != null) {
            eVar.m2085a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0585e eVar = this.f2207b;
        if (eVar != null) {
            eVar.m2088a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0624n nVar = this.f2208c;
        if (nVar != null) {
            nVar.m1955a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0624n nVar = this.f2208c;
        if (nVar != null) {
            nVar.m1955a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f2208c.m1954a(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0624n nVar = this.f2208c;
        if (nVar != null) {
            nVar.m1955a();
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0585e eVar = this.f2207b;
        if (eVar != null) {
            eVar.m2082b(colorStateList);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0585e eVar = this.f2207b;
        if (eVar != null) {
            eVar.m2086a(mode);
        }
    }

    @Override // androidx.core.widget.AbstractC0723k
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0624n nVar = this.f2208c;
        if (nVar != null) {
            nVar.m1953a(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0723k
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0624n nVar = this.f2208c;
        if (nVar != null) {
            nVar.m1952a(mode);
        }
    }
}
