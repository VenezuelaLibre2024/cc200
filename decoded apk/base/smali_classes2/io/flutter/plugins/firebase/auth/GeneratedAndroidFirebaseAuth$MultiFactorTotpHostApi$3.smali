.class Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic val$reply:Lio/flutter/plugin/common/BasicMessageChannel$Reply;

.field public final synthetic val$wrapped:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$3;->val$wrapped:Ljava/util/ArrayList;

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$3;->val$reply:Lio/flutter/plugin/common/BasicMessageChannel$Reply;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public error(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth;->wrapError(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$3;->val$reply:Lio/flutter/plugin/common/BasicMessageChannel$Reply;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/BasicMessageChannel$Reply;->reply(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$3;->success(Ljava/lang/String;)V

    return-void
.end method

.method public success(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$3;->val$wrapped:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$3;->val$reply:Lio/flutter/plugin/common/BasicMessageChannel$Reply;

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$3;->val$wrapped:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/BasicMessageChannel$Reply;->reply(Ljava/lang/Object;)V

    return-void
.end method
