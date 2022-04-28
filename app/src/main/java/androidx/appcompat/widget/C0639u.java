package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p001a.C0000a;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
public class C0639u extends SeekBar {

    /* renamed from: b */
    private final C0643v f2283b;

    public C0639u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.seekBarStyle);
    }

    public C0639u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2283b = new C0643v(this);
        this.f2283b.mo1845a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2283b.m1844b();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2283b.m1843c();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2283b.m1847a(canvas);
    }
}
