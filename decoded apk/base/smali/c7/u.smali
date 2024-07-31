.class public abstract Lc7/u;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile d:Landroid/os/Handler;


# instance fields
.field public final a:Lc7/l7;

.field public final b:Ljava/lang/Runnable;

.field public volatile c:J


# direct methods
.method public constructor <init>(Lc7/l7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc7/u;->a:Lc7/l7;

    new-instance v0, Lc7/x;

    invoke-direct {v0, p0, p1}, Lc7/x;-><init>(Lc7/u;Lc7/l7;)V

    iput-object v0, p0, Lc7/u;->b:Ljava/lang/Runnable;

    return-void
.end method

.method public static bridge synthetic c(Lc7/u;J)V
    .locals 0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lc7/u;->c:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lc7/u;->c:J

    invoke-virtual {p0}, Lc7/u;->f()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lc7/u;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(J)V
    .locals 2

    invoke-virtual {p0}, Lc7/u;->a()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lc7/u;->a:Lc7/l7;

    invoke-interface {v0}, Lc7/l7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lc7/u;->c:J

    invoke-virtual {p0}, Lc7/u;->f()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lc7/u;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/u;->a:Lc7/l7;

    invoke-interface {v0}, Lc7/l7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "Failed to schedule delayed post. time"

    invoke-virtual {v0, p2, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public abstract d()V
.end method

.method public final e()Z
    .locals 4

    iget-wide v0, p0, Lc7/u;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f()Landroid/os/Handler;
    .locals 3

    sget-object v0, Lc7/u;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget-object v0, Lc7/u;->d:Landroid/os/Handler;

    return-object v0

    :cond_0
    const-class v0, Lc7/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lc7/u;->d:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzcp;

    iget-object v2, p0, Lc7/u;->a:Lc7/l7;

    invoke-interface {v2}, Lc7/l7;->zza()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/zzcp;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lc7/u;->d:Landroid/os/Handler;

    :cond_1
    sget-object v1, Lc7/u;->d:Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
