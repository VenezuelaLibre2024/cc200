.class public final Lc7/k8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-boolean p2, p0, Lc7/k8;->h:Z

    iput-object p1, p0, Lc7/k8;->i:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/k8;->i:Lc7/w7;

    iget-object v0, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->k()Z

    move-result v0

    iget-object v1, p0, Lc7/k8;->i:Lc7/w7;

    iget-object v1, v1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->j()Z

    move-result v1

    iget-object v2, p0, Lc7/k8;->i:Lc7/w7;

    iget-object v2, v2, Lc7/j7;->a:Lc7/k6;

    iget-boolean v3, p0, Lc7/k8;->h:Z

    invoke-virtual {v2, v3}, Lc7/k6;->h(Z)V

    iget-boolean v2, p0, Lc7/k8;->h:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lc7/k8;->i:Lc7/w7;

    iget-object v1, v1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    iget-boolean v2, p0, Lc7/k8;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "Default data collection state already set to"

    invoke-virtual {v1, v3, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lc7/k8;->i:Lc7/w7;

    iget-object v1, v1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->k()Z

    move-result v1

    if-eq v1, v0, :cond_1

    iget-object v1, p0, Lc7/k8;->i:Lc7/w7;

    iget-object v1, v1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->k()Z

    move-result v1

    iget-object v2, p0, Lc7/k8;->i:Lc7/w7;

    iget-object v2, v2, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->j()Z

    move-result v2

    if-eq v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, Lc7/k8;->i:Lc7/w7;

    iget-object v1, v1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->H()Lc7/x4;

    move-result-object v1

    iget-boolean v2, p0, Lc7/k8;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v3, "Default data collection is different than actual status"

    invoke-virtual {v1, v3, v2, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lc7/k8;->i:Lc7/w7;

    invoke-static {v0}, Lc7/w7;->u0(Lc7/w7;)V

    return-void
.end method
