.class public final Lt7/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lt7/k;

.field public final b:Lu7/a;

.field public volatile c:Z

.field public volatile d:I

.field public volatile e:J

.field public volatile f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lt7/h;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Lr7/c;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Lr7/b;
        .end annotation
    .end param

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v0, Lt7/k;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt7/h;

    invoke-direct {v0, p2, p3, p4}, Lt7/k;-><init>(Lt7/h;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    new-instance p2, Lu7/a$a;

    invoke-direct {p2}, Lu7/a$a;-><init>()V

    invoke-direct {p0, p1, v0, p2}, Lt7/n;-><init>(Landroid/content/Context;Lt7/k;Lu7/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lt7/k;Lu7/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt7/n;->a:Lt7/k;

    iput-object p3, p0, Lt7/n;->b:Lu7/a;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lt7/n;->e:J

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lg6/c;->c(Landroid/app/Application;)V

    invoke-static {}, Lg6/c;->b()Lg6/c;

    move-result-object p1

    new-instance v0, Lt7/n$a;

    invoke-direct {v0, p0, p2, p3}, Lt7/n$a;-><init>(Lt7/n;Lt7/k;Lu7/a;)V

    invoke-virtual {p1, v0}, Lg6/c;->a(Lg6/c$a;)V

    return-void
.end method

.method public static synthetic a(Lt7/n;Z)Z
    .locals 0

    iput-boolean p1, p0, Lt7/n;->c:Z

    return p1
.end method

.method public static synthetic b(Lt7/n;)Z
    .locals 0

    invoke-virtual {p0}, Lt7/n;->f()Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lt7/n;)J
    .locals 2

    iget-wide v0, p0, Lt7/n;->e:J

    return-wide v0
.end method


# virtual methods
.method public d(Ls7/b;)V
    .locals 6

    instance-of v0, p1, Lt7/a;

    if-eqz v0, :cond_0

    check-cast p1, Lt7/a;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ls7/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lt7/a;->c(Ljava/lang/String;)Lt7/a;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lt7/a;->g()J

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    invoke-virtual {p1}, Lt7/a;->e()J

    move-result-wide v4

    long-to-double v4, v4

    mul-double/2addr v4, v2

    double-to-long v2, v4

    add-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lt7/n;->e:J

    iget-wide v0, p0, Lt7/n;->e:J

    invoke-virtual {p1}, Lt7/a;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lt7/a;->a()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lt7/n;->e:J

    :cond_1
    invoke-virtual {p0}, Lt7/n;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lt7/n;->a:Lt7/k;

    iget-wide v0, p0, Lt7/n;->e:J

    iget-object v2, p0, Lt7/n;->b:Lu7/a;

    invoke-interface {v2}, Lu7/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lt7/k;->g(J)V

    :cond_2
    return-void
.end method

.method public e(I)V
    .locals 5

    iget v0, p0, Lt7/n;->d:I

    if-nez v0, :cond_0

    if-lez p1, :cond_0

    iput p1, p0, Lt7/n;->d:I

    invoke-virtual {p0}, Lt7/n;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt7/n;->a:Lt7/k;

    iget-wide v1, p0, Lt7/n;->e:J

    iget-object v3, p0, Lt7/n;->b:Lu7/a;

    invoke-interface {v3}, Lu7/a;->a()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lt7/k;->g(J)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lt7/n;->d:I

    if-lez v0, :cond_1

    if-nez p1, :cond_1

    iget-object v0, p0, Lt7/n;->a:Lt7/k;

    invoke-virtual {v0}, Lt7/k;->c()V

    :cond_1
    :goto_0
    iput p1, p0, Lt7/n;->d:I

    return-void
.end method

.method public final f()Z
    .locals 4

    iget-boolean v0, p0, Lt7/n;->f:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lt7/n;->c:Z

    if-nez v0, :cond_0

    iget v0, p0, Lt7/n;->d:I

    if-lez v0, :cond_0

    iget-wide v0, p0, Lt7/n;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
