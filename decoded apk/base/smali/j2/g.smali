.class public Lj2/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static e:Lj2/g;


# instance fields
.field public a:Lj2/a;

.field public b:Lj2/b;

.field public c:Lj2/e;

.field public d:Lj2/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo2/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lj2/a;

    invoke-direct {v0, p1, p2}, Lj2/a;-><init>(Landroid/content/Context;Lo2/a;)V

    iput-object v0, p0, Lj2/g;->a:Lj2/a;

    new-instance v0, Lj2/b;

    invoke-direct {v0, p1, p2}, Lj2/b;-><init>(Landroid/content/Context;Lo2/a;)V

    iput-object v0, p0, Lj2/g;->b:Lj2/b;

    new-instance v0, Lj2/e;

    invoke-direct {v0, p1, p2}, Lj2/e;-><init>(Landroid/content/Context;Lo2/a;)V

    iput-object v0, p0, Lj2/g;->c:Lj2/e;

    new-instance v0, Lj2/f;

    invoke-direct {v0, p1, p2}, Lj2/f;-><init>(Landroid/content/Context;Lo2/a;)V

    iput-object v0, p0, Lj2/g;->d:Lj2/f;

    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;Lo2/a;)Lj2/g;
    .locals 2

    const-class v0, Lj2/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj2/g;->e:Lj2/g;

    if-nez v1, :cond_0

    new-instance v1, Lj2/g;

    invoke-direct {v1, p0, p1}, Lj2/g;-><init>(Landroid/content/Context;Lo2/a;)V

    sput-object v1, Lj2/g;->e:Lj2/g;

    :cond_0
    sget-object p0, Lj2/g;->e:Lj2/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a()Lj2/a;
    .locals 1

    iget-object v0, p0, Lj2/g;->a:Lj2/a;

    return-object v0
.end method

.method public b()Lj2/b;
    .locals 1

    iget-object v0, p0, Lj2/g;->b:Lj2/b;

    return-object v0
.end method

.method public d()Lj2/e;
    .locals 1

    iget-object v0, p0, Lj2/g;->c:Lj2/e;

    return-object v0
.end method

.method public e()Lj2/f;
    .locals 1

    iget-object v0, p0, Lj2/g;->d:Lj2/f;

    return-object v0
.end method
