.class public final Lo5/l0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/j;


# instance fields
.field public final a:Lo5/j;

.field public b:J

.field public c:Landroid/net/Uri;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo5/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/j;

    iput-object p1, p0, Lo5/l0;->a:Lo5/j;

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Lo5/l0;->c:Landroid/net/Uri;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lo5/l0;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public c([BII)I
    .locals 2

    iget-object v0, p0, Lo5/l0;->a:Lo5/j;

    invoke-interface {v0, p1, p2, p3}, Lo5/h;->c([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    iget-wide p2, p0, Lo5/l0;->b:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lo5/l0;->b:J

    :cond_0
    return p1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lo5/l0;->a:Lo5/j;

    invoke-interface {v0}, Lo5/j;->close()V

    return-void
.end method

.method public g(Lo5/m0;)V
    .locals 1

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo5/l0;->a:Lo5/j;

    invoke-interface {v0, p1}, Lo5/j;->g(Lo5/m0;)V

    return-void
.end method

.method public j()Ljava/util/Map;
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

    iget-object v0, p0, Lo5/l0;->a:Lo5/j;

    invoke-interface {v0}, Lo5/j;->j()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public k(Lo5/n;)J
    .locals 2

    iget-object v0, p1, Lo5/n;->a:Landroid/net/Uri;

    iput-object v0, p0, Lo5/l0;->c:Landroid/net/Uri;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo5/l0;->d:Ljava/util/Map;

    iget-object v0, p0, Lo5/l0;->a:Lo5/j;

    invoke-interface {v0, p1}, Lo5/j;->k(Lo5/n;)J

    move-result-wide v0

    invoke-virtual {p0}, Lo5/l0;->o()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lo5/l0;->c:Landroid/net/Uri;

    invoke-virtual {p0}, Lo5/l0;->j()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lo5/l0;->d:Ljava/util/Map;

    return-wide v0
.end method

.method public o()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lo5/l0;->a:Lo5/j;

    invoke-interface {v0}, Lo5/j;->o()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public q()J
    .locals 2

    iget-wide v0, p0, Lo5/l0;->b:J

    return-wide v0
.end method

.method public r()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lo5/l0;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public s()Ljava/util/Map;
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

    iget-object v0, p0, Lo5/l0;->d:Ljava/util/Map;

    return-object v0
.end method

.method public t()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo5/l0;->b:J

    return-void
.end method
