package p000a.p045n;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.n.q */
/* loaded from: classes.dex */
public class C0379q extends AbstractC0367m {

    /* renamed from: M */
    int f1158M;

    /* renamed from: K */
    private ArrayList<AbstractC0367m> f1156K = new ArrayList<>();

    /* renamed from: L */
    private boolean f1157L = true;

    /* renamed from: N */
    boolean f1159N = false;

    /* renamed from: O */
    private int f1160O = 0;

    /* renamed from: a.n.q$a */
    /* loaded from: classes.dex */
    class C0380a extends C0374n {

        /* renamed from: a */
        final /* synthetic */ AbstractC0367m f1161a;

        C0380a(C0379q qVar, AbstractC0367m mVar) {
            this.f1161a = mVar;
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(AbstractC0367m mVar) {
            this.f1161a.mo2779n();
            mVar.mo2785b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.n.q$b */
    /* loaded from: classes.dex */
    public static class C0381b extends C0374n {

        /* renamed from: a */
        C0379q f1162a;

        C0381b(C0379q qVar) {
            this.f1162a = qVar;
        }

        @Override // p000a.p045n.C0374n, p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: a */
        public void mo2776a(AbstractC0367m mVar) {
            C0379q qVar = this.f1162a;
            if (!qVar.f1159N) {
                qVar.m2812o();
                this.f1162a.f1159N = true;
            }
        }

        @Override // p000a.p045n.AbstractC0367m.AbstractC0373f
        /* renamed from: b */
        public void mo2775b(AbstractC0367m mVar) {
            C0379q qVar = this.f1162a;
            qVar.f1158M--;
            if (qVar.f1158M == 0) {
                qVar.f1159N = false;
                qVar.m2844a();
            }
            mVar.mo2785b(this);
        }
    }

    /* renamed from: q */
    private void m2777q() {
        C0381b bVar = new C0381b(this);
        Iterator<AbstractC0367m> it = this.f1156K.iterator();
        while (it.hasNext()) {
            it.next().mo2795a(bVar);
        }
        this.f1158M = this.f1156K.size();
    }

    /* renamed from: a */
    public AbstractC0367m m2799a(int i) {
        if (i < 0 || i >= this.f1156K.size()) {
            return null;
        }
        return this.f1156K.get(i);
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public C0379q mo2798a(long j) {
        super.mo2798a(j);
        if (this.f1118d >= 0) {
            int size = this.f1156K.size();
            for (int i = 0; i < size; i++) {
                this.f1156K.get(i).mo2798a(j);
            }
        }
        return this;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public C0379q mo2795a(AbstractC0367m.AbstractC0373f fVar) {
        super.mo2795a(fVar);
        return this;
    }

    /* renamed from: a */
    public C0379q m2794a(AbstractC0367m mVar) {
        this.f1156K.add(mVar);
        mVar.f1133s = this;
        long j = this.f1118d;
        if (j >= 0) {
            mVar.mo2798a(j);
        }
        if ((this.f1160O & 1) != 0) {
            mVar.mo2791a(m2822d());
        }
        if ((this.f1160O & 2) != 0) {
            mVar.mo2793a(m2819g());
        }
        if ((this.f1160O & 4) != 0) {
            mVar.mo2797a(m2820f());
        }
        if ((this.f1160O & 8) != 0) {
            mVar.mo2796a(m2824c());
        }
        return this;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public C0379q mo2791a(TimeInterpolator timeInterpolator) {
        this.f1160O |= 1;
        ArrayList<AbstractC0367m> arrayList = this.f1156K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1156K.get(i).mo2791a(timeInterpolator);
            }
        }
        super.mo2791a(timeInterpolator);
        return this;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public C0379q mo2790a(View view) {
        for (int i = 0; i < this.f1156K.size(); i++) {
            this.f1156K.get(i).mo2790a(view);
        }
        super.mo2790a(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public String mo2788a(String str) {
        String a = super.mo2788a(str);
        for (int i = 0; i < this.f1156K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            sb.append(this.f1156K.get(i).mo2788a(str + "  "));
            a = sb.toString();
        }
        return a;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2797a(AbstractC0352g gVar) {
        super.mo2797a(gVar);
        this.f1160O |= 4;
        for (int i = 0; i < this.f1156K.size(); i++) {
            this.f1156K.get(i).mo2797a(gVar);
        }
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2796a(AbstractC0367m.AbstractC0372e eVar) {
        super.mo2796a(eVar);
        this.f1160O |= 8;
        int size = this.f1156K.size();
        for (int i = 0; i < size; i++) {
            this.f1156K.get(i).mo2796a(eVar);
        }
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2793a(AbstractC0378p pVar) {
        super.mo2793a(pVar);
        this.f1160O |= 2;
        int size = this.f1156K.size();
        for (int i = 0; i < size; i++) {
            this.f1156K.get(i).mo2793a(pVar);
        }
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2792a(C0383s sVar) {
        if (m2826b(sVar.f1167b)) {
            Iterator<AbstractC0367m> it = this.f1156K.iterator();
            while (it.hasNext()) {
                AbstractC0367m next = it.next();
                if (next.m2826b(sVar.f1167b)) {
                    next.mo2792a(sVar);
                    sVar.f1168c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: a */
    public void mo2789a(ViewGroup viewGroup, C0384t tVar, C0384t tVar2, ArrayList<C0383s> arrayList, ArrayList<C0383s> arrayList2) {
        long h = m2818h();
        int size = this.f1156K.size();
        for (int i = 0; i < size; i++) {
            AbstractC0367m mVar = this.f1156K.get(i);
            if (h > 0 && (this.f1157L || i == 0)) {
                long h2 = mVar.m2818h();
                if (h2 > 0) {
                    mVar.mo2786b(h2 + h);
                } else {
                    mVar.mo2786b(h);
                }
            }
            mVar.mo2789a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: b */
    public C0379q m2787b(int i) {
        if (i == 0) {
            this.f1157L = true;
        } else if (i == 1) {
            this.f1157L = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: b */
    public C0379q mo2786b(long j) {
        super.mo2786b(j);
        return this;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: b */
    public C0379q mo2785b(AbstractC0367m.AbstractC0373f fVar) {
        super.mo2785b(fVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: b */
    public void mo2784b(C0383s sVar) {
        super.mo2784b(sVar);
        int size = this.f1156K.size();
        for (int i = 0; i < size; i++) {
            this.f1156K.get(i).mo2784b(sVar);
        }
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2783c(C0383s sVar) {
        if (m2826b(sVar.f1167b)) {
            Iterator<AbstractC0367m> it = this.f1156K.iterator();
            while (it.hasNext()) {
                AbstractC0367m next = it.next();
                if (next.m2826b(sVar.f1167b)) {
                    next.mo2783c(sVar);
                    sVar.f1168c.add(next);
                }
            }
        }
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: c */
    public void mo2782c(View view) {
        super.mo2782c(view);
        int size = this.f1156K.size();
        for (int i = 0; i < size; i++) {
            this.f1156K.get(i).mo2782c(view);
        }
    }

    @Override // p000a.p045n.AbstractC0367m
    public AbstractC0367m clone() {
        C0379q qVar = (C0379q) super.clone();
        qVar.f1156K = new ArrayList<>();
        int size = this.f1156K.size();
        for (int i = 0; i < size; i++) {
            qVar.m2794a(this.f1156K.get(i).clone());
        }
        return qVar;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: d */
    public C0379q mo2781d(View view) {
        for (int i = 0; i < this.f1156K.size(); i++) {
            this.f1156K.get(i).mo2781d(view);
        }
        super.mo2781d(view);
        return this;
    }

    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: e */
    public void mo2780e(View view) {
        super.mo2780e(view);
        int size = this.f1156K.size();
        for (int i = 0; i < size; i++) {
            this.f1156K.get(i).mo2780e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p045n.AbstractC0367m
    /* renamed from: n */
    public void mo2779n() {
        if (this.f1156K.isEmpty()) {
            m2812o();
            m2844a();
            return;
        }
        m2777q();
        if (!this.f1157L) {
            for (int i = 1; i < this.f1156K.size(); i++) {
                this.f1156K.get(i - 1).mo2795a(new C0380a(this, this.f1156K.get(i)));
            }
            AbstractC0367m mVar = this.f1156K.get(0);
            if (mVar != null) {
                mVar.mo2779n();
                return;
            }
            return;
        }
        Iterator<AbstractC0367m> it = this.f1156K.iterator();
        while (it.hasNext()) {
            it.next().mo2779n();
        }
    }

    /* renamed from: p */
    public int m2778p() {
        return this.f1156K.size();
    }
}
