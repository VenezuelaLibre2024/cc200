package p101h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p345y.C5786e;

/* renamed from: h.m */
/* loaded from: classes.dex */
public class C2271m {

    /* renamed from: d */
    public static C2271m f9063d;

    /* renamed from: a */
    public final Context f9064a;

    /* renamed from: b */
    public final LocationManager f9065b;

    /* renamed from: c */
    public final a f9066c = new a();

    /* renamed from: h.m$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public boolean f9067a;

        /* renamed from: b */
        public long f9068b;

        /* renamed from: c */
        public long f9069c;

        /* renamed from: d */
        public long f9070d;

        /* renamed from: e */
        public long f9071e;

        /* renamed from: f */
        public long f9072f;
    }

    public C2271m(Context context, LocationManager locationManager) {
        this.f9064a = context;
        this.f9065b = locationManager;
    }

    /* renamed from: a */
    public static C2271m m9192a(Context context) {
        if (f9063d == null) {
            Context applicationContext = context.getApplicationContext();
            f9063d = new C2271m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f9063d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final Location m9193b() {
        Location m9194c = C5786e.m23095b(this.f9064a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m9194c("network") : null;
        Location m9194c2 = C5786e.m23095b(this.f9064a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m9194c("gps") : null;
        return (m9194c2 == null || m9194c == null) ? m9194c2 != null ? m9194c2 : m9194c : m9194c2.getTime() > m9194c.getTime() ? m9194c2 : m9194c;
    }

    /* renamed from: c */
    public final Location m9194c(String str) {
        try {
            if (this.f9065b.isProviderEnabled(str)) {
                return this.f9065b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    /* renamed from: d */
    public boolean m9195d() {
        a aVar = this.f9066c;
        if (m9196e()) {
            return aVar.f9067a;
        }
        Location m9193b = m9193b();
        if (m9193b != null) {
            m9197f(m9193b);
            return aVar.f9067a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    /* renamed from: e */
    public final boolean m9196e() {
        return this.f9066c.f9072f > System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void m9197f(Location location) {
        long j10;
        a aVar = this.f9066c;
        long currentTimeMillis = System.currentTimeMillis();
        C2270l m9190b = C2270l.m9190b();
        m9190b.m9191a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = m9190b.f9060a;
        m9190b.m9191a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = m9190b.f9062c == 1;
        long j12 = m9190b.f9061b;
        long j13 = m9190b.f9060a;
        m9190b.m9191a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = m9190b.f9061b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + 60000;
        }
        aVar.f9067a = z10;
        aVar.f9068b = j11;
        aVar.f9069c = j12;
        aVar.f9070d = j13;
        aVar.f9071e = j14;
        aVar.f9072f = j10;
    }
}
