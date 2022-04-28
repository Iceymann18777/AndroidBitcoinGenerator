package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public class C0671e extends View {
    public C0671e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0662a aVar = (ConstraintLayout.C0662a) getLayoutParams();
        aVar.f2426a = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0662a aVar = (ConstraintLayout.C0662a) getLayoutParams();
        aVar.f2428b = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0662a aVar = (ConstraintLayout.C0662a) getLayoutParams();
        aVar.f2430c = f;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
