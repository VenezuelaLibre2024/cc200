.class public Lb7/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/a$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/zzdf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/a;->a:Lcom/google/android/gms/internal/measurement/zzdf;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lb7/a;->a:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzdf;->zzb(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public b(Lb7/a$a;)V
    .locals 1

    iget-object v0, p0, Lb7/a;->a:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lc7/r7;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lb7/a;->a:Lcom/google/android/gms/internal/measurement/zzdf;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method public final d(Z)V
    .locals 1

    iget-object v0, p0, Lb7/a;->a:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Z)V

    return-void
.end method
