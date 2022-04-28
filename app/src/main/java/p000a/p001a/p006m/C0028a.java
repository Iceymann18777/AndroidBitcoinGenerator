package p000a.p001a.p006m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p000a.p001a.C0000a;
import p000a.p001a.C0001b;
import p000a.p001a.C0003d;
import p000a.p001a.C0009j;

/* renamed from: a.a.m.a */
/* loaded from: classes.dex */
public class C0028a {

    /* renamed from: a */
    private Context f86a;

    private C0028a(Context context) {
        this.f86a = context;
    }

    /* renamed from: a */
    public static C0028a m4185a(Context context) {
        return new C0028a(context);
    }

    /* renamed from: a */
    public boolean m4186a() {
        return this.f86a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: b */
    public int m4184b() {
        return this.f86a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int m4183c() {
        Configuration configuration = this.f86a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: d */
    public int m4182d() {
        return this.f86a.getResources().getDimensionPixelSize(C0003d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int m4181e() {
        TypedArray obtainStyledAttributes = this.f86a.obtainStyledAttributes(null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0009j.ActionBar_height, 0);
        Resources resources = this.f86a.getResources();
        if (!m4180f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0003d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean m4180f() {
        return this.f86a.getResources().getBoolean(C0001b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean m4179g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f86a).hasPermanentMenuKey();
    }
}
