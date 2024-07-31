.class public abstract Lce/m1;
.super Lce/k0;
.source ""


# instance fields
.field public j:J

.field public k:Z

.field public l:Lhd/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/f<",
            "Lce/d1<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lce/k0;-><init>()V

    return-void
.end method

.method public static synthetic L0(Lce/m1;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lce/m1;->K0(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic Q0(Lce/m1;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lce/m1;->P0(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final K0(Z)V
    .locals 4

    iget-wide v0, p0, Lce/m1;->j:J

    invoke-virtual {p0, p1}, Lce/m1;->M0(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lce/m1;->j:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lce/t0;->a()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-wide v0, p0, Lce/m1;->j:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_1
    iget-boolean p1, p0, Lce/m1;->k:Z

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lce/m1;->shutdown()V

    :cond_4
    return-void
.end method

.method public final M0(Z)J
    .locals 2

    if-eqz p1, :cond_0

    const-wide v0, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    :goto_0
    return-wide v0
.end method

.method public final N0(Lce/d1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/d1<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lce/m1;->l:Lhd/f;

    if-nez v0, :cond_0

    new-instance v0, Lhd/f;

    invoke-direct {v0}, Lhd/f;-><init>()V

    iput-object v0, p0, Lce/m1;->l:Lhd/f;

    :cond_0
    invoke-virtual {v0, p1}, Lhd/f;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public O0()J
    .locals 3

    iget-object v0, p0, Lce/m1;->l:Lhd/f;

    const-wide v1, 0x7fffffffffffffffL

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {v0}, Lhd/f;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public final P0(Z)V
    .locals 4

    iget-wide v0, p0, Lce/m1;->j:J

    invoke-virtual {p0, p1}, Lce/m1;->M0(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lce/m1;->j:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lce/m1;->k:Z

    :cond_0
    return-void
.end method

.method public final R0()Z
    .locals 5

    iget-wide v0, p0, Lce/m1;->j:J

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lce/m1;->M0(Z)J

    move-result-wide v3

    cmp-long v0, v0, v3

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final S0()Z
    .locals 1

    iget-object v0, p0, Lce/m1;->l:Lhd/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhd/f;->isEmpty()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public T0()J
    .locals 2

    invoke-virtual {p0}, Lce/m1;->U0()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final U0()Z
    .locals 2

    iget-object v0, p0, Lce/m1;->l:Lhd/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lhd/f;->q()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/d1;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lce/d1;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public V0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shutdown()V
    .locals 0

    return-void
.end method
