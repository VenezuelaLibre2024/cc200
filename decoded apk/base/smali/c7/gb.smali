.class public final Lc7/gb;
.super Lc7/e3;
.source ""


# instance fields
.field public c:Landroid/os/Handler;

.field public d:Z

.field public final e:Lc7/pb;

.field public final f:Lc7/nb;

.field public final g:Lc7/hb;


# direct methods
.method public constructor <init>(Lc7/k6;)V
    .locals 0

    invoke-direct {p0, p1}, Lc7/e3;-><init>(Lc7/k6;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lc7/gb;->d:Z

    new-instance p1, Lc7/pb;

    invoke-direct {p1, p0}, Lc7/pb;-><init>(Lc7/gb;)V

    iput-object p1, p0, Lc7/gb;->e:Lc7/pb;

    new-instance p1, Lc7/nb;

    invoke-direct {p1, p0}, Lc7/nb;-><init>(Lc7/gb;)V

    iput-object p1, p0, Lc7/gb;->f:Lc7/nb;

    new-instance p1, Lc7/hb;

    invoke-direct {p1, p0}, Lc7/hb;-><init>(Lc7/gb;)V

    iput-object p1, p0, Lc7/gb;->g:Lc7/hb;

    return-void
.end method

.method public static synthetic C(Lc7/gb;)V
    .locals 0

    invoke-virtual {p0}, Lc7/gb;->B()V

    return-void
.end method

.method public static synthetic D(Lc7/gb;J)V
    .locals 3

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/gb;->B()V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Activity resumed, time"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->N0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    invoke-virtual {v0}, Lc7/h;->M()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lc7/gb;->d:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    invoke-virtual {v0}, Lc7/h;->M()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->u:Lc7/l5;

    invoke-virtual {v0}, Lc7/l5;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    :goto_0
    iget-object v0, p0, Lc7/gb;->f:Lc7/nb;

    invoke-virtual {v0, p1, p2}, Lc7/nb;->f(J)V

    :cond_2
    iget-object p1, p0, Lc7/gb;->g:Lc7/hb;

    invoke-virtual {p1}, Lc7/hb;->a()V

    iget-object p0, p0, Lc7/gb;->e:Lc7/pb;

    iget-object p1, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p1}, Lc7/j7;->i()V

    iget-object p1, p0, Lc7/pb;->a:Lc7/gb;

    iget-object p1, p1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->k()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p1}, Lc7/j7;->zzb()Lo6/d;

    move-result-object p1

    invoke-interface {p1}, Lo6/d;->a()J

    move-result-wide p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lc7/pb;->b(JZ)V

    :cond_3
    return-void
.end method

.method public static bridge synthetic w(Lc7/gb;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lc7/gb;->c:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic x(Lc7/gb;J)V
    .locals 3

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/gb;->B()V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Activity paused, time"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lc7/gb;->g:Lc7/hb;

    invoke-virtual {v0, p1, p2}, Lc7/hb;->b(J)V

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    invoke-virtual {v0}, Lc7/h;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lc7/gb;->f:Lc7/nb;

    invoke-virtual {p0, p1, p2}, Lc7/nb;->e(J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    invoke-virtual {p0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/gb;->d:Z

    return v0
.end method

.method public final B()V
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/gb;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcp;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcp;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lc7/gb;->c:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public final bridge synthetic a()Lc7/h;
    .locals 1

    invoke-super {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic c()Lc7/z;
    .locals 1

    invoke-super {p0}, Lc7/j7;->c()Lc7/z;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d()Lc7/u4;
    .locals 1

    invoke-super {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic e()Lc7/i5;
    .locals 1

    invoke-super {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic f()Lc7/qc;
    .locals 1

    invoke-super {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic g()V
    .locals 0

    invoke-super {p0}, Lc7/f4;->g()V

    return-void
.end method

.method public final bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lc7/f4;->h()V

    return-void
.end method

.method public final bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lc7/f4;->i()V

    return-void
.end method

.method public final bridge synthetic j()Lc7/b0;
    .locals 1

    invoke-super {p0}, Lc7/f4;->j()Lc7/b0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic k()Lc7/p4;
    .locals 1

    invoke-super {p0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic l()Lc7/s4;
    .locals 1

    invoke-super {p0}, Lc7/f4;->l()Lc7/s4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic m()Lc7/w7;
    .locals 1

    invoke-super {p0}, Lc7/f4;->m()Lc7/w7;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic n()Lc7/p9;
    .locals 1

    invoke-super {p0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic o()Lc7/y9;
    .locals 1

    invoke-super {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic p()Lc7/gb;
    .locals 1

    invoke-super {p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v0

    return-object v0
.end method

.method public final v()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final y(Z)V
    .locals 0

    invoke-virtual {p0}, Lc7/j7;->i()V

    iput-boolean p1, p0, Lc7/gb;->d:Z

    return-void
.end method

.method public final z(ZZJ)Z
    .locals 1

    iget-object v0, p0, Lc7/gb;->f:Lc7/nb;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc7/nb;->d(ZZJ)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic zza()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzb()Lo6/d;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzd()Lc7/c;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzd()Lc7/c;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzj()Lc7/v4;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzl()Lc7/d6;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    return-object v0
.end method
