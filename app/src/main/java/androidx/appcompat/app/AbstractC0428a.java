package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p001a.C0009j;
import p000a.p001a.p006m.AbstractC0029b;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0428a {

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0429a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1393a;

        public C0429a(int i, int i2) {
            super(i, i2);
            this.f1393a = 0;
            this.f1393a = 8388627;
        }

        public C0429a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1393a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ActionBarLayout);
            this.f1393a = obtainStyledAttributes.getInt(C0009j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0429a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1393a = 0;
        }

        public C0429a(C0429a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f1393a = 0;
            this.f1393a = aVar.f1393a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC0430b {
        /* renamed from: a */
        void m2660a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0431c {
        /* renamed from: a */
        public abstract CharSequence m2659a();

        /* renamed from: b */
        public abstract View m2658b();

        /* renamed from: c */
        public abstract Drawable m2657c();

        /* renamed from: d */
        public abstract CharSequence m2656d();

        /* renamed from: e */
        public abstract void m2655e();
    }

    /* renamed from: a */
    public AbstractC0029b mo2500a(AbstractC0029b.AbstractC0030a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2499a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo2498a(Drawable drawable);

    /* renamed from: a */
    public abstract void mo2496a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo2501a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo2519a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo2494b(int i);

    /* renamed from: b */
    public abstract void mo2492b(boolean z);

    /* renamed from: c */
    public abstract void mo2491c(boolean z);

    /* renamed from: d */
    public abstract void mo2490d(boolean z);

    /* renamed from: e */
    public boolean mo2518e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo2488f();

    /* renamed from: g */
    public abstract int mo2486g();

    /* renamed from: h */
    public abstract Context mo2484h();

    /* renamed from: i */
    public boolean mo2517i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2516j() {
    }

    /* renamed from: k */
    public boolean mo2515k() {
        return false;
    }
}
