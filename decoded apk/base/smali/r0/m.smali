.class public final Lr0/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr0/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr0/m$b;,
        Lr0/m$c;,
        Lr0/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lr0/f<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final k:Lr0/m$a;

.field public static final l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:Ljava/lang/Object;


# instance fields
.field public final a:Lsd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/a<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lr0/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lr0/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lce/p0;

.field public final e:Lfe/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final f:Ljava/lang/String;

.field public final g:Lgd/g;

.field public final h:Lfe/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/k<",
            "Lr0/n<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lsd/p<",
            "-",
            "Lr0/i<",
            "TT;>;-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final j:Lr0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/l<",
            "Lr0/m$b<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr0/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr0/m$a;-><init>(Ltd/g;)V

    sput-object v0, Lr0/m;->k:Lr0/m$a;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Lr0/m;->l:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lr0/m;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsd/a;Lr0/k;Ljava/util/List;Lr0/b;Lce/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/a<",
            "+",
            "Ljava/io/File;",
            ">;",
            "Lr0/k<",
            "TT;>;",
            "Ljava/util/List<",
            "+",
            "Lsd/p<",
            "-",
            "Lr0/i<",
            "TT;>;-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;>;",
            "Lr0/b<",
            "TT;>;",
            "Lce/p0;",
            ")V"
        }
    .end annotation

    const-string v0, "produceFile"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initTasksList"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "corruptionHandler"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p5, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/m;->a:Lsd/a;

    iput-object p2, p0, Lr0/m;->b:Lr0/k;

    iput-object p4, p0, Lr0/m;->c:Lr0/b;

    iput-object p5, p0, Lr0/m;->d:Lce/p0;

    new-instance p1, Lr0/m$g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lr0/m$g;-><init>(Lr0/m;Ljd/d;)V

    invoke-static {p1}, Lfe/d;->g(Lsd/p;)Lfe/b;

    move-result-object p1

    iput-object p1, p0, Lr0/m;->e:Lfe/b;

    const-string p1, ".tmp"

    iput-object p1, p0, Lr0/m;->f:Ljava/lang/String;

    new-instance p1, Lr0/m$h;

    invoke-direct {p1, p0}, Lr0/m$h;-><init>(Lr0/m;)V

    invoke-static {p1}, Lgd/h;->a(Lsd/a;)Lgd/g;

    move-result-object p1

    iput-object p1, p0, Lr0/m;->g:Lgd/g;

    sget-object p1, Lr0/o;->a:Lr0/o;

    invoke-static {p1}, Lfe/n;->a(Ljava/lang/Object;)Lfe/k;

    move-result-object p1

    iput-object p1, p0, Lr0/m;->h:Lfe/k;

    invoke-static {p3}, Lhd/v;->K(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lr0/m;->i:Ljava/util/List;

    new-instance p1, Lr0/l;

    new-instance p3, Lr0/m$d;

    invoke-direct {p3, p0}, Lr0/m$d;-><init>(Lr0/m;)V

    sget-object p4, Lr0/m$e;->h:Lr0/m$e;

    new-instance v0, Lr0/m$f;

    invoke-direct {v0, p0, p2}, Lr0/m$f;-><init>(Lr0/m;Ljd/d;)V

    invoke-direct {p1, p5, p3, p4, v0}, Lr0/l;-><init>(Lce/p0;Lsd/l;Lsd/p;Lsd/p;)V

    iput-object p1, p0, Lr0/m;->j:Lr0/l;

    return-void
.end method

.method public static final synthetic b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lr0/m;->l:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr0/m;->m:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic d(Lr0/m;)Lr0/l;
    .locals 0

    iget-object p0, p0, Lr0/m;->j:Lr0/l;

    return-object p0
.end method

.method public static final synthetic e(Lr0/m;)Lfe/k;
    .locals 0

    iget-object p0, p0, Lr0/m;->h:Lfe/k;

    return-object p0
.end method

.method public static final synthetic f(Lr0/m;)Ljava/io/File;
    .locals 0

    invoke-virtual {p0}, Lr0/m;->q()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lr0/m;)Lsd/a;
    .locals 0

    iget-object p0, p0, Lr0/m;->a:Lsd/a;

    return-object p0
