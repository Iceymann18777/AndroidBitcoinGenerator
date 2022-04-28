package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p018g.p019d.C0124a;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class C0696f implements Iterable<Intent> {

    /* renamed from: b */
    private final ArrayList<Intent> f2621b = new ArrayList<>();

    /* renamed from: c */
    private final Context f2622c;

    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes.dex */
    public interface AbstractC0697a {
        /* renamed from: d */
        Intent mo1615d();
    }

    private C0696f(Context context) {
        this.f2622c = context;
    }

    /* renamed from: a */
    public static C0696f m1618a(Context context) {
        return new C0696f(context);
    }

    /* renamed from: a */
    public C0696f m1620a(Activity activity) {
        Intent d = activity instanceof AbstractC0697a ? ((AbstractC0697a) activity).mo1615d() : null;
        if (d == null) {
            d = C0694d.m1630a(activity);
        }
        if (d != null) {
            ComponentName component = d.getComponent();
            if (component == null) {
                component = d.resolveActivity(this.f2622c.getPackageManager());
            }
            m1619a(component);
            m1617a(d);
        }
        return this;
    }

    /* renamed from: a */
    public C0696f m1619a(ComponentName componentName) {
        int size = this.f2621b.size();
        try {
            Context context = this.f2622c;
            while (true) {
                Intent a = C0694d.m1628a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f2621b.add(size, a);
                context = this.f2622c;
                componentName = a.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0696f m1617a(Intent intent) {
        this.f2621b.add(intent);
        return this;
    }

    /* renamed from: a */
    public void m1621a() {
        m1616a((Bundle) null);
    }

    /* renamed from: a */
    public void m1616a(Bundle bundle) {
        if (!this.f2621b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f2621b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0124a.m3733a(this.f2622c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2622c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2621b.iterator();
    }
}
