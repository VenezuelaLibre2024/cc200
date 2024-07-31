.class public Lo/c;
.super Lo/e;
.source ""


# static fields
.field public static volatile c:Lo/c;

.field public static final d:Ljava/util/concurrent/Executor;

.field public static final e:Ljava/util/concurrent/Executor;


# instance fields
.field public a:Lo/e;

.field public final b:Lo/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lo/b;->h:Lo/b;

    sput-object v0, Lo/c;->d:Ljava/util/concurrent/Executor;

    sget-object v0, Lo/a;->h:Lo/a;

    sput-object v0, Lo/c;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo/e;-><init>()V

    new-instance v0, Lo/d;

    invoke-direct {v0}, Lo/d;-><init>()V

    iput-object v0, p0, Lo/c;->b:Lo/e;

    iput-object v0, p0, Lo/c;->a:Lo/e;

    return-void
.end method

.method public static synthetic d(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Lo/c;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Lo/c;->h(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static f()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lo/c;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static g()Lo/c;
    .locals 2

    sget-object v0, Lo/c;->c:Lo/c;

    if-eqz v0, :cond_0

    sget-object v0, Lo/c;->c:Lo/c;

    return-object v0

    :cond_0
    const-class v0, Lo/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lo/c;->c:Lo/c;

    if-nez v1, :cond_1

    new-instance v1, Lo/c;

    invoke-direct {v1}, Lo/c;-><init>()V

    sput-object v1, Lo/c;->c:Lo/c;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lo/c;->c:Lo/c;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static synthetic h(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lo/c;->g()Lo/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/c;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic i(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lo/c;->g()Lo/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/c;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lo/c;->a:Lo/e;

    invoke-virtual {v0, p1}, Lo/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lo/c;->a:Lo/e;

    invoke-virtual {v0}, Lo/e;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lo/c;->a:Lo/e;

    invoke-virtual {v0, p1}, Lo/e;->c(Ljava/lang/Runnable;)V

    return-void
.end method
