package p000a.p046o.p047a.p048a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.graphics.drawable.C0698a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p013d.C0067a;
import p000a.p018g.p019d.p020c.C0127b;
import p000a.p018g.p019d.p020c.C0136f;
import p000a.p018g.p019d.p020c.C0140g;
import p000a.p018g.p021e.C0142b;

/* renamed from: a.o.a.a.i */
/* loaded from: classes.dex */
public class C0404i extends AbstractC0403h {

    /* renamed from: k */
    static final PorterDuff.Mode f1209k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C0412h f1210c;

    /* renamed from: d */
    private PorterDuffColorFilter f1211d;

    /* renamed from: e */
    private ColorFilter f1212e;

    /* renamed from: f */
    private boolean f1213f;

    /* renamed from: g */
    private boolean f1214g;

    /* renamed from: h */
    private final float[] f1215h;

    /* renamed from: i */
    private final Matrix f1216i;

    /* renamed from: j */
    private final Rect f1217j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.i$b */
    /* loaded from: classes.dex */
    public static class C0406b extends AbstractC0410f {
        public C0406b() {
        }

        public C0406b(C0406b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        private void m2719a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1245b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f1244a = C0142b.m3667a(string2);
            }
        }

        /* renamed from: a */
        public void m2720a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0140g.m3675a(xmlPullParser, "pathData")) {
                TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1184d);
                m2719a(a);
                a.recycle();
            }
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0410f
        /* renamed from: b */
        public boolean mo2708b() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.i$c */
    /* loaded from: classes.dex */
    public static class C0407c extends AbstractC0410f {

        /* renamed from: d */
        private int[] f1218d;

        /* renamed from: e */
        C0127b f1219e;

        /* renamed from: f */
        float f1220f;

        /* renamed from: g */
        C0127b f1221g;

        /* renamed from: h */
        float f1222h;

        /* renamed from: i */
        int f1223i;

        /* renamed from: j */
        float f1224j;

        /* renamed from: k */
        float f1225k;

        /* renamed from: l */
        float f1226l;

        /* renamed from: m */
        float f1227m;

        /* renamed from: n */
        Paint.Cap f1228n;

        /* renamed from: o */
        Paint.Join f1229o;

        /* renamed from: p */
        float f1230p;

        public C0407c() {
            this.f1220f = 0.0f;
            this.f1222h = 1.0f;
            this.f1223i = 0;
            this.f1224j = 1.0f;
            this.f1225k = 0.0f;
            this.f1226l = 1.0f;
            this.f1227m = 0.0f;
            this.f1228n = Paint.Cap.BUTT;
            this.f1229o = Paint.Join.MITER;
            this.f1230p = 4.0f;
        }

        public C0407c(C0407c cVar) {
            super(cVar);
            this.f1220f = 0.0f;
            this.f1222h = 1.0f;
            this.f1223i = 0;
            this.f1224j = 1.0f;
            this.f1225k = 0.0f;
            this.f1226l = 1.0f;
            this.f1227m = 0.0f;
            this.f1228n = Paint.Cap.BUTT;
            this.f1229o = Paint.Join.MITER;
            this.f1230p = 4.0f;
            this.f1218d = cVar.f1218d;
            this.f1219e = cVar.f1219e;
            this.f1220f = cVar.f1220f;
            this.f1222h = cVar.f1222h;
            this.f1221g = cVar.f1221g;
            this.f1223i = cVar.f1223i;
            this.f1224j = cVar.f1224j;
            this.f1225k = cVar.f1225k;
            this.f1226l = cVar.f1226l;
            this.f1227m = cVar.f1227m;
            this.f1228n = cVar.f1228n;
            this.f1229o = cVar.f1229o;
            this.f1230p = cVar.f1230p;
        }

        /* renamed from: a */
        private Paint.Cap m2718a(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: a */
        private Paint.Join m2717a(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: a */
        private void m2715a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f1218d = null;
            if (C0140g.m3675a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1245b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f1244a = C0142b.m3667a(string2);
                }
                this.f1221g = C0140g.m3680a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f1224j = C0140g.m3678a(typedArray, xmlPullParser, "fillAlpha", 12, this.f1224j);
                this.f1228n = m2718a(C0140g.m3673b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f1228n);
                this.f1229o = m2717a(C0140g.m3673b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f1229o);
                this.f1230p = C0140g.m3678a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f1230p);
                this.f1219e = C0140g.m3680a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f1222h = C0140g.m3678a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1222h);
                this.f1220f = C0140g.m3678a(typedArray, xmlPullParser, "strokeWidth", 4, this.f1220f);
                this.f1226l = C0140g.m3678a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f1226l);
                this.f1227m = C0140g.m3678a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f1227m);
                this.f1225k = C0140g.m3678a(typedArray, xmlPullParser, "trimPathStart", 5, this.f1225k);
                this.f1223i = C0140g.m3673b(typedArray, xmlPullParser, "fillType", 13, this.f1223i);
            }
        }

        /* renamed from: a */
        public void m2716a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1183c);
            m2715a(a, xmlPullParser, theme);
            a.recycle();
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0409e
        /* renamed from: a */
        public boolean mo2711a() {
            return this.f1221g.m3714d() || this.f1219e.m3714d();
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0409e
        /* renamed from: a */
        public boolean mo2710a(int[] iArr) {
            return this.f1219e.m3719a(iArr) | this.f1221g.m3719a(iArr);
        }

        float getFillAlpha() {
            return this.f1224j;
        }

        int getFillColor() {
            return this.f1221g.m3724a();
        }

        float getStrokeAlpha() {
            return this.f1222h;
        }

        int getStrokeColor() {
            return this.f1219e.m3724a();
        }

        float getStrokeWidth() {
            return this.f1220f;
        }

        float getTrimPathEnd() {
            return this.f1226l;
        }

        float getTrimPathOffset() {
            return this.f1227m;
        }

        float getTrimPathStart() {
            return this.f1225k;
        }

        void setFillAlpha(float f) {
            this.f1224j = f;
        }

        void setFillColor(int i) {
            this.f1221g.m3723a(i);
        }

        void setStrokeAlpha(float f) {
            this.f1222h = f;
        }

        void setStrokeColor(int i) {
            this.f1219e.m3723a(i);
        }

        void setStrokeWidth(float f) {
            this.f1220f = f;
        }

        void setTrimPathEnd(float f) {
            this.f1226l = f;
        }

        void setTrimPathOffset(float f) {
            this.f1227m = f;
        }

        void setTrimPathStart(float f) {
            this.f1225k = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.i$d */
    /* loaded from: classes.dex */
    public static class C0408d extends AbstractC0409e {

        /* renamed from: a */
        final Matrix f1231a;

        /* renamed from: b */
        final ArrayList<AbstractC0409e> f1232b;

        /* renamed from: c */
        float f1233c;

        /* renamed from: d */
        private float f1234d;

        /* renamed from: e */
        private float f1235e;

        /* renamed from: f */
        private float f1236f;

        /* renamed from: g */
        private float f1237g;

        /* renamed from: h */
        private float f1238h;

        /* renamed from: i */
        private float f1239i;

        /* renamed from: j */
        final Matrix f1240j;

        /* renamed from: k */
        int f1241k;

        /* renamed from: l */
        private int[] f1242l;

        /* renamed from: m */
        private String f1243m;

        public C0408d() {
            super();
            this.f1231a = new Matrix();
            this.f1232b = new ArrayList<>();
            this.f1233c = 0.0f;
            this.f1234d = 0.0f;
            this.f1235e = 0.0f;
            this.f1236f = 1.0f;
            this.f1237g = 1.0f;
            this.f1238h = 0.0f;
            this.f1239i = 0.0f;
            this.f1240j = new Matrix();
            this.f1243m = null;
        }

        public C0408d(C0408d dVar, C0067a<String, Object> aVar) {
            super();
            AbstractC0410f fVar;
            this.f1231a = new Matrix();
            this.f1232b = new ArrayList<>();
            this.f1233c = 0.0f;
            this.f1234d = 0.0f;
            this.f1235e = 0.0f;
            this.f1236f = 1.0f;
            this.f1237g = 1.0f;
            this.f1238h = 0.0f;
            this.f1239i = 0.0f;
            this.f1240j = new Matrix();
            this.f1243m = null;
            this.f1233c = dVar.f1233c;
            this.f1234d = dVar.f1234d;
            this.f1235e = dVar.f1235e;
            this.f1236f = dVar.f1236f;
            this.f1237g = dVar.f1237g;
            this.f1238h = dVar.f1238h;
            this.f1239i = dVar.f1239i;
            this.f1242l = dVar.f1242l;
            this.f1243m = dVar.f1243m;
            this.f1241k = dVar.f1241k;
            String str = this.f1243m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f1240j.set(dVar.f1240j);
            ArrayList<AbstractC0409e> arrayList = dVar.f1232b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC0409e eVar = arrayList.get(i);
                if (eVar instanceof C0408d) {
                    this.f1232b.add(new C0408d((C0408d) eVar, aVar));
                } else {
                    if (eVar instanceof C0407c) {
                        fVar = new C0407c((C0407c) eVar);
                    } else if (eVar instanceof C0406b) {
                        fVar = new C0406b((C0406b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f1232b.add(fVar);
                    String str2 = fVar.f1245b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m2713a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f1242l = null;
            this.f1233c = C0140g.m3678a(typedArray, xmlPullParser, "rotation", 5, this.f1233c);
            this.f1234d = typedArray.getFloat(1, this.f1234d);
            this.f1235e = typedArray.getFloat(2, this.f1235e);
            this.f1236f = C0140g.m3678a(typedArray, xmlPullParser, "scaleX", 3, this.f1236f);
            this.f1237g = C0140g.m3678a(typedArray, xmlPullParser, "scaleY", 4, this.f1237g);
            this.f1238h = C0140g.m3678a(typedArray, xmlPullParser, "translateX", 6, this.f1238h);
            this.f1239i = C0140g.m3678a(typedArray, xmlPullParser, "translateY", 7, this.f1239i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1243m = string;
            }
            m2712b();
        }

        /* renamed from: b */
        private void m2712b() {
            this.f1240j.reset();
            this.f1240j.postTranslate(-this.f1234d, -this.f1235e);
            this.f1240j.postScale(this.f1236f, this.f1237g);
            this.f1240j.postRotate(this.f1233c, 0.0f, 0.0f);
            this.f1240j.postTranslate(this.f1238h + this.f1234d, this.f1239i + this.f1235e);
        }

        /* renamed from: a */
        public void m2714a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1182b);
            m2713a(a, xmlPullParser);
            a.recycle();
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0409e
        /* renamed from: a */
        public boolean mo2711a() {
            for (int i = 0; i < this.f1232b.size(); i++) {
                if (this.f1232b.get(i).mo2711a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000a.p046o.p047a.p048a.C0404i.AbstractC0409e
        /* renamed from: a */
        public boolean mo2710a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f1232b.size(); i++) {
                z |= this.f1232b.get(i).mo2710a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.f1243m;
        }

        public Matrix getLocalMatrix() {
            return this.f1240j;
        }

        public float getPivotX() {
            return this.f1234d;
        }

        public float getPivotY() {
            return this.f1235e;
        }

        public float getRotation() {
            return this.f1233c;
        }

        public float getScaleX() {
            return this.f1236f;
        }

        public float getScaleY() {
            return this.f1237g;
        }

        public float getTranslateX() {
            return this.f1238h;
        }

        public float getTranslateY() {
            return this.f1239i;
        }

        public void setPivotX(float f) {
            if (f != this.f1234d) {
                this.f1234d = f;
                m2712b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f1235e) {
                this.f1235e = f;
                m2712b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f1233c) {
                this.f1233c = f;
                m2712b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f1236f) {
                this.f1236f = f;
                m2712b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f1237g) {
                this.f1237g = f;
                m2712b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f1238h) {
                this.f1238h = f;
                m2712b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f1239i) {
                this.f1239i = f;
                m2712b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.i$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0409e {
        private AbstractC0409e() {
        }

        /* renamed from: a */
        public boolean mo2711a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo2710a(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.i$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0410f extends AbstractC0409e {

        /* renamed from: a */
        protected C0142b.C0144b[] f1244a;

        /* renamed from: b */
        String f1245b;

        /* renamed from: c */
        int f1246c;

        public AbstractC0410f() {
            super();
            this.f1244a = null;
        }

        public AbstractC0410f(AbstractC0410f fVar) {
            super();
            this.f1244a = null;
            this.f1245b = fVar.f1245b;
            this.f1246c = fVar.f1246c;
            this.f1244a = C0142b.m3662a(fVar.f1244a);
        }

        /* renamed from: a */
        public void m2709a(Path path) {
            path.reset();
            C0142b.C0144b[] bVarArr = this.f1244a;
            if (bVarArr != null) {
                C0142b.C0144b.m3653a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo2708b() {
            return false;
        }

        public C0142b.C0144b[] getPathData() {
            return this.f1244a;
        }

        public String getPathName() {
            return this.f1245b;
        }

        public void setPathData(C0142b.C0144b[] bVarArr) {
            if (!C0142b.m3661a(this.f1244a, bVarArr)) {
                this.f1244a = C0142b.m3662a(bVarArr);
            } else {
                C0142b.m3659b(this.f1244a, bVarArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.i$g */
    /* loaded from: classes.dex */
    public static class C0411g {

        /* renamed from: q */
        private static final Matrix f1247q = new Matrix();

        /* renamed from: a */
        private final Path f1248a;

        /* renamed from: b */
        private final Path f1249b;

        /* renamed from: c */
        private final Matrix f1250c;

        /* renamed from: d */
        Paint f1251d;

        /* renamed from: e */
        Paint f1252e;

        /* renamed from: f */
        private PathMeasure f1253f;

        /* renamed from: g */
        private int f1254g;

        /* renamed from: h */
        final C0408d f1255h;

        /* renamed from: i */
        float f1256i;

        /* renamed from: j */
        float f1257j;

        /* renamed from: k */
        float f1258k;

        /* renamed from: l */
        float f1259l;

        /* renamed from: m */
        int f1260m;

        /* renamed from: n */
        String f1261n;

        /* renamed from: o */
        Boolean f1262o;

        /* renamed from: p */
        final C0067a<String, Object> f1263p;

        public C0411g() {
            this.f1250c = new Matrix();
            this.f1256i = 0.0f;
            this.f1257j = 0.0f;
            this.f1258k = 0.0f;
            this.f1259l = 0.0f;
            this.f1260m = 255;
            this.f1261n = null;
            this.f1262o = null;
            this.f1263p = new C0067a<>();
            this.f1255h = new C0408d();
            this.f1248a = new Path();
            this.f1249b = new Path();
        }

        public C0411g(C0411g gVar) {
            this.f1250c = new Matrix();
            this.f1256i = 0.0f;
            this.f1257j = 0.0f;
            this.f1258k = 0.0f;
            this.f1259l = 0.0f;
            this.f1260m = 255;
            this.f1261n = null;
            this.f1262o = null;
            this.f1263p = new C0067a<>();
            this.f1255h = new C0408d(gVar.f1255h, this.f1263p);
            this.f1248a = new Path(gVar.f1248a);
            this.f1249b = new Path(gVar.f1249b);
            this.f1256i = gVar.f1256i;
            this.f1257j = gVar.f1257j;
            this.f1258k = gVar.f1258k;
            this.f1259l = gVar.f1259l;
            this.f1254g = gVar.f1254g;
            this.f1260m = gVar.f1260m;
            this.f1261n = gVar.f1261n;
            String str = gVar.f1261n;
            if (str != null) {
                this.f1263p.put(str, this);
            }
            this.f1262o = gVar.f1262o;
        }

        /* renamed from: a */
        private static float m2706a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m2702a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m2706a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m2705a(C0408d dVar, AbstractC0410f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f1258k;
            float f2 = i2 / this.f1259l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f1231a;
            this.f1250c.set(matrix);
            this.f1250c.postScale(f, f2);
            float a = m2702a(matrix);
            if (a != 0.0f) {
                fVar.m2709a(this.f1248a);
                Path path = this.f1248a;
                this.f1249b.reset();
                if (fVar.mo2708b()) {
                    this.f1249b.addPath(path, this.f1250c);
                    canvas.clipPath(this.f1249b);
                    return;
                }
                C0407c cVar = (C0407c) fVar;
                if (!(cVar.f1225k == 0.0f && cVar.f1226l == 1.0f)) {
                    float f3 = cVar.f1225k;
                    float f4 = cVar.f1227m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f1226l + f4) % 1.0f;
                    if (this.f1253f == null) {
                        this.f1253f = new PathMeasure();
                    }
                    this.f1253f.setPath(this.f1248a, false);
                    float length = this.f1253f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f1253f.getSegment(f7, length, path, true);
                        this.f1253f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f1253f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f1249b.addPath(path, this.f1250c);
                if (cVar.f1221g.m3713e()) {
                    C0127b bVar = cVar.f1221g;
                    if (this.f1252e == null) {
                        this.f1252e = new Paint(1);
                        this.f1252e.setStyle(Paint.Style.FILL);
                    }
                    Paint paint = this.f1252e;
                    if (bVar.m3715c()) {
                        Shader b = bVar.m3718b();
                        b.setLocalMatrix(this.f1250c);
                        paint.setShader(b);
                        paint.setAlpha(Math.round(cVar.f1224j * 255.0f));
                    } else {
                        paint.setColor(C0404i.m2728a(bVar.m3724a(), cVar.f1224j));
                    }
                    paint.setColorFilter(colorFilter);
                    this.f1249b.setFillType(cVar.f1223i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f1249b, paint);
                }
                if (cVar.f1219e.m3713e()) {
                    C0127b bVar2 = cVar.f1219e;
                    if (this.f1251d == null) {
                        this.f1251d = new Paint(1);
                        this.f1251d.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint2 = this.f1251d;
                    Paint.Join join = cVar.f1229o;
                    if (join != null) {
                        paint2.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f1228n;
                    if (cap != null) {
                        paint2.setStrokeCap(cap);
                    }
                    paint2.setStrokeMiter(cVar.f1230p);
                    if (bVar2.m3715c()) {
                        Shader b2 = bVar2.m3718b();
                        b2.setLocalMatrix(this.f1250c);
                        paint2.setShader(b2);
                        paint2.setAlpha(Math.round(cVar.f1222h * 255.0f));
                    } else {
                        paint2.setColor(C0404i.m2728a(bVar2.m3724a(), cVar.f1222h));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(cVar.f1220f * min * a);
                    canvas.drawPath(this.f1249b, paint2);
                }
            }
        }

        /* renamed from: a */
        private void m2704a(C0408d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f1231a.set(matrix);
            dVar.f1231a.preConcat(dVar.f1240j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f1232b.size(); i3++) {
                AbstractC0409e eVar = dVar.f1232b.get(i3);
                if (eVar instanceof C0408d) {
                    m2704a((C0408d) eVar, dVar.f1231a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof AbstractC0410f) {
                    m2705a(dVar, (AbstractC0410f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void m2703a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m2704a(this.f1255h, f1247q, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        public boolean m2707a() {
            if (this.f1262o == null) {
                this.f1262o = Boolean.valueOf(this.f1255h.mo2711a());
            }
            return this.f1262o.booleanValue();
        }

        /* renamed from: a */
        public boolean m2701a(int[] iArr) {
            return this.f1255h.mo2710a(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f1260m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f1260m = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.i$h */
    /* loaded from: classes.dex */
    public static class C0412h extends Drawable.ConstantState {

        /* renamed from: a */
        int f1264a;

        /* renamed from: b */
        C0411g f1265b;

        /* renamed from: c */
        ColorStateList f1266c;

        /* renamed from: d */
        PorterDuff.Mode f1267d;

        /* renamed from: e */
        boolean f1268e;

        /* renamed from: f */
        Bitmap f1269f;

        /* renamed from: g */
        ColorStateList f1270g;

        /* renamed from: h */
        PorterDuff.Mode f1271h;

        /* renamed from: i */
        int f1272i;

        /* renamed from: j */
        boolean f1273j;

        /* renamed from: k */
        boolean f1274k;

        /* renamed from: l */
        Paint f1275l;

        public C0412h() {
            this.f1266c = null;
            this.f1267d = C0404i.f1209k;
            this.f1265b = new C0411g();
        }

        public C0412h(C0412h hVar) {
            this.f1266c = null;
            this.f1267d = C0404i.f1209k;
            if (hVar != null) {
                this.f1264a = hVar.f1264a;
                this.f1265b = new C0411g(hVar.f1265b);
                Paint paint = hVar.f1265b.f1252e;
                if (paint != null) {
                    this.f1265b.f1252e = new Paint(paint);
                }
                Paint paint2 = hVar.f1265b.f1251d;
                if (paint2 != null) {
                    this.f1265b.f1251d = new Paint(paint2);
                }
                this.f1266c = hVar.f1266c;
                this.f1267d = hVar.f1267d;
                this.f1268e = hVar.f1268e;
            }
        }

        /* renamed from: a */
        public Paint m2697a(ColorFilter colorFilter) {
            if (!m2695b() && colorFilter == null) {
                return null;
            }
            if (this.f1275l == null) {
                this.f1275l = new Paint();
                this.f1275l.setFilterBitmap(true);
            }
            this.f1275l.setAlpha(this.f1265b.getRootAlpha());
            this.f1275l.setColorFilter(colorFilter);
            return this.f1275l;
        }

        /* renamed from: a */
        public void m2698a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f1269f, (Rect) null, rect, m2697a(colorFilter));
        }

        /* renamed from: a */
        public boolean m2700a() {
            return !this.f1274k && this.f1270g == this.f1266c && this.f1271h == this.f1267d && this.f1273j == this.f1268e && this.f1272i == this.f1265b.getRootAlpha();
        }

        /* renamed from: a */
        public boolean m2699a(int i, int i2) {
            return i == this.f1269f.getWidth() && i2 == this.f1269f.getHeight();
        }

        /* renamed from: a */
        public boolean m2696a(int[] iArr) {
            boolean a = this.f1265b.m2701a(iArr);
            this.f1274k |= a;
            return a;
        }

        /* renamed from: b */
        public void m2694b(int i, int i2) {
            if (this.f1269f == null || !m2699a(i, i2)) {
                this.f1269f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f1274k = true;
            }
        }

        /* renamed from: b */
        public boolean m2695b() {
            return this.f1265b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void m2692c(int i, int i2) {
            this.f1269f.eraseColor(0);
            this.f1265b.m2703a(new Canvas(this.f1269f), i, i2, (ColorFilter) null);
        }

        /* renamed from: c */
        public boolean m2693c() {
            return this.f1265b.m2707a();
        }

        /* renamed from: d */
        public void m2691d() {
            this.f1270g = this.f1266c;
            this.f1271h = this.f1267d;
            this.f1272i = this.f1265b.getRootAlpha();
            this.f1273j = this.f1268e;
            this.f1274k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1264a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0404i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0404i(this);
        }
    }

    /* renamed from: a.o.a.a.i$i */
    /* loaded from: classes.dex */
    private static class C0413i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f1276a;

        public C0413i(Drawable.ConstantState constantState) {
            this.f1276a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1276a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1276a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0404i iVar = new C0404i();
            iVar.f1208b = (VectorDrawable) this.f1276a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0404i iVar = new C0404i();
            iVar.f1208b = (VectorDrawable) this.f1276a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0404i iVar = new C0404i();
            iVar.f1208b = (VectorDrawable) this.f1276a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C0404i() {
        this.f1214g = true;
        this.f1215h = new float[9];
        this.f1216i = new Matrix();
        this.f1217j = new Rect();
        this.f1210c = new C0412h();
    }

    C0404i(C0412h hVar) {
        this.f1214g = true;
        this.f1215h = new float[9];
        this.f1216i = new Matrix();
        this.f1217j = new Rect();
        this.f1210c = hVar;
        this.f1211d = m2723a(this.f1211d, hVar.f1266c, hVar.f1267d);
    }

    /* renamed from: a */
    static int m2728a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: a */
    public static C0404i m2726a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0404i iVar = new C0404i();
            iVar.f1208b = C0136f.m3684a(resources, i, theme);
            new C0413i(iVar.f1208b.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    /* renamed from: a */
    private static PorterDuff.Mode m2727a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m2725a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        C0406b bVar;
        C0412h hVar = this.f1210c;
        C0411g gVar = hVar.f1265b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f1255h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0408d dVar = (C0408d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0407c cVar = new C0407c();
                    cVar.m2716a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1232b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f1263p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    C0406b bVar2 = new C0406b();
                    bVar2.m2720a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1232b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.f1263p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    C0408d dVar2 = new C0408d();
                    dVar2.m2714a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1232b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f1263p.put(dVar2.getGroupName(), dVar2);
                    }
                    i = hVar.f1264a;
                    i2 = dVar2.f1241k;
                    hVar.f1264a = i2 | i;
                }
                i = hVar.f1264a;
                i2 = bVar.f1246c;
                hVar.f1264a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    private void m2724a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0412h hVar = this.f1210c;
        C0411g gVar = hVar.f1265b;
        hVar.f1267d = m2727a(C0140g.m3673b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            hVar.f1266c = colorStateList;
        }
        hVar.f1268e = C0140g.m3676a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f1268e);
        gVar.f1258k = C0140g.m3678a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f1258k);
        gVar.f1259l = C0140g.m3678a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f1259l);
        if (gVar.f1258k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (gVar.f1259l > 0.0f) {
            gVar.f1256i = typedArray.getDimension(3, gVar.f1256i);
            gVar.f1257j = typedArray.getDimension(2, gVar.f1257j);
            if (gVar.f1256i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (gVar.f1257j > 0.0f) {
                gVar.setAlpha(C0140g.m3678a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f1261n = string;
                    gVar.f1263p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: a */
    private boolean m2729a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0698a.m1594e(this) == 1;
    }

    public static C0404i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0404i iVar = new C0404i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: a */
    PorterDuffColorFilter m2723a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Object m2722a(String str) {
        return this.f1210c.f1265b.f1263p.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2721a(boolean z) {
        this.f1214g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1208b;
        if (drawable == null) {
            return false;
        }
        C0698a.m1607a(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f1217j);
        if (this.f1217j.width() > 0 && this.f1217j.height() > 0) {
            ColorFilter colorFilter = this.f1212e;
            if (colorFilter == null) {
                colorFilter = this.f1211d;
            }
            canvas.getMatrix(this.f1216i);
            this.f1216i.getValues(this.f1215h);
            float abs = Math.abs(this.f1215h[0]);
            float abs2 = Math.abs(this.f1215h[4]);
            float abs3 = Math.abs(this.f1215h[1]);
            float abs4 = Math.abs(this.f1215h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.f1217j.width() * abs));
            int min2 = Math.min(2048, (int) (this.f1217j.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f1217j;
                canvas.translate(rect.left, rect.top);
                if (m2729a()) {
                    canvas.translate(this.f1217j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f1217j.offsetTo(0, 0);
                this.f1210c.m2694b(min, min2);
                if (!this.f1214g) {
                    this.f1210c.m2692c(min, min2);
                } else if (!this.f1210c.m2700a()) {
                    this.f1210c.m2692c(min, min2);
                    this.f1210c.m2691d();
                }
                this.f1210c.m2698a(canvas, colorFilter, this.f1217j);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1208b;
        return drawable != null ? C0698a.m1596c(drawable) : this.f1210c.f1265b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1210c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f1208b;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C0413i(drawable.getConstantState());
        }
        this.f1210c.f1264a = getChangingConfigurations();
        return this.f1210c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1210c.f1265b.f1257j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1210c.f1265b.f1256i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1601a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0412h hVar = this.f1210c;
        hVar.f1265b = new C0411g();
        TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1181a);
        m2724a(a, xmlPullParser);
        a.recycle();
        hVar.f1264a = getChangingConfigurations();
        hVar.f1274k = true;
        m2725a(resources, xmlPullParser, attributeSet, theme);
        this.f1211d = m2723a(this.f1211d, hVar.f1266c, hVar.f1267d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1208b;
        return drawable != null ? C0698a.m1593f(drawable) : this.f1210c.f1268e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0412h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f1210c) != null && (hVar.m2693c() || ((colorStateList = this.f1210c.f1266c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1213f && super.mutate() == this) {
            this.f1210c = new C0412h(this.f1210c);
            this.f1213f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0412h hVar = this.f1210c;
        ColorStateList colorStateList = hVar.f1266c;
        if (!(colorStateList == null || (mode = hVar.f1267d) == null)) {
            this.f1211d = m2723a(this.f1211d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.m2693c() || !hVar.m2696a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1210c.f1265b.getRootAlpha() != i) {
            this.f1210c.f1265b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1599a(drawable, z);
        } else {
            this.f1210c.f1268e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f1212e = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTint(int i) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1597b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1603a(drawable, colorStateList);
            return;
        }
        C0412h hVar = this.f1210c;
        if (hVar.f1266c != colorStateList) {
            hVar.f1266c = colorStateList;
            this.f1211d = m2723a(this.f1211d, colorStateList, hVar.f1267d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.AbstractC0699b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            C0698a.m1600a(drawable, mode);
            return;
        }
        C0412h hVar = this.f1210c;
        if (hVar.f1267d != mode) {
            hVar.f1267d = mode;
            this.f1211d = m2723a(this.f1211d, hVar.f1266c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1208b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1208b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
