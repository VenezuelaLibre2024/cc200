.class public abstract Lc2/u$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc2/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B:",
        "Lc2/u$a<",
        "**>;W:",
        "Lc2/u;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/util/UUID;

.field public c:Ll2/p;

.field public d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc2/u$a;->a:Z

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lc2/u$a;->d:Ljava/util/Set;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lc2/u$a;->b:Ljava/util/UUID;

    iput-object p1, p0, Lc2/u$a;->e:Ljava/lang/Class;

    new-instance v0, Ll2/p;

    iget-object v1, p0, Lc2/u$a;->b:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll2/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lc2/u$a;->c:Ll2/p;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc2/u$a;->a(Ljava/lang/String;)Lc2/u$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lc2/u$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TB;"
        }
    .end annotation

    iget-object v0, p0, Lc2/u$a;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lc2/u$a;->d()Lc2/u$a;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lc2/u;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TW;"
        }
    .end annotation

    invoke-virtual {p0}, Lc2/u$a;->c()Lc2/u;

    move-result-object v0

    iget-object v1, p0, Lc2/u$a;->c:Ll2/p;

    iget-object v1, v1, Ll2/p;->j:Lc2/b;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_0

    invoke-virtual {v1}, Lc2/b;->e()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    invoke-virtual {v1}, Lc2/b;->f()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1}, Lc2/b;->g()Z

    move-result v3

    if-nez v3, :cond_2

    const/16 v3, 0x17

    if-lt v2, v3, :cond_1

    invoke-virtual {v1}, Lc2/b;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iget-object v2, p0, Lc2/u$a;->c:Ll2/p;

    iget-boolean v3, v2, Ll2/p;->q:Z

    if-eqz v3, :cond_5

    if-nez v1, :cond_4

    iget-wide v1, v2, Ll2/p;->g:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Expedited jobs cannot be delayed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Expedited jobs only support network and storage constraints"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    iput-object v1, p0, Lc2/u$a;->b:Ljava/util/UUID;

    new-instance v1, Ll2/p;

    iget-object v2, p0, Lc2/u$a;->c:Ll2/p;

    invoke-direct {v1, v2}, Ll2/p;-><init>(Ll2/p;)V

    iput-object v1, p0, Lc2/u$a;->c:Ll2/p;

    iget-object v2, p0, Lc2/u$a;->b:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll2/p;->a:Ljava/lang/String;

    return-object v0
.end method

.method public abstract c()Lc2/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TW;"
        }
    .end annotation
.end method

.method public abstract d()Lc2/u$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation
.end method

.method public final e(Lc2/a;JLjava/util/concurrent/TimeUnit;)Lc2/u$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc2/a;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TB;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc2/u$a;->a:Z

    iget-object v0, p0, Lc2/u$a;->c:Ll2/p;

    iput-object p1, v0, Ll2/p;->l:Lc2/a;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ll2/p;->e(J)V

    invoke-virtual {p0}, Lc2/u$a;->d()Lc2/u$a;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lc2/b;)Lc2/u$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc2/b;",
            ")TB;"
        }
    .end annotation

    iget-object v0, p0, Lc2/u$a;->c:Ll2/p;

    iput-object p1, v0, Ll2/p;->j:Lc2/b;

    invoke-virtual {p0}, Lc2/u$a;->d()Lc2/u$a;

    move-result-object p1

    return-object p1
.end method

.method public final g(Landroidx/work/b;)Lc2/u$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/b;",
            ")TB;"
        }
    .end annotation

    iget-object v0, p0, Lc2/u$a;->c:Ll2/p;

    iput-object p1, v0, Ll2/p;->e:Landroidx/work/b;

    invoke-virtual {p0}, Lc2/u$a;->d()Lc2/u$a;

    move-result-object p1

    return-object p1
.end method
