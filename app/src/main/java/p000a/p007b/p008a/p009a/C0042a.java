package p000a.p007b.p008a.p009a;

import java.util.concurrent.Executor;

/* renamed from: a.b.a.a.a */
/* loaded from: classes.dex */
public class C0042a extends AbstractC0047c {

    /* renamed from: c */
    private static volatile C0042a f157c;

    /* renamed from: b */
    private AbstractC0047c f159b = new C0045b();

    /* renamed from: a */
    private AbstractC0047c f158a = this.f159b;

    /* renamed from: a.b.a.a.a$a */
    /* loaded from: classes.dex */
    static class ExecutorC0043a implements Executor {
        ExecutorC0043a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0042a.m4148b().mo4145b(runnable);
        }
    }

    /* renamed from: a.b.a.a.a$b */
    /* loaded from: classes.dex */
    static class ExecutorC0044b implements Executor {
        ExecutorC0044b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0042a.m4148b().mo4146a(runnable);
        }
    }

    static {
        new ExecutorC0043a();
        new ExecutorC0044b();
    }

    private C0042a() {
    }

    /* renamed from: b */
    public static C0042a m4148b() {
        if (f157c != null) {
            return f157c;
        }
        synchronized (C0042a.class) {
            if (f157c == null) {
                f157c = new C0042a();
            }
        }
        return f157c;
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: a */
    public void mo4146a(Runnable runnable) {
        this.f158a.mo4146a(runnable);
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: a */
    public boolean mo4147a() {
        return this.f158a.mo4147a();
    }

    @Override // p000a.p007b.p008a.p009a.AbstractC0047c
    /* renamed from: b */
    public void mo4145b(Runnable runnable) {
        this.f158a.mo4145b(runnable);
    }
}
