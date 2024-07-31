package p099g9;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.ExecutorC0412c;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import p099g9.BinderC2162b1;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: g9.g */
/* loaded from: classes.dex */
public abstract class AbstractServiceC2174g extends Service {
    public static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    public final ExecutorService executor = C2186m.m8797d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: g9.g$a */
    /* loaded from: classes.dex */
    public class a implements BinderC2162b1.a {
        public a() {
        }

        @Override // p099g9.BinderC2162b1.a
        /* renamed from: a */
        public Task<Void> mo8707a(Intent intent) {
            return AbstractServiceC2174g.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            C2213z0.m8878c(intent);
        }
        synchronized (this.lock) {
            int i10 = this.runningTasks - 1;
            this.runningTasks = i10;
            if (i10 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, Task task) {
        finishTask(intent);
    }

    public /* synthetic */ void lambda$processIntent$0(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    public Task<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable() { // from class: g9.f

            /* renamed from: i */
            public final /* synthetic */ Intent f8686i;

            /* renamed from: j */
            public final /* synthetic */ TaskCompletionSource f8687j;

            public /* synthetic */ RunnableC2172f(Intent intent2, TaskCompletionSource taskCompletionSource2) {
                r2 = intent2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2174g.this.lambda$processIntent$0(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new BinderC2162b1(new a());
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        processIntent.addOnCompleteListener(ExecutorC0412c.f1952h, new OnCompleteListener() { // from class: g9.e

            /* renamed from: b */
            public final /* synthetic */ Intent f8674b;

            public /* synthetic */ C2169e(Intent intent2) {
                r2 = intent2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractServiceC2174g.this.lambda$onStartCommand$1(r2, task);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
