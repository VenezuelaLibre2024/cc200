package p264s3;

import android.content.Context;
import android.net.wifi.WifiManager;
import p222p5.C4046r;

/* renamed from: s3.b4 */
/* loaded from: classes.dex */
public final class C4410b4 {

    /* renamed from: a */
    public final WifiManager f16202a;

    /* renamed from: b */
    public WifiManager.WifiLock f16203b;

    /* renamed from: c */
    public boolean f16204c;

    /* renamed from: d */
    public boolean f16205d;

    public C4410b4(Context context) {
        this.f16202a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    public void m17114a(boolean z10) {
        if (z10 && this.f16203b == null) {
            WifiManager wifiManager = this.f16202a;
            if (wifiManager == null) {
                C4046r.m15529i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f16203b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f16204c = z10;
        m17116c();
    }

    /* renamed from: b */
    public void m17115b(boolean z10) {
        this.f16205d = z10;
        m17116c();
    }

    /* renamed from: c */
    public final void m17116c() {
        WifiManager.WifiLock wifiLock = this.f16203b;
        if (wifiLock == null) {
            return;
        }
        if (this.f16204c && this.f16205d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
