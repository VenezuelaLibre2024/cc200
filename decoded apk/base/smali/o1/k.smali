.class public abstract Lo1/k;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Lo1/e;

.field public volatile c:Ls1/f;


# direct methods
.method public constructor <init>(Lo1/e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo1/k;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lo1/k;->b:Lo1/e;

    return-void
.end method


# virtual methods
.method public a()Ls1/f;
    .locals 3

    invoke-virtual {p0}, Lo1/k;->b()V

    iget-object v0, p0, Lo1/k;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lo1/k;->e(Z)Ls1/f;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lo1/k;->b:Lo1/e;

    invoke-virtual {v0}, Lo1/e;->a()V

    return-void
.end method

.method public final c()Ls1/f;
    .locals 2

    invoke-virtual {p0}, Lo1/k;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo1/k;->b:Lo1/e;

    invoke-virtual {v1, v0}, Lo1/e;->d(Ljava/lang/String;)Ls1/f;

    move-result-object v0

    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public final e(Z)Ls1/f;
    .locals 0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lo1/k;->c:Ls1/f;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lo1/k;->c()Ls1/f;

    move-result-object p1

    iput-object p1, p0, Lo1/k;->c:Ls1/f;

    :cond_0
    iget-object p1, p0, Lo1/k;->c:Ls1/f;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lo1/k;->c()Ls1/f;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public f(Ls1/f;)V
    .locals 1

    iget-object v0, p0, Lo1/k;->c:Ls1/f;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lo1/k;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
