package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
class C0438c {

    /* renamed from: a */
    private static final int[] f1409a = {16843531};

    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    static class C0439a {

        /* renamed from: a */
        public Method f1410a;

        /* renamed from: b */
        public Method f1411b;

        /* renamed from: c */
        public ImageView f1412c;

        C0439a(Activity activity) {
            try {
                this.f1410a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f1411b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                        if (childAt2 instanceof ImageView) {
                            this.f1412c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Drawable m2648a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f1409a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: a */
    public static C0439a m2647a(C0439a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new C0439a(activity);
        }
        if (aVar.f1410a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f1411b.invoke(actionBar, Integer.valueOf(i));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static C0439a m2646a(C0439a aVar, Activity activity, Drawable drawable, int i) {
        C0439a aVar2 = new C0439a(activity);
        if (aVar2.f1410a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar2.f1410a.invoke(actionBar, drawable);
                aVar2.f1411b.invoke(actionBar, Integer.valueOf(i));
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else {
            ImageView imageView = aVar2.f1412c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
            }
        }
        return aVar2;
    }
}
