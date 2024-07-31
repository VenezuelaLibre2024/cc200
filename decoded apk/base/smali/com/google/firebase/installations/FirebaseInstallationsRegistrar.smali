.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly7/d;)Lz8/h;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Ly7/d;)Lz8/h;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Ly7/d;)Lz8/h;
    .locals 6

    new-instance v0, Lz8/g;

    const-class v1, Ln7/g;

    invoke-interface {p0, v1}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/g;

    const-class v2, Lv8/i;

    invoke-interface {p0, v2}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v2

    const-class v3, Lr7/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v3

    invoke-interface {p0, v3}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, Lr7/b;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v4

    invoke-interface {p0, v4}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lz7/y;->b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lz8/g;-><init>(Ln7/g;Ly8/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Ly7/c;

    const-class v1, Lz8/h;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v2, "fire-installations"

    invoke-virtual {v1, v2}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    const-class v3, Ln7/g;

    invoke-static {v3}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lv8/i;

    invoke-static {v3}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lr7/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v3

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lr7/b;

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-static {v3, v4}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v3

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v3, Lz8/j;->a:Lz8/j;

    invoke-virtual {v1, v3}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    invoke-static {}, Lv8/h;->a()Ly7/c;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "17.2.0"

    invoke-static {v2, v1}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
