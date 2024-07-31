.class public Lw2/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;


# instance fields
.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw2/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lw2/k;->h:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;ZLw2/r;)Lw2/o;
    .locals 0

    if-eqz p2, :cond_0

    new-instance p2, Lw2/p;

    invoke-direct {p2, p1, p3}, Lw2/p;-><init>(Landroid/content/Context;Lw2/r;)V

    return-object p2

    :cond_0
    invoke-virtual {p0, p1}, Lw2/k;->c(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Lw2/j;

    invoke-direct {p2, p1, p3}, Lw2/j;-><init>(Landroid/content/Context;Lw2/r;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lw2/p;

    invoke-direct {p2, p1, p3}, Lw2/p;-><init>(Landroid/content/Context;Lw2/r;)V

    :goto_0
    return-object p2
.end method

.method public b(Landroid/content/Context;ZLw2/w;Lv2/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lw2/k;->a(Landroid/content/Context;ZLw2/r;)Lw2/o;

    move-result-object p1

    invoke-interface {p1, p3, p4}, Lw2/o;->d(Lw2/w;Lv2/a;)V

    return-void
.end method

.method public final c(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Le6/e;->m()Le6/e;

    move-result-object v1

    invoke-virtual {v1, p1}, Le6/e;->g(Landroid/content/Context;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method

.method public d(Landroid/content/Context;Lw2/s;)V
    .locals 2

    if-nez p1, :cond_0

    sget-object v0, Lv2/b;->j:Lv2/b;

    invoke-interface {p2, v0}, Lw2/s;->b(Lv2/b;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lw2/k;->a(Landroid/content/Context;ZLw2/r;)Lw2/o;

    move-result-object p1

    invoke-interface {p1, p2}, Lw2/o;->e(Lw2/s;)V

    return-void
.end method

.method public e(Lw2/o;Landroid/app/Activity;Lw2/w;Lv2/a;)V
    .locals 1

    iget-object v0, p0, Lw2/k;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, p2, p3, p4}, Lw2/o;->b(Landroid/app/Activity;Lw2/w;Lv2/a;)V

    return-void
.end method

.method public f(Lw2/o;)V
    .locals 1

    iget-object v0, p0, Lw2/k;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lw2/o;->f()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    iget-object p3, p0, Lw2/k;->h:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw2/o;

    invoke-interface {v0, p1, p2}, Lw2/o;->c(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
