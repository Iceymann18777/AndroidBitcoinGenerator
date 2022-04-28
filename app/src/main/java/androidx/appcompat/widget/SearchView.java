package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p001a.C0000a;
import p000a.p001a.C0003d;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0007h;
import p000a.p001a.C0009j;
import p000a.p001a.p006m.AbstractC0031c;
import p000a.p018g.p029l.C0216r;
import p000a.p031h.p032a.AbstractC0231a;
import p000a.p033i.p034a.AbstractC0237a;

/* loaded from: classes.dex */
public class SearchView extends C0593g0 implements AbstractC0031c {

    /* renamed from: r0 */
    static final C0548k f1897r0 = new C0548k();

    /* renamed from: A */
    private Rect f1898A;

    /* renamed from: B */
    private Rect f1899B;

    /* renamed from: C */
    private int[] f1900C;

    /* renamed from: D */
    private int[] f1901D;

    /* renamed from: E */
    private final ImageView f1902E;

    /* renamed from: F */
    private final Drawable f1903F;

    /* renamed from: G */
    private final int f1904G;

    /* renamed from: H */
    private final int f1905H;

    /* renamed from: I */
    private final Intent f1906I;

    /* renamed from: J */
    private final Intent f1907J;

    /* renamed from: K */
    private final CharSequence f1908K;

    /* renamed from: L */
    private AbstractC0550m f1909L;

    /* renamed from: M */
    private AbstractC0549l f1910M;

    /* renamed from: N */
    View.OnFocusChangeListener f1911N;

    /* renamed from: O */
    private AbstractC0551n f1912O;

    /* renamed from: P */
    private View.OnClickListener f1913P;

    /* renamed from: Q */
    private boolean f1914Q;

    /* renamed from: R */
    private boolean f1915R;

    /* renamed from: S */
    AbstractC0231a f1916S;

    /* renamed from: T */
    private boolean f1917T;

    /* renamed from: U */
    private CharSequence f1918U;

    /* renamed from: V */
    private boolean f1919V;

    /* renamed from: W */
    private boolean f1920W;

    /* renamed from: a0 */
    private int f1921a0;

    /* renamed from: b0 */
    private boolean f1922b0;

    /* renamed from: c0 */
    private CharSequence f1923c0;

    /* renamed from: d0 */
    private CharSequence f1924d0;

    /* renamed from: e0 */
    private boolean f1925e0;

    /* renamed from: f0 */
    private int f1926f0;

    /* renamed from: g0 */
    SearchableInfo f1927g0;

    /* renamed from: h0 */
    private Bundle f1928h0;

    /* renamed from: i0 */
    private final Runnable f1929i0;

    /* renamed from: j0 */
    private Runnable f1930j0;

    /* renamed from: k0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1931k0;

    /* renamed from: l0 */
    private final View.OnClickListener f1932l0;

    /* renamed from: m0 */
    View.OnKeyListener f1933m0;

    /* renamed from: n0 */
    private final TextView.OnEditorActionListener f1934n0;

    /* renamed from: o0 */
    private final AdapterView.OnItemClickListener f1935o0;

    /* renamed from: p0 */
    private final AdapterView.OnItemSelectedListener f1936p0;

    /* renamed from: q */
    final SearchAutoComplete f1937q;

    /* renamed from: q0 */
    private TextWatcher f1938q0;

    /* renamed from: r */
    private final View f1939r;

    /* renamed from: s */
    private final View f1940s;

    /* renamed from: t */
    private final View f1941t;

    /* renamed from: u */
    final ImageView f1942u;

    /* renamed from: v */
    final ImageView f1943v;

    /* renamed from: w */
    final ImageView f1944w;

    /* renamed from: x */
    final ImageView f1945x;

    /* renamed from: y */
    private final View f1946y;

