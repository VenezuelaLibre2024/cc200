.class public final synthetic Lio/flutter/plugins/urllauncher/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/urllauncher/UrlLauncher$IntentResolver;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/urllauncher/f;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getHandlerComponentName(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/urllauncher/f;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lio/flutter/plugins/urllauncher/UrlLauncher;->f(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method