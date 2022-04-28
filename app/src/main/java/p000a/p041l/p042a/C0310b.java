package p000a.p041l.p042a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0746g;
import androidx.lifecycle.AbstractC0754m;
import androidx.lifecycle.AbstractC0758p;
import androidx.lifecycle.C0753l;
import androidx.lifecycle.C0759q;
import androidx.lifecycle.C0761r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p013d.C0081h;
import p000a.p018g.p028k.C0178a;
import p000a.p041l.p043b.C0315a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.l.a.b */
/* loaded from: classes.dex */
public class C0310b extends AbstractC0309a {

    /* renamed from: c */
    static boolean f1003c;

    /* renamed from: a */
    private final AbstractC0746g f1004a;

    /* renamed from: b */
    private final C0313c f1005b;

    /* renamed from: a.l.a.b$a */
    /* loaded from: classes.dex */
    public static class C0311a<D> extends C0753l<D> implements C0315a.AbstractC0316a<D> {

        /* renamed from: j */
        private final int f1006j;

        /* renamed from: k */
        private final Bundle f1007k;

        /* renamed from: l */
        private final C0315a<D> f1008l;

        /* renamed from: m */
        private AbstractC0746g f1009m;

        /* renamed from: n */
        private C0312b<D> f1010n;

        /* renamed from: o */
        private C0315a<D> f1011o;

        /* renamed from: a */
        C0315a<D> m2945a(boolean z) {
            if (C0310b.f1003c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f1008l.m2940a();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: a */
        protected void mo1414a() {
            if (C0310b.f1003c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f1008l.m2937c();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: a */
        public void mo1411a(AbstractC0754m<? super D> mVar) {
            super.mo1411a((AbstractC0754m) mVar);
            this.f1009m = null;
            this.f1010n = null;
        }

        @Override // androidx.lifecycle.C0753l, androidx.lifecycle.LiveData
        /* renamed from: a */
        public void mo1360a(D d) {
            super.mo1360a((C0311a<D>) d);
            C0315a<D> aVar = this.f1011o;
            if (aVar != null) {
                aVar.m2938b();
                throw null;
            }
        }

        /* renamed from: a */
        public void m2946a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f1006j);
            printWriter.print(" mArgs=");
            printWriter.println(this.f1007k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f1008l);
            C0315a<D> aVar = this.f1008l;
            aVar.m2939a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: b */
        protected void mo1409b() {
            if (C0310b.f1003c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f1008l.m2936d();
            throw null;
        }

        /* renamed from: c */
        void m2944c() {
            AbstractC0746g gVar = this.f1009m;
            C0312b<D> bVar = this.f1010n;
            if (gVar != null && bVar != null) {
                super.mo1411a((AbstractC0754m) bVar);
                m1412a(gVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1006j);
            sb.append(" : ");
            C0178a.m3564a(this.f1008l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.l.a.b$b */
    /* loaded from: classes.dex */
    public static class C0312b<D> implements AbstractC0754m<D> {
    }

    /* renamed from: a.l.a.b$c */
    /* loaded from: classes.dex */
    static class C0313c extends AbstractC0758p {

        /* renamed from: b */
        private static final C0759q.AbstractC0760a f1012b = new C0314a();

        /* renamed from: a */
        private C0081h<C0311a> f1013a = new C0081h<>();

        /* renamed from: a.l.a.b$c$a */
        /* loaded from: classes.dex */
        static class C0314a implements C0759q.AbstractC0760a {
            C0314a() {
            }

            @Override // androidx.lifecycle.C0759q.AbstractC0760a
            /* renamed from: a */
            public <T extends AbstractC0758p> T mo1347a(Class<T> cls) {
                return new C0313c();
            }
        }

        C0313c() {
        }

        /* renamed from: a */
        static C0313c m2943a(C0761r rVar) {
            return (C0313c) new C0759q(rVar, f1012b).m1349a(C0313c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC0758p
        /* renamed from: a */
        public void mo1350a() {
            super.mo1350a();
            if (this.f1013a.m4008b() <= 0) {
                this.f1013a.m4011a();
            } else {
                this.f1013a.m4000f(0).m2945a(true);
                throw null;
            }
        }

        /* renamed from: a */
        public void m2942a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1013a.m4008b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f1013a.m4008b() > 0) {
                    C0311a f = this.f1013a.m4000f(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f1013a.m4002d(0));
                    printWriter.print(": ");
                    printWriter.println(f.toString());
                    f.m2946a(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* renamed from: b */
        void m2941b() {
            int b = this.f1013a.m4008b();
            for (int i = 0; i < b; i++) {
                this.f1013a.m4000f(i).m2944c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0310b(AbstractC0746g gVar, C0761r rVar) {
        this.f1004a = gVar;
        this.f1005b = C0313c.m2943a(rVar);
    }

    @Override // p000a.p041l.p042a.AbstractC0309a
    /* renamed from: a */
    public void mo2948a() {
        this.f1005b.m2941b();
    }

    @Override // p000a.p041l.p042a.AbstractC0309a
    @Deprecated
    /* renamed from: a */
    public void mo2947a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1005b.m2942a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0178a.m3564a(this.f1004a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
