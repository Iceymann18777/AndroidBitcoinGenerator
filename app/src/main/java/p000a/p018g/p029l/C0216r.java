package p000a.p018g.p029l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p018g.C0122b;

/* renamed from: a.g.l.r */
/* loaded from: classes.dex */
public class C0216r {

    /* renamed from: a */
    private static Field f660a;

    /* renamed from: b */
    private static boolean f661b;

    /* renamed from: c */
    private static Field f662c;

    /* renamed from: d */
    private static boolean f663d;

    /* renamed from: e */
    private static WeakHashMap<View, String> f664e;

    /* renamed from: g */
    private static Field f666g;

    /* renamed from: i */
    private static ThreadLocal<Rect> f668i;

    /* renamed from: f */
    private static WeakHashMap<View, C0223v> f665f = null;

    /* renamed from: h */
    private static boolean f667h = false;

    /* renamed from: a.g.l.r$a */
    /* loaded from: classes.dex */
    static class View$OnApplyWindowInsetsListenerC0217a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC0213o f669a;

        View$OnApplyWindowInsetsListenerC0217a(AbstractC0213o oVar) {
            this.f669a = oVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) C0230z.m3360a(this.f669a.mo86a(view, C0230z.m3359a(windowInsets)));
        }
    }

    /* renamed from: a.g.l.r$b */
    /* loaded from: classes.dex */
    public interface AbstractC0218b {
        /* renamed from: a */
        boolean m3394a(View view, KeyEvent keyEvent);
    }

    /* renamed from: a.g.l.r$c */
    /* loaded from: classes.dex */
    static class C0219c {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f670d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f671a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f672b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f673c = null;

        C0219c() {
        }

        /* renamed from: a */
        static C0219c m3391a(View view) {
            C0219c cVar = (C0219c) view.getTag(C0122b.tag_unhandled_key_event_manager);
            if (cVar != null) {
                return cVar;
            }
            C0219c cVar2 = new C0219c();
            view.setTag(C0122b.tag_unhandled_key_event_manager, cVar2);
            return cVar2;
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m3393a() {
            if (this.f672b == null) {
                this.f672b = new SparseArray<>();
            }
            return this.f672b;
        }

        /* renamed from: b */
        private View m3388b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f671a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m3388b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m3387c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        private void m3389b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f671a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f670d.isEmpty()) {
                synchronized (f670d) {
                    if (this.f671a == null) {
                        this.f671a = new WeakHashMap<>();
                    }
                    for (int size = f670d.size() - 1; size >= 0; size--) {
                        View view = f670d.get(size).get();
                        if (view == null) {
                            f670d.remove(size);
                        } else {
                            this.f671a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f671a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m3387c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0122b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((AbstractC0218b) arrayList.get(size)).m3394a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        boolean m3392a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f673c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f673c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> a = m3393a();
            if (keyEvent.getAction() == 1 && (indexOfKey = a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = a.valueAt(indexOfKey);
                a.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && C0216r.m3398w(view)) {
                m3387c(view, keyEvent);
            }
            return true;
        }

        /* renamed from: a */
        boolean m3390a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m3389b();
            }
            View b = m3388b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3393a().put(keyCode, new WeakReference<>(b));
                }
            }
            return b != null;
        }
    }

    static {
        new AtomicInteger(1);
    }

    /* renamed from: A */
    public static void m3450A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: B */
    public static void m3449B(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: C */
    public static void m3448C(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof AbstractC0208j) {
            ((AbstractC0208j) view).stopNestedScroll();
        }
    }

    /* renamed from: D */
    private static void m3447D(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static C0223v m3445a(View view) {
        if (f665f == null) {
            f665f = new WeakHashMap<>();
        }
        C0223v vVar = f665f.get(view);
        if (vVar != null) {
            return vVar;
        }
        C0223v vVar2 = new C0223v(view);
        f665f.put(view, vVar2);
        return vVar2;
    }

    /* renamed from: a */
    public static C0230z m3438a(View view, C0230z zVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return zVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0230z.m3360a(zVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0230z.m3359a(windowInsets);
    }

    /* renamed from: a */
    private static Rect m3446a() {
        if (f668i == null) {
            f668i = new ThreadLocal<>();
        }
        Rect rect = f668i.get();
        if (rect == null) {
            rect = new Rect();
            f668i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static void m3444a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    private static void m3443a(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m3447D(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m3447D((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m3442a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m3441a(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m3440a(View view, C0185a aVar) {
        view.setAccessibilityDelegate(aVar == null ? null : aVar.m3554a());
    }

    /* renamed from: a */
    public static void m3439a(View view, AbstractC0213o oVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (oVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0217a(oVar));
        }
    }

    /* renamed from: a */
    public static void m3437a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC0215q) {
            ((AbstractC0215q) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m3436a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC0215q) {
            ((AbstractC0215q) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m3435a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m3434a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m3432a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m3431a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m3430a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f664e == null) {
            f664e = new WeakHashMap<>();
        }
        f664e.put(view, str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m3429a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m3433a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0219c.m3391a(view).m3390a(view, keyEvent);
    }

    /* renamed from: b */
    public static C0230z m3426b(View view, C0230z zVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return zVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0230z.m3360a(zVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0230z.m3359a(windowInsets);
    }

    /* renamed from: b */
    public static ColorStateList m3428b(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof AbstractC0215q) {
            return ((AbstractC0215q) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: b */
    private static void m3427b(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m3447D(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m3447D((View) parent);
            }
        }
    }

    /* renamed from: b */
    public static void m3424b(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m3425b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0219c.m3391a(view).m3392a(keyEvent);
    }

    /* renamed from: c */
    public static PorterDuff.Mode m3423c(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof AbstractC0215q) {
            return ((AbstractC0215q) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m3422c(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect a = m3446a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m3443a(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m3443a(view, i);
        }
    }

    /* renamed from: d */
    public static Rect m3421d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: d */
    public static void m3420d(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect a = m3446a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m3427b(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m3427b(view, i);
        }
    }

    /* renamed from: e */
    public static Display m3419e(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m3398w(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: e */
    public static void m3418e(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: f */
    public static float m3417f(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: f */
    public static void m3416f(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: g */
    public static void m3414g(View view, int i) {
        if (view instanceof AbstractC0207i) {
            ((AbstractC0207i) view).mo1010a(i);
        } else if (i == 0) {
            m3448C(view);
        }
    }

    /* renamed from: g */
    public static boolean m3415g(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: h */
    public static int m3413h(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: i */
    public static int m3412i(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: j */
    public static int m3411j(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: k */
    public static int m3410k(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f663d) {
            try {
                f662c = View.class.getDeclaredField("mMinHeight");
                f662c.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f663d = true;
        }
        Field field = f662c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: l */
    public static int m3409l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f661b) {
            try {
                f660a = View.class.getDeclaredField("mMinWidth");
                f660a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f661b = true;
        }
        Field field = f660a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: m */
    public static int m3408m(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: n */
    public static int m3407n(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: o */
    public static ViewParent m3406o(View view) {
        return Build.VERSION.SDK_INT >= 16 ? view.getParentForAccessibility() : view.getParent();
    }

    /* renamed from: p */
    public static String m3405p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f664e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: q */
    public static int m3404q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: r */
    public static float m3403r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: s */
    public static boolean m3402s(View view) {
        if (f667h) {
            return false;
        }
        if (f666g == null) {
            try {
                f666g = View.class.getDeclaredField("mAccessibilityDelegate");
                f666g.setAccessible(true);
            } catch (Throwable unused) {
                f667h = true;
                return false;
            }
        }
        try {
            return f666g.get(view) != null;
        } catch (Throwable unused2) {
            f667h = true;
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m3401t(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m3400u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m3399v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m3398w(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: x */
    public static boolean m3397x(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: y */
    public static boolean m3396y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof AbstractC0208j) {
            return ((AbstractC0208j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m3395z(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }
}
