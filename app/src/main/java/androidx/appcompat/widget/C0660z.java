package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.C0009j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
public class C0660z {

    /* renamed from: k */
    private static final RectF f2371k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f2372l = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f2373a = 0;

    /* renamed from: b */
    private boolean f2374b = false;

    /* renamed from: c */
    private float f2375c = -1.0f;

    /* renamed from: d */
    private float f2376d = -1.0f;

    /* renamed from: e */
    private float f2377e = -1.0f;

    /* renamed from: f */
    private int[] f2378f = new int[0];

    /* renamed from: g */
    private boolean f2379g = false;

    /* renamed from: h */
    private TextPaint f2380h;

    /* renamed from: i */
    private final TextView f2381i;

    /* renamed from: j */
    private final Context f2382j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0660z(TextView textView) {
        this.f2381i = textView;
        this.f2382j = this.f2381i.getContext();
    }

    /* renamed from: a */
    private int m1782a(RectF rectF) {
        int length = this.f2378f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1784a(this.f2378f[i4], rectF)) {
                    i2 = i4 + 1;
                    i3 = i2;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f2378f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private StaticLayout m1780a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        boolean z;
        float f;
        float f2;
        if (Build.VERSION.SDK_INT >= 16) {
            f2 = this.f2381i.getLineSpacingMultiplier();
            f = this.f2381i.getLineSpacingExtra();
            z = this.f2381i.getIncludeFontPadding();
        } else {
            f2 = ((Float) m1778a((Object) this.f2381i, "getLineSpacingMultiplier", (String) Float.valueOf(1.0f))).floatValue();
            f = ((Float) m1778a((Object) this.f2381i, "getLineSpacingExtra", (String) Float.valueOf(0.0f))).floatValue();
            z = ((Boolean) m1778a((Object) this.f2381i, "getIncludeFontPadding", (String) true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f2380h, i, alignment, f2, f, z);
    }

    /* renamed from: a */
    private StaticLayout m1779a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m1778a((Object) this.f2381i, "getTextDirectionHeuristic", (String) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f2380h, i).setAlignment(alignment).setLineSpacing(this.f2381i.getLineSpacingExtra(), this.f2381i.getLineSpacingMultiplier()).setIncludePad(this.f2381i.getIncludeFontPadding()).setBreakStrategy(this.f2381i.getBreakStrategy()).setHyphenationFrequency(this.f2381i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m1778a(Object obj, String str, T t) {
        try {
            return (T) m1777a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: a */
    private Method m1777a(String str) {
        try {
            Method method = f2372l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2372l.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1789a(float f) {
        if (f != this.f2381i.getPaint().getTextSize()) {
            this.f2381i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f2381i.isInLayout() : false;
            if (this.f2381i.getLayout() != null) {
                this.f2374b = false;
                try {
                    Method a = m1777a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f2381i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f2381i.requestLayout();
                } else {
                    this.f2381i.forceLayout();
                }
                this.f2381i.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m1788a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f2373a = 1;
            this.f2376d = f;
            this.f2377e = f2;
            this.f2375c = f3;
            this.f2379g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private void m1783a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2378f = m1776a(iArr);
            m1766j();
        }
    }

    /* renamed from: a */
    private boolean m1784a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2381i.getText();
        TransformationMethod transformationMethod = this.f2381i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f2381i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f2381i.getMaxLines() : -1;
        TextPaint textPaint = this.f2380h;
        if (textPaint == null) {
            this.f2380h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2380h.set(this.f2381i.getPaint());
        this.f2380h.setTextSize(i);
        Layout.Alignment alignment = (Layout.Alignment) m1778a((Object) this.f2381i, "getLayoutAlignment", (String) Layout.Alignment.ALIGN_NORMAL);
        StaticLayout a = Build.VERSION.SDK_INT >= 23 ? m1779a(text, alignment, Math.round(rectF.right), maxLines) : m1780a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m1776a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private void m1768h() {
        this.f2373a = 0;
        this.f2376d = -1.0f;
        this.f2377e = -1.0f;
        this.f2375c = -1.0f;
        this.f2378f = new int[0];
        this.f2374b = false;
    }

    /* renamed from: i */
    private boolean m1767i() {
        if (!m1765k() || this.f2373a != 1) {
            this.f2374b = false;
        } else {
            if (!this.f2379g || this.f2378f.length == 0) {
                float round = Math.round(this.f2376d);
                int i = 1;
                while (Math.round(this.f2375c + round) <= Math.round(this.f2377e)) {
                    i++;
                    round += this.f2375c;
                }
                int[] iArr = new int[i];
                float f = this.f2376d;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f2375c;
                }
                this.f2378f = m1776a(iArr);
            }
            this.f2374b = true;
        }
        return this.f2374b;
    }

    /* renamed from: j */
    private boolean m1766j() {
        int length = this.f2378f.length;
        this.f2379g = length > 0;
        if (this.f2379g) {
            this.f2373a = 1;
            int[] iArr = this.f2378f;
            this.f2376d = iArr[0];
            this.f2377e = iArr[length - 1];
            this.f2375c = -1.0f;
        }
        return this.f2379g;
    }

    /* renamed from: k */
    private boolean m1765k() {
        return !(this.f2381i instanceof C0614k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1790a() {
        if (m1769g()) {
            if (this.f2374b) {
                if (this.f2381i.getMeasuredHeight() > 0 && this.f2381i.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) m1778a((Object) this.f2381i, "getHorizontallyScrolling", (String) false)).booleanValue() ? 1048576 : (this.f2381i.getMeasuredWidth() - this.f2381i.getTotalPaddingLeft()) - this.f2381i.getTotalPaddingRight();
                    int height = (this.f2381i.getHeight() - this.f2381i.getCompoundPaddingBottom()) - this.f2381i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f2371k) {
                            f2371k.setEmpty();
                            f2371k.right = measuredWidth;
                            f2371k.bottom = height;
                            float a = m1782a(f2371k);
                            if (a != this.f2381i.getTextSize()) {
                                m1786a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2374b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1787a(int i) {
        if (!m1765k()) {
            return;
        }
        if (i == 0) {
            m1768h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f2382j.getResources().getDisplayMetrics();
            m1788a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1767i()) {
                m1790a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1786a(int i, float f) {
        Context context = this.f2382j;
        m1789a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1785a(int i, int i2, int i3, int i4) {
        if (m1765k()) {
            DisplayMetrics displayMetrics = this.f2382j.getResources().getDisplayMetrics();
            m1788a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m1767i()) {
                m1790a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1781a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2382j.obtainStyledAttributes(attributeSet, C0009j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizeTextType)) {
            this.f2373a = obtainStyledAttributes.getInt(C0009j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0009j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0009j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0009j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0009j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1783a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1765k()) {
            this.f2373a = 0;
        } else if (this.f2373a == 1) {
            if (!this.f2379g) {
                DisplayMetrics displayMetrics = this.f2382j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1788a(dimension2, dimension3, dimension);
            }
            m1767i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1775a(int[] iArr, int i) {
        if (m1765k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2382j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f2378f = m1776a(iArr2);
                if (!m1766j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2379g = false;
            }
            if (m1767i()) {
                m1790a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m1774b() {
        return Math.round(this.f2377e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1773c() {
        return Math.round(this.f2376d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m1772d() {
        return Math.round(this.f2375c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m1771e() {
        return this.f2378f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m1770f() {
        return this.f2373a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m1769g() {
        return m1765k() && this.f2373a != 0;
    }
}
