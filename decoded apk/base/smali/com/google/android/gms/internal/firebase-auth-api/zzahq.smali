.class final Lcom/google/android/gms/internal/firebase-auth-api/zzahq;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzahw;
.source ""


# instance fields
.field private final zzc:I

.field private final zzd:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahw;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zza(III)I

    iput p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahq;->zzc:I

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahq;->zzd:I

    return-void
.end method


# virtual methods
.method public final zza(I)B
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzb()I

    move-result v0

    add-int/lit8 v1, p1, 0x1

    sub-int v1, v0, v1

    or-int/2addr v1, p1

    if-gez v1, :cond_1

    if-gez p1, :cond_0

    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Index < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Index > length: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahw;->zzb:[B

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahq;->zzc:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final zza([BIII)V
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahw;->zzb:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzahw;->zzh()I

    move-result p3

    const/4 v0, 0x0

    invoke-static {p2, p3, p1, v0, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final zzb(I)B
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahw;->zzb:[B

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahq;->zzc:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahq;->zzd:I

    return v0
.end method

.method public final zzh()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahq;->zzc:I

    return v0
.end method
