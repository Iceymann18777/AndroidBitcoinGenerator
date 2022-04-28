package p050b.p051a.p052a.p053a.p054j;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: b.a.a.a.j.i */
/* loaded from: classes.dex */
public class C0885i {

    /* renamed from: a */
    private long f3294a;

    /* renamed from: b */
    private long f3295b;

    /* renamed from: c */
    private TimeInterpolator f3296c;

    /* renamed from: d */
    private int f3297d;

    /* renamed from: e */
    private int f3298e;

    public C0885i(long j, long j2) {
        this.f3294a = 0L;
        this.f3295b = 300L;
        this.f3296c = null;
        this.f3297d = 0;
        this.f3298e = 1;
        this.f3294a = j;
        this.f3295b = j2;
    }

    public C0885i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f3294a = 0L;
        this.f3295b = 300L;
        this.f3296c = null;
        this.f3297d = 0;
        this.f3298e = 1;
        this.f3294a = j;
        this.f3295b = j2;
        this.f3296c = timeInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0885i m464a(ValueAnimator valueAnimator) {
        C0885i iVar = new C0885i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m462b(valueAnimator));
        iVar.f3297d = valueAnimator.getRepeatCount();
        iVar.f3298e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: b */
    private static TimeInterpolator m462b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C0877a.f3281a : interpolator instanceof AccelerateInterpolator ? C0877a.f3282b : interpolator instanceof DecelerateInterpolator ? C0877a.f3283c : interpolator;
    }

    /* renamed from: a */
    public long m466a() {
        return this.f3294a;
    }

    /* renamed from: a */
    public void m465a(Animator animator) {
        animator.setStartDelay(m466a());
        animator.setDuration(m463b());
        animator.setInterpolator(m461c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m460d());
            valueAnimator.setRepeatMode(m459e());
        }
    }

    /* renamed from: b */
    public long m463b() {
        return this.f3295b;
    }

    /* renamed from: c */
    public TimeInterpolator m461c() {
        TimeInterpolator timeInterpolator = this.f3296c;
        return timeInterpolator != null ? timeInterpolator : C0877a.f3281a;
    }

    /* renamed from: d */
    public int m460d() {
        return this.f3297d;
    }

    /* renamed from: e */
    public int m459e() {
        return this.f3298e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0885i.class != obj.getClass()) {
            return false;
        }
        C0885i iVar = (C0885i) obj;
        if (m466a() == iVar.m466a() && m463b() == iVar.m463b() && m460d() == iVar.m460d() && m459e() == iVar.m459e()) {
            return m461c().getClass().equals(iVar.m461c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (m466a() ^ (m466a() >>> 32))) * 31) + ((int) (m463b() ^ (m463b() >>> 32)))) * 31) + m461c().getClass().hashCode()) * 31) + m460d()) * 31) + m459e();
    }

    public String toString() {
        return '\n' + C0885i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m466a() + " duration: " + m463b() + " interpolator: " + m461c().getClass() + " repeatCount: " + m460d() + " repeatMode: " + m459e() + "}\n";
    }
}
