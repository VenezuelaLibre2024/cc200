.class public final Lm4/b;
.super Lk4/g;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk4/g;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lk4/d;Ljava/nio/ByteBuffer;)Lk4/a;
    .locals 3

    new-instance p1, Lk4/a;

    const/4 v0, 0x1

    new-array v0, v0, [Lk4/a$b;

    new-instance v1, Lp5/a0;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    invoke-direct {v1, v2, p2}, Lp5/a0;-><init>([BI)V

    invoke-virtual {p0, v1}, Lm4/b;->c(Lp5/a0;)Lm4/a;

    move-result-object p2

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-direct {p1, v0}, Lk4/a;-><init>([Lk4/a$b;)V

    return-object p1
.end method

.method public c(Lp5/a0;)Lm4/a;
    .locals 9

    invoke-virtual {p1}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1}, Lp5/a0;->z()J

    move-result-wide v4

    invoke-virtual {p1}, Lp5/a0;->z()J

    move-result-wide v6

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v1

    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result p1

    invoke-static {v0, v1, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v8

    new-instance p1, Lm4/a;

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lm4/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    return-object p1
.end method
