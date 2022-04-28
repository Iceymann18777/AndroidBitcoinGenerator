package p000a.p018g.p028k;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: a.g.k.c */
/* loaded from: classes.dex */
public class C0180c {
    /* renamed from: a */
    public static int m3561a(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static boolean m3562a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
