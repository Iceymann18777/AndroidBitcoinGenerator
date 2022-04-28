package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.C0720i;
import p000a.p001a.C0000a;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p018g.p029l.AbstractC0215q;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C0581d extends AutoCompleteTextView implements AbstractC0215q {

    /* renamed from: d */
    private static final int[] f2070d = {16843126};

    /* renamed from: b */
    private final C0585e f2071b;

    /* renamed from: c */
    private final C0655x f2072c;

    public C0581d(Context context) {
        this(context, null);
    }

    public C0581d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.autoCompleteTextViewStyle);
    }

    public C0581d(Context context, AttributeSet attributeSet, int i) {
        super(C0632q0.m1914b(context), attributeSet, i);
        C0638t0 a = C0638t0.m1900a(getContext(), attributeSet, f2070d, i, 0);
        if (a.m1889g(0)) {
            setDropDownBackgroundDrawable(a.m1899b(0));
        }
        a.m1908a();
        this.f2071b = new C0585e(this);
        this.f2071b.m2084a(attributeSet, i);
        this.f2072c = new C0655x(this);
        this.f2072c.m1814a(attributeSet, i);
        this.f2072c.m1822a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0585e eVar = this.f2071b;
        if (eVar != null) {
            eVar.m2089a();
        }
        C0655x xVar = this.f2072c;
        if (xVar != null) {
            xVar.m1822a();
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public ColorStateList getSupportBackgroundTintList() {
        C0585e eVar = this.f2071b;
        if (eVar != null) {
            return eVar.m2083b();
        }
        return null;
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0585e eVar = this.f2071b;
        if (eVar != null) {
            return eVar.m2080c();
        }
        return null;
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
        C0585e eVar = this.f2071b;
        if (eVar != null) {
            eVar.m2085a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0585e eVar = this.f2071b;
        if (eVar != null) {
            eVar.m2088a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0720i.m1491a(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0010a.m4259c(getContext(), i));
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0585e eVar = this.f2071b;
        if (eVar != null) {
            eVar.m2082b(colorStateList);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0585e eVar = this.f2071b;
        if (eVar != null) {
            eVar.m2086a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0655x xVar = this.f2072c;
        if (xVar != null) {
            xVar.m1818a(context, i);
        }
    }
}
