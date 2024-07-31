.class public final Li4/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li4/b$a;,
        Li4/b$c;,
        Li4/b$b;
    }
.end annotation


# static fields
.field public static final h:Lx3/p;


# instance fields
.field public a:Lx3/m;

.field public b:Lx3/b0;

.field public c:I

.field public d:J

.field public e:Li4/b$b;

.field public f:I

.field public g:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Li4/a;->b:Li4/a;

    sput-object v0, Li4/b;->h:Lx3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Li4/b;->c:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Li4/b;->d:J

    const/4 v2, -0x1

    iput v2, p0, Li4/b;->f:I

    iput-wide v0, p0, Li4/b;->g:J

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, Li4/b;->e()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Li4/b;

    invoke-direct {v1}, Li4/b;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 2

    iput-object p1, p0, Li4/b;->a:Lx3/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iput-object v0, p0, Li4/b;->b:Lx3/b0;

    invoke-interface {p1}, Lx3/m;->n()V

    return-void
.end method

.method public c(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    iput p1, p0, Li4/b;->c:I

    iget-object p1, p0, Li4/b;->e:Li4/b$b;

    if-eqz p1, :cond_1

    invoke-interface {p1, p3, p4}, Li4/b$b;->a(J)V

    :cond_1
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Li4/b;->b:Lx3/b0;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li4/b;->a:Lx3/m;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f(Lx3/l;)V
    .locals 6

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget v0, p0, Li4/b;->f:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    invoke-interface {p1, v0}, Lx3/l;->m(I)V

    const/4 p1, 0x4

    iput p1, p0, Li4/b;->c:I

    return-void

    :cond_1
    invoke-static {p1}, Li4/d;->a(Lx3/l;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v2

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v0, v2

    invoke-interface {p1, v0}, Lx3/l;->m(I)V

    iput v1, p0, Li4/b;->c:I

    return-void

    :cond_2
    const/4 p1, 0x0

    const-string v0, "Unsupported or unrecognized wav file type."

    invoke-static {v0, p1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 2

    invoke-virtual {p0}, Li4/b;->d()V

    iget p2, p0, Li4/b;->c:I

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    const/4 v1, 0x1

    if-eq p2, v1, :cond_3

    const/4 v1, 0x2

    if-eq p2, v1, :cond_2

    const/4 v1, 0x3

    if-eq p2, v1, :cond_1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Li4/b;->k(Lx3/l;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p1}, Li4/b;->l(Lx3/l;)V

    return v0

    :cond_2
    invoke-virtual {p0, p1}, Li4/b;->i(Lx3/l;)V

    return v0

    :cond_3
    invoke-virtual {p0, p1}, Li4/b;->j(Lx3/l;)V

    return v0

    :cond_4
    invoke-virtual {p0, p1}, Li4/b;->f(Lx3/l;)V

    return v0
.end method

.method public h(Lx3/l;)Z
    .locals 0

    invoke-static {p1}, Li4/d;->a(Lx3/l;)Z

    move-result p1

    return p1
.end method

.method public final i(Lx3/l;)V
    .locals 6

    invoke-static {p1}, Li4/d;->b(Lx3/l;)Li4/c;

    move-result-object v3

    iget p1, v3, Li4/c;->a:I

    const/16 v0, 0x11

    if-ne p1, v0, :cond_0

    new-instance p1, Li4/b$a;

    iget-object v0, p0, Li4/b;->a:Lx3/m;

    iget-object v1, p0, Li4/b;->b:Lx3/b0;

    invoke-direct {p1, v0, v1, v3}, Li4/b$a;-><init>(Lx3/m;Lx3/b0;Li4/c;)V

    :goto_0
    iput-object p1, p0, Li4/b;->e:Li4/b$b;

    goto :goto_1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    new-instance p1, Li4/b$c;

    iget-object v1, p0, Li4/b;->a:Lx3/m;

    iget-object v2, p0, Li4/b;->b:Lx3/b0;

    const/4 v5, -0x1

    const-string v4, "audio/g711-alaw"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Li4/b$c;-><init>(Lx3/m;Lx3/b0;Li4/c;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x7

    if-ne p1, v0, :cond_2

    new-instance p1, Li4/b$c;

    iget-object v1, p0, Li4/b;->a:Lx3/m;

    iget-object v2, p0, Li4/b;->b:Lx3/b0;

    const/4 v5, -0x1

    const-string v4, "audio/g711-mlaw"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Li4/b$c;-><init>(Lx3/m;Lx3/b0;Li4/c;Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    iget v0, v3, Li4/c;->f:I

    invoke-static {p1, v0}, Lu3/m0;->a(II)I

    move-result v5

    if-eqz v5, :cond_3

    new-instance p1, Li4/b$c;

    iget-object v1, p0, Li4/b;->a:Lx3/m;

    iget-object v2, p0, Li4/b;->b:Lx3/b0;

    const-string v4, "audio/raw"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Li4/b$c;-><init>(Lx3/m;Lx3/b0;Li4/c;Ljava/lang/String;I)V

    goto :goto_0

    :goto_1
    const/4 p1, 0x3

    iput p1, p0, Li4/b;->c:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported WAV format type: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v3, Li4/c;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object p1

    throw p1
.end method

.method public final j(Lx3/l;)V
    .locals 2

    invoke-static {p1}, Li4/d;->c(Lx3/l;)J

    move-result-wide v0

    iput-wide v0, p0, Li4/b;->d:J

    const/4 p1, 0x2

    iput p1, p0, Li4/b;->c:I

    return-void
.end method

.method public final k(Lx3/l;)I
    .locals 6

    iget-wide v0, p0, Li4/b;->g:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-wide v2, p0, Li4/b;->g:J

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v0, p0, Li4/b;->e:Li4/b$b;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li4/b$b;

    invoke-interface {v0, p1, v2, v3}, Li4/b$b;->c(Lx3/l;J)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, -0x1

    :cond_1
    return v1
.end method

.method public final l(Lx3/l;)V
    .locals 8

    invoke-static {p1}, Li4/d;->e(Lx3/l;)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    iput v1, p0, Li4/b;->f:I

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-wide v2, p0, Li4/b;->d:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const-wide v6, 0xffffffffL

    cmp-long v6, v0, v6

    if-nez v6, :cond_0

    move-wide v0, v2

    :cond_0
    iget v2, p0, Li4/b;->f:I

    int-to-long v2, v2

    add-long/2addr v2, v0

    iput-wide v2, p0, Li4/b;->g:J

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v0

    cmp-long p1, v0, v4

    if-eqz p1, :cond_1

    iget-wide v2, p0, Li4/b;->g:J

    cmp-long p1, v2, v0

    if-lez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Data exceeds input length: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Li4/b;->g:J

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "WavExtractor"

    invoke-static {v2, p1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    iput-wide v0, p0, Li4/b;->g:J

    :cond_1
    iget-object p1, p0, Li4/b;->e:Li4/b$b;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li4/b$b;

    iget v0, p0, Li4/b;->f:I

    iget-wide v1, p0, Li4/b;->g:J

    invoke-interface {p1, v0, v1, v2}, Li4/b$b;->b(IJ)V

    const/4 p1, 0x4

    iput p1, p0, Li4/b;->c:I

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method
