.class public Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final SHARED_PREFS_FILE_NAME:Ljava/lang/String; = "flutter_local_notifications_plugin"


# instance fields
.field private final CALLBACK_DISPATCHER_HANDLE_KEY:Ljava/lang/String;

.field private final CALLBACK_HANDLE_KEY:Ljava/lang/String;

.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY"

    iput-object v0, p0, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->CALLBACK_DISPATCHER_HANDLE_KEY:Ljava/lang/String;

    const-string v0, "com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY"

    iput-object v0, p0, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->CALLBACK_HANDLE_KEY:Ljava/lang/String;

    iput-object p1, p0, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->context:Landroid/content/Context;

    return-void
.end method

.method private get()Landroid/content/SharedPreferences;
    .locals 3

    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->context:Landroid/content/Context;

    const-string v1, "flutter_local_notifications_plugin"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getCallbackDispatcherHandle()Ljava/lang/Long;
    .locals 4

    invoke-direct {p0}, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY"

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getCallbackHandle()Ljava/lang/Long;
    .locals 4

    invoke-direct {p0}, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY"

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public lookupDispatcherHandle()Lio/flutter/view/FlutterCallbackInformation;
    .locals 2

    invoke-virtual {p0}, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->getCallbackDispatcherHandle()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    move-result-object v0

    return-object v0
.end method

.method public saveCallbackKeys(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    invoke-direct {p0}, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string p1, "com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY"

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-direct {p0}, Lcom/dexterous/flutterlocalnotifications/isolate/IsolatePreferences;->get()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-string p2, "com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY"

    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
