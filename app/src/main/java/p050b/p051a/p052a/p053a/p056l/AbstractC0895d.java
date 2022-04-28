package p050b.p051a.p052a.p053a.p056l;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

import p050b.p051a.p052a.p053a.p059n.C0905a;

/* renamed from: b.a.a.a.l.d */
/* loaded from: classes.dex */
public interface AbstractC0895d extends C0893c.AbstractC0894a {

    /* renamed from: b.a.a.a.l.d$b */
    /* loaded from: classes.dex */
    public static class C0897b implements TypeEvaluator<C0900e> {

        /* renamed from: b */
        public static final TypeEvaluator<C0900e> f3336b = new C0897b();

        /* renamed from: a */
        private final C0900e f3337a = new C0900e();

        /* renamed from: a */
        public C0900e evaluate(float f, C0900e eVar, C0900e eVar2) {
            this.f3337a.m413a(C0905a.m405a(eVar.f3340a, eVar2.f3340a, f), C0905a.m405a(eVar.f3341b, eVar2.f3341b, f), C0905a.m405a(eVar.f3342c, eVar2.f3342c, f));
            return this.f3337a;
        }
    }

    /* renamed from: b.a.a.a.l.d$c */
    /* loaded from: classes.dex */
    public static class C0898c extends Property<AbstractC0895d, C0900e> {

        /* renamed from: a */
        public static final Property<AbstractC0895d, C0900e> f3338a = new C0898c("circularReveal");

        private C0898c(String str) {
            super(C0900e.class, str);
        }

        /* renamed from: a */
        public C0900e get(AbstractC0895d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(AbstractC0895d dVar, C0900e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: b.a.a.a.l.d$d */
    /* loaded from: classes.dex */
    public static class C0899d extends Property<AbstractC0895d, Integer> {

        /* renamed from: a */
        public static final Property<AbstractC0895d, Integer> f3339a = new C0899d("circularRevealScrimColor");

        private C0899d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(AbstractC0895d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(AbstractC0895d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: b.a.a.a.l.d$e */
    /* loaded from: classes.dex */
    public static class C0900e {

        /* renamed from: a */
        public float f3340a;

        /* renamed from: b */
        public float f3341b;

        /* renamed from: c */
        public float f3342c;

        private C0900e() {
        }

        public C0900e(float f, float f2, float f3) {
            this.f3340a = f;
            this.f3341b = f2;
            this.f3342c = f3;
        }

        /* renamed from: a */
        public void m413a(float f, float f2, float f3) {
            this.f3340a = f;
            this.f3341b = f2;
            this.f3342c = f3;
        }
    }

    /* renamed from: a */
    void mo412a();

    /* renamed from: b */
    void mo411b();

    int getCircularRevealScrimColor();

    C0900e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C0900e eVar);
}
