.class public final synthetic Lc7/kb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/lb;


# direct methods
.method public synthetic constructor <init>(Lc7/lb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/kb;->h:Lc7/lb;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lc7/kb;->h:Lc7/lb;

    iget-object v1, v0, Lc7/lb;->j:Lc7/hb;

    iget-wide v5, v0, Lc7/lb;->h:J

    iget-wide v2, v0, Lc7/lb;->i:J

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v4, "Application going to the background"

    invoke-virtual {v0, v4}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->u:Lc7/l5;

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lc7/l5;->a(Z)V

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0, v4}, Lc7/gb;->y(Z)V

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    invoke-virtual {v0}, Lc7/h;->M()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    iget-object v0, v0, Lc7/gb;->f:Lc7/nb;

    invoke-virtual {v0, v2, v3}, Lc7/nb;->e(J)V

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v4, v2, v3}, Lc7/gb;->z(ZZJ)Z

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v2, Lc7/i0;->G0:Lc7/m4;

    invoke-virtual {v0, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->E()Lc7/x4;

    move-result-object v0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Application backgrounded at: timestamp_millis"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, v1, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/f4;->m()Lc7/w7;

    move-result-object v2

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    const-string v3, "auto"

    const-string v4, "_ab"

    invoke-virtual/range {v2 .. v7}, Lc7/w7;->Q(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    return-void
.end method
