package io.flutter.plugins.firebase.crashlytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p010a8.C0077g;
import p010a8.C0078h;
import p195n7.C3767g;

/* loaded from: classes2.dex */
public class FlutterFirebaseCrashlyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler {
    public static final String TAG = "FLTFirebaseCrashlytics";
    private MethodChannel channel;

    /* renamed from: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin$1 */
    /* loaded from: classes2.dex */
    public class C29811 extends HashMap<String, Object> {
        public final /* synthetic */ boolean val$unsentReports;

        public C29811(boolean z10) {
            this.val$unsentReports = z10;
            put(Constants.UNSENT_REPORTS, Boolean.valueOf(z10));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin$2 */
    /* loaded from: classes2.dex */
    public class C29822 extends HashMap<String, Object> {
        public final /* synthetic */ boolean val$didCrashOnPreviousExecution;

        public C29822(boolean z10) {
            this.val$didCrashOnPreviousExecution = z10;
            put(Constants.DID_CRASH_ON_PREVIOUS_EXECUTION, Boolean.valueOf(z10));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin$3 */
    /* loaded from: classes2.dex */
    public class C29833 extends HashMap<String, Object> {
        public C29833() {
            put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(C3767g.m14334o())));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin$4 */
    /* loaded from: classes2.dex */
    public class C29844 extends HashMap<String, Object> {
        public final /* synthetic */ C3767g val$firebaseApp;

        public C29844(C3767g c3767g) {
            this.val$firebaseApp = c3767g;
            if (c3767g.m14350q().equals("[DEFAULT]")) {
                put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(C3767g.m14334o())));
            }
        }
    }

    private Task<Map<String, Object>> checkForUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.i

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10831i;

            public /* synthetic */ RunnableC2994i(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.this.lambda$checkForUnsentReports$0(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private void crash() {
        new Handler(Looper.myLooper()).postDelayed(RunnableC2989d.f10824h, 50L);
    }

    private Task<Void> deleteUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.g
            public /* synthetic */ RunnableC2992g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.lambda$deleteUnsentReports$2(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> didCrashOnPreviousExecution() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.h

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10829i;

            public /* synthetic */ RunnableC2993h(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.this.lambda$didCrashOnPreviousExecution$3(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private StackTraceElement generateStackTraceElement(Map<String, String> map) {
        try {
            String str = map.get(Constants.FILE);
            String str2 = map.get(Constants.LINE);
            String str3 = map.get(Constants.CLASS);
            String str4 = map.get(Constants.METHOD);
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e(TAG, "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences getCrashlyticsSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_crashlytics");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    public boolean isCrashlyticsCollectionEnabled(C3767g c3767g) {
        SharedPreferences crashlyticsSharedPrefs = getCrashlyticsSharedPrefs(c3767g.m14349m());
        if (crashlyticsSharedPrefs.contains("firebase_crashlytics_collection_enabled")) {
            return crashlyticsSharedPrefs.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (!c3767g.m14354x()) {
            return false;
        }
        C0077g.m320d().m329j(true);
        return true;
    }

    public /* synthetic */ void lambda$checkForUnsentReports$0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(((Boolean) Tasks.await(C0077g.m320d().m322a())).booleanValue()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.1
                public final /* synthetic */ boolean val$unsentReports;

                public C29811(boolean z10) {
                    this.val$unsentReports = z10;
                    put(Constants.UNSENT_REPORTS, Boolean.valueOf(z10));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$crash$1() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    public static /* synthetic */ void lambda$deleteUnsentReports$2(TaskCompletionSource taskCompletionSource) {
        try {
            C0077g.m320d().m323b();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$didCrashOnPreviousExecution$3(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(C0077g.m320d().m324c()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.2
                public final /* synthetic */ boolean val$didCrashOnPreviousExecution;

                public C29822(boolean z10) {
                    this.val$didCrashOnPreviousExecution = z10;
                    put(Constants.DID_CRASH_ON_PREVIOUS_EXECUTION, Boolean.valueOf(z10));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$12(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$11(TaskCompletionSource taskCompletionSource, C3767g c3767g) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(c3767g) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.4
                public final /* synthetic */ C3767g val$firebaseApp;

                public C29844(C3767g c3767g2) {
                    this.val$firebaseApp = c3767g2;
                    if (c3767g2.m14350q().equals("[DEFAULT]")) {
                        put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(C3767g.m14334o())));
                    }
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$log$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.MESSAGE);
            Objects.requireNonNull(obj);
            C0077g.m320d().m325f((String) obj);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$onMethodCall$10(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_crashlytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    public /* synthetic */ void lambda$recordError$4(Map map, TaskCompletionSource taskCompletionSource) {
        FlutterError flutterError;
        try {
            C0077g m320d = C0077g.m320d();
            Object obj = map.get(Constants.EXCEPTION);
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get(Constants.REASON);
            Object obj2 = map.get(Constants.INFORMATION);
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get(Constants.FATAL);
            Objects.requireNonNull(obj3);
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get(Constants.BUILD_ID);
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            if (str4.length() > 0) {
                C0078h.m334b(str4);
            }
            if (str2 != null) {
                m320d.m330k(Constants.FLUTTER_ERROR_REASON, "thrown " + str2);
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            m320d.m330k(Constants.FLUTTER_ERROR_EXCEPTION, str);
            ArrayList arrayList = new ArrayList();
            Object obj5 = map.get(Constants.STACK_TRACE_ELEMENTS);
            Objects.requireNonNull(obj5);
            Iterator it = ((List) obj5).iterator();
            while (it.hasNext()) {
                StackTraceElement generateStackTraceElement = generateStackTraceElement((Map) it.next());
                if (generateStackTraceElement != null) {
                    arrayList.add(generateStackTraceElement);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                m320d.m325f(str3);
            }
            if (booleanValue) {
                C0078h.m333a(flutterError);
            } else {
                m320d.m326g(flutterError);
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$sendUnsentReports$6(TaskCompletionSource taskCompletionSource) {
        try {
            C0077g.m320d().m327h();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$setCrashlyticsCollectionEnabled$7(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            C0077g.m320d().m328i((Boolean) obj);
            taskCompletionSource.setResult(new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.3
                public C29833() {
                    put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(C3767g.m14334o())));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$setCustomKey$9(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.KEY);
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            C0077g.m320d().m330k((String) obj, (String) obj2);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$setUserIdentifier$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.IDENTIFIER);
            Objects.requireNonNull(obj);
            C0077g.m320d().m331l((String) obj);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> log(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.b

            /* renamed from: h */
            public final /* synthetic */ Map f10820h;

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10821i;

            public /* synthetic */ RunnableC2987b(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.lambda$log$5(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> recordError(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.k

            /* renamed from: i */
            public final /* synthetic */ Map f10836i;

            /* renamed from: j */
            public final /* synthetic */ TaskCompletionSource f10837j;

            public /* synthetic */ RunnableC2996k(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.this.lambda$recordError$4(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> sendUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.f
            public /* synthetic */ RunnableC2991f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.lambda$sendUnsentReports$6(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> setCrashlyticsCollectionEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.l

            /* renamed from: i */
            public final /* synthetic */ Map f10839i;

            /* renamed from: j */
            public final /* synthetic */ TaskCompletionSource f10840j;

            public /* synthetic */ RunnableC2997l(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.this.lambda$setCrashlyticsCollectionEnabled$7(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> setCustomKey(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.c

            /* renamed from: h */
            public final /* synthetic */ Map f10822h;

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10823i;

            public /* synthetic */ RunnableC2988c(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.lambda$setCustomKey$9(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> setUserIdentifier(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.m

            /* renamed from: h */
            public final /* synthetic */ Map f10841h;

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10842i;

            public /* synthetic */ RunnableC2998m(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.lambda$setUserIdentifier$8(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.e
            public /* synthetic */ RunnableC2990e() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.lambda$didReinitializeFirebaseCore$12(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(C3767g c3767g) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.j

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10833i;

            /* renamed from: j */
            public final /* synthetic */ C3767g f10834j;

            public /* synthetic */ RunnableC2995j(TaskCompletionSource taskCompletionSource2, C3767g c3767g2) {
                r2 = taskCompletionSource2;
                r3 = c3767g2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.this.lambda$getPluginConstantsForFirebaseApp$11(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.channel = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task didCrashOnPreviousExecution;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2094964816:
                if (str.equals("Crashlytics#didCrashOnPreviousExecution")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1437158995:
                if (str.equals("Crashlytics#recordError")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1025128541:
                if (str.equals("Crashlytics#checkForUnsentReports")) {
                    c10 = 2;
                    break;
                }
                break;
            case -424770276:
                if (str.equals("Crashlytics#sendUnsentReports")) {
                    c10 = 3;
                    break;
                }
                break;
            case -108157790:
                if (str.equals("Crashlytics#setCrashlyticsCollectionEnabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case 28093114:
                if (str.equals("Crashlytics#log")) {
                    c10 = 5;
                    break;
                }
                break;
            case 108415030:
                if (str.equals("Crashlytics#setCustomKey")) {
                    c10 = 6;
                    break;
                }
                break;
            case 213629529:
                if (str.equals("Crashlytics#deleteUnsentReports")) {
                    c10 = 7;
                    break;
                }
                break;
            case 679831756:
                if (str.equals("Crashlytics#setUserIdentifier")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1219454365:
                if (str.equals("Crashlytics#crash")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                didCrashOnPreviousExecution = didCrashOnPreviousExecution();
                break;
            case 1:
                didCrashOnPreviousExecution = recordError((Map) methodCall.arguments());
                break;
            case 2:
                didCrashOnPreviousExecution = checkForUnsentReports();
                break;
            case 3:
                didCrashOnPreviousExecution = sendUnsentReports();
                break;
            case 4:
                didCrashOnPreviousExecution = setCrashlyticsCollectionEnabled((Map) methodCall.arguments());
                break;
            case 5:
                didCrashOnPreviousExecution = log((Map) methodCall.arguments());
                break;
            case 6:
                didCrashOnPreviousExecution = setCustomKey((Map) methodCall.arguments());
                break;
            case 7:
                didCrashOnPreviousExecution = deleteUnsentReports();
                break;
            case '\b':
                didCrashOnPreviousExecution = setUserIdentifier((Map) methodCall.arguments());
                break;
            case '\t':
                crash();
                return;
            default:
                result.notImplemented();
                return;
        }
        didCrashOnPreviousExecution.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.crashlytics.a
            public /* synthetic */ C2986a() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseCrashlyticsPlugin.lambda$onMethodCall$10(MethodChannel.Result.this, task);
            }
        });
    }
}
