.class public final Lcom/google/android/gms/internal/auth-api/zbag;
.super Lf6/e;
.source ""


# static fields
.field private static final zba:Lf6/a$g;

.field private static final zbb:Lf6/a$a;

.field private static final zbc:Lf6/a;


# instance fields
.field private final zbd:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbag;->zba:Lf6/a$g;

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbad;

    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api/zbad;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbag;->zbb:Lf6/a$a;

    new-instance v2, Lf6/a;

    const-string v3, "Auth.Api.Identity.CredentialSaving.API"

    invoke-direct {v2, v3, v1, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbag;->zbc:Lf6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lx5/q;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbag;->zbc:Lf6/a;

    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbag;->zbd:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx5/q;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbag;->zbc:Lf6/a;

    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbag;->zbd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getStatusFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    return-object p1

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "status"

    invoke-static {p1, v1, v0}, Li6/e;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Li6/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    if-nez p1, :cond_1

    sget-object p1, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    :cond_1
    return-object p1
.end method

.method public final saveAccountLinkingToken(Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lx5/f;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->N(Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;)Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest$a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth-api/zbag;->zbd:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest$a;->f(Ljava/lang/String;)Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest$a;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest$a;->a()Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;

    move-result-object p1

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbas;->zbg:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbab;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbab;-><init>(Lcom/google/android/gms/internal/auth-api/zbag;Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lg6/v$a;->c(Z)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x5ff

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final savePassword(Lx5/g;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/g;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lx5/h;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lx5/g;->K(Lx5/g;)Lx5/g$a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth-api/zbag;->zbd:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lx5/g$a;->c(Ljava/lang/String;)Lx5/g$a;

    invoke-virtual {p1}, Lx5/g$a;->a()Lx5/g;

    move-result-object p1

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbas;->zbe:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbac;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbac;-><init>(Lcom/google/android/gms/internal/auth-api/zbag;Lx5/g;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lg6/v$a;->c(Z)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x600

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
