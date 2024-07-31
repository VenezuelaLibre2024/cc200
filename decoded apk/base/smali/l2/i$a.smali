.class public Ll2/i$a;
.super Lo1/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/i;-><init>(Lo1/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo1/b<",
        "Ll2/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Ll2/i;


# direct methods
.method public constructor <init>(Ll2/i;Lo1/e;)V
    .locals 0

    iput-object p1, p0, Ll2/i$a;->d:Ll2/i;

    invoke-direct {p0, p2}, Lo1/b;-><init>(Lo1/e;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Ls1/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ll2/g;

    invoke-virtual {p0, p1, p2}, Ll2/i$a;->i(Ls1/f;Ll2/g;)V

    return-void
.end method

.method public i(Ls1/f;Ll2/g;)V
    .locals 3

    iget-object v0, p2, Ll2/g;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ls1/d;->q(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x2

    iget p2, p2, Ll2/g;->b:I

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    return-void
.end method
