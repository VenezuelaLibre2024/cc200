.class final Lcom/google/android/gms/internal/measurement/zzdf$zzc;
.super Lcom/google/android/gms/internal/measurement/zzcz;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzdf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zzc"
.end annotation


# instance fields
.field private final zza:Lc7/s7;


# direct methods
.method public constructor <init>(Lc7/s7;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzcz;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf$zzc;->zza:Lc7/s7;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf$zzc;->zza:Lc7/s7;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf$zzc;->zza:Lc7/s7;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lc7/s7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method
