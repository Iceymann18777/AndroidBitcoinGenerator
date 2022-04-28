package p000a.p011c.p012a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: a.c.a.d */
/* loaded from: classes.dex */
class C0060d implements AbstractC0063f {

    /* renamed from: a */
    final RectF f183a = new RectF();

    /* renamed from: a.c.a.d$a */
    /* loaded from: classes.dex */
    class C0061a implements C0065h.AbstractC0066a {
        C0061a() {
        }

        @Override // p000a.p011c.p012a.C0065h.AbstractC0066a
        /* renamed from: a */
        public void mo4080a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0060d.this.f183a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C0060d.this.f183a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0060d.this.f183a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0060d.this.f183a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0060d.this.f183a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    /* renamed from: j */
    private C0065h m4129j(AbstractC0062e eVar) {
        return (C0065h) eVar.m4124c();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public float mo4121a(AbstractC0062e eVar) {
        return m4129j(eVar).m4087c();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4122a() {
        C0065h.f197r = new C0061a();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4120a(AbstractC0062e eVar, float f) {
        m4129j(eVar).m4086c(f);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4119a(AbstractC0062e eVar, ColorStateList colorStateList) {
        m4129j(eVar).m4096a(colorStateList);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: b */
    public float mo4118b(AbstractC0062e eVar) {
        return m4129j(eVar).m4092b();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: b */
    public void mo4117b(AbstractC0062e eVar, float f) {
        m4129j(eVar).m4091b(f);
        m4130i(eVar);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: c */
    public void mo4116c(AbstractC0062e eVar) {
        m4129j(eVar).m4093a(eVar.m4123d());
        m4130i(eVar);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: c */
    public void mo4115c(AbstractC0062e eVar, float f) {
        m4129j(eVar).m4099a(f);
        m4130i(eVar);
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: d */
    public float mo4114d(AbstractC0062e eVar) {
        return m4129j(eVar).m4085d();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: e */
    public float mo4113e(AbstractC0062e eVar) {
        return m4129j(eVar).m4082f();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: f */
    public float mo4112f(AbstractC0062e eVar) {
        return m4129j(eVar).m4083e();
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: g */
    public void mo4111g(AbstractC0062e eVar) {
    }

    @Override // p000a.p011c.p012a.AbstractC0063f
    /* renamed from: h */
    public ColorStateList mo4110h(AbstractC0062e eVar) {
        return m4129j(eVar).m4100a();
    }

    /* renamed from: i */
    public void m4130i(AbstractC0062e eVar) {
        Rect rect = new Rect();
        m4129j(eVar).m4094a(rect);
        eVar.m4127a((int) Math.ceil(mo4112f(eVar)), (int) Math.ceil(mo4114d(eVar)));
        eVar.m4126a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
