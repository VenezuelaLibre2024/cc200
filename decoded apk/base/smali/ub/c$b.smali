.class public Lub/c$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lzb/a;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lac/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lac/b;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lub/b;

.field public e:Landroid/os/Handler;

.field public f:Lbc/e;

.field public g:Lbc/e;

.field public h:Lhc/b;

.field public i:I

.field public j:Lec/b;

.field public k:Ldc/a;

.field public l:Lyb/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lub/c$b;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lub/c$b;->c:Ljava/util/List;

    new-instance v0, Lzb/b;

    invoke-direct {v0, p1}, Lzb/b;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lub/c$b;->a:Lzb/a;

    return-void
.end method


# virtual methods
.method public a(Lac/b;)Lub/c$b;
    .locals 1

    iget-object v0, p0, Lub/c$b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lub/c$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lub/c;
    .locals 2

    iget-object v0, p0, Lub/c$b;->d:Lub/b;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lub/c$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lub/c$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "we need at least one data source"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget v0, p0, Lub/c$b;->i:I

    if-eqz v0, :cond_3

    const/16 v1, 0x5a

    if-eq v0, v1, :cond_3

    const/16 v1, 0xb4

    if-eq v0, v1, :cond_3

    const/16 v1, 0x10e

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Accepted values for rotation are 0, 90, 180, 270"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lub/c$b;->e:Landroid/os/Handler;

    if-nez v0, :cond_5

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :cond_4
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lub/c$b;->e:Landroid/os/Handler;

    :cond_5
    iget-object v0, p0, Lub/c$b;->f:Lbc/e;

    if-nez v0, :cond_6

    invoke-static {}, Lbc/a;->b()Lbc/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/a$b;->a()Lbc/a;

    move-result-object v0

    iput-object v0, p0, Lub/c$b;->f:Lbc/e;

    :cond_6
    iget-object v0, p0, Lub/c$b;->g:Lbc/e;

    if-nez v0, :cond_7

    invoke-static {}, Lbc/b;->a()Lbc/c;

    move-result-object v0

    iput-object v0, p0, Lub/c$b;->g:Lbc/e;

    :cond_7
    iget-object v0, p0, Lub/c$b;->h:Lhc/b;

    if-nez v0, :cond_8

    new-instance v0, Lhc/a;

    invoke-direct {v0}, Lhc/a;-><init>()V

    iput-object v0, p0, Lub/c$b;->h:Lhc/b;

    :cond_8
    iget-object v0, p0, Lub/c$b;->j:Lec/b;

    if-nez v0, :cond_9

    new-instance v0, Lec/a;

    invoke-direct {v0}, Lec/a;-><init>()V

    iput-object v0, p0, Lub/c$b;->j:Lec/b;

    :cond_9
    iget-object v0, p0, Lub/c$b;->k:Ldc/a;

    if-nez v0, :cond_a

    new-instance v0, Ldc/c;

    invoke-direct {v0}, Ldc/c;-><init>()V

    iput-object v0, p0, Lub/c$b;->k:Ldc/a;

    :cond_a
    iget-object v0, p0, Lub/c$b;->l:Lyb/a;

    if-nez v0, :cond_b

    new-instance v0, Lyb/b;

    invoke-direct {v0}, Lyb/b;-><init>()V

    iput-object v0, p0, Lub/c$b;->l:Lyb/a;

    :cond_b
    new-instance v0, Lub/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lub/c;-><init>(Lub/c$a;)V

    iget-object v1, p0, Lub/c$b;->d:Lub/b;

    iput-object v1, v0, Lub/c;->k:Lub/b;

    invoke-virtual {p0}, Lub/c$b;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lub/c;->b(Lub/c;Ljava/util/List;)Ljava/util/List;

    iget-object v1, p0, Lub/c$b;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lub/c;->c(Lub/c;Ljava/util/List;)Ljava/util/List;

    iget-object v1, p0, Lub/c$b;->a:Lzb/a;

    invoke-static {v0, v1}, Lub/c;->d(Lub/c;Lzb/a;)Lzb/a;

    iget-object v1, p0, Lub/c$b;->e:Landroid/os/Handler;

    iput-object v1, v0, Lub/c;->l:Landroid/os/Handler;

    iget-object v1, p0, Lub/c$b;->f:Lbc/e;

    invoke-static {v0, v1}, Lub/c;->e(Lub/c;Lbc/e;)Lbc/e;

    iget-object v1, p0, Lub/c$b;->g:Lbc/e;

    invoke-static {v0, v1}, Lub/c;->f(Lub/c;Lbc/e;)Lbc/e;

    iget-object v1, p0, Lub/c$b;->h:Lhc/b;

    invoke-static {v0, v1}, Lub/c;->g(Lub/c;Lhc/b;)Lhc/b;

    iget v1, p0, Lub/c$b;->i:I

    invoke-static {v0, v1}, Lub/c;->h(Lub/c;I)I

    iget-object v1, p0, Lub/c$b;->j:Lec/b;

    invoke-static {v0, v1}, Lub/c;->i(Lub/c;Lec/b;)Lec/b;

    iget-object v1, p0, Lub/c$b;->k:Ldc/a;

    invoke-static {v0, v1}, Lub/c;->j(Lub/c;Ldc/a;)Ldc/a;

    iget-object v1, p0, Lub/c$b;->l:Lyb/a;

    invoke-static {v0, v1}, Lub/c;->a(Lub/c;Lyb/a;)Lyb/a;

    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "listener can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lac/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lub/c$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lac/b;

    sget-object v6, Lvb/d;->i:Lvb/d;

    invoke-interface {v4, v6}, Lac/b;->e(Lvb/d;)Landroid/media/MediaFormat;

    move-result-object v4

    if-nez v4, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v2, v5

    :goto_0
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    move v1, v5

    :goto_1
    if-eqz v1, :cond_3

    iget-object v0, p0, Lub/c$b;->b:Ljava/util/List;

    return-object v0

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lub/c$b;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lac/b;

    sget-object v3, Lvb/d;->i:Lvb/d;

    invoke-interface {v2, v3}, Lac/b;->e(Lvb/d;)Landroid/media/MediaFormat;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v3, Lac/a;

    invoke-interface {v2}, Lac/b;->d()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lac/a;-><init>(J)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    return-object v0
.end method

.method public d(Lbc/e;)Lub/c$b;
    .locals 0

    iput-object p1, p0, Lub/c$b;->f:Lbc/e;

    return-object p0
.end method

.method public e(Lub/b;)Lub/c$b;
    .locals 0

    iput-object p1, p0, Lub/c$b;->d:Lub/b;

    return-object p0
.end method

.method public f(Lbc/e;)Lub/c$b;
    .locals 0

    iput-object p1, p0, Lub/c$b;->g:Lbc/e;

    return-object p0
.end method

.method public g()Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lub/a;->c()Lub/a;

    move-result-object v0

    invoke-virtual {p0}, Lub/c$b;->b()Lub/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lub/a;->e(Lub/c;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method
