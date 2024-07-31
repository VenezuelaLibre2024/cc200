.class public Lre/d0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lre/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lre/b0;

.field public b:Lre/z;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lre/t;

.field public f:Lre/u$a;

.field public g:Lre/e0;

.field public h:Lre/d0;

.field public i:Lre/d0;

.field public j:Lre/d0;

.field public k:J

.field public l:J

.field public m:Lue/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lre/d0$a;->c:I

    new-instance v0, Lre/u$a;

    invoke-direct {v0}, Lre/u$a;-><init>()V

    iput-object v0, p0, Lre/d0$a;->f:Lre/u$a;

    return-void
.end method

.method public constructor <init>(Lre/d0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lre/d0$a;->c:I

    iget-object v0, p1, Lre/d0;->h:Lre/b0;

    iput-object v0, p0, Lre/d0$a;->a:Lre/b0;

    iget-object v0, p1, Lre/d0;->i:Lre/z;

    iput-object v0, p0, Lre/d0$a;->b:Lre/z;

    iget v0, p1, Lre/d0;->j:I

    iput v0, p0, Lre/d0$a;->c:I

    iget-object v0, p1, Lre/d0;->k:Ljava/lang/String;

    iput-object v0, p0, Lre/d0$a;->d:Ljava/lang/String;

    iget-object v0, p1, Lre/d0;->l:Lre/t;

    iput-object v0, p0, Lre/d0$a;->e:Lre/t;

    iget-object v0, p1, Lre/d0;->m:Lre/u;

    invoke-virtual {v0}, Lre/u;->f()Lre/u$a;

    move-result-object v0

    iput-object v0, p0, Lre/d0$a;->f:Lre/u$a;

    iget-object v0, p1, Lre/d0;->n:Lre/e0;

    iput-object v0, p0, Lre/d0$a;->g:Lre/e0;

    iget-object v0, p1, Lre/d0;->o:Lre/d0;

    iput-object v0, p0, Lre/d0$a;->h:Lre/d0;

    iget-object v0, p1, Lre/d0;->p:Lre/d0;

    iput-object v0, p0, Lre/d0$a;->i:Lre/d0;

    iget-object v0, p1, Lre/d0;->q:Lre/d0;

    iput-object v0, p0, Lre/d0$a;->j:Lre/d0;

    iget-wide v0, p1, Lre/d0;->r:J

    iput-wide v0, p0, Lre/d0$a;->k:J

    iget-wide v0, p1, Lre/d0;->s:J

    iput-wide v0, p0, Lre/d0$a;->l:J

    iget-object p1, p1, Lre/d0;->t:Lue/c;

    iput-object p1, p0, Lre/d0$a;->m:Lue/c;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lre/d0$a;
    .locals 1

    iget-object v0, p0, Lre/d0$a;->f:Lre/u$a;

    invoke-virtual {v0, p1, p2}, Lre/u$a;->a(Ljava/lang/String;Ljava/lang/String;)Lre/u$a;

    return-object p0
.end method

.method public b(Lre/e0;)Lre/d0$a;
    .locals 0

    iput-object p1, p0, Lre/d0$a;->g:Lre/e0;

    return-object p0
.end method

.method public c()Lre/d0;
    .locals 3

    iget-object v0, p0, Lre/d0$a;->a:Lre/b0;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lre/d0$a;->b:Lre/z;

    if-eqz v0, :cond_2

    iget v0, p0, Lre/d0$a;->c:I

    if-ltz v0, :cond_1

    iget-object v0, p0, Lre/d0$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Lre/d0;

    invoke-direct {v0, p0}, Lre/d0;-><init>(Lre/d0$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lre/d0$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lre/d0;)Lre/d0$a;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "cacheResponse"

    invoke-virtual {p0, v0, p1}, Lre/d0$a;->f(Ljava/lang/String;Lre/d0;)V

    :cond_0
    iput-object p1, p0, Lre/d0$a;->i:Lre/d0;

    return-object p0
.end method

.method public final e(Lre/d0;)V
    .locals 1

    iget-object p1, p1, Lre/d0;->n:Lre/e0;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Ljava/lang/String;Lre/d0;)V
    .locals 1

    iget-object v0, p2, Lre/d0;->n:Lre/e0;

    if-nez v0, :cond_3

    iget-object v0, p2, Lre/d0;->o:Lre/d0;

    if-nez v0, :cond_2

    iget-object v0, p2, Lre/d0;->p:Lre/d0;

    if-nez v0, :cond_1

    iget-object p2, p2, Lre/d0;->q:Lre/d0;

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".priorResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cacheResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".networkResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".body != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public g(I)Lre/d0$a;
    .locals 0

    iput p1, p0, Lre/d0$a;->c:I

    return-object p0
.end method

.method public h(Lre/t;)Lre/d0$a;
    .locals 0

    iput-object p1, p0, Lre/d0$a;->e:Lre/t;

    return-object p0
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Lre/d0$a;
    .locals 1

    iget-object v0, p0, Lre/d0$a;->f:Lre/u$a;

    invoke-virtual {v0, p1, p2}, Lre/u$a;->f(Ljava/lang/String;Ljava/lang/String;)Lre/u$a;

    return-object p0
.end method

.method public j(Lre/u;)Lre/d0$a;
    .locals 0

    invoke-virtual {p1}, Lre/u;->f()Lre/u$a;

    move-result-object p1

    iput-object p1, p0, Lre/d0$a;->f:Lre/u$a;

    return-object p0
.end method

.method public k(Lue/c;)V
    .locals 0

    iput-object p1, p0, Lre/d0$a;->m:Lue/c;

    return-void
.end method

.method public l(Ljava/lang/String;)Lre/d0$a;
    .locals 0

    iput-object p1, p0, Lre/d0$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public m(Lre/d0;)Lre/d0$a;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "networkResponse"

    invoke-virtual {p0, v0, p1}, Lre/d0$a;->f(Ljava/lang/String;Lre/d0;)V

    :cond_0
    iput-object p1, p0, Lre/d0$a;->h:Lre/d0;

    return-object p0
.end method

.method public n(Lre/d0;)Lre/d0$a;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lre/d0$a;->e(Lre/d0;)V

    :cond_0
    iput-object p1, p0, Lre/d0$a;->j:Lre/d0;

    return-object p0
.end method

.method public o(Lre/z;)Lre/d0$a;
    .locals 0

    iput-object p1, p0, Lre/d0$a;->b:Lre/z;

    return-object p0
.end method

.method public p(J)Lre/d0$a;
    .locals 0

    iput-wide p1, p0, Lre/d0$a;->l:J

    return-object p0
.end method

.method public q(Lre/b0;)Lre/d0$a;
    .locals 0

    iput-object p1, p0, Lre/d0$a;->a:Lre/b0;

    return-object p0
.end method

.method public r(J)Lre/d0$a;
    .locals 0

    iput-wide p1, p0, Lre/d0$a;->k:J

    return-object p0
.end method
