package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000a.p014e.p015a.p016j.C0094b;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0664a extends AbstractC0665b {

    /* renamed from: h */
    private int f2465h;

    /* renamed from: i */
    private int f2466i;

    /* renamed from: j */
    private C0094b f2467j;

    public C0664a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0665b
    /* renamed from: a */
    public void mo1746a(AttributeSet attributeSet) {
        super.mo1746a(attributeSet);
        this.f2467j = new C0094b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0674h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0674h.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0674h.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2467j.m3907c(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f2471e = this.f2467j;
        m1747a();
    }

    public int getType() {
        return this.f2465h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2467j.m3907c(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r6 == 6) goto L_0x0012;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r6 == 6) goto L_0x0017;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r6 == 6) goto L_0x0017;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setType(int r6) {
        /*
            r5 = this;
            r5.f2465h = r6
            r5.f2466i = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 6
            r1 = 5
            r2 = 0
            r3 = 1
            r4 = 17
            if (r6 >= r4) goto L_0x001a
            int r6 = r5.f2465h
            if (r6 != r1) goto L_0x0015
        L_0x0012:
            r5.f2466i = r2
            goto L_0x003d
        L_0x0015:
            if (r6 != r0) goto L_0x003d
        L_0x0017:
            r5.f2466i = r3
            goto L_0x003d
        L_0x001a:
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.getLayoutDirection()
            if (r3 != r6) goto L_0x002a
            r6 = 1
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            if (r6 == 0) goto L_0x0035
            int r6 = r5.f2465h
            if (r6 != r1) goto L_0x0032
            goto L_0x0017
        L_0x0032:
            if (r6 != r0) goto L_0x003d
            goto L_0x0012
        L_0x0035:
            int r6 = r5.f2465h
            if (r6 != r1) goto L_0x003a
            goto L_0x0012
        L_0x003a:
            if (r6 != r0) goto L_0x003d
            goto L_0x0017
        L_0x003d:
            a.e.a.j.b r6 = r5.f2467j
            int r0 = r5.f2466i
            r6.m3906t(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0664a.setType(int):void");
    }
}
