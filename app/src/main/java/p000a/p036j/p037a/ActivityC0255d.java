package p000a.p036j.p037a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.ActivityC0693c;
import androidx.core.app.C0688a;
import androidx.lifecycle.AbstractC0742e;
import androidx.lifecycle.AbstractC0762s;
import androidx.lifecycle.C0761r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p013d.C0081h;
import p000a.p041l.p042a.AbstractC0309a;

/* renamed from: a.j.a.d */
/* loaded from: classes.dex */
public class ActivityC0255d extends ActivityC0693c implements AbstractC0762s, C0688a.AbstractC0689a, C0688a.AbstractC0691c {

    /* renamed from: e */
    private C0761r f838e;

    /* renamed from: f */
    boolean f839f;

    /* renamed from: g */
    boolean f840g;

    /* renamed from: i */
    boolean f842i;

    /* renamed from: j */
    boolean f843j;

    /* renamed from: k */
    int f844k;

    /* renamed from: l */
    C0081h<String> f845l;

    /* renamed from: c */
    final Handler f836c = new HandlerC0256a();

    /* renamed from: d */
    final C0260f f837d = C0260f.m3165a(new C0257b());

    /* renamed from: h */
    boolean f841h = true;

    /* renamed from: a.j.a.d$a */
    /* loaded from: classes.dex */
    class HandlerC0256a extends Handler {
        HandlerC0256a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            ActivityC0255d.this.m3173f();
            ActivityC0255d.this.f837d.m3146i();
        }
    }

    /* renamed from: a.j.a.d$b */
    /* loaded from: classes.dex */
    class C0257b extends AbstractC0261g<ActivityC0255d> {
        public C0257b() {
            super(ActivityC0255d.this);
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public View mo3169a(int i) {
            return ActivityC0255d.this.findViewById(i);
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: a */
        public void mo3141a(ComponentCallbacksC0248c cVar) {
            ActivityC0255d.this.m3180a(cVar);
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: a */
        public void mo3140a(ComponentCallbacksC0248c cVar, Intent intent, int i, Bundle bundle) {
            ActivityC0255d.this.m3179a(cVar, intent, i, bundle);
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: a */
        public void mo3139a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0255d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // p000a.p036j.p037a.AbstractC0259e
        /* renamed from: a */
        public boolean mo3170a() {
            Window window = ActivityC0255d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: b */
        public boolean mo3137b(ComponentCallbacksC0248c cVar) {
            return !ActivityC0255d.this.isFinishing();
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: f */
        public LayoutInflater mo3133f() {
            return ActivityC0255d.this.getLayoutInflater().cloneInContext(ActivityC0255d.this);
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: g */
        public int mo3132g() {
            Window window = ActivityC0255d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: h */
        public boolean mo3131h() {
            return ActivityC0255d.this.getWindow() != null;
        }

        @Override // p000a.p036j.p037a.AbstractC0261g
        /* renamed from: i */
        public void mo3130i() {
            ActivityC0255d.this.mo2630h();
        }
    }

    /* renamed from: a.j.a.d$c */
    /* loaded from: classes.dex */
    static final class C0258c {

        /* renamed from: a */
        C0761r f848a;

        /* renamed from: b */
        C0282j f849b;

        C0258c() {
        }
    }

    /* renamed from: a */
    static void m3181a(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: a */
    private static boolean m3178a(AbstractC0262h hVar, AbstractC0742e.EnumC0744b bVar) {
        boolean z = false;
        for (ComponentCallbacksC0248c cVar : hVar.mo3071b()) {
            if (cVar != null) {
                if (cVar.mo1368a().mo1386a().m1387a(AbstractC0742e.EnumC0744b.STARTED)) {
                    cVar.f785T.m1384a(bVar);
                    z = true;
                }
                AbstractC0262h O = cVar.m3271O();
                if (O != null) {
                    z |= m3178a(O, bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m3175b(ComponentCallbacksC0248c cVar) {
        if (this.f845l.m4008b() < 65534) {
            while (this.f845l.m4004c(this.f844k) >= 0) {
                this.f844k = (this.f844k + 1) % 65534;
            }
            int i = this.f844k;
            this.f845l.m4003c(i, cVar.f794g);
            this.f844k = (this.f844k + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: i */
    private void m3171i() {
        do {
        } while (m3178a(m3174e(), AbstractC0742e.EnumC0744b.CREATED));
    }

    /* renamed from: a */
    final View m3176a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f837d.m3159a(view, str, context, attributeSet);
    }

    @Override // androidx.core.app.ActivityC0693c, androidx.lifecycle.AbstractC0746g
    /* renamed from: a */
    public AbstractC0742e mo1368a() {
        return super.mo1368a();
    }

    /* renamed from: a */
    public void m3180a(ComponentCallbacksC0248c cVar) {
    }

    /* renamed from: a */
    public void m3179a(ComponentCallbacksC0248c cVar, Intent intent, int i, Bundle bundle) {
        this.f843j = true;
        try {
            if (i == -1) {
                C0688a.m1635a(this, intent, -1, bundle);
                return;
            }
            m3181a(i);
            C0688a.m1635a(this, intent, ((m3175b(cVar) + 1) << 16) + (i & 65535), bundle);
        } finally {
            this.f843j = false;
        }
    }

    /* renamed from: a */
    protected boolean m3177a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.lifecycle.AbstractC0762s
    /* renamed from: b */
    public C0761r mo1343b() {
        if (getApplication() != null) {
            if (this.f838e == null) {
                C0258c cVar = (C0258c) getLastNonConfigurationInstance();
                if (cVar != null) {
                    this.f838e = cVar.f848a;
                }
                if (this.f838e == null) {
                    this.f838e = new C0761r();
                }
            }
            return this.f838e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f839f);
        printWriter.print(" mResumed=");
        printWriter.print(this.f840g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f841h);
        if (getApplication() != null) {
            AbstractC0309a.m2949a(this).mo2947a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f837d.m3145j().mo3077a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public AbstractC0262h m3174e() {
        return this.f837d.m3145j();
    }

    /* renamed from: f */
    protected void m3173f() {
        this.f837d.m3149f();
    }

    /* renamed from: g */
    public Object m3172g() {
        return null;
    }

    @Deprecated
    /* renamed from: h */
    public void mo2630h() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f837d.m3144k();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String b = this.f845l.m4007b(i4);
            this.f845l.m4001e(i4);
            if (b == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0248c a = this.f837d.m3158a(b);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + b);
                return;
            }
            a.m3257a(i & 65535, i2, intent);
            return;
        }
        C0688a.AbstractC0690b a2 = C0688a.m1637a();
        if (a2 == null || !a2.m1634a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC0262h j = this.f837d.m3145j();
        boolean c = j.mo3055c();
        if (c && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (c || !j.mo3048d()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f837d.m3144k();
        this.f837d.m3164a(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0693c, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0761r rVar;
        C0282j jVar = null;
        this.f837d.m3166a((ComponentCallbacksC0248c) null);
        super.onCreate(bundle);
        C0258c cVar = (C0258c) getLastNonConfigurationInstance();
        if (!(cVar == null || (rVar = cVar.f848a) == null || this.f838e != null)) {
            this.f838e = rVar;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0260f fVar = this.f837d;
            if (cVar != null) {
                jVar = cVar.f849b;
            }
            fVar.m3163a(parcelable, jVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f844k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f845l = new C0081h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f845l.m4003c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f845l == null) {
            this.f845l = new C0081h<>();
            this.f844k = 0;
        }
        this.f837d.m3156b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f837d.m3161a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = m3176a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = m3176a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f838e != null && !isChangingConfigurations()) {
            this.f838e.m1346a();
        }
        this.f837d.m3152c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f837d.m3151d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f837d.m3154b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f837d.m3160a(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f837d.m3157a(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f837d.m3144k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f837d.m3162a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f840g = false;
        if (this.f836c.hasMessages(2)) {
            this.f836c.removeMessages(2);
            m3173f();
        }
        this.f837d.m3150e();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f837d.m3153b(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f836c.removeMessages(2);
        m3173f();
        this.f837d.m3146i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : m3177a(view, menu) | this.f837d.m3155b(menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f837d.m3144k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String b = this.f845l.m4007b(i3);
            this.f845l.m4001e(i3);
            if (b == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0248c a = this.f837d.m3158a(b);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + b);
                return;
            }
            a.m3254a(i & 65535, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f836c.sendEmptyMessage(2);
        this.f840g = true;
        this.f837d.m3146i();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object g = m3172g();
        C0282j l = this.f837d.m3143l();
        if (l == null && this.f838e == null && g == null) {
            return null;
        }
        C0258c cVar = new C0258c();
        cVar.f848a = this.f838e;
        cVar.f849b = l;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ActivityC0693c, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m3171i();
        Parcelable m = this.f837d.m3142m();
        if (m != null) {
            bundle.putParcelable("android:support:fragments", m);
        }
        if (this.f845l.m4008b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f844k);
            int[] iArr = new int[this.f845l.m4008b()];
            String[] strArr = new String[this.f845l.m4008b()];
            for (int i = 0; i < this.f845l.m4008b(); i++) {
                iArr[i] = this.f845l.m4002d(i);
                strArr[i] = this.f845l.m4000f(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f841h = false;
        if (!this.f839f) {
            this.f839f = true;
            this.f837d.m3167a();
        }
        this.f837d.m3144k();
        this.f837d.m3146i();
        this.f837d.m3148g();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f837d.m3144k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f841h = true;
        m3171i();
        this.f837d.m3147h();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f843j && i != -1) {
            m3181a(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f843j && i != -1) {
            m3181a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f842i && i != -1) {
            m3181a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f842i && i != -1) {
            m3181a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
