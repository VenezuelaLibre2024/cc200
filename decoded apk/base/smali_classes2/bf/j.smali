.class public final Lbf/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbf/t;


# instance fields
.field public h:I

.field public final i:Lbf/e;

.field public final j:Ljava/util/zip/Inflater;

.field public final k:Lbf/k;

.field public final l:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Lbf/t;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lbf/j;->h:I

    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Lbf/j;->l:Ljava/util/zip/CRC32;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, Lbf/j;->j:Ljava/util/zip/Inflater;

    invoke-static {p1}, Lbf/l;->b(Lbf/t;)Lbf/e;

    move-result-object p1

    iput-object p1, p0, Lbf/j;->i:Lbf/e;

    new-instance v1, Lbf/k;

    invoke-direct {v1, p1, v0}, Lbf/k;-><init>(Lbf/e;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, Lbf/j;->k:Lbf/k;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public T(Lbf/c;J)J
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_6

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    iget v0, p0, Lbf/j;->h:I

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lbf/j;->d()V

    iput v1, p0, Lbf/j;->h:I

    :cond_1
    iget v0, p0, Lbf/j;->h:I

    const-wide/16 v2, -0x1

    const/4 v4, 0x2

    if-ne v0, v1, :cond_3

    iget-wide v7, p1, Lbf/c;->i:J

    iget-object v0, p0, Lbf/j;->k:Lbf/k;

    invoke-virtual {v0, p1, p2, p3}, Lbf/k;->T(Lbf/c;J)J

    move-result-wide p2

    cmp-long v0, p2, v2

    if-eqz v0, :cond_2

    move-object v5, p0

    move-object v6, p1

    move-wide v9, p2

    invoke-virtual/range {v5 .. v10}, Lbf/j;->j(Lbf/c;JJ)V

    return-wide p2

    :cond_2
    iput v4, p0, Lbf/j;->h:I

    :cond_3
    iget p1, p0, Lbf/j;->h:I

    if-ne p1, v4, :cond_5

    invoke-virtual {p0}, Lbf/j;->f()V

    const/4 p1, 0x3

    iput p1, p0, Lbf/j;->h:I

    iget-object p1, p0, Lbf/j;->i:Lbf/e;

    invoke-interface {p1}, Lbf/e;->B()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "gzip finished without exhausting source"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    return-wide v2

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Ljava/lang/String;II)V
    .locals 3

    if-ne p3, p2, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v1, p1

    const/4 p1, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, p1

    const-string p1, "%s: actual 0x%08x != expected 0x%08x"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lbf/u;
    .locals 1

    iget-object v0, p0, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/t;->c()Lbf/u;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lbf/j;->k:Lbf/k;

    invoke-virtual {v0}, Lbf/k;->close()V

    return-void
.end method

