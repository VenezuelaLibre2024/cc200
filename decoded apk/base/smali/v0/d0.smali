.class public Lv0/d0;
.super Lv0/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/d0$c;,
        Lv0/d0$b;
    }
.end annotation


# instance fields
.field public final f:Lv0/r0;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lv0/d0;->f()Lv0/r0;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Lv0/r0;
    .locals 1

    iget-object v0, p0, Lv0/d0;->f:Lv0/r0;

    invoke-virtual {p0, v0}, Lv0/e0;->c(Lv0/r0;)Lv0/r0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lv0/d0;->f()Lv0/r0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lv0/d0;->f()Lv0/r0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
