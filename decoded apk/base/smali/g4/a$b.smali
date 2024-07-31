.class public final Lg4/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lg4/a;


# direct methods
.method public constructor <init>(Lg4/a;)V
    .locals 0

    iput-object p1, p0, Lg4/a$b;->a:Lg4/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lg4/a;Lg4/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg4/a$b;-><init>(Lg4/a;)V

    return-void
.end method


# virtual methods
.method public d()J
    .locals 3

    iget-object v0, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v0}, Lg4/a;->d(Lg4/a;)Lg4/i;

    move-result-object v0

    iget-object v1, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v1}, Lg4/a;->g(Lg4/a;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg4/i;->b(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i(J)Lx3/z$a;
    .locals 10

    iget-object v0, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v0}, Lg4/a;->d(Lg4/a;)Lg4/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg4/i;->c(J)J

    move-result-wide v0

    iget-object v2, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v2}, Lg4/a;->e(Lg4/a;)J

    move-result-wide v2

    iget-object v4, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v4}, Lg4/a;->f(Lg4/a;)J

    move-result-wide v4

    iget-object v6, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v6}, Lg4/a;->e(Lg4/a;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    mul-long/2addr v0, v4

    iget-object v4, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v4}, Lg4/a;->g(Lg4/a;)J

    move-result-wide v4

    div-long/2addr v0, v4

    add-long/2addr v2, v0

    const-wide/16 v0, 0x7530

    sub-long v4, v2, v0

    iget-object v0, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v0}, Lg4/a;->e(Lg4/a;)J

    move-result-wide v6

    iget-object v0, p0, Lg4/a$b;->a:Lg4/a;

    invoke-static {v0}, Lg4/a;->f(Lg4/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    invoke-static/range {v4 .. v9}, Lp5/n0;->r(JJJ)J

    move-result-wide v0

    new-instance v2, Lx3/z$a;

    new-instance v3, Lx3/a0;

    invoke-direct {v3, p1, p2, v0, v1}, Lx3/a0;-><init>(JJ)V

    invoke-direct {v2, v3}, Lx3/z$a;-><init>(Lx3/a0;)V

    return-object v2
.end method
