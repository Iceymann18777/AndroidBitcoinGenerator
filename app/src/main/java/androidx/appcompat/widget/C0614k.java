package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.widget.C0720i;
import p000a.p001a.C0000a;
import p000a.p018g.p029l.AbstractC0215q;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public class C0614k extends EditText implements AbstractC0215q {

    /* renamed from: b */
    private final C0585e f2196b;

    /* renamed from: c */
    private final C0655x f2197c;

    public C0614k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.editTextStyle);
    }

    public C0614k(Context context, AttributeSet attributeSet, int i) {
        super(C0632q0.m1914b(context), attributeSet, i);
        this.f2196b = new C0585e(this);
        this.f2196b.m2084a(attributeSet, i);
        this.f2197c = new C0655x(this);
        this.f2197c.m1814a(attributeSet, i);
        this.f2197c.m1822a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0585e eVar = this.f2196b;
        if (eVar != null) {
            eVar.m2089a();
        }
        C0655x xVar = this.f2197c;
        if (xVar != null) {
            xVar.m1822a();
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public ColorStateList getSupportBackgroundTintList() {
        C0585e eVar = this.f2196b;
        if (eVar != null) {
            return eVar.m2083b();
        }
        return null;
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0585e eVar = this.f2196b;
        if (eVar != null) {
            return eVar.m2080c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0616l.m1972a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0585e eVar = this.f2196b;
        if (eVar != null) {
            eVar.m2085a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0585e eVar = this.f2196b;
        if (eVar != null) {
            eVar.m2088a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0720i.m1491a(this, callback));
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0585e eVar = this.f2196b;
        if (eVar != null) {
            eVar.m2082b(colorStateList);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0585e eVar = this.f2196b;
        if (eVar != null) {
            eVar.m2086a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0655x xVar = this.f2197c;
        if (xVar != null) {
            xVar.m1818a(context, i);
        }
    }
}
