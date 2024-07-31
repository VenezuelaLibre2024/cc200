.class public final Lce/j2$a;
.super Lce/p;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/j2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lce/p<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final p:Lce/j2;


# direct methods
.method public constructor <init>(Ljd/d;Lce/j2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-TT;>;",
            "Lce/j2;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lce/p;-><init>(Ljd/d;I)V

    iput-object p2, p0, Lce/j2$a;->p:Lce/j2;

    return-void
.end method


# virtual methods
.method public H()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

.method public w(Lce/c2;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lce/j2$a;->p:Lce/j2;

    invoke-virtual {v0}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lce/j2$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lce/j2$c;

    invoke-virtual {v1}, Lce/j2$c;->f()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, Lce/c0;

    if-eqz v1, :cond_1

    check-cast v0, Lce/c0;

    iget-object p1, v0, Lce/c0;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-interface {p1}, Lce/c2;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
