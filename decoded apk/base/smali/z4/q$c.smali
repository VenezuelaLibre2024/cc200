.class public Lz4/q$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final g:Ls3/m1;

.field public static final h:Ls3/m1;


# instance fields
.field public final a:Lm4/b;

.field public final b:Lx3/b0;

.field public final c:Ls3/m1;

.field public d:Ls3/m1;

.field public e:[B

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    const-string v1, "application/id3"

    invoke-virtual {v0, v1}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    sput-object v0, Lz4/q$c;->g:Ls3/m1;

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    const-string v1, "application/x-emsg"

    invoke-virtual {v0, v1}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    sput-object v0, Lz4/q$c;->h:Ls3/m1;

    return-void
.end method

.method public constructor <init>(Lx3/b0;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm4/b;

    invoke-direct {v0}, Lm4/b;-><init>()V

    iput-object v0, p0, Lz4/q$c;->a:Lm4/b;

    iput-object p1, p0, Lz4/q$c;->b:Lx3/b0;

    const/4 p1, 0x1

    if-eq p2, p1, :cond_1

    const/4 p1, 0x3

    if-ne p2, p1, :cond_0

    sget-object p1, Lz4/q$c;->h:Ls3/m1;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown metadataType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, Lz4/q$c;->g:Ls3/m1;

    :goto_0
    iput-object p1, p0, Lz4/q$c;->c:Ls3/m1;

    const/4 p1, 0x0

    new-array p2, p1, [B

    iput-object p2, p0, Lz4/q$c;->e:[B

    iput p1, p0, Lz4/q$c;->f:I

    return-void
.end method


# virtual methods
.method public a(JIIILx3/b0$a;)V
    .locals 7

    iget-object v0, p0, Lz4/q$c;->d:Ls3/m1;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p4, p5}, Lz4/q$c;->i(II)Lp5/a0;

    move-result-object p4

    iget-object v0, p0, Lz4/q$c;->d:Ls3/m1;

    iget-object v0, v0, Ls3/m1;->s:Ljava/lang/String;

    iget-object v1, p0, Lz4/q$c;->c:Ls3/m1;

    iget-object v1, v1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0, v1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz4/q$c;->d:Ls3/m1;

    iget-object v0, v0, Ls3/m1;->s:Ljava/lang/String;

    const-string v1, "application/x-emsg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "HlsSampleStreamWrapper"

    if-eqz v0, :cond_2

    iget-object v0, p0, Lz4/q$c;->a:Lm4/b;

    invoke-virtual {v0, p4}, Lm4/b;->c(Lp5/a0;)Lm4/a;

    move-result-object p4

    invoke-virtual {p0, p4}, Lz4/q$c;->g(Lm4/a;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    iget-object p3, p0, Lz4/q$c;->c:Ls3/m1;

    iget-object p3, p3, Ls3/m1;->s:Ljava/lang/String;

    aput-object p3, p1, p2

    const/4 p2, 0x1

    invoke-virtual {p4}, Lm4/a;->n()Ls3/m1;

    move-result-object p3

    aput-object p3, p1, p2

    const-string p2, "Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Lp5/a0;

    invoke-virtual {p4}, Lm4/a;->G()[B

    move-result-object p4

    invoke-static {p4}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [B

    invoke-direct {v0, p4}, Lp5/a0;-><init>([B)V

    move-object p4, v0

    :goto_0
    invoke-virtual {p4}, Lp5/a0;->a()I

    move-result v4

    iget-object v0, p0, Lz4/q$c;->b:Lx3/b0;

    invoke-interface {v0, p4, v4}, Lx3/b0;->e(Lp5/a0;I)V

    iget-object v0, p0, Lz4/q$c;->b:Lx3/b0;

    move-wide v1, p1

    move v3, p3

    move v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lx3/b0;->a(JIIILx3/b0$a;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Ignoring sample for unsupported format: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lz4/q$c;->d:Ls3/m1;

    iget-object p2, p2, Ls3/m1;->s:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ls3/m1;)V
    .locals 1

    iput-object p1, p0, Lz4/q$c;->d:Ls3/m1;

    iget-object p1, p0, Lz4/q$c;->b:Lx3/b0;

    iget-object v0, p0, Lz4/q$c;->c:Ls3/m1;

    invoke-interface {p1, v0}, Lx3/b0;->b(Ls3/m1;)V

    return-void
.end method

.method public d(Lp5/a0;II)V
    .locals 1

    iget p3, p0, Lz4/q$c;->f:I

    add-int/2addr p3, p2

    invoke-virtual {p0, p3}, Lz4/q$c;->h(I)V

    iget-object p3, p0, Lz4/q$c;->e:[B

    iget v0, p0, Lz4/q$c;->f:I

    invoke-virtual {p1, p3, v0, p2}, Lp5/a0;->l([BII)V

    iget p1, p0, Lz4/q$c;->f:I

    add-int/2addr p1, p2

    iput p1, p0, Lz4/q$c;->f:I

    return-void
.end method

.method public f(Lo5/h;IZI)I
    .locals 1

    iget p4, p0, Lz4/q$c;->f:I

    add-int/2addr p4, p2

    invoke-virtual {p0, p4}, Lz4/q$c;->h(I)V

    iget-object p4, p0, Lz4/q$c;->e:[B

    iget v0, p0, Lz4/q$c;->f:I

    invoke-interface {p1, p4, v0, p2}, Lo5/h;->c([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    iget p2, p0, Lz4/q$c;->f:I

    add-int/2addr p2, p1

    iput p2, p0, Lz4/q$c;->f:I

    return p1
.end method

.method public final g(Lm4/a;)Z
    .locals 1

    invoke-virtual {p1}, Lm4/a;->n()Ls3/m1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz4/q$c;->c:Ls3/m1;

    iget-object v0, v0, Ls3/m1;->s:Ljava/lang/String;

    iget-object p1, p1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0, p1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h(I)V
    .locals 2

    iget-object v0, p0, Lz4/q$c;->e:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    div-int/lit8 v1, p1, 0x2

    add-int/2addr p1, v1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lz4/q$c;->e:[B

    :cond_0
    return-void
.end method

.method public final i(II)Lp5/a0;
    .locals 3

    iget v0, p0, Lz4/q$c;->f:I

    sub-int/2addr v0, p2

    sub-int p1, v0, p1

    iget-object v1, p0, Lz4/q$c;->e:[B

    invoke-static {v1, p1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    new-instance v1, Lp5/a0;

    invoke-direct {v1, p1}, Lp5/a0;-><init>([B)V

    iget-object p1, p0, Lz4/q$c;->e:[B

    const/4 v2, 0x0

    invoke-static {p1, v0, p1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p2, p0, Lz4/q$c;->f:I

    return-object v1
.end method
