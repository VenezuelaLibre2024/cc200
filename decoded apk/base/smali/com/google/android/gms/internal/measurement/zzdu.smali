.class final Lcom/google/android/gms/internal/measurement/zzdu;
.super Lcom/google/android/gms/internal/measurement/zzdf$zza;
.source ""


# instance fields
.field private final synthetic zzc:Ljava/lang/String;

.field private final synthetic zzd:Lcom/google/android/gms/internal/measurement/zzdf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdu;->zzc:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdu;->zzd:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzdf$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdu;->zzd:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf;)Lcom/google/android/gms/internal/measurement/zzcu;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcu;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdu;->zzc:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzdf$zza;->zzb:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzcu;->beginAdUnitExposure(Ljava/lang/String;J)V

    return-void
.end method
