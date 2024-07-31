.class public final Ls3/p3$c;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/p3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Ls3/p3;


# direct methods
.method public constructor <init>(Ls3/p3;)V
    .locals 0

    iput-object p1, p0, Ls3/p3$c;->a:Ls3/p3;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls3/p3;Ls3/p3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/p3$c;-><init>(Ls3/p3;)V

    return-void
.end method

.method public static synthetic a(Ls3/p3;)V
    .locals 0

    invoke-static {p0}, Ls3/p3$c;->b(Ls3/p3;)V

    return-void
.end method

.method public static synthetic b(Ls3/p3;)V
    .locals 0

    invoke-static {p0}, Ls3/p3;->b(Ls3/p3;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object p1, p0, Ls3/p3$c;->a:Ls3/p3;

    invoke-static {p1}, Ls3/p3;->a(Ls3/p3;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Ls3/p3$c;->a:Ls3/p3;

    new-instance v0, Ls3/q3;

    invoke-direct {v0, p2}, Ls3/q3;-><init>(Ls3/p3;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
