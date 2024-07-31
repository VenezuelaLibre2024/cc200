.class public Lce/u2;
.super Lce/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lce/a<",
        "Lgd/s;",
        ">;"
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
.method public U(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lce/a;->getContext()Ljd/g;

    move-result-object v0

    invoke-static {v0, p1}, Lce/m0;->a(Ljd/g;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
