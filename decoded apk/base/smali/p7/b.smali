.class public Lp7/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp7/a;


# static fields
.field public static volatile c:Lp7/a;


# instance fields
.field public final a:Lb7/a;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lp7/b;->a:Lb7/a;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lp7/b;->b:Ljava/util/Map;

    return-void
.end method

.method public static d(Ln7/g;Landroid/content/Context;Lu8/d;)Lp7/a;
    .locals 5

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lp7/b;->c:Lp7/a;

    if-nez v0, :cond_2

    const-class v0, Lp7/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lp7/b;->c:Lp7/a;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(I)V

    invoke-virtual {p0}, Ln7/g;->y()Z

    move-result v2

    if-eqz v2, :cond_0

    const-class v2, Ln7/b;

    sget-object v3, Lp7/c;->h:Lp7/c;

    sget-object v4, Lp7/d;->a:Lp7/d;

    invoke-interface {p2, v2, v3, v4}, Lu8/d;->b(Ljava/lang/Class;Ljava/util/concurrent/Executor;Lu8/b;)V

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p0}, Ln7/g;->x()Z

    move-result p0

    invoke-virtual {v1, p2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    new-instance p0, Lp7/b;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2, p2, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zzb()Lb7/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lp7/b;-><init>(Lb7/a;)V

    sput-object p0, Lp7/b;->c:Lp7/a;

    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_0
    sget-object p0, Lp7/b;->c:Lp7/a;

    return-object p0
.end method

.method public static synthetic e(Lu8/a;)V
    .locals 2

    invoke-virtual {p0}, Lu8/a;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln7/b;

    iget-boolean p0, p0, Ln7/b;->a:Z

    const-class v0, Lp7/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lp7/b;->c:Lp7/a;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp7/b;

    iget-object v1, v1, Lp7/b;->a:Lb7/a;

    invoke-virtual {v1, p0}, Lb7/a;->d(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    if-nez p3, :cond_0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-static {p1}, Lq7/a;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p2, p3}, Lq7/a;->c(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-static {p1, p2, p3}, Lq7/a;->e(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-static {p1, p2, p3}, Lq7/a;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, Lp7/b;->a:Lb7/a;

    invoke-virtual {v0, p1, p2, p3}, Lb7/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-static {p1}, Lq7/a;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Lq7/a;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lp7/b;->a:Lb7/a;

    invoke-virtual {v0, p1, p2, p3}, Lb7/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/String;Lp7/a$b;)Lp7/a$a;
    .locals 3

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lq7/a;->g(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0, p1}, Lp7/b;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Lp7/b;->a:Lb7/a;

    const-string v2, "fiam"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lq7/d;

    invoke-direct {v2, v0, p2}, Lq7/d;-><init>(Lb7/a;Lp7/a$b;)V

    goto :goto_0

    :cond_2
    const-string v2, "clx"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Lq7/f;

    invoke-direct {v2, v0, p2}, Lq7/f;-><init>(Lb7/a;Lp7/a$b;)V

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_4

    iget-object p2, p0, Lp7/b;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lp7/b$a;

    invoke-direct {p2, p0, p1}, Lp7/b$a;-><init>(Lp7/b;Ljava/lang/String;)V

    return-object p2

    :cond_4
    return-object v1
.end method

.method public final f(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp7/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp7/b;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
