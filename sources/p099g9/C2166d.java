package p099g9;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C1286c;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p099g9.C2163c;
import p207o6.C3944m;
import p329x.C5494l;

/* renamed from: g9.d */
/* loaded from: classes.dex */
public class C2166d {

    /* renamed from: a */
    public final ExecutorService f8663a;

    /* renamed from: b */
    public final Context f8664b;

    /* renamed from: c */
    public final C1286c f8665c;

    public C2166d(Context context, C1286c c1286c, ExecutorService executorService) {
        this.f8663a = executorService;
        this.f8664b = context;
        this.f8665c = c1286c;
    }

    /* renamed from: a */
    public boolean m8725a() {
        if (this.f8665c.m5488a("gcm.n.noui")) {
            return true;
        }
        if (m8726b()) {
            return false;
        }
        C2173f0 m8728d = m8728d();
        C2163c.a m8712e = C2163c.m8712e(this.f8664b, this.f8665c);
        m8729e(m8712e.f8658a, m8728d);
        m8727c(m8712e);
        return true;
    }

    /* renamed from: b */
    public final boolean m8726b() {
        if (((KeyguardManager) this.f8664b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C3944m.m14957f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f8664b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m8727c(C2163c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f8664b.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).notify(aVar.f8659b, aVar.f8660c, aVar.f8658a.m21883c());
    }

    /* renamed from: d */
    public final C2173f0 m8728d() {
        C2173f0 m8755j = C2173f0.m8755j(this.f8665c.m5502p("gcm.n.image"));
        if (m8755j != null) {
            m8755j.m8760w(this.f8663a);
        }
        return m8755j;
    }

    /* renamed from: e */
    public final void m8729e(C5494l.e eVar, C2173f0 c2173f0) {
        if (c2173f0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(c2173f0.m8759l(), 5L, TimeUnit.SECONDS);
            eVar.m21860C(bitmap);
            eVar.m21873P(new C5494l.b().m21838z(bitmap).m21837y(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c2173f0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c2173f0.close();
        }
    }
}
