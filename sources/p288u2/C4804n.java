package p288u2;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import p303v2.C5103c;
import p303v2.EnumC5102b;
import p303v2.InterfaceC5101a;
import p316w2.C5202d;
import p316w2.C5209k;
import p316w2.C5215q;
import p316w2.C5216r;
import p316w2.InterfaceC5213o;
import p316w2.InterfaceC5221w;
import p332x2.C5553b;

/* renamed from: u2.n */
/* loaded from: classes.dex */
public class C4804n implements EventChannel.StreamHandler {

    /* renamed from: h */
    public final C5553b f17856h;

    /* renamed from: i */
    public EventChannel f17857i;

    /* renamed from: j */
    public Context f17858j;

    /* renamed from: k */
    public Activity f17859k;

    /* renamed from: l */
    public GeolocatorLocationService f17860l;

    /* renamed from: m */
    public C5209k f17861m = new C5209k();

    /* renamed from: n */
    public InterfaceC5213o f17862n;

    public C4804n(C5553b c5553b) {
        this.f17856h = c5553b;
    }

    /* renamed from: d */
    public static /* synthetic */ void m18849d(EventChannel.EventSink eventSink, Location location) {
        eventSink.success(C5215q.m21102b(location));
    }

    /* renamed from: e */
    public static /* synthetic */ void m18850e(EventChannel.EventSink eventSink, EnumC5102b enumC5102b) {
        eventSink.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
    }

    /* renamed from: c */
    public final void m18851c(boolean z10) {
        C5209k c5209k;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = this.f17860l;
        if (geolocatorLocationService == null || !geolocatorLocationService.m4675c(z10)) {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            this.f17860l.m4685o();
            this.f17860l.m4677e();
        }
        InterfaceC5213o interfaceC5213o = this.f17862n;
        if (interfaceC5213o == null || (c5209k = this.f17861m) == null) {
            return;
        }
        c5209k.m21093f(interfaceC5213o);
        this.f17862n = null;
    }

    /* renamed from: f */
    public void m18852f(Activity activity) {
        if (activity == null && this.f17862n != null && this.f17857i != null) {
            m18855i();
        }
        this.f17859k = activity;
    }

    /* renamed from: g */
    public void m18853g(GeolocatorLocationService geolocatorLocationService) {
        this.f17860l = geolocatorLocationService;
    }

    /* renamed from: h */
    public void m18854h(Context context, BinaryMessenger binaryMessenger) {
        if (this.f17857i != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            m18855i();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.baseflow.com/geolocator_updates_android");
        this.f17857i = eventChannel;
        eventChannel.setStreamHandler(this);
        this.f17858j = context;
    }

    /* renamed from: i */
    public void m18855i() {
        if (this.f17857i == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        m18851c(false);
        this.f17857i.setStreamHandler(null);
        this.f17857i = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        m18851c(true);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        try {
            if (!this.f17856h.m22363d(this.f17858j)) {
                EnumC5102b enumC5102b = EnumC5102b.permissionDenied;
                eventSink.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
                return;
            }
            if (this.f17860l == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            Map map = (Map) obj;
            boolean z10 = false;
            if (map != null && map.get("forceLocationManager") != null) {
                z10 = ((Boolean) map.get("forceLocationManager")).booleanValue();
            }
            C5216r m21103e = C5216r.m21103e(map);
            C5202d m21057g = map != null ? C5202d.m21057g((Map) map.get("foregroundNotificationConfig")) : null;
            if (m21057g != null) {
                Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
                this.f17860l.m4684n(z10, m21103e, eventSink);
                this.f17860l.m4678f(m21057g);
            } else {
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                InterfaceC5213o m21088a = this.f17861m.m21088a(this.f17858j, Boolean.TRUE.equals(Boolean.valueOf(z10)), m21103e);
                this.f17862n = m21088a;
                this.f17861m.m21092e(m21088a, this.f17859k, new InterfaceC5221w() { // from class: u2.m
                    @Override // p316w2.InterfaceC5221w
                    /* renamed from: a */
                    public final void mo18817a(Location location) {
                        C4804n.m18849d(EventChannel.EventSink.this, location);
                    }
                }, new InterfaceC5101a() { // from class: u2.l
                    @Override // p303v2.InterfaceC5101a
                    /* renamed from: a */
                    public final void mo18816a(EnumC5102b enumC5102b2) {
                        C4804n.m18850e(EventChannel.EventSink.this, enumC5102b2);
                    }
                });
            }
        } catch (C5103c unused) {
            EnumC5102b enumC5102b2 = EnumC5102b.permissionDefinitionsNotFound;
            eventSink.error(enumC5102b2.toString(), enumC5102b2.m20742c(), null);
        }
    }
}
