.class public final Le/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/b;",
            ">;"
        }
    .end annotation
.end field

.field public volatile b:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Le/a;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Le/b;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/a;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Le/b;->a(Landroid/content/Context;)V

    :cond_0
    iget-object v0, p0, Le/a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Le/a;->b:Landroid/content/Context;

    return-void
.end method

.method public final c(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le/a;->b:Landroid/content/Context;

    iget-object v0, p0, Le/a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b;

    invoke-interface {v1, p1}, Le/b;->a(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Le/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method public final e(Le/b;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
