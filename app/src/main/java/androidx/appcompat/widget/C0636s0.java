package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
class C0636s0 extends C0615k0 {

    /* renamed from: b */
    private final WeakReference<Context> f2278b;

    public C0636s0(Context context, Resources resources) {
        super(resources);
        this.f2278b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0615k0, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f2278b.get();
        if (!(drawable == null || context == null)) {
            C0606j.m2013a();
            C0606j.m2007a(context, i, drawable);
        }
        return drawable;
    }
}
