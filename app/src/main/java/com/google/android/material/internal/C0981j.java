package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0638t0;
import p050b.p051a.p052a.p053a.C0869b;
import p050b.p051a.p052a.p053a.C0876i;

/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes.dex */
public final class C0981j {

    /* renamed from: a */
    private static final int[] f3609a = {C0869b.colorPrimary};

    /* renamed from: b */
    private static final int[] f3610b = {C0869b.colorSecondary};

    /* renamed from: a */
    public static void m80a(Context context) {
        m76a(context, f3609a, "Theme.AppCompat");
    }

    /* renamed from: a */
    private static void m79a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876i.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C0876i.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m75b(context);
        }
        m80a(context);
    }

    /* renamed from: a */
    private static void m78a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0876i.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C0876i.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        boolean b = (iArr2 == null || iArr2.length == 0) ? obtainStyledAttributes.getResourceId(C0876i.ThemeEnforcement_android_textAppearance, -1) != -1 : m74b(context, attributeSet, iArr, i, i2, iArr2);
        obtainStyledAttributes.recycle();
        if (!b) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: a */
    private static void m76a(Context context, int[] iArr, String str) {
        if (!m77a(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: a */
    private static boolean m77a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: b */
    public static void m75b(Context context) {
        m76a(context, f3610b, "Theme.MaterialComponents");
    }

    /* renamed from: b */
    private static boolean m74b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    public static TypedArray m73c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m79a(context, attributeSet, i, i2);
        m78a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    public static C0638t0 m72d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m79a(context, attributeSet, i, i2);
        m78a(context, attributeSet, iArr, i, i2, iArr2);
        return C0638t0.m1900a(context, attributeSet, iArr, i, i2);
    }
}
