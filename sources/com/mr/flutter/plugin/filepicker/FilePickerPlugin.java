package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0354k;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FilePickerPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: p */
    public static String f5310p = null;

    /* renamed from: q */
    public static boolean f5311q = false;

    /* renamed from: r */
    public static boolean f5312r = false;

    /* renamed from: s */
    public static int f5313s;

    /* renamed from: h */
    public ActivityPluginBinding f5314h;

    /* renamed from: i */
    public C1397b f5315i;

    /* renamed from: j */
    public Application f5316j;

    /* renamed from: k */
    public FlutterPlugin.FlutterPluginBinding f5317k;

    /* renamed from: l */
    public AbstractC0344f f5318l;

    /* renamed from: m */
    public LifeCycleObserver f5319m;

    /* renamed from: n */
    public Activity f5320n;

    /* renamed from: o */
    public MethodChannel f5321o;

    /* loaded from: classes.dex */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: h */
        public final Activity f5322h;

        public LifeCycleObserver(Activity activity) {
            this.f5322h = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f5322h != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC0354k interfaceC0354k) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC0354k interfaceC0354k) {
            onActivityDestroyed(this.f5322h);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(InterfaceC0354k interfaceC0354k) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC0354k interfaceC0354k) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC0354k interfaceC0354k) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC0354k interfaceC0354k) {
            onActivityStopped(this.f5322h);
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$a */
    /* loaded from: classes.dex */
    public class C1394a implements EventChannel.StreamHandler {
        public C1394a() {
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            FilePickerPlugin.this.f5315i.m5983p(null);
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            FilePickerPlugin.this.f5315i.m5983p(eventSink);
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$b */
    /* loaded from: classes.dex */
    public static class C1395b implements MethodChannel.Result {

        /* renamed from: a */
        public final MethodChannel.Result f5325a;

        /* renamed from: b */
        public final Handler f5326b = new Handler(Looper.getMainLooper());

        /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ Object f5327h;

            public a(Object obj) {
                this.f5327h = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1395b.this.f5325a.success(this.f5327h);
            }
        }

        /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$b$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ String f5329h;

            /* renamed from: i */
            public final /* synthetic */ String f5330i;

            /* renamed from: j */
            public final /* synthetic */ Object f5331j;

            public b(String str, String str2, Object obj) {
                this.f5329h = str;
                this.f5330i = str2;
                this.f5331j = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1395b.this.f5325a.error(this.f5329h, this.f5330i, this.f5331j);
            }
        }

        /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$b$c */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1395b.this.f5325a.notImplemented();
            }
        }

        public C1395b(MethodChannel.Result result) {
            this.f5325a = result;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            this.f5326b.post(new b(str, str2, obj));
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            this.f5326b.post(new c());
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            this.f5326b.post(new a(obj));
        }
    }

    /* renamed from: b */
    public static String m5957b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    c10 = 0;
                    break;
                }
                break;
            case 96748:
                if (str.equals("any")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99469:
                if (str.equals("dir")) {
                    c10 = 2;
                    break;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c10 = 4;
                    break;
                }
                break;
            case 103772132:
                if (str.equals("media")) {
                    c10 = 5;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return "*/*";
            case 2:
                return "dir";
            case 3:
                return "audio/*";
            case 4:
                return "image/*";
            case 5:
                return "image/*,video/*";
            case 6:
                return "video/*";
            default:
                return null;
        }
    }

    /* renamed from: c */
    public final void m5958c(BinaryMessenger binaryMessenger, Application application, Activity activity, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        this.f5320n = activity;
        this.f5316j = application;
        this.f5315i = new C1397b(activity);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepicker");
        this.f5321o = methodChannel;
        methodChannel.setMethodCallHandler(this);
        new EventChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepickerevent").setStreamHandler(new C1394a());
        LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(activity);
        this.f5319m = lifeCycleObserver;
        if (registrar != null) {
            application.registerActivityLifecycleCallbacks(lifeCycleObserver);
            registrar.addActivityResultListener(this.f5315i);
            registrar.addRequestPermissionsResultListener(this.f5315i);
        } else {
            activityPluginBinding.addActivityResultListener(this.f5315i);
            activityPluginBinding.addRequestPermissionsResultListener(this.f5315i);
            AbstractC0344f activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
            this.f5318l = activityLifecycle;
            activityLifecycle.mo1800a(this.f5319m);
        }
    }

    /* renamed from: d */
    public final void m5959d() {
        this.f5314h.removeActivityResultListener(this.f5315i);
        this.f5314h.removeRequestPermissionsResultListener(this.f5315i);
        this.f5314h = null;
        LifeCycleObserver lifeCycleObserver = this.f5319m;
        if (lifeCycleObserver != null) {
            this.f5318l.mo1802c(lifeCycleObserver);
            this.f5316j.unregisterActivityLifecycleCallbacks(this.f5319m);
        }
        this.f5318l = null;
        this.f5315i.m5983p(null);
        this.f5315i = null;
        this.f5321o.setMethodCallHandler(null);
        this.f5321o = null;
        this.f5316j = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f5314h = activityPluginBinding;
        m5958c(this.f5317k.getBinaryMessenger(), (Application) this.f5317k.getApplicationContext(), this.f5314h.getActivity(), null, this.f5314h);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f5317k = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m5959d();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f5317k = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String[] m5994h;
        String str;
        if (this.f5320n == null) {
            result.error("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        C1395b c1395b = new C1395b(result);
        HashMap hashMap = (HashMap) methodCall.arguments;
        String str2 = methodCall.method;
        if (str2 != null && str2.equals("clear")) {
            c1395b.success(Boolean.valueOf(C1398c.m5987a(this.f5320n.getApplicationContext())));
            return;
        }
        String str3 = methodCall.method;
        if (str3 != null && str3.equals("save")) {
            this.f5315i.m5982o((String) hashMap.get("fileName"), m5957b((String) hashMap.get("fileType")), (String) hashMap.get("initialDirectory"), C1398c.m5994h((ArrayList) hashMap.get("allowedExtensions")), (byte[]) hashMap.get("bytes"), c1395b);
            return;
        }
        String m5957b = m5957b(methodCall.method);
        f5310p = m5957b;
        if (m5957b == null) {
            c1395b.notImplemented();
        } else if (m5957b != "dir") {
            f5311q = ((Boolean) hashMap.get("allowMultipleSelection")).booleanValue();
            f5312r = ((Boolean) hashMap.get("withData")).booleanValue();
            f5313s = ((Integer) hashMap.get("compressionQuality")).intValue();
            m5994h = C1398c.m5994h((ArrayList) hashMap.get("allowedExtensions"));
            str = methodCall.method;
            if (str == null && str.equals("custom") && (m5994h == null || m5994h.length == 0)) {
                c1395b.error("FilePicker", "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.any instead.", null);
                return;
            } else {
                this.f5315i.m5986s(f5310p, f5311q, f5312r, m5994h, f5313s, c1395b);
            }
        }
        m5994h = null;
        str = methodCall.method;
        if (str == null) {
        }
        this.f5315i.m5986s(f5310p, f5311q, f5312r, m5994h, f5313s, c1395b);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
