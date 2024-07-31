.class public final Lcom/google/android/gms/internal/auth-api-phone/zzab;
.super Ly5/b;
.source ""


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Ly5/b;-><init>(Landroid/app/Activity;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Ly5/b;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final startSmsRetriever()Lcom/google/android/gms/tasks/Task;
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

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzx;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzx;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzab;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzc:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    const/16 v1, 0x61f

    invoke-virtual {v0, v1}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object v0

    invoke-virtual {v0}, Lg6/v$a;->a()Lg6/v;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final startSmsUserConsent(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzy;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api-phone/zzy;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzab;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Le6/d;

    sget-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zzd:Le6/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1, v0}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x620

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
