.class public final Lz3/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz3/b$c;,
        Lz3/b$b;
    }
.end annotation


# instance fields
.field public final a:Lp5/a0;

.field public final b:Lz3/b$c;

.field public c:I

.field public d:Lx3/m;

.field public e:Lz3/c;

.field public f:J

.field public g:[Lz3/e;

.field public h:J

.field public i:Lz3/e;

.field public j:I

.field public k:J

.field public l:J

.field public m:I

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp5/a0;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lp5/a0;-><init>(I)V

    iput-object v0, p0, Lz3/b;->a:Lp5/a0;

    new-instance v0, Lz3/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz3/b$c;-><init>(Lz3/b$a;)V

    iput-object v0, p0, Lz3/b;->b:Lz3/b$c;

    new-instance v0, Lx3/i;

    invoke-direct {v0}, Lx3/i;-><init>()V

    iput-object v0, p0, Lz3/b;->d:Lx3/m;

    const/4 v0, 0x0

    new-array v0, v0, [Lz3/e;

    iput-object v0, p0, Lz3/b;->g:[Lz3/e;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lz3/b;->k:J

    iput-wide v0, p0, Lz3/b;->l:J

    const/4 v0, -0x1

    iput v0, p0, Lz3/b;->j:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lz3/b;->f:J

    return-void
.end method

.method public static synthetic a(Lz3/b;)[Lz3/e;
    .locals 0

    iget-object p0, p0, Lz3/b;->g:[Lz3/e;

    return-object p0
.end method

.method public static d(Lx3/l;)V
    .locals 4

    invoke-interface {p0}, Lx3/l;->getPosition()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lx3/l;->m(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lz3/b;->c:I

    iput-object p1, p0, Lz3/b;->d:Lx3/m;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lz3/b;->h:J

    return-void
.end method

.method public c(JJ)V
    .locals 3

    const-wide/16 p3, -0x1

    iput-wide p3, p0, Lz3/b;->h:J

    const/4 p3, 0x0

    iput-object p3, p0, Lz3/b;->i:Lz3/e;

    iget-object p3, p0, Lz3/b;->g:[Lz3/e;

    array-length p4, p3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_0

    aget-object v2, p3, v1

    invoke-virtual {v2, p1, p2}, Lz3/e;->o(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-nez p1, :cond_2

    iget-object p1, p0, Lz3/b;->g:[Lz3/e;

    array-length p1, p1

    if-nez p1, :cond_1

    iput v0, p0, Lz3/b;->c:I

    goto :goto_1

    :cond_1
    const/4 p1, 0x3

    iput p1, p0, Lz3/b;->c:I

    :goto_1
    return-void

    :cond_2
    const/4 p1, 0x6

    iput p1, p0, Lz3/b;->c:I

    return-void
.end method

.method public final e(I)Lz3/e;
    .locals 5

    iget-object v0, p0, Lz3/b;->g:[Lz3/e;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lz3/e;->j(I)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(Lp5/a0;)V
    .locals 6

    const v0, 0x6c726468

    invoke-static {v0, p1}, Lz3/f;->c(ILp5/a0;)Lz3/f;

    move-result-object p1

    invoke-virtual {p1}, Lz3/f;->getType()I

    move-result v1

    const/4 v2, 0x0

    if-ne v1, v0, :cond_4

    const-class v0, Lz3/c;

    invoke-virtual {p1, v0}, Lz3/f;->b(Ljava/lang/Class;)Lz3/a;

    move-result-object v0

    check-cast v0, Lz3/c;

    if-eqz v0, :cond_3

    iput-object v0, p0, Lz3/b;->e:Lz3/c;

    iget v1, v0, Lz3/c;->c:I

    int-to-long v1, v1

    iget v0, v0, Lz3/c;->a:I

    int-to-long v3, v0

    mul-long/2addr v1, v3

    iput-wide v1, p0, Lz3/b;->f:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Lz3/f;->a:Li7/u;

    invoke-virtual {p1}, Li7/u;->j()Li7/d1;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz3/a;

    invoke-interface {v3}, Lz3/a;->getType()I

    move-result v4

    const v5, 0x6c727473

    if-ne v4, v5, :cond_0

    check-cast v3, Lz3/f;

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p0, v3, v2}, Lz3/b;->k(Lz3/f;I)Lz3/e;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    new-array p1, v1, [Lz3/e;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lz3/e;

    iput-object p1, p0, Lz3/b;->g:[Lz3/e;

    iget-object p1, p0, Lz3/b;->d:Lx3/m;

    invoke-interface {p1}, Lx3/m;->n()V

    return-void

    :cond_3
    const-string p1, "AviHeader not found"

    invoke-static {p1, v2}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected header list type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lz3/f;->getType()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 12

    invoke-virtual {p0, p1, p2}, Lz3/b;->m(Lx3/l;Lx3/y;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    iget p2, p0, Lz3/b;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x6

    const/4 v3, 0x4

    const/16 v4, 0xc

    const/4 v5, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p0, p1}, Lz3/b;->l(Lx3/l;)I

    move-result p1

    return p1

    :pswitch_1
    new-instance p2, Lp5/a0;

    iget v0, p0, Lz3/b;->m:I

    invoke-direct {p2, v0}, Lp5/a0;-><init>(I)V

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object v0

    iget v1, p0, Lz3/b;->m:I

    invoke-interface {p1, v0, v5, v1}, Lx3/l;->readFully([BII)V

    invoke-virtual {p0, p2}, Lz3/b;->i(Lp5/a0;)V

    iput v2, p0, Lz3/b;->c:I

    iget-wide p1, p0, Lz3/b;->k:J

    iput-wide p1, p0, Lz3/b;->h:J

    return v5

    :pswitch_2
    iget-object p2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    const/16 v0, 0x8

    invoke-interface {p1, p2, v5, v0}, Lx3/l;->readFully([BII)V

    iget-object p2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p2, v5}, Lp5/a0;->T(I)V

    iget-object p2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->t()I

    move-result p2

    iget-object v0, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->t()I

    move-result v0

    const v1, 0x31786469

    if-ne p2, v1, :cond_1

    const/4 p1, 0x5

    iput p1, p0, Lz3/b;->c:I

    iput v0, p0, Lz3/b;->m:I

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide p1

    int-to-long v0, v0

    add-long/2addr p1, v0

    iput-wide p1, p0, Lz3/b;->h:J

    :goto_0
    return v5

    :pswitch_3
    iget-wide v6, p0, Lz3/b;->k:J

    const-wide/16 v8, -0x1

    cmp-long p2, v6, v8

    if-eqz p2, :cond_2

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v6

    iget-wide v8, p0, Lz3/b;->k:J

    cmp-long p2, v6, v8

    if-eqz p2, :cond_2

    iput-wide v8, p0, Lz3/b;->h:J

    return v5

    :cond_2
    iget-object p2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    invoke-interface {p1, p2, v5, v4}, Lx3/l;->p([BII)V

    invoke-interface {p1}, Lx3/l;->l()V

    iget-object p2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p2, v5}, Lp5/a0;->T(I)V

    iget-object p2, p0, Lz3/b;->b:Lz3/b$c;

    iget-object v1, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p2, v1}, Lz3/b$c;->a(Lp5/a0;)V

    iget-object p2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->t()I

    move-result p2

    iget-object v1, p0, Lz3/b;->b:Lz3/b$c;

    iget v1, v1, Lz3/b$c;->a:I

    const v6, 0x46464952

    if-ne v1, v6, :cond_3

    invoke-interface {p1, v4}, Lx3/l;->m(I)V

    return v5

    :cond_3
    const v4, 0x5453494c

    const-wide/16 v6, 0x8

    if-ne v1, v4, :cond_7

    const v1, 0x69766f6d

    if-eq p2, v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v8

    iput-wide v8, p0, Lz3/b;->k:J

    iget-object p2, p0, Lz3/b;->b:Lz3/b$c;

    iget p2, p2, Lz3/b$c;->b:I

    int-to-long v10, p2

    add-long/2addr v8, v10

    add-long/2addr v8, v6

    iput-wide v8, p0, Lz3/b;->l:J

    iget-boolean p2, p0, Lz3/b;->n:Z

    if-nez p2, :cond_6

    iget-object p2, p0, Lz3/b;->e:Lz3/c;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lz3/c;

    invoke-virtual {p2}, Lz3/c;->a()Z

    move-result p2

    if-eqz p2, :cond_5

    iput v3, p0, Lz3/b;->c:I

    iget-wide p1, p0, Lz3/b;->l:J

    iput-wide p1, p0, Lz3/b;->h:J

    return v5

    :cond_5
    iget-object p2, p0, Lz3/b;->d:Lx3/m;

    new-instance v1, Lx3/z$b;

    iget-wide v3, p0, Lz3/b;->f:J

    invoke-direct {v1, v3, v4}, Lx3/z$b;-><init>(J)V

    invoke-interface {p2, v1}, Lx3/m;->j(Lx3/z;)V

    iput-boolean v0, p0, Lz3/b;->n:Z

    :cond_6
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide p1

    const-wide/16 v0, 0xc

    add-long/2addr p1, v0

    iput-wide p1, p0, Lz3/b;->h:J

    iput v2, p0, Lz3/b;->c:I

    return v5

    :cond_7
    :goto_1
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide p1

    iget-object v0, p0, Lz3/b;->b:Lz3/b$c;

    iget v0, v0, Lz3/b$c;->b:I

    int-to-long v0, v0

    add-long/2addr p1, v0

    add-long/2addr p1, v6

    iput-wide p1, p0, Lz3/b;->h:J

    return v5

    :pswitch_4
    iget p2, p0, Lz3/b;->j:I

    sub-int/2addr p2, v3

    new-instance v0, Lp5/a0;

    invoke-direct {v0, p2}, Lp5/a0;-><init>(I)V

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v1

    invoke-interface {p1, v1, v5, p2}, Lx3/l;->readFully([BII)V

    invoke-virtual {p0, v0}, Lz3/b;->f(Lp5/a0;)V

    const/4 p1, 0x3

    iput p1, p0, Lz3/b;->c:I

    return v5

    :pswitch_5
    iget-object p2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    invoke-interface {p1, p2, v5, v4}, Lx3/l;->readFully([BII)V

    iget-object p1, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p1, v5}, Lp5/a0;->T(I)V

    iget-object p1, p0, Lz3/b;->b:Lz3/b$c;

    iget-object p2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p1, p2}, Lz3/b$c;->b(Lp5/a0;)V

    iget-object p1, p0, Lz3/b;->b:Lz3/b$c;

    iget p2, p1, Lz3/b$c;->c:I

    const v0, 0x6c726468

    if-ne p2, v0, :cond_8

    iget p1, p1, Lz3/b$c;->b:I

    iput p1, p0, Lz3/b;->j:I

    const/4 p1, 0x2

    iput p1, p0, Lz3/b;->c:I

    return v5

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "hdrl expected, found: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lz3/b;->b:Lz3/b$c;

    iget p2, p2, Lz3/b$c;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1

    :pswitch_6
    invoke-virtual {p0, p1}, Lz3/b;->h(Lx3/l;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1, v4}, Lx3/l;->m(I)V

    iput v0, p0, Lz3/b;->c:I

    return v5

    :cond_9
    const-string p1, "AVI Header List not found"

    invoke-static {p1, v1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lx3/l;)Z
    .locals 3

    iget-object v0, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-interface {p1, v0, v1, v2}, Lx3/l;->p([BII)V

    iget-object p1, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p1, v1}, Lp5/a0;->T(I)V

    iget-object p1, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result p1

    const v0, 0x46464952

    if-eq p1, v0, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lz3/b;->a:Lp5/a0;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lp5/a0;->U(I)V

    iget-object p1, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result p1

    const v0, 0x20495641

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final i(Lp5/a0;)V
    .locals 7

    invoke-virtual {p0, p1}, Lz3/b;->j(Lp5/a0;)J

    move-result-wide v0

    :goto_0
    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v2

    const/16 v3, 0x10

    if-lt v2, v3, :cond_2

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result v2

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result v4

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v5, v0

    invoke-virtual {p1}, Lp5/a0;->t()I

    invoke-virtual {p0, v2}, Lz3/b;->e(I)Lz3/e;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    and-int/2addr v4, v3

    if-ne v4, v3, :cond_1

    invoke-virtual {v2, v5, v6}, Lz3/e;->b(J)V

    :cond_1
    invoke-virtual {v2}, Lz3/e;->k()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lz3/b;->g:[Lz3/e;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lz3/e;->c()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    iput-boolean p1, p0, Lz3/b;->n:Z

    iget-object p1, p0, Lz3/b;->d:Lx3/m;

    new-instance v0, Lz3/b$b;

    iget-wide v1, p0, Lz3/b;->f:J

    invoke-direct {v0, p0, v1, v2}, Lz3/b$b;-><init>(Lz3/b;J)V

    invoke-interface {p1, v0}, Lx3/m;->j(Lx3/z;)V

    return-void
.end method

.method public final j(Lp5/a0;)J
    .locals 7

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    const-wide/16 v1, 0x0

    const/16 v3, 0x10

    if-ge v0, v3, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v0

    const/16 v3, 0x8

    invoke-virtual {p1, v3}, Lp5/a0;->U(I)V

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result v3

    int-to-long v3, v3

    iget-wide v5, p0, Lz3/b;->k:J

    cmp-long v3, v3, v5

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x8

    add-long/2addr v1, v5

    :goto_0
    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    return-wide v1
.end method

.method public final k(Lz3/f;I)Lz3/e;
    .locals 13

    const-class v0, Lz3/d;

    invoke-virtual {p1, v0}, Lz3/f;->b(Ljava/lang/Class;)Lz3/a;

    move-result-object v0

    check-cast v0, Lz3/d;

    const-class v1, Lz3/g;

    invoke-virtual {p1, v1}, Lz3/f;->b(Ljava/lang/Class;)Lz3/a;

    move-result-object v1

    check-cast v1, Lz3/g;

    const-string v2, "AviExtractor"

    const/4 v3, 0x0

    if-nez v0, :cond_0

    const-string p1, "Missing Stream Header"

    :goto_0
    invoke-static {v2, p1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_0
    if-nez v1, :cond_1

    const-string p1, "Missing Stream Format"

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lz3/d;->a()J

    move-result-wide v11

    iget-object v1, v1, Lz3/g;->a:Ls3/m1;

    invoke-virtual {v1}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v2

    invoke-virtual {v2, p2}, Ls3/m1$b;->T(I)Ls3/m1$b;

    iget v4, v0, Lz3/d;->f:I

    if-eqz v4, :cond_2

    invoke-virtual {v2, v4}, Ls3/m1$b;->Y(I)Ls3/m1$b;

    :cond_2
    const-class v4, Lz3/h;

    invoke-virtual {p1, v4}, Lz3/f;->b(Ljava/lang/Class;)Lz3/a;

    move-result-object p1

    check-cast p1, Lz3/h;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lz3/h;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ls3/m1$b;->W(Ljava/lang/String;)Ls3/m1$b;

    :cond_3
    iget-object p1, v1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {p1}, Lp5/v;->k(Ljava/lang/String;)I

    move-result v6

    const/4 p1, 0x1

    if-eq v6, p1, :cond_5

    const/4 p1, 0x2

    if-ne v6, p1, :cond_4

    goto :goto_1

    :cond_4
    return-object v3

    :cond_5
    :goto_1
    iget-object p1, p0, Lz3/b;->d:Lx3/m;

    invoke-interface {p1, p2, v6}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v10

    invoke-virtual {v2}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p1

    invoke-interface {v10, p1}, Lx3/b0;->b(Ls3/m1;)V

    new-instance p1, Lz3/e;

    iget v9, v0, Lz3/d;->e:I

    move-object v4, p1

    move v5, p2

    move-wide v7, v11

    invoke-direct/range {v4 .. v10}, Lz3/e;-><init>(IIJILx3/b0;)V

    iput-wide v11, p0, Lz3/b;->f:J

    return-object p1
.end method

.method public final l(Lx3/l;)I
    .locals 7

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Lz3/b;->l:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lz3/b;->i:Lz3/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lz3/e;->m(Lx3/l;)Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    iput-object p1, p0, Lz3/b;->i:Lz3/e;

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lz3/b;->d(Lx3/l;)V

    iget-object v0, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/16 v2, 0xc

    invoke-interface {p1, v0, v1, v2}, Lx3/l;->p([BII)V

    iget-object v0, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    iget-object v0, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->t()I

    move-result v0

    const v3, 0x5453494c

    const/16 v4, 0x8

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {v0, v4}, Lp5/a0;->T(I)V

    iget-object v0, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->t()I

    move-result v0

    const v3, 0x69766f6d

    if-ne v0, v3, :cond_2

    goto :goto_0

    :cond_2
    move v2, v4

    :goto_0
    invoke-interface {p1, v2}, Lx3/l;->m(I)V

    invoke-interface {p1}, Lx3/l;->l()V

    return v1

    :cond_3
    iget-object v2, p0, Lz3/b;->a:Lp5/a0;

    invoke-virtual {v2}, Lp5/a0;->t()I

    move-result v2

    const v3, 0x4b4e554a    # 1.352225E7f

    if-ne v0, v3, :cond_4

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v3

    int-to-long v5, v2

    add-long/2addr v3, v5

    const-wide/16 v5, 0x8

    add-long/2addr v3, v5

    iput-wide v3, p0, Lz3/b;->h:J

    return v1

    :cond_4
    invoke-interface {p1, v4}, Lx3/l;->m(I)V

    invoke-interface {p1}, Lx3/l;->l()V

    invoke-virtual {p0, v0}, Lz3/b;->e(I)Lz3/e;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v3

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Lz3/b;->h:J

    return v1

    :cond_5
    invoke-virtual {v0, v2}, Lz3/e;->n(I)V

    iput-object v0, p0, Lz3/b;->i:Lz3/e;

    :cond_6
    :goto_1
    return v1
.end method

.method public final m(Lx3/l;Lx3/y;)Z
    .locals 8

    iget-wide v0, p0, Lz3/b;->h:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    iget-wide v4, p0, Lz3/b;->h:J

    cmp-long v6, v4, v0

    if-ltz v6, :cond_1

    const-wide/32 v6, 0x40000

    add-long/2addr v6, v0

    cmp-long v6, v4, v6

    if-lez v6, :cond_0

    goto :goto_0

    :cond_0
    sub-long/2addr v4, v0

    long-to-int p2, v4

    invoke-interface {p1, p2}, Lx3/l;->m(I)V

    goto :goto_1

    :cond_1
    :goto_0
    iput-wide v4, p2, Lx3/y;->a:J

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x0

    :goto_2
    iput-wide v2, p0, Lz3/b;->h:J

    return p1
.end method

.method public release()V
    .locals 0

    return-void
.end method
