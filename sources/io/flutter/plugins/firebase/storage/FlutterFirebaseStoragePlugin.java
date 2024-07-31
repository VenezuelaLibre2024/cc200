package io.flutter.plugins.firebase.storage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p195n7.C3767g;
import p226p9.C4074f;
import p226p9.C4082j;
import p226p9.C4092o;
import p226p9.C4093p;

/* loaded from: classes2.dex */
public class FlutterFirebaseStoragePlugin implements FlutterFirebasePlugin, FlutterPlugin, GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DEFAULT_ERROR_CODE = "firebase_storage";
    public static final String STORAGE_METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_storage";
    public static final String STORAGE_TASK_EVENT_NAME = "taskEvent";
    private MethodChannel channel;
    private BinaryMessenger messenger;
    private final Map<String, EventChannel> eventChannels = new HashMap();
    private final Map<String, EventChannel.StreamHandler> streamHandlers = new HashMap();

    private GeneratedAndroidFirebaseStorage.PigeonStorageReference convertToPigeonReference(C4093p c4093p) {
        return new GeneratedAndroidFirebaseStorage.PigeonStorageReference.Builder().setBucket(c4093p.m15836l()).setFullPath(c4093p.m15843s()).setName(c4093p.m15841q()).build();
    }

    public static Map<String, String> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        GeneratedAndroidFirebaseStorage.FlutterError parserExceptionToFlutter = FlutterFirebaseStorageException.parserExceptionToFlutter(exc);
        hashMap.put("code", parserExceptionToFlutter.code);
        hashMap.put(Constants.MESSAGE, parserExceptionToFlutter.getMessage());
        return hashMap;
    }

    private C4093p getReferenceFromPigeon(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference) {
        return getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(pigeonStorageReference.getFullPath());
    }

    private C4074f getStorageFromPigeon(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp) {
        return C4074f.m15695f(C3767g.m14335p(pigeonStorageFirebaseApp.getAppName()), "gs://" + pigeonStorageFirebaseApp.getBucket());
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(STORAGE_METHOD_CHANNEL_NAME, this);
        this.channel = new MethodChannel(binaryMessenger, STORAGE_METHOD_CHANNEL_NAME);
        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.setup(binaryMessenger, this);
        this.messenger = binaryMessenger;
    }

    public /* synthetic */ void lambda$didReinitializeFirebaseCore$8(TaskCompletionSource taskCompletionSource) {
        FlutterFirebaseStorageTask.cancelInProgressTasks();
        taskCompletionSource.setResult(null);
        removeEventListeners();
    }

    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$7(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(new HashMap());
    }

    public static /* synthetic */ void lambda$referenceDelete$0(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$referenceGetData$2(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success((byte[]) task.getResult());
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$referenceGetDownloadURL$1(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(((Uri) task.getResult()).toString());
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$referenceGetMetaData$3(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(convertToPigeonMetaData((C4092o) task.getResult()));
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$referenceList$4(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(convertToPigeonListResult((C4082j) task.getResult()));
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$referenceListAll$5(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(convertToPigeonListResult((C4082j) task.getResult()));
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$referenceUpdateMetadata$6(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(convertToPigeonMetaData((C4092o) task.getResult()));
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static Map<String, Object> parseMetadataToMap(C4092o c4092o) {
        String m15811y;
        if (c4092o == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (c4092o.m15799D() != null) {
            hashMap.put("name", c4092o.m15799D());
        }
        if (c4092o.m15804r() != null) {
            hashMap.put("bucket", c4092o.m15804r());
        }
        if (c4092o.m15796A() != null) {
            hashMap.put("generation", c4092o.m15796A());
        }
        if (c4092o.m15798C() != null) {
            hashMap.put("metadataGeneration", c4092o.m15798C());
        }
        hashMap.put("fullPath", c4092o.m15800E());
        hashMap.put("size", Long.valueOf(c4092o.m15801F()));
        hashMap.put("creationTimeMillis", Long.valueOf(c4092o.m15810x()));
        hashMap.put("updatedTimeMillis", Long.valueOf(c4092o.m15802G()));
        if (c4092o.m15797B() != null) {
            hashMap.put("md5Hash", c4092o.m15797B());
        }
        if (c4092o.m15805s() != null) {
            hashMap.put("cacheControl", c4092o.m15805s());
        }
        if (c4092o.m15806t() != null) {
            hashMap.put("contentDisposition", c4092o.m15806t());
        }
        if (c4092o.m15807u() != null) {
            hashMap.put("contentEncoding", c4092o.m15807u());
        }
        if (c4092o.m15808v() != null) {
            hashMap.put("contentLanguage", c4092o.m15808v());
        }
        if (c4092o.m15809w() != null) {
            hashMap.put("contentType", c4092o.m15809w());
        }
        HashMap hashMap2 = new HashMap();
        for (String str : c4092o.m15812z()) {
            if (c4092o.m15811y(str) == null) {
                m15811y = "";
            } else {
                m15811y = c4092o.m15811y(str);
                Objects.requireNonNull(m15811y);
            }
            hashMap2.put(str, m15811y);
        }
        hashMap.put("customMetadata", hashMap2);
        return hashMap;
    }

    private String registerEventChannel(String str, EventChannel.StreamHandler streamHandler) {
        return registerEventChannel(str, UUID.randomUUID().toString().toLowerCase(Locale.US), streamHandler);
    }

    private String registerEventChannel(String str, String str2, EventChannel.StreamHandler streamHandler) {
        EventChannel eventChannel = new EventChannel(this.messenger, str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2);
        eventChannel.setStreamHandler(streamHandler);
        this.eventChannels.put(str2, eventChannel);
        this.streamHandlers.put(str2, streamHandler);
        return str2;
    }

    private void removeEventListeners() {
        Iterator<String> it = this.eventChannels.keySet().iterator();
        while (it.hasNext()) {
            this.eventChannels.get(it.next()).setStreamHandler(null);
        }
        this.eventChannels.clear();
        Iterator<String> it2 = this.streamHandlers.keySet().iterator();
        while (it2.hasNext()) {
            this.streamHandlers.get(it2.next()).onCancel(null);
        }
        this.streamHandlers.clear();
    }

    private byte[] stringToByteData(String str, int i10) {
        int i11;
        if (i10 == 1) {
            i11 = 0;
        } else {
            if (i10 != 2) {
                return null;
            }
            i11 = 8;
        }
        return Base64.decode(str, i11);
    }

    public GeneratedAndroidFirebaseStorage.PigeonListResult convertToPigeonListResult(C4082j c4082j) {
        ArrayList arrayList = new ArrayList();
        Iterator<C4093p> it = c4082j.m15742b().iterator();
        while (it.hasNext()) {
            arrayList.add(convertToPigeonReference(it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<C4093p> it2 = c4082j.m15744d().iterator();
        while (it2.hasNext()) {
            arrayList2.add(convertToPigeonReference(it2.next()));
        }
        return new GeneratedAndroidFirebaseStorage.PigeonListResult.Builder().setItems(arrayList).setPageToken(c4082j.m15743c()).setPrefixs(arrayList2).build();
    }

    public GeneratedAndroidFirebaseStorage.PigeonFullMetaData convertToPigeonMetaData(C4092o c4092o) {
        return new GeneratedAndroidFirebaseStorage.PigeonFullMetaData.Builder().setMetadata(parseMetadataToMap(c4092o)).build();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.storage.i

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10910i;

            public /* synthetic */ RunnableC3060i(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseStoragePlugin.this.lambda$didReinitializeFirebaseCore$8(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    public C4092o getMetaDataFromPigeon(GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata) {
        C4092o.b m15820h = new C4092o.b().m15816d(pigeonSettableMetadata.getCacheControl()).m15817e(pigeonSettableMetadata.getContentDisposition()).m15818f(pigeonSettableMetadata.getContentEncoding()).m15819g(pigeonSettableMetadata.getContentLanguage()).m15820h(pigeonSettableMetadata.getContentType());
        Map<String, String> customMetadata = pigeonSettableMetadata.getCustomMetadata();
        if (customMetadata != null) {
            for (Map.Entry<String, String> entry : customMetadata.entrySet()) {
                m15820h.m15821i(entry.getKey(), entry.getValue());
            }
        }
        return m15820h.m15813a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(C3767g c3767g) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.storage.h
            public /* synthetic */ RunnableC3058h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseStoragePlugin.lambda$getPluginConstantsForFirebaseApp$7(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void getReferencebyPath(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, String str, String str2, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonStorageReference> result) {
        result.success(convertToPigeonReference(getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(str)));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        FlutterFirebaseStorageTask.cancelInProgressTasks();
        this.channel.setMethodCallHandler(null);
        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.setup(this.messenger, null);
        this.channel = null;
        this.messenger = null;
        removeEventListeners();
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceDelete(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(pigeonStorageReference.getFullPath()).m15834h().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.g
            public /* synthetic */ C3056g() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.lambda$referenceDelete$0(GeneratedAndroidFirebaseStorage.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceDownloadFile(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, String str, Long l10, GeneratedAndroidFirebaseStorage.Result<String> result) {
        try {
            result.success(registerEventChannel("plugins.flutter.io/firebase_storage/taskEvent", FlutterFirebaseStorageTask.downloadFile(l10.intValue(), getReferenceFromPigeon(pigeonStorageFirebaseApp, pigeonStorageReference), new File(str)).startTaskWithMethodChannel(this.channel)));
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceGetData(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, Long l10, GeneratedAndroidFirebaseStorage.Result<byte[]> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(pigeonStorageReference.getFullPath()).m15837m(l10.longValue()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.f
            public /* synthetic */ C3054f() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.lambda$referenceGetData$2(GeneratedAndroidFirebaseStorage.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceGetDownloadURL(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.Result<String> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(pigeonStorageReference.getFullPath()).m15838n().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.e
            public /* synthetic */ C3052e() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.lambda$referenceGetDownloadURL$1(GeneratedAndroidFirebaseStorage.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceGetMetaData(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonFullMetaData> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(pigeonStorageReference.getFullPath()).m15840p().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.d

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseStorage.Result f10894b;

            public /* synthetic */ C3050d(GeneratedAndroidFirebaseStorage.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.this.lambda$referenceGetMetaData$3(r2, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceList(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.PigeonListOptions pigeonListOptions, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonListResult> result) {
        C4093p m15708n = getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(pigeonStorageReference.getFullPath());
        (pigeonListOptions.getPageToken() != null ? m15708n.m15848x(pigeonListOptions.getMaxResults().intValue(), pigeonListOptions.getPageToken()) : m15708n.m15847w(pigeonListOptions.getMaxResults().intValue())).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.c

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseStorage.Result f10891b;

            public /* synthetic */ C3048c(GeneratedAndroidFirebaseStorage.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.this.lambda$referenceList$4(r2, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceListAll(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonListResult> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(pigeonStorageReference.getFullPath()).m15849y().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.a

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseStorage.Result f10885b;

            public /* synthetic */ C3044a(GeneratedAndroidFirebaseStorage.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.this.lambda$referenceListAll$5(r2, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referencePutData(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, byte[] bArr, GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata, Long l10, GeneratedAndroidFirebaseStorage.Result<String> result) {
        try {
            result.success(registerEventChannel("plugins.flutter.io/firebase_storage/taskEvent", FlutterFirebaseStorageTask.uploadBytes(l10.intValue(), getReferenceFromPigeon(pigeonStorageFirebaseApp, pigeonStorageReference), bArr, getMetaDataFromPigeon(pigeonSettableMetadata)).startTaskWithMethodChannel(this.channel)));
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referencePutFile(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, String str, GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata, Long l10, GeneratedAndroidFirebaseStorage.Result<String> result) {
        try {
            result.success(registerEventChannel("plugins.flutter.io/firebase_storage/taskEvent", FlutterFirebaseStorageTask.uploadFile(l10.intValue(), getReferenceFromPigeon(pigeonStorageFirebaseApp, pigeonStorageReference), Uri.fromFile(new File(str)), getMetaDataFromPigeon(pigeonSettableMetadata)).startTaskWithMethodChannel(this.channel)));
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referencePutString(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, String str, Long l10, GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata, Long l11, GeneratedAndroidFirebaseStorage.Result<String> result) {
        try {
            result.success(registerEventChannel("plugins.flutter.io/firebase_storage/taskEvent", FlutterFirebaseStorageTask.uploadBytes(l11.intValue(), getReferenceFromPigeon(pigeonStorageFirebaseApp, pigeonStorageReference), stringToByteData(str, l10.intValue()), getMetaDataFromPigeon(pigeonSettableMetadata)).startTaskWithMethodChannel(this.channel)));
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceUpdateMetadata(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonFullMetaData> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15708n(pigeonStorageReference.getFullPath()).m15831E(getMetaDataFromPigeon(pigeonSettableMetadata)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.b

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseStorage.Result f10888b;

            public /* synthetic */ C3046b(GeneratedAndroidFirebaseStorage.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.this.lambda$referenceUpdateMetadata$6(r2, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void setMaxDownloadRetryTime(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15709o(l10.longValue());
        result.success(null);
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void setMaxOperationRetryTime(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15710p(l10.longValue());
        result.success(null);
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void setMaxUploadRetryTime(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).m15711q(l10.longValue());
        result.success(null);
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void taskCancel(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Map<String, Object>> result) {
        FlutterFirebaseStorageTask inProgressTaskForHandle = FlutterFirebaseStorageTask.getInProgressTaskForHandle(l10.intValue());
        if (inProgressTaskForHandle == null) {
            result.error(new GeneratedAndroidFirebaseStorage.FlutterError("unknown", "Cancel operation was called on a task which does not exist.", null));
            return;
        }
        try {
            boolean m15688w = inProgressTaskForHandle.getAndroidTask().m15688w();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(m15688w));
            if (m15688w) {
                hashMap.put("snapshot", FlutterFirebaseStorageTask.parseTaskSnapshot(inProgressTaskForHandle.getSnapshot()));
            }
            result.success(hashMap);
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void taskPause(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Map<String, Object>> result) {
        FlutterFirebaseStorageTask inProgressTaskForHandle = FlutterFirebaseStorageTask.getInProgressTaskForHandle(l10.intValue());
        if (inProgressTaskForHandle == null) {
            result.error(new GeneratedAndroidFirebaseStorage.FlutterError("unknown", "Pause operation was called on a task which does not exist.", null));
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            boolean mo15666a0 = inProgressTaskForHandle.getAndroidTask().mo15666a0();
            hashMap.put("status", Boolean.valueOf(mo15666a0));
            if (mo15666a0) {
                hashMap.put("snapshot", FlutterFirebaseStorageTask.parseTaskSnapshot(inProgressTaskForHandle.getSnapshot()));
            }
            result.success(hashMap);
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void taskResume(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Map<String, Object>> result) {
        FlutterFirebaseStorageTask inProgressTaskForHandle = FlutterFirebaseStorageTask.getInProgressTaskForHandle(l10.intValue());
        if (inProgressTaskForHandle == null) {
            result.error(new GeneratedAndroidFirebaseStorage.FlutterError("unknown", "Resume operation was called on a task which does not exist.", null));
            return;
        }
        try {
            boolean mo15669d0 = inProgressTaskForHandle.getAndroidTask().mo15669d0();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(mo15669d0));
            if (mo15669d0) {
                hashMap.put("snapshot", FlutterFirebaseStorageTask.parseTaskSnapshot(inProgressTaskForHandle.getSnapshot()));
            }
            result.success(hashMap);
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void useStorageEmulator(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, String str, Long l10, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        try {
            getStorageFromPigeon(pigeonStorageFirebaseApp).m15712r(str, l10.intValue());
            result.success(null);
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }
}
