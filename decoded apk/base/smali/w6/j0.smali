.class public final Lw6/j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lw6/c;

    check-cast p2, Lw6/c;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lw6/c;->I()I

    move-result v0

    invoke-virtual {p2}, Lw6/c;->I()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_1

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    invoke-virtual {p1}, Lw6/c;->J()I

    move-result p1

    invoke-virtual {p2}, Lw6/c;->J()I

    move-result p2

    if-ne p1, p2, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    if-ge p1, p2, :cond_3

    move v2, v3

    :cond_3
    :goto_0
    return v2
.end method
