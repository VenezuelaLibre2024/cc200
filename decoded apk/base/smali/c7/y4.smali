.class public final Lc7/y4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lc7/v4;


# direct methods
.method public constructor <init>(Lc7/v4;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput p2, p0, Lc7/y4;->h:I

    iput-object p3, p0, Lc7/y4;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/y4;->j:Ljava/lang/Object;

    iput-object p5, p0, Lc7/y4;->k:Ljava/lang/Object;

    iput-object p6, p0, Lc7/y4;->l:Ljava/lang/Object;

    iput-object p1, p0, Lc7/y4;->m:Lc7/v4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lc7/y4;->m:Lc7/v4;

    iget-object v0, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i7;->n()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lc7/y4;->m:Lc7/v4;

    const/4 v1, 0x6

    const-string v2, "Persisted config not initialized. Not logging error/warn"

    invoke-virtual {v0, v1, v2}, Lc7/v4;->t(ILjava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lc7/y4;->m:Lc7/v4;

    invoke-static {v1}, Lc7/v4;->p(Lc7/v4;)C

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lc7/y4;->m:Lc7/v4;

    invoke-virtual {v1}, Lc7/j7;->a()Lc7/h;

    move-result-object v1

    invoke-virtual {v1}, Lc7/h;->P()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc7/y4;->m:Lc7/v4;

    const/16 v2, 0x43

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lc7/y4;->m:Lc7/v4;

    const/16 v2, 0x63

    :goto_0
    invoke-static {v1, v2}, Lc7/v4;->v(Lc7/v4;C)V

    :cond_2
    iget-object v1, p0, Lc7/y4;->m:Lc7/v4;

    invoke-static {v1}, Lc7/v4;->y(Lc7/v4;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gez v1, :cond_3

    iget-object v1, p0, Lc7/y4;->m:Lc7/v4;

    const-wide/32 v2, 0x14822

    invoke-static {v1, v2, v3}, Lc7/v4;->w(Lc7/v4;J)V

    :cond_3
    iget v1, p0, Lc7/y4;->h:I

    const-string v2, "01VDIWEA?"

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    iget-object v2, p0, Lc7/y4;->m:Lc7/v4;

    invoke-static {v2}, Lc7/v4;->p(Lc7/v4;)C

    move-result v2

    iget-object v3, p0, Lc7/y4;->m:Lc7/v4;

    invoke-static {v3}, Lc7/v4;->y(Lc7/v4;)J

    move-result-wide v3

    const/4 v5, 0x1

    iget-object v6, p0, Lc7/y4;->i:Ljava/lang/String;

    iget-object v7, p0, Lc7/y4;->j:Ljava/lang/Object;

    iget-object v8, p0, Lc7/y4;->k:Ljava/lang/Object;

    iget-object v9, p0, Lc7/y4;->l:Ljava/lang/Object;

    invoke-static {v5, v6, v7, v8, v9}, Lc7/v4;->s(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "2"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x400

    if-le v2, v3, :cond_4

    iget-object v1, p0, Lc7/y4;->i:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_4
    iget-object v0, v0, Lc7/i5;->f:Lc7/m5;

    if-eqz v0, :cond_5

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lc7/m5;->b(Ljava/lang/String;J)V

    :cond_5
    return-void
.end method
