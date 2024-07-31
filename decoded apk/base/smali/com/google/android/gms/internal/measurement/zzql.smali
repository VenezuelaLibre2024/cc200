.class public final Lcom/google/android/gms/internal/measurement/zzql;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh7/u<",
        "Lcom/google/android/gms/internal/measurement/zzqk;",
        ">;"
    }
.end annotation


# static fields
.field private static zza:Lcom/google/android/gms/internal/measurement/zzql;


# instance fields
.field private final zzb:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Lcom/google/android/gms/internal/measurement/zzqk;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzql;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzql;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzql;->zza:Lcom/google/android/gms/internal/measurement/zzql;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzqm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzqm;-><init>()V

    invoke-static {v0}, Lh7/v;->b(Ljava/lang/Object;)Lh7/u;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzql;->zzb:Lh7/u;

    return-void
.end method

.method public static zza()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzql;->zza:Lcom/google/android/gms/internal/measurement/zzql;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzql;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzqk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzqk;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzql;->zzb:Lh7/u;

    invoke-interface {v0}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzqk;

    return-object v0
.end method
