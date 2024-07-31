.class public abstract Ld5/g;
.super Lv3/j;
.source ""

# interfaces
.implements Ld5/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv3/j<",
        "Ld5/l;",
        "Ld5/m;",
        "Ld5/j;",
        ">;",
        "Ld5/i;"
    }
.end annotation


# instance fields
.field public final n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    new-array v1, v0, [Ld5/l;

    new-array v0, v0, [Ld5/m;

    invoke-direct {p0, v1, v0}, Lv3/j;-><init>([Lv3/g;[Lv3/h;)V

    iput-object p1, p0, Ld5/g;->n:Ljava/lang/String;

    const/16 p1, 0x400

    invoke-virtual {p0, p1}, Lv3/j;->u(I)V

    return-void
.end method

.method public static synthetic v(Ld5/g;Lv3/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lv3/j;->r(Lv3/h;)V

    return-void
.end method


# virtual methods
.method public final A(Ld5/l;Ld5/m;Z)Ld5/j;
    .locals 8

    :try_start_0
    iget-object v0, p1, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p0, v1, v0, p3}, Ld5/g;->z([BIZ)Ld5/h;

    move-result-object v5

    iget-wide v3, p1, Lv3/g;->l:J

    iget-wide v6, p1, Ld5/l;->p:J

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Ld5/m;->w(JLd5/h;J)V

    const/high16 p1, -0x80000000

    invoke-virtual {p2, p1}, Lv3/a;->m(I)V
    :try_end_0
    .catch Ld5/j; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    return-object p1
.end method

.method public a(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic g()Lv3/g;
    .locals 1

    invoke-virtual {p0}, Ld5/g;->w()Ld5/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lv3/h;
    .locals 1

    invoke-virtual {p0}, Ld5/g;->x()Ld5/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i(Ljava/lang/Throwable;)Lv3/f;
    .locals 0

    invoke-virtual {p0, p1}, Ld5/g;->y(Ljava/lang/Throwable;)Ld5/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lv3/g;Lv3/h;Z)Lv3/f;
    .locals 0

    check-cast p1, Ld5/l;

    check-cast p2, Ld5/m;

    invoke-virtual {p0, p1, p2, p3}, Ld5/g;->A(Ld5/l;Ld5/m;Z)Ld5/j;

    move-result-object p1

    return-object p1
.end method

.method public final w()Ld5/l;
    .locals 1

    new-instance v0, Ld5/l;

    invoke-direct {v0}, Ld5/l;-><init>()V

    return-object v0
.end method

.method public final x()Ld5/m;
    .locals 1

    new-instance v0, Ld5/g$a;

    invoke-direct {v0, p0}, Ld5/g$a;-><init>(Ld5/g;)V

    return-object v0
.end method

.method public final y(Ljava/lang/Throwable;)Ld5/j;
    .locals 2

    new-instance v0, Ld5/j;

    const-string v1, "Unexpected decode error"

    invoke-direct {v0, v1, p1}, Ld5/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public abstract z([BIZ)Ld5/h;
.end method
