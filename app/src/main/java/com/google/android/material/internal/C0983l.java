package com.google.android.material.internal;

import android.widget.ImageButton;

/* renamed from: com.google.android.material.internal.l */
/* loaded from: classes.dex */
public class C0983l extends ImageButton {

    /* renamed from: b */
    private int f3611b;

    /* renamed from: a */
    public final void m70a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f3611b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f3611b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m70a(i, true);
    }
}
