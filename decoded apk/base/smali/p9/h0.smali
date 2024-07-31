.class public Lp9/h0;
.super Lp9/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp9/h0$d;,
        Lp9/h0$c;,
        Lp9/h0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp9/e0<",
        "Lp9/h0$d;",
        ">;"
    }
.end annotation


# instance fields
.field public l:Lp9/p;

.field public m:Lq9/c;

.field public volatile n:Ljava/lang/Exception;

.field public volatile o:I

.field public p:Lp9/h0$b;

.field public q:J

.field public r:J

.field public s:J

.field public t:Ljava/io/InputStream;

.field public u:Lr9/e;

.field public v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lp9/p;)V
    .locals 7

    invoke-direct {p0}, Lp9/e0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp9/h0;->n:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lp9/h0;->o:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lp9/h0;->q:J

    iput-object p1, p0, Lp9/h0;->l:Lp9/p;

    invoke-virtual {p1}, Lp9/p;->u()Lp9/f;

    move-result-object p1

    new-instance v6, Lq9/c;

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

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lq9/c;-><init>(Landroid/content/Context;Lx7/b;Lv7/b;J)V

    iput-object v6, p0, Lp9/h0;->m:Lq9/c;

    return-void
.end method

.method public static synthetic l0(Lp9/h0;)Ljava/io/InputStream;
    .locals 0

    invoke-virtual {p0}, Lp9/h0;->o0()Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Lp9/h0;)Lr9/e;
    .locals 0

    iget-object p0, p0, Lp9/h0;->u:Lr9/e;

    return-object p0
.end method

.method public static synthetic n0(Lp9/h0;Lr9/e;)Lr9/e;
    .locals 0

    iput-object p1, p0, Lp9/h0;->u:Lr9/e;

    return-object p1
.end method


# virtual methods
.method public I()Lp9/p;
    .locals 1

    iget-object v0, p0, Lp9/h0;->l:Lp9/p;

    return-object v0
.end method

.method public U()V
    .locals 1

    iget-object v0, p0, Lp9/h0;->m:Lq9/c;

    invoke-virtual {v0}, Lq9/c;->a()V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->q:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0}, Lp9/n;->c(Lcom/google/android/gms/common/api/Status;)Lp9/n;

    move-result-object v0

    iput-object v0, p0, Lp9/h0;->n:Ljava/lang/Exception;

    return-void
.end method

.method public X()V
    .locals 2

    iget-wide v0, p0, Lp9/h0;->r:J

    iput-wide v0, p0, Lp9/h0;->s:J

    return-void
.end method

