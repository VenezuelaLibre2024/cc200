.class public final Lu4/h0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lo5/j$a;

.field public b:Lu4/b0$a;

.field public c:Lw3/x;

.field public d:Lo5/d0;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo5/j$a;)V
    .locals 1

    new-instance v0, Lx3/h;

    invoke-direct {v0}, Lx3/h;-><init>()V

    invoke-direct {p0, p1, v0}, Lu4/h0$b;-><init>(Lo5/j$a;Lx3/p;)V

    return-void
.end method

.method public constructor <init>(Lo5/j$a;Lu4/b0$a;)V
    .locals 6

    new-instance v3, Lw3/l;

    invoke-direct {v3}, Lw3/l;-><init>()V

    new-instance v4, Lo5/v;

    invoke-direct {v4}, Lo5/v;-><init>()V

    const/high16 v5, 0x100000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lu4/h0$b;-><init>(Lo5/j$a;Lu4/b0$a;Lw3/x;Lo5/d0;I)V

    return-void
.end method

.method public constructor <init>(Lo5/j$a;Lu4/b0$a;Lw3/x;Lo5/d0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/h0$b;->a:Lo5/j$a;

    iput-object p2, p0, Lu4/h0$b;->b:Lu4/b0$a;

    iput-object p3, p0, Lu4/h0$b;->c:Lw3/x;

    iput-object p4, p0, Lu4/h0$b;->d:Lo5/d0;

    iput p5, p0, Lu4/h0$b;->e:I

    return-void
.end method

.method public constructor <init>(Lo5/j$a;Lx3/p;)V
    .locals 1

    new-instance v0, Lu4/i0;

    invoke-direct {v0, p2}, Lu4/i0;-><init>(Lx3/p;)V

    invoke-direct {p0, p1, v0}, Lu4/h0$b;-><init>(Lo5/j$a;Lu4/b0$a;)V

    return-void
.end method

.method public static synthetic a(Lx3/p;Lt3/s1;)Lu4/b0;
    .locals 0

    invoke-static {p0, p1}, Lu4/h0$b;->c(Lx3/p;Lt3/s1;)Lu4/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lx3/p;Lt3/s1;)Lu4/b0;
    .locals 0

    new-instance p1, Lu4/c;

    invoke-direct {p1, p0}, Lu4/c;-><init>(Lx3/p;)V

    return-object p1
.end method


# virtual methods
.method public b(Ls3/u1;)Lu4/h0;
    .locals 8

    iget-object v0, p1, Ls3/u1;->i:Ls3/u1$h;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Ls3/u1;->i:Ls3/u1$h;

    iget-object v1, v0, Ls3/u1$h;->i:Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lu4/h0$b;->g:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iget-object v0, v0, Ls3/u1$h;->f:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lu4/h0$b;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ls3/u1;->b()Ls3/u1$c;

    move-result-object p1

    iget-object v0, p0, Lu4/h0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ls3/u1$c;->d(Ljava/lang/Object;)Ls3/u1$c;

    move-result-object p1

    :goto_2
    iget-object v0, p0, Lu4/h0$b;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ls3/u1$c;->b(Ljava/lang/String;)Ls3/u1$c;

    move-result-object p1

    goto :goto_3

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ls3/u1;->b()Ls3/u1$c;

    move-result-object p1

    iget-object v0, p0, Lu4/h0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ls3/u1$c;->d(Ljava/lang/Object;)Ls3/u1$c;

    move-result-object p1

    :goto_3
    invoke-virtual {p1}, Ls3/u1$c;->a()Ls3/u1;

    move-result-object p1

    goto :goto_4

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {p1}, Ls3/u1;->b()Ls3/u1$c;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_4
    move-object v1, p1

    new-instance p1, Lu4/h0;

    iget-object v2, p0, Lu4/h0$b;->a:Lo5/j$a;

    iget-object v3, p0, Lu4/h0$b;->b:Lu4/b0$a;

    iget-object v0, p0, Lu4/h0$b;->c:Lw3/x;

    invoke-interface {v0, v1}, Lw3/x;->a(Ls3/u1;)Lw3/v;

    move-result-object v4

    iget-object v5, p0, Lu4/h0$b;->d:Lo5/d0;

    iget v6, p0, Lu4/h0$b;->e:I

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lu4/h0;-><init>(Ls3/u1;Lo5/j$a;Lu4/b0$a;Lw3/v;Lo5/d0;ILu4/h0$a;)V

    return-object p1
.end method
