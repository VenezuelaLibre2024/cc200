.class public final Lcom/google/android/gms/internal/auth-api-phone/zzv;
.super Lf6/e;
.source ""


# static fields
.field private static final zza:Lf6/a$g;

.field private static final zzb:Lf6/a$a;

.field private static final zzc:Lf6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zza:Lf6/a$g;

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzt;

    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api-phone/zzt;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zzb:Lf6/a$a;

    new-instance v2, Lf6/a;

    const-string v3, "SmsCodeBrowser.API"

    invoke-direct {v2, v3, v1, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zzc:Lf6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zzc:Lf6/a;

    sget-object v1, Lf6/a$d;->d:Lf6/a$d$c;

    sget-object v2, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzv;->zzc:Lf6/a;

    sget-object v1, Lf6/a$d;->d:Lf6/a$d$c;

    sget-object v2, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method


# virtual methods
.method public final startSmsCodeRetriever()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzb:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzs;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzs;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzv;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object v0

    const/16 v1, 0x61e

    invoke-virtual {v0, v1}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object v0

    invoke-virtual {v0}, Lg6/v$a;->a()Lg6/v;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
