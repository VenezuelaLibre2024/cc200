.class public abstract Lg7/y;
.super Lg7/n;
.source ""

# interfaces
.implements Lg7/z;


# direct methods
.method public static c(Landroid/os/IBinder;)Lg7/z;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lg7/z;

    if-eqz v1, :cond_1

    check-cast v0, Lg7/z;

    return-object v0

    :cond_1
    new-instance v0, Lg7/x;

    invoke-direct {v0, p0}, Lg7/x;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
