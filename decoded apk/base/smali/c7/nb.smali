.class public final Lc7/nb;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:J

.field public b:J

.field public final c:Lc7/u;

.field public final synthetic d:Lc7/gb;


# direct methods
.method public constructor <init>(Lc7/gb;)V
    .locals 2

    iput-object p1, p0, Lc7/nb;->d:Lc7/gb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc7/mb;

    iget-object v1, p1, Lc7/j7;->a:Lc7/k6;

    invoke-direct {v0, p0, v1}, Lc7/mb;-><init>(Lc7/nb;Lc7/l7;)V

    iput-object v0, p0, Lc7/nb;->c:Lc7/u;

    invoke-virtual {p1}, Lc7/j7;->zzb()Lo6/d;

    move-result-object p1

    invoke-interface {p1}, Lo6/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lc7/nb;->a:J

    iput-wide v0, p0, Lc7/nb;->b:J

    return-void
.end method

.method public static synthetic c(Lc7/nb;)V
    .locals 3

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->b()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v2, v0, v1}, Lc7/nb;->d(ZZJ)Z

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/f4;->j()Lc7/b0;

    move-result-object v0

    iget-object p0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object p0

    invoke-interface {p0}, Lo6/d;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc7/b0;->q(J)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    iget-wide v0, p0, Lc7/nb;->b:J

    sub-long v0, p1, v0

    iput-wide p1, p0, Lc7/nb;->b:J

    return-wide v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lc7/nb;->c:Lc7/u;

    invoke-virtual {v0}, Lc7/u;->a()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lc7/nb;->a:J

    iput-wide v0, p0, Lc7/nb;->b:J

    return-void
.end method

.method public final d(ZZJ)Z
    .locals 4

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/e3;->q()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoj;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->n0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    iget-object v0, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->r:Lc7/n5;

    iget-object v1, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v1}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc7/n5;->b(J)V

    :cond_1
    iget-wide v0, p0, Lc7/nb;->a:J

    sub-long v0, p3, v0

    if-nez p1, :cond_2

    const-wide/16 v2, 0x3e8

    cmp-long p1, v0, v2

    if-gez p1, :cond_2

    iget-object p1, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "Screen exposed for less than 1000 ms. Event not sent. time"

    invoke-virtual {p1, p3, p2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_2
    if-nez p2, :cond_3

    invoke-virtual {p0, p3, p4}, Lc7/nb;->a(J)J

    move-result-wide v0

    :cond_3
    iget-object p1, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Recording user engagement, ms"

    invoke-virtual {p1, v3, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "_et"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    invoke-virtual {v0}, Lc7/h;->M()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v2}, Lc7/f4;->n()Lc7/p9;

    move-result-object v2

    invoke-virtual {v2, v0}, Lc7/p9;->x(Z)Lc7/q9;

    move-result-object v0

    invoke-static {v0, p1, v1}, Lc7/qc;->L(Lc7/q9;Landroid/os/Bundle;Z)V

    if-nez p2, :cond_4

    iget-object p2, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {p2}, Lc7/f4;->m()Lc7/w7;

    move-result-object p2

    const-string v0, "auto"

    const-string v2, "_e"

    invoke-virtual {p2, v0, v2, p1}, Lc7/w7;->x0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    iput-wide p3, p0, Lc7/nb;->a:J

    iget-object p1, p0, Lc7/nb;->c:Lc7/u;

    invoke-virtual {p1}, Lc7/u;->a()V

    iget-object p1, p0, Lc7/nb;->c:Lc7/u;

    const-wide/32 p2, 0x36ee80

    invoke-virtual {p1, p2, p3}, Lc7/u;->b(J)V

    return v1
.end method

.method public final e(J)V
    .locals 0

    iget-object p1, p0, Lc7/nb;->c:Lc7/u;

    invoke-virtual {p1}, Lc7/u;->a()V

    return-void
.end method

.method public final f(J)V
    .locals 1

    iget-object v0, p0, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/nb;->c:Lc7/u;

    invoke-virtual {v0}, Lc7/u;->a()V

    iput-wide p1, p0, Lc7/nb;->a:J

    iput-wide p1, p0, Lc7/nb;->b:J

    return-void
.end method
