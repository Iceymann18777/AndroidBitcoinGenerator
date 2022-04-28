package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.f */
/* loaded from: classes.dex */
class C0994f {

    /* renamed from: e */
    private static C0994f f3632e;

    /* renamed from: a */
    private final Object f3633a = new Object();

    /* renamed from: b */
    private final Handler f3634b = new Handler(Looper.getMainLooper(), new C0995a());

    /* renamed from: c */
    private C0997c f3635c;

    /* renamed from: d */
    private C0997c f3636d;

    /* renamed from: com.google.android.material.snackbar.f$a */
    /* loaded from: classes.dex */
    class C0995a implements Handler.Callback {
        C0995a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0994f.this.m53a((C0997c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.f$b */
    /* loaded from: classes.dex */
    public interface AbstractC0996b {
        /* renamed from: a */
        void m48a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.f$c */
    /* loaded from: classes.dex */
    public static class C0997c {

        /* renamed from: a */
        final WeakReference<AbstractC0996b> f3638a;

        /* renamed from: b */
        int f3639b;

        /* renamed from: c */
        boolean f3640c;

        /* renamed from: a */
        boolean m47a(AbstractC0996b bVar) {
            return bVar != null && this.f3638a.get() == bVar;
        }
    }

    private C0994f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0994f m55a() {
        if (f3632e == null) {
            f3632e = new C0994f();
        }
        return f3632e;
    }

    /* renamed from: a */
    private boolean m52a(C0997c cVar, int i) {
        AbstractC0996b bVar = cVar.f3638a.get();
        if (bVar == null) {
            return false;
        }
        this.f3634b.removeCallbacksAndMessages(cVar);
        bVar.m48a(i);
        return true;
    }

    /* renamed from: b */
    private void m50b(C0997c cVar) {
        int i = cVar.f3639b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f3634b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f3634b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
        }
    }

    /* renamed from: c */
    private boolean m49c(AbstractC0996b bVar) {
        C0997c cVar = this.f3635c;
        return cVar != null && cVar.m47a(bVar);
    }

    /* renamed from: a */
    public void m54a(AbstractC0996b bVar) {
        synchronized (this.f3633a) {
            if (m49c(bVar) && !this.f3635c.f3640c) {
                this.f3635c.f3640c = true;
                this.f3634b.removeCallbacksAndMessages(this.f3635c);
            }
        }
    }

    /* renamed from: a */
    void m53a(C0997c cVar) {
        synchronized (this.f3633a) {
            if (this.f3635c == cVar || this.f3636d == cVar) {
                m52a(cVar, 2);
            }
        }
    }

    /* renamed from: b */
    public void m51b(AbstractC0996b bVar) {
        synchronized (this.f3633a) {
            if (m49c(bVar) && this.f3635c.f3640c) {
                this.f3635c.f3640c = false;
                m50b(this.f3635c);
            }
        }
    }
}
