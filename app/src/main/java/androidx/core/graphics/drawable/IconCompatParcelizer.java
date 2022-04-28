package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.AbstractC0865a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0865a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2624a = aVar.m514a(iconCompat.f2624a, 1);
        iconCompat.f2626c = aVar.m506a(iconCompat.f2626c, 2);
        iconCompat.f2627d = aVar.m513a((AbstractC0865a) iconCompat.f2627d, 3);
        iconCompat.f2628e = aVar.m514a(iconCompat.f2628e, 4);
        iconCompat.f2629f = aVar.m514a(iconCompat.f2629f, 5);
        iconCompat.f2630g = (ColorStateList) aVar.m513a((AbstractC0865a) iconCompat.f2630g, 6);
        iconCompat.f2632i = aVar.m509a(iconCompat.f2632i, 7);
        iconCompat.m1608c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0865a aVar) {
        aVar.m507a(true, true);
        iconCompat.m1611a(aVar.m500c());
        aVar.m505b(iconCompat.f2624a, 1);
        aVar.m501b(iconCompat.f2626c, 2);
        aVar.m504b(iconCompat.f2627d, 3);
        aVar.m505b(iconCompat.f2628e, 4);
        aVar.m505b(iconCompat.f2629f, 5);
        aVar.m504b(iconCompat.f2630g, 6);
        aVar.m502b(iconCompat.f2632i, 7);
    }
}
