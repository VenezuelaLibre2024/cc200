.class public Lib/g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lib/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lib/g;


# direct methods
.method public constructor <init>(Lib/g;)V
    .locals 0

    iput-object p1, p0, Lib/g$b;->h:Lib/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    invoke-static {}, Lib/g;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Configuring camera"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lib/g$b;->h:Lib/g;

    invoke-static {v0}, Lib/g;->e(Lib/g;)Lib/h;

    move-result-object v0

    invoke-virtual {v0}, Lib/h;->e()V

    iget-object v0, p0, Lib/g$b;->h:Lib/g;

    invoke-static {v0}, Lib/g;->g(Lib/g;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lib/g$b;->h:Lib/g;

    invoke-static {v0}, Lib/g;->g(Lib/g;)Landroid/os/Handler;

    move-result-object v0

    sget v1, Lma/k;->j:I

    iget-object v2, p0, Lib/g$b;->h:Lib/g;

    invoke-static {v2}, Lib/g;->h(Lib/g;)Lhb/s;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lib/g$b;->h:Lib/g;

    invoke-static {v1, v0}, Lib/g;->f(Lib/g;Ljava/lang/Exception;)V

    invoke-static {}, Lib/g;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to configure camera"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method
