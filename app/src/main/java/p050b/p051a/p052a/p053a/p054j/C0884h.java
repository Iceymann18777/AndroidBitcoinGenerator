package p050b.p051a.p052a.p053a.p054j;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p000a.p013d.C0080g;

/* renamed from: b.a.a.a.j.h */
/* loaded from: classes.dex */
public class C0884h {

    /* renamed from: a */
    private final C0080g<String, C0885i> f3293a = new C0080g<>();

    /* renamed from: a */
    public static C0884h m472a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m468a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m468a(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: a */
    private static C0884h m468a(List<Animator> list) {
        C0884h hVar = new C0884h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m471a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m471a(C0884h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.m469a(objectAnimator.getPropertyName(), C0885i.m464a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: a */
    public long m473a() {
        int size = this.f3293a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0885i d = this.f3293a.m4013d(i);
            j = Math.max(j, d.m466a() + d.m463b());
        }
        return j;
    }

    /* renamed from: a */
    public C0885i m470a(String str) {
        if (m467b(str)) {
            return this.f3293a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void m469a(String str, C0885i iVar) {
        this.f3293a.put(str, iVar);
    }

    /* renamed from: b */
    public boolean m467b(String str) {
        return this.f3293a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0884h.class != obj.getClass()) {
            return false;
        }
        return this.f3293a.equals(((C0884h) obj).f3293a);
    }

    public int hashCode() {
        return this.f3293a.hashCode();
    }

    public String toString() {
        return '\n' + C0884h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3293a + "}\n";
    }
}
