package p000a.p018g.p019d;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0692b;

/* renamed from: a.g.d.b */
/* loaded from: classes.dex */
public final class C0125b {
    /* renamed from: a */
    public static int m3731a(Context context, String str) {
        return m3730a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m3730a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0692b.m1632a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0692b.m1633a(context, a, str2) != 0 ? -2 : 0;
    }
}
