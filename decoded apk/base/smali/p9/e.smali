.class public Lp9/e;
.super Lp9/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp9/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp9/e0<",
        "Lp9/e$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final l:Landroid/net/Uri;

.field public m:J

.field public n:Lp9/p;

.field public o:Lq9/c;

.field public p:J

.field public q:Ljava/lang/String;

.field public volatile r:Ljava/lang/Exception;

.field public s:J

.field public t:I


# direct methods
.method public constructor <init>(Lp9/p;Landroid/net/Uri;)V
    .locals 6

    invoke-direct {p0}, Lp9/e0;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lp9/e;->p:J

    const/4 v0, 0x0

    iput-object v0, p0, Lp9/e;->q:Ljava/lang/String;

    iput-object v0, p0, Lp9/e;->r:Ljava/lang/Exception;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lp9/e;->s:J

    iput-object p1, p0, Lp9/e;->n:Lp9/p;

    iput-object p2, p0, Lp9/e;->l:Landroid/net/Uri;

    invoke-virtual {p1}, Lp9/p;->u()Lp9/f;

    move-result-object p1

    new-instance p2, Lq9/c;

    invoke-virtual {p1}, Lp9/f;->a()Ln7/g;

    move-result-object v0

    invoke-virtual {v0}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lp9/f;->c()Lx7/b;

    move-result-object v2

    invoke-virtual {p1}, Lp9/f;->b()Lv7/b;

    move-result-object v3

    invoke-virtual {p1}, Lp9/f;->i()J

    move-result-wide v4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lq9/c;-><init>(Landroid/content/Context;Lx7/b;Lv7/b;J)V

    iput-object p2, p0, Lp9/e;->o:Lq9/c;

    return-void
.end method


# virtual methods
.method public I()Lp9/p;
    .locals 1

    iget-object v0, p0, Lp9/e;->n:Lp9/p;

    return-object v0
.end method

.method public U()V
    .locals 1

    iget-object v0, p0, Lp9/e;->o:Lq9/c;

    invoke-virtual {v0}, Lq9/c;->a()V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->q:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0}, Lp9/n;->c(Lcom/google/android/gms/common/api/Status;)Lp9/n;

    move-result-object v0

    iput-object v0, p0, Lp9/e;->r:Ljava/lang/Exception;

    return-void
.end method

