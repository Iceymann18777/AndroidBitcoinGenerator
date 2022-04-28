package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p000a.p001a.C0000a;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0637t extends RatingBar {

    /* renamed from: b */
    private final C0633r f2279b;

    public C0637t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.ratingBarStyle);
    }

    public C0637t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2279b = new C0633r(this);
        this.f2279b.mo1845a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f2279b.m1913a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
