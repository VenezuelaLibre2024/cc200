.class public final Lv/a$h;
.super Lv/a$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lv/a$b;-><init>(Lv/a$a;)V

    return-void
.end method


# virtual methods
.method public a(Lv/a;Lv/a$e;Lv/a$e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv/a<",
            "*>;",
            "Lv/a$e;",
            "Lv/a$e;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lv/a;->i:Lv/a$e;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lv/a;->i:Lv/a$e;

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

.method public b(Lv/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv/a<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lv/a;->h:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lv/a;->h:Ljava/lang/Object;

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

.method public c(Lv/a;Lv/a$i;Lv/a$i;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv/a<",
            "*>;",
            "Lv/a$i;",
            "Lv/a$i;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lv/a;->j:Lv/a$i;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lv/a;->j:Lv/a$i;

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

.method public d(Lv/a$i;Lv/a$i;)V
    .locals 0

    iput-object p2, p1, Lv/a$i;->b:Lv/a$i;

    return-void
.end method

.method public e(Lv/a$i;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lv/a$i;->a:Ljava/lang/Thread;

    return-void
.end method
