.class final Lcom/google/android/gms/internal/firebase-auth-api/zzar;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzaq;
.source ""


# instance fields
.field private final transient zza:I

.field private final transient zzb:I

.field private final synthetic zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaq;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaq;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zza:I

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzb:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzb:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzz;->zza(II)I

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zza:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzb:I

    return v0
.end method

.method public final synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaq;->zza(II)Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    move-result-object p1

    return-object p1
.end method

.method public final zza()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzal;->zzb()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zza:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzb:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zza(II)Lcom/google/android/gms/internal/firebase-auth-api/zzaq;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzb:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzz;->zza(III)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zza:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaq;->subList(II)Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    return-object p1
.end method

.method public final zzb()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzal;->zzb()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zza:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zze()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzf()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzar;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzal;->zzf()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
