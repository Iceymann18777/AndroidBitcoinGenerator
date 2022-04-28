package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0618m;
import p000a.p001a.C0000a;
import p000a.p018g.p029l.C0185a;
import p000a.p018g.p029l.C0216r;
import p000a.p018g.p029l.p030a0.C0191c;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0618m implements Checkable {

    /* renamed from: e */
    private static final int[] f3549e = {16842912};

    /* renamed from: d */
    private boolean f3550d;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes.dex */
    class C0955a extends C0185a {
        C0955a() {
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: a */
        public void mo143a(View view, C0191c cVar) {
            super.mo143a(view, cVar);
            cVar.m3529b(true);
            cVar.m3524c(CheckableImageButton.this.isChecked());
        }

        @Override // p000a.p018g.p029l.C0185a
        /* renamed from: b */
        public void mo150b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo150b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0216r.m3440a(this, new C0955a());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f3550d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        return this.f3550d ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f3549e.length), f3549e) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f3550d != z) {
            this.f3550d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f3550d);
    }
}
