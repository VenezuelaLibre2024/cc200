.class public Lh6/x;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;)Lh6/y;
    .locals 1

    sget-object v0, Lh6/z;->i:Lh6/z;

    invoke-static {p0, v0}, Lh6/x;->b(Landroid/content/Context;Lh6/z;)Lh6/y;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lh6/z;)Lh6/y;
    .locals 1

    new-instance v0, Lj6/d;

    invoke-direct {v0, p0, p1}, Lj6/d;-><init>(Landroid/content/Context;Lh6/z;)V

    return-object v0
.end method
