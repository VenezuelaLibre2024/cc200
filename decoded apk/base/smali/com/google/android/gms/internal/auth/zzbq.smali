.class final Lcom/google/android/gms/internal/auth/zzbq;
.super Lcom/google/android/gms/internal/auth/zzbi;
.source ""


# instance fields
.field public final synthetic zza:Lz5/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/auth/zzbt;Lf6/f;Lz5/b;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/auth/zzbq;->zza:Lz5/b;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/auth/zzbi;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/content/Context;Lcom/google/android/gms/internal/auth/zzbh;)V
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/auth/zzbp;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/auth/zzbp;-><init>(Lcom/google/android/gms/internal/auth/zzbq;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzbq;->zza:Lz5/b;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/auth/zzbh;->zze(Lcom/google/android/gms/internal/auth/zzbg;Lz5/b;)V

    return-void
.end method
