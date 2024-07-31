.class Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager$RequestPermissionsSuccessCallback;
    }
.end annotation


# instance fields
.field private final permissionCode:I

.field private requestInProgress:Z

.field private successCallback:Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager$RequestPermissionsSuccessCallback;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf0

    iput v0, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->permissionCode:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->requestInProgress:Z

    return-void
.end method


# virtual methods
.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 2

    iget-boolean p2, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->requestInProgress:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    const/16 p2, 0xf0

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->successCallback:Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager$RequestPermissionsSuccessCallback;

    if-eqz p1, :cond_1

    iput-boolean v0, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->requestInProgress:Z

    array-length p2, p3

    const/4 v1, 0x1

    if-lez p2, :cond_0

    aget p2, p3, v0

    if-nez p2, :cond_0

    move v0, v1

    :cond_0
    invoke-interface {p1, v0}, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager$RequestPermissionsSuccessCallback;->onSuccess(I)V

    return v1

    :cond_1
    return v0
.end method

.method public requestPermissions(Landroid/app/Activity;Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager$RequestPermissionsSuccessCallback;Lio/flutter/plugins/firebase/messaging/ErrorCallback;)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->requestInProgress:Z

    if-eqz v0, :cond_0

    const-string p1, "A request for permissions is already running, please wait for it to finish before doing another request."

    :goto_0
    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/messaging/ErrorCallback;->onError(Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "Unable to detect current Android Activity."

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->successCallback:Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager$RequestPermissionsSuccessCallback;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const-string p3, "android.permission.POST_NOTIFICATIONS"

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iget-boolean p3, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->requestInProgress:Z

    if-nez p3, :cond_2

    const/16 p3, 0xf0

    invoke-static {p1, p2, p3}, Lx/b;->g(Landroid/app/Activity;[Ljava/lang/String;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/flutter/plugins/firebase/messaging/FlutterFirebasePermissionManager;->requestInProgress:Z

    :cond_2
    return-void
.end method
