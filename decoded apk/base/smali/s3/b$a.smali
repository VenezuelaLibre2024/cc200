.class public final Ls3/b$a;
.super Landroid/content/BroadcastReceiver;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final h:Ls3/b$b;

.field public final i:Landroid/os/Handler;

.field public final synthetic j:Ls3/b;


# direct methods
.method public constructor <init>(Ls3/b;Landroid/os/Handler;Ls3/b$b;)V
    .locals 0

    iput-object p1, p0, Ls3/b$a;->j:Ls3/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p2, p0, Ls3/b$a;->i:Landroid/os/Handler;

    iput-object p3, p0, Ls3/b$a;->h:Ls3/b$b;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.media.AUDIO_BECOMING_NOISY"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls3/b$a;->i:Landroid/os/Handler;

    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Ls3/b$a;->j:Ls3/b;

    invoke-static {v0}, Ls3/b;->a(Ls3/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/b$a;->h:Ls3/b$b;

    invoke-interface {v0}, Ls3/b$b;->u()V

    :cond_0
    return-void
.end method
