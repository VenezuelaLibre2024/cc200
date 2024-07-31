.class public abstract Lg7/t;
.super Lg7/n;
.source ""

# interfaces
.implements Lg7/u;


# direct methods
.method public static c(Landroid/os/IBinder;)Lg7/u;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lg7/u;

    if-eqz v1, :cond_1

    check-cast v0, Lg7/u;

    return-object v0

    :cond_1
    new-instance v0, Lg7/s;

    invoke-direct {v0, p0}, Lg7/s;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
