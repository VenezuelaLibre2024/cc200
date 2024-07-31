.class public Ly7/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/b;
.implements Ly8/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ly8/b<",
        "TT;>;",
        "Ly8/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:Ly8/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/a$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ly8/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile b:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Ly7/a0;->a:Ly7/a0;

    sput-object v0, Ly7/c0;->c:Ly8/a$a;

    sget-object v0, Ly7/b0;->a:Ly7/b0;

    sput-object v0, Ly7/c0;->d:Ly8/b;

    return-void
.end method

.method public constructor <init>(Ly8/a$a;Ly8/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly8/a$a<",
            "TT;>;",
            "Ly8/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/c0;->a:Ly8/a$a;

    iput-object p2, p0, Ly7/c0;->b:Ly8/b;

    return-void
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ly7/c0;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Ly8/b;)V
    .locals 0

    invoke-static {p0}, Ly7/c0;->f(Ly8/b;)V

    return-void
.end method

.method public static synthetic d(Ly8/a$a;Ly8/a$a;Ly8/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ly7/c0;->h(Ly8/a$a;Ly8/a$a;Ly8/b;)V

    return-void
.end method

.method public static e()Ly7/c0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ly7/c0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ly7/c0;

    sget-object v1, Ly7/c0;->c:Ly8/a$a;

    sget-object v2, Ly7/c0;->d:Ly8/b;

    invoke-direct {v0, v1, v2}, Ly7/c0;-><init>(Ly8/a$a;Ly8/b;)V

    return-object v0
.end method

.method public static synthetic f(Ly8/b;)V
    .locals 0

    return-void
.end method

.method public static synthetic g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic h(Ly8/a$a;Ly8/a$a;Ly8/b;)V
    .locals 0

    invoke-interface {p0, p2}, Ly8/a$a;->a(Ly8/b;)V

    invoke-interface {p1, p2}, Ly8/a$a;->a(Ly8/b;)V

    return-void
.end method

.method public static i(Ly8/b;)Ly7/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly8/b<",
            "TT;>;)",
            "Ly7/c0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ly7/c0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ly7/c0;-><init>(Ly8/a$a;Ly8/b;)V

    return-object v0
.end method


# virtual methods
.method public a(Ly8/a$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly8/a$a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ly7/c0;->b:Ly8/b;

    sget-object v1, Ly7/c0;->d:Ly8/b;

    if-eq v0, v1, :cond_0

    invoke-interface {p1, v0}, Ly8/a$a;->a(Ly8/b;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Ly7/c0;->b:Ly8/b;

    if-eq v2, v1, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ly7/c0;->a:Ly8/a$a;

    new-instance v3, Ly7/z;

    invoke-direct {v3, v1, p1}, Ly7/z;-><init>(Ly8/a$a;Ly8/a$a;)V

    iput-object v3, p0, Ly7/c0;->a:Ly8/a$a;

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-interface {p1, v2}, Ly8/a$a;->a(Ly8/b;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Ly7/c0;->b:Ly8/b;

    invoke-interface {v0}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public j(Ly8/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly8/b<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ly7/c0;->b:Ly8/b;

    sget-object v1, Ly7/c0;->d:Ly8/b;

    if-ne v0, v1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ly7/c0;->a:Ly8/a$a;

    const/4 v1, 0x0

    iput-object v1, p0, Ly7/c0;->a:Ly8/a$a;

    iput-object p1, p0, Ly7/c0;->b:Ly8/b;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Ly8/a$a;->a(Ly8/b;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "provide() can be called only once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
