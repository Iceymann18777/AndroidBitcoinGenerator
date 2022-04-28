package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.C0588f;
import p050b.p051a.p052a.p053a.p055k.C0887a;

@Keep
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected C0588f createButton(Context context, AttributeSet attributeSet) {
        return new C0887a(context, attributeSet);
    }
}
