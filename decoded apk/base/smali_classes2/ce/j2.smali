.class public Lce/j2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lce/c2;
.implements Lce/w;
.implements Lce/r2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce/j2$a;,
        Lce/j2$b;,
        Lce/j2$c;
    }
.end annotation


# static fields
.field public static final h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lce/j2;

    const-string v2, "_state"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "_parentHandle"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lce/j2;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, Lce/k2;->c()Lce/l1;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lce/k2;->d()Lce/l1;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lce/j2;->_state:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic H0(Lce/j2;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lce/j2;->G0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic i(Lce/j2;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lce/j2;->B()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lce/j2;Lce/j2$c;Lce/v;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lce/j2;->F(Lce/j2$c;Lce/v;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lce/j2;->Y()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, Lce/j2;->S()Lce/u;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, Lce/p2;->h:Lce/p2;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lce/u;->c(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public final A0(Lce/l1;)V
    .locals 2

    new-instance v0, Lce/o2;

    invoke-direct {v0}, Lce/o2;-><init>()V

    invoke-virtual {p1}, Lce/l1;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lce/w1;

    invoke-direct {v1, v0}, Lce/w1;-><init>(Lce/o2;)V

    move-object v0, v1

    :goto_0
    sget-object v1, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public B()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public final B0(Lce/i2;)V
    .locals 2

    new-instance v0, Lce/o2;

    invoke-direct {v0}, Lce/o2;-><init>()V

    invoke-virtual {p1, v0}, Lhe/w;->h(Lhe/w;)Z

    invoke-virtual {p1}, Lhe/w;->n()Lhe/w;

    move-result-object v0

    sget-object v1, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public C(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lce/j2;->v(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lce/j2;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final C0(Lce/i2;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/i2;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lce/k2;->c()Lce/l1;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, Lce/x1;

    if-eqz v1, :cond_3

    check-cast v0, Lce/x1;

    invoke-interface {v0}, Lce/x1;->e()Lce/o2;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lhe/w;->q()Z

    :cond_3
    return-void
.end method

.method public final D(Lce/x1;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lce/j2;->S()Lce/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lce/i1;->dispose()V

    sget-object v0, Lce/p2;->h:Lce/p2;

    invoke-virtual {p0, v0}, Lce/j2;->D0(Lce/u;)V

    :cond_0
    instance-of v0, p2, Lce/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lce/c0;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object v1, p2, Lce/c0;->a:Ljava/lang/Throwable;

    :cond_2
    instance-of p2, p1, Lce/i2;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, Lce/i2;

    invoke-virtual {p2, v1}, Lce/e0;->u(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    new-instance v0, Lce/f0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lce/f0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lce/j2;->V(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lce/x1;->e()Lce/o2;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1, v1}, Lce/j2;->q0(Lce/o2;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final D0(Lce/u;)V
    .locals 1

    sget-object v0, Lce/j2;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final E0(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, Lce/l1;

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lce/l1;

    invoke-virtual {v0}, Lce/l1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    sget-object v0, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lce/k2;->c()Lce/l1;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lce/j2;->w0()V

    return v2

    :cond_2
    instance-of v0, p1, Lce/w1;

    if-eqz v0, :cond_4

    sget-object v0, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v3, p1

    check-cast v3, Lce/w1;

    invoke-virtual {v3}, Lce/w1;->e()Lce/o2;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lce/j2;->w0()V

    return v2

    :cond_4
    return v3
.end method

.method public final F(Lce/j2$c;Lce/v;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-virtual {p0, p2}, Lce/j2;->o0(Lhe/w;)Lce/v;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1, p2, p3}, Lce/j2;->N0(Lce/j2$c;Lce/v;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    return-void

    :cond_3
    invoke-virtual {p0, p1, p3}, Lce/j2;->H(Lce/j2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lce/j2;->r(Ljava/lang/Object;)V

    return-void
.end method

.method public final F0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, Lce/j2$c;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, Lce/j2$c;

    invoke-virtual {p1}, Lce/j2$c;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lce/j2$c;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lce/x1;

    if-eqz v0, :cond_3

    check-cast p1, Lce/x1;

    invoke-interface {p1}, Lce/x1;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lce/c0;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method public final G(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    new-instance v0, Lce/d2;

    invoke-static {p0}, Lce/j2;->i(Lce/j2;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lce/d2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lce/c2;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lce/r2;

    invoke-interface {p1}, Lce/r2;->v0()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method public final G0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lce/d2;

    if-nez p2, :cond_1

    invoke-static {p0}, Lce/j2;->i(Lce/j2;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lce/d2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lce/c2;)V

    :cond_2
    return-object v0
.end method

.method public final H(Lce/j2$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lce/j2$c;->i()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_4
    :goto_2
    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lce/j2$c;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_6
    :goto_3
    instance-of v0, p2, Lce/c0;

    const/4 v3, 0x0

    if-eqz v0, :cond_7

    move-object v0, p2

    check-cast v0, Lce/c0;

    goto :goto_4

    :cond_7
    move-object v0, v3

    :goto_4
    if-eqz v0, :cond_8

    iget-object v0, v0, Lce/c0;->a:Ljava/lang/Throwable;

    goto :goto_5

    :cond_8
    move-object v0, v3

    :goto_5
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lce/j2$c;->g()Z

    move-result v4

    invoke-virtual {p1, v0}, Lce/j2$c;->j(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0, p1, v5}, Lce/j2;->N(Lce/j2$c;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {p0, v6, v5}, Lce/j2;->q(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    monitor-exit p1

    if-nez v6, :cond_a

    goto :goto_6

    :cond_a
    if-ne v6, v0, :cond_b

    goto :goto_6

    :cond_b
    new-instance p2, Lce/c0;

    const/4 v0, 0x2

    invoke-direct {p2, v6, v2, v0, v3}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    :goto_6
    if-eqz v6, :cond_e

    invoke-virtual {p0, v6}, Lce/j2;->A(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0, v6}, Lce/j2;->U(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_7

    :cond_c
    move v1, v2

    :cond_d
    :goto_7
    if-eqz v1, :cond_e

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lce/c0;

    invoke-virtual {v0}, Lce/c0;->b()Z

    :cond_e
    if-nez v4, :cond_f

    invoke-virtual {p0, v6}, Lce/j2;->t0(Ljava/lang/Throwable;)V

    :cond_f
    invoke-virtual {p0, p2}, Lce/j2;->u0(Ljava/lang/Object;)V

    sget-object v0, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lce/k2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {}, Lce/t0;->a()Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v0, :cond_10

    goto :goto_8

    :cond_10
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_11
    :goto_8
    invoke-virtual {p0, p1, p2}, Lce/j2;->D(Lce/x1;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final I(Lce/r2;)V
    .locals 0

    invoke-virtual {p0, p1}, Lce/j2;->v(Ljava/lang/Object;)Z

    return-void
.end method

.method public final I0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lce/j2;->m0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lce/j2;->F0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final J(Lce/x1;)Lce/v;
    .locals 2

    instance-of v0, p1, Lce/v;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lce/v;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-interface {p1}, Lce/x1;->e()Lce/o2;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lce/j2;->o0(Lhe/w;)Lce/v;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_1
    return-object v1
.end method

.method public final J0(Lce/x1;Ljava/lang/Object;)Z
    .locals 4

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    instance-of v0, p1, Lce/l1;

    if-nez v0, :cond_1

    instance-of v0, p1, Lce/i2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_2
    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    instance-of v0, p2, Lce/c0;

    xor-int/2addr v0, v2

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    :goto_3
    sget-object v0, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lce/k2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lce/j2;->t0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, Lce/j2;->u0(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lce/j2;->D(Lce/x1;Ljava/lang/Object;)V

    return v2
.end method

.method public final K()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/j2$c;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, Lce/j2$c;

    invoke-virtual {v0}, Lce/j2$c;->f()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lce/u0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lce/j2;->G0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v1, v0, Lce/x1;

    if-nez v1, :cond_3

    instance-of v1, v0, Lce/c0;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lce/c0;

    iget-object v0, v0, Lce/c0;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, Lce/j2;->H0(Lce/j2;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lce/d2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lce/u0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lce/d2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lce/c2;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final K0(Lce/x1;Ljava/lang/Throwable;)Z
    .locals 5

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    instance-of v0, p1, Lce/j2$c;

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lce/x1;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Lce/j2;->R(Lce/x1;)Lce/o2;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_4

    return v2

    :cond_4
    new-instance v3, Lce/j2$c;

    invoke-direct {v3, v0, v2, p2}, Lce/j2$c;-><init>(Lce/o2;ZLjava/lang/Throwable;)V

    sget-object v4, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p0, p1, v3}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0, v0, p2}, Lce/j2;->p0(Lce/o2;Ljava/lang/Throwable;)V

    return v1
.end method

.method public final L()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/x1;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    instance-of v1, v0, Lce/c0;

    if-nez v1, :cond_0

    invoke-static {v0}, Lce/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Lce/c0;

    iget-object v0, v0, Lce/c0;->a:Ljava/lang/Throwable;

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final L0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lce/x1;

    if-nez v0, :cond_0

    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lce/l1;

    if-nez v0, :cond_1

    instance-of v0, p1, Lce/i2;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Lce/v;

    if-nez v0, :cond_3

    instance-of v0, p2, Lce/c0;

    if-nez v0, :cond_3

    check-cast p1, Lce/x1;

    invoke-virtual {p0, p1, p2}, Lce/j2;->J0(Lce/x1;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, Lce/k2;->b()Lhe/l0;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, Lce/x1;

    invoke-virtual {p0, p1, p2}, Lce/j2;->M0(Lce/x1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final M(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lce/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lce/c0;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, Lce/c0;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public final M0(Lce/x1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0, p1}, Lce/j2;->R(Lce/x1;)Lce/o2;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lce/k2;->b()Lhe/l0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, Lce/j2$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lce/j2$c;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_2

    new-instance v1, Lce/j2$c;

    invoke-direct {v1, v0, v3, v2}, Lce/j2$c;-><init>(Lce/o2;ZLjava/lang/Throwable;)V

    :cond_2
    new-instance v4, Ltd/w;

    invoke-direct {v4}, Ltd/w;-><init>()V

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Lce/j2$c;->h()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_3
    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v1, v5}, Lce/j2$c;->k(Z)V

    if-eq v1, p1, :cond_4

    sget-object v6, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v6, p0, p1, v1}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {}, Lce/k2;->b()Lhe/l0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-static {}, Lce/t0;->a()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v1}, Lce/j2$c;->i()Z

    move-result v6

    xor-int/2addr v6, v5

    if-eqz v6, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_6
    :goto_1
    invoke-virtual {v1}, Lce/j2$c;->g()Z

    move-result v6

    instance-of v7, p2, Lce/c0;

    if-eqz v7, :cond_7

    move-object v7, p2

    check-cast v7, Lce/c0;

    goto :goto_2

    :cond_7
    move-object v7, v2

    :goto_2
    if-eqz v7, :cond_8

    iget-object v7, v7, Lce/c0;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v7}, Lce/j2$c;->b(Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {v1}, Lce/j2$c;->f()Ljava/lang/Throwable;

    move-result-object v7

    if-nez v6, :cond_9

    move v3, v5

    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_a

    move-object v2, v7

    :cond_a
    iput-object v2, v4, Ltd/w;->h:Ljava/lang/Object;

    sget-object v3, Lgd/s;->a:Lgd/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    move-object v3, v2

    check-cast v3, Ljava/lang/Throwable;

    if-eqz v2, :cond_b

    invoke-virtual {p0, v0, v2}, Lce/j2;->p0(Lce/o2;Ljava/lang/Throwable;)V

    :cond_b
    invoke-virtual {p0, p1}, Lce/j2;->J(Lce/x1;)Lce/v;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p0, v1, p1, p2}, Lce/j2;->N0(Lce/j2$c;Lce/v;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object p1, Lce/k2;->b:Lhe/l0;

    return-object p1

    :cond_c
    invoke-virtual {p0, v1, p2}, Lce/j2;->H(Lce/j2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final N(Lce/j2$c;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/j2$c;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lce/j2$c;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lce/d2;

    invoke-static {p0}, Lce/j2;->i(Lce/j2;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lce/d2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lce/c2;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    instance-of v3, v3, Ljava/util/concurrent/CancellationException;

    xor-int/2addr v3, v2

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    instance-of v3, v0, Lce/d3;

    if-eqz v3, :cond_8

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Throwable;

    if-eq v4, v0, :cond_6

    instance-of v4, v4, Lce/d3;

    if-eqz v4, :cond_6

    move v4, v2

    goto :goto_1

    :cond_6
    move v4, p1

    :goto_1
    if-eqz v4, :cond_5

    move-object v1, v3

    :cond_7
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_8

    return-object v1

    :cond_8
    return-object v0
.end method

.method public final N0(Lce/j2$c;Lce/v;Ljava/lang/Object;)Z
    .locals 6

    :cond_0
    iget-object v0, p2, Lce/v;->l:Lce/w;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lce/j2$b;

    invoke-direct {v3, p0, p1, p2, p3}, Lce/j2$b;-><init>(Lce/j2;Lce/j2$c;Lce/v;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lce/c2$a;->d(Lce/c2;ZZLsd/l;ILjava/lang/Object;)Lce/i1;

    move-result-object v0

    sget-object v1, Lce/p2;->h:Lce/p2;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {p0, p2}, Lce/j2;->o0(Lhe/w;)Lce/v;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public O()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final P(Ljd/d;)Ljava/lang/Object;
    .locals 1
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

    invoke-virtual {p0}, Lce/j2;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljd/d;->getContext()Ljd/g;

    move-result-object p1

    invoke-static {p1}, Lce/g2;->i(Ljd/g;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lce/j2;->a0(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public Q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final R(Lce/x1;)Lce/o2;
    .locals 3

    invoke-interface {p1}, Lce/x1;->e()Lce/o2;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lce/l1;

    if-eqz v0, :cond_0

    new-instance v0, Lce/o2;

    invoke-direct {v0}, Lce/o2;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lce/i2;

    if-eqz v0, :cond_1

    check-cast p1, Lce/i2;

    invoke-virtual {p0, p1}, Lce/j2;->B0(Lce/i2;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State should have list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final S()Lce/u;
    .locals 1

    sget-object v0, Lce/j2;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/u;

    return-object v0
.end method

.method public final T()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lhe/e0;

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    check-cast v1, Lhe/e0;

    invoke-virtual {v1, p0}, Lhe/e0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public U(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public V(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method public final X(Lce/c2;)V
    .locals 1

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lce/j2;->S()Lce/u;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    if-nez p1, :cond_3

    sget-object p1, Lce/p2;->h:Lce/p2;

    invoke-virtual {p0, p1}, Lce/j2;->D0(Lce/u;)V

    return-void

    :cond_3
    invoke-interface {p1}, Lce/c2;->start()Z

    invoke-interface {p1, p0}, Lce/c2;->h0(Lce/w;)Lce/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lce/j2;->D0(Lce/u;)V

    invoke-virtual {p0}, Lce/j2;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lce/i1;->dispose()V

    sget-object p1, Lce/p2;->h:Lce/p2;

    invoke-virtual {p0, p1}, Lce/j2;->D0(Lce/u;)V

    :cond_4
    return-void
.end method

.method public Y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Z()Z
    .locals 2

    :cond_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/x1;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p0, v0}, Lce/j2;->E0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method public a()Z
    .locals 2

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/x1;

    if-eqz v1, :cond_0

    check-cast v0, Lce/x1;

    invoke-interface {v0}, Lce/x1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final a0(Ljd/d;)Ljava/lang/Object;
    .locals 3
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

    new-instance v0, Lce/p;

    invoke-static {p1}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/p;-><init>(Ljd/d;I)V

    invoke-virtual {v0}, Lce/p;->B()V

    new-instance v1, Lce/t2;

    invoke-direct {v1, v0}, Lce/t2;-><init>(Ljd/d;)V

    invoke-virtual {p0, v1}, Lce/j2;->x0(Lsd/l;)Lce/i1;

    move-result-object v1

    invoke-static {v0, v1}, Lce/r;->a(Lce/n;Lce/i1;)V

    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lld/h;->c(Ljd/d;)V

    :cond_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_1

    return-object v0

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public b0(Ljd/g$c;)Ljd/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "*>;)",
            "Ljd/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lce/c2$a;->e(Lce/c2;Ljd/g$c;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljd/g$c;)Ljd/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljd/g$b;",
            ">(",
            "Ljd/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lce/c2$a;->c(Lce/c2;Ljd/g$c;)Ljd/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final d0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lce/j2$c;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, Lce/j2$c;

    invoke-virtual {v3}, Lce/j2$c;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lce/k2;->f()Lhe/l0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lce/j2$c;

    invoke-virtual {v3}, Lce/j2$c;->g()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {p0, p1}, Lce/j2;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, Lce/j2$c;

    invoke-virtual {p1, v1}, Lce/j2$c;->b(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, Lce/j2$c;

    invoke-virtual {p1}, Lce/j2$c;->f()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-eqz v0, :cond_6

    check-cast v2, Lce/j2$c;

    invoke-virtual {v2}, Lce/j2$c;->e()Lce/o2;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lce/j2;->p0(Lce/o2;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, Lce/x1;

    if-eqz v3, :cond_b

    if-nez v1, :cond_8

    invoke-virtual {p0, p1}, Lce/j2;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, Lce/x1;

    invoke-interface {v3}, Lce/x1;->a()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {p0, v3, v1}, Lce/j2;->K0(Lce/x1;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, Lce/c0;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    invoke-virtual {p0, v2, v3}, Lce/j2;->L0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object v4

    if-eq v3, v4, :cond_a

    invoke-static {}, Lce/k2;->b()Lhe/l0;

    move-result-object v2

    if-eq v3, v2, :cond_0

    return-object v3

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot happen in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {}, Lce/k2;->f()Lhe/l0;

    move-result-object p1

    return-object p1
.end method

.method public e0(Ljd/g;)Ljd/g;
    .locals 0

    invoke-static {p0, p1}, Lce/c2$a;->f(Lce/c2;Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Ljd/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljd/g$c<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lce/c2;->c:Lce/c2$b;

    return-object v0
.end method

.method public getParent()Lce/c2;
    .locals 1

    invoke-virtual {p0}, Lce/j2;->S()Lce/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lce/u;->getParent()Lce/c2;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final h0(Lce/w;)Lce/u;
    .locals 6

    new-instance v3, Lce/v;

    invoke-direct {v3, p1}, Lce/v;-><init>(Lce/w;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lce/c2$a;->d(Lce/c2;ZZLsd/l;ILjava/lang/Object;)Lce/i1;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lce/u;

    return-object p1
.end method

.method public final i0(Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lce/j2;->L0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, Lce/k2;->b:Lhe/l0;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    invoke-static {}, Lce/k2;->b()Lhe/l0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lce/j2;->r(Ljava/lang/Object;)V

    return v2
.end method

.method public final isCancelled()Z
    .locals 2

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/c0;

    if-nez v1, :cond_1

    instance-of v1, v0, Lce/j2$c;

    if-eqz v1, :cond_0

    check-cast v0, Lce/j2$c;

    invoke-virtual {v0}, Lce/j2$c;->g()Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public final j0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lce/j2;->L0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lce/k2;->b()Lhe/l0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lce/j2;->M(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final k()Z
    .locals 1

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lce/x1;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final k0(Lsd/l;Z)Lce/i2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;Z)",
            "Lce/i2;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    instance-of p2, p1, Lce/e2;

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Lce/e2;

    :cond_0
    if-nez v0, :cond_5

    new-instance v0, Lce/a2;

    invoke-direct {v0, p1}, Lce/a2;-><init>(Lsd/l;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lce/i2;

    if-eqz p2, :cond_2

    move-object v0, p1

    check-cast v0, Lce/i2;

    :cond_2
    if-eqz v0, :cond_4

    invoke-static {}, Lce/t0;->a()Z

    move-result p1

    if-eqz p1, :cond_5

    instance-of p1, v0, Lce/e2;

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_4
    new-instance v0, Lce/b2;

    invoke-direct {v0, p1}, Lce/b2;-><init>(Lsd/l;)V

    :cond_5
    :goto_0
    invoke-virtual {v0, p0}, Lce/i2;->w(Lce/j2;)V

    return-object v0
.end method

.method public final l(ZZLsd/l;)Lce/i1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Lce/i1;"
        }
    .end annotation

    invoke-virtual {p0, p3, p1}, Lce/j2;->k0(Lsd/l;Z)Lce/i2;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lce/l1;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lce/l1;

    invoke-virtual {v2}, Lce/l1;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, Lce/j2;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Lce/o;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0, v2}, Lce/j2;->A0(Lce/l1;)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Lce/x1;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    move-object v2, v1

    check-cast v2, Lce/x1;

    invoke-interface {v2}, Lce/x1;->e()Lce/o2;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v1, v2}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lce/i2;

    invoke-virtual {p0, v1}, Lce/j2;->B0(Lce/i2;)V

    goto :goto_0

    :cond_3
    sget-object v4, Lce/p2;->h:Lce/p2;

    if-eqz p1, :cond_8

    instance-of v5, v1, Lce/j2$c;

    if-eqz v5, :cond_8

    monitor-enter v1

    :try_start_0
    move-object v3, v1

    check-cast v3, Lce/j2$c;

    invoke-virtual {v3}, Lce/j2$c;->f()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4

    instance-of v5, p3, Lce/v;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, Lce/j2$c;

    invoke-virtual {v5}, Lce/j2$c;->h()Z

    move-result v5

    if-nez v5, :cond_7

    :cond_4
    invoke-virtual {p0, v1, v2, v0}, Lce/j2;->p(Ljava/lang/Object;Lce/o2;Lce/i2;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    monitor-exit v1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    monitor-exit v1

    return-object v0

    :cond_6
    move-object v4, v0

    :cond_7
    :try_start_1
    sget-object v5, Lgd/s;->a:Lgd/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_1
    if-eqz v3, :cond_a

    if-eqz p2, :cond_9

    invoke-interface {p3, v3}, Lsd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object v4

    :cond_a
    invoke-virtual {p0, v1, v2, v0}, Lce/j2;->p(Ljava/lang/Object;Lce/o2;Lce/i2;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_b
    if-eqz p2, :cond_e

    instance-of p1, v1, Lce/c0;

    if-eqz p1, :cond_c

    check-cast v1, Lce/c0;

    goto :goto_2

    :cond_c
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_d

    iget-object v3, v1, Lce/c0;->a:Ljava/lang/Throwable;

    :cond_d
    invoke-interface {p3, v3}, Lsd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    sget-object p1, Lce/p2;->h:Lce/p2;

    return-object p1
.end method

.method public m0()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lce/u0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final o0(Lhe/w;)Lce/v;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lhe/w;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lhe/w;->o()Lhe/w;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lhe/w;->n()Lhe/w;

    move-result-object p1

    invoke-virtual {p1}, Lhe/w;->p()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, Lce/v;

    if-eqz v0, :cond_1

    check-cast p1, Lce/v;

    return-object p1

    :cond_1
    instance-of v0, p1, Lce/o2;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final p(Ljava/lang/Object;Lce/o2;Lce/i2;)Z
    .locals 2

    new-instance v0, Lce/j2$d;

    invoke-direct {v0, p3, p0, p1}, Lce/j2$d;-><init>(Lhe/w;Lce/j2;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lhe/w;->o()Lhe/w;

    move-result-object p1

    invoke-virtual {p1, p3, p2, v0}, Lhe/w;->t(Lhe/w;Lhe/w;Lhe/w$a;)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method public final p0(Lce/o2;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p0, p2}, Lce/j2;->t0(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lhe/w;->m()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhe/w;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lce/e2;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lce/i2;

    :try_start_0
    invoke-virtual {v2, p2}, Lce/e0;->u(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lgd/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lce/f0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lce/f0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lgd/s;->a:Lgd/s;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lhe/w;->n()Lhe/w;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lce/j2;->V(Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p0, p2}, Lce/j2;->A(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final q(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-static {}, Lce/t0;->d()Z

    move-result v1

    if-nez v1, :cond_1

    move-object v1, p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lhe/k0;->l(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {}, Lce/t0;->d()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lhe/k0;->l(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v2

    :goto_2
    if-eq v2, p1, :cond_2

    if-eq v2, v1, :cond_2

    instance-of v3, v2, Ljava/util/concurrent/CancellationException;

    if-nez v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {p1, v2}, Lgd/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final q0(Lce/o2;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lhe/w;->m()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhe/w;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lce/i2;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lce/i2;

    :try_start_0
    invoke-virtual {v2, p2}, Lce/e0;->u(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lgd/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lce/f0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lce/f0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lgd/s;->a:Lgd/s;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lhe/w;->n()Lhe/w;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lce/j2;->V(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public r(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final s(Ljd/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/x1;

    if-nez v1, :cond_4

    instance-of v1, v0, Lce/c0;

    if-eqz v1, :cond_3

    check-cast v0, Lce/c0;

    iget-object v0, v0, Lce/c0;->a:Ljava/lang/Throwable;

    invoke-static {}, Lce/t0;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Lld/e;

    if-nez v1, :cond_1

    throw v0

    :cond_1
    check-cast p1, Lld/e;

    invoke-static {v0, p1}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_2
    throw v0

    :cond_3
    invoke-static {v0}, Lce/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0, v0}, Lce/j2;->E0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0, p1}, Lce/j2;->t(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final start()Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lce/j2;->E0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final t(Ljd/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lce/j2$a;

    invoke-static {p1}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lce/j2$a;-><init>(Ljd/d;Lce/j2;)V

    invoke-virtual {v0}, Lce/p;->B()V

    new-instance v1, Lce/s2;

    invoke-direct {v1, v0}, Lce/s2;-><init>(Lce/p;)V

    invoke-virtual {p0, v1}, Lce/j2;->x0(Lsd/l;)Lce/i1;

    move-result-object v1

    invoke-static {v0, v1}, Lce/r;->a(Lce/n;Lce/i1;)V

    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lld/h;->c(Ljd/d;)V

    :cond_0
    return-object v0
.end method

.method public t0(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lce/j2;->I0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lce/u0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lce/j2;->v(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public u0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final v(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object v0

    invoke-virtual {p0}, Lce/j2;->Q()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lce/j2;->z(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lce/k2;->b:Lhe/l0;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lce/j2;->d0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lce/k2;->b:Lhe/l0;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lce/k2;->f()Lhe/l0;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, Lce/j2;->r(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public v0()Ljava/util/concurrent/CancellationException;
    .locals 5

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/j2$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lce/j2$c;

    invoke-virtual {v1}, Lce/j2$c;->f()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lce/c0;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lce/c0;

    iget-object v1, v1, Lce/c0;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lce/x1;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lce/d2;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lce/j2;->F0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lce/d2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lce/c2;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final w()Lzd/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzd/b<",
            "Lce/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lce/j2$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lce/j2$e;-><init>(Lce/j2;Ljd/d;)V

    invoke-static {v0}, Lzd/e;->b(Lsd/p;)Lzd/b;

    move-result-object v0

    return-object v0
.end method

.method public w0()V
    .locals 0

    return-void
.end method

.method public final x()Ljava/lang/Throwable;
    .locals 2

    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/x1;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lce/j2;->M(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final x0(Lsd/l;)Lce/i1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Lce/i1;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1}, Lce/j2;->l(ZZLsd/l;)Lce/i1;

    move-result-object p1

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lce/j2;->v(Ljava/lang/Object;)Z

    return-void
.end method

.method public y0(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-instance v0, Lce/d2;

    invoke-static {p0}, Lce/j2;->i(Lce/j2;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lce/d2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lce/c2;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0, p1}, Lce/j2;->y(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final z(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    invoke-virtual {p0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/x1;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lce/j2$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lce/j2$c;

    invoke-virtual {v1}, Lce/j2$c;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lce/c0;

    invoke-virtual {p0, p1}, Lce/j2;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    invoke-virtual {p0, v0, v1}, Lce/j2;->L0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lce/k2;->b()Lhe/l0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, Lce/k2;->a()Lhe/l0;

    move-result-object p1

    return-object p1
.end method

.method public z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lsd/p<",
            "-TR;-",
            "Ljd/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lce/c2$a;->b(Lce/c2;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
