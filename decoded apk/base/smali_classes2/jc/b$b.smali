.class public Ljc/b$b;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljc/b;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljc/b;


# direct methods
.method public constructor <init>(Ljc/b;)V
    .locals 0

    iput-object p1, p0, Ljc/b$b;->h:Ljc/b;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const-string v0, "RecordMp3"

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v3}, Ljc/b;->b(Ljc/b;)Landroid/media/AudioRecord;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v3}, Ljc/b;->d(Ljc/b;)V

    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v3}, Ljc/b;->b(Ljc/b;)Landroid/media/AudioRecord;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/AudioRecord;->startRecording()V

    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v3, v2}, Ljc/b;->e(Ljc/b;Z)V

    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    sget-object v4, Ljc/c;->i:Ljc/c;

    invoke-static {v3, v4}, Ljc/b;->f(Ljc/b;Ljc/c;)V

    const/16 v3, -0x13

    invoke-static {v3}, Landroid/os/Process;->setThreadPriority(I)V

    :cond_1
    :goto_1
    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-virtual {v3}, Ljc/b;->q()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-virtual {v3}, Ljc/b;->o()Ljc/c;

    move-result-object v3

    sget-object v4, Ljc/c;->k:Ljc/c;

    if-ne v3, v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v3}, Ljc/b;->b(Ljc/b;)Landroid/media/AudioRecord;

    move-result-object v3

    iget-object v4, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v4}, Ljc/b;->g(Ljc/b;)[S

    move-result-object v4

    iget-object v5, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v5}, Ljc/b;->h(Ljc/b;)I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6, v5}, Landroid/media/AudioRecord;->read([SII)I

    move-result v3

    if-gtz v3, :cond_4

    if-nez v3, :cond_3

    iget-object v4, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v4}, Ljc/b;->k(Ljc/b;)I

    :cond_3
    iget-object v4, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v4}, Ljc/b;->i(Ljc/b;)I

    move-result v4

    if-ltz v4, :cond_1

    if-nez v3, :cond_1

    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v3, v6}, Ljc/b;->e(Ljc/b;Z)V

    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    const/16 v4, -0x64

    invoke-static {v3, v4}, Ljc/b;->j(Ljc/b;I)I

    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    const/16 v4, 0x14

    invoke-static {v3, v4}, Ljc/b;->l(Ljc/b;I)V

    goto :goto_1

    :cond_4
    iget-object v4, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v4}, Ljc/b;->m(Ljc/b;)Ljc/a;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v4}, Ljc/b;->m(Ljc/b;)Ljc/a;

    move-result-object v4

    iget-object v5, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v5}, Ljc/b;->g(Ljc/b;)[S

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljc/a;->e([SI)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_5
    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v0}, Ljc/b;->c(Ljc/b;)V

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-virtual {v0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v3, Ljc/c;->m:Ljc/c;

    if-ne v0, v3, :cond_6

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :catch_0
    move-exception v3

    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    const/16 v3, 0xf

    invoke-static {v0, v3}, Ljc/b;->l(Ljc/b;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v0}, Ljc/b;->c(Ljc/b;)V

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-virtual {v0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v3, Ljc/c;->m:Ljc/c;

    if-ne v0, v3, :cond_6

    goto :goto_2

    :catch_1
    :try_start_2
    const-string v3, "NO Record Permission"

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Ljc/b;->l(Ljc/b;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v0}, Ljc/b;->c(Ljc/b;)V

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-virtual {v0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v3, Ljc/c;->m:Ljc/c;

    if-ne v0, v3, :cond_6

    goto :goto_2

    :catch_2
    :try_start_3
    const-string v3, "Can not find record file"

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    const/4 v3, 0x5

    invoke-static {v0, v3}, Ljc/b;->l(Ljc/b;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v0}, Ljc/b;->c(Ljc/b;)V

    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-virtual {v0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v3, Ljc/c;->m:Ljc/c;

    if-ne v0, v3, :cond_6

    :goto_2
    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v0}, Ljc/b;->m(Ljc/b;)Ljc/a;

    move-result-object v0

    invoke-virtual {v0}, Ljc/a;->h()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    goto :goto_3

    :cond_6
    iget-object v0, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v0}, Ljc/b;->m(Ljc/b;)Ljc/a;

    move-result-object v0

    invoke-virtual {v0}, Ljc/a;->h()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :goto_3
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void

    :goto_4
    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v3}, Ljc/b;->c(Ljc/b;)V

    iget-object v3, p0, Ljc/b$b;->h:Ljc/b;

    invoke-virtual {v3}, Ljc/b;->o()Ljc/c;

    move-result-object v3

    sget-object v4, Ljc/c;->m:Ljc/c;

    if-ne v3, v4, :cond_7

    iget-object v1, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v1}, Ljc/b;->m(Ljc/b;)Ljc/a;

    move-result-object v1

    invoke-virtual {v1}, Ljc/a;->h()Landroid/os/Handler;

    move-result-object v1

    invoke-static {v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    goto :goto_5

    :cond_7
    iget-object v2, p0, Ljc/b$b;->h:Ljc/b;

    invoke-static {v2}, Ljc/b;->m(Ljc/b;)Ljc/a;

    move-result-object v2

    invoke-virtual {v2}, Ljc/a;->h()Landroid/os/Handler;

    move-result-object v2

    invoke-static {v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    :goto_5
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    throw v0
.end method
