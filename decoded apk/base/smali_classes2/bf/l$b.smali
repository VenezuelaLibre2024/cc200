.class public final Lbf/l$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbf/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/l;->h(Ljava/io/InputStream;Lbf/u;)Lbf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lbf/u;

.field public final synthetic i:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Lbf/u;Ljava/io/InputStream;)V
    .locals 0

    iput-object p1, p0, Lbf/l$b;->h:Lbf/u;

    iput-object p2, p0, Lbf/l$b;->i:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public T(Lbf/c;J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_3

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lbf/l$b;->h:Lbf/u;

    invoke-virtual {v0}, Lbf/u;->f()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lbf/c;->l0(I)Lbf/p;

    move-result-object v0

    iget v1, v0, Lbf/p;->c:I

    rsub-int v1, v1, 0x2000

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    iget-object p3, p0, Lbf/l$b;->i:Ljava/io/InputStream;

    iget-object v1, v0, Lbf/p;->a:[B

    iget v2, v0, Lbf/p;->c:I

    invoke-virtual {p3, v1, v2, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_1

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_1
    iget p3, v0, Lbf/p;->c:I

    add-int/2addr p3, p2

    iput p3, v0, Lbf/p;->c:I

    iget-wide v0, p1, Lbf/c;->i:J

    int-to-long p2, p2

    add-long/2addr v0, p2

    iput-wide v0, p1, Lbf/c;->i:J
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p2

    :catch_0
    move-exception p1

    invoke-static {p1}, Lbf/l;->c(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Lbf/u;
    .locals 1

    iget-object v0, p0, Lbf/l$b;->h:Lbf/u;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lbf/l$b;->i:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "source("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbf/l$b;->i:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
