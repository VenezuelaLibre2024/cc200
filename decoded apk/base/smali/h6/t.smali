.class public final Lh6/t;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static b:Lh6/t;

.field public static final c:Lh6/u;


# instance fields
.field public a:Lh6/u;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v6, Lh6/u;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lh6/u;-><init>(IZZII)V

    sput-object v6, Lh6/t;->c:Lh6/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized b()Lh6/t;
    .locals 2

    const-class v0, Lh6/t;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lh6/t;->b:Lh6/t;

    if-nez v1, :cond_0

    new-instance v1, Lh6/t;

    invoke-direct {v1}, Lh6/t;-><init>()V

    sput-object v1, Lh6/t;->b:Lh6/t;

    :cond_0
    sget-object v1, Lh6/t;->b:Lh6/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a()Lh6/u;
    .locals 1

    iget-object v0, p0, Lh6/t;->a:Lh6/u;

    return-object v0
.end method

.method public final declared-synchronized c(Lh6/u;)V
    .locals 2

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    sget-object p1, Lh6/t;->c:Lh6/u;

    iput-object p1, p0, Lh6/t;->a:Lh6/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lh6/t;->a:Lh6/u;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lh6/u;->M()I

    move-result v0

    invoke-virtual {p1}, Lh6/u;->M()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ge v0, v1, :cond_1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :goto_0
    :try_start_2
    iput-object p1, p0, Lh6/t;->a:Lh6/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
