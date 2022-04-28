package p000a.p018g.p019d.p020c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p018g.C0123c;
import p000a.p018g.p026i.C0160a;

/* renamed from: a.g.d.c.c */
/* loaded from: classes.dex */
public class C0128c {

    /* renamed from: a.g.d.c.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC0129a {
    }

    /* renamed from: a.g.d.c.c$b */
    /* loaded from: classes.dex */
    public static final class C0130b implements AbstractC0129a {

        /* renamed from: a */
        private final C0131c[] f540a;

        public C0130b(C0131c[] cVarArr) {
            this.f540a = cVarArr;
        }

        /* renamed from: a */
        public C0131c[] m3704a() {
            return this.f540a;
        }
    }

    /* renamed from: a.g.d.c.c$c */
    /* loaded from: classes.dex */
    public static final class C0131c {

        /* renamed from: a */
        private final String f541a;

        /* renamed from: b */
        private int f542b;

        /* renamed from: c */
        private boolean f543c;

        /* renamed from: d */
        private String f544d;

        /* renamed from: e */
        private int f545e;

        /* renamed from: f */
        private int f546f;

        public C0131c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f541a = str;
            this.f542b = i;
            this.f543c = z;
            this.f544d = str2;
            this.f545e = i2;
            this.f546f = i3;
        }

        /* renamed from: a */
        public String m3703a() {
            return this.f541a;
        }

        /* renamed from: b */
        public int m3702b() {
            return this.f546f;
        }

        /* renamed from: c */
        public int m3701c() {
            return this.f545e;
        }

        /* renamed from: d */
        public String m3700d() {
            return this.f544d;
        }

        /* renamed from: e */
        public int m3699e() {
            return this.f542b;
        }

        /* renamed from: f */
        public boolean m3698f() {
            return this.f543c;
        }
    }

    /* renamed from: a.g.d.c.c$d */
    /* loaded from: classes.dex */
    public static final class C0132d implements AbstractC0129a {

        /* renamed from: a */
        private final C0160a f547a;

        /* renamed from: b */
        private final int f548b;

        /* renamed from: c */
        private final int f549c;

        public C0132d(C0160a aVar, int i, int i2) {
            this.f547a = aVar;
            this.f549c = i;
            this.f548b = i2;
        }

        /* renamed from: a */
        public int m3697a() {
            return this.f549c;
        }

        /* renamed from: b */
        public C0160a m3696b() {
            return this.f547a;
        }

        /* renamed from: c */
        public int m3695c() {
            return this.f548b;
        }
    }

    /* renamed from: a */
    private static int m3711a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static AbstractC0129a m3709a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m3707b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m3712a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m3711a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m3708a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m3708a(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m3708a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m3710a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: b */
    private static AbstractC0129a m3707b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m3706c(xmlPullParser, resources);
        }
        m3710a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static AbstractC0129a m3706c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0123c.FontFamily);
        String string = obtainAttributes.getString(C0123c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0123c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0123c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0123c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0123c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0123c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m3705d(xmlPullParser, resources));
                    } else {
                        m3710a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0130b((C0131c[]) arrayList.toArray(new C0131c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m3710a(xmlPullParser);
        }
        return new C0132d(new C0160a(string, string2, string3, m3712a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0131c m3705d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0123c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0123c.FontFamilyFont_fontWeight) ? C0123c.FontFamilyFont_fontWeight : C0123c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0123c.FontFamilyFont_fontStyle) ? C0123c.FontFamilyFont_fontStyle : C0123c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0123c.FontFamilyFont_ttcIndex) ? C0123c.FontFamilyFont_ttcIndex : C0123c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0123c.FontFamilyFont_fontVariationSettings) ? C0123c.FontFamilyFont_fontVariationSettings : C0123c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0123c.FontFamilyFont_font) ? C0123c.FontFamilyFont_font : C0123c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m3710a(xmlPullParser);
        }
        return new C0131c(string2, i, z, string, i3, resourceId);
    }
}
