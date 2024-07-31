.class public Ljc/a;
.super Ljava/lang/Thread;
.source ""

# interfaces
.implements Landroid/media/AudioRecord$OnRecordPositionUpdateListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljc/a$a;,
        Ljc/a$b;
    }
.end annotation


# instance fields
.field public h:Ljc/a$a;

.field public i:[B

.field public j:Ljava/io/FileOutputStream;

.field public k:Ljava/io/File;

.field public l:Ljava/util/concurrent/CountDownLatch;

.field public m:Lkc/a;

.field public n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljc/a$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;ILkc/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Ljc/a;->l:Ljava/util/concurrent/CountDownLatch;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ljc/a;->n:Ljava/util/List;

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Ljc/a;->j:Ljava/io/FileOutputStream;

    iput-object p1, p0, Ljc/a;->k:Ljava/io/File;

    mul-int/lit8 p2, p2, 0x2

    int-to-double p1, p2

    const-wide/high16 v0, 0x3ff4000000000000L    # 1.25

    mul-double/2addr p1, v0

    const-wide v0, 0x40bc200000000000L    # 7200.0

    add-double/2addr p1, v0

    double-to-int p1, p1

    new-array p1, p1, [B

    iput-object p1, p0, Ljc/a;->i:[B

    iput-object p3, p0, Ljc/a;->m:Lkc/a;

    return-void
.end method

.method public static synthetic a(Ljc/a;)I
    .locals 0

    invoke-virtual {p0}, Ljc/a;->i()I

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljc/a;)V
    .locals 0

    invoke-virtual {p0}, Ljc/a;->g()V

    return-void
.end method

.method public static synthetic c(Ljc/a;)Lkc/a;
    .locals 0

    iget-object p0, p0, Ljc/a;->m:Lkc/a;

    return-object p0
.end method

.method public static synthetic d(Ljc/a;)V
    .locals 0

    invoke-virtual {p0}, Ljc/a;->f()V

    return-void
.end method


# virtual methods
.method public e([SI)V
    .locals 2

    iget-object v0, p0, Ljc/a;->n:Ljava/util/List;

    new-instance v1, Ljc/a$b;

    invoke-direct {v1, p0, p1, p2}, Ljc/a$b;-><init>(Ljc/a;[SI)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Ljc/a;->k:Ljava/io/File;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    const-string v0, "record"

    const-string v1, "\u975e\u6b63\u5e38\u7ed3\u675f\u60c5\u51b5\u4e0b,\u5220\u9664\u539f\u5f55\u97f3\u6587\u4ef6"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 6

    const-string v0, "write exception"

    const-string v1, "RecordMp3"

    iget-object v2, p0, Ljc/a;->i:[B

    invoke-static {v2}, Lcom/czt/mp3recorder/util/LameUtil;->flush([B)I

    move-result v2

    if-lez v2, :cond_2

    :try_start_0
    iget-object v3, p0, Ljc/a;->j:Ljava/io/FileOutputStream;

    iget-object v4, p0, Ljc/a;->i:[B

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Ljc/a;->j:Ljava/io/FileOutputStream;

    if-eqz v2, :cond_0

    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    invoke-static {}, Lcom/czt/mp3recorder/util/LameUtil;->close()V

    goto :goto_3

    :catchall_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    :try_start_2
    iget-object v3, p0, Ljc/a;->h:Ljc/a$a;

    const/16 v4, 0xf

    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, p0, Ljc/a;->j:Ljava/io/FileOutputStream;

    if-eqz v2, :cond_0

    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :goto_1
    iget-object v3, p0, Ljc/a;->j:Ljava/io/FileOutputStream;

    if-eqz v3, :cond_1

    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_2
    invoke-static {}, Lcom/czt/mp3recorder/util/LameUtil;->close()V

    throw v2

    :cond_2
    :goto_3
    return-void
.end method

.method public h()Landroid/os/Handler;
    .locals 1

    :try_start_0
    iget-object v0, p0, Ljc/a;->l:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_0
    iget-object v0, p0, Ljc/a;->h:Ljc/a$a;

    return-object v0
.end method

.method public final i()I
    .locals 5

    iget-object v0, p0, Ljc/a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    iget-object v0, p0, Ljc/a;->n:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljc/a$b;

    invoke-virtual {v0}, Ljc/a$b;->a()[S

    move-result-object v2

    invoke-virtual {v0}, Ljc/a$b;->b()I

    move-result v0

    iget-object v3, p0, Ljc/a;->i:[B

    invoke-static {v2, v2, v0, v3}, Lcom/czt/mp3recorder/util/LameUtil;->encode([S[SI[B)I

    move-result v2

    if-lez v2, :cond_0

    :try_start_0
    iget-object v3, p0, Ljc/a;->j:Ljava/io/FileOutputStream;

    iget-object v4, p0, Ljc/a;->i:[B

    invoke-virtual {v3, v4, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v1, p0, Ljc/a;->h:Ljc/a$a;

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    const-string v1, "RecordMp3"

    const-string v2, "write exception"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return v0

    :cond_1
    return v1
.end method

.method public onMarkerReached(Landroid/media/AudioRecord;)V
    .locals 0

    return-void
.end method

.method public onPeriodicNotification(Landroid/media/AudioRecord;)V
    .locals 0

    invoke-virtual {p0}, Ljc/a;->i()I

    return-void
.end method

.method public run()V
    .locals 1

    invoke-static {}, Landroid/os/Looper;->prepare()V

    new-instance v0, Ljc/a$a;

    invoke-direct {v0, p0, p0}, Ljc/a$a;-><init>(Ljc/a;Ljc/a;)V

    iput-object v0, p0, Ljc/a;->h:Ljc/a$a;

    iget-object v0, p0, Ljc/a;->l:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    invoke-static {}, Landroid/os/Looper;->loop()V

    return-void
.end method
