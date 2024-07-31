.class public final Lcom/google/android/gms/internal/auth-api/zbaq;
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

    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbaq;->zba:Lf6/a$g;

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbal;

    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api/zbal;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbaq;->zbb:Lf6/a$a;

    new-instance v2, Lf6/a;

    const-string v3, "Auth.Api.Identity.SignIn.API"

    invoke-direct {v2, v3, v1, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbaq;->zbc:Lf6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lx5/c0;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbc:Lf6/a;

    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbd:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx5/c0;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbc:Lf6/a;

    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final beginSignIn(Lx5/b;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/b;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lx5/c;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lx5/b;->O(Lx5/b;)Lx5/b$a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbd:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lx5/b$a;->g(Ljava/lang/String;)Lx5/b$a;

    invoke-virtual {p1}, Lx5/b$a;->a()Lx5/b;

    move-result-object p1

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbas;->zba:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbaj;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbaj;-><init>(Lcom/google/android/gms/internal/auth-api/zbaq;Lx5/b;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lg6/v$a;->c(Z)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x611

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final getPhoneNumberFromIntent(Landroid/content/Intent;)Ljava/lang/String;
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

    const-string v0, "phone_number_hint_result"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

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

.method public final getPhoneNumberHintIntent(Lx5/d;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbas;->zbh:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbah;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbah;-><init>(Lcom/google/android/gms/internal/auth-api/zbaq;Lx5/d;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x675

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final getSignInCredentialFromIntent(Landroid/content/Intent;)Lx5/i;
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

    sget-object v0, Lx5/i;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "sign_in_credential"

    invoke-static {p1, v1, v0}, Li6/e;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Li6/d;

    move-result-object p1

    check-cast p1, Lx5/i;

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

.method public final getSignInIntent(Lx5/e;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/e;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lx5/e;->N(Lx5/e;)Lx5/e$a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbd:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lx5/e$a;->f(Ljava/lang/String;)Lx5/e$a;

    invoke-virtual {p1}, Lx5/e$a;->a()Lx5/e;

    move-result-object p1

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbas;->zbf:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbak;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api/zbak;-><init>(Lcom/google/android/gms/internal/auth-api/zbaq;Lx5/e;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x613

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final signOut()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lf6/e;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.gms.signin"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Lf6/f;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf6/f;

    invoke-virtual {v1}, Lf6/f;->g()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lg6/f;->a()V

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v3, Lcom/google/android/gms/internal/auth-api/zbas;->zbb:Le6/d;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbai;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api/zbai;-><init>(Lcom/google/android/gms/internal/auth-api/zbaq;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lg6/v$a;->c(Z)Lg6/v$a;

    move-result-object v0

    const/16 v1, 0x612

    invoke-virtual {v0, v1}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object v0

    invoke-virtual {v0}, Lg6/v$a;->a()Lg6/v;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zba(Lx5/d;Lcom/google/android/gms/internal/auth-api/zbar;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbap;

    invoke-direct {v0, p0, p3}, Lcom/google/android/gms/internal/auth-api/zbap;-><init>(Lcom/google/android/gms/internal/auth-api/zbaq;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p2}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/auth-api/zbw;

    iget-object p3, p0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbd:Ljava/lang/String;

    invoke-virtual {p2, v0, p1, p3}, Lcom/google/android/gms/internal/auth-api/zbw;->zbd(Lcom/google/android/gms/internal/auth-api/zbp;Lx5/d;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic zbb(Lcom/google/android/gms/internal/auth-api/zbar;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth-api/zban;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/auth-api/zban;-><init>(Lcom/google/android/gms/internal/auth-api/zbaq;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbw;

    iget-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbaq;->zbd:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/auth-api/zbw;->zbf(Lg6/g;Ljava/lang/String;)V

    return-void
.end method
