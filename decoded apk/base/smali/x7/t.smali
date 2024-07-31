.class public final Lx7/t;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static h:Lk6/a;


# instance fields
.field public final a:Ln7/g;

.field public volatile b:J

.field public volatile c:J

.field public d:J

.field public e:Landroid/os/HandlerThread;

.field public f:Landroid/os/Handler;

.field public g:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk6/a;

    const-string v1, "FirebaseAuth:"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "TokenRefresher"

    invoke-direct {v0, v2, v1}, Lk6/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lx7/t;->h:Lk6/a;

    return-void
.end method

.method public constructor <init>(Ln7/g;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lx7/t;->h:Lk6/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Initializing TokenRefresher"

    invoke-virtual {v0, v2, v1}, Lk6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln7/g;

    iput-object p1, p0, Lx7/t;->a:Ln7/g;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "TokenRefresher"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lx7/t;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    iget-object v1, p0, Lx7/t;->e:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzg;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lx7/t;->f:Landroid/os/Handler;

    new-instance v0, Lx7/w;

    invoke-virtual {p1}, Ln7/g;->q()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lx7/w;-><init>(Lx7/t;Ljava/lang/String;)V

    iput-object v0, p0, Lx7/t;->g:Ljava/lang/Runnable;

    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, Lx7/t;->d:J

    return-void
.end method

.method public static bridge synthetic a()Lk6/a;
    .locals 1

    sget-object v0, Lx7/t;->h:Lk6/a;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lx7/t;->f:Landroid/os/Handler;

    iget-object v1, p0, Lx7/t;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 6

    sget-object v0, Lx7/t;->h:Lk6/a;

    iget-wide v1, p0, Lx7/t;->b:J

    iget-wide v3, p0, Lx7/t;->d:J

    sub-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Scheduling refresh for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lk6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lx7/t;->b()V

    invoke-static {}, Lo6/g;->d()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lx7/t;->b:J

    sub-long/2addr v2, v0

    iget-wide v0, p0, Lx7/t;->d:J

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iput-wide v0, p0, Lx7/t;->c:J

    iget-object v0, p0, Lx7/t;->f:Landroid/os/Handler;

    iget-object v1, p0, Lx7/t;->g:Ljava/lang/Runnable;

    iget-wide v4, p0, Lx7/t;->c:J

    mul-long/2addr v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final d()V
    .locals 7

    iget-wide v0, p0, Lx7/t;->c:J

    long-to-int v0, v0

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_1

    const/16 v1, 0x78

    if-eq v0, v1, :cond_1

    const/16 v1, 0xf0

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1e0

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3c0

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x1e

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x3c0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x2

    iget-wide v2, p0, Lx7/t;->c:J

    mul-long/2addr v0, v2

    :goto_0
    iput-wide v0, p0, Lx7/t;->c:J

    invoke-static {}, Lo6/g;->d()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lx7/t;->c:J

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lx7/t;->b:J

    sget-object v0, Lx7/t;->h:Lk6/a;

    iget-wide v1, p0, Lx7/t;->b:J

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Scheduling refresh for "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lk6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lx7/t;->f:Landroid/os/Handler;

    iget-object v1, p0, Lx7/t;->g:Ljava/lang/Runnable;

    iget-wide v2, p0, Lx7/t;->c:J

    mul-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
