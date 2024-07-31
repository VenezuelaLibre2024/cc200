.class public Lce/p;
.super Lce/d1;
.source ""

# interfaces
.implements Lce/n;
.implements Lld/e;
.implements Lce/j3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lce/d1<",
        "TT;>;",
        "Lce/n<",
        "TT;>;",
        "Lld/e;",
        "Lce/j3;"
    }
.end annotation


# static fields
.field public static final m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _decisionAndIndex:I

.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;

.field public final k:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final l:Ljd/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lce/p;

    const-string v2, "_decisionAndIndex"

    invoke-static {v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v1

    sput-object v1, Lce/p;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v1, Lce/p;

    const-string v2, "_state"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    sput-object v1, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-class v1, Lce/p;

    const-string v2, "_parentHandle"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lce/p;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljd/d;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-TT;>;I)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lce/d1;-><init>(I)V

    iput-object p1, p0, Lce/p;->k:Ljd/d;

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljd/d;->getContext()Ljd/g;

    move-result-object p1

    iput-object p1, p0, Lce/p;->l:Ljd/g;

    const p1, 0x1fffffff

    iput p1, p0, Lce/p;->_decisionAndIndex:I

    sget-object p1, Lce/d;->h:Lce/d;

    iput-object p1, p0, Lce/p;->_state:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic M(Lce/p;Ljava/lang/Object;ILsd/l;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lce/p;->L(Ljava/lang/Object;ILsd/l;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lce/p;->z()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/q2;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lce/s;

    if-eqz v0, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method

.method public B()V
    .locals 2

    invoke-virtual {p0}, Lce/p;->C()Lce/i1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lce/p;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lce/i1;->dispose()V

    sget-object v0, Lce/p;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v1, Lce/p2;->h:Lce/p2;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final C()Lce/i1;
    .locals 7

    invoke-virtual {p0}, Lce/p;->getContext()Ljd/g;

    move-result-object v0

    sget-object v1, Lce/c2;->c:Lce/c2$b;

    invoke-interface {v0, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lce/c2;

    const/4 v0, 0x0

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    new-instance v4, Lce/t;

    invoke-direct {v4, p0}, Lce/t;-><init>(Lce/p;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/c2$a;->d(Lce/c2;ZZLsd/l;ILjava/lang/Object;)Lce/i1;

    move-result-object v1

    sget-object v2, Lce/p;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v1
.end method

.method public final D(Ljava/lang/Object;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {}, Lce/t0;->a()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    instance-of v2, v1, Lce/l;

    if-nez v2, :cond_1

    instance-of v2, v1, Lhe/i0;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v3

    :goto_1
    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    :cond_3
    :goto_2
    sget-object v2, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_4
    :goto_3
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    instance-of v4, v12, Lce/d;

    if-eqz v4, :cond_5

    sget-object v4, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v0, v12, v1}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    return-void

    :cond_5
    instance-of v4, v12, Lce/l;

    if-eqz v4, :cond_6

    move v4, v3

    goto :goto_4

    :cond_6
    instance-of v4, v12, Lhe/i0;

    :goto_4
    if-eqz v4, :cond_7

    invoke-virtual {v0, v1, v12}, Lce/p;->G(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    instance-of v4, v12, Lce/c0;

    if-eqz v4, :cond_d

    move-object v2, v12

    check-cast v2, Lce/c0;

    invoke-virtual {v2}, Lce/c0;->b()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v0, v1, v12}, Lce/p;->G(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    instance-of v3, v12, Lce/s;

    if-eqz v3, :cond_c

    const/4 v3, 0x0

    if-eqz v4, :cond_9

    goto :goto_5

    :cond_9
    move-object v2, v3

    :goto_5
    if-eqz v2, :cond_a

    iget-object v3, v2, Lce/c0;->a:Ljava/lang/Throwable;

    :cond_a
    instance-of v2, v1, Lce/l;

    if-eqz v2, :cond_b

    check-cast v1, Lce/l;

    invoke-virtual {v0, v1, v3}, Lce/p;->p(Lce/l;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"

    invoke-static {v1, v2}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lhe/i0;

    invoke-virtual {v0, v1, v3}, Lce/p;->r(Lhe/i0;Ljava/lang/Throwable;)V

    :cond_c
    :goto_6
    return-void

    :cond_d
    instance-of v4, v12, Lce/b0;

    const-string v5, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"

    if-eqz v4, :cond_11

    move-object v13, v12

    check-cast v13, Lce/b0;

    iget-object v4, v13, Lce/b0;->b:Lce/l;

    if-eqz v4, :cond_e

    invoke-virtual {v0, v1, v12}, Lce/p;->G(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_e
    instance-of v4, v1, Lhe/i0;

    if-eqz v4, :cond_f

    return-void

    :cond_f
    invoke-static {v1, v5}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v1

    check-cast v15, Lce/l;

    invoke-virtual {v13}, Lce/b0;->c()Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v1, v13, Lce/b0;->e:Ljava/lang/Throwable;

    invoke-virtual {v0, v15, v1}, Lce/p;->p(Lce/l;Ljava/lang/Throwable;)V

    return-void

    :cond_10
    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1d

    const/16 v20, 0x0

    invoke-static/range {v13 .. v20}, Lce/b0;->b(Lce/b0;Ljava/lang/Object;Lce/l;Lsd/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lce/b0;

    move-result-object v4

    sget-object v5, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v5, v0, v12, v4}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    return-void

    :cond_11
    instance-of v4, v1, Lhe/i0;

    if-eqz v4, :cond_12

    return-void

    :cond_12
    invoke-static {v1, v5}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v1

    check-cast v6, Lce/l;

    new-instance v13, Lce/b0;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1c

    const/4 v11, 0x0

    move-object v4, v13

    move-object v5, v12

    invoke-direct/range {v4 .. v11}, Lce/b0;-><init>(Ljava/lang/Object;Lce/l;Lsd/l;Ljava/lang/Object;Ljava/lang/Throwable;ILtd/g;)V

    sget-object v4, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v0, v12, v13}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    return-void
.end method

.method public final E()Z
    .locals 2

    iget v0, p0, Lce/d1;->j:I

    invoke-static {v0}, Lce/e1;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lce/p;->k:Ljd/d;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v0, v1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhe/l;

    invoke-virtual {v0}, Lhe/l;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final F(Lsd/l;)Lce/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Lce/l;"
        }
    .end annotation

    instance-of v0, p1, Lce/l;

    if-eqz v0, :cond_0

    check-cast p1, Lce/l;

    goto :goto_0

    :cond_0
    new-instance v0, Lce/z1;

    invoke-direct {v0, p1}, Lce/z1;-><init>(Lsd/l;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final G(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    const-string v0, "CancellableContinuation"

    return-object v0
.end method

.method public final I(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0, p1}, Lce/p;->s(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lce/p;->h(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Lce/p;->u()V

    return-void
.end method

.method public final J()V
    .locals 2

    iget-object v0, p0, Lce/p;->k:Ljd/d;

    instance-of v1, v0, Lhe/l;

    if-eqz v1, :cond_0

    check-cast v0, Lhe/l;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lhe/l;->u(Lce/n;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lce/p;->t()V

    invoke-virtual {p0, v0}, Lce/p;->h(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final K()Z
    .locals 5

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget v0, p0, Lce/d1;->j:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2
    :goto_1
    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lce/p;->x()Lce/i1;

    move-result-object v0

    sget-object v3, Lce/p2;->h:Lce/p2;

    if-eq v0, v3, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_5
    :goto_3
    sget-object v0, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lce/t0;->a()Z

    move-result v4

    if-eqz v4, :cond_7

    instance-of v4, v3, Lce/q2;

    xor-int/2addr v4, v2

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_7
    :goto_4
    instance-of v4, v3, Lce/b0;

    if-eqz v4, :cond_8

    check-cast v3, Lce/b0;

    iget-object v3, v3, Lce/b0;->d:Ljava/lang/Object;

    if-eqz v3, :cond_8

    invoke-virtual {p0}, Lce/p;->t()V

    return v1

    :cond_8
    sget-object v1, Lce/p;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const v3, 0x1fffffff

    invoke-virtual {v1, p0, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    sget-object v1, Lce/d;->h:Lce/d;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return v2
.end method

.method public final L(Ljava/lang/Object;ILsd/l;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lce/q2;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, Lce/q2;

    const/4 v8, 0x0

    move-object v3, p0

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    invoke-virtual/range {v3 .. v8}, Lce/p;->N(Lce/q2;Ljava/lang/Object;ILsd/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v1, v2}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lce/p;->u()V

    invoke-virtual {p0, p2}, Lce/p;->v(I)V

    return-void

    :cond_1
    instance-of p2, v1, Lce/s;

    if-eqz p2, :cond_3

    check-cast v1, Lce/s;

    invoke-virtual {v1}, Lce/s;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    iget-object p1, v1, Lce/c0;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p1}, Lce/p;->q(Lsd/l;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0, p1}, Lce/p;->o(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Lgd/c;

    invoke-direct {p1}, Lgd/c;-><init>()V

    throw p1
.end method

.method public final N(Lce/q2;Ljava/lang/Object;ILsd/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/q2;",
            "Ljava/lang/Object;",
            "I",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lce/c0;

    if-eqz v0, :cond_5

    invoke-static {}, Lce/t0;->a()Z

    move-result p1

    const/4 p3, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p5, :cond_0

    move p1, p3

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-static {}, Lce/t0;->a()Z

    move-result p1

    if-eqz p1, :cond_9

    if-nez p4, :cond_3

    goto :goto_2

    :cond_3
    move p3, v0

    :goto_2
    if-eqz p3, :cond_4

    goto :goto_4

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    invoke-static {p3}, Lce/e1;->b(I)Z

    move-result p3

    if-nez p3, :cond_6

    if-nez p5, :cond_6

    goto :goto_4

    :cond_6
    if-nez p4, :cond_7

    instance-of p3, p1, Lce/l;

    if-nez p3, :cond_7

    if-eqz p5, :cond_9

    :cond_7
    new-instance p3, Lce/b0;

    instance-of v0, p1, Lce/l;

    if-eqz v0, :cond_8

    check-cast p1, Lce/l;

    goto :goto_3

    :cond_8
    const/4 p1, 0x0

    :goto_3
    move-object v2, p1

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p3

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, Lce/b0;-><init>(Ljava/lang/Object;Lce/l;Lsd/l;Ljava/lang/Object;Ljava/lang/Throwable;ILtd/g;)V

    move-object p2, p3

    :cond_9
    :goto_4
    return-object p2
.end method

.method public final O()Z
    .locals 6

    sget-object v0, Lce/p;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v2, Lce/p;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const v4, 0x1fffffff

    and-int/2addr v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    add-int/2addr v5, v4

    invoke-virtual {v2, p0, v1, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v3
.end method

.method public final P(Ljava/lang/Object;Ljava/lang/Object;Lsd/l;)Lhe/l0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Lhe/l0;"
        }
    .end annotation

    sget-object v0, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lce/q2;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, Lce/q2;

    iget v6, p0, Lce/d1;->j:I

    move-object v3, p0

    move-object v5, p1

    move-object v7, p3

    move-object v8, p2

    invoke-virtual/range {v3 .. v8}, Lce/p;->N(Lce/q2;Ljava/lang/Object;ILsd/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v1, v2}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lce/p;->u()V

    sget-object p1, Lce/q;->a:Lhe/l0;

    return-object p1

    :cond_1
    instance-of p3, v1, Lce/b0;

    const/4 v0, 0x0

    if-eqz p3, :cond_4

    if-eqz p2, :cond_4

    check-cast v1, Lce/b0;

    iget-object p3, v1, Lce/b0;->d:Ljava/lang/Object;

    if-ne p3, p2, :cond_4

    invoke-static {}, Lce/t0;->a()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, v1, Lce/b0;->a:Ljava/lang/Object;

    invoke-static {p2, p1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object v0, Lce/q;->a:Lhe/l0;

    :cond_4
    return-object v0
.end method

.method public final Q()Z
    .locals 5

    sget-object v0, Lce/p;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    if-eqz v2, :cond_2

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v2, Lce/p;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const v3, 0x1fffffff

    and-int/2addr v3, v1

    const/high16 v4, 0x20000000

    add-int/2addr v4, v3

    invoke-virtual {v2, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v2, v10, Lce/q2;

    if-nez v2, :cond_4

    instance-of v2, v10, Lce/c0;

    if-eqz v2, :cond_1

    return-void

    :cond_1
    instance-of v2, v10, Lce/b0;

    if-eqz v2, :cond_3

    move-object v2, v10

    check-cast v2, Lce/b0;

    invoke-virtual {v2}, Lce/b0;->c()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_2

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0xf

    const/16 v18, 0x0

    move-object v11, v2

    move-object/from16 v16, p2

    invoke-static/range {v11 .. v18}, Lce/b0;->b(Lce/b0;Ljava/lang/Object;Lce/l;Lsd/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lce/b0;

    move-result-object v3

    sget-object v4, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v0, v10, v3}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v11, p2

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0, v11}, Lce/b0;->d(Lce/p;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Must be called at most once"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move-object/from16 v11, p2

    sget-object v12, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v13, Lce/b0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0xe

    const/4 v9, 0x0

    move-object v2, v13

    move-object v3, v10

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v9}, Lce/b0;-><init>(Ljava/lang/Object;Lce/l;Lsd/l;Ljava/lang/Object;Ljava/lang/Throwable;ILtd/g;)V

    invoke-static {v12, v0, v10, v13}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Not completed"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b()Ljd/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljd/d<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lce/p;->k:Ljd/d;

    return-object v0
.end method

.method public c(Lsd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lce/p;->F(Lsd/l;)Lce/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Lce/p;->D(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    invoke-super {p0, p1}, Lce/d1;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lce/p;->k:Ljd/d;

    invoke-static {}, Lce/t0;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, v0, Lld/e;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Lld/e;

    invoke-static {p1, v0}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lce/p;->P(Ljava/lang/Object;Ljava/lang/Object;Lsd/l;)Lhe/l0;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lce/c0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    invoke-virtual {p0, v0, v3, v3}, Lce/p;->P(Ljava/lang/Object;Ljava/lang/Object;Lsd/l;)Lhe/l0;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Object;Lsd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lce/d1;->j:I

    invoke-virtual {p0, p1, v0, p2}, Lce/p;->L(Ljava/lang/Object;ILsd/l;)V

    return-void
.end method

.method public getCallerFrame()Lld/e;
    .locals 2

    iget-object v0, p0, Lce/p;->k:Ljd/d;

    instance-of v1, v0, Lld/e;

    if-eqz v1, :cond_0

    check-cast v0, Lld/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Ljd/g;
    .locals 1

    iget-object v0, p0, Lce/p;->l:Ljd/g;

    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h(Ljava/lang/Throwable;)Z
    .locals 6

    sget-object v0, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lce/q2;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    return v3

    :cond_1
    new-instance v2, Lce/s;

    instance-of v4, v1, Lce/l;

    const/4 v5, 0x1

    if-nez v4, :cond_2

    instance-of v4, v1, Lhe/i0;

    if-eqz v4, :cond_3

    :cond_2
    move v3, v5

    :cond_3
    invoke-direct {v2, p0, p1, v3}, Lce/s;-><init>(Ljd/d;Ljava/lang/Throwable;Z)V

    sget-object v3, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v1, v2}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    check-cast v0, Lce/q2;

    instance-of v2, v0, Lce/l;

    if-eqz v2, :cond_4

    check-cast v1, Lce/l;

    invoke-virtual {p0, v1, p1}, Lce/p;->p(Lce/l;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    instance-of v0, v0, Lhe/i0;

    if-eqz v0, :cond_5

    check-cast v1, Lhe/i0;

    invoke-virtual {p0, v1, p1}, Lce/p;->r(Lhe/i0;Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lce/p;->u()V

    iget p1, p0, Lce/d1;->j:I

    invoke-virtual {p0, p1}, Lce/p;->v(I)V

    return v5
.end method

.method public i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p1, Lce/b0;

    if-eqz v0, :cond_0

    check-cast p1, Lce/b0;

    iget-object p1, p1, Lce/b0;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public j(Lhe/i0;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhe/i0<",
            "*>;I)V"
        }
    .end annotation

    sget-object v0, Lce/p;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x1fffffff

    and-int v3, v1, v2

    if-ne v3, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    shr-int/lit8 v2, v1, 0x1d

    shl-int/lit8 v2, v2, 0x1d

    add-int/2addr v2, p2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lce/p;->D(Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "invokeOnCancellation should be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k()Z
    .locals 1

    invoke-virtual {p0}, Lce/p;->z()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lce/q2;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public m(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lce/q;->a:Lhe/l0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    iget p1, p0, Lce/d1;->j:I

    invoke-virtual {p0, p1}, Lce/p;->v(I)V

    return-void
.end method

.method public n()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lce/p;->z()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final o(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already resumed, but proposed with update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p(Lce/l;Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1, p2}, Lce/m;->e(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lce/p;->getContext()Ljd/g;

    move-result-object p2

    new-instance v0, Lce/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lce/f0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lce/m0;->a(Ljd/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final q(Lsd/l;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lsd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lce/p;->getContext()Ljd/g;

    move-result-object p2

    new-instance v0, Lce/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in resume onCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lce/f0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lce/m0;->a(Ljd/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final r(Lhe/i0;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhe/i0<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Lce/p;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x1fffffff

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lce/p;->getContext()Ljd/g;

    move-result-object v1

    invoke-virtual {p1, v0, p2, v1}, Lhe/i0;->o(ILjava/lang/Throwable;Ljd/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lce/p;->getContext()Ljd/g;

    move-result-object p2

    new-instance v0, Lce/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lce/f0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lce/m0;->a(Ljd/g;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The index for Segment.onCancellation(..) is broken"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1, p0}, Lce/g0;->b(Ljava/lang/Object;Lce/n;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lce/d1;->j:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lce/p;->M(Lce/p;Ljava/lang/Object;ILsd/l;ILjava/lang/Object;)V

    return-void
.end method

.method public final s(Ljava/lang/Throwable;)Z
    .locals 2

    invoke-virtual {p0}, Lce/p;->E()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lce/p;->k:Ljd/d;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v0, v1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhe/l;

    invoke-virtual {v0, p1}, Lhe/l;->s(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final t()V
    .locals 2

    invoke-virtual {p0}, Lce/p;->x()Lce/i1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lce/i1;->dispose()V

    sget-object v0, Lce/p;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v1, Lce/p2;->h:Lce/p2;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lce/p;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lce/p;->k:Ljd/d;

    invoke-static {v1}, Lce/u0;->c(Ljd/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lce/p;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lce/u0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()V
    .locals 1

    invoke-virtual {p0}, Lce/p;->E()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lce/p;->t()V

    :cond_0
    return-void
.end method

.method public final v(I)V
    .locals 1

    invoke-virtual {p0}, Lce/p;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, Lce/e1;->a(Lce/d1;I)V

    return-void
.end method

.method public w(Lce/c2;)Ljava/lang/Throwable;
    .locals 0

    invoke-interface {p1}, Lce/c2;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public final x()Lce/i1;
    .locals 1

    sget-object v0, Lce/p;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/i1;

    return-object v0
.end method

.method public final y()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lce/p;->E()Z

    move-result v0

    invoke-virtual {p0}, Lce/p;->Q()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lce/p;->x()Lce/i1;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lce/p;->C()Lce/i1;

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lce/p;->J()V

    :cond_1
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lce/p;->J()V

    :cond_3
    invoke-virtual {p0}, Lce/p;->z()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/c0;

    if-eqz v1, :cond_5

    check-cast v0, Lce/c0;

    iget-object v0, v0, Lce/c0;->a:Ljava/lang/Throwable;

    invoke-static {}, Lce/t0;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0, p0}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object v0

    :cond_4
    throw v0

    :cond_5
    iget v1, p0, Lce/d1;->j:I

    invoke-static {v1}, Lce/e1;->b(I)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lce/p;->getContext()Ljd/g;

    move-result-object v1

    sget-object v2, Lce/c2;->c:Lce/c2$b;

    invoke-interface {v1, v2}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v1

    check-cast v1, Lce/c2;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Lce/c2;->a()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v1}, Lce/c2;->K()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lce/p;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-static {}, Lce/t0;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v1, p0}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_6
    throw v1

    :cond_7
    invoke-virtual {p0, v0}, Lce/p;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final z()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lce/p;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
