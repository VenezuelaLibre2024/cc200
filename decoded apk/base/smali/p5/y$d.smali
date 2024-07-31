.class public final Lp5/y$d;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lp5/y;


# direct methods
.method public constructor <init>(Lp5/y;)V
    .locals 0

    iput-object p1, p0, Lp5/y$d;->a:Lp5/y;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp5/y;Lp5/y$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp5/y$d;-><init>(Lp5/y;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-static {p1}, Lp5/y;->b(Landroid/content/Context;)I

    move-result p2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lp5/y$d;->a:Lp5/y;

    invoke-static {p1, p2}, Lp5/y$b;->a(Landroid/content/Context;Lp5/y;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp5/y$d;->a:Lp5/y;

    invoke-static {p1, p2}, Lp5/y;->c(Lp5/y;I)V

    :goto_0
    return-void
.end method
