.class public final synthetic Lcom/google/android/gms/internal/auth/zzbl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/q;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/auth/zzbo;

.field public final synthetic zzb:Lz5/b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth/zzbo;Lz5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzbl;->zza:Lcom/google/android/gms/internal/auth/zzbo;

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/zzbl;->zzb:Lz5/b;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzbl;->zza:Lcom/google/android/gms/internal/auth/zzbo;

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzbl;->zzb:Lz5/b;

    check-cast p1, Lcom/google/android/gms/internal/auth/zzbe;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v2, Lcom/google/android/gms/internal/auth/zzbm;

    invoke-direct {v2, v0, p2}, Lcom/google/android/gms/internal/auth/zzbm;-><init>(Lcom/google/android/gms/internal/auth/zzbo;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/auth/zzbh;

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/auth/zzbh;->zze(Lcom/google/android/gms/internal/auth/zzbg;Lz5/b;)V

    return-void
.end method
