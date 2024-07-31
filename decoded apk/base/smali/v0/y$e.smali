.class public Lv0/y$e;
.super Lv0/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lv0/r0;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lv0/n<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field public final a:Lv0/r0;

.field public final b:Lv0/y$d;


# virtual methods
.method public a()Lv0/t1$b;
    .locals 1

    iget-object v0, p0, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {v0}, Lv0/y$d;->e()Lv0/t1$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lv0/r0;
    .locals 1

    iget-object v0, p0, Lv0/y$e;->a:Lv0/r0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lv0/y$e;->b:Lv0/y$d;

    iget-boolean v0, v0, Lv0/y$d;->k:Z

    return v0
.end method
