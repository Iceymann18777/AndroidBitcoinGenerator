package p050b.p051a.p052a.p053a.p054j;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: b.a.a.a.j.e */
/* loaded from: classes.dex */
public class C0881e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f3287b = new C0881e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f3288a = new WeakHashMap<>();

    private C0881e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f3288a.containsKey(drawable)) {
            return this.f3288a.get(drawable);
        }
        return 255;
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f3288a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
