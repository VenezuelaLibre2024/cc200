.class public final synthetic Lio/flutter/plugins/firebase/auth/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

.field public final synthetic b:Lw7/a0;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lw7/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/x;->a:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/x;->b:Lw7/a0;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/x;->a:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/x;->b:Lw7/a0;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->B(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Lw7/a0;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
