.class public Lc4/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc4/d;->j(Lx3/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx3/z;

.field public final synthetic b:Lc4/d;


# direct methods
.method public constructor <init>(Lc4/d;Lx3/z;)V
    .locals 0

    iput-object p1, p0, Lc4/d$a;->b:Lc4/d;

    iput-object p2, p0, Lc4/d$a;->a:Lx3/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-object v0, p0, Lc4/d$a;->a:Lx3/z;

    invoke-interface {v0}, Lx3/z;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lc4/d$a;->a:Lx3/z;

    invoke-interface {v0}, Lx3/z;->f()Z

    move-result v0

    return v0
.end method

.method public i(J)Lx3/z$a;
    .locals 8

    iget-object v0, p0, Lc4/d$a;->a:Lx3/z;

    invoke-interface {v0, p1, p2}, Lx3/z;->i(J)Lx3/z$a;

    move-result-object p1

    new-instance p2, Lx3/z$a;

    new-instance v0, Lx3/a0;

    iget-object v1, p1, Lx3/z$a;->a:Lx3/a0;

    iget-wide v2, v1, Lx3/a0;->a:J

    iget-wide v4, v1, Lx3/a0;->b:J

    iget-object v1, p0, Lc4/d$a;->b:Lc4/d;

    invoke-static {v1}, Lc4/d;->a(Lc4/d;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v0, v2, v3, v4, v5}, Lx3/a0;-><init>(JJ)V

    new-instance v1, Lx3/a0;

    iget-object p1, p1, Lx3/z$a;->b:Lx3/a0;

    iget-wide v2, p1, Lx3/a0;->a:J

    iget-wide v4, p1, Lx3/a0;->b:J

    iget-object p1, p0, Lc4/d$a;->b:Lc4/d;

    invoke-static {p1}, Lc4/d;->a(Lc4/d;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v1, v2, v3, v4, v5}, Lx3/a0;-><init>(JJ)V

    invoke-direct {p2, v0, v1}, Lx3/z$a;-><init>(Lx3/a0;Lx3/a0;)V

    return-object p2
.end method
