.class public final Lcom/google/android/gms/internal/auth-api/zbaa;
.super Lf6/e;
.source ""


# static fields
.field private static final zba:Lf6/a$g;

.field private static final zbb:Lf6/a$a;

.field private static final zbc:Lf6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbaa;->zba:Lf6/a$g;

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zby;

    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api/zby;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbaa;->zbb:Lf6/a$a;

    new-instance v2, Lf6/a;

    const-string v3, "Auth.Api.Identity.Authorization.API"

    invoke-direct {v2, v3, v1, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbaa;->zbc:Lf6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lx5/l;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaa;->zbc:Lf6/a;

    invoke-static {p2}, Lx5/k;->c(Lx5/l;)Lx5/k;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lx5/k;->a(Ljava/lang/String;)Lx5/k;

    invoke-virtual {p2}, Lx5/k;->b()Lx5/l;

    move-result-object p2

    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx5/l;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaa;->zbc:Lf6/a;

    invoke-static {p2}, Lx5/k;->c(Lx5/l;)Lx5/k;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lx5/k;->a(Ljava/lang/String;)Lx5/k;

    invoke-virtual {p2}, Lx5/k;->b()Lx5/l;

    move-result-object p2

    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method


# virtual methods
.method public final authorize(Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lx5/a;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->O(Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)Lcom/google/android/gms/auth/api/identity/AuthorizationRequest$a;

    move-result-object p1

    invoke-virtual {p0}, Lf6/e;->getApiOptions()Lf6/a$d;

    move-result-object v0

    check-cast v0, Lx5/l;

    invoke-virtual {v0}, Lx5/l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest$a;->g(Ljava/lang/String;)Lcom/google/android/gms/auth/api/identity/AuthorizationRequest$a;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest$a;->a()Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    move-result-object p1

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbas;->zbc:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbx;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbx;-><init>(Lcom/google/android/gms/internal/auth-api/zbaa;Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lg6/v$a;->c(Z)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x5fe

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final getAuthorizationResultFromIntent(Landroid/content/Intent;)Lx5/a;
    .locals 2

    if-eqz p1, :cond_3

    sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "status"

    invoke-static {p1, v1, v0}, Li6/e;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Li6/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->N()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lx5/a;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "authorization_result"

    invoke-static {p1, v1, v0}, Li6/e;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Li6/d;

    move-result-object p1

    check-cast p1, Lx5/a;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lf6/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lf6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_1
    new-instance p1, Lf6/b;

    invoke-direct {p1, v0}, Lf6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_2
    new-instance p1, Lf6/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->q:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lf6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_3
    new-instance p1, Lf6/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lf6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method
