package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.C1287d;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingBackgroundExecutor implements MethodChannel.MethodCallHandler {
    private static final String CALLBACK_HANDLE_KEY = "callback_handle";
    private static final String TAG = "FLTFireBGExecutor";
    private static final String USER_CALLBACK_HANDLE_KEY = "user_callback_handle";
    private MethodChannel backgroundChannel;
    private FlutterEngine backgroundFlutterEngine;
    private final AtomicBoolean isCallbackDispatcherReady = new AtomicBoolean(false);

    private long getPluginCallbackHandle() {
        return ContextHolder.getApplicationContext().getSharedPreferences(FlutterFirebaseMessagingUtils.SHARED_PREFERENCES_KEY, 0).getLong(CALLBACK_HANDLE_KEY, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getUserCallbackHandle() {
        return ContextHolder.getApplicationContext().getSharedPreferences(FlutterFirebaseMessagingUtils.SHARED_PREFERENCES_KEY, 0).getLong(USER_CALLBACK_HANDLE_KEY, 0L);
    }

    private void initializeMethodChannel(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging_background");
        this.backgroundChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startBackgroundIsolate$0(FlutterLoader flutterLoader, FlutterShellArgs flutterShellArgs, long j10) {
        String findAppBundlePath = flutterLoader.findAppBundlePath();
        AssetManager assets = ContextHolder.getApplicationContext().getAssets();
        if (isNotRunning()) {
            if (flutterShellArgs != null) {
                Log.i(TAG, "Creating background FlutterEngine instance, with args: " + Arrays.toString(flutterShellArgs.toArray()));
                this.backgroundFlutterEngine = new FlutterEngine(ContextHolder.getApplicationContext(), flutterShellArgs.toArray());
            } else {
                Log.i(TAG, "Creating background FlutterEngine instance.");
                this.backgroundFlutterEngine = new FlutterEngine(ContextHolder.getApplicationContext());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
            DartExecutor dartExecutor = this.backgroundFlutterEngine.getDartExecutor();
            initializeMethodChannel(dartExecutor);
            dartExecutor.executeDartCallback(new DartExecutor.DartCallback(assets, findAppBundlePath, lookupCallbackInformation));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startBackgroundIsolate$1(final FlutterLoader flutterLoader, Handler handler, final FlutterShellArgs flutterShellArgs, final long j10) {
        flutterLoader.startInitialization(ContextHolder.getApplicationContext());
        flutterLoader.ensureInitializationCompleteAsync(ContextHolder.getApplicationContext(), null, handler, new Runnable() { // from class: io.flutter.plugins.firebase.messaging.b
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingBackgroundExecutor.this.lambda$startBackgroundIsolate$0(flutterLoader, flutterShellArgs, j10);
            }
        });
    }

    private void onInitialized() {
        this.isCallbackDispatcherReady.set(true);
        FlutterFirebaseMessagingBackgroundService.onInitialized();
    }

    public static void setCallbackDispatcher(long j10) {
        ContextHolder.getApplicationContext().getSharedPreferences(FlutterFirebaseMessagingUtils.SHARED_PREFERENCES_KEY, 0).edit().putLong(CALLBACK_HANDLE_KEY, j10).apply();
    }

    public static void setUserCallbackHandle(long j10) {
        ContextHolder.getApplicationContext().getSharedPreferences(FlutterFirebaseMessagingUtils.SHARED_PREFERENCES_KEY, 0).edit().putLong(USER_CALLBACK_HANDLE_KEY, j10).apply();
    }

    public void executeDartCallbackInBackgroundIsolate(Intent intent, final CountDownLatch countDownLatch) {
        if (this.backgroundFlutterEngine == null) {
            Log.i(TAG, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        MethodChannel.Result result = countDownLatch != null ? new MethodChannel.Result() { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundExecutor.1
            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str, String str2, Object obj) {
                countDownLatch.countDown();
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                countDownLatch.countDown();
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                countDownLatch.countDown();
            }
        } : null;
        C1287d c1287d = (C1287d) intent.getParcelableExtra(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
        if (c1287d != null) {
            this.backgroundChannel.invokeMethod("MessagingBackground#onMessage", new HashMap<String, Object>(FlutterFirebaseMessagingUtils.remoteMessageToMap(c1287d)) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundExecutor.2
                public final /* synthetic */ Map val$remoteMessageMap;

                {
                    this.val$remoteMessageMap = r4;
                    put("userCallbackHandle", Long.valueOf(FlutterFirebaseMessagingBackgroundExecutor.this.getUserCallbackHandle()));
                    put(Constants.MESSAGE, r4);
                }
            }, result);
        } else {
            Log.e(TAG, "RemoteMessage instance not found in Intent.");
        }
    }

    public boolean isDartBackgroundHandlerRegistered() {
        return getPluginCallbackHandle() != 0;
    }

    public boolean isNotRunning() {
        return !this.isCallbackDispatcherReady.get();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        try {
            if (methodCall.method.equals("MessagingBackground#initialized")) {
                onInitialized();
                result.success(Boolean.TRUE);
            } else {
                result.notImplemented();
            }
        } catch (PluginRegistrantException e10) {
            result.error(ImagePickerCache.MAP_KEY_ERROR, "Flutter FCM error: " + e10.getMessage(), null);
        }
    }

    public void startBackgroundIsolate() {
        if (isNotRunning()) {
            long pluginCallbackHandle = getPluginCallbackHandle();
            if (pluginCallbackHandle != 0) {
                startBackgroundIsolate(pluginCallbackHandle, null);
            }
        }
    }

    public void startBackgroundIsolate(final long j10, final FlutterShellArgs flutterShellArgs) {
        if (this.backgroundFlutterEngine != null) {
            Log.e(TAG, "Background isolate already started.");
            return;
        }
        final FlutterLoader flutterLoader = new FlutterLoader();
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.a
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingBackgroundExecutor.this.lambda$startBackgroundIsolate$1(flutterLoader, handler, flutterShellArgs, j10);
            }
        });
    }
}
