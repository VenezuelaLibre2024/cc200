.class public abstract Lr6/b$a;
.super Lcom/google/android/gms/internal/common/zzb;
.source ""

# interfaces
.implements Lr6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/common/zzb;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static c(Landroid/os/IBinder;)Lr6/b;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lr6/b;

    if-eqz v1, :cond_1

    check-cast v0, Lr6/b;

    return-object v0

    :cond_1
    new-instance v0, Lr6/l;

    invoke-direct {v0, p0}, Lr6/l;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
