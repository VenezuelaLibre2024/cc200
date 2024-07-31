.class public final Lx3/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/b0;


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    iput-object v0, p0, Lx3/j;->a:[B

    return-void
.end method


# virtual methods
.method public a(JIIILx3/b0$a;)V
    .locals 0

    return-void
.end method

.method public b(Ls3/m1;)V
    .locals 0

    return-void
.end method

.method public d(Lp5/a0;II)V
    .locals 0

    invoke-virtual {p1, p2}, Lp5/a0;->U(I)V

    return-void
.end method

.method public f(Lo5/h;IZI)I
    .locals 1

    iget-object p4, p0, Lx3/j;->a:[B

    array-length p4, p4

    invoke-static {p4, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object p4, p0, Lx3/j;->a:[B

    const/4 v0, 0x0

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
    return p1
.end method
