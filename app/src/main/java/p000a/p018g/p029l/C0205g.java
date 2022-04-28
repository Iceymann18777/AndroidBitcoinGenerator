package p000a.p018g.p029l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p000a.p018g.p022f.p023a.AbstractMenuItemC0156b;

/* renamed from: a.g.l.g */
/* loaded from: classes.dex */
public final class C0205g {
    /* renamed from: a */
    public static MenuItem m3477a(MenuItem menuItem, AbstractC0197b bVar) {
        if (menuItem instanceof AbstractMenuItemC0156b) {
            return ((AbstractMenuItemC0156b) menuItem).mo2369a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m3478a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC0156b) {
            ((AbstractMenuItemC0156b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m3476a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof AbstractMenuItemC0156b) {
            ((AbstractMenuItemC0156b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m3475a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof AbstractMenuItemC0156b) {
            ((AbstractMenuItemC0156b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m3474a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC0156b) {
            ((AbstractMenuItemC0156b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m3473b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC0156b) {
            ((AbstractMenuItemC0156b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m3472b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC0156b) {
            ((AbstractMenuItemC0156b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
