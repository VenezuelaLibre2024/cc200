.class public final Ln2/a$h;
.super Ln2/a$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ln2/a$b;-><init>(Ln2/a$a;)V

    return-void
.end method


# virtual methods
.method public a(Ln2/a;Ln2/a$e;Ln2/a$e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln2/a<",
            "*>;",
            "Ln2/a$e;",
            "Ln2/a$e;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ln2/a;->i:Ln2/a$e;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Ln2/a;->i:Ln2/a$e;

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

.method public b(Ln2/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln2/a<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ln2/a;->h:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Ln2/a;->h:Ljava/lang/Object;

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

.method public c(Ln2/a;Ln2/a$i;Ln2/a$i;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln2/a<",
            "*>;",
            "Ln2/a$i;",
            "Ln2/a$i;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ln2/a;->j:Ln2/a$i;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Ln2/a;->j:Ln2/a$i;

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

.method public d(Ln2/a$i;Ln2/a$i;)V
    .locals 0

    iput-object p2, p1, Ln2/a$i;->b:Ln2/a$i;

    return-void
.end method

.method public e(Ln2/a$i;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Ln2/a$i;->a:Ljava/lang/Thread;

    return-void
.end method