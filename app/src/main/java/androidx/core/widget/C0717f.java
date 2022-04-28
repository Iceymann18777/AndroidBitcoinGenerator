package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.f */
/* loaded from: classes.dex */
public class C0717f extends AbstractView$OnTouchListenerC0710a {

    /* renamed from: t */
    private final ListView f2711t;

    public C0717f(ListView listView) {
        super(listView);
        this.f2711t = listView;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0710a
    /* renamed from: a */
    public void mo1503a(int i, int i2) {
        C0718g.m1501a(this.f2711t, i2);
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0710a
    /* renamed from: a */
    public boolean mo1504a(int i) {
        return false;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC0710a
    /* renamed from: b */
    public boolean mo1502b(int i) {
        ListView listView = this.f2711t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
