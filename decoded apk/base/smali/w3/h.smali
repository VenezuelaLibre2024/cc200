.class public Lw3/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw3/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/h$f;,
        Lw3/h$c;,
        Lw3/h$h;,
        Lw3/h$g;,
        Lw3/h$d;,
        Lw3/h$e;,
        Lw3/h$b;
    }
.end annotation


# instance fields
.field public final c:Ljava/util/UUID;

.field public final d:Lw3/b0$c;

.field public final e:Lw3/i0;

.field public final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Z

.field public final h:[I

.field public final i:Z

.field public final j:Lw3/h$g;

.field public final k:Lo5/d0;

.field public final l:Lw3/h$h;

.field public final m:J

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw3/g;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw3/h$f;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw3/g;",
            ">;"
        }
    .end annotation
.end field

.field public q:I

.field public r:Lw3/b0;

.field public s:Lw3/g;

.field public t:Lw3/g;

.field public u:Landroid/os/Looper;

.field public v:Landroid/os/Handler;

.field public w:I

.field public x:[B

.field public y:Lt3/s1;

.field public volatile z:Lw3/h$d;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lw3/b0$c;Lw3/i0;Ljava/util/HashMap;Z[IZLo5/d0;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lw3/b0$c;",
            "Lw3/i0;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z[IZ",
            "Lo5/d0;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ls3/i;->b:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Use C.CLEARKEY_UUID instead"

    invoke-static {v0, v1}, Lp5/a;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lw3/h;->c:Ljava/util/UUID;

    iput-object p2, p0, Lw3/h;->d:Lw3/b0$c;

    iput-object p3, p0, Lw3/h;->e:Lw3/i0;

    iput-object p4, p0, Lw3/h;->f:Ljava/util/HashMap;

    iput-boolean p5, p0, Lw3/h;->g:Z

    iput-object p6, p0, Lw3/h;->h:[I

    iput-boolean p7, p0, Lw3/h;->i:Z

    iput-object p8, p0, Lw3/h;->k:Lo5/d0;

    new-instance p1, Lw3/h$g;

    invoke-direct {p1, p0}, Lw3/h$g;-><init>(Lw3/h;)V

    iput-object p1, p0, Lw3/h;->j:Lw3/h$g;

    new-instance p1, Lw3/h$h;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lw3/h$h;-><init>(Lw3/h;Lw3/h$a;)V

    iput-object p1, p0, Lw3/h;->l:Lw3/h$h;

    const/4 p1, 0x0

    iput p1, p0, Lw3/h;->w:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lw3/h;->n:Ljava/util/List;

    invoke-static {}, Li7/y0;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lw3/h;->o:Ljava/util/Set;

    invoke-static {}, Li7/y0;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lw3/h;->p:Ljava/util/Set;

    iput-wide p9, p0, Lw3/h;->m:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Lw3/b0$c;Lw3/i0;Ljava/util/HashMap;Z[IZLo5/d0;JLw3/h$a;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lw3/h;-><init>(Ljava/util/UUID;Lw3/b0$c;Lw3/i0;Ljava/util/HashMap;Z[IZLo5/d0;J)V

    return-void
.end method

.method public static synthetic f(Lw3/h;)Lw3/g;
    .locals 0

    iget-object p0, p0, Lw3/h;->t:Lw3/g;

    return-object p0
.end method

.method public static synthetic g(Lw3/h;Lw3/g;)Lw3/g;
    .locals 0

    iput-object p1, p0, Lw3/h;->t:Lw3/g;

    return-object p1
.end method

.method public static synthetic h(Lw3/h;)Lw3/h$g;
    .locals 0

    iget-object p0, p0, Lw3/h;->j:Lw3/h$g;

    return-object p0
.end method

.method public static synthetic i(Lw3/h;)V
    .locals 0

    invoke-virtual {p0}, Lw3/h;->C()V

    return-void
.end method

.method public static synthetic j(Lw3/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lw3/h;->o:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic k(Lw3/h;)Landroid/os/Looper;
    .locals 0

    iget-object p0, p0, Lw3/h;->u:Landroid/os/Looper;

    return-object p0
.end method

.method public static synthetic l(Lw3/h;Landroid/os/Looper;Lw3/u$a;Ls3/m1;Z)Lw3/n;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lw3/h;->t(Landroid/os/Looper;Lw3/u$a;Ls3/m1;Z)Lw3/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lw3/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lw3/h;->n:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic n(Lw3/h;)J
    .locals 2

    iget-wide v0, p0, Lw3/h;->m:J

    return-wide v0
.end method

.method public static synthetic o(Lw3/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lw3/h;->p:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic p(Lw3/h;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lw3/h;->v:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic q(Lw3/h;)I
    .locals 0

    iget p0, p0, Lw3/h;->q:I

    return p0
.end method

.method public static synthetic r(Lw3/h;)Lw3/g;
    .locals 0

    iget-object p0, p0, Lw3/h;->s:Lw3/g;

    return-object p0
.end method

.method public static synthetic s(Lw3/h;Lw3/g;)Lw3/g;
    .locals 0

    iput-object p1, p0, Lw3/h;->s:Lw3/g;

    return-object p1
.end method

.method public static u(Lw3/n;)Z
    .locals 3

    invoke-interface {p0}, Lw3/n;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget v0, Lp5/n0;->a:I

    const/16 v2, 0x13

    if-lt v0, v2, :cond_1

    invoke-interface {p0}, Lw3/n;->a()Lw3/n$a;

    move-result-object p0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw3/n$a;

    invoke-virtual {p0}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Landroid/media/ResourceBusyException;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public static y(Lw3/m;Ljava/util/UUID;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/m;",
            "Ljava/util/UUID;",
            "Z)",
            "Ljava/util/List<",
            "Lw3/m$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lw3/m;->k:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget v3, p0, Lw3/m;->k:I

    if-ge v2, v3, :cond_4

    invoke-virtual {p0, v2}, Lw3/m;->f(I)Lw3/m$b;

    move-result-object v3

    invoke-virtual {v3, p1}, Lw3/m$b;->e(Ljava/util/UUID;)Z

    move-result v4

    if-nez v4, :cond_1

    sget-object v4, Ls3/i;->c:Ljava/util/UUID;

    invoke-virtual {v4, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Ls3/i;->b:Ljava/util/UUID;

    invoke-virtual {v3, v4}, Lw3/m$b;->e(Ljava/util/UUID;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move v4, v1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, 0x1

    :goto_2
    if-eqz v4, :cond_3

    iget-object v4, v3, Lw3/m$b;->l:[B

    if-nez v4, :cond_2

    if-eqz p2, :cond_3

    :cond_2
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method


# virtual methods
.method public final A(IZ)Lw3/n;
    .locals 4

    iget-object v0, p0, Lw3/h;->r:Lw3/b0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/b0;

    invoke-interface {v0}, Lw3/b0;->m()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    sget-boolean v1, Lw3/c0;->d:Z

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_3

    iget-object v1, p0, Lw3/h;->h:[I

    invoke-static {v1, p1}, Lp5/n0;->y0([II)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    invoke-interface {v0}, Lw3/b0;->m()I

    move-result p1

    if-ne p1, v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lw3/h;->s:Lw3/g;

    if-nez p1, :cond_2

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object p1

    invoke-virtual {p0, p1, v2, v3, p2}, Lw3/h;->x(Ljava/util/List;ZLw3/u$a;Z)Lw3/g;

    move-result-object p1

    iget-object p2, p0, Lw3/h;->n:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, Lw3/h;->s:Lw3/g;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v3}, Lw3/g;->c(Lw3/u$a;)V

    :goto_1
    iget-object p1, p0, Lw3/h;->s:Lw3/g;

    return-object p1

    :cond_3
    :goto_2
    return-object v3
.end method

.method public final B(Landroid/os/Looper;)V
    .locals 1

    iget-object v0, p0, Lw3/h;->z:Lw3/h$d;

    if-nez v0, :cond_0

    new-instance v0, Lw3/h$d;

    invoke-direct {v0, p0, p1}, Lw3/h$d;-><init>(Lw3/h;Landroid/os/Looper;)V

    iput-object v0, p0, Lw3/h;->z:Lw3/h$d;

    :cond_0
    return-void
.end method

.method public final C()V
    .locals 1

    iget-object v0, p0, Lw3/h;->r:Lw3/b0;

    if-eqz v0, :cond_0

    iget v0, p0, Lw3/h;->q:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lw3/h;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw3/h;->o:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw3/h;->r:Lw3/b0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/b0;

    invoke-interface {v0}, Lw3/b0;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lw3/h;->r:Lw3/b0;

    :cond_0
    return-void
.end method

.method public final D()V
    .locals 3

    iget-object v0, p0, Lw3/h;->p:Ljava/util/Set;

    invoke-static {v0}, Li7/x;->n(Ljava/util/Collection;)Li7/x;

    move-result-object v0

    invoke-virtual {v0}, Li7/x;->j()Li7/d1;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/n;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lw3/n;->d(Lw3/u$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final E()V
    .locals 2

    iget-object v0, p0, Lw3/h;->o:Ljava/util/Set;

    invoke-static {v0}, Li7/x;->n(Ljava/util/Collection;)Li7/x;

    move-result-object v0

    invoke-virtual {v0}, Li7/x;->j()Li7/d1;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/h$f;

    invoke-virtual {v1}, Lw3/h$f;->release()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public F(I[B)V
    .locals 1

    iget-object v0, p0, Lw3/h;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lp5/a;->f(Z)V

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput p1, p0, Lw3/h;->w:I

    iput-object p2, p0, Lw3/h;->x:[B

    return-void
.end method

.method public final G(Lw3/n;Lw3/u$a;)V
    .locals 4

    invoke-interface {p1, p2}, Lw3/n;->d(Lw3/u$a;)V

    iget-wide v0, p0, Lw3/h;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lw3/n;->d(Lw3/u$a;)V

    :cond_0
    return-void
.end method

.method public final H(Z)V
    .locals 2

    const-string v0, "DefaultDrmSessionMgr"

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw3/h;->u:Landroid/os/Looper;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v1, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread."

    invoke-static {v0, v1, p1}, Lp5/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v1, p0, Lw3/h;->u:Landroid/os/Looper;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq p1, v1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nExpected thread: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw3/h;->u:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v0, p1, v1}, Lp5/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a()V
    .locals 6

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lw3/h;->H(Z)V

    iget v0, p0, Lw3/h;->q:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lw3/h;->q:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw3/h;->r:Lw3/b0;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lw3/h;->d:Lw3/b0$c;

    iget-object v2, p0, Lw3/h;->c:Ljava/util/UUID;

    invoke-interface {v0, v2}, Lw3/b0$c;->a(Ljava/util/UUID;)Lw3/b0;

    move-result-object v0

    iput-object v0, p0, Lw3/h;->r:Lw3/b0;

    new-instance v2, Lw3/h$c;

    invoke-direct {v2, p0, v1}, Lw3/h$c;-><init>(Lw3/h;Lw3/h$a;)V

    invoke-interface {v0, v2}, Lw3/b0;->e(Lw3/b0$b;)V

    goto :goto_1

    :cond_1
    iget-wide v2, p0, Lw3/h;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lw3/h;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lw3/h;->n:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw3/g;

    invoke-virtual {v2, v1}, Lw3/g;->c(Lw3/u$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public b(Lw3/u$a;Ls3/m1;)Lw3/n;
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lw3/h;->H(Z)V

    iget v1, p0, Lw3/h;->q:I

    const/4 v2, 0x1

    if-lez v1, :cond_0

    move v0, v2

    :cond_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lw3/h;->u:Landroid/os/Looper;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lw3/h;->u:Landroid/os/Looper;

    invoke-virtual {p0, v0, p1, p2, v2}, Lw3/h;->t(Landroid/os/Looper;Lw3/u$a;Ls3/m1;Z)Lw3/n;

    move-result-object p1

    return-object p1
.end method

.method public c(Lw3/u$a;Ls3/m1;)Lw3/v$b;
    .locals 1

    iget v0, p0, Lw3/h;->q:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lw3/h;->u:Landroid/os/Looper;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lw3/h$f;

    invoke-direct {v0, p0, p1}, Lw3/h$f;-><init>(Lw3/h;Lw3/u$a;)V

    invoke-virtual {v0, p2}, Lw3/h$f;->e(Ls3/m1;)V

    return-object v0
.end method

.method public d(Landroid/os/Looper;Lt3/s1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lw3/h;->z(Landroid/os/Looper;)V

    iput-object p2, p0, Lw3/h;->y:Lt3/s1;

    return-void
.end method

.method public e(Ls3/m1;)I
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lw3/h;->H(Z)V

    iget-object v1, p0, Lw3/h;->r:Lw3/b0;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/b0;

    invoke-interface {v1}, Lw3/b0;->m()I

    move-result v1

    iget-object v2, p1, Ls3/m1;->v:Lw3/m;

    if-nez v2, :cond_1

    iget-object p1, p1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {p1}, Lp5/v;->k(Ljava/lang/String;)I

    move-result p1

    iget-object v2, p0, Lw3/h;->h:[I

    invoke-static {v2, p1}, Lp5/n0;->y0([II)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_0

    move v0, v1

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0, v2}, Lw3/h;->v(Lw3/m;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    :goto_0
    return v1
.end method

.method public final release()V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lw3/h;->H(Z)V

    iget v1, p0, Lw3/h;->q:I

    sub-int/2addr v1, v0

    iput v1, p0, Lw3/h;->q:I

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lw3/h;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lw3/h;->n:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw3/g;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lw3/g;->d(Lw3/u$a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lw3/h;->E()V

    invoke-virtual {p0}, Lw3/h;->C()V

    return-void
.end method

.method public final t(Landroid/os/Looper;Lw3/u$a;Ls3/m1;Z)Lw3/n;
    .locals 4

    invoke-virtual {p0, p1}, Lw3/h;->B(Landroid/os/Looper;)V

    iget-object p1, p3, Ls3/m1;->v:Lw3/m;

    if-nez p1, :cond_0

    iget-object p1, p3, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {p1}, Lp5/v;->k(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p4}, Lw3/h;->A(IZ)Lw3/n;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p3, p0, Lw3/h;->x:[B

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p3, :cond_2

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw3/m;

    iget-object p3, p0, Lw3/h;->c:Ljava/util/UUID;

    invoke-static {p1, p3, v0}, Lw3/h;->y(Lw3/m;Ljava/util/UUID;Z)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    new-instance p1, Lw3/h$e;

    iget-object p3, p0, Lw3/h;->c:Ljava/util/UUID;

    invoke-direct {p1, p3, v1}, Lw3/h$e;-><init>(Ljava/util/UUID;Lw3/h$a;)V

    const-string p3, "DefaultDrmSessionMgr"

    const-string p4, "DRM error"

    invoke-static {p3, p4, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lw3/u$a;->l(Ljava/lang/Exception;)V

    :cond_1
    new-instance p2, Lw3/a0;

    new-instance p3, Lw3/n$a;

    const/16 p4, 0x1773

    invoke-direct {p3, p1, p4}, Lw3/n$a;-><init>(Ljava/lang/Throwable;I)V

    invoke-direct {p2, p3}, Lw3/a0;-><init>(Lw3/n$a;)V

    return-object p2

    :cond_2
    move-object p1, v1

    :cond_3
    iget-boolean p3, p0, Lw3/h;->g:Z

    if-nez p3, :cond_4

    iget-object v1, p0, Lw3/h;->t:Lw3/g;

    goto :goto_0

    :cond_4
    iget-object p3, p0, Lw3/h;->n:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw3/g;

    iget-object v3, v2, Lw3/g;->a:Ljava/util/List;

    invoke-static {v3, p1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v1, v2

    :cond_6
    :goto_0
    if-nez v1, :cond_8

    invoke-virtual {p0, p1, v0, p2, p4}, Lw3/h;->x(Ljava/util/List;ZLw3/u$a;Z)Lw3/g;

    move-result-object v1

    iget-boolean p1, p0, Lw3/h;->g:Z

    if-nez p1, :cond_7

    iput-object v1, p0, Lw3/h;->t:Lw3/g;

    :cond_7
    iget-object p1, p0, Lw3/h;->n:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-virtual {v1, p2}, Lw3/g;->c(Lw3/u$a;)V

    :goto_1
    return-object v1
.end method

.method public final v(Lw3/m;)Z
    .locals 4

    iget-object v0, p0, Lw3/h;->x:[B

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lw3/h;->c:Ljava/util/UUID;

    invoke-static {p1, v0, v1}, Lw3/h;->y(Lw3/m;Ljava/util/UUID;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget v0, p1, Lw3/m;->k:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, v2}, Lw3/m;->f(I)Lw3/m$b;

    move-result-object v0

    sget-object v3, Ls3/i;->b:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Lw3/m$b;->e(Ljava/util/UUID;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lw3/h;->c:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "DefaultDrmSessionMgr"

    invoke-static {v3, v0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_0
    iget-object p1, p1, Lw3/m;->j:Ljava/lang/String;

    if-eqz p1, :cond_8

    const-string v0, "cenc"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    const-string v0, "cbcs"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget p1, Lp5/n0;->a:I

    const/16 v0, 0x19

    if-lt p1, v0, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    return v1

    :cond_5
    const-string v0, "cbc1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "cens"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    return v1

    :cond_7
    :goto_2
    return v2

    :cond_8
    :goto_3
    return v1
.end method

.method public final w(Ljava/util/List;ZLw3/u$a;)Lw3/g;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw3/m$b;",
            ">;Z",
            "Lw3/u$a;",
            ")",
            "Lw3/g;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lw3/h;->r:Lw3/b0;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, v0, Lw3/h;->i:Z

    or-int v9, v1, p2

    new-instance v1, Lw3/g;

    iget-object v3, v0, Lw3/h;->c:Ljava/util/UUID;

    iget-object v4, v0, Lw3/h;->r:Lw3/b0;

    iget-object v5, v0, Lw3/h;->j:Lw3/h$g;

    iget-object v6, v0, Lw3/h;->l:Lw3/h$h;

    iget v8, v0, Lw3/h;->w:I

    iget-object v11, v0, Lw3/h;->x:[B

    iget-object v12, v0, Lw3/h;->f:Ljava/util/HashMap;

    iget-object v13, v0, Lw3/h;->e:Lw3/i0;

    iget-object v2, v0, Lw3/h;->u:Landroid/os/Looper;

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/os/Looper;

    iget-object v15, v0, Lw3/h;->k:Lo5/d0;

    iget-object v2, v0, Lw3/h;->y:Lt3/s1;

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lt3/s1;

    move-object v2, v1

    move-object/from16 v7, p1

    move/from16 v10, p2

    invoke-direct/range {v2 .. v16}, Lw3/g;-><init>(Ljava/util/UUID;Lw3/b0;Lw3/g$a;Lw3/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lw3/i0;Landroid/os/Looper;Lo5/d0;Lt3/s1;)V

    move-object/from16 v2, p3

    invoke-virtual {v1, v2}, Lw3/g;->c(Lw3/u$a;)V

    iget-wide v2, v0, Lw3/h;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lw3/g;->c(Lw3/u$a;)V

    :cond_0
    return-object v1
.end method

.method public final x(Ljava/util/List;ZLw3/u$a;Z)Lw3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw3/m$b;",
            ">;Z",
            "Lw3/u$a;",
            "Z)",
            "Lw3/g;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lw3/h;->w(Ljava/util/List;ZLw3/u$a;)Lw3/g;

    move-result-object v0

    invoke-static {v0}, Lw3/h;->u(Lw3/n;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lw3/h;->p:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lw3/h;->D()V

    invoke-virtual {p0, v0, p3}, Lw3/h;->G(Lw3/n;Lw3/u$a;)V

    invoke-virtual {p0, p1, p2, p3}, Lw3/h;->w(Ljava/util/List;ZLw3/u$a;)Lw3/g;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lw3/h;->u(Lw3/n;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p4, :cond_2

    iget-object p4, p0, Lw3/h;->o:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_2

    invoke-virtual {p0}, Lw3/h;->E()V

    iget-object p4, p0, Lw3/h;->p:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-virtual {p0}, Lw3/h;->D()V

    :cond_1
    invoke-virtual {p0, v0, p3}, Lw3/h;->G(Lw3/n;Lw3/u$a;)V

    invoke-virtual {p0, p1, p2, p3}, Lw3/h;->w(Ljava/util/List;ZLw3/u$a;)Lw3/g;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final declared-synchronized z(Landroid/os/Looper;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lw3/h;->u:Landroid/os/Looper;

    if-nez v0, :cond_0

    iput-object p1, p0, Lw3/h;->u:Landroid/os/Looper;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lw3/h;->v:Landroid/os/Handler;

    goto :goto_1

    :cond_0
    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp5/a;->f(Z)V

    iget-object p1, p0, Lw3/h;->v:Landroid/os/Handler;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
