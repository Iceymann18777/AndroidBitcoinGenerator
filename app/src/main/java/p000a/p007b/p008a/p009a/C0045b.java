package p000a.p007b.p008a.p009a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.b.a.a.b */
/* loaded from: classes.dex */
public class C0045b extends AbstractC0047c {

    /* renamed from: a */
    private final Object f160a = new Object();

    /* renamed from: b */
    private final ExecutorService f161b = Executors.newFixedThreadPool(2, new ThreadFactoryC0046a(this));

    /* renamed from: c */
    private volatile Handler f162c;

    /* renamed from: a.b.a.a.b$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC0046a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f163a = new AtomicInteger(0);

        ThreadFactoryC0046a(C0045b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f163a.getAndIncrement())));
            return thread;
        }
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: a */
    public void mo4146a(Runnable runnable) {
        this.f161b.execute(runnable);
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: a */
    public boolean mo4147a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: b */
    public void mo4145b(Runnable runnable) {
        if (this.f162c == null) {
            synchronized (this.f160a) {
                if (this.f162c == null) {
                    this.f162c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f162c.post(runnable);
    }
}
