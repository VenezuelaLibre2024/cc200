.class public final Landroidx/work/impl/WorkDatabase_Impl;
.super Landroidx/work/impl/WorkDatabase;
.source ""


# instance fields
.field public volatile m:Ll2/q;

.field public volatile n:Ll2/b;

.field public volatile o:Ll2/t;

.field public volatile p:Ll2/h;

.field public volatile q:Ll2/k;

.field public volatile r:Ll2/n;

.field public volatile s:Ll2/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase;-><init>()V

    return-void
.end method

.method public static synthetic D(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic E(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic F(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic G(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic H(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic I(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic J(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic K(Landroidx/work/impl/WorkDatabase_Impl;Ls1/b;)Ls1/b;
    .locals 0

    iput-object p1, p0, Lo1/e;->a:Ls1/b;

    return-object p1
.end method

.method public static synthetic L(Landroidx/work/impl/WorkDatabase_Impl;Ls1/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lo1/e;->m(Ls1/b;)V

    return-void
.end method

.method public static synthetic M(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic N(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo1/e;->h:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public A()Ll2/n;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Ll2/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Ll2/n;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Ll2/n;

    if-nez v0, :cond_1

    new-instance v0, Ll2/o;

    invoke-direct {v0, p0}, Ll2/o;-><init>(Lo1/e;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Ll2/n;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:Ll2/n;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public B()Ll2/q;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Ll2/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Ll2/q;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Ll2/q;

    if-nez v0, :cond_1

    new-instance v0, Ll2/r;

    invoke-direct {v0, p0}, Ll2/r;-><init>(Lo1/e;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Ll2/q;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Ll2/q;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public C()Ll2/t;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Ll2/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Ll2/t;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Ll2/t;

    if-nez v0, :cond_1

    new-instance v0, Ll2/u;

    invoke-direct {v0, p0}, Ll2/u;-><init>(Lo1/e;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Ll2/t;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Ll2/t;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public e()Landroidx/room/c;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/c;

    const-string v3, "Dependency"

    const-string v4, "WorkSpec"

    const-string v5, "WorkTag"

    const-string v6, "SystemIdInfo"

    const-string v7, "WorkName"

    const-string v8, "WorkProgress"

    const-string v9, "Preference"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/c;-><init>(Lo1/e;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method public f(Lo1/a;)Ls1/c;
    .locals 4

    new-instance v0, Lo1/g;

    new-instance v1, Landroidx/work/impl/WorkDatabase_Impl$a;

    const/16 v2, 0xc

    invoke-direct {v1, p0, v2}, Landroidx/work/impl/WorkDatabase_Impl$a;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    const-string v2, "c103703e120ae8cc73c9248622f3cd1e"

    const-string v3, "49f946663a8deb7054212b8adda248c6"

    invoke-direct {v0, p1, v1, v2, v3}, Lo1/g;-><init>(Lo1/a;Lo1/g$a;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lo1/a;->b:Landroid/content/Context;

    invoke-static {v1}, Ls1/c$b;->a(Landroid/content/Context;)Ls1/c$b$a;

    move-result-object v1

    iget-object v2, p1, Lo1/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ls1/c$b$a;->c(Ljava/lang/String;)Ls1/c$b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls1/c$b$a;->b(Ls1/c$a;)Ls1/c$b$a;

    move-result-object v0

    invoke-virtual {v0}, Ls1/c$b$a;->a()Ls1/c$b;

    move-result-object v0

    iget-object p1, p1, Lo1/a;->a:Ls1/c$c;

    invoke-interface {p1, v0}, Ls1/c$c;->a(Ls1/c$b;)Ls1/c;

    move-result-object p1

    return-object p1
.end method

.method public t()Ll2/b;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Ll2/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Ll2/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Ll2/b;

    if-nez v0, :cond_1

    new-instance v0, Ll2/c;

    invoke-direct {v0, p0}, Ll2/c;-><init>(Lo1/e;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Ll2/b;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Ll2/b;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public x()Ll2/e;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Ll2/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Ll2/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Ll2/e;

    if-nez v0, :cond_1

    new-instance v0, Ll2/f;

    invoke-direct {v0, p0}, Ll2/f;-><init>(Lo1/e;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Ll2/e;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:Ll2/e;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public y()Ll2/h;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Ll2/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Ll2/h;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Ll2/h;

    if-nez v0, :cond_1

    new-instance v0, Ll2/i;

    invoke-direct {v0, p0}, Ll2/i;-><init>(Lo1/e;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Ll2/h;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Ll2/h;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public z()Ll2/k;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Ll2/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Ll2/k;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Ll2/k;

    if-nez v0, :cond_1

    new-instance v0, Ll2/l;

    invoke-direct {v0, p0}, Ll2/l;-><init>(Lo1/e;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Ll2/k;

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Ll2/k;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
