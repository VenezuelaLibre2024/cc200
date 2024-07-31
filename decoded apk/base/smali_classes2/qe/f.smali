.class public final Lqe/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field public static final a:Lqe/f;

.field public static b:Landroid/app/Activity;

.field public static c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqe/f;

    invoke-direct {v0}, Lqe/f;-><init>()V

    sput-object v0, Lqe/f;->a:Lqe/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 1

    sget-object v0, Lqe/f;->b:Landroid/app/Activity;

    return-object v0
.end method

.method public final b()Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;
    .locals 1

    sget-object v0, Lqe/f;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    return-object v0
.end method

.method public final c(Landroid/app/Activity;)V
    .locals 0

    sput-object p1, Lqe/f;->b:Landroid/app/Activity;

    return-void
.end method

.method public final d(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    sput-object p1, Lqe/f;->c:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    return-void
.end method
