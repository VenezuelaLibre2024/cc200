.class public Lw3/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw3/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/g$d;,
        Lw3/g$c;,
        Lw3/g$e;,
        Lw3/g$b;,
        Lw3/g$a;,
        Lw3/g$f;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw3/m$b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lw3/b0;

.field public final c:Lw3/g$a;

.field public final d:Lw3/g$b;

.field public final e:I

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lp5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/i<",
            "Lw3/u$a;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lo5/d0;

.field public final k:Lt3/s1;

.field public final l:Lw3/i0;

.field public final m:Ljava/util/UUID;

.field public final n:Landroid/os/Looper;

.field public final o:Lw3/g$e;

.field public p:I

.field public q:I

.field public r:Landroid/os/HandlerThread;

.field public s:Lw3/g$c;

.field public t:Lv3/b;

.field public u:Lw3/n$a;

.field public v:[B

.field public w:[B

.field public x:Lw3/b0$a;

.field public y:Lw3/b0$d;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lw3/b0;Lw3/g$a;Lw3/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lw3/i0;Landroid/os/Looper;Lo5/d0;Lt3/s1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lw3/b0;",
            "Lw3/g$a;",
            "Lw3/g$b;",
            "Ljava/util/List<",
            "Lw3/m$b;",
            ">;IZZ[B",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lw3/i0;",
            "Landroid/os/Looper;",
            "Lo5/d0;",
            "Lt3/s1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-eq p6, v0, :cond_0

    const/4 v0, 0x3

    if-ne p6, v0, :cond_1

    :cond_0
    invoke-static {p9}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput-object p1, p0, Lw3/g;->m:Ljava/util/UUID;

    iput-object p3, p0, Lw3/g;->c:Lw3/g$a;

    iput-object p4, p0, Lw3/g;->d:Lw3/g$b;

    iput-object p2, p0, Lw3/g;->b:Lw3/b0;

    iput p6, p0, Lw3/g;->e:I

    iput-boolean p7, p0, Lw3/g;->f:Z

    iput-boolean p8, p0, Lw3/g;->g:Z

    if-eqz p9, :cond_2

    iput-object p9, p0, Lw3/g;->w:[B

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    invoke-static {p5}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lw3/g;->a:Ljava/util/List;

    iput-object p10, p0, Lw3/g;->h:Ljava/util/HashMap;

    iput-object p11, p0, Lw3/g;->l:Lw3/i0;

    new-instance p1, Lp5/i;

    invoke-direct {p1}, Lp5/i;-><init>()V

    iput-object p1, p0, Lw3/g;->i:Lp5/i;

    iput-object p13, p0, Lw3/g;->j:Lo5/d0;

    iput-object p14, p0, Lw3/g;->k:Lt3/s1;

    const/4 p1, 0x2

    iput p1, p0, Lw3/g;->p:I

    iput-object p12, p0, Lw3/g;->n:Landroid/os/Looper;

    new-instance p1, Lw3/g$e;

    invoke-direct {p1, p0, p12}, Lw3/g$e;-><init>(Lw3/g;Landroid/os/Looper;)V

    iput-object p1, p0, Lw3/g;->o:Lw3/g$e;

    return-void
.end method

.method public static synthetic j(Ljava/lang/Exception;Lw3/u$a;)V
    .locals 0

    invoke-static {p0, p1}, Lw3/g;->w(Ljava/lang/Exception;Lw3/u$a;)V

    return-void
.end method

.method public static synthetic k(ILw3/u$a;)V
    .locals 0

    invoke-static {p0, p1}, Lw3/g;->x(ILw3/u$a;)V

    return-void
.end method

.method public static synthetic l(Lw3/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw3/g;->F(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(Lw3/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw3/g;->z(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lw3/g;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lw3/g;->m:Ljava/util/UUID;

    return-object p0
.end method

.method public static synthetic o(Lw3/g;)Lw3/i0;
    .locals 0

    iget-object p0, p0, Lw3/g;->l:Lw3/i0;

    return-object p0
.end method

.method public static synthetic p(Lw3/g;)Lo5/d0;
    .locals 0

    iget-object p0, p0, Lw3/g;->j:Lo5/d0;

    return-object p0
.end method

.method public static synthetic q(Lw3/g;)Lw3/g$e;
    .locals 0

    iget-object p0, p0, Lw3/g;->o:Lw3/g$e;

    return-object p0
.end method

.method public static synthetic w(Ljava/lang/Exception;Lw3/u$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lw3/u$a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic x(ILw3/u$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lw3/u$a;->k(I)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Exception;Z)V
    .locals 1

    instance-of v0, p1, Landroid/media/NotProvisionedException;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lw3/g;->c:Lw3/g$a;

    invoke-interface {p1, p0}, Lw3/g$a;->a(Lw3/g;)V

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    :goto_0
    invoke-virtual {p0, p1, p2}, Lw3/g;->y(Ljava/lang/Exception;I)V

    :goto_1
    return-void
.end method

.method public final B()V
    .locals 2

    iget v0, p0, Lw3/g;->e:I

    if-nez v0, :cond_0

    iget v0, p0, Lw3/g;->p:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/g;->v:[B

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lw3/g;->s(Z)V

    :cond_0
    return-void
.end method

.method public C(I)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lw3/g;->B()V

    :goto_0
    return-void
.end method

.method public D()V
    .locals 1

    invoke-virtual {p0}, Lw3/g;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lw3/g;->s(Z)V

    :cond_0
    return-void
.end method

.method public E(Ljava/lang/Exception;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    :goto_0
    invoke-virtual {p0, p1, p2}, Lw3/g;->y(Ljava/lang/Exception;I)V

    return-void
.end method

.method public final F(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw3/g;->y:Lw3/b0$d;

    if-ne p1, v0, :cond_2

    iget p1, p0, Lw3/g;->p:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lw3/g;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lw3/g;->y:Lw3/b0$d;

    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lw3/g;->c:Lw3/g$a;

    check-cast p2, Ljava/lang/Exception;

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lw3/g$a;->b(Ljava/lang/Exception;Z)V

    return-void

    :cond_1
    :try_start_0
    iget-object p1, p0, Lw3/g;->b:Lw3/b0;

    check-cast p2, [B

    invoke-interface {p1, p2}, Lw3/b0;->k([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lw3/g;->c:Lw3/g$a;

    invoke-interface {p1}, Lw3/g$a;->c()V

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lw3/g;->c:Lw3/g$a;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Lw3/g$a;->b(Ljava/lang/Exception;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final G()Z
    .locals 4

    invoke-virtual {p0}, Lw3/g;->v()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw3/g;->b:Lw3/b0;

    invoke-interface {v0}, Lw3/b0;->d()[B

    move-result-object v0

    iput-object v0, p0, Lw3/g;->v:[B

    iget-object v2, p0, Lw3/g;->b:Lw3/b0;

    iget-object v3, p0, Lw3/g;->k:Lt3/s1;

    invoke-interface {v2, v0, v3}, Lw3/b0;->f([BLt3/s1;)V

    iget-object v0, p0, Lw3/g;->b:Lw3/b0;

    iget-object v2, p0, Lw3/g;->v:[B

    invoke-interface {v0, v2}, Lw3/b0;->c([B)Lv3/b;

    move-result-object v0

    iput-object v0, p0, Lw3/g;->t:Lv3/b;

    const/4 v0, 0x3

    iput v0, p0, Lw3/g;->p:I

    new-instance v2, Lw3/b;

    invoke-direct {v2, v0}, Lw3/b;-><init>(I)V

    invoke-virtual {p0, v2}, Lw3/g;->r(Lp5/h;)V

    iget-object v0, p0, Lw3/g;->v:[B

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/media/NotProvisionedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0, v1}, Lw3/g;->y(Ljava/lang/Exception;I)V

    goto :goto_0

    :catch_1
    iget-object v0, p0, Lw3/g;->c:Lw3/g$a;

    invoke-interface {v0, p0}, Lw3/g$a;->a(Lw3/g;)V

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final H([BIZ)V
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lw3/g;->b:Lw3/b0;

    iget-object v2, p0, Lw3/g;->a:Ljava/util/List;

    iget-object v3, p0, Lw3/g;->h:Ljava/util/HashMap;

    invoke-interface {v1, p1, v2, p2, v3}, Lw3/b0;->l([BLjava/util/List;ILjava/util/HashMap;)Lw3/b0$a;

    move-result-object p1

    iput-object p1, p0, Lw3/g;->x:Lw3/b0$a;

    iget-object p1, p0, Lw3/g;->s:Lw3/g$c;

    invoke-static {p1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw3/g$c;

    iget-object p2, p0, Lw3/g;->x:Lw3/b0$a;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, v0, p2, p3}, Lw3/g$c;->b(ILjava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1, v0}, Lw3/g;->A(Ljava/lang/Exception;Z)V

    :goto_0
    return-void
.end method

.method public I()V
    .locals 4

    iget-object v0, p0, Lw3/g;->b:Lw3/b0;

    invoke-interface {v0}, Lw3/b0;->b()Lw3/b0$d;

    move-result-object v0

    iput-object v0, p0, Lw3/g;->y:Lw3/b0$d;

    iget-object v0, p0, Lw3/g;->s:Lw3/g$c;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/g$c;

    iget-object v1, p0, Lw3/g;->y:Lw3/b0$d;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lw3/g$c;->b(ILjava/lang/Object;Z)V

    return-void
.end method

.method public final J()Z
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lw3/g;->b:Lw3/b0;

    iget-object v2, p0, Lw3/g;->v:[B

    iget-object v3, p0, Lw3/g;->w:[B

    invoke-interface {v1, v2, v3}, Lw3/b0;->h([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    invoke-virtual {p0, v1, v0}, Lw3/g;->y(Ljava/lang/Exception;I)V

    const/4 v0, 0x0

    return v0
.end method

.method public final K()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lw3/g;->n:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nExpected thread: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw3/g;->n:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v0, v1}, Lp5/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final a()Lw3/n$a;
    .locals 2

    invoke-virtual {p0}, Lw3/g;->K()V

    iget v0, p0, Lw3/g;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw3/g;->u:Lw3/n$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final b()Ljava/util/UUID;
    .locals 1

    invoke-virtual {p0}, Lw3/g;->K()V

    iget-object v0, p0, Lw3/g;->m:Ljava/util/UUID;

    return-object v0
.end method

.method public c(Lw3/u$a;)V
    .locals 3

    invoke-virtual {p0}, Lw3/g;->K()V

    iget v0, p0, Lw3/g;->q:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Session reference count less than zero: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lw3/g;->q:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v0}, Lp5/r;->c(Ljava/lang/String;Ljava/lang/String;)V

    iput v1, p0, Lw3/g;->q:I

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lw3/g;->i:Lp5/i;

    invoke-virtual {v0, p1}, Lp5/i;->a(Ljava/lang/Object;)V

    :cond_1
    iget v0, p0, Lw3/g;->q:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Lw3/g;->q:I

    if-ne v0, v2, :cond_3

    iget p1, p0, Lw3/g;->p:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, Lp5/a;->f(Z)V

    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "ExoPlayer:DrmRequestHandler"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lw3/g;->r:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    new-instance p1, Lw3/g$c;

    iget-object v0, p0, Lw3/g;->r:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lw3/g$c;-><init>(Lw3/g;Landroid/os/Looper;)V

    iput-object p1, p0, Lw3/g;->s:Lw3/g$c;

    invoke-virtual {p0}, Lw3/g;->G()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, v2}, Lw3/g;->s(Z)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lw3/g;->v()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lw3/g;->i:Lp5/i;

    invoke-virtual {v0, p1}, Lp5/i;->b(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v2, :cond_4

    iget v0, p0, Lw3/g;->p:I

    invoke-virtual {p1, v0}, Lw3/u$a;->k(I)V

    :cond_4
    :goto_0
    iget-object p1, p0, Lw3/g;->d:Lw3/g$b;

    iget v0, p0, Lw3/g;->q:I

    invoke-interface {p1, p0, v0}, Lw3/g$b;->b(Lw3/g;I)V

    return-void
.end method

.method public d(Lw3/u$a;)V
    .locals 3

    invoke-virtual {p0}, Lw3/g;->K()V

    iget v0, p0, Lw3/g;->q:I

    if-gtz v0, :cond_0

    const-string p1, "DefaultDrmSession"

    const-string v0, "release() called on a session that\'s already fully released."

    invoke-static {p1, v0}, Lp5/r;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lw3/g;->q:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput v0, p0, Lw3/g;->p:I

    iget-object v0, p0, Lw3/g;->o:Lw3/g$e;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/g$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lw3/g;->s:Lw3/g$c;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/g$c;

    invoke-virtual {v0}, Lw3/g$c;->c()V

    iput-object v1, p0, Lw3/g;->s:Lw3/g$c;

    iget-object v0, p0, Lw3/g;->r:Landroid/os/HandlerThread;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    iput-object v1, p0, Lw3/g;->r:Landroid/os/HandlerThread;

    iput-object v1, p0, Lw3/g;->t:Lv3/b;

    iput-object v1, p0, Lw3/g;->u:Lw3/n$a;

    iput-object v1, p0, Lw3/g;->x:Lw3/b0$a;

    iput-object v1, p0, Lw3/g;->y:Lw3/b0$d;

    iget-object v0, p0, Lw3/g;->v:[B

    if-eqz v0, :cond_1

    iget-object v2, p0, Lw3/g;->b:Lw3/b0;

    invoke-interface {v2, v0}, Lw3/b0;->i([B)V

    iput-object v1, p0, Lw3/g;->v:[B

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lw3/g;->i:Lp5/i;

    invoke-virtual {v0, p1}, Lp5/i;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Lw3/g;->i:Lp5/i;

    invoke-virtual {v0, p1}, Lp5/i;->b(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lw3/u$a;->m()V

    :cond_2
    iget-object p1, p0, Lw3/g;->d:Lw3/g$b;

    iget v0, p0, Lw3/g;->q:I

    invoke-interface {p1, p0, v0}, Lw3/g$b;->a(Lw3/g;I)V

    return-void
.end method

.method public e()Z
    .locals 1

    invoke-virtual {p0}, Lw3/g;->K()V

    iget-boolean v0, p0, Lw3/g;->f:Z

    return v0
.end method

.method public f()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lw3/g;->K()V

    iget-object v0, p0, Lw3/g;->v:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lw3/g;->b:Lw3/b0;

    invoke-interface {v1, v0}, Lw3/b0;->a([B)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final getState()I
    .locals 1

    invoke-virtual {p0}, Lw3/g;->K()V

    iget v0, p0, Lw3/g;->p:I

    return v0
.end method

.method public h(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0}, Lw3/g;->K()V

    iget-object v0, p0, Lw3/g;->b:Lw3/b0;

    iget-object v1, p0, Lw3/g;->v:[B

    invoke-static {v1}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-interface {v0, v1, p1}, Lw3/b0;->g([BLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final i()Lv3/b;
    .locals 1

    invoke-virtual {p0}, Lw3/g;->K()V

    iget-object v0, p0, Lw3/g;->t:Lv3/b;

    return-object v0
.end method

.method public final r(Lp5/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp5/h<",
            "Lw3/u$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lw3/g;->i:Lp5/i;

    invoke-virtual {v0}, Lp5/i;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/u$a;

    invoke-interface {p1, v1}, Lp5/h;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final s(Z)V
    .locals 8

    iget-boolean v0, p0, Lw3/g;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw3/g;->v:[B

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iget v1, p0, Lw3/g;->e:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_4

    if-eq v1, v3, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v1, p0, Lw3/g;->w:[B

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lw3/g;->v:[B

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lw3/g;->w:[B

    invoke-virtual {p0, v1, v0, p1}, Lw3/g;->H([BIZ)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lw3/g;->w:[B

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lw3/g;->J()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_3
    :goto_0
    invoke-virtual {p0, v0, v3, p1}, Lw3/g;->H([BIZ)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lw3/g;->w:[B

    if-nez v1, :cond_5

    invoke-virtual {p0, v0, v2, p1}, Lw3/g;->H([BIZ)V

    goto :goto_1

    :cond_5
    iget v1, p0, Lw3/g;->p:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_6

    invoke-virtual {p0}, Lw3/g;->J()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_6
    invoke-virtual {p0}, Lw3/g;->t()J

    move-result-wide v4

    iget v1, p0, Lw3/g;->e:I

    if-nez v1, :cond_7

    const-wide/16 v6, 0x3c

    cmp-long v1, v4, v6

    if-gtz v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Offline license has expired or will expire soon. Remaining seconds: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DefaultDrmSession"

    invoke-static {v2, v1}, Lp5/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    const-wide/16 v0, 0x0

    cmp-long p1, v4, v0

    if-gtz p1, :cond_8

    new-instance p1, Lw3/h0;

    invoke-direct {p1}, Lw3/h0;-><init>()V

    invoke-virtual {p0, p1, v3}, Lw3/g;->y(Ljava/lang/Exception;I)V

    goto :goto_1

    :cond_8
    iput v2, p0, Lw3/g;->p:I

    sget-object p1, Lw3/f;->a:Lw3/f;

    invoke-virtual {p0, p1}, Lw3/g;->r(Lp5/h;)V

    :cond_9
    :goto_1
    return-void
.end method

.method public final t()J
    .locals 5

    sget-object v0, Ls3/i;->d:Ljava/util/UUID;

    iget-object v1, p0, Lw3/g;->m:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    invoke-static {p0}, Lw3/l0;->b(Lw3/n;)Landroid/util/Pair;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public u([B)Z
    .locals 1

    invoke-virtual {p0}, Lw3/g;->K()V

    iget-object v0, p0, Lw3/g;->v:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final v()Z
    .locals 2

    iget v0, p0, Lw3/g;->p:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final y(Ljava/lang/Exception;I)V
    .locals 1

    new-instance v0, Lw3/n$a;

    invoke-static {p1, p2}, Lw3/y;->a(Ljava/lang/Exception;I)I

    move-result p2

    invoke-direct {v0, p1, p2}, Lw3/n$a;-><init>(Ljava/lang/Throwable;I)V

    iput-object v0, p0, Lw3/g;->u:Lw3/n$a;

    const-string p2, "DefaultDrmSession"

    const-string v0, "DRM session error"

    invoke-static {p2, v0, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Lw3/c;

    invoke-direct {p2, p1}, Lw3/c;-><init>(Ljava/lang/Exception;)V

    invoke-virtual {p0, p2}, Lw3/g;->r(Lp5/h;)V

    iget p1, p0, Lw3/g;->p:I

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lw3/g;->p:I

    :cond_0
    return-void
.end method

.method public final z(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw3/g;->x:Lw3/b0$a;

    if-ne p1, v0, :cond_5

    invoke-virtual {p0}, Lw3/g;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lw3/g;->x:Lw3/b0$a;

    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    check-cast p2, Ljava/lang/Exception;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lw3/g;->A(Ljava/lang/Exception;Z)V

    return-void

    :cond_1
    :try_start_0
    check-cast p2, [B

    iget p1, p0, Lw3/g;->e:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lw3/g;->b:Lw3/b0;

    iget-object v0, p0, Lw3/g;->w:[B

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-interface {p1, v0, p2}, Lw3/b0;->j([B[B)[B

    sget-object p1, Lw3/e;->a:Lw3/e;

    :goto_0
    invoke-virtual {p0, p1}, Lw3/g;->r(Lp5/h;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lw3/g;->b:Lw3/b0;

    iget-object v0, p0, Lw3/g;->v:[B

    invoke-interface {p1, v0, p2}, Lw3/b0;->j([B[B)[B

    move-result-object p1

    iget p2, p0, Lw3/g;->e:I

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    if-nez p2, :cond_4

    iget-object p2, p0, Lw3/g;->w:[B

    if-eqz p2, :cond_4

    :cond_3
    if-eqz p1, :cond_4

    array-length p2, p1

    if-eqz p2, :cond_4

    iput-object p1, p0, Lw3/g;->w:[B

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, Lw3/g;->p:I

    sget-object p1, Lw3/d;->a:Lw3/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lw3/g;->A(Ljava/lang/Exception;Z)V

    :cond_5
    :goto_1
    return-void
.end method
