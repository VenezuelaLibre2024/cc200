.class public final synthetic Lcom/google/android/gms/internal/location/zzba;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/q;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/location/zzba;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzba;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzba;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/location/zzba;->zza:Lcom/google/android/gms/internal/location/zzba;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v0, Lcom/google/android/gms/internal/location/zzbp;->zzb:Lf6/a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/location/zzda;->zzp()Lcom/google/android/gms/location/LocationAvailability;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method
