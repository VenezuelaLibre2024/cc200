.class public Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field private final TASK_APP_NAME:Ljava/lang/String;

.field private final TASK_ERROR:Ljava/lang/String;

.field private final TASK_SNAPSHOT:Ljava/lang/String;

.field private final TASK_STATE_NAME:Ljava/lang/String;

.field private final androidStorage:Lp9/f;

.field private final androidTask:Lp9/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/e0<",
            "*>;"
        }
    .end annotation
.end field

.field private final flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;Lp9/f;Lp9/e0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "taskState"

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->TASK_STATE_NAME:Ljava/lang/String;

    const-string v0, "appName"

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->TASK_APP_NAME:Ljava/lang/String;

    const-string v0, "snapshot"

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->TASK_SNAPSHOT:Ljava/lang/String;

    const-string v0, "error"

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->TASK_ERROR:Ljava/lang/String;

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    iput-object p2, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidStorage:Lp9/f;

    iput-object p3, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lp9/e0;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$1(Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$4(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$3(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$2(Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V

    return-void
.end method

.method private getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Exception;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidStorage:Lp9/f;

    invoke-virtual {v1}, Lp9/f;->a()Ln7/g;

    move-result-object v1

    invoke-virtual {v1}, Ln7/g;->q()Ljava/lang/String;

    move-result-object v1

    const-string v2, "appName"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->parseTaskSnapshot(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "snapshot"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getExceptionDetails(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "error"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method private synthetic lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    sget-object v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->RUNNING:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v0, v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "taskState"

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->notifyResumeObjects()V

    return-void
.end method

.method private synthetic lambda$onListen$1(Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    sget-object v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->PAUSED:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v0, v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "taskState"

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->notifyPauseObjects()V

    return-void
.end method

.method private synthetic lambda$onListen$2(Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    sget-object v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->SUCCESS:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v0, v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "taskState"

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroy()V

    return-void
.end method

.method private synthetic lambda$onListen$3(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->ERROR:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v1, v1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "taskState"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/16 v2, -0x32f0

    invoke-static {v2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->getCode(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "code"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->getMessage(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "message"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "error"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->notifyCancelObjects()V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroy()V

    return-void
.end method

.method private synthetic lambda$onListen$4(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    sget-object v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->ERROR:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v0, v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "taskState"

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroy()V

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lp9/e0;

    invoke-virtual {p1}, Lp9/e0;->isCanceled()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lp9/e0;

    invoke-virtual {p1}, Lp9/e0;->w()Z

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroy()V

    :cond_1
    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 1

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lp9/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/h0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/h0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lp9/e0;->s(Lp9/m;)Lp9/e0;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lp9/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/g0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/g0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lp9/e0;->r(Lp9/l;)Lp9/e0;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lp9/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/f0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/f0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lp9/e0;->u(Lcom/google/android/gms/tasks/OnSuccessListener;)Lp9/e0;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lp9/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/d0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/d0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lp9/e0;->j(Lcom/google/android/gms/tasks/OnCanceledListener;)Lp9/e0;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lp9/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/e0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/e0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lp9/e0;->p(Lcom/google/android/gms/tasks/OnFailureListener;)Lp9/e0;

    return-void
.end method
