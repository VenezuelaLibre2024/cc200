.class final synthetic Lcom/google/android/gms/internal/measurement/zzkh;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic zza:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzlg;->values()[Lcom/google/android/gms/internal/measurement/zzlg;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzkh;->zza:[I

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzlg;->zzb:Lcom/google/android/gms/internal/measurement/zzlg;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
