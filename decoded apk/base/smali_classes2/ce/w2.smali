.class public final Lce/w2;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lce/c2;)Lce/a0;
    .locals 1

    new-instance v0, Lce/v2;

    invoke-direct {v0, p0}, Lce/v2;-><init>(Lce/c2;)V

    return-object v0
.end method

.method public static synthetic b(Lce/c2;ILjava/lang/Object;)Lce/a0;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lce/w2;->a(Lce/c2;)Lce/a0;

    move-result-object p0

    return-object p0
.end method
