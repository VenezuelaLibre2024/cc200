.class public final Lcom/google/android/gms/internal/measurement/zzdd;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/measurement/zzdd;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:J

.field public final zzb:J

.field public final zzc:Z

.field public final zzd:Ljava/lang/String;

.field public final zze:Ljava/lang/String;

.field public final zzf:Ljava/lang/String;

.field public final zzg:Landroid/os/Bundle;

.field public final zzh:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzdg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzdd;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zza:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    iput-boolean p5, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzc:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzd:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zze:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzf:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    iput-object p10, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzh:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zza:J

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzc:Z

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzd:Ljava/lang/String;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zze:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzf:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    const/4 v1, 0x7

    invoke-static {p1, v1, v0, v2}, Li6/c;->j(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzh:Ljava/lang/String;

    const/16 v1, 0x8

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
