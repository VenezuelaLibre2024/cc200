package p264s3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import p222p5.C4046r;

/* renamed from: s3.a4 */
/* loaded from: classes.dex */
public final class C4404a4 {

    /* renamed from: a */
    public final PowerManager f16156a;

    /* renamed from: b */
    public PowerManager.WakeLock f16157b;

    /* renamed from: c */
    public boolean f16158c;

    /* renamed from: d */
    public boolean f16159d;

    public C4404a4(Context context) {
        this.f16156a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: a */
    public void m17064a(boolean z10) {
        if (z10 && this.f16157b == null) {
            PowerManager powerManager = this.f16156a;
            if (powerManager == null) {
                C4046r.m15529i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f16157b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f16158c = z10;
        m17066c();
    }

    /* renamed from: b */
    public void m17065b(boolean z10) {
        this.f16159d = z10;
        m17066c();
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: c */
    public final void m17066c() {
        PowerManager.WakeLock wakeLock = this.f16157b;
        if (wakeLock == null) {
            return;
        }
        if (this.f16158c && this.f16159d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
