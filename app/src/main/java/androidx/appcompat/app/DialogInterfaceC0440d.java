package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

import p000a.p001a.C0000a;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public class DialogInterfaceC0440d extends DialogC0464i implements DialogInterface {

    /* renamed from: d */
    final AlertController f1413d = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.d$a */
    /* loaded from: classes.dex */
    public static class C0441a {

        /* renamed from: a */
        private final AlertController.C0419f f1414a;

        /* renamed from: b */
        private final int f1415b;

        public C0441a(Context context) {
            this(context, DialogInterfaceC0440d.m2645a(context, 0));
        }

        public C0441a(Context context, int i) {
            this.f1414a = new AlertController.C0419f(new ContextThemeWrapper(context, DialogInterfaceC0440d.m2645a(context, i)));
            this.f1415b = i;
        }

        /* renamed from: a */
        public C0441a m2643a(DialogInterface.OnKeyListener onKeyListener) {
            this.f1414a.f1370u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0441a m2642a(Drawable drawable) {
            this.f1414a.f1353d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0441a m2641a(View view) {
            this.f1414a.f1356g = view;
            return this;
        }

        /* renamed from: a */
        public C0441a m2640a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0419f fVar = this.f1414a;
            fVar.f1372w = listAdapter;
            fVar.f1373x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0441a m2639a(CharSequence charSequence) {
            this.f1414a.f1355f = charSequence;
            return this;
        }

        /* renamed from: a */
        public DialogInterfaceC0440d m2644a() {
            DialogInterfaceC0440d dVar = new DialogInterfaceC0440d(this.f1414a.f1350a, this.f1415b);
            this.f1414a.m2664a(dVar.f1413d);
            dVar.setCancelable(this.f1414a.f1367r);
            if (this.f1414a.f1367r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f1414a.f1368s);
            dVar.setOnDismissListener(this.f1414a.f1369t);
            DialogInterface.OnKeyListener onKeyListener = this.f1414a.f1370u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        /* renamed from: b */
        public Context m2638b() {
            return this.f1414a.f1350a;
        }
    }

    protected DialogInterfaceC0440d(Context context, int i) {
        super(context, m2645a(context, i));
    }

    /* renamed from: a */
    static int m2645a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0000a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0464i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1413d.m2690a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1413d.m2688a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1413d.m2674b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0464i, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1413d.m2671b(charSequence);
    }
}
