.class public Lv8/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Ly7/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly7/c<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lv8/h$a;

    invoke-direct {v0}, Lv8/h$a;-><init>()V

    const-class v1, Lv8/g;

    invoke-static {v0, v1}, Ly7/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Ly7/c;

    move-result-object v0

    return-object v0
.end method
