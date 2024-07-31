package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.C1287d;
import io.flutter.embedding.engine.FlutterShellArgs;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingBackgroundService extends JobIntentService {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "FLTFireMsgService";
    private static FlutterFirebaseMessagingBackgroundExecutor flutterBackgroundExecutor;
    private static final List<Intent> messagingQueue = Collections.synchronizedList(new LinkedList());

    public static void enqueueMessageProcessing(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        Objects.requireNonNull(extras);
        JobIntentService.enqueueWork(context, FlutterFirebaseMessagingBackgroundService.class, FlutterFirebaseMessagingUtils.JOB_ID, intent, ((C1287d) extras.get(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).m5515P() == 1);
    }

    public static /* synthetic */ void lambda$onHandleWork$0(Intent intent, CountDownLatch countDownLatch) {
        flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(intent, countDownLatch);
    }

    public static void onInitialized() {
        Log.i(TAG, "FlutterFirebaseMessagingBackgroundService started!");
        List<Intent> list = messagingQueue;
        synchronized (list) {
            Iterator<Intent> it = list.iterator();
            while (it.hasNext()) {
                flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(it.next(), null);
            }
            messagingQueue.clear();
        }
    }

    public static void setCallbackDispatcher(long j10) {
        FlutterFirebaseMessagingBackgroundExecutor.setCallbackDispatcher(j10);
    }

    public static void setUserCallbackHandle(long j10) {
        FlutterFirebaseMessagingBackgroundExecutor.setUserCallbackHandle(j10);
    }

    public static void startBackgroundIsolate(long j10, FlutterShellArgs flutterShellArgs) {
        if (flutterBackgroundExecutor != null) {
            Log.w(TAG, "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        flutterBackgroundExecutor = flutterFirebaseMessagingBackgroundExecutor;
        flutterFirebaseMessagingBackgroundExecutor.startBackgroundIsolate(j10, flutterShellArgs);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public /* bridge */ /* synthetic */ boolean isStopped() {
        return super.isStopped();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (flutterBackgroundExecutor == null) {
            flutterBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        }
        flutterBackgroundExecutor.startBackgroundIsolate();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public void onHandleWork(Intent intent) {
        if (!flutterBackgroundExecutor.isDartBackgroundHandlerRegistered()) {
            Log.w(TAG, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List<Intent> list = messagingQueue;
        synchronized (list) {
            if (flutterBackgroundExecutor.isNotRunning()) {
                Log.i(TAG, "Service has not yet started, messages will be queued.");
                list.add(intent);
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.c

                /* renamed from: h */
                public final /* synthetic */ Intent f10852h;

                /* renamed from: i */
                public final /* synthetic */ CountDownLatch f10853i;

                public /* synthetic */ RunnableC3006c(Intent intent2, CountDownLatch countDownLatch2) {
                    r1 = intent2;
                    r2 = countDownLatch2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FlutterFirebaseMessagingBackgroundService.lambda$onHandleWork$0(r1, r2);
                }
            });
            try {
                countDownLatch2.await();
            } catch (InterruptedException e10) {
                Log.i(TAG, "Exception waiting to execute Dart callback", e10);
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public /* bridge */ /* synthetic */ boolean onStopCurrentWork() {
        return super.onStopCurrentWork();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public /* bridge */ /* synthetic */ void setInterruptIfStopped(boolean z10) {
        super.setInterruptIfStopped(z10);
    }
}
