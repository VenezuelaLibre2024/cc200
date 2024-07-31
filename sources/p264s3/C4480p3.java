package p264s3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: s3.p3 */
/* loaded from: classes.dex */
public final class C4480p3 {

    /* renamed from: a */
    public final Context f16595a;

    /* renamed from: b */
    public final Handler f16596b;

    /* renamed from: c */
    public final b f16597c;

    /* renamed from: d */
    public final AudioManager f16598d;

    /* renamed from: e */
    public c f16599e;

    /* renamed from: f */
    public int f16600f;

    /* renamed from: g */
    public int f16601g;

    /* renamed from: h */
    public boolean f16602h;

    /* renamed from: s3.p3$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: s */
        void mo17499s(int i10);

        /* renamed from: z */
        void mo17500z(int i10, boolean z10);
    }

    /* renamed from: s3.p3$c */
    /* loaded from: classes.dex */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = C4480p3.this.f16596b;
            final C4480p3 c4480p3 = C4480p3.this;
            handler.post(new Runnable() { // from class: s3.q3
                @Override // java.lang.Runnable
                public final void run() {
                    C4480p3.m17491b(C4480p3.this);
                }
            });
        }
    }

    public C4480p3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16595a = applicationContext;
        this.f16596b = handler;
        this.f16597c = bVar;
        AudioManager audioManager = (AudioManager) C4014a.m15202h((AudioManager) applicationContext.getSystemService("audio"));
        this.f16598d = audioManager;
        this.f16600f = 3;
        this.f16601g = m17493f(audioManager, 3);
        this.f16602h = m17492e(audioManager, this.f16600f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f16599e = cVar;
        } catch (RuntimeException e10) {
            C4046r.m15530j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m17491b(C4480p3 c4480p3) {
        c4480p3.m17498i();
    }

    /* renamed from: e */
    public static boolean m17492e(AudioManager audioManager, int i10) {
        return C4041n0.f14513a >= 23 ? audioManager.isStreamMute(i10) : m17493f(audioManager, i10) == 0;
    }

    /* renamed from: f */
    public static int m17493f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            C4046r.m15530j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* renamed from: c */
    public int m17494c() {
        return this.f16598d.getStreamMaxVolume(this.f16600f);
    }

    /* renamed from: d */
    public int m17495d() {
        if (C4041n0.f14513a >= 28) {
            return this.f16598d.getStreamMinVolume(this.f16600f);
        }
        return 0;
    }

    /* renamed from: g */
    public void m17496g() {
        c cVar = this.f16599e;
        if (cVar != null) {
            try {
                this.f16595a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                C4046r.m15530j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f16599e = null;
        }
    }

    /* renamed from: h */
    public void m17497h(int i10) {
        if (this.f16600f == i10) {
            return;
        }
        this.f16600f = i10;
        m17498i();
        this.f16597c.mo17499s(i10);
    }

    /* renamed from: i */
    public final void m17498i() {
        int m17493f = m17493f(this.f16598d, this.f16600f);
        boolean m17492e = m17492e(this.f16598d, this.f16600f);
        if (this.f16601g == m17493f && this.f16602h == m17492e) {
            return;
        }
        this.f16601g = m17493f;
        this.f16602h = m17492e;
        this.f16597c.mo17500z(m17493f, m17492e);
    }
}