.method public a0()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d0()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e0()V
    .locals 7

    const-string v0, "StreamDownloadTask"

    iget-object v1, p0, Lp9/h0;->n:Ljava/lang/Exception;

    const/16 v2, 0x40

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2, v3}, Lp9/e0;->j0(IZ)Z

    return-void

    :cond_0
    const/4 v1, 0x4

    invoke-virtual {p0, v1, v3}, Lp9/e0;->j0(IZ)Z

    move-result v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    new-instance v4, Lp9/h0$c;

    new-instance v5, Lp9/h0$a;

    invoke-direct {v5, p0}, Lp9/h0$a;-><init>(Lp9/h0;)V

    invoke-direct {v4, v5, p0}, Lp9/h0$c;-><init>(Ljava/util/concurrent/Callable;Lp9/h0;)V

    new-instance v5, Ljava/io/BufferedInputStream;

    invoke-direct {v5, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v5, p0, Lp9/h0;->t:Ljava/io/InputStream;

    :try_start_0
    invoke-static {v4}, Lp9/h0$c;->a(Lp9/h0$c;)Z

    iget-object v4, p0, Lp9/h0;->p:Lp9/h0$b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v4, :cond_2

    :try_start_1
    invoke-virtual {p0}, Lp9/e0;->g0()Lp9/e0$a;

    move-result-object v5

    check-cast v5, Lp9/h0$d;

    iget-object v6, p0, Lp9/h0;->t:Ljava/io/InputStream;

    invoke-interface {v4, v5, v6}, Lp9/h0$b;->a(Lp9/h0$d;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    :try_start_2
    const-string v5, "Exception occurred calling doInBackground."

    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v4, p0, Lp9/h0;->n:Ljava/lang/Exception;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v5, "Initial opening of Stream failed"

    invoke-static {v0, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v4, p0, Lp9/h0;->n:Ljava/lang/Exception;

    :cond_2
    :goto_0
    iget-object v4, p0, Lp9/h0;->t:Ljava/io/InputStream;

    if-nez v4, :cond_3

    iget-object v4, p0, Lp9/h0;->u:Lr9/e;

    invoke-virtual {v4}, Lr9/e;->C()V

    const/4 v4, 0x0

    iput-object v4, p0, Lp9/h0;->u:Lr9/e;

    :cond_3
    iget-object v4, p0, Lp9/h0;->n:Ljava/lang/Exception;

    if-nez v4, :cond_4

    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v4

    if-ne v4, v1, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    move v4, v3

    :goto_1
    if-eqz v4, :cond_5

    invoke-virtual {p0, v1, v3}, Lp9/e0;->j0(IZ)Z

    const/16 v0, 0x80

    invoke-virtual {p0, v0, v3}, Lp9/e0;->j0(IZ)Z

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v1

    const/16 v4, 0x20

    if-ne v1, v4, :cond_6

    const/16 v2, 0x100

    :cond_6
    invoke-virtual {p0, v2, v3}, Lp9/e0;->j0(IZ)Z

    move-result v1

    if-nez v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to change download task to final state from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_2
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

    invoke-virtual {p0}, Lp9/h0;->s0()Lp9/h0$d;

    move-result-object v0

    return-object v0
.end method

.method public final o0()Ljava/io/InputStream;
    .locals 5

    iget-object v0, p0, Lp9/h0;->m:Lq9/c;

    invoke-virtual {v0}, Lq9/c;->c()V

    iget-object v0, p0, Lp9/h0;->u:Lr9/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lr9/e;->C()V

    :cond_0
    new-instance v0, Lr9/c;

    iget-object v1, p0, Lp9/h0;->l:Lp9/p;

    invoke-virtual {v1}, Lp9/p;->v()Lq9/h;

    move-result-object v1

    iget-object v2, p0, Lp9/h0;->l:Lp9/p;

    invoke-virtual {v2}, Lp9/p;->i()Ln7/g;

    move-result-object v2

    iget-wide v3, p0, Lp9/h0;->r:J

    invoke-direct {v0, v1, v2, v3, v4}, Lr9/c;-><init>(Lq9/h;Ln7/g;J)V

    iput-object v0, p0, Lp9/h0;->u:Lr9/e;

    iget-object v1, p0, Lp9/h0;->m:Lq9/c;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lq9/c;->e(Lr9/e;Z)V

    iget-object v0, p0, Lp9/h0;->u:Lr9/e;

    invoke-virtual {v0}, Lr9/e;->o()I

    move-result v0

    iput v0, p0, Lp9/h0;->o:I

    iget-object v0, p0, Lp9/h0;->u:Lr9/e;

    invoke-virtual {v0}, Lr9/e;->f()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp9/h0;->u:Lr9/e;

    invoke-virtual {v0}, Lr9/e;->f()Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lp9/h0;->n:Ljava/lang/Exception;

    :goto_0
    iput-object v0, p0, Lp9/h0;->n:Ljava/lang/Exception;

    iget v0, p0, Lp9/h0;->o:I

    invoke-virtual {p0, v0}, Lp9/h0;->p0(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lp9/h0;->n:Ljava/lang/Exception;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/4 v2, 0x1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v0, p0, Lp9/h0;->u:Lr9/e;

    const-string v1, "ETag"

    invoke-virtual {v0, v1}, Lr9/e;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lp9/h0;->v:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/16 v0, 0x199

    iput v0, p0, Lp9/h0;->o:I

    new-instance v0, Ljava/io/IOException;

    const-string v1, "The ETag on the server changed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iput-object v0, p0, Lp9/h0;->v:Ljava/lang/String;

    iget-object v0, p0, Lp9/h0;->u:Lr9/e;

    invoke-virtual {v0}, Lr9/e;->r()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lp9/h0;->r:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lp9/h0;->q:J

    iget-object v0, p0, Lp9/h0;->u:Lr9/e;

    invoke-virtual {v0}, Lr9/e;->t()Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Could not open resulting stream."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p0(I)Z
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

.method public q0(J)V
    .locals 4

    iget-wide v0, p0, Lp9/h0;->r:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lp9/h0;->r:J

    iget-wide p1, p0, Lp9/h0;->s:J

    const-wide/32 v2, 0x40000

    add-long/2addr p1, v2

    cmp-long p1, p1, v0

    if-gtz p1, :cond_1

    invoke-virtual {p0}, Lp9/e0;->B()I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lp9/e0;->j0(IZ)Z

    goto :goto_0

    :cond_0
    iget-wide p1, p0, Lp9/h0;->r:J

    iput-wide p1, p0, Lp9/h0;->s:J

    :cond_1
    :goto_0
    return-void
.end method

.method public r0(Lp9/h0$b;)Lp9/h0;
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lp9/h0;->p:Lp9/h0$b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lh6/s;->o(Z)V

    iput-object p1, p0, Lp9/h0;->p:Lp9/h0$b;

    return-object p0
.end method

.method public s0()Lp9/h0$d;
    .locals 4

    new-instance v0, Lp9/h0$d;

    iget-object v1, p0, Lp9/h0;->n:Ljava/lang/Exception;

    iget v2, p0, Lp9/h0;->o:I

    invoke-static {v1, v2}, Lp9/n;->e(Ljava/lang/Throwable;I)Lp9/n;

    move-result-object v1

    iget-wide v2, p0, Lp9/h0;->s:J

    invoke-direct {v0, p0, v1, v2, v3}, Lp9/h0$d;-><init>(Lp9/h0;Ljava/lang/Exception;J)V

    return-object v0
.end method
