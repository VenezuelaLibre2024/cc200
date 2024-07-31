package p288u2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import p316w2.C5218t;

/* renamed from: u2.c */
/* loaded from: classes.dex */
public class C4793c implements EventChannel.StreamHandler {

    /* renamed from: h */
    public EventChannel f17829h;

    /* renamed from: i */
    public Context f17830i;

    /* renamed from: j */
    public C5218t f17831j;

    /* renamed from: a */
    public final void m18818a() {
        C5218t c5218t;
        Context context = this.f17830i;
        if (context == null || (c5218t = this.f17831j) == null) {
            return;
        }
        context.unregisterReceiver(c5218t);
    }

    /* renamed from: b */
    public void m18819b(Context context) {
        this.f17830i = context;
    }

    /* renamed from: c */
    public void m18820c(Context context, BinaryMessenger binaryMessenger) {
        if (this.f17829h != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            m18821d();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.baseflow.com/geolocator_service_updates_android");
        this.f17829h = eventChannel;
        eventChannel.setStreamHandler(this);
        this.f17830i = context;
    }

    /* renamed from: d */
    public void m18821d() {
        if (this.f17829h == null) {
            return;
        }
        m18818a();
        this.f17829h.setStreamHandler(null);
        this.f17829h = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        m18818a();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (this.f17830i == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
        C5218t c5218t = new C5218t(eventSink);
        this.f17831j = c5218t;
        this.f17830i.registerReceiver(c5218t, intentFilter);
    }
}
