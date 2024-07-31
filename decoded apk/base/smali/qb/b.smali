.class public final Lqb/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a([F)V
    .locals 1

    array-length p0, p0

    const/16 v0, 0x10

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Need a 16 values matrix."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b([F)[F
    .locals 1

    const-string v0, "$this$makeIdentity"

    invoke-static {p0, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lqb/b;->a([F)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    return-object p0
.end method
