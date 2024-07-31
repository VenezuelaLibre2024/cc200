.class public final Lre/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lre/d0$a;
    }
.end annotation


# instance fields
.field public final h:Lre/b0;

.field public final i:Lre/z;

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:Lre/t;

.field public final m:Lre/u;

.field public final n:Lre/e0;

.field public final o:Lre/d0;

.field public final p:Lre/d0;

.field public final q:Lre/d0;

.field public final r:J

.field public final s:J

.field public final t:Lue/c;

.field public volatile u:Lre/d;


# direct methods
.method public constructor <init>(Lre/d0$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lre/d0$a;->a:Lre/b0;

    iput-object v0, p0, Lre/d0;->h:Lre/b0;

    iget-object v0, p1, Lre/d0$a;->b:Lre/z;

    iput-object v0, p0, Lre/d0;->i:Lre/z;

    iget v0, p1, Lre/d0$a;->c:I

    iput v0, p0, Lre/d0;->j:I

    iget-object v0, p1, Lre/d0$a;->d:Ljava/lang/String;

    iput-object v0, p0, Lre/d0;->k:Ljava/lang/String;

    iget-object v0, p1, Lre/d0$a;->e:Lre/t;

    iput-object v0, p0, Lre/d0;->l:Lre/t;

    iget-object v0, p1, Lre/d0$a;->f:Lre/u$a;

    invoke-virtual {v0}, Lre/u$a;->d()Lre/u;

    move-result-object v0

    iput-object v0, p0, Lre/d0;->m:Lre/u;

    iget-object v0, p1, Lre/d0$a;->g:Lre/e0;

    iput-object v0, p0, Lre/d0;->n:Lre/e0;

    iget-object v0, p1, Lre/d0$a;->h:Lre/d0;

    iput-object v0, p0, Lre/d0;->o:Lre/d0;

    iget-object v0, p1, Lre/d0$a;->i:Lre/d0;

    iput-object v0, p0, Lre/d0;->p:Lre/d0;

    iget-object v0, p1, Lre/d0$a;->j:Lre/d0;

    iput-object v0, p0, Lre/d0;->q:Lre/d0;

    iget-wide v0, p1, Lre/d0$a;->k:J

    iput-wide v0, p0, Lre/d0;->r:J

    iget-wide v0, p1, Lre/d0$a;->l:J

    iput-wide v0, p0, Lre/d0;->s:J

    iget-object p1, p1, Lre/d0$a;->m:Lue/c;

    iput-object p1, p0, Lre/d0;->t:Lue/c;

    return-void
.end method


# virtual methods
.method public E()Lre/d0;
    .locals 1

    iget-object v0, p0, Lre/d0;->q:Lre/d0;

    return-object v0
.end method

.method public I()J
    .locals 2

    iget-wide v0, p0, Lre/d0;->s:J

    return-wide v0
.end method

.method public K()Lre/b0;
    .locals 1

    iget-object v0, p0, Lre/d0;->h:Lre/b0;

    return-object v0
.end method

.method public P()J
    .locals 2

    iget-wide v0, p0, Lre/d0;->r:J

    return-wide v0
.end method

.method public a()Lre/e0;
    .locals 1

    iget-object v0, p0, Lre/d0;->n:Lre/e0;

    return-object v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lre/d0;->n:Lre/e0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lre/e0;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Lre/d;
    .locals 1

    iget-object v0, p0, Lre/d0;->u:Lre/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lre/d0;->m:Lre/u;

    invoke-static {v0}, Lre/d;->k(Lre/u;)Lre/d;

    move-result-object v0

    iput-object v0, p0, Lre/d0;->u:Lre/d;

    :goto_0
    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lre/d0;->j:I

    return v0
.end method

.method public j()Lre/t;
    .locals 1

    iget-object v0, p0, Lre/d0;->l:Lre/t;

    return-object v0
.end method

.method public l(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lre/d0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lre/d0;->m:Lre/u;

    invoke-virtual {v0, p1}, Lre/u;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object p2, p1

    :cond_0
    return-object p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre/d0;->i:Lre/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lre/d0;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre/d0;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre/d0;->h:Lre/b0;

    invoke-virtual {v1}, Lre/b0;->h()Lre/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Lre/u;
    .locals 1

    iget-object v0, p0, Lre/d0;->m:Lre/u;

    return-object v0
.end method

.method public x()Lre/d0$a;
    .locals 1

    new-instance v0, Lre/d0$a;

    invoke-direct {v0, p0}, Lre/d0$a;-><init>(Lre/d0;)V

    return-object v0
.end method
