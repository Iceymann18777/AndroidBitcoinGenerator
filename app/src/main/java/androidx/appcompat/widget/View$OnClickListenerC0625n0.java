package androidx.appcompat.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p018g.p019d.C0124a;
import p000a.p031h.p032a.AbstractC0236c;

/* renamed from: androidx.appcompat.widget.n0 */
/* loaded from: classes.dex */
class View$OnClickListenerC0625n0 extends AbstractC0236c implements View.OnClickListener {

    /* renamed from: m */
    private final SearchView f2232m;

    /* renamed from: n */
    private final SearchableInfo f2233n;

    /* renamed from: o */
    private final Context f2234o;

    /* renamed from: p */
    private final WeakHashMap<String, Drawable.ConstantState> f2235p;

    /* renamed from: q */
    private final int f2236q;

    /* renamed from: t */
    private ColorStateList f2239t;

    /* renamed from: r */
    private boolean f2237r = false;

    /* renamed from: s */
    private int f2238s = 1;

    /* renamed from: u */
    private int f2240u = -1;

    /* renamed from: v */
    private int f2241v = -1;

    /* renamed from: w */
    private int f2242w = -1;

    /* renamed from: x */
    private int f2243x = -1;

    /* renamed from: y */
    private int f2244y = -1;

    /* renamed from: z */
    private int f2245z = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.n0$a */
    /* loaded from: classes.dex */
    public static final class C0626a {

        /* renamed from: a */
        public final TextView f2246a;

        /* renamed from: b */
        public final TextView f2247b;

        /* renamed from: c */
        public final ImageView f2248c;

        /* renamed from: d */
        public final ImageView f2249d;

        /* renamed from: e */
        public final ImageView f2250e;

        public C0626a(View view) {
            this.f2246a = (TextView) view.findViewById(16908308);
            this.f2247b = (TextView) view.findViewById(16908309);
            this.f2248c = (ImageView) view.findViewById(16908295);
            this.f2249d = (ImageView) view.findViewById(16908296);
            this.f2250e = (ImageView) view.findViewById(C0005f.edit_query);
        }
    }

    public View$OnClickListenerC0625n0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        SearchManager searchManager = (SearchManager) this.f689e.getSystemService("search");
        this.f2232m = searchView;
        this.f2233n = searchableInfo;
        this.f2236q = searchView.getSuggestionCommitIconResId();
        this.f2234o = context;
        this.f2235p = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m1943a(ComponentName componentName) {
        String nameNotFoundException;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f689e.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", nameNotFoundException);
        return null;
    }

    /* renamed from: a */
    private Drawable m1934a(String str) {
        Drawable.ConstantState constantState = this.f2235p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private static String m1941a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m1940a(Cursor cursor, String str) {
        return m1941a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m1937a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m1936a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m1933a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2235p.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m1932b(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f2235p.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f2235p.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f2234o.getResources());
        }
        Drawable a = m1943a(componentName);
        if (a != null) {
            constantState = a.getConstantState();
        }
        this.f2235p.put(flattenToShortString, constantState);
        return a;
    }

