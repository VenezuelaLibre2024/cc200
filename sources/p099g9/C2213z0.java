package p099g9;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import p080f7.C1866a;

/* renamed from: g9.z0 */
/* loaded from: classes.dex */
public final class C2213z0 {

    /* renamed from: a */
    public static final long f8787a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f8788b = new Object();

    /* renamed from: c */
    public static C1866a f8789c;

    /* renamed from: b */
    public static void m8877b(Context context) {
        if (f8789c == null) {
            C1866a c1866a = new C1866a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f8789c = c1866a;
            c1866a.m7612d(true);
        }
    }

    /* renamed from: c */
    public static void m8878c(Intent intent) {
        synchronized (f8788b) {
            if (f8789c != null && m8879d(intent)) {
                m8882g(intent, false);
                f8789c.m7611c();
            }
        }
    }

    /* renamed from: d */
    public static boolean m8879d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: f */
    public static void m8881f(Context context, ServiceConnectionC2171e1 serviceConnectionC2171e1, final Intent intent) {
        synchronized (f8788b) {
            m8877b(context);
            boolean m8879d = m8879d(intent);
            m8882g(intent, true);
            if (!m8879d) {
                f8789c.m7609a(f8787a);
            }
            serviceConnectionC2171e1.m8745c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: g9.y0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C2213z0.m8878c(intent);
                }
            });
        }
    }

    /* renamed from: g */
    public static void m8882g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* renamed from: h */
    public static ComponentName m8883h(Context context, Intent intent) {
        synchronized (f8788b) {
            m8877b(context);
            boolean m8879d = m8879d(intent);
            m8882g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m8879d) {
                f8789c.m7609a(f8787a);
            }
            return startService;
        }
    }
}
