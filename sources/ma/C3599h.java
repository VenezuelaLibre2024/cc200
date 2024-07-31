package ma;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import ma.C3599h;

/* renamed from: ma.h */
/* loaded from: classes.dex */
public final class C3599h {

    /* renamed from: a */
    public final Context f12672a;

    /* renamed from: e */
    public Runnable f12676e;

    /* renamed from: f */
    public boolean f12677f;

    /* renamed from: c */
    public boolean f12674c = false;

    /* renamed from: b */
    public final BroadcastReceiver f12673b = new b();

    /* renamed from: d */
    public Handler f12675d = new Handler();

    /* renamed from: ma.h$b */
    /* loaded from: classes.dex */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m13342b(boolean z10) {
            C3599h.this.m13337f(z10);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z10 = intent.getIntExtra("plugged", -1) <= 0;
                C3599h.this.f12675d.post(new Runnable() { // from class: ma.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3599h.b.this.m13342b(z10);
                    }
                });
            }
        }
    }

    public C3599h(Context context, Runnable runnable) {
        this.f12672a = context;
        this.f12676e = runnable;
    }

    /* renamed from: c */
    public void m13334c() {
        m13336e();
        if (this.f12677f) {
            this.f12675d.postDelayed(this.f12676e, 300000L);
        }
    }

    /* renamed from: d */
    public void m13335d() {
        m13336e();
        m13340i();
    }

    /* renamed from: e */
    public final void m13336e() {
        this.f12675d.removeCallbacksAndMessages(null);
    }

    /* renamed from: f */
    public final void m13337f(boolean z10) {
        this.f12677f = z10;
        if (this.f12674c) {
            m13334c();
        }
    }

    /* renamed from: g */
    public final void m13338g() {
        if (this.f12674c) {
            return;
        }
        this.f12672a.registerReceiver(this.f12673b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f12674c = true;
    }

    /* renamed from: h */
    public void m13339h() {
        m13338g();
        m13334c();
    }

    /* renamed from: i */
    public final void m13340i() {
        if (this.f12674c) {
            this.f12672a.unregisterReceiver(this.f12673b);
            this.f12674c = false;
        }
    }
}
