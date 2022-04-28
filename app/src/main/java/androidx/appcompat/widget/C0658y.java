package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.widget.AbstractC0713b;
import androidx.core.widget.C0720i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000a.p018g.p027j.C0175a;
import p000a.p018g.p029l.AbstractC0215q;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public class C0658y extends TextView implements AbstractC0215q, AbstractC0713b {

    /* renamed from: b */
    private final C0585e f2366b;

    /* renamed from: c */
    private final C0655x f2367c;

    /* renamed from: d */
    private Future<C0175a> f2368d;

    public C0658y(Context context) {
        this(context, null);
    }

    public C0658y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0658y(Context context, AttributeSet attributeSet, int i) {
        super(C0632q0.m1914b(context), attributeSet, i);
        this.f2366b = new C0585e(this);
        this.f2366b.m2084a(attributeSet, i);
        this.f2367c = new C0655x(this);
        this.f2367c.m1814a(attributeSet, i);
        this.f2367c.m1822a();
    }

    /* renamed from: d */
    private void m1794d() {
        Future<C0175a> future = this.f2368d;
        if (future != null) {
            try {
                this.f2368d = null;
                C0720i.m1493a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0585e eVar = this.f2366b;
        if (eVar != null) {
            eVar.m2089a();
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            xVar.m1822a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0713b.f2708a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            return xVar.m1807c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0713b.f2708a) {
            return super.getAutoSizeMinTextSize();
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            return xVar.m1806d();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0713b.f2708a) {
            return super.getAutoSizeStepGranularity();
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            return xVar.m1805e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0713b.f2708a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0655x xVar = this.f2367c;
        return xVar != null ? xVar.m1804f() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC0713b.f2708a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            return xVar.m1803g();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0720i.m1496a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0720i.m1490b(this);
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public ColorStateList getSupportBackgroundTintList() {
        C0585e eVar = this.f2366b;
        if (eVar != null) {
            return eVar.m2083b();
        }
        return null;
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0585e eVar = this.f2366b;
        if (eVar != null) {
            return eVar.m2080c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m1794d();
        return super.getText();
    }

    public C0175a.C0176a getTextMetricsParamsCompat() {
        return C0720i.m1486d(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0616l.m1972a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            xVar.m1811a(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m1794d();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0655x xVar = this.f2367c;
        if (xVar != null && !AbstractC0713b.f2708a && xVar.m1802h()) {
            this.f2367c.m1809b();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC0713b.f2708a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            xVar.m1819a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC0713b.f2708a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            xVar.m1810a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC0713b.f2708a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            xVar.m1821a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0585e eVar = this.f2366b;
        if (eVar != null) {
            eVar.m2085a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0585e eVar = this.f2366b;
        if (eVar != null) {
            eVar.m2088a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0720i.m1491a(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0720i.m1495a(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0720i.m1489b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0720i.m1487c(this, i);
    }

    public void setPrecomputedText(C0175a aVar) {
        C0720i.m1493a(this, aVar);
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0585e eVar = this.f2366b;
        if (eVar != null) {
            eVar.m2082b(colorStateList);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0585e eVar = this.f2366b;
        if (eVar != null) {
            eVar.m2086a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            xVar.m1818a(context, i);
        }
    }

    public void setTextFuture(Future<C0175a> future) {
        this.f2368d = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(C0175a.C0176a aVar) {
        C0720i.m1494a(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (AbstractC0713b.f2708a) {
            super.setTextSize(i, f);
            return;
        }
        C0655x xVar = this.f2367c;
        if (xVar != null) {
            xVar.m1820a(i, f);
        }
    }
}
