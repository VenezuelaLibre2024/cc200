.class public final synthetic Lcom/google/android/gms/internal/location/zzx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/q;


# instance fields
.field public final synthetic zza:Landroid/app/PendingIntent;


# direct methods
.method public synthetic constructor <init>(Landroid/app/PendingIntent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzx;->zza:Landroid/app/PendingIntent;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzx;->zza:Landroid/app/PendingIntent;

    check-cast p1, Lcom/google/android/gms/internal/location/zzf;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v1, Lcom/google/android/gms/internal/location/zzag;->zzb:Lf6/a;

    new-instance v1, Lcom/google/android/gms/internal/location/zzaf;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/location/zzaf;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    const-string p2, "ResultHolder not provided."

    invoke-static {v1, p2}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lg6/s;

    invoke-direct {p2, v1}, Lg6/s;-><init>(Lg6/d;)V

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/location/zzo;->zzl(Landroid/app/PendingIntent;Lg6/g;)V

    return-void
.end method
