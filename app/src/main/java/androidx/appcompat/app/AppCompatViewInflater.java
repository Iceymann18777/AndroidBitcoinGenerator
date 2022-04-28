package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C0581d;
import androidx.appcompat.widget.C0588f;
import androidx.appcompat.widget.C0592g;
import androidx.appcompat.widget.C0595h;
import androidx.appcompat.widget.C0614k;
import androidx.appcompat.widget.C0618m;
import androidx.appcompat.widget.C0627o;
import androidx.appcompat.widget.C0629p;
import androidx.appcompat.widget.C0632q0;
import androidx.appcompat.widget.C0635s;
import androidx.appcompat.widget.C0637t;
import androidx.appcompat.widget.C0639u;
import androidx.appcompat.widget.C0645w;
import androidx.appcompat.widget.C0658y;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p000a.p001a.C0009j;
import p000a.p001a.p006m.C0032d;
import p000a.p013d.C0067a;
import p000a.p018g.p029l.C0216r;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new C0067a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC0427a implements View.OnClickListener {

        /* renamed from: b */
        private final View f1389b;

        /* renamed from: c */
        private final String f1390c;

        /* renamed from: d */
        private Method f1391d;

        /* renamed from: e */
        private Context f1392e;

        public View$OnClickListenerC0427a(View view, String str) {
            this.f1389b = view;
            this.f1390c = str;
        }

        /* renamed from: a */
        private void m2661a(Context context, String str) {
            int id;
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1390c, View.class)) != null) {
                        this.f1391d = method;
                        this.f1392e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f1389b.getId() == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f1389b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1390c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1389b.getClass() + str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1391d == null) {
                m2661a(this.f1389b.getContext(), this.f1390c);
            }
            try {
                this.f1391d.invoke(this.f1392e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0216r.m3401t(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC0427a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Constructor<? extends View> constructor = sConstructorMap.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(sConstructorSignature);
                sConstructorMap.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            for (int i = 0; i < sClassPrefixList.length; i++) {
                View createViewByPrefix = createViewByPrefix(context, str, sClassPrefixList[i]);
                if (createViewByPrefix != null) {
                    return createViewByPrefix;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = null;
            objArr[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0009j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0009j.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C0032d) || ((C0032d) context).m4175a() != resourceId) ? new C0032d(context, resourceId) : context : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    protected C0581d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0581d(context, attributeSet);
    }

    protected C0588f createButton(Context context, AttributeSet attributeSet) {
        return new C0588f(context, attributeSet);
    }

    protected C0592g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C0592g(context, attributeSet);
    }

    protected C0595h createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C0595h(context, attributeSet);
    }

    protected C0614k createEditText(Context context, AttributeSet attributeSet) {
        return new C0614k(context, attributeSet);
    }

    protected C0618m createImageButton(Context context, AttributeSet attributeSet) {
        return new C0618m(context, attributeSet);
    }

    protected C0627o createImageView(Context context, AttributeSet attributeSet) {
        return new C0627o(context, attributeSet);
    }

    protected C0629p createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0629p(context, attributeSet);
    }

    protected C0635s createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0635s(context, attributeSet);
    }

    protected C0637t createRatingBar(Context context, AttributeSet attributeSet) {
        return new C0637t(context, attributeSet);
    }

    protected C0639u createSeekBar(Context context, AttributeSet attributeSet) {
        return new C0639u(context, attributeSet);
    }

    protected C0645w createSpinner(Context context, AttributeSet attributeSet) {
        return new C0645w(context, attributeSet);
    }

    protected C0658y createTextView(Context context, AttributeSet attributeSet) {
        return new C0658y(context, attributeSet);
    }

    protected View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0632q0.m1914b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = createTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 1:
                view2 = createImageView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 2:
                view2 = createButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 3:
                view2 = createEditText(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 4:
                view2 = createSpinner(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 5:
                view2 = createImageButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 6:
                view2 = createCheckBox(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\b':
                view2 = createCheckedTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\t':
                view2 = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\n':
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 11:
                view2 = createRatingBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\f':
                view2 = createSeekBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }
}
