.class public Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/d;)Ls7/d;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;->b(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/d;)Ls7/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/d;)Ls7/d;
    .locals 8

    new-instance v7, Lt7/h;

    const-class v0, Ln7/g;

    invoke-interface {p4, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln7/g;

    const-class v0, Lv8/i;

    invoke-interface {p4, v0}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v2

    invoke-interface {p4, p0}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p1}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p2}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p3}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lt7/h;-><init>(Ln7/g;Ly8/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v7
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lr7/d;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v0

    const-class v1, Lr7/c;

    const-class v2, Ljava/util/concurrent/Executor;

    invoke-static {v1, v2}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v1

    const-class v2, Lr7/a;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v2

    const-class v3, Lr7/b;

    const-class v4, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v3, v4}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ly7/c;

    const-class v5, Ls7/d;

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Class;

    const-class v8, Lv7/b;

    const/4 v9, 0x0

    aput-object v8, v7, v9

    invoke-static {v5, v7}, Ly7/c;->d(Ljava/lang/Class;[Ljava/lang/Class;)Ly7/c$b;

    move-result-object v5

    const-string v7, "fire-app-check"

    invoke-virtual {v5, v7}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v5

    const-class v8, Ln7/g;

    invoke-static {v8}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v8

    invoke-virtual {v5, v8}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v5

    invoke-static {v0}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v8

    invoke-virtual {v5, v8}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v5

    invoke-static {v1}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v8

    invoke-virtual {v5, v8}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v5

    invoke-static {v2}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v8

    invoke-virtual {v5, v8}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v5

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v8

    invoke-virtual {v5, v8}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v5

    const-class v8, Lv8/i;

    invoke-static {v8}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v8

    invoke-virtual {v5, v8}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v5

    new-instance v8, Ls7/e;

    invoke-direct {v8, v0, v1, v2, v3}, Ls7/e;-><init>(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;)V

    invoke-virtual {v5, v8}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ly7/c$b;->c()Ly7/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ly7/c$b;->d()Ly7/c;

    move-result-object v0

    aput-object v0, v4, v9

    invoke-static {}, Lv8/h;->a()Ly7/c;

    move-result-object v0

    aput-object v0, v4, v6

    const-string v0, "17.1.2"

    invoke-static {v7, v0}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
