.class public Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;
.super Landroidx/lifecycle/LiveData;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/LiveData<",
        "Lcom/google/firebase/messaging/d;",
        ">;"
    }
.end annotation


# static fields
.field private static instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/LiveData;-><init>()V

    return-void
.end method

.method public static getInstance()Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;
    .locals 1

    sget-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;

    :cond_0
    sget-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;

    return-object v0
.end method


# virtual methods
.method public postRemoteMessage(Lcom/google/firebase/messaging/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method
