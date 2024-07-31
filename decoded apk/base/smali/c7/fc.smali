.class public final Lc7/fc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/pc;


# instance fields
.field public final synthetic a:Lc7/yb;


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 0

    iput-object p1, p0, Lc7/fc;->a:Lc7/yb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lc7/fc;->a:Lc7/yb;

    invoke-static {p1}, Lc7/yb;->e(Lc7/yb;)Lc7/k6;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc7/fc;->a:Lc7/yb;

    invoke-static {p1}, Lc7/yb;->e(Lc7/yb;)Lc7/k6;

    move-result-object p1

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p3, "AppId not known when logging event"

    invoke-virtual {p1, p3, p2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc7/fc;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/ec;

    invoke-direct {v1, p0, p1, p2, p3}, Lc7/ec;-><init>(Lc7/fc;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
