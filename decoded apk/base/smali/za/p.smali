.class public final Lza/p;
.super Lza/q;
.source ""


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0, p1}, Lza/q;-><init>(I)V

    if-ltz p2, :cond_0

    const/16 p1, 0xa

    if-gt p2, p1, :cond_0

    if-ltz p3, :cond_0

    if-gt p3, p1, :cond_0

    iput p2, p0, Lza/p;->b:I

    iput p3, p0, Lza/p;->c:I

    return-void

    :cond_0
    invoke-static {}, Lia/f;->a()Lia/f;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lza/p;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lza/p;->c:I

    return v0
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Lza/p;->b:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Z
    .locals 2

    iget v0, p0, Lza/p;->c:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
