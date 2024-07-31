package io.flutter.plugins.firebase.storage;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.auth.Constants;
import io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.HashMap;
import java.util.Map;
import p226p9.AbstractC4073e0;
import p226p9.C4074f;
import p226p9.InterfaceC4086l;
import p226p9.InterfaceC4088m;

/* loaded from: classes2.dex */
public class TaskStateChannelStreamHandler implements EventChannel.StreamHandler {
    private final C4074f androidStorage;
    private final AbstractC4073e0<?> androidTask;
    private final FlutterFirebaseStorageTask flutterTask;
    private final String TASK_STATE_NAME = "taskState";
    private final String TASK_APP_NAME = Constants.APP_NAME;
    private final String TASK_SNAPSHOT = "snapshot";
    private final String TASK_ERROR = ImagePickerCache.MAP_KEY_ERROR;

    public TaskStateChannelStreamHandler(FlutterFirebaseStorageTask flutterFirebaseStorageTask, C4074f c4074f, AbstractC4073e0 abstractC4073e0) {
        this.flutterTask = flutterFirebaseStorageTask;
        this.androidStorage = c4074f;
        this.androidTask = abstractC4073e0;
    }

    private Map<String, Object> getTaskEventMap(Object obj, Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.APP_NAME, this.androidStorage.m15697a().m14350q());
        if (obj != null) {
            hashMap.put("snapshot", FlutterFirebaseStorageTask.parseTaskSnapshot(obj));
        }
        if (exc != null) {
            hashMap.put(ImagePickerCache.MAP_KEY_ERROR, FlutterFirebaseStoragePlugin.getExceptionDetails(exc));
        }
        return hashMap;
    }

    public /* synthetic */ void lambda$onListen$0(EventChannel.EventSink eventSink, AbstractC4073e0.a aVar) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(aVar, null);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.RUNNING.index));
        eventSink.success(taskEventMap);
        this.flutterTask.notifyResumeObjects();
    }

    public /* synthetic */ void lambda$onListen$1(EventChannel.EventSink eventSink, AbstractC4073e0.a aVar) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(aVar, null);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.PAUSED.index));
        eventSink.success(taskEventMap);
        this.flutterTask.notifyPauseObjects();
    }

    public /* synthetic */ void lambda$onListen$2(EventChannel.EventSink eventSink, AbstractC4073e0.a aVar) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(aVar, null);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.SUCCESS.index));
        eventSink.success(taskEventMap);
        this.flutterTask.destroy();
    }

    public /* synthetic */ void lambda$onListen$3(EventChannel.EventSink eventSink) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(null, null);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.ERROR.index));
        HashMap hashMap = new HashMap();
        hashMap.put("code", FlutterFirebaseStorageException.getCode(-13040));
        hashMap.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, FlutterFirebaseStorageException.getMessage(-13040));
        taskEventMap.put(ImagePickerCache.MAP_KEY_ERROR, hashMap);
        eventSink.success(taskEventMap);
        this.flutterTask.notifyCancelObjects();
        this.flutterTask.destroy();
    }

    public /* synthetic */ void lambda$onListen$4(EventChannel.EventSink eventSink, Exception exc) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(null, exc);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.ERROR.index));
        eventSink.success(taskEventMap);
        this.flutterTask.destroy();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        if (!this.androidTask.isCanceled()) {
            this.androidTask.m15688w();
        }
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        this.flutterTask.destroy();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.androidTask.m15684s(new InterfaceC4088m() { // from class: io.flutter.plugins.firebase.storage.h0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f10908b;

            public /* synthetic */ C3059h0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // p226p9.InterfaceC4088m
            /* renamed from: a */
            public final void mo11261a(Object obj2) {
                TaskStateChannelStreamHandler.this.lambda$onListen$0(r2, (AbstractC4073e0.a) obj2);
            }
        });
        this.androidTask.m15683r(new InterfaceC4086l() { // from class: io.flutter.plugins.firebase.storage.g0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f10905b;

            public /* synthetic */ C3057g0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // p226p9.InterfaceC4086l
            /* renamed from: a */
            public final void mo11260a(Object obj2) {
                TaskStateChannelStreamHandler.this.lambda$onListen$1(r2, (AbstractC4073e0.a) obj2);
            }
        });
        this.androidTask.addOnSuccessListener(new OnSuccessListener() { // from class: io.flutter.plugins.firebase.storage.f0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f10902b;

            public /* synthetic */ C3055f0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                TaskStateChannelStreamHandler.this.lambda$onListen$2(r2, (AbstractC4073e0.a) obj2);
            }
        });
        this.androidTask.addOnCanceledListener(new OnCanceledListener() { // from class: io.flutter.plugins.firebase.storage.d0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f10896b;

            public /* synthetic */ C3051d0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                TaskStateChannelStreamHandler.this.lambda$onListen$3(r2);
            }
        });
        this.androidTask.addOnFailureListener(new OnFailureListener() { // from class: io.flutter.plugins.firebase.storage.e0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f10899b;

            public /* synthetic */ C3053e0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                TaskStateChannelStreamHandler.this.lambda$onListen$4(r2, exc);
            }
        });
    }
}
