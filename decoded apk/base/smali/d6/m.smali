.class public final synthetic Ld6/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ld6/b;

.field public final synthetic i:Landroid/content/Intent;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Z

.field public final synthetic l:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method public synthetic constructor <init>(Ld6/b;Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/m;->h:Ld6/b;

    iput-object p2, p0, Ld6/m;->i:Landroid/content/Intent;

    iput-object p3, p0, Ld6/m;->j:Landroid/content/Context;

    iput-boolean p4, p0, Ld6/m;->k:Z

    iput-object p5, p0, Ld6/m;->l:Landroid/content/BroadcastReceiver$PendingResult;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Ld6/m;->h:Ld6/b;

    iget-object v1, p0, Ld6/m;->i:Landroid/content/Intent;

    iget-object v2, p0, Ld6/m;->j:Landroid/content/Context;

    iget-boolean v3, p0, Ld6/m;->k:Z

    iget-object v4, p0, Ld6/m;->l:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0, v1, v2, v3, v4}, Ld6/b;->d(Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V

    return-void
.end method
