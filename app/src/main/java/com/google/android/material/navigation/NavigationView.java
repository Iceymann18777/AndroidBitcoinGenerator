package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.view.menu.C0501k;
import androidx.appcompat.widget.C0638t0;
import com.google.android.material.internal.C0960d;
import com.google.android.material.internal.C0961e;
import com.google.android.material.internal.C0976h;
import com.google.android.material.internal.C0981j;
import p000a.p001a.C0000a;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p001a.p006m.C0036g;
import p000a.p018g.p019d.C0124a;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0230z;
import p000a.p033i.p034a.AbstractC0237a;
import p050b.p051a.p052a.p053a.C0869b;
import p050b.p051a.p052a.p053a.C0875h;
import p050b.p051a.p052a.p053a.C0876i;

/* loaded from: classes.dex */
public class NavigationView extends C0976h {

    /* renamed from: j */
    private static final int[] f3612j = {16842912};

    /* renamed from: k */
    private static final int[] f3613k = {-16842910};

    /* renamed from: e */
    private final C0960d f3614e;

    /* renamed from: f */
    private final C0961e f3615f;

    /* renamed from: g */
    AbstractC0985b f3616g;

    /* renamed from: h */
    private final int f3617h;

    /* renamed from: i */
    private MenuInflater f3618i;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    /* loaded from: classes.dex */
    class C0984a implements C0496h.AbstractC0497a {
        C0984a() {
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public void mo65a(C0496h hVar) {
        }

        @Override // androidx.appcompat.view.menu.C0496h.AbstractC0497a
        /* renamed from: a */
        public boolean mo64a(C0496h hVar, MenuItem menuItem) {
            AbstractC0985b bVar = NavigationView.this.f3616g;
            return bVar != null && bVar.mo14a(menuItem);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    /* loaded from: classes.dex */
    public interface AbstractC0985b {
        /* renamed from: a */
        boolean mo14a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    /* loaded from: classes.dex */
    public static class C0986c extends AbstractC0237a {
        public static final Parcelable.Creator<C0986c> CREATOR = new C0987a();

        /* renamed from: d */
        public Bundle f3620d;

        /* renamed from: com.google.android.material.navigation.NavigationView$c$a */
        /* loaded from: classes.dex */
        static class C0987a implements Parcelable.ClassLoaderCreator<C0986c> {
            C0987a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0986c createFromParcel(Parcel parcel) {
                return new C0986c(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0986c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0986c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public C0986c[] newArray(int i) {
                return new C0986c[i];
            }
        }

        public C0986c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3620d = parcel.readBundle(classLoader);
        }

        public C0986c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f3620d);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0869b.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        this.f3615f = new C0961e();
        this.f3614e = new C0960d(context);
        C0638t0 d = C0981j.m72d(context, attributeSet, C0876i.NavigationView, i, C0875h.Widget_Design_NavigationView, new int[0]);
        C0216r.m3434a(this, d.m1899b(C0876i.NavigationView_android_background));
        if (d.m1889g(C0876i.NavigationView_elevation)) {
            C0216r.m3444a(this, d.m1896c(C0876i.NavigationView_elevation, 0));
        }
        C0216r.m3429a(this, d.m1903a(C0876i.NavigationView_android_fitsSystemWindows, false));
        this.f3617h = d.m1896c(C0876i.NavigationView_android_maxWidth, 0);
        ColorStateList a = d.m1889g(C0876i.NavigationView_itemIconTint) ? d.m1907a(C0876i.NavigationView_itemIconTint) : m66c(16842808);
        if (d.m1889g(C0876i.NavigationView_itemTextAppearance)) {
            i2 = d.m1888g(C0876i.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList a2 = d.m1889g(C0876i.NavigationView_itemTextColor) ? d.m1907a(C0876i.NavigationView_itemTextColor) : null;
        if (!z && a2 == null) {
            a2 = m66c(16842806);
        }
        Drawable b = d.m1899b(C0876i.NavigationView_itemBackground);
        if (d.m1889g(C0876i.NavigationView_itemHorizontalPadding)) {
            this.f3615f.m116c(d.m1896c(C0876i.NavigationView_itemHorizontalPadding, 0));
        }
        int c = d.m1896c(C0876i.NavigationView_itemIconPadding, 0);
        this.f3614e.mo2302a(new C0984a());
        this.f3615f.m121b(1);
        this.f3615f.mo133a(context, this.f3614e);
        this.f3615f.m132a(a);
        if (z) {
            this.f3615f.m112e(i2);
        }
        this.f3615f.m120b(a2);
        this.f3615f.m131a(b);
        this.f3615f.m114d(c);
        this.f3614e.m2408a(this.f3615f);
        addView((View) this.f3615f.m128a((ViewGroup) this));
        if (d.m1889g(C0876i.NavigationView_menu)) {
            m67b(d.m1888g(C0876i.NavigationView_menu, 0));
        }
        if (d.m1889g(C0876i.NavigationView_headerLayout)) {
            m69a(d.m1888g(C0876i.NavigationView_headerLayout, 0));
        }
        d.m1908a();
    }

    /* renamed from: c */
    private ColorStateList m66c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList b = C0010a.m4260b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0000a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = b.getDefaultColor();
        return new ColorStateList(new int[][]{f3613k, f3612j, FrameLayout.EMPTY_STATE_SET}, new int[]{b.getColorForState(f3613k, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f3618i == null) {
            this.f3618i = new C0036g(getContext());
        }
        return this.f3618i;
    }

    /* renamed from: a */
    public View m69a(int i) {
        return this.f3615f.m135a(i);
    }

    @Override // com.google.android.material.internal.C0976h
    /* renamed from: a */
    protected void mo68a(C0230z zVar) {
        this.f3615f.m134a(zVar);
    }

    /* renamed from: b */
    public void m67b(int i) {
        this.f3615f.m118b(true);
        getMenuInflater().inflate(i, this.f3614e);
        this.f3615f.m118b(false);
        this.f3615f.mo123a(false);
    }

    public MenuItem getCheckedItem() {
        return this.f3615f.m115d();
    }

    public int getHeaderCount() {
        return this.f3615f.m113e();
    }

    public Drawable getItemBackground() {
        return this.f3615f.m111f();
    }

    public int getItemHorizontalPadding() {
        return this.f3615f.m110g();
    }

    public int getItemIconPadding() {
        return this.f3615f.m109h();
    }

    public ColorStateList getItemIconTintList() {
        return this.f3615f.m107j();
    }

    public ColorStateList getItemTextColor() {
        return this.f3615f.m108i();
    }

    public Menu getMenu() {
        return this.f3614e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.f3617h;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.f3617h);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0986c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0986c cVar = (C0986c) parcelable;
        super.onRestoreInstanceState(cVar.m3347a());
        this.f3614e.m2399b(cVar.f3620d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0986c cVar = new C0986c(super.onSaveInstanceState());
        cVar.f3620d = new Bundle();
        this.f3614e.m2391d(cVar.f3620d);
        return cVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f3614e.findItem(i);
        if (findItem != null) {
            this.f3615f.m125a((C0501k) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f3614e.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f3615f.m125a((C0501k) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setItemBackground(Drawable drawable) {
        this.f3615f.m131a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0124a.m3732b(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f3615f.m116c(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f3615f.m116c(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f3615f.m114d(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f3615f.m114d(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f3615f.m132a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f3615f.m112e(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f3615f.m120b(colorStateList);
    }

    public void setNavigationItemSelectedListener(AbstractC0985b bVar) {
        this.f3616g = bVar;
    }
}