.method public final d()V
    .locals 17

    move-object/from16 v6, p0

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    const-wide/16 v1, 0xa

    invoke-interface {v0, v1, v2}, Lbf/e;->B0(J)V

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->b()Lbf/c;

    move-result-object v0

    const-wide/16 v1, 0x3

    invoke-virtual {v0, v1, v2}, Lbf/c;->I(J)B

    move-result v7

    shr-int/lit8 v0, v7, 0x1

    const/4 v8, 0x1

    and-int/2addr v0, v8

    const/4 v9, 0x0

    if-ne v0, v8, :cond_0

    move v10, v8

    goto :goto_0

    :cond_0
    move v10, v9

    :goto_0
    if-eqz v10, :cond_1

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->b()Lbf/c;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lbf/j;->j(Lbf/c;JJ)V

    :cond_1
    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->readShort()S

    move-result v0

    const/16 v1, 0x1f8b

    const-string v2, "ID1ID2"

    invoke-virtual {v6, v2, v1, v0}, Lbf/j;->a(Ljava/lang/String;II)V

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    const-wide/16 v1, 0x8

    invoke-interface {v0, v1, v2}, Lbf/e;->e(J)V

    shr-int/lit8 v0, v7, 0x2

    and-int/2addr v0, v8

    if-ne v0, v8, :cond_4

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    const-wide/16 v1, 0x2

    invoke-interface {v0, v1, v2}, Lbf/e;->B0(J)V

    if-eqz v10, :cond_2

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->b()Lbf/c;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x2

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lbf/j;->j(Lbf/c;JJ)V

    :cond_2
    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->b()Lbf/c;

    move-result-object v0

    invoke-virtual {v0}, Lbf/c;->w0()S

    move-result v0

    iget-object v1, v6, Lbf/j;->i:Lbf/e;

    int-to-long v11, v0

    invoke-interface {v1, v11, v12}, Lbf/e;->B0(J)V

    if-eqz v10, :cond_3

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->b()Lbf/c;

    move-result-object v1

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide v4, v11

    invoke-virtual/range {v0 .. v5}, Lbf/j;->j(Lbf/c;JJ)V

    :cond_3
    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0, v11, v12}, Lbf/e;->e(J)V

    :cond_4
    shr-int/lit8 v0, v7, 0x3

    and-int/2addr v0, v8

    const-wide/16 v11, -0x1

    const-wide/16 v13, 0x1

    if-ne v0, v8, :cond_7

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0, v9}, Lbf/e;->E0(B)J

    move-result-wide v15

    cmp-long v0, v15, v11

    if-eqz v0, :cond_6

    if-eqz v10, :cond_5

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->b()Lbf/c;

    move-result-object v1

    const-wide/16 v2, 0x0

    add-long v4, v15, v13

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lbf/j;->j(Lbf/c;JJ)V

    :cond_5
    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    add-long v1, v15, v13

    invoke-interface {v0, v1, v2}, Lbf/e;->e(J)V

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_7
    :goto_1
    shr-int/lit8 v0, v7, 0x4

    and-int/2addr v0, v8

    if-ne v0, v8, :cond_a

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0, v9}, Lbf/e;->E0(B)J

    move-result-wide v7

    cmp-long v0, v7, v11

    if-eqz v0, :cond_9

    if-eqz v10, :cond_8

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->b()Lbf/c;

    move-result-object v1

    const-wide/16 v2, 0x0

    add-long v4, v7, v13

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lbf/j;->j(Lbf/c;JJ)V

    :cond_8
    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    add-long/2addr v7, v13

    invoke-interface {v0, v7, v8}, Lbf/e;->e(J)V

    goto :goto_2

    :cond_9
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_a
    :goto_2
    if-eqz v10, :cond_b

    iget-object v0, v6, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->w0()S

    move-result v0

    iget-object v1, v6, Lbf/j;->l:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    int-to-short v1, v1

    const-string v2, "FHCRC"

    invoke-virtual {v6, v2, v0, v1}, Lbf/j;->a(Ljava/lang/String;II)V

    iget-object v0, v6, Lbf/j;->l:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V

    :cond_b
    return-void
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->m0()I

    move-result v0

    iget-object v1, p0, Lbf/j;->l:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "CRC"

    invoke-virtual {p0, v2, v0, v1}, Lbf/j;->a(Ljava/lang/String;II)V

    iget-object v0, p0, Lbf/j;->i:Lbf/e;

    invoke-interface {v0}, Lbf/e;->m0()I

    move-result v0

    iget-object v1, p0, Lbf/j;->j:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "ISIZE"

    invoke-virtual {p0, v2, v0, v1}, Lbf/j;->a(Ljava/lang/String;II)V

    return-void
.end method

.method public final j(Lbf/c;JJ)V
    .locals 4

    iget-object p1, p1, Lbf/c;->h:Lbf/p;

    :goto_0
    iget v0, p1, Lbf/p;->c:I

    iget v1, p1, Lbf/p;->b:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v2, p2, v2

    if-ltz v2, :cond_0

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, Lbf/p;->f:Lbf/p;

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_1
    cmp-long v2, p4, v0

    if-lez v2, :cond_1

    iget v2, p1, Lbf/p;->b:I

    int-to-long v2, v2

    add-long/2addr v2, p2

    long-to-int p2, v2

    iget p3, p1, Lbf/p;->c:I

    sub-int/2addr p3, p2

    int-to-long v2, p3

    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    iget-object v2, p0, Lbf/j;->l:Ljava/util/zip/CRC32;

    iget-object v3, p1, Lbf/p;->a:[B

    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p2, p3

    sub-long/2addr p4, p2

    iget-object p1, p1, Lbf/p;->f:Lbf/p;

    move-wide p2, v0

    goto :goto_1

    :cond_1
    return-void
.end method
