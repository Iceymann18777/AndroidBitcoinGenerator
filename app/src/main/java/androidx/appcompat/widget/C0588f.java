package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.AbstractC0713b;
import androidx.core.widget.C0720i;
import p000a.p001a.C0000a;
import p000a.p018g.p029l.AbstractC0215q;

/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public class C0588f extends Button implements AbstractC0215q, AbstractC0713b {

    /* renamed from: b */
    private final C0585e f2095b;

    /* renamed from: c */
    private final C0655x f2096c;

    public C0588f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.buttonStyle);
    }

    public C0588f(Context context, AttributeSet attributeSet, int i) {
        super(C0632q0.m1914b(context), attributeSet, i);
        this.f2095b = new C0585e(this);
        this.f2095b.m2084a(attributeSet, i);
        this.f2096c = new C0655x(this);
        this.f2096c.m1814a(attributeSet, i);
        this.f2096c.m1822a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0585e eVar = this.f2095b;
        if (eVar != null) {
            eVar.m2089a();
        }
        C0655x xVar = this.f2096c;
        if (xVar != null) {
            xVar.m1822a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0713b.f2708a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0655x xVar = this.f2096c;
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
        C0655x xVar = this.f2096c;
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
        C0655x xVar = this.f2096c;
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
        C0655x xVar = this.f2096c;
        return xVar != null ? xVar.m1804f() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC0713b.f2708a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0655x xVar = this.f2096c;
        if (xVar != null) {
            return xVar.m1803g();
        }
        return 0;
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public ColorStateList getSupportBackgroundTintList() {
        C0585e eVar = this.f2095b;
        if (eVar != null) {
            return eVar.m2083b();
        }
        return null;
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0585e eVar = this.f2095b;
        if (eVar != null) {
            return eVar.m2080c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0655x xVar = this.f2096c;
        if (xVar != null) {
            xVar.m1811a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0655x xVar = this.f2096c;
        if (xVar != null && !AbstractC0713b.f2708a && xVar.m1802h()) {
            this.f2096c.m1809b();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC0713b.f2708a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0655x xVar = this.f2096c;
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
        C0655x xVar = this.f2096c;
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
        C0655x xVar = this.f2096c;
        if (xVar != null) {
            xVar.m1821a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0585e eVar = this.f2095b;
        if (eVar != null) {
            eVar.m2085a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0585e eVar = this.f2095b;
        if (eVar != null) {
            eVar.m2088a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0720i.m1491a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0655x xVar = this.f2096c;
        if (xVar != null) {
            xVar.m1812a(z);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0585e eVar = this.f2095b;
        if (eVar != null) {
            eVar.m2082b(colorStateList);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0585e eVar = this.f2095b;
        if (eVar != null) {
            eVar.m2086a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0655x xVar = this.f2096c;
        if (xVar != null) {
            xVar.m1818a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (AbstractC0713b.f2708a) {
            super.setTextSize(i, f);
            return;
        }
        C0655x xVar = this.f2096c;
        if (xVar != null) {
            xVar.m1820a(i, f);
        }
    }
}
