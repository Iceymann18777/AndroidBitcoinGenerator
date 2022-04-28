package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000a.p001a.C0009j;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b */
    private int f2023b;

    /* renamed from: c */
    private int f2024c;

    /* renamed from: d */
    private WeakReference<View> f2025d;

    /* renamed from: e */
    private LayoutInflater f2026e;

    /* renamed from: f */
    private AbstractC0563a f2027f;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface AbstractC0563a {
        /* renamed from: a */
        void m2155a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2023b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ViewStubCompat, i, 0);
        this.f2024c = obtainStyledAttributes.getResourceId(C0009j.ViewStubCompat_android_inflatedId, -1);
        this.f2023b = obtainStyledAttributes.getResourceId(C0009j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0009j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m2156a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f2023b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f2026e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2023b, viewGroup, false);
            int i = this.f2024c;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2025d = new WeakReference<>(inflate);
            AbstractC0563a aVar = this.f2027f;
            if (aVar != null) {
                aVar.m2155a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2024c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2026e;
    }

    public int getLayoutResource() {
        return this.f2023b;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2024c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2026e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2023b = i;
    }

    public void setOnInflateListener(AbstractC0563a aVar) {
        this.f2027f = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f2025d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m2156a();
        }
    }
}
