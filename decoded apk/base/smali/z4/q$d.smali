.class public final Lz4/q$d;
.super Lu4/l0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final H:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw3/m;",
            ">;"
        }
    .end annotation
.end field

.field public I:Lw3/m;


# direct methods
.method public constructor <init>(Lo5/b;Lw3/v;Lw3/u$a;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/b;",
            "Lw3/v;",
            "Lw3/u$a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw3/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lu4/l0;-><init>(Lo5/b;Lw3/v;Lw3/u$a;)V

    iput-object p4, p0, Lz4/q$d;->H:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lo5/b;Lw3/v;Lw3/u$a;Ljava/util/Map;Lz4/q$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lz4/q$d;-><init>(Lo5/b;Lw3/v;Lw3/u$a;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public a(JIIILx3/b0$a;)V
    .locals 0

    invoke-super/range {p0 .. p6}, Lu4/l0;->a(JIIILx3/b0$a;)V

    return-void
.end method

.method public final h0(Lk4/a;)Lk4/a;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lk4/a;->f()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, -0x1

    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v5

    instance-of v6, v5, Lp4/l;

    if-eqz v6, :cond_1

    check-cast v5, Lp4/l;

    iget-object v5, v5, Lp4/l;->i:Ljava/lang/String;

    const-string v6, "com.apple.streaming.transportStreamTimestamp"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move v3, v4

    :goto_1
    if-ne v3, v4, :cond_3

    return-object p1

    :cond_3
    const/4 v4, 0x1

    if-ne v1, v4, :cond_4

    return-object v0

    :cond_4
    add-int/lit8 v0, v1, -0x1

    new-array v0, v0, [Lk4/a$b;

    :goto_2
    if-ge v2, v1, :cond_7

    if-eq v2, v3, :cond_6

    if-ge v2, v3, :cond_5

    move v4, v2

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v2, -0x1

    :goto_3
    invoke-virtual {p1, v2}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v5

    aput-object v5, v0, v4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    new-instance p1, Lk4/a;

    invoke-direct {p1, v0}, Lk4/a;-><init>([Lk4/a$b;)V

    return-object p1
.end method

.method public i0(Lw3/m;)V
    .locals 0

    iput-object p1, p0, Lz4/q$d;->I:Lw3/m;

    invoke-virtual {p0}, Lu4/l0;->I()V

    return-void
.end method

.method public j0(Lz4/j;)V
    .locals 0

    iget p1, p1, Lz4/j;->k:I

    invoke-virtual {p0, p1}, Lu4/l0;->f0(I)V

    return-void
.end method

.method public w(Ls3/m1;)Ls3/m1;
    .locals 3

    iget-object v0, p0, Lz4/q$d;->I:Lw3/m;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Ls3/m1;->v:Lw3/m;

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lz4/q$d;->H:Ljava/util/Map;

    iget-object v2, v0, Lw3/m;->j:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/m;

    if-eqz v1, :cond_1

    move-object v0, v1

    :cond_1
    iget-object v1, p1, Ls3/m1;->q:Lk4/a;

    invoke-virtual {p0, v1}, Lz4/q$d;->h0(Lk4/a;)Lk4/a;

    move-result-object v1

    iget-object v2, p1, Ls3/m1;->v:Lw3/m;

    if-ne v0, v2, :cond_2

    iget-object v2, p1, Ls3/m1;->q:Lk4/a;

    if-eq v1, v2, :cond_3

    :cond_2
    invoke-virtual {p1}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Ls3/m1$b;->O(Lw3/m;)Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p1

    :cond_3
    invoke-super {p0, p1}, Lu4/l0;->w(Ls3/m1;)Ls3/m1;

    move-result-object p1

    return-object p1
.end method
