package p000a.p001a.p004l.p005a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

/* renamed from: a.a.l.a.e */
/* loaded from: classes.dex */
class C0026e extends C0020b {

    /* renamed from: n */
    private C0027a f83n;

    /* renamed from: o */
    private boolean f84o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.e$a */
    /* loaded from: classes.dex */
    public static class C0027a extends C0020b.AbstractC0023c {

        /* renamed from: J */
        int[][] f85J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0027a(C0027a aVar, C0026e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f85J = aVar.f85J;
            } else {
                this.f85J = new int[m4214c()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m4189a(int[] iArr) {
            int[][] iArr2 = this.f85J;
            int d = m4212d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m4188a(int[] iArr, Drawable drawable) {
            int a = m4221a(drawable);
            this.f85J[a] = iArr;
            return a;
        }

        @Override // p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: a */
        public void mo4190a(int i, int i2) {
            super.mo4190a(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f85J, 0, iArr, 0, i);
            this.f85J = iArr;
        }

        @Override // p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: m */
        void mo4187m() {
            int[][] iArr = this.f85J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f85J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f85J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0026e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0026e(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0026e(C0027a aVar) {
        if (aVar != null) {
            mo4192a(aVar);
        }
    }

    C0026e(C0027a aVar, Resources resources) {
        mo4192a(new C0027a(aVar, this, resources));
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    public C0027a mo4193a() {
        return new C0027a(this.f83n, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    public void mo4192a(C0020b.AbstractC0023c cVar) {
        super.mo4192a(cVar);
        if (cVar instanceof C0027a) {
            this.f83n = (C0027a) cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] m4191a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                i++;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f84o) {
            super.mutate();
            if (this == this) {
                this.f83n.mo4187m();
                this.f84o = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a = this.f83n.m4189a(iArr);
        if (a < 0) {
            a = this.f83n.m4189a(StateSet.WILD_CARD);
        }
        return m4234a(a) || onStateChange;
    }
}
