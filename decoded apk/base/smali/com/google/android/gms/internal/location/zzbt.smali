.class final Lcom/google/android/gms/internal/location/zzbt;
.super Lcom/google/android/gms/internal/location/zzbu;
.source ""


# instance fields
.field public final synthetic zza:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzbv;Lf6/f;Ljava/util/List;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/location/zzbt;->zza:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/location/zzbu;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lf6/a$b;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzbt;->zza:Ljava/util/List;

    invoke-static {p0}, Lcom/google/android/gms/internal/location/zzbv;->zza(Lg6/d;)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/location/zzda;->zzy(Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
