.class public final Lg0/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lg0/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg0/b;

    invoke-direct {v0}, Lg0/b;-><init>()V

    sput-object v0, Lg0/b;->a:Lg0/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "bundle"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    return-void
.end method
