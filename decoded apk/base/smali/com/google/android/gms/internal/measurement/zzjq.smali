.class public Lcom/google/android/gms/internal/measurement/zzjq;
.super Ljava/io/IOException;
.source ""


# instance fields
.field private zza:Lcom/google/android/gms/internal/measurement/zzkr;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjq;->zza:Lcom/google/android/gms/internal/measurement/zzkr;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/measurement/zzjp;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjp;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjp;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static zzb()Lcom/google/android/gms/internal/measurement/zzjq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjq;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static zzc()Lcom/google/android/gms/internal/measurement/zzjq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjq;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static zzd()Lcom/google/android/gms/internal/measurement/zzjq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjq;

    const-string v1, "Protocol message had invalid UTF-8."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static zze()Lcom/google/android/gms/internal/measurement/zzjq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjq;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static zzf()Lcom/google/android/gms/internal/measurement/zzjq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjq;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static zzg()Lcom/google/android/gms/internal/measurement/zzjq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjq;

    const-string v1, "Failed to parse the message."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static zzh()Lcom/google/android/gms/internal/measurement/zzjq;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjq;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
