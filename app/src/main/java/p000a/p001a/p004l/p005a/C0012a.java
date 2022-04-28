package p000a.p001a.p004l.p005a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p013d.C0072d;
import p000a.p013d.C0081h;
import p000a.p018g.p019d.p020c.C0140g;
import p000a.p046o.p047a.p048a.C0394c;
import p000a.p046o.p047a.p048a.C0404i;

/* renamed from: a.a.l.a.a */
/* loaded from: classes.dex */
public class C0012a extends C0026e {

    /* renamed from: p */
    private C0015c f6p;

    /* renamed from: q */
    private AbstractC0019g f7q;

    /* renamed from: r */
    private int f8r;

    /* renamed from: s */
    private int f9s;

    /* renamed from: t */
    private boolean f10t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.l.a.a$b */
    /* loaded from: classes.dex */
    public static class C0014b extends AbstractC0019g {

        /* renamed from: a */
        private final Animatable f11a;

        C0014b(Animatable animatable) {
            super();
            this.f11a = animatable;
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo4236c() {
            this.f11a.start();
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo4235d() {
            this.f11a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.a$c */
    /* loaded from: classes.dex */
    public static class C0015c extends C0026e.C0027a {

        /* renamed from: K */
        C0072d<Long> f12K;

        /* renamed from: L */
        C0081h<Integer> f13L;

        C0015c(C0015c cVar, C0012a aVar, Resources resources) {
            super(cVar, aVar, resources);
            C0081h<Integer> hVar;
            if (cVar != null) {
                this.f12K = cVar.f12K;
                hVar = cVar.f13L;
            } else {
                this.f12K = new C0072d<>();
                hVar = new C0081h<>();
            }
            this.f13L = hVar;
        }

        /* renamed from: f */
        private static long m4241f(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: a */
        int m4248a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.m4221a(drawable);
            long f = m4241f(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = a;
            this.f12K.m4059a(f, Long.valueOf(j2 | j));
            if (z) {
                this.f12K.m4059a(m4241f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* renamed from: a */
        int m4247a(int[] iArr, Drawable drawable, int i) {
            int a = super.m4188a(iArr, drawable);
            this.f13L.m4003c(a, Integer.valueOf(i));
            return a;
        }

        /* renamed from: b */
        int m4246b(int[] iArr) {
            int a = super.m4189a(iArr);
            return a >= 0 ? a : super.m4189a(StateSet.WILD_CARD);
        }

        /* renamed from: c */
        int m4245c(int i, int i2) {
            return (int) this.f12K.m4055b(m4241f(i, i2), -1L).longValue();
        }

        /* renamed from: d */
        int m4244d(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f13L.m4006b(i, 0).intValue();
        }

        /* renamed from: d */
        boolean m4243d(int i, int i2) {
            return (this.f12K.m4055b(m4241f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: e */
        boolean m4242e(int i, int i2) {
            return (this.f12K.m4055b(m4241f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p000a.p001a.p004l.p005a.C0026e.C0027a, p000a.p001a.p004l.p005a.C0020b.AbstractC0023c
        /* renamed from: m */
        void mo4187m() {
            this.f12K = this.f12K.clone();
            this.f13L = this.f13L.clone();
        }

        @Override // p000a.p001a.p004l.p005a.C0026e.C0027a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0012a(this, null);
        }

        @Override // p000a.p001a.p004l.p005a.C0026e.C0027a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0012a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.l.a.a$d */
    /* loaded from: classes.dex */
    public static class C0016d extends AbstractC0019g {

        /* renamed from: a */
        private final C0394c f14a;

        C0016d(C0394c cVar) {
            super();
            this.f14a = cVar;
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo4236c() {
            this.f14a.start();
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo4235d() {
            this.f14a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.l.a.a$e */
    /* loaded from: classes.dex */
    public static class C0017e extends AbstractC0019g {

        /* renamed from: a */
        private final ObjectAnimator f15a;

        /* renamed from: b */
        private final boolean f16b;

        C0017e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0018f fVar = new C0018f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.m4240a());
            ofInt.setInterpolator(fVar);
            this.f16b = z2;
            this.f15a = ofInt;
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: a */
        public boolean mo4238a() {
            return this.f16b;
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: b */
        public void mo4237b() {
            this.f15a.reverse();
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: c */
        public void mo4236c() {
            this.f15a.start();
        }

        @Override // p000a.p001a.p004l.p005a.C0012a.AbstractC0019g
        /* renamed from: d */
        public void mo4235d() {
            this.f15a.cancel();
        }
    }

    /* renamed from: a.a.l.a.a$f */
    /* loaded from: classes.dex */
    private static class C0018f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f17a;

        /* renamed from: b */
        private int f18b;

        /* renamed from: c */
        private int f19c;

        C0018f(AnimationDrawable animationDrawable, boolean z) {
            m4239a(animationDrawable, z);
        }

        /* renamed from: a */
        int m4240a() {
            return this.f19c;
        }

        /* renamed from: a */
        int m4239a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f18b = numberOfFrames;
            int[] iArr = this.f17a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f17a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f17a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f19c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f19c) + 0.5f);
            int i2 = this.f18b;
            int[] iArr = this.f17a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f19c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.l.a.a$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0019g {
        private AbstractC0019g() {
        }

        /* renamed from: a */
        public boolean mo4238a() {
            return false;
        }

        /* renamed from: b */
        public void mo4237b() {
        }

        /* renamed from: c */
        public abstract void mo4236c();

        /* renamed from: d */
        public abstract void mo4235d();
    }

    public C0012a() {
        this(null, null);
    }

    C0012a(C0015c cVar, Resources resources) {
        super(null);
        this.f8r = -1;
        this.f9s = -1;
        mo4192a(new C0015c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    private void m4255a(TypedArray typedArray) {
        C0015c cVar = this.f6p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f46d |= typedArray.getChangingConfigurations();
        }
        cVar.m4215b(typedArray.getBoolean(C0009j.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f51i));
        cVar.m4220a(typedArray.getBoolean(C0009j.AnimatedStateListDrawableCompat_android_constantSize, cVar.f54l));
        cVar.m4218b(typedArray.getInt(C0009j.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f34A));
        cVar.m4213c(typedArray.getInt(C0009j.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f35B));
        setDither(typedArray.getBoolean(C0009j.AnimatedStateListDrawableCompat_android_dither, cVar.f66x));
    }

    /* renamed from: b */
    public static C0012a m4253b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0012a aVar = new C0012a();
            aVar.m4256a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: b */
    private boolean m4254b(int i) {
        int i2;
        int c;
        AbstractC0019g gVar;
        AbstractC0019g gVar2 = this.f7q;
        if (gVar2 == null) {
            i2 = m4229b();
        } else if (i == this.f8r) {
            return true;
        } else {
            if (i != this.f9s || !gVar2.mo4238a()) {
                i2 = this.f8r;
                gVar2.mo4235d();
            } else {
                gVar2.mo4237b();
                this.f8r = this.f9s;
                this.f9s = i;
                return true;
            }
        }
        this.f7q = null;
        this.f9s = -1;
        this.f8r = -1;
        C0015c cVar = this.f6p;
        int d = cVar.m4244d(i2);
        int d2 = cVar.m4244d(i);
        if (d2 == 0 || d == 0 || (c = cVar.m4245c(d, d2)) < 0) {
            return false;
        }
        boolean e = cVar.m4242e(d, d2);
        m4234a(c);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C0017e((AnimationDrawable) current, cVar.m4243d(d, d2), e);
        } else if (current instanceof C0394c) {
            gVar = new C0016d((C0394c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C0014b((Animatable) current);
            }
            return false;
        }
        gVar.mo4236c();
        this.f7q = gVar;
        this.f9s = i2;
        this.f8r = i;
        return true;
    }

    /* renamed from: c */
    private void m4252c() {
        onStateChange(getState());
    }

    /* renamed from: c */
    private void m4251c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m4250d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m4249e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m4250d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0009j.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C0009j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C0009j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable c = resourceId2 > 0 ? C0010a.m4259c(context, resourceId2) : null;
        a.recycle();
        int[] a2 = m4191a(attributeSet);
        if (c == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                c = xmlPullParser.getName().equals("vector") ? C0404i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (c != null) {
            return this.f6p.m4247a(a2, c, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: e */
    private int m4249e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0009j.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C0009j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C0009j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C0009j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable c = resourceId3 > 0 ? C0010a.m4259c(context, resourceId3) : null;
        boolean z = a.getBoolean(C0009j.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (c == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                c = xmlPullParser.getName().equals("animated-vector") ? C0394c.m2759a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (c == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f6p.m4248a(resourceId, resourceId2, c, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    public C0015c mo4193a() {
        return new C0015c(this.f6p, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b
    /* renamed from: a */
    public void mo4192a(C0020b.AbstractC0023c cVar) {
        super.mo4192a(cVar);
        if (cVar instanceof C0015c) {
            this.f6p = (C0015c) cVar;
        }
    }

    /* renamed from: a */
    public void m4256a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0009j.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C0009j.AnimatedStateListDrawableCompat_android_visible, true), true);
        m4255a(a);
        m4233a(resources);
        a.recycle();
        m4251c(context, resources, xmlPullParser, attributeSet, theme);
        m4252c();
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0019g gVar = this.f7q;
        if (gVar != null) {
            gVar.mo4235d();
            this.f7q = null;
            m4234a(this.f8r);
            this.f8r = -1;
            this.f9s = -1;
        }
    }

    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f10t) {
            super.mutate();
            if (this == this) {
                this.f6p.mo4187m();
                this.f10t = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.p004l.p005a.C0026e, p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int b = this.f6p.m4246b(iArr);
        boolean z = b != m4229b() && (m4254b(b) || m4234a(b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p000a.p001a.p004l.p005a.C0020b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f7q != null && (visible || z2)) {
            if (z) {
                this.f7q.mo4236c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
