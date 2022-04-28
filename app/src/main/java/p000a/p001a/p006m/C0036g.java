package p000a.p001a.p006m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0501k;
import androidx.appcompat.view.menu.MenuItemC0503l;
import androidx.appcompat.widget.C0580c0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.C0009j;
import p000a.p018g.p022f.p023a.AbstractMenuC0155a;
import p000a.p018g.p029l.AbstractC0197b;
import p000a.p018g.p029l.C0205g;

/* renamed from: a.a.m.g */
/* loaded from: classes.dex */
public class C0036g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f106e = {Context.class};

    /* renamed from: f */
    static final Class<?>[] f107f = f106e;

    /* renamed from: a */
    final Object[] f108a;

    /* renamed from: b */
    final Object[] f109b;

    /* renamed from: c */
    Context f110c;

    /* renamed from: d */
    private Object f111d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.m.g$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC0037a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f112c = {MenuItem.class};

        /* renamed from: a */
        private Object f113a;

        /* renamed from: b */
        private Method f114b;

        public MenuItem$OnMenuItemClickListenerC0037a(Object obj, String str) {
            this.f113a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f114b = cls.getMethod(str, f112c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f114b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f114b.invoke(this.f113a, menuItem)).booleanValue();
                }
                this.f114b.invoke(this.f113a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.m.g$b */
    /* loaded from: classes.dex */
    public class C0038b {

        /* renamed from: A */
        AbstractC0197b f115A;

        /* renamed from: B */
        private CharSequence f116B;

        /* renamed from: C */
        private CharSequence f117C;

        /* renamed from: D */
        private ColorStateList f118D = null;

        /* renamed from: E */
        private PorterDuff.Mode f119E = null;

        /* renamed from: a */
        private Menu f121a;

        /* renamed from: b */
        private int f122b;

        /* renamed from: c */
        private int f123c;

        /* renamed from: d */
        private int f124d;

        /* renamed from: e */
        private int f125e;

        /* renamed from: f */
        private boolean f126f;

        /* renamed from: g */
        private boolean f127g;

        /* renamed from: h */
        private boolean f128h;

        /* renamed from: i */
        private int f129i;

        /* renamed from: j */
        private int f130j;

        /* renamed from: k */
        private CharSequence f131k;

        /* renamed from: l */
        private CharSequence f132l;

        /* renamed from: m */
        private int f133m;

        /* renamed from: n */
        private char f134n;

        /* renamed from: o */
        private int f135o;

        /* renamed from: p */
        private char f136p;

        /* renamed from: q */
        private int f137q;

        /* renamed from: r */
        private int f138r;

        /* renamed from: s */
        private boolean f139s;

        /* renamed from: t */
        private boolean f140t;

        /* renamed from: u */
        private boolean f141u;

        /* renamed from: v */
        private int f142v;

        /* renamed from: w */
        private int f143w;

        /* renamed from: x */
        private String f144x;

        /* renamed from: y */
        private String f145y;

        /* renamed from: z */
        private String f146z;

        public C0038b(Menu menu) {
            this.f121a = menu;
            m4158d();
        }

        /* renamed from: a */
        private char m4163a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m4162a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0036g.this.f110c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: a */
        private void m4164a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f139s).setVisible(this.f140t).setEnabled(this.f141u).setCheckable(this.f138r >= 1).setTitleCondensed(this.f132l).setIcon(this.f133m);
            int i = this.f142v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f146z != null) {
                if (!C0036g.this.f110c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0037a(C0036g.this.m4169a(), this.f146z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0501k;
            if (z2) {
                C0501k kVar = (C0501k) menuItem;
            }
            if (this.f138r >= 2) {
                if (z2) {
                    ((C0501k) menuItem).m2359c(true);
                } else if (menuItem instanceof MenuItemC0503l) {
                    ((MenuItemC0503l) menuItem).m2345a(true);
                }
            }
            String str = this.f144x;
            if (str != null) {
                menuItem.setActionView((View) m4162a(str, C0036g.f106e, C0036g.this.f108a));
                z = true;
            }
            int i2 = this.f143w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0197b bVar = this.f115A;
            if (bVar != null) {
                C0205g.m3477a(menuItem, bVar);
            }
            C0205g.m3474a(menuItem, this.f116B);
            C0205g.m3472b(menuItem, this.f117C);
            C0205g.m3478a(menuItem, this.f134n, this.f135o);
            C0205g.m3473b(menuItem, this.f136p, this.f137q);
            PorterDuff.Mode mode = this.f119E;
            if (mode != null) {
                C0205g.m3475a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f118D;
            if (colorStateList != null) {
                C0205g.m3476a(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m4166a() {
            this.f128h = true;
            m4164a(this.f121a.add(this.f122b, this.f129i, this.f130j, this.f131k));
        }

        /* renamed from: a */
        public void m4165a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0036g.this.f110c.obtainStyledAttributes(attributeSet, C0009j.MenuGroup);
            this.f122b = obtainStyledAttributes.getResourceId(C0009j.MenuGroup_android_id, 0);
            this.f123c = obtainStyledAttributes.getInt(C0009j.MenuGroup_android_menuCategory, 0);
            this.f124d = obtainStyledAttributes.getInt(C0009j.MenuGroup_android_orderInCategory, 0);
            this.f125e = obtainStyledAttributes.getInt(C0009j.MenuGroup_android_checkableBehavior, 0);
            this.f126f = obtainStyledAttributes.getBoolean(C0009j.MenuGroup_android_visible, true);
            this.f127g = obtainStyledAttributes.getBoolean(C0009j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public SubMenu m4161b() {
            this.f128h = true;
            SubMenu addSubMenu = this.f121a.addSubMenu(this.f122b, this.f129i, this.f130j, this.f131k);
            m4164a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m4160b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0036g.this.f110c.obtainStyledAttributes(attributeSet, C0009j.MenuItem);
            this.f129i = obtainStyledAttributes.getResourceId(C0009j.MenuItem_android_id, 0);
            this.f130j = (obtainStyledAttributes.getInt(C0009j.MenuItem_android_menuCategory, this.f123c) & (-65536)) | (obtainStyledAttributes.getInt(C0009j.MenuItem_android_orderInCategory, this.f124d) & 65535);
            this.f131k = obtainStyledAttributes.getText(C0009j.MenuItem_android_title);
            this.f132l = obtainStyledAttributes.getText(C0009j.MenuItem_android_titleCondensed);
            this.f133m = obtainStyledAttributes.getResourceId(C0009j.MenuItem_android_icon, 0);
            this.f134n = m4163a(obtainStyledAttributes.getString(C0009j.MenuItem_android_alphabeticShortcut));
            this.f135o = obtainStyledAttributes.getInt(C0009j.MenuItem_alphabeticModifiers, 4096);
            this.f136p = m4163a(obtainStyledAttributes.getString(C0009j.MenuItem_android_numericShortcut));
            this.f137q = obtainStyledAttributes.getInt(C0009j.MenuItem_numericModifiers, 4096);
            this.f138r = obtainStyledAttributes.hasValue(C0009j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C0009j.MenuItem_android_checkable, false) : this.f125e;
            this.f139s = obtainStyledAttributes.getBoolean(C0009j.MenuItem_android_checked, false);
            this.f140t = obtainStyledAttributes.getBoolean(C0009j.MenuItem_android_visible, this.f126f);
            this.f141u = obtainStyledAttributes.getBoolean(C0009j.MenuItem_android_enabled, this.f127g);
            this.f142v = obtainStyledAttributes.getInt(C0009j.MenuItem_showAsAction, -1);
            this.f146z = obtainStyledAttributes.getString(C0009j.MenuItem_android_onClick);
            this.f143w = obtainStyledAttributes.getResourceId(C0009j.MenuItem_actionLayout, 0);
            this.f144x = obtainStyledAttributes.getString(C0009j.MenuItem_actionViewClass);
            this.f145y = obtainStyledAttributes.getString(C0009j.MenuItem_actionProviderClass);
            boolean z = this.f145y != null;
            if (z && this.f143w == 0 && this.f144x == null) {
                this.f115A = (AbstractC0197b) m4162a(this.f145y, C0036g.f107f, C0036g.this.f109b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f115A = null;
            }
            this.f116B = obtainStyledAttributes.getText(C0009j.MenuItem_contentDescription);
            this.f117C = obtainStyledAttributes.getText(C0009j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0009j.MenuItem_iconTintMode)) {
                this.f119E = C0580c0.m2107a(obtainStyledAttributes.getInt(C0009j.MenuItem_iconTintMode, -1), this.f119E);
            } else {
                this.f119E = null;
            }
            if (obtainStyledAttributes.hasValue(C0009j.MenuItem_iconTint)) {
                this.f118D = obtainStyledAttributes.getColorStateList(C0009j.MenuItem_iconTint);
            } else {
                this.f118D = null;
            }
            obtainStyledAttributes.recycle();
            this.f128h = false;
        }

        /* renamed from: c */
        public boolean m4159c() {
            return this.f128h;
        }

        /* renamed from: d */
        public void m4158d() {
            this.f122b = 0;
            this.f123c = 0;
            this.f124d = 0;
            this.f125e = 0;
            this.f126f = true;
            this.f127g = true;
        }
    }

    public C0036g(Context context) {
        super(context);
        this.f110c = context;
        this.f108a = new Object[]{context};
        this.f109b = this.f108a;
    }

    /* renamed from: a */
    private Object m4168a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m4168a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: a */
    private void m4167a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0038b bVar = new C0038b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.m4158d();
                        } else if (name2.equals("item")) {
                            if (!bVar.m4159c()) {
                                AbstractC0197b bVar2 = bVar.f115A;
                                if (bVar2 == null || !bVar2.mo2344a()) {
                                    bVar.m4166a();
                                } else {
                                    bVar.m4161b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.m4165a(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.m4160b(attributeSet);
                    } else if (name3.equals("menu")) {
                        m4167a(xmlPullParser, attributeSet, bVar.m4161b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* renamed from: a */
    Object m4169a() {
        if (this.f111d == null) {
            this.f111d = m4168a(this.f110c);
        }
        return this.f111d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof AbstractMenuC0155a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f110c.getResources().getLayout(i);
                    m4167a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
