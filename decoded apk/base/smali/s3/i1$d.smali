.class public final Ls3/i1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ls3/i1$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final h:Ls3/e3;

.field public i:I

.field public j:J

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ls3/e3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/i1$d;->h:Ls3/e3;

    return-void
.end method


# virtual methods
.method public b(Ls3/i1$d;)I
    .locals 5

    iget-object v0, p0, Ls3/i1$d;->k:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    iget-object v4, p1, Ls3/i1$d;->k:Ljava/lang/Object;

    if-nez v4, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    if-eq v3, v4, :cond_3

    if-eqz v0, :cond_2

    const/4 v1, -0x1

    :cond_2
    return v1

    :cond_3
    if-nez v0, :cond_4

    return v2

    :cond_4
    iget v0, p0, Ls3/i1$d;->i:I

    iget v1, p1, Ls3/i1$d;->i:I

    sub-int/2addr v0, v1

    if-eqz v0, :cond_5

    return v0

    :cond_5
    iget-wide v0, p0, Ls3/i1$d;->j:J

    iget-wide v2, p1, Ls3/i1$d;->j:J

    invoke-static {v0, v1, v2, v3}, Lp5/n0;->o(JJ)I

    move-result p1

    return p1
.end method

.method public c(IJLjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ls3/i1$d;->i:I

    iput-wide p2, p0, Ls3/i1$d;->j:J

    iput-object p4, p0, Ls3/i1$d;->k:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ls3/i1$d;

    invoke-virtual {p0, p1}, Ls3/i1$d;->b(Ls3/i1$d;)I

    move-result p1

    return p1
.end method
