.class public final Lcom/google/android/gms/measurement/a;
.super Lcom/google/android/gms/measurement/AppMeasurement$a;
.source ""


# instance fields
.field public final a:Lc7/k6;

.field public final b:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/k6;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/AppMeasurement$a;-><init>(La7/a;)V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/a;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lc7/w7;->T(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    invoke-virtual {v0, p1, p2}, Lc7/w7;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    invoke-virtual {v0, p1, p2, p3}, Lc7/w7;->y(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    invoke-virtual {v0, p1, p2, p3}, Lc7/w7;->w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)I
    .locals 0

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const/16 p1, 0x19

    return p1
.end method

.method public final zza()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0}, Lc7/qc;->K0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zza(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    invoke-virtual {v0, p1}, Lc7/w7;->s0(Landroid/os/Bundle;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->t()Lc7/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/a;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->b()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lc7/b0;->u(Ljava/lang/String;J)V

    return-void
.end method

.method public final zzc(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->t()Lc7/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/a;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->b()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lc7/b0;->y(Ljava/lang/String;J)V

    return-void
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    invoke-virtual {v0}, Lc7/w7;->e0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    invoke-virtual {v0}, Lc7/w7;->f0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    invoke-virtual {v0}, Lc7/w7;->g0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/a;->b:Lc7/w7;

    invoke-virtual {v0}, Lc7/w7;->e0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
