.class public final synthetic Lio/flutter/plugins/firebase/auth/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lw7/a0;

.field public final synthetic b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;


# direct methods
.method public synthetic constructor <init>(Lw7/a0;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/c0;->a:Lw7/a0;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/c0;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/c0;->a:Lw7/a0;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/c0;->b:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->y(Lw7/a0;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
