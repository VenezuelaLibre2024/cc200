.class abstract Lcom/google/android/gms/internal/measurement/zzdf$zza;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzdf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "zza"
.end annotation


# instance fields
.field public final zza:J

.field public final zzb:J

.field private final zzc:Z

.field private final synthetic zzd:Lcom/google/android/gms/internal/measurement/zzdf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzdf$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzdf;Z)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzd:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zza:Lo6/d;

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zza:J

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zza:Lo6/d;

    invoke-interface {p1}, Lo6/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzb:J

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzc:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzd:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zzc(Lcom/google/android/gms/internal/measurement/zzdf;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzb()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zza()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzd:Lcom/google/android/gms/internal/measurement/zzdf;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzc:Z

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/Exception;ZZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzb()V

    return-void
.end method

.method public abstract zza()V
.end method

.method public zzb()V
    .locals 0

    return-void
.end method
