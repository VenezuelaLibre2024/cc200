.class public final Lz6/j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz6/d0;


# instance fields
.field public final b:Lcom/google/android/gms/internal/maps/zzap;

.field public final synthetic c:Lz6/c0;


# direct methods
.method public constructor <init>(Lz6/c0;)V
    .locals 0

    iput-object p1, p0, Lz6/j0;->c:Lz6/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lz6/c0;->R(Lz6/c0;)Lcom/google/android/gms/internal/maps/zzap;

    move-result-object p1

    iput-object p1, p0, Lz6/j0;->b:Lcom/google/android/gms/internal/maps/zzap;

    return-void
.end method


# virtual methods
.method public final getTile(III)Lz6/a0;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lz6/j0;->b:Lcom/google/android/gms/internal/maps/zzap;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/maps/zzap;->zzb(III)Lz6/a0;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method
