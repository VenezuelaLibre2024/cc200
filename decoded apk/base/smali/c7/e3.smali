.class public abstract Lc7/e3;
.super Lc7/f4;
.source ""


# instance fields
.field public b:Z


# direct methods
.method public constructor <init>(Lc7/k6;)V
    .locals 0

    invoke-direct {p0, p1}, Lc7/f4;-><init>(Lc7/k6;)V

    iget-object p1, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->i()V

    return-void
.end method


# virtual methods
.method public final q()V
    .locals 2

    invoke-virtual {p0}, Lc7/e3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r()V
    .locals 2

    iget-boolean v0, p0, Lc7/e3;->b:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lc7/e3;->v()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->M()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc7/e3;->b:Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final s()V
    .locals 2

    iget-boolean v0, p0, Lc7/e3;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc7/e3;->t()V

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->M()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc7/e3;->b:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t()V
    .locals 0

    return-void
.end method

.method public final u()Z
    .locals 1

    iget-boolean v0, p0, Lc7/e3;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract v()Z
.end method
