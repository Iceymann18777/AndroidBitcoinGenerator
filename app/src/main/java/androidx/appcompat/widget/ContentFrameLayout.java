package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000a.p018g.p029l.C0216r;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    private TypedValue f1887b;

    /* renamed from: c */
    private TypedValue f1888c;

    /* renamed from: d */
    private TypedValue f1889d;

    /* renamed from: e */
    private TypedValue f1890e;

    /* renamed from: f */
    private TypedValue f1891f;

    /* renamed from: g */
    private TypedValue f1892g;

    /* renamed from: h */
    private final Rect f1893h;

    /* renamed from: i */
    private AbstractC0536a f1894i;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface AbstractC0536a {
        /* renamed from: a */
        void mo2245a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1893h = new Rect();
    }

    /* renamed from: a */
    public void m2247a(int i, int i2, int i3, int i4) {
        this.f1893h.set(i, i2, i3, i4);
        if (C0216r.m3397x(this)) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void m2246a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1891f == null) {
            this.f1891f = new TypedValue();
        }
        return this.f1891f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1892g == null) {
            this.f1892g = new TypedValue();
        }
        return this.f1892g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1889d == null) {
            this.f1889d = new TypedValue();
        }
        return this.f1889d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1890e == null) {
            this.f1890e = new TypedValue();
        }
        return this.f1890e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1887b == null) {
            this.f1887b = new TypedValue();
        }
        return this.f1887b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1888c == null) {
            this.f1888c = new TypedValue();
        }
        return this.f1888c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0536a aVar = this.f1894i;
        if (aVar != null) {
            aVar.mo2245a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0536a aVar = this.f1894i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(AbstractC0536a aVar) {
        this.f1894i = aVar;
    }
}
