.class public abstract Lh6/h;
.super Lh6/c;
.source ""

# interfaces
.implements Lf6/a$f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Lh6/c<",
        "TT;>;",
        "Lf6/a$f;"
    }
.end annotation


# static fields
.field private static volatile zaa:Ljava/util/concurrent/Executor;


# instance fields
.field private final zab:Lh6/e;

.field private final zac:Ljava/util/Set;

.field private final zad:Landroid/accounts/Account;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;ILh6/e;)V
    .locals 8
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-static {p1}, Lh6/i;->c(Landroid/content/Context;)Lh6/i;

    move-result-object v3

    invoke-static {}, Le6/e;->m()Le6/e;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    invoke-direct/range {v0 .. v7}, Lh6/c;-><init>(Landroid/content/Context;Landroid/os/Handler;Lh6/i;Le6/f;ILh6/c$a;Lh6/c$b;)V

    invoke-static {p4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh6/e;

    iput-object p1, p0, Lh6/h;->zab:Lh6/e;

    invoke-virtual {p4}, Lh6/e;->a()Landroid/accounts/Account;

    move-result-object p1

    iput-object p1, p0, Lh6/h;->zad:Landroid/accounts/Account;

    invoke-virtual {p4}, Lh6/e;->d()Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, p1}, Lh6/h;->zaa(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lh6/h;->zac:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILh6/e;)V
    .locals 9

    invoke-static {p1}, Lh6/i;->c(Landroid/content/Context;)Lh6/i;

    move-result-object v3

    invoke-static {}, Le6/e;->m()Le6/e;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v8}, Lh6/h;-><init>(Landroid/content/Context;Landroid/os/Looper;Lh6/i;Le6/e;ILh6/e;Lg6/e;Lg6/m;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILh6/e;Lf6/f$a;Lf6/f$b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct/range {p0 .. p6}, Lh6/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILh6/e;Lg6/e;Lg6/m;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILh6/e;Lg6/e;Lg6/m;)V
    .locals 9

    invoke-static {p1}, Lh6/i;->c(Landroid/content/Context;)Lh6/i;

    move-result-object v3

    invoke-static {}, Le6/e;->m()Le6/e;

    move-result-object v4

    invoke-static {p5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    move-object v7, p5

    check-cast v7, Lg6/e;

    invoke-static {p6}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    move-object v8, p5

    check-cast v8, Lg6/m;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v8}, Lh6/h;-><init>(Landroid/content/Context;Landroid/os/Looper;Lh6/i;Le6/e;ILh6/e;Lg6/e;Lg6/m;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lh6/i;Le6/e;ILh6/e;Lg6/e;Lg6/m;)V
    .locals 10
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    move-object v9, p0

    move-object/from16 v0, p7

    move-object/from16 v1, p8

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    new-instance v3, Lh6/j0;

    invoke-direct {v3, v0}, Lh6/j0;-><init>(Lg6/e;)V

    move-object v6, v3

    :goto_0
    if-nez v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    new-instance v0, Lh6/k0;

    invoke-direct {v0, v1}, Lh6/k0;-><init>(Lg6/m;)V

    move-object v7, v0

    :goto_1
    invoke-virtual/range {p6 .. p6}, Lh6/e;->j()Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v8}, Lh6/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Lh6/i;Le6/f;ILh6/c$a;Lh6/c$b;Ljava/lang/String;)V

    move-object/from16 v0, p6

    iput-object v0, v9, Lh6/h;->zab:Lh6/e;

    invoke-virtual/range {p6 .. p6}, Lh6/e;->a()Landroid/accounts/Account;

    move-result-object v1

    iput-object v1, v9, Lh6/h;->zad:Landroid/accounts/Account;

    invoke-virtual/range {p6 .. p6}, Lh6/e;->d()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0}, Lh6/h;->zaa(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, v9, Lh6/h;->zac:Ljava/util/Set;

    return-void
.end method

.method private final zaa(Ljava/util/Set;)Ljava/util/Set;
    .locals 3

    invoke-virtual {p0, p1}, Lh6/h;->validateScopes(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expanding scopes is not permitted, use implied scopes instead"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final getAccount()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, Lh6/h;->zad:Landroid/accounts/Account;

    return-object v0
.end method

.method public final getBindServiceExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getClientSettings()Lh6/e;
    .locals 1

    iget-object v0, p0, Lh6/h;->zab:Lh6/e;

    return-object v0
.end method

.method public getRequiredFeatures()[Le6/d;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Le6/d;

    return-object v0
.end method

.method public final getScopes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh6/h;->zac:Ljava/util/Set;

    return-object v0
.end method

.method public getScopesForConnectionlessNonSignIn()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lh6/c;->requiresSignIn()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh6/h;->zac:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public validateScopes(Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    return-object p1
.end method
