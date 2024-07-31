.class public Lw3/v$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw3/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw3/u$a;Ls3/m1;)Lw3/n;
    .locals 2

    iget-object p1, p2, Ls3/m1;->v:Lw3/m;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lw3/a0;

    new-instance p2, Lw3/n$a;

    new-instance v0, Lw3/k0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw3/k0;-><init>(I)V

    const/16 v1, 0x1771

    invoke-direct {p2, v0, v1}, Lw3/n$a;-><init>(Ljava/lang/Throwable;I)V

    invoke-direct {p1, p2}, Lw3/a0;-><init>(Lw3/n$a;)V

    return-object p1
.end method

.method public d(Landroid/os/Looper;Lt3/s1;)V
    .locals 0

    return-void
.end method

.method public e(Ls3/m1;)I
    .locals 0

    iget-object p1, p1, Ls3/m1;->v:Lw3/m;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
