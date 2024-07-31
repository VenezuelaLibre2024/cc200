.class public final synthetic Lio/flutter/embedding/engine/loader/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/embedding/engine/loader/FlutterLoader$1;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/embedding/engine/loader/FlutterLoader$1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/engine/loader/c;->h:Lio/flutter/embedding/engine/loader/FlutterLoader$1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/loader/c;->h:Lio/flutter/embedding/engine/loader/FlutterLoader$1;

    invoke-static {v0}, Lio/flutter/embedding/engine/loader/FlutterLoader$1;->a(Lio/flutter/embedding/engine/loader/FlutterLoader$1;)V

    return-void
.end method
