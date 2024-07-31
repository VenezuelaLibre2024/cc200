package p342xc;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xc.a */
/* loaded from: classes2.dex */
public class C5751a {

    /* renamed from: a */
    public final ConnectivityManager f21309a;

    public C5751a(ConnectivityManager connectivityManager) {
        this.f21309a = connectivityManager;
    }

    /* renamed from: a */
    public List<String> m22871a(Network network) {
        return m22872b(this.f21309a.getNetworkCapabilities(network));
    }

    /* renamed from: b */
    public List<String> m22872b(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    /* renamed from: c */
    public ConnectivityManager m22873c() {
        return this.f21309a;
    }

    /* renamed from: d */
    public List<String> m22874d() {
        return Build.VERSION.SDK_INT >= 23 ? m22871a(this.f21309a.getActiveNetwork()) : m22875e();
    }

    /* renamed from: e */
    public final List<String> m22875e() {
        String str;
        NetworkInfo activeNetworkInfo = this.f21309a.getActiveNetworkInfo();
        ArrayList arrayList = new ArrayList();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            arrayList.add("none");
            return arrayList;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        str = type != 7 ? type != 9 ? type != 17 ? "other" : "vpn" : "ethernet" : "bluetooth";
                        arrayList.add(str);
                        return arrayList;
                    }
                }
            }
            str = "wifi";
            arrayList.add(str);
            return arrayList;
        }
        str = "mobile";
        arrayList.add(str);
        return arrayList;
    }
}
