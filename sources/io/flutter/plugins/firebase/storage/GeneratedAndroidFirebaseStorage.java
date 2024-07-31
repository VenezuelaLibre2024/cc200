package io.flutter.plugins.firebase.storage;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class GeneratedAndroidFirebaseStorage {

    /* loaded from: classes2.dex */
    public interface FirebaseStorageHostApi {
        static MessageCodec<Object> getCodec() {
            return FirebaseStorageHostApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseStorageHostApi.getReferencebyPath((PigeonStorageFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonStorageReference>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.1
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(PigeonStorageReference pigeonStorageReference) {
                    arrayList.add(0, pigeonStorageReference);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            firebaseStorageHostApi.setMaxOperationRetryTime(pigeonStorageFirebaseApp, number == null ? null : Long.valueOf(number.longValue()), new Result<Void>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.2
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(Void r32) {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            PigeonStorageReference pigeonStorageReference = (PigeonStorageReference) arrayList2.get(1);
            Number number = (Number) arrayList2.get(2);
            firebaseStorageHostApi.referenceGetData(pigeonStorageFirebaseApp, pigeonStorageReference, number == null ? null : Long.valueOf(number.longValue()), new Result<byte[]>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.11
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(byte[] bArr) {
                    arrayList.add(0, bArr);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            PigeonStorageReference pigeonStorageReference = (PigeonStorageReference) arrayList2.get(1);
            byte[] bArr = (byte[]) arrayList2.get(2);
            PigeonSettableMetadata pigeonSettableMetadata = (PigeonSettableMetadata) arrayList2.get(3);
            Number number = (Number) arrayList2.get(4);
            firebaseStorageHostApi.referencePutData(pigeonStorageFirebaseApp, pigeonStorageReference, bArr, pigeonSettableMetadata, number == null ? null : Long.valueOf(number.longValue()), new Result<String>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.12
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            PigeonStorageReference pigeonStorageReference = (PigeonStorageReference) arrayList2.get(1);
            String str = (String) arrayList2.get(2);
            Number number = (Number) arrayList2.get(3);
            PigeonSettableMetadata pigeonSettableMetadata = (PigeonSettableMetadata) arrayList2.get(4);
            Number number2 = (Number) arrayList2.get(5);
            firebaseStorageHostApi.referencePutString(pigeonStorageFirebaseApp, pigeonStorageReference, str, number == null ? null : Long.valueOf(number.longValue()), pigeonSettableMetadata, number2 == null ? null : Long.valueOf(number2.longValue()), new Result<String>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.13
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(String str2) {
                    arrayList.add(0, str2);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            PigeonStorageReference pigeonStorageReference = (PigeonStorageReference) arrayList2.get(1);
            String str = (String) arrayList2.get(2);
            PigeonSettableMetadata pigeonSettableMetadata = (PigeonSettableMetadata) arrayList2.get(3);
            Number number = (Number) arrayList2.get(4);
            firebaseStorageHostApi.referencePutFile(pigeonStorageFirebaseApp, pigeonStorageReference, str, pigeonSettableMetadata, number == null ? null : Long.valueOf(number.longValue()), new Result<String>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.14
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(String str2) {
                    arrayList.add(0, str2);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            PigeonStorageReference pigeonStorageReference = (PigeonStorageReference) arrayList2.get(1);
            String str = (String) arrayList2.get(2);
            Number number = (Number) arrayList2.get(3);
            firebaseStorageHostApi.referenceDownloadFile(pigeonStorageFirebaseApp, pigeonStorageReference, str, number == null ? null : Long.valueOf(number.longValue()), new Result<String>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.15
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(String str2) {
                    arrayList.add(0, str2);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseStorageHostApi.referenceUpdateMetadata((PigeonStorageFirebaseApp) arrayList2.get(0), (PigeonStorageReference) arrayList2.get(1), (PigeonSettableMetadata) arrayList2.get(2), new Result<PigeonFullMetaData>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.16
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(PigeonFullMetaData pigeonFullMetaData) {
                    arrayList.add(0, pigeonFullMetaData);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$16(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            firebaseStorageHostApi.taskPause(pigeonStorageFirebaseApp, number == null ? null : Long.valueOf(number.longValue()), new Result<Map<String, Object>>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.17
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(Map<String, Object> map) {
                    arrayList.add(0, map);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$17(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            firebaseStorageHostApi.taskResume(pigeonStorageFirebaseApp, number == null ? null : Long.valueOf(number.longValue()), new Result<Map<String, Object>>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.18
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(Map<String, Object> map) {
                    arrayList.add(0, map);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$18(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            firebaseStorageHostApi.taskCancel(pigeonStorageFirebaseApp, number == null ? null : Long.valueOf(number.longValue()), new Result<Map<String, Object>>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.19
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(Map<String, Object> map) {
                    arrayList.add(0, map);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            firebaseStorageHostApi.setMaxUploadRetryTime(pigeonStorageFirebaseApp, number == null ? null : Long.valueOf(number.longValue()), new Result<Void>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.3
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(Void r32) {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            firebaseStorageHostApi.setMaxDownloadRetryTime(pigeonStorageFirebaseApp, number == null ? null : Long.valueOf(number.longValue()), new Result<Void>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.4
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(Void r32) {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = (PigeonStorageFirebaseApp) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            Number number = (Number) arrayList2.get(2);
            firebaseStorageHostApi.useStorageEmulator(pigeonStorageFirebaseApp, str, number == null ? null : Long.valueOf(number.longValue()), new Result<Void>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.5
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(Void r32) {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseStorageHostApi.referenceDelete((PigeonStorageFirebaseApp) arrayList2.get(0), (PigeonStorageReference) arrayList2.get(1), new Result<Void>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.6
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(Void r32) {
                    arrayList.add(0, null);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseStorageHostApi.referenceGetDownloadURL((PigeonStorageFirebaseApp) arrayList2.get(0), (PigeonStorageReference) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.7
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseStorageHostApi.referenceGetMetaData((PigeonStorageFirebaseApp) arrayList2.get(0), (PigeonStorageReference) arrayList2.get(1), new Result<PigeonFullMetaData>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.8
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(PigeonFullMetaData pigeonFullMetaData) {
                    arrayList.add(0, pigeonFullMetaData);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseStorageHostApi.referenceList((PigeonStorageFirebaseApp) arrayList2.get(0), (PigeonStorageReference) arrayList2.get(1), (PigeonListOptions) arrayList2.get(2), new Result<PigeonListResult>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.9
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(PigeonListResult pigeonListResult) {
                    arrayList.add(0, pigeonListResult);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(FirebaseStorageHostApi firebaseStorageHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            firebaseStorageHostApi.referenceListAll((PigeonStorageFirebaseApp) arrayList2.get(0), (PigeonStorageReference) arrayList2.get(1), new Result<PigeonListResult>() { // from class: io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.10
                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void error(Throwable th) {
                    reply.reply(GeneratedAndroidFirebaseStorage.wrapError(th));
                }

                @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.Result
                public void success(PigeonListResult pigeonListResult) {
                    arrayList.add(0, pigeonListResult);
                    reply.reply(arrayList);
                }
            });
        }

        static void setup(BinaryMessenger binaryMessenger, final FirebaseStorageHostApi firebaseStorageHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.getReferencebyPath", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.q
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$0(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.setMaxOperationRetryTime", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$1(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.setMaxUploadRetryTime", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.t
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$2(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.setMaxDownloadRetryTime", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.b0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$3(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.useStorageEmulator", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.y
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$4(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceDelete", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$5(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceGetDownloadURL", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.a0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$6(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceGetMetaData", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$7(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceList", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.v
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$8(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceListAll", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.u
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$9(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceGetData", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$10(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referencePutData", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.s
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$11(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referencePutString", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.c0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$12(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referencePutFile", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.w
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$13(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceDownloadFile", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.p
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$14(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceUpdateMetadata", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$15(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.taskPause", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$16(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel17.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.taskResume", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.x
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$17(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel18.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.taskCancel", getCodec());
            if (firebaseStorageHostApi != null) {
                basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.storage.z
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.lambda$setup$18(GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel19.setMessageHandler(null);
            }
        }

        void getReferencebyPath(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, String str, String str2, Result<PigeonStorageReference> result);

        void referenceDelete(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, Result<Void> result);

        void referenceDownloadFile(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, String str, Long l10, Result<String> result);

        void referenceGetData(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, Long l10, Result<byte[]> result);

        void referenceGetDownloadURL(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, Result<String> result);

        void referenceGetMetaData(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, Result<PigeonFullMetaData> result);

        void referenceList(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, PigeonListOptions pigeonListOptions, Result<PigeonListResult> result);

        void referenceListAll(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, Result<PigeonListResult> result);

        void referencePutData(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, byte[] bArr, PigeonSettableMetadata pigeonSettableMetadata, Long l10, Result<String> result);

        void referencePutFile(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, String str, PigeonSettableMetadata pigeonSettableMetadata, Long l10, Result<String> result);

        void referencePutString(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, String str, Long l10, PigeonSettableMetadata pigeonSettableMetadata, Long l11, Result<String> result);

        void referenceUpdateMetadata(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, PigeonStorageReference pigeonStorageReference, PigeonSettableMetadata pigeonSettableMetadata, Result<PigeonFullMetaData> result);

        void setMaxDownloadRetryTime(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, Result<Void> result);

        void setMaxOperationRetryTime(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, Result<Void> result);

        void setMaxUploadRetryTime(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, Result<Void> result);

        void taskCancel(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, Result<Map<String, Object>> result);

        void taskPause(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, Result<Map<String, Object>> result);

        void taskResume(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, Result<Map<String, Object>> result);

        void useStorageEmulator(PigeonStorageFirebaseApp pigeonStorageFirebaseApp, String str, Long l10, Result<Void> result);
    }

    /* loaded from: classes2.dex */
    public static class FirebaseStorageHostApiCodec extends StandardMessageCodec {
        public static final FirebaseStorageHostApiCodec INSTANCE = new FirebaseStorageHostApiCodec();

        private FirebaseStorageHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return PigeonFullMetaData.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonListOptions.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonListResult.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonSettableMetadata.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonStorageFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonStorageReference.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof PigeonFullMetaData) {
                byteArrayOutputStream.write(128);
                list = ((PigeonFullMetaData) obj).toList();
            } else if (obj instanceof PigeonListOptions) {
                byteArrayOutputStream.write(129);
                list = ((PigeonListOptions) obj).toList();
            } else if (obj instanceof PigeonListResult) {
                byteArrayOutputStream.write(130);
                list = ((PigeonListResult) obj).toList();
            } else if (obj instanceof PigeonSettableMetadata) {
                byteArrayOutputStream.write(131);
                list = ((PigeonSettableMetadata) obj).toList();
            } else if (obj instanceof PigeonStorageFirebaseApp) {
                byteArrayOutputStream.write(132);
                list = ((PigeonStorageFirebaseApp) obj).toList();
            } else if (!(obj instanceof PigeonStorageReference)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(133);
                list = ((PigeonStorageReference) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    /* loaded from: classes2.dex */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonFullMetaData {
        private Map<String, Object> metadata;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Map<String, Object> metadata;

            public PigeonFullMetaData build() {
                PigeonFullMetaData pigeonFullMetaData = new PigeonFullMetaData();
                pigeonFullMetaData.setMetadata(this.metadata);
                return pigeonFullMetaData;
            }

            public Builder setMetadata(Map<String, Object> map) {
                this.metadata = map;
                return this;
            }
        }

        public static PigeonFullMetaData fromList(ArrayList<Object> arrayList) {
            PigeonFullMetaData pigeonFullMetaData = new PigeonFullMetaData();
            pigeonFullMetaData.setMetadata((Map) arrayList.get(0));
            return pigeonFullMetaData;
        }

        public Map<String, Object> getMetadata() {
            return this.metadata;
        }

        public void setMetadata(Map<String, Object> map) {
            this.metadata = map;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.metadata);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonListOptions {
        private Long maxResults;
        private String pageToken;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Long maxResults;
            private String pageToken;

            public PigeonListOptions build() {
                PigeonListOptions pigeonListOptions = new PigeonListOptions();
                pigeonListOptions.setMaxResults(this.maxResults);
                pigeonListOptions.setPageToken(this.pageToken);
                return pigeonListOptions;
            }

            public Builder setMaxResults(Long l10) {
                this.maxResults = l10;
                return this;
            }

            public Builder setPageToken(String str) {
                this.pageToken = str;
                return this;
            }
        }

        public static PigeonListOptions fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonListOptions pigeonListOptions = new PigeonListOptions();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonListOptions.setMaxResults(valueOf);
            pigeonListOptions.setPageToken((String) arrayList.get(1));
            return pigeonListOptions;
        }

        public Long getMaxResults() {
            return this.maxResults;
        }

        public String getPageToken() {
            return this.pageToken;
        }

        public void setMaxResults(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"maxResults\" is null.");
            }
            this.maxResults = l10;
        }

        public void setPageToken(String str) {
            this.pageToken = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.maxResults);
            arrayList.add(this.pageToken);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonListResult {
        private List<PigeonStorageReference> items;
        private String pageToken;
        private List<PigeonStorageReference> prefixs;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private List<PigeonStorageReference> items;
            private String pageToken;
            private List<PigeonStorageReference> prefixs;

            public PigeonListResult build() {
                PigeonListResult pigeonListResult = new PigeonListResult();
                pigeonListResult.setItems(this.items);
                pigeonListResult.setPageToken(this.pageToken);
                pigeonListResult.setPrefixs(this.prefixs);
                return pigeonListResult;
            }

            public Builder setItems(List<PigeonStorageReference> list) {
                this.items = list;
                return this;
            }

            public Builder setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            public Builder setPrefixs(List<PigeonStorageReference> list) {
                this.prefixs = list;
                return this;
            }
        }

        public static PigeonListResult fromList(ArrayList<Object> arrayList) {
            PigeonListResult pigeonListResult = new PigeonListResult();
            pigeonListResult.setItems((List) arrayList.get(0));
            pigeonListResult.setPageToken((String) arrayList.get(1));
            pigeonListResult.setPrefixs((List) arrayList.get(2));
            return pigeonListResult;
        }

        public List<PigeonStorageReference> getItems() {
            return this.items;
        }

        public String getPageToken() {
            return this.pageToken;
        }

        public List<PigeonStorageReference> getPrefixs() {
            return this.prefixs;
        }

        public void setItems(List<PigeonStorageReference> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"items\" is null.");
            }
            this.items = list;
        }

        public void setPageToken(String str) {
            this.pageToken = str;
        }

        public void setPrefixs(List<PigeonStorageReference> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"prefixs\" is null.");
            }
            this.prefixs = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.items);
            arrayList.add(this.pageToken);
            arrayList.add(this.prefixs);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonSettableMetadata {
        private String cacheControl;
        private String contentDisposition;
        private String contentEncoding;
        private String contentLanguage;
        private String contentType;
        private Map<String, String> customMetadata;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String cacheControl;
            private String contentDisposition;
            private String contentEncoding;
            private String contentLanguage;
            private String contentType;
            private Map<String, String> customMetadata;

            public PigeonSettableMetadata build() {
                PigeonSettableMetadata pigeonSettableMetadata = new PigeonSettableMetadata();
                pigeonSettableMetadata.setCacheControl(this.cacheControl);
                pigeonSettableMetadata.setContentDisposition(this.contentDisposition);
                pigeonSettableMetadata.setContentEncoding(this.contentEncoding);
                pigeonSettableMetadata.setContentLanguage(this.contentLanguage);
                pigeonSettableMetadata.setContentType(this.contentType);
                pigeonSettableMetadata.setCustomMetadata(this.customMetadata);
                return pigeonSettableMetadata;
            }

            public Builder setCacheControl(String str) {
                this.cacheControl = str;
                return this;
            }

            public Builder setContentDisposition(String str) {
                this.contentDisposition = str;
                return this;
            }

            public Builder setContentEncoding(String str) {
                this.contentEncoding = str;
                return this;
            }

            public Builder setContentLanguage(String str) {
                this.contentLanguage = str;
                return this;
            }

            public Builder setContentType(String str) {
                this.contentType = str;
                return this;
            }

            public Builder setCustomMetadata(Map<String, String> map) {
                this.customMetadata = map;
                return this;
            }
        }

        public static PigeonSettableMetadata fromList(ArrayList<Object> arrayList) {
            PigeonSettableMetadata pigeonSettableMetadata = new PigeonSettableMetadata();
            pigeonSettableMetadata.setCacheControl((String) arrayList.get(0));
            pigeonSettableMetadata.setContentDisposition((String) arrayList.get(1));
            pigeonSettableMetadata.setContentEncoding((String) arrayList.get(2));
            pigeonSettableMetadata.setContentLanguage((String) arrayList.get(3));
            pigeonSettableMetadata.setContentType((String) arrayList.get(4));
            pigeonSettableMetadata.setCustomMetadata((Map) arrayList.get(5));
            return pigeonSettableMetadata;
        }

        public String getCacheControl() {
            return this.cacheControl;
        }

        public String getContentDisposition() {
            return this.contentDisposition;
        }

        public String getContentEncoding() {
            return this.contentEncoding;
        }

        public String getContentLanguage() {
            return this.contentLanguage;
        }

        public String getContentType() {
            return this.contentType;
        }

        public Map<String, String> getCustomMetadata() {
            return this.customMetadata;
        }

        public void setCacheControl(String str) {
            this.cacheControl = str;
        }

        public void setContentDisposition(String str) {
            this.contentDisposition = str;
        }

        public void setContentEncoding(String str) {
            this.contentEncoding = str;
        }

        public void setContentLanguage(String str) {
            this.contentLanguage = str;
        }

        public void setContentType(String str) {
            this.contentType = str;
        }

        public void setCustomMetadata(Map<String, String> map) {
            this.customMetadata = map;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.cacheControl);
            arrayList.add(this.contentDisposition);
            arrayList.add(this.contentEncoding);
            arrayList.add(this.contentLanguage);
            arrayList.add(this.contentType);
            arrayList.add(this.customMetadata);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonStorageFirebaseApp {
        private String appName;
        private String bucket;
        private String tenantId;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String appName;
            private String bucket;
            private String tenantId;

            public PigeonStorageFirebaseApp build() {
                PigeonStorageFirebaseApp pigeonStorageFirebaseApp = new PigeonStorageFirebaseApp();
                pigeonStorageFirebaseApp.setAppName(this.appName);
                pigeonStorageFirebaseApp.setTenantId(this.tenantId);
                pigeonStorageFirebaseApp.setBucket(this.bucket);
                return pigeonStorageFirebaseApp;
            }

            public Builder setAppName(String str) {
                this.appName = str;
                return this;
            }

            public Builder setBucket(String str) {
                this.bucket = str;
                return this;
            }

            public Builder setTenantId(String str) {
                this.tenantId = str;
                return this;
            }
        }

        public static PigeonStorageFirebaseApp fromList(ArrayList<Object> arrayList) {
            PigeonStorageFirebaseApp pigeonStorageFirebaseApp = new PigeonStorageFirebaseApp();
            pigeonStorageFirebaseApp.setAppName((String) arrayList.get(0));
            pigeonStorageFirebaseApp.setTenantId((String) arrayList.get(1));
            pigeonStorageFirebaseApp.setBucket((String) arrayList.get(2));
            return pigeonStorageFirebaseApp;
        }

        public String getAppName() {
            return this.appName;
        }

        public String getBucket() {
            return this.bucket;
        }

        public String getTenantId() {
            return this.tenantId;
        }

        public void setAppName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.appName = str;
        }

        public void setBucket(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"bucket\" is null.");
            }
            this.bucket = str;
        }

        public void setTenantId(String str) {
            this.tenantId = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.appName);
            arrayList.add(this.tenantId);
            arrayList.add(this.bucket);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonStorageReference {
        private String bucket;
        private String fullPath;
        private String name;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String bucket;
            private String fullPath;
            private String name;

            public PigeonStorageReference build() {
                PigeonStorageReference pigeonStorageReference = new PigeonStorageReference();
                pigeonStorageReference.setBucket(this.bucket);
                pigeonStorageReference.setFullPath(this.fullPath);
                pigeonStorageReference.setName(this.name);
                return pigeonStorageReference;
            }

            public Builder setBucket(String str) {
                this.bucket = str;
                return this;
            }

            public Builder setFullPath(String str) {
                this.fullPath = str;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }
        }

        public static PigeonStorageReference fromList(ArrayList<Object> arrayList) {
            PigeonStorageReference pigeonStorageReference = new PigeonStorageReference();
            pigeonStorageReference.setBucket((String) arrayList.get(0));
            pigeonStorageReference.setFullPath((String) arrayList.get(1));
            pigeonStorageReference.setName((String) arrayList.get(2));
            return pigeonStorageReference;
        }

        public String getBucket() {
            return this.bucket;
        }

        public String getFullPath() {
            return this.fullPath;
        }

        public String getName() {
            return this.name;
        }

        public void setBucket(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"bucket\" is null.");
            }
            this.bucket = str;
        }

        public void setFullPath(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"fullPath\" is null.");
            }
            this.fullPath = str;
        }

        public void setName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.name = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.bucket);
            arrayList.add(this.fullPath);
            arrayList.add(this.name);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public enum PigeonStorageTaskState {
        PAUSED(0),
        RUNNING(1),
        SUCCESS(2),
        CANCELED(3),
        ERROR(4);

        public final int index;

        PigeonStorageTaskState(int i10) {
            this.index = i10;
        }
    }

    /* loaded from: classes2.dex */
    public interface Result<T> {
        void error(Throwable th);

        void success(T t10);
    }

    public static ArrayList<Object> wrapError(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            obj = flutterError.details;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
