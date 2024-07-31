.class public final Lza/n;
.super Lza/q;
.source ""


# instance fields
.field public final b:C


# direct methods
.method public constructor <init>(IC)V
    .locals 0

    invoke-direct {p0, p1}, Lza/q;-><init>(I)V

    iput-char p2, p0, Lza/n;->b:C

    return-void
.end method


# virtual methods
.method public b()C
    .locals 1

    iget-char v0, p0, Lza/n;->b:C

    return v0
.end method

.method public c()Z
    .locals 2

    iget-char v0, p0, Lza/n;->b:C

    const/16 v1, 0x24

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
