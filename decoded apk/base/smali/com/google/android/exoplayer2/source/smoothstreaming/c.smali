.class public final Lcom/google/android/exoplayer2/source/smoothstreaming/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/r;
.implements Lu4/n0$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu4/r;",
        "Lu4/n0$a<",
        "Lw4/i<",
        "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final h:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

.field public final i:Lo5/m0;

.field public final j:Lo5/f0;

.field public final k:Lw3/v;

.field public final l:Lw3/u$a;

.field public final m:Lo5/d0;

.field public final n:Lu4/a0$a;

.field public final o:Lo5/b;

.field public final p:Lu4/u0;

.field public final q:Lu4/h;

.field public r:Lu4/r$a;

.field public s:Lc5/a;

.field public t:[Lw4/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation
.end field

.field public u:Lu4/n0;


# direct methods
.method public constructor <init>(Lc5/a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lo5/m0;Lu4/h;Lw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;Lo5/f0;Lo5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->s:Lc5/a;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->h:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->i:Lo5/m0;

    iput-object p9, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->j:Lo5/f0;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->k:Lw3/v;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->l:Lw3/u$a;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->m:Lo5/d0;

    iput-object p8, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->n:Lu4/a0$a;

    iput-object p10, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->o:Lo5/b;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->q:Lu4/h;

    invoke-static {p1, p5}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->n(Lc5/a;Lw3/v;)Lu4/u0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->p:Lu4/u0;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->o(I)[Lw4/i;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:[Lw4/i;

    invoke-interface {p4, p1}, Lu4/h;->a([Lu4/n0;)Lu4/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lu4/n0;

    return-void
.end method

.method public static n(Lc5/a;Lw3/v;)Lu4/u0;
    .locals 8

    iget-object v0, p0, Lc5/a;->f:[Lc5/a$b;

    array-length v0, v0

    new-array v0, v0, [Lu4/s0;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lc5/a;->f:[Lc5/a$b;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    aget-object v3, v3, v2

    iget-object v3, v3, Lc5/a$b;->j:[Ls3/m1;

    array-length v4, v3

    new-array v4, v4, [Ls3/m1;

    move v5, v1

    :goto_1
    array-length v6, v3

    if-ge v5, v6, :cond_0

    aget-object v6, v3, v5

    invoke-interface {p1, v6}, Lw3/v;->e(Ls3/m1;)I

    move-result v7

    invoke-virtual {v6, v7}, Ls3/m1;->c(I)Ls3/m1;

    move-result-object v6

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    new-instance v3, Lu4/s0;

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lu4/u0;

    invoke-direct {p0, v0}, Lu4/u0;-><init>([Lu4/s0;)V

    return-object p0
.end method

.method public static o(I)[Lw4/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation

    new-array p0, p0, [Lw4/i;

    return-object p0
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lu4/n0;

    invoke-interface {v0}, Lu4/n0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(J)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lu4/n0;

    invoke-interface {v0, p1, p2}, Lu4/n0;->c(J)Z

    move-result p1

    return p1
.end method

.method public d(JLs3/m3;)J
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lw4/i;->h:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    invoke-virtual {v3, p1, p2, p3}, Lw4/i;->d(JLs3/m3;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-wide p1
.end method

.method public bridge synthetic e(Lu4/n0;)V
    .locals 0

    check-cast p1, Lw4/i;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r(Lw4/i;)V

    return-void
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lu4/n0;

    invoke-interface {v0}, Lu4/n0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lu4/n0;

    invoke-interface {v0, p1, p2}, Lu4/n0;->g(J)V

    return-void
.end method

.method public final h(Ln5/s;J)Lw4/i;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln5/s;",
            "J)",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation

    move-object v13, p0

    iget-object v0, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->p:Lu4/u0;

    invoke-interface/range {p1 .. p1}, Ln5/v;->b()Lu4/s0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu4/u0;->c(Lu4/s0;)I

    move-result v0

    iget-object v2, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->h:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iget-object v3, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->j:Lo5/f0;

    iget-object v4, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->s:Lc5/a;

    iget-object v7, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->i:Lo5/m0;

    move v5, v0

    move-object/from16 v6, p1

    invoke-interface/range {v2 .. v7}, Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;->a(Lo5/f0;Lc5/a;ILn5/s;Lo5/m0;)Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    move-result-object v4

    new-instance v14, Lw4/i;

    iget-object v1, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->s:Lc5/a;

    iget-object v1, v1, Lc5/a;->f:[Lc5/a$b;

    aget-object v0, v1, v0

    iget v1, v0, Lc5/a$b;->a:I

    iget-object v6, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->o:Lo5/b;

    iget-object v9, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->k:Lw3/v;

    iget-object v10, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->l:Lw3/u$a;

    iget-object v11, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->m:Lo5/d0;

    iget-object v12, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->n:Lu4/a0$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v14

    move-object v5, p0

    move-wide/from16 v7, p2

    invoke-direct/range {v0 .. v12}, Lw4/i;-><init>(I[I[Ls3/m1;Lw4/j;Lu4/n0$a;Lo5/b;JLw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;)V

    return-object v14
.end method

.method public i(Lu4/r$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lu4/r$a;

    invoke-interface {p1, p0}, Lu4/r$a;->k(Lu4/r;)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lu4/n0;

    invoke-interface {v0}, Lu4/n0;->isLoading()Z

    move-result v0

    return v0
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->j:Lo5/f0;

    invoke-interface {v0}, Lo5/f0;->a()V

    return-void
.end method

.method public m(J)J
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lw4/i;->R(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide p1
.end method

.method public p()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public q([Ln5/s;[Z[Lu4/m0;[ZJ)J
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_4

    aget-object v2, p3, v1

    if-eqz v2, :cond_2

    aget-object v2, p3, v1

    check-cast v2, Lw4/i;

    aget-object v3, p1, v1

    if-eqz v3, :cond_1

    aget-boolean v3, p2, v1

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lw4/i;->D()Lw4/j;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    aget-object v4, p1, v1

    invoke-interface {v3, v4}, Lcom/google/android/exoplayer2/source/smoothstreaming/b;->b(Ln5/s;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v2}, Lw4/i;->O()V

    const/4 v2, 0x0

    aput-object v2, p3, v1

    :cond_2
    :goto_2
    aget-object v2, p3, v1

    if-nez v2, :cond_3

    aget-object v2, p1, v1

    if-eqz v2, :cond_3

    aget-object v2, p1, v1

    invoke-virtual {p0, v2, p5, p6}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->h(Ln5/s;J)Lw4/i;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    aput-object v2, p3, v1

    const/4 v2, 0x1

    aput-boolean v2, p4, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->o(I)[Lw4/i;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:[Lw4/i;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->q:Lu4/h;

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:[Lw4/i;

    invoke-interface {p1, p2}, Lu4/h;->a([Lu4/n0;)Lu4/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lu4/n0;

    return-wide p5
.end method

.method public r(Lw4/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lu4/r$a;

    invoke-interface {p1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    return-void
.end method

.method public s()Lu4/u0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->p:Lu4/u0;

    return-object v0
.end method

.method public t(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Lw4/i;->t(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public u()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lw4/i;->O()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lu4/r$a;

    return-void
.end method

.method public v(Lc5/a;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->s:Lc5/a;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lw4/i;->D()Lw4/j;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    invoke-interface {v3, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/b;->c(Lc5/a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lu4/r$a;

    invoke-interface {p1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    return-void
.end method
