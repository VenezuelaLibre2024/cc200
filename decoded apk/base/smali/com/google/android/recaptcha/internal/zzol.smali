.class public final Lcom/google/android/recaptcha/internal/zzol;
.super Lcom/google/android/recaptcha/internal/zzit;
.source ""

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzkf;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzol;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:J

.field private zzg:I

.field private zzh:Lcom/google/android/recaptcha/internal/zzjb;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzol;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzol;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzol;->zzb:Lcom/google/android/recaptcha/internal/zzol;

    const-class v1, Lcom/google/android/recaptcha/internal/zzol;

    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zzit;->zzD(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zzit;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzit;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzol;->zze:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzit;->zzx()Lcom/google/android/recaptcha/internal/zzjb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzol;->zzh:Lcom/google/android/recaptcha/internal/zzjb;

    return-void
.end method

.method public static synthetic zzf()Lcom/google/android/recaptcha/internal/zzol;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzol;->zzb:Lcom/google/android/recaptcha/internal/zzol;

    return-object v0
.end method

.method public static zzg(Ljava/io/InputStream;)Lcom/google/android/recaptcha/internal/zzol;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzol;->zzb:Lcom/google/android/recaptcha/internal/zzol;

    invoke-static {v0, p0}, Lcom/google/android/recaptcha/internal/zzit;->zzt(Lcom/google/android/recaptcha/internal/zzit;Ljava/io/InputStream;)Lcom/google/android/recaptcha/internal/zzit;

    move-result-object p0

    check-cast p0, Lcom/google/android/recaptcha/internal/zzol;

    return-object p0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/recaptcha/internal/zzol;->zzb:Lcom/google/android/recaptcha/internal/zzol;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzok;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzok;-><init>(Lcom/google/android/recaptcha/internal/zzoh;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/recaptcha/internal/zzol;

    invoke-direct {p1}, Lcom/google/android/recaptcha/internal/zzol;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-class p2, Lcom/google/android/recaptcha/internal/zzon;

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/recaptcha/internal/zzol;->zzb:Lcom/google/android/recaptcha/internal/zzol;

    const-string p3, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u1208\u0000\u0002\u1002\u0001\u0004\u100c\u0002\u0005\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/recaptcha/internal/zzit;->zzA(Lcom/google/android/recaptcha/internal/zzke;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzol;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final zzj()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzol;->zzh:Lcom/google/android/recaptcha/internal/zzjb;

    return-object v0
.end method
