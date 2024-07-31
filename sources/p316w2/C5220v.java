package p316w2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.Calendar;

/* renamed from: w2.v */
/* loaded from: classes.dex */
public class C5220v {

    /* renamed from: a */
    public final Context f19781a;

    /* renamed from: b */
    public final LocationManager f19782b;

    /* renamed from: c */
    public final C5216r f19783c;

    /* renamed from: d */
    @TargetApi(24)
    public OnNmeaMessageListener f19784d;

    /* renamed from: e */
    public String f19785e;

    /* renamed from: f */
    public Calendar f19786f;

    /* renamed from: g */
    public boolean f19787g = false;

    public C5220v(Context context, C5216r c5216r) {
        this.f19781a = context;
        this.f19783c = c5216r;
        this.f19782b = (LocationManager) context.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f19784d = new OnNmeaMessageListener() { // from class: w2.u
                @Override // android.location.OnNmeaMessageListener
                public final void onNmeaMessage(String str, long j10) {
                    C5220v.this.m21109c(str, j10);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m21109c(String str, long j10) {
        if (str.startsWith("$GPGGA")) {
            this.f19785e = str;
            this.f19786f = Calendar.getInstance();
        }
    }

    /* renamed from: b */
    public void m21110b(Location location) {
        if (location == null || this.f19785e == null || this.f19783c == null || !this.f19787g) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.f19786f;
        if ((calendar2 == null || !calendar2.before(calendar)) && this.f19783c.m21107d()) {
            String[] split = this.f19785e.split(",");
            if (!split[0].startsWith("$GPGGA") || split.length <= 9 || split[9].isEmpty()) {
                return;
            }
            double parseDouble = Double.parseDouble(split[9]);
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            location.getExtras().putDouble("geolocator_mslAltitude", parseDouble);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    public void m21111d() {
        C5216r c5216r;
        LocationManager locationManager;
        if (this.f19787g || (c5216r = this.f19783c) == null || !c5216r.m21107d() || Build.VERSION.SDK_INT < 24 || (locationManager = this.f19782b) == null) {
            return;
        }
        locationManager.addNmeaListener(this.f19784d, (Handler) null);
        this.f19787g = true;
    }

    /* renamed from: e */
    public void m21112e() {
        LocationManager locationManager;
        C5216r c5216r = this.f19783c;
        if (c5216r == null || !c5216r.m21107d() || Build.VERSION.SDK_INT < 24 || (locationManager = this.f19782b) == null) {
            return;
        }
        locationManager.removeNmeaListener(this.f19784d);
        this.f19787g = false;
    }
}
