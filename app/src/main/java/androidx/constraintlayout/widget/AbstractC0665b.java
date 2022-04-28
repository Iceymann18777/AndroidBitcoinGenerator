package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import p000a.p014e.p015a.p016j.C0109j;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0665b extends View {

    /* renamed from: c */
    protected int f2469c;

    /* renamed from: d */
    protected Context f2470d;

    /* renamed from: e */
    protected C0109j f2471e;

    /* renamed from: g */
    private String f2473g;

    /* renamed from: b */
    protected int[] f2468b = new int[32];

    /* renamed from: f */
    protected boolean f2472f = false;

    public AbstractC0665b(Context context) {
        super(context);
        this.f2470d = context;
        mo1746a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m1744a(String str) {
        int i;
        Object a;
        if (str != null && this.f2470d != null) {
            String trim = str.trim();
            try {
                i = C0673g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f2470d.getResources().getIdentifier(trim, "id", this.f2470d.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) getParent()).m1758a(0, trim)) != null && (a instanceof Integer)) {
                i = ((Integer) a).intValue();
            }
            if (i != 0) {
                setTag(i, null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1744a(str.substring(i));
                    return;
                } else {
                    m1744a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void m1747a() {
        if (this.f2471e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0662a) {
                ((ConstraintLayout.C0662a) layoutParams).f2447k0 = this.f2471e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1746a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0674h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0674h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f2473g = obtainStyledAttributes.getString(index);
                    setIds(this.f2473g);
                }
            }
        }
    }

    /* renamed from: a */
    public void m1745a(ConstraintLayout constraintLayout) {
    }

    /* renamed from: b */
    public void m1743b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void m1742c(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f2473g);
        }
        C0109j jVar = this.f2471e;
        if (jVar != null) {
            jVar.m3773J();
            for (int i = 0; i < this.f2469c; i++) {
                View a = constraintLayout.m1760a(this.f2468b[i]);
                if (a != null) {
                    this.f2471e.m3772b(constraintLayout.m1755a(a));
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2468b, this.f2469c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f2472f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2469c = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.f2469c + 1;
        int[] iArr = this.f2468b;
        if (i2 > iArr.length) {
            this.f2468b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2468b;
        int i3 = this.f2469c;
        iArr2[i3] = i;
        this.f2469c = i3 + 1;
    }
}
