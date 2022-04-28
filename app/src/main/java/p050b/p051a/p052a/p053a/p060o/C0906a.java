package p050b.p051a.p052a.p053a.p060o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import p000a.p001a.p002k.p003a.C0010a;

/* renamed from: b.a.a.a.o.a */
/* loaded from: classes.dex */
public class C0906a {
    /* renamed from: a */
    public static ColorStateList m401a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C0010a.m4260b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : b;
    }

    /* renamed from: b */
    public static Drawable m400b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = C0010a.m4259c(context, resourceId)) == null) ? typedArray.getDrawable(i) : c;
    }
}
