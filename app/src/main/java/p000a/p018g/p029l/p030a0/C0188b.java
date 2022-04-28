package p000a.p018g.p029l.p030a0;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* renamed from: a.g.l.a0.b */
/* loaded from: classes.dex */
public final class C0188b {

    /* renamed from: a.g.l.a0.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC0189a {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: a.g.l.a0.b$b  reason: invalid class name */
    /* loaded from: classes.dex */
    private static class accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final AbstractC0189a f639a;

        accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b(AbstractC0189a aVar) {
            this.f639a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b.class != obj.getClass()) {
                return false;
            }
            return this.f639a.equals(((accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b) obj).f639a);
        }

        public int hashCode() {
            return this.f639a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f639a.onTouchExplorationStateChanged(z);
        }
    }

    /* renamed from: a */
    public static boolean m3547a(AccessibilityManager accessibilityManager, AbstractC0189a aVar) {
        if (Build.VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b(aVar));
    }

    /* renamed from: b */
    public static boolean m3546b(AccessibilityManager accessibilityManager, AbstractC0189a aVar) {
        if (Build.VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibilityAccessibilityManager$TouchExplorationStateChangeListenerC0190b(aVar));
    }
}
