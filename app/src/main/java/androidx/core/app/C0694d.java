package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: androidx.core.app.d */
/* loaded from: classes.dex */
public final class C0694d {
    /* renamed from: a */
    public static Intent m1630a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String b = m1627b(activity);
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, b);
        try {
            return m1625b(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b + "' in manifest");
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m1628a(Context context, ComponentName componentName) {
        String b = m1625b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return m1625b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: a */
    public static void m1629a(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: b */
    public static String m1627b(Activity activity) {
        try {
            return m1625b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static String m1625b(Context context, ComponentName componentName) {
        String string;
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: b */
    public static boolean m1626b(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }
}
