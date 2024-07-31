.class public final Lo5/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/e0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/g0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo5/e0$e;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lo5/n;

.field public final c:I

.field public final d:Lo5/l0;

.field public final e:Lo5/g0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/g0$a<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public volatile f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo5/j;Landroid/net/Uri;ILo5/g0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/j;",
            "Landroid/net/Uri;",
            "I",
            "Lo5/g0$a<",
            "+TT;>;)V"
        }
    .end annotation

    new-instance v0, Lo5/n$b;

    invoke-direct {v0}, Lo5/n$b;-><init>()V

    invoke-virtual {v0, p2}, Lo5/n$b;->i(Landroid/net/Uri;)Lo5/n$b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo5/n$b;->b(I)Lo5/n$b;

    move-result-object p2

    invoke-virtual {p2}, Lo5/n$b;->a()Lo5/n;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, Lo5/g0;-><init>(Lo5/j;Lo5/n;ILo5/g0$a;)V

    return-void
.end method

.method public constructor <init>(Lo5/j;Lo5/n;ILo5/g0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/j;",
            "Lo5/n;",
            "I",
            "Lo5/g0$a<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo5/l0;

    invoke-direct {v0, p1}, Lo5/l0;-><init>(Lo5/j;)V

    iput-object v0, p0, Lo5/g0;->d:Lo5/l0;

    iput-object p2, p0, Lo5/g0;->b:Lo5/n;

    iput p3, p0, Lo5/g0;->c:I

    iput-object p4, p0, Lo5/g0;->e:Lo5/g0$a;

    invoke-static {}, Lu4/n;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lo5/g0;->a:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lo5/g0;->d:Lo5/l0;

    invoke-virtual {v0}, Lo5/l0;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lo5/g0;->d:Lo5/l0;

    invoke-virtual {v0}, Lo5/l0;->t()V

    new-instance v0, Lo5/l;

    iget-object v1, p0, Lo5/g0;->d:Lo5/l0;

    iget-object v2, p0, Lo5/g0;->b:Lo5/n;

    invoke-direct {v0, v1, v2}, Lo5/l;-><init>(Lo5/j;Lo5/n;)V

    :try_start_0
    invoke-virtual {v0}, Lo5/l;->d()V

    iget-object v1, p0, Lo5/g0;->d:Lo5/l0;

    invoke-virtual {v1}, Lo5/l0;->o()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    iget-object v2, p0, Lo5/g0;->e:Lo5/g0$a;

    invoke-interface {v2, v1, v0}, Lo5/g0$a;->a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lo5/g0;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lp5/n0;->n(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Lp5/n0;->n(Ljava/io/Closeable;)V

    throw v1
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public d()Ljava/util/Map;
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

    iget-object v0, p0, Lo5/g0;->d:Lo5/l0;

    invoke-virtual {v0}, Lo5/l0;->s()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lo5/g0;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lo5/g0;->d:Lo5/l0;

    invoke-virtual {v0}, Lo5/l0;->r()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
