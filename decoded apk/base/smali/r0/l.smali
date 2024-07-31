.class public final Lr0/l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lce/p0;

.field public final b:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "TT;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lee/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lce/p0;Lsd/l;Lsd/p;Lsd/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/p0;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;",
            "Lsd/p<",
            "-TT;-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;",
            "Lsd/p<",
            "-TT;-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUndeliveredElement"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumeMessage"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/l;->a:Lce/p0;

    iput-object p4, p0, Lr0/l;->b:Lsd/p;

    const p4, 0x7fffffff

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p4, v0, v0, v1, v0}, Lee/f;->b(ILee/a;Lsd/l;ILjava/lang/Object;)Lee/d;

    move-result-object p4

    iput-object p4, p0, Lr0/l;->c:Lee/d;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p4, p0, Lr0/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-interface {p1}, Lce/p0;->b()Ljd/g;

    move-result-object p1

    sget-object p4, Lce/c2;->c:Lce/c2$b;

    invoke-interface {p1, p4}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p1

    check-cast p1, Lce/c2;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p4, Lr0/l$a;

    invoke-direct {p4, p2, p0, p3}, Lr0/l$a;-><init>(Lsd/l;Lr0/l;Lsd/p;)V

    invoke-interface {p1, p4}, Lce/c2;->x0(Lsd/l;)Lce/i1;

    :goto_0
    return-void
.end method

.method public static final synthetic a(Lr0/l;)Lsd/p;
    .locals 0

    iget-object p0, p0, Lr0/l;->b:Lsd/p;

    return-object p0
.end method

.method public static final synthetic b(Lr0/l;)Lee/d;
    .locals 0

    iget-object p0, p0, Lr0/l;->c:Lee/d;

    return-object p0
.end method

.method public static final synthetic c(Lr0/l;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lr0/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic d(Lr0/l;)Lce/p0;
    .locals 0

    iget-object p0, p0, Lr0/l;->a:Lce/p0;

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lr0/l;->c:Lee/d;

    invoke-interface {v0, p1}, Lee/n;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lee/g$a;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lee/g;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lee/j;

    const-string v0, "Channel was closed normally"

    invoke-direct {p1, v0}, Lee/j;-><init>(Ljava/lang/String;)V

    :cond_0
    throw p1

    :cond_1
    invoke-static {p1}, Lee/g;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lr0/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_2

    iget-object v0, p0, Lr0/l;->a:Lce/p0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lr0/l$b;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lr0/l$b;-><init>(Lr0/l;Ljd/d;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lce/i;->d(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/c2;

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
