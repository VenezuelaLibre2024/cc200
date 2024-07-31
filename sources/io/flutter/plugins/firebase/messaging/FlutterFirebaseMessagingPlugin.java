package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.InterfaceC0362r;
import androidx.lifecycle.LiveData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C1287d;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p195n7.C3767g;
import p329x.C5497o;

/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, FlutterPlugin, ActivityAware {
    private MethodChannel channel;
    private C1287d initialMessage;
    private Map<String, Object> initialMessageNotification;
    private Activity mainActivity;
    public FlutterFirebasePermissionManager permissionManager;
    private InterfaceC0362r<C1287d> remoteMessageObserver;
    private InterfaceC0362r<String> tokenObserver;
    private final HashMap<String, Boolean> consumedInitialMessages = new HashMap<>();
    private final LiveData<C1287d> liveDataRemoteMessage = FlutterFirebaseRemoteMessageLiveData.getInstance();
    private final LiveData<String> liveDataToken = FlutterFirebaseTokenLiveData.getInstance();

    /* renamed from: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin$1 */
    /* loaded from: classes2.dex */
    public class C30011 extends HashMap<String, Object> {
        public final /* synthetic */ String val$token;

        public C30011(String str) {
            this.val$token = str;
            put("token", str);
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin$2 */
    /* loaded from: classes2.dex */
    public class C30022 extends HashMap<String, Object> {
        public final /* synthetic */ FirebaseMessaging val$firebaseMessaging;

        public C30022(FirebaseMessaging firebaseMessaging) {
            this.val$firebaseMessaging = firebaseMessaging;
            put(FlutterFirebaseMessagingUtils.IS_AUTO_INIT_ENABLED, Boolean.valueOf(firebaseMessaging.m5443y()));
        }
    }

    private Boolean checkPermissions() {
        return Boolean.valueOf(ContextHolder.getApplicationContext().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    private Task<Void> deleteToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.p
            public /* synthetic */ RunnableC3019p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$deleteToken$2(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put(Constants.MESSAGE, exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private Task<Map<String, Object>> getInitialMessage() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.u

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10883i;

            public /* synthetic */ RunnableC3023u(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$getInitialMessage$9(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Map<String, Integer>> getPermissions() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.t

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10881i;

            public /* synthetic */ RunnableC3022t(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$getPermissions$13(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Map<String, Object>> getToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.e

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10856i;

            public /* synthetic */ RunnableC3008e(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$getToken$3(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.permissionManager = new FlutterFirebasePermissionManager();
        this.remoteMessageObserver = new InterfaceC0362r() { // from class: io.flutter.plugins.firebase.messaging.d
            public /* synthetic */ C3007d() {
            }

            @Override // androidx.lifecycle.InterfaceC0362r
            /* renamed from: a */
            public final void mo1433a(Object obj) {
                FlutterFirebaseMessagingPlugin.this.lambda$initInstance$0((C1287d) obj);
            }
        };
        this.tokenObserver = new InterfaceC0362r() { // from class: io.flutter.plugins.firebase.messaging.l
            public /* synthetic */ C3015l() {
            }

            @Override // androidx.lifecycle.InterfaceC0362r
            /* renamed from: a */
            public final void mo1433a(Object obj) {
                FlutterFirebaseMessagingPlugin.this.lambda$initInstance$1((String) obj);
            }
        };
        this.liveDataRemoteMessage.observeForever(this.remoteMessageObserver);
        this.liveDataToken.observeForever(this.tokenObserver);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    public static /* synthetic */ void lambda$deleteToken$2(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(FirebaseMessaging.m5422r().m5436o());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getInitialMessage$9(TaskCompletionSource taskCompletionSource) {
        Map map;
        try {
            C1287d c1287d = this.initialMessage;
            if (c1287d != null) {
                Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(c1287d);
                Map<String, Object> map2 = this.initialMessageNotification;
                if (map2 != null) {
                    remoteMessageToMap.put(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, map2);
                }
                taskCompletionSource.setResult(remoteMessageToMap);
                this.initialMessage = null;
                this.initialMessageNotification = null;
                return;
            }
            Activity activity = this.mainActivity;
            if (activity == null) {
                taskCompletionSource.setResult(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.consumedInitialMessages.get(string) == null) {
                    C1287d c1287d2 = FlutterFirebaseMessagingReceiver.notifications.get(string);
                    if (c1287d2 == null) {
                        Map<String, Object> firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string);
                        if (firebaseMessageMap != null) {
                            c1287d2 = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
                            if (firebaseMessageMap.get(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE) != null) {
                                map = (Map) firebaseMessageMap.get(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
                                FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                            }
                        }
                        map = null;
                        FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                    } else {
                        map = null;
                    }
                    if (c1287d2 == null) {
                        taskCompletionSource.setResult(null);
                        return;
                    }
                    this.consumedInitialMessages.put(string, Boolean.TRUE);
                    Map<String, Object> remoteMessageToMap2 = FlutterFirebaseMessagingUtils.remoteMessageToMap(c1287d2);
                    if (c1287d2.m5514O() == null && map != null) {
                        remoteMessageToMap2.put(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, map);
                    }
                    taskCompletionSource.setResult(remoteMessageToMap2);
                    return;
                }
                taskCompletionSource.setResult(null);
                return;
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getPermissions$13(TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("authorizationStatus", Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? checkPermissions().booleanValue() : C5497o.m22067f(this.mainActivity).m22070a() ? 1 : 0));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$15(C3767g c3767g, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            if (c3767g.m14350q().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.m5422r().m5443y()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getToken$3(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>((String) Tasks.await(FirebaseMessaging.m5422r().m5440u())) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.1
                public final /* synthetic */ String val$token;

                public C30011(String str) {
                    this.val$token = str;
                    put("token", str);
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$initInstance$0(C1287d c1287d) {
        this.channel.invokeMethod("Messaging#onMessage", FlutterFirebaseMessagingUtils.remoteMessageToMap(c1287d));
    }

    public /* synthetic */ void lambda$initInstance$1(String str) {
        this.channel.invokeMethod("Messaging#onTokenRefresh", str);
    }

    public /* synthetic */ void lambda$onMethodCall$14(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_messaging", exception != null ? exception.getMessage() : null, getExceptionDetails(exception));
        }
    }

    public static /* synthetic */ void lambda$requestPermissions$10(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        map.put("authorizationStatus", Integer.valueOf(i10));
        taskCompletionSource.setResult(map);
    }

    public static /* synthetic */ void lambda$requestPermissions$11(TaskCompletionSource taskCompletionSource, String str) {
        taskCompletionSource.setException(new Exception(str));
    }

    public /* synthetic */ void lambda$requestPermissions$12(TaskCompletionSource taskCompletionSource) {
        HashMap hashMap = new HashMap();
        try {
            if (checkPermissions().booleanValue()) {
                hashMap.put("authorizationStatus", 1);
                taskCompletionSource.setResult(hashMap);
            } else {
                this.permissionManager.requestPermissions(this.mainActivity, new FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback() { // from class: io.flutter.plugins.firebase.messaging.o

                    /* renamed from: a */
                    public final /* synthetic */ Map f10874a;

                    /* renamed from: b */
                    public final /* synthetic */ TaskCompletionSource f10875b;

                    public /* synthetic */ C3018o(Map hashMap2, TaskCompletionSource taskCompletionSource2) {
                        r1 = hashMap2;
                        r2 = taskCompletionSource2;
                    }

                    @Override // io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback
                    public final void onSuccess(int i10) {
                        FlutterFirebaseMessagingPlugin.lambda$requestPermissions$10(r1, r2, i10);
                    }
                }, new ErrorCallback() { // from class: io.flutter.plugins.firebase.messaging.n
                    public /* synthetic */ C3017n() {
                    }

                    @Override // io.flutter.plugins.firebase.messaging.ErrorCallback
                    public final void onError(String str) {
                        FlutterFirebaseMessagingPlugin.lambda$requestPermissions$11(TaskCompletionSource.this, str);
                    }
                });
            }
        } catch (Exception e10) {
            taskCompletionSource2.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$sendMessage$6(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map).m5425L(FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$setAutoInitEnabled$7(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.m5426M(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(new HashMap<String, Object>(firebaseMessagingForArguments) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.2
                public final /* synthetic */ FirebaseMessaging val$firebaseMessaging;

                public C30022(FirebaseMessaging firebaseMessagingForArguments2) {
                    this.val$firebaseMessaging = firebaseMessagingForArguments2;
                    put(FlutterFirebaseMessagingUtils.IS_AUTO_INIT_ENABLED, Boolean.valueOf(firebaseMessagingForArguments2.m5443y()));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$setDeliveryMetricsExportToBigQuery$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.m5427N(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$subscribeToTopic$4(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.m5431R((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$unsubscribeFromTopic$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.m5434U((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Integer>> requestPermissions() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.s

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10879i;

            public /* synthetic */ RunnableC3021s(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$requestPermissions$12(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> sendMessage(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.h

            /* renamed from: h */
            public final /* synthetic */ Map f10862h;

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10863i;

            public /* synthetic */ RunnableC3011h(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$sendMessage$6(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Map<String, Object>> setAutoInitEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.f

            /* renamed from: i */
            public final /* synthetic */ Map f10858i;

            /* renamed from: j */
            public final /* synthetic */ TaskCompletionSource f10859j;

            public /* synthetic */ RunnableC3009f(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$setAutoInitEnabled$7(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> setDeliveryMetricsExportToBigQuery(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.i

            /* renamed from: h */
            public final /* synthetic */ Map f10864h;

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10865i;

            public /* synthetic */ RunnableC3012i(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$setDeliveryMetricsExportToBigQuery$8(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> subscribeToTopic(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.g

            /* renamed from: h */
            public final /* synthetic */ Map f10860h;

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10861i;

            public /* synthetic */ RunnableC3010g(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$subscribeToTopic$4(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> unsubscribeFromTopic(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.j

            /* renamed from: h */
            public final /* synthetic */ Map f10866h;

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10867i;

            public /* synthetic */ RunnableC3013j(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$unsubscribeFromTopic$5(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.q
            public /* synthetic */ RunnableC3020q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.setResult(null);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(C3767g c3767g) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.k

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10869i;

            public /* synthetic */ RunnableC3014k(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$getPluginConstantsForFirebaseApp$15(C3767g.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this.permissionManager);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        if (activity.getIntent() == null || this.mainActivity.getIntent().getExtras() == null || (this.mainActivity.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        onNewIntent(this.mainActivity.getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.liveDataToken.removeObserver(this.tokenObserver);
        this.liveDataRemoteMessage.removeObserver(this.remoteMessageObserver);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0090. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task initialMessage;
        Long valueOf;
        Long valueOf2;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c10 = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c10 = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c10 = 4;
                    break;
                }
                break;
            case 607887267:
                if (str.equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
                    c10 = 5;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                initialMessage = getInitialMessage();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 1:
                initialMessage = setAutoInitEnabled((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 2:
                initialMessage = deleteToken();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 3:
                initialMessage = unsubscribeFromTopic((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 4:
                initialMessage = subscribeToTopic((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 5:
                initialMessage = setDeliveryMetricsExportToBigQuery((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 6:
                Map map = (Map) methodCall.arguments;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    valueOf = (Long) obj;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    valueOf = Long.valueOf(((Integer) obj).intValue());
                }
                long longValue = valueOf.longValue();
                if (obj2 instanceof Long) {
                    valueOf2 = (Long) obj2;
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    valueOf2 = Long.valueOf(((Integer) obj2).intValue());
                }
                long longValue2 = valueOf2.longValue();
                Activity activity = this.mainActivity;
                FlutterShellArgs fromIntent = activity != null ? FlutterShellArgs.fromIntent(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.setCallbackDispatcher(longValue);
                FlutterFirebaseMessagingBackgroundService.setUserCallbackHandle(longValue2);
                FlutterFirebaseMessagingBackgroundService.startBackgroundIsolate(longValue, fromIntent);
                initialMessage = Tasks.forResult(null);
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 7:
                initialMessage = sendMessage((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case '\b':
                if (Build.VERSION.SDK_INT >= 33) {
                    initialMessage = requestPermissions();
                    initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                        /* renamed from: b */
                        public final /* synthetic */ MethodChannel.Result f10872b;

                        public /* synthetic */ C3016m(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                        }
                    });
                    return;
                }
            case '\t':
                initialMessage = getPermissions();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case '\n':
                initialMessage = getToken();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f10872b;

                    public /* synthetic */ C3016m(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            default:
                result2.notImplemented();
                return;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> firebaseMessageMap;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        C1287d c1287d = FlutterFirebaseMessagingReceiver.notifications.get(string);
        Map<String, Object> map2 = null;
        if (c1287d == null && (firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string)) != null) {
            c1287d = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
            map2 = FlutterFirebaseMessagingUtils.getRemoteMessageNotificationForArguments(firebaseMessageMap);
        }
        if (c1287d == null) {
            return false;
        }
        this.initialMessage = c1287d;
        this.initialMessageNotification = map2;
        FlutterFirebaseMessagingReceiver.notifications.remove(string);
        Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(c1287d);
        if (c1287d.m5514O() == null && (map = this.initialMessageNotification) != null) {
            remoteMessageToMap.put(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, map);
        }
        this.channel.invokeMethod("Messaging#onMessageOpenedApp", remoteMessageToMap);
        this.mainActivity.setIntent(intent);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }
}
