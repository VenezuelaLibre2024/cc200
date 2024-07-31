.class public abstract Lh6/l$a;
.super Lcom/google/android/gms/internal/common/zzb;
.source ""

# interfaces
.implements Lh6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public static c(Landroid/os/IBinder;)Lh6/l;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.common.internal.ICancelToken"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lh6/l;

    if-eqz v1, :cond_1

    check-cast v0, Lh6/l;

    return-object v0

    :cond_1
    new-instance v0, Lh6/x1;

    invoke-direct {v0, p0}, Lh6/x1;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
