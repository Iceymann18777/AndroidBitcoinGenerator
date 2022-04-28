package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p018g.p019d.p020c.C0136f;

/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
public class C0638t0 {

    /* renamed from: a */
    private final Context f2280a;

    /* renamed from: b */
    private final TypedArray f2281b;

    /* renamed from: c */
    private TypedValue f2282c;

    private C0638t0(Context context, TypedArray typedArray) {
        this.f2280a = context;
        this.f2281b = typedArray;
    }

    /* renamed from: a */
    public static C0638t0 m1902a(Context context, int i, int[] iArr) {
        return new C0638t0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0638t0 m1901a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0638t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0638t0 m1900a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0638t0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float m1906a(int i, float f) {
        return this.f2281b.getFloat(i, f);
    }

    /* renamed from: a */
    public int m1905a(int i, int i2) {
        return this.f2281b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList m1907a(int i) {
        int resourceId;
        ColorStateList b;
        return (!this.f2281b.hasValue(i) || (resourceId = this.f2281b.getResourceId(i, 0)) == 0 || (b = C0010a.m4260b(this.f2280a, resourceId)) == null) ? this.f2281b.getColorStateList(i) : b;
    }

    /* renamed from: a */
    public Typeface m1904a(int i, int i2, C0136f.AbstractC0137a aVar) {
        int resourceId = this.f2281b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2282c == null) {
            this.f2282c = new TypedValue();
        }
        return C0136f.m3687a(this.f2280a, resourceId, this.f2282c, i2, aVar);
    }

    /* renamed from: a */
    public void m1908a() {
        this.f2281b.recycle();
    }

    /* renamed from: a */
    public boolean m1903a(int i, boolean z) {
        return this.f2281b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m1898b(int i, int i2) {
        return this.f2281b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: b */
    public Drawable m1899b(int i) {
        int resourceId;
        return (!this.f2281b.hasValue(i) || (resourceId = this.f2281b.getResourceId(i, 0)) == 0) ? this.f2281b.getDrawable(i) : C0010a.m4259c(this.f2280a, resourceId);
    }

    /* renamed from: c */
    public int m1896c(int i, int i2) {
        return this.f2281b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable m1897c(int i) {
        int resourceId;
        if (!this.f2281b.hasValue(i) || (resourceId = this.f2281b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0606j.m2013a().m2006a(this.f2280a, resourceId, true);
    }

    /* renamed from: d */
    public int m1894d(int i, int i2) {
        return this.f2281b.getInt(i, i2);
    }

    /* renamed from: d */
    public String m1895d(int i) {
        return this.f2281b.getString(i);
    }

    /* renamed from: e */
    public int m1892e(int i, int i2) {
        return this.f2281b.getInteger(i, i2);
    }

    /* renamed from: e */
    public CharSequence m1893e(int i) {
        return this.f2281b.getText(i);
    }

    /* renamed from: f */
    public int m1890f(int i, int i2) {
        return this.f2281b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] m1891f(int i) {
        return this.f2281b.getTextArray(i);
    }

    /* renamed from: g */
    public int m1888g(int i, int i2) {
        return this.f2281b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean m1889g(int i) {
        return this.f2281b.hasValue(i);
    }
}
