.class final Lcom/google/android/gms/internal/location/zzca;
.super Lcom/google/android/gms/internal/location/zzcb;
.source ""


# instance fields
.field public final synthetic zza:Lw6/p;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzcc;Lf6/f;Lw6/p;Ljava/lang/String;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/location/zzca;->zza:Lw6/p;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/location/zzcb;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final synthetic doExecute(Lf6/a$b;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzca;->zza:Lw6/p;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "locationSettingsRequest can\'t be null"

    invoke-static {v1, v2}, Lh6/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    new-instance v1, Lcom/google/android/gms/internal/location/zzcr;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/location/zzcr;-><init>(Lg6/d;)V

    const/4 v2, 0x0

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/location/zzo;->zzh(Lw6/p;Lcom/google/android/gms/internal/location/zzs;Ljava/lang/String;)V

    return-void
.end method
