.class public Lce/f2;
.super Lce/j2;
.source ""

# interfaces
.implements Lce/a0;


# instance fields
.field public final j:Z


# direct methods
.method public constructor <init>(Lce/c2;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lce/j2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lce/j2;->X(Lce/c2;)V

    invoke-virtual {p0}, Lce/f2;->O0()Z

    move-result p1

    iput-boolean p1, p0, Lce/f2;->j:Z

    return-void
.end method


# virtual methods
.method public O()Z
    .locals 1

    iget-boolean v0, p0, Lce/f2;->j:Z

    return v0
.end method

.method public final O0()Z
    .locals 4

    invoke-virtual {p0}, Lce/j2;->S()Lce/u;

    move-result-object v0

    instance-of v1, v0, Lce/v;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lce/v;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lce/i2;->v()Lce/j2;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lce/j2;->O()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, Lce/j2;->S()Lce/u;

    move-result-object v0

    instance-of v3, v0, Lce/v;

    if-eqz v3, :cond_3

    check-cast v0, Lce/v;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lce/i2;->v()Lce/j2;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method

.method public Q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
