.class public final Lw4/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ls3/m1;

.field public final d:Lx3/j;

.field public e:Ls3/m1;

.field public f:Lx3/b0;

.field public g:J


# direct methods
.method public constructor <init>(IILs3/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw4/e$a;->a:I

    iput p2, p0, Lw4/e$a;->b:I

    iput-object p3, p0, Lw4/e$a;->c:Ls3/m1;

    new-instance p1, Lx3/j;

    invoke-direct {p1}, Lx3/j;-><init>()V

    iput-object p1, p0, Lw4/e$a;->d:Lx3/j;

    return-void
.end method


# virtual methods
.method public a(JIIILx3/b0$a;)V
    .locals 8

    iget-wide v0, p0, Lw4/e$a;->g:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lw4/e$a;->d:Lx3/j;

    iput-object v0, p0, Lw4/e$a;->f:Lx3/b0;

    :cond_0
    iget-object v0, p0, Lw4/e$a;->f:Lx3/b0;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lx3/b0;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lx3/b0;->a(JIIILx3/b0$a;)V

    return-void
.end method

.method public b(Ls3/m1;)V
    .locals 1

    iget-object v0, p0, Lw4/e$a;->c:Ls3/m1;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ls3/m1;->j(Ls3/m1;)Ls3/m1;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lw4/e$a;->e:Ls3/m1;

    iget-object p1, p0, Lw4/e$a;->f:Lx3/b0;

    invoke-static {p1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx3/b0;

    iget-object v0, p0, Lw4/e$a;->e:Ls3/m1;

    invoke-interface {p1, v0}, Lx3/b0;->b(Ls3/m1;)V

    return-void
.end method

.method public d(Lp5/a0;II)V
    .locals 0

    iget-object p3, p0, Lw4/e$a;->f:Lx3/b0;

    invoke-static {p3}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx3/b0;

    invoke-interface {p3, p1, p2}, Lx3/b0;->e(Lp5/a0;I)V

    return-void
.end method

.method public f(Lo5/h;IZI)I
    .locals 0

    iget-object p4, p0, Lw4/e$a;->f:Lx3/b0;

    invoke-static {p4}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lx3/b0;

    invoke-interface {p4, p1, p2, p3}, Lx3/b0;->c(Lo5/h;IZ)I

    move-result p1

    return p1
.end method

.method public g(Lw4/g$b;J)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Lw4/e$a;->d:Lx3/j;

    iput-object p1, p0, Lw4/e$a;->f:Lx3/b0;

    return-void

    :cond_0
    iput-wide p2, p0, Lw4/e$a;->g:J

    iget p2, p0, Lw4/e$a;->a:I

    iget p3, p0, Lw4/e$a;->b:I

    invoke-interface {p1, p2, p3}, Lw4/g$b;->e(II)Lx3/b0;

    move-result-object p1

    iput-object p1, p0, Lw4/e$a;->f:Lx3/b0;

    iget-object p2, p0, Lw4/e$a;->e:Ls3/m1;

    if-eqz p2, :cond_1

    invoke-interface {p1, p2}, Lx3/b0;->b(Ls3/m1;)V

    :cond_1
    return-void
.end method
