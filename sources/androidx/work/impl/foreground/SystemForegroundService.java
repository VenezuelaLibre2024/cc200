package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ServiceC0358n;
import androidx.work.impl.foreground.C0430a;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import p029c2.AbstractC0592j;

/* loaded from: classes.dex */
public class SystemForegroundService extends ServiceC0358n implements C0430a.b {

    /* renamed from: m */
    public static final String f2074m = AbstractC0592j.m2972f("SystemFgService");

    /* renamed from: n */
    public static SystemForegroundService f2075n = null;

    /* renamed from: i */
    public Handler f2076i;

    /* renamed from: j */
    public boolean f2077j;

    /* renamed from: k */
    public C0430a f2078k;

    /* renamed from: l */
    public NotificationManager f2079l;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    /* loaded from: classes.dex */
    public class RunnableC0427a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ int f2080h;

        /* renamed from: i */
        public final /* synthetic */ Notification f2081i;

        /* renamed from: j */
        public final /* synthetic */ int f2082j;

        public RunnableC0427a(int i10, Notification notification, int i11) {
            this.f2080h = i10;
            this.f2081i = notification;
            this.f2082j = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f2080h, this.f2081i, this.f2082j);
            } else {
                SystemForegroundService.this.startForeground(this.f2080h, this.f2081i);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    /* loaded from: classes.dex */
    public class RunnableC0428b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ int f2084h;

        /* renamed from: i */
        public final /* synthetic */ Notification f2085i;

        public RunnableC0428b(int i10, Notification notification) {
            this.f2084h = i10;
            this.f2085i = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f2079l.notify(this.f2084h, this.f2085i);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    /* loaded from: classes.dex */
    public class RunnableC0429c implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ int f2087h;

        public RunnableC0429c(int i10) {
            this.f2087h = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f2079l.cancel(this.f2087h);
        }
    }

    @Override // androidx.work.impl.foreground.C0430a.b
    /* renamed from: b */
    public void mo2200b(int i10, int i11, Notification notification) {
        this.f2076i.post(new RunnableC0427a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.C0430a.b
    /* renamed from: c */
    public void mo2201c(int i10, Notification notification) {
        this.f2076i.post(new RunnableC0428b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.C0430a.b
    /* renamed from: d */
    public void mo2202d(int i10) {
        this.f2076i.post(new RunnableC0429c(i10));
    }

    /* renamed from: e */
    public final void m2203e() {
        this.f2076i = new Handler(Looper.getMainLooper());
        this.f2079l = (NotificationManager) getApplicationContext().getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
        C0430a c0430a = new C0430a(getApplicationContext());
        this.f2078k = c0430a;
        c0430a.m2213m(this);
    }

    @Override // androidx.lifecycle.ServiceC0358n, android.app.Service
    public void onCreate() {
        super.onCreate();
        f2075n = this;
        m2203e();
    }

    @Override // androidx.lifecycle.ServiceC0358n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f2078k.m2211k();
    }

    @Override // androidx.lifecycle.ServiceC0358n, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2077j) {
            AbstractC0592j.m2970c().mo2975d(f2074m, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f2078k.m2211k();
            m2203e();
            this.f2077j = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f2078k.m2212l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.C0430a.b
    public void stop() {
        this.f2077j = true;
        AbstractC0592j.m2970c().mo2973a(f2074m, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f2075n = null;
        stopSelf();
    }
}
