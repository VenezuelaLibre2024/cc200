.class public Lbd/b$c;
.super Lbd/b$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final k:Landroid/content/Context;

.field public l:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

.field public final synthetic m:Lbd/b;


# direct methods
.method public constructor <init>(Lbd/b;Landroid/content/Context;)V
    .locals 1

    iput-object p1, p0, Lbd/b$c;->m:Lbd/b;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lbd/b$b;-><init>(Lbd/b;Lbd/b$a;)V

    iput-object p2, p0, Lbd/b$c;->k:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public h(Landroid/content/Intent;I)V
    .locals 1

    iget-object v0, p0, Lbd/b$c;->l:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbd/b$c;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbd/b$c;->l:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    invoke-interface {v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd/b$b;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lbd/b$c;->k:Landroid/content/Context;

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method public i(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    iput-object p1, p0, Lbd/b$c;->l:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    invoke-interface {p1, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lbd/b$c;->l:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    invoke-interface {v0, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lbd/b$c;->l:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    return-void
.end method
