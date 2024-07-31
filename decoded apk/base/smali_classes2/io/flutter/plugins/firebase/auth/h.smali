.class public final synthetic Lio/flutter/plugins/firebase/auth/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;


# static fields
.field public static final synthetic a:Lio/flutter/plugins/firebase/auth/h;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/flutter/plugins/firebase/auth/h;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/auth/h;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/auth/h;->a:Lio/flutter/plugins/firebase/auth/h;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCredentialsReceived(Lw7/o0;)V
    .locals 0

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->H(Lw7/o0;)V

    return-void
.end method
