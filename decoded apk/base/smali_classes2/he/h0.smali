.class public Lhe/h0;
.super Lce/a;
.source ""

# interfaces
.implements Lld/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lce/a<",
        "TT;>;",
        "Lld/e;"
    }
.end annotation


# instance fields
.field public final k:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljd/g;Ljd/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g;",
            "Ljd/d<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, Lce/a;-><init>(Ljd/g;ZZ)V

    iput-object p2, p0, Lhe/h0;->k:Ljd/d;

    return-void
.end method


# virtual methods
.method public O0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lhe/h0;->k:Ljd/d;

    invoke-static {p1, v0}, Lce/g0;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final Y()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getCallerFrame()Lld/e;
    .locals 2

    iget-object v0, p0, Lhe/h0;->k:Ljd/d;

    instance-of v1, v0, Lld/e;

    if-eqz v1, :cond_0

    check-cast v0, Lld/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lhe/h0;->k:Ljd/d;

    invoke-static {v0}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v0

    iget-object v1, p0, Lhe/h0;->k:Ljd/d;

    invoke-static {p1, v1}, Lce/g0;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lhe/m;->c(Ljd/d;Ljava/lang/Object;Lsd/l;ILjava/lang/Object;)V

    return-void
.end method