    /* renamed from: z */
    private C0554p f1947z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0581d {

        /* renamed from: e */
        private int f1948e;

        /* renamed from: f */
        private SearchView f1949f;

        /* renamed from: g */
        private boolean f1950g;

        /* renamed from: h */
        final Runnable f1951h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        class RunnableC0537a implements Runnable {
            RunnableC0537a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m2204b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0000a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1951h = new RunnableC0537a();
            this.f1948e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        boolean m2205a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: b */
        void m2204b() {
            if (this.f1950g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1950g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1948e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0581d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1950g) {
                removeCallbacks(this.f1951h);
                post(this.f1951h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1949f.m2216j();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1949f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1949f.hasFocus() && getVisibility() == 0) {
                this.f1950g = true;
                if (SearchView.m2242a(getContext())) {
                    SearchView.f1897r0.m2202a(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1950g = false;
                removeCallbacks(this.f1951h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1950g = false;
                removeCallbacks(this.f1951h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1950g = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1949f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1948e = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    class C0538a implements TextWatcher {
        C0538a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m2229b(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    class RunnableC0539b implements Runnable {
        RunnableC0539b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m2214l();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    class RunnableC0540c implements Runnable {
        RunnableC0540c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0231a aVar = SearchView.this.f1916S;
            if (aVar != null && (aVar instanceof View$OnClickListenerC0625n0)) {
                aVar.mo1930b(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    class View$OnFocusChangeListenerC0541d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0541d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1911N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    class View$OnLayoutChangeListenerC0542e implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC0542e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m2224d();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0543f implements View.OnClickListener {
        View$OnClickListenerC0543f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1942u) {
                searchView.m2218h();
            } else if (view == searchView.f1944w) {
                searchView.m2219g();
            } else if (view == searchView.f1943v) {
                searchView.m2217i();
            } else if (view == searchView.f1945x) {
                searchView.m2215k();
            } else if (view == searchView.f1937q) {
                searchView.m2222e();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    class View$OnKeyListenerC0544g implements View.OnKeyListener {
        View$OnKeyListenerC0544g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1927g0 == null) {
                return false;
            }
            if (searchView.f1937q.isPopupShowing() && SearchView.this.f1937q.getListSelection() != -1) {
                return SearchView.this.m2238a(view, i, keyEvent);
            }
            if (SearchView.this.f1937q.m2205a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m2243a(0, (String) null, searchView2.f1937q.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    class C0545h implements TextView.OnEditorActionListener {
        C0545h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m2217i();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    class C0546i implements AdapterView.OnItemClickListener {
        C0546i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m2244a(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    class C0547j implements AdapterView.OnItemSelectedListener {
        C0547j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m2223d(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public static class C0548k {

        /* renamed from: a */
        private Method f1963a;

        /* renamed from: b */
        private Method f1964b;

        /* renamed from: c */
        private Method f1965c;

        C0548k() {
            try {
                this.f1963a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1963a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f1964b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1964b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f1965c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1965c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        void m2203a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1964b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        void m2202a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f1965c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m2201b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1963a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface AbstractC0549l {
        /* renamed from: a */
        boolean m2200a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface AbstractC0550m {
        /* renamed from: a */
        boolean m2199a(String str);

        /* renamed from: b */
        boolean m2198b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public interface AbstractC0551n {
        /* renamed from: a */
        boolean m2197a(int i);

        /* renamed from: b */
        boolean m2196b(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    public static class C0552o extends AbstractC0237a {
        public static final Parcelable.Creator<C0552o> CREATOR = new C0553a();

        /* renamed from: d */
        boolean f1966d;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        /* loaded from: classes.dex */
        static class C0553a implements Parcelable.ClassLoaderCreator<C0552o> {
            C0553a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0552o createFromParcel(Parcel parcel) {
                return new C0552o(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0552o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0552o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public C0552o[] newArray(int i) {
                return new C0552o[i];
            }
        }

        public C0552o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1966d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0552o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1966d + "}";
        }

        @Override // p000a.p033i.p034a.AbstractC0237a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1966d));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes.dex */
    private static class C0554p extends TouchDelegate {

        /* renamed from: a */
        private final View f1967a;

        /* renamed from: e */
        private final int f1971e;

        /* renamed from: f */
        private boolean f1972f;

        /* renamed from: b */
        private final Rect f1968b = new Rect();

        /* renamed from: d */
        private final Rect f1970d = new Rect();

        /* renamed from: c */
        private final Rect f1969c = new Rect();

        public C0554p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1971e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            m2195a(rect, rect2);
            this.f1967a = view;
        }

        /* renamed from: a */
        public void m2195a(Rect rect, Rect rect2) {
            this.f1968b.set(rect);
            this.f1970d.set(rect);
            Rect rect3 = this.f1970d;
            int i = this.f1971e;
            rect3.inset(-i, -i);
            this.f1969c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int i;
            float f;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z2 = true;
            if (action == 0) {
                if (this.f1968b.contains(x, y)) {
                    this.f1972f = true;
                    z = true;
                }
                z = false;
            } else if (action == 1 || action == 2) {
                z = this.f1972f;
                if (z && !this.f1970d.contains(x, y)) {
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z = this.f1972f;
                    this.f1972f = false;
                }
                z = false;
            }
            if (!z) {
                return false;
            }
            if (!z2 || this.f1969c.contains(x, y)) {
                Rect rect = this.f1969c;
                f = x - rect.left;
                i = y - rect.top;
            } else {
                f = this.f1967a.getWidth() / 2;
                i = this.f1967a.getHeight() / 2;
            }
            motionEvent.setLocation(f, i);
            return this.f1967a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1898A = new Rect();
        this.f1899B = new Rect();
        this.f1900C = new int[2];
        this.f1901D = new int[2];
        this.f1929i0 = new RunnableC0539b();
        this.f1930j0 = new RunnableC0540c();
        this.f1931k0 = new WeakHashMap<>();
        this.f1932l0 = new View$OnClickListenerC0543f();
        this.f1933m0 = new View$OnKeyListenerC0544g();
        this.f1934n0 = new C0545h();
        this.f1935o0 = new C0546i();
        this.f1936p0 = new C0547j();
        this.f1938q0 = new C0538a();
        C0638t0 a = C0638t0.m1900a(context, attributeSet, C0009j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.m1888g(C0009j.SearchView_layout, C0006g.abc_search_view), (ViewGroup) this, true);
        this.f1937q = (SearchAutoComplete) findViewById(C0005f.search_src_text);
        this.f1937q.setSearchView(this);
        this.f1939r = findViewById(C0005f.search_edit_frame);
        this.f1940s = findViewById(C0005f.search_plate);
        this.f1941t = findViewById(C0005f.submit_area);
        this.f1942u = (ImageView) findViewById(C0005f.search_button);
        this.f1943v = (ImageView) findViewById(C0005f.search_go_btn);
        this.f1944w = (ImageView) findViewById(C0005f.search_close_btn);
        this.f1945x = (ImageView) findViewById(C0005f.search_voice_btn);
        this.f1902E = (ImageView) findViewById(C0005f.search_mag_icon);
        C0216r.m3434a(this.f1940s, a.m1899b(C0009j.SearchView_queryBackground));
        C0216r.m3434a(this.f1941t, a.m1899b(C0009j.SearchView_submitBackground));
        this.f1942u.setImageDrawable(a.m1899b(C0009j.SearchView_searchIcon));
        this.f1943v.setImageDrawable(a.m1899b(C0009j.SearchView_goIcon));
        this.f1944w.setImageDrawable(a.m1899b(C0009j.SearchView_closeIcon));
        this.f1945x.setImageDrawable(a.m1899b(C0009j.SearchView_voiceIcon));
        this.f1902E.setImageDrawable(a.m1899b(C0009j.SearchView_searchIcon));
        this.f1903F = a.m1899b(C0009j.SearchView_searchHintIcon);
        C0644v0.m1841a(this.f1942u, getResources().getString(C0007h.abc_searchview_description_search));
        this.f1904G = a.m1888g(C0009j.SearchView_suggestionRowLayout, C0006g.abc_search_dropdown_item_icons_2line);
        this.f1905H = a.m1888g(C0009j.SearchView_commitIcon, 0);
        this.f1942u.setOnClickListener(this.f1932l0);
        this.f1944w.setOnClickListener(this.f1932l0);
        this.f1943v.setOnClickListener(this.f1932l0);
        this.f1945x.setOnClickListener(this.f1932l0);
        this.f1937q.setOnClickListener(this.f1932l0);
        this.f1937q.addTextChangedListener(this.f1938q0);
        this.f1937q.setOnEditorActionListener(this.f1934n0);
        this.f1937q.setOnItemClickListener(this.f1935o0);
        this.f1937q.setOnItemSelectedListener(this.f1936p0);
        this.f1937q.setOnKeyListener(this.f1933m0);
        this.f1937q.setOnFocusChangeListener(new View$OnFocusChangeListenerC0541d());
        setIconifiedByDefault(a.m1903a(C0009j.SearchView_iconifiedByDefault, true));
        int c = a.m1896c(C0009j.SearchView_android_maxWidth, -1);
        if (c != -1) {
            setMaxWidth(c);
        }
        this.f1908K = a.m1893e(C0009j.SearchView_defaultQueryHint);
        this.f1918U = a.m1893e(C0009j.SearchView_queryHint);
        int d = a.m1894d(C0009j.SearchView_android_imeOptions, -1);
        if (d != -1) {
            setImeOptions(d);
        }
        int d2 = a.m1894d(C0009j.SearchView_android_inputType, -1);
        if (d2 != -1) {
            setInputType(d2);
        }
        setFocusable(a.m1903a(C0009j.SearchView_android_focusable, true));
        a.m1908a();
        this.f1906I = new Intent("android.speech.action.WEB_SEARCH");
        this.f1906I.addFlags(268435456);
        this.f1906I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f1907J = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1907J.addFlags(268435456);
        this.f1946y = findViewById(this.f1937q.getDropDownAnchor());
        View view = this.f1946y;
        if (view != null) {
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0542e());
        }
        m2228b(this.f1914Q);
        m2208r();
    }

    /* renamed from: a */
    private Intent m2240a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1928h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m2239a(Cursor cursor, int i, String str) {
        int i2;
        String a;
        try {
            String a2 = View$OnClickListenerC0625n0.m1940a(cursor, "suggest_intent_action");
            if (a2 == null) {
                a2 = this.f1927g0.getSuggestIntentAction();
            }
            if (a2 == null) {
                a2 = "android.intent.action.SEARCH";
            }
            String a3 = View$OnClickListenerC0625n0.m1940a(cursor, "suggest_intent_data");
            if (a3 == null) {
                a3 = this.f1927g0.getSuggestIntentData();
            }
            if (!(a3 == null || (a = View$OnClickListenerC0625n0.m1940a(cursor, "suggest_intent_data_id")) == null)) {
                a3 = a3 + "/" + Uri.encode(a);
            }
            return m2234a(a2, a3 == null ? null : Uri.parse(a3), View$OnClickListenerC0625n0.m1940a(cursor, "suggest_intent_extra_data"), View$OnClickListenerC0625n0.m1940a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m2234a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1924d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1928h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1927g0.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m2241a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: a */
    private void m2237a(View view, Rect rect) {
        view.getLocationInWindow(this.f1900C);
        getLocationInWindow(this.f1901D);
        int[] iArr = this.f1900C;
        int i = iArr[1];
        int[] iArr2 = this.f1901D;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: a */
    private void m2233a(boolean z) {
        this.f1943v.setVisibility((!this.f1917T || !m2211o() || !hasFocus() || (!z && this.f1922b0)) ? 8 : 0);
    }

    /* renamed from: a */
    static boolean m2242a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m2230b(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: b */
    private void m2228b(boolean z) {
        this.f1915R = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1937q.getText());
        this.f1942u.setVisibility(i2);
        m2233a(z2);
        this.f1939r.setVisibility(z ? 8 : 0);
        if (this.f1902E.getDrawable() == null || this.f1914Q) {
            i = 8;
        }
        this.f1902E.setVisibility(i);
        m2209q();
        m2225c(!z2);
        m2206t();
    }

    /* renamed from: b */
    private boolean m2231b(int i, int i2, String str) {
        Cursor a = this.f1916S.mo3349a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m2241a(m2239a(a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m2226c(CharSequence charSequence) {
        if (!this.f1914Q || this.f1903F == null) {
            return charSequence;
        }
        double textSize = this.f1937q.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f1903F.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1903F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m2225c(boolean z) {
        int i;
        if (!this.f1922b0 || m2220f() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f1943v.setVisibility(8);
        }
        this.f1945x.setVisibility(i);
    }

    /* renamed from: e */
    private void m2221e(int i) {
        CharSequence a;
        Editable text = this.f1937q.getText();
        Cursor a2 = this.f1916S.mo3349a();
        if (a2 != null) {
            if (!a2.moveToPosition(i) || (a = this.f1916S.mo1942a(a2)) == null) {
                setQuery(text);
            } else {
                setQuery(a);
            }
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0003d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0003d.abc_search_view_preferred_width);
    }

    /* renamed from: m */
    private void m2213m() {
        this.f1937q.dismissDropDown();
    }

    /* renamed from: n */
    private boolean m2212n() {
        SearchableInfo searchableInfo = this.f1927g0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1927g0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1906I;
        } else if (this.f1927g0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1907J;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: o */
    private boolean m2211o() {
        return (this.f1917T || this.f1922b0) && !m2220f();
    }

    /* renamed from: p */
    private void m2210p() {
        post(this.f1929i0);
    }

    /* renamed from: q */
    private void m2209q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1937q.getText());
        int i = 0;
        if (!z2 && (!this.f1914Q || this.f1925e0)) {
            z = false;
        }
        ImageView imageView = this.f1944w;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1944w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: r */
    private void m2208r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1937q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m2226c(queryHint));
    }

    /* renamed from: s */
    private void m2207s() {
        this.f1937q.setThreshold(this.f1927g0.getSuggestThreshold());
        this.f1937q.setImeOptions(this.f1927g0.getImeOptions());
        int inputType = this.f1927g0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1927g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1937q.setInputType(inputType);
        AbstractC0231a aVar = this.f1916S;
        if (aVar != null) {
            aVar.mo1930b(null);
        }
        if (this.f1927g0.getSuggestAuthority() != null) {
            this.f1916S = new View$OnClickListenerC0625n0(getContext(), this, this.f1927g0, this.f1931k0);
            this.f1937q.setAdapter(this.f1916S);
            View$OnClickListenerC0625n0 n0Var = (View$OnClickListenerC0625n0) this.f1916S;
            if (this.f1919V) {
                i = 2;
            }
            n0Var.m1945a(i);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f1937q.setText(charSequence);
        this.f1937q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private void m2206t() {
        this.f1941t.setVisibility((!m2211o() || !(this.f1943v.getVisibility() == 0 || this.f1945x.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: a */
    void m2243a(int i, String str, String str2) {
        getContext().startActivity(m2234a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2236a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void m2235a(CharSequence charSequence, boolean z) {
        this.f1937q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1937q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1924d0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m2217i();
        }
    }

    /* renamed from: a */
    boolean m2244a(int i, int i2, String str) {
        AbstractC0551n nVar = this.f1912O;
        if (nVar != null && nVar.m2196b(i)) {
            return false;
        }
        m2231b(i, 0, null);
        this.f1937q.setImeVisibility(false);
        m2213m();
        return true;
    }

    /* renamed from: a */
    boolean m2238a(View view, int i, KeyEvent keyEvent) {
        if (this.f1927g0 != null && this.f1916S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m2244a(this.f1937q.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f1937q.setSelection(i == 21 ? 0 : this.f1937q.length());
                this.f1937q.setListSelection(0);
                this.f1937q.clearListSelection();
                f1897r0.m2202a(this.f1937q, true);
                return true;
            } else if (i != 19 || this.f1937q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    @Override // p000a.p001a.p006m.AbstractC0031c
    /* renamed from: b */
    public void mo2232b() {
        if (!this.f1925e0) {
            this.f1925e0 = true;
            this.f1926f0 = this.f1937q.getImeOptions();
            this.f1937q.setImeOptions(this.f1926f0 | 33554432);
            this.f1937q.setText("");
            setIconified(false);
        }
    }

    /* renamed from: b */
    void m2229b(CharSequence charSequence) {
        Editable text = this.f1937q.getText();
        this.f1924d0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m2233a(z);
        m2225c(!z);
        m2209q();
        m2206t();
        if (this.f1909L != null && !TextUtils.equals(charSequence, this.f1923c0)) {
            this.f1909L.m2198b(charSequence.toString());
        }
        this.f1923c0 = charSequence.toString();
    }

    @Override // p000a.p001a.p006m.AbstractC0031c
    /* renamed from: c */
    public void mo2227c() {
        m2235a("", false);
        clearFocus();
        m2228b(true);
        this.f1937q.setImeOptions(this.f1926f0);
        this.f1925e0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1920W = true;
        super.clearFocus();
        this.f1937q.clearFocus();
        this.f1937q.setImeVisibility(false);
        this.f1920W = false;
    }

    /* renamed from: d */
    void m2224d() {
        if (this.f1946y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1940s.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0661z0.m1764a(this);
            int dimensionPixelSize = this.f1914Q ? resources.getDimensionPixelSize(C0003d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0003d.abc_dropdownitem_text_padding_left) : 0;
            this.f1937q.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f1937q.setDropDownHorizontalOffset(a ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f1937q.setDropDownWidth((((this.f1946y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: d */
    boolean m2223d(int i) {
        AbstractC0551n nVar = this.f1912O;
        if (nVar != null && nVar.m2197a(i)) {
            return false;
        }
        m2221e(i);
        return true;
    }

    /* renamed from: e */
    void m2222e() {
        f1897r0.m2201b(this.f1937q);
        f1897r0.m2203a(this.f1937q);
    }

    /* renamed from: f */
    public boolean m2220f() {
        return this.f1915R;
    }

    /* renamed from: g */
    void m2219g() {
        if (!TextUtils.isEmpty(this.f1937q.getText())) {
            this.f1937q.setText("");
            this.f1937q.requestFocus();
            this.f1937q.setImeVisibility(true);
        } else if (this.f1914Q) {
            AbstractC0549l lVar = this.f1910M;
            if (lVar == null || !lVar.m2200a()) {
                clearFocus();
                m2228b(true);
            }
        }
    }

    public int getImeOptions() {
        return this.f1937q.getImeOptions();
    }

    public int getInputType() {
        return this.f1937q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1921a0;
    }

    public CharSequence getQuery() {
        return this.f1937q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1918U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1927g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1908K : getContext().getText(this.f1927g0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1905H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1904G;
    }

    public AbstractC0231a getSuggestionsAdapter() {
        return this.f1916S;
    }

    /* renamed from: h */
    void m2218h() {
        m2228b(false);
        this.f1937q.requestFocus();
        this.f1937q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1913P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: i */
    void m2217i() {
        Editable text = this.f1937q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            AbstractC0550m mVar = this.f1909L;
            if (mVar == null || !mVar.m2199a(text.toString())) {
                if (this.f1927g0 != null) {
                    m2243a(0, (String) null, text.toString());
                }
                this.f1937q.setImeVisibility(false);
                m2213m();
            }
        }
    }

    /* renamed from: j */
    void m2216j() {
        m2228b(m2220f());
        m2210p();
        if (this.f1937q.hasFocus()) {
            m2222e();
        }
    }

    /* renamed from: k */
    void m2215k() {
        Intent a;
        SearchableInfo searchableInfo = this.f1927g0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    a = m2230b(this.f1906I, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    a = m2240a(this.f1907J, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(a);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: l */
    void m2214l() {
        int[] iArr = this.f1937q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1940s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1941t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1929i0);
        post(this.f1930j0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0593g0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m2237a(this.f1937q, this.f1898A);
            Rect rect = this.f1899B;
            Rect rect2 = this.f1898A;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0554p pVar = this.f1947z;
            if (pVar == null) {
                this.f1947z = new C0554p(this.f1899B, this.f1898A, this.f1937q);
                setTouchDelegate(this.f1947z);
                return;
            }
            pVar.m2195a(this.f1899B, this.f1898A);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    @Override // androidx.appcompat.widget.C0593g0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.m2220f()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f1921a0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f1921a0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f1921a0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0552o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0552o oVar = (C0552o) parcelable;
        super.onRestoreInstanceState(oVar.m3347a());
        m2228b(oVar.f1966d);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0552o oVar = new C0552o(super.onSaveInstanceState());
        oVar.f1966d = m2220f();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m2210p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f1920W || !isFocusable()) {
            return false;
        }
        if (m2220f()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1937q.requestFocus(i, rect);
        if (requestFocus) {
            m2228b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1928h0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m2219g();
        } else {
            m2218h();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1914Q != z) {
            this.f1914Q = z;
            m2228b(z);
            m2208r();
        }
    }

    public void setImeOptions(int i) {
        this.f1937q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1937q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1921a0 = i;
        requestLayout();
    }

    public void setOnCloseListener(AbstractC0549l lVar) {
        this.f1910M = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1911N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(AbstractC0550m mVar) {
        this.f1909L = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1913P = onClickListener;
    }

    public void setOnSuggestionListener(AbstractC0551n nVar) {
        this.f1912O = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1918U = charSequence;
        m2208r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1919V = z;
        AbstractC0231a aVar = this.f1916S;
        if (aVar instanceof View$OnClickListenerC0625n0) {
            ((View$OnClickListenerC0625n0) aVar).m1945a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1927g0 = searchableInfo;
        if (this.f1927g0 != null) {
            m2207s();
            m2208r();
        }
        this.f1922b0 = m2212n();
        if (this.f1922b0) {
            this.f1937q.setPrivateImeOptions("nm");
        }
        m2228b(m2220f());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1917T = z;
        m2228b(m2220f());
    }

    public void setSuggestionsAdapter(AbstractC0231a aVar) {
        this.f1916S = aVar;
        this.f1937q.setAdapter(this.f1916S);
    }
}
