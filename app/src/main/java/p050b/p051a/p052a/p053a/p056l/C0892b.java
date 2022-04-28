package p050b.p051a.p052a.p053a.p056l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* renamed from: b.a.a.a.l.b */
/* loaded from: classes.dex */
public class C0892b extends FrameLayout implements AbstractC0895d {

    /* renamed from: b */
    private final C0893c f3334b;

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    /* renamed from: a */
    public void mo412a() {
        this.f3334b.m423b();
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    /* renamed from: b */
    public void mo411b() {
        this.f3334b.m428a();
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C0893c cVar = this.f3334b;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.m426a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f3334b.m422c();
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public int getCircularRevealScrimColor() {
        this.f3334b.m421d();
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public AbstractC0895d.C0900e getRevealInfo() {
        this.f3334b.m420e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C0893c cVar = this.f3334b;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.m419f();
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f3334b.m425a(drawable);
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public void setCircularRevealScrimColor(int i) {
        this.f3334b.m427a(i);
        throw null;
    }

    @Override // p050b.p051a.p052a.p053a.p056l.AbstractC0895d
    public void setRevealInfo(AbstractC0895d.C0900e eVar) {
        this.f3334b.m424a(eVar);
        throw null;
    }
}
