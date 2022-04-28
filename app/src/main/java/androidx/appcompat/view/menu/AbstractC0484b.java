package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0484b implements AbstractC0513p {

    /* renamed from: b */
    protected Context f1634b;

    /* renamed from: c */
    protected Context f1635c;

    /* renamed from: d */
    protected C0496h f1636d;

    /* renamed from: e */
    protected LayoutInflater f1637e;

    /* renamed from: f */
    private AbstractC0513p.AbstractC0514a f1638f;

    /* renamed from: g */
    private int f1639g;

    /* renamed from: h */
    private int f1640h;

    /* renamed from: i */
    protected AbstractC0515q f1641i;

    /* renamed from: j */
    private int f1642j;

    public AbstractC0484b(Context context, int i, int i2) {
        this.f1634b = context;
        this.f1637e = LayoutInflater.from(context);
        this.f1639g = i;
        this.f1640h = i2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public int mo136a() {
        return this.f1642j;
    }

    /* renamed from: a */
    public View mo2132a(C0501k kVar, View view, ViewGroup viewGroup) {
        AbstractC0515q.AbstractC0516a a = view instanceof AbstractC0515q.AbstractC0516a ? (AbstractC0515q.AbstractC0516a) view : m2445a(viewGroup);
        mo2131a(kVar, a);
        return (View) a;
    }

    /* renamed from: a */
    public AbstractC0515q.AbstractC0516a m2445a(ViewGroup viewGroup) {
        return (AbstractC0515q.AbstractC0516a) this.f1637e.inflate(this.f1640h, viewGroup, false);
    }

    /* renamed from: a */
    public void m2447a(int i) {
        this.f1642j = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo133a(Context context, C0496h hVar) {
        this.f1635c = context;
        LayoutInflater.from(this.f1635c);
        this.f1636d = hVar;
    }

    /* renamed from: a */
    protected void m2446a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1641i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo126a(C0496h hVar, boolean z) {
        AbstractC0513p.AbstractC0514a aVar = this.f1638f;
        if (aVar != null) {
            aVar.mo2108a(hVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo2131a(C0501k kVar, AbstractC0515q.AbstractC0516a aVar);

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo2308a(AbstractC0513p.AbstractC0514a aVar) {
        this.f1638f = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public void mo123a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1641i;
        if (viewGroup != null) {
            C0496h hVar = this.f1636d;
            int i = 0;
            if (hVar != null) {
                hVar.m2401b();
                ArrayList<C0501k> n = this.f1636d.m2375n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0501k kVar = n.get(i3);
                    if (mo2137a(i2, kVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0501k itemData = childAt instanceof AbstractC0515q.AbstractC0516a ? ((AbstractC0515q.AbstractC0516a) childAt).getItemData() : null;
                        View a = mo2132a(kVar, childAt, viewGroup);
                        if (kVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            m2446a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo2133a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo2137a(int i, C0501k kVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2133a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo127a(C0496h hVar, C0501k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: a */
    public boolean mo124a(SubMenuC0523v vVar) {
        AbstractC0513p.AbstractC0514a aVar = this.f1638f;
        if (aVar != null) {
            return aVar.mo2109a(vVar);
        }
        return false;
    }

    /* renamed from: b */
    public AbstractC0515q mo2128b(ViewGroup viewGroup) {
        if (this.f1641i == null) {
            this.f1641i = (AbstractC0515q) this.f1637e.inflate(this.f1639g, viewGroup, false);
            this.f1641i.mo142a(this.f1636d);
            mo123a(true);
        }
        return this.f1641i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0513p
    /* renamed from: b */
    public boolean mo119b(C0496h hVar, C0501k kVar) {
        return false;
    }

    /* renamed from: d */
    public AbstractC0513p.AbstractC0514a m2444d() {
        return this.f1638f;
    }
}
