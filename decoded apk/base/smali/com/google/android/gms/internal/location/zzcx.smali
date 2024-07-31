.class final Lcom/google/android/gms/internal/location/zzcx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/j$b;


# instance fields
.field public final synthetic zza:Landroid/location/Location;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzcz;Landroid/location/Location;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzcx;->zza:Landroid/location/Location;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic notifyListener(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lw6/n;

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzcx;->zza:Landroid/location/Location;

    invoke-interface {p1, v0}, Lw6/n;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method public final onNotifyListenerFailed()V
    .locals 0

    return-void
.end method
