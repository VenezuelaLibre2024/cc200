.class public final Lce/j0$b;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lce/j0;->a(Ljd/g;Ljd/g;Z)Ljd/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/p<",
        "Ljd/g;",
        "Ljd/g$b;",
        "Ljd/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Ltd/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltd/w<",
            "Ljd/g;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Ltd/w;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd/w<",
            "Ljd/g;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lce/j0$b;->h:Ltd/w;

    iput-boolean p2, p0, Lce/j0$b;->i:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljd/g;Ljd/g$b;)Ljd/g;
    .locals 4

    instance-of v0, p2, Lce/h0;

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lce/j0$b;->h:Ltd/w;

    iget-object v0, v0, Ltd/w;->h:Ljava/lang/Object;

    check-cast v0, Ljd/g;

    invoke-interface {p2}, Ljd/g$b;->getKey()Ljd/g$c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lce/j0$b;->i:Z

    check-cast p2, Lce/h0;

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lce/h0;->g0()Lce/h0;

    move-result-object p2

    :cond_1
    invoke-interface {p1, p2}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v1, p0, Lce/j0$b;->h:Ltd/w;

    iget-object v2, v1, Ltd/w;->h:Ljava/lang/Object;

    check-cast v2, Ljd/g;

    invoke-interface {p2}, Ljd/g$b;->getKey()Ljd/g$c;

    move-result-object v3

    invoke-interface {v2, v3}, Ljd/g;->b0(Ljd/g$c;)Ljd/g;

    move-result-object v2

    iput-object v2, v1, Ltd/w;->h:Ljava/lang/Object;

    check-cast p2, Lce/h0;

    invoke-interface {p2, v0}, Lce/h0;->W(Ljd/g$b;)Ljd/g;

    move-result-object p2

    invoke-interface {p1, p2}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljd/g;

    check-cast p2, Ljd/g$b;

    invoke-virtual {p0, p1, p2}, Lce/j0$b;->a(Ljd/g;Ljd/g$b;)Ljd/g;

    move-result-object p1

    return-object p1
.end method
