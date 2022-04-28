package p000a.p046o.p047a.p048a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0698a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p000a.p013d.C0067a;
import p000a.p018g.p019d.p020c.C0140g;

/* renamed from: a.o.a.a.c */
/* loaded from: classes.dex */
public class C0394c extends AbstractC0403h implements AbstractC0393b {

    /* renamed from: c */
    private C0396b f1193c;

    /* renamed from: d */
    private Context f1194d;

    /* renamed from: e */
    private ArgbEvaluator f1195e;

    /* renamed from: f */
    final Drawable.Callback f1196f;

    /* renamed from: a.o.a.a.c$a */
    /* loaded from: classes.dex */
    class C0395a implements Drawable.Callback {
        C0395a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0394c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0394c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0394c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.c$b */
    /* loaded from: classes.dex */
    public static class C0396b extends Drawable.ConstantState {

        /* renamed from: a */
        int f1198a;

        /* renamed from: b */
        C0404i f1199b;

        /* renamed from: c */
        AnimatorSet f1200c;

        /* renamed from: d */
        ArrayList<Animator> f1201d;

        /* renamed from: e */
        C0067a<Animator, String> f1202e;

        public C0396b(Context context, C0396b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f1198a = bVar.f1198a;
                C0404i iVar = bVar.f1199b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f1199b = (C0404i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C0404i iVar2 = this.f1199b;
                    iVar2.mutate();
                    this.f1199b = iVar2;
                    this.f1199b.setCallback(callback);
                    this.f1199b.setBounds(bVar.f1199b.getBounds());
                    this.f1199b.m2721a(false);
                }
                ArrayList<Animator> arrayList = bVar.f1201d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f1201d = new ArrayList<>(size);
                    this.f1202e = new C0067a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f1201d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f1202e.get(animator);
                        clone.setTarget(this.f1199b.m2722a(str));
                        this.f1201d.add(clone);
                        this.f1202e.put(clone, str);
                    }
                    m2757a();
                }
            }
        }

        /* renamed from: a */
        public void m2757a() {
            if (this.f1200c == null) {
                this.f1200c = new AnimatorSet();
            }
            this.f1200c.playTogether(this.f1201d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1198a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: a.o.a.a.c$c */
    /* loaded from: classes.dex */
    private static class C0397c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f1203a;

        public C0397c(Drawable.ConstantState constantState) {
            this.f1203a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1203a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1203a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0394c cVar = new C0394c();
            cVar.f1208b = this.f1203a.newDrawable();
            cVar.f1208b.setCallback(cVar.f1196f);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0394c cVar = new C0394c();
            cVar.f1208b = this.f1203a.newDrawable(resources);
            cVar.f1208b.setCallback(cVar.f1196f);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0394c cVar = new C0394c();
            cVar.f1208b = this.f1203a.newDrawable(resources, theme);
            cVar.f1208b.setCallback(cVar.f1196f);
            return cVar;
        }
    }

    C0394c() {
        this(null, null, null);
    }

    private C0394c(Context context) {
        this(context, null, null);
    }

    private C0394c(Context context, C0396b bVar, Resources resources) {
        this.f1195e = null;
        this.f1196f = new C0395a();
        this.f1194d = context;
        if (bVar != null) {
            this.f1193c = bVar;
        } else {
            this.f1193c = new C0396b(context, bVar, this.f1196f, resources);
        }
    }

    /* renamed from: a */
    public static C0394c m2759a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0394c cVar = new C0394c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: a */
    private void m2760a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m2760a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f1195e == null) {
                    this.f1195e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f1195e);
            }
        }
    }

    /* renamed from: a */
    private void m2758a(String str, Animator animator) {
        animator.setTarget(this.f1193c.f1199b.m2722a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m2760a(animator);
        }
        C0396b bVar = this.f1193c;
        if (bVar.f1201d == null) {
            bVar.f1201d = new ArrayList<>();
            this.f1193c.f1202e = new C0067a<>();
        }
        this.f1193c.f1201d.add(animator);
        this.f1193c.f1202e.put(animator, str);
    }

    @Override // p000a.p046o.p047a.p048a.AbstractC0403h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1602a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            return C0698a.m1607a(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1193c.f1199b.draw(canvas);
        if (this.f1193c.f1200c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1208b;
        return drawable != null ? C0698a.m1596c(drawable) : this.f1193c.f1199b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1193c.f1198a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f1208b;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0397c(drawable.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1193c.f1199b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1193c.f1199b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.getOpacity() : this.f1193c.f1199b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1601a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1185e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0404i a = C0404i.m2726a(resources, resourceId, theme);
                        a.m2721a(false);
                        a.setCallback(this.f1196f);
                        C0404i iVar = this.f1193c.f1199b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f1193c.f1199b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0392a.f1186f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1194d;
                        if (context != null) {
                            m2758a(string, C0399e.m2750a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f1193c.m2757a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1208b;
        return drawable != null ? C0698a.m1593f(drawable) : this.f1193c.f1199b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f1208b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1193c.f1200c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.isStateful() : this.f1193c.f1199b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1193c.f1199b.setBounds(rect);
        }
    }

    @Override // p000a.p046o.p047a.p048a.AbstractC0403h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.setLevel(i) : this.f1193c.f1199b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.setState(iArr) : this.f1193c.f1199b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1193c.f1199b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1599a(drawable, z);
        } else {
            this.f1193c.f1199b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1193c.f1199b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTint(int i) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1597b(drawable, i);
        } else {
            this.f1193c.f1199b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1603a(drawable, colorStateList);
        } else {
            this.f1193c.f1199b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1600a(drawable, mode);
        } else {
            this.f1193c.f1199b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1193c.f1199b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f1193c.f1200c.isStarted()) {
            this.f1193c.f1200c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1193c.f1200c.end();
        }
    }
}
