.class public final Lma/h$b;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lma/h;


# direct methods
.method public constructor <init>(Lma/h;)V
    .locals 0

    iput-object p1, p0, Lma/h$b;->a:Lma/h;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lma/h;Lma/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lma/h$b;-><init>(Lma/h;)V

    return-void
.end method

.method public static synthetic a(Lma/h$b;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lma/h$b;->b(Z)V

    return-void
.end method

.method private synthetic b(Z)V
    .locals 1

    iget-object v0, p0, Lma/h$b;->a:Lma/h;

    invoke-static {v0, p1}, Lma/h;->b(Lma/h;Z)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    const-string v0, "plugged"

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lma/h$b;->a:Lma/h;

    invoke-static {p2}, Lma/h;->a(Lma/h;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Lma/i;

    invoke-direct {v0, p0, p1}, Lma/i;-><init>(Lma/h$b;Z)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
