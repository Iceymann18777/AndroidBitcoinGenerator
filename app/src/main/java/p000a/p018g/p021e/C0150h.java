package p000a.p018g.p021e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p000a.p018g.p019d.p020c.C0128c;
import p000a.p018g.p026i.C0161b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.g.e.h */
/* loaded from: classes.dex */
public class C0150h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.e.h$a */
    /* loaded from: classes.dex */
    public class C0151a implements AbstractC0153c<C0161b.C0167f> {
        C0151a(C0150h hVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public int mo3617a(C0161b.C0167f fVar) {
            return fVar.m3582d();
        }

        /* renamed from: b  reason: avoid collision after fix types in other method */
        public boolean mo3616b(C0161b.C0167f fVar) {
            return fVar.m3581e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.e.h$b */
    /* loaded from: classes.dex */
    public class C0152b implements AbstractC0153c<C0128c.C0131c> {
        C0152b(C0150h hVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public int mo3617a(C0128c.C0131c cVar) {
            return cVar.m3699e();
        }

        /* renamed from: b  reason: avoid collision after fix types in other method */
        public boolean mo3616b(C0128c.C0131c cVar) {
            return cVar.m3698f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.g.e.h$c */
    /* loaded from: classes.dex */
    public interface AbstractC0153c<T> {
        /* renamed from: a */
        int mo3617a(T t);

        /* renamed from: b */
        boolean mo3616b(T t);
    }

    /* renamed from: a */
    private C0128c.C0131c m3628a(C0128c.C0130b bVar, int i) {
        return (C0128c.C0131c) m3622a(bVar.m3704a(), i, new C0152b(this));
    }

    /* renamed from: a */
    private static <T> T m3622a(T[] tArr, int i, AbstractC0153c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo3617a(t2) - i2) * 2) + (cVar.mo3616b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0161b.C0167f m3623a(C0161b.C0167f[] fVarArr, int i) {
        return (C0161b.C0167f) m3622a(fVarArr, i, new C0151a(this));
    }

    /* renamed from: a */
    public Typeface mo3627a(Context context, C0128c.C0130b bVar, Resources resources, int i) {
        C0128c.C0131c a = m3628a(bVar, i);
        if (a == null) {
            return null;
        }
        return C0145c.m3651a(context, resources, a.m3702b(), a.m3703a(), i);
    }

    /* renamed from: a */
    public Typeface mo3626a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0154i.m3615a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0154i.m3610a(a, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(a.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo3625a(Context context, CancellationSignal cancellationSignal, C0161b.C0167f[] fVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m3623a(fVarArr, i).m3583c());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Typeface a = m3624a(context, inputStream);
            C0154i.m3612a(inputStream);
            return a;
        } catch (IOException unused2) {
            C0154i.m3612a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            C0154i.m3612a(inputStream2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface m3624a(Context context, InputStream inputStream) {
        File a = C0154i.m3615a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0154i.m3609a(a, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(a.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
