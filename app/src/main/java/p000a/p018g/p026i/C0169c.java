package p000a.p018g.p026i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.g.i.c */
/* loaded from: classes.dex */
public class C0169c {

    /* renamed from: b */
    private HandlerThread f601b;

    /* renamed from: c */
    private Handler f602c;

    /* renamed from: f */
    private final int f605f;

    /* renamed from: g */
    private final int f606g;

    /* renamed from: h */
    private final String f607h;

    /* renamed from: a */
    private final Object f600a = new Object();

    /* renamed from: e */
    private Handler.Callback f604e = new C0170a();

    /* renamed from: d */
    private int f603d = 0;

    /* renamed from: a.g.i.c$a */
    /* loaded from: classes.dex */
    class C0170a implements Handler.Callback {
        C0170a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0169c.this.m3580a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0169c.this.m3579a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: a.g.i.c$b */
    /* loaded from: classes.dex */
    class RunnableC0171b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Callable f609b;

        /* renamed from: c */
        final /* synthetic */ Handler f610c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0174d f611d;

        /* renamed from: a.g.i.c$b$a */
        /* loaded from: classes.dex */
        class RunnableC0172a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Object f612b;

            RunnableC0172a(Object obj) {
                this.f612b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0171b.this.f611d.mo3575a(this.f612b);
            }
        }

        RunnableC0171b(C0169c cVar, Callable callable, Handler handler, AbstractC0174d dVar) {
            this.f609b = callable;
            this.f610c = handler;
            this.f611d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f609b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f610c.post(new RunnableC0172a(obj));
        }
    }

    /* renamed from: a.g.i.c$c */
    /* loaded from: classes.dex */
    class RunnableC0173c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AtomicReference f614b;

        /* renamed from: c */
        final /* synthetic */ Callable f615c;

        /* renamed from: d */
        final /* synthetic */ ReentrantLock f616d;

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f617e;

        /* renamed from: f */
        final /* synthetic */ Condition f618f;

        RunnableC0173c(C0169c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f614b = atomicReference;
            this.f615c = callable;
            this.f616d = reentrantLock;
            this.f617e = atomicBoolean;
            this.f618f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f614b.set(this.f615c.call());
            } catch (Exception unused) {
            }
            this.f616d.lock();
            try {
                this.f617e.set(false);
                this.f618f.signal();
            } finally {
                this.f616d.unlock();
            }
        }
    }

    /* renamed from: a.g.i.c$d */
    /* loaded from: classes.dex */
    public interface AbstractC0174d<T> {
        /* renamed from: a */
        void mo3575a(T t);
    }

    public C0169c(String str, int i, int i2) {
        this.f607h = str;
        this.f606g = i;
        this.f605f = i2;
    }

    /* renamed from: b */
    private void m3576b(Runnable runnable) {
        synchronized (this.f600a) {
            if (this.f601b == null) {
                this.f601b = new HandlerThread(this.f607h, this.f606g);
                this.f601b.start();
                this.f602c = new Handler(this.f601b.getLooper(), this.f604e);
                this.f603d++;
            }
            this.f602c.removeMessages(0);
            this.f602c.sendMessage(this.f602c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> T m3578a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m3576b(new RunnableC0173c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    void m3580a() {
        synchronized (this.f600a) {
            if (!this.f602c.hasMessages(1)) {
                this.f601b.quit();
                this.f601b = null;
                this.f602c = null;
            }
        }
    }

    /* renamed from: a */
    void m3579a(Runnable runnable) {
        runnable.run();
        synchronized (this.f600a) {
            this.f602c.removeMessages(0);
            this.f602c.sendMessageDelayed(this.f602c.obtainMessage(0), this.f605f);
        }
    }

    /* renamed from: a */
    public <T> void m3577a(Callable<T> callable, AbstractC0174d<T> dVar) {
        m3576b(new RunnableC0171b(this, callable, new Handler(), dVar));
    }
}
