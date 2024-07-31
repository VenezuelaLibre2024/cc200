.class public final synthetic Lcom/google/android/gms/internal/location/zzbh;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/q;


# instance fields
.field public final synthetic zza:Lw6/e;

.field public final synthetic zzb:Lcom/google/android/gms/tasks/CancellationToken;


# direct methods
.method public synthetic constructor <init>(Lw6/e;Lcom/google/android/gms/tasks/CancellationToken;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzbh;->zza:Lw6/e;

    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzbh;->zzb:Lcom/google/android/gms/tasks/CancellationToken;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzbh;->zza:Lw6/e;

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzbh;->zzb:Lcom/google/android/gms/tasks/CancellationToken;

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v2, Lcom/google/android/gms/internal/location/zzbp;->zzb:Lf6/a;

    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/location/zzda;->zzs(Lw6/e;Lcom/google/android/gms/tasks/CancellationToken;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
