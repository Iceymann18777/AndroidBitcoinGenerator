package p000a.p011c.p012a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: a.c.a.b */
/* loaded from: classes.dex */
class C0057b extends C0060d {

    /* renamed from: a.c.a.b$a */
    /* loaded from: classes.dex */
    class C0058a implements C0065h.AbstractC0066a {
        C0058a(C0057b bVar) {
        }

        @Override // p000a.p011c.p012a.C0065h.AbstractC0066a
        /* renamed from: a */
        public void mo4080a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // p000a.p011c.p012a.C0060d, p000a.p011c.p012a.AbstractC0063f
    /* renamed from: a */
    public void mo4122a() {
        C0065h.f197r = new C0058a(this);
    }
}
