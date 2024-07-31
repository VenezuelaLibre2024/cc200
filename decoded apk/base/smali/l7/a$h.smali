.class public final Ll7/a$h;
.super Ll7/a$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll7/a$b;-><init>(Ll7/a$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Ll7/a$a;)V
    .locals 0

    invoke-direct {p0}, Ll7/a$h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ll7/a;Ll7/a$e;Ll7/a$e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ll7/a$e;",
            "Ll7/a$e;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Ll7/a;->h(Ll7/a;)Ll7/a$e;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Ll7/a;->i(Ll7/a;Ll7/a$e;)Ll7/a$e;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public b(Ll7/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Ll7/a;->d(Ll7/a;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Ll7/a;->e(Ll7/a;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public c(Ll7/a;Ll7/a$l;Ll7/a$l;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ll7/a$l;",
            "Ll7/a$l;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Ll7/a;->j(Ll7/a;)Ll7/a$l;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Ll7/a;->k(Ll7/a;Ll7/a$l;)Ll7/a$l;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public d(Ll7/a;Ll7/a$e;)Ll7/a$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ll7/a$e;",
            ")",
            "Ll7/a$e;"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Ll7/a;->h(Ll7/a;)Ll7/a$e;

    move-result-object v0

    if-eq v0, p2, :cond_0

    invoke-static {p1, p2}, Ll7/a;->i(Ll7/a;Ll7/a$e;)Ll7/a$e;

    :cond_0
    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public e(Ll7/a;Ll7/a$l;)Ll7/a$l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ll7/a$l;",
            ")",
            "Ll7/a$l;"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Ll7/a;->j(Ll7/a;)Ll7/a$l;

    move-result-object v0

    if-eq v0, p2, :cond_0

    invoke-static {p1, p2}, Ll7/a;->k(Ll7/a;Ll7/a$l;)Ll7/a$l;

    :cond_0
    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public f(Ll7/a$l;Ll7/a$l;)V
    .locals 0

    iput-object p2, p1, Ll7/a$l;->b:Ll7/a$l;

    return-void
.end method

.method public g(Ll7/a$l;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Ll7/a$l;->a:Ljava/lang/Thread;

    return-void
.end method
