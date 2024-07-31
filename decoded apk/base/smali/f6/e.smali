.class public abstract Lf6/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf6/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lf6/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final zaa:Lg6/f;

.field private final zab:Landroid/content/Context;

.field private final zac:Ljava/lang/String;

.field private final zad:Lf6/a;

.field private final zae:Lf6/a$d;

.field private final zaf:Lg6/b;

.field private final zag:Landroid/os/Looper;

.field private final zah:I

.field private final zai:Lf6/f;

.field private final zaj:Lg6/t;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lf6/a<",
            "TO;>;TO;",
            "Lf6/e$a;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lf6/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lg6/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lf6/a<",
            "TO;>;TO;",
            "Lg6/t;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lf6/e$a$a;

    invoke-direct {v0}, Lf6/e$a$a;-><init>()V

    invoke-virtual {v0, p4}, Lf6/e$a$a;->c(Lg6/t;)Lf6/e$a$a;

    invoke-virtual {p1}, Landroid/app/Activity;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-virtual {v0, p4}, Lf6/e$a$a;->b(Landroid/os/Looper;)Lf6/e$a$a;

    invoke-virtual {v0}, Lf6/e$a$a;->a()Lf6/e$a;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    invoke-static {p3, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    invoke-static {p5, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lf6/e;->zab:Landroid/content/Context;

    invoke-static {}, Lo6/m;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getAttributionTag"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    :catch_0
    :cond_0
    iput-object v1, p0, Lf6/e;->zac:Ljava/lang/String;

    iput-object p3, p0, Lf6/e;->zad:Lf6/a;

    iput-object p4, p0, Lf6/e;->zae:Lf6/a$d;

    iget-object p1, p5, Lf6/e$a;->b:Landroid/os/Looper;

    iput-object p1, p0, Lf6/e;->zag:Landroid/os/Looper;

    invoke-static {p3, p4, v1}, Lg6/b;->a(Lf6/a;Lf6/a$d;Ljava/lang/String;)Lg6/b;

    move-result-object p1

    iput-object p1, p0, Lf6/e;->zaf:Lg6/b;

    new-instance p3, Lg6/p0;

    invoke-direct {p3, p0}, Lg6/p0;-><init>(Lf6/e;)V

    iput-object p3, p0, Lf6/e;->zai:Lf6/f;

    iget-object p3, p0, Lf6/e;->zab:Landroid/content/Context;

    invoke-static {p3}, Lg6/f;->y(Landroid/content/Context;)Lg6/f;

    move-result-object p3

    iput-object p3, p0, Lf6/e;->zaa:Lg6/f;

    invoke-virtual {p3}, Lg6/f;->n()I

    move-result p4

    iput p4, p0, Lf6/e;->zah:I

    iget-object p4, p5, Lf6/e$a;->a:Lg6/t;

    iput-object p4, p0, Lf6/e;->zaj:Lg6/t;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    invoke-static {p2, p3, p1}, Lg6/b0;->j(Landroid/app/Activity;Lg6/f;Lg6/b;)V

    :cond_1
    invoke-virtual {p3, p0}, Lg6/f;->c(Lf6/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Landroid/os/Looper;Lg6/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lf6/a<",
            "TO;>;TO;",
            "Landroid/os/Looper;",
            "Lg6/t;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lf6/e$a$a;

    invoke-direct {v0}, Lf6/e$a$a;-><init>()V

    invoke-virtual {v0, p4}, Lf6/e$a$a;->b(Landroid/os/Looper;)Lf6/e$a$a;

    invoke-virtual {v0, p5}, Lf6/e$a$a;->c(Lg6/t;)Lf6/e$a$a;

    invoke-virtual {v0}, Lf6/e$a$a;->a()Lf6/e$a;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lf6/a<",
            "TO;>;TO;",
            "Lf6/e$a;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lf6/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lg6/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lf6/a<",
            "TO;>;TO;",
            "Lg6/t;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lf6/e$a$a;

    invoke-direct {v0}, Lf6/e$a$a;-><init>()V

    invoke-virtual {v0, p4}, Lf6/e$a$a;->c(Lg6/t;)Lf6/e$a$a;

    invoke-virtual {v0}, Lf6/e$a$a;->a()Lf6/e$a;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method private final zad(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zak()V

    iget-object v0, p0, Lf6/e;->zaa:Lg6/f;

    invoke-virtual {v0, p0, p1, p2}, Lg6/f;->H(Lf6/e;ILcom/google/android/gms/common/api/internal/a;)V

    return-object p2
.end method

.method private final zae(ILg6/v;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    new-instance v6, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v0, p0, Lf6/e;->zaa:Lg6/f;

    iget-object v5, p0, Lf6/e;->zaj:Lg6/t;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lg6/f;->I(Lf6/e;ILg6/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Lg6/t;)V

    invoke-virtual {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public asGoogleApiClient()Lf6/f;
    .locals 1

    iget-object v0, p0, Lf6/e;->zai:Lf6/f;

    return-object v0
.end method

.method public createClientSettingsBuilder()Lh6/e$a;
    .locals 3

    new-instance v0, Lh6/e$a;

    invoke-direct {v0}, Lh6/e$a;-><init>()V

    iget-object v1, p0, Lf6/e;->zae:Lf6/a$d;

    instance-of v2, v1, Lf6/a$d$b;

    if-eqz v2, :cond_0

    check-cast v1, Lf6/a$d$b;

    invoke-interface {v1}, Lf6/a$d$b;->u()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->y()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lf6/e;->zae:Lf6/a$d;

    instance-of v2, v1, Lf6/a$d$a;

    if-eqz v2, :cond_1

    check-cast v1, Lf6/a$d$a;

    invoke-interface {v1}, Lf6/a$d$a;->y()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lh6/e$a;->d(Landroid/accounts/Account;)Lh6/e$a;

    iget-object v1, p0, Lf6/e;->zae:Lf6/a$d;

    instance-of v2, v1, Lf6/a$d$b;

    if-eqz v2, :cond_3

    check-cast v1, Lf6/a$d$b;

    invoke-interface {v1}, Lf6/a$d$b;->u()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->N()Ljava/util/Set;

    move-result-object v1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Lh6/e$a;->c(Ljava/util/Collection;)Lh6/e$a;

    iget-object v1, p0, Lf6/e;->zab:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh6/e$a;->e(Ljava/lang/String;)Lh6/e$a;

    iget-object v1, p0, Lf6/e;->zab:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh6/e$a;->b(Ljava/lang/String;)Lh6/e$a;

    return-object v0
.end method

.method public disconnectService()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf6/e;->zaa:Lg6/f;

    invoke-virtual {v0, p0}, Lg6/f;->A(Lf6/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public doBestEffortWrite(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "+",
            "Lf6/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lf6/e;->zad(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    return-object p1
.end method

.method public doBestEffortWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lf6/a$b;",
            ">(",
            "Lg6/v<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lf6/e;->zae(ILg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doRead(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "+",
            "Lf6/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lf6/e;->zad(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    return-object p1
.end method

.method public doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lf6/a$b;",
            ">(",
            "Lg6/v<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lf6/e;->zae(ILg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doRegisterEventListener(Lg6/o;Lg6/x;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            "T:",
            "Lg6/o<",
            "TA;*>;U:",
            "Lg6/x<",
            "TA;*>;>(TT;TU;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lg6/o;->b()Lg6/j$a;

    move-result-object v0

    const-string v1, "Listener has already been released."

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lg6/x;->a()Lg6/j$a;

    move-result-object v0

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lg6/o;->b()Lg6/j$a;

    move-result-object v0

    invoke-virtual {p2}, Lg6/x;->a()Lg6/j$a;

    move-result-object v1

    invoke-static {v0, v1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Listener registration and unregistration methods must be constructed with the same ListenerHolder."

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lf6/e;->zaa:Lg6/f;

    sget-object v1, Lf6/t;->h:Lf6/t;

    invoke-virtual {v0, p0, p1, p2, v1}, Lg6/f;->B(Lf6/e;Lg6/o;Lg6/x;Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doRegisterEventListener(Lg6/p;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            ">(",
            "Lg6/p<",
            "TA;*>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lg6/p;->a:Lg6/o;

    invoke-virtual {v0}, Lg6/o;->b()Lg6/j$a;

    move-result-object v0

    const-string v1, "Listener has already been released."

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lg6/p;->b:Lg6/x;

    invoke-virtual {v0}, Lg6/x;->a()Lg6/j$a;

    move-result-object v0

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf6/e;->zaa:Lg6/f;

    iget-object v1, p1, Lg6/p;->a:Lg6/o;

    iget-object v2, p1, Lg6/p;->b:Lg6/x;

    iget-object p1, p1, Lg6/p;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, p0, v1, v2, p1}, Lg6/f;->B(Lf6/e;Lg6/o;Lg6/x;Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doUnregisterEventListener(Lg6/j$a;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/j$a<",
            "*>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lf6/e;->doUnregisterEventListener(Lg6/j$a;I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doUnregisterEventListener(Lg6/j$a;I)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/j$a<",
            "*>;I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "Listener key cannot be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf6/e;->zaa:Lg6/f;

    invoke-virtual {v0, p0, p1, p2}, Lg6/f;->C(Lf6/e;Lg6/j$a;I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doWrite(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "+",
            "Lf6/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lf6/e;->zad(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    return-object p1
.end method

.method public doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lf6/a$b;",
            ">(",
            "Lg6/v<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lf6/e;->zae(ILg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final getApiKey()Lg6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg6/b<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lf6/e;->zaf:Lg6/b;

    return-object v0
.end method

.method public getApiOptions()Lf6/a$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TO;"
        }
    .end annotation

    iget-object v0, p0, Lf6/e;->zae:Lf6/a$d;

    return-object v0
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lf6/e;->zab:Landroid/content/Context;

    return-object v0
.end method

.method public getContextAttributionTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf6/e;->zac:Ljava/lang/String;

    return-object v0
.end method

.method public getContextFeatureId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lf6/e;->zac:Ljava/lang/String;

    return-object v0
.end method

.method public getLooper()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lf6/e;->zag:Landroid/os/Looper;

    return-object v0
.end method

.method public registerListener(Ljava/lang/Object;Ljava/lang/String;)Lg6/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(T",
            "L;",
            "Ljava/lang/String;",
            ")",
            "Lg6/j<",
            "T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf6/e;->zag:Landroid/os/Looper;

    invoke-static {p1, v0, p2}, Lg6/k;->a(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lg6/j;

    move-result-object p1

    return-object p1
.end method

.method public final zaa()I
    .locals 1

    iget v0, p0, Lf6/e;->zah:I

    return v0
.end method

.method public final zab(Landroid/os/Looper;Lg6/k0;)Lf6/a$f;
    .locals 8

    invoke-virtual {p0}, Lf6/e;->createClientSettingsBuilder()Lh6/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lh6/e$a;->a()Lh6/e;

    move-result-object v4

    iget-object v0, p0, Lf6/e;->zad:Lf6/a;

    invoke-virtual {v0}, Lf6/a;->a()Lf6/a$a;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lf6/a$a;

    iget-object v2, p0, Lf6/e;->zab:Landroid/content/Context;

    iget-object v5, p0, Lf6/e;->zae:Lf6/a$d;

    move-object v3, p1

    move-object v6, p2

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Lf6/a$a;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Ljava/lang/Object;Lf6/f$a;Lf6/f$b;)Lf6/a$f;

    move-result-object p1

    invoke-virtual {p0}, Lf6/e;->getContextAttributionTag()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, Lh6/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh6/c;

    invoke-virtual {v0, p2}, Lh6/c;->setAttributionTag(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p1, Lg6/l;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lg6/l;

    invoke-virtual {v0, p2}, Lg6/l;->d(Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final zac(Landroid/content/Context;Landroid/os/Handler;)Lg6/l1;
    .locals 2

    new-instance v0, Lg6/l1;

    invoke-virtual {p0}, Lf6/e;->createClientSettingsBuilder()Lh6/e$a;

    move-result-object v1

    invoke-virtual {v1}, Lh6/e$a;->a()Lh6/e;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lg6/l1;-><init>(Landroid/content/Context;Landroid/os/Handler;Lh6/e;)V

    return-object v0
.end method
