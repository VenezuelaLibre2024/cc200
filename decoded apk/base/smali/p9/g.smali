.class public Lp9/g;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lp9/f;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ln7/g;

.field public final c:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "Lx7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "Lv7/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln7/g;Ly8/b;Ly8/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Lr7/b;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build Lr7/d;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ly8/b<",
            "Lx7/b;",
            ">;",
            "Ly8/b<",
            "Lv7/b;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp9/g;->a:Ljava/util/Map;

    iput-object p1, p0, Lp9/g;->b:Ln7/g;

    iput-object p2, p0, Lp9/g;->c:Ly8/b;

    iput-object p3, p0, Lp9/g;->d:Ly8/b;

    invoke-static {p4, p5}, Lp9/g0;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Lp9/f;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lp9/g;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp9/f;

    if-nez v0, :cond_0

    new-instance v0, Lp9/f;

    iget-object v1, p0, Lp9/g;->b:Ln7/g;

    iget-object v2, p0, Lp9/g;->c:Ly8/b;

    iget-object v3, p0, Lp9/g;->d:Ly8/b;

    invoke-direct {v0, p1, v1, v2, v3}, Lp9/f;-><init>(Ljava/lang/String;Ln7/g;Ly8/b;Ly8/b;)V

    iget-object v1, p0, Lp9/g;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
