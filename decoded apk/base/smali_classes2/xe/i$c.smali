.class public Lxe/i$c;
.super Lbf/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic k:Lxe/i;


# direct methods
.method public constructor <init>(Lxe/i;)V
    .locals 0

    iput-object p1, p0, Lxe/i$c;->k:Lxe/i;

    invoke-direct {p0}, Lbf/a;-><init>()V

    return-void
.end method


# virtual methods
.method public o(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/net/SocketTimeoutException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public t()V
    .locals 2

    iget-object v0, p0, Lxe/i$c;->k:Lxe/i;

    sget-object v1, Lxe/b;->n:Lxe/b;

    invoke-virtual {v0, v1}, Lxe/i;->f(Lxe/b;)V

    iget-object v0, p0, Lxe/i$c;->k:Lxe/i;

    iget-object v0, v0, Lxe/i;->d:Lxe/f;

    invoke-virtual {v0}, Lxe/f;->v0()V

    return-void
.end method

.method public u()V
    .locals 1

    invoke-virtual {p0}, Lbf/a;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lxe/i$c;->o(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
