package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class FragmentC0756o extends Fragment {

    /* renamed from: b */
    private AbstractC0757a f2826b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.o$a */
    /* loaded from: classes.dex */
    public interface AbstractC0757a {
        /* renamed from: a */
        void m1353a();

        /* renamed from: b */
        void m1352b();

        /* renamed from: c */
        void m1351c();
    }

    /* renamed from: a */
    public static void m1358a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0756o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m1357a(AbstractC0742e.EnumC0743a aVar) {
        Activity activity = getActivity();
        if (activity instanceof AbstractC0750i) {
            ((AbstractC0750i) activity).mo1368a().m1385a(aVar);
        } else if (activity instanceof AbstractC0746g) {
            AbstractC0742e a = ((AbstractC0746g) activity).mo1368a();
            if (a instanceof C0747h) {
                ((C0747h) a).m1385a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m1356a(AbstractC0757a aVar) {
        if (aVar != null) {
            aVar.m1353a();
        }
    }

    /* renamed from: b */
    private void m1355b(AbstractC0757a aVar) {
        if (aVar != null) {
            aVar.m1352b();
        }
    }

    /* renamed from: c */
    private void m1354c(AbstractC0757a aVar) {
        if (aVar != null) {
            aVar.m1351c();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1356a(this.f2826b);
        m1357a(AbstractC0742e.EnumC0743a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m1357a(AbstractC0742e.EnumC0743a.ON_DESTROY);
        this.f2826b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m1357a(AbstractC0742e.EnumC0743a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m1355b(this.f2826b);
        m1357a(AbstractC0742e.EnumC0743a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m1354c(this.f2826b);
        m1357a(AbstractC0742e.EnumC0743a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m1357a(AbstractC0742e.EnumC0743a.ON_STOP);
    }
}
