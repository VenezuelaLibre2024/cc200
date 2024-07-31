.class final Lcom/google/android/gms/internal/location/zzct;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/j$b;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/location/LocationResult;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzcw;Lcom/google/android/gms/location/LocationResult;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzct;->zza:Lcom/google/android/gms/location/LocationResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic notifyListener(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lw6/m;

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzct;->zza:Lcom/google/android/gms/location/LocationResult;

    invoke-virtual {p1, v0}, Lw6/m;->onLocationResult(Lcom/google/android/gms/location/LocationResult;)V

    return-void
.end method

.method public final onNotifyListenerFailed()V
    .locals 0

    return-void
.end method
