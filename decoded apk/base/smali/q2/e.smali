.class public Lq2/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Lq2/s;

.field public final i:Lq2/t;

.field public final j:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lq2/s;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/e;->h:Lq2/s;

    invoke-virtual {p1}, Lq2/s;->A()Lq2/t;

    move-result-object p1

    iput-object p1, p0, Lq2/e;->i:Lq2/t;

    iput-object p2, p0, Lq2/e;->j:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lq2/e;->h:Lq2/s;

    iget-object v1, p0, Lq2/e;->j:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->D(Lq2/s;I)V

    iget-object v0, p0, Lq2/e;->i:Lq2/t;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "ffmpeg-kit"

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v4, p0, Lq2/e;->h:Lq2/s;

    invoke-interface {v0, v4}, Lq2/t;->a(Lq2/s;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v0}, Lt2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v1

    const-string v0, "Exception thrown inside session complete callback.%s"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->E()Lq2/t;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v4, p0, Lq2/e;->h:Lq2/s;

    invoke-interface {v0, v4}, Lq2/t;->a(Lq2/s;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Lt2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v1

    const-string v0, "Exception thrown inside global complete callback.%s"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_1
    return-void
.end method
