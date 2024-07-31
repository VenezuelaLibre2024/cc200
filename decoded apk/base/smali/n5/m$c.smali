.class public final Ln5/m$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ln5/m$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(Ls3/m1;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p1, p1, Ls3/m1;->k:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Ln5/m$c;->h:Z

    invoke-static {p2, v1}, Ln5/m;->I(IZ)Z

    move-result p1

    iput-boolean p1, p0, Ln5/m$c;->i:Z

    return-void
.end method


# virtual methods
.method public b(Ln5/m$c;)I
    .locals 3

    invoke-static {}, Li7/n;->j()Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$c;->i:Z

    iget-boolean v2, p1, Ln5/m$c;->i:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$c;->h:Z

    iget-boolean p1, p1, Ln5/m$c;->h:Z

    invoke-virtual {v0, v1, p1}, Li7/n;->g(ZZ)Li7/n;

    move-result-object p1

    invoke-virtual {p1}, Li7/n;->i()I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ln5/m$c;

    invoke-virtual {p0, p1}, Ln5/m$c;->b(Ln5/m$c;)I

    move-result p1

    return p1
.end method
