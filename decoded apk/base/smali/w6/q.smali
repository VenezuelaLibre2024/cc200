.class public Lw6/q;
.super Lf6/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf6/l<",
        "Lw6/r;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lw6/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lf6/l;-><init>(Lf6/m;)V

    return-void
.end method


# virtual methods
.method public b()Lw6/s;
    .locals 1

    invoke-virtual {p0}, Lf6/l;->a()Lf6/m;

    move-result-object v0

    check-cast v0, Lw6/r;

    invoke-virtual {v0}, Lw6/r;->I()Lw6/s;

    move-result-object v0

    return-object v0
.end method
