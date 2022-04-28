package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p000a.p018g.p019d.C0125b;

/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes.dex */
class C0474m {

    /* renamed from: d */
    private static C0474m f1536d;

    /* renamed from: a */
    private final Context f1537a;

    /* renamed from: b */
    private final LocationManager f1538b;

    /* renamed from: c */
    private final C0475a f1539c = new C0475a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.m$a */
    /* loaded from: classes.dex */
    public static class C0475a {

        /* renamed from: a */
        boolean f1540a;

        /* renamed from: b */
        long f1541b;

        /* renamed from: c */
        long f1542c;

        /* renamed from: d */
        long f1543d;

        /* renamed from: e */
        long f1544e;

        /* renamed from: f */
        long f1545f;

        C0475a() {
        }
    }

    C0474m(Context context, LocationManager locationManager) {
        this.f1537a = context;
        this.f1538b = locationManager;
    }

    /* renamed from: a */
    private Location m2506a(String str) {
        try {
            if (this.f1538b.isProviderEnabled(str)) {
                return this.f1538b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0474m m2508a(Context context) {
        if (f1536d == null) {
            Context applicationContext = context.getApplicationContext();
            f1536d = new C0474m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1536d;
    }

    /* renamed from: a */
    private void m2507a(Location location) {
        long j;
        C0475a aVar = this.f1539c;
        long currentTimeMillis = System.currentTimeMillis();
        C0473l a = C0473l.m2511a();
        a.m2510a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f1533a;
        a.m2510a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f1535c == 1;
        long j3 = a.f1534b;
        long j4 = a.f1533a;
        a.m2510a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a.f1534b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f1540a = z;
        aVar.f1541b = j2;
        aVar.f1542c = j3;
        aVar.f1543d = j4;
        aVar.f1544e = j5;
        aVar.f1545f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m2505b() {
        Location location = null;
        Location a = C0125b.m3731a(this.f1537a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2506a("network") : null;
        if (C0125b.m3731a(this.f1537a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m2506a("gps");
        }
        return (location == null || a == null) ? location != null ? location : a : location.getTime() > a.getTime() ? location : a;
    }

    /* renamed from: c */
    private boolean m2504c() {
        return this.f1539c.f1545f > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m2509a() {
        C0475a aVar = this.f1539c;
        if (m2504c()) {
            return aVar.f1540a;
        }
        Location b = m2505b();
        if (b != null) {
            m2507a(b);
            return aVar.f1540a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
