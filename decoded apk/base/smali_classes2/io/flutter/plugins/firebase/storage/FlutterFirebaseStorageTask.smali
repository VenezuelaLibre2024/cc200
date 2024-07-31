.class Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;
    }
.end annotation


# static fields
.field public static final inProgressTasks:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final bytes:[B

.field private final cancelSyncObject:Ljava/lang/Object;

.field private destroyed:Ljava/lang/Boolean;

.field private final fileUri:Landroid/net/Uri;

.field private final handle:I

.field private final metadata:Lp9/o;

.field private final pauseSyncObject:Ljava/lang/Object;

.field private final reference:Lp9/p;

.field private final resumeSyncObject:Ljava/lang/Object;

.field private storageTask:Lp9/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/e0<",
            "*>;"
        }
    .end annotation
.end field

.field private final type:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->inProgressTasks:Landroid/util/SparseArray;

    return-void
.end method

.method private constructor <init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;ILp9/p;[BLandroid/net/Uri;Lp9/o;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->pauseSyncObject:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->resumeSyncObject:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->cancelSyncObject:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroyed:Ljava/lang/Boolean;

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->type:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;

    iput p2, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->handle:I

    iput-object p3, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->reference:Lp9/p;

    iput-object p4, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->bytes:[B

    iput-object p5, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->fileUri:Landroid/net/Uri;

    iput-object p6, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->metadata:Lp9/o;

    sget-object p1, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->inProgressTasks:Landroid/util/SparseArray;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, p2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public static cancelInProgressTasks()V
    .locals 4

    sget-object v0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->inProgressTasks:Landroid/util/SparseArray;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    sget-object v2, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->inProgressTasks:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroy()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static downloadFile(ILp9/p;Ljava/io/File;)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;
    .locals 8

    new-instance v7, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    sget-object v1, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;->DOWNLOAD:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;

    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    move v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;ILp9/p;[BLandroid/net/Uri;Lp9/o;)V

    return-object v7
.end method

.method public static getInProgressTaskForHandle(I)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;
    .locals 1

    sget-object v0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->inProgressTasks:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static parseDownloadTaskSnapshot(Lp9/e$a;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp9/e$a;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lp9/e0$b;->b()Lp9/p;

    move-result-object v1

    invoke-virtual {v1}, Lp9/p;->s()Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lp9/e0$b;->c()Lp9/e0;

    move-result-object v1

    invoke-virtual {v1}, Lp9/e0;->isSuccessful()Z

    move-result v1

    const-string v2, "bytesTransferred"

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lp9/e$a;->e()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp9/e$a;->d()J

    move-result-wide v3

    :goto_0
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lp9/e$a;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const-string v1, "totalBytes"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static parseTaskSnapshot(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lp9/e$a;

    if-eqz v0, :cond_0

    check-cast p0, Lp9/e$a;

    invoke-static {p0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->parseDownloadTaskSnapshot(Lp9/e$a;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p0, Lp9/n0$b;

    invoke-static {p0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->parseUploadTaskSnapshot(Lp9/n0$b;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static parseUploadTaskSnapshot(Lp9/n0$b;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp9/n0$b;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lp9/e0$b;->b()Lp9/p;

    move-result-object v1

    invoke-virtual {v1}, Lp9/p;->s()Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lp9/n0$b;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "bytesTransferred"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lp9/n0$b;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "totalBytes"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lp9/n0$b;->e()Lp9/o;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lp9/n0$b;->e()Lp9/o;

    move-result-object p0

    invoke-static {p0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->parseMetadataToMap(Lp9/o;)Ljava/util/Map;

    move-result-object p0

    const-string v1, "metadata"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static uploadBytes(ILp9/p;[BLp9/o;)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;
    .locals 8

    new-instance v7, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    sget-object v1, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;->BYTES:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;

    const/4 v5, 0x0

    move-object v0, v7

    move v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;ILp9/p;[BLandroid/net/Uri;Lp9/o;)V

    return-object v7
.end method

.method public static uploadFile(ILp9/p;Landroid/net/Uri;Lp9/o;)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;
    .locals 8

    new-instance v7, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    sget-object v1, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;->FILE:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;

    const/4 v4, 0x0

    move-object v0, v7

    move v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;ILp9/p;[BLandroid/net/Uri;Lp9/o;)V

    return-object v7
.end method


# virtual methods
.method public destroy()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroyed:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroyed:Ljava/lang/Boolean;

    sget-object v0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->inProgressTasks:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->storageTask:Lp9/e0;

    invoke-virtual {v1}, Lp9/e0;->K()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->storageTask:Lp9/e0;

    invoke-virtual {v1}, Lp9/e0;->L()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->storageTask:Lp9/e0;

    invoke-virtual {v1}, Lp9/e0;->w()Z

    :cond_2
    iget v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->handle:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->cancelSyncObject:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->cancelSyncObject:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->pauseSyncObject:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->pauseSyncObject:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->resumeSyncObject:Ljava/lang/Object;

    monitor-enter v1

    :try_start_3
    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->resumeSyncObject:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0

    :catchall_3
    move-exception v1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v1
.end method

.method public getAndroidTask()Lp9/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp9/e0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->storageTask:Lp9/e0;

    return-object v0
.end method

.method public getSnapshot()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->storageTask:Lp9/e0;

    invoke-virtual {v0}, Lp9/e0;->F()Lp9/e0$a;

    move-result-object v0

    return-object v0
.end method

.method public isDestroyed()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroyed:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public notifyCancelObjects()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->cancelSyncObject:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->cancelSyncObject:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public notifyPauseObjects()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->pauseSyncObject:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->pauseSyncObject:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public notifyResumeObjects()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->resumeSyncObject:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->resumeSyncObject:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public startTaskWithMethodChannel(Lio/flutter/plugin/common/MethodChannel;)Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;
    .locals 2

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->type:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;

    sget-object v0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;->BYTES:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->bytes:[B

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->metadata:Lp9/o;

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->reference:Lp9/p;

    invoke-virtual {p1, v0}, Lp9/p;->A([B)Lp9/n0;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->reference:Lp9/p;

    invoke-virtual {v1, v0, p1}, Lp9/p;->B([BLp9/o;)Lp9/n0;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->storageTask:Lp9/e0;

    goto :goto_1

    :cond_1
    sget-object v0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;->FILE:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->fileUri:Landroid/net/Uri;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->metadata:Lp9/o;

    if-nez p1, :cond_2

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->reference:Lp9/p;

    invoke-virtual {p1, v0}, Lp9/p;->C(Landroid/net/Uri;)Lp9/n0;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->reference:Lp9/p;

    invoke-virtual {v1, v0, p1}, Lp9/p;->D(Landroid/net/Uri;Lp9/o;)Lp9/n0;

    move-result-object p1

    goto :goto_0

    :cond_3
    sget-object v0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;->DOWNLOAD:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask$FlutterFirebaseStorageTaskType;

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->fileUri:Landroid/net/Uri;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->reference:Lp9/p;

    invoke-virtual {v0, p1}, Lp9/p;->o(Landroid/net/Uri;)Lp9/e;

    move-result-object p1

    goto :goto_0

    :goto_1
    new-instance p1, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->reference:Lp9/p;

    invoke-virtual {v0}, Lp9/p;->u()Lp9/f;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->storageTask:Lp9/e0;

    invoke-direct {p1, p0, v0, v1}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;Lp9/f;Lp9/e0;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Unable to start task. Some arguments have no been initialized."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method
