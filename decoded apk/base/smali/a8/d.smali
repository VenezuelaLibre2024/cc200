.class public La8/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ly8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/a<",
            "Lp7/a;",
            ">;"
        }
    .end annotation
.end field

.field public volatile b:Lc8/a;

.field public volatile c:Ld8/b;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld8/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly8/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly8/a<",
            "Lp7/a;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ld8/c;

    invoke-direct {v0}, Ld8/c;-><init>()V

    new-instance v1, Lc8/f;

    invoke-direct {v1}, Lc8/f;-><init>()V

    invoke-direct {p0, p1, v0, v1}, La8/d;-><init>(Ly8/a;Ld8/b;Lc8/a;)V

    return-void
.end method

.method public constructor <init>(Ly8/a;Ld8/b;Lc8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly8/a<",
            "Lp7/a;",
            ">;",
            "Ld8/b;",
            "Lc8/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/d;->a:Ly8/a;

    iput-object p2, p0, La8/d;->c:Ld8/b;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La8/d;->d:Ljava/util/List;

    iput-object p3, p0, La8/d;->b:Lc8/a;

    invoke-virtual {p0}, La8/d;->f()V

    return-void
.end method

.method public static synthetic a(La8/d;Ly8/b;)V
    .locals 0

    invoke-direct {p0, p1}, La8/d;->i(Ly8/b;)V

    return-void
.end method

.method public static synthetic b(La8/d;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La8/d;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(La8/d;Ld8/a;)V
    .locals 0

    invoke-direct {p0, p1}, La8/d;->h(Ld8/a;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, La8/d;->b:Lc8/a;

    invoke-interface {v0, p1, p2}, Lc8/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private synthetic h(Ld8/a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La8/d;->c:Ld8/b;

    instance-of v0, v0, Ld8/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, La8/d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, La8/d;->c:Ld8/b;

    invoke-interface {v0, p1}, Ld8/b;->a(Ld8/a;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic i(Ly8/b;)V
    .locals 5

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "AnalyticsConnector now available."

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp7/a;

    new-instance v0, Lc8/e;

    invoke-direct {v0, p1}, Lc8/e;-><init>(Lp7/a;)V

    new-instance v1, La8/e;

    invoke-direct {v1}, La8/e;-><init>()V

    invoke-static {p1, v1}, La8/d;->j(Lp7/a;La8/e;)Lp7/a$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v2, "Registered Firebase Analytics listener."

    invoke-virtual {p1, v2}, Lb8/g;->b(Ljava/lang/String;)V

    new-instance p1, Lc8/d;

    invoke-direct {p1}, Lc8/d;-><init>()V

    new-instance v2, Lc8/c;

    const/16 v3, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v0, v3, v4}, Lc8/c;-><init>(Lc8/e;ILjava/util/concurrent/TimeUnit;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La8/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld8/a;

    invoke-virtual {p1, v3}, Lc8/d;->a(Ld8/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, La8/e;->d(Lc8/b;)V

    invoke-virtual {v1, v2}, La8/e;->e(Lc8/b;)V

    iput-object p1, p0, La8/d;->c:Ld8/b;

    iput-object v2, p0, La8/d;->b:Lc8/a;

    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "Could not register Firebase Analytics listener; a listener is already registered."

    invoke-virtual {p1, v0}, Lb8/g;->k(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public static j(Lp7/a;La8/e;)Lp7/a$a;
    .locals 2

    const-string v0, "clx"

    invoke-interface {p0, v0, p1}, Lp7/a;->c(Ljava/lang/String;Lp7/a$b;)Lp7/a$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    const-string v0, "crash"

    invoke-interface {p0, v0, p1}, Lp7/a;->c(Ljava/lang/String;Lp7/a$b;)Lp7/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p0

    const-string p1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    invoke-virtual {p0, p1}, Lb8/g;->k(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public d()Lc8/a;
    .locals 1

    new-instance v0, La8/a;

    invoke-direct {v0, p0}, La8/a;-><init>(La8/d;)V

    return-object v0
.end method

.method public e()Ld8/b;
    .locals 1

    new-instance v0, La8/b;

    invoke-direct {v0, p0}, La8/b;-><init>(La8/d;)V

    return-object v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, La8/d;->a:Ly8/a;

    new-instance v1, La8/c;

    invoke-direct {v1, p0}, La8/c;-><init>(La8/d;)V

    invoke-interface {v0, v1}, Ly8/a;->a(Ly8/a$a;)V

    return-void
.end method
