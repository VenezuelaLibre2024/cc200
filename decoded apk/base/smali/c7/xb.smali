.class public abstract Lc7/xb;
.super Lc7/ub;
.source ""


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 0

    invoke-direct {p0, p1}, Lc7/ub;-><init>(Lc7/yb;)V

    iget-object p1, p0, Lc7/ub;->b:Lc7/yb;

    invoke-virtual {p1}, Lc7/yb;->n0()V

    return-void
.end method


# virtual methods
.method public final p()V
    .locals 2

    invoke-virtual {p0}, Lc7/xb;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q()V
    .locals 2

    iget-boolean v0, p0, Lc7/xb;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc7/xb;->s()Z

    iget-object v0, p0, Lc7/ub;->b:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->m0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc7/xb;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, Lc7/xb;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract s()Z
.end method
