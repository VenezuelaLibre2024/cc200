.class public final synthetic Lio/flutter/plugins/firebase/messaging/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/p;->h:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/p;->h:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
