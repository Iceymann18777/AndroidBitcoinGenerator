package me.createbitcoins.androidbitcoingenerator;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActivityC0442e;
import androidx.appcompat.app.C0432b;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import p000a.p036j.p037a.AbstractC0287m;
import p000a.p036j.p037a.ComponentCallbacksC0248c;

/* loaded from: classes.dex */
public class MainActivity extends ActivityC0442e implements NavigationView.AbstractC0985b {

    /* renamed from: p */
    private DrawerLayout f3666p;

    @Override // com.google.android.material.navigation.NavigationView.AbstractC0985b
    /* renamed from: a */
    public boolean mo14a(MenuItem menuItem) {
        AbstractC0287m mVar;
        ComponentCallbacksC0248c cVar;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.about) {
            mVar = m3174e().mo3111a();
            cVar = new C1008a();
        } else if (itemId != R.id.contact) {
            if (itemId == R.id.nav_home) {
                mVar = m3174e().mo3111a();
                cVar = new View$OnClickListenerC1010c();
            }
            this.f3666p.m1476a(8388611);
            return true;
        } else {
            mVar = m3174e().mo3111a();
            cVar = new C1009b();
        }
        mVar.mo2993a(R.id.fragment_container, cVar);
        mVar.mo2994a();
        this.f3666p.m1476a(8388611);
        return true;
    }

    @Override // p000a.p036j.p037a.ActivityC0255d, android.app.Activity
    public void onBackPressed() {
        if (this.f3666p.m1446e(8388611)) {
            this.f3666p.m1476a(8388611);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0442e, p000a.p036j.p037a.ActivityC0255d, androidx.core.app.ActivityC0693c, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        m2635a(toolbar);
        this.f3666p = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        C0432b bVar = new C0432b(this, this.f3666p, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        this.f3666p.m1466a(bVar);
        bVar.m2651b();
        AbstractC0287m a = m3174e().mo3111a();
        a.mo2993a(R.id.fragment_container, new View$OnClickListenerC1010c());
        a.mo2994a();
        navigationView.setCheckedItem(R.id.nav_home);
    }
}
