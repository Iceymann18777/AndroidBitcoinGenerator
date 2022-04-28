package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.AbstractC0700c;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
class C0633r {

    /* renamed from: c */
    private static final int[] f2269c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f2270a;

    /* renamed from: b */
    private Bitmap f2271b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0633r(ProgressBar progressBar) {
        this.f2270a = progressBar;
    }

    /* renamed from: a */
    private Drawable m1912a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m1911a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m1911a(Drawable drawable, boolean z) {
        if (drawable instanceof AbstractC0700c) {
            AbstractC0700c cVar = (AbstractC0700c) drawable;
            Drawable a = cVar.mo1590a();
            if (a == null) {
                return drawable;
            }
            cVar.mo1588a(m1911a(a, z));
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1911a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2271b == null) {
                this.f2271b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m1910b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
    }

    /* renamed from: b */
    private Shape m1910b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap m1913a() {
        return this.f2271b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1845a(AttributeSet attributeSet, int i) {
        C0638t0 a = C0638t0.m1900a(this.f2270a.getContext(), attributeSet, f2269c, i, 0);
        Drawable c = a.m1897c(0);
        if (c != null) {
            this.f2270a.setIndeterminateDrawable(m1912a(c));
        }
        Drawable c2 = a.m1897c(1);
        if (c2 != null) {
            this.f2270a.setProgressDrawable(m1911a(c2, false));
        }
        a.m1908a();
    }
}
