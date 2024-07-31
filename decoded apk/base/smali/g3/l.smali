.class public final Lg3/l;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ld3/h;Ld3/e;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/h<",
            "*>;",
            "Ld3/e;",
            ")V"
        }
    .end annotation

    instance-of v0, p0, Lg3/s;

    if-eqz v0, :cond_0

    check-cast p0, Lg3/s;

    invoke-virtual {p0}, Lg3/s;->d()Lg3/p;

    move-result-object p0

    invoke-virtual {p0, p1}, Lg3/p;->f(Ld3/e;)Lg3/p;

    move-result-object p0

    invoke-static {}, Lg3/u;->c()Lg3/u;

    move-result-object p1

    invoke-virtual {p1}, Lg3/u;->e()Ln3/s;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Ln3/s;->u(Lg3/p;I)Lh3/g;

    goto :goto_0

    :cond_0
    const-string p1, "ForcedSender"

    const-string v0, "Expected instance of `TransportImpl`, got `%s`."

    invoke-static {p1, v0, p0}, Lk3/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
