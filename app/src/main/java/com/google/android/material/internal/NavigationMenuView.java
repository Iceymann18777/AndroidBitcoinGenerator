package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.AbstractC0515q;
import androidx.appcompat.view.menu.C0496h;
import androidx.recyclerview.widget.C0813j;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public class NavigationMenuView extends C0813j implements AbstractC0515q {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override // androidx.appcompat.view.menu.AbstractC0515q
    /* renamed from: a */
    public void mo142a(C0496h hVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
