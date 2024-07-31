package io.flutter.plugins.firebase.storage;

import android.net.Uri;
import android.util.SparseArray;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p226p9.AbstractC4073e0;
import p226p9.C4072e;
import p226p9.C4091n0;
import p226p9.C4092o;
import p226p9.C4093p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class FlutterFirebaseStorageTask {
    public static final SparseArray<FlutterFirebaseStorageTask> inProgressTasks = new SparseArray<>();
    private final byte[] bytes;
    private final Uri fileUri;
    private final int handle;
    private final C4092o metadata;
    private final C4093p reference;
    private AbstractC4073e0<?> storageTask;
    private final FlutterFirebaseStorageTaskType type;
    private final Object pauseSyncObject = new Object();
    private final Object resumeSyncObject = new Object();
    private final Object cancelSyncObject = new Object();
    private Boolean destroyed = Boolean.FALSE;

    /* loaded from: classes2.dex */
    public enum FlutterFirebaseStorageTaskType {
        FILE,
        BYTES,
        DOWNLOAD
    }

    private FlutterFirebaseStorageTask(FlutterFirebaseStorageTaskType flutterFirebaseStorageTaskType, int i10, C4093p c4093p, byte[] bArr, Uri uri, C4092o c4092o) {
        this.type = flutterFirebaseStorageTaskType;
        this.handle = i10;
        this.reference = c4093p;
        this.bytes = bArr;
        this.fileUri = uri;
        this.metadata = c4092o;
        SparseArray<FlutterFirebaseStorageTask> sparseArray = inProgressTasks;
        synchronized (sparseArray) {
            sparseArray.put(i10, this);
        }
    }

    public static void cancelInProgressTasks() {
        synchronized (inProgressTasks) {
            int i10 = 0;
            while (true) {
                SparseArray<FlutterFirebaseStorageTask> sparseArray = inProgressTasks;
                if (i10 < sparseArray.size()) {
                    FlutterFirebaseStorageTask valueAt = sparseArray.valueAt(i10);
                    if (valueAt != null) {
                        valueAt.destroy();
                    }
                    i10++;
                } else {
                    sparseArray.clear();
                }
            }
        }
    }

    public static FlutterFirebaseStorageTask downloadFile(int i10, C4093p c4093p, File file) {
        return new FlutterFirebaseStorageTask(FlutterFirebaseStorageTaskType.DOWNLOAD, i10, c4093p, null, Uri.fromFile(file), null);
    }

    public static FlutterFirebaseStorageTask getInProgressTaskForHandle(int i10) {
        FlutterFirebaseStorageTask flutterFirebaseStorageTask;
        SparseArray<FlutterFirebaseStorageTask> sparseArray = inProgressTasks;
        synchronized (sparseArray) {
            flutterFirebaseStorageTask = sparseArray.get(i10);
        }
        return flutterFirebaseStorageTask;
    }

    public static Map<String, Object> parseDownloadTaskSnapshot(C4072e.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", aVar.m15693b().m15843s());
        hashMap.put("bytesTransferred", Long.valueOf(aVar.m15694c().isSuccessful() ? aVar.m15633e() : aVar.m15632d()));
        hashMap.put("totalBytes", Long.valueOf(aVar.m15633e()));
        return hashMap;
    }

    public static Map<String, Object> parseTaskSnapshot(Object obj) {
        return obj instanceof C4072e.a ? parseDownloadTaskSnapshot((C4072e.a) obj) : parseUploadTaskSnapshot((C4091n0.b) obj);
    }

    public static Map<String, Object> parseUploadTaskSnapshot(C4091n0.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", bVar.m15693b().m15843s());
        hashMap.put("bytesTransferred", Long.valueOf(bVar.m15777d()));
        hashMap.put("totalBytes", Long.valueOf(bVar.m15779f()));
        if (bVar.m15778e() != null) {
            hashMap.put("metadata", FlutterFirebaseStoragePlugin.parseMetadataToMap(bVar.m15778e()));
        }
        return hashMap;
    }

    public static FlutterFirebaseStorageTask uploadBytes(int i10, C4093p c4093p, byte[] bArr, C4092o c4092o) {
        return new FlutterFirebaseStorageTask(FlutterFirebaseStorageTaskType.BYTES, i10, c4093p, bArr, null, c4092o);
    }

    public static FlutterFirebaseStorageTask uploadFile(int i10, C4093p c4093p, Uri uri, C4092o c4092o) {
        return new FlutterFirebaseStorageTask(FlutterFirebaseStorageTaskType.FILE, i10, c4093p, null, uri, c4092o);
    }

    public void destroy() {
        if (this.destroyed.booleanValue()) {
            return;
        }
        this.destroyed = Boolean.TRUE;
        SparseArray<FlutterFirebaseStorageTask> sparseArray = inProgressTasks;
        synchronized (sparseArray) {
            if (this.storageTask.m15659K() || this.storageTask.m15660L()) {
                this.storageTask.m15688w();
            }
            sparseArray.remove(this.handle);
        }
        synchronized (this.cancelSyncObject) {
            this.cancelSyncObject.notifyAll();
        }
        synchronized (this.pauseSyncObject) {
            this.pauseSyncObject.notifyAll();
        }
        synchronized (this.resumeSyncObject) {
            this.resumeSyncObject.notifyAll();
        }
    }

    public AbstractC4073e0<?> getAndroidTask() {
        return this.storageTask;
    }

    public Object getSnapshot() {
        return this.storageTask.m15655F();
    }

    public boolean isDestroyed() {
        return this.destroyed.booleanValue();
    }

    public void notifyCancelObjects() {
        synchronized (this.cancelSyncObject) {
            this.cancelSyncObject.notifyAll();
        }
    }

    public void notifyPauseObjects() {
        synchronized (this.pauseSyncObject) {
            this.pauseSyncObject.notifyAll();
        }
    }

    public void notifyResumeObjects() {
        synchronized (this.resumeSyncObject) {
            this.resumeSyncObject.notifyAll();
        }
    }

    public TaskStateChannelStreamHandler startTaskWithMethodChannel(MethodChannel methodChannel) {
        Uri uri;
        AbstractC4073e0<?> m15839o;
        Uri uri2;
        byte[] bArr;
        FlutterFirebaseStorageTaskType flutterFirebaseStorageTaskType = this.type;
        if (flutterFirebaseStorageTaskType == FlutterFirebaseStorageTaskType.BYTES && (bArr = this.bytes) != null) {
            C4092o c4092o = this.metadata;
            m15839o = c4092o == null ? this.reference.m15827A(bArr) : this.reference.m15828B(bArr, c4092o);
        } else if (flutterFirebaseStorageTaskType == FlutterFirebaseStorageTaskType.FILE && (uri2 = this.fileUri) != null) {
            C4092o c4092o2 = this.metadata;
            m15839o = c4092o2 == null ? this.reference.m15829C(uri2) : this.reference.m15830D(uri2, c4092o2);
        } else {
            if (flutterFirebaseStorageTaskType != FlutterFirebaseStorageTaskType.DOWNLOAD || (uri = this.fileUri) == null) {
                throw new Exception("Unable to start task. Some arguments have no been initialized.");
            }
            m15839o = this.reference.m15839o(uri);
        }
        this.storageTask = m15839o;
        return new TaskStateChannelStreamHandler(this, this.reference.m15845u(), this.storageTask);
    }
}
