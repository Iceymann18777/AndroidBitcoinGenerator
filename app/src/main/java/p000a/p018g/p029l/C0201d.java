package p000a.p018g.p029l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.g.l.d */
/* loaded from: classes.dex */
public class C0201d {

    /* renamed from: a */
    private static boolean f648a;

    /* renamed from: b */
    private static Method f649b;

    /* renamed from: c */
    private static boolean f650c;

    /* renamed from: d */
    private static Field f651d;

    /* renamed from: a.g.l.d$a */
    /* loaded from: classes.dex */
    public interface AbstractC0202a {
        /* renamed from: a */
        boolean mo1631a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m3485a(Dialog dialog) {
        if (!f650c) {
            try {
                f651d = Dialog.class.getDeclaredField("mOnKeyListener");
                f651d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f650c = true;
        }
        Field field = f651d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m3488a(AbstractC0202a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo1631a(keyEvent) : callback instanceof Activity ? m3486a((Activity) callback, keyEvent) : callback instanceof Dialog ? m3484a((Dialog) callback, keyEvent) : (view != null && C0216r.m3433a(view, keyEvent)) || aVar.mo1631a(keyEvent);
    }

    /* renamed from: a */
    private static boolean m3487a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f648a) {
            try {
                f649b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f648a = true;
        }
        Method method = f649b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3486a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m3487a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0216r.m3433a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static boolean m3484a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener a = m3485a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0216r.m3433a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: a */
    public static boolean m3483a(View view, KeyEvent keyEvent) {
        return C0216r.m3425b(view, keyEvent);
    }
}
