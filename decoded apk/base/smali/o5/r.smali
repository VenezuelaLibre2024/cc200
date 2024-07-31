.class public final Lo5/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/r$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo5/m0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lo5/j;

.field public d:Lo5/j;

.field public e:Lo5/j;

.field public f:Lo5/j;

.field public g:Lo5/j;

.field public h:Lo5/j;

.field public i:Lo5/j;

.field public j:Lo5/j;

.field public k:Lo5/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo5/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lo5/r;->a:Landroid/content/Context;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/j;

    iput-object p1, p0, Lo5/r;->c:Lo5/j;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lo5/r;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public c([BII)I
    .locals 1

    iget-object v0, p0, Lo5/r;->k:Lo5/j;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/j;

    invoke-interface {v0, p1, p2, p3}, Lo5/h;->c([BII)I

    move-result p1

    return p1
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lo5/r;->k:Lo5/j;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Lo5/j;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lo5/r;->k:Lo5/j;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, Lo5/r;->k:Lo5/j;

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public g(Lo5/m0;)V
    .locals 1

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo5/r;->c:Lo5/j;

    invoke-interface {v0, p1}, Lo5/j;->g(Lo5/m0;)V

    iget-object v0, p0, Lo5/r;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo5/r;->d:Lo5/j;

    invoke-virtual {p0, v0, p1}, Lo5/r;->y(Lo5/j;Lo5/m0;)V

    iget-object v0, p0, Lo5/r;->e:Lo5/j;

    invoke-virtual {p0, v0, p1}, Lo5/r;->y(Lo5/j;Lo5/m0;)V

    iget-object v0, p0, Lo5/r;->f:Lo5/j;

    invoke-virtual {p0, v0, p1}, Lo5/r;->y(Lo5/j;Lo5/m0;)V

    iget-object v0, p0, Lo5/r;->g:Lo5/j;

    invoke-virtual {p0, v0, p1}, Lo5/r;->y(Lo5/j;Lo5/m0;)V

    iget-object v0, p0, Lo5/r;->h:Lo5/j;

    invoke-virtual {p0, v0, p1}, Lo5/r;->y(Lo5/j;Lo5/m0;)V

    iget-object v0, p0, Lo5/r;->i:Lo5/j;

    invoke-virtual {p0, v0, p1}, Lo5/r;->y(Lo5/j;Lo5/m0;)V

    iget-object v0, p0, Lo5/r;->j:Lo5/j;

    invoke-virtual {p0, v0, p1}, Lo5/r;->y(Lo5/j;Lo5/m0;)V

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

    iget-object v0, p0, Lo5/r;->k:Lo5/j;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lo5/j;->j()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public k(Lo5/n;)J
    .locals 2

    iget-object v0, p0, Lo5/r;->k:Lo5/j;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p1, Lo5/n;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lo5/n;->a:Landroid/net/Uri;

    invoke-static {v1}, Lp5/n0;->v0(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p1, Lo5/n;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "/android_asset/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lo5/r;->u()Lo5/j;

    move-result-object v0

    goto :goto_2

    :cond_2
    const-string v1, "asset"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-virtual {p0}, Lo5/r;->r()Lo5/j;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lo5/r;->k:Lo5/j;

    goto :goto_4

    :cond_3
    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lo5/r;->s()Lo5/j;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string v1, "rtmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lo5/r;->w()Lo5/j;

    move-result-object v0

    goto :goto_2

    :cond_5
    const-string v1, "udp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lo5/r;->x()Lo5/j;

    move-result-object v0

    goto :goto_2

    :cond_6
    const-string v1, "data"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lo5/r;->t()Lo5/j;

    move-result-object v0

    goto :goto_2

    :cond_7
    const-string v1, "rawresource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "android.resource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lo5/r;->c:Lo5/j;

    goto :goto_2

    :cond_9
    :goto_3
    invoke-virtual {p0}, Lo5/r;->v()Lo5/j;

    move-result-object v0

    goto :goto_2

    :goto_4
    iget-object v0, p0, Lo5/r;->k:Lo5/j;

    invoke-interface {v0, p1}, Lo5/j;->k(Lo5/n;)J

    move-result-wide v0

    return-wide v0
.end method

.method public o()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lo5/r;->k:Lo5/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lo5/j;->o()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final q(Lo5/j;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo5/r;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo5/r;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/m0;

    invoke-interface {p1, v1}, Lo5/j;->g(Lo5/m0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final r()Lo5/j;
    .locals 2

    iget-object v0, p0, Lo5/r;->e:Lo5/j;

    if-nez v0, :cond_0

    new-instance v0, Lo5/c;

    iget-object v1, p0, Lo5/r;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo5/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo5/r;->e:Lo5/j;

    invoke-virtual {p0, v0}, Lo5/r;->q(Lo5/j;)V

    :cond_0
    iget-object v0, p0, Lo5/r;->e:Lo5/j;

    return-object v0
.end method

.method public final s()Lo5/j;
    .locals 2

    iget-object v0, p0, Lo5/r;->f:Lo5/j;

    if-nez v0, :cond_0

    new-instance v0, Lo5/g;

    iget-object v1, p0, Lo5/r;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo5/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo5/r;->f:Lo5/j;

    invoke-virtual {p0, v0}, Lo5/r;->q(Lo5/j;)V

    :cond_0
    iget-object v0, p0, Lo5/r;->f:Lo5/j;

    return-object v0
.end method

.method public final t()Lo5/j;
    .locals 1

    iget-object v0, p0, Lo5/r;->i:Lo5/j;

    if-nez v0, :cond_0

    new-instance v0, Lo5/i;

    invoke-direct {v0}, Lo5/i;-><init>()V

    iput-object v0, p0, Lo5/r;->i:Lo5/j;

    invoke-virtual {p0, v0}, Lo5/r;->q(Lo5/j;)V

    :cond_0
    iget-object v0, p0, Lo5/r;->i:Lo5/j;

    return-object v0
.end method

.method public final u()Lo5/j;
    .locals 1

    iget-object v0, p0, Lo5/r;->d:Lo5/j;

    if-nez v0, :cond_0

    new-instance v0, Lo5/w;

    invoke-direct {v0}, Lo5/w;-><init>()V

    iput-object v0, p0, Lo5/r;->d:Lo5/j;

    invoke-virtual {p0, v0}, Lo5/r;->q(Lo5/j;)V

    :cond_0
    iget-object v0, p0, Lo5/r;->d:Lo5/j;

    return-object v0
.end method

.method public final v()Lo5/j;
    .locals 2

    iget-object v0, p0, Lo5/r;->j:Lo5/j;

    if-nez v0, :cond_0

    new-instance v0, Lo5/h0;

    iget-object v1, p0, Lo5/r;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo5/h0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo5/r;->j:Lo5/j;

    invoke-virtual {p0, v0}, Lo5/r;->q(Lo5/j;)V

    :cond_0
    iget-object v0, p0, Lo5/r;->j:Lo5/j;

    return-object v0
.end method

.method public final w()Lo5/j;
    .locals 3

    iget-object v0, p0, Lo5/r;->g:Lo5/j;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/j;

    iput-object v0, p0, Lo5/r;->g:Lo5/j;

    invoke-virtual {p0, v0}, Lo5/r;->q(Lo5/j;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error instantiating RTMP extension"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    const-string v0, "DefaultDataSource"

    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    invoke-static {v0, v1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lo5/r;->g:Lo5/j;

    if-nez v0, :cond_0

    iget-object v0, p0, Lo5/r;->c:Lo5/j;

    iput-object v0, p0, Lo5/r;->g:Lo5/j;

    :cond_0
    iget-object v0, p0, Lo5/r;->g:Lo5/j;

    return-object v0
.end method

.method public final x()Lo5/j;
    .locals 1

    iget-object v0, p0, Lo5/r;->h:Lo5/j;

    if-nez v0, :cond_0

    new-instance v0, Lo5/n0;

    invoke-direct {v0}, Lo5/n0;-><init>()V

    iput-object v0, p0, Lo5/r;->h:Lo5/j;

    invoke-virtual {p0, v0}, Lo5/r;->q(Lo5/j;)V

    :cond_0
    iget-object v0, p0, Lo5/r;->h:Lo5/j;

    return-object v0
.end method

.method public final y(Lo5/j;Lo5/m0;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lo5/j;->g(Lo5/m0;)V

    :cond_0
    return-void
.end method
