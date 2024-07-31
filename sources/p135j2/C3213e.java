package p135j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import p029c2.AbstractC0592j;
import p073f0.C1799a;
import p104h2.C2283b;
import p203o2.InterfaceC3840a;

/* renamed from: j2.e */
/* loaded from: classes.dex */
public class C3213e extends AbstractC3212d<C2283b> {

    /* renamed from: j */
    public static final String f11118j = AbstractC0592j.m2972f("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f11119g;

    /* renamed from: h */
    public b f11120h;

    /* renamed from: i */
    public a f11121i;

    /* renamed from: j2.e$a */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            AbstractC0592j.m2970c().mo2973a(C3213e.f11118j, "Network broadcast received", new Throwable[0]);
            C3213e c3213e = C3213e.this;
            c3213e.m11435d(c3213e.m11437g());
        }
    }

    /* renamed from: j2.e$b */
    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC0592j.m2970c().mo2973a(C3213e.f11118j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C3213e c3213e = C3213e.this;
            c3213e.m11435d(c3213e.m11437g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC0592j.m2970c().mo2973a(C3213e.f11118j, "Network connection lost", new Throwable[0]);
            C3213e c3213e = C3213e.this;
            c3213e.m11435d(c3213e.m11437g());
        }
    }

    public C3213e(Context context, InterfaceC3840a interfaceC3840a) {
        super(context, interfaceC3840a);
        this.f11119g = (ConnectivityManager) this.f11112b.getSystemService("connectivity");
        if (m11436j()) {
            this.f11120h = new b();
        } else {
            this.f11121i = new a();
        }
    }

    /* renamed from: j */
    public static boolean m11436j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // p135j2.AbstractC3212d
    /* renamed from: e */
    public void mo11431e() {
        if (!m11436j()) {
            AbstractC0592j.m2970c().mo2973a(f11118j, "Registering broadcast receiver", new Throwable[0]);
            this.f11112b.registerReceiver(this.f11121i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            AbstractC0592j.m2970c().mo2973a(f11118j, "Registering network callback", new Throwable[0]);
            this.f11119g.registerDefaultNetworkCallback(this.f11120h);
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC0592j.m2970c().mo2974b(f11118j, "Received exception while registering network callback", e10);
        }
    }

    @Override // p135j2.AbstractC3212d
    /* renamed from: f */
    public void mo11432f() {
        if (!m11436j()) {
            AbstractC0592j.m2970c().mo2973a(f11118j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f11112b.unregisterReceiver(this.f11121i);
            return;
        }
        try {
            AbstractC0592j.m2970c().mo2973a(f11118j, "Unregistering network callback", new Throwable[0]);
            this.f11119g.unregisterNetworkCallback(this.f11120h);
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC0592j.m2970c().mo2974b(f11118j, "Received exception while unregistering network callback", e10);
        }
    }

    /* renamed from: g */
    public C2283b m11437g() {
        NetworkInfo activeNetworkInfo = this.f11119g.getActiveNetworkInfo();
        return new C2283b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), m11439i(), C1799a.m7268a(this.f11119g), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // p135j2.AbstractC3212d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2283b mo11425b() {
        return m11437g();
    }

    /* renamed from: i */
    public boolean m11439i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f11119g.getNetworkCapabilities(this.f11119g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            AbstractC0592j.m2970c().mo2974b(f11118j, "Unable to validate active network", e10);
            return false;
        }
    }
}
