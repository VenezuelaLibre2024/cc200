.class public final Lc7/a7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/rc;

.field public final synthetic i:Lc7/o6;


# direct methods
.method public constructor <init>(Lc7/o6;Lc7/rc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/a7;->h:Lc7/rc;

    iput-object p1, p0, Lc7/a7;->i:Lc7/o6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lc7/a7;->i:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/yb;->k0()V

    iget-object v0, p0, Lc7/a7;->i:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    iget-object v1, p0, Lc7/a7;->h:Lc7/rc;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v2

    invoke-virtual {v2}, Lc7/j7;->i()V

    invoke-virtual {v0}, Lc7/yb;->l0()V

    iget-object v2, v1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v2, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, v1, Lc7/rc;->H:I

    goto :goto_0

    :cond_0
    const/16 v2, 0x64

    :goto_0
    iget-object v3, v1, Lc7/rc;->C:Ljava/lang/String;

    invoke-static {v3, v2}, Lc7/n7;->f(Ljava/lang/String;I)Lc7/n7;

    move-result-object v2

    iget-object v3, v1, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v3

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->F()Lc7/x4;

    move-result-object v4

    iget-object v5, v1, Lc7/rc;->h:Ljava/lang/String;

    const-string v6, "Setting consent, package, consent"

    invoke-virtual {v4, v6, v5, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v1, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v0, v4, v2}, Lc7/yb;->w(Ljava/lang/String;Lc7/n7;)V

    invoke-virtual {v2, v3}, Lc7/n7;->t(Lc7/n7;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Lc7/yb;->X(Lc7/rc;)V

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lc7/yb;->Y()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v2, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v1, Lc7/rc;->I:Ljava/lang/String;

    invoke-static {v2}, Lc7/w;->c(Ljava/lang/String;)Lc7/w;

    move-result-object v2

    sget-object v3, Lc7/w;->f:Lc7/w;

    invoke-virtual {v3, v2}, Lc7/w;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->F()Lc7/x4;

    move-result-object v3

    iget-object v4, v1, Lc7/rc;->h:Ljava/lang/String;

    const-string v5, "Setting DMA consent. package, consent"

    invoke-virtual {v3, v5, v4, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v1, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lc7/yb;->v(Ljava/lang/String;Lc7/w;)V

    :cond_2
    return-void
.end method
