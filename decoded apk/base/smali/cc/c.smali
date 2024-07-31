.class public Lcc/c;
.super Lcc/f;
.source ""


# instance fields
.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcc/f;-><init>(II)V

    iput p1, p0, Lcc/c;->c:I

    iput p2, p0, Lcc/c;->d:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lcc/c;->d:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcc/c;->c:I

    return v0
.end method
