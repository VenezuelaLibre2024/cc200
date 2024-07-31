.class public Lib/g$d;
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

    iput-object p1, p0, Lib/g$d;->h:Lib/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    invoke-static {}, Lib/g;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Closing camera"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lib/g$d;->h:Lib/g;

    invoke-static {v0}, Lib/g;->e(Lib/g;)Lib/h;

    move-result-object v0

    invoke-virtual {v0}, Lib/h;->v()V

    iget-object v0, p0, Lib/g$d;->h:Lib/g;

    invoke-static {v0}, Lib/g;->e(Lib/g;)Lib/h;

    move-result-object v0

    invoke-virtual {v0}, Lib/h;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lib/g;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to close camera"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    iget-object v0, p0, Lib/g$d;->h:Lib/g;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lib/g;->j(Lib/g;Z)Z

    iget-object v0, p0, Lib/g$d;->h:Lib/g;

    invoke-static {v0}, Lib/g;->g(Lib/g;)Landroid/os/Handler;

    move-result-object v0

    sget v1, Lma/k;->c:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lib/g$d;->h:Lib/g;

    invoke-static {v0}, Lib/g;->k(Lib/g;)Lib/k;

    move-result-object v0

    invoke-virtual {v0}, Lib/k;->b()V

    return-void
.end method
