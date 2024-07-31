.class public final synthetic Lio/flutter/plugins/firebase/crashlytics/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;

.field public final synthetic i:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic j:Ln7/g;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;Ln7/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/crashlytics/j;->h:Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;

    iput-object p2, p0, Lio/flutter/plugins/firebase/crashlytics/j;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lio/flutter/plugins/firebase/crashlytics/j;->j:Ln7/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/crashlytics/j;->h:Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;

    iget-object v1, p0, Lio/flutter/plugins/firebase/crashlytics/j;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Lio/flutter/plugins/firebase/crashlytics/j;->j:Ln7/g;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;->l(Lio/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;Ln7/g;)V

    return-void
.end method
