.class public final Lz4/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# static fields
.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lp5/j0;

.field public final c:Lp5/a0;

.field public d:Lx3/m;

.field public e:[B

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "LOCAL:([^,]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lz4/u;->g:Ljava/util/regex/Pattern;

    const-string v0, "MPEGTS:(-?\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lz4/u;->h:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lp5/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/u;->a:Ljava/lang/String;

    iput-object p2, p0, Lz4/u;->b:Lp5/j0;

    new-instance p1, Lp5/a0;

    invoke-direct {p1}, Lp5/a0;-><init>()V

    iput-object p1, p0, Lz4/u;->c:Lp5/a0;

    const/16 p1, 0x400

    new-array p1, p1, [B

    iput-object p1, p0, Lz4/u;->e:[B

    return-void
.end method


# virtual methods
.method public final a(J)Lx3/b0;
    .locals 3

    iget-object v0, p0, Lz4/u;->d:Lx3/m;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    new-instance v1, Ls3/m1$b;

    invoke-direct {v1}, Ls3/m1$b;-><init>()V

    const-string v2, "text/vtt"

    invoke-virtual {v1, v2}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v1

    iget-object v2, p0, Lz4/u;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ls3/m1$b;->k0(J)Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p1

    invoke-interface {v0, p1}, Lx3/b0;->b(Ls3/m1;)V

    iget-object p1, p0, Lz4/u;->d:Lx3/m;

    invoke-interface {p1}, Lx3/m;->n()V

    return-object v0
.end method

.method public b(Lx3/m;)V
    .locals 3

    iput-object p1, p0, Lz4/u;->d:Lx3/m;

    new-instance v0, Lx3/z$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lx3/z$b;-><init>(J)V

    invoke-interface {p1, v0}, Lx3/m;->j(Lx3/z;)V

    return-void
.end method

.method public c(JJ)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final d()V
    .locals 12

    new-instance v0, Lp5/a0;

    iget-object v1, p0, Lz4/u;->e:[B

    invoke-direct {v0, v1}, Lp5/a0;-><init>([B)V

    invoke-static {v0}, Lm5/i;->e(Lp5/a0;)V

    invoke-virtual {v0}, Lp5/a0;->r()Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x0

    move-wide v4, v2

    move-wide v6, v4

    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    const/4 v9, 0x1

    if-nez v8, :cond_3

    const-string v8, "X-TIMESTAMP-MAP"

    invoke-virtual {v1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    sget-object v4, Lz4/u;->g:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    sget-object v5, Lz4/u;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lm5/i;->d(Ljava/lang/String;)J

    move-result-wide v6

    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lp5/j0;->f(J)J

    move-result-wide v4

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Lp5/a0;->r()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lm5/i;->a(Lp5/a0;)Ljava/util/regex/Matcher;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {p0, v2, v3}, Lz4/u;->a(J)Lx3/b0;

    return-void

    :cond_4
    invoke-virtual {v0, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lm5/i;->d(Ljava/lang/String;)J

    move-result-wide v0

    iget-object v2, p0, Lz4/u;->b:Lp5/j0;

    add-long/2addr v4, v0

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Lp5/j0;->j(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lp5/j0;->b(J)J

    move-result-wide v6

    sub-long v0, v6, v0

    invoke-virtual {p0, v0, v1}, Lz4/u;->a(J)Lx3/b0;

    move-result-object v5

    iget-object v0, p0, Lz4/u;->c:Lp5/a0;

    iget-object v1, p0, Lz4/u;->e:[B

    iget v2, p0, Lz4/u;->f:I

    invoke-virtual {v0, v1, v2}, Lp5/a0;->R([BI)V

    iget-object v0, p0, Lz4/u;->c:Lp5/a0;

    iget v1, p0, Lz4/u;->f:I

    invoke-interface {v5, v0, v1}, Lx3/b0;->e(Lp5/a0;I)V

    const/4 v8, 0x1

    iget v9, p0, Lz4/u;->f:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-interface/range {v5 .. v11}, Lx3/b0;->a(JIIILx3/b0$a;)V

    return-void
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 4

    iget-object p2, p0, Lz4/u;->d:Lx3/m;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v0

    long-to-int p2, v0

    iget v0, p0, Lz4/u;->f:I

    iget-object v1, p0, Lz4/u;->e:[B

    array-length v2, v1

    const/4 v3, -0x1

    if-ne v0, v2, :cond_1

    if-eq p2, v3, :cond_0

    move v0, p2

    goto :goto_0

    :cond_0
    array-length v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lz4/u;->e:[B

    :cond_1
    iget-object v0, p0, Lz4/u;->e:[B

    iget v1, p0, Lz4/u;->f:I

    array-length v2, v0

    sub-int/2addr v2, v1

    invoke-interface {p1, v0, v1, v2}, Lx3/l;->c([BII)I

    move-result p1

    if-eq p1, v3, :cond_3

    iget v0, p0, Lz4/u;->f:I

    add-int/2addr v0, p1

    iput v0, p0, Lz4/u;->f:I

    if-eq p2, v3, :cond_2

    if-eq v0, p2, :cond_3

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    invoke-virtual {p0}, Lz4/u;->d()V

    return v3
.end method

.method public h(Lx3/l;)Z
    .locals 4

    iget-object v0, p0, Lz4/u;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-interface {p1, v0, v1, v2, v1}, Lx3/l;->e([BIIZ)Z

    iget-object v0, p0, Lz4/u;->c:Lp5/a0;

    iget-object v3, p0, Lz4/u;->e:[B

    invoke-virtual {v0, v3, v2}, Lp5/a0;->R([BI)V

    iget-object v0, p0, Lz4/u;->c:Lp5/a0;

    invoke-static {v0}, Lm5/i;->b(Lp5/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Lz4/u;->e:[B

    const/4 v3, 0x3

    invoke-interface {p1, v0, v2, v3, v1}, Lx3/l;->e([BIIZ)Z

    iget-object p1, p0, Lz4/u;->c:Lp5/a0;

    iget-object v0, p0, Lz4/u;->e:[B

    const/16 v1, 0x9

    invoke-virtual {p1, v0, v1}, Lp5/a0;->R([BI)V

    iget-object p1, p0, Lz4/u;->c:Lp5/a0;

    invoke-static {p1}, Lm5/i;->b(Lp5/a0;)Z

    move-result p1

    return p1
.end method

.method public release()V
    .locals 0

    return-void
.end method
