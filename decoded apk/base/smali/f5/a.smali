.class public final Lf5/a;
.super Ld5/g;
.source ""


# instance fields
.field public final o:Lf5/b;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    const-string v0, "DvbDecoder"

    invoke-direct {p0, v0}, Ld5/g;-><init>(Ljava/lang/String;)V

    new-instance v0, Lp5/a0;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-direct {v0, p1}, Lp5/a0;-><init>([B)V

    invoke-virtual {v0}, Lp5/a0;->M()I

    move-result p1

    invoke-virtual {v0}, Lp5/a0;->M()I

    move-result v0

    new-instance v1, Lf5/b;

    invoke-direct {v1, p1, v0}, Lf5/b;-><init>(II)V

    iput-object v1, p0, Lf5/a;->o:Lf5/b;

    return-void
.end method


# virtual methods
.method public z([BIZ)Ld5/h;
    .locals 1

    if-eqz p3, :cond_0

    iget-object p3, p0, Lf5/a;->o:Lf5/b;

    invoke-virtual {p3}, Lf5/b;->r()V

    :cond_0
    new-instance p3, Lf5/c;

    iget-object v0, p0, Lf5/a;->o:Lf5/b;

    invoke-virtual {v0, p1, p2}, Lf5/b;->b([BI)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p1}, Lf5/c;-><init>(Ljava/util/List;)V

    return-object p3
.end method
