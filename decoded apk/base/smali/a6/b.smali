.class public La6/b;
.super Lf6/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf6/e<",
        "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:La6/j;

.field public static b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La6/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La6/j;-><init>(La6/i;)V

    sput-object v0, La6/b;->a:La6/j;

    const/4 v0, 0x1

    sput v0, La6/b;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 2

    sget-object v0, Lv5/a;->b:Lf6/a;

    new-instance v1, Lg6/a;

    invoke-direct {v1}, Lg6/a;-><init>()V

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lg6/t;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 3

    sget-object v0, Lv5/a;->b:Lf6/a;

    new-instance v1, Lf6/e$a$a;

    invoke-direct {v1}, Lf6/e$a$a;-><init>()V

    new-instance v2, Lg6/a;

    invoke-direct {v2}, Lg6/a;-><init>()V

    invoke-virtual {v1, v2}, Lf6/e$a$a;->c(Lg6/t;)Lf6/e$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lf6/e$a$a;->a()Lf6/e$a;

    move-result-object v1

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method


# virtual methods
.method public b()Landroid/content/Intent;
    .locals 3

    invoke-virtual {p0}, Lf6/e;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, La6/b;->e()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    if-eq v2, v1, :cond_1

    const/4 v1, 0x3

    if-eq v2, v1, :cond_0

    invoke-virtual {p0}, Lf6/e;->getApiOptions()Lf6/a$d;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-static {v0, v1}, Lb6/q;->b(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Landroid/content/Intent;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lf6/e;->getApiOptions()Lf6/a$d;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-static {v0, v1}, Lb6/q;->c(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Landroid/content/Intent;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lf6/e;->getApiOptions()Lf6/a$d;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-static {v0, v1}, Lb6/q;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Landroid/content/Intent;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    throw v0
.end method

.method public c()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lf6/e;->asGoogleApiClient()Lf6/f;

    move-result-object v0

    invoke-virtual {p0}, Lf6/e;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, La6/b;->e()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lb6/q;->f(Lf6/f;Landroid/content/Context;Z)Lf6/h;

    move-result-object v0

    invoke-static {v0}, Lh6/r;->b(Lf6/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lf6/e;->asGoogleApiClient()Lf6/f;

    move-result-object v0

    invoke-virtual {p0}, Lf6/e;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lf6/e;->getApiOptions()Lf6/a$d;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {p0}, La6/b;->e()I

    move-result v3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v0, v1, v2, v3}, Lb6/q;->e(Lf6/f;Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Z)Lf6/g;

    move-result-object v0

    sget-object v1, La6/b;->a:La6/j;

    invoke-static {v0, v1}, Lh6/r;->a(Lf6/h;Lh6/r$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized e()I
    .locals 6

    monitor-enter p0

    :try_start_0
    sget v0, La6/b;->b:I

    const/4 v1, 0x1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lf6/e;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Le6/e;->m()Le6/e;

    move-result-object v1

    const v5, 0xbdfcb8

    invoke-virtual {v1, v0, v5}, Le6/e;->h(Landroid/content/Context;I)I

    move-result v5

    if-nez v5, :cond_0

    sput v4, La6/b;->b:I

    move v0, v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {v1, v0, v5, v4}, Le6/e;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "com.google.android.gms.auth.api.fallback"

    invoke-static {v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    sput v2, La6/b;->b:I

    move v0, v2

    goto :goto_0

    :cond_1
    sput v3, La6/b;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v3

    :cond_2
    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public signOut()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lf6/e;->asGoogleApiClient()Lf6/f;

    move-result-object v0

    invoke-virtual {p0}, Lf6/e;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, La6/b;->e()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lb6/q;->g(Lf6/f;Landroid/content/Context;Z)Lf6/h;

    move-result-object v0

    invoke-static {v0}, Lh6/r;->b(Lf6/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
