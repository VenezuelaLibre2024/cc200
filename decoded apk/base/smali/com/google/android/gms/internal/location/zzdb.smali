.class public final Lcom/google/android/gms/internal/location/zzdb;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/location/zzdb;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:I

.field private final zzb:Landroid/os/IBinder;

.field private final zzc:Landroid/os/IBinder;

.field private final zzd:Landroid/app/PendingIntent;

.field private final zze:Ljava/lang/String;

.field private final zzf:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzdc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzdc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/location/zzdb;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/location/zzdb;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzdb;->zzb:Landroid/os/IBinder;

    iput-object p3, p0, Lcom/google/android/gms/internal/location/zzdb;->zzc:Landroid/os/IBinder;

    iput-object p4, p0, Lcom/google/android/gms/internal/location/zzdb;->zzd:Landroid/app/PendingIntent;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1e

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    :goto_0
    iput-object p5, p0, Lcom/google/android/gms/internal/location/zzdb;->zze:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/location/zzdb;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static zza(Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;
    .locals 7

    new-instance p1, Lcom/google/android/gms/internal/location/zzdb;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    move-object v4, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/location/zzdb;-><init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public static zzb(Landroid/os/IInterface;Lw6/r0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;
    .locals 7

    new-instance p2, Lcom/google/android/gms/internal/location/zzdb;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    move-object v2, p0

    const/4 v1, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p2

    move-object v3, p1

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/location/zzdb;-><init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public static zzc(Landroid/os/IInterface;Lw6/u0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;
    .locals 7

    new-instance p2, Lcom/google/android/gms/internal/location/zzdb;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    move-object v2, p0

    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p2

    move-object v3, p1

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/location/zzdb;-><init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/location/zzdb;->zza:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzdb;->zzb:Landroid/os/IBinder;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzdb;->zzc:Landroid/os/IBinder;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzdb;->zzd:Landroid/app/PendingIntent;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/location/zzdb;->zze:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/location/zzdb;->zzf:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
