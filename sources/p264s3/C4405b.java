package p264s3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: s3.b */
/* loaded from: classes.dex */
public final class C4405b {

    /* renamed from: a */
    public final Context f16160a;

    /* renamed from: b */
    public final a f16161b;

    /* renamed from: c */
    public boolean f16162c;

    /* renamed from: s3.b$a */
    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: h */
        public final b f16163h;

        /* renamed from: i */
        public final Handler f16164i;

        public a(Handler handler, b bVar) {
            this.f16164i = handler;
            this.f16163h = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f16164i.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4405b.this.f16162c) {
                this.f16163h.mo17069u();
            }
        }
    }

    /* renamed from: s3.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: u */
        void mo17069u();
    }

    public C4405b(Context context, Handler handler, b bVar) {
        this.f16160a = context.getApplicationContext();
        this.f16161b = new a(handler, bVar);
    }

    /* renamed from: b */
    public void m17068b(boolean z10) {
        boolean z11;
        if (z10 && !this.f16162c) {
            this.f16160a.registerReceiver(this.f16161b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z11 = true;
        } else {
            if (z10 || !this.f16162c) {
                return;
            }
            this.f16160a.unregisterReceiver(this.f16161b);
            z11 = false;
        }
        this.f16162c = z11;
    }
}
