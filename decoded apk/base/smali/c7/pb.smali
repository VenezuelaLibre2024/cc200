.class public final Lc7/pb;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final synthetic a:Lc7/gb;


# direct methods
.method public constructor <init>(Lc7/gb;)V
    .locals 0

    iput-object p1, p0, Lc7/pb;->a:Lc7/gb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v1, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v1}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc7/i5;->t(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->n:Lc7/l5;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc7/l5;->a(Z)V

    new-instance v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {v0}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Detected application was in foreground"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lc7/pb;->c(JZ)V

    :cond_0
    return-void
.end method

.method public final b(JZ)V
    .locals 2

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-static {v0}, Lc7/gb;->C(Lc7/gb;)V

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc7/i5;->t(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->n:Lc7/l5;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc7/l5;->a(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpt;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->s0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p4;->D()V

    :cond_0
    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->r:Lc7/n5;

    invoke-virtual {v0, p1, p2}, Lc7/n5;->b(J)V

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->n:Lc7/l5;

    invoke-virtual {v0}, Lc7/l5;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lc7/pb;->c(JZ)V

    :cond_1
    return-void
.end method

.method public final c(JZ)V
    .locals 8

    iget-object p3, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p3}, Lc7/j7;->i()V

    iget-object p3, p0, Lc7/pb;->a:Lc7/gb;

    iget-object p3, p3, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->k()Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    iget-object p3, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p3}, Lc7/j7;->e()Lc7/i5;

    move-result-object p3

    iget-object p3, p3, Lc7/i5;->r:Lc7/n5;

    invoke-virtual {p3, p1, p2}, Lc7/n5;->b(J)V

    iget-object p3, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p3}, Lc7/j7;->zzb()Lo6/d;

    move-result-object p3

    invoke-interface {p3}, Lo6/d;->b()J

    move-result-wide v0

    iget-object p3, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p3}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->F()Lc7/x4;

    move-result-object p3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Session started, time"

    invoke-virtual {p3, v1, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x3e8

    div-long v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/f4;->m()Lc7/w7;

    move-result-object v2

    const-string v3, "auto"

    const-string v4, "_sid"

    move-object v5, p3

    move-wide v6, p1

    invoke-virtual/range {v2 .. v7}, Lc7/w7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->s:Lc7/n5;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc7/n5;->b(J)V

    iget-object v0, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->n:Lc7/l5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc7/l5;->a(Z)V

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-string p3, "_sid"

    invoke-virtual {v7, p3, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object p3, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p3}, Lc7/f4;->m()Lc7/w7;

    move-result-object v2

    const-string v3, "auto"

    const-string v4, "_s"

    move-wide v5, p1

    invoke-virtual/range {v2 .. v7}, Lc7/w7;->Q(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    iget-object p3, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p3}, Lc7/j7;->e()Lc7/i5;

    move-result-object p3

    iget-object p3, p3, Lc7/i5;->x:Lc7/o5;

    invoke-virtual {p3}, Lc7/o5;->a()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_ffr"

    invoke-virtual {v6, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lc7/pb;->a:Lc7/gb;

    invoke-virtual {p3}, Lc7/f4;->m()Lc7/w7;

    move-result-object v1

    const-string v2, "auto"

    const-string v3, "_ssr"

    move-wide v4, p1

    invoke-virtual/range {v1 .. v6}, Lc7/w7;->Q(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    :cond_1
    return-void
.end method
