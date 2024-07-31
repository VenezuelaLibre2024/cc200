package p342xc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;
import java.util.List;

/* renamed from: xc.d */
/* loaded from: classes2.dex */
public class C5754d extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* renamed from: h */
    public final Context f21313h;

    /* renamed from: i */
    public final C5751a f21314i;

    /* renamed from: j */
    public EventChannel.EventSink f21315j;

    /* renamed from: k */
    public final Handler f21316k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    public ConnectivityManager.NetworkCallback f21317l;

    /* renamed from: xc.d$a */
    /* loaded from: classes2.dex */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C5754d c5754d = C5754d.this;
            c5754d.m22884i(c5754d.f21314i.m22871a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C5754d c5754d = C5754d.this;
            c5754d.m22884i(c5754d.f21314i.m22872b(networkCapabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C5754d.this.m22883h();
        }
    }

    public C5754d(Context context, C5751a c5751a) {
        this.f21313h = context;
        this.f21314i = c5751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m22881f() {
        this.f21315j.success(this.f21314i.m22874d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m22882g(List list) {
        this.f21315j.success(list);
    }

    /* renamed from: h */
    public final void m22883h() {
        this.f21316k.postDelayed(new Runnable() { // from class: xc.b
            @Override // java.lang.Runnable
            public final void run() {
                C5754d.this.m22881f();
            }
        }, 500L);
    }

    /* renamed from: i */
    public final void m22884i(final List<String> list) {
        this.f21316k.post(new Runnable() { // from class: xc.c
            @Override // java.lang.Runnable
            public final void run() {
                C5754d.this.m22882g(list);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                this.f21313h.unregisterReceiver(this);
            } catch (Exception unused) {
            }
        } else if (this.f21317l != null) {
            this.f21314i.m22873c().unregisterNetworkCallback(this.f21317l);
            this.f21317l = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f21315j = eventSink;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f21317l = new a();
            this.f21314i.m22873c().registerDefaultNetworkCallback(this.f21317l);
        } else {
            this.f21313h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        m22884i(this.f21314i.m22874d());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f21315j;
        if (eventSink != null) {
            eventSink.success(this.f21314i.m22874d());
        }
    }
}
