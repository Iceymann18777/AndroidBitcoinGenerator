package p000a.p018g.p026i;

import android.util.Base64;
import java.util.List;
import p000a.p018g.p028k.C0184g;

/* renamed from: a.g.i.a */
/* loaded from: classes.dex */
public final class C0160a {

    /* renamed from: a */
    private final String f573a;

    /* renamed from: b */
    private final String f574b;

    /* renamed from: c */
    private final String f575c;

    /* renamed from: d */
    private final List<List<byte[]>> f576d;

    /* renamed from: e */
    private final int f577e = 0;

    /* renamed from: f */
    private final String f578f;

    public C0160a(String str, String str2, String str3, List<List<byte[]>> list) {
        C0184g.m3556a(str);
        this.f573a = str;
        C0184g.m3556a(str2);
        this.f574b = str2;
        C0184g.m3556a(str3);
        this.f575c = str3;
        C0184g.m3556a(list);
        this.f576d = list;
        this.f578f = this.f573a + "-" + this.f574b + "-" + this.f575c;
    }

    /* renamed from: a */
    public List<List<byte[]>> m3605a() {
        return this.f576d;
    }

    /* renamed from: b */
    public int m3604b() {
        return this.f577e;
    }

    /* renamed from: c */
    public String m3603c() {
        return this.f578f;
    }

    /* renamed from: d */
    public String m3602d() {
        return this.f573a;
    }

    /* renamed from: e */
    public String m3601e() {
        return this.f574b;
    }

    /* renamed from: f */
    public String m3600f() {
        return this.f575c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f573a + ", mProviderPackage: " + this.f574b + ", mQuery: " + this.f575c + ", mCertificates:");
        for (int i = 0; i < this.f576d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f576d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f577e);
        return sb.toString();
    }
}
