package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0495g;
import androidx.appcompat.view.menu.C0496h;
import androidx.appcompat.view.menu.C0501k;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.j0 */
/* loaded from: classes.dex */
public class C0612j0 extends C0596h0 implements AbstractC0605i0 {

    /* renamed from: K */
    private static Method f2190K;

    /* renamed from: J */
    private AbstractC0605i0 f2191J;

    /* renamed from: androidx.appcompat.widget.j0$a */
    /* loaded from: classes.dex */
    public static class C0613a extends C0582d0 {

        /* renamed from: p */
        final int f2192p;

        /* renamed from: q */
        final int f2193q;

        /* renamed from: r */
        private AbstractC0605i0 f2194r;

        /* renamed from: s */
        private MenuItem f2195s;

        public C0613a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f2192p = 22;
                this.f2193q = 21;
                return;
            }
            this.f2192p = 21;
            this.f2193q = 22;
        }

        @Override // androidx.appcompat.widget.C0582d0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f2194r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0495g gVar = (C0495g) adapter;
                C0501k kVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gVar.getCount()) {
                    kVar = gVar.getItem(i2);
                }
                MenuItem menuItem = this.f2195s;
                if (menuItem != kVar) {
                    C0496h b = gVar.m2423b();
                    if (menuItem != null) {
                        this.f2194r.mo1975b(b, menuItem);
                    }
                    this.f2195s = kVar;
                    if (kVar != null) {
                        this.f2194r.mo1978a(b, kVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2192p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f2193q) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0495g) getAdapter()).m2423b().m2402a(false);
                return true;
            }
        }

        public void setHoverListener(AbstractC0605i0 i0Var) {
            this.f2194r = i0Var;
        }

        @Override // androidx.appcompat.widget.C0582d0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f2190K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0612j0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.appcompat.widget.C0596h0
    /* renamed from: a */
    C0582d0 mo1979a(Context context, boolean z) {
        C0613a aVar = new C0613a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // androidx.appcompat.widget.AbstractC0605i0
    /* renamed from: a */
    public void mo1978a(C0496h hVar, MenuItem menuItem) {
        AbstractC0605i0 i0Var = this.f2191J;
        if (i0Var != null) {
            i0Var.mo1978a(hVar, menuItem);
        }
    }

    /* renamed from: a */
    public void m1977a(AbstractC0605i0 i0Var) {
        this.f2191J = i0Var;
    }

    /* renamed from: a */
    public void m1976a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2136F.setEnterTransition((Transition) obj);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0605i0
    /* renamed from: b */
    public void mo1975b(C0496h hVar, MenuItem menuItem) {
        AbstractC0605i0 i0Var = this.f2191J;
        if (i0Var != null) {
            i0Var.mo1975b(hVar, menuItem);
        }
    }

    /* renamed from: b */
    public void m1974b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2136F.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void m1973c(boolean z) {
        Method method = f2190K;
        if (method != null) {
            try {
                method.invoke(this.f2136F, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
