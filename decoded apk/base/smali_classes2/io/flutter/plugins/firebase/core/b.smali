.class public final synthetic Lio/flutter/plugins/firebase/core/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;

.field public final synthetic i:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/b;->h:Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/b;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/b;->h:Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/b;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;->i(Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