.end method

.method public static final synthetic h(Lr0/m;Lr0/m$b$a;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr0/m;->r(Lr0/m$b$a;Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lr0/m;Lr0/m$b$b;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr0/m;->s(Lr0/m$b$b;Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lr0/m;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr0/m;->t(Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lr0/m;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr0/m;->u(Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lr0/m;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr0/m;->v(Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lr0/m;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr0/m;->w(Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lr0/m;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr0/m;->x(Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lr0/m;Lsd/p;Ljd/g;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lr0/m;->y(Lsd/p;Ljd/g;Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lsd/p;Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/p<",
            "-TT;-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljd/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lce/z;->b(Lce/c2;ILjava/lang/Object;)Lce/x;

    move-result-object v0

    iget-object v1, p0, Lr0/m;->h:Lfe/k;

    invoke-interface {v1}, Lfe/k;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr0/n;

    new-instance v2, Lr0/m$b$b;

    invoke-interface {p2}, Ljd/d;->getContext()Ljd/g;

    move-result-object v3

    invoke-direct {v2, p1, v0, v1, v3}, Lr0/m$b$b;-><init>(Lsd/p;Lce/x;Lr0/n;Ljd/g;)V

    iget-object p1, p0, Lr0/m;->j:Lr0/l;

    invoke-virtual {p1, v2}, Lr0/l;->e(Ljava/lang/Object;)V

    invoke-interface {v0, p2}, Lce/x0;->f0(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getData()Lfe/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfe/b<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lr0/m;->e:Lfe/b;

    return-object v0
.end method

.method public final p(Ljava/io/File;)V
    .locals 2

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unable to create parent directories of "

    invoke-static {v1, p1}, Ltd/m;->m(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lr0/m;->g:Lgd/g;

    invoke-interface {v0}, Lgd/g;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method public final r(Lr0/m$b$a;Ljd/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/m$b$a<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lr0/m;->h:Lfe/k;

    invoke-interface {v0}, Lfe/k;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr0/n;

    instance-of v1, v0, Lr0/c;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lr0/j;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lr0/m$b$a;->a()Lr0/n;

    move-result-object p1

    if-ne v0, p1, :cond_5

    invoke-virtual {p0, p2}, Lr0/m;->v(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :cond_2
    sget-object p1, Lr0/o;->a:Lr0/o;

    invoke-static {v0, p1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, p2}, Lr0/m;->v(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :cond_4
    instance-of p1, v0, Lr0/h;

    if-nez p1, :cond_6

    :cond_5
    :goto_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can\'t read in final state."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final s(Lr0/m$b$b;Ljd/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/m$b$b<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lr0/m$i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lr0/m$i;

    iget v1, v0, Lr0/m$i;->m:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/m$i;->m:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/m$i;

    invoke-direct {v0, p0, p2}, Lr0/m$i;-><init>(Lr0/m;Ljd/d;)V

    :goto_0
    iget-object p2, v0, Lr0/m$i;->k:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr0/m$i;->m:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lr0/m$i;->h:Ljava/lang/Object;

    check-cast p1, Lce/x;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lr0/m$i;->j:Ljava/lang/Object;

    check-cast p1, Lce/x;

    iget-object v2, v0, Lr0/m$i;->i:Ljava/lang/Object;

    check-cast v2, Lr0/m;

    iget-object v4, v0, Lr0/m$i;->h:Ljava/lang/Object;

    check-cast v4, Lr0/m$b$b;

    :try_start_0
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p2, p1

    move-object p1, v4

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lr0/m$i;->h:Ljava/lang/Object;

    check-cast p1, Lce/x;

    :goto_1
    :try_start_1
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    goto/16 :goto_5

    :cond_4
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lr0/m$b$b;->a()Lce/x;

    move-result-object p2

    :try_start_2
    sget-object v2, Lgd/k;->i:Lgd/k$a;

    iget-object v2, p0, Lr0/m;->h:Lfe/k;

    invoke-interface {v2}, Lfe/k;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr0/n;

    instance-of v6, v2, Lr0/c;

    if-eqz v6, :cond_6

    invoke-virtual {p1}, Lr0/m$b$b;->d()Lsd/p;

    move-result-object v2

    invoke-virtual {p1}, Lr0/m$b$b;->b()Ljd/g;

    move-result-object p1

    iput-object p2, v0, Lr0/m$i;->h:Ljava/lang/Object;

    iput v5, v0, Lr0/m$i;->m:I

    invoke-virtual {p0, v2, p1, v0}, Lr0/m;->y(Lsd/p;Ljd/g;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_4

    :cond_6
    instance-of v6, v2, Lr0/j;

    if-eqz v6, :cond_7

    goto :goto_2

    :cond_7
    instance-of v5, v2, Lr0/o;

    :goto_2
    if-eqz v5, :cond_a

    invoke-virtual {p1}, Lr0/m$b$b;->c()Lr0/n;

    move-result-object v5

    if-ne v2, v5, :cond_9

    iput-object p1, v0, Lr0/m$i;->h:Ljava/lang/Object;

    iput-object p0, v0, Lr0/m$i;->i:Ljava/lang/Object;

    iput-object p2, v0, Lr0/m$i;->j:Ljava/lang/Object;

    iput v4, v0, Lr0/m$i;->m:I

    invoke-virtual {p0, v0}, Lr0/m;->u(Ljd/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v2, p0

    :goto_3
    invoke-virtual {p1}, Lr0/m$b$b;->d()Lsd/p;

    move-result-object v4

    invoke-virtual {p1}, Lr0/m$b$b;->b()Ljd/g;

    move-result-object p1

    iput-object p2, v0, Lr0/m$i;->h:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Lr0/m$i;->i:Ljava/lang/Object;

    iput-object v5, v0, Lr0/m$i;->j:Ljava/lang/Object;

    iput v3, v0, Lr0/m$i;->m:I

    invoke-virtual {v2, v4, p1, v0}, Lr0/m;->y(Lsd/p;Ljd/g;Ljd/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_5

    return-object v1

    :goto_4
    :try_start_3
    invoke-static {p2}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :cond_9
    :try_start_4
    check-cast v2, Lr0/j;

    invoke-virtual {v2}, Lr0/j;->a()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_a
    instance-of p1, v2, Lr0/h;

    if-eqz p1, :cond_b

    check-cast v2, Lr0/h;

    invoke-virtual {v2}, Lr0/h;->a()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_b
    new-instance p1, Lgd/i;

    invoke-direct {p1}, Lgd/i;-><init>()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_5
    sget-object v0, Lgd/k;->i:Lgd/k$a;

    invoke-static {p2}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_6
    invoke-static {p1, p2}, Lce/z;->c(Lce/x;Ljava/lang/Object;)Z

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public final t(Ljd/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lr0/m$j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr0/m$j;

    iget v1, v0, Lr0/m$j;->p:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/m$j;->p:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/m$j;

    invoke-direct {v0, p0, p1}, Lr0/m$j;-><init>(Lr0/m;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lr0/m$j;->n:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr0/m$j;->p:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lr0/m$j;->k:Ljava/lang/Object;

    check-cast v1, Lle/a;

    iget-object v2, v0, Lr0/m$j;->j:Ljava/lang/Object;

    check-cast v2, Ltd/u;

    iget-object v3, v0, Lr0/m$j;->i:Ljava/lang/Object;

    check-cast v3, Ltd/w;

    iget-object v0, v0, Lr0/m$j;->h:Ljava/lang/Object;

    check-cast v0, Lr0/m;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lr0/m$j;->m:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v8, v0, Lr0/m$j;->l:Ljava/lang/Object;

    check-cast v8, Lr0/m$k;

    iget-object v9, v0, Lr0/m$j;->k:Ljava/lang/Object;

    check-cast v9, Ltd/u;

    iget-object v10, v0, Lr0/m$j;->j:Ljava/lang/Object;

    check-cast v10, Ltd/w;

    iget-object v11, v0, Lr0/m$j;->i:Ljava/lang/Object;

    check-cast v11, Lle/a;

    iget-object v12, v0, Lr0/m$j;->h:Ljava/lang/Object;

    check-cast v12, Lr0/m;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v2, v0, Lr0/m$j;->k:Ljava/lang/Object;

    check-cast v2, Ltd/w;

    iget-object v8, v0, Lr0/m$j;->j:Ljava/lang/Object;

    check-cast v8, Ltd/w;

    iget-object v9, v0, Lr0/m$j;->i:Ljava/lang/Object;

    check-cast v9, Lle/a;

    iget-object v10, v0, Lr0/m$j;->h:Ljava/lang/Object;

    check-cast v10, Lr0/m;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr0/m;->h:Lfe/k;

    invoke-interface {p1}, Lfe/k;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v2, Lr0/o;->a:Lr0/o;

    invoke-static {p1, v2}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lr0/m;->h:Lfe/k;

    invoke-interface {p1}, Lfe/k;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lr0/j;

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    move p1, v5

    goto :goto_2

    :cond_6
    :goto_1
    move p1, v6

    :goto_2
    if-eqz p1, :cond_d

    invoke-static {v5, v6, v7}, Lle/c;->b(ZILjava/lang/Object;)Lle/a;

    move-result-object v9

    new-instance v2, Ltd/w;

    invoke-direct {v2}, Ltd/w;-><init>()V

    iput-object p0, v0, Lr0/m$j;->h:Ljava/lang/Object;

    iput-object v9, v0, Lr0/m$j;->i:Ljava/lang/Object;

    iput-object v2, v0, Lr0/m$j;->j:Ljava/lang/Object;

    iput-object v2, v0, Lr0/m$j;->k:Ljava/lang/Object;

    iput v6, v0, Lr0/m$j;->p:I

    invoke-virtual {p0, v0}, Lr0/m;->x(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object v10, p0

    move-object v8, v2

    :goto_3
    iput-object p1, v2, Ltd/w;->h:Ljava/lang/Object;

    new-instance p1, Ltd/u;

    invoke-direct {p1}, Ltd/u;-><init>()V

    new-instance v2, Lr0/m$k;

    invoke-direct {v2, v9, p1, v8, v10}, Lr0/m$k;-><init>(Lle/a;Ltd/u;Ltd/w;Lr0/m;)V

    iget-object v11, v10, Lr0/m;->i:Ljava/util/List;

    if-nez v11, :cond_8

    move-object v2, v1

    move-object v1, v9

    move-object v9, p1

    move-object p1, v0

    move-object v0, v10

    goto :goto_5

    :cond_8
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v12, v10

    move-object v10, v8

    move-object v8, v2

    move-object v2, v11

    move-object v11, v9

    move-object v9, p1

    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsd/p;

    iput-object v12, v0, Lr0/m$j;->h:Ljava/lang/Object;

    iput-object v11, v0, Lr0/m$j;->i:Ljava/lang/Object;

    iput-object v10, v0, Lr0/m$j;->j:Ljava/lang/Object;

    iput-object v9, v0, Lr0/m$j;->k:Ljava/lang/Object;

    iput-object v8, v0, Lr0/m$j;->l:Ljava/lang/Object;

    iput-object v2, v0, Lr0/m$j;->m:Ljava/lang/Object;

    iput v4, v0, Lr0/m$j;->p:I

    invoke-interface {p1, v8, v0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_a
    move-object p1, v0

    move-object v2, v1

    move-object v8, v10

    move-object v1, v11

    move-object v0, v12

    :goto_5
    iput-object v7, v0, Lr0/m;->i:Ljava/util/List;

    iput-object v0, p1, Lr0/m$j;->h:Ljava/lang/Object;

    iput-object v8, p1, Lr0/m$j;->i:Ljava/lang/Object;

    iput-object v9, p1, Lr0/m$j;->j:Ljava/lang/Object;

    iput-object v1, p1, Lr0/m$j;->k:Ljava/lang/Object;

    iput-object v7, p1, Lr0/m$j;->l:Ljava/lang/Object;

    iput-object v7, p1, Lr0/m$j;->m:Ljava/lang/Object;

    iput v3, p1, Lr0/m$j;->p:I

    invoke-interface {v1, v7, p1}, Lle/a;->b(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_b

    return-object v2

    :cond_b
    move-object v3, v8

    move-object v2, v9

    :goto_6
    :try_start_0
    iput-boolean v6, v2, Ltd/u;->h:Z

    sget-object p1, Lgd/s;->a:Lgd/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v7}, Lle/a;->c(Ljava/lang/Object;)V

    iget-object v0, v0, Lr0/m;->h:Lfe/k;

    new-instance v1, Lr0/c;

    iget-object v2, v3, Ltd/w;->h:Ljava/lang/Object;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v5

    :cond_c
    invoke-direct {v1, v2, v5}, Lr0/c;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lfe/k;->setValue(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v7}, Lle/a;->c(Ljava/lang/Object;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u(Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lr0/m$l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr0/m$l;

    iget v1, v0, Lr0/m$l;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/m$l;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/m$l;

    invoke-direct {v0, p0, p1}, Lr0/m$l;-><init>(Lr0/m;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lr0/m$l;->i:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr0/m$l;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lr0/m$l;->h:Ljava/lang/Object;

    check-cast v0, Lr0/m;

    :try_start_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, Lr0/m$l;->h:Ljava/lang/Object;

    iput v3, v0, Lr0/m$l;->k:I

    invoke-virtual {p0, v0}, Lr0/m;->t(Ljd/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    iget-object v0, v0, Lr0/m;->h:Lfe/k;

    new-instance v1, Lr0/j;

    invoke-direct {v1, p1}, Lr0/j;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lfe/k;->setValue(Ljava/lang/Object;)V

    throw p1
.end method

.method public final v(Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lr0/m$m;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr0/m$m;

    iget v1, v0, Lr0/m$m;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/m$m;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/m$m;

    invoke-direct {v0, p0, p1}, Lr0/m$m;-><init>(Lr0/m;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lr0/m$m;->i:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr0/m$m;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lr0/m$m;->h:Ljava/lang/Object;

    check-cast v0, Lr0/m;

    :try_start_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, Lr0/m$m;->h:Ljava/lang/Object;

    iput v3, v0, Lr0/m$m;->k:I

    invoke-virtual {p0, v0}, Lr0/m;->t(Ljd/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_1
    iget-object v0, v0, Lr0/m;->h:Lfe/k;

    new-instance v1, Lr0/j;

    invoke-direct {v1, p1}, Lr0/j;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lfe/k;->setValue(Ljava/lang/Object;)V

    :cond_3
    :goto_2
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public final w(Ljd/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lr0/m$n;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr0/m$n;

    iget v1, v0, Lr0/m$n;->m:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/m$n;->m:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/m$n;

    invoke-direct {v0, p0, p1}, Lr0/m$n;-><init>(Lr0/m;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lr0/m$n;->k:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr0/m$n;->m:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lr0/m$n;->j:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v2, v0, Lr0/m$n;->i:Ljava/lang/Object;

    check-cast v2, Ljava/io/Closeable;

    iget-object v0, v0, Lr0/m$n;->h:Ljava/lang/Object;

    check-cast v0, Lr0/m;

    :try_start_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance v2, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Lr0/m;->q()Ljava/io/File;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 p1, 0x0

    :try_start_2
    iget-object v4, p0, Lr0/m;->b:Lr0/k;

    iput-object p0, v0, Lr0/m$n;->h:Ljava/lang/Object;

    iput-object v2, v0, Lr0/m$n;->i:Ljava/lang/Object;

    iput-object p1, v0, Lr0/m$n;->j:Ljava/lang/Object;

    iput v3, v0, Lr0/m$n;->m:I

    invoke-interface {v4, v2, v0}, Lr0/k;->c(Ljava/io/InputStream;Ljd/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    :goto_1
    :try_start_3
    invoke-static {v2, v1}, Lqd/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_5
    invoke-static {v2, p1}, Lqd/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_1
    move-exception p1

    move-object v0, p0

    :goto_3
    invoke-virtual {v0}, Lr0/m;->q()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object p1, v0, Lr0/m;->b:Lr0/k;

    invoke-interface {p1}, Lr0/k;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    throw p1
.end method

.method public final x(Ljd/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lr0/m$o;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr0/m$o;

    iget v1, v0, Lr0/m$o;->l:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/m$o;->l:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/m$o;

    invoke-direct {v0, p0, p1}, Lr0/m$o;-><init>(Lr0/m;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lr0/m$o;->j:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr0/m$o;->l:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lr0/m$o;->i:Ljava/lang/Object;

    iget-object v0, v0, Lr0/m$o;->h:Ljava/lang/Object;

    check-cast v0, Lr0/a;

    :try_start_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lr0/m$o;->i:Ljava/lang/Object;

    check-cast v2, Lr0/a;

    iget-object v4, v0, Lr0/m$o;->h:Ljava/lang/Object;

    check-cast v4, Lr0/m;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lr0/m$o;->h:Ljava/lang/Object;

    check-cast v2, Lr0/m;

    :try_start_1
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lr0/a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lr0/m$o;->h:Ljava/lang/Object;

    iput v5, v0, Lr0/m$o;->l:I

    invoke-virtual {p0, v0}, Lr0/m;->w(Ljd/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Lr0/a; {:try_start_2 .. :try_end_2} :catch_2

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    return-object p1

    :catch_2
    move-exception p1

    move-object v2, p0

    :goto_2
    iget-object v5, v2, Lr0/m;->c:Lr0/b;

    iput-object v2, v0, Lr0/m$o;->h:Ljava/lang/Object;

    iput-object p1, v0, Lr0/m$o;->i:Ljava/lang/Object;

    iput v4, v0, Lr0/m$o;->l:I

    invoke-interface {v5, p1, v0}, Lr0/b;->a(Lr0/a;Ljd/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    return-object v1

    :cond_6
    move-object v6, v2

    move-object v2, p1

    move-object p1, v4

    move-object v4, v6

    :goto_3
    :try_start_3
    iput-object v2, v0, Lr0/m$o;->h:Ljava/lang/Object;

    iput-object p1, v0, Lr0/m$o;->i:Ljava/lang/Object;

    iput v3, v0, Lr0/m$o;->l:I

    invoke-virtual {v4, p1, v0}, Lr0/m;->z(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    if-ne v0, v1, :cond_7

    return-object v1

    :cond_7
    move-object v1, p1

    :goto_4
    return-object v1

    :catch_3
    move-exception p1

    move-object v0, v2

    :goto_5
    invoke-static {v0, p1}, Lgd/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final y(Lsd/p;Ljd/g;Ljd/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/p<",
            "-TT;-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljd/g;",
            "Ljd/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lr0/m$p;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lr0/m$p;

    iget v1, v0, Lr0/m$p;->m:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/m$p;->m:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/m$p;

    invoke-direct {v0, p0, p3}, Lr0/m$p;-><init>(Lr0/m;Ljd/d;)V

    :goto_0
    iget-object p3, v0, Lr0/m$p;->k:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr0/m$p;->m:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lr0/m$p;->i:Ljava/lang/Object;

    iget-object p2, v0, Lr0/m$p;->h:Ljava/lang/Object;

    check-cast p2, Lr0/m;

    invoke-static {p3}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lr0/m$p;->j:Ljava/lang/Object;

    iget-object p2, v0, Lr0/m$p;->i:Ljava/lang/Object;

    check-cast p2, Lr0/c;

    iget-object v2, v0, Lr0/m$p;->h:Ljava/lang/Object;

    check-cast v2, Lr0/m;

    invoke-static {p3}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lr0/m;->h:Lfe/k;

    invoke-interface {p3}, Lfe/k;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lr0/c;

    invoke-virtual {p3}, Lr0/c;->a()V

    invoke-virtual {p3}, Lr0/c;->b()Ljava/lang/Object;

    move-result-object v2

    new-instance v6, Lr0/m$q;

    invoke-direct {v6, p1, v2, v3}, Lr0/m$q;-><init>(Lsd/p;Ljava/lang/Object;Ljd/d;)V

    iput-object p0, v0, Lr0/m$p;->h:Ljava/lang/Object;

    iput-object p3, v0, Lr0/m$p;->i:Ljava/lang/Object;

    iput-object v2, v0, Lr0/m$p;->j:Ljava/lang/Object;

    iput v5, v0, Lr0/m$p;->m:I

    invoke-static {p2, v6, v0}, Lce/i;->g(Ljd/g;Lsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p2, p3

    move-object p3, p1

    move-object p1, v2

    move-object v2, p0

    :goto_1
    invoke-virtual {p2}, Lr0/c;->a()V

    invoke-static {p1, p3}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_4

    :cond_5
    iput-object v2, v0, Lr0/m$p;->h:Ljava/lang/Object;

    iput-object p3, v0, Lr0/m$p;->i:Ljava/lang/Object;

    iput-object v3, v0, Lr0/m$p;->j:Ljava/lang/Object;

    iput v4, v0, Lr0/m$p;->m:I

    invoke-virtual {v2, p3, v0}, Lr0/m;->z(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object p1, p3

    move-object p2, v2

    :goto_2
    iget-object p2, p2, Lr0/m;->h:Lfe/k;

    new-instance p3, Lr0/c;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    invoke-direct {p3, p1, v0}, Lr0/c;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p2, p3}, Lfe/k;->setValue(Ljava/lang/Object;)V

    :goto_4
    return-object p1
.end method

.method public final z(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lr0/m$r;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lr0/m$r;

    iget v1, v0, Lr0/m$r;->o:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr0/m$r;->o:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/m$r;

    invoke-direct {v0, p0, p2}, Lr0/m$r;-><init>(Lr0/m;Ljd/d;)V

    :goto_0
    iget-object p2, v0, Lr0/m$r;->m:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr0/m$r;->o:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lr0/m$r;->l:Ljava/lang/Object;

    check-cast p1, Ljava/io/FileOutputStream;

    iget-object v1, v0, Lr0/m$r;->k:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v2, v0, Lr0/m$r;->j:Ljava/lang/Object;

    check-cast v2, Ljava/io/Closeable;

    iget-object v3, v0, Lr0/m$r;->i:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    iget-object v0, v0, Lr0/m$r;->h:Ljava/lang/Object;

    check-cast v0, Lr0/m;

    :try_start_0
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr0/m;->q()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p0, p2}, Lr0/m;->p(Ljava/io/File;)V

    new-instance p2, Ljava/io/File;

    invoke-virtual {p0}, Lr0/m;->q()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lr0/m;->f:Ljava/lang/String;

    invoke-static {v2, v4}, Ltd/m;->m(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v4, 0x0

    :try_start_2
    iget-object v5, p0, Lr0/m;->b:Lr0/k;

    new-instance v6, Lr0/m$c;

    invoke-direct {v6, v2}, Lr0/m$c;-><init>(Ljava/io/FileOutputStream;)V

    iput-object p0, v0, Lr0/m$r;->h:Ljava/lang/Object;

    iput-object p2, v0, Lr0/m$r;->i:Ljava/lang/Object;

    iput-object v2, v0, Lr0/m$r;->j:Ljava/lang/Object;

    iput-object v4, v0, Lr0/m$r;->k:Ljava/lang/Object;

    iput-object v2, v0, Lr0/m$r;->l:Ljava/lang/Object;

    iput v3, v0, Lr0/m$r;->o:I

    invoke-interface {v5, p1, v6, v0}, Lr0/k;->a(Ljava/lang/Object;Ljava/io/OutputStream;Ljd/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v3, p2

    move-object p1, v2

    move-object v1, v4

    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V

    sget-object p1, Lgd/s;->a:Lgd/s;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {v2, v1}, Lqd/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lr0/m;->q()Ljava/io/File;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_4

    return-object p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to rename "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catchall_1
    move-exception p1

    move-object v3, p2

    :goto_2
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_6
    invoke-static {v2, p1}, Lqd/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p1

    move-object p2, v3

    goto :goto_3

    :catch_1
    move-exception p1

    :goto_3
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    :cond_5
    throw p1
.end method
