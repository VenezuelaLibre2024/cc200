.class public final Lg7/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic h:Lg7/d;


# direct methods
.method public synthetic constructor <init>(Lg7/d;Lg7/b;)V
    .locals 0

    iput-object p1, p0, Lg7/c;->h:Lg7/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Lg7/c;->h:Lg7/d;

    invoke-static {v0}, Lg7/d;->f(Lg7/d;)Lg7/c0;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, p1, v1}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Lg7/c;->h:Lg7/d;

    new-instance v0, Lg7/k0;

    invoke-direct {v0, p0, p2}, Lg7/k0;-><init>(Lg7/c;Landroid/os/IBinder;)V

    invoke-virtual {p1}, Lg7/d;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, Lg7/c;->h:Lg7/d;

    invoke-static {v0}, Lg7/d;->f(Lg7/d;)Lg7/c0;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, p1, v1}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Lg7/c;->h:Lg7/d;

    new-instance v0, Lg7/l0;

    invoke-direct {v0, p0}, Lg7/l0;-><init>(Lg7/c;)V

    invoke-virtual {p1}, Lg7/d;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
