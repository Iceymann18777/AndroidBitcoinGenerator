package p000a.p018g.p019d.p020c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p018g.C0123c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.g.d.c.d */
/* loaded from: classes.dex */
public final class C0133d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.d.c.d$a */
    /* loaded from: classes.dex */
    public static final class C0134a {

        /* renamed from: a */
        final int[] f550a;

        /* renamed from: b */
        final float[] f551b;

        C0134a(int i, int i2) {
            this.f550a = new int[]{i, i2};
            this.f551b = new float[]{0.0f, 1.0f};
        }

        C0134a(int i, int i2, int i3) {
            this.f550a = new int[]{i, i2, i3};
            this.f551b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C0134a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f550a = new int[size];
            this.f551b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f550a[i] = list.get(i).intValue();
                this.f551b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static C0134a m3693a(C0134a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new C0134a(i, i3, i2) : new C0134a(i, i2);
    }

    /* renamed from: a */
    private static Shader.TileMode m3694a(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Shader m3692a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0123c.GradientColor);
            float a2 = C0140g.m3678a(a, xmlPullParser, "startX", C0123c.GradientColor_android_startX, 0.0f);
            float a3 = C0140g.m3678a(a, xmlPullParser, "startY", C0123c.GradientColor_android_startY, 0.0f);
            float a4 = C0140g.m3678a(a, xmlPullParser, "endX", C0123c.GradientColor_android_endX, 0.0f);
            float a5 = C0140g.m3678a(a, xmlPullParser, "endY", C0123c.GradientColor_android_endY, 0.0f);
            float a6 = C0140g.m3678a(a, xmlPullParser, "centerX", C0123c.GradientColor_android_centerX, 0.0f);
            float a7 = C0140g.m3678a(a, xmlPullParser, "centerY", C0123c.GradientColor_android_centerY, 0.0f);
            int b = C0140g.m3673b(a, xmlPullParser, "type", C0123c.GradientColor_android_type, 0);
            int a8 = C0140g.m3677a(a, xmlPullParser, "startColor", C0123c.GradientColor_android_startColor, 0);
            boolean a9 = C0140g.m3675a(xmlPullParser, "centerColor");
            int a10 = C0140g.m3677a(a, xmlPullParser, "centerColor", C0123c.GradientColor_android_centerColor, 0);
            int a11 = C0140g.m3677a(a, xmlPullParser, "endColor", C0123c.GradientColor_android_endColor, 0);
            int b2 = C0140g.m3673b(a, xmlPullParser, "tileMode", C0123c.GradientColor_android_tileMode, 0);
            float a12 = C0140g.m3678a(a, xmlPullParser, "gradientRadius", C0123c.GradientColor_android_gradientRadius, 0.0f);
            a.recycle();
            C0134a a13 = m3693a(m3691b(resources, xmlPullParser, attributeSet, theme), a8, a11, a9, a10);
            if (b != 1) {
                return b != 2 ? new LinearGradient(a2, a3, a4, a5, a13.f550a, a13.f551b, m3694a(b2)) : new SweepGradient(a6, a7, a13.f550a, a13.f551b);
            }
            if (a12 > 0.0f) {
                return new RadialGradient(a6, a7, a12, a13.f550a, a13.f551b, m3694a(b2));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000a.p018g.p019d.p020c.C0133d.C0134a m3691b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x008a
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x008a
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p000a.p018g.C0123c.GradientColorItem
            android.content.res.TypedArray r3 = p000a.p018g.p019d.p020c.C0140g.m3681a(r8, r11, r10, r3)
            int r5 = p000a.p018g.C0123c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p000a.p018g.C0123c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = p000a.p018g.C0123c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p000a.p018g.C0123c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' "
            r10.append(r9)
            java.lang.String r9 = "attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x008a:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0096
            a.g.d.c.d$a r8 = new a.g.d.c.d$a
            r8.<init>(r4, r2)
            return r8
        L_0x0096:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p018g.p019d.p020c.C0133d.m3691b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.g.d.c.d$a");
    }
}
