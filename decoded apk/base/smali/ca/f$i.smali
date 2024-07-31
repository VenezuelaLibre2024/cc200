.class public Lca/f$i;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public a:Z

.field public b:Lca/f$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lca/f<",
            "TT;>.h;"
        }
    .end annotation
.end field

.field public final synthetic c:Lca/f;


# direct methods
.method public constructor <init>(Lca/f;)V
    .locals 0

    iput-object p1, p0, Lca/f$i;->c:Lca/f;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lca/f$i;->a:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lca/f$i;->b:Lca/f$h;

    return-void
.end method

.method public synthetic constructor <init>(Lca/f;Lca/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lca/f$i;-><init>(Lca/f;)V

    return-void
.end method

.method public static synthetic a(Lca/f$i;)V
    .locals 0

    invoke-direct {p0}, Lca/f$i;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method


# virtual methods
.method public c(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lca/f$h;

    iget-object v1, p0, Lca/f$i;->c:Lca/f;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lca/f$h;-><init>(Lca/f;Ljava/util/Set;Lca/f$a;)V

    iput-object v0, p0, Lca/f$i;->b:Lca/f$h;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    iput-boolean v1, p0, Lca/f$i;->a:Z

    iget-object p1, p0, Lca/f$i;->b:Lca/f$h;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-boolean p1, p0, Lca/f$i;->a:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, Lca/f$i;->b:Lca/f$h;

    if-nez p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lca/f$i;->c:Lca/f;

    invoke-static {p1}, Lca/f;->access$500(Lca/f;)Lx6/c;

    move-result-object p1

    invoke-virtual {p1}, Lx6/c;->j()Lx6/h;

    move-result-object p1

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lca/f$i;->b:Lca/f$h;

    const/4 v2, 0x0

    iput-object v2, p0, Lca/f$i;->b:Lca/f$h;

    iput-boolean v0, p0, Lca/f$i;->a:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lca/g;

    invoke-direct {v0, p0}, Lca/g;-><init>(Lca/f$i;)V

    invoke-virtual {v1, v0}, Lca/f$h;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v1, p1}, Lca/f$h;->c(Lx6/h;)V

    iget-object p1, p0, Lca/f$i;->c:Lca/f;

    invoke-static {p1}, Lca/f;->access$500(Lca/f;)Lx6/c;

    move-result-object p1

    invoke-virtual {p1}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->i:F

    invoke-virtual {v1, p1}, Lca/f$h;->b(F)V

    iget-object p1, p0, Lca/f$i;->c:Lca/f;

    invoke-static {p1}, Lca/f;->access$600(Lca/f;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
