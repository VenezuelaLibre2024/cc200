.class public final Lue/c$b;
.super Lbf/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lue/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final i:J

.field public j:J

.field public k:Z

.field public l:Z

.field public final synthetic m:Lue/c;


# direct methods
.method public constructor <init>(Lue/c;Lbf/t;J)V
    .locals 0

    iput-object p1, p0, Lue/c$b;->m:Lue/c;

    invoke-direct {p0, p2}, Lbf/h;-><init>(Lbf/t;)V

    iput-wide p3, p0, Lue/c$b;->i:J

    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lue/c$b;->d(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_0
    return-void
.end method


# virtual methods
.method public T(Lbf/c;J)J
    .locals 7

    iget-boolean v0, p0, Lue/c$b;->l:Z

    if-nez v0, :cond_4

    :try_start_0
    invoke-virtual {p0}, Lbf/h;->a()Lbf/t;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lbf/t;->T(Lbf/c;J)J

    move-result-wide p1

    const-wide/16 v0, -0x1

    cmp-long p3, p1, v0

    const/4 v2, 0x0

    if-nez p3, :cond_0

    invoke-virtual {p0, v2}, Lue/c$b;->d(Ljava/io/IOException;)Ljava/io/IOException;

    return-wide v0

    :cond_0
    iget-wide v3, p0, Lue/c$b;->j:J

    add-long/2addr v3, p1

    iget-wide v5, p0, Lue/c$b;->i:J

    cmp-long p3, v5, v0

    if-eqz p3, :cond_2

    cmp-long p3, v3, v5

    if-gtz p3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lue/c$b;->i:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " bytes but received "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-wide v3, p0, Lue/c$b;->j:J

    cmp-long p3, v3, v5

    if-nez p3, :cond_3

    invoke-virtual {p0, v2}, Lue/c$b;->d(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-wide p1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lue/c$b;->d(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 1

    iget-boolean v0, p0, Lue/c$b;->l:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lue/c$b;->l:Z

    :try_start_0
    invoke-super {p0}, Lbf/h;->close()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lue/c$b;->d(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lue/c$b;->d(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public d(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 7

    iget-boolean v0, p0, Lue/c$b;->k:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lue/c$b;->k:Z

    iget-object v1, p0, Lue/c$b;->m:Lue/c;

    iget-wide v2, p0, Lue/c$b;->j:J

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, Lue/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method