.method public e0()V
    .locals 14

    iget-object v0, p0, Lp9/e;->r:Ljava/lang/Exception;

    const/16 v1, 0x40

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, v2}, Lp9/e0;->j0(IZ)Z

    return-void

    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0, v2}, Lp9/e0;->j0(IZ)Z

    move-result v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lp9/e;->m:J

    const/4 v5, 0x0

    iput-object v5, p0, Lp9/e;->r:Ljava/lang/Exception;

    iget-object v6, p0, Lp9/e;->o:Lq9/c;

    invoke-virtual {v6}, Lq9/c;->c()V

    new-instance v6, Lr9/c;

    iget-object v7, p0, Lp9/e;->n:Lp9/p;

    invoke-virtual {v7}, Lp9/p;->v()Lq9/h;

    move-result-object v7

    iget-object v8, p0, Lp9/e;->n:Lp9/p;

    invoke-virtual {v8}, Lp9/p;->i()Ln7/g;

    move-result-object v8

    iget-wide v9, p0, Lp9/e;->s:J

    invoke-direct {v6, v7, v8, v9, v10}, Lr9/c;-><init>(Lq9/h;Ln7/g;J)V

    iget-object v7, p0, Lp9/e;->o:Lq9/c;

    invoke-virtual {v7, v6, v2}, Lq9/c;->e(Lr9/e;Z)V

    invoke-virtual {v6}, Lr9/e;->o()I

    move-result v7

    iput v7, p0, Lp9/e;->t:I

    invoke-virtual {v6}, Lr9/e;->f()Ljava/lang/Exception;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Lr9/e;->f()Ljava/lang/Exception;

    move-result-object v7

    goto :goto_0

    :cond_2
    iget-object v7, p0, Lp9/e;->r:Ljava/lang/Exception;

    :goto_0
    iput-object v7, p0, Lp9/e;->r:Ljava/lang/Exception;

    iget v7, p0, Lp9/e;->t:I

    invoke-virtual {p0, v7}, Lp9/e;->n0(I)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_3

    iget-object v7, p0, Lp9/e;->r:Ljava/lang/Exception;

    if-nez v7, :cond_3

    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v7

    if-ne v7, v0, :cond_3

    move v7, v8

    goto :goto_1

    :cond_3
    move v7, v2

    :goto_1
    const-string v9, "FileDownloadTask"

    if-eqz v7, :cond_5

    invoke-virtual {v6}, Lr9/e;->r()I

    move-result v10

    int-to-long v10, v10

    iget-wide v12, p0, Lp9/e;->s:J

    add-long/2addr v10, v12

    iput-wide v10, p0, Lp9/e;->p:J

    const-string v10, "ETag"

    invoke-virtual {v6, v10}, Lr9/e;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_4

    iget-object v11, p0, Lp9/e;->q:Ljava/lang/String;

    if-eqz v11, :cond_4

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    const-string v0, "The file at the server has changed.  Restarting from the beginning."

    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput-wide v3, p0, Lp9/e;->s:J

    iput-object v5, p0, Lp9/e;->q:Ljava/lang/String;

    invoke-virtual {v6}, Lr9/e;->C()V

    invoke-virtual {p0}, Lp9/e;->f0()V

    return-void

    :cond_4
    iput-object v10, p0, Lp9/e;->q:Ljava/lang/String;

    :try_start_0
    invoke-virtual {p0, v6}, Lp9/e;->o0(Lr9/e;)Z

    move-result v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v5

    const-string v10, "Exception occurred during file write.  Aborting."

    invoke-static {v9, v10, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v5, p0, Lp9/e;->r:Ljava/lang/Exception;

    :cond_5
    :goto_2
    invoke-virtual {v6}, Lr9/e;->C()V

    if-eqz v7, :cond_6

    iget-object v5, p0, Lp9/e;->r:Ljava/lang/Exception;

    if-nez v5, :cond_6

    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v5

    if-ne v5, v0, :cond_6

    goto :goto_3

    :cond_6
    move v8, v2

    :goto_3
    if-eqz v8, :cond_7

    const/16 v0, 0x80

    invoke-virtual {p0, v0, v2}, Lp9/e0;->j0(IZ)Z

    return-void

    :cond_7
    new-instance v5, Ljava/io/File;

    iget-object v6, p0, Lp9/e;->l:Landroid/net/Uri;

    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v5

    iput-wide v5, p0, Lp9/e;->s:J

    goto :goto_4

    :cond_8
    iput-wide v3, p0, Lp9/e;->s:J

    :goto_4
    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_9

    const/16 v0, 0x10

    invoke-virtual {p0, v0, v2}, Lp9/e0;->j0(IZ)Z

    return-void

    :cond_9
    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v5

    const/16 v6, 0x20

    if-ne v5, v6, :cond_b

    const/16 v0, 0x100

    invoke-virtual {p0, v0, v2}, Lp9/e0;->j0(IZ)Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to change download task to final state from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    return-void

    :cond_b
    iget-wide v5, p0, Lp9/e;->m:J

    cmp-long v3, v5, v3

    if-gtz v3, :cond_1

    invoke-virtual {p0, v1, v2}, Lp9/e0;->j0(IZ)Z

    return-void
.end method

.method public f0()V
    .locals 2

    invoke-static {}, Lp9/g0;->b()Lp9/g0;

    move-result-object v0

    invoke-virtual {p0}, Lp9/e0;->E()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp9/g0;->g(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic h0()Lp9/e0$a;
    .locals 1

    invoke-virtual {p0}, Lp9/e;->p0()Lp9/e$a;

    move-result-object v0

    return-object v0
.end method

.method public final l0(Ljava/io/InputStream;[B)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, -0x1

    :try_start_0
    array-length v3, p2

    if-eq v0, v3, :cond_0

    array-length v3, p2

    sub-int/2addr v3, v0

    invoke-virtual {p1, p2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v3, v2, :cond_0

    const/4 v1, 0x1

    add-int/2addr v0, v3

    goto :goto_0

    :catch_0
    move-exception p1

    iput-object p1, p0, Lp9/e;->r:Ljava/lang/Exception;

    :cond_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    return v0
.end method

.method public m0()J
    .locals 2

    iget-wide v0, p0, Lp9/e;->p:J

    return-wide v0
.end method

.method public final n0(I)Z
    .locals 1

    const/16 v0, 0x134

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc8

    if-lt p1, v0, :cond_0

    const/16 v0, 0x12c

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final o0(Lr9/e;)Z
    .locals 10

    invoke-virtual {p1}, Lr9/e;->t()Ljava/io/InputStream;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lp9/e;->l:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    const-wide/16 v3, 0x0

    const-string v5, "FileDownloadTask"

    if-nez v2, :cond_1

    iget-wide v6, p0, Lp9/e;->s:J

    cmp-long v2, v6, v3

    if-gtz v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "unable to create file:"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "The file to download to has been deleted."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-wide v6, p0, Lp9/e;->s:J

    cmp-long v2, v6, v3

    const/4 v3, 0x1

    if-lez v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Resuming download file "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " at "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Lp9/e;->s:J

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    :goto_1
    const/high16 v1, 0x40000

    :try_start_0
    new-array v1, v1, [B

    :cond_3
    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {p0, p1, v1}, Lp9/e;->l0(Ljava/io/InputStream;[B)I

    move-result v4

    const/4 v6, -0x1

    if-eq v4, v6, :cond_5

    invoke-virtual {v2, v1, v0, v4}, Ljava/io/OutputStream;->write([BII)V

    iget-wide v6, p0, Lp9/e;->m:J

    int-to-long v8, v4

    add-long/2addr v6, v8

    iput-wide v6, p0, Lp9/e;->m:J

    iget-object v4, p0, Lp9/e;->r:Ljava/lang/Exception;

    if-eqz v4, :cond_4

    const-string v3, "Exception occurred during file download. Retrying."

    iget-object v4, p0, Lp9/e;->r:Ljava/lang/Exception;

    invoke-static {v5, v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v3, 0x0

    iput-object v3, p0, Lp9/e;->r:Ljava/lang/Exception;

    move v3, v0

    :cond_4
    const/4 v4, 0x4

    invoke-virtual {p0, v4, v0}, Lp9/e0;->j0(IZ)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_3

    move v3, v0

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    move v0, v3

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw v0

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to open Firebase Storage stream."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lp9/e;->r:Ljava/lang/Exception;

    :goto_3
    return v0
.end method

.method public p0()Lp9/e$a;
    .locals 6

    new-instance v0, Lp9/e$a;

    iget-object v1, p0, Lp9/e;->r:Ljava/lang/Exception;

    iget v2, p0, Lp9/e;->t:I

    invoke-static {v1, v2}, Lp9/n;->e(Ljava/lang/Throwable;I)Lp9/n;

    move-result-object v1

    iget-wide v2, p0, Lp9/e;->m:J

    iget-wide v4, p0, Lp9/e;->s:J

    add-long/2addr v2, v4

    invoke-direct {v0, p0, v1, v2, v3}, Lp9/e$a;-><init>(Lp9/e;Ljava/lang/Exception;J)V

    return-object v0
.end method
