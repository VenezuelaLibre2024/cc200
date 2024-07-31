.class public final Lg7/x;
.super Lg7/a;
.source ""

# interfaces
.implements Lg7/z;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-direct {p0, p1, v0}, Lg7/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final u(Landroid/os/Bundle;Lg7/b0;)V
    .locals 1

    invoke-virtual {p0}, Lg7/a;->c()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lg7/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lg7/a;->e(ILandroid/os/Parcel;)V

    return-void
.end method
