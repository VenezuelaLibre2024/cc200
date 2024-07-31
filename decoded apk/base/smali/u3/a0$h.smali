.class public Lu3/a0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public final a:[Lu3/g;

.field public final b:Lu3/i0;

.field public final c:Lu3/k0;


# direct methods
.method public varargs constructor <init>([Lu3/g;)V
    .locals 2

    new-instance v0, Lu3/i0;

    invoke-direct {v0}, Lu3/i0;-><init>()V

    new-instance v1, Lu3/k0;

    invoke-direct {v1}, Lu3/k0;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lu3/a0$h;-><init>([Lu3/g;Lu3/i0;Lu3/k0;)V

    return-void
.end method

.method public constructor <init>([Lu3/g;Lu3/i0;Lu3/k0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lu3/g;

    iput-object v0, p0, Lu3/a0$h;->a:[Lu3/g;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p2, p0, Lu3/a0$h;->b:Lu3/i0;

    iput-object p3, p0, Lu3/a0$h;->c:Lu3/k0;

    array-length v1, p1

    aput-object p2, v0, v1

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 1

    iget-object v0, p0, Lu3/a0$h;->c:Lu3/k0;

    invoke-virtual {v0, p1, p2}, Lu3/k0;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(Ls3/a3;)Ls3/a3;
    .locals 2

    iget-object v0, p0, Lu3/a0$h;->c:Lu3/k0;

    iget v1, p1, Ls3/a3;->h:F

    invoke-virtual {v0, v1}, Lu3/k0;->i(F)V

    iget-object v0, p0, Lu3/a0$h;->c:Lu3/k0;

    iget v1, p1, Ls3/a3;->i:F

    invoke-virtual {v0, v1}, Lu3/k0;->h(F)V

    return-object p1
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lu3/a0$h;->b:Lu3/i0;

    invoke-virtual {v0}, Lu3/i0;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Z)Z
    .locals 1

    iget-object v0, p0, Lu3/a0$h;->b:Lu3/i0;

    invoke-virtual {v0, p1}, Lu3/i0;->v(Z)V

    return p1
.end method

.method public e()[Lu3/g;
    .locals 1

    iget-object v0, p0, Lu3/a0$h;->a:[Lu3/g;

    return-object v0
.end method
