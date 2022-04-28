package p000a.p018g.p019d.p020c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.g.d.c.b */
/* loaded from: classes.dex */
public final class C0127b {

    /* renamed from: a */
    private final Shader f537a;

    /* renamed from: b */
    private final ColorStateList f538b;

    /* renamed from: c */
    private int f539c;

    private C0127b(Shader shader, ColorStateList colorStateList, int i) {
        this.f537a = shader;
        this.f538b = colorStateList;
        this.f539c = i;
    }

    /* renamed from: a */
    static C0127b m3722a(ColorStateList colorStateList) {
        return new C0127b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    private static C0127b m3721a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m3722a(C0126a.m3726a(resources, xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m3720a(C0133d.m3692a(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    static C0127b m3720a(Shader shader) {
        return new C0127b(shader, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0127b m3717b(int i) {
        return new C0127b(null, null, i);
    }

    /* renamed from: b */
    public static C0127b m3716b(Resources resources, int i, Resources.Theme theme) {
        try {
            return m3721a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    public int m3724a() {
        return this.f539c;
    }

    /* renamed from: a */
    public void m3723a(int i) {
        this.f539c = i;
    }

    /* renamed from: a */
    public boolean m3719a(int[] iArr) {
        if (m3714d()) {
            ColorStateList colorStateList = this.f538b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f539c) {
                this.f539c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Shader m3718b() {
        return this.f537a;
    }

    /* renamed from: c */
    public boolean m3715c() {
        return this.f537a != null;
    }

    /* renamed from: d */
    public boolean m3714d() {
        ColorStateList colorStateList;
        return this.f537a == null && (colorStateList = this.f538b) != null && colorStateList.isStateful();
    }

    /* renamed from: e */
    public boolean m3713e() {
        return m3715c() || this.f539c != 0;
    }
}
