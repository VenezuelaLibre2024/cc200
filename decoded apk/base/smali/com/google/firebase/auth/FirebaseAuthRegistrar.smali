.class public Lcom/google/firebase/auth/FirebaseAuthRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$getComponents$0(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/d;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 10

    const-class v0, Ln7/g;

    invoke-interface {p5, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ln7/g;

    const-class v0, Lv7/b;

    invoke-interface {p5, v0}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v3

    const-class v0, Lv8/i;

    invoke-interface {p5, v0}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v4

    new-instance v0, Lx7/g;

    invoke-interface {p5, p0}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p1}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p2}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p3}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p5, p4}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Ljava/util/concurrent/Executor;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lx7/g;-><init>(Ln7/g;Ly8/b;Ly8/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 11
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lr7/a;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v3

    const-class v0, Lr7/b;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v4

    const-class v0, Lr7/c;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v5

    const-class v0, Lr7/c;

    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v6

    const-class v0, Lr7/d;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v7

    const/4 v0, 0x3

    new-array v0, v0, [Ly7/c;

    const-class v1, Lcom/google/firebase/auth/FirebaseAuth;

    const/4 v8, 0x1

    new-array v2, v8, [Ljava/lang/Class;

    const-class v9, Lx7/b;

    const/4 v10, 0x0

    aput-object v9, v2, v10

    invoke-static {v1, v2}, Ly7/c;->d(Ljava/lang/Class;[Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-class v2, Ln7/g;

    invoke-static {v2}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v2, Lv8/i;

    invoke-static {v2}, Ly7/q;->l(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v4}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v5}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v6}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v7}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v2, Lv7/b;

    invoke-static {v2}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    new-instance v9, Lw7/h1;

    move-object v2, v9

    invoke-direct/range {v2 .. v7}, Lw7/h1;-><init>(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;)V

    invoke-virtual {v1, v9}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    aput-object v1, v0, v10

    invoke-static {}, Lv8/h;->a()Ly7/c;

    move-result-object v1

    aput-object v1, v0, v8

    const-string v1, "fire-auth"

    const-string v2, "22.3.1"

    invoke-static {v1, v2}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
