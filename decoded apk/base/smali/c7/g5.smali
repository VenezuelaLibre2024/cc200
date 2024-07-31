.class public final Lc7/g5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:J

.field public B:Ljava/lang/String;

.field public C:J

.field public D:J

.field public E:J

.field public F:J

.field public G:J

.field public H:J

.field public I:Ljava/lang/String;

.field public J:Z

.field public K:J

.field public L:J

.field public final a:Lc7/k6;

.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:J

.field public h:J

.field public i:J

.field public j:Ljava/lang/String;

.field public k:J

.field public l:Ljava/lang/String;

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/Boolean;

.field public s:J

.field public t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public u:Ljava/lang/String;

.field public v:Z

.field public w:J

.field public x:J

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(Lc7/k6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lc7/g5;->a:Lc7/k6;

    iput-object p2, p0, Lc7/g5;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object p1

    invoke-virtual {p1}, Lc7/j7;->i()V

    return-void
.end method


# virtual methods
.method public final A()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->k:J

    return-wide v0
.end method

.method public final B(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->K:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->K:J

    return-void
.end method

.method public final C(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->l:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->l:Ljava/lang/String;

    return-void
.end method

.method public final D(Z)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-boolean v1, p0, Lc7/g5;->v:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-boolean p1, p0, Lc7/g5;->v:Z

    return-void
.end method

.method public final E()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->A:J

    return-wide v0
.end method

.method public final F(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->F:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->F:J

    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->j:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->j:Ljava/lang/String;

    return-void
.end method

.method public final H(Z)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-boolean v1, p0, Lc7/g5;->z:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-boolean p1, p0, Lc7/g5;->z:Z

    return-void
.end method

.method public final I()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->K:J

    return-wide v0
.end method

.method public final J(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->G:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->G:J

    return-void
.end method

.method public final K(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->f:Ljava/lang/String;

    return-void
.end method

.method public final L()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->F:J

    return-wide v0
.end method

.method public final M(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->E:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->E:J

    return-void
.end method

.method public final N(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->d:Ljava/lang/String;

    return-void
.end method

.method public final O()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->G:J

    return-wide v0
.end method

.method public final P(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->D:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->D:J

    return-void
.end method

.method public final Q(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->I:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->I:Ljava/lang/String;

    return-void
.end method

.method public final R()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->E:J

    return-wide v0
.end method

.method public final S(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->H:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->H:J

    return-void
.end method

.method public final T(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->e:Ljava/lang/String;

    return-void
.end method

.method public final U()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->D:J

    return-wide v0
.end method

.method public final V(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->C:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->C:J

    return-void
.end method

.method public final W(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->u:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->u:Ljava/lang/String;

    return-void
.end method

.method public final X()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->H:J

    return-wide v0
.end method

.method public final Y(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->n:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->n:J

    return-void
.end method

.method public final Z(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->B:Ljava/lang/String;

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->B:Ljava/lang/String;

    return-void
.end method

.method public final a()I
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget v0, p0, Lc7/g5;->y:I

    return v0
.end method

.method public final a0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->C:J

    return-wide v0
.end method

.method public final b(I)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget v1, p0, Lc7/g5;->y:I

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput p1, p0, Lc7/g5;->y:I

    return-void
.end method

.method public final b0(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->s:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->s:J

    return-void
.end method

.method public final c(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->k:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->k:J

    return-void
.end method

.method public final c0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->n:J

    return-wide v0
.end method

.method public final d(Ljava/lang/Boolean;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->r:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->r:Ljava/lang/Boolean;

    return-void
.end method

.method public final d0(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->L:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->L:J

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->q:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->q:Ljava/lang/String;

    return-void
.end method

.method public final e0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->s:J

    return-wide v0
.end method

.method public final f(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->t:Ljava/util/List;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lc7/g5;->t:Ljava/util/List;

    :cond_1
    return-void
.end method

.method public final f0(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->m:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->m:J

    return-void
.end method

.method public final g(Z)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-boolean v1, p0, Lc7/g5;->p:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-boolean p1, p0, Lc7/g5;->p:Z

    return-void
.end method

.method public final g0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->L:J

    return-wide v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final h0(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->i:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->i:J

    return-void
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final i0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->m:J

    return-wide v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final j0(J)V
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lh6/s;->a(Z)V

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v3, p0, Lc7/g5;->g:J

    cmp-long v3, v3, p1

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->g:J

    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->I:Ljava/lang/String;

    return-object v0
.end method

.method public final k0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->i:J

    return-wide v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final l0(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->h:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->h:J

    return-void
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->u:Ljava/lang/String;

    return-object v0
.end method

.method public final m0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->g:J

    return-wide v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->B:Ljava/lang/String;

    return-object v0
.end method

.method public final n0(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->x:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->x:J

    return-void
.end method

.method public final o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->t:Ljava/util/List;

    return-object v0
.end method

.method public final o0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->h:J

    return-wide v0
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc7/g5;->J:Z

    return-void
.end method

.method public final p0(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->w:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->w:J

    return-void
.end method

.method public final q()V
    .locals 4

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->g:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    iget-object v1, p0, Lc7/g5;->b:Ljava/lang/String;

    invoke-static {v1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Bundle index overflow. appId"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lc7/g5;->J:Z

    iput-wide v0, p0, Lc7/g5;->g:J

    return-void
.end method

.method public final q0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->x:J

    return-wide v0
.end method

.method public final r()Z
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->p:Z

    return v0
.end method

.method public final r0()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-wide v0, p0, Lc7/g5;->w:J

    return-wide v0
.end method

.method public final s()Z
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->o:Z

    return v0
.end method

.method public final s0()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->r:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    return v0
.end method

.method public final t0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->v:Z

    return v0
.end method

.method public final u0()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->I:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lc7/g5;->Q(Ljava/lang/String;)V

    return-object v0
.end method

.method public final v()Z
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->z:Z

    return v0
.end method

.method public final v0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final w()J
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final w0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final x(J)V
    .locals 3

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-wide v1, p0, Lc7/g5;->A:J

    cmp-long v1, v1, p1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-wide p1, p0, Lc7/g5;->A:J

    return-void
.end method

.method public final x0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/g5;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final y(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-object v1, p0, Lc7/g5;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-object p1, p0, Lc7/g5;->c:Ljava/lang/String;

    return-void
.end method

.method public final z(Z)V
    .locals 2

    iget-object v0, p0, Lc7/g5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/g5;->J:Z

    iget-boolean v1, p0, Lc7/g5;->o:Z

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lc7/g5;->J:Z

    iput-boolean p1, p0, Lc7/g5;->o:Z

    return-void
.end method
