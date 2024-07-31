.class public final synthetic Lcom/google/android/gms/internal/location/zzcf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnTokenCanceledListener;


# instance fields
.field public final synthetic zza:Lh6/l;


# direct methods
.method public synthetic constructor <init>(Lh6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzcf;->zza:Lh6/l;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzcf;->zza:Lh6/l;

    sget v1, Lcom/google/android/gms/internal/location/zzda;->zze:I

    :try_start_0
    invoke-interface {v0}, Lh6/l;->cancel()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
