.class public Landroidx/activity/ComponentActivity$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/activity/ComponentActivity$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/ComponentActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public final h:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity$h;->a()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Landroidx/activity/ComponentActivity$h;->h:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Landroid/os/Handler;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :cond_0
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v1
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity$h;->h:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public i0(Landroid/view/View;)V
    .locals 0

    return-void
.end method
