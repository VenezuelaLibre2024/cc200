.class public final Lu4/j0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:Lo5/a;

.field public d:Lu4/j0$a;


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2, p3}, Lu4/j0$a;->d(JI)V

    return-void
.end method


# virtual methods
.method public a()Lo5/a;
    .locals 1

    iget-object v0, p0, Lu4/j0$a;->c:Lo5/a;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/a;

    return-object v0
.end method

.method public b()Lu4/j0$a;
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lu4/j0$a;->c:Lo5/a;

    iget-object v1, p0, Lu4/j0$a;->d:Lu4/j0$a;

    iput-object v0, p0, Lu4/j0$a;->d:Lu4/j0$a;

    return-object v1
.end method

.method public c(Lo5/a;Lu4/j0$a;)V
    .locals 0

    iput-object p1, p0, Lu4/j0$a;->c:Lo5/a;

    iput-object p2, p0, Lu4/j0$a;->d:Lu4/j0$a;

    return-void
.end method

.method public d(JI)V
    .locals 2

    iget-object v0, p0, Lu4/j0$a;->c:Lo5/a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iput-wide p1, p0, Lu4/j0$a;->a:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lu4/j0$a;->b:J

    return-void
.end method

.method public e(J)I
    .locals 2

    iget-wide v0, p0, Lu4/j0$a;->a:J

    sub-long/2addr p1, v0

    long-to-int p1, p1

    iget-object p2, p0, Lu4/j0$a;->c:Lo5/a;

    iget p2, p2, Lo5/a;->b:I

    add-int/2addr p1, p2

    return p1
.end method

.method public next()Lo5/b$a;
    .locals 2

    iget-object v0, p0, Lu4/j0$a;->d:Lu4/j0$a;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lu4/j0$a;->c:Lo5/a;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
