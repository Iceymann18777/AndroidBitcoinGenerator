package p000a.p018g.p029l;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import p000a.p018g.p029l.p030a0.C0191c;
import p000a.p018g.p029l.p030a0.C0195d;

/* renamed from: a.g.l.a */
/* loaded from: classes.dex */
public class C0185a {

    /* renamed from: b */
    private static final View.AccessibilityDelegate f636b = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f637a = new C0186a(this);

    /* renamed from: a.g.l.a$a */
    /* loaded from: classes.dex */
    private static final class C0186a extends View.AccessibilityDelegate {

        /* renamed from: a */
        private final C0185a f638a;

        C0186a(C0185a aVar) {
            this.f638a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f638a.mo1427a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0195d a = this.f638a.m3553a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.m3495a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f638a.mo150b(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f638a.mo143a(view, C0191c.m3539a(accessibilityNodeInfo));
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f638a.m3551c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f638a.mo1426a(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f638a.mo579a(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f638a.m3552a(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f638a.m3550d(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public C0195d m3553a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = f636b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0195d(accessibilityNodeProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate m3554a() {
        return this.f637a;
    }

    /* renamed from: a */
    public void m3552a(View view, int i) {
        f636b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo143a(View view, C0191c cVar) {
        f636b.onInitializeAccessibilityNodeInfo(view, cVar.m3498t());
    }

    /* renamed from: a */
    public boolean mo579a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f636b.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1427a(View view, AccessibilityEvent accessibilityEvent) {
        return f636b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1426a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f636b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo150b(View view, AccessibilityEvent accessibilityEvent) {
        f636b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void m3551c(View view, AccessibilityEvent accessibilityEvent) {
        f636b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void m3550d(View view, AccessibilityEvent accessibilityEvent) {
        f636b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
