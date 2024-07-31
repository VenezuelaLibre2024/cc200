.class public abstract Lw4/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/e0$e;


# instance fields
.field public final a:J

.field public final b:Lo5/n;

.field public final c:I

.field public final d:Ls3/m1;

.field public final e:I

.field public final f:Ljava/lang/Object;

.field public final g:J

.field public final h:J

.field public final i:Lo5/l0;


# direct methods
.method public constructor <init>(Lo5/j;Lo5/n;ILs3/m1;ILjava/lang/Object;JJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo5/l0;

    invoke-direct {v0, p1}, Lo5/l0;-><init>(Lo5/j;)V

    iput-object v0, p0, Lw4/f;->i:Lo5/l0;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/n;

    iput-object p1, p0, Lw4/f;->b:Lo5/n;

    iput p3, p0, Lw4/f;->c:I

    iput-object p4, p0, Lw4/f;->d:Ls3/m1;

    iput p5, p0, Lw4/f;->e:I

    iput-object p6, p0, Lw4/f;->f:Ljava/lang/Object;

    iput-wide p7, p0, Lw4/f;->g:J

    iput-wide p9, p0, Lw4/f;->h:J

    invoke-static {}, Lu4/n;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lw4/f;->a:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Lw4/f;->i:Lo5/l0;

    invoke-virtual {v0}, Lo5/l0;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()J
    .locals 4

    iget-wide v0, p0, Lw4/f;->h:J

    iget-wide v2, p0, Lw4/f;->g:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lw4/f;->i:Lo5/l0;

    invoke-virtual {v0}, Lo5/l0;->s()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final f()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lw4/f;->i:Lo5/l0;

    invoke-virtual {v0}, Lo5/l0;->r()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
