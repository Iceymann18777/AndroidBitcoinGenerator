package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0428a;

import p000a.p001a.C0000a;
import p000a.p001a.p006m.C0028a;

/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
public class C0619m0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    Runnable f2209b;

    /* renamed from: c */
    private View$OnClickListenerC0622c f2210c;

    /* renamed from: d */
    C0593g0 f2211d;

    /* renamed from: e */
    private Spinner f2212e;

    /* renamed from: f */
    private boolean f2213f;

    /* renamed from: g */
    int f2214g;

    /* renamed from: h */
    int f2215h;

    /* renamed from: i */
    private int f2216i;

    /* renamed from: j */
    private int f2217j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.m0$a */
    /* loaded from: classes.dex */
    public class RunnableC0620a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f2218b;

        RunnableC0620a(View view) {
            this.f2218b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0619m0.this.smoothScrollTo(this.f2218b.getLeft() - ((C0619m0.this.getWidth() - this.f2218b.getWidth()) / 2), 0);
            C0619m0.this.f2209b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$b */
    /* loaded from: classes.dex */
    public class C0621b extends BaseAdapter {
        C0621b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0619m0.this.f2211d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C0623d) C0619m0.this.f2211d.getChildAt(i)).m1958a();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0619m0.this.m1962a((AbstractC0428a.AbstractC0431c) getItem(i), true);
            }
            ((C0623d) view).m1957a((AbstractC0428a.AbstractC0431c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0622c implements View.OnClickListener {
        View$OnClickListenerC0622c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C0623d) view).m1958a().m2655e();
            int childCount = C0619m0.this.f2211d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0619m0.this.f2211d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$d */
    /* loaded from: classes.dex */
    public class C0623d extends LinearLayout {

        /* renamed from: b */
        private final int[] f2222b = {16842964};

        /* renamed from: c */
        private AbstractC0428a.AbstractC0431c f2223c;

        /* renamed from: d */
        private TextView f2224d;

        /* renamed from: e */
        private ImageView f2225e;

        /* renamed from: f */
        private View f2226f;

        public C0623d(Context context, AbstractC0428a.AbstractC0431c cVar, boolean z) {
            super(context, null, C0000a.actionBarTabStyle);
            this.f2223c = cVar;
            C0638t0 a = C0638t0.m1900a(context, null, this.f2222b, C0000a.actionBarTabStyle, 0);
            if (a.m1889g(0)) {
                setBackgroundDrawable(a.m1899b(0));
            }
            a.m1908a();
            if (z) {
                setGravity(8388627);
            }
            m1956b();
        }

        /* renamed from: a */
        public AbstractC0428a.AbstractC0431c m1958a() {
            return this.f2223c;
        }

        /* renamed from: a */
        public void m1957a(AbstractC0428a.AbstractC0431c cVar) {
            this.f2223c = cVar;
            m1956b();
        }

        /* renamed from: b */
        public void m1956b() {
            AbstractC0428a.AbstractC0431c cVar = this.f2223c;
            View b = cVar.m2658b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f2226f = b;
                TextView textView = this.f2224d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2225e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2225e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2226f;
            if (view != null) {
                removeView(view);
                this.f2226f = null;
            }
            Drawable c = cVar.m2657c();
            CharSequence d = cVar.m2656d();
            if (c != null) {
                if (this.f2225e == null) {
                    C0627o oVar = new C0627o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f2225e = oVar;
                }
                this.f2225e.setImageDrawable(c);
                this.f2225e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2225e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2225e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f2224d == null) {
                    C0658y yVar = new C0658y(getContext(), null, C0000a.actionBarTabTextStyle);
                    yVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    yVar.setLayoutParams(layoutParams2);
                    addView(yVar);
                    this.f2224d = yVar;
                }
                this.f2224d.setText(d);
                this.f2224d.setVisibility(0);
            } else {
                TextView textView2 = this.f2224d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2224d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2225e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m2659a());
            }
            if (!z) {
                charSequence = cVar.m2659a();
            }
            C0644v0.m1841a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0428a.AbstractC0431c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0428a.AbstractC0431c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0619m0.this.f2214g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0619m0.this.f2214g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    private Spinner m1964a() {
        C0645w wVar = new C0645w(getContext(), null, C0000a.actionDropDownStyle);
        wVar.setLayoutParams(new C0593g0.C0594a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    /* renamed from: b */
    private boolean m1961b() {
        Spinner spinner = this.f2212e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m1960c() {
        if (!m1961b()) {
            if (this.f2212e == null) {
                this.f2212e = m1964a();
            }
            removeView(this.f2211d);
            addView(this.f2212e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2212e.getAdapter() == null) {
                this.f2212e.setAdapter((SpinnerAdapter) new C0621b());
            }
            Runnable runnable = this.f2209b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f2209b = null;
            }
            this.f2212e.setSelection(this.f2217j);
        }
    }

    /* renamed from: d */
    private boolean m1959d() {
        if (!m1961b()) {
            return false;
        }
        removeView(this.f2212e);
        addView(this.f2211d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2212e.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    C0623d m1962a(AbstractC0428a.AbstractC0431c cVar, boolean z) {
        C0623d dVar = new C0623d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2216i));
        } else {
            dVar.setFocusable(true);
            if (this.f2210c == null) {
                this.f2210c = new View$OnClickListenerC0622c();
            }
            dVar.setOnClickListener(this.f2210c);
        }
        return dVar;
    }

    /* renamed from: a */
    public void m1963a(int i) {
        View childAt = this.f2211d.getChildAt(i);
        Runnable runnable = this.f2209b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f2209b = new RunnableC0620a(childAt);
        post(this.f2209b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2209b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0028a a = C0028a.m4185a(getContext());
        setContentHeight(a.m4181e());
        this.f2215h = a.m4182d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2209b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0623d) view).m1958a().m2655e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f2211d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f2214g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f2214g = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f2214g, this.f2215h);
        }
        this.f2214g = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2216i, 1073741824);
        if (z2 || !this.f2213f) {
            z = false;
        }
        if (z) {
            this.f2211d.measure(0, makeMeasureSpec);
            if (this.f2211d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m1960c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f2217j);
                    return;
                }
            }
        }
        m1959d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2213f = z;
    }

    public void setContentHeight(int i) {
        this.f2216i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2217j = i;
        int childCount = this.f2211d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2211d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m1963a(i);
            }
            i2++;
        }
        Spinner spinner = this.f2212e;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
