.class public Lgc/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc/d;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lgc/d;


# direct methods
.method public constructor <init>(Lgc/d;)V
    .locals 0

    iput-object p1, p0, Lgc/d$a;->h:Lgc/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    invoke-static {}, Lgc/d;->a()Lwb/e;

    move-result-object p1

    const-string v0, "New frame available"

    invoke-virtual {p1, v0}, Lwb/e;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lgc/d$a;->h:Lgc/d;

    invoke-static {p1}, Lgc/d;->b(Lgc/d;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lgc/d$a;->h:Lgc/d;

    invoke-static {v0}, Lgc/d;->c(Lgc/d;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lgc/d$a;->h:Lgc/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lgc/d;->d(Lgc/d;Z)Z

    iget-object v0, p0, Lgc/d$a;->h:Lgc/d;

    invoke-static {v0}, Lgc/d;->b(Lgc/d;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mFrameAvailable already set, frame could be dropped"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
