package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements AbstractC0586e0 {

    /* renamed from: b */
    private AbstractC0586e0.AbstractC0587a f1895b;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        AbstractC0586e0.AbstractC0587a aVar = this.f1895b;
        if (aVar != null) {
            aVar.mo2078a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.AbstractC0586e0
    public void setOnFitSystemWindowsListener(AbstractC0586e0.AbstractC0587a aVar) {
        this.f1895b = aVar;
    }
}
