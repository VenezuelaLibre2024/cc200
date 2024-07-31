package p048d6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p285u.C4777g;

/* renamed from: d6.d */
/* loaded from: classes.dex */
public class C1567d {

    /* renamed from: h */
    public static int f5864h;

    /* renamed from: i */
    public static PendingIntent f5865i;

    /* renamed from: j */
    public static final Executor f5866j = ExecutorC1572f0.f5878h;

    /* renamed from: k */
    public static final Pattern f5867k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    public final Context f5869b;

    /* renamed from: c */
    public final C1566c0 f5870c;

    /* renamed from: d */
    public final ScheduledExecutorService f5871d;

    /* renamed from: f */
    public Messenger f5873f;

    /* renamed from: g */
    public C1579l f5874g;

    /* renamed from: a */
    public final C4777g f5868a = new C4777g();

    /* renamed from: e */
    public final Messenger f5872e = new Messenger(new HandlerC1575h(this, Looper.getMainLooper()));

    public C1567d(Context context) {
        this.f5869b = context;
        this.f5870c = new C1566c0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5871d = scheduledThreadPoolExecutor;
    }

    /* renamed from: c */
    public static /* synthetic */ Task m6407c(Bundle bundle) {
        return m6411k(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ void m6408e(C1567d c1567d, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C1578k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C1579l) {
                        c1567d.f5874g = (C1579l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1567d.f5873f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!C1568d0.m6418a(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f5867k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        c1567d.m6417j(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(ImagePickerCache.MAP_KEY_ERROR);
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c1567d.f5868a) {
                        for (int i10 = 0; i10 < c1567d.f5868a.size(); i10++) {
                            c1567d.m6417j((String) c1567d.f5868a.m18761i(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !C1568d0.m6418a(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                c1567d.m6417j(str, intent2.putExtra(ImagePickerCache.MAP_KEY_ERROR, str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: h */
    public static synchronized String m6409h() {
        String num;
        synchronized (C1567d.class) {
            int i10 = f5864h;
            f5864h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    /* renamed from: i */
    public static synchronized void m6410i(Context context, Intent intent) {
        synchronized (C1567d.class) {
            if (f5865i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f5865i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", f5865i);
        }
    }

    /* renamed from: k */
    public static boolean m6411k(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: a */
    public Task<Void> m6412a(C1561a c1561a) {
        if (this.f5870c.m6405a() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c1561a.m6389J());
        Integer m6390K = c1561a.m6390K();
        if (m6390K != null) {
            bundle.putInt("google.product_id", m6390K.intValue());
        }
        return C1564b0.m6398b(this.f5869b).m6400c(3, bundle);
    }

    /* renamed from: b */
    public Task<Bundle> m6413b(Bundle bundle) {
        return this.f5870c.m6405a() < 12000000 ? this.f5870c.m6406b() != 0 ? m6416g(bundle).continueWithTask(f5866j, new Continuation() { // from class: d6.g0

            /* renamed from: b */
            public final /* synthetic */ Bundle f5883b;

            public /* synthetic */ C1574g0(Bundle bundle2) {
                r2 = bundle2;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C1567d.this.m6414d(r2, task);
            }
        }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE")) : C1564b0.m6398b(this.f5869b).m6401d(1, bundle2).continueWith(f5866j, C1569e.f5875a);
    }

    /* renamed from: d */
    public final /* synthetic */ Task m6414d(Bundle bundle, Task task) {
        return (task.isSuccessful() && m6411k((Bundle) task.getResult())) ? m6416g(bundle).onSuccessTask(f5866j, C1570e0.f5876a) : task;
    }

    /* renamed from: f */
    public final /* synthetic */ void m6415f(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f5868a) {
            this.f5868a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* renamed from: g */
    public final Task m6416g(Bundle bundle) {
        String m6409h = m6409h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f5868a) {
            this.f5868a.put(m6409h, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f5870c.m6406b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        m6410i(this.f5869b, intent);
        intent.putExtra("kid", "|ID|" + m6409h + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f5872e);
        if (this.f5873f != null || this.f5874g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f5873f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f5874g.m6420b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(f5866j, new OnCompleteListener() { // from class: d6.g

                /* renamed from: b */
                public final /* synthetic */ String f5880b;

                /* renamed from: c */
                public final /* synthetic */ ScheduledFuture f5881c;

                public /* synthetic */ C1573g(String m6409h2, ScheduledFuture scheduledFuture) {
                    r2 = m6409h2;
                    r3 = scheduledFuture;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1567d.this.m6415f(r2, r3, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f5870c.m6406b() == 2) {
            this.f5869b.sendBroadcast(intent);
        } else {
            this.f5869b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(f5866j, new OnCompleteListener() { // from class: d6.g

            /* renamed from: b */
            public final /* synthetic */ String f5880b;

            /* renamed from: c */
            public final /* synthetic */ ScheduledFuture f5881c;

            public /* synthetic */ C1573g(String m6409h2, ScheduledFuture scheduledFuture) {
                r2 = m6409h2;
                r3 = scheduledFuture;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1567d.this.m6415f(r2, r3, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: j */
    public final void m6417j(String str, Bundle bundle) {
        synchronized (this.f5868a) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f5868a.remove(str);
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(bundle);
                return;
            }
            Log.w("Rpc", "Missing callback for " + str);
        }
    }
}
