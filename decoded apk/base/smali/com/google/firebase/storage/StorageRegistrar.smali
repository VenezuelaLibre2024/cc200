.class public Lcom/google/firebase/storage/StorageRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-gcs"


# instance fields
.field public blockingExecutor:Ly7/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/e0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public uiExecutor:Ly7/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/e0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lr7/b;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/StorageRegistrar;->blockingExecutor:Ly7/e0;

    const-class v0, Lr7/d;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/StorageRegistrar;->uiExecutor:Ly7/e0;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/storage/StorageRegistrar;Ly7/d;)Lp9/g;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/storage/StorageRegistrar;->lambda$getComponents$0(Ly7/d;)Lp9/g;

    move-result-object p0

    return-object p0
.end method

.method private synthetic lambda$getComponents$0(Ly7/d;)Lp9/g;
    .locals 7

    new-instance v6, Lp9/g;

    const-class v0, Ln7/g;

    invoke-interface {p1, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln7/g;

    const-class v0, Lx7/b;

    invoke-interface {p1, v0}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v2

    const-class v0, Lv7/b;

    invoke-interface {p1, v0}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v3

    iget-object v0, p0, Lcom/google/firebase/storage/StorageRegistrar;->blockingExecutor:Ly7/e0;

    invoke-interface {p1, v0}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lcom/google/firebase/storage/StorageRegistrar;->uiExecutor:Ly7/e0;

    invoke-interface {p1, v0}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/util/concurrent/Executor;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lp9/g;-><init>(Ln7/g;Ly8/b;Ly8/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-object v6
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ly7/c;

    const-class v1, Lp9/g;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v2, "fire-gcs"

    invoke-virtual {v1, v2}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    const-class v3, Ln7/g;

    invoke-static {v3}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    iget-object v3, p0, Lcom/google/firebase/storage/StorageRegistrar;->blockingExecutor:Ly7/e0;

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    iget-object v3, p0, Lcom/google/firebase/storage/StorageRegistrar;->uiExecutor:Ly7/e0;

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lx7/b;

    invoke-static {v3}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lv7/b;

    invoke-static {v3}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    new-instance v3, Lp9/q;

    invoke-direct {v3, p0}, Lp9/q;-><init>(Lcom/google/firebase/storage/StorageRegistrar;)V

    invoke-virtual {v1, v3}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "20.3.0"

    invoke-static {v2, v1}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
