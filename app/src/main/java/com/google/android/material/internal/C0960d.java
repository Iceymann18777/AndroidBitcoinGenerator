package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.view.menu.C0501k;

/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes.dex */
public class C0960d extends C0496h {
    public C0960d(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0496h, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0501k kVar = (C0501k) m2418a(i, i2, i3, charSequence);
        C0973f fVar = new C0973f(m2388e(), this, kVar);
        kVar.m2365a(fVar);
        return fVar;
    }
}
