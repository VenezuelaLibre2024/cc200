.class public final Ljd/g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljd/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ljd/g;Ljd/g;)Ljd/g;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljd/h;->h:Ljd/h;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ljd/g$a$a;->h:Ljd/g$a$a;

    invoke-interface {p1, p0, v0}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljd/g;

    :goto_0
    return-object p0
.end method
