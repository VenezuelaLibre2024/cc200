package p099g9;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p194n6.C3760a;
import p223p6.ThreadFactoryC4056b;

/* renamed from: g9.e1 */
/* loaded from: classes.dex */
public class ServiceConnectionC2171e1 implements ServiceConnection {

    /* renamed from: h */
    public final Context f8677h;

    /* renamed from: i */
    public final Intent f8678i;

    /* renamed from: j */
    public final ScheduledExecutorService f8679j;

    /* renamed from: k */
    public final Queue<a> f8680k;

    /* renamed from: l */
    public BinderC2162b1 f8681l;

    /* renamed from: m */
    public boolean f8682m;

    /* renamed from: g9.e1$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Intent f8683a;

        /* renamed from: b */
        public final TaskCompletionSource<Void> f8684b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f8683a = intent;
        }

        /* renamed from: f */
        public /* synthetic */ void m8749f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f8683a.getAction() + " finishing.");
            m8752d();
        }

        /* renamed from: c */
        public void m8751c(ScheduledExecutorService scheduledExecutorService) {
            m8753e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: g9.c1

                /* renamed from: a */
                public final /* synthetic */ ScheduledFuture f8662a;

                public /* synthetic */ C2165c1(ScheduledFuture scheduledFuture) {
                    r1 = scheduledFuture;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    r1.cancel(false);
                }
            });
        }

        /* renamed from: d */
        public void m8752d() {
            this.f8684b.trySetResult(null);
        }

        /* renamed from: e */
        public Task<Void> m8753e() {
            return this.f8684b.getTask();
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ServiceConnectionC2171e1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC4056b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public ServiceConnectionC2171e1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8680k = new ArrayDeque();
        this.f8682m = false;
        Context applicationContext = context.getApplicationContext();
        this.f8677h = applicationContext;
        this.f8678i = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f8679j = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void m8743a() {
        while (!this.f8680k.isEmpty()) {
            this.f8680k.poll().m8752d();
        }
    }

    /* renamed from: b */
    public final synchronized void m8744b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f8680k.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC2162b1 binderC2162b1 = this.f8681l;
            if (binderC2162b1 == null || !binderC2162b1.isBinderAlive()) {
                m8746d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f8681l.m8706c(this.f8680k.poll());
        }
    }

    /* renamed from: c */
    public synchronized Task<Void> m8745c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.m8751c(this.f8679j);
        this.f8680k.add(aVar);
        m8744b();
        return aVar.m8753e();
    }

    /* renamed from: d */
    public final void m8746d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f8682m);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f8682m) {
            return;
        }
        this.f8682m = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (C3760a.m14312b().m14316a(this.f8677h, this.f8678i, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f8682m = false;
        m8743a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f8682m = false;
        if (iBinder instanceof BinderC2162b1) {
            this.f8681l = (BinderC2162b1) iBinder;
            m8744b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        m8743a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m8744b();
    }
}
