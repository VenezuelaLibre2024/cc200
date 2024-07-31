.class public final Lre/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lre/a0$a;
    }
.end annotation


# instance fields
.field public final h:Lre/y;

.field public i:Lue/k;

.field public final j:Lre/b0;

.field public final k:Z

.field public l:Z


# direct methods
.method public constructor <init>(Lre/y;Lre/b0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/a0;->h:Lre/y;

    iput-object p2, p0, Lre/a0;->j:Lre/b0;

    iput-boolean p3, p0, Lre/a0;->k:Z

    return-void
.end method

.method public static synthetic b(Lre/a0;)Lue/k;
    .locals 0

    iget-object p0, p0, Lre/a0;->i:Lue/k;

    return-object p0
.end method

.method public static h(Lre/y;Lre/b0;Z)Lre/a0;
    .locals 1

    new-instance v0, Lre/a0;

    invoke-direct {v0, p0, p1, p2}, Lre/a0;-><init>(Lre/y;Lre/b0;Z)V

    new-instance p1, Lue/k;

    invoke-direct {p1, p0, v0}, Lue/k;-><init>(Lre/y;Lre/e;)V

    iput-object p1, v0, Lre/a0;->i:Lue/k;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-object v0, p0, Lre/a0;->i:Lue/k;

    invoke-virtual {v0}, Lue/k;->d()V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lre/a0;->e()Lre/a0;

    move-result-object v0

    return-object v0
.end method

.method public d()Lre/d0;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lre/a0;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lre/a0;->l:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lre/a0;->i:Lue/k;

    invoke-virtual {v0}, Lue/k;->p()V

    iget-object v0, p0, Lre/a0;->i:Lue/k;

    invoke-virtual {v0}, Lue/k;->b()V

    :try_start_1
    iget-object v0, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v0}, Lre/y;->k()Lre/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lre/o;->b(Lre/a0;)V

    invoke-virtual {p0}, Lre/a0;->f()Lre/d0;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v1}, Lre/y;->k()Lre/o;

    move-result-object v1

    invoke-virtual {v1, p0}, Lre/o;->f(Lre/a0;)V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v1}, Lre/y;->k()Lre/o;

    move-result-object v1

    invoke-virtual {v1, p0}, Lre/o;->f(Lre/a0;)V

    throw v0

    :cond_0
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public e()Lre/a0;
    .locals 3

    iget-object v0, p0, Lre/a0;->h:Lre/y;

    iget-object v1, p0, Lre/a0;->j:Lre/b0;

    iget-boolean v2, p0, Lre/a0;->k:Z

    invoke-static {v0, v1, v2}, Lre/a0;->h(Lre/y;Lre/b0;Z)Lre/a0;

    move-result-object v0

    return-object v0
.end method

.method public f()Lre/d0;
    .locals 12

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v0}, Lre/y;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Lve/j;

    iget-object v2, p0, Lre/a0;->h:Lre/y;

    invoke-direct {v0, v2}, Lve/j;-><init>(Lre/y;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lve/a;

    iget-object v2, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v2}, Lre/y;->i()Lre/n;

    move-result-object v2

    invoke-direct {v0, v2}, Lve/a;-><init>(Lre/n;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lte/a;

    iget-object v2, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v2}, Lre/y;->r()Lte/d;

    move-result-object v2

    invoke-direct {v0, v2}, Lte/a;-><init>(Lte/d;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lue/a;

    iget-object v2, p0, Lre/a0;->h:Lre/y;

    invoke-direct {v0, v2}, Lue/a;-><init>(Lre/y;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lre/a0;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v0}, Lre/y;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    new-instance v0, Lve/b;

    iget-boolean v2, p0, Lre/a0;->k:Z

    invoke-direct {v0, v2}, Lve/b;-><init>(Z)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v10, Lve/g;

    iget-object v2, p0, Lre/a0;->i:Lue/k;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lre/a0;->j:Lre/b0;

    iget-object v0, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v0}, Lre/y;->f()I

    move-result v7

    iget-object v0, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v0}, Lre/y;->A()I

    move-result v8

    iget-object v0, p0, Lre/a0;->h:Lre/y;

    invoke-virtual {v0}, Lre/y;->F()I

    move-result v9

    move-object v0, v10

    move-object v6, p0

    invoke-direct/range {v0 .. v9}, Lve/g;-><init>(Ljava/util/List;Lue/k;Lue/c;ILre/b0;Lre/e;III)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lre/a0;->j:Lre/b0;

    invoke-interface {v10, v2}, Lre/w$a;->c(Lre/b0;)Lre/d0;

    move-result-object v2

    iget-object v3, p0, Lre/a0;->i:Lue/k;

    invoke-virtual {v3}, Lue/k;->i()Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    iget-object v0, p0, Lre/a0;->i:Lue/k;

    invoke-virtual {v0, v1}, Lue/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v2

    :cond_1
    :try_start_1
    invoke-static {v2}, Lse/e;->f(Ljava/io/Closeable;)V

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v2, 0x1

    :try_start_2
    iget-object v3, p0, Lre/a0;->i:Lue/k;

    invoke-virtual {v3, v0}, Lue/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move v11, v2

    move-object v2, v0

    move v0, v11

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, Lre/a0;->i:Lue/k;

    invoke-virtual {v0, v1}, Lue/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_2
    throw v2
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lre/a0;->i:Lue/k;

    invoke-virtual {v0}, Lue/k;->i()Z

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lre/a0;->j:Lre/b0;

    invoke-virtual {v0}, Lre/b0;->h()Lre/v;

    move-result-object v0

    invoke-virtual {v0}, Lre/v;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lre/a0;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lre/a0;->k:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lre/a0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
