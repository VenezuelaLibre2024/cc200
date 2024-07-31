.class public abstract Lm2/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Ld2/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld2/c;

    invoke-direct {v0}, Ld2/c;-><init>()V

    iput-object v0, p0, Lm2/a;->h:Ld2/c;

    return-void
.end method

.method public static b(Ljava/util/UUID;Ld2/i;)Lm2/a;
    .locals 1

    new-instance v0, Lm2/a$a;

    invoke-direct {v0, p1, p0}, Lm2/a$a;-><init>(Ld2/i;Ljava/util/UUID;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ld2/i;Z)Lm2/a;
    .locals 1

    new-instance v0, Lm2/a$c;

    invoke-direct {v0, p1, p0, p2}, Lm2/a$c;-><init>(Ld2/i;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ld2/i;)Lm2/a;
    .locals 1

    new-instance v0, Lm2/a$b;

    invoke-direct {v0, p1, p0}, Lm2/a$b;-><init>(Ld2/i;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Ld2/i;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lm2/a;->f(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V

    invoke-virtual {p1}, Ld2/i;->m()Ld2/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Ld2/d;->l(Ljava/lang/String;)Z

    invoke-virtual {p1}, Ld2/i;->n()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld2/e;

    invoke-interface {v0, p2}, Ld2/e;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()Lc2/m;
    .locals 1

    iget-object v0, p0, Lm2/a;->h:Ld2/c;

    return-object v0
.end method

.method public final f(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->B()Ll2/q;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->t()Ll2/b;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p2}, Ll2/q;->m(Ljava/lang/String;)Lc2/s$a;

    move-result-object v2

    sget-object v3, Lc2/s$a;->j:Lc2/s$a;

    if-eq v2, v3, :cond_0

    sget-object v3, Lc2/s$a;->k:Lc2/s$a;

    if-eq v2, v3, :cond_0

    sget-object v2, Lc2/s$a;->m:Lc2/s$a;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-interface {v0, v2, v3}, Ll2/q;->i(Lc2/s$a;[Ljava/lang/String;)I

    :cond_0
    invoke-interface {p1, p2}, Ll2/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public g(Ld2/i;)V
    .locals 2

    invoke-virtual {p1}, Ld2/i;->i()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p1}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p1}, Ld2/i;->n()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ld2/f;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public abstract h()V
.end method

.method public run()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lm2/a;->h()V

    iget-object v0, p0, Lm2/a;->h:Ld2/c;

    sget-object v1, Lc2/m;->a:Lc2/m$b$c;

    invoke-virtual {v0, v1}, Ld2/c;->a(Lc2/m$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lm2/a;->h:Ld2/c;

    new-instance v2, Lc2/m$b$a;

    invoke-direct {v2, v0}, Lc2/m$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ld2/c;->a(Lc2/m$b;)V

    :goto_0
    return-void
.end method
