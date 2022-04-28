package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: classes.dex */
public class C0644v0 {
    /* renamed from: a */
    public static void m1841a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnLongClickListenerC0652w0.m1828a(view, charSequence);
        }
    }
}
