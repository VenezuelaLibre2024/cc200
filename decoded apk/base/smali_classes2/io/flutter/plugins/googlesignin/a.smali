.class public final synthetic Lio/flutter/plugins/googlesignin/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;

.field public final synthetic i:Ll7/f;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ll7/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/a;->h:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;

    iput-object p2, p0, Lio/flutter/plugins/googlesignin/a;->i:Ll7/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/a;->h:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/a;->i:Ll7/f;

    invoke-static {v0, v1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->b(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ll7/f;)V

    return-void
.end method
