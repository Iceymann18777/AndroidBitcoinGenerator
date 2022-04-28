package p000a.p046o.p047a.p048a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p018g.p019d.p020c.C0140g;
import p000a.p018g.p021e.C0142b;

/* renamed from: a.o.a.a.e */
/* loaded from: classes.dex */
public class C0399e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.o.a.a.e$a */
    /* loaded from: classes.dex */
    public static class C0400a implements TypeEvaluator<C0142b.C0144b[]> {

        /* renamed from: a */
        private C0142b.C0144b[] f1204a;

        C0400a() {
        }

        /* renamed from: a */
        public C0142b.C0144b[] evaluate(float f, C0142b.C0144b[] bVarArr, C0142b.C0144b[] bVarArr2) {
            if (C0142b.m3661a(bVarArr, bVarArr2)) {
                C0142b.C0144b[] bVarArr3 = this.f1204a;
                if (bVarArr3 == null || !C0142b.m3661a(bVarArr3, bVarArr)) {
                    this.f1204a = C0142b.m3662a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f1204a[i].m3657a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f1204a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static int m2740a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1190j);
        int i = 0;
        TypedValue b = C0140g.m3674b(a, xmlPullParser, "value", 0);
        if ((b != null) && m2754a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m2739a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !m2754a(i3)) && (!z || !m2754a(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    /* renamed from: a */
    public static Animator m2750a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m2749a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m2749a(Context context, Resources resources, Resources.Theme theme, int i) {
        return m2748a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m2748a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m2744a(context, resources, theme, xmlResourceParser, f);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: a */
    private static Animator m2744a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m2742a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m2742a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p046o.p047a.p048a.C0399e.m2742a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m2753a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static Keyframe m2746a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1190j);
        float a2 = C0140g.m3678a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b = C0140g.m3674b(a, xmlPullParser, "value", 0);
        boolean z = b != null;
        if (i == 4) {
            i = (!z || !m2754a(b.type)) ? 0 : 3;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(a2, C0140g.m3673b(a, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(a2, C0140g.m3678a(a, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(a2) : Keyframe.ofInt(a2);
        int c = C0140g.m3672c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            ofInt.setInterpolator(C0398d.m2756a(context, c));
        }
        a.recycle();
        return ofInt;
    }

    /* renamed from: a */
    private static ObjectAnimator m2747a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m2745a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m2741a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        int i2 = i;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = m2740a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe a = m2746a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i2, xmlPullParser);
                if (a != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m2753a(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m2753a(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i3 = 0; i3 < size; i3++) {
                Keyframe keyframe3 = keyframeArr[i3];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i3 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i4 = size - 1;
                        if (i3 == i4) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i5 = i3 + 1;
                            int i6 = i3;
                            while (i5 < i4 && keyframeArr[i5].getFraction() < 0.0f) {
                                i5++;
                                i6 = i5;
                            }
                            m2736a(keyframeArr, keyframeArr[i6 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i6);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i2 == 3) {
                propertyValuesHolder.setEvaluator(C0401f.m2734a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m2738a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolder;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m2754a(i4)) && (!z2 || !m2754a(i5))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder2 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0142b.C0144b[] a = C0142b.m3667a(string);
            C0142b.C0144b[] a2 = C0142b.m3667a(string2);
            if (a == null && a2 == null) {
                return null;
            }
            if (a != null) {
                C0400a aVar = new C0400a();
                if (a2 == null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, aVar, a);
                } else if (C0142b.m3661a(a, a2)) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, aVar, a, a2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder;
            } else if (a2 != null) {
                return PropertyValuesHolder.ofObject(str, new C0400a(), a2);
            } else {
                return null;
            }
        } else {
            C0401f a3 = i == 3 ? C0401f.m2734a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m2754a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2754a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder2 = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder2 = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m2754a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder2 == null || a3 == null) {
                return propertyValuesHolder2;
            }
            propertyValuesHolder2.setEvaluator(a3);
            return propertyValuesHolder2;
        }
    }

    /* renamed from: a */
    private static ValueAnimator m2745a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1187g);
        TypedArray a2 = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1191k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m2751a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0140g.m3672c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C0398d.m2756a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m2752a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C0140g.m3679a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C0140g.m3679a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C0140g.m3679a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a2 == null && a3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m2737a(C0142b.m3660b(a), objectAnimator, f * 0.5f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C0140g.m3679a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m2751a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long b = C0140g.m3673b(typedArray, xmlPullParser, "duration", 1, 300);
        long b2 = C0140g.m3673b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int b3 = C0140g.m3673b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0140g.m3675a(xmlPullParser, "valueFrom") && C0140g.m3675a(xmlPullParser, "valueTo")) {
            if (b3 == 4) {
                b3 = m2739a(typedArray, 5, 6);
            }
            PropertyValuesHolder a = m2738a(typedArray, b3, 5, 6, "");
            if (a != null) {
                valueAnimator.setValues(a);
            }
        }
        valueAnimator.setDuration(b);
        valueAnimator.setStartDelay(b2);
        valueAnimator.setRepeatCount(C0140g.m3673b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0140g.m3673b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m2752a(valueAnimator, typedArray2, b3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m2737a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / (min - 1);
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }

    /* renamed from: a */
    private static void m2736a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m2754a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    private static PropertyValuesHolder[] m2743a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray a = C0140g.m3681a(resources, theme, attributeSet, C0392a.f1189i);
                String a2 = C0140g.m3679a(a, xmlPullParser, "propertyName", 3);
                int b = C0140g.m3673b(a, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder a3 = m2741a(context, resources, theme, xmlPullParser, a2, b);
                if (a3 == null) {
                    a3 = m2738a(a, b, 0, 1, a2);
                }
                if (a3 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a3);
                }
                a.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }
}
