package p099g9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.window.layout.ExecutorC0412c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p207o6.C3944m;

/* renamed from: g9.l */
/* loaded from: classes.dex */
public class C2184l {

    /* renamed from: c */
    public static final Object f8709c = new Object();

    /* renamed from: d */
    public static ServiceConnectionC2171e1 f8710d;

    /* renamed from: a */
    public final Context f8711a;

    /* renamed from: b */
    public final Executor f8712b = ExecutorC0412c.f1952h;

    public C2184l(Context context) {
        this.f8711a = context;
    }

    /* renamed from: e */
    public static Task<Integer> m8783e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        ServiceConnectionC2171e1 m8784f = m8784f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return m8784f.m8745c(intent).continueWith(ExecutorC0412c.f1952h, new Continuation() { // from class: g9.i
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Integer m8785g;
                    m8785g = C2184l.m8785g(task);
                    return m8785g;
                }
            });
        }
        if (C2193p0.m8808b().m8812e(context)) {
            C2213z0.m8881f(context, m8784f, intent);
        } else {
            m8784f.m8745c(intent);
        }
        return Tasks.forResult(-1);
    }

    /* renamed from: f */
    public static ServiceConnectionC2171e1 m8784f(Context context, String str) {
        ServiceConnectionC2171e1 serviceConnectionC2171e1;
        synchronized (f8709c) {
            if (f8710d == null) {
                f8710d = new ServiceConnectionC2171e1(context, str);
            }
            serviceConnectionC2171e1 = f8710d;
        }
        return serviceConnectionC2171e1;
    }

    /* renamed from: g */
    public static /* synthetic */ Integer m8785g(Task task) {
        return -1;
    }

    /* renamed from: h */
    public static /* synthetic */ Integer m8786h(Context context, Intent intent) {
        return Integer.valueOf(C2193p0.m8808b().m8814g(context, intent));
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m8787i(Task task) {
        return 403;
    }

    /* renamed from: j */
    public static /* synthetic */ Task m8788j(Context context, Intent intent, boolean z10, Task task) {
        return (C3944m.m14959h() && ((Integer) task.getResult()).intValue() == 402) ? m8783e(context, intent, z10).continueWith(ExecutorC0412c.f1952h, new Continuation() { // from class: g9.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Integer m8787i;
                m8787i = C2184l.m8787i(task2);
                return m8787i;
            }
        }) : task;
    }

    /* renamed from: k */
    public Task<Integer> m8789k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m8790l(this.f8711a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: l */
    public Task<Integer> m8790l(final Context context, final Intent intent) {
        boolean z10 = C3944m.m14959h() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.call(this.f8712b, new Callable() { // from class: g9.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m8786h;
                m8786h = C2184l.m8786h(context, intent);
                return m8786h;
            }
        }).continueWithTask(this.f8712b, new Continuation() { // from class: g9.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m8788j;
                m8788j = C2184l.m8788j(context, intent, z11, task);
                return m8788j;
            }
        }) : m8783e(context, intent, z11);
    }
}
