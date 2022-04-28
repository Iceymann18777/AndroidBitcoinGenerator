package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p001a.C0000a;
import p000a.p001a.C0009j;
import p000a.p018g.p029l.AbstractC0227w;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.C0223v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0564a extends ViewGroup {

    /* renamed from: b */
    protected final C0565a f2028b;

    /* renamed from: c */
    protected final Context f2029c;

    /* renamed from: d */
    protected ActionMenuView f2030d;

    /* renamed from: e */
    protected C0570c f2031e;

    /* renamed from: f */
    protected int f2032f;

    /* renamed from: g */
    protected C0223v f2033g;

    /* renamed from: h */
    private boolean f2034h;

    /* renamed from: i */
    private boolean f2035i;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    protected class C0565a implements AbstractC0227w {

        /* renamed from: a */
        private boolean f2036a = false;

        /* renamed from: b */
        int f2037b;

        protected C0565a() {
        }

        /* renamed from: a */
        public C0565a m2148a(C0223v vVar, int i) {
            AbstractC0564a.this.f2033g = vVar;
            this.f2037b = i;
            return this;
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: a */
        public void mo1850a(View view) {
            if (!this.f2036a) {
                AbstractC0564a aVar = AbstractC0564a.this;
                aVar.f2033g = null;
                AbstractC0564a.super.setVisibility(this.f2037b);
            }
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: b */
        public void mo1849b(View view) {
            AbstractC0564a.super.setVisibility(0);
            this.f2036a = false;
        }

        @Override // p000a.p018g.p029l.AbstractC0227w
        /* renamed from: c */
        public void mo1848c(View view) {
            this.f2036a = true;
        }
    }

    AbstractC0564a(Context context) {
        this(context, null);
    }

    AbstractC0564a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0564a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f2028b = new C0565a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0000a.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.f2029c = context;
        } else {
            this.f2029c = new ContextThemeWrapper(context, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m2154a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m2152a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m2151a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0223v m2153a(int i, long j) {
        C0223v vVar = this.f2033g;
        if (vVar != null) {
            vVar.m3373a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0223v a = C0216r.m3445a(this);
            a.m3372a(1.0f);
            a.m3371a(j);
            C0565a aVar = this.f2028b;
            aVar.m2148a(a, i);
            a.m3370a(aVar);
            return a;
        }
        C0223v a2 = C0216r.m3445a(this);
        a2.m3372a(0.0f);
        a2.m3371a(j);
        C0565a aVar2 = this.f2028b;
        aVar2.m2148a(a2, i);
        a2.m3370a(aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f2033g != null ? this.f2028b.f2037b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2032f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0009j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0570c cVar = this.f2031e;
        if (cVar != null) {
            cVar.m2136a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2035i = false;
        }
        if (!this.f2035i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2035i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2035i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2034h = false;
        }
        if (!this.f2034h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2034h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2034h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0223v vVar = this.f2033g;
            if (vVar != null) {
                vVar.m3373a();
            }
            super.setVisibility(i);
        }
    }
}
