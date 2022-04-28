package p000a.p018g.p029l.p030a0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: a.g.l.a0.c */
/* loaded from: classes.dex */
public class C0191c {

    /* renamed from: a */
    private final AccessibilityNodeInfo f640a;

    /* renamed from: a.g.l.a0.c$a */
    /* loaded from: classes.dex */
    public static class C0192a {

        /* renamed from: b */
        public static final C0192a f641b = new C0192a(1, null);

        /* renamed from: c */
        public static final C0192a f642c = new C0192a(2, null);

        /* renamed from: a */
        final Object f643a;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C0192a(4, null);
            new C0192a(8, null);
            new C0192a(16, null);
            new C0192a(32, null);
            new C0192a(64, null);
            new C0192a(128, null);
            new C0192a(256, null);
            new C0192a(512, null);
            new C0192a(1024, null);
            new C0192a(2048, null);
            new C0192a(4096, null);
            new C0192a(8192, null);
            new C0192a(16384, null);
            new C0192a(32768, null);
            new C0192a(65536, null);
            new C0192a(131072, null);
            new C0192a(262144, null);
            new C0192a(524288, null);
            new C0192a(1048576, null);
            new C0192a(2097152, null);
            new C0192a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
            new C0192a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);
            new C0192a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null);
            new C0192a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null);
            new C0192a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null);
            new C0192a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null);
            new C0192a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null);
            new C0192a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null);
            new C0192a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null);
            new C0192a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C0192a(accessibilityAction);
        }

        public C0192a(int i, CharSequence charSequence) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : null);
        }

        C0192a(Object obj) {
            this.f643a = obj;
        }
    }

    /* renamed from: a.g.l.a0.c$b */
    /* loaded from: classes.dex */
    public static class C0193b {

        /* renamed from: a */
        final Object f644a;

        C0193b(Object obj) {
            this.f644a = obj;
        }

        /* renamed from: a */
        public static C0193b m3497a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C0193b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C0193b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C0193b(null);
        }
    }

    /* renamed from: a.g.l.a0.c$c */
    /* loaded from: classes.dex */
    public static class C0194c {

        /* renamed from: a */
        final Object f645a;

        C0194c(Object obj) {
            this.f645a = obj;
        }

        /* renamed from: a */
        public static C0194c m3496a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0194c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0194c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0194c(null);
        }
    }

    private C0191c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f640a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0191c m3542a(C0191c cVar) {
        return m3539a(AccessibilityNodeInfo.obtain(cVar.f640a));
    }

    /* renamed from: a */
    public static C0191c m3539a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0191c(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m3534b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public int m3545a() {
        return this.f640a.getActions();
    }

    /* renamed from: a */
    public void m3544a(int i) {
        this.f640a.addAction(i);
    }

    /* renamed from: a */
    public void m3541a(Rect rect) {
        this.f640a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void m3540a(View view) {
        this.f640a.addChild(view);
    }

    /* renamed from: a */
    public void m3538a(CharSequence charSequence) {
        this.f640a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void m3537a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f640a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0193b) obj).f644a);
        }
    }

    /* renamed from: a */
    public void m3536a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f640a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public boolean m3543a(C0192a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f640a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f643a);
        }
        return false;
    }

    /* renamed from: b */
    public CharSequence m3535b() {
        return this.f640a.getClassName();
    }

    /* renamed from: b */
    public void m3533b(Rect rect) {
        this.f640a.getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public void m3532b(View view) {
        this.f640a.setParent(view);
    }

    /* renamed from: b */
    public void m3531b(CharSequence charSequence) {
        this.f640a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public void m3530b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f640a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0194c) obj).f645a);
        }
    }

    /* renamed from: b */
    public void m3529b(boolean z) {
        this.f640a.setCheckable(z);
    }

    /* renamed from: c */
    public CharSequence m3528c() {
        return this.f640a.getContentDescription();
    }

    /* renamed from: c */
    public void m3527c(Rect rect) {
        this.f640a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void m3526c(View view) {
        this.f640a.setSource(view);
    }

    /* renamed from: c */
    public void m3525c(CharSequence charSequence) {
        this.f640a.setPackageName(charSequence);
    }

    /* renamed from: c */
    public void m3524c(boolean z) {
        this.f640a.setChecked(z);
    }

    /* renamed from: d */
    public CharSequence m3523d() {
        return this.f640a.getPackageName();
    }

    /* renamed from: d */
    public void m3522d(Rect rect) {
        this.f640a.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void m3521d(boolean z) {
        this.f640a.setClickable(z);
    }

    /* renamed from: e */
    public CharSequence m3520e() {
        return this.f640a.getText();
    }

    /* renamed from: e */
    public void m3519e(boolean z) {
        this.f640a.setEnabled(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0191c.class != obj.getClass()) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.f640a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((C0191c) obj).f640a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String m3518f() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f640a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: f */
    public void m3517f(boolean z) {
        this.f640a.setFocusable(z);
    }

    /* renamed from: g */
    public void m3515g(boolean z) {
        this.f640a.setFocused(z);
    }

    /* renamed from: g */
    public boolean m3516g() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f640a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: h */
    public void m3513h(boolean z) {
        this.f640a.setLongClickable(z);
    }

    /* renamed from: h */
    public boolean m3514h() {
        return this.f640a.isCheckable();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f640a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void m3511i(boolean z) {
        this.f640a.setScrollable(z);
    }

    /* renamed from: i */
    public boolean m3512i() {
        return this.f640a.isChecked();
    }

    /* renamed from: j */
    public void m3509j(boolean z) {
        this.f640a.setSelected(z);
    }

    /* renamed from: j */
    public boolean m3510j() {
        return this.f640a.isClickable();
    }

    /* renamed from: k */
    public void m3507k(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f640a.setVisibleToUser(z);
        }
    }

    /* renamed from: k */
    public boolean m3508k() {
        return this.f640a.isEnabled();
    }

    /* renamed from: l */
    public boolean m3506l() {
        return this.f640a.isFocusable();
    }

    /* renamed from: m */
    public boolean m3505m() {
        return this.f640a.isFocused();
    }

    /* renamed from: n */
    public boolean m3504n() {
        return this.f640a.isLongClickable();
    }

    /* renamed from: o */
    public boolean m3503o() {
        return this.f640a.isPassword();
    }

    /* renamed from: p */
    public boolean m3502p() {
        return this.f640a.isScrollable();
    }

    /* renamed from: q */
    public boolean m3501q() {
        return this.f640a.isSelected();
    }

    /* renamed from: r */
    public boolean m3500r() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f640a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: s */
    public void m3499s() {
        this.f640a.recycle();
    }

    /* renamed from: t */
    public AccessibilityNodeInfo m3498t() {
        return this.f640a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m3541a(rect);
        sb.append("; boundsInParent: " + rect);
        m3533b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m3523d());
        sb.append("; className: ");
        sb.append(m3535b());
        sb.append("; text: ");
        sb.append(m3520e());
        sb.append("; contentDescription: ");
        sb.append(m3528c());
        sb.append("; viewId: ");
        sb.append(m3518f());
        sb.append("; checkable: ");
        sb.append(m3514h());
        sb.append("; checked: ");
        sb.append(m3512i());
        sb.append("; focusable: ");
        sb.append(m3506l());
        sb.append("; focused: ");
        sb.append(m3505m());
        sb.append("; selected: ");
        sb.append(m3501q());
        sb.append("; clickable: ");
        sb.append(m3510j());
        sb.append("; longClickable: ");
        sb.append(m3504n());
        sb.append("; enabled: ");
        sb.append(m3508k());
        sb.append("; password: ");
        sb.append(m3503o());
        sb.append("; scrollable: " + m3502p());
        sb.append("; [");
        int a = m3545a();
        while (a != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a);
            a &= numberOfTrailingZeros ^ (-1);
            sb.append(m3534b(numberOfTrailingZeros));
            if (a != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
