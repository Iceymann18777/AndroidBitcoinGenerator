package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

import p000a.p018g.p022f.p023a.AbstractMenuItemC0156b;
import p000a.p018g.p029l.AbstractC0197b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public class C0508m extends MenuItemC0503l {

    /* renamed from: androidx.appcompat.view.menu.m$a */
    /* loaded from: classes.dex */
    class ActionProvider$VisibilityListenerC0509a extends MenuItemC0503l.C0504a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        AbstractC0197b.AbstractC0199b f1771d;

        public ActionProvider$VisibilityListenerC0509a(C0508m mVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: a */
        public View mo2337a(MenuItem menuItem) {
            return this.f1766b.onCreateActionView(menuItem);
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: a */
        public void mo2338a(AbstractC0197b.AbstractC0199b bVar) {
            this.f1771d = bVar;
            this.f1766b.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: b */
        public boolean mo2336b() {
            return this.f1766b.isVisible();
        }

        @Override // p000a.p018g.p029l.AbstractC0197b
        /* renamed from: e */
        public boolean mo2335e() {
            return this.f1766b.overridesItemVisibility();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0197b.AbstractC0199b bVar = this.f1771d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0508m(Context context, AbstractMenuItemC0156b bVar) {
        super(context, bVar);
    }

    @Override // androidx.appcompat.view.menu.MenuItemC0503l
    /* renamed from: a */
    MenuItemC0503l.C0504a mo2339a(ActionProvider actionProvider) {
        return new ActionProvider$VisibilityListenerC0509a(this, this.f1643b, actionProvider);
    }
}
