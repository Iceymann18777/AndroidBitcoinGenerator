package p000a.p018g.p021e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p000a.p013d.C0073e;
import p000a.p018g.p019d.p020c.C0128c;
import p000a.p018g.p019d.p020c.C0136f;
import p000a.p018g.p026i.C0161b;

/* renamed from: a.g.e.c */
/* loaded from: classes.dex */
public class C0145c {

    /* renamed from: a */
    private static final C0150h f560a;

    /* renamed from: b */
    private static final C0073e<String, Typeface> f561b;

    static {
        int i = Build.VERSION.SDK_INT;
        f560a = i >= 28 ? new C0149g() : i >= 26 ? new C0148f() : (i < 24 || !C0147e.m3646a()) ? Build.VERSION.SDK_INT >= 21 ? new C0146d() : new C0150h() : new C0147e();
        f561b = new C0073e<>(16);
    }

    /* renamed from: a */
    public static Typeface m3652a(Context context, C0128c.AbstractC0129a aVar, Resources resources, int i, int i2, C0136f.AbstractC0137a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0128c.C0132d) {
            C0128c.C0132d dVar = (C0128c.C0132d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.m3697a() == 0) {
                z2 = true;
            }
            typeface = C0161b.m3597a(context, dVar.m3696b(), aVar2, handler, z2, z ? dVar.m3695c() : -1, i2);
        } else {
            typeface = f560a.mo3627a(context, (C0128c.C0130b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.m3682a(typeface, handler);
                } else {
                    aVar2.m3683a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f561b.m4048a(m3649a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m3651a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f560a.mo3626a(context, resources, i, str, i2);
        if (a != null) {
            f561b.m4048a(m3649a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m3650a(Context context, CancellationSignal cancellationSignal, C0161b.C0167f[] fVarArr, int i) {
        return f560a.mo3625a(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: a */
    private static String m3649a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: b */
    public static Typeface m3648b(Resources resources, int i, int i2) {
        return f561b.m4046b(m3649a(resources, i, i2));
    }
}
