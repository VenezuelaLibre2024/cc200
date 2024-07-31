.class public final synthetic Lio/flutter/plugins/firebase/auth/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;

.field public final synthetic i:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

.field public final synthetic j:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/e0;->h:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/e0;->i:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iput-object p3, p0, Lio/flutter/plugins/firebase/auth/e0;->j:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/e0;->h:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/e0;->i:Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;

    iget-object v2, p0, Lio/flutter/plugins/firebase/auth/e0;->j:Ljava/lang/Boolean;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthUser;->q(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;Ljava/lang/Boolean;)V

    return-void
.end method
