package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class C0714c {

    /* renamed from: a */
    private static Field f2709a;

    /* renamed from: b */
    private static boolean f2710b;

    /* renamed from: a */
    public static Drawable m1512a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f2710b) {
            try {
                f2709a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2709a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f2710b = true;
        }
        Field field = f2709a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f2709a = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m1511a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof AbstractC0722j) {
            ((AbstractC0722j) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1510a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof AbstractC0722j) {
            ((AbstractC0722j) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
