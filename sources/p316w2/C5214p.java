package p316w2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.Iterator;
import java.util.List;
import p042d0.C1510b;
import p042d0.C1517i;
import p042d0.InterfaceC1509a;
import p303v2.EnumC5102b;
import p303v2.InterfaceC5101a;

/* renamed from: w2.p */
/* loaded from: classes.dex */
public class C5214p implements InterfaceC5213o, InterfaceC1509a {

    /* renamed from: a */
    public final LocationManager f19764a;

    /* renamed from: b */
    public final C5220v f19765b;

    /* renamed from: c */
    public final C5216r f19766c;

    /* renamed from: d */
    public Context f19767d;

    /* renamed from: e */
    public boolean f19768e = false;

    /* renamed from: f */
    public Location f19769f;

    /* renamed from: g */
    public String f19770g;

    /* renamed from: h */
    public InterfaceC5221w f19771h;

    /* renamed from: i */
    public InterfaceC5101a f19772i;

    /* renamed from: w2.p$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19773a;

        static {
            int[] iArr = new int[EnumC5210l.values().length];
            f19773a = iArr;
            try {
                iArr[EnumC5210l.lowest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19773a[EnumC5210l.low.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19773a[EnumC5210l.high.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19773a[EnumC5210l.best.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19773a[EnumC5210l.bestForNavigation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19773a[EnumC5210l.medium.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C5214p(Context context, C5216r c5216r) {
        this.f19764a = (LocationManager) context.getSystemService("location");
        this.f19766c = c5216r;
        this.f19767d = context;
        this.f19765b = new C5220v(context, c5216r);
    }

    /* renamed from: g */
    public static int m21098g(EnumC5210l enumC5210l) {
        int i10 = a.f19773a[enumC5210l.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            return 100;
        }
        return C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
    }

    /* renamed from: h */
    public static String m21099h(LocationManager locationManager, EnumC5210l enumC5210l) {
        List<String> providers = locationManager.getProviders(true);
        if (enumC5210l == EnumC5210l.lowest) {
            return "passive";
        }
        if (providers.contains("fused") && Build.VERSION.SDK_INT >= 31) {
            return "fused";
        }
        if (providers.contains("gps")) {
            return "gps";
        }
        if (providers.contains("network")) {
            return "network";
        }
        if (providers.isEmpty()) {
            return null;
        }
        return providers.get(0);
    }

    /* renamed from: i */
    public static boolean m21100i(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > 120000;
        boolean z11 = time < -120000;
        boolean z12 = time > 0;
        if (z10) {
            return true;
        }
        if (z11) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0.0f;
        boolean z14 = accuracy < 0.0f;
        boolean z15 = accuracy > 200.0f;
        boolean equals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z14) {
            return true;
        }
        if (!z12 || z13) {
            return z12 && !z15 && equals;
        }
        return true;
    }

    @Override // p316w2.InterfaceC5213o
    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public void mo21081b(Activity activity, InterfaceC5221w interfaceC5221w, InterfaceC5101a interfaceC5101a) {
        if (!m21097a(this.f19767d)) {
            interfaceC5101a.mo18816a(EnumC5102b.locationServicesDisabled);
            return;
        }
        this.f19771h = interfaceC5221w;
        this.f19772i = interfaceC5101a;
        EnumC5210l enumC5210l = EnumC5210l.best;
        long j10 = 0;
        float f10 = 0.0f;
        int i10 = C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
        C5216r c5216r = this.f19766c;
        if (c5216r != null) {
            f10 = (float) c5216r.m21105b();
            enumC5210l = this.f19766c.m21104a();
            j10 = enumC5210l == EnumC5210l.lowest ? Long.MAX_VALUE : this.f19766c.m21106c();
            i10 = m21098g(enumC5210l);
        }
        String m21099h = m21099h(this.f19764a, enumC5210l);
        this.f19770g = m21099h;
        if (m21099h == null) {
            interfaceC5101a.mo18816a(EnumC5102b.locationServicesDisabled);
            return;
        }
        C1517i m6147a = new C1517i.c(j10).m6149c(f10).m6150d(i10).m6147a();
        this.f19768e = true;
        this.f19765b.m21111d();
        C1510b.m6116b(this.f19764a, this.f19770g, m6147a, this, Looper.getMainLooper());
    }

    @Override // p316w2.InterfaceC5213o
    /* renamed from: c */
    public boolean mo21082c(int i10, int i11) {
        return false;
    }

    @Override // p316w2.InterfaceC5213o
    /* renamed from: d */
    public void mo21083d(InterfaceC5221w interfaceC5221w, InterfaceC5101a interfaceC5101a) {
        Iterator<String> it = this.f19764a.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = this.f19764a.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && m21100i(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        interfaceC5221w.mo18817a(location);
    }

    @Override // p316w2.InterfaceC5213o
    /* renamed from: e */
    public void mo21084e(InterfaceC5217s interfaceC5217s) {
        interfaceC5217s.mo21055a(this.f19764a == null ? false : m21097a(this.f19767d));
    }

    @Override // p316w2.InterfaceC5213o
    @SuppressLint({"MissingPermission"})
    /* renamed from: f */
    public void mo21085f() {
        this.f19768e = false;
        this.f19765b.m21112e();
        this.f19764a.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public synchronized void onLocationChanged(Location location) {
        if (m21100i(location, this.f19769f)) {
            this.f19769f = location;
            if (this.f19771h != null) {
                this.f19765b.m21110b(location);
                this.f19771h.mo18817a(this.f19769f);
            }
        }
    }

    @Override // p042d0.InterfaceC1509a, android.location.LocationListener
    @SuppressLint({"MissingPermission"})
    public void onProviderDisabled(String str) {
        if (str.equals(this.f19770g)) {
            if (this.f19768e) {
                this.f19764a.removeUpdates(this);
            }
            InterfaceC5101a interfaceC5101a = this.f19772i;
            if (interfaceC5101a != null) {
                interfaceC5101a.mo18816a(EnumC5102b.locationServicesDisabled);
            }
            this.f19770g = null;
        }
    }

    @Override // p042d0.InterfaceC1509a, android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // p042d0.InterfaceC1509a, android.location.LocationListener
    @TargetApi(28)
    public void onStatusChanged(String str, int i10, Bundle bundle) {
        if (i10 == 2) {
            onProviderEnabled(str);
        } else if (i10 == 0) {
            onProviderDisabled(str);
        }
    }
}
