.class public abstract Lce/o1;
.super Lce/m1;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lce/m1;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract W0()Ljava/lang/Thread;
.end method

.method public X0(JLce/n1$b;)V
    .locals 1

    sget-object v0, Lce/v0;->p:Lce/v0;

    invoke-virtual {v0, p1, p2, p3}, Lce/n1;->i1(JLce/n1$b;)V

    return-void
.end method

.method public final Y0()V
    .locals 2

    invoke-virtual {p0}, Lce/o1;->W0()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    invoke-static {}, Lce/c;->a()Lce/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
