.class public final synthetic Lcom/google/android/gms/internal/location/zzac;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/q;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/location/zzag;

.field public final synthetic zzb:Landroid/app/PendingIntent;

.field public final synthetic zzc:Lw6/v;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/location/zzag;Landroid/app/PendingIntent;Lw6/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzac;->zza:Lcom/google/android/gms/internal/location/zzag;

    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzac;->zzb:Landroid/app/PendingIntent;

    iput-object p3, p0, Lcom/google/android/gms/internal/location/zzac;->zzc:Lw6/v;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzac;->zza:Lcom/google/android/gms/internal/location/zzag;

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzac;->zzb:Landroid/app/PendingIntent;

    iget-object v2, p0, Lcom/google/android/gms/internal/location/zzac;->zzc:Lw6/v;

    check-cast p1, Lcom/google/android/gms/internal/location/zzf;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v3, Lcom/google/android/gms/internal/location/zzae;

    invoke-direct {v3, v0, p2}, Lcom/google/android/gms/internal/location/zzae;-><init>(Lcom/google/android/gms/internal/location/zzag;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    invoke-interface {p1, v1, v2, v3}, Lcom/google/android/gms/internal/location/zzo;->zzt(Landroid/app/PendingIntent;Lw6/v;Lg6/g;)V

    return-void
.end method
