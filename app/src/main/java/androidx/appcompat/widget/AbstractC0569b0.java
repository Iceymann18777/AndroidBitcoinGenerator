package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.AbstractC0513p;
import androidx.appcompat.view.menu.C0496h;
import p000a.p018g.p029l.C0223v;

/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes.dex */
public interface AbstractC0569b0 {
    /* renamed from: a */
    C0223v mo1885a(int i, long j);

    /* renamed from: a */
    void mo1886a(int i);

    /* renamed from: a */
    void mo1884a(Drawable drawable);

    /* renamed from: a */
    void mo1883a(Menu menu, AbstractC0513p.AbstractC0514a aVar);

    /* renamed from: a */
    void mo1881a(AbstractC0513p.AbstractC0514a aVar, C0496h.AbstractC0497a aVar2);

    /* renamed from: a */
    void mo1880a(C0619m0 m0Var);

    /* renamed from: a */
    void mo1878a(boolean z);

    /* renamed from: a */
    boolean mo1887a();

    /* renamed from: b */
    void mo1876b(int i);

    /* renamed from: b */
    void mo1873b(boolean z);

    /* renamed from: b */
    boolean mo1877b();

    /* renamed from: c */
    void mo1872c();

    /* renamed from: c */
    void mo1871c(int i);

    void collapseActionView();

    /* renamed from: d */
    void mo1868d(int i);

    /* renamed from: d */
    boolean mo1869d();

    /* renamed from: e */
    boolean mo1866e();

    /* renamed from: f */
    boolean mo1864f();

    /* renamed from: g */
    void mo1863g();

    CharSequence getTitle();

    /* renamed from: h */
    int mo1862h();

    /* renamed from: i */
    void mo1861i();

    /* renamed from: j */
    Menu mo1860j();

    /* renamed from: k */
    boolean mo1859k();

    /* renamed from: l */
    ViewGroup mo1858l();

    /* renamed from: m */
    void mo1857m();

    /* renamed from: n */
    Context mo1856n();

    /* renamed from: o */
    int mo1855o();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
