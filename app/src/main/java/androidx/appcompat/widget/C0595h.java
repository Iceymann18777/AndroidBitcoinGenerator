package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0720i;
import p000a.p001a.p002k.p003a.C0010a;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public class C0595h extends CheckedTextView {

    /* renamed from: c */
    private static final int[] f2126c = {16843016};

    /* renamed from: b */
    private final C0655x f2127b;

    public C0595h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0595h(Context context, AttributeSet attributeSet, int i) {
        super(C0632q0.m1914b(context), attributeSet, i);
        this.f2127b = new C0655x(this);
        this.f2127b.m1814a(attributeSet, i);
        this.f2127b.m1822a();
        C0638t0 a = C0638t0.m1900a(getContext(), attributeSet, f2126c, i, 0);
        setCheckMarkDrawable(a.m1899b(0));
        a.m1908a();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0655x xVar = this.f2127b;
        if (xVar != null) {
            xVar.m1822a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0616l.m1972a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0010a.m4259c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0720i.m1491a(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0655x xVar = this.f2127b;
        if (xVar != null) {
            xVar.m1818a(context, i);
        }
    }
}
