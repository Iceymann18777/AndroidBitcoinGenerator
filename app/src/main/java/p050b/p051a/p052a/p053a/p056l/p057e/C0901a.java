package p050b.p051a.p052a.p053a.p056l.p057e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p000a.p011c.p012a.C0056a;
import p050b.p051a.p052a.p053a.p056l.AbstractC0895d;
import p050b.p051a.p052a.p053a.p056l.C0893c;

/* renamed from: b.a.a.a.l.e.a */
/* loaded from: classes.dex */
public class C0901a extends C0056a implements AbstractC0895d {

    /* renamed from: g */
    private final C0893c f3343g;

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    /* renamed from: a */
    public void mo412a() {
        this.f3343g.m423b();
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    /* renamed from: b */
    public void mo411b() {
        this.f3343g.m428a();
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C0893c cVar = this.f3343g;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.m426a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f3343g.m422c();
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public int getCircularRevealScrimColor() {
        this.f3343g.m421d();
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public AbstractC0895d.C0900e getRevealInfo() {
        this.f3343g.m420e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C0893c cVar = this.f3343g;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.m419f();
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f3343g.m425a(drawable);
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public void setCircularRevealScrimColor(int i) {
        this.f3343g.m427a(i);
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public void setRevealInfo(AbstractC0895d.C0900e eVar) {
        this.f3343g.m424a(eVar);
        throw null;
    }
}
