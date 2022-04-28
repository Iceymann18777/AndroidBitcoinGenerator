package p000a.p018g.p019d.p020c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.g.d.c.g */
/* loaded from: classes.dex */
public class C0140g {
    /* renamed from: a */
    public static float m3678a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m3675a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m3677a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m3675a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static C0127b m3680a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m3675a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0127b.m3717b(typedValue.data);
            }
            C0127b b = C0127b.m3716b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (b != null) {
                return b;
            }
        }
        return C0127b.m3717b(i2);
    }

    /* renamed from: a */
    public static TypedArray m3681a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m3679a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3675a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m3676a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m3675a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m3675a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m3673b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m3675a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m3674b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3675a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m3672c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m3675a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
