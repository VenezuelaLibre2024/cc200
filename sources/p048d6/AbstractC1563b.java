package p048d6;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p223p6.ThreadFactoryC4056b;

/* renamed from: d6.b */
/* loaded from: classes.dex */
public abstract class AbstractC1563b extends BroadcastReceiver {

    /* renamed from: a */
    public static SoftReference f5854a;

    /* renamed from: a */
    public Executor m6393a() {
        ExecutorService executorService;
        synchronized (AbstractC1563b.class) {
            SoftReference softReference = f5854a;
            executorService = softReference != null ? (ExecutorService) softReference.get() : null;
            if (executorService == null) {
                zze.zza();
                executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC4056b("firebase-iid-executor")));
                f5854a = new SoftReference(executorService);
            }
        }
        return executorService;
    }

    /* renamed from: b */
    public abstract int mo5364b(Context context, C1561a c1561a);

    /* renamed from: c */
    public void mo5365c(Context context, Bundle bundle) {
    }

    /* renamed from: d */
    public final /* synthetic */ void m6394d(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int m6396f = intent2 != null ? m6396f(context, intent2) : m6395e(context, intent);
            if (z10) {
                pendingResult.setResultCode(m6396f);
            }
        } finally {
            pendingResult.finish();
        }
    }

    /* renamed from: e */
    public final int m6395e(Context context, Intent intent) {
        Task m6400c;
        if (intent.getExtras() == null) {
            return 500;
        }
        C1561a c1561a = new C1561a(intent);
        if (TextUtils.isEmpty(c1561a.m6389J())) {
            m6400c = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", c1561a.m6389J());
            Integer m6390K = c1561a.m6390K();
            if (m6390K != null) {
                bundle.putInt("google.product_id", m6390K.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            m6400c = C1564b0.m6398b(context).m6400c(2, bundle);
        }
        int mo5364b = mo5364b(context, c1561a);
        try {
            Tasks.await(m6400c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
        }
        return mo5364b;
    }

    /* renamed from: f */
    public final int m6396f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        String action = intent.getAction();
        if (action == "com.google.firebase.messaging.NOTIFICATION_DISMISS" || (action != null && action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
            mo5365c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        m6393a().execute(new Runnable() { // from class: d6.m
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1563b.this.m6394d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
