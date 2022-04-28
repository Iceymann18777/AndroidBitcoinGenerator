package p000a.p018g.p027j;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p000a.p018g.p028k.C0180c;

/* renamed from: a.g.j.a */
/* loaded from: classes.dex */
public class C0175a implements Spannable {

    /* renamed from: b */
    private final Spannable f619b;

    /* renamed from: c */
    private final C0176a f620c;

    /* renamed from: d */
    private final PrecomputedText f621d;

    /* renamed from: a.g.j.a$a */
    /* loaded from: classes.dex */
    public static final class C0176a {

        /* renamed from: a */
        private final TextPaint f622a;

        /* renamed from: b */
        private final TextDirectionHeuristic f623b;

        /* renamed from: c */
        private final int f624c;

        /* renamed from: d */
        private final int f625d;

        /* renamed from: e */
        final PrecomputedText.Params f626e;

        /* renamed from: a.g.j.a$a$a */
        /* loaded from: classes.dex */
        public static class C0177a {

            /* renamed from: a */
            private final TextPaint f627a;

            /* renamed from: b */
            private TextDirectionHeuristic f628b;

            /* renamed from: c */
            private int f629c;

            /* renamed from: d */
            private int f630d;

            public C0177a(TextPaint textPaint) {
                this.f627a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f629c = 1;
                    this.f630d = 1;
                } else {
                    this.f630d = 0;
                    this.f629c = 0;
                }
                this.f628b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C0177a m3567a(int i) {
                this.f629c = i;
                return this;
            }

            /* renamed from: a */
            public C0177a m3566a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f628b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C0176a m3568a() {
                return new C0176a(this.f627a, this.f628b, this.f629c, this.f630d);
            }

            /* renamed from: b */
            public C0177a m3565b(int i) {
                this.f630d = i;
                return this;
            }
        }

        public C0176a(PrecomputedText.Params params) {
            this.f622a = params.getTextPaint();
            this.f623b = params.getTextDirection();
            this.f624c = params.getBreakStrategy();
            this.f625d = params.getHyphenationFrequency();
            this.f626e = params;
        }

        C0176a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f626e = Build.VERSION.SDK_INT >= 28 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f622a = textPaint;
            this.f623b = textDirectionHeuristic;
            this.f624c = i;
            this.f625d = i2;
        }

        /* renamed from: a */
        public int m3572a() {
            return this.f624c;
        }

        /* renamed from: b */
        public int m3571b() {
            return this.f625d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic m3570c() {
            return this.f623b;
        }

        /* renamed from: d */
        public TextPaint m3569d() {
            return this.f622a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0176a)) {
                return false;
            }
            C0176a aVar = (C0176a) obj;
            PrecomputedText.Params params = this.f626e;
            if (params != null) {
                return params.equals(aVar.f626e);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f624c != aVar.m3572a() || this.f625d != aVar.m3571b())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f623b != aVar.m3570c()) || this.f622a.getTextSize() != aVar.m3569d().getTextSize() || this.f622a.getTextScaleX() != aVar.m3569d().getTextScaleX() || this.f622a.getTextSkewX() != aVar.m3569d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f622a.getLetterSpacing() != aVar.m3569d().getLetterSpacing() || !TextUtils.equals(this.f622a.getFontFeatureSettings(), aVar.m3569d().getFontFeatureSettings()))) || this.f622a.getFlags() != aVar.m3569d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f622a.getTextLocales().equals(aVar.m3569d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f622a.getTextLocale().equals(aVar.m3569d().getTextLocale())) {
                return false;
            }
            if (this.f622a.getTypeface() == null) {
                if (aVar.m3569d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f622a.getTypeface().equals(aVar.m3569d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C0180c.m3561a(Float.valueOf(this.f622a.getTextSize()), Float.valueOf(this.f622a.getTextScaleX()), Float.valueOf(this.f622a.getTextSkewX()), Float.valueOf(this.f622a.getLetterSpacing()), Integer.valueOf(this.f622a.getFlags()), this.f622a.getTextLocales(), this.f622a.getTypeface(), Boolean.valueOf(this.f622a.isElegantTextHeight()), this.f623b, Integer.valueOf(this.f624c), Integer.valueOf(this.f625d));
            }
            if (i >= 21) {
                return C0180c.m3561a(Float.valueOf(this.f622a.getTextSize()), Float.valueOf(this.f622a.getTextScaleX()), Float.valueOf(this.f622a.getTextSkewX()), Float.valueOf(this.f622a.getLetterSpacing()), Integer.valueOf(this.f622a.getFlags()), this.f622a.getTextLocale(), this.f622a.getTypeface(), Boolean.valueOf(this.f622a.isElegantTextHeight()), this.f623b, Integer.valueOf(this.f624c), Integer.valueOf(this.f625d));
            }
            if (i < 18 && i < 17) {
                return C0180c.m3561a(Float.valueOf(this.f622a.getTextSize()), Float.valueOf(this.f622a.getTextScaleX()), Float.valueOf(this.f622a.getTextSkewX()), Integer.valueOf(this.f622a.getFlags()), this.f622a.getTypeface(), this.f623b, Integer.valueOf(this.f624c), Integer.valueOf(this.f625d));
            }
            return C0180c.m3561a(Float.valueOf(this.f622a.getTextSize()), Float.valueOf(this.f622a.getTextScaleX()), Float.valueOf(this.f622a.getTextSkewX()), Integer.valueOf(this.f622a.getFlags()), this.f622a.getTextLocale(), this.f622a.getTypeface(), this.f623b, Integer.valueOf(this.f624c), Integer.valueOf(this.f625d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p018g.p027j.C0175a.C0176a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C0176a m3574a() {
        return this.f620c;
    }

    /* renamed from: b */
    public PrecomputedText m3573b() {
        Spannable spannable = this.f619b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f619b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f619b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f619b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f619b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 28 ? (T[]) this.f621d.getSpans(i, i2, cls) : (T[]) this.f619b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f619b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f619b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f621d.removeSpan(obj);
        } else {
            this.f619b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f621d.setSpan(obj, i, i2, i3);
        } else {
            this.f619b.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f619b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f619b.toString();
    }
}
