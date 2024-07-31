.class Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;
.super Lcom/google/firebase/auth/b$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-direct {p0}, Lcom/google/firebase/auth/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "verificationId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "name"

    const-string v1, "Auth#phoneCodeAutoRetrievalTimeout"

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCodeSent(Ljava/lang/String;Lcom/google/firebase/auth/b$a;)V
    .locals 3

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$100()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v1, "verificationId"

    invoke-interface {p2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "forceResendingToken"

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "name"

    const-string v0, "Auth#phoneCodeSent"

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onVerificationCompleted(Lw7/o0;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    iget-object v1, v1, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->onCredentialsListener:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;

    invoke-interface {v1, p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;->onCredentialsReceived(Lw7/o0;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "token"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lw7/o0;->L()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lw7/o0;->L()Ljava/lang/String;

    move-result-object p1

    const-string v0, "smsCode"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string p1, "name"

    const-string v0, "Auth#phoneVerificationCompleted"

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    invoke-interface {p1, v1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public onVerificationFailed(Ln7/m;)V
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPluginException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;

    move-result-object p1

    iget-object v2, p1, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;->code:Ljava/lang/String;

    const-string v3, "ERROR_"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "_"

    const-string v4, "-"

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "code"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "message"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;->details:Ljava/lang/Object;

    const-string v2, "details"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "error"

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "name"

    const-string v1, "Auth#phoneVerificationFailed"

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
