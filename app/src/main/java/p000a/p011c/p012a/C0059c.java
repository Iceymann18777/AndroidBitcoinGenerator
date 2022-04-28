package p000a.p011c.p012a;

import android.content.res.ColorStateList;

/* renamed from: a.c.a.c */
/* loaded from: classes.dex */
class C0059c implements AbstractC0063f {
    /* renamed from: j */
    private C0064g m4131j(AbstractC0062e eVar) {
        return (C0064g) eVar.m4124c();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public float mo4121a(AbstractC0062e eVar) {
        return m4131j(eVar).m4103b();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4122a() {
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4120a(AbstractC0062e eVar, float f) {
        eVar.m4128a().setElevation(f);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4119a(AbstractC0062e eVar, ColorStateList colorStateList) {
        m4131j(eVar).m4106a(colorStateList);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: b */
    public float mo4118b(AbstractC0062e eVar) {
        return m4131j(eVar).m4101c();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: b */
    public void mo4117b(AbstractC0062e eVar, float f) {
        m4131j(eVar).m4107a(f, eVar.m4125b(), eVar.m4123d());
        m4132i(eVar);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: c */
    public void mo4116c(AbstractC0062e eVar) {
        mo4117b(eVar, mo4121a(eVar));
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: c */
    public void mo4115c(AbstractC0062e eVar, float f) {
        m4131j(eVar).m4108a(f);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: d */
    public float mo4114d(AbstractC0062e eVar) {
        return mo4118b(eVar) * 2.0f;
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: e */
    public float mo4113e(AbstractC0062e eVar) {
        return eVar.m4128a().getElevation();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: f */
    public float mo4112f(AbstractC0062e eVar) {
        return mo4118b(eVar) * 2.0f;
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: g */
    public void mo4111g(AbstractC0062e eVar) {
        mo4117b(eVar, mo4121a(eVar));
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: h */
    public ColorStateList mo4110h(AbstractC0062e eVar) {
        return m4131j(eVar).m4109a();
    }

    /* renamed from: i */
    public void m4132i(AbstractC0062e eVar) {
        if (!eVar.m4125b()) {
            eVar.m4126a(0, 0, 0, 0);
            return;
        }
        float a = mo4121a(eVar);
        float b = mo4118b(eVar);
        int ceil = (int) Math.ceil(C0065h.m4097a(a, b, eVar.m4123d()));
        int ceil2 = (int) Math.ceil(C0065h.m4090b(a, b, eVar.m4123d()));
        eVar.m4126a(ceil, ceil2, ceil, ceil2);
    }
}
