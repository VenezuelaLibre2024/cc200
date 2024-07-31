.class public Lce/y0;
.super Lce/a;
.source ""

# interfaces
.implements Lce/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lce/a<",
        "TT;>;",
        "Lce/x0<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljd/g;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lce/a;-><init>(Ljd/g;ZZ)V

    return-void
.end method


# virtual methods
.method public j()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lce/j2;->L()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
