package p048d6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p223p6.ThreadFactoryC4056b;

/* renamed from: d6.b0 */
/* loaded from: classes.dex */
public final class C1564b0 {

    /* renamed from: e */
    public static C1564b0 f5855e;

    /* renamed from: a */
    public final Context f5856a;

    /* renamed from: b */
    public final ScheduledExecutorService f5857b;

    /* renamed from: c */
    public ServiceConnectionC1588u f5858c = new ServiceConnectionC1588u(this, null);

    /* renamed from: d */
    public int f5859d = 1;

    public C1564b0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5857b = scheduledExecutorService;
        this.f5856a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m6397a(C1564b0 c1564b0) {
        return c1564b0.f5856a;
    }

    /* renamed from: b */
    public static synchronized C1564b0 m6398b(Context context) {
        C1564b0 c1564b0;
        synchronized (C1564b0.class) {
            if (f5855e == null) {
                zze.zza();
                f5855e = new C1564b0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC4056b("MessengerIpcClient"))));
            }
            c1564b0 = f5855e;
        }
        return c1564b0;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m6399e(C1564b0 c1564b0) {
        return c1564b0.f5857b;
    }

    /* renamed from: c */
    public final Task m6400c(int i10, Bundle bundle) {
        return m6403g(new C1591x(m6402f(), i10, bundle));
    }

    /* renamed from: d */
    public final Task m6401d(int i10, Bundle bundle) {
        return m6403g(new C1562a0(m6402f(), 1, bundle));
    }

    /* renamed from: f */
    public final synchronized int m6402f() {
        int i10;
        i10 = this.f5859d;
        this.f5859d = i10 + 1;
        return i10;
    }

    /* renamed from: g */
    public final synchronized Task m6403g(AbstractC1592y abstractC1592y) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(abstractC1592y.toString()));
        }
        if (!this.f5858c.m6427g(abstractC1592y)) {
            ServiceConnectionC1588u serviceConnectionC1588u = new ServiceConnectionC1588u(this, null);
            this.f5858c = serviceConnectionC1588u;
            serviceConnectionC1588u.m6427g(abstractC1592y);
        }
        return abstractC1592y.f5909b.getTask();
    }
}
