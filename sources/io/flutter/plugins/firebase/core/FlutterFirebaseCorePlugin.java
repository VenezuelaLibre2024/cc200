package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p195n7.C3767g;
import p195n7.C3776p;

/* loaded from: classes2.dex */
public class FlutterFirebaseCorePlugin implements FlutterPlugin, GeneratedAndroidFirebaseCore.FirebaseCoreHostApi, GeneratedAndroidFirebaseCore.FirebaseAppHostApi {
    public static Map<String, String> customAuthDomain = new HashMap();
    private Context applicationContext;
    private boolean coreInitialized = false;

    private Task<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> firebaseAppToMap(C3767g c3767g) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.e

            /* renamed from: i */
            public final /* synthetic */ C3767g f10800i;

            /* renamed from: j */
            public final /* synthetic */ TaskCompletionSource f10801j;

            public /* synthetic */ RunnableC2969e(C3767g c3767g2, TaskCompletionSource taskCompletionSource2) {
                r2 = c3767g2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.this.lambda$firebaseAppToMap$0(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private GeneratedAndroidFirebaseCore.PigeonFirebaseOptions firebaseOptionsToMap(C3776p c3776p) {
        GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder builder = new GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder();
        builder.setApiKey(c3776p.m14363b());
        builder.setAppId(c3776p.m14364c());
        if (c3776p.m14367f() != null) {
            builder.setMessagingSenderId(c3776p.m14367f());
        }
        if (c3776p.m14368g() != null) {
            builder.setProjectId(c3776p.m14368g());
        }
        builder.setDatabaseURL(c3776p.m14365d());
        builder.setStorageBucket(c3776p.m14369h());
        builder.setTrackingId(c3776p.m14366e());
        return builder.build();
    }

    public static /* synthetic */ void lambda$delete$7(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                C3767g.m14335p(str).m14347j();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$firebaseAppToMap$0(C3767g c3767g, TaskCompletionSource taskCompletionSource) {
        try {
            GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder builder = new GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder();
            builder.setName(c3767g.m14350q());
            builder.setOptions(firebaseOptionsToMap(c3767g.m14351r()));
            builder.setIsAutomaticDataCollectionEnabled(Boolean.valueOf(c3767g.m14354x()));
            builder.setPluginConstants((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(c3767g)));
            taskCompletionSource.setResult(builder.build());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$initializeApp$2(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, String str, TaskCompletionSource taskCompletionSource) {
        try {
            C3776p m14370a = new C3776p.b().m14371b(pigeonFirebaseOptions.getApiKey()).m14372c(pigeonFirebaseOptions.getAppId()).m14373d(pigeonFirebaseOptions.getDatabaseURL()).m14375f(pigeonFirebaseOptions.getMessagingSenderId()).m14376g(pigeonFirebaseOptions.getProjectId()).m14377h(pigeonFirebaseOptions.getStorageBucket()).m14374e(pigeonFirebaseOptions.getTrackingId()).m14370a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (pigeonFirebaseOptions.getAuthDomain() != null) {
                customAuthDomain.put(str, pigeonFirebaseOptions.getAuthDomain());
            }
            taskCompletionSource.setResult((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) Tasks.await(firebaseAppToMap(C3767g.m14338w(this.applicationContext, m14370a, str))));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$initializeCore$3(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.coreInitialized) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.coreInitialized = true;
            }
            List<C3767g> m14333n = C3767g.m14333n(this.applicationContext);
            ArrayList arrayList = new ArrayList(m14333n.size());
            Iterator<C3767g> it = m14333n.iterator();
            while (it.hasNext()) {
                arrayList.add((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) Tasks.await(firebaseAppToMap(it.next())));
            }
            taskCompletionSource.setResult(arrayList);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$listenToResponse$1(GeneratedAndroidFirebaseCore.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            result.error(task.getException());
        }
    }

    public /* synthetic */ void lambda$optionsFromResource$4(TaskCompletionSource taskCompletionSource) {
        try {
            C3776p m14362a = C3776p.m14362a(this.applicationContext);
            if (m14362a == null) {
                taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                taskCompletionSource.setResult(firebaseOptionsToMap(m14362a));
            }
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$setAutomaticDataCollectionEnabled$5(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            C3767g.m14335p(str).m14343F(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$setAutomaticResourceManagementEnabled$6(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            C3767g.m14335p(str).m14342E(bool.booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private <T> void listenToResponse(TaskCompletionSource<T> taskCompletionSource, GeneratedAndroidFirebaseCore.Result<T> result) {
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.core.a
            public /* synthetic */ C2965a() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseCorePlugin.lambda$listenToResponse$1(GeneratedAndroidFirebaseCore.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void delete(String str, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f

            /* renamed from: h */
            public final /* synthetic */ String f10802h;

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10803i;

            public /* synthetic */ RunnableC2970f(String str2, TaskCompletionSource taskCompletionSource2) {
                r1 = str2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.lambda$delete$7(r1, r2);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeApp(String str, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d

            /* renamed from: i */
            public final /* synthetic */ GeneratedAndroidFirebaseCore.PigeonFirebaseOptions f10796i;

            /* renamed from: j */
            public final /* synthetic */ String f10797j;

            /* renamed from: k */
            public final /* synthetic */ TaskCompletionSource f10798k;

            public /* synthetic */ RunnableC2968d(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions2, String str2, TaskCompletionSource taskCompletionSource2) {
                r2 = pigeonFirebaseOptions2;
                r3 = str2;
                r4 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.this.lambda$initializeApp$2(r2, r3, r4);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.b

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10792i;

            public /* synthetic */ RunnableC2966b(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.this.lambda$initializeCore$3(r2);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.setup(flutterPluginBinding.getBinaryMessenger(), this);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.setup(flutterPluginBinding.getBinaryMessenger(), this);
        this.applicationContext = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = null;
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.setup(flutterPluginBinding.getBinaryMessenger(), null);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.setup(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonFirebaseOptions> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10794i;

            public /* synthetic */ RunnableC2967c(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.this.lambda$optionsFromResource$4(r2);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.g

            /* renamed from: h */
            public final /* synthetic */ String f10804h;

            /* renamed from: i */
            public final /* synthetic */ Boolean f10805i;

            /* renamed from: j */
            public final /* synthetic */ TaskCompletionSource f10806j;

            public /* synthetic */ RunnableC2971g(String str2, Boolean bool2, TaskCompletionSource taskCompletionSource2) {
                r1 = str2;
                r2 = bool2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.lambda$setAutomaticDataCollectionEnabled$5(r1, r2, r3);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticResourceManagementEnabled(String str, Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.h

            /* renamed from: h */
            public final /* synthetic */ String f10807h;

            /* renamed from: i */
            public final /* synthetic */ Boolean f10808i;

            /* renamed from: j */
            public final /* synthetic */ TaskCompletionSource f10809j;

            public /* synthetic */ RunnableC2972h(String str2, Boolean bool2, TaskCompletionSource taskCompletionSource2) {
                r1 = str2;
                r2 = bool2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.lambda$setAutomaticResourceManagementEnabled$6(r1, r2, r3);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }
}
