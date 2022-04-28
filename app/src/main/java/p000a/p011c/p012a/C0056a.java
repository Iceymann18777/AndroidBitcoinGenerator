package p000a.p011c.p012a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: a.c.a.a */
/* loaded from: classes.dex */
public class C0056a extends FrameLayout {

    /* renamed from: f */
    private static final AbstractC0063f f178f;

    /* renamed from: b */
    private boolean f179b;

    /* renamed from: c */
    private boolean f180c;

    /* renamed from: d */
    final Rect f181d;

    /* renamed from: e */
    private final AbstractC0062e f182e;

    static {
        new int[1][0] = 16842801;
        int i = Build.VERSION.SDK_INT;
        f178f = i >= 21 ? new C0059c() : i >= 17 ? new C0057b() : new C0060d();
        f178f.mo4122a();
    }

    public ColorStateList getCardBackgroundColor() {
        return f178f.mo4110h(this.f182e);
    }

    public float getCardElevation() {
        return f178f.mo4113e(this.f182e);
    }

    public int getContentPaddingBottom() {
        return this.f181d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f181d.left;
    }

    public int getContentPaddingRight() {
        return this.f181d.right;
    }

    public int getContentPaddingTop() {
        return this.f181d.top;
    }

    public float getMaxCardElevation() {
        return f178f.mo4121a(this.f182e);
    }

    public boolean getPreventCornerOverlap() {
        return this.f180c;
    }

    public float getRadius() {
        return f178f.mo4118b(this.f182e);
    }

    public boolean getUseCompatPadding() {
        return this.f179b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(f178f instanceof C0059c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f178f.mo4112f(this.f182e)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f178f.mo4114d(this.f182e)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f178f.mo4119a(this.f182e, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f178f.mo4119a(this.f182e, colorStateList);
    }

    public void setCardElevation(float f) {
        f178f.mo4120a(this.f182e, f);
    }

    public void setMaxCardElevation(float f) {
        f178f.mo4117b(this.f182e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f180c) {
            this.f180c = z;
            f178f.mo4116c(this.f182e);
        }
    }

    public void setRadius(float f) {
        f178f.mo4115c(this.f182e, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f179b != z) {
            this.f179b = z;
            f178f.mo4111g(this.f182e);
        }
    }
}
