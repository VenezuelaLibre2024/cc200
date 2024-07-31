package com.baseflow.geolocator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import io.flutter.plugin.common.EventChannel;
import p303v2.EnumC5102b;
import p303v2.InterfaceC5101a;
import p316w2.C5200b;
import p316w2.C5202d;
import p316w2.C5209k;
import p316w2.C5215q;
import p316w2.C5216r;
import p316w2.InterfaceC5213o;
import p316w2.InterfaceC5221w;

/* loaded from: classes.dex */
public class GeolocatorLocationService extends Service {

    /* renamed from: p */
    public InterfaceC5213o f4137p;

    /* renamed from: h */
    public final String f4129h = "GeolocatorLocationService:Wakelock";

    /* renamed from: i */
    public final String f4130i = "GeolocatorLocationService:WifiLock";

    /* renamed from: j */
    public final BinderC1132a f4131j = new BinderC1132a(this);

    /* renamed from: k */
    public boolean f4132k = false;

    /* renamed from: l */
    public int f4133l = 0;

    /* renamed from: m */
    public int f4134m = 0;

    /* renamed from: n */
    public Activity f4135n = null;

    /* renamed from: o */
    public C5209k f4136o = null;

    /* renamed from: q */
    public PowerManager.WakeLock f4138q = null;

    /* renamed from: r */
    public WifiManager.WifiLock f4139r = null;

    /* renamed from: s */
    public C5200b f4140s = null;

    /* renamed from: com.baseflow.geolocator.GeolocatorLocationService$a */
    /* loaded from: classes.dex */
    public class BinderC1132a extends Binder {

        /* renamed from: a */
        public final GeolocatorLocationService f4141a;

        public BinderC1132a(GeolocatorLocationService geolocatorLocationService) {
            this.f4141a = geolocatorLocationService;
        }

        /* renamed from: a */
        public GeolocatorLocationService m4686a() {
            return this.f4141a;
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m4673i(EventChannel.EventSink eventSink, Location location) {
        eventSink.success(C5215q.m21102b(location));
    }

    /* renamed from: j */
    public static /* synthetic */ void m4674j(EventChannel.EventSink eventSink, EnumC5102b enumC5102b) {
        eventSink.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
    }

    /* renamed from: c */
    public boolean m4675c(boolean z10) {
        return z10 ? this.f4134m == 1 : this.f4133l == 0;
    }

    /* renamed from: d */
    public void m4676d(C5202d c5202d) {
        C5200b c5200b = this.f4140s;
        if (c5200b != null) {
            c5200b.m21054f(c5202d, this.f4132k);
            m4681k(c5202d);
        }
    }

    /* renamed from: e */
    public void m4677e() {
        if (this.f4132k) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            if (Build.VERSION.SDK_INT >= 24) {
                stopForeground(1);
            } else {
                stopForeground(true);
            }
            m4682l();
            this.f4132k = false;
            this.f4140s = null;
        }
    }

    /* renamed from: f */
    public void m4678f(C5202d c5202d) {
        if (this.f4140s != null) {
            Log.d("FlutterGeolocator", "Service already in foreground mode.");
            m4676d(c5202d);
        } else {
            Log.d("FlutterGeolocator", "Start service in foreground mode.");
            C5200b c5200b = new C5200b(getApplicationContext(), "geolocator_channel_01", 75415, c5202d);
            this.f4140s = c5200b;
            c5200b.m21052d("Background Location");
            startForeground(75415, this.f4140s.m21049a());
            this.f4132k = true;
        }
        m4681k(c5202d);
    }

    /* renamed from: g */
    public void m4679g() {
        this.f4133l++;
        Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + this.f4133l);
    }

    /* renamed from: h */
    public void m4680h() {
        this.f4133l--;
        Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + this.f4133l);
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: k */
    public final void m4681k(C5202d c5202d) {
        WifiManager wifiManager;
        PowerManager powerManager;
        m4682l();
        if (c5202d.m21061d() && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.f4138q = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            this.f4138q.acquire();
        }
        if (!c5202d.m21062e() || (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) == null) {
            return;
        }
        WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "GeolocatorLocationService:WifiLock");
        this.f4139r = createWifiLock;
        createWifiLock.setReferenceCounted(false);
        this.f4139r.acquire();
    }

    /* renamed from: l */
    public final void m4682l() {
        PowerManager.WakeLock wakeLock = this.f4138q;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f4138q.release();
            this.f4138q = null;
        }
        WifiManager.WifiLock wifiLock = this.f4139r;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.f4139r.release();
        this.f4139r = null;
    }

    /* renamed from: m */
    public void m4683m(Activity activity) {
        this.f4135n = activity;
    }

    /* renamed from: n */
    public void m4684n(boolean z10, C5216r c5216r, final EventChannel.EventSink eventSink) {
        this.f4134m++;
        C5209k c5209k = this.f4136o;
        if (c5209k != null) {
            InterfaceC5213o m21088a = c5209k.m21088a(getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(z10)), c5216r);
            this.f4137p = m21088a;
            this.f4136o.m21092e(m21088a, this.f4135n, new InterfaceC5221w() { // from class: u2.b
                @Override // p316w2.InterfaceC5221w
                /* renamed from: a */
                public final void mo18817a(Location location) {
                    GeolocatorLocationService.m4673i(EventChannel.EventSink.this, location);
                }
            }, new InterfaceC5101a() { // from class: u2.a
                @Override // p303v2.InterfaceC5101a
                /* renamed from: a */
                public final void mo18816a(EnumC5102b enumC5102b) {
                    GeolocatorLocationService.m4674j(EventChannel.EventSink.this, enumC5102b);
                }
            });
        }
    }

    /* renamed from: o */
    public void m4685o() {
        C5209k c5209k;
        this.f4134m--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        InterfaceC5213o interfaceC5213o = this.f4137p;
        if (interfaceC5213o == null || (c5209k = this.f4136o) == null) {
            return;
        }
        c5209k.m21093f(interfaceC5213o);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f4131j;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
        this.f4136o = new C5209k();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.d("FlutterGeolocator", "Destroying location service.");
        m4685o();
        m4677e();
        this.f4136o = null;
        this.f4140s = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
