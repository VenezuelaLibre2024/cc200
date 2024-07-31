package p186mb;

import ae.C0107m;
import ae.C0108n;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import gd.C2236j;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
import p115hd.C2497j;
import p115hd.C2501m;
import p115hd.C2502n;
import p243qd.C4236c;
import td.C4747g;
import td.C4753m;

/* renamed from: mb.b */
/* loaded from: classes.dex */
public final class C3608b implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, PluginRegistry.NewIntentListener {

    /* renamed from: h */
    public JSONArray f12725h;

    /* renamed from: i */
    public JSONArray f12726i;

    /* renamed from: j */
    public EventChannel.EventSink f12727j;

    /* renamed from: k */
    public ActivityPluginBinding f12728k;

    /* renamed from: l */
    public Context f12729l;

    /* renamed from: mb.b$a */
    /* loaded from: classes.dex */
    public enum a {
        IMAGE("image"),
        VIDEO("video"),
        TEXT("text"),
        FILE(Constants.FILE),
        URL(WebViewActivity.URL_EXTRA);


        /* renamed from: i */
        public static final C6197a f12730i = new C6197a(null);

        /* renamed from: h */
        public final String f12737h;

        /* renamed from: mb.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6197a {
            public C6197a() {
            }

            public /* synthetic */ C6197a(C4747g c4747g) {
                this();
            }

            /* renamed from: a */
            public final a m13355a(String str) {
                if (str != null && C0108n.m433s(str, "image", false, 2, null)) {
                    return a.IMAGE;
                }
                if (str != null && C0108n.m433s(str, "video", false, 2, null)) {
                    return a.VIDEO;
                }
                return str != null && C0108n.m433s(str, "text", false, 2, null) ? a.TEXT : a.FILE;
            }
        }

        a(String str) {
            this.f12737h = str;
        }

