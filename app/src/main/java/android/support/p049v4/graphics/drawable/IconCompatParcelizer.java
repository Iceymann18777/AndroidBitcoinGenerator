package android.support.p049v4.graphics.drawable;

import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC0865a;

/**
 * @see androidx.core.graphics.drawable.IconCompatParcelizer 
 */
/* renamed from: android.support.v4.graphics.drawable.IconCompatParcelizer */
/* loaded from: classes.dex */
public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    private static IconCompat iconCompat;
    private static AbstractC0865a aVar;

    public static IconCompat read(AbstractC0865a aVar) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read(aVar);
    }

    public static void write(IconCompat iconCompat, AbstractC0865a aVar) {
        IconCompatParcelizer.iconCompat = iconCompat;
        IconCompatParcelizer.aVar = aVar;
        androidx.core.graphics.drawable.IconCompatParcelizer.write(iconCompat, aVar);
    }

}
