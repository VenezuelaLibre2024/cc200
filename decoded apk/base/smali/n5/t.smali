.class public final Ln5/t;
.super Ln5/c;
.source ""


# instance fields
.field public final h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu4/s0;II)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Ln5/t;-><init>(Lu4/s0;IIILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu4/s0;IIILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p2, v0, v1

    invoke-direct {p0, p1, v0, p3}, Ln5/c;-><init>(Lu4/s0;[II)V

    iput p4, p0, Ln5/t;->h:I

    iput-object p5, p0, Ln5/t;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j(JJJLjava/util/List;[Lw4/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "+",
            "Lw4/n;",
            ">;[",
            "Lw4/o;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public p()I
    .locals 1

    iget v0, p0, Ln5/t;->h:I

    return v0
.end method

.method public r()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln5/t;->i:Ljava/lang/Object;

    return-object v0
.end method