        /* renamed from: c */
        public final String m13354c() {
            return this.f12737h;
        }
    }

    /* renamed from: a */
    public final JSONArray m13348a(Intent intent) {
        String action;
        Parcelable parcelable;
        JSONObject m13352e;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        int hashCode = action.hashCode();
        if (hashCode == -1173264947) {
            if (!action.equals("android.intent.action.SEND")) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
                if (!(parcelableExtra instanceof Uri)) {
                    parcelableExtra = null;
                }
                parcelable = (Uri) parcelableExtra;
            }
            JSONObject m13352e2 = m13352e((Uri) parcelable, intent.getStringExtra("android.intent.extra.TEXT"), intent.getType());
            if (m13352e2 != null) {
                return new JSONArray((Collection) C2501m.m9986b(m13352e2));
            }
            return null;
        }
        if (hashCode == -1173171990) {
            if (action.equals("android.intent.action.VIEW") && (m13352e = m13352e(intent.getData(), null, intent.getType())) != null) {
                return new JSONArray((Collection) C2501m.m9986b(m13352e));
            }
            return null;
        }
        if (hashCode != -58484670 || !action.equals("android.intent.action.SEND_MULTIPLE")) {
            return null;
        }
        ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.MIME_TYPES");
        if (parcelableArrayListExtra == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : parcelableArrayListExtra) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C2502n.m9994j();
            }
            JSONObject m13352e3 = m13352e((Uri) obj, null, stringArrayExtra != null ? (String) C2497j.m9969n(stringArrayExtra, i10) : null);
            if (m13352e3 != null) {
                arrayList.add(m13352e3);
            }
            i10 = i11;
        }
        return new JSONArray((Collection) arrayList);
    }

    /* renamed from: b */
    public final C2236j<String, Long> m13349b(String str, a aVar) {
        if (aVar != a.VIDEO) {
            return new C2236j<>(null, null);
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        Long m422h = extractMetadata != null ? C0107m.m422h(extractMetadata) : null;
        Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(-1L, 2, 360, 360);
        mediaMetadataRetriever.release();
        if (scaledFrameAtTime == null) {
            return new C2236j<>(null, null);
        }
        Context context = this.f12729l;
        if (context == null) {
            C4753m.m18667t("applicationContext");
            context = null;
        }
        File file = new File(context.getCacheDir(), new File(str).getName() + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            scaledFrameAtTime.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            C4236c.m16274a(fileOutputStream, null);
            scaledFrameAtTime.recycle();
            return new C2236j<>(file.getPath(), m422h);
        } finally {
        }
    }

    /* renamed from: c */
    public final void m13350c(Intent intent, boolean z10) {
        if (intent.getType() != null && (C4753m.m18648a(intent.getAction(), "android.intent.action.VIEW") || C4753m.m18648a(intent.getAction(), "android.intent.action.SEND") || C4753m.m18648a(intent.getAction(), "android.intent.action.SEND_MULTIPLE"))) {
            JSONArray m13348a = m13348a(intent);
            if (z10) {
                this.f12725h = m13348a;
            }
            this.f12726i = m13348a;
            EventChannel.EventSink eventSink = this.f12727j;
            if (eventSink != null) {
                eventSink.success(m13348a != null ? m13348a.toString() : null);
                return;
            }
            return;
        }
        if (C4753m.m18648a(intent.getAction(), "android.intent.action.VIEW")) {
            JSONArray jSONArray = new JSONArray((Collection) C2501m.m9986b(new JSONObject().put("path", intent.getDataString()).put(ImagePickerCache.MAP_KEY_TYPE, a.URL.m13354c())));
            if (z10) {
                this.f12725h = jSONArray;
            }
            this.f12726i = jSONArray;
            EventChannel.EventSink eventSink2 = this.f12727j;
            if (eventSink2 != null) {
                eventSink2.success(jSONArray.toString());
            }
        }
    }

    /* renamed from: d */
    public final void m13351d(BinaryMessenger binaryMessenger) {
        new MethodChannel(binaryMessenger, "receive_sharing_intent/messages").setMethodCallHandler(this);
        new EventChannel(binaryMessenger, "receive_sharing_intent/events-media").setStreamHandler(this);
        new EventChannel(binaryMessenger, "receive_sharing_intent/events-text").setStreamHandler(this);
    }

    /* renamed from: e */
    public final JSONObject m13352e(Uri uri, String str, String str2) {
        String str3;
        C2236j<String, Long> c2236j;
        if (uri != null) {
            C3607a c3607a = C3607a.f12724a;
            Context context = this.f12729l;
            if (context == null) {
                C4753m.m18667t("applicationContext");
                context = null;
            }
            str3 = c3607a.m13343a(context, uri);
        } else {
            str3 = null;
        }
        if (str2 == null) {
            str2 = str3 != null ? URLConnection.guessContentTypeFromName(str3) : null;
        }
        a m13355a = a.f12730i.m13355a(str2);
        if (str3 == null || (c2236j = m13349b(str3, m13355a)) == null) {
            c2236j = new C2236j<>(null, null);
        }
        String m8961a = c2236j.m8961a();
        Long m8962b = c2236j.m8962b();
        JSONObject jSONObject = new JSONObject();
        if (str3 != null) {
            str = str3;
        }
        return jSONObject.put("path", str).put(ImagePickerCache.MAP_KEY_TYPE, m13355a.m13354c()).put("mimeType", str2).put("thumbnail", m8961a).put("duration", m8962b);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C4753m.m18653f(activityPluginBinding, "binding");
        this.f12728k = activityPluginBinding;
        activityPluginBinding.addOnNewIntentListener(this);
        Intent intent = activityPluginBinding.getActivity().getIntent();
        C4753m.m18652e(intent, "binding.activity.intent");
        m13350c(intent, true);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C4753m.m18652e(applicationContext, "binding.applicationContext");
        this.f12729l = applicationContext;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C4753m.m18652e(binaryMessenger, "binding.binaryMessenger");
        m13351d(binaryMessenger);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f12727j = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f12728k;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        ActivityPluginBinding activityPluginBinding = this.f12728k;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        C4753m.m18653f(eventSink, "events");
        this.f12727j = eventSink;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "result");
        String str = methodCall.method;
        String str2 = null;
        if (C4753m.m18648a(str, "getInitialMedia")) {
            JSONArray jSONArray = this.f12725h;
            if (jSONArray != null) {
                str2 = jSONArray.toString();
            }
        } else if (!C4753m.m18648a(str, "reset")) {
            result.notImplemented();
            return;
        } else {
            this.f12725h = null;
            this.f12726i = null;
        }
        result.success(str2);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        C4753m.m18653f(intent, "intent");
        m13350c(intent, false);
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C4753m.m18653f(activityPluginBinding, "binding");
        this.f12728k = activityPluginBinding;
        activityPluginBinding.addOnNewIntentListener(this);
    }
}
