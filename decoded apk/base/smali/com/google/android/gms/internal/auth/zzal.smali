.class public final Lcom/google/android/gms/internal/auth/zzal;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu5/b;


# static fields
.field private static final zza:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/internal/auth/zzal;->zza:Lcom/google/android/gms/common/api/Status;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic zza()Lcom/google/android/gms/common/api/Status;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzal;->zza:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method


# virtual methods
.method public final addWorkAccount(Lf6/f;Ljava/lang/String;)Lf6/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Ljava/lang/String;",
            ")",
            "Lf6/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/auth/zzae;

    sget-object v1, Lu5/a;->a:Lf6/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/internal/auth/zzae;-><init>(Lcom/google/android/gms/internal/auth/zzal;Lf6/a;Lf6/f;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final removeWorkAccount(Lf6/f;Landroid/accounts/Account;)Lf6/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Landroid/accounts/Account;",
            ")",
            "Lf6/h<",
            "Lf6/m;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/auth/zzag;

    sget-object v1, Lu5/a;->a:Lf6/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/internal/auth/zzag;-><init>(Lcom/google/android/gms/internal/auth/zzal;Lf6/a;Lf6/f;Landroid/accounts/Account;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final setWorkAuthenticatorEnabled(Lf6/f;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzal;->setWorkAuthenticatorEnabledWithResult(Lf6/f;Z)Lf6/h;

    return-void
.end method

.method public final setWorkAuthenticatorEnabledWithResult(Lf6/f;Z)Lf6/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Z)",
            "Lf6/h<",
            "Lf6/m;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/auth/zzac;

    sget-object v1, Lu5/a;->a:Lf6/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/internal/auth/zzac;-><init>(Lcom/google/android/gms/internal/auth/zzal;Lf6/a;Lf6/f;Z)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method
