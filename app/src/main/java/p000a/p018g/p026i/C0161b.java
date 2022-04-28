package p000a.p018g.p026i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p000a.p013d.C0073e;
import p000a.p013d.C0080g;
import p000a.p018g.p019d.p020c.C0128c;
import p000a.p018g.p019d.p020c.C0136f;
import p000a.p018g.p021e.C0145c;
import p000a.p018g.p021e.C0154i;
import p000a.p018g.p028k.C0184g;

/* renamed from: a.g.i.b */
/* loaded from: classes.dex */
public class C0161b {

    /* renamed from: a */
    static final C0073e<String, Typeface> f579a = new C0073e<>(16);

    /* renamed from: b */
    private static final C0169c f580b = new C0169c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f581c = new Object();

    /* renamed from: d */
    static final C0080g<String, ArrayList<C0169c.AbstractC0174d<C0168g>>> f582d = new C0080g<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f583e = new C0165d();

    /* renamed from: a.g.i.b$a */
    /* loaded from: classes.dex */
    static class CallableC0162a implements Callable<C0168g> {

        /* renamed from: a */
        final /* synthetic */ Context f584a;

        /* renamed from: b */
        final /* synthetic */ C0160a f585b;

        /* renamed from: c */
        final /* synthetic */ int f586c;

        /* renamed from: d */
        final /* synthetic */ String f587d;

        CallableC0162a(Context context, C0160a aVar, int i, String str) {
            this.f584a = context;
            this.f585b = aVar;
            this.f586c = i;
            this.f587d = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C0168g call() {
            C0168g a = C0161b.m3598a(this.f584a, this.f585b, this.f586c);
            Typeface typeface = a.f598a;
            if (typeface != null) {
                C0161b.f579a.m4048a(this.f587d, typeface);
            }
            return a;
        }
    }

    /* renamed from: a.g.i.b$b */
    /* loaded from: classes.dex */
    static class C0163b implements C0169c.AbstractC0174d<C0168g> {

        /* renamed from: a */
        final /* synthetic */ C0136f.AbstractC0137a f588a;

        /* renamed from: b */
        final /* synthetic */ Handler f589b;

        C0163b(C0136f.AbstractC0137a aVar, Handler handler) {
            this.f588a = aVar;
            this.f589b = handler;
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo3575a(C0168g gVar) {
            int i;
            C0136f.AbstractC0137a aVar;
            if (gVar == null) {
                aVar = this.f588a;
                i = 1;
            } else {
                i = gVar.f599b;
                if (i == 0) {
                    this.f588a.m3682a(gVar.f598a, this.f589b);
                    return;
                }
                aVar = this.f588a;
            }
            aVar.m3683a(i, this.f589b);
        }
    }

    /* renamed from: a.g.i.b$c */
    /* loaded from: classes.dex */
    static class C0164c implements C0169c.AbstractC0174d<C0168g> {

        /* renamed from: a */
        final /* synthetic */ String f590a;

