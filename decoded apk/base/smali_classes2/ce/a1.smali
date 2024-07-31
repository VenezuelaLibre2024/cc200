.class public final Lce/a1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljd/g;)Lce/z0;
    .locals 1

    sget-object v0, Ljd/e;->e:Ljd/e$b;

    invoke-interface {p0, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p0

    instance-of v0, p0, Lce/z0;

    if-eqz v0, :cond_0

    check-cast p0, Lce/z0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, Lce/w0;->a()Lce/z0;

    move-result-object p0

    :cond_1
    return-object p0
.end method
