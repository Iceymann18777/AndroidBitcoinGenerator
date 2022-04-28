package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000a.p018g.p029l.AbstractC0213o;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0230z;
import p050b.p051a.p052a.p053a.C0875h;
import p050b.p051a.p052a.p053a.C0876i;

/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes.dex */
public class C0976h extends FrameLayout {

    /* renamed from: b */
    Drawable f3598b;

    /* renamed from: c */
    Rect f3599c;

    /* renamed from: d */
    private Rect f3600d;

    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: classes.dex */
    class C0977a implements AbstractC0213o {
        C0977a() {
        }

        @Override // p000a.p018g.p029l.AbstractC0213o
        /* renamed from: a */
        public C0230z mo86a(View view, C0230z zVar) {
            C0976h hVar = C0976h.this;
            if (hVar.f3599c == null) {
                hVar.f3599c = new Rect();
            }
            C0976h.this.f3599c.set(zVar.m3357c(), zVar.m3355e(), zVar.m3356d(), zVar.m3358b());
            C0976h.this.mo68a(zVar);
            C0976h.this.setWillNotDraw(!zVar.m3354f() || C0976h.this.f3598b == null);
            C0216r.m3450A(C0976h.this);
            return zVar.m3362a();
        }
    }

    public C0976h(Context context) {
        this(context, null);
    }

    public C0976h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0976h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3600d = new Rect();
        TypedArray c = C0981j.m73c(context, attributeSet, C0876i.ScrimInsetsFrameLayout, i, C0875h.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f3598b = c.getDrawable(C0876i.ScrimInsetsFrameLayout_insetForeground);
        c.recycle();
        setWillNotDraw(true);
        C0216r.m3439a(this, new C0977a());
    }

    /* renamed from: a */
    protected void mo68a(C0230z zVar) {
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f3599c != null && this.f3598b != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            this.f3600d.set(0, 0, width, this.f3599c.top);
            this.f3598b.setBounds(this.f3600d);
            this.f3598b.draw(canvas);
            this.f3600d.set(0, height - this.f3599c.bottom, width, height);
            this.f3598b.setBounds(this.f3600d);
            this.f3598b.draw(canvas);
            Rect rect = this.f3600d;
            Rect rect2 = this.f3599c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f3598b.setBounds(this.f3600d);
            this.f3598b.draw(canvas);
            Rect rect3 = this.f3600d;
            Rect rect4 = this.f3599c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f3598b.setBounds(this.f3600d);
            this.f3598b.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f3598b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f3598b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
