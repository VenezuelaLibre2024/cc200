.class public final Lcom/google/android/recaptcha/internal/zzaf;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzaf;

.field private static final zzb:Ljava/lang/String;

.field private static final zzc:Le6/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzaf;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzaf;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzaf;->zza:Lcom/google/android/recaptcha/internal/zzaf;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/recaptcha/internal/zzaf;->zzb:Ljava/lang/String;

    invoke-static {}, Le6/f;->f()Le6/f;

    move-result-object v0

    sput-object v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:Le6/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final zza(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:Le6/f;

    invoke-virtual {v0, p0}, Le6/f;->g(Landroid/content/Context;)I

    move-result p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    const-string p0, "ANDROID_ONPLAY"

    return-object p0

    :cond_0
    const-string p0, "ANDROID_OFFPLAY"

    return-object p0
.end method
