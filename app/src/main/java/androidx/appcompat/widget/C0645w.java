package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.view.menu.AbstractC0519t;
import p000a.p001a.C0000a;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p018g.p029l.AbstractC0215q;
import p000a.p018g.p029l.C0216r;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public class C0645w extends Spinner implements AbstractC0215q {

    /* renamed from: j */
    private static final int[] f2312j = {16843505};

    /* renamed from: b */
    private final C0585e f2313b;

    /* renamed from: c */
    private final Context f2314c;

    /* renamed from: d */
    private AbstractView$OnTouchListenerC0589f0 f2315d;

    /* renamed from: e */
    private SpinnerAdapter f2316e;

    /* renamed from: f */
    private final boolean f2317f;

    /* renamed from: g */
    C0648c f2318g;

    /* renamed from: h */
    int f2319h;

    /* renamed from: i */
    final Rect f2320i;

    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: classes.dex */
    class C0646a extends AbstractView$OnTouchListenerC0589f0 {

        /* renamed from: k */
        final /* synthetic */ C0648c f2321k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0646a(View view, C0648c cVar) {
            super(view);
            this.f2321k = cVar;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
        /* renamed from: a */
        public AbstractC0519t mo1839a() {
            return this.f2321k;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0589f0
        /* renamed from: b */
        public boolean mo1838b() {
            if (C0645w.this.f2318g.mo2036d()) {
                return true;
            }
            C0645w.this.f2318g.mo1833f();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w$b */
    /* loaded from: classes.dex */
    public static class C0647b implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        private SpinnerAdapter f2323b;

        /* renamed from: c */
        private ListAdapter f2324c;

        public C0647b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2323b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2324c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof AbstractC0630p0) {
                AbstractC0630p0 p0Var = (AbstractC0630p0) spinnerAdapter;
                if (p0Var.getDropDownViewTheme() == null) {
                    p0Var.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2324c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2323b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2323b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2323b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2323b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2323b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2324c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2323b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2323b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w$c */
    /* loaded from: classes.dex */
    public class C0648c extends C0596h0 {

        /* renamed from: J */
        private CharSequence f2325J;

        /* renamed from: K */
        ListAdapter f2326K;

        /* renamed from: L */
        private final Rect f2327L = new Rect();

        /* renamed from: androidx.appcompat.widget.w$c$a */
        /* loaded from: classes.dex */
        class C0649a implements AdapterView.OnItemClickListener {
            C0649a(C0645w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0645w.this.setSelection(i);
                if (C0645w.this.getOnItemClickListener() != null) {
                    C0648c cVar = C0648c.this;
                    C0645w.this.performItemClick(view, i, cVar.f2326K.getItemId(i));
                }
                C0648c.this.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.widget.w$c$b */
        /* loaded from: classes.dex */
        public class ViewTreeObserver$OnGlobalLayoutListenerC0650b implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerC0650b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0648c cVar = C0648c.this;
                if (!cVar.m1834b(C0645w.this)) {
                    C0648c.this.dismiss();
                    return;
                }
                C0648c.this.m1832l();
                C0648c.super.mo1833f();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.widget.w$c$c */
        /* loaded from: classes.dex */
        public class C0651c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2331b;

            C0651c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2331b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0645w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2331b);
                }
            }
        }

        public C0648c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            m2047a(C0645w.this);
            m2043a(true);
            m2032f(0);
            m2045a(new C0649a(C0645w.this));
        }

        @Override // androidx.appcompat.widget.C0596h0
        /* renamed from: a */
        public void mo1837a(ListAdapter listAdapter) {
            super.mo1837a(listAdapter);
            this.f2326K = listAdapter;
        }

        /* renamed from: a */
        public void m1835a(CharSequence charSequence) {
            this.f2325J = charSequence;
        }

        /* renamed from: b */
        boolean m1834b(View view) {
            return C0216r.m3398w(view) && view.getGlobalVisibleRect(this.f2327L);
        }

        @Override // androidx.appcompat.widget.C0596h0, androidx.appcompat.view.menu.AbstractC0519t
        /* renamed from: f */
        public void mo1833f() {
            ViewTreeObserver viewTreeObserver;
            boolean d = mo2036d();
            m1832l();
            m2033e(2);
            super.mo1833f();
            mo2034e().setChoiceMode(1);
            m2030g(C0645w.this.getSelectedItemPosition());
            if (!d && (viewTreeObserver = C0645w.this.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC0650b bVar = new ViewTreeObserver$OnGlobalLayoutListenerC0650b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                m2044a(new C0651c(bVar));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m1832l() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m2039c()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.w r1 = androidx.appcompat.widget.C0645w.this
                android.graphics.Rect r1 = r1.f2320i
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0645w.this
                boolean r0 = androidx.appcompat.widget.C0661z0.m1764a(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0645w.this
                android.graphics.Rect r0 = r0.f2320i
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0645w.this
                android.graphics.Rect r0 = r0.f2320i
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0645w.this
                android.graphics.Rect r0 = r0.f2320i
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0645w.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = androidx.appcompat.widget.C0645w.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = androidx.appcompat.widget.C0645w.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.C0645w.this
                int r5 = r4.f2319h
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f2326K
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m2039c()
                int r4 = r4.m1840a(r5, r6)
                androidx.appcompat.widget.w r5 = androidx.appcompat.widget.C0645w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = androidx.appcompat.widget.C0645w.this
                android.graphics.Rect r6 = r6.f2320i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.m2041b(r4)
                goto L_0x0085
            L_0x0082:
                r8.m2041b(r5)
            L_0x0085:
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.C0645w.this
                boolean r4 = androidx.appcompat.widget.C0661z0.m1764a(r4)
                if (r4 == 0) goto L_0x0095
                int r3 = r3 - r2
                int r0 = r8.m2027i()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x0096
            L_0x0095:
                int r1 = r1 + r0
            L_0x0096:
                r8.m2035d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0645w.C0648c.m1832l():void");
        }

        /* renamed from: m */
        public CharSequence m1831m() {
            return this.f2325J;
        }
    }

    public C0645w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.spinnerStyle);
    }

    public C0645w(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0645w(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r12 != null) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        r12.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r12 == null) goto L_0x0072;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0645w(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f2320i = r0
            int[] r0 = p000a.p001a.C0009j.Spinner
            r1 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.C0638t0.m1900a(r8, r9, r0, r10, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r7)
            r7.f2313b = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            a.a.m.d r3 = new a.a.m.d
            r3.<init>(r8, r12)
        L_0x0020:
            r7.f2314c = r3
            goto L_0x003c
        L_0x0023:
            int r12 = p000a.p001a.C0009j.Spinner_popupTheme
            int r12 = r0.m1888g(r12, r1)
            if (r12 == 0) goto L_0x0031
            a.a.m.d r3 = new a.a.m.d
            r3.<init>(r8, r12)
            goto L_0x0020
        L_0x0031:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x0039
            r12 = r8
            goto L_0x003a
        L_0x0039:
            r12 = r2
        L_0x003a:
            r7.f2314c = r12
        L_0x003c:
            android.content.Context r12 = r7.f2314c
            r3 = 1
            if (r12 == 0) goto L_0x00aa
            r12 = -1
            if (r11 != r12) goto L_0x0072
            int[] r12 = androidx.appcompat.widget.C0645w.f2312j     // Catch: all -> 0x005c, Exception -> 0x005f
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch: all -> 0x005c, Exception -> 0x005f
            boolean r4 = r12.hasValue(r1)     // Catch: Exception -> 0x005a, all -> 0x006b
            if (r4 == 0) goto L_0x0054
            int r11 = r12.getInt(r1, r1)     // Catch: Exception -> 0x005a, all -> 0x006b
        L_0x0054:
            if (r12 == 0) goto L_0x0072
        L_0x0056:
            r12.recycle()
            goto L_0x0072
        L_0x005a:
            r4 = move-exception
            goto L_0x0061
        L_0x005c:
            r8 = move-exception
            r12 = r2
            goto L_0x006c
        L_0x005f:
            r4 = move-exception
            r12 = r2
        L_0x0061:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch: all -> 0x006b
            if (r12 == 0) goto L_0x0072
            goto L_0x0056
        L_0x006b:
            r8 = move-exception
        L_0x006c:
            if (r12 == 0) goto L_0x0071
            r12.recycle()
        L_0x0071:
            throw r8
        L_0x0072:
            if (r11 != r3) goto L_0x00aa
            androidx.appcompat.widget.w$c r11 = new androidx.appcompat.widget.w$c
            android.content.Context r12 = r7.f2314c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f2314c
            int[] r4 = p000a.p001a.C0009j.Spinner
            androidx.appcompat.widget.t0 r12 = androidx.appcompat.widget.C0638t0.m1900a(r12, r9, r4, r10, r1)
            int r1 = p000a.p001a.C0009j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.m1890f(r1, r4)
            r7.f2319h = r1
            int r1 = p000a.p001a.C0009j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.m1899b(r1)
            r11.m2048a(r1)
            int r1 = p000a.p001a.C0009j.Spinner_android_prompt
            java.lang.String r1 = r0.m1895d(r1)
            r11.m1835a(r1)
            r12.m1908a()
            r7.f2318g = r11
            androidx.appcompat.widget.w$a r12 = new androidx.appcompat.widget.w$a
            r12.<init>(r7, r11)
            r7.f2315d = r12
        L_0x00aa:
            int r11 = p000a.p001a.C0009j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.m1891f(r11)
            if (r11 == 0) goto L_0x00c2
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = p000a.p001a.C0006g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        L_0x00c2:
            r0.m1908a()
            r7.f2317f = r3
            android.widget.SpinnerAdapter r8 = r7.f2316e
            if (r8 == 0) goto L_0x00d0
            r7.setAdapter(r8)
            r7.f2316e = r2
        L_0x00d0:
            androidx.appcompat.widget.e r8 = r7.f2313b
            r8.m2084a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0645w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    int m1840a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f2320i);
        Rect rect = this.f2320i;
        return i2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0585e eVar = this.f2313b;
        if (eVar != null) {
            eVar.m2089a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        C0648c cVar = this.f2318g;
        if (cVar != null) {
            return cVar.m2031g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        C0648c cVar = this.f2318g;
        if (cVar != null) {
            return cVar.m2029h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f2318g != null) {
            return this.f2319h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        C0648c cVar = this.f2318g;
        if (cVar != null) {
            return cVar.m2039c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f2318g != null) {
            return this.f2314c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        C0648c cVar = this.f2318g;
        return cVar != null ? cVar.m1831m() : super.getPrompt();
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public ColorStateList getSupportBackgroundTintList() {
        C0585e eVar = this.f2313b;
        if (eVar != null) {
            return eVar.m2083b();
        }
        return null;
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0585e eVar = this.f2313b;
        if (eVar != null) {
            return eVar.m2080c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0648c cVar = this.f2318g;
        if (cVar != null && cVar.mo2036d()) {
            this.f2318g.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2318g != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1840a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0589f0 f0Var = this.f2315d;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        C0648c cVar = this.f2318g;
        if (cVar == null) {
            return super.performClick();
        }
        if (cVar.mo2036d()) {
            return true;
        }
        this.f2318g.mo1833f();
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2317f) {
            this.f2316e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2318g != null) {
            Context context = this.f2314c;
            if (context == null) {
                context = getContext();
            }
            this.f2318g.mo1837a(new C0647b(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0585e eVar = this.f2313b;
        if (eVar != null) {
            eVar.m2085a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0585e eVar = this.f2313b;
        if (eVar != null) {
            eVar.m2088a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        C0648c cVar = this.f2318g;
        if (cVar != null) {
            cVar.m2035d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        C0648c cVar = this.f2318g;
        if (cVar != null) {
            cVar.m2028h(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2318g != null) {
            this.f2319h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0648c cVar = this.f2318g;
        if (cVar != null) {
            cVar.m2048a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0010a.m4259c(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        C0648c cVar = this.f2318g;
        if (cVar != null) {
            cVar.m1835a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0585e eVar = this.f2313b;
        if (eVar != null) {
            eVar.m2082b(colorStateList);
        }
    }

    @Override // p000a.p018g.p029l.AbstractC0215q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0585e eVar = this.f2313b;
        if (eVar != null) {
            eVar.m2086a(mode);
        }
    }
}
