.class public final Lh6/h1;
.super Lh6/x0;
.source ""


# instance fields
.field public a:Lh6/c;

.field public final b:I


# direct methods
.method public constructor <init>(Lh6/c;I)V
    .locals 0

    invoke-direct {p0}, Lh6/x0;-><init>()V

    iput-object p1, p0, Lh6/h1;->a:Lh6/c;

    iput p2, p0, Lh6/h1;->b:I

    return-void
.end method


# virtual methods
.method public final B(ILandroid/os/IBinder;Lh6/l1;)V
    .locals 2

    iget-object v0, p0, Lh6/h1;->a:Lh6/c;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p3}, Lh6/c;->zzj(Lh6/c;Lh6/l1;)V

    iget-object p3, p3, Lh6/l1;->h:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, Lh6/h1;->x0(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public final W(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final x0(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lh6/h1;->a:Lh6/c;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh6/h1;->a:Lh6/c;

    iget v1, p0, Lh6/h1;->b:I

    invoke-virtual {v0, p1, p2, p3, v1}, Lh6/c;->onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lh6/h1;->a:Lh6/c;

    return-void
.end method