    /* renamed from: b */
    private Drawable m1929b(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1939a(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream openInputStream = this.f2234o.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                    try {
                        openInputStream.close();
                    } catch (IOException e) {
                        Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                    }
                    return createFromStream;
                }
                throw new FileNotFoundException("Failed to open " + uri);
            }
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: b */
    private Drawable m1927b(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2234o.getPackageName() + "/" + parseInt;
            Drawable a = m1934a(str2);
            if (a != null) {
                return a;
            }
            Drawable b = C0124a.m3732b(this.f2234o, parseInt);
            m1933a(str2, b);
            return b;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable a2 = m1934a(str);
            if (a2 != null) {
                return a2;
            }
            Drawable b2 = m1929b(Uri.parse(str));
            m1933a(str, b2);
            return b2;
        }
    }

    /* renamed from: b */
    private CharSequence m1928b(CharSequence charSequence) {
        if (this.f2239t == null) {
            TypedValue typedValue = new TypedValue();
            this.f689e.getTheme().resolveAttribute(C0000a.textColorSearchUrl, typedValue, true);
            this.f2239t = this.f689e.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2239t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    private Drawable m1926d(Cursor cursor) {
        Drawable b = m1932b(this.f2233n.getSearchActivity());
        return b != null ? b : this.f689e.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: e */
    private Drawable m1925e(Cursor cursor) {
        int i = this.f2243x;
        if (i == -1) {
            return null;
        }
        Drawable b = m1927b(cursor.getString(i));
        return b != null ? b : m1926d(cursor);
    }

    /* renamed from: f */
    private Drawable m1924f(Cursor cursor) {
        int i = this.f2244y;
        if (i == -1) {
            return null;
        }
        return m1927b(cursor.getString(i));
    }

    /* renamed from: g */
    private void m1923g(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    Cursor m1944a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f689e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: a */
    public Cursor mo1935a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2232m.getVisibility() == 0 && this.f2232m.getWindowVisibility() == 0) {
            try {
                Cursor a = m1944a(this.f2233n, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    Drawable m1939a(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f689e.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    @Override // p000a.p031h.p032a.AbstractC0231a, p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: a */
    public CharSequence mo1942a(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m1940a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f2233n.shouldRewriteQueryFromData() && (a2 = m1940a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f2233n.shouldRewriteQueryFromText() || (a = m1940a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public void m1945a(int i) {
        this.f2238s = i;
    }

    @Override // p000a.p031h.p032a.AbstractC0231a
    /* renamed from: a */
    public void mo1938a(View view, Context context, Cursor cursor) {
        C0626a aVar = (C0626a) view.getTag();
        int i = this.f2245z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f2246a != null) {
            m1936a(aVar.f2246a, m1941a(cursor, this.f2240u));
        }
        if (aVar.f2247b != null) {
            String a = m1941a(cursor, this.f2242w);
            CharSequence b = a != null ? m1928b((CharSequence) a) : m1941a(cursor, this.f2241v);
            if (TextUtils.isEmpty(b)) {
                TextView textView = aVar.f2246a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2246a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2246a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2246a.setMaxLines(1);
                }
            }
            m1936a(aVar.f2247b, b);
        }
        ImageView imageView = aVar.f2248c;
        if (imageView != null) {
            m1937a(imageView, m1925e(cursor), 4);
        }
        ImageView imageView2 = aVar.f2249d;
        if (imageView2 != null) {
            m1937a(imageView2, m1924f(cursor), 8);
        }
        int i3 = this.f2238s;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f2250e.setVisibility(0);
            aVar.f2250e.setTag(aVar.f2246a.getText());
            aVar.f2250e.setOnClickListener(this);
            return;
        }
        aVar.f2250e.setVisibility(8);
    }

    @Override // p000a.p031h.p032a.AbstractC0236c, p000a.p031h.p032a.AbstractC0231a
    /* renamed from: b */
    public View mo1931b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View b = super.mo1931b(context, cursor, viewGroup);
        b.setTag(new C0626a(b));
        ((ImageView) b.findViewById(C0005f.edit_query)).setImageResource(this.f2236q);
        return b;
    }

    @Override // p000a.p031h.p032a.AbstractC0231a, p000a.p031h.p032a.C0234b.AbstractC0235a
    /* renamed from: b */
    public void mo1930b(Cursor cursor) {
        if (this.f2237r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1930b(cursor);
            if (cursor != null) {
                this.f2240u = cursor.getColumnIndex("suggest_text_1");
                this.f2241v = cursor.getColumnIndex("suggest_text_2");
                this.f2242w = cursor.getColumnIndex("suggest_text_2_url");
                this.f2243x = cursor.getColumnIndex("suggest_icon_1");
                this.f2244y = cursor.getColumnIndex("suggest_icon_2");
                this.f2245z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p000a.p031h.p032a.AbstractC0231a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo3348a(this.f689e, this.f688d, viewGroup);
            if (a != null) {
                ((C0626a) a.getTag()).f2246a.setText(e.toString());
            }
            return a;
        }
    }

    @Override // p000a.p031h.p032a.AbstractC0231a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo1931b(this.f689e, this.f688d, viewGroup);
            if (b != null) {
                ((C0626a) b.getTag()).f2246a.setText(e.toString());
            }
            return b;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1923g(mo3349a());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1923g(mo3349a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2232m.m2236a((CharSequence) tag);
        }
    }
}
