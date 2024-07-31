.class public Ll2/u$a;
.super Lo1/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/u;-><init>(Lo1/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo1/b<",
        "Ll2/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Ll2/u;


# direct methods
.method public constructor <init>(Ll2/u;Lo1/e;)V
    .locals 0

    iput-object p1, p0, Ll2/u$a;->d:Ll2/u;

    invoke-direct {p0, p2}, Lo1/b;-><init>(Lo1/e;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Ls1/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ll2/s;

    invoke-virtual {p0, p1, p2}, Ll2/u$a;->i(Ls1/f;Ll2/s;)V

    return-void
.end method

.method public i(Ls1/f;Ll2/s;)V
    .locals 2

    iget-object v0, p2, Ll2/s;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ls1/d;->q(ILjava/lang/String;)V

    :goto_0
    iget-object p2, p2, Ll2/s;->b:Ljava/lang/String;

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Ls1/d;->j0(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p2}, Ls1/d;->q(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
