package p000a.p036j.p037a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p018g.p028k.C0184g;

/* renamed from: a.j.a.g */
/* loaded from: classes.dex */
public abstract class AbstractC0261g<E> extends AbstractC0259e {

    /* renamed from: a */
    private final Activity f851a;

    /* renamed from: b */
    private final Context f852b;

    /* renamed from: c */
    private final Handler f853c;

    /* renamed from: d */
    final LayoutInflater$Factory2C0266i f854d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0261g(ActivityC0255d dVar) {
        this(dVar, dVar, dVar.f836c, 0);
    }

    AbstractC0261g(Activity activity, Context context, Handler handler, int i) {
        this.f854d = new LayoutInflater$Factory2C0266i();
        this.f851a = activity;
        C0184g.m3555a(context, "context == null");
        this.f852b = context;
        C0184g.m3555a(handler, "handler == null");
        this.f853c = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo3141a(ComponentCallbacksC0248c cVar);

    /* renamed from: a */
    public abstract void mo3140a(ComponentCallbacksC0248c cVar, Intent intent, int i, Bundle bundle);

    /* renamed from: a */
    public abstract void mo3139a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Activity m3138b() {
        return this.f851a;
    }

    /* renamed from: b */
    public abstract boolean mo3137b(ComponentCallbacksC0248c cVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Context m3136c() {
        return this.f852b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public LayoutInflater$Factory2C0266i m3135d() {
        return this.f854d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Handler m3134e() {
        return this.f853c;
    }

    /* renamed from: f */
    public abstract LayoutInflater mo3133f();

    /* renamed from: g */
    public abstract int mo3132g();

    /* renamed from: h */
    public abstract boolean mo3131h();

    /* renamed from: i */
    public abstract void mo3130i();
}
