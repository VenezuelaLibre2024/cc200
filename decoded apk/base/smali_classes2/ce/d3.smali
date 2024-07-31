.class public final Lce/d3;
.super Ljava/util/concurrent/CancellationException;
.source ""

# interfaces
.implements Lce/i0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/CancellationException;",
        "Lce/i0<",
        "Lce/d3;",
        ">;"
    }
.end annotation


# instance fields
.field public final transient h:Lce/c2;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lce/d3;-><init>(Ljava/lang/String;Lce/c2;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lce/c2;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lce/d3;->h:Lce/c2;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lce/d3;->b()Lce/d3;

    move-result-object v0

    return-object v0
.end method

.method public b()Lce/d3;
    .locals 3

    new-instance v0, Lce/d3;

    invoke-virtual {p0}, Ljava/util/concurrent/CancellationException;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    iget-object v2, p0, Lce/d3;->h:Lce/c2;

    invoke-direct {v0, v1, v2}, Lce/d3;-><init>(Ljava/lang/String;Lce/c2;)V

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CancellationException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method
