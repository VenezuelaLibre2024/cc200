.class Lio/flutter/embedding/engine/loader/ResourceExtractor;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask;
    }
.end annotation


# static fields
.field private static final SUPPORTED_ABIS:[Ljava/lang/String;

.field private static final TAG:Ljava/lang/String; = "ResourceExtractor"

.field private static final TIMESTAMP_PREFIX:Ljava/lang/String; = "res_timestamp-"


# instance fields
.field private final mAssetManager:Landroid/content/res/AssetManager;

.field private final mDataDirPath:Ljava/lang/String;

.field private mExtractTask:Lio/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask;

.field private final mPackageManager:Landroid/content/pm/PackageManager;

.field private final mPackageName:Ljava/lang/String;

.field private final mResources:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lio/flutter/embedding/engine/loader/ResourceExtractor;->getSupportedAbis()[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->SUPPORTED_ABIS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;Landroid/content/res/AssetManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mDataDirPath:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mPackageName:Ljava/lang/String;

    iput-object p3, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mPackageManager:Landroid/content/pm/PackageManager;

    iput-object p4, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mAssetManager:Landroid/content/res/AssetManager;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mResources:Ljava/util/HashSet;

    return-void
.end method

.method public static synthetic access$000(Ljava/io/File;Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/embedding/engine/loader/ResourceExtractor;->checkTimestamp(Ljava/io/File;Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$100(Ljava/lang/String;Ljava/util/HashSet;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/embedding/engine/loader/ResourceExtractor;->deleteFiles(Ljava/lang/String;Ljava/util/HashSet;)V

    return-void
.end method

.method public static synthetic access$200(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/embedding/engine/loader/ResourceExtractor;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    return-void
.end method

.method private static checkTimestamp(Ljava/io/File;Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "res_timestamp-"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, p2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lio/flutter/embedding/engine/loader/ResourceExtractor;->getVersionCode(Landroid/content/pm/PackageInfo;)J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0}, Lio/flutter/embedding/engine/loader/ResourceExtractor;->getExistingTimestamps(Ljava/io/File;)[Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    return-object p1

    :cond_1
    array-length p2, p0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_3

    aget-object p0, p0, v1

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_0
    return-object p1

    :catch_0
    return-object v0
.end method

.method private static copy(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3

    const/16 v0, 0x4000

    new-array v0, v0, [B

    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-ltz v1, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static deleteFiles(Ljava/lang/String;Ljava/util/HashSet;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lio/flutter/embedding/engine/loader/ResourceExtractor;->getExistingTimestamps(Ljava/io/File;)[Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    return-void

    :cond_2
    array-length p1, p0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_3

    aget-object v2, p0, v1

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private static getExistingTimestamps(Ljava/io/File;)[Ljava/lang/String;
    .locals 1

    new-instance v0, Lio/flutter/embedding/engine/loader/ResourceExtractor$1;

    invoke-direct {v0}, Lio/flutter/embedding/engine/loader/ResourceExtractor$1;-><init>()V

    invoke-virtual {p0, v0}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getSupportedAbis()[Ljava/lang/String;
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    sget-object v4, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    aput-object v4, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    const-string v2, ""

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    new-array v1, v3, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public static getVersionCode(Landroid/content/pm/PackageInfo;)J
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v0, p0

    return-wide v0
.end method


# virtual methods
.method public addResource(Ljava/lang/String;)Lio/flutter/embedding/engine/loader/ResourceExtractor;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mResources:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addResources(Ljava/util/Collection;)Lio/flutter/embedding/engine/loader/ResourceExtractor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/flutter/embedding/engine/loader/ResourceExtractor;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mResources:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public start()Lio/flutter/embedding/engine/loader/ResourceExtractor;
    .locals 7

    new-instance v6, Lio/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask;

    iget-object v1, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mDataDirPath:Ljava/lang/String;

    iget-object v2, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mResources:Ljava/util/HashSet;

    iget-object v3, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mPackageName:Ljava/lang/String;

    iget-object v4, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mPackageManager:Landroid/content/pm/PackageManager;

    iget-object v5, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mAssetManager:Landroid/content/res/AssetManager;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask;-><init>(Ljava/lang/String;Ljava/util/HashSet;Ljava/lang/String;Landroid/content/pm/PackageManager;Landroid/content/res/AssetManager;)V

    iput-object v6, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mExtractTask:Lio/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask;

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v6, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-object p0
.end method

.method public waitForCompletion()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mExtractTask:Lio/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/os/AsyncTask;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mDataDirPath:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/embedding/engine/loader/ResourceExtractor;->mResources:Ljava/util/HashSet;

    invoke-static {v0, v1}, Lio/flutter/embedding/engine/loader/ResourceExtractor;->deleteFiles(Ljava/lang/String;Ljava/util/HashSet;)V

    :goto_0
    return-void
.end method