        C0164c(String str) {
            this.f590a = str;
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo3575a(C0168g gVar) {
            synchronized (C0161b.f581c) {
                ArrayList<C0169c.AbstractC0174d<C0168g>> arrayList = C0161b.f582d.get(this.f590a);
                if (arrayList != null) {
                    C0161b.f582d.remove(this.f590a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).mo3575a(gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a.g.i.b$d */
    /* loaded from: classes.dex */
    static class C0165d implements Comparator<byte[]> {
        C0165d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i = bArr.length;
                i2 = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            return i - i2;
        }
    }

    /* renamed from: a.g.i.b$e */
    /* loaded from: classes.dex */
    public static class C0166e {

        /* renamed from: a */
        private final int f591a;

        /* renamed from: b */
        private final C0167f[] f592b;

        public C0166e(int i, C0167f[] fVarArr) {
            this.f591a = i;
            this.f592b = fVarArr;
        }

        /* renamed from: a */
        public C0167f[] m3587a() {
            return this.f592b;
        }

        /* renamed from: b */
        public int m3586b() {
            return this.f591a;
        }
    }

    /* renamed from: a.g.i.b$f */
    /* loaded from: classes.dex */
    public static class C0167f {

        /* renamed from: a */
        private final Uri f593a;

        /* renamed from: b */
        private final int f594b;

        /* renamed from: c */
        private final int f595c;

        /* renamed from: d */
        private final boolean f596d;

        /* renamed from: e */
        private final int f597e;

        public C0167f(Uri uri, int i, int i2, boolean z, int i3) {
            C0184g.m3556a(uri);
            this.f593a = uri;
            this.f594b = i;
            this.f595c = i2;
            this.f596d = z;
            this.f597e = i3;
        }

        /* renamed from: a */
        public int m3585a() {
            return this.f597e;
        }

        /* renamed from: b */
        public int m3584b() {
            return this.f594b;
        }

        /* renamed from: c */
        public Uri m3583c() {
            return this.f593a;
        }

        /* renamed from: d */
        public int m3582d() {
            return this.f595c;
        }

        /* renamed from: e */
        public boolean m3581e() {
            return this.f596d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.g.i.b$g */
    /* loaded from: classes.dex */
    public static final class C0168g {

        /* renamed from: a */
        final Typeface f598a;

        /* renamed from: b */
        final int f599b;

        C0168g(Typeface typeface, int i) {
            this.f598a = typeface;
            this.f599b = i;
        }
    }

    /* renamed from: a */
    public static C0166e m3595a(Context context, CancellationSignal cancellationSignal, C0160a aVar) {
        ProviderInfo a = m3593a(context.getPackageManager(), aVar, context.getResources());
        return a == null ? new C0166e(1, null) : new C0166e(0, m3596a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    static C0168g m3598a(Context context, C0160a aVar, int i) {
        try {
            C0166e a = m3595a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.m3586b() == 0) {
                Typeface a2 = C0145c.m3650a(context, null, a.m3587a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0168g(a2, i2);
            }
            if (a.m3586b() == 1) {
                i2 = -2;
            }
            return new C0168g(null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0168g(null, -1);
        }
    }

    /* renamed from: a */
    public static ProviderInfo m3593a(PackageManager packageManager, C0160a aVar, Resources resources) {
        String d = aVar.m3602d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d);
        } else if (resolveContentProvider.packageName.equals(aVar.m3601e())) {
            List<byte[]> a = m3591a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f583e);
            List<List<byte[]>> a2 = m3599a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList(a2.get(i));
                Collections.sort(arrayList, f583e);
                if (m3592a(a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d + ", but package was not " + aVar.m3601e());
        }
    }

    /* renamed from: a */
    public static Typeface m3597a(Context context, C0160a aVar, C0136f.AbstractC0137a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.m3603c() + "-" + i2;
        Typeface b = f579a.m4046b(str);
        if (b != null) {
            if (aVar2 != null) {
                aVar2.mo1800a(b);
            }
            return b;
        } else if (!z || i != -1) {
            CallableC0162a aVar3 = new CallableC0162a(context, aVar, i2, str);
            if (z) {
                try {
                    return ((C0168g) f580b.m3578a(aVar3, i)).f598a;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                C0163b bVar = aVar2 == null ? null : new C0163b(aVar2, handler);
                synchronized (f581c) {
                    if (f582d.containsKey(str)) {
                        if (bVar != null) {
                            f582d.get(str).add(bVar);
                        }
                        return null;
                    }
                    if (bVar != null) {
                        ArrayList<C0169c.AbstractC0174d<C0168g>> arrayList = new ArrayList<>();
                        arrayList.add(bVar);
                        f582d.put(str, arrayList);
                    }
                    f580b.m3577a(aVar3, new C0164c(str));
                    return null;
                }
            }
        } else {
            C0168g a = m3598a(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = a.f599b;
                if (i3 == 0) {
                    aVar2.m3682a(a.f598a, handler);
                } else {
                    aVar2.m3683a(i3, handler);
                }
            }
            return a.f598a;
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m3599a(C0160a aVar, Resources resources) {
        return aVar.m3605a() != null ? aVar.m3605a() : C0128c.m3712a(resources, aVar.m3604b());
    }

    /* renamed from: a */
    private static List<byte[]> m3591a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m3594a(Context context, C0167f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0167f fVar : fVarArr) {
            if (fVar.m3585a() == 0) {
                Uri c = fVar.m3583c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C0154i.m3613a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m3592a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static p000a.p018g.p026i.C0161b.C0167f[] m3596a(android.content.Context r19, p000a.p018g.p026i.C0160a r20, java.lang.String r21, android.os.CancellationSignal r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p018g.p026i.C0161b.m3596a(android.content.Context, a.g.i.a, java.lang.String, android.os.CancellationSignal):a.g.i.b$f[]");
    }
}
