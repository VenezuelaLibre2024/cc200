.class public Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "IAWMethodHandler"


# instance fields
.field public webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v9, -0x1

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v4, "getTitle"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v9, 0x46

    goto/16 :goto_0

    :sswitch_1
    const-string v4, "evaluateJavascript"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v9, 0x45

    goto/16 :goto_0

    :sswitch_2
    const-string v4, "injectJavascriptFileFromUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v9, 0x44

    goto/16 :goto_0

    :sswitch_3
    const-string v4, "findAllAsync"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v9, 0x43

    goto/16 :goto_0

    :sswitch_4
    const-string v4, "loadFile"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v9, 0x42

    goto/16 :goto_0

    :sswitch_5
    const-string v4, "loadData"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v9, 0x41

    goto/16 :goto_0

    :sswitch_6
    const-string v4, "goBackOrForward"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v9, 0x40

    goto/16 :goto_0

    :sswitch_7
    const-string v4, "setContextMenu"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v9, 0x3f

    goto/16 :goto_0

    :sswitch_8
    const-string v4, "requestImageRef"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v9, 0x3e

    goto/16 :goto_0

    :sswitch_9
    const-string v4, "callAsyncJavaScript"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v9, 0x3d

    goto/16 :goto_0

    :sswitch_a
    const-string v4, "setOptions"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v9, 0x3c

    goto/16 :goto_0

    :sswitch_b
    const-string v4, "getZoomScale"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v9, 0x3b

    goto/16 :goto_0

    :sswitch_c
    const-string v4, "addUserScript"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v9, 0x3a

    goto/16 :goto_0

    :sswitch_d
    const-string v4, "removeAllUserScripts"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v9, 0x39

    goto/16 :goto_0

    :sswitch_e
    const-string v4, "resumeTimers"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v9, 0x38

    goto/16 :goto_0

    :sswitch_f
    const-string v4, "getCertificate"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v9, 0x37

    goto/16 :goto_0

    :sswitch_10
    const-string v4, "requestFocusNodeHref"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v9, 0x36

    goto/16 :goto_0

    :sswitch_11
    const-string v4, "getOriginalUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v9, 0x35

    goto/16 :goto_0

    :sswitch_12
    const-string v4, "getProgress"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v9, 0x34

    goto/16 :goto_0

    :sswitch_13
    const-string v4, "clearSslPreferences"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v9, 0x33

    goto/16 :goto_0

    :sswitch_14
    const-string v4, "removeUserScriptsByGroupName"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v9, 0x32

    goto/16 :goto_0

    :sswitch_15
    const-string v4, "clearHistory"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v9, 0x31

    goto/16 :goto_0

    :sswitch_16
    const-string v4, "pageDown"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v9, 0x30

    goto/16 :goto_0

    :sswitch_17
    const-string v4, "clearMatches"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v9, 0x2f

    goto/16 :goto_0

    :sswitch_18
    const-string v4, "injectCSSFileFromUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v9, 0x2e

    goto/16 :goto_0

    :sswitch_19
    const-string v4, "canScrollVertically"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v9, 0x2d

    goto/16 :goto_0

    :sswitch_1a
    const-string v4, "getHitTestResult"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v9, 0x2c

    goto/16 :goto_0

    :sswitch_1b
    const-string v4, "loadUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v9, 0x2b

    goto/16 :goto_0

    :sswitch_1c
    const-string v4, "postWebMessage"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v9, 0x2a

    goto/16 :goto_0

    :sswitch_1d
    const-string v4, "takeScreenshot"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v9, 0x29

    goto/16 :goto_0

    :sswitch_1e
    const-string v4, "pause"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v9, 0x28

    goto/16 :goto_0

    :sswitch_1f
    const-string v4, "createWebMessageChannel"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v9, 0x27

    goto/16 :goto_0

    :sswitch_20
    const-string v4, "close"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v9, 0x26

    goto/16 :goto_0

    :sswitch_21
    const-string v4, "show"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 v9, 0x25

    goto/16 :goto_0

    :sswitch_22
    const-string v4, "hide"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 v9, 0x24

    goto/16 :goto_0

    :sswitch_23
    const-string v4, "startSafeBrowsing"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 v9, 0x23

    goto/16 :goto_0

    :sswitch_24
    const-string v4, "getCopyBackForwardList"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 v9, 0x22

    goto/16 :goto_0

    :sswitch_25
    const-string v4, "injectCSSCode"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 v9, 0x21

    goto/16 :goto_0

    :sswitch_26
    const-string v4, "zoomOut"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 v9, 0x20

    goto/16 :goto_0

    :sswitch_27
    const-string v4, "getSelectedText"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 v9, 0x1f

    goto/16 :goto_0

    :sswitch_28
    const-string v4, "getOptions"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    goto/16 :goto_0

    :cond_28
    const/16 v9, 0x1e

    goto/16 :goto_0

    :sswitch_29
    const-string v4, "isLoading"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    goto/16 :goto_0

    :cond_29
    const/16 v9, 0x1d

    goto/16 :goto_0

    :sswitch_2a
    const-string v4, "canGoBack"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const/16 v9, 0x1c

    goto/16 :goto_0

    :sswitch_2b
    const-string v4, "goForward"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const/16 v9, 0x1b

    goto/16 :goto_0

    :sswitch_2c
    const-string v4, "postUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const/16 v9, 0x1a

    goto/16 :goto_0

    :sswitch_2d
    const-string v4, "scrollTo"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2d

    goto/16 :goto_0

    :cond_2d
    const/16 v9, 0x19

    goto/16 :goto_0

    :sswitch_2e
    const-string v4, "scrollBy"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2e

    goto/16 :goto_0

    :cond_2e
    const/16 v9, 0x18

    goto/16 :goto_0

    :sswitch_2f
    const-string v4, "isHidden"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2f

    goto/16 :goto_0

    :cond_2f
    const/16 v9, 0x17

    goto/16 :goto_0

    :sswitch_30
    const-string v4, "printCurrentPage"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_30

    goto/16 :goto_0

    :cond_30
    const/16 v9, 0x16

    goto/16 :goto_0

    :sswitch_31
    const-string v4, "findNext"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_31

    goto/16 :goto_0

    :cond_31
    const/16 v9, 0x15

    goto/16 :goto_0

    :sswitch_32
    const-string v4, "addWebMessageListener"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_32

    goto/16 :goto_0

    :cond_32
    const/16 v9, 0x14

    goto/16 :goto_0

    :sswitch_33
    const-string v4, "zoomIn"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_33

    goto/16 :goto_0

    :cond_33
    const/16 v9, 0x13

    goto/16 :goto_0

    :sswitch_34
    const-string v4, "zoomBy"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_34

    goto/16 :goto_0

    :cond_34
    const/16 v9, 0x12

    goto/16 :goto_0

    :sswitch_35
    const-string v4, "clearFocus"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_35

    goto/16 :goto_0

    :cond_35
    const/16 v9, 0x11

    goto/16 :goto_0

    :sswitch_36
    const-string v4, "clearCache"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_36

    goto/16 :goto_0

    :cond_36
    const/16 v9, 0x10

    goto/16 :goto_0

    :sswitch_37
    const-string v4, "resume"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_37

    goto/16 :goto_0

    :cond_37
    const/16 v9, 0xf

    goto/16 :goto_0

    :sswitch_38
    const-string v4, "reload"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_38

    goto/16 :goto_0

    :cond_38
    const/16 v9, 0xe

    goto/16 :goto_0

    :sswitch_39
    const-string v4, "stopLoading"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_39

    goto/16 :goto_0

    :cond_39
    const/16 v9, 0xd

    goto/16 :goto_0

    :sswitch_3a
    const-string v4, "canScrollHorizontally"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3a

    goto/16 :goto_0

    :cond_3a
    const/16 v9, 0xc

    goto/16 :goto_0

    :sswitch_3b
    const-string v4, "pageUp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3b

    goto/16 :goto_0

    :cond_3b
    const/16 v9, 0xb

    goto/16 :goto_0

    :sswitch_3c
    const-string v4, "canGoForward"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3c

    goto/16 :goto_0

    :cond_3c
    const/16 v9, 0xa

    goto/16 :goto_0

    :sswitch_3d
    const-string v4, "goBack"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3d

    goto/16 :goto_0

    :cond_3d
    const/16 v9, 0x9

    goto/16 :goto_0

    :sswitch_3e
    const-string v4, "getUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3e

    goto/16 :goto_0

    :cond_3e
    const/16 v9, 0x8

    goto/16 :goto_0

    :sswitch_3f
    const-string v4, "canGoBackOrForward"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3f

    goto :goto_0

    :cond_3f
    const/4 v9, 0x7

    goto :goto_0

    :sswitch_40
    const-string v4, "getScrollY"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_40

    goto :goto_0

    :cond_40
    const/4 v9, 0x6

    goto :goto_0

    :sswitch_41
    const-string v4, "getScrollX"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_41

    goto :goto_0

    :cond_41
    const/4 v9, 0x5

    goto :goto_0

    :sswitch_42
    const-string v4, "saveWebArchive"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_42

    goto :goto_0

    :cond_42
    const/4 v9, 0x4

    goto :goto_0

    :sswitch_43
    const-string v4, "removeUserScript"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_43

    goto :goto_0

    :cond_43
    const/4 v9, 0x3

    goto :goto_0

    :sswitch_44
    const-string v4, "getContentHeight"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_44

    goto :goto_0

    :cond_44
    const/4 v9, 0x2

    goto :goto_0

    :sswitch_45
    const-string v4, "pauseTimers"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_45

    goto :goto_0

    :cond_45
    const/4 v9, 0x1

    goto :goto_0

    :sswitch_46
    const-string v4, "isSecureContext"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_46

    goto :goto_0

    :cond_46
    const/4 v9, 0x0

    :goto_0
    const-string v3, "index"

    const-string v4, "userScript"

    const-string v10, "animated"

    const-string v11, "y"

    const-string v12, "x"

    const-string v13, "steps"

    const-string v14, "urlFile"

    const-string v15, "contentWorld"

    const-string v7, "source"

    const-string v5, "data"

    const-string v8, "IAWMethodHandler"

    const/4 v6, 0x0

    packed-switch v9, :pswitch_data_0

    :cond_47
    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto/16 :goto_9

    :pswitch_0
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getTitle()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :pswitch_1
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_48

    invoke-virtual {v0, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;

    move-result-object v0

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    new-instance v5, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;

    invoke-direct {v5, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-interface {v4, v3, v0, v5}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->evaluateJavascript(Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;Landroid/webkit/ValueCallback;)V

    goto/16 :goto_9

    :cond_48
    :goto_1
    invoke-interface {v2, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_2
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    invoke-virtual {v0, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "scriptHtmlTagAttributes"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->injectJavascriptFileFromUrl(Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_3

    :pswitch_3
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    const-string v3, "find"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->findAllAsync(Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    const-string v3, "assetFilePath"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_0
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->loadFile(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v8, v0, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :pswitch_5
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    invoke-virtual {v0, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    const-string v3, "mimeType"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    const-string v3, "encoding"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/String;

    const-string v3, "baseUrl"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    const-string v3, "historyUrl"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface/range {v4 .. v9}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_6
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    invoke-virtual {v0, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->goBackOrForward(I)V

    goto/16 :goto_3

    :pswitch_7
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    const-string v3, "contextMenu"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->setContextMenu(Ljava/util/Map;)V

    goto/16 :goto_3

    :pswitch_8
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->requestImageRef()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_4

    :pswitch_9
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_48

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_48

    const-string v3, "functionBody"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "arguments"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-virtual {v0, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;

    move-result-object v0

    iget-object v5, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    new-instance v6, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$5;

    invoke-direct {v6, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$5;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-interface {v5, v3, v4, v0, v6}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->callAsyncJavaScript(Ljava/lang/String;Ljava/util/Map;Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;Landroid/webkit/ValueCallback;)V

    goto/16 :goto_9

    :pswitch_a
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    const-string v4, "options"

    if-eqz v3, :cond_49

    invoke-interface {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v3

    if-eqz v3, :cond_49

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v3

    instance-of v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v3, :cond_49

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v3

    check-cast v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    new-instance v5, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;

    invoke-direct {v5}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;-><init>()V

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;

    invoke-virtual {v3, v5, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->setOptions(Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;Ljava/util/HashMap;)V

    goto/16 :goto_3

    :cond_49
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    invoke-direct {v3}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;-><init>()V

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->setOptions(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;Ljava/util/HashMap;)V

    goto/16 :goto_3

    :pswitch_b
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v3, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getZoomScale()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto/16 :goto_4

    :pswitch_c
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4d

    invoke-interface {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUserContentController()Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    move-result-object v3

    if-eqz v3, :cond_4d

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;

    move-result-object v0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUserContentController()Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->addUserOnlyScript(Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;)Z

    move-result v0

    goto/16 :goto_2

    :pswitch_d
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUserContentController()Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    move-result-object v0

    if-eqz v0, :cond_4a

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUserContentController()Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->removeAllUserOnlyScripts()V

    goto/16 :goto_3

    :pswitch_e
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->resumeTimers()V

    goto/16 :goto_3

    :pswitch_f
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getCertificate()Landroid/net/http/SslCertificate;

    move-result-object v0

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/SslCertificateExt;->toMap(Landroid/net/http/SslCertificate;)Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_4

    :pswitch_10
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->requestFocusNodeHref()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_4

    :pswitch_11
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getOriginalUrl()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_1

    :pswitch_12
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getProgress()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_1

    :pswitch_13
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->clearSslPreferences()V

    goto/16 :goto_3

    :pswitch_14
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    invoke-interface {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUserContentController()Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    move-result-object v3

    if-eqz v3, :cond_4a

    const-string v3, "groupName"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUserContentController()Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->removeUserOnlyScriptsByGroupName(Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_15
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->clearHistory()V

    goto :goto_3

    :pswitch_16
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4d

    const-string v3, "bottom"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->pageDown(Z)Z

    move-result v0

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_4

    :pswitch_17
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->clearMatches()V

    goto :goto_3

    :pswitch_18
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    invoke-virtual {v0, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "cssLinkHtmlTagAttributes"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->injectCSSFileFromUrl(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_3

    :pswitch_19
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4d

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->canScrollVertically()Z

    move-result v0

    goto :goto_2

    :pswitch_1a
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v3, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getHitTestResult()Landroid/webkit/WebView$HitTestResult;

    move-result-object v0

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/HitTestResult;->fromWebViewHitTestResult(Landroid/webkit/WebView$HitTestResult;)Lcom/pichillilorenzo/flutter_inappwebview/types/HitTestResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/HitTestResult;->toMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_4

    :pswitch_1b
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    const-string v3, "urlRequest"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->loadUrl(Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;)V

    :cond_4a
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_4
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1c
    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v4, :cond_4a

    const-string v4, "POST_WEB_MESSAGE"

    invoke-static {v4}, La2/i;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4a

    const-string v4, "message"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    const-string v7, "targetOrigin"

    invoke-virtual {v0, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const-string v9, "ports"

    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    if-eqz v9, :cond_4c

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_4b
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    const-string v11, "webMessageChannelId"

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v10, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    iget-object v12, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v12}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getWebMessageChannels()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;

    if-eqz v11, :cond_4b

    iget-object v12, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v12, v12, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v12, :cond_4b

    iget-object v11, v11, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La2/g;

    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4c
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_50

    new-instance v3, La2/f;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x0

    new-array v5, v5, [La2/g;

    invoke-interface {v7, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [La2/g;

    invoke-direct {v3, v4, v5}, La2/f;-><init>(Ljava/lang/String;[La2/g;)V

    :try_start_1
    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    check-cast v4, Landroid/webkit/WebView;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v4, v3, v0}, La2/h;->j(Landroid/webkit/WebView;La2/f;Landroid/net/Uri;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_9

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v8, v0, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1d
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_48

    const-string v3, "screenshotConfiguration"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3, v0, v2}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->takeScreenshot(Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_9

    :pswitch_1e
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->onPause()V

    goto/16 :goto_3

    :pswitch_1f
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    instance-of v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_48

    const-string v0, "CREATE_WEB_MESSAGE_CHANNEL"

    invoke-static {v0}, La2/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_48

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->createCompatWebMessageChannel()Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->toMap()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_4

    :pswitch_20
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_47

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    if-eqz v0, :cond_47

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    instance-of v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v0, :cond_47

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    invoke-virtual {v0, v2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->close(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_9

    :pswitch_21
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_47

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    if-eqz v0, :cond_47

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    instance-of v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v0, :cond_47

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->show()V

    goto/16 :goto_3

    :pswitch_22
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_47

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    if-eqz v0, :cond_47

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    instance-of v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v0, :cond_47

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->hide()V

    goto/16 :goto_3

    :pswitch_23
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4d

    const-string v0, "START_SAFE_BROWSING"

    invoke-static {v0}, La2/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4d

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$2;

    invoke-direct {v3, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$2;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-static {v0, v3}, La2/h;->n(Landroid/content/Context;Landroid/webkit/ValueCallback;)V

    goto/16 :goto_9

    :cond_4d
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_4

    :pswitch_24
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getCopyBackForwardList()Ljava/util/HashMap;

    move-result-object v6

    goto/16 :goto_1

    :pswitch_25
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    invoke-virtual {v0, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->injectCSSCode(Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_26
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4d

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->zoomOut()Z

    move-result v0

    goto/16 :goto_2

    :pswitch_27
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v3, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_48

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt v3, v4, :cond_48

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$3;

    invoke-direct {v3, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$3;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-interface {v0, v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getSelectedText(Landroid/webkit/ValueCallback;)V

    goto/16 :goto_9

    :pswitch_28
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4e

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    if-eqz v0, :cond_4e

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    instance-of v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v0, :cond_4e

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->getOptions()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_4

    :cond_4e
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getOptions()Ljava/util/Map;

    move-result-object v6

    goto/16 :goto_1

    :pswitch_29
    const/4 v5, 0x0

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4f

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_4f

    goto :goto_6

    :pswitch_2a
    const/4 v5, 0x0

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4f

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_4f

    :goto_6
    const/4 v7, 0x1

    goto :goto_7

    :cond_4f
    move v7, v5

    :goto_7
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_4

    :pswitch_2b
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->goForward()V

    goto/16 :goto_3

    :pswitch_2c
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    const-string v3, "url"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "postData"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->postUrl(Ljava/lang/String;[B)V

    goto/16 :goto_3

    :pswitch_2d
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    invoke-virtual {v0, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v0, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v0, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iget-object v5, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v5, v3, v4, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->scrollTo(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    goto/16 :goto_3

    :pswitch_2e
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    invoke-virtual {v0, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v0, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v0, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iget-object v5, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v5, v3, v4, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->scrollBy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    goto/16 :goto_3

    :pswitch_2f
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_47

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    if-eqz v0, :cond_47

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    instance-of v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v0, :cond_47

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getInAppBrowserDelegate()Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    move-result-object v0

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    iget-boolean v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->isHidden:Z

    goto/16 :goto_2

    :pswitch_30
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->printCurrentPage()V

    goto/16 :goto_3

    :pswitch_31
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    const-string v3, "forward"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->findNext(Z)V

    goto/16 :goto_3

    :pswitch_32
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    const-string v3, "webMessageListener"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getPlugin()Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    move-result-object v4

    iget-object v4, v4, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    invoke-static {v3, v4, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;->fromMap(Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;Lio/flutter/plugin/common/BinaryMessenger;Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    move-result-object v0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_4a

    const-string v3, "WEB_MESSAGE_LISTENER"

    invoke-static {v3}, La2/i;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4a

    :try_start_2
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->addWebMessageListener(Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_9

    :pswitch_33
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4d

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->zoomIn()Z

    move-result v0

    goto/16 :goto_2

    :pswitch_34
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4a

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_4a

    const-string v3, "zoomFactor"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    double-to-float v3, v3

    invoke-interface {v0, v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->zoomBy(F)V

    goto/16 :goto_3

    :pswitch_35
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->clearFocus()V

    goto/16 :goto_3

    :pswitch_36
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->clearAllCache()V

    goto/16 :goto_3

    :pswitch_37
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->onResume()V

    goto/16 :goto_3

    :pswitch_38
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->reload()V

    goto/16 :goto_3

    :pswitch_39
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->stopLoading()V

    goto/16 :goto_3

    :pswitch_3a
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4d

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->canScrollHorizontally()Z

    move-result v0

    goto/16 :goto_2

    :pswitch_3b
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4d

    const-string v3, "top"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->pageUp(Z)Z

    move-result v0

    goto/16 :goto_2

    :pswitch_3c
    const/4 v5, 0x0

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4f

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->canGoForward()Z

    move-result v0

    if-eqz v0, :cond_4f

    goto/16 :goto_6

    :pswitch_3d
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->goBack()V

    goto/16 :goto_3

    :pswitch_3e
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUrl()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_1

    :pswitch_3f
    const/4 v5, 0x0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_4f

    invoke-virtual {v0, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->canGoBackOrForward(I)Z

    move-result v0

    if-eqz v0, :cond_4f

    goto/16 :goto_6

    :pswitch_40
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getScrollY()I

    move-result v0

    goto :goto_8

    :pswitch_41
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getScrollX()I

    move-result v0

    goto :goto_8

    :pswitch_42
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v3, :cond_48

    const-string v3, "filePath"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "autoname"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    new-instance v5, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$4;

    invoke-direct {v5, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$4;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-interface {v4, v3, v0, v5}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->saveWebArchive(Ljava/lang/String;ZLandroid/webkit/ValueCallback;)V

    goto :goto_9

    :pswitch_43
    iget-object v5, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v5, :cond_4d

    invoke-interface {v5}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUserContentController()Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    move-result-object v5

    if-eqz v5, :cond_4d

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;

    move-result-object v0

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v4}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getUserContentController()Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;->getInjectionTime()Lcom/pichillilorenzo/flutter_inappwebview/types/UserScriptInjectionTime;

    move-result-object v0

    invoke-virtual {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->removeUserOnlyScriptAt(ILcom/pichillilorenzo/flutter_inappwebview/types/UserScriptInjectionTime;)Z

    move-result v0

    goto/16 :goto_2

    :pswitch_44
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v3, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_48

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getContentHeight()I

    move-result v0

    :goto_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_4

    :pswitch_45
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->pauseTimers()V

    goto/16 :goto_3

    :pswitch_46
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_4d

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_4d

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$6;

    invoke-direct {v3, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$6;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-interface {v0, v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->isSecureContext(Landroid/webkit/ValueCallback;)V

    :cond_50
    :goto_9
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x788cbad2 -> :sswitch_46
        -0x6a88dc9c -> :sswitch_45
        -0x69b090b6 -> :sswitch_44
        -0x64569be6 -> :sswitch_43
        -0x60d253d5 -> :sswitch_42
        -0x4f5bd10b -> :sswitch_41
        -0x4f5bd10a -> :sswitch_40
        -0x4e0b0fbd -> :sswitch_3f
        -0x4a7789c7 -> :sswitch_3e
        -0x4a012e11 -> :sswitch_3d
        -0x3f9d4d33 -> :sswitch_3c
        -0x3b59fa76 -> :sswitch_3b
        -0x391587f2 -> :sswitch_3a
        -0x38833526 -> :sswitch_39
        -0x37b57e67 -> :sswitch_38
        -0x37b237d3 -> :sswitch_37
        -0x2d410ecb -> :sswitch_36
        -0x2d106975 -> :sswitch_35
        -0x29807c76 -> :sswitch_34
        -0x29807ba8 -> :sswitch_33
        -0x2961c598 -> :sswitch_32
        -0x287e8fb4 -> :sswitch_31
        -0x28785945 -> :sswitch_30
        -0x2064708c -> :sswitch_2f
        -0x17f88ffc -> :sswitch_2e
        -0x17f88dd8 -> :sswitch_2d
        -0x17518f51 -> :sswitch_2c
        -0x12f8b743 -> :sswitch_2b
        -0x12e5de21 -> :sswitch_2a
        -0xe7dd74e -> :sswitch_29
        -0xcac3d98 -> :sswitch_28
        -0x7a08722 -> :sswitch_27
        -0x68ee185 -> :sswitch_26
        -0x32ce041 -> :sswitch_25
        -0x1f169cf -> :sswitch_24
        -0x10edb0a -> :sswitch_23
        0x30dd42 -> :sswitch_22
        0x35dafd -> :sswitch_21
        0x5a5ddf8 -> :sswitch_20
        0x5d6b9d4 -> :sswitch_1f
        0x65825f6 -> :sswitch_1e
        0xb9ed94d -> :sswitch_1d
        0xc9252d3 -> :sswitch_1c
        0x141096a9 -> :sswitch_1b
        0x1d5dd38c -> :sswitch_1a
        0x215ffa20 -> :sswitch_19
        0x2c211a37 -> :sswitch_18
        0x30b32a26 -> :sswitch_17
        0x33331bd1 -> :sswitch_16
        0x35d48587 -> :sswitch_15
        0x3b8691ba -> :sswitch_14
        0x3e28c0f9 -> :sswitch_13
        0x402effa3 -> :sswitch_12
        0x410b6ca8 -> :sswitch_11
        0x4a4dcef6 -> :sswitch_10
        0x4e358861 -> :sswitch_f
        0x5aa2005b -> :sswitch_e
        0x5ea44800 -> :sswitch_d
        0x5f2823f7 -> :sswitch_c
        0x6140d281 -> :sswitch_b
        0x66c50fdc -> :sswitch_a
        0x66e42eeb -> :sswitch_9
        0x6714ace7 -> :sswitch_8
        0x6a1709ec -> :sswitch_7
        0x6bed5233 -> :sswitch_6
        0x6dfa45b0 -> :sswitch_5
        0x6dfb4b82 -> :sswitch_4
        0x72420634 -> :sswitch_3
        0x72be6f8b -> :sswitch_2
        0x738236e6 -> :sswitch_1
        0x7531c8a2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
