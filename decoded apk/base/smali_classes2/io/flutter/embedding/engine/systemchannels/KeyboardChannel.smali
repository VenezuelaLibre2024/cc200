.class public Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;
    }
.end annotation


# instance fields
.field public final channel:Lio/flutter/plugin/common/MethodChannel;

.field private keyboardMethodHandler:Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;

.field public final parsingMethodHandler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$1;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$1;-><init>(Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->parsingMethodHandler:Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;

    new-instance v1, Lio/flutter/plugin/common/MethodChannel;

    sget-object v2, Lio/flutter/plugin/common/StandardMethodCodec;->INSTANCE:Lio/flutter/plugin/common/StandardMethodCodec;

    const-string v3, "flutter/keyboard"

    invoke-direct {v1, p1, v3, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MethodCodec;)V

    iput-object v1, p0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public static synthetic access$000(Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;)Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->keyboardMethodHandler:Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;

    return-object p0
.end method


# virtual methods
.method public setKeyboardMethodHandler(Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/systemchannels/KeyboardChannel;->keyboardMethodHandler:Lio/flutter/embedding/engine/systemchannels/KeyboardChannel$KeyboardMethodHandler;

    return-void
.end method