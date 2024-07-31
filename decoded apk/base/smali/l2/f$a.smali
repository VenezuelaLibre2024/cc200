.class public Ll2/f$a;
.super Lo1/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/f;-><init>(Lo1/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo1/b<",
        "Ll2/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Ll2/f;


# direct methods
.method public constructor <init>(Ll2/f;Lo1/e;)V
    .locals 0

    iput-object p1, p0, Ll2/f$a;->d:Ll2/f;

    invoke-direct {p0, p2}, Lo1/b;-><init>(Lo1/e;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Ls1/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ll2/d;

    invoke-virtual {p0, p1, p2}, Ll2/f$a;->i(Ls1/f;Ll2/d;)V

    return-void
.end method

.method public i(Ls1/f;Ll2/d;)V
    .locals 3

    iget-object v0, p2, Ll2/d;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ls1/d;->q(ILjava/lang/String;)V

    :goto_0
    iget-object p2, p2, Ll2/d;->b:Ljava/lang/Long;

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Ls1/d;->j0(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    :goto_1
    return-void
.end method
