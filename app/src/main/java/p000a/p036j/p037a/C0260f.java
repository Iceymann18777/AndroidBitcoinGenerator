package p000a.p036j.p037a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.j.a.f */
/* loaded from: classes.dex */
public class C0260f {

    /* renamed from: a */
    private final AbstractC0261g<?> f850a;

    private C0260f(AbstractC0261g<?> gVar) {
        this.f850a = gVar;
    }

    /* renamed from: a */
    public static C0260f m3165a(AbstractC0261g<?> gVar) {
        return new C0260f(gVar);
    }

    /* renamed from: a */
    public ComponentCallbacksC0248c m3158a(String str) {
        return this.f850a.f854d.m3059b(str);
    }

    /* renamed from: a */
    public View m3159a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f850a.f854d.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void m3167a() {
        this.f850a.f854d.m3043e();
    }

    /* renamed from: a */
    public void m3166a(ComponentCallbacksC0248c cVar) {
        AbstractC0261g<?> gVar = this.f850a;
        gVar.f854d.m3096a(gVar, gVar, cVar);
    }

    /* renamed from: a */
    public void m3164a(Configuration configuration) {
        this.f850a.f854d.m3089a(configuration);
    }

    /* renamed from: a */
    public void m3163a(Parcelable parcelable, C0282j jVar) {
        this.f850a.f854d.m3086a(parcelable, jVar);
    }

    /* renamed from: a */
    public void m3162a(Menu menu) {
        this.f850a.f854d.m3085a(menu);
    }

    /* renamed from: a */
    public void m3157a(boolean z) {
        this.f850a.f854d.m3072a(z);
    }

    /* renamed from: a */
    public boolean m3161a(Menu menu, MenuInflater menuInflater) {
        return this.f850a.f854d.m3084a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean m3160a(MenuItem menuItem) {
        return this.f850a.f854d.m3083a(menuItem);
    }

    /* renamed from: b */
    public void m3156b() {
        this.f850a.f854d.m3039f();
    }

    /* renamed from: b */
    public void m3153b(boolean z) {
        this.f850a.f854d.m3056b(z);
    }

    /* renamed from: b */
    public boolean m3155b(Menu menu) {
        return this.f850a.f854d.m3062b(menu);
    }

    /* renamed from: b */
    public boolean m3154b(MenuItem menuItem) {
        return this.f850a.f854d.m3061b(menuItem);
    }

    /* renamed from: c */
    public void m3152c() {
        this.f850a.f854d.m3036g();
    }

    /* renamed from: d */
    public void m3151d() {
        this.f850a.f854d.m3030i();
    }

    /* renamed from: e */
    public void m3150e() {
        this.f850a.f854d.m3028j();
    }

    /* renamed from: f */
    public void m3149f() {
        this.f850a.f854d.m3026k();
    }

    /* renamed from: g */
    public void m3148g() {
        this.f850a.f854d.m3024l();
    }

    /* renamed from: h */
    public void m3147h() {
        this.f850a.f854d.m3022m();
    }

    /* renamed from: i */
    public boolean m3146i() {
        return this.f850a.f854d.m3018o();
    }

    /* renamed from: j */
    public AbstractC0262h m3145j() {
        return this.f850a.m3135d();
    }

    /* renamed from: k */
    public void m3144k() {
        this.f850a.f854d.m3013r();
    }

    /* renamed from: l */
    public C0282j m3143l() {
        return this.f850a.f854d.m3011t();
    }

    /* renamed from: m */
    public Parcelable m3142m() {
        return this.f850a.f854d.m3010u();
    }
}
